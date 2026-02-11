{-# LANGUAGE DataKinds                  #-}
{-# LANGUAGE DeriveDataTypeable         #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE DeriveTraversable          #-}
{-# LANGUAGE FlexibleContexts           #-}
{-# LANGUAGE FlexibleInstances          #-}
{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE OverloadedStrings          #-}
{-# LANGUAGE RecordWildCards            #-}
{-# LANGUAGE TypeFamilies               #-}
{-# LANGUAGE TypeOperators              #-}
{-# LANGUAGE ViewPatterns               #-}
{-# OPTIONS_GHC
-fno-warn-unused-binds -fno-warn-unused-imports -freduction-depth=328 #-}

module SirqulIoTPlatform.API
  ( -- * Client and Server
    Config(..)
  , SirqulIoTPlatformBackend(..)
  , createSirqulIoTPlatformClient
  , runSirqulIoTPlatformServer
  , runSirqulIoTPlatformMiddlewareServer
  , runSirqulIoTPlatformClient
  , runSirqulIoTPlatformClientWithManager
  , callSirqulIoTPlatform
  , SirqulIoTPlatformClient
  , SirqulIoTPlatformClientError(..)
  -- ** Servant
  , SirqulIoTPlatformAPI
  -- ** Plain WAI Application
  , serverWaiApplicationSirqulIoTPlatform
  -- ** Authentication
  , SirqulIoTPlatformAuth(..)
  , clientAuth
  , Protected
  ) where

import           SirqulIoTPlatform.Types

import           Control.Monad.Catch                (Exception, MonadThrow, throwM)
import           Control.Monad.Except               (ExceptT, runExceptT)
import           Control.Monad.IO.Class
import           Control.Monad.Trans.Reader         (ReaderT (..))
import           Data.Aeson                         (Value)
import qualified Data.Aeson                         as Aeson
import           Data.ByteString                    (ByteString)
import           Data.ByteString                    (ByteString)
import qualified Data.ByteString.Lazy               as BSL
import           Data.Coerce                        (coerce)
import           Data.Data                          (Data)
import           Data.Function                      ((&))
import qualified Data.Map                           as Map
import           Data.Monoid                        ((<>))
import           Data.Proxy                         (Proxy (..))
import           Data.Set                           (Set)
import           Data.Text                          (Text)
import qualified Data.Text                          as T
import qualified Data.Text.Encoding                 as T
import           Data.Time
import           Data.UUID                          (UUID)
import           GHC.Exts                           (IsString (..))
import           GHC.Generics                       (Generic)
import           Network.HTTP.Client                (Manager, newManager)
import           Network.HTTP.Client.TLS            (tlsManagerSettings)
import           Network.HTTP.Types.Method          (methodOptions)
import           Network.Wai                        (Middleware, Request, requestHeaders)
import qualified Network.Wai.Handler.Warp           as Warp
import           Servant                            (ServerError, serveWithContextT, throwError)
import           Servant.API                        hiding (addHeader)
import           Servant.API.Verbs                  (StdMethod (..), Verb)
import           Servant.API.Experimental.Auth      (AuthProtect)
import           Servant.Client                     (ClientEnv, Scheme (Http), ClientError, client,
                                                     mkClientEnv, parseBaseUrl)
import           Servant.Client.Core                (baseUrlPort, baseUrlHost, AuthClientData, AuthenticatedRequest, addHeader, mkAuthenticatedRequest, AuthClientData, AuthenticatedRequest, addHeader, mkAuthenticatedRequest)
import           Servant.Client.Internal.HttpClient (ClientM (..))
import           Servant.Server                     (Handler (..), Application, Context ((:.), EmptyContext))
import           Servant.Server.Experimental.Auth   (AuthHandler, AuthServerData, mkAuthHandler)
import           Servant.Server.StaticFiles         (serveDirectoryFileServer)
import           Web.FormUrlEncoded
import           Web.HttpApiData




-- | List of elements parsed from a query.
newtype QueryList (p :: CollectionFormat) a = QueryList
  { fromQueryList :: [a]
  } deriving (Functor, Applicative, Monad, Foldable, Traversable)

-- | Formats in which a list can be encoded into a HTTP path.
data CollectionFormat
  = CommaSeparated -- ^ CSV format for multiple parameters.
  | SpaceSeparated -- ^ Also called "SSV"
  | TabSeparated -- ^ Also called "TSV"
  | PipeSeparated -- ^ `value1|value2|value2`
  | MultiParamArray -- ^ Using multiple GET parameters, e.g. `foo=bar&foo=baz`. Only for GET params.

instance FromHttpApiData a => FromHttpApiData (QueryList 'CommaSeparated a) where
  parseQueryParam = parseSeparatedQueryList ','

instance FromHttpApiData a => FromHttpApiData (QueryList 'TabSeparated a) where
  parseQueryParam = parseSeparatedQueryList '\t'

instance FromHttpApiData a => FromHttpApiData (QueryList 'SpaceSeparated a) where
  parseQueryParam = parseSeparatedQueryList ' '

instance FromHttpApiData a => FromHttpApiData (QueryList 'PipeSeparated a) where
  parseQueryParam = parseSeparatedQueryList '|'

instance FromHttpApiData a => FromHttpApiData (QueryList 'MultiParamArray a) where
  parseQueryParam = error "unimplemented FromHttpApiData for MultiParamArray collection format"

parseSeparatedQueryList :: FromHttpApiData a => Char -> Text -> Either Text (QueryList p a)
parseSeparatedQueryList char = fmap QueryList . mapM parseQueryParam . T.split (== char)

instance ToHttpApiData a => ToHttpApiData (QueryList 'CommaSeparated a) where
  toQueryParam = formatSeparatedQueryList ','

instance ToHttpApiData a => ToHttpApiData (QueryList 'TabSeparated a) where
  toQueryParam = formatSeparatedQueryList '\t'

instance ToHttpApiData a => ToHttpApiData (QueryList 'SpaceSeparated a) where
  toQueryParam = formatSeparatedQueryList ' '

instance ToHttpApiData a => ToHttpApiData (QueryList 'PipeSeparated a) where
  toQueryParam = formatSeparatedQueryList '|'

instance ToHttpApiData a => ToHttpApiData (QueryList 'MultiParamArray a) where
  toQueryParam = error "unimplemented ToHttpApiData for MultiParamArray collection format"

formatSeparatedQueryList :: ToHttpApiData a => Char ->  QueryList p a -> Text
formatSeparatedQueryList char = T.intercalate (T.singleton char) . map toQueryParam . fromQueryList

newtype JSONQueryParam a = JSONQueryParam
  { fromJsonQueryParam :: a
  } deriving (Functor, Foldable, Traversable)

instance Aeson.ToJSON a => ToHttpApiData (JSONQueryParam a) where
  toQueryParam = T.decodeUtf8 . BSL.toStrict . Aeson.encode . fromJsonQueryParam

instance Aeson.FromJSON a => FromHttpApiData (JSONQueryParam a) where
  parseQueryParam = either (Left . T.pack) (Right . JSONQueryParam) . Aeson.eitherDecodeStrict . T.encodeUtf8


-- | Servant type-level API, generated from the OpenAPI spec for SirqulIoTPlatform.
type SirqulIoTPlatformAPI
    =    "queue" :> "consumer" :> "create" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "name" Text :> QueryParam "hostname" Text :> QueryParam "port" Int :> QueryParam "username" Text :> QueryParam "password" Text :> QueryParam "virtualHost" Text :> QueryParam "exchanger" Text :> QueryParam "exchangerType" Text :> QueryParam "workers" Int :> QueryParam "dataMapping" Text :> QueryParam "useSSL" Bool :> Verb 'POST 200 '[JSON] QueueResponse -- 'consumerCreate' route
    :<|> "queue" :> "consumer" :> "update" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "queueId" Integer :> QueryParam "dataMapping" Text :> QueryParam "useSSL" Bool :> Verb 'POST 200 '[JSON] QueueResponse -- 'consumerUpdate' route
    :<|> "queue" :> "create" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "name" Text :> QueryParam "workers" Int :> QueryParam "analyticTags" Text :> QueryParam "hostname" Text :> QueryParam "port" Int :> QueryParam "username" Text :> QueryParam "password" Text :> QueryParam "virtualHost" Text :> QueryParam "useSSL" Bool :> Verb 'POST 200 '[JSON] QueueResponse -- 'queueCreate' route
    :<|> "queue" :> "delete" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "queueId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'queueDelete' route
    :<|> "queue" :> "get" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "queueId" Integer :> QueryParam "appKey" Text :> QueryParam "name" Text :> QueryParam "hostname" Text :> QueryParam "virtualHost" Text :> Verb 'GET 200 '[JSON] QueueResponse -- 'queueGet' route
    :<|> "queue" :> "publish" :> QueryParam "queueId" Integer :> QueryParam "appKey" Text :> QueryParam "name" Text :> QueryParam "hostname" Text :> QueryParam "virtualHost" Text :> QueryParam "message" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'queuePublish' route
    :<|> "queue" :> "search" :> QueryParam "queueId" Integer :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "name" Text :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] QueueResponse -- 'queueSearch' route
    :<|> "queue" :> "update" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "queueId" Integer :> QueryParam "workers" Int :> QueryParam "analyticTags" Text :> QueryParam "hostname" Text :> QueryParam "port" Int :> QueryParam "username" Text :> QueryParam "password" Text :> QueryParam "virtualHost" Text :> QueryParam "useSSL" Bool :> Verb 'POST 200 '[JSON] QueueResponse -- 'queueUpdate' route
    :<|> "account" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "q" Text :> QueryParam "keyword" Text :> QueryParam "postalCode" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "appKey" Text :> QueryParam "range" Double :> QueryParam "locationLastUpdated" Integer :> QueryParam "gender" Text :> QueryParam "minAge" Int :> QueryParam "maxAge" Int :> QueryParam "companionshipIndex" Int :> QueryParam "_i" Int :> QueryParam "start" Int :> QueryParam "_l" Int :> QueryParam "limit" Int :> QueryParam "searchMode" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "roles" Text :> QueryParam "tags" Text :> QueryParam "experience" Text :> QueryParam "categoryIds" Text :> QueryParam "audienceIds" Text :> QueryParam "audienceOperator" Text :> QueryParam "updateCurrentLocation" Bool :> QueryParam "updatePreferredSettings" Bool :> QueryParam "showExactLocations" Bool :> QueryParam "showConnectionToSearcher" Bool :> QueryParam "flagCountMinimum" Integer :> QueryParam "verifiedUserOnly" Bool :> QueryParam "contentAdminOnly" Bool :> Verb 'GET 200 '[JSON] UserLocationSearchResponse -- 'accountLocationSearch' route
    :<|> "account" :> "block" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "accountIdBeingBlocked" Integer :> QueryParam "blockFlagValue" Bool :> QueryParam "removeFromGroupsIfBlocked" Bool :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] SirqulResponse -- 'blockAccount' route
    :<|> "account" :> "create" :> QueryParam "name" Text :> QueryParam "prefixName" Text :> QueryParam "firstName" Text :> QueryParam "middleName" Text :> QueryParam "lastName" Text :> QueryParam "suffixName" Text :> QueryParam "title" Text :> QueryParam "deviceId" Text :> QueryParam "deviceIdType" Text :> QueryParam "username" Text :> QueryParam "password" Text :> QueryParam "emailAddress" Text :> QueryParam "assetId" Integer :> QueryParam "streetAddress" Text :> QueryParam "zipcode" Text :> QueryParam "gender" Text :> QueryParam "birthday" Integer :> QueryParam "homePhone" Text :> QueryParam "cellPhone" Text :> QueryParam "cellPhoneCarrier" Text :> QueryParam "businessPhone" Text :> QueryParam "role" Text :> QueryParam "platforms" Text :> QueryParam "tags" Text :> QueryParam "aboutUs" Text :> QueryParam "gameExperience" Text :> QueryParam "categoryIds" Text :> QueryParam "hometown" Text :> QueryParam "height" Text :> QueryParam "heightIndex" Int :> QueryParam "ethnicity" Text :> QueryParam "bodyType" Text :> QueryParam "maritalStatus" Text :> QueryParam "children" Text :> QueryParam "religion" Text :> QueryParam "education" Text :> QueryParam "educationIndex" Int :> QueryParam "smoke" Text :> QueryParam "drink" Text :> QueryParam "companionship" Text :> QueryParam "companionshipIndex" Int :> QueryParam "preferredMinAge" Int :> QueryParam "preferredMaxAge" Int :> QueryParam "preferredMinHeight" Int :> QueryParam "preferredMaxHeight" Int :> QueryParam "preferredGender" Text :> QueryParam "preferredEducation" Text :> QueryParam "preferredEducationIndex" Int :> QueryParam "preferredBodyType" Text :> QueryParam "preferredEthnicity" Text :> QueryParam "preferredLocation" Text :> QueryParam "preferredLocationRange" Double :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "acceptedTerms" Bool :> QueryParam "inviteToken" Text :> QueryParam "referralAccountId" Integer :> QueryParam "sendValidation" Bool :> QueryParam "gameType" Text :> QueryParam "appKey" Text :> QueryParam "appVersion" Text :> QueryParam "responseType" Text :> QueryParam "audienceIdsToAdd" Text :> QueryParam "appBlob" Text :> QueryParam "appEnablePush" Bool :> QueryParam "appEnableSMS" Bool :> QueryParam "appEnableEmail" Bool :> QueryParam "locationVisibility" Text :> QueryParam "homeLatitude" Double :> QueryParam "homeLongitude" Double :> QueryParam "appNickname" Text :> QueryParam "personalAudienceId" Integer :> Verb 'POST 200 '[JSON] AccountLoginResponse -- 'createAccount' route
    :<|> "account" :> "profile" :> "update" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "connectionAccountId" Integer :> QueryParam "role" Text :> QueryParam "assetId" Integer :> QueryParam "name" Text :> QueryParam "prefixName" Text :> QueryParam "firstName" Text :> QueryParam "middleName" Text :> QueryParam "lastName" Text :> QueryParam "suffixName" Text :> QueryParam "title" Text :> QueryParam "gender" Text :> QueryParam "age" Int :> QueryParam "birthday" Integer :> QueryParam "homePhone" Text :> QueryParam "cellPhone" Text :> QueryParam "cellPhoneCarrier" Text :> QueryParam "businessPhone" Text :> QueryParam "emailAddress" Text :> QueryParam "streetAddress" Text :> QueryParam "streetAddress2" Text :> QueryParam "city" Text :> QueryParam "state" Text :> QueryParam "zipcode" Text :> QueryParam "country" Text :> QueryParam "makeProfileInfoPublic" Bool :> QueryParam "makeGameInfoPublic" Bool :> QueryParam "makeFriendsInfoPublic" Bool :> QueryParam "hometown" Text :> QueryParam "height" Text :> QueryParam "heightIndex" Int :> QueryParam "ethnicity" Text :> QueryParam "bodyType" Text :> QueryParam "maritalStatus" Text :> QueryParam "children" Text :> QueryParam "religion" Text :> QueryParam "education" Text :> QueryParam "educationIndex" Int :> QueryParam "smoke" Text :> QueryParam "drink" Text :> QueryParam "companionship" Text :> QueryParam "companionshipIndex" Int :> QueryParam "preferredMinAge" Int :> QueryParam "preferredMaxAge" Int :> QueryParam "preferredMinHeight" Int :> QueryParam "preferredMaxHeight" Int :> QueryParam "preferredGender" Text :> QueryParam "preferredEducation" Text :> QueryParam "preferredEducationIndex" Int :> QueryParam "preferredBodyType" Text :> QueryParam "preferredEthnicity" Text :> QueryParam "preferredLocation" Text :> QueryParam "preferredLocationRange" Double :> QueryParam "platforms" Text :> QueryParam "tags" Text :> QueryParam "aboutUs" Text :> QueryParam "matchToken" Text :> QueryParam "gameExperience" Text :> QueryParam "categories" Text :> QueryParam "categoryIds" Text :> QueryParam "responseFilters" Text :> QueryParam "showAsZipcode" Bool :> QueryParam "showExactLocation" Bool :> QueryParam "showOthersExactLocation" Bool :> QueryParam "acceptedTerms" Bool :> QueryParam "locationVisibility" Text :> QueryParam "appBlob" Text :> QueryParam "appEnablePush" Bool :> QueryParam "appEnableSMS" Bool :> QueryParam "appEnableEmail" Bool :> QueryParam "gameType" Text :> QueryParam "appKey" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "returnProfile" Bool :> QueryParam "audienceIdsToAdd" Text :> QueryParam "audienceIdsToRemove" Text :> QueryParam "referralAccountId" Integer :> QueryParam "appNickname" Text :> QueryParam "personalAudienceId" Integer :> QueryParam "nonGuestUsername" Text :> Verb 'POST 200 '[JSON] ProfileInfoResponse -- 'editAccount' route
    :<|> "account" :> "username" :> "update" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "emailAddress" Text :> QueryParam "username" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'editUsername' route
    :<|> "account" :> "profile" :> "get" :> QueryParam "returnNulls" Bool :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "connectionAccountEmail" Text :> QueryParam "connectionAccountId" Integer :> QueryParam "responseFilters" Text :> QueryParam "gameType" Text :> QueryParam "appKey" Text :> QueryParam "purchaseType" Text :> QueryParam "updateViewedDate" Bool :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'GET 200 '[JSON] ProfileResponse -- 'getAccount' route
    :<|> "account" :> "profile" :> "assets" :> QueryParam "returnNulls" Bool :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "ownerId" Integer :> QueryParam "mediaTypes" Text :> QueryParam "mimeTypes" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "_i" Int :> QueryParam "start" Int :> QueryParam "_l" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] AssetListResponse -- 'getProfileAssets' route
    :<|> "account" :> "referral" :> "list" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "retrieveType" Text :> QueryParam "levelLimit" Double :> QueryParam "ancestorLevelLimit" Double :> QueryParam "childrenLevelLimit" Double :> QueryParam "ancestorListStart" Double :> QueryParam "ancestorListLimit" Double :> QueryParam "childrenListStart" Double :> QueryParam "childrenListLimit" Double :> QueryParam "childrenChildren" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'getReferralList' route
    :<|> "account" :> "settings" :> "get" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'GET 200 '[JSON] UserSettingsResponse -- 'getSettings' route
    :<|> "account" :> "login" :> "delegate" :> QueryParam "deviceId" Text :> QueryParam "accessToken" Text :> QueryParam "accessTokenSecret" Text :> QueryParam "delegatedAccountId" Integer :> QueryParam "delegatedUsername" Text :> QueryParam "networkUID" Text :> QueryParam "appKey" Text :> QueryParam "ageRestriction" Int :> QueryParam "responseFilters" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] ProfileResponse -- 'loginDelegate' route
    :<|> "account" :> "login" :> QueryParam "deviceId" Text :> QueryParam "deviceIdType" Text :> QueryParam "accessToken" Text :> QueryParam "accessTokenSecret" Text :> QueryParam "networkUID" Text :> QueryParam "appKey" Text :> QueryParam "ageRestriction" Int :> QueryParam "responseFilters" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "emailMatch" Bool :> QueryParam "chosenAccountId" Integer :> QueryParam "thirdPartyCredentialId" Integer :> Verb 'POST 200 '[JSON] ProfileResponse -- 'loginGeneral' route
    :<|> "account" :> "get" :> QueryParam "deviceId" Text :> QueryParam "username" Text :> QueryParam "password" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "app" Text :> QueryParam "gameType" Text :> QueryParam "appKey" Text :> QueryParam "returnProfile" Bool :> QueryParam "responseFilters" Text :> Verb 'POST 200 '[JSON] ProfileResponse -- 'loginUsername' route
    :<|> "account" :> "logout" :> QueryParam "deviceId" Text :> QueryParam "deviceIdType" Text :> QueryParam "accountId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] SirqulResponse -- 'logout' route
    :<|> "account" :> "merge" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "mergeAccountId" Integer :> QueryParam "appKey" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'mergeAccount' route
    :<|> "account" :> "passwordchange" :> QueryParam "accountId" Integer :> QueryParam "oldPassword" Text :> QueryParam "newPassword" Text :> QueryParam "confirmPassword" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'passwordChange' route
    :<|> "account" :> "passwordreset" :> QueryParam "token" Text :> QueryParam "password" Text :> QueryParam "confirm" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'passwordReset' route
    :<|> "account" :> "requestpasswordreset" :> QueryParam "email" Text :> QueryParam "from" Text :> QueryParam "domain" Text :> QueryParam "subUrl" Text :> QueryParam "referer" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'requestPasswordReset' route
    :<|> "account" :> "requestValidateAccount" :> QueryParam "accountId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'requestValidateAccount' route
    :<|> "account" :> "profile" :> "search" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "keyword" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "radius" Double :> QueryParam "gender" Text :> QueryParam "gameExperience" Text :> QueryParam "age" Int :> QueryParam "categoryIds" Text :> QueryParam "returnNulls" Bool :> QueryParam "responseFilters" Text :> QueryParam "purchaseType" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "activeOnly" Bool :> Verb 'GET 200 '[JSON] [ProfileResponse] -- 'searchAccounts' route
    :<|> "account" :> "login" :> "validate" :> QueryParam "deviceId" Text :> QueryParam "username" Text :> QueryParam "password" Text :> QueryParam "gameType" Text :> QueryParam "charsetName" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "returnProfile" Bool :> QueryParam "responseFilters" Text :> Verb 'POST 200 '[JSON] ProfileResponse -- 'secureLogin' route
    :<|> "account" :> "create" :> "validate" :> QueryParam "name" Text :> QueryParam "inviteToken" Text :> QueryParam "prefixName" Text :> QueryParam "firstName" Text :> QueryParam "middleName" Text :> QueryParam "lastName" Text :> QueryParam "suffixName" Text :> QueryParam "title" Text :> QueryParam "deviceId" Text :> QueryParam "deviceIdType" Text :> QueryParam "username" Text :> QueryParam "password" Text :> QueryParam "emailAddress" Text :> QueryParam "assetId" Integer :> QueryParam "address" Text :> QueryParam "zipcode" Text :> QueryParam "gender" Text :> QueryParam "birthday" Integer :> QueryParam "homePhone" Text :> QueryParam "cellPhone" Text :> QueryParam "cellPhoneCarrier" Text :> QueryParam "businessPhone" Text :> QueryParam "role" Text :> QueryParam "platforms" Text :> QueryParam "tags" Text :> QueryParam "aboutUs" Text :> QueryParam "gameExperience" Text :> QueryParam "categoryIds" Text :> QueryParam "hometown" Text :> QueryParam "height" Text :> QueryParam "heightIndex" Int :> QueryParam "ethnicity" Text :> QueryParam "bodyType" Text :> QueryParam "maritalStatus" Text :> QueryParam "children" Text :> QueryParam "religion" Text :> QueryParam "education" Text :> QueryParam "educationIndex" Int :> QueryParam "smoke" Text :> QueryParam "drink" Text :> QueryParam "companionship" Text :> QueryParam "companionshipIndex" Int :> QueryParam "preferredMinAge" Int :> QueryParam "preferredMaxAge" Int :> QueryParam "preferredMinHeight" Int :> QueryParam "preferredMaxHeight" Int :> QueryParam "preferredGender" Text :> QueryParam "preferredEducation" Text :> QueryParam "preferredEducationIndex" Int :> QueryParam "preferredBodyType" Text :> QueryParam "preferredEthnicity" Text :> QueryParam "preferredLocation" Text :> QueryParam "preferredLocationRange" Double :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "acceptedTerms" Bool :> QueryParam "charsetName" Text :> QueryParam "gameType" Text :> QueryParam "appKey" Text :> QueryParam "appVersion" Text :> QueryParam "responseType" Text :> Verb 'POST 200 '[JSON] ProfileInfoResponse -- 'secureSignup' route
    :<|> "consumer" :> "profile" :> "matchToken" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "matchToken" Text :> QueryParam "gameType" Text :> QueryParam "appKey" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] SirqulResponse -- 'setMatchToken' route
    :<|> "account" :> "active" :> "update" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "connectionAccountId" Integer :> QueryParam "appKey" Text :> QueryParam "active" Bool :> Verb 'POST 200 '[JSON] SirqulResponse -- 'updateActveStatus' route
    :<|> "account" :> "location" :> "update" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "clientTime" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'updateLocation' route
    :<|> "account" :> "settings" :> "update" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "blockedNotifications" Text :> QueryParam "suggestionMethod" Text :> QueryParam "suggestionCount" Int :> QueryParam "suggestionTimeFrame" Int :> QueryParam "showOthersExactLocation" Bool :> QueryParam "showAsZipcode" Bool :> QueryParam "showExactLocation" Bool :> QueryParam "favoriteVisibility" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] UserSettingsResponse -- 'updateSettings' route
    :<|> "account" :> "validateAccountSignup" :> QueryParam "token" Text :> Verb 'POST 200 '[JSON] AccountLoginResponse -- 'validateAccountSignup' route
    :<|> "account" :> "validatepasswordreset" :> QueryParam "token" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'validatePasswordReset' route
    :<|> "achievement" :> "tier" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "keyword" Text :> QueryParam "achievementType" Integer :> QueryParam "rankType" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "descendingGoal" Bool :> QueryParam "start" Integer :> QueryParam "limit" Integer :> Verb 'POST 200 '[JSON] AchievementTierResponse -- 'achievementTierSearchPost' route
    :<|> "achievement" :> "create" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "analyticsTag" Text :> QueryParam "title" Text :> QueryParam "description" Text :> QueryParam "rankType" Text :> QueryParam "rankIncrement" Int :> QueryParam "minIncrement" Int :> QueryParam "maxIncrement" Int :> QueryParam "validate" Bool :> QueryParam "active" Bool :> QueryParam "triggerDefinition" Text :> Verb 'POST 200 '[JSON] AchievementResponse -- 'createAchievement' route
    :<|> "achievement" :> "tier" :> "create" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "achievementId" Integer :> QueryParam "icon" FilePath :> QueryParam "iconAssetId" Integer :> QueryParam "title" Text :> QueryParam "description" Text :> QueryParam "goalCount" Integer :> QueryParam "missionId" Integer :> QueryParam "gameId" Integer :> QueryParam "packId" Integer :> QueryParam "gameLevelId" Integer :> QueryParam "gameObjectId" Int :> QueryParam "scoreAllInstances" Bool :> Verb 'POST 200 '[JSON] AchievementTierResponse -- 'createAchievementTier' route
    :<|> "achievement" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "achievementId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteAchievement' route
    :<|> "achievement" :> "tier" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "achievementTierId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteAchievementTier' route
    :<|> "achievement" :> "get" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "achievementId" Integer :> QueryParam "achievementType" Text :> Verb 'GET 200 '[JSON] AchievementTierResponse -- 'getAchievement' route
    :<|> "achievement" :> "tier" :> "get" :> QueryParam "accountId" Integer :> QueryParam "achievementTierId" Integer :> Verb 'POST 200 '[JSON] AchievementTierResponse -- 'getAchievementTier' route
    :<|> "achievement" :> "progress" :> "get" :> QueryParam "returnNulls" Bool :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "connectionAccountEmail" Text :> QueryParam "connectionAccountId" Integer :> QueryParam "appKey" Text :> QueryParam "rankType" Text :> QueryParam "achievementType" Text :> QueryParam "includeUndiscovered" Bool :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'GET 200 '[JSON] [AchievementProgressResponse] -- 'getUserAchievements' route
    :<|> "achievement" :> "tag" :> "list" :> QueryParam "appKey" Text :> Verb 'GET 200 '[JSON] SirqulResponse -- 'listAchievementTags' route
    :<|> "achievement" :> "list" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "keyword" Text :> QueryParam "achievementType" Text :> QueryParam "rankType" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "activeOnly" Bool :> Verb 'GET 200 '[JSON] [AchievementShortResponse] -- 'listAchievements' route
    :<|> "achievement" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "keyword" Text :> QueryParam "achievementType" Text :> QueryParam "rankType" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "includeTiers" Bool :> QueryParam "includeInactiveTiers" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] [AchievementShortResponse] -- 'searchAchievements' route
    :<|> "achievement" :> "update" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "achievementId" Integer :> QueryParam "analyticsTag" Text :> QueryParam "title" Text :> QueryParam "description" Text :> QueryParam "rankType" Text :> QueryParam "rankIncrement" Int :> QueryParam "minIncrement" Int :> QueryParam "nullMinIncrement" Bool :> QueryParam "maxIncrement" Int :> QueryParam "nullMaxIncrement" Bool :> QueryParam "validate" Bool :> QueryParam "active" Bool :> QueryParam "triggerDefinition" Text :> Verb 'POST 200 '[JSON] AchievementResponse -- 'updateAchievement' route
    :<|> "achievement" :> "tier" :> "update" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "achievementTierId" Integer :> QueryParam "icon" FilePath :> QueryParam "iconAssetId" Integer :> QueryParam "title" Text :> QueryParam "description" Text :> QueryParam "goalCount" Integer :> QueryParam "missionId" Integer :> QueryParam "gameId" Integer :> QueryParam "packId" Integer :> QueryParam "gameLevelId" Integer :> QueryParam "gameObjectId" Integer :> QueryParam "scoreAllInstances" Bool :> Verb 'POST 200 '[JSON] AchievementTierResponse -- 'updateAchievementTier' route
    :<|> "achievement" :> "progress" :> "update" :> QueryParam "accountId" Integer :> QueryParam "achievementId" Integer :> QueryParam "tag" Text :> QueryParam "customId" Integer :> QueryParam "increment" Integer :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "returnProgress" Bool :> Verb 'POST 200 '[JSON] SirqulResponse -- 'updateUserAchievement' route
    :<|> "entity" :> "reference" :> ReqBody '[JSON] EntityReference :> Verb 'POST 200 '[JSON] ActivityResponse -- 'createEntityReference' route
    :<|> "album" :> "create" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "title" Text :> QueryParam "assetsToAdd" Text :> QueryParam "media" FilePath :> QueryParam "mediaURL" Text :> QueryParam "assetId" Integer :> QueryParam "attachedMedia" FilePath :> QueryParam "attachedMediaURL" Text :> QueryParam "coverAssetNullable" Bool :> QueryParam "includeCoverInAssetList" Bool :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "tags" Text :> QueryParam "description" Text :> QueryParam "albumType" Text :> QueryParam "albumTypeId" Integer :> QueryParam "subType" Text :> QueryParam "publicRead" Bool :> QueryParam "publicWrite" Bool :> QueryParam "publicDelete" Bool :> QueryParam "publicAdd" Bool :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "locationDescription" Text :> QueryParam "visibility" Text :> QueryParam "gameType" Text :> QueryParam "appKey" Text :> QueryParam "cellPhone" Text :> QueryParam "streetAddress" Text :> QueryParam "streetAddress2" Text :> QueryParam "city" Text :> QueryParam "state" Text :> QueryParam "postalCode" Text :> QueryParam "fullAddress" Text :> QueryParam "anonymous" Bool :> QueryParam "metaData" Text :> QueryParam "categoryIds" Text :> QueryParam "categoryFilterIds" Text :> QueryParam "audienceIds" Text :> QueryParam "includeAllAppUsersAsMembers" Bool :> QueryParam "includeAudiencesAsMembers" Bool :> QueryParam "audienceOperator" Text :> QueryParam "approvalStatus" Text :> QueryParam "linkedObjectType" Text :> QueryParam "linkedObjectId" Integer :> Verb 'POST 200 '[JSON] SearchResponse -- 'addAlbumCollection' route
    :<|> "album" :> "user" :> "add" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "albumId" Integer :> QueryParam "read" Bool :> QueryParam "write" Bool :> QueryParam "delete" Bool :> QueryParam "add" Bool :> QueryParam "connections" Text :> QueryParam "connectionGroups" Text :> QueryParam "includeFriendGroup" Bool :> Verb 'POST 200 '[JSON] SirqulResponse -- 'addAlbumUsers' route
    :<|> "album" :> "approve" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "albumId" Integer :> QueryParam "approvalStatus" Text :> QueryParam "verified" Bool :> Verb 'POST 200 '[JSON] SirqulResponse -- 'approveAlbum' route
    :<|> "album" :> "get" :> QueryParam "returnNulls" Bool :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "albumId" Integer :> QueryParam "likePreviewSize" Int :> QueryParam "assetPreviewSize" Int :> QueryParam "notePreviewSize" Int :> QueryParam "connectionPreviewSize" Int :> QueryParam "audiencePreviewSize" Int :> Verb 'GET 200 '[JSON] AlbumFullResponse -- 'getAlbumCollection' route
    :<|> "album" :> "user" :> "leave" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "albumId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'leaveAlbum' route
    :<|> "album" :> "delete" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "albumId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'removeAlbum' route
    :<|> "album" :> "user" :> "delete" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "albumId" Integer :> QueryParam "connections" Text :> QueryParam "connectionGroups" Text :> QueryParam "removeFriendGroup" Bool :> Verb 'POST 200 '[JSON] SirqulResponse -- 'removeAlbumUsers' route
    :<|> "album" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "connectionAccountId" Integer :> QueryParam "ownerId" Integer :> QueryParam "albumIds" Text :> QueryParam "excludeAlbumIds" Text :> QueryParam "mediaId" Integer :> QueryParam "keyword" Text :> QueryParam "filter" Text :> QueryParam "albumType" Text :> QueryParam "albumTypeId" Integer :> QueryParam "subType" Text :> QueryParam "includeInactive" Bool :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "limitPerAlbumType" Int :> QueryParam "dateCreated" Integer :> QueryParam "updatedSince" Integer :> QueryParam "updatedBefore" Integer :> QueryParam "createdSince" Integer :> QueryParam "createdBefore" Integer :> QueryParam "startedSince" Integer :> QueryParam "startedBefore" Integer :> QueryParam "endedSince" Integer :> QueryParam "endedBefore" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "range" Double :> QueryParam "appKey" Text :> QueryParam "categoryIds" Text :> QueryParam "categoryFilterIds" Text :> QueryParam "audienceIds" Text :> QueryParam "excludeAudienceIds" Text :> QueryParam "includeLiked" Bool :> QueryParam "includeFavorited" Bool :> QueryParam "includePermissions" Bool :> QueryParam "includeCompletable" Bool :> QueryParam "includeRating" Bool :> QueryParam "likePreviewSize" Int :> QueryParam "assetPreviewSize" Int :> QueryParam "notePreviewSize" Int :> QueryParam "connectionPreviewSize" Int :> QueryParam "audiencePreviewSize" Int :> QueryParam "searchMode" Text :> QueryParam "stackSearch" Bool :> QueryParam "stackWindowSize" Int :> QueryParam "minStackPerPage" Int :> QueryParam "stackPaginationIdentifier" Text :> QueryParam "stackDetails" Bool :> QueryParam "flagCountMinimum" Integer :> QueryParam "removeFlaggedContent" Bool :> QueryParam "verifiedFilter" Bool :> QueryParam "linkedObjectType" Text :> QueryParam "linkedObjectId" Integer :> QueryParam "orderAudienceId" Integer :> QueryParam "ignoreDefaultAppFilter" Bool :> QueryParam "searchExpression" Text :> QueryParam "generateAlbums" Bool :> Verb 'GET 200 '[JSON] [AlbumFullResponse] -- 'searchAlbums' route
    :<|> "album" :> "update" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "albumId" Integer :> QueryParam "assetsToAdd" Text :> QueryParam "assetsToRemove" Text :> QueryParam "assetId" Integer :> QueryParam "media" FilePath :> QueryParam "mediaURL" Text :> QueryParam "active" Bool :> QueryParam "title" Text :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "tags" Text :> QueryParam "description" Text :> QueryParam "albumType" Text :> QueryParam "albumTypeId" Integer :> QueryParam "subType" Text :> QueryParam "publicRead" Bool :> QueryParam "publicWrite" Bool :> QueryParam "publicDelete" Bool :> QueryParam "publicAdd" Bool :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "locationDescription" Text :> QueryParam "visibility" Text :> QueryParam "cellPhone" Text :> QueryParam "streetAddress" Text :> QueryParam "streetAddress2" Text :> QueryParam "city" Text :> QueryParam "state" Text :> QueryParam "postalCode" Text :> QueryParam "fullAddress" Text :> QueryParam "anonymous" Bool :> QueryParam "metaData" Text :> QueryParam "categoryIds" Text :> QueryParam "categoryFilterIds" Text :> QueryParam "audienceIds" Text :> QueryParam "audienceIdsToAdd" Text :> QueryParam "audienceIdsToRemove" Text :> QueryParam "includeAllAppUsersAsMembers" Bool :> QueryParam "includeAudiencesAsMembers" Bool :> QueryParam "audienceOperator" Text :> QueryParam "linkedObjectType" Text :> QueryParam "linkedObjectId" Integer :> QueryParam "indexNow" Bool :> Verb 'POST 200 '[JSON] AlbumResponse -- 'updateAlbumCollection' route
    :<|> "analytics" :> "useractivity" :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "accountId" Integer :> Verb 'GET 200 '[JSON] [UserActivityResponse] -- 'activities' route
    :<|> "analytics" :> "aggregatedFilteredUsage" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "applicationId" Integer :> QueryParam "appKey" Text :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "deviceType" Text :> QueryParam "device" Text :> QueryParam "deviceOS" Text :> QueryParam "gender" Text :> QueryParam "ageGroup" Text :> QueryParam "country" Text :> QueryParam "state" Text :> QueryParam "city" Text :> QueryParam "zip" Text :> QueryParam "model" Text :> QueryParam "tag" Text :> QueryParam "userAccountId" Integer :> QueryParam "userAccountDisplay" Text :> QueryParam "userAccountUsername" Text :> QueryParam "groupByRoot" Text :> QueryParam "groupBy" Text :> QueryParam "distinctCount" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "hideUnknown" Bool :> QueryParam "responseFormat" Text :> QueryParam "_l" Int :> QueryParam "limit" Int :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'GET 200 '[JSON] ChartData -- 'aggregatedFilteredUsage' route
    :<|> "analytics" :> "filteredUsage" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "applicationId" Integer :> QueryParam "appKey" Text :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "deviceType" Text :> QueryParam "device" Text :> QueryParam "deviceOS" Text :> QueryParam "gender" Text :> QueryParam "ageGroup" Text :> QueryParam "country" Text :> QueryParam "state" Text :> QueryParam "city" Text :> QueryParam "zip" Text :> QueryParam "model" Text :> QueryParam "tag" Text :> QueryParam "userAccountId" Integer :> QueryParam "userAccountDisplay" Text :> QueryParam "userAccountUsername" Text :> QueryParam "customId" Integer :> QueryParam "customType" Text :> QueryParam "customValue" Double :> QueryParam "customValue2" Double :> QueryParam "customLong" Integer :> QueryParam "customLong2" Integer :> QueryParam "customMessage" Text :> QueryParam "customMessage2" Text :> QueryParam "groupBy" Text :> QueryParam "distinctCount" Text :> QueryParam "sumColumn" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "hideUnknown" Bool :> QueryParam "responseFormat" Text :> QueryParam "_l" Int :> QueryParam "limit" Int :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'GET 200 '[JSON] ChartData -- 'filteredUsage' route
    :<|> "analytics" :> "usage" :> QueryParam "tag" Text :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "applicationId" Integer :> QueryParam "appKey" Text :> QueryParam "appVersion" Text :> QueryParam "device" Text :> QueryParam "deviceType" Text :> QueryParam "deviceOS" Text :> QueryParam "model" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "customId" Integer :> QueryParam "customType" Text :> QueryParam "achievementIncrement" Integer :> QueryParam "city" Text :> QueryParam "state" Text :> QueryParam "country" Text :> QueryParam "zip" Text :> QueryParam "locationDescription" Text :> QueryParam "clientTime" Integer :> QueryParam "errorMessage" Text :> QueryParam "ip" Text :> QueryParam "userAgent" Text :> QueryParam "backgroundEvent" Bool :> QueryParam "customMessage" Text :> QueryParam "customMessage2" Text :> QueryParam "customValue" Double :> QueryParam "customValue2" Double :> QueryParam "customLong" Integer :> QueryParam "customLong2" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'usage' route
    :<|> "analytics" :> "usage" :> "batch" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "appVersion" Text :> QueryParam "device" Text :> QueryParam "deviceType" Text :> QueryParam "deviceOS" Text :> QueryParam "model" Text :> QueryParam "data" Text :> QueryParam "updateRanking" Bool :> QueryParam "returnSummaryResponse" Bool :> Verb 'POST 200 '[JSON] SirqulResponse -- 'usageBatch' route
    :<|> "app" :> "get" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "gameType" Text :> QueryParam "includeGameData" Bool :> QueryParam "q" Text :> QueryParam "keyword" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "_i" Int :> QueryParam "start" Int :> QueryParam "_l" Int :> QueryParam "limit" Int :> QueryParam "gameObjectCount" Bool :> QueryParam "filter" Text :> QueryParam "dateCreated" Integer :> QueryParam "ownerId" Integer :> QueryParam "missionIds" Text :> QueryParam "gameIds" Text :> QueryParam "packIds" Text :> QueryParam "gameLevelIds" Text :> QueryParam "appVersion" Text :> QueryParam "includeHigherVersionPacks" Bool :> QueryParam "includeHigherVersionLevels" Bool :> QueryParam "responseGroups" Text :> QueryParam "purchaseType" Text :> Verb 'GET 200 '[JSON] AppResponse -- 'getAppData' route
    :<|> "app" :> "post" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "gameType" Text :> QueryParam "includeGameData" Bool :> QueryParam "q" Text :> QueryParam "keyword" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "_i" Int :> QueryParam "start" Int :> QueryParam "_l" Int :> QueryParam "limit" Int :> QueryParam "gameObjectCount" Bool :> QueryParam "filter" Text :> QueryParam "dateCreated" Integer :> QueryParam "ownerId" Integer :> QueryParam "missionIds" Text :> QueryParam "gameIds" Text :> QueryParam "packIds" Text :> QueryParam "gameLevelIds" Text :> QueryParam "appVersion" Text :> QueryParam "includeHigherVersionPacks" Bool :> QueryParam "includeHigherVersionLevels" Bool :> QueryParam "responseGroups" Text :> QueryParam "purchaseType" Text :> QueryParam "data" Text :> Verb 'POST 200 '[JSON] AppResponse -- 'postAppData' route
    :<|> "app" :> "regen" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "buildVersion" Text :> QueryParam "apiVersion" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'regenAppData' route
    :<|> "application" :> "create" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appName" Text :> QueryParam "about" Text :> QueryParam "bundleId" Text :> QueryParam "appIconAssetId" Integer :> QueryParam "appLogoAssetId" Integer :> QueryParam "facebookAppId" Text :> QueryParam "facebookAppSecret" Text :> QueryParam "googleApiKey" Text :> QueryParam "updateEULADate" Bool :> QueryParam "eulaVersion" Text :> QueryParam "landingPageUrl" Text :> QueryParam "showInActivities" Bool :> QueryParam "activityDescription" Text :> QueryParam "inviteWelcomeText" Text :> QueryParam "invitePageUrl" Text :> QueryParam "urlScheme" Text :> QueryParam "platforms" Text :> QueryParam "downloadUrls" Text :> QueryParam "categoryIds" Text :> QueryParam "scoringType" Text :> QueryParam "hintCost" Int :> QueryParam "maxScore" Int :> QueryParam "ticketsPerPoint" Float :> QueryParam "hasGameData" Bool :> QueryParam "publicNotifications" Bool :> QueryParam "useMatchingAlgorithm" Bool :> QueryParam "globalTickets" Bool :> QueryParam "buildVersion" Float :> QueryParam "apiVersion" Float :> QueryParam "placementName" Text :> QueryParam "placementDescription" Text :> QueryParam "placementSize" Text :> QueryParam "placementHeight" Int :> QueryParam "placementWidth" Int :> QueryParam "placementRefreshInterval" Int :> QueryParam "createObjectStore" Bool :> QueryParam "publicContentApproval" Bool :> QueryParam "productionMode" Bool :> QueryParam "minimumSessionLength" Int :> QueryParam "sessionGapLength" Int :> QueryParam "localAdsEnabled" Bool :> QueryParam "sqootApiKey" Text :> QueryParam "trilatProcessingType" Text :> QueryParam "maxSampleSize" Int :> QueryParam "minRSSI" Double :> QueryParam "modules" Text :> QueryParam "authorizedCount" Int :> QueryParam "authorizedServers" Text :> QueryParam "defaultTimezone" Text :> QueryParam "smtpPass" Text :> QueryParam "metaData" Text :> QueryParam "placementMetaData" Text :> QueryParam "ipsFloor" Bool :> QueryParam "enableAPNSBadge" Bool :> QueryParam "includeInReport" Bool :> QueryParam "defaultAppFilterId" Integer :> QueryParam "enableWelcomeEmail" Bool :> QueryParam "appleAppId" Text :> QueryParam "appleTeamId" Text :> QueryParam "appleAuthKeyId" Text :> QueryParam "appleAuthKey" FilePath :> QueryParam "appleIssuerId" Text :> QueryParam "appStoreKeyId" Text :> QueryParam "appStoreKey" FilePath :> QueryParam "googlePrivateKeyFile" FilePath :> QueryParam "authorizeNetApiKey" Text :> QueryParam "authorizeNetTransactionKey" Text :> QueryParam "emailSender" Text :> QueryParam "smtpUser" Text :> QueryParam "smtpHost" Text :> QueryParam "vatomBusinessId" Text :> QueryParam "vatomRestClientId" Text :> QueryParam "vatomRestSecretKey" Text :> QueryParam "twilioAccountSID" Text :> QueryParam "twilioAuthToken" Text :> QueryParam "twilioSenderPhoneNumber" Text :> QueryParam "openAISecretKey" Text :> Verb 'POST 200 '[JSON] ApplicationResponse -- 'createApplication' route
    :<|> "application" :> "placement" :> "create" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "name" Text :> QueryParam "description" Text :> QueryParam "size" Text :> QueryParam "height" Int :> QueryParam "width" Int :> QueryParam "refreshInterval" Int :> QueryParam "defaultImageId" Integer :> QueryParam "active" Bool :> Verb 'POST 200 '[JSON] PlacementResponse -- 'createApplicationPlacement' route
    :<|> "application" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteApplication' route
    :<|> "application" :> "placement" :> "delete" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "placementId" Integer :> Verb 'POST 200 '[JSON] PlacementResponse -- 'deleteApplicationPlacement' route
    :<|> "application" :> "get" :> QueryParam "appKey" Text :> QueryParam "applicationId" Integer :> Verb 'GET 200 '[JSON] ApplicationResponse -- 'getApplication' route
    :<|> "application" :> "placement" :> "get" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "placementId" Integer :> Verb 'GET 200 '[JSON] PlacementResponse -- 'getApplicationPlacement' route
    :<|> "application" :> "versions" :> Verb 'GET 200 '[JSON] SirqulResponse -- 'getApplicationVersions' route
    :<|> "application" :> "users" :> QueryParam "appKey" Text :> QueryParam "q" Text :> QueryParam "keyword" Text :> QueryParam "since" Integer :> QueryParam "_i" Int :> QueryParam "start" Int :> QueryParam "_l" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] AccountListResponse -- 'getUniqueUsersByApp' route
    :<|> "application" :> "list" :> QueryParam "accountId" Integer :> QueryParam "q" Text :> QueryParam "keyword" Text :> QueryParam "platforms" Text :> QueryParam "deviceIds" Text :> QueryParam "deviceVersions" Text :> QueryParam "categoryIds" Text :> QueryParam "sortField" Text :> QueryParam "hasAds" Bool :> QueryParam "publicNotifications" Bool :> QueryParam "filterBillable" Bool :> QueryParam "filterContentAdmin" Bool :> QueryParam "descending" Bool :> QueryParam "_i" Int :> QueryParam "start" Int :> QueryParam "_l" Int :> QueryParam "limit" Int :> QueryParam "applicationIds" Text :> QueryParam "hasObjectStore" Bool :> QueryParam "activeOnly" Bool :> Verb 'GET 200 '[JSON] [ApplicationShortResponse] -- 'listApplications' route
    :<|> "application" :> "placement" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] [PlacementResponse] -- 'searchApplicationPlacement' route
    :<|> "application" :> "settings" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "connectionAccountId" Integer :> QueryParam "keyword" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] ApplicationSettingsResponse -- 'searchApplicationSettings' route
    :<|> "application" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "q" Text :> QueryParam "keyword" Text :> QueryParam "qSearchFields" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "_i" Int :> QueryParam "start" Int :> QueryParam "_l" Int :> QueryParam "limit" Int :> QueryParam "hasAds" Bool :> QueryParam "publicNotifications" Bool :> QueryParam "activeOnly" Bool :> Verb 'GET 200 '[JSON] [ApplicationResponse] -- 'searchApplications' route
    :<|> "application" :> "update" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "appName" Text :> QueryParam "about" Text :> QueryParam "bundleId" Text :> QueryParam "appIconAssetId" Integer :> QueryParam "appLogoAssetId" Integer :> QueryParam "facebookAppId" Text :> QueryParam "facebookAppSecret" Text :> QueryParam "googleApiKey" Text :> QueryParam "updateEULADate" Bool :> QueryParam "eulaVersion" Text :> QueryParam "landingPageUrl" Text :> QueryParam "showInActivities" Bool :> QueryParam "activityDescription" Text :> QueryParam "inviteWelcomeText" Text :> QueryParam "invitePageUrl" Text :> QueryParam "urlScheme" Text :> QueryParam "platforms" Text :> QueryParam "downloadUrls" Text :> QueryParam "categoryIds" Text :> QueryParam "scoringType" Text :> QueryParam "hintCost" Int :> QueryParam "maxScore" Int :> QueryParam "ticketsPerPoint" Float :> QueryParam "hasGameData" Bool :> QueryParam "publicNotifications" Bool :> QueryParam "useMatchingAlgorithm" Bool :> QueryParam "globalTickets" Bool :> QueryParam "buildVersion" Float :> QueryParam "apiVersion" Float :> QueryParam "placementName" Text :> QueryParam "placementDescription" Text :> QueryParam "placementSize" Text :> QueryParam "placementHeight" Int :> QueryParam "placementWidth" Int :> QueryParam "placementRefreshInterval" Int :> QueryParam "createObjectStore" Bool :> QueryParam "publicContentApproval" Bool :> QueryParam "productionMode" Bool :> QueryParam "minimumSessionLength" Int :> QueryParam "sessionGapLength" Int :> QueryParam "localAdsEnabled" Bool :> QueryParam "sqootApiKey" Text :> QueryParam "trilatProcessingType" Text :> QueryParam "maxSampleSize" Int :> QueryParam "minRSSI" Double :> QueryParam "modules" Text :> QueryParam "authorizedCount" Int :> QueryParam "authorizedServers" Text :> QueryParam "defaultTimezone" Text :> QueryParam "smtpPass" Text :> QueryParam "metaData" Text :> QueryParam "placementMetaData" Text :> QueryParam "ipsFloor" Bool :> QueryParam "enableAPNSBadge" Bool :> QueryParam "includeInReport" Bool :> QueryParam "defaultAppFilterId" Integer :> QueryParam "enableWelcomeEmail" Bool :> QueryParam "appleAppId" Text :> QueryParam "appleTeamId" Text :> QueryParam "appleAuthKeyId" Text :> QueryParam "appleAuthKey" FilePath :> QueryParam "appleIssuerId" Text :> QueryParam "appStoreKeyId" Text :> QueryParam "appStoreKey" FilePath :> QueryParam "googlePrivateKeyFile" FilePath :> QueryParam "authorizeNetApiKey" Text :> QueryParam "authorizeNetTransactionKey" Text :> QueryParam "emailSender" Text :> QueryParam "smtpUser" Text :> QueryParam "smtpHost" Text :> QueryParam "vatomBusinessId" Text :> QueryParam "vatomRestClientId" Text :> QueryParam "vatomRestSecretKey" Text :> QueryParam "twilioAccountSID" Text :> QueryParam "twilioAuthToken" Text :> QueryParam "twilioSenderPhoneNumber" Text :> QueryParam "openAISecretKey" Text :> Verb 'POST 200 '[JSON] ApplicationResponse -- 'updateApplication' route
    :<|> "application" :> "active" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "active" Bool :> Verb 'POST 200 '[JSON] SirqulResponse -- 'updateApplicationActive' route
    :<|> "application" :> "placement" :> "update" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "placementId" Integer :> QueryParam "name" Text :> QueryParam "description" Text :> QueryParam "size" Text :> QueryParam "height" Int :> QueryParam "width" Int :> QueryParam "refreshInterval" Int :> QueryParam "defaultImageId" Integer :> QueryParam "active" Bool :> Verb 'POST 200 '[JSON] PlacementResponse -- 'updateApplicationPlacement' route
    :<|> "application" :> "certificate" :> "create" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "certificate" FilePath :> Verb 'POST 200 '[JSON] SirqulResponse -- 'uploadApplicationCertificate' route
    :<|> "appconfig" :> "create" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "configVersion" Text :> QueryParam "assetId" Integer :> QueryParam "retailerId" Integer :> QueryParam "retailerLocationId" Integer :> QueryParam "udid" Text :> Verb 'POST 200 '[JSON] ApplicationConfigResponse -- 'createApplicationConfig' route
    :<|> "appconfig" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "configId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteApplicationConfig' route
    :<|> "appconfig" :> "get" :> QueryParam "accountId" Integer :> QueryParam "configId" Integer :> Verb 'GET 200 '[JSON] ApplicationConfigResponse -- 'getApplicationConfig' route
    :<|> "appconfig" :> "getbyversion" :> QueryParam "appKey" Text :> QueryParam "configVersion" Text :> QueryParam "retailerId" Integer :> QueryParam "retailerLocationId" Integer :> QueryParam "udid" Text :> QueryParam "allowOlderVersions" Bool :> Verb 'GET 200 '[JSON] ApplicationConfigResponse -- 'getApplicationConfigByConfigVersion' route
    :<|> "appconfig" :> "search" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "retailerId" Integer :> QueryParam "retailerLocationId" Integer :> QueryParam "udid" Text :> QueryParam "configVersion" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] [ApplicationConfigResponse] -- 'searchApplicationConfig' route
    :<|> "appconfig" :> "update" :> QueryParam "accountId" Integer :> QueryParam "configId" Integer :> QueryParam "appKey" Text :> QueryParam "configVersion" Text :> QueryParam "assetId" Integer :> QueryParam "retailerId" Integer :> QueryParam "retailerLocationId" Integer :> QueryParam "udid" Text :> Verb 'POST 200 '[JSON] ApplicationConfigResponse -- 'updateApplicationConfig' route
    :<|> "asset" :> "download" :> Capture "filename" Text :> Verb 'GET 200 '[JSON] SirqulResponse -- 'assetDownload' route
    :<|> "asset" :> "morph" :> QueryParam "offerId" Integer :> QueryParam "creativeId" Integer :> QueryParam "adSize" Text :> QueryParam "width" Int :> QueryParam "height" Int :> QueryParam "backgroundSize" Text :> QueryParam "template" Text :> Verb 'POST 200 '[JSON] AssetShortResponse -- 'assetMorph' route
    :<|> "asset" :> "create" :> QueryParam "returnNulls" Bool :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "albumId" Integer :> QueryParam "collectionId" Integer :> QueryParam "addToDefaultAlbum" Text :> QueryParam "addToMediaLibrary" Bool :> QueryParam "versionCode" Int :> QueryParam "versionName" Text :> QueryParam "metaData" Text :> QueryParam "caption" Text :> QueryParam "assetType" Text :> QueryParam "approvalStatus" Text :> QueryParam "assignedAccountId" Integer :> QueryParam "media" FilePath :> QueryParam "mediaUrl" Text :> QueryParam "mediaString" Text :> QueryParam "mediaStringFileName" Text :> QueryParam "mediaStringContentType" Text :> QueryParam "mediaHeight" Int :> QueryParam "mediaWidth" Int :> QueryParam "attachedMedia" FilePath :> QueryParam "attachedMediaUrl" Text :> QueryParam "attachedMediaString" Text :> QueryParam "attachedMediaStringFileName" Text :> QueryParam "attachedMediaStringContentType" Text :> QueryParam "attachedMediaHeight" Int :> QueryParam "attachedMediaWidth" Int :> QueryParam "locationDescription" Text :> QueryParam "app" Text :> QueryParam "appKey" Text :> QueryParam "searchTags" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] AssetResponse -- 'createAsset' route
    :<|> "asset" :> "delete" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "assetId" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteAsset' route
    :<|> "asset" :> "get" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "assetId" Integer :> QueryParam "noteDescending" Bool :> Verb 'GET 200 '[JSON] AssetFullResponse -- 'getAsset' route
    :<|> "asset" :> "remove" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "albumId" Integer :> QueryParam "collectionId" Integer :> QueryParam "assetId" Text :> QueryParam "removeFromDefaultAlbums" Bool :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] SirqulResponse -- 'removeAsset' route
    :<|> "asset" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "albumIds" Text :> QueryParam "assetIds" Text :> QueryParam "appKey" Text :> QueryParam "mediaType" Text :> QueryParam "mimeType" Text :> QueryParam "keyword" Text :> QueryParam "versionCode" Int :> QueryParam "versionName" Text :> QueryParam "updatedSince" Integer :> QueryParam "updatedBefore" Integer :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "searchMediaLibrary" Bool :> QueryParam "filterByBillable" Bool :> QueryParam "activeOnly" Bool :> QueryParam "returnApp" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "searchMode" Text :> QueryParam "assetType" Text :> QueryParam "approvalStatus" Text :> QueryParam "assignedAccountId" Integer :> Verb 'GET 200 '[JSON] [AssetResponse] -- 'searchAssets' route
    :<|> "asset" :> "update" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "assetId" Integer :> QueryParam "albumId" Integer :> QueryParam "attachedAssetId" Integer :> QueryParam "versionCode" Int :> QueryParam "versionName" Text :> QueryParam "metaData" Text :> QueryParam "caption" Text :> QueryParam "assetType" Text :> QueryParam "approvalStatus" Text :> QueryParam "assignedAccountId" Integer :> QueryParam "media" FilePath :> QueryParam "mediaUrl" Text :> QueryParam "mediaString" Text :> QueryParam "mediaStringFileName" Text :> QueryParam "mediaStringContentType" Text :> QueryParam "mediaHeight" Int :> QueryParam "mediaWidth" Int :> QueryParam "attachedMedia" FilePath :> QueryParam "attachedMediaUrl" Text :> QueryParam "attachedMediaString" Text :> QueryParam "attachedMediaStringFileName" Text :> QueryParam "attachedMediaStringContentType" Text :> QueryParam "attachedMediaHeight" Int :> QueryParam "attachedMediaWidth" Int :> QueryParam "locationDescription" Text :> QueryParam "searchTags" Text :> QueryParam "appKey" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] SirqulResponse -- 'updateAsset' route
    :<|> "assignment" :> "assignee" :> "search" :> QueryParam "accountId" Integer :> QueryParam "keyword" Text :> Verb 'GET 200 '[JSON] [AccountMiniResponse] -- 'assigmentAssigneeAccountSearch' route
    :<|> "assignment" :> "create" :> QueryParam "accountId" Integer :> QueryParam "name" Text :> QueryParam "description" Text :> QueryParam "assigneeAccountId" Integer :> QueryParam "retailerLocationId" Integer :> QueryParam "tags" Text :> QueryParam "active" Bool :> Verb 'POST 200 '[JSON] AssignmentResponse -- 'assignmentCreate' route
    :<|> "assignment" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "assignmentId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'assignmentDelete' route
    :<|> "assignment" :> "get" :> QueryParam "accountId" Integer :> QueryParam "assignmentId" Integer :> Verb 'GET 200 '[JSON] AssignmentResponse -- 'assignmentGet' route
    :<|> "assignment" :> "search" :> QueryParam "accountId" Integer :> QueryParam "creatorAccountId" Integer :> QueryParam "assigneeAccountIds" Text :> QueryParam "retailerLocationIds" Text :> QueryParam "currentStatusType" Text :> QueryParam "keyword" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "activeOnly" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] [AssignmentResponse] -- 'assignmentSearch' route
    :<|> "assignment" :> "status" :> "create" :> QueryParam "accountId" Integer :> QueryParam "assignmentId" Integer :> QueryParam "scheduledNotificationId" Integer :> QueryParam "toDo" Text :> QueryParam "connection" Text :> QueryParam "method" Text :> QueryParam "status" Text :> QueryParam "closure" Text :> QueryParam "message" Text :> QueryParam "followUp" Integer :> QueryParam "active" Bool :> Verb 'POST 200 '[JSON] AssignmentStatusResponse -- 'assignmentStatusCreate' route
    :<|> "assignment" :> "status" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "assignmentStatusId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'assignmentStatusDelete' route
    :<|> "assignment" :> "status" :> "get" :> QueryParam "accountId" Integer :> QueryParam "assignmentStatusId" Integer :> Verb 'GET 200 '[JSON] AssignmentStatusResponse -- 'assignmentStatusGet' route
    :<|> "assignment" :> "status" :> "search" :> QueryParam "accountId" Integer :> QueryParam "assignmentId" Integer :> QueryParam "creatorAccountId" Integer :> QueryParam "assigneeAccountId" Integer :> QueryParam "retailerLocationId" Integer :> QueryParam "statusType" Text :> QueryParam "keyword" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "activeOnly" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] [AssignmentStatusResponse] -- 'assignmentStatusSearch' route
    :<|> "assignment" :> "status" :> "update" :> QueryParam "accountId" Integer :> QueryParam "assignmentStatusId" Integer :> QueryParam "scheduledNotificationId" Integer :> QueryParam "toDo" Text :> QueryParam "connection" Text :> QueryParam "method" Text :> QueryParam "status" Text :> QueryParam "closure" Text :> QueryParam "message" Text :> QueryParam "followUp" Integer :> QueryParam "active" Bool :> Verb 'POST 200 '[JSON] AssignmentStatusResponse -- 'assignmentStatusUpdate' route
    :<|> "assignment" :> "update" :> QueryParam "accountId" Integer :> QueryParam "assignmentId" Integer :> QueryParam "name" Text :> QueryParam "description" Text :> QueryParam "assigneeAccountId" Integer :> QueryParam "retailerLocationId" Integer :> QueryParam "tags" Text :> QueryParam "active" Bool :> Verb 'POST 200 '[JSON] AssignmentResponse -- 'assignmentUpdate' route
    :<|> "audience" :> "create" :> QueryParam "accountId" Integer :> QueryParam "name" Text :> QueryParam "description" Text :> QueryParam "searchTags" Text :> QueryParam "gender" Text :> QueryParam "ageGroups" Text :> QueryParam "categoryIds" Text :> QueryParam "applicationIds" Text :> QueryParam "gameExperienceLevel" Text :> QueryParam "devices" Text :> QueryParam "deviceIds" Text :> QueryParam "deviceVersions" Text :> QueryParam "locations" Text :> QueryParam "radius" Text :> QueryParam "startTimeOffset" Int :> QueryParam "endTimeOffset" Int :> QueryParam "sendSuggestion" Bool :> QueryParam "associateDescription" Text :> QueryParam "associateType" Text :> QueryParam "associateId" Integer :> QueryParam "groupingId" Text :> QueryParam "metaData" Text :> QueryParam "visibility" Text :> QueryParam "audienceType" Text :> QueryParam "useOrder" Bool :> QueryParam "cohortRegionsData" Text :> QueryParam "appKey" Text :> QueryParam "trilaterationTypes" Text :> QueryParam "uniqueName" Bool :> Verb 'POST 200 '[JSON] AudienceResponse -- 'createAudience' route
    :<|> "audience" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "audienceId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteAudience' route
    :<|> "audience" :> "ageGroups" :> Verb 'GET 200 '[JSON] [AgeGroupResponse] -- 'getAgeGroups' route
    :<|> "audience" :> "get" :> QueryParam "accountId" Integer :> QueryParam "audienceId" Integer :> QueryParam "appKey" Text :> QueryParam "returnAccountCount" Bool :> QueryParam "returnAlbumCount" Bool :> QueryParam "albumTypesForCount" Text :> Verb 'GET 200 '[JSON] AudienceResponse -- 'getAudience' route
    :<|> "audience" :> "search" :> QueryParam "accountId" Integer :> QueryParam "albumIds" Text :> QueryParam "keyword" Text :> QueryParam "keywordFields" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "sendSuggestion" Bool :> QueryParam "activeOnly" Bool :> QueryParam "groupByGroupingId" Bool :> QueryParam "appKey" Text :> QueryParam "returnGlobal" Bool :> QueryParam "exactKeyword" Bool :> QueryParam "audienceType" Text :> QueryParam "audienceTypes" Text :> QueryParam "returnAccountCount" Bool :> QueryParam "returnAlbumCount" Bool :> QueryParam "albumTypesForCount" Text :> Verb 'GET 200 '[JSON] [SearchResponse] -- 'getAudienceList' route
    :<|> "audience" :> "devices" :> QueryParam "includeInactive" Bool :> Verb 'GET 200 '[JSON] [AudienceDeviceResponse] -- 'getDevices' route
    :<|> "audience" :> "experiences" :> Verb 'GET 200 '[JSON] SirqulResponse -- 'getExperiences' route
    :<|> "audience" :> "grouped" :> "get" :> QueryParam "accountId" Integer :> QueryParam "audienceGroupingId" Text :> Verb 'GET 200 '[JSON] AudienceResponse -- 'getGroupedAudiences' route
    :<|> "audience" :> "suggestion" :> "list" :> QueryParam "accountId" Integer :> QueryParam "limit" Int :> QueryParam "suggestionType" Text :> Verb 'POST 200 '[JSON] OfferListResponse -- 'listByAccount' route
    :<|> "audience" :> "suggestion" :> "offersByAudience" :> QueryParam "gender" Text :> QueryParam "age" Int :> QueryParam "categoryIds" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] OfferListResponse -- 'listByAudience' route
    :<|> "audience" :> "suggestion" :> "latest" :> QueryParam "accountId" Integer :> QueryParam "timeframe" Int :> QueryParam "suggestionType" Text :> Verb 'GET 200 '[JSON] OfferListResponse -- 'listLastestByAccount' route
    :<|> "audience" :> "suggestion" :> "send" :> QueryParam "accountId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] SirqulResponse -- 'sendByAccount' route
    :<|> "audience" :> "update" :> QueryParam "accountId" Integer :> QueryParam "audienceId" Integer :> QueryParam "name" Text :> QueryParam "description" Text :> QueryParam "searchTags" Text :> QueryParam "gender" Text :> QueryParam "ageGroups" Text :> QueryParam "categoryIds" Text :> QueryParam "applicationIds" Text :> QueryParam "gameExperienceLevel" Text :> QueryParam "devices" Text :> QueryParam "deviceIds" Text :> QueryParam "deviceVersions" Text :> QueryParam "locations" Text :> QueryParam "radius" Text :> QueryParam "active" Bool :> QueryParam "sendSuggestion" Bool :> QueryParam "startTimeOffset" Int :> QueryParam "endTimeOffset" Int :> QueryParam "associateDescription" Text :> QueryParam "associateType" Text :> QueryParam "associateId" Integer :> QueryParam "groupingId" Text :> QueryParam "metaData" Text :> QueryParam "visibility" Text :> QueryParam "audienceType" Text :> QueryParam "useOrder" Bool :> QueryParam "cohortRegionsData" Text :> QueryParam "appKey" Text :> QueryParam "trilaterationTypes" Text :> QueryParam "uniqueName" Bool :> Verb 'POST 200 '[JSON] AudienceResponse -- 'updateAudience' route
    :<|> "bid" :> "create" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "biddableType" Text :> QueryParam "biddableId" Integer :> QueryParam "amountPerView" Double :> QueryParam "amountPerAction" Double :> QueryParam "budgetAmount" Double :> QueryParam "budgetSchedule" Text :> Verb 'POST 200 '[JSON] BidResponse -- 'createBid' route
    :<|> "bid" :> "delete" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "bidId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteBid' route
    :<|> "bid" :> "get" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "bidId" Integer :> Verb 'GET 200 '[JSON] BidResponse -- 'getBid' route
    :<|> "bid" :> "update" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "bidId" Integer :> QueryParam "amountPerView" Double :> QueryParam "amountPerAction" Double :> QueryParam "budgetAmount" Double :> QueryParam "budgetSchedule" Text :> Verb 'POST 200 '[JSON] BidResponse -- 'updateBid' route
    :<|> "billable" :> "create" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "name" Text :> QueryParam "streetAddress" Text :> QueryParam "streetAddress2" Text :> QueryParam "city" Text :> QueryParam "state" Text :> QueryParam "postalCode" Text :> QueryParam "businessPhone" Text :> QueryParam "businessPhoneExt" Text :> QueryParam "authorizeNetApiKey" Text :> QueryParam "authorizeNetTransactionKey" Text :> Verb 'POST 200 '[JSON] BillableEntityResponse -- 'createBillableEntity' route
    :<|> "billable" :> "delete" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteBillableEntity' route
    :<|> "billable" :> "get" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "includeCounts" Bool :> QueryParam "includePayments" Bool :> Verb 'GET 200 '[JSON] BillableEntityResponse -- 'getBillableEntity' route
    :<|> "billable" :> "update" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "name" Text :> QueryParam "streetAddress" Text :> QueryParam "streetAddress2" Text :> QueryParam "city" Text :> QueryParam "state" Text :> QueryParam "postalCode" Text :> QueryParam "businessPhone" Text :> QueryParam "businessPhoneExt" Text :> QueryParam "authorizeNetApiKey" Text :> QueryParam "authorizeNetTransactionKey" Text :> Verb 'POST 200 '[JSON] BillableEntityResponse -- 'updateBillableEntity' route
    :<|> "billing" :> "update" :> QueryParam "accountId" Integer :> QueryParam "paymentMethodId" Integer :> QueryParam "accountName" Text :> QueryParam "firstName" Text :> QueryParam "lastName" Text :> QueryParam "address" Text :> QueryParam "city" Text :> QueryParam "state" Text :> QueryParam "postalCode" Text :> QueryParam "country" Text :> QueryParam "phone" Text :> QueryParam "creditCardNumber" Text :> QueryParam "expirationDate" Text :> QueryParam "ccv" Text :> QueryParam "accountNumber" Text :> QueryParam "bankName" Text :> QueryParam "routingNumber" Text :> QueryParam "defaultPaymentMethod" Bool :> QueryParam "paymentMethodNickname" Text :> QueryParam "taxId" Text :> QueryParam "providerCustomerProfileId" Text :> QueryParam "providerPaymentProfileId" Text :> QueryParam "metaData" Text :> Verb 'POST 200 '[JSON] PaymentTypesResponse -- 'addPaymentMethod' route
    :<|> "billing" :> "create" :> QueryParam "accountId" Integer :> QueryParam "accountName" Text :> QueryParam "firstName" Text :> QueryParam "lastName" Text :> QueryParam "address" Text :> QueryParam "city" Text :> QueryParam "state" Text :> QueryParam "postalCode" Text :> QueryParam "country" Text :> QueryParam "phone" Text :> QueryParam "creditCardNumber" Text :> QueryParam "expirationDate" Text :> QueryParam "ccv" Text :> QueryParam "accountNumber" Text :> QueryParam "bankName" Text :> QueryParam "routingNumber" Text :> QueryParam "paymentMethodNickname" Text :> QueryParam "taxId" Text :> QueryParam "defaultPaymentMethod" Bool :> QueryParam "authToken" Text :> QueryParam "provider" Text :> QueryParam "providerCustomerProfileId" Text :> QueryParam "providerPaymentProfileId" Text :> QueryParam "metaData" Text :> QueryParam "appKey" Text :> Verb 'POST 200 '[JSON] PaymentTypesResponse -- 'createPaymentMethod' route
    :<|> "billing" :> "crypto" :> "transfer" :> QueryParam "accountId" Integer :> QueryParam "paymentMethodId" Integer :> QueryParam "tokenName" Text :> QueryParam "tokenSymbol" Text :> Verb 'POST 200 '[JSON] PaymentTypesResponse -- 'createSmartContract' route
    :<|> "billing" :> "crypto" :> "get" :> QueryParam "accountId" Integer :> QueryParam "ownerAccountId" Integer :> QueryParam "paymentMethodId" Integer :> Verb 'GET 200 '[JSON] PaymentTypesResponse -- 'getCryptoBalance' route
    :<|> "billing" :> "get" :> QueryParam "accountId" Integer :> QueryParam "paymentMethodId" Integer :> QueryParam "getCurrentBalance" Bool :> Verb 'GET 200 '[JSON] PaymentTypesResponse -- 'getPaymentMethod' route
    :<|> "billing" :> "search" :> QueryParam "accountId" Integer :> QueryParam "provider" Text :> QueryParam "type" Text :> QueryParam "keyword" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] PaymentTypesResponse -- 'searchPaymentMethod' route
    :<|> "csvimport" :> "batch" :> "status" :> "details" :> QueryParam "accountId" Integer :> QueryParam "batchId" Integer :> QueryParam "responseGroup" Text :> QueryParam "start" Integer :> QueryParam "limit" Integer :> Verb 'GET 200 '[JSON] SirqulResponse -- 'getStatusCSV' route
    :<|> "csvimport" :> "batch" :> "list" :> QueryParam "accountId" Integer :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] CsvImportResponse -- 'listStatusCSV' route
    :<|> "csvimport" :> "batch" :> "status" :> QueryParam "accountId" Integer :> QueryParam "batchId" Integer :> Verb 'GET 200 '[JSON] CsvImportResponse -- 'statusCSV' route
    :<|> "csvimport" :> "upload" :> QueryParam "accountId" Integer :> QueryParam "uploadType" Text :> QueryParam "importFile" FilePath :> QueryParam "appKey" Text :> QueryParam "fileFormat" Text :> Verb 'POST 200 '[JSON] CsvImportResponse -- 'uploadCSV' route
    :<|> "cargo" :> "type" :> ReqBody '[JSON] CargoType :> Verb 'POST 200 '[JSON] CargoType -- 'createCargoType' route
    :<|> "cargo" :> "type" :> Capture "cargoTypeId" Integer :> Verb 'DELETE 200 '[JSON] NoContent -- 'deleteCargoType' route
    :<|> "cargo" :> "type" :> Capture "cargoTypeId" Integer :> Verb 'GET 200 '[JSON] CargoType -- 'getCargoType' route
    :<|> "cargo" :> "type" :> QueryParam "retailerId" Integer :> QueryParam "hubId" Integer :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "activeOnly" Bool :> Verb 'GET 200 '[JSON] [CargoType] -- 'searchCargoTypes' route
    :<|> "cargo" :> "type" :> Capture "cargoTypeId" Integer :> ReqBody '[JSON] CargoType :> Verb 'PUT 200 '[JSON] CargoType -- 'updateCargoType' route
    :<|> "carrier" :> "search" :> QueryParam "keyword" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "activeOnly" Bool :> Verb 'GET 200 '[JSON] [CellCarrierResponse] -- 'searchCarriers' route
    :<|> "category" :> "distancesearch" :> QueryParam "accountId" Integer :> QueryParam "keyword" Text :> QueryParam "appKey" Text :> QueryParam "categoryIds" Text :> QueryParam "parentCategoryIds" Text :> QueryParam "rootOnly" Bool :> QueryParam "sortField" Text :> QueryParam "responseGroup" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "activeOnly" Bool :> QueryParam "returnExternal" Bool :> QueryParam "exactMatch" Bool :> QueryParam "type" Text :> QueryParam "externalType" Text :> QueryParam "minOfferCount" Int :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "range" Double :> Verb 'GET 200 '[JSON] [CategoryResponse] -- 'categoryDistanceSearch' route
    :<|> "category" :> "create" :> QueryParam "appKey" Text :> QueryParam "accountId" Integer :> QueryParam "parentCategoryId" Integer :> QueryParam "name" Text :> QueryParam "description" Text :> QueryParam "type" Text :> QueryParam "assetId" Integer :> QueryParam "externalId" Text :> QueryParam "externalType" Text :> QueryParam "externalCategorySlug" Text :> QueryParam "sqootSlug" Text :> QueryParam "active" Bool :> QueryParam "metaData" Text :> QueryParam "searchTags" Text :> Verb 'POST 200 '[JSON] CategoryTreeResponse -- 'createCategory' route
    :<|> "category" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "categoryId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteCategory' route
    :<|> "category" :> "duplicate" :> QueryParam "appKey" Text :> QueryParam "accountId" Integer :> QueryParam "categoryId" Integer :> QueryParam "parentCategoryId" Integer :> Verb 'POST 200 '[JSON] CategoryTreeResponse -- 'duplicateCategory' route
    :<|> "category" :> "get" :> QueryParam "categoryId" Integer :> QueryParam "returnExternal" Bool :> Verb 'GET 200 '[JSON] CategoryTreeResponse -- 'getCategory' route
    :<|> "category" :> "search" :> QueryParam "accountId" Integer :> QueryParam "keyword" Text :> QueryParam "appKey" Text :> QueryParam "categoryId" Text :> QueryParam "categoryIds" Text :> QueryParam "parentCategoryIds" Text :> QueryParam "rootOnly" Bool :> QueryParam "sortField" Text :> QueryParam "responseGroup" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "activeOnly" Bool :> QueryParam "returnExternal" Bool :> QueryParam "exactMatch" Bool :> QueryParam "type" Text :> QueryParam "externalType" Text :> QueryParam "excludeExternalType" Bool :> QueryParam "minOfferCount" Int :> QueryParam "searchDepth" Int :> QueryParam "searchMode" Text :> Verb 'GET 200 '[JSON] [CategoryResponse] -- 'searchCategories' route
    :<|> "category" :> "update" :> QueryParam "accountId" Integer :> QueryParam "categoryId" Integer :> QueryParam "parentCategoryId" Integer :> QueryParam "name" Text :> QueryParam "description" Text :> QueryParam "type" Text :> QueryParam "assetId" Integer :> QueryParam "externalId" Text :> QueryParam "externalType" Text :> QueryParam "externalCategorySlug" Text :> QueryParam "sqootSlug" Text :> QueryParam "active" Bool :> QueryParam "metaData" Text :> QueryParam "searchTags" Text :> Verb 'POST 200 '[JSON] CategoryTreeResponse -- 'updateCategory' route
    :<|> "consumer" :> "connection" :> "group" :> "addConnection" :> QueryParam "returnNulls" Bool :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "connectionId" Integer :> QueryParam "connectionAccountId" Integer :> QueryParam "pendingId" Integer :> QueryParam "groupId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] SirqulResponse -- 'addConnectionToGroup' route
    :<|> "connection" :> "group" :> "addConnections" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "connectionIds" Text :> QueryParam "connectionAccountIds" Text :> QueryParam "connectionGroupId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] SirqulResponse -- 'addConnectionsToGroup' route
    :<|> "consumer" :> "connection" :> "group" :> "addSubGroup" :> QueryParam "returnNulls" Bool :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "groupId" Integer :> QueryParam "subGroupIds" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] ConnectionGroupResponse -- 'addSubGroups' route
    :<|> "consumer" :> "connection" :> "add" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "connectionId" Integer :> QueryParam "connectionAccountId" Integer :> QueryParam "pendingId" Integer :> QueryParam "groupId" Integer :> QueryParam "gameType" Text :> QueryParam "appKey" Text :> QueryParam "isTrusted" Bool :> QueryParam "ignoreFriendRequest" Bool :> QueryParam "isContact" Bool :> QueryParam "isBlocked" Bool :> QueryParam "isFollowing" Bool :> QueryParam "connectionResponse" Bool :> Verb 'POST 200 '[JSON] ConnectionResponse -- 'createOrUpdateConnection' route
    :<|> "consumer" :> "connection" :> "group" :> QueryParam "returnNulls" Bool :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "name" Text :> QueryParam "groupId" Integer :> QueryParam "assetId" Integer :> QueryParam "connections" Text :> QueryParam "description" Text :> QueryParam "canViewProfileInfo" Bool :> QueryParam "canViewGameInfo" Bool :> QueryParam "canViewFriendInfo" Bool :> QueryParam "active" Bool :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] SirqulResponse -- 'createOrUpdateGroup' route
    :<|> "consumer" :> "follow" :> "accept" :> QueryParam "accountId" Integer :> QueryParam "connectionAccountId" Integer :> QueryParam "appKey" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'followAccept' route
    :<|> "consumer" :> "follow" :> "reject" :> QueryParam "accountId" Integer :> QueryParam "connectionAccountId" Integer :> QueryParam "appKey" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'followReject' route
    :<|> "consumer" :> "follow" :> "remove" :> QueryParam "accountId" Integer :> QueryParam "connectionAccountId" Integer :> QueryParam "appKey" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'followRemove' route
    :<|> "consumer" :> "follow" :> "request" :> QueryParam "accountId" Integer :> QueryParam "connectionAccountId" Integer :> QueryParam "appKey" Text :> QueryParam "approvalNeeded" Bool :> Verb 'POST 200 '[JSON] SirqulResponse -- 'followRequest' route
    :<|> "consumer" :> "friend" :> "accept" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "friendAccountId" Integer :> QueryParam "gameType" Text :> QueryParam "appKey" Text :> QueryParam "notifyFriend" Bool :> QueryParam "notificationMessage" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'friendAccept' route
    :<|> "consumer" :> "friend" :> "reject" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "friendAccountId" Integer :> QueryParam "gameType" Text :> QueryParam "appKey" Text :> QueryParam "notifyFriend" Bool :> QueryParam "notificationMessage" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'friendReject' route
    :<|> "consumer" :> "friend" :> "remove" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "friendAccountId" Integer :> QueryParam "notifyFriend" Bool :> QueryParam "removeFromGroups" Bool :> Verb 'POST 200 '[JSON] SirqulResponse -- 'friendRemove' route
    :<|> "consumer" :> "friend" :> "request" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "friendAccountId" Integer :> QueryParam "gameType" Text :> QueryParam "appKey" Text :> QueryParam "notificationMessage" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'friendRequest' route
    :<|> "consumer" :> "connection" :> "getRequested" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> Verb 'GET 200 '[JSON] ConnectionListResponse -- 'getConnectionSentFriendRequests' route
    :<|> "consumer" :> "connection" :> "get" :> QueryParam "returnNulls" Bool :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "connectionAccountId" Integer :> QueryParam "filter" Text :> QueryParam "q" Text :> QueryParam "keyword" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "_i" Int :> QueryParam "start" Int :> QueryParam "_l" Int :> QueryParam "limit" Int :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'GET 200 '[JSON] ConnectionListResponse -- 'getConnections' route
    :<|> "consumer" :> "connection" :> "group" :> "details" :> "get" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "groupId" Integer :> QueryParam "combineConnections" Bool :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'GET 200 '[JSON] ConnectionGroupResponse -- 'getGroupDetails' route
    :<|> "connection" :> "group" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "keyword" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "activeOnly" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] [ConnectionInfoResponse] -- 'groupSearch' route
    :<|> "consumer" :> "connection" :> "group" :> "removeConnection" :> QueryParam "returnNulls" Bool :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "connectionId" Integer :> QueryParam "connectionAccountId" Integer :> QueryParam "pendingId" Integer :> QueryParam "groupId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] SirqulResponse -- 'removeConnectionFromGroup' route
    :<|> "connection" :> "group" :> "removeConnections" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "connectionIds" Text :> QueryParam "connectionAccountIds" Text :> QueryParam "connectionGroupId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] SirqulResponse -- 'removeConnectionsFromGroup' route
    :<|> "consumer" :> "connection" :> "group" :> "remove" :> QueryParam "returnNulls" Bool :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "groupId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] SirqulResponse -- 'removeGroup' route
    :<|> "consumer" :> "connection" :> "group" :> "removeSubGroup" :> QueryParam "returnNulls" Bool :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "groupId" Integer :> QueryParam "subGroupIds" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] SirqulResponse -- 'removeSubGroups' route
    :<|> "connection" :> "search" :> QueryParam "returnNulls" Bool :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "q" Text :> QueryParam "keyword" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "gameType" Text :> QueryParam "appKey" Text :> QueryParam "_i" Int :> QueryParam "start" Int :> QueryParam "_l" Int :> QueryParam "limit" Int :> QueryParam "sortField" Text :> QueryParam "hasLocation" Bool :> Verb 'GET 200 '[JSON] ConnectionListResponse -- 'searchConnections' route
    :<|> "consumer" :> "album" :> "contest" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "gameType" Text :> QueryParam "appKey" Text :> QueryParam "contestType" Text :> QueryParam "albumContestId" Integer :> QueryParam "title" Text :> QueryParam "description" Text :> QueryParam "albumId1" Integer :> QueryParam "removeAlbum1" Bool :> QueryParam "albumId2" Integer :> QueryParam "removeAlbum2" Bool :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "publicRead" Bool :> QueryParam "publicWrite" Bool :> QueryParam "publicDelete" Bool :> QueryParam "publicAdd" Bool :> QueryParam "locationDescription" Text :> QueryParam "visibility" Text :> QueryParam "connectionIdsToAdd" Text :> QueryParam "connectionGroupIdsToAdd" Text :> QueryParam "includeFriendGroup" Bool :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] AlbumContestResponse -- 'addOrUpdateAlbumContest' route
    :<|> "consumer" :> "album" :> "contest" :> "approve" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "albumContestId" Integer :> QueryParam "approvalStatus" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'approveAlbumContest' route
    :<|> "consumer" :> "album" :> "contest" :> "remove" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "albumContestId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteContest' route
    :<|> "consumer" :> "album" :> "contest" :> "get" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "albumContestId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'GET 200 '[JSON] AlbumContestResponse -- 'getAlbumContest' route
    :<|> "consumer" :> "album" :> "contest" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "gameType" Text :> QueryParam "appKey" Text :> QueryParam "appType" Text :> QueryParam "contestType" Text :> QueryParam "ownerId" Integer :> QueryParam "q" Text :> QueryParam "keyword" Text :> QueryParam "filter" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "_i" Int :> QueryParam "start" Int :> QueryParam "_l" Int :> QueryParam "limit" Int :> QueryParam "dateCreated" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'GET 200 '[JSON] AlbumContestListResponse -- 'getAlbumContests' route
    :<|> "consumer" :> "album" :> "contest" :> "vote" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "albumContestId" Integer :> QueryParam "albumId" Integer :> QueryParam "contestType" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] AlbumContestResponse -- 'voteOnAlbumContest' route
    :<|> "creative" :> "addpreview" :> QueryParam "accountId" Integer :> QueryParam "creativeId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'addPreview' route
    :<|> "ads" :> "find" :> QueryParam "appKey" Text :> QueryParam "type" Text :> QueryParam "accountId" Integer :> QueryParam "appVersion" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "device" Text :> QueryParam "deviceIdentifier" Integer :> QueryParam "deviceVersion" Text :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "includeAudiences" Bool :> QueryParam "allocatesTickets" Bool :> QueryParam "randomize" Bool :> QueryParam "targetedAdsOnly" Bool :> QueryParam "missionIds" Text :> Verb 'GET 200 '[JSON] [MissionResponse] -- 'adsFind' route
    :<|> "creative" :> "create" :> QueryParam "accountId" Integer :> QueryParam "name" Text :> QueryParam "description" Text :> QueryParam "assetImageId" Integer :> QueryParam "action" Text :> QueryParam "data" Text :> QueryParam "suffix" Text :> QueryParam "type" Text :> QueryParam "balance" Double :> QueryParam "active" Bool :> QueryParam "referenceId" Integer :> QueryParam "appVersion" Text :> QueryParam "missionId" Integer :> QueryParam "offerId" Integer :> QueryParam "waitForAsset" Bool :> Verb 'POST 200 '[JSON] CreativeResponse -- 'createCreative' route
    :<|> "creative" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "creativeId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteCreative' route
    :<|> "creative" :> "get" :> QueryParam "accountId" Integer :> QueryParam "creativeId" Integer :> Verb 'GET 200 '[JSON] CreativeResponse -- 'getCreative' route
    :<|> "creative" :> "search" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "missionId" Integer :> QueryParam "keyword" Text :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] [CreativeResponse] -- 'getCreativesByApplication' route
    :<|> "creative" :> "removepreview" :> QueryParam "accountId" Integer :> QueryParam "creativeId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'removePreview' route
    :<|> "creative" :> "update" :> QueryParam "accountId" Integer :> QueryParam "creativeId" Integer :> QueryParam "name" Text :> QueryParam "description" Text :> QueryParam "assetImageId" Integer :> QueryParam "action" Text :> QueryParam "data" Text :> QueryParam "suffix" Text :> QueryParam "type" Text :> QueryParam "balance" Double :> QueryParam "active" Bool :> QueryParam "referenceId" Integer :> QueryParam "appVersion" Text :> QueryParam "missionId" Integer :> Verb 'POST 200 '[JSON] CreativeResponse -- 'updateCreative' route
    :<|> "cargo" :> "dependent" :> Capture "accountId" Integer :> ReqBody '[JSON] Account :> Verb 'PUT 200 '[JSON] SirqulResponse -- 'create' route
    :<|> "cargo" :> "dependent" :> Capture "accountId" Integer :> Verb 'GET 200 '[JSON] SirqulResponse -- 'getDependents' route
    :<|> "cargo" :> "dependent" :> Capture "accountId" Integer :> Verb 'DELETE 200 '[JSON] NoContent -- 'removeDependent' route
    :<|> "disbursement" :> "check" :> QueryParam "disbursementId" Integer :> Verb 'GET 200 '[JSON] DisbursementResponse -- 'checkDisbursements' route
    :<|> "disbursement" :> "create" :> QueryParam "accountId" Integer :> QueryParam "receiverAccountId" Integer :> QueryParam "originalSenderAccountId" Integer :> QueryParam "amount" Double :> QueryParam "provider" Text :> QueryParam "scheduledDate" Integer :> QueryParam "title" Text :> QueryParam "comment" Text :> QueryParam "externalId" Text :> QueryParam "introspectionParams" Text :> Verb 'POST 200 '[JSON] DisbursementResponse -- 'createDisbursement' route
    :<|> "disbursement" :> "get" :> QueryParam "accountId" Integer :> QueryParam "disbursementId" Integer :> Verb 'GET 200 '[JSON] DisbursementResponse -- 'getDisbursement' route
    :<|> "disbursement" :> "search" :> QueryParam "accountId" Integer :> QueryParam "receiverAccountId" Integer :> QueryParam "statuses" Text :> QueryParam "providers" Text :> QueryParam "beforeDate" Integer :> QueryParam "afterDate" Integer :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "activeOnly" Bool :> QueryParam "externalId" Text :> Verb 'GET 200 '[JSON] [DisbursementResponse] -- 'searchDisbursements' route
    :<|> "disbursement" :> "update" :> QueryParam "accountId" Integer :> QueryParam "disbursementId" Integer :> QueryParam "amount" Double :> QueryParam "provider" Text :> QueryParam "scheduledDate" Integer :> QueryParam "title" Text :> QueryParam "comment" Text :> QueryParam "externalId" Text :> QueryParam "retry" Bool :> QueryParam "introspectionParams" Text :> Verb 'POST 200 '[JSON] DisbursementResponse -- 'updateDisbursement' route
    :<|> "employee" :> "assign" :> QueryParam "accountId" Integer :> QueryParam "managerAccountId" Integer :> QueryParam "employeeAccountId" Integer :> QueryParam "role" Text :> Verb 'POST 200 '[JSON] EmployeeResponse -- 'assignEmployee' route
    :<|> "employee" :> "assignToLocation" :> QueryParam "accountId" Integer :> QueryParam "employeeAccountId" Integer :> QueryParam "retailerLocationId" Integer :> QueryParam "assign" Bool :> Verb 'POST 200 '[JSON] SirqulResponse -- 'assignToLocationEmployee' route
    :<|> "employee" :> "create" :> QueryParam "accountId" Integer :> QueryParam "managerAccountId" Integer :> QueryParam "username" Text :> QueryParam "password" Text :> QueryParam "name" Text :> QueryParam "prefixName" Text :> QueryParam "firstName" Text :> QueryParam "middleName" Text :> QueryParam "lastName" Text :> QueryParam "suffixName" Text :> QueryParam "title" Text :> QueryParam "aboutUs" Text :> QueryParam "assetId" Integer :> QueryParam "gender" Text :> QueryParam "homePhone" Text :> QueryParam "cellPhone" Text :> QueryParam "cellPhoneCarrier" Text :> QueryParam "businessPhone" Text :> QueryParam "emailAddress" Text :> QueryParam "streetAddress" Text :> QueryParam "streetAddress2" Text :> QueryParam "city" Text :> QueryParam "state" Text :> QueryParam "zipcode" Text :> QueryParam "country" Text :> QueryParam "role" Text :> QueryParam "retailerLocationIds" Text :> QueryParam "settingsAppKey" Text :> QueryParam "appBlob" Text :> QueryParam "assignedDeviceId" Text :> Verb 'POST 200 '[JSON] EmployeeResponse -- 'createEmployee' route
    :<|> "employee" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "employeeAccountId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteEmployee' route
    :<|> "employee" :> "get" :> QueryParam "accountId" Integer :> QueryParam "employeeAccountId" Integer :> QueryParam "settingsAppKey" Text :> Verb 'POST 200 '[JSON] EmployeeResponse -- 'getEmployee' route
    :<|> "employee" :> "search" :> QueryParam "accountId" Integer :> QueryParam "role" Text :> QueryParam "retailerId" Integer :> QueryParam "retailerLocationId" Integer :> QueryParam "q" Text :> QueryParam "keyword" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "_i" Int :> QueryParam "start" Int :> QueryParam "_l" Int :> QueryParam "limit" Int :> QueryParam "activeOnly" Bool :> QueryParam "managedOnly" Bool :> QueryParam "settingsAppKey" Text :> QueryParam "categoryIds" Text :> QueryParam "query" Text :> Verb 'POST 200 '[JSON] [EmployeeResponse] -- 'searchEmployees' route
    :<|> "employee" :> "unassign" :> QueryParam "accountId" Integer :> QueryParam "employeeAccountId" Integer :> Verb 'POST 200 '[JSON] EmployeeResponse -- 'unassignEmployee' route
    :<|> "employee" :> "update" :> QueryParam "accountId" Integer :> QueryParam "employeeAccountId" Integer :> QueryParam "managerAccountId" Integer :> QueryParam "name" Text :> QueryParam "prefixName" Text :> QueryParam "firstName" Text :> QueryParam "middleName" Text :> QueryParam "lastName" Text :> QueryParam "suffixName" Text :> QueryParam "title" Text :> QueryParam "assetId" Integer :> QueryParam "gender" Text :> QueryParam "homePhone" Text :> QueryParam "cellPhone" Text :> QueryParam "cellPhoneCarrier" Text :> QueryParam "businessPhone" Text :> QueryParam "emailAddress" Text :> QueryParam "streetAddress" Text :> QueryParam "streetAddress2" Text :> QueryParam "city" Text :> QueryParam "state" Text :> QueryParam "zipcode" Text :> QueryParam "country" Text :> QueryParam "role" Text :> QueryParam "active" Bool :> QueryParam "password" Text :> QueryParam "retailerLocationIds" Text :> QueryParam "settingsAppKey" Text :> QueryParam "appBlob" Text :> QueryParam "assignedDeviceId" Text :> Verb 'POST 200 '[JSON] EmployeeResponse -- 'updateEmployee' route
    :<|> "event" :> "attend" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "listingId" Integer :> QueryParam "retailerLocationId" Integer :> QueryParam "offerLocationId" Integer :> QueryParam "transactionId" Integer :> QueryParam "status" Int :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] OfferResponse -- 'attendEvent' route
    :<|> "event" :> "create" :> QueryParam "accountId" Integer :> QueryParam "retailerLocationIds" Text :> QueryParam "title" Text :> QueryParam "subTitle" Text :> QueryParam "details" Text :> QueryParam "categoryIds" Text :> QueryParam "filterIds" Text :> QueryParam "active" Bool :> QueryParam "imageAssetId" Integer :> QueryParam "redeemableStart" Integer :> QueryParam "redeemableEnd" Integer :> QueryParam "metaData" Text :> Verb 'POST 200 '[JSON] OfferResponse -- 'createEvent' route
    :<|> "event" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "eventId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteEvent' route
    :<|> "event" :> "get" :> QueryParam "accountId" Integer :> QueryParam "eventId" Integer :> Verb 'GET 200 '[JSON] OfferResponse -- 'getEvent' route
    :<|> "event" :> "attendance" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "keyword" Text :> QueryParam "retailerId" Integer :> QueryParam "retailerLocationId" Integer :> QueryParam "excludeRetailerLocationId" Integer :> QueryParam "listingId" Integer :> QueryParam "offerId" Integer :> QueryParam "offerLocationId" Integer :> QueryParam "customerAccountIds" Text :> QueryParam "affiliatedCategoryIds" Text :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "statuses" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] [EventAttendanceResponse] -- 'searchEventTransactions' route
    :<|> "event" :> "search" :> QueryParam "accountId" Integer :> QueryParam "keyword" Text :> QueryParam "activeOnly" Bool :> QueryParam "categoryIds" Text :> QueryParam "filterIds" Text :> QueryParam "offerAudienceIds" Text :> QueryParam "transactionAudienceIds" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] [OfferShortResponse] -- 'searchEvents' route
    :<|> "event" :> "update" :> QueryParam "accountId" Integer :> QueryParam "eventId" Integer :> QueryParam "retailerLocationIds" Text :> QueryParam "title" Text :> QueryParam "subTitle" Text :> QueryParam "details" Text :> QueryParam "categoryIds" Text :> QueryParam "filterIds" Text :> QueryParam "active" Bool :> QueryParam "imageAssetId" Integer :> QueryParam "redeemableStart" Integer :> QueryParam "redeemableEnd" Integer :> Verb 'POST 200 '[JSON] OfferResponse -- 'updateEvent' route
    :<|> "facebook" :> "getfbtoken" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'GET 200 '[JSON] TokenResponse -- 'getToken' route
    :<|> "facebook" :> "graph" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "event" Text :> QueryParam "permissionableType" Text :> QueryParam "permissionableId" Integer :> QueryParam "assetId" Integer :> QueryParam "gameType" Text :> QueryParam "appKey" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] SirqulResponse -- 'graphInterface' route
    :<|> "favorite" :> "create" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "favoritableId" Integer :> QueryParam "favoritableType" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] WrappedResponse -- 'addFavorite' route
    :<|> "favorite" :> "delete" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "favoriteId" Integer :> QueryParam "favoritableId" Integer :> QueryParam "favoritableType" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteFavorite' route
    :<|> "favorite" :> "get" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "favoriteId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'GET 200 '[JSON] WrappedResponse -- 'getFavorite' route
    :<|> "favorite" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "connectionAccountId" Integer :> QueryParam "favoritableType" Text :> QueryParam "secondaryType" Text :> QueryParam "keyword" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "activeOnly" Bool :> QueryParam "returnFullResponse" Bool :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'GET 200 '[JSON] SearchResponse -- 'searchFavorites' route
    :<|> "favorite" :> "whois" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "favoritableId" Integer :> QueryParam "favoritableType" Text :> QueryParam "keyword" Text :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] [AccountResponse] -- 'whoHasFavorited' route
    :<|> "filter" :> "create" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "parentFilterId" Integer :> QueryParam "name" Text :> QueryParam "description" Text :> QueryParam "externalId" Text :> QueryParam "externalType" Text :> QueryParam "active" Bool :> QueryParam "metaData" Text :> Verb 'POST 200 '[JSON] FilterTreeResponse -- 'createFilter' route
    :<|> "filter" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "filterId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteFilter' route
    :<|> "filter" :> "get" :> QueryParam "filterId" Integer :> Verb 'GET 200 '[JSON] FilterTreeResponse -- 'getFilter' route
    :<|> "filter" :> "search" :> QueryParam "accountId" Integer :> QueryParam "keyword" Text :> QueryParam "appKey" Text :> QueryParam "responseGroup" Text :> QueryParam "rootOnly" Bool :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "activeOnly" Bool :> Verb 'GET 200 '[JSON] [FilterResponse] -- 'searchFilters' route
    :<|> "filter" :> "update" :> QueryParam "accountId" Integer :> QueryParam "filterId" Integer :> QueryParam "parentFilterId" Integer :> QueryParam "name" Text :> QueryParam "description" Text :> QueryParam "externalId" Text :> QueryParam "externalType" Text :> QueryParam "active" Bool :> QueryParam "metaData" Text :> Verb 'POST 200 '[JSON] FilterTreeResponse -- 'updateFilter' route
    :<|> "flag" :> "create" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "flagableType" Text :> QueryParam "flagableId" Integer :> QueryParam "flagDescription" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] SirqulResponse -- 'createFlag' route
    :<|> "flag" :> "delete" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "itemBeingFlaggedType" Text :> QueryParam "itemBeingFlaggedId" Integer :> QueryParam "flagableType" Text :> QueryParam "flagableId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteFlag' route
    :<|> "flag" :> "get" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "flagableType" Text :> QueryParam "flagableId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'GET 200 '[JSON] FlagResponse -- 'getFlag' route
    :<|> "flag" :> "threshold" :> "get" :> QueryParam "itemBeingFlaggedType" Text :> QueryParam "appKey" Text :> Verb 'GET 200 '[JSON] CountResponse -- 'getFlagThreshold' route
    :<|> "flag" :> "threshold" :> "update" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "itemBeingFlaggedType" Text :> QueryParam "threshold" Integer :> QueryParam "appKey" Text :> Verb 'POST 200 '[JSON] CountResponse -- 'updateFlagThreshold' route
    :<|> "game" :> "create" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "title" Text :> QueryParam "description" Text :> QueryParam "metaData" Text :> QueryParam "packIds" Text :> QueryParam "includeGameData" Bool :> Verb 'POST 200 '[JSON] GameResponse -- 'createGame' route
    :<|> "game" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "gameId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteGame' route
    :<|> "game" :> "get" :> QueryParam "accountId" Integer :> QueryParam "gameId" Integer :> QueryParam "includeGameData" Bool :> Verb 'GET 200 '[JSON] GameResponse -- 'getGame' route
    :<|> "game" :> "search" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "keyword" Text :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "appVersion" Text :> QueryParam "includeGameData" Bool :> QueryParam "includeInactive" Bool :> Verb 'GET 200 '[JSON] GameResponse -- 'searchGames' route
    :<|> "game" :> "update" :> QueryParam "accountId" Integer :> QueryParam "gameId" Integer :> QueryParam "appKey" Text :> QueryParam "title" Text :> QueryParam "description" Text :> QueryParam "metaData" Text :> QueryParam "packIds" Text :> QueryParam "includeGameData" Bool :> Verb 'POST 200 '[JSON] GameResponse -- 'updateGame' route
    :<|> "level" :> "create" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "name" Text :> QueryParam "description" Text :> QueryParam "difficulty" Text :> QueryParam "appVersion" Text :> QueryParam "assetImageId" Integer :> QueryParam "assetIconId" Integer :> QueryParam "gameData" Text :> QueryParam "gameDataSuffix" Text :> QueryParam "visibility" Text :> QueryParam "friendGroup" Bool :> QueryParam "connectionIds" Text :> QueryParam "connectionGroupIds" Text :> QueryParam "balance" Double :> QueryParam "active" Bool :> QueryParam "allocateTickets" Bool :> QueryParam "ticketCount" Integer :> QueryParam "ticketType" Text :> QueryParam "points" Integer :> QueryParam "tutorialTitle" Text :> QueryParam "tutorialMessage" Text :> QueryParam "tutorialAlignment" Text :> QueryParam "tutorialImageAssetId" Integer :> QueryParam "offerId" Integer :> QueryParam "metaData" Text :> Verb 'POST 200 '[JSON] GameLevelResponse -- 'createGameLevel' route
    :<|> "level" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "levelId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteGameLevel' route
    :<|> "level" :> "get" :> QueryParam "accountId" Integer :> QueryParam "levelId" Integer :> QueryParam "includeGameData" Bool :> Verb 'GET 200 '[JSON] GameLevelResponse -- 'getGameLevel' route
    :<|> "level" :> "search" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "keyword" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "appVersion" Text :> QueryParam "includeGameData" Bool :> QueryParam "filters" Text :> Verb 'GET 200 '[JSON] GameLevelListResponse -- 'getGameLevelsByApplication' route
    :<|> "level" :> "searchByBillableEntity" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "keyword" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "activeOnly" Bool :> QueryParam "start" Integer :> QueryParam "limit" Integer :> Verb 'GET 200 '[JSON] GameLevelResponse -- 'getGameLevelsByBillableEntity' route
    :<|> "level" :> "questions" :> "get" :> QueryParam "levelId" Integer :> QueryParam "accountId" Integer :> Verb 'GET 200 '[JSON] QuestionResponse -- 'getQuestionsInLevel' route
    :<|> "level" :> "words" :> "get" :> QueryParam "levelId" Integer :> QueryParam "accountId" Integer :> Verb 'GET 200 '[JSON] WordzWordResponse -- 'getWordsInLevel' route
    :<|> "level" :> "update" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "levelId" Integer :> QueryParam "name" Text :> QueryParam "description" Text :> QueryParam "difficulty" Text :> QueryParam "appVersion" Text :> QueryParam "assetImageId" Integer :> QueryParam "assetIconId" Integer :> QueryParam "gameData" Text :> QueryParam "gameDataSuffix" Text :> QueryParam "visibility" Text :> QueryParam "friendGroup" Bool :> QueryParam "connectionIds" Text :> QueryParam "connectionGroupIds" Text :> QueryParam "balance" Double :> QueryParam "active" Bool :> QueryParam "allocateTickets" Bool :> QueryParam "ticketCount" Integer :> QueryParam "ticketType" Text :> QueryParam "points" Integer :> QueryParam "tutorialTitle" Text :> QueryParam "tutorialMessage" Text :> QueryParam "tutorialAlignment" Text :> QueryParam "tutorialImageAssetId" Integer :> QueryParam "offerId" Integer :> QueryParam "metaData" Text :> Verb 'POST 200 '[JSON] GameLevelResponse -- 'updateGameLevel' route
    :<|> "level" :> "questions" :> "update" :> QueryParam "levelId" Integer :> QueryParam "accountId" Integer :> QueryParam "questionIds" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'updateQuestionsInLevel' route
    :<|> "level" :> "words" :> "update" :> QueryParam "levelId" Integer :> QueryParam "accountId" Integer :> QueryParam "wordIds" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'updateWordsInLevel' route
    :<|> "invite" :> "accept" :> QueryParam "token" Text :> QueryParam "accountId" Integer :> QueryParam "albumId" Integer :> QueryParam "missionId" Integer :> QueryParam "albumContestId" Integer :> QueryParam "offerId" Integer :> QueryParam "offerLocationId" Integer :> QueryParam "retailerLocationId" Integer :> QueryParam "appKey" Text :> QueryParam "autoFriend" Bool :> QueryParam "autoAttendEvent" Bool :> QueryParam "autoFavoriteOffer" Bool :> QueryParam "autoFavoriteOfferLocation" Bool :> QueryParam "autoFavoriteRetailerLocation" Bool :> Verb 'POST 200 '[JSON] ConsumerInviteResponse -- 'acceptInvite' route
    :<|> "invite" :> "albumContest" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appId" Integer :> QueryParam "appKey" Text :> QueryParam "albumContestId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] InviteResponse -- 'albumContestInvite' route
    :<|> "invite" :> "album" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appId" Integer :> QueryParam "appKey" Text :> QueryParam "albumId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] InviteResponse -- 'albumInvite' route
    :<|> "invite" :> "event" :> QueryParam "accountId" Integer :> QueryParam "receiverAccountIds" Text :> QueryParam "appKey" Text :> QueryParam "listingId" Integer :> QueryParam "retailerLocationId" Integer :> Verb 'POST 200 '[JSON] InviteResponse -- 'eventInvite' route
    :<|> "invite" :> "gameLevel" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appId" Integer :> QueryParam "appKey" Text :> QueryParam "gameLevelId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] InviteResponse -- 'gameInvite' route
    :<|> "invite" :> "get" :> QueryParam "accountId" Integer :> QueryParam "token" Text :> QueryParam "albumId" Integer :> QueryParam "missionId" Integer :> QueryParam "albumContestId" Integer :> QueryParam "offerId" Integer :> QueryParam "offerLocationId" Integer :> QueryParam "retailerLocationId" Integer :> QueryParam "appKey" Text :> Verb 'GET 200 '[JSON] SirqulResponse -- 'getInvite' route
    :<|> "invite" :> "mission" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appId" Integer :> QueryParam "appKey" Text :> QueryParam "missionId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] InviteResponse -- 'missionInvite' route
    :<|> "invite" :> "offer" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "offerId" Integer :> Verb 'POST 200 '[JSON] InviteResponse -- 'offerInvite' route
    :<|> "invite" :> "offerLocation" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "offerLocationId" Integer :> Verb 'POST 200 '[JSON] InviteResponse -- 'offerLocationInvite' route
    :<|> "invite" :> "retailerLocation" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "retailerLocationId" Integer :> QueryParam "albumId" Integer :> Verb 'POST 200 '[JSON] InviteResponse -- 'retailerLocationInvite' route
    :<|> "leaderboard" :> "create" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "rankType" Text :> QueryParam "leaderboardMode" Text :> QueryParam "iconMedia" FilePath :> QueryParam "iconAssetId" Integer :> QueryParam "bannerMedia" FilePath :> QueryParam "bannerAssetId" Integer :> QueryParam "limitation" Int :> QueryParam "sortField" Text :> QueryParam "title" Text :> QueryParam "description" Text :> QueryParam "metaData" Text :> Verb 'POST 200 '[JSON] LeaderboardResponse -- 'createLeaderboard' route
    :<|> "leaderboard" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "leaderboardId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteLeaderboard' route
    :<|> "leaderboard" :> "get" :> QueryParam "accountId" Integer :> QueryParam "leaderboardId" Integer :> QueryParam "includeFullRankingList" Bool :> Verb 'GET 200 '[JSON] LeaderboardResponse -- 'getLeaderboard' route
    :<|> "leaderboard" :> "search" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "globalOnly" Bool :> QueryParam "keyword" Text :> QueryParam "leaderboardIds" Text :> QueryParam "rankTypes" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "includeInactive" Bool :> QueryParam "includeAppResponse" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] LeaderboardResponse -- 'searchLeaderboards' route
    :<|> "leaderboard" :> "update" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "leaderboardId" Integer :> QueryParam "rankType" Text :> QueryParam "leaderboardMode" Text :> QueryParam "sortField" Text :> QueryParam "iconMedia" FilePath :> QueryParam "iconAssetId" Integer :> QueryParam "bannerMedia" FilePath :> QueryParam "bannerAssetId" Integer :> QueryParam "limitation" Int :> QueryParam "active" Bool :> QueryParam "title" Text :> QueryParam "description" Text :> QueryParam "metaData" Text :> Verb 'POST 200 '[JSON] LeaderboardResponse -- 'updateLeaderboard' route
    :<|> "like" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "likableType" Text :> QueryParam "likableId" Integer :> QueryParam "permissionableType" Text :> QueryParam "permissionableId" Integer :> QueryParam "like" Bool :> QueryParam "app" Text :> QueryParam "gameType" Text :> QueryParam "appKey" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] LikableResponse -- 'registerLike' route
    :<|> "like" :> "delete" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "likableType" Text :> QueryParam "likableId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] LikableResponse -- 'removeLike' route
    :<|> "like" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "connectionAccountIds" Text :> QueryParam "likableType" Text :> QueryParam "likableId" Integer :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "updatedSince" Integer :> QueryParam "updatedBefore" Integer :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] SearchResponse -- 'searchLikes' route
    :<|> "listing" :> "create" :> QueryParam "accountId" Integer :> QueryParam "name" Text :> QueryParam "filterIds" Text :> QueryParam "description" Text :> QueryParam "start" Integer :> QueryParam "end" Integer :> QueryParam "locationName" Text :> QueryParam "locationDescription" Text :> QueryParam "isPrivate" Bool :> QueryParam "externalId" Text :> QueryParam "externalId2" Text :> QueryParam "externalGroupId" Text :> QueryParam "active" Bool :> QueryParam "metaData" Text :> Verb 'POST 200 '[JSON] ListingFullResponse -- 'createListing' route
    :<|> "listing" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "listingId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteListing' route
    :<|> "listing" :> "get" :> QueryParam "listingId" Integer :> Verb 'GET 200 '[JSON] ListingFullResponse -- 'getListing' route
    :<|> "listing" :> "search" :> QueryParam "accountId" Integer :> QueryParam "keyword" Text :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "activeOnly" Bool :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "categoryIds" Text :> QueryParam "filterIds" Text :> QueryParam "useListingOrderIds" Bool :> QueryParam "externalId" Text :> QueryParam "externalId2" Text :> QueryParam "externalGroupId" Text :> Verb 'GET 200 '[JSON] [ListingResponse] -- 'searchListing' route
    :<|> "listing" :> "summary" :> QueryParam "accountId" Integer :> QueryParam "startDate" Integer :> QueryParam "categoryIds" Text :> QueryParam "daysToInclude" Int :> QueryParam "useListingOrderIds" Bool :> Verb 'GET 200 '[JSON] [ListingGroupResponse] -- 'summaryListing' route
    :<|> "listing" :> "update" :> QueryParam "accountId" Integer :> QueryParam "listingId" Integer :> QueryParam "filterIds" Text :> QueryParam "name" Text :> QueryParam "description" Text :> QueryParam "start" Integer :> QueryParam "end" Integer :> QueryParam "locationName" Text :> QueryParam "locationDescription" Text :> QueryParam "isPrivate" Bool :> QueryParam "externalId" Text :> QueryParam "externalId2" Text :> QueryParam "externalGroupId" Text :> QueryParam "active" Bool :> QueryParam "metaData" Text :> Verb 'POST 200 '[JSON] ListingFullResponse -- 'updateListing' route
    :<|> "location" :> "trilaterate" :> "cache" :> QueryParam "udid" Text :> QueryParam "sourceTime" Integer :> QueryParam "minimumSampleSize" Int :> QueryParam "data" Text :> QueryParam "dataFile" FilePath :> Verb 'POST 200 '[JSON] SirqulResponse -- 'cacheTrilaterationData' route
    :<|> "location" :> "trilaterate" :> "cache" :> "submit" :> ReqBody '[JSON] TrilatCacheRequest :> Verb 'POST 200 '[JSON] SirqulResponse -- 'cacheTrilaterationDataGzip' route
    :<|> "location" :> "ip" :> QueryParam "ip" Text :> Verb 'GET 200 '[JSON] CoordsResponse -- 'getLocationByIp' route
    :<|> "account" :> "location" :> "trilaterate" :> QueryParam "accountId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "data" Text :> QueryParam "responseFilters" Text :> Verb 'GET 200 '[JSON] GeoPointResponse -- 'getLocationByTrilateration' route
    :<|> "location" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "currentlatitude" Double :> QueryParam "currentlongitude" Double :> QueryParam "currentLatitude" Double :> QueryParam "currentLongitude" Double :> QueryParam "query" Text :> QueryParam "zipcode" Text :> QueryParam "zipCode" Text :> QueryParam "selectedMaplatitude" Double :> QueryParam "selectedMaplongitude" Double :> QueryParam "selectedMapLatitude" Double :> QueryParam "selectedMapLongitude" Double :> QueryParam "searchRange" Double :> QueryParam "useGeocode" Bool :> QueryParam "_i" Int :> QueryParam "start" Int :> QueryParam "_l" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] LocationSearchResponse -- 'getLocations' route
    :<|> "location" :> ReqBody '[JSON] Location :> Verb 'POST 200 '[JSON] SirqulResponse -- 'createLocationV2' route
    :<|> "location" :> Capture "id" Integer :> ReqBody '[JSON] Location :> Verb 'POST 200 '[JSON] SirqulResponse -- 'updateLocationV2' route
    :<|> "media" :> "create" :> QueryParam "accountId" Integer :> QueryParam "retailerLocationIds" Text :> QueryParam "title" Text :> QueryParam "subTitle" Text :> QueryParam "details" Text :> QueryParam "subDetails" Text :> QueryParam "finePrint" Text :> QueryParam "barcodeType" Text :> QueryParam "barcodeEntry" Text :> QueryParam "externalRedeemOptions" Text :> QueryParam "externalUrl" Text :> QueryParam "ticketsRewardType" Text :> QueryParam "ticketsReward" Integer :> QueryParam "activated" Integer :> QueryParam "expires" Integer :> QueryParam "noExpiration" Bool :> QueryParam "availableLimit" Int :> QueryParam "availableLimitPerUser" Int :> QueryParam "addedLimit" Int :> QueryParam "viewLimit" Int :> QueryParam "maxPrints" Int :> QueryParam "ticketPriceType" Text :> QueryParam "ticketPrice" Integer :> QueryParam "fullPrice" Double :> QueryParam "discountPrice" Double :> QueryParam "showRemaining" Bool :> QueryParam "showRedeemed" Bool :> QueryParam "replaced" Bool :> QueryParam "featured" Bool :> QueryParam "specialOfferType" Text :> QueryParam "offerVisibility" Text :> QueryParam "categoryIds" Text :> QueryParam "filterIds" Text :> QueryParam "active" Bool :> QueryParam "barcodeAssetId" Integer :> QueryParam "imageAssetId" Integer :> QueryParam "imageAssetId1" Integer :> QueryParam "imageAssetId2" Integer :> QueryParam "imageAssetId3" Integer :> QueryParam "imageAssetId4" Integer :> QueryParam "imageAssetId5" Integer :> QueryParam "publisher" Text :> QueryParam "redeemableStart" Integer :> QueryParam "redeemableEnd" Integer :> QueryParam "conditionType" Text :> QueryParam "isbn" Text :> QueryParam "asin" Text :> QueryParam "catalogNumbers" Text :> QueryParam "parentalRating" Text :> QueryParam "availabilityDate" Integer :> QueryParam "mediaType" Text :> QueryParam "duration" Int :> QueryParam "author" Text :> QueryParam "releaseDate" Integer :> QueryParam "collectionIds" Text :> QueryParam "availability" Text :> QueryParam "availabilitySummary" Text :> Verb 'POST 200 '[JSON] MediaOfferResponse -- 'createMedia' route
    :<|> "media" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "mediaId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteMedia' route
    :<|> "media" :> "get" :> QueryParam "accountId" Integer :> QueryParam "mediaId" Integer :> Verb 'GET 200 '[JSON] MediaOfferResponse -- 'getMedia' route
    :<|> "media" :> "search" :> QueryParam "accountId" Integer :> QueryParam "keyword" Text :> QueryParam "activeOnly" Bool :> QueryParam "categoryIds" Text :> QueryParam "filterIds" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] [MediaOfferResponse] -- 'searchMedia' route
    :<|> "media" :> "update" :> QueryParam "accountId" Integer :> QueryParam "mediaId" Integer :> QueryParam "retailerLocationIds" Text :> QueryParam "offerLocations" Text :> QueryParam "title" Text :> QueryParam "subTitle" Text :> QueryParam "details" Text :> QueryParam "subDetails" Text :> QueryParam "finePrint" Text :> QueryParam "barcodeType" Text :> QueryParam "barcodeEntry" Text :> QueryParam "externalRedeemOptions" Text :> QueryParam "externalUrl" Text :> QueryParam "ticketsRewardType" Text :> QueryParam "ticketsReward" Integer :> QueryParam "activated" Integer :> QueryParam "expires" Integer :> QueryParam "noExpiration" Bool :> QueryParam "availableLimit" Int :> QueryParam "availableLimitPerUser" Int :> QueryParam "addedLimit" Int :> QueryParam "viewLimit" Int :> QueryParam "maxPrints" Int :> QueryParam "ticketPriceType" Text :> QueryParam "ticketPrice" Integer :> QueryParam "fullPrice" Double :> QueryParam "discountPrice" Double :> QueryParam "showRemaining" Bool :> QueryParam "showRedeemed" Bool :> QueryParam "replaced" Bool :> QueryParam "featured" Bool :> QueryParam "specialOfferType" Text :> QueryParam "offerVisibility" Text :> QueryParam "categoryIds" Text :> QueryParam "filterIds" Text :> QueryParam "active" Bool :> QueryParam "barcodeAssetId" Integer :> QueryParam "imageAssetId" Integer :> QueryParam "imageAssetId1" Integer :> QueryParam "imageAssetId2" Integer :> QueryParam "imageAssetId3" Integer :> QueryParam "imageAssetId4" Integer :> QueryParam "imageAssetId5" Integer :> QueryParam "publisher" Text :> QueryParam "redeemableStart" Integer :> QueryParam "redeemableEnd" Integer :> QueryParam "conditionType" Text :> QueryParam "isbn" Text :> QueryParam "asin" Text :> QueryParam "catalogNumbers" Text :> QueryParam "availabilityDate" Integer :> QueryParam "parentalRating" Text :> QueryParam "mediaType" Text :> QueryParam "duration" Int :> QueryParam "author" Text :> QueryParam "releaseDate" Integer :> QueryParam "collectionIds" Text :> QueryParam "availability" Text :> QueryParam "availabilitySummary" Text :> Verb 'POST 200 '[JSON] MediaOfferResponse -- 'updateMedia' route
    :<|> "mission" :> "create" :> QueryParam "accountId" Integer :> QueryParam "title" Text :> QueryParam "description" Text :> QueryParam "subType" Text :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "active" Bool :> QueryParam "gameLevelIds" Text :> QueryParam "creativeIds" Text :> QueryParam "audienceIds" Text :> QueryParam "missionTask" Text :> QueryParam "formatType" Text :> QueryParam "offerId" Integer :> QueryParam "balance" Double :> QueryParam "advancedReporting" Bool :> QueryParam "allocateTickets" Bool :> QueryParam "ticketCount" Integer :> QueryParam "ticketType" Text :> QueryParam "points" Integer :> QueryParam "metaData" Text :> QueryParam "applicationIds" Text :> QueryParam "devices" Text :> QueryParam "deviceIds" Text :> QueryParam "deviceVersions" Text :> QueryParam "locations" Text :> QueryParam "radius" Text :> Verb 'POST 200 '[JSON] MissionResponse -- 'createMission' route
    :<|> "mission" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "missionId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteMission' route
    :<|> "mission" :> "find" :> QueryParam "appKey" Text :> QueryParam "suffix" Text :> QueryParam "type" Text :> QueryParam "accountId" Integer :> QueryParam "appVersion" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "device" Text :> QueryParam "deviceIdentifier" Integer :> QueryParam "deviceVersion" Text :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "includeGameData" Bool :> QueryParam "includeAudiences" Bool :> QueryParam "allocatesTickets" Bool :> QueryParam "randomize" Bool :> QueryParam "targetedAdsOnly" Bool :> QueryParam "missionIds" Text :> QueryParam "audienceOperator" Text :> Verb 'GET 200 '[JSON] MissionResponse -- 'findMissions' route
    :<|> "mission" :> "get" :> QueryParam "accountId" Integer :> QueryParam "missionId" Integer :> QueryParam "returnCreative" Bool :> Verb 'GET 200 '[JSON] MissionResponse -- 'getMission' route
    :<|> "mission" :> "import" :> QueryParam "accountId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "keyword" Text :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "appKey" Text :> QueryParam "adSize" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'importMission' route
    :<|> "mission" :> "format" :> "search" :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "activeOnly" Bool :> Verb 'GET 200 '[JSON] [MissionFormatResponse] -- 'searchMissionFormats' route
    :<|> "mission" :> "search" :> QueryParam "accountId" Integer :> QueryParam "keyword" Text :> QueryParam "subType" Text :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "includeGameData" Bool :> QueryParam "includeAudiences" Bool :> QueryParam "includeInactive" Bool :> QueryParam "suffix" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> Verb 'GET 200 '[JSON] [MissionResponse] -- 'searchMissions' route
    :<|> "mission" :> "searchByBillableEntity" :> QueryParam "accountId" Integer :> QueryParam "keyword" Text :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "includeGameData" Bool :> QueryParam "includeAudiences" Bool :> QueryParam "includeInactive" Bool :> QueryParam "suffix" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> Verb 'GET 200 '[JSON] [MissionResponse] -- 'searchMissionsByBillableEntity' route
    :<|> "mission" :> "update" :> QueryParam "accountId" Integer :> QueryParam "missionId" Integer :> QueryParam "title" Text :> QueryParam "description" Text :> QueryParam "subType" Text :> QueryParam "metaData" Text :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "active" Bool :> QueryParam "gameLevelIds" Text :> QueryParam "creativeIds" Text :> QueryParam "audienceIds" Text :> QueryParam "offerId" Integer :> QueryParam "balance" Double :> QueryParam "advancedReporting" Bool :> QueryParam "allocateTickets" Bool :> QueryParam "ticketCount" Integer :> QueryParam "ticketType" Text :> QueryParam "points" Integer :> QueryParam "applicationIds" Text :> QueryParam "devices" Text :> QueryParam "deviceIds" Text :> QueryParam "deviceVersions" Text :> QueryParam "locations" Text :> QueryParam "radius" Text :> Verb 'POST 200 '[JSON] MissionResponse -- 'updateMission' route
    :<|> "mission" :> "invite" :> "create" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "missionId" Integer :> QueryParam "joinCode" Text :> QueryParam "includeGameData" Bool :> Verb 'POST 200 '[JSON] MissionResponse -- 'createMissionInvite' route
    :<|> "mission" :> "invite" :> "delete" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "missionId" Integer :> QueryParam "missionInviteId" Integer :> QueryParam "includeGameData" Bool :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteMissionInvite' route
    :<|> "mission" :> "invite" :> "get" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "missionId" Integer :> QueryParam "missionInviteId" Integer :> QueryParam "includeGameData" Bool :> QueryParam "includeScores" Text :> Verb 'GET 200 '[JSON] MissionResponse -- 'getMissionInvite' route
    :<|> "mission" :> "invite" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "appVersion" Text :> QueryParam "missionId" Integer :> QueryParam "status" Text :> QueryParam "lastUpdated" Integer :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "keyword" Text :> QueryParam "missionTypes" Text :> QueryParam "filterByBillable" Bool :> QueryParam "includeGameData" Bool :> Verb 'GET 200 '[JSON] [MissionResponse] -- 'searchMissionInvites' route
    :<|> "mission" :> "invite" :> "update" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "missionId" Integer :> QueryParam "missionInviteId" Integer :> QueryParam "packId" Integer :> QueryParam "gameLevelId" Integer :> QueryParam "status" Text :> QueryParam "permissionableType" Text :> QueryParam "permissionableId" Integer :> QueryParam "includeGameData" Bool :> Verb 'POST 200 '[JSON] MissionResponse -- 'updateMissionInvite' route
    :<|> "note" :> "batch" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "notableId" Integer :> QueryParam "notableType" Text :> QueryParam "batchOperation" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'batchOperation' route
    :<|> "note" :> "create" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "notableType" Text :> QueryParam "notableId" Integer :> QueryParam "comment" Text :> QueryParam "noteType" Text :> QueryParam "assetIds" Text :> QueryParam "tags" Text :> QueryParam "permissionableType" Text :> QueryParam "permissionableId" Integer :> QueryParam "appKey" Text :> QueryParam "locationDescription" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "metaData" Text :> QueryParam "receiverAccountIds" Text :> QueryParam "returnFullResponse" Bool :> QueryParam "initializeAsset" Bool :> QueryParam "assetReturnNulls" Bool :> QueryParam "assetAlbumId" Integer :> QueryParam "assetCollectionId" Integer :> QueryParam "assetAddToDefaultAlbum" Text :> QueryParam "assetAddToMediaLibrary" Bool :> QueryParam "assetVersionCode" Int :> QueryParam "assetVersionName" Text :> QueryParam "assetMetaData" Text :> QueryParam "assetCaption" Text :> QueryParam "assetMedia" FilePath :> QueryParam "assetMediaUrl" Text :> QueryParam "assetMediaString" Text :> QueryParam "assetMediaStringFileName" Text :> QueryParam "assetMediaStringContentType" Text :> QueryParam "assetAttachedMedia" FilePath :> QueryParam "assetAttachedMediaUrl" Text :> QueryParam "assetAttachedMediaString" Text :> QueryParam "assetAttachedMediaStringFileName" Text :> QueryParam "assetAttachedMediaStringContentType" Text :> QueryParam "assetLocationDescription" Text :> QueryParam "assetApp" Text :> QueryParam "assetSearchTags" Text :> QueryParam "assetLatitude" Double :> QueryParam "assetLongitude" Double :> Verb 'POST 200 '[JSON] NoteResponse -- 'createNote' route
    :<|> "note" :> "delete" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "noteId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "appKey" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteNote' route
    :<|> "note" :> "get" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "returnFullResponse" Bool :> QueryParam "noteId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'getNote' route
    :<|> "note" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "notableType" Text :> QueryParam "notableId" Integer :> QueryParam "noteTypes" Text :> QueryParam "appKey" Text :> QueryParam "keyword" Text :> QueryParam "flagCountMinimum" Integer :> QueryParam "flagsExceedThreshold" Bool :> QueryParam "includeInactive" Bool :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "returnFullResponse" Bool :> QueryParam "updatedSince" Integer :> QueryParam "updatedBefore" Integer :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'POST 200 '[JSON] [NoteResponse] -- 'searchNotes' route
    :<|> "note" :> "update" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "noteId" Integer :> QueryParam "comment" Text :> QueryParam "noteType" Text :> QueryParam "assetIds" Text :> QueryParam "tags" Text :> QueryParam "permissionableType" Text :> QueryParam "permissionableId" Integer :> QueryParam "appKey" Text :> QueryParam "locationDescription" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "metaData" Text :> QueryParam "returnFullResponse" Bool :> QueryParam "active" Bool :> QueryParam "updateAsset" Bool :> QueryParam "assetReturnNulls" Bool :> QueryParam "assetAlbumId" Integer :> QueryParam "assetCollectionId" Integer :> QueryParam "assetAddToDefaultAlbum" Text :> QueryParam "assetAddToMediaLibrary" Bool :> QueryParam "assetVersionCode" Int :> QueryParam "assetVersionName" Text :> QueryParam "assetMetaData" Text :> QueryParam "assetCaption" Text :> QueryParam "assetMedia" FilePath :> QueryParam "assetMediaUrl" Text :> QueryParam "assetMediaString" Text :> QueryParam "assetMediaStringFileName" Text :> QueryParam "assetMediaStringContentType" Text :> QueryParam "assetAttachedMedia" FilePath :> QueryParam "assetAttachedMediaUrl" Text :> QueryParam "assetAttachedMediaString" Text :> QueryParam "assetAttachedMediaStringFileName" Text :> QueryParam "assetAttachedMediaStringContentType" Text :> QueryParam "assetLocationDescription" Text :> QueryParam "assetApp" Text :> QueryParam "assetSearchTags" Text :> QueryParam "assetLatitude" Double :> QueryParam "assetLongitude" Double :> Verb 'POST 200 '[JSON] NoteResponse -- 'updateNote' route
    :<|> "notification" :> "template" :> "create" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "event" Text :> QueryParam "conduit" Text :> QueryParam "title" Text :> QueryParam "body" Text :> QueryParam "tags" Text :> Verb 'POST 200 '[JSON] NotificationTemplateResponse -- 'createNotificationTemplate' route
    :<|> "notification" :> "blocked" :> "batch" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "data" Text :> Verb 'POST 200 '[JSON] BlockedNotificationResponse -- 'createOrUpdateBlockedNotifications' route
    :<|> "notification" :> "template" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "notificationTemplateId" Integer :> Verb 'POST 200 '[JSON] NotificationTemplateResponse -- 'deleteNotificationTemplate' route
    :<|> "notification" :> "template" :> "get" :> QueryParam "accountId" Integer :> QueryParam "notificationTemplateId" Integer :> Verb 'GET 200 '[JSON] NotificationTemplateResponse -- 'getNotificationTemplate' route
    :<|> "notification" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "connectionAccountId" Integer :> QueryParam "appKey" Text :> QueryParam "eventType" Text :> QueryParam "contentIds" Text :> QueryParam "contentTypes" Text :> QueryParam "parentIds" Text :> QueryParam "parentTypes" Text :> QueryParam "actionCategory" Text :> QueryParam "conduits" Text :> QueryParam "keyword" Text :> QueryParam "returnReadMessages" Bool :> QueryParam "markAsRead" Bool :> QueryParam "fromDate" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "returnSent" Bool :> QueryParam "ignoreFlagged" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] NotificationMessageListResponse -- 'getNotifications' route
    :<|> "notification" :> "token" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "token" Text :> QueryParam "pushType" Text :> QueryParam "environment" Text :> QueryParam "appKey" Text :> QueryParam "gameType" Text :> QueryParam "active" Bool :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] SirqulResponse -- 'registerNotificationToken' route
    :<|> "notification" :> "blocked" :> "search" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "searchTags" Text :> QueryParam "events" Text :> QueryParam "conduits" Text :> QueryParam "customTypes" Text :> QueryParam "contentTypes" Text :> QueryParam "contentIds" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] BlockedNotificationResponse -- 'searchBlockedNotifications' route
    :<|> "notification" :> "template" :> "search" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "event" Text :> QueryParam "conduit" Text :> QueryParam "globalOnly" Bool :> QueryParam "reservedOnly" Bool :> QueryParam "keyword" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] NotificationTemplateResponse -- 'searchNotificationTemplate' route
    :<|> "notification" :> "recipient" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "conduit" Text :> QueryParam "keyword" Text :> QueryParam "audienceId" Integer :> QueryParam "audienceIds" Text :> QueryParam "connectionGroupIds" Text :> QueryParam "recipientAccountIds" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] [NotificationRecipientResponse] -- 'searchRecipients' route
    :<|> "notification" :> "recipient" :> "search" :> "count" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "conduit" Text :> QueryParam "keyword" Text :> QueryParam "audienceId" Integer :> QueryParam "audienceIds" Text :> QueryParam "connectionGroupIds" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] NotificationRecipientResponseListResponse -- 'searchRecipientsCount' route
    :<|> "notification" :> "batch" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "conduit" Text :> QueryParam "customMessage" Text :> QueryParam "contentId" Integer :> QueryParam "contentName" Text :> QueryParam "contentType" Text :> QueryParam "parentId" Integer :> QueryParam "parentType" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'sendBatchNotifications' route
    :<|> "notification" :> "custom" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "receiverAccountIds" Text :> QueryParam "includeFriendGroup" Bool :> QueryParam "appKey" Text :> QueryParam "gameType" Text :> QueryParam "conduit" Text :> QueryParam "contentId" Integer :> QueryParam "contentName" Text :> QueryParam "contentType" Text :> QueryParam "parentId" Integer :> QueryParam "parentType" Text :> QueryParam "actionCategory" Text :> QueryParam "subject" Text :> QueryParam "customMessage" Text :> QueryParam "friendOnlyAPNS" Bool :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] SirqulResponse -- 'sendCustomNotifications' route
    :<|> "notification" :> "template" :> "update" :> QueryParam "accountId" Integer :> QueryParam "notificationTemplateId" Integer :> QueryParam "title" Text :> QueryParam "body" Text :> QueryParam "tags" Text :> Verb 'POST 200 '[JSON] NotificationTemplateResponse -- 'updateNotificationTemplate' route
    :<|> "object" :> "field" :> "add" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "objectName" Text :> QueryParam "fieldName" Text :> QueryParam "fieldType" Text :> Verb 'POST 200 '[JSON] ObjectStoreResponse -- 'addField' route
    :<|> "object" :> "data" :> Capture "objectName" Text :> QueryParam "accountId" Integer :> ReqBody '[JSON] Text :> Verb 'POST 200 '[JSON] ObjectStoreResponse -- 'createData' route
    :<|> "object" :> "create" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "objectName" Text :> Verb 'POST 200 '[JSON] ObjectStoreResponse -- 'createObject' route
    :<|> "object" :> "data" :> Capture "objectName" Text :> Capture "objectId" Text :> QueryParam "accountId" Integer :> Verb 'DELETE 200 '[JSON] ObjectStoreResponse -- 'deleteData' route
    :<|> "object" :> "field" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "objectName" Text :> QueryParam "fieldName" Text :> Verb 'POST 200 '[JSON] ObjectStoreResponse -- 'deleteField' route
    :<|> "object" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "objectName" Text :> Verb 'POST 200 '[JSON] ObjectStoreResponse -- 'deleteObject' route
    :<|> "object" :> "data" :> Capture "objectName" Text :> Capture "objectId" Text :> QueryParam "accountId" Integer :> QueryParam "include" Text :> Verb 'GET 200 '[JSON] ObjectStoreResponse -- 'getData' route
    :<|> "object" :> "get" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "objectName" Text :> Verb 'GET 200 '[JSON] ObjectStoreResponse -- 'getObject' route
    :<|> "object" :> "data" :> Capture "objectName" Text :> QueryParam "accountId" Integer :> QueryParam "criteria" Text :> QueryParam "count" Bool :> QueryParam "start" Integer :> QueryParam "limit" Integer :> QueryParam "order" Text :> QueryParam "include" Text :> Verb 'GET 200 '[JSON] ObjectStoreResponse -- 'searchData' route
    :<|> "object" :> "search" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "keyword" Text :> QueryParam "start" Integer :> QueryParam "limit" Integer :> Verb 'GET 200 '[JSON] ObjectStoreResponse -- 'searchObject' route
    :<|> "object" :> "data" :> Capture "objectName" Text :> Capture "objectId" Text :> QueryParam "accountId" Integer :> ReqBody '[JSON] Text :> Verb 'PUT 200 '[JSON] ObjectStoreResponse -- 'updateData' route
    :<|> "retailer" :> "offer" :> "location" :> "batchUpdate" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "data" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'batchUpdateOfferLocations' route
    :<|> "retailer" :> "offer" :> "create" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "tags" Text :> QueryParam "parentOfferId" Integer :> QueryParam "includeOfferLocations" Bool :> QueryParam "retailerLocationIds" Text :> QueryParam "offerLocations" Text :> QueryParam "title" Text :> QueryParam "subTitle" Text :> QueryParam "details" Text :> QueryParam "subDetails" Text :> QueryParam "finePrint" Text :> QueryParam "barcodeType" Text :> QueryParam "barcodeEntry" Text :> QueryParam "externalRedeemOptions" Text :> QueryParam "externalUrl" Text :> QueryParam "externalId" Text :> QueryParam "ticketsRewardType" Text :> QueryParam "ticketsReward" Integer :> QueryParam "activated" Integer :> QueryParam "expires" Integer :> QueryParam "noExpiration" Bool :> QueryParam "availableLimit" Int :> QueryParam "availableLimitPerUser" Int :> QueryParam "addedLimit" Int :> QueryParam "viewLimit" Int :> QueryParam "maxPrints" Int :> QueryParam "ticketPriceType" Text :> QueryParam "ticketPrice" Integer :> QueryParam "fullPrice" Double :> QueryParam "discountPrice" Double :> QueryParam "showRemaining" Bool :> QueryParam "showRedeemed" Bool :> QueryParam "replaced" Bool :> QueryParam "featured" Bool :> QueryParam "offerType" Text :> QueryParam "specialOfferType" Text :> QueryParam "offerVisibility" Text :> QueryParam "categoryIds" Text :> QueryParam "filterIds" Text :> QueryParam "active" Bool :> QueryParam "barcodeAssetId" Integer :> QueryParam "imageAssetId" Integer :> QueryParam "imageAssetId1" Integer :> QueryParam "imageAssetId2" Integer :> QueryParam "imageAssetId3" Integer :> QueryParam "imageAssetId4" Integer :> QueryParam "imageAssetId5" Integer :> QueryParam "publisher" Text :> QueryParam "redeemableStart" Integer :> QueryParam "redeemableEnd" Integer :> QueryParam "brand" Text :> QueryParam "productType" Text :> QueryParam "conditionType" Text :> QueryParam "isbn" Text :> QueryParam "asin" Text :> QueryParam "catalogNumbers" Text :> QueryParam "department" Text :> QueryParam "features" Text :> QueryParam "minimumPrice" Double :> QueryParam "width" Double :> QueryParam "height" Double :> QueryParam "depth" Double :> QueryParam "weight" Double :> QueryParam "unit" Text :> QueryParam "studio" Text :> QueryParam "parentalRating" Text :> QueryParam "publishDate" Integer :> QueryParam "availabilityDate" Integer :> QueryParam "sizeId" Integer :> QueryParam "listingId" Integer :> QueryParam "mediaType" Text :> QueryParam "duration" Int :> QueryParam "author" Text :> QueryParam "releaseDate" Integer :> QueryParam "collectionIds" Text :> QueryParam "rebootTimeHour" Int :> QueryParam "rebootTimeMinute" Int :> QueryParam "idleTimeoutInSecond" Int :> QueryParam "serialNumber" Text :> QueryParam "udid" Text :> QueryParam "deviceType" Text :> QueryParam "devicePower" Double :> QueryParam "deviceInterference" Double :> QueryParam "availability" Text :> QueryParam "availabilitySummary" Text :> Verb 'POST 200 '[JSON] RetailerOfferResponse -- 'createOffer' route
    :<|> "retailer" :> "offer" :> "delete" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "offerId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteOffer' route
    :<|> "retailer" :> "offer" :> "location" :> "delete" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "offerLocationId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteOfferLocation' route
    :<|> "retailer" :> "offer" :> "get" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "offerId" Integer :> QueryParam "includeOfferLocations" Bool :> Verb 'GET 200 '[JSON] RetailerOfferResponse -- 'getOffer' route
    :<|> "offer" :> "get" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "offerId" Integer :> QueryParam "offerLocationId" Integer :> QueryParam "distance" Double :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "includeOfferLocations" Bool :> QueryParam "includeRetailerLocations" Bool :> QueryParam "includeChildOffers" Bool :> Verb 'GET 200 '[JSON] OfferResponse -- 'getOfferDetails' route
    :<|> "offer" :> "lists" :> "count" :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "searchRange" Double :> QueryParam "distanceUnit" Text :> Verb 'GET 200 '[JSON] ListCountResponse -- 'getOfferListCounts' route
    :<|> "offer" :> "location" :> "get" :> QueryParam "offerLocationId" Integer :> QueryParam "udid" Text :> Verb 'GET 200 '[JSON] OfferShortResponse -- 'getOfferLocation' route
    :<|> "retailer" :> "offer" :> "location" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "keyword" Text :> QueryParam "retailerId" Integer :> QueryParam "retailerLocationId" Integer :> QueryParam "offerType" Text :> QueryParam "specialOfferType" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "activeOnly" Bool :> QueryParam "includeRetailerLocation" Bool :> QueryParam "barcodeType" Text :> QueryParam "barcodeEntry" Text :> QueryParam "isbn" Text :> QueryParam "asin" Text :> QueryParam "deviceStatus" Text :> QueryParam "needsNotificationSent" Bool :> QueryParam "lastNotificationSent" Integer :> Verb 'GET 200 '[JSON] [OfferShortResponse] -- 'getOfferLocationsForRetailers' route
    :<|> "retailer" :> "offer" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "categoryIds" Text :> QueryParam "filterIds" Text :> QueryParam "q" Text :> QueryParam "keyword" Text :> QueryParam "retailerId" Integer :> QueryParam "retailerLocationId" Integer :> QueryParam "couponType" Text :> QueryParam "offerType" Text :> QueryParam "offerTypes" Text :> QueryParam "specialOfferType" Text :> QueryParam "offerVisibility" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "_i" Int :> QueryParam "start" Int :> QueryParam "_l" Int :> QueryParam "limit" Int :> QueryParam "availableOnly" Bool :> QueryParam "activeOnly" Bool :> QueryParam "includeCategories" Bool :> QueryParam "includeFilters" Bool :> QueryParam "includeOfferLocations" Bool :> QueryParam "barcodeType" Text :> QueryParam "barcodeEntry" Text :> QueryParam "isbn" Text :> QueryParam "asin" Text :> QueryParam "deviceStatus" Text :> QueryParam "needsNotificationSent" Bool :> QueryParam "lastNotificationSent" Integer :> Verb 'GET 200 '[JSON] [OfferResponse] -- 'getOffersForRetailers' route
    :<|> "retailer" :> "offer" :> "transaction" :> "update" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "offerTransactionId" Integer :> QueryParam "offerLocationId" Integer :> QueryParam "status" Int :> Verb 'POST 200 '[JSON] SirqulResponse -- 'redeemOfferTransaction' route
    :<|> "retailer" :> "offer" :> "transaction" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "q" Text :> QueryParam "keyword" Text :> QueryParam "retailerId" Integer :> QueryParam "retailerLocationId" Integer :> QueryParam "offerId" Integer :> QueryParam "offerLocationId" Integer :> QueryParam "redeemed" Bool :> QueryParam "reservationsOnly" Bool :> QueryParam "couponType" Text :> QueryParam "offerType" Text :> QueryParam "specialOfferType" Text :> QueryParam "customerAccountIds" Text :> QueryParam "categoryIds" Text :> QueryParam "redeemableStartDate" Integer :> QueryParam "redeemableEndDate" Integer :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "_i" Int :> QueryParam "start" Int :> QueryParam "_l" Int :> QueryParam "limit" Int :> QueryParam "activeOnly" Bool :> Verb 'GET 200 '[JSON] [OfferTransactionResponse] -- 'searchOfferTransactionsForRetailers' route
    :<|> "offer" :> "lists" :> QueryParam "appKey" Text :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "searchRange" Double :> QueryParam "tags" Text :> QueryParam "supportedPostalCodes" Text :> QueryParam "keyword" Text :> QueryParam "categories" Text :> QueryParam "filters" Text :> QueryParam "offerTypes" Text :> QueryParam "type" Text :> QueryParam "sortField" Text :> QueryParam "recommendOfferIds" Text :> QueryParam "recommendationType" Text :> QueryParam "locationId" Integer :> QueryParam "retailerLocationIds" Text :> QueryParam "offerId" Integer :> QueryParam "includeMission" Bool :> QueryParam "includeCategories" Bool :> QueryParam "includeFilters" Bool :> QueryParam "includeExpired" Bool :> QueryParam "includeFavorite" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "maxRecommendations" Int :> QueryParam "distanceUnit" Text :> QueryParam "closestOfferOnly" Bool :> QueryParam "searchExpression" Text :> QueryParam "groupBy" Text :> Verb 'GET 200 '[JSON] OfferListResponse -- 'searchOffersForConsumer' route
    :<|> "offer" :> "top" :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] OfferListResponse -- 'topOfferTransactions' route
    :<|> "retailer" :> "offer" :> "update" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "offerId" Integer :> QueryParam "parentOfferId" Integer :> QueryParam "includeOfferLocations" Bool :> QueryParam "retailerLocationIds" Text :> QueryParam "offerLocations" Text :> QueryParam "tags" Text :> QueryParam "title" Text :> QueryParam "subTitle" Text :> QueryParam "details" Text :> QueryParam "subDetails" Text :> QueryParam "finePrint" Text :> QueryParam "barcodeType" Text :> QueryParam "barcodeEntry" Text :> QueryParam "externalRedeemOptions" Text :> QueryParam "externalUrl" Text :> QueryParam "externalId" Text :> QueryParam "ticketsRewardType" Text :> QueryParam "ticketsReward" Integer :> QueryParam "activated" Integer :> QueryParam "expires" Integer :> QueryParam "noExpiration" Bool :> QueryParam "availableLimit" Int :> QueryParam "availableLimitPerUser" Int :> QueryParam "addedLimit" Int :> QueryParam "viewLimit" Int :> QueryParam "maxPrints" Int :> QueryParam "ticketPriceType" Text :> QueryParam "ticketPrice" Integer :> QueryParam "fullPrice" Double :> QueryParam "discountPrice" Double :> QueryParam "showRemaining" Bool :> QueryParam "showRedeemed" Bool :> QueryParam "replaced" Bool :> QueryParam "featured" Bool :> QueryParam "offerType" Text :> QueryParam "specialOfferType" Text :> QueryParam "offerVisibility" Text :> QueryParam "categoryIds" Text :> QueryParam "filterIds" Text :> QueryParam "active" Bool :> QueryParam "barcodeAssetId" Integer :> QueryParam "imageAssetId" Integer :> QueryParam "imageAssetId1" Integer :> QueryParam "imageAssetId2" Integer :> QueryParam "imageAssetId3" Integer :> QueryParam "imageAssetId4" Integer :> QueryParam "imageAssetId5" Integer :> QueryParam "publisher" Text :> QueryParam "redeemableStart" Integer :> QueryParam "redeemableEnd" Integer :> QueryParam "brand" Text :> QueryParam "productType" Text :> QueryParam "conditionType" Text :> QueryParam "isbn" Text :> QueryParam "asin" Text :> QueryParam "catalogNumbers" Text :> QueryParam "department" Text :> QueryParam "features" Text :> QueryParam "minimumPrice" Double :> QueryParam "width" Double :> QueryParam "height" Double :> QueryParam "depth" Double :> QueryParam "weight" Double :> QueryParam "unit" Text :> QueryParam "studio" Text :> QueryParam "parentalRating" Text :> QueryParam "publishDate" Integer :> QueryParam "availabilityDate" Integer :> QueryParam "sizeId" Integer :> QueryParam "listingId" Integer :> QueryParam "mediaType" Text :> QueryParam "duration" Int :> QueryParam "author" Text :> QueryParam "releaseDate" Integer :> QueryParam "collectionIds" Text :> QueryParam "rebootTimeHour" Int :> QueryParam "rebootTimeMinute" Int :> QueryParam "idleTimeoutInSecond" Int :> QueryParam "serialNumber" Text :> QueryParam "udid" Text :> QueryParam "deviceType" Text :> QueryParam "devicePower" Double :> QueryParam "deviceInterference" Double :> QueryParam "availability" Text :> QueryParam "availabilitySummary" Text :> Verb 'POST 200 '[JSON] RetailerOfferResponse -- 'updateOffer' route
    :<|> "retailer" :> "offer" :> "status" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "offerIds" Text :> QueryParam "active" Bool :> Verb 'POST 200 '[JSON] SirqulResponse -- 'updateOfferStatus' route
    :<|> "offer" :> "status" :> "create" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "name" Text :> QueryParam "description" Text :> QueryParam "code" Int :> QueryParam "role" Text :> QueryParam "active" Bool :> QueryParam "applicationIds" Text :> Verb 'POST 200 '[JSON] OfferTransactionStatusResponse -- 'createOfferTransactionStatus' route
    :<|> "offer" :> "status" :> "delete" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "statusId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteOfferTransactionStatus' route
    :<|> "offer" :> "status" :> "get" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "statusId" Integer :> Verb 'GET 200 '[JSON] OfferTransactionStatusResponse -- 'getOfferTransactionStatus' route
    :<|> "offer" :> "status" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "keyword" Text :> QueryParam "role" Text :> QueryParam "appKey" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "includeInactive" Bool :> Verb 'GET 200 '[JSON] [OfferTransactionStatusResponse] -- 'searchOfferTransactionStatuses' route
    :<|> "offer" :> "status" :> "update" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "statusId" Integer :> QueryParam "name" Text :> QueryParam "description" Text :> QueryParam "code" Int :> QueryParam "role" Text :> QueryParam "active" Bool :> QueryParam "applicationIds" Text :> Verb 'POST 200 '[JSON] OfferTransactionStatusResponse -- 'updateOfferTransactionStatus' route
    :<|> "openai" :> "v1" :> "images" :> "generations" :> QueryParam "accountId" Integer :> QueryParam "postBody" Text :> QueryParam "returnRawResponse" Bool :> Verb 'POST 200 '[JSON] WrappedProxyItemResponse -- 'imageGeneration' route
    :<|> "optimize" :> "result" :> Capture "batchID" Text :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] ((Map.Map String ShipmentOrder)) -- 'getOptimizationResult' route
    :<|> "optimize" :> "request" :> ReqBody '[JSON] Orders :> Verb 'POST 200 '[JSON] ImportStatuses -- 'requestOptimization' route
    :<|> "orson" :> "ai" :> "addMovie" :> QueryParam "accountId" Integer :> QueryParam "thirdPartyAccountId" Text :> QueryParam "tags" Text :> QueryParam "movieName" Text :> QueryParam "file" FilePath :> QueryParam "url" Text :> QueryParam "callback" Text :> Verb 'POST 200 '[JSON] OrsonAiAddMovieResponse -- 'addMovie' route
    :<|> "orson" :> "ai" :> "docs" :> QueryParam "accountId" Integer :> QueryParam "doc" Text :> QueryParam "return_topics" Bool :> QueryParam "limit" Int :> QueryParam "offset" Int :> Verb 'GET 200 '[JSON] OrsonAiProtoResponse -- 'aiDocs' route
    :<|> "orson" :> "ai" :> "img" :> QueryParam "accountId" Integer :> QueryParam "text" Text :> QueryParam "parse_flag" Text :> QueryParam "fetch_flag" Text :> QueryParam "size" Text :> Verb 'GET 200 '[JSON] OrsonAiProtoResponse -- 'aiFindImages' route
    :<|> "orson" :> "ai" :> "tags" :> QueryParam "accountId" Integer :> QueryParam "tags" Text :> QueryParam "conditional" Text :> QueryParam "limit" Int :> QueryParam "offset" Int :> Verb 'GET 200 '[JSON] OrsonAiProtoResponse -- 'aiTags' route
    :<|> "orson" :> "ai" :> "text" :> QueryParam "accountId" Integer :> QueryParam "terms" Text :> QueryParam "conditional" Text :> QueryParam "limit" Int :> QueryParam "offset" Int :> Verb 'GET 200 '[JSON] OrsonAiProtoResponse -- 'aiText' route
    :<|> "orson" :> "ai" :> "batch" :> QueryParam "accountId" Integer :> QueryParam "thirdPartyAccountId" Text :> QueryParam "limit" Int :> QueryParam "operations" Text :> QueryParam "file" FilePath :> QueryParam "url" Text :> QueryParam "callback" Text :> Verb 'POST 200 '[JSON] OrsonAiBatchResponse -- 'batch' route
    :<|> "orson" :> "stories" :> "episodes" :> "instant" :> QueryParam "accountId" Integer :> QueryParam "data" Text :> Verb 'POST 200 '[JSON] OrsonEpisodeResponse -- 'createInstantEpisode' route
    :<|> "orson" :> "ai" :> "voiceCanvas" :> QueryParam "accountId" Integer :> QueryParam "thirdPartyAccountId" Text :> QueryParam "dimensions" Text :> QueryParam "text" Text :> QueryParam "file" FilePath :> QueryParam "url" Text :> QueryParam "parseFlag" Bool :> QueryParam "fetchFlag" Bool :> QueryParam "callback" Text :> Verb 'POST 200 '[JSON] OrsonAiVoiceCanvasResponse -- 'createVoiceCanvas' route
    :<|> "orson" :> "ai" :> "emotion" :> QueryParam "accountId" Integer :> QueryParam "thirdPartyAccountId" Text :> QueryParam "file" FilePath :> QueryParam "url" Text :> QueryParam "callback" Text :> Verb 'POST 200 '[JSON] OrsonAiEmotionsResponse -- 'emotion' route
    :<|> "orson" :> "ai" :> "addMovie" :> Capture "requestId" Text :> QueryParam "accountId" Integer :> Verb 'GET 200 '[JSON] OrsonAiAddMovieResponse -- 'getAddMovieResult' route
    :<|> "orson" :> "ai" :> "batch" :> Capture "requestId" Text :> QueryParam "accountId" Integer :> Verb 'GET 200 '[JSON] OrsonAiBatchResponse -- 'getBatch' route
    :<|> "orson" :> "ai" :> "emotion" :> Capture "requestId" Text :> QueryParam "accountId" Integer :> Verb 'GET 200 '[JSON] OrsonAiEmotionsResponse -- 'getEmotion' route
    :<|> "orson" :> "stories" :> "episodes" :> Capture "episodeId" Integer :> "status" :> QueryParam "accountId" Integer :> Verb 'GET 200 '[JSON] OrsonEpisodeResponse -- 'getEpisodeStatus' route
    :<|> "orson" :> "stories" :> "renders" :> Capture "renderId" Text :> "status" :> QueryParam "accountId" Integer :> Verb 'GET 200 '[JSON] OrsonRenderResponse -- 'getRenderStatus' route
    :<|> "orson" :> "ai" :> "stt" :> Capture "requestId" Text :> QueryParam "accountId" Integer :> Verb 'GET 200 '[JSON] OrsonAiSTTResponse -- 'getSTT' route
    :<|> "orson" :> "ai" :> "tts" :> Capture "requestId" Text :> QueryParam "accountId" Integer :> Verb 'GET 200 '[JSON] OrsonAiTTSResponse -- 'getTTS' route
    :<|> "orson" :> "ai" :> "techTune" :> Capture "requestId" Text :> QueryParam "accountId" Integer :> Verb 'GET 200 '[JSON] OrsonAiTechTuneResponse -- 'getTechTune' route
    :<|> "orson" :> "ai" :> "topics" :> Capture "requestId" Text :> QueryParam "accountId" Integer :> Verb 'GET 200 '[JSON] OrsonAiTopicsResponse -- 'getTopics' route
    :<|> "orson" :> "ai" :> "voiceCanvas" :> Capture "requestId" Text :> QueryParam "accountId" Integer :> Verb 'GET 200 '[JSON] OrsonAiVoiceCanvasResponse -- 'getVoiceCanvas' route
    :<|> "orson" :> "stories" :> "renders" :> QueryParam "accountId" Integer :> QueryParam "data" Text :> Verb 'POST 200 '[JSON] OrsonRenderResponse -- 'startVideoRender' route
    :<|> "orson" :> "ai" :> "stt" :> QueryParam "accountId" Integer :> QueryParam "thirdPartyAccountId" Text :> QueryParam "sourceLanguage" Text :> QueryParam "targetLanguage" Text :> QueryParam "file" FilePath :> QueryParam "url" Text :> QueryParam "callback" Text :> Verb 'POST 200 '[JSON] OrsonAiSTTResponse -- 'stt' route
    :<|> "orson" :> "ai" :> "topics" :> QueryParam "accountId" Integer :> QueryParam "thirdPartyAccountId" Text :> QueryParam "doc" Text :> QueryParam "file" FilePath :> QueryParam "url" Text :> QueryParam "limit" Int :> QueryParam "offset" Int :> QueryParam "callback" Text :> Verb 'POST 200 '[JSON] OrsonAiTopicsResponse -- 'summarizeTopics' route
    :<|> "orson" :> "ai" :> "techTune" :> QueryParam "accountId" Integer :> QueryParam "thirdPartyAccountId" Text :> QueryParam "numFacesExpected" Int :> QueryParam "file" FilePath :> QueryParam "url" Text :> QueryParam "callback" Text :> Verb 'POST 200 '[JSON] OrsonAiTechTuneResponse -- 'techTune' route
    :<|> "orson" :> "ai" :> "tts" :> QueryParam "accountId" Integer :> QueryParam "thirdPartyAccountId" Text :> QueryParam "text" Text :> QueryParam "language" Text :> QueryParam "voice" Text :> QueryParam "callback" Text :> Verb 'POST 200 '[JSON] OrsonAiTTSResponse -- 'tts' route
    :<|> "pack" :> "create" :> QueryParam "accountId" Integer :> QueryParam "title" Text :> QueryParam "description" Text :> QueryParam "searchTags" Text :> QueryParam "active" Bool :> QueryParam "gameType" Text :> QueryParam "appKey" Text :> QueryParam "packType" Text :> QueryParam "packOrder" Integer :> QueryParam "sequenceType" Text :> QueryParam "backgroundId" Integer :> QueryParam "imageId" Integer :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "authorOverride" Text :> QueryParam "price" Int :> QueryParam "priceType" Text :> QueryParam "gameLevelIds" Text :> QueryParam "inGame" Bool :> QueryParam "highest" Bool :> QueryParam "allocateTickets" Bool :> QueryParam "ticketCount" Integer :> QueryParam "ticketType" Text :> QueryParam "points" Integer :> Verb 'POST 200 '[JSON] PackResponse -- 'createPack' route
    :<|> "pack" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "packId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deletePack' route
    :<|> "pack" :> "get" :> QueryParam "accountId" Integer :> QueryParam "packId" Integer :> QueryParam "includeGameData" Bool :> Verb 'GET 200 '[JSON] PackResponse -- 'getPack' route
    :<|> "pack" :> "search" :> QueryParam "accountId" Integer :> QueryParam "keyword" Text :> QueryParam "packType" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "includeGameData" Bool :> QueryParam "includeInactive" Bool :> QueryParam "appKey" Text :> Verb 'GET 200 '[JSON] [PackResponse] -- 'searchPacks' route
    :<|> "pack" :> "update" :> QueryParam "accountId" Integer :> QueryParam "packId" Integer :> QueryParam "title" Text :> QueryParam "description" Text :> QueryParam "searchTags" Text :> QueryParam "active" Bool :> QueryParam "gameType" Text :> QueryParam "appKey" Text :> QueryParam "packType" Text :> QueryParam "packOrder" Integer :> QueryParam "sequenceType" Text :> QueryParam "backgroundId" Integer :> QueryParam "imageId" Integer :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "authorOverride" Text :> QueryParam "price" Int :> QueryParam "priceType" Text :> QueryParam "gameLevelIds" Text :> QueryParam "inGame" Bool :> QueryParam "highest" Bool :> QueryParam "allocateTickets" Bool :> QueryParam "ticketCount" Integer :> QueryParam "ticketType" Text :> QueryParam "points" Integer :> Verb 'POST 200 '[JSON] PackResponse -- 'updatePack' route
    :<|> "participant" :> "process" :> "all" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "useShortNameAsID" Bool :> Verb 'POST 200 '[JSON] SirqulResponse -- 'processAllParticipants' route
    :<|> "participant" :> "process" :> QueryParam "accountId" Integer :> QueryParam "league" Text :> QueryParam "appKey" Text :> QueryParam "useShortNameAsID" Bool :> QueryParam "file" FilePath :> Verb 'POST 200 '[JSON] SirqulResponse -- 'processParticipants' route
    :<|> "pathing" :> "compute" :> QueryParam "data" Text :> QueryParam "units" Text :> QueryParam "reducePath" Bool :> QueryParam "directions" Bool :> Verb 'GET 200 '[JSON] PathingResponse -- 'computePath' route
    :<|> "postalCode" :> "create" :> QueryParam "accountId" Integer :> QueryParam "code" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "stateCode" Text :> QueryParam "city" Text :> QueryParam "active" Bool :> Verb 'POST 200 '[JSON] PostalCodeResponse -- 'createPostalCode' route
    :<|> "postalCode" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "postalCodeId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deletePostalCode' route
    :<|> "postalCode" :> "get" :> QueryParam "postalCodeId" Integer :> Verb 'GET 200 '[JSON] PostalCodeResponse -- 'getPostalCode' route
    :<|> "postalCode" :> "search" :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "keyword" Text :> QueryParam "miles" Double :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> Verb 'GET 200 '[JSON] [PostalCodeResponse] -- 'getPostalCodes' route
    :<|> "postalCode" :> "update" :> QueryParam "accountId" Integer :> QueryParam "postalCodeId" Integer :> QueryParam "code" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "stateCode" Text :> QueryParam "city" Text :> QueryParam "active" Bool :> Verb 'POST 200 '[JSON] PostalCodeResponse -- 'updatePostalCode' route
    :<|> "persona" :> "create" :> QueryParam "accountId" Integer :> QueryParam "title" Text :> QueryParam "previewAccounts" Text :> QueryParam "date" Integer :> QueryParam "age" Int :> QueryParam "gender" Text :> QueryParam "gameExperienceLevel" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] PreviewPersonaResponse -- 'createPersona' route
    :<|> "persona" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "personaId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deletePersona' route
    :<|> "persona" :> "get" :> QueryParam "accountId" Integer :> QueryParam "personaId" Integer :> Verb 'GET 200 '[JSON] PreviewPersonaResponse -- 'getPersonaList' route
    :<|> "persona" :> "search" :> QueryParam "accountId" Integer :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] PreviewPersonaResponse -- 'searchPersona' route
    :<|> "persona" :> "update" :> QueryParam "accountId" Integer :> QueryParam "personaId" Integer :> QueryParam "title" Text :> QueryParam "previewAccounts" Text :> QueryParam "active" Bool :> QueryParam "date" Integer :> QueryParam "age" Int :> QueryParam "gender" Text :> QueryParam "gameExperienceLevel" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] PreviewPersonaResponse -- 'updatePersona' route
    :<|> "program" :> ReqBody '[JSON] Program :> Verb 'POST 200 '[JSON] Program -- 'createProgram' route
    :<|> "program" :> Capture "id" Integer :> Verb 'DELETE 200 '[JSON] NoContent -- 'deleteProgram' route
    :<|> "program" :> Capture "id" Integer :> Verb 'GET 200 '[JSON] Program -- 'getProgram' route
    :<|> "program" :> Capture "id" Integer :> ReqBody '[JSON] Program :> Verb 'POST 200 '[JSON] Program -- 'postProgram' route
    :<|> "program" :> Capture "id" Integer :> ReqBody '[JSON] Program :> Verb 'PUT 200 '[JSON] Program -- 'putProgram' route
    :<|> "program" :> QueryParam "keyword" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "activeOnly" Bool :> Verb 'GET 200 '[JSON] [Program] -- 'searchPrograms' route
    :<|> "purchase" :> "create" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "name" Text :> QueryParam "description" Text :> QueryParam "tickets" Int :> QueryParam "price" Float :> QueryParam "purchaseType" Text :> QueryParam "purchaseCode" Text :> QueryParam "secretKey" Text :> QueryParam "purchaseLimit" Int :> QueryParam "serviceAction" Text :> QueryParam "coverAssetId" Integer :> QueryParam "promoAssetId" Integer :> QueryParam "giftable" Bool :> QueryParam "assetable" Bool :> QueryParam "allocateTickets" Bool :> QueryParam "ticketType" Text :> QueryParam "points" Integer :> QueryParam "offerLocationId" Integer :> Verb 'POST 200 '[JSON] PurchaseItemFullResponse -- 'createPurchaseItem' route
    :<|> "purchase" :> "delete" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "purchaseItemId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deletePurchaseItem' route
    :<|> "purchase" :> "get" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "purchaseItemId" Integer :> Verb 'GET 200 '[JSON] PurchaseItemFullResponse -- 'getPurchaseItem' route
    :<|> "purchase" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "filterByBillable" Bool :> QueryParam "purchaseType" Text :> QueryParam "serviceAction" Text :> QueryParam "keyword" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "activeOnly" Bool :> Verb 'GET 200 '[JSON] [PurchaseItemResponse] -- 'searchPurchaseItems' route
    :<|> "purchase" :> "update" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "purchaseItemId" Integer :> QueryParam "name" Text :> QueryParam "description" Text :> QueryParam "tickets" Int :> QueryParam "price" Float :> QueryParam "purchaseType" Text :> QueryParam "purchaseCode" Text :> QueryParam "secretKey" Text :> QueryParam "purchaseLimit" Int :> QueryParam "serviceAction" Text :> QueryParam "coverAssetId" Integer :> QueryParam "promoAssetId" Integer :> QueryParam "giftable" Bool :> QueryParam "assetable" Bool :> QueryParam "active" Bool :> QueryParam "allocateTickets" Bool :> QueryParam "ticketType" Text :> QueryParam "points" Integer :> QueryParam "offerLocationId" Integer :> Verb 'POST 200 '[JSON] PurchaseItemFullResponse -- 'updatePurchaseItem' route
    :<|> "order" :> "create" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "description" Text :> QueryParam "currencyType" Text :> QueryParam "cart" Text :> QueryParam "paymentMethodId" Integer :> QueryParam "externalOrderId" Text :> QueryParam "externalPaymentId" Text :> QueryParam "remoteRefType" Text :> QueryParam "externalDate" Integer :> QueryParam "promoCode" Text :> Verb 'POST 200 '[JSON] OrderResponse -- 'createOrder' route
    :<|> "order" :> "delete" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "orderId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteOrder' route
    :<|> "order" :> "get" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "orderId" Integer :> QueryParam "externalOrderId" Text :> Verb 'GET 200 '[JSON] OrderResponse -- 'getOrder' route
    :<|> "order" :> "preview" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "description" Text :> QueryParam "currencyType" Text :> QueryParam "cart" Text :> QueryParam "paymentMethodId" Integer :> QueryParam "externalOrderId" Text :> QueryParam "externalPaymentId" Text :> QueryParam "remoteRefType" Text :> QueryParam "externalDate" Integer :> QueryParam "promoCode" Text :> Verb 'POST 200 '[JSON] OrderResponse -- 'previewOrder' route
    :<|> "order" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "descending" Bool :> QueryParam "activeOnly" Bool :> QueryParam "ignoreCustomerFilter" Bool :> QueryParam "orderItemTypes" Text :> QueryParam "orderItemIds" Text :> QueryParam "orderCustomTypes" Text :> QueryParam "orderCustomIds" Text :> QueryParam "sortField" Text :> QueryParam "offerTypes" Text :> QueryParam "specialOfferTypes" Text :> QueryParam "categoryIds" Text :> QueryParam "filterIds" Text :> QueryParam "offerAudienceIds" Text :> QueryParam "transactionAudienceIds" Text :> QueryParam "offerIds" Text :> QueryParam "offerLocationIds" Text :> QueryParam "retailerIds" Text :> QueryParam "retailerLocationIds" Text :> QueryParam "statuses" Text :> QueryParam "keyword" Text :> QueryParam "redeemableStartDate" Integer :> QueryParam "redeemableEndDate" Integer :> QueryParam "startedSince" Integer :> QueryParam "startedBefore" Integer :> QueryParam "endedSince" Integer :> QueryParam "endedBefore" Integer :> Verb 'GET 200 '[JSON] [OrderResponse] -- 'searchOrders' route
    :<|> "order" :> "update" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "orderId" Integer :> QueryParam "paymentTransactionId" Integer :> QueryParam "appKey" Text :> QueryParam "description" Text :> QueryParam "currencyType" Text :> QueryParam "cart" Text :> QueryParam "paymentMethodId" Integer :> QueryParam "externalPaymentId" Text :> QueryParam "externalDate" Integer :> Verb 'POST 200 '[JSON] OrderResponse -- 'updateOrder' route
    :<|> "game" :> "question" :> "create" :> QueryParam "accountId" Integer :> QueryParam "question" Text :> QueryParam "answers" Text :> QueryParam "tags" Text :> QueryParam "videoURL" Text :> QueryParam "assetId" Integer :> QueryParam "active" Bool :> QueryParam "allocateTickets" Bool :> QueryParam "ticketCount" Integer :> QueryParam "ticketType" Text :> QueryParam "points" Integer :> Verb 'POST 200 '[JSON] QuestionResponse -- 'createQuestion' route
    :<|> "game" :> "question" :> "delete" :> QueryParam "questionId" Integer :> QueryParam "accountId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteQuestion' route
    :<|> "game" :> "question" :> "get" :> QueryParam "questionId" Integer :> QueryParam "accountId" Integer :> Verb 'GET 200 '[JSON] QuestionResponse -- 'getQuestion' route
    :<|> "game" :> "question" :> "search" :> QueryParam "accountId" Integer :> QueryParam "keyword" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "activeOnly" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] [QuestionResponse] -- 'searchQuestions' route
    :<|> "game" :> "question" :> "update" :> QueryParam "questionId" Integer :> QueryParam "accountId" Integer :> QueryParam "question" Text :> QueryParam "answers" Text :> QueryParam "tags" Text :> QueryParam "videoURL" Text :> QueryParam "assetId" Integer :> QueryParam "active" Bool :> QueryParam "allocateTickets" Bool :> QueryParam "ticketCount" Integer :> QueryParam "ticketType" Text :> QueryParam "points" Integer :> Verb 'POST 200 '[JSON] QuestionResponse -- 'updateQuestion' route
    :<|> "ranking" :> "historical" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "rankType" Text :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] RankFullResponse -- 'getHistoricalRankings' route
    :<|> "ranking" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "gameType" Text :> QueryParam "appKey" Text :> QueryParam "q" Text :> QueryParam "keyword" Text :> QueryParam "rankType" Text :> QueryParam "leaderboardMode" Text :> QueryParam "withinAccountIds" Text :> QueryParam "returnUserRank" Bool :> QueryParam "albumId" Integer :> QueryParam "audienceId" Integer :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "_i" Int :> QueryParam "start" Int :> QueryParam "_l" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] RankFullResponse -- 'getRankings' route
    :<|> "ranking" :> "personal" :> "ranks" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "rankType" Text :> QueryParam "returnUserRank" Bool :> QueryParam "leaderboardMode" Text :> QueryParam "sortField" Text :> QueryParam "keyword" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'POST 200 '[JSON] Value -- 'getUserRank' route
    :<|> "ranking" :> "override" :> QueryParam "accountId" Integer :> QueryParam "ownerAccountId" Integer :> QueryParam "appKey" Text :> QueryParam "rankType" Text :> QueryParam "totalScore" Integer :> QueryParam "totalCount" Integer :> QueryParam "totalTime" Integer :> QueryParam "dailyScore" Integer :> QueryParam "dailyCount" Integer :> QueryParam "dailyTime" Integer :> QueryParam "weeklyScore" Integer :> QueryParam "weeklyCount" Integer :> QueryParam "weeklyTime" Integer :> QueryParam "monthlyScore" Integer :> QueryParam "monthlyCount" Integer :> QueryParam "monthlyTime" Integer :> QueryParam "topScore" Integer :> QueryParam "lowestScore" Integer :> QueryParam "streakCount" Integer :> QueryParam "streakBestCount" Integer :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'overrideUserRank' route
    :<|> "ranking" :> "update" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "rankType" Text :> QueryParam "increment" Integer :> QueryParam "timeIncrement" Integer :> QueryParam "tag" Text :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "updateGlobal" Bool :> QueryParam "createLeaderboard" Bool :> Verb 'POST 200 '[JSON] SirqulResponse -- 'updateRankings' route
    :<|> "rating" :> "create" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "ratableType" Text :> QueryParam "ratableId" Integer :> QueryParam "ratingValue" Int :> QueryParam "categoryId" Integer :> QueryParam "display" Text :> QueryParam "description" Text :> QueryParam "locationDescription" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] RatingResponse -- 'createRating' route
    :<|> "rating" :> "delete" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "ratingId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteRating' route
    :<|> "location" :> "rating" :> "index" :> "search" :> QueryParam "categoryIds" Text :> QueryParam "keyword" Text :> QueryParam "locationType" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "searchRange" Double :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "returnOverallRating" Bool :> QueryParam "distanceUnit" Text :> QueryParam "returnRetailer" Bool :> QueryParam "returnAssets" Bool :> QueryParam "returnOffers" Bool :> QueryParam "returnCategories" Bool :> QueryParam "returnFilters" Bool :> Verb 'GET 200 '[JSON] [RatingIndexResponse] -- 'searchLocationRatingIndexes' route
    :<|> "rating" :> "index" :> "search" :> QueryParam "ratableType" Text :> QueryParam "ratableIds" Text :> QueryParam "categoryIds" Text :> QueryParam "secondaryType" Text :> QueryParam "keyword" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "returnRatable" Bool :> QueryParam "returnOverallRating" Bool :> Verb 'GET 200 '[JSON] [RatingIndexResponse] -- 'searchRatingIndexes' route
    :<|> "rating" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "filterAccountId" Integer :> QueryParam "ratableType" Text :> QueryParam "ratableId" Integer :> QueryParam "categoryIds" Text :> QueryParam "keyword" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] [RatingResponse] -- 'searchRatings' route
    :<|> "rating" :> "update" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "ratingId" Integer :> QueryParam "ratingValue" Int :> QueryParam "categoryId" Integer :> QueryParam "display" Text :> QueryParam "description" Text :> QueryParam "locationDescription" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] RatingResponse -- 'updateRating' route
    :<|> "region" :> "create" :> QueryParam "accountId" Integer :> QueryParam "regionClass" Text :> QueryParam "shortName" Text :> QueryParam "fullName" Text :> QueryParam "parentIds" Text :> QueryParam "childrenIds" Text :> QueryParam "postalCodeIds" Text :> QueryParam "locations" Text :> QueryParam "retailerLocationId" Integer :> QueryParam "visibility" Text :> QueryParam "categoryIds" Text :> QueryParam "filterIds" Text :> QueryParam "start" Integer :> QueryParam "end" Integer :> QueryParam "polygon" Text :> QueryParam "metaData" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "versionCode" Int :> QueryParam "root" Bool :> QueryParam "active" Bool :> Verb 'POST 200 '[JSON] RegionResponse -- 'createRegion' route
    :<|> "region" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "regionId" Integer :> Verb 'POST 200 '[JSON] RegionResponse -- 'deleteRegion' route
    :<|> "region" :> "get" :> QueryParam "accountId" Integer :> QueryParam "regionId" Integer :> Verb 'GET 200 '[JSON] RegionResponse -- 'getRegion' route
    :<|> "region" :> "search" :> QueryParam "accountId" Integer :> QueryParam "query" Text :> QueryParam "keyword" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "range" Double :> QueryParam "regionClass" Text :> QueryParam "visibility" Text :> QueryParam "searchMode" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "includeParent" Bool :> QueryParam "includeChildren" Bool :> QueryParam "includePostalCodes" Bool :> QueryParam "categoryIds" Text :> QueryParam "filterIds" Text :> QueryParam "versionCode" Int :> QueryParam "activeOnly" Bool :> QueryParam "showDeleted" Bool :> QueryParam "lastUpdatedSince" Integer :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] [RegionResponse] -- 'searchRegions' route
    :<|> "region" :> "update" :> QueryParam "accountId" Integer :> QueryParam "regionId" Integer :> QueryParam "regionClass" Text :> QueryParam "shortName" Text :> QueryParam "fullName" Text :> QueryParam "parentIds" Text :> QueryParam "childrenIds" Text :> QueryParam "postalCodeIds" Text :> QueryParam "locations" Text :> QueryParam "retailerLocationId" Integer :> QueryParam "visibility" Text :> QueryParam "categoryIds" Text :> QueryParam "filterIds" Text :> QueryParam "start" Integer :> QueryParam "end" Integer :> QueryParam "polygon" Text :> QueryParam "metaData" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "versionCode" Int :> QueryParam "root" Bool :> QueryParam "active" Bool :> QueryParam "clearLists" Bool :> Verb 'POST 200 '[JSON] RegionResponse -- 'updateRegion' route
    :<|> "report" :> "batch" :> "create" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "status" Text :> QueryParam "endpoint" Text :> QueryParam "parameters" Text :> QueryParam "name" Text :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "description" Text :> QueryParam "previewLimit" Int :> QueryParam "pageUrl" Text :> Verb 'POST 200 '[JSON] ReportBatchResponse -- 'createBatch' route
    :<|> "report" :> "region" :> "summary" :> "batch" :> ReqBody '[JSON] [RegionLegSummary] :> Verb 'POST 200 '[JSON] ReportRegionLegSummaryBatchResponse -- 'createRegionLegSummaryBatch' route
    :<|> "report" :> "batch" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "batchId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteBatch' route
    :<|> "report" :> "batch" :> "get" :> QueryParam "accountId" Integer :> QueryParam "batchId" Integer :> QueryParam "allResults" Bool :> Verb 'GET 200 '[JSON] ReportBatchResponse -- 'getReportBatch' route
    :<|> "report" :> "run" :> QueryParam "accountId" Integer :> QueryParam "query" Text :> QueryParam "parameters" Text :> QueryParam "order" Text :> QueryParam "desc" Bool :> QueryParam "start" Integer :> QueryParam "limit" Integer :> QueryParam "responseFormat" Text :> Verb 'POST 200 '[JSON] ReportResponse -- 'runReport' route
    :<|> "report" :> "batch" :> "search" :> QueryParam "accountId" Integer :> QueryParam "names" Text :> QueryParam "appKey" Text :> QueryParam "status" Text :> QueryParam "globalAppSearch" Bool :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] [ReportBatchResponse] -- 'searchBatch' route
    :<|> "reservation" :> "create" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "offerId" Integer :> QueryParam "offerLocationId" Integer :> QueryParam "appKey" Text :> QueryParam "metaData" Text :> Verb 'POST 200 '[JSON] NoContent -- 'createReservation' route
    :<|> "reservation" :> "delete" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "reservationId" Integer :> Verb 'POST 200 '[JSON] NoContent -- 'deleteReservation' route
    :<|> "reservable" :> "availability" :> "update" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "reservableId" Integer :> QueryParam "reservableType" Text :> QueryParam "availability" Text :> QueryParam "availabilitySummary" Text :> Verb 'POST 200 '[JSON] [AvailabilityResponse] -- 'reservableAvailability' route
    :<|> "reservable" :> "availability" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "reservableId" Integer :> QueryParam "reservableType" Text :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] [AvailabilityResponse] -- 'searchAvailability' route
    :<|> "reservation" :> "search" :> QueryParam "deviceId" Text :> QueryParam "appKey" Text :> QueryParam "accountId" Integer :> QueryParam "filterAccountId" Integer :> QueryParam "reservableId" Integer :> QueryParam "reservableType" Text :> QueryParam "keyword" Text :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] [ReservationResponse] -- 'searchReservations' route
    :<|> "reservable" :> "schedule" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "reservableId" Integer :> QueryParam "reservableType" Text :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "timeBucketMins" Int :> Verb 'GET 200 '[JSON] [TimeSlotResponse] -- 'searchSchedule' route
    :<|> "retailer" :> "create" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "name" Text :> QueryParam "streetAddress" Text :> QueryParam "streetAddress2" Text :> QueryParam "city" Text :> QueryParam "state" Text :> QueryParam "postalCode" Text :> QueryParam "country" Text :> QueryParam "businessPhone" Text :> QueryParam "businessPhoneExt" Text :> QueryParam "website" Text :> QueryParam "email" Text :> QueryParam "facebookUrl" Text :> QueryParam "twitterUrl" Text :> QueryParam "logo" FilePath :> QueryParam "logoAssetId" Integer :> QueryParam "picture1" FilePath :> QueryParam "picture1AssetId" Integer :> QueryParam "picture2" FilePath :> QueryParam "picture2AssetId" Integer :> QueryParam "categoryIds" Text :> QueryParam "categoryIdsToAdd" Text :> QueryParam "categoryIdsToRemove" Text :> QueryParam "filterIds" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "metaData" Text :> QueryParam "searchTags" Text :> QueryParam "retailerType" Text :> QueryParam "visibility" Text :> QueryParam "createDefaultLocation" Bool :> QueryParam "responseFormat" Text :> Verb 'POST 200 '[JSON] RetailerFullResponse -- 'createRetailer' route
    :<|> "retailer" :> "delete" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "retailerId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteRetailer' route
    :<|> "retailer" :> "get" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "retailerId" Integer :> QueryParam "includeCounts" Bool :> Verb 'GET 200 '[JSON] RetailerFullResponse -- 'getRetailer' route
    :<|> "retailer" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "q" Text :> QueryParam "keyword" Text :> QueryParam "categoryIds" Text :> QueryParam "filterIds" Text :> QueryParam "visibility" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "_i" Int :> QueryParam "start" Int :> QueryParam "_l" Int :> QueryParam "limit" Int :> QueryParam "activeOnly" Bool :> Verb 'GET 200 '[JSON] [RetailerResponse] -- 'getRetailers' route
    :<|> "retailer" :> "login" :> QueryParam "username" Text :> QueryParam "password" Text :> QueryParam "deviceId" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "appKey" Text :> Verb 'POST 200 '[JSON] AccountLoginResponse -- 'retailerLoginCheck' route
    :<|> "retailer" :> "update" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "retailerId" Integer :> QueryParam "name" Text :> QueryParam "streetAddress" Text :> QueryParam "streetAddress2" Text :> QueryParam "city" Text :> QueryParam "state" Text :> QueryParam "postalCode" Text :> QueryParam "country" Text :> QueryParam "businessPhone" Text :> QueryParam "businessPhoneExt" Text :> QueryParam "website" Text :> QueryParam "email" Text :> QueryParam "facebookUrl" Text :> QueryParam "twitterUrl" Text :> QueryParam "logo" FilePath :> QueryParam "logoAssetId" Integer :> QueryParam "picture1" FilePath :> QueryParam "picture1AssetId" Integer :> QueryParam "picture2" FilePath :> QueryParam "picture2AssetId" Integer :> QueryParam "categoryIds" Text :> QueryParam "filterIds" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "metaData" Text :> QueryParam "searchTags" Text :> QueryParam "retailerType" Text :> QueryParam "visibility" Text :> QueryParam "active" Bool :> QueryParam "responseFormat" Text :> Verb 'POST 200 '[JSON] RetailerFullResponse -- 'updateRetailer' route
    :<|> "location" :> "create" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "name" Text :> QueryParam "streetAddress" Text :> QueryParam "streetAddress2" Text :> QueryParam "city" Text :> QueryParam "state" Text :> QueryParam "postalCode" Text :> QueryParam "country" Text :> QueryParam "businessPhone" Text :> QueryParam "businessPhoneExt" Text :> QueryParam "website" Text :> QueryParam "email" Text :> QueryParam "detailsHeader" Text :> QueryParam "detailsBody" Text :> QueryParam "hours" Text :> QueryParam "tags" Text :> QueryParam "logoAssetId" Integer :> QueryParam "picture1AssetId" Integer :> QueryParam "picture2AssetId" Integer :> QueryParam "categoryIds" Text :> QueryParam "filterIds" Text :> QueryParam "metaData" Text :> QueryParam "publicLocation" Bool :> QueryParam "active" Bool :> QueryParam "locationType" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] RetailerLocationResponse -- 'createRetailerLocationConsumer' route
    :<|> "retailer" :> "location" :> "create" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "retailerId" Integer :> QueryParam "name" Text :> QueryParam "streetAddress" Text :> QueryParam "streetAddress2" Text :> QueryParam "city" Text :> QueryParam "state" Text :> QueryParam "postalCode" Text :> QueryParam "country" Text :> QueryParam "businessPhone" Text :> QueryParam "businessPhoneExt" Text :> QueryParam "website" Text :> QueryParam "email" Text :> QueryParam "internalId" Text :> QueryParam "detailsHeader" Text :> QueryParam "detailsBody" Text :> QueryParam "hours" Text :> QueryParam "logo" FilePath :> QueryParam "logoAssetId" Integer :> QueryParam "picture1" FilePath :> QueryParam "picture1AssetId" Integer :> QueryParam "picture2" FilePath :> QueryParam "picture2AssetId" Integer :> QueryParam "categoryIds" Text :> QueryParam "filterIds" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "building" Text :> QueryParam "googlePlaceId" Text :> QueryParam "yelpId" Text :> QueryParam "active" Bool :> QueryParam "publicLocation" Bool :> QueryParam "locationType" Text :> QueryParam "audienceIds" Text :> QueryParam "audienceIdsToAdd" Text :> QueryParam "audienceIdsToRemove" Text :> QueryParam "responseFormat" Text :> QueryParam "responseIncludes" Text :> Verb 'POST 200 '[JSON] RetailerLocationResponse -- 'createRetailerLocations' route
    :<|> "retailer" :> "location" :> "delete" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "retailerLocationId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteRetailerLocation' route
    :<|> "retailer" :> "location" :> "get" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "retailerLocationId" Integer :> QueryParam "retailerLocationToken" Text :> Verb 'GET 200 '[JSON] RetailerLocationResponse -- 'getRetailerLocation' route
    :<|> "location" :> "get" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "retailerLocationId" Integer :> Verb 'GET 200 '[JSON] RetailerLocationResponse -- 'getRetailerLocationConsumer' route
    :<|> "retailer" :> "location" :> "idistancesearch" :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "accountId" Integer :> QueryParam "address" Text :> QueryParam "searchRange" Double :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "hasOffers" Bool :> QueryParam "categories" Text :> QueryParam "filters" Text :> QueryParam "audiences" Text :> QueryParam "retailerIds" Text :> QueryParam "retailerLocationIds" Text :> QueryParam "tags" Text :> QueryParam "locationType" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "q" Text :> QueryParam "keyword" Text :> QueryParam "keywordOperator" Text :> QueryParam "searchExpression" Text :> QueryParam "distanceUnit" Text :> QueryParam "returnFavorited" Bool :> QueryParam "returnRetailer" Bool :> QueryParam "returnAssets" Bool :> QueryParam "returnOffers" Bool :> QueryParam "returnCategories" Bool :> QueryParam "returnFilters" Bool :> QueryParam "returnAudiences" Bool :> QueryParam "returnQrCode" Bool :> QueryParam "returnExternalCategoryData" Bool :> QueryParam "includeFavorite" Bool :> QueryParam "includeLiked" Bool :> QueryParam "includeRating" Bool :> Verb 'GET 200 '[JSON] [RetailerLocationResponse] -- 'indexedRetailerLocationDistanceSearch' route
    :<|> "retailer" :> "location" :> "isearch" :> QueryParam "accountId" Integer :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "hasOffers" Bool :> QueryParam "categories" Text :> QueryParam "filters" Text :> QueryParam "audiences" Text :> QueryParam "retailerIds" Text :> QueryParam "retailerLocationIds" Text :> QueryParam "tags" Text :> QueryParam "locationType" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "q" Text :> QueryParam "keyword" Text :> QueryParam "keywordOperator" Text :> QueryParam "searchExpression" Text :> QueryParam "returnRetailer" Bool :> QueryParam "returnAssets" Bool :> QueryParam "returnOffers" Bool :> QueryParam "returnCategories" Bool :> QueryParam "returnFilters" Bool :> QueryParam "returnAudiences" Bool :> QueryParam "returnQrCode" Bool :> QueryParam "returnExternalCategoryData" Bool :> QueryParam "includeFavorite" Bool :> QueryParam "includeLiked" Bool :> QueryParam "includeRating" Bool :> Verb 'GET 200 '[JSON] [RetailerLocationResponse] -- 'indexedRetailerLocationSearch' route
    :<|> "retailer" :> "location" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "q" Text :> QueryParam "keyword" Text :> QueryParam "retailerIds" Text :> QueryParam "retailerLocationIds" Text :> QueryParam "locationType" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "_i" Int :> QueryParam "start" Int :> QueryParam "_l" Int :> QueryParam "limit" Int :> QueryParam "showPublicLocations" Bool :> QueryParam "activeOnly" Bool :> QueryParam "returnRetailer" Bool :> QueryParam "returnAssets" Bool :> QueryParam "returnOffers" Bool :> QueryParam "returnCategories" Bool :> QueryParam "returnFilters" Bool :> QueryParam "returnAudiences" Bool :> QueryParam "returnQrCode" Bool :> QueryParam "includeFavorite" Bool :> QueryParam "includeLiked" Bool :> QueryParam "includeRating" Bool :> Verb 'GET 200 '[JSON] [RetailerLocationResponse] -- 'searchRetailerLocations' route
    :<|> "retailer" :> "location" :> "update" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "retailerLocationId" Integer :> QueryParam "name" Text :> QueryParam "streetAddress" Text :> QueryParam "streetAddress2" Text :> QueryParam "city" Text :> QueryParam "state" Text :> QueryParam "postalCode" Text :> QueryParam "country" Text :> QueryParam "businessPhone" Text :> QueryParam "businessPhoneExt" Text :> QueryParam "website" Text :> QueryParam "email" Text :> QueryParam "internalId" Text :> QueryParam "detailsHeader" Text :> QueryParam "detailsBody" Text :> QueryParam "hours" Text :> QueryParam "logo" FilePath :> QueryParam "logoAssetId" Integer :> QueryParam "picture1" FilePath :> QueryParam "picture1AssetId" Integer :> QueryParam "picture2" FilePath :> QueryParam "picture2AssetId" Integer :> QueryParam "categoryIds" Text :> QueryParam "filterIds" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "building" Text :> QueryParam "googlePlaceId" Text :> QueryParam "yelpId" Text :> QueryParam "metaData" Text :> QueryParam "paymentProvider" Text :> QueryParam "active" Bool :> QueryParam "publicLocation" Bool :> QueryParam "locationType" Text :> QueryParam "audienceIds" Text :> QueryParam "audienceIdsToAdd" Text :> QueryParam "audienceIdsToRemove" Text :> QueryParam "responseFormat" Text :> QueryParam "tags" Text :> Verb 'POST 200 '[JSON] RetailerLocationResponse -- 'updateRetailerLocations' route
    :<|> "retailer" :> QueryParam "keyword" Text :> QueryParam "sortField" Text :> QueryParam "start" Integer :> QueryParam "limit" Integer :> QueryParam "retailerId" Integer :> QueryParam "activeOnly" Bool :> Verb 'GET 200 '[JSON] SirqulResponse -- 'getRetaokiler' route
    :<|> "route" :> Capture "routeId" Integer :> "approve" :> Verb 'POST 200 '[JSON] Route -- 'approveRoute' route
    :<|> "route" :> Capture "routeId" Integer :> "copy" :> ReqBody '[JSON] Route :> Verb 'POST 200 '[JSON] Route -- 'copyRoute' route
    :<|> "route" :> ReqBody '[JSON] Route :> Verb 'POST 200 '[JSON] Route -- 'createRoute' route
    :<|> "route" :> Capture "routeId" Integer :> "directions" :> Verb 'PUT 200 '[JSON] [Direction] -- 'createRouteDirections' route
    :<|> "route" :> Capture "routeId" Integer :> "polyline" :> Verb 'PUT 200 '[JSON] Route -- 'createRoutePolyline' route
    :<|> "route" :> Capture "routeId" Integer :> Verb 'DELETE 200 '[JSON] NoContent -- 'deleteRoute' route
    :<|> "route" :> Capture "routeId" Integer :> "disapprove" :> Verb 'POST 200 '[JSON] Route -- 'disapproveRoute' route
    :<|> "route" :> Capture "routeId" Integer :> QueryParam "showInheritedProperties" Bool :> Verb 'GET 200 '[JSON] Route -- 'getRoute' route
    :<|> "route" :> Capture "routeId" Integer :> "directions" :> Verb 'GET 200 '[JSON] [Direction] -- 'getRouteDirections' route
    :<|> "route" :> Capture "routeId" Integer :> "shipments" :> Verb 'GET 200 '[JSON] [Shipment] -- 'getRouteShipments' route
    :<|> "route" :> Capture "routeId" Integer :> "stop" :> Capture "stopId" Integer :> Verb 'GET 200 '[JSON] Stop -- 'getRouteStop' route
    :<|> "route" :> Capture "routeId" Integer :> "stops" :> QueryParam "confirmedOnly" Bool :> Verb 'GET 200 '[JSON] [Stop] -- 'getRouteStops' route
    :<|> "route" :> Capture "routeId" Integer :> "stop" :> Capture "stopId" Integer :> "shipments" :> Verb 'GET 200 '[JSON] [Shipment] -- 'getShipmentsAtStop' route
    :<|> "route" :> Capture "routeId" Integer :> "optimize" :> Verb 'POST 200 '[JSON] NoContent -- 'optimizeRoute' route
    :<|> "route" :> Capture "routeId" Integer :> "stop" :> Capture "stopId" Integer :> Verb 'DELETE 200 '[JSON] NoContent -- 'removeStop' route
    :<|> "route" :> Capture "routeId" Integer :> "stops" :> "reorder" :> ReqBody '[JSON] [Stop] :> Verb 'PATCH 200 '[JSON] [Stop] -- 'reorderRouteStopsPatch' route
    :<|> "route" :> Capture "routeId" Integer :> "stops" :> "reorder" :> ReqBody '[JSON] [Stop] :> Verb 'POST 200 '[JSON] [Stop] -- 'reorderRouteStopsPost' route
    :<|> "route" :> QueryParam "hubId" Integer :> QueryParam "programId" Integer :> QueryParam "scheduledStart" Integer :> QueryParam "scheduledEnd" Integer :> QueryParam "updatedStart" Integer :> QueryParam "updatedEnd" Integer :> QueryParam "featured" Bool :> QueryParam "seatCount" Int :> QueryParam "approved" Bool :> QueryParam "started" Bool :> QueryParam "completed" Bool :> QueryParam "valid" Bool :> QueryParam "parentId" Integer :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "activeOnly" Bool :> QueryParam "includesEmpty" Bool :> QueryParam "rootOnly" Bool :> QueryParam "showInheritedProperties" Bool :> Verb 'GET 200 '[JSON] [Route] -- 'searchRoutes' route
    :<|> "route" :> Capture "id" Integer :> "driver" :> Capture "driverId" Integer :> Verb 'POST 200 '[JSON] NoContent -- 'setDriver' route
    :<|> "route" :> Capture "routeId" Integer :> ReqBody '[JSON] Route :> Verb 'PUT 200 '[JSON] Route -- 'updateRoute' route
    :<|> "route" :> Capture "routeId" Integer :> "stop" :> Capture "stopId" Integer :> ReqBody '[JSON] Stop :> Verb 'PUT 200 '[JSON] NoContent -- 'updateRouteStop' route
    :<|> "route" :> "setting" :> ReqBody '[JSON] RouteSettings :> Verb 'POST 200 '[JSON] RouteSettings -- 'createRouteSettings' route
    :<|> "route" :> "setting" :> Capture "routeSettingsId" Integer :> Verb 'DELETE 200 '[JSON] Value -- 'deleteRouteSettings' route
    :<|> "route" :> "setting" :> Capture "routeSettingsId" Integer :> Verb 'GET 200 '[JSON] RouteSettings -- 'getRouteSettings' route
    :<|> "route" :> "setting" :> QueryParam "hubId" Integer :> QueryParam "programId" Integer :> QueryParam "keyword" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "activeOnly" Bool :> Verb 'GET 200 '[JSON] [RouteSettings] -- 'searchRouteSettings' route
    :<|> "route" :> "setting" :> Capture "routeSettingsId" Integer :> ReqBody '[JSON] RouteSettings :> Verb 'PUT 200 '[JSON] RouteSettings -- 'updateRouteSettings' route
    :<|> "routing" :> "compute" :> QueryParam "data" Text :> Verb 'POST 200 '[JSON] RoutingListResponse -- 'computeRouting' route
    :<|> "notification" :> "schedule" :> "create" :> QueryParam "accountId" Integer :> QueryParam "name" Text :> QueryParam "type" Text :> QueryParam "message" Text :> QueryParam "contentId" Integer :> QueryParam "contentName" Text :> QueryParam "contentType" Text :> QueryParam "parentId" Integer :> QueryParam "parentType" Text :> QueryParam "appKey" Text :> QueryParam "groupingId" Text :> QueryParam "connectionGroupIds" Text :> QueryParam "connectionAccountIds" Text :> QueryParam "audienceId" Integer :> QueryParam "audienceIds" Text :> QueryParam "albumIds" Text :> QueryParam "reportId" Integer :> QueryParam "reportParams" Text :> QueryParam "endpointURL" Text :> QueryParam "payload" Text :> QueryParam "scheduledDate" Integer :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "cronExpression" Text :> QueryParam "cronType" Text :> QueryParam "metaData" Text :> QueryParam "conditionalInput" Text :> QueryParam "templateType" Text :> QueryParam "visibility" Text :> QueryParam "active" Bool :> QueryParam "sendNow" Bool :> QueryParam "eventType" Text :> QueryParam "deepLinkURI" Text :> QueryParam "sendToAll" Bool :> Verb 'POST 200 '[JSON] ScheduledNotificationFullResponse -- 'createScheduledNotification' route
    :<|> "notification" :> "schedule" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "scheduledNotificationId" Integer :> QueryParam "deleteByGroupingId" Bool :> Verb 'POST 200 '[JSON] ScheduledNotificationFullResponse -- 'deleteScheduledNotification' route
    :<|> "notification" :> "schedule" :> "get" :> QueryParam "accountId" Integer :> QueryParam "scheduledNotificationId" Integer :> Verb 'GET 200 '[JSON] ScheduledNotificationFullResponse -- 'getScheduledNotification' route
    :<|> "notification" :> "schedule" :> "generate" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "reportName" Text :> QueryParam "reportParams" Text :> QueryParam "message" Text :> QueryParam "offset" Int :> QueryParam "type" Text :> QueryParam "recipientReportId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'scheduleNotificationListings' route
    :<|> "notification" :> "schedule" :> "search" :> QueryParam "accountId" Integer :> QueryParam "groupingId" Text :> QueryParam "audienceId" Integer :> QueryParam "filter" Text :> QueryParam "types" Text :> QueryParam "contentIds" Text :> QueryParam "contentTypes" Text :> QueryParam "parentIds" Text :> QueryParam "parentTypes" Text :> QueryParam "statuses" Text :> QueryParam "templateTypes" Text :> QueryParam "appKey" Text :> QueryParam "keyword" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "activeOnly" Bool :> QueryParam "groupByGroupingId" Bool :> QueryParam "returnAudienceAccountCount" Bool :> Verb 'GET 200 '[JSON] ScheduledNotificationFullResponse -- 'searchScheduledNotifications' route
    :<|> "notification" :> "schedule" :> "update" :> QueryParam "scheduledNotificationId" Integer :> QueryParam "accountId" Integer :> QueryParam "name" Text :> QueryParam "type" Text :> QueryParam "message" Text :> QueryParam "payload" Text :> QueryParam "contentId" Integer :> QueryParam "contentName" Text :> QueryParam "contentType" Text :> QueryParam "parentId" Integer :> QueryParam "parentType" Text :> QueryParam "appKey" Text :> QueryParam "groupingId" Text :> QueryParam "connectionGroupIds" Text :> QueryParam "connectionAccountIds" Text :> QueryParam "audienceId" Integer :> QueryParam "audienceIds" Text :> QueryParam "albumIds" Text :> QueryParam "reportId" Integer :> QueryParam "reportParams" Text :> QueryParam "endpointURL" Text :> QueryParam "scheduledDate" Integer :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "cronExpression" Text :> QueryParam "cronType" Text :> QueryParam "metaData" Text :> QueryParam "conditionalInput" Text :> QueryParam "templateType" Text :> QueryParam "visibility" Text :> QueryParam "active" Bool :> QueryParam "errorMessage" Text :> QueryParam "status" Text :> QueryParam "updateByGroupingId" Bool :> QueryParam "sendNow" Bool :> QueryParam "eventType" Text :> QueryParam "deepLinkURI" Text :> QueryParam "sendToAll" Bool :> Verb 'POST 200 '[JSON] ScheduledNotificationFullResponse -- 'updateScheduledNotification' route
    :<|> "score" :> "create" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "missionId" Integer :> QueryParam "gameId" Integer :> QueryParam "packId" Integer :> QueryParam "gameLevelId" Integer :> QueryParam "gameObjectId" Integer :> QueryParam "points" Int :> QueryParam "timeTaken" Int :> QueryParam "highest" Bool :> Verb 'POST 200 '[JSON] ScoreResponse -- 'createScore' route
    :<|> "score" :> "get" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "missionId" Integer :> QueryParam "gameId" Integer :> QueryParam "packId" Integer :> QueryParam "gameLevelId" Integer :> QueryParam "gameObjectId" Integer :> QueryParam "scoreObjectType" Text :> QueryParam "scoreStatus" Text :> Verb 'GET 200 '[JSON] ScoreResponse -- 'getScore' route
    :<|> "score" :> "search" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "missionId" Integer :> QueryParam "gameId" Integer :> QueryParam "packId" Integer :> QueryParam "gameLevelId" Integer :> QueryParam "gameObjectId" Integer :> Verb 'GET 200 '[JSON] [ScoreResponse] -- 'searchScores' route
    :<|> "secure" :> "application" :> "create" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "active" Bool :> QueryParam "keyCert" FilePath :> QueryParam "trustStore" FilePath :> QueryParam "username" Text :> QueryParam "password" Text :> QueryParam "biometricType" Text :> QueryParam "biometricPosition" Text :> QueryParam "biometricPosition2" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'createSecureApplication' route
    :<|> "secure" :> "application" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteSecureApplication' route
    :<|> "secure" :> "login" :> QueryParam "deviceId" Text :> QueryParam "appKey" Text :> QueryParam "biometricFile" FilePath :> QueryParam "biometricFile2" FilePath :> QueryParam "ageRestriction" Int :> QueryParam "returnProfile" Bool :> QueryParam "responseFilters" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] ProfileResponse -- 'loginSecure' route
    :<|> "secure" :> "purchase" :> ReqBody '[JSON] PaymentRequest :> Verb 'POST 200 '[JSON] ProfileResponse -- 'purchaseSecure' route
    :<|> "secure" :> "application" :> "reset" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'resetSecure' route
    :<|> "secure" :> "application" :> "update" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "active" Bool :> QueryParam "keyCert" FilePath :> QueryParam "trustStore" FilePath :> QueryParam "username" Text :> QueryParam "password" Text :> QueryParam "biometricType" Text :> QueryParam "biometricPosition" Text :> QueryParam "biometricPosition2" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'updateSecureApplication' route
    :<|> "hub" :> ReqBody '[JSON] ServiceHub :> Verb 'POST 200 '[JSON] ServiceHub -- 'createServiceHub' route
    :<|> "hub" :> Capture "id" Integer :> Verb 'DELETE 200 '[JSON] NoContent -- 'deleteServiceHub' route
    :<|> "hub" :> Capture "id" Integer :> Verb 'GET 200 '[JSON] Value -- 'getServiceHub' route
    :<|> "hub" :> Capture "id" Integer :> ReqBody '[JSON] ServiceHub :> Verb 'POST 200 '[JSON] ServiceHub -- 'postServiceHub' route
    :<|> "hub" :> Capture "id" Integer :> ReqBody '[JSON] ServiceHub :> Verb 'PUT 200 '[JSON] ServiceHub -- 'putServiceHub' route
    :<|> "hub" :> QueryParam "keyword" Text :> QueryParam "retailerId" Integer :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "activeOnly" Bool :> Verb 'GET 200 '[JSON] [ServiceHub] -- 'searchServiceHubs' route
    :<|> "shipment" :> Capture "id" Integer :> "cancel" :> Verb 'POST 200 '[JSON] NoContent -- 'cancelShipment' route
    :<|> "shipment" :> ReqBody '[JSON] Shipment :> Verb 'POST 200 '[JSON] Shipment -- 'createShipment' route
    :<|> "shipment" :> Capture "id" Integer :> Verb 'DELETE 200 '[JSON] NoContent -- 'deleteShipment' route
    :<|> "shipment" :> Capture "id" Integer :> Verb 'GET 200 '[JSON] Shipment -- 'getShipment' route
    :<|> "shipment" :> QueryParam "ownerId" Integer :> QueryParam "riderId" Integer :> QueryParam "routeId" Integer :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "activeOnly" Bool :> Verb 'GET 200 '[JSON] [Shipment] -- 'searchShipments' route
    :<|> "shipment" :> Capture "id" Integer :> ReqBody '[JSON] Shipment :> Verb 'PUT 200 '[JSON] Shipment -- 'updateShipment' route
    :<|> "shipment" :> Capture "id" Integer :> "status" :> ReqBody '[JSON] (Map.Map String Bool) :> Verb 'POST 200 '[JSON] NoContent -- 'updateShipmentStatus' route
    :<|> "shipment" :> "batch" :> ReqBody '[JSON] ShipmentBatch :> Verb 'POST 200 '[JSON] ShipmentBatch -- 'createShipmentBatch' route
    :<|> "shipment" :> "batch" :> Capture "batchId" Integer :> Verb 'DELETE 200 '[JSON] NoContent -- 'deleteShipmentBatch' route
    :<|> "shipment" :> "batch" :> Capture "batchId" Integer :> Verb 'GET 200 '[JSON] ShipmentBatch -- 'getShipmentBatch' route
    :<|> "shipment" :> "batch" :> Capture "batchId" Integer :> "status" :> QueryParam "accountId" Integer :> QueryParam "valid" Bool :> QueryParam "started" Bool :> QueryParam "completed" Bool :> QueryParam "hasShipment" Bool :> QueryParam "hasRoute" Bool :> QueryParam "keyword" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] [ShipmentImportStatus] -- 'getShipmentBatchStatus' route
    :<|> "shipment" :> "batch" :> QueryParam "hubId" Integer :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] [ShipmentBatch] -- 'searchShipmentBatch' route
    :<|> "simulation" :> "routing" :> QueryParam "data" Text :> QueryParam "realTime" Bool :> Verb 'POST 200 '[JSON] SirqulResponse -- 'simulation' route
    :<|> "stop" :> Capture "id" Integer :> Verb 'GET 200 '[JSON] Stop -- 'getStop' route
    :<|> "stop" :> Capture "id" Integer :> ReqBody '[JSON] Stop :> Verb 'PUT 200 '[JSON] Stop -- 'updateStop' route
    :<|> "stripe" :> "checkout" :> "session" :> "create" :> QueryParam "appKey" Text :> QueryParam "stripeParameters" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'createStripeCheckoutSession' route
    :<|> "subscription" :> "create" :> QueryParam "accountId" Integer :> QueryParam "planId" Integer :> QueryParam "promoCode" Text :> Verb 'POST 200 '[JSON] SubscriptionResponse -- 'createSubscription' route
    :<|> "subscription" :> "delete" :> QueryParam "accountId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteSubscription' route
    :<|> "subscription" :> "get" :> QueryParam "accountId" Integer :> Verb 'GET 200 '[JSON] SubscriptionResponse -- 'getSubscription' route
    :<|> "subscription" :> "plan" :> "get" :> QueryParam "planId" Integer :> Verb 'GET 200 '[JSON] SubscriptionPlanResponse -- 'getSubscriptionPlan' route
    :<|> "subscription" :> "plan" :> "list" :> QueryParam "visible" Bool :> QueryParam "role" Text :> Verb 'GET 200 '[JSON] [SubscriptionPlanResponse] -- 'getSubscriptionPlans' route
    :<|> "subscription" :> "usage" :> "get" :> QueryParam "accountId" Integer :> QueryParam "applicationId" Integer :> QueryParam "start" Integer :> QueryParam "end" Integer :> Verb 'GET 200 '[JSON] ApplicationUsageResponse -- 'getSubscriptionUsage' route
    :<|> "subscription" :> "update" :> QueryParam "accountId" Integer :> QueryParam "planId" Integer :> QueryParam "promoCode" Text :> QueryParam "active" Bool :> Verb 'POST 200 '[JSON] SubscriptionResponse -- 'updateSubscription' route
    :<|> "task" :> "create" :> QueryParam "accountId" Integer :> QueryParam "name" Text :> QueryParam "appKey" Text :> QueryParam "groupingId" Text :> QueryParam "endpointURL" Text :> QueryParam "payload" Text :> QueryParam "scheduledDate" Integer :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "cronExpression" Text :> QueryParam "visibility" Text :> QueryParam "active" Bool :> Verb 'POST 200 '[JSON] TaskResponse -- 'createTask' route
    :<|> "task" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "taskId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteTask' route
    :<|> "task" :> "get" :> QueryParam "accountId" Integer :> QueryParam "taskId" Integer :> Verb 'GET 200 '[JSON] TaskResponse -- 'getTask' route
    :<|> "task" :> "search" :> QueryParam "accountId" Integer :> QueryParam "groupingId" Text :> QueryParam "filter" Text :> QueryParam "statuses" Text :> QueryParam "templateTypes" Text :> QueryParam "appKey" Text :> QueryParam "keyword" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "activeOnly" Bool :> Verb 'GET 200 '[JSON] [TaskResponse] -- 'searchTasks' route
    :<|> "task" :> "update" :> QueryParam "taskId" Integer :> QueryParam "accountId" Integer :> QueryParam "name" Text :> QueryParam "appKey" Text :> QueryParam "groupingId" Text :> QueryParam "endpointURL" Text :> QueryParam "payload" Text :> QueryParam "scheduledDate" Integer :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "cronExpression" Text :> QueryParam "visibility" Text :> QueryParam "active" Bool :> Verb 'POST 200 '[JSON] TaskResponse -- 'updateTask' route
    :<|> "territory" :> "create" :> QueryParam "accountId" Integer :> QueryParam "name" Text :> QueryParam "active" Bool :> Verb 'POST 200 '[JSON] TerritoryResponse -- 'createTerritory' route
    :<|> "territory" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "territoryId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteTerritory' route
    :<|> "territory" :> "get" :> QueryParam "territoryId" Integer :> Verb 'GET 200 '[JSON] TerritoryResponse -- 'getTerritory' route
    :<|> "territory" :> "search" :> QueryParam "keyword" Text :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> Verb 'GET 200 '[JSON] [TerritoryResponse] -- 'searchTerritories' route
    :<|> "territory" :> "update" :> QueryParam "accountId" Integer :> QueryParam "territoryId" Integer :> QueryParam "name" Text :> QueryParam "active" Bool :> Verb 'POST 200 '[JSON] TerritoryResponse -- 'updateTerritory' route
    :<|> "consumer" :> "theme" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "gameType" Text :> QueryParam "themeDescriptorId" Integer :> QueryParam "title" Text :> QueryParam "description" Text :> QueryParam "publicRead" Bool :> QueryParam "publicWrite" Bool :> QueryParam "publicDelete" Bool :> QueryParam "publicAdd" Bool :> QueryParam "visibility" Text :> QueryParam "connectionIdsToAdd" Text :> QueryParam "connectionGroupIdsToAdd" Text :> QueryParam "includeFriendGroup" Bool :> QueryParam "appVersion" Text :> QueryParam "colorValueJson" Text :> QueryParam "stringReplacerJson" Text :> QueryParam "customJsonObjects" Text :> QueryParam "iconImage" FilePath :> QueryParam "sceneAtlasImage" FilePath :> QueryParam "bgImage" FilePath :> QueryParam "bgSound" FilePath :> QueryParam "musicSelection" Text :> QueryParam "completeWithDefaultValues" Bool :> QueryParam "locationDescription" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] ThemeDescriptorResponse -- 'addOrUpdateThemeDescriptor' route
    :<|> "consumer" :> "theme" :> "get" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "gameType" Text :> QueryParam "themeDescriptorId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'GET 200 '[JSON] PurchaseItemListResponse -- 'getThemeDescriptor' route
    :<|> "consumer" :> "theme" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "gameType" Text :> QueryParam "contestType" Text :> QueryParam "ownerId" Integer :> QueryParam "q" Text :> QueryParam "keyword" Text :> QueryParam "filter" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "_i" Int :> QueryParam "start" Int :> QueryParam "_l" Int :> QueryParam "limit" Int :> QueryParam "dateCreated" Integer :> QueryParam "appVersion" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'GET 200 '[JSON] PurchaseItemListResponse -- 'getThemeDescriptors' route
    :<|> "consumer" :> "theme" :> "remove" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "gameType" Text :> QueryParam "themeDescriptorId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] SirqulResponse -- 'removeThemeDescriptor' route
    :<|> "thirdparty" :> "credential" :> "create" :> QueryParam "accountId" Integer :> QueryParam "deviceId" Text :> QueryParam "sessionId" Text :> QueryParam "thirdPartyId" Text :> QueryParam "thirdPartyName" Text :> QueryParam "thirdPartyToken" Text :> QueryParam "networkUID" Text :> QueryParam "appKey" Text :> QueryParam "emailAddress" Text :> QueryParam "signinOnlyMode" Bool :> QueryParam "responseFilters" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "metaData" Text :> QueryParam "thirdPartyRefreshToken" Text :> QueryParam "audienceIdsToAdd" Text :> QueryParam "audienceIdsToRemove" Text :> Verb 'POST 200 '[JSON] ProfileResponse -- 'createCredential' route
    :<|> "thirdparty" :> "network" :> "create" :> QueryParam "accountId" Integer :> QueryParam "name" Text :> QueryParam "description" Text :> QueryParam "enableIntrospection" Bool :> QueryParam "introspectionMethod" Text :> QueryParam "introspectionURL" Text :> QueryParam "introspectionParams" Text :> QueryParam "requiredRootField" Text :> QueryParam "enableMFA" Bool :> QueryParam "sizeMFA" Int :> QueryParam "shelfLifeMFA" Int :> QueryParam "oauthTokenURL" Text :> QueryParam "oauthPrivateKey" FilePath :> QueryParam "oauthPublicKey" FilePath :> QueryParam "oauthClientId" Text :> QueryParam "oauthSecretKey" Text :> ReqBody '[JSON] Text :> Verb 'POST 200 '[JSON] ThirdPartyNetworkResponse -- 'createNetwork' route
    :<|> "thirdparty" :> "credential" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "networkUID" Text :> QueryParam "thirdPartyId" Text :> QueryParam "appKey" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteCredential' route
    :<|> "thirdparty" :> "network" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "networkUID" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteNetwork' route
    :<|> "thirdparty" :> "credential" :> "get" :> QueryParam "accountId" Integer :> QueryParam "deviceId" Text :> QueryParam "sessionId" Text :> QueryParam "thirdPartyCredentialId" Integer :> QueryParam "thirdPartyToken" Text :> QueryParam "thirdPartySecret" Text :> QueryParam "createNewAccount" Bool :> QueryParam "networkUID" Text :> QueryParam "appKey" Text :> QueryParam "responseFilters" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "audienceIdsToAdd" Text :> QueryParam "audienceIdsToRemove" Text :> QueryParam "referralAccountId" Integer :> Verb 'POST 200 '[JSON] ProfileResponse -- 'getCredential' route
    :<|> "thirdparty" :> "network" :> "get" :> QueryParam "accountId" Integer :> QueryParam "networkUID" Text :> Verb 'GET 200 '[JSON] ThirdPartyNetworkResponse -- 'getNetwork' route
    :<|> "thirdparty" :> "credential" :> "search" :> QueryParam "accountId" Integer :> QueryParam "keyword" Text :> QueryParam "networkUID" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] [ThirdPartyCredentialResponse] -- 'searchCredentials' route
    :<|> "thirdparty" :> "network" :> "search" :> QueryParam "accountId" Integer :> QueryParam "keyword" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "activeOnly" Bool :> QueryParam "filterBillable" Bool :> Verb 'GET 200 '[JSON] [ThirdPartyNetworkShortResponse] -- 'searchNetworks' route
    :<|> "thirdparty" :> "credential" :> "mfa" :> "send" :> QueryParam "thirdPartyToken" Text :> QueryParam "thirdPartyCredentialId" Integer :> QueryParam "networkUID" Text :> QueryParam "appKey" Text :> QueryParam "deviceId" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'sendMFAChallenge' route
    :<|> "thirdparty" :> "credential" :> "update" :> QueryParam "deviceId" Text :> QueryParam "networkUID" Text :> QueryParam "thirdPartyId" Text :> QueryParam "thirdPartyName" Text :> QueryParam "thirdPartyToken" Text :> QueryParam "appKey" Text :> QueryParam "responseFilters" Text :> QueryParam "metaData" Text :> QueryParam "thirdPartyRefreshToken" Text :> Verb 'POST 200 '[JSON] ProfileResponse -- 'updateCredential' route
    :<|> "thirdparty" :> "network" :> "update" :> QueryParam "accountId" Integer :> QueryParam "networkUID" Text :> QueryParam "name" Text :> QueryParam "description" Text :> QueryParam "enableIntrospection" Bool :> QueryParam "introspectionMethod" Text :> QueryParam "introspectionURL" Text :> QueryParam "introspectionParams" Text :> QueryParam "requiredRootField" Text :> QueryParam "enableMFA" Bool :> QueryParam "sizeMFA" Int :> QueryParam "shelfLifeMFA" Int :> QueryParam "oauthTokenURL" Text :> QueryParam "oauthPrivateKey" FilePath :> QueryParam "oauthPublicKey" FilePath :> QueryParam "oauthClientId" Text :> QueryParam "oauthSecretKey" Text :> ReqBody '[JSON] Text :> Verb 'POST 200 '[JSON] ThirdPartyNetworkResponse -- 'updateNetwork' route
    :<|> "ticket" :> "count" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "gameType" Text :> QueryParam "appKey" Text :> QueryParam "ticketType" Text :> Verb 'GET 200 '[JSON] CountResponse -- 'getTicketCount' route
    :<|> "ticket" :> "getList" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "ticketObjectType" Text :> QueryParam "actionType" Text :> QueryParam "ticketIds" Text :> QueryParam "objectIds" Text :> QueryParam "receiptTokens" Text :> QueryParam "gameType" Text :> QueryParam "appKey" Text :> Verb 'GET 200 '[JSON] TicketListResponse -- 'getTicketList' route
    :<|> "purchase" :> "gift" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "receiverAccountId" Integer :> QueryParam "ticketId" Integer :> QueryParam "assetId" Integer :> QueryParam "customMessage" Text :> QueryParam "gameType" Text :> QueryParam "appKey" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'giftPurchase' route
    :<|> "ticket" :> "save" :> QueryParam "returnNulls" Bool :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "gameType" Text :> QueryParam "appKey" Text :> QueryParam "actionType" Text :> QueryParam "ticketObjectType" Text :> QueryParam "objectId" Integer :> QueryParam "purchaseCode" Text :> QueryParam "receiptToken" Text :> QueryParam "receiptData" Text :> QueryParam "count" Integer :> QueryParam "ticketType" Text :> QueryParam "purchaseProvider" Text :> QueryParam "purchaseType" Text :> QueryParam "returnProfileResponse" Bool :> QueryParam "includeProfileResponse" Bool :> QueryParam "appVersion" Text :> Verb 'POST 200 '[JSON] ProfileResponse -- 'saveTicket' route
    :<|> "ticket" :> "save" :> "fileUpload" :> QueryParam "returnNulls" Bool :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "gameType" Text :> QueryParam "appKey" Text :> QueryParam "actionType" Text :> QueryParam "ticketObjectType" Text :> QueryParam "objectId" Integer :> QueryParam "purchaseCode" Text :> QueryParam "receiptToken" Text :> QueryParam "receiptData" FilePath :> QueryParam "count" Integer :> QueryParam "ticketType" Text :> QueryParam "purchaseProvider" Text :> QueryParam "purchaseType" Text :> QueryParam "returnProfileResponse" Bool :> QueryParam "includeProfileResponse" Bool :> QueryParam "appVersion" Text :> Verb 'POST 200 '[JSON] ProfileResponse -- 'saveTicketViaFileUpload' route
    :<|> "ticket" :> "ticketoffers" :> Verb 'GET 200 '[JSON] TicketOfferResponse -- 'ticketOffers' route
    :<|> "tournament" :> "create" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "title" Text :> QueryParam "subType" Text :> QueryParam "imageAssetId" Integer :> QueryParam "secondsBetweenLevels" Int :> QueryParam "secondsForTieBreaker" Int :> QueryParam "secondsBetweenPacks" Int :> QueryParam "maximumLevelLength" Int :> QueryParam "costToPlay" Int :> QueryParam "costToPlayType" Text :> QueryParam "minimumToPlay" Int :> QueryParam "startingLimit" Int :> QueryParam "availableLimit" Int :> QueryParam "description" Text :> QueryParam "metaData" Text :> QueryParam "startDate" Integer :> QueryParam "audienceIds" Text :> QueryParam "active" Bool :> QueryParam "enableBuyBack" Bool :> QueryParam "offerIds" Text :> QueryParam "offerAssetId" Integer :> QueryParam "fixedReward" Bool :> QueryParam "splitReward" Text :> QueryParam "allocateTickets" Bool :> QueryParam "tournamentData" Text :> QueryParam "missionType" Text :> QueryParam "visibility" Text :> QueryParam "preliminaryGroups" Int :> QueryParam "preliminaryGroupAdvancements" Text :> QueryParam "enableMultipleEntries" Bool :> QueryParam "enableMultipleVotes" Bool :> QueryParam "featured" Bool :> QueryParam "winnerTag" Text :> QueryParam "tieTag" Text :> Verb 'POST 200 '[JSON] TournamentResponse -- 'createTournament' route
    :<|> "tournament" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "missionId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteTournament' route
    :<|> "tournament" :> "get" :> QueryParam "accountId" Integer :> QueryParam "missionId" Integer :> QueryParam "joinCode" Text :> QueryParam "includeScores" Text :> QueryParam "objectPreviewSize" Int :> Verb 'GET 200 '[JSON] TournamentResponse -- 'getTournament' route
    :<|> "tournament" :> "object" :> "search" :> QueryParam "accountId" Integer :> QueryParam "gameLevelId" Integer :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] SirqulResponse -- 'searchObjects' route
    :<|> "tournament" :> "round" :> "search" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "status" Text :> QueryParam "missionType" Text :> QueryParam "currentOnly" Bool :> QueryParam "visibilities" Text :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] SirqulResponse -- 'searchRounds' route
    :<|> "tournament" :> "search" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "keyword" Text :> QueryParam "subType" Text :> QueryParam "includeInactive" Bool :> QueryParam "missionTypes" Text :> QueryParam "filter" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "visibility" Text :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] MissionShortResponse -- 'searchTournaments' route
    :<|> "tournament" :> "score" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "missionId" Integer :> QueryParam "gameId" Integer :> QueryParam "packId" Integer :> QueryParam "gameLevelId" Integer :> QueryParam "scores" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'submitTournamentScore' route
    :<|> "tournament" :> "vote" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "missionId" Integer :> QueryParam "gameObjectId" Integer :> QueryParam "checkIfDeviceAlreadyVoted" Bool :> Verb 'POST 200 '[JSON] SirqulResponse -- 'submitTournamentVote' route
    :<|> "tournament" :> "substitute" :> QueryParam "accountId" Integer :> QueryParam "missionId" Integer :> QueryParam "packId" Integer :> QueryParam "gameLevelId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'substituteTournamentPlayer' route
    :<|> "tournament" :> "update" :> QueryParam "accountId" Integer :> QueryParam "missionId" Integer :> QueryParam "title" Text :> QueryParam "subType" Text :> QueryParam "imageAssetId" Integer :> QueryParam "secondsBetweenLevels" Int :> QueryParam "secondsForTieBreaker" Int :> QueryParam "secondsBetweenPacks" Int :> QueryParam "maximumLevelLength" Int :> QueryParam "costToPlay" Int :> QueryParam "costToPlayType" Text :> QueryParam "minimumToPlay" Int :> QueryParam "startingLimit" Int :> QueryParam "availableLimit" Int :> QueryParam "description" Text :> QueryParam "metaData" Text :> QueryParam "startDate" Integer :> QueryParam "audienceIds" Text :> QueryParam "active" Bool :> QueryParam "enableBuyBack" Bool :> QueryParam "offerIds" Text :> QueryParam "offerAssetId" Integer :> QueryParam "fixedReward" Bool :> QueryParam "splitReward" Text :> QueryParam "allocateTickets" Bool :> QueryParam "tournamentData" Text :> QueryParam "visibility" Text :> QueryParam "preliminaryGroups" Int :> QueryParam "preliminaryGroupAdvancements" Text :> QueryParam "enableMultipleEntries" Bool :> QueryParam "enableMultipleVotes" Bool :> QueryParam "featured" Bool :> QueryParam "winnerTag" Text :> QueryParam "tieTag" Text :> Verb 'POST 200 '[JSON] TournamentResponse -- 'updateTournament' route
    :<|> "tracking" :> "batch" :> "create" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "data" Text :> QueryParam "generateAccounts" Bool :> QueryParam "updateAccountLocations" Bool :> QueryParam "defaultTag" Text :> QueryParam "slaveUID" Text :> Verb 'POST 200 '[JSON] [Leg] -- 'batchSaveTracking' route
    :<|> "tracking" :> "predicted" :> "get" :> QueryParam "accountId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "dateCheck" Integer :> QueryParam "hourCheck" Text :> QueryParam "threshold" Integer :> QueryParam "distanceUnit" Text :> QueryParam "searchRange" Double :> QueryParam "sortOrder" Text :> Verb 'GET 200 '[JSON] PredictedLocationResponse -- 'getPredictedLocations' route
    :<|> "tracking" :> "path" :> "get" :> QueryParam "accountId" Integer :> QueryParam "startStepId" Integer :> QueryParam "endStepId" Integer :> Verb 'GET 200 '[JSON] [StepResponse] -- 'getPredictedPath' route
    :<|> "tracking" :> "preferred" :> "search" :> QueryParam "accountId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "dateCheck" Integer :> QueryParam "hourCheck" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "searchRange" Double :> QueryParam "distanceUnit" Text :> Verb 'GET 200 '[JSON] [PreferredLocationResponse] -- 'getPreferredLocations' route
    :<|> "tracking" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "ownerId" Integer :> QueryParam "trackingDeviceId" Text :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "tags" Text :> QueryParam "getLastPoint" Bool :> Verb 'GET 200 '[JSON] [LegResponse] -- 'getTrackingLegs' route
    :<|> "tracking" :> "leg" :> "create" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "distance" Double :> QueryParam "duration" Integer :> QueryParam "startLat" Double :> QueryParam "startLng" Double :> QueryParam "startDate" Integer :> QueryParam "endLat" Double :> QueryParam "endLng" Double :> QueryParam "endDate" Integer :> QueryParam "steps" Text :> QueryParam "tags" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'saveTrackingLeg' route
    :<|> "tracking" :> "step" :> "create" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "legId" Integer :> QueryParam "distance" Double :> QueryParam "duration" Integer :> QueryParam "startLat" Double :> QueryParam "startLng" Double :> QueryParam "startDate" Integer :> QueryParam "endLat" Double :> QueryParam "endLng" Double :> QueryParam "endDate" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'saveTrackingStep' route
    :<|> "tracking" :> "list" :> QueryParam "accountId" Integer :> QueryParam "keyword" Text :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "tags" Text :> QueryParam "audienceIds" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "range" Double :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "activeOnly" Bool :> Verb 'GET 200 '[JSON] [AccountMiniResponse] -- 'searchAccountsWithTrackingLegs' route
    :<|> "tracking" :> "searchByBillable" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "trackingDeviceId" Text :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "tags" Text :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] [LegResponse] -- 'searchTrackingLegs' route
    :<|> "trigger" :> "create" :> QueryParam "accountId" Integer :> QueryParam "name" Text :> QueryParam "appKey" Text :> QueryParam "groupingId" Text :> QueryParam "endpointURL" Text :> QueryParam "payload" Text :> QueryParam "scheduledDate" Integer :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "cronExpression" Text :> QueryParam "conditionalInput" Text :> QueryParam "visibility" Text :> QueryParam "active" Bool :> Verb 'POST 200 '[JSON] TriggerResponse -- 'createTrigger' route
    :<|> "trigger" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "triggerId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteTrigger' route
    :<|> "trigger" :> "get" :> QueryParam "accountId" Integer :> QueryParam "triggerId" Integer :> Verb 'GET 200 '[JSON] TriggerResponse -- 'getTrigger' route
    :<|> "trigger" :> "search" :> QueryParam "accountId" Integer :> QueryParam "groupingId" Text :> QueryParam "filter" Text :> QueryParam "statuses" Text :> QueryParam "templateTypes" Text :> QueryParam "appKey" Text :> QueryParam "keyword" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "activeOnly" Bool :> Verb 'GET 200 '[JSON] [TriggerResponse] -- 'searchTriggers' route
    :<|> "trigger" :> "update" :> QueryParam "triggerId" Integer :> QueryParam "accountId" Integer :> QueryParam "name" Text :> QueryParam "appKey" Text :> QueryParam "groupingId" Text :> QueryParam "endpointURL" Text :> QueryParam "payload" Text :> QueryParam "scheduledDate" Integer :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "cronExpression" Text :> QueryParam "conditionalInput" Text :> QueryParam "visibility" Text :> QueryParam "active" Bool :> Verb 'POST 200 '[JSON] TriggerResponse -- 'updateTrigger' route
    :<|> "trip" :> ReqBody '[JSON] Trip :> Verb 'POST 200 '[JSON] Trip -- 'createTrip' route
    :<|> "trip" :> Capture "id" Integer :> Verb 'DELETE 200 '[JSON] NoContent -- 'delete' route
    :<|> "trip" :> Capture "id" Integer :> "drive" :> QueryParam "recurrence" Bool :> Verb 'POST 200 '[JSON] Trip -- 'driveTrip' route
    :<|> "trip" :> Capture "id" Integer :> "flexible" :> QueryParam "recurrence" Bool :> Verb 'POST 200 '[JSON] Trip -- 'flexibleTrip' route
    :<|> "trip" :> Capture "id" Integer :> Verb 'GET 200 '[JSON] Trip -- 'getTrip' route
    :<|> "trip" :> Capture "id" Integer :> "match" :> QueryParam "matchedHasRoute" Bool :> QueryParam "matchedHasDriver" Bool :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "activeOnly" Bool :> Verb 'GET 200 '[JSON] [Trip] -- 'getTripMatches' route
    :<|> "trip" :> "match" :> "process" :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "tripId" Integer :> Verb 'POST 200 '[JSON] [Trip] -- 'processTripMatches' route
    :<|> "trip" :> Capture "id" Integer :> "ride" :> QueryParam "recurrence" Bool :> Verb 'POST 200 '[JSON] Trip -- 'ride' route
    :<|> "trip" :> QueryParam "accountId" Integer :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "hasNotifications" Bool :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "activeOnly" Bool :> Verb 'GET 200 '[JSON] [Trip] -- 'search' route
    :<|> "trip" :> "match" :> QueryParam "accountId" Integer :> QueryParam "startDate" Integer :> QueryParam "endDate" Integer :> QueryParam "matchedHasRoute" Bool :> QueryParam "matchedHasDriver" Bool :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "activeOnly" Bool :> Verb 'GET 200 '[JSON] [Trip] -- 'searchTrips' route
    :<|> "trip" :> Capture "id" Integer :> "locations" :> ReqBody '[JSON] Trip :> Verb 'POST 200 '[JSON] Trip -- 'updateLocations' route
    :<|> "trip" :> Capture "id" Integer :> "locations" :> "recurrence" :> ReqBody '[JSON] Trip :> Verb 'POST 200 '[JSON] [Trip] -- 'updateRecurrenceLocations' route
    :<|> "trip" :> Capture "id" Integer :> "shipments" :> "recurrence" :> ReqBody '[JSON] Trip :> Verb 'POST 200 '[JSON] [Trip] -- 'updateRecurrenceShipments' route
    :<|> "trip" :> Capture "id" Integer :> "shipments" :> ReqBody '[JSON] Trip :> Verb 'POST 200 '[JSON] Trip -- 'updateShipments' route
    :<|> "trip" :> Capture "id" Integer :> ReqBody '[JSON] Trip :> Verb 'PUT 200 '[JSON] Trip -- 'updateTrip' route
    :<|> "trip" :> "notifications" :> QueryParam "id" Integer :> QueryParam "notifications" Text :> Verb 'POST 200 '[JSON] Trip -- 'updateTripNotifications' route
    :<|> "sms" :> "buyoffer" :> Capture "appKey" Text :> QueryParam "Body" Text :> QueryParam "From" Text :> QueryParam "currencyType" Text :> Verb 'POST 200 '[JSON] TwiMLResponse -- 'smsBuyOffer' route
    :<|> "twitter" :> "authorize" :> QueryParam "appKey" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'authorizeTwitter' route
    :<|> "twitter" :> "login" :> QueryParam "deviceId" Text :> QueryParam "accessToken" Text :> QueryParam "accessTokenSecret" Text :> QueryParam "appKey" Text :> QueryParam "responseFilters" Text :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] ProfileResponse -- 'loginTwitter' route
    :<|> "consumer" :> "permissions" :> "add" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "permissionableType" Text :> QueryParam "permissionableId" Integer :> QueryParam "read" Bool :> QueryParam "write" Bool :> QueryParam "delete" Bool :> QueryParam "add" Bool :> QueryParam "connectionIds" Text :> QueryParam "connectionAccountIds" Text :> QueryParam "connectionGroupIds" Text :> QueryParam "pending" Bool :> QueryParam "admin" Bool :> QueryParam "includeFriendGroup" Bool :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "audienceIds" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'addUsersToPermissionable' route
    :<|> "permissionable" :> "approve" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "permissionableType" Text :> QueryParam "permissionableId" Integer :> QueryParam "approvalStatus" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'approvePermissionable' route
    :<|> "consumer" :> "permissions" :> "leave" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "permissionableType" Text :> QueryParam "permissionableId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> Verb 'POST 200 '[JSON] SirqulResponse -- 'leaveFromPermissionable' route
    :<|> "consumer" :> "permissions" :> "remove" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "permissionableType" Text :> QueryParam "permissionableId" Integer :> QueryParam "connectionIds" Text :> QueryParam "connectionAccountIds" Text :> QueryParam "connectionGroupIds" Text :> QueryParam "removeFriendGroup" Bool :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "audienceIds" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'removeUsersFromPermissionable' route
    :<|> "permissions" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "connectionAccountId" Integer :> QueryParam "connectionAccountIds" Text :> QueryParam "permissionableType" Text :> QueryParam "permissionableId" Integer :> QueryParam "keyword" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "pending" Bool :> QueryParam "admin" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] [UserPermissionsResponse] -- 'searchPermissionables' route
    :<|> "permissions" :> "distancesearch" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "connectionAccountId" Integer :> QueryParam "connectionAccountIds" Text :> QueryParam "permissionableType" Text :> QueryParam "permissionableId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "searchRange" Double :> QueryParam "keyword" Text :> QueryParam "pending" Bool :> QueryParam "admin" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] [UserPermissionsResponse] -- 'searchPermissionablesFollowingDistance' route
    :<|> "vatom" :> "me" :> "rels" :> "following" :> "create" :> QueryParam "accountId" Integer :> QueryParam "vatomParameters" Text :> QueryParam "returnRawResponse" Bool :> Verb 'POST 200 '[JSON] NoContent -- 'createFollowing' route
    :<|> "vatom" :> "b" :> "spaces" :> "create" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "vatomParameters" Text :> QueryParam "returnRawResponse" Bool :> Verb 'POST 200 '[JSON] NoContent -- 'createSpace' route
    :<|> "vatom" :> "b" :> "events" :> "create" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "vatomParameters" Text :> QueryParam "returnRawResponse" Bool :> Verb 'POST 200 '[JSON] NoContent -- 'createVatomEvent' route
    :<|> "vatom" :> "me" :> "rels" :> "following" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "vatomRelsKey" Text :> QueryParam "returnRawResponse" Bool :> Verb 'POST 200 '[JSON] NoContent -- 'deleteFollowing' route
    :<|> "vatom" :> "b" :> "campaign" :> "points" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "vatomCampaignId" Text :> QueryParam "returnRawResponse" Bool :> Verb 'POST 200 '[JSON] NoContent -- 'deletePointsBalance' route
    :<|> "vatom" :> "b" :> "spaces" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "vatomSpaceId" Text :> QueryParam "returnRawResponse" Bool :> Verb 'POST 200 '[JSON] NoContent -- 'deleteSpace' route
    :<|> "vatom" :> "b" :> "events" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "vatomEventId" Text :> QueryParam "returnRawResponse" Bool :> Verb 'POST 200 '[JSON] NoContent -- 'deleteVatomEvent' route
    :<|> "vatom" :> "vatoms" :> "delete" :> QueryParam "accountId" Integer :> QueryParam "vatomId" Text :> QueryParam "returnRawResponse" Bool :> Verb 'POST 200 '[JSON] NoContent -- 'deleteVatomNFT' route
    :<|> "vatom" :> "vatoms" :> "execute-action" :> QueryParam "accountId" Integer :> QueryParam "vatomId" Text :> QueryParam "vatomParameters" Text :> QueryParam "returnRawResponse" Bool :> Verb 'POST 200 '[JSON] NoContent -- 'executeActionOnNFT' route
    :<|> "vatom" :> "vatoms" :> "geo-map" :> "search" :> QueryParam "accountId" Integer :> QueryParam "vatomParameters" Text :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'geomapSearch' route
    :<|> "vatom" :> "b" :> "behaviors" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'getBusinessBehaviors' route
    :<|> "vatom" :> "b" :> "coins" :> "get" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'getBusinessCoinsBalance' route
    :<|> "vatom" :> "me" :> "businesses" :> QueryParam "accountId" Integer :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'getBusinessIds' route
    :<|> "vatom" :> "b" :> "get" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "vatomParameters" Text :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'getBusinessInfo' route
    :<|> "vatom" :> "b" :> "users" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'getBusinessUsers' route
    :<|> "vatom" :> "b" :> "campaign-groups" :> "entities" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "vatomCampaignId" Text :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'getCampaignGroupEntities' route
    :<|> "vatom" :> "b" :> "campaign-groups" :> "rules" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "vatomCampaignId" Text :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'getCampaignGroupRules' route
    :<|> "vatom" :> "b" :> "campaign-groups" :> "stats" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "vatomCampaignId" Text :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'getCampaignGroupStats' route
    :<|> "vatom" :> "b" :> "campaign-groups" :> "get" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "vatomCampaignId" Text :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'getCampaignInfo' route
    :<|> "vatom" :> "b" :> "events" :> "guests" :> "get" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "vatomEventId" Text :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'getEventGuestList' route
    :<|> "vatom" :> "me" :> "inventory" :> QueryParam "accountId" Integer :> QueryParam "vatomParameters" Text :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'getInventory' route
    :<|> "vatom" :> "me" :> "rels" :> "following" :> QueryParam "accountId" Integer :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'getMyFollowing' route
    :<|> "vatom" :> "u" :> "campaign" :> "points" :> "get" :> QueryParam "accountId" Integer :> QueryParam "vatomUserId" Text :> QueryParam "vatomCampaignId" Text :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'getPointsBalance' route
    :<|> "vatom" :> "b" :> "campaign" :> "u" :> "points" :> "get" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "vatomUserId" Text :> QueryParam "vatomCampaignId" Text :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'getPointsBalanceAsBusiness' route
    :<|> "vatom" :> "b" :> "spaces" :> "get" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "vatomSpaceId" Text :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'getSpace' route
    :<|> "vatom" :> "b" :> "users" :> "coins" :> "get" :> QueryParam "accountId" Integer :> QueryParam "vatomUserId" Text :> QueryParam "appKey" Text :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'getUserCoinsAsBusiness' route
    :<|> "vatom" :> "u" :> "coins" :> "get" :> QueryParam "accountId" Integer :> QueryParam "vatomUserId" Text :> QueryParam "vatomParameters" Text :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'getUserCoinsBalance' route
    :<|> "vatom" :> "users" :> "rels" :> "followers" :> QueryParam "accountId" Integer :> QueryParam "vatomUserId" Text :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'getUserFollowers' route
    :<|> "vatom" :> "users" :> "rels" :> "following" :> QueryParam "accountId" Integer :> QueryParam "vatomUserId" Text :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'getUserFollowing' route
    :<|> "vatom" :> "user" :> "get" :> QueryParam "accountId" Integer :> QueryParam "vatomUserId" Text :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'getUserInfo' route
    :<|> "vatom" :> "me" :> "get" :> QueryParam "accountId" Integer :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'getUserProfile' route
    :<|> "vatom" :> "b" :> "events" :> "get" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "vatomEventId" Text :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'getVatomEvent' route
    :<|> "vatom" :> "vatoms" :> "get" :> QueryParam "accountId" Integer :> QueryParam "vatomId" Text :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'getVatomNFT' route
    :<|> "vatom" :> "b" :> "communities" :> "search" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "vatomParameters" Text :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'listCommunities' route
    :<|> "vatom" :> "b" :> "events" :> "search" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "vatomParameters" Text :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'listEvents' route
    :<|> "vatom" :> "b" :> "spaces" :> "search" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "vatomParameters" Text :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'listSpaces' route
    :<|> "vatom" :> "u" :> "coins" :> "txns" :> "search" :> QueryParam "accountId" Integer :> QueryParam "vatomUserId" Text :> QueryParam "vatomParameters" Text :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'listUserCoinTransactions' route
    :<|> "vatom" :> "b" :> "users" :> "coins" :> "txns" :> "search" :> QueryParam "accountId" Integer :> QueryParam "vatomUserId" Text :> QueryParam "appKey" Text :> QueryParam "vatomParameters" Text :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'listUserCoinTransactionsAsBusiness' route
    :<|> "vatom" :> "me" :> "vatoms" :> "actions" :> QueryParam "accountId" Integer :> QueryParam "vatomId" Text :> QueryParam "vatomAction" Text :> QueryParam "vatomParameters" Text :> QueryParam "returnRawResponse" Bool :> Verb 'POST 200 '[JSON] NoContent -- 'performActionOnNFT' route
    :<|> "vatom" :> "b" :> "redemptions" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "vatomParameters" Text :> QueryParam "returnRawResponse" Bool :> Verb 'POST 200 '[JSON] NoContent -- 'redeemNFT' route
    :<|> "vatom" :> "b" :> "users" :> "coins" :> "redeem" :> QueryParam "accountId" Integer :> QueryParam "vatomUserId" Text :> QueryParam "appKey" Text :> QueryParam "vatomParameters" Text :> QueryParam "returnRawResponse" Bool :> Verb 'POST 200 '[JSON] NoContent -- 'redeemUserCoinsAsBusiness' route
    :<|> "vatom" :> "b" :> "search" :> QueryParam "accountId" Integer :> QueryParam "vatomParameters" Text :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'searchBusinesses' route
    :<|> "vatom" :> "b" :> "campaign-groups" :> "search" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'searchCampaignGroups' route
    :<|> "vatom" :> "me" :> "identities" :> "search" :> QueryParam "accountId" Integer :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'searchIdentities' route
    :<|> "vatom" :> "user-inventory" :> "search" :> QueryParam "accountId" Integer :> QueryParam "vatomParameters" Text :> QueryParam "returnRawResponse" Bool :> Verb 'GET 200 '[JSON] NoContent -- 'searchInventory' route
    :<|> "vatom" :> "b" :> "campaigns" :> "send" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "vatomCampaignId" Text :> QueryParam "vatomParameters" Text :> QueryParam "returnRawResponse" Bool :> Verb 'POST 200 '[JSON] NoContent -- 'sendNFT' route
    :<|> "vatom" :> "b" :> "campaign" :> "u" :> "points" :> "update" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "vatomUserId" Text :> QueryParam "vatomCampaignId" Text :> QueryParam "vatomParameters" Text :> QueryParam "returnRawResponse" Bool :> Verb 'POST 200 '[JSON] NoContent -- 'setPointsBalanceAsBusiness' route
    :<|> "vatom" :> "u" :> "coins" :> "transfer" :> QueryParam "accountId" Integer :> QueryParam "vatomUserId" Text :> QueryParam "vatomParameters" Text :> QueryParam "returnRawResponse" Bool :> Verb 'POST 200 '[JSON] NoContent -- 'transferUserCoins' route
    :<|> "vatom" :> "b" :> "coins" :> "update" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "vatomParameters" Text :> QueryParam "returnRawResponse" Bool :> Verb 'POST 200 '[JSON] NoContent -- 'updateBusinessCoins' route
    :<|> "vatom" :> "b" :> "events" :> "guests" :> "update" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "vatomEventId" Text :> QueryParam "vatomParameters" Text :> QueryParam "returnRawResponse" Bool :> Verb 'POST 200 '[JSON] NoContent -- 'updateEventGuestList' route
    :<|> "vatom" :> "b" :> "spaces" :> "update" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "vatomSpaceId" Text :> QueryParam "vatomParameters" Text :> QueryParam "returnRawResponse" Bool :> Verb 'POST 200 '[JSON] NoContent -- 'updateSpace' route
    :<|> "vatom" :> "b" :> "users" :> "coins" :> "update" :> QueryParam "accountId" Integer :> QueryParam "vatomUserId" Text :> QueryParam "appKey" Text :> QueryParam "vatomParameters" Text :> QueryParam "returnRawResponse" Bool :> Verb 'POST 200 '[JSON] NoContent -- 'updateUserCoinsAsBusiness' route
    :<|> "vatom" :> "me" :> "update" :> QueryParam "accountId" Integer :> QueryParam "vatomParameters" Text :> QueryParam "returnRawResponse" Bool :> Verb 'POST 200 '[JSON] NoContent -- 'updateUserProfile' route
    :<|> "vatom" :> "b" :> "events" :> "update" :> QueryParam "accountId" Integer :> QueryParam "appKey" Text :> QueryParam "vatomEventId" Text :> QueryParam "vatomParameters" Text :> QueryParam "returnRawResponse" Bool :> Verb 'POST 200 '[JSON] NoContent -- 'updateVatomEvent' route
    :<|> "vehicle" :> QueryParam "vehicle" Text :> ReqBody '[JSON] Vehicle :> Verb 'POST 200 '[JSON] Vehicle -- 'createVehicle' route
    :<|> "vehicle" :> Capture "id" Integer :> Verb 'DELETE 200 '[JSON] NoContent -- 'deleteVehicle' route
    :<|> "vehicle" :> Capture "id" Integer :> Verb 'GET 200 '[JSON] Vehicle -- 'getVehicle' route
    :<|> "vehicle" :> QueryParam "hubId" Integer :> QueryParam "keyword" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "activeOnly" Bool :> Verb 'GET 200 '[JSON] [Vehicle] -- 'searchVehicle' route
    :<|> "vehicle" :> Capture "id" Integer :> QueryParam "vehicle" Text :> ReqBody '[JSON] Vehicle :> Verb 'PUT 200 '[JSON] Vehicle -- 'updateVehicle' route
    :<|> "vehicle" :> "type" :> QueryParam "vehicleType" Text :> ReqBody '[JSON] VehicleType :> Verb 'POST 200 '[JSON] VehicleType -- 'createVehicleType' route
    :<|> "vehicle" :> "type" :> Capture "vehicleTypeId" Integer :> Verb 'DELETE 200 '[JSON] NoContent -- 'deleteVehicleType' route
    :<|> "vehicle" :> "type" :> Capture "vehicleTypeId" Integer :> Verb 'GET 200 '[JSON] VehicleType -- 'getVehicleType' route
    :<|> "vehicle" :> "type" :> QueryParam "retailerId" Integer :> QueryParam "hubId" Integer :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "activeOnly" Bool :> Verb 'GET 200 '[JSON] [VehicleType] -- 'searchVehicleTypes' route
    :<|> "vehicle" :> "type" :> Capture "vehicleTypeId" Integer :> QueryParam "vehicleType" Text :> ReqBody '[JSON] VehicleType :> Verb 'PUT 200 '[JSON] VehicleType -- 'updateVehicleType' route
    :<|> "wallet" :> "create" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "offerId" Integer :> QueryParam "offerLocationId" Integer :> QueryParam "offerCart" Text :> QueryParam "promoCode" Text :> QueryParam "currencyType" Text :> QueryParam "usePoints" Bool :> QueryParam "metaData" Text :> QueryParam "appKey" Text :> QueryParam "status" Int :> Verb 'POST 200 '[JSON] [OfferTransactionResponse] -- 'createOfferTransaction' route
    :<|> "wallet" :> "delete" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "transactionId" Integer :> Verb 'POST 200 '[JSON] SirqulResponse -- 'deleteOfferTransaction' route
    :<|> "wallet" :> "get" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "transactionId" Integer :> QueryParam "includeMission" Bool :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "returnFullResponse" Bool :> Verb 'GET 200 '[JSON] OfferTransactionResponse -- 'getOfferTransaction' route
    :<|> "wallet" :> "preview" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "offerId" Integer :> QueryParam "offerLocationId" Integer :> QueryParam "offerCart" Text :> QueryParam "promoCode" Text :> QueryParam "currencyType" Text :> QueryParam "usePoints" Bool :> QueryParam "metaData" Text :> QueryParam "appKey" Text :> Verb 'POST 200 '[JSON] [OfferTransactionResponse] -- 'previewOfferTransaction' route
    :<|> "wallet" :> "search" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "keyword" Text :> QueryParam "retailerId" Integer :> QueryParam "retailerIds" Text :> QueryParam "retailerLocationId" Integer :> QueryParam "retailerLocationIds" Text :> QueryParam "excludeRetailerLocationIds" Text :> QueryParam "offerId" Integer :> QueryParam "offerIds" Text :> QueryParam "offerLocationId" Integer :> QueryParam "offerLocationIds" Text :> QueryParam "offerType" Text :> QueryParam "offerTypes" Text :> QueryParam "specialOfferType" Text :> QueryParam "specialOfferTypes" Text :> QueryParam "categoryIds" Text :> QueryParam "filterIds" Text :> QueryParam "offerAudienceIds" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "redeemableStartDate" Integer :> QueryParam "redeemableEndDate" Integer :> QueryParam "filterByParentOffer" Bool :> QueryParam "startedSince" Integer :> QueryParam "startedBefore" Integer :> QueryParam "endedSince" Integer :> QueryParam "endedBefore" Integer :> QueryParam "redeemed" Bool :> QueryParam "statuses" Text :> QueryParam "reservationsOnly" Bool :> QueryParam "activeOnly" Bool :> QueryParam "returnFullResponse" Bool :> QueryParam "recurringStartedSince" Integer :> QueryParam "recurringStartedBefore" Integer :> QueryParam "recurringExpirationSince" Integer :> QueryParam "recurringExpirationBefore" Integer :> Verb 'GET 200 '[JSON] [OfferTransactionResponse] -- 'searchOfferTransactions' route
    :<|> "wallet" :> "update" :> QueryParam "deviceId" Text :> QueryParam "accountId" Integer :> QueryParam "transactionId" Integer :> QueryParam "offerLocationId" Integer :> QueryParam "currencyType" Text :> QueryParam "usePoints" Bool :> QueryParam "appKey" Text :> QueryParam "status" Int :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "metaData" Text :> QueryParam "returnFullResponse" Bool :> QueryParam "exceptionMembershipOfferIds" Text :> Verb 'POST 200 '[JSON] OfferTransactionResponse -- 'updateOfferTransaction' route
    :<|> "weather" :> "search" :> QueryParam "regionId" Integer :> QueryParam "latitude" Double :> QueryParam "longitude" Double :> QueryParam "timezoneOffset" Integer :> Verb 'GET 200 '[JSON] WeatherResponse -- 'searchWeather' route
    :<|> "game" :> "word" :> "create" :> QueryParam "accountId" Integer :> QueryParam "word" Text :> QueryParam "definition" Text :> QueryParam "assetId" Integer :> QueryParam "active" Bool :> QueryParam "allocateTickets" Bool :> QueryParam "ticketCount" Integer :> QueryParam "ticketType" Text :> QueryParam "points" Integer :> Verb 'POST 200 '[JSON] WordzWordResponse -- 'createWord' route
    :<|> "game" :> "word" :> "delete" :> QueryParam "wordId" Integer :> QueryParam "accountId" Integer :> Verb 'DELETE 200 '[JSON] SirqulResponse -- 'deleteWord' route
    :<|> "game" :> "word" :> "get" :> QueryParam "wordId" Integer :> QueryParam "accountId" Integer :> Verb 'GET 200 '[JSON] WordzWordResponse -- 'getWord' route
    :<|> "game" :> "word" :> "search" :> QueryParam "accountId" Integer :> QueryParam "keyword" Text :> QueryParam "sortField" Text :> QueryParam "descending" Bool :> QueryParam "activeOnly" Bool :> QueryParam "start" Int :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] [WordzWordResponse] -- 'getWords' route
    :<|> "game" :> "word" :> "update" :> QueryParam "wordId" Integer :> QueryParam "accountId" Integer :> QueryParam "wordText" Text :> QueryParam "definition" Text :> QueryParam "assetId" Integer :> QueryParam "active" Bool :> QueryParam "allocateTickets" Bool :> QueryParam "ticketCount" Integer :> QueryParam "ticketType" Text :> QueryParam "points" Integer :> Verb 'POST 200 '[JSON] WordzWordResponse -- 'updateWord' route
    :<|> "workflow" :> "run" :> QueryParam "accountId" Integer :> QueryParam "workflowId" Integer :> QueryParam "skuId" Integer :> QueryParam "versionCode" Int :> QueryParam "parameters" Text :> Verb 'POST 200 '[JSON] SirqulResponse -- 'runWorkflow' route
    :<|> Raw


-- | Server or client configuration, specifying the host and port to query or serve on.
data Config = Config
  { configUrl :: String  -- ^ scheme://hostname:port/path, e.g. "http://localhost:8080/"
  } deriving (Eq, Ord, Show, Read)


-- | Custom exception type for our errors.
newtype SirqulIoTPlatformClientError = SirqulIoTPlatformClientError ClientError
  deriving (Show, Exception)
-- | Configuration, specifying the full url of the service.


-- | Backend for SirqulIoTPlatform.
-- The backend can be used both for the client and the server. The client generated from the SirqulIoTPlatform OpenAPI spec
-- is a backend that executes actions by sending HTTP requests (see @createSirqulIoTPlatformClient@). Alternatively, provided
-- a backend, the API can be served using @runSirqulIoTPlatformMiddlewareServer@.
data SirqulIoTPlatformBackend a m = SirqulIoTPlatformBackend
  { consumerCreate :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Bool -> m QueueResponse{- ^ Create a connection to an existing amqp queue and register as a consumer. -}
  , consumerUpdate :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Bool -> m QueueResponse{- ^ Update an existing amqp queue's data mapping. -}
  , queueCreate :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> m QueueResponse{- ^ Create a basic AMQP queue. If the username and password and virtual host is not sepcified, the queue will be created on the virtual host assigned to the application. -}
  , queueDelete :: Maybe Text -> Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Delete the stored queue record and close any active connections to the AMQP servers. -}
  , queueGet :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m QueueResponse{- ^ Get the stored queue record. Must supply the queueId, or the name and hostname and virtualHost, or the name and appKey to find the record. -}
  , queuePublish :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m SirqulResponse{- ^ Publish a message to a stored queue. Must supply the queueId, or the name and hostname and virtualHost, or the name and appKey to find the record. -}
  , queueSearch :: Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Int -> Maybe Int -> m QueueResponse{- ^ Get the queues setup for the BillableEntity's applications. -}
  , queueUpdate :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> m QueueResponse{- ^ Update the basic AMQP queue. -}
  , accountLocationSearch :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Double -> Maybe Integer -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Integer -> Maybe Bool -> Maybe Bool -> m UserLocationSearchResponse{- ^ Search accounts by their location. This only searches on users that have location data. Use ConnectionApi to perform a regular search on accounts. -}
  , blockAccount :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Bool -> Maybe Bool -> Maybe Double -> Maybe Double -> m SirqulResponse{- ^ Moves or removes an account into the user's blocked group. -}
  , createAccount :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Double -> Maybe Bool -> Maybe Text -> Maybe Integer -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Integer -> m AccountLoginResponse{- ^ Create a new account by role. -}
  , editAccount :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Text -> m ProfileInfoResponse{- ^ Edit the user's profile information -}
  , editUsername :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> m SirqulResponse{- ^ Update account's own username and/or emailAddress -}
  , getAccount :: Maybe Bool -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Double -> Maybe Double -> m ProfileResponse{- ^ Gets a user's account profile. Application settings and account settings will also be returned for the owner of the account. -}
  , getProfileAssets :: Maybe Bool -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Double -> Maybe Double -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> m AssetListResponse{- ^ Get a list of assets a person has ever uploaded. Filters the list based on parameters. -}
  , getReferralList :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Double -> Maybe Double -> Maybe Double -> Maybe Double -> Maybe Double -> Maybe Bool -> m NoContent{- ^ Gets a user's account profile and their referral List. -}
  , getSettings :: Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Double -> m UserSettingsResponse{- ^ Get the account settings for a user -}
  , loginDelegate :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Double -> Maybe Double -> m ProfileResponse{- ^ A login service that supports logging in as someone else (accounts that the user manages). Intended for internal use for now. -}
  , loginGeneral :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Bool -> Maybe Integer -> Maybe Integer -> m ProfileResponse{- ^ General login service that supports various authentication methods. Currently supports Facebook, Twitter, Sirqul Username, and Sirqul Phone by default. Can also support custom networks created using the {@link ThirdPartyApi} -}
  , loginUsername :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> m ProfileResponse{- ^ Login to system with an account -}
  , logout :: Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Double -> m SirqulResponse{- ^ Cleans up the users data for logging out. -}
  , mergeAccount :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> m SirqulResponse{- ^ Merges the analytics, achievements, leaderboards of two accounts. -}
  , passwordChange :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> m SirqulResponse{- ^ Update the account password. -}
  , passwordReset :: Maybe Text -> Maybe Text -> Maybe Text -> m SirqulResponse{- ^ Reset the account password. The token must be valid and not expired. Use the RequestPasswordReset end point to request a token. -}
  , requestPasswordReset :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m SirqulResponse{- ^ Request that an account password be reset. The account is looked up by email address and then a link is sent via email to that account with a reset token. The token is valid for 24 hours. -}
  , requestValidateAccount :: Maybe Integer -> m SirqulResponse{- ^ Send an email to validate a user's account. -}
  , searchAccounts :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Bool -> m [ProfileResponse]{- ^ Search for account profiles. -}
  , secureLogin :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Bool -> Maybe Text -> m ProfileResponse{- ^ ogin with encrypted user-name and password. -}
  , secureSignup :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Double -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m ProfileInfoResponse{- ^ Create a new account by role (with encrypted user-name and password) -}
  , setMatchToken :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> m SirqulResponse{- ^ Save user's match token to be used for profile match making -}
  , updateActveStatus :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Bool -> m SirqulResponse{- ^ Activate or deactivate an account (requires appropriate permissions). -}
  , updateLocation :: Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Double -> Maybe Integer -> m SirqulResponse{- ^ Update the account location -}
  , updateSettings :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Double -> Maybe Double -> m UserSettingsResponse{- ^ Update the account settings for a user -}
  , validateAccountSignup :: Maybe Text -> m AccountLoginResponse{- ^ Validate the account's email address. The token must be valid and not expired. Use the RequestValidateAccount end point to request a new token. -}
  , validatePasswordReset :: Maybe Text -> m SirqulResponse{- ^ Validate the password reset token. The token must be valid and not expired. Use the RequestPasswordReset end point to request a token. The user receives and email with the reset page, therefore it should be validated before bwing used to reset the password. -}
  , achievementTierSearchPost :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Integer -> Maybe Integer -> m AchievementTierResponse{- ^ Searches a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for. -}
  , createAchievement :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Bool -> Maybe Bool -> Maybe Text -> m AchievementResponse{- ^ Updates an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for. -}
  , createAchievementTier :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe FilePath -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Int -> Maybe Bool -> m AchievementTierResponse{- ^ Create a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for. -}
  , deleteAchievement :: Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Deletes an achievement (for developer/retailer use). User must have permissions to the application the achievement was created for. -}
  , deleteAchievementTier :: Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Deletes an achievement tier (for developer/retailer use). User must have permissions to the application the achievement was created for. -}
  , getAchievement :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> m AchievementTierResponse{- ^ Get an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for. -}
  , getAchievementTier :: Maybe Integer -> Maybe Integer -> m AchievementTierResponse{- ^ Gets an achievement tier (for developer/retailer use). User must have permissions to the application the achievement is created for. -}
  , getUserAchievements :: Maybe Bool -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Double -> Maybe Double -> m [AchievementProgressResponse]{- ^ Gets a list of user achievements. -}
  , listAchievementTags :: Maybe Text -> m SirqulResponse{- ^ List achievement tags by application -}
  , listAchievements :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Bool -> m [AchievementShortResponse]{- ^ List achievements by billable. -}
  , searchAchievements :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Int -> Maybe Int -> m [AchievementShortResponse]{- ^ Searches achievements by application for consumers. -}
  , updateAchievement :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Bool -> Maybe Int -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> m AchievementResponse{- ^ Updates an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for. -}
  , updateAchievementTier :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe FilePath -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Bool -> m AchievementTierResponse{- ^ Updates a tier of an achievement (for developer/retailer use). User must have permissions to the application the achievement is created for. -}
  , updateUserAchievement :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Bool -> m SirqulResponse{- ^ Update user achievement progress. -}
  , createEntityReference :: EntityReference -> m ActivityResponse{- ^ Creates a reference for an entity for syncing data between servers. -}
  , addAlbumCollection :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe FilePath -> Maybe Text -> Maybe Integer -> Maybe FilePath -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> m SearchResponse{- ^ Create an Album. -}
  , addAlbumUsers :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Bool -> m SirqulResponse{- ^ Add users to an album as participants. -}
  , approveAlbum :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Bool -> m SirqulResponse{- ^ Sets the approval status of an Album. -}
  , getAlbumCollection :: Maybe Bool -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> m AlbumFullResponse{- ^ Get an Album. -}
  , leaveAlbum :: Maybe Text -> Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^  Allows a user to leave an album (they are no longer considered a participant). The album creator cannot leave their own albums. -}
  , removeAlbum :: Maybe Text -> Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Deletes an Album -}
  , removeAlbumUsers :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> m SirqulResponse{- ^ Remove participants of an album. -}
  , searchAlbums :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Double -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Bool -> Maybe Integer -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Bool -> Maybe Text -> Maybe Bool -> m [AlbumFullResponse]{- ^ Searches on Albums. -}
  , updateAlbumCollection :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe FilePath -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Bool -> m AlbumResponse{- ^ Update an Album. -}
  , activities :: Maybe Int -> Maybe Int -> Maybe Integer -> m [UserActivityResponse]{- ^ Get an activity feed by user. -}
  , aggregatedFilteredUsage :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Double -> Maybe Double -> m ChartData{- ^ Query analytics to get data used for nested graphs and charts -}
  , filteredUsage :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Double -> Maybe Double -> m ChartData{- ^ Query analytics to get data used for graphs and charts -}
  , usage :: Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Record an analytic record for a known state within the application. -}
  , usageBatch :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> m SirqulResponse{- ^ Sends multiple analytics. Can be used to send in the user's stored usage when they did not have internet access. Should not include more than 100 items per batch. -}
  , getAppData :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Bool -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> m AppResponse{- ^ Get the application data structure.  The basic structure is a   node tree, with the root node being a AppResponse.  The response contains   the user's profile, messages from the system, and a list of MissionResponse.    A mission can have any number of GameResponses but typically is a single   game type.  A game then has any number of PackResponses which help group   the game levels. Packs are then composed of any number of GameLevelResponses.     Using the various parameters can return the applications default mission   (built-in packs to play), the list of community levels published, the user's   saved levels, or explicity levels desired.  You can choose to include the   profile or not, or just return parts of the profile.  You can also filter   out game levels that have been published with a higher version of the application. -}
  , postAppData :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Bool -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> m AppResponse{- ^ Publish the application data structure.  Can be used to save levels   and scores.  It then returns the application data structure.  The basic   structure is a node tree, with the root node being a AppResponse.  The response   contains the user's profile, messages from the system, and a list of MissionResponse.    A mission can have any number of GameResponses but typically is a single   game type.  A game then has any number of PackResponses which help group   the game levels. Packs are then composed of any number of GameLevelResponses.      Using the various parameters can return the applications default mission   (built-in packs to play), the list of community levels published, the user's   saved levels, or explicity levels desired.  You can choose to include the   profile or not, or just return parts of the profile.  You can also filter   out game levels that have been published with a higher version of the application -}
  , regenAppData :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> m SirqulResponse{- ^ Regenerate the app data cache for apps -}
  , createApplication :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Float -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Float -> Maybe Float -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Double -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Integer -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe FilePath -> Maybe Text -> Maybe Text -> Maybe FilePath -> Maybe FilePath -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m ApplicationResponse{- ^ Create an application record and one placement record for that application. You can create more placements for this application by using {@link createApplicationPlacement}. -}
  , createApplicationPlacement :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Integer -> Maybe Bool -> m PlacementResponse{- ^ Creates a new ad placement for an application. -}
  , deleteApplication :: Maybe Integer -> Maybe Text -> m SirqulResponse{- ^ Set the deleted timestamp to current time. This effectively deletes the application since all queries should ignore any records with a deleted timestamp -}
  , deleteApplicationPlacement :: Maybe Text -> Maybe Integer -> Maybe Integer -> m PlacementResponse{- ^ Deletes an ad placement for an application. -}
  , getApplication :: Maybe Text -> Maybe Integer -> m ApplicationResponse{- ^ Get a specific application by appKey -}
  , getApplicationPlacement :: Maybe Text -> Maybe Integer -> Maybe Integer -> m PlacementResponse{- ^ Get details of an ad placement -}
  , getApplicationVersions :: m SirqulResponse{- ^ Will return a comma separated list of numbers, newest first. For example: 3.0, 2.2, 2.1, 1.8 -}
  , getUniqueUsersByApp :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> m AccountListResponse{- ^ Get a list of users per application -}
  , listApplications :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Bool -> Maybe Bool -> m [ApplicationShortResponse]{- ^ List active applications matching the criteria (as a consumer) -}
  , searchApplicationPlacement :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Int -> Maybe Int -> m [PlacementResponse]{- ^ Searches placements for an application. -}
  , searchApplicationSettings :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> m ApplicationSettingsResponse{- ^ Returns a list of applications that the user has logged into before, and returns specific settings for that application and user -}
  , searchApplications :: Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Bool -> Maybe Bool -> Maybe Bool -> m [ApplicationResponse]{- ^ Search for applications matching the criteria that the logged in user has access to -}
  , updateApplication :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Float -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Float -> Maybe Float -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Double -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Integer -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe FilePath -> Maybe Text -> Maybe Text -> Maybe FilePath -> Maybe FilePath -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m ApplicationResponse{- ^ Update an application record -}
  , updateApplicationActive :: Maybe Integer -> Maybe Text -> Maybe Bool -> m SirqulResponse{- ^ Set the application's active flag to true/false. This effectively activates or deactivates the application. -}
  , updateApplicationPlacement :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Integer -> Maybe Bool -> m PlacementResponse{- ^ Updates an ad placement for an application. -}
  , uploadApplicationCertificate :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe FilePath -> m SirqulResponse{- ^ Uploads a certificate for an application that the user has access to. -}
  , createApplicationConfig :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> m ApplicationConfigResponse{- ^ Creates a new application configuration. If the configVersion provided already exists for the given app, an invalid response is returned and the application configuration won't be created. -}
  , deleteApplicationConfig :: Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Mark the application configuration for deletion. -}
  , getApplicationConfig :: Maybe Integer -> Maybe Integer -> m ApplicationConfigResponse{- ^ Gets the appConfig data by the given configId. If appConfig cannot be found, it returns an invalid response. -}
  , getApplicationConfigByConfigVersion :: Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Bool -> m ApplicationConfigResponse{- ^ Gets the appConfig data by the given appKey and app configVersion number.If the appKey is is invalid or appConfig is not found, it returns an invalid response.  -}
  , searchApplicationConfig :: Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> m [ApplicationConfigResponse]{- ^ Gets all versions of application configurations in a particular app by the given appKey. -}
  , updateApplicationConfig :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> m ApplicationConfigResponse{- ^ pdates an existing application configuration. If the configVersion provided already exists for the given app the application configuration won't be updated. -}
  , assetDownload :: Text -> m SirqulResponse{- ^ Downloads an asset from the server for assets that have been uploaded to the server. -}
  , assetMorph :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Text -> m AssetShortResponse{- ^ Converts an offer image + text into a creative image. -}
  , createAsset :: Maybe Bool -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe FilePath -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe FilePath -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> m AssetResponse{- ^ Uploads an asset to server and returns an asset id which can be used to assign to various objects. -}
  , deleteAsset :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Double -> Maybe Double -> m SirqulResponse{- ^ Delete an asset. -}
  , getAsset :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Bool -> m AssetFullResponse{- ^ Gets the full asset response including attached likes and notes. -}
  , removeAsset :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Double -> Maybe Double -> m SirqulResponse{- ^ Remove assets from collections -}
  , searchAssets :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> m [AssetResponse]{- ^ Searches for assets -}
  , updateAsset :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe FilePath -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe FilePath -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> m SirqulResponse{- ^ Updates an asset's meta data. If an album reference is passed in, the participants with write permissions are allowed to edit the asset. Otherwise, only the asset up-loader has permission to edit the data. -}
  , assigmentAssigneeAccountSearch :: Maybe Integer -> Maybe Text -> m [AccountMiniResponse]{- ^ Search for avaiable users for creating or updating assignment. -}
  , assignmentCreate :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Bool -> m AssignmentResponse{- ^ Create an assignment. -}
  , assignmentDelete :: Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Delete an assignment. -}
  , assignmentGet :: Maybe Integer -> Maybe Integer -> m AssignmentResponse{- ^ Get the details of an assignment. -}
  , assignmentSearch :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Int -> Maybe Int -> m [AssignmentResponse]{- ^ Search for assignments by the given parameters. -}
  , assignmentStatusCreate :: Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Bool -> m AssignmentStatusResponse{- ^ Create an assignment status. -}
  , assignmentStatusDelete :: Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Deletes an assignment status. -}
  , assignmentStatusGet :: Maybe Integer -> Maybe Integer -> m AssignmentStatusResponse{- ^ Get an assignment status. -}
  , assignmentStatusSearch :: Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Int -> Maybe Int -> m [AssignmentStatusResponse]{- ^ Search on assignment statuses. -}
  , assignmentStatusUpdate :: Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Bool -> m AssignmentStatusResponse{- ^ Updates an assignment status. -}
  , assignmentUpdate :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Bool -> m AssignmentResponse{- ^ Updates an assignment. -}
  , createAudience :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> m AudienceResponse{- ^ Create a user defined audience. -}
  , deleteAudience :: Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Delete an audience. The audience and account must be valid and have the appropirate permissions to view the content. -}
  , getAgeGroups :: m [AgeGroupResponse]{- ^ Gets the list of available age groups that can be selected by consumers and retailers targeting offers. -}
  , getAudience :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Text -> m AudienceResponse{- ^ Get an audience. The audience and account must be valid and have the appropriate permissions to view the content. -}
  , getAudienceList :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Text -> m [SearchResponse]{- ^ Get the list audiences owned by the account -}
  , getDevices :: Maybe Bool -> m [AudienceDeviceResponse]{- ^ Gets the list of available devices that can be selected by consumers and retailers. -}
  , getExperiences :: m SirqulResponse{- ^ Gets the list of available experiences that can be selected by consumers and retailers. -}
  , getGroupedAudiences :: Maybe Integer -> Maybe Text -> m AudienceResponse{- ^ Get a group of audiences. The audience and account must be valid and have the appropriate permissions to view the content. -}
  , listByAccount :: Maybe Integer -> Maybe Int -> Maybe Text -> m OfferListResponse{- ^ List either Missions or Offers that the user matches the assigned audience. -}
  , listByAudience :: Maybe Text -> Maybe Int -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Int -> m OfferListResponse{- ^ Get a list of offer locations based on audience information provided. -}
  , listLastestByAccount :: Maybe Integer -> Maybe Int -> Maybe Text -> m OfferListResponse{- ^ Return list of recent trigger suggestions that have been sent to the user. -}
  , sendByAccount :: Maybe Integer -> Maybe Double -> Maybe Double -> m SirqulResponse{- ^ Use the accountId to determine the associated BillableEntity. From there get a list of all triggers associated with the BillableEntity. -}
  , updateAudience :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> m AudienceResponse{- ^ Update a user defined audience. -}
  , createBid :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Double -> Maybe Double -> Maybe Text -> m BidResponse{- ^ Creates a bid on a biddable object -}
  , deleteBid :: Maybe Text -> Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Deleted a bid on a biddable object -}
  , getBid :: Maybe Text -> Maybe Integer -> Maybe Integer -> m BidResponse{- ^ Get the bid details of a biddable object -}
  , updateBid :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Double -> Maybe Double -> Maybe Double -> Maybe Text -> m BidResponse{- ^ Updates a bid on a biddable object -}
  , createBillableEntity :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m BillableEntityResponse{- ^ reate a billable entity for an account. The creator is assumed to be the responsible account. An account can only have one billable entity -}
  , deleteBillableEntity :: Maybe Text -> Maybe Integer -> m SirqulResponse{- ^ Mark the billable as deleted -}
  , getBillableEntity :: Maybe Text -> Maybe Integer -> Maybe Bool -> Maybe Bool -> m BillableEntityResponse{- ^ Used to determine the associated BillableEntity of an account -}
  , updateBillableEntity :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m BillableEntityResponse{- ^ Updates the billable record for an account -}
  , addPaymentMethod :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m PaymentTypesResponse{- ^ Update a method of payment. If the paymentMethodId is not passed in then will update their default payment method. -}
  , createPaymentMethod :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m PaymentTypesResponse{- ^ Add a new method of payment. -}
  , createSmartContract :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> m PaymentTypesResponse{- ^ Adds a smart contract. -}
  , getCryptoBalance :: Maybe Integer -> Maybe Integer -> Maybe Integer -> m PaymentTypesResponse{- ^ Get the cypto balance details for a user -}
  , getPaymentMethod :: Maybe Integer -> Maybe Integer -> Maybe Bool -> m PaymentTypesResponse{- ^ Get the details of the user's payment method or their current default method of payment -}
  , searchPaymentMethod :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> m PaymentTypesResponse{- ^ Search the payment methods of an account -}
  , getStatusCSV :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^  -}
  , listStatusCSV :: Maybe Integer -> Maybe Int -> Maybe Int -> m CsvImportResponse{- ^ Retrieves batches for a user. -}
  , statusCSV :: Maybe Integer -> Maybe Integer -> m CsvImportResponse{- ^ Checks status of batch upload. -}
  , uploadCSV :: Maybe Integer -> Maybe Text -> Maybe FilePath -> Maybe Text -> Maybe Text -> m CsvImportResponse{- ^ Uploads a CSV import file. -}
  , createCargoType :: CargoType -> m CargoType{- ^ Create new cargo type -}
  , deleteCargoType :: Integer -> m NoContent{- ^ Delete a type of cargo -}
  , getCargoType :: Integer -> m CargoType{- ^ Get an existing cargo type -}
  , searchCargoTypes :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Bool -> m [CargoType]{- ^ Search for types of cargo -}
  , updateCargoType :: Integer -> CargoType -> m CargoType{- ^ Update an existing cargo type -}
  , searchCarriers :: Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Bool -> m [CellCarrierResponse]{- ^ Search on supported mobile telephone carriers that can be used to send SMS notifications via email. -}
  , categoryDistanceSearch :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Double -> Maybe Double -> Maybe Double -> m [CategoryResponse]{- ^ Search for categories by distance. -}
  , createCategory :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> m CategoryTreeResponse{- ^ Create a new category. -}
  , deleteCategory :: Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Delete a category. -}
  , duplicateCategory :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> m CategoryTreeResponse{- ^ Duplicate a category, including all its children. -}
  , getCategory :: Maybe Integer -> Maybe Bool -> m CategoryTreeResponse{- ^ Get the details of a specific category. Recursively include all child categories and their children. -}
  , searchCategories :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Text -> m [CategoryResponse]{- ^ Search for categories. -}
  , updateCategory :: Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> m CategoryTreeResponse{- ^ Update a category. -}
  , addConnectionToGroup :: Maybe Bool -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Double -> Maybe Double -> m SirqulResponse{- ^ Adds a connection to a group. -}
  , addConnectionsToGroup :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Double -> m SirqulResponse{- ^ Adds a list of connections to a group. -}
  , addSubGroups :: Maybe Bool -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Double -> Maybe Double -> m ConnectionGroupResponse{- ^ Add sub groups to a group. -}
  , createOrUpdateConnection :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> m ConnectionResponse{- ^ Creates or updates the connection of the user and another account. Allows a user to follow, block, mark as trusted, and/or add someone to a group. -}
  , createOrUpdateGroup :: Maybe Bool -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Double -> Maybe Double -> m SirqulResponse{- ^ Creates a new private group. -}
  , followAccept :: Maybe Integer -> Maybe Integer -> Maybe Text -> m SirqulResponse{- ^ Accept someone's follow request. -}
  , followReject :: Maybe Integer -> Maybe Integer -> Maybe Text -> m SirqulResponse{- ^ Reject someone's follow request or remove them as a follower. -}
  , followRemove :: Maybe Integer -> Maybe Integer -> Maybe Text -> m SirqulResponse{- ^ Unfollow someone you are following or remove them as a follower. -}
  , followRequest :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Bool -> m SirqulResponse{- ^ Send a request to follow someone. -}
  , friendAccept :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> m SirqulResponse{- ^ Accept a friend request and optionally sends a notification. -}
  , friendReject :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> m SirqulResponse{- ^ Request a friend request and optionally sends a notification. -}
  , friendRemove :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Bool -> Maybe Bool -> m SirqulResponse{- ^ Removes a friend from the user's friends list. -}
  , friendRequest :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> m SirqulResponse{- ^ Sends a friend request notification to another user. -}
  , getConnectionSentFriendRequests :: Maybe Text -> Maybe Integer -> m ConnectionListResponse{- ^ Gets the connection sent friend requests. -}
  , getConnections :: Maybe Bool -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Double -> Maybe Double -> m ConnectionListResponse{- ^ Gets the connections. -}
  , getGroupDetails :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Bool -> Maybe Double -> Maybe Double -> m ConnectionGroupResponse{- ^  -}
  , groupSearch :: Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Int -> Maybe Int -> m [ConnectionInfoResponse]{- ^ Gets a user's private groups and default groups. -}
  , removeConnectionFromGroup :: Maybe Bool -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Double -> Maybe Double -> m SirqulResponse{- ^ Removes the connection from group. -}
  , removeConnectionsFromGroup :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Double -> m SirqulResponse{- ^ Remove a list of connections from a group. -}
  , removeGroup :: Maybe Bool -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Double -> Maybe Double -> m SirqulResponse{- ^ Remove a user's group. -}
  , removeSubGroups :: Maybe Bool -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Double -> Maybe Double -> m SirqulResponse{- ^ Remove sub groups from a group -}
  , searchConnections :: Maybe Bool -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Bool -> m ConnectionListResponse{- ^ Search for accounts that the user may not have a connection with. -}
  , addOrUpdateAlbumContest :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Bool -> Maybe Integer -> Maybe Bool -> Maybe Integer -> Maybe Integer -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Double -> Maybe Double -> m AlbumContestResponse{- ^ Creates or updates a contest. -}
  , approveAlbumContest :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> m SirqulResponse{- ^ Sets the approval status of a contest. -}
  , deleteContest :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Double -> Maybe Double -> m SirqulResponse{- ^ Deletes a contest. -}
  , getAlbumContest :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Double -> Maybe Double -> m AlbumContestResponse{- ^ Gets the contest object including the likes and notes -}
  , getAlbumContests :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Integer -> Maybe Double -> Maybe Double -> m AlbumContestListResponse{- ^ Searches on contests. -}
  , voteOnAlbumContest :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Double -> Maybe Double -> m AlbumContestResponse{- ^ Vote on a collection in a contest. -}
  , addPreview :: Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Enable this ad for preview for this account. -}
  , adsFind :: Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> m [MissionResponse]{- ^ Get a set of ad filtered by the parameters provided. -}
  , createCreative :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Bool -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Bool -> m CreativeResponse{- ^ Create a creative -}
  , deleteCreative :: Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Delete a creative -}
  , getCreative :: Maybe Integer -> Maybe Integer -> m CreativeResponse{- ^ Get a creative -}
  , getCreativesByApplication :: Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Int -> Maybe Int -> m [CreativeResponse]{- ^ Get a list of levels for an application, just those the account has permissions to view. -}
  , removePreview :: Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Remove this ad for preview for this account. -}
  , updateCreative :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Bool -> Maybe Integer -> Maybe Text -> Maybe Integer -> m CreativeResponse{- ^ Update a creative -}
  , create :: Integer -> Account -> m SirqulResponse{- ^ Create dependent of the account -}
  , getDependents :: Integer -> m SirqulResponse{- ^ Get the dependent list of an account -}
  , removeDependent :: Integer -> m NoContent{- ^ Delete the Dependent -}
  , checkDisbursements :: Maybe Integer -> m DisbursementResponse{- ^ Checks the status of a captured disbrusement to see if it has been settled. -}
  , createDisbursement :: Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Double -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m DisbursementResponse{- ^ Creates a Disbursement for sending money to a retailer -}
  , getDisbursement :: Maybe Integer -> Maybe Integer -> m DisbursementResponse{- ^ Get Disbursement details -}
  , searchDisbursements :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Int -> Maybe Int -> Maybe Bool -> Maybe Text -> m [DisbursementResponse]{- ^ Search Disbursements -}
  , updateDisbursement :: Maybe Integer -> Maybe Integer -> Maybe Double -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> m DisbursementResponse{- ^ Update Disbursement -}
  , assignEmployee :: Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> m EmployeeResponse{- ^ Assign An existing account to be an employee -}
  , assignToLocationEmployee :: Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Bool -> m SirqulResponse{- ^ Assign or unassign the account to a retailer location. -}
  , createEmployee :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m EmployeeResponse{- ^ Create a new account record with the provided information. -}
  , deleteEmployee :: Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Set the deleted date field which marks the record as deleted. -}
  , getEmployee :: Maybe Integer -> Maybe Integer -> Maybe Text -> m EmployeeResponse{- ^ Get the account record for the account id provided. -}
  , searchEmployees :: Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> m [EmployeeResponse]{- ^ Use the accountId to determine the associated BillableEntity. From there get a list of all accounts associated as managers/employees. -}
  , unassignEmployee :: Maybe Integer -> Maybe Integer -> m EmployeeResponse{- ^ Unassign An existing account to be an employee -}
  , updateEmployee :: Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m EmployeeResponse{- ^ Update the account record with the provided information. -}
  , attendEvent :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Int -> Maybe Double -> Maybe Double -> m OfferResponse{- ^  Specify whether the user is attending an event at a particular location. This can also be used as a \"check-in\" action. -}
  , createEvent :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> m OfferResponse{- ^ Create a private event to share with associates. -}
  , deleteEvent :: Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Delete an event that the user has permissions to. -}
  , getEvent :: Maybe Integer -> Maybe Integer -> m OfferResponse{- ^ Get an event. -}
  , searchEventTransactions :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> m [EventAttendanceResponse]{- ^ Searches on event type transactions. This can be used to see who is attending an event. -}
  , searchEvents :: Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Integer -> Maybe Integer -> Maybe Int -> Maybe Int -> m [OfferShortResponse]{- ^ Searches on events that the account has access to. -}
  , updateEvent :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Integer -> Maybe Integer -> Maybe Integer -> m OfferResponse{- ^ Update a private event to share with associates. -}
  , getToken :: Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Double -> m TokenResponse{- ^ Gets a user's Facebook token. -}
  , graphInterface :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> m SirqulResponse{- ^ Make Facebook posts on behalf of the user. -}
  , addFavorite :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Double -> Maybe Double -> m WrappedResponse{- ^ Adds an offer, offer location, retailer location, or category to your favorites. -}
  , deleteFavorite :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> m SirqulResponse{- ^ Removes a favorited item from the user's favorites list. -}
  , getFavorite :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Double -> Maybe Double -> m WrappedResponse{- ^ Retrieves a single favorited item. -}
  , searchFavorites :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Bool -> Maybe Bool -> Maybe Double -> Maybe Double -> m SearchResponse{- ^ Searches on the user's favorites. -}
  , whoHasFavorited :: Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Double -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m [AccountResponse]{- ^ Searches for everyone that has favorited an item -}
  , createFilter :: Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> m FilterTreeResponse{- ^ Create a filter -}
  , deleteFilter :: Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Delete a filter. -}
  , getFilter :: Maybe Integer -> m FilterTreeResponse{- ^ Get the details of a specific filter. Recursively include all child filters and their children. -}
  , searchFilters :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Bool -> m [FilterResponse]{- ^ Search for filters. -}
  , updateFilter :: Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> m FilterTreeResponse{- ^ Update a filter. -}
  , createFlag :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Double -> Maybe Double -> m SirqulResponse{- ^ Allows a user to flag an object that the user deems inappropriate or offensive. Flagable objects include accounts, albums, album contests, assets, game levels, and theme descriptors -}
  , deleteFlag :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> m SirqulResponse{- ^ Deletes a flag. -}
  , getFlag :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Double -> m FlagResponse{- ^ Gets the details on whether the user has flagged a particular flagable object. -}
  , getFlagThreshold :: Maybe Text -> Maybe Text -> m CountResponse{- ^ Get the flag threshold value on an object type for a particular application. -}
  , updateFlagThreshold :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Text -> m CountResponse{- ^ Update the flag threshold on an object type for a particular application. -}
  , createGame :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> m GameResponse{- ^ Create a Game. -}
  , deleteGame :: Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Delete a game. -}
  , getGame :: Maybe Integer -> Maybe Integer -> Maybe Bool -> m GameResponse{- ^ Get a Game by id. -}
  , searchGames :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Bool -> Maybe Bool -> m GameResponse{- ^ Get a list of games for an application, just those the account has permissions to view. -}
  , updateGame :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> m GameResponse{- ^ Update a Game -}
  , createGameLevel :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Bool -> Maybe Bool -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> m GameLevelResponse{- ^ Create a game level. Currently does NOT support game objects. -}
  , deleteGameLevel :: Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Delete a game level. The level and account must be valid and have the appropirate permissions to view the content. -}
  , getGameLevel :: Maybe Integer -> Maybe Integer -> Maybe Bool -> m GameLevelResponse{- ^ Get a game level. The level and account must be valid and have the appropirate permissions to view the content. -}
  , getGameLevelsByApplication :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Bool -> Maybe Text -> m GameLevelListResponse{- ^ Get a list of levels for an application, just those the account has permissions to view. -}
  , getGameLevelsByBillableEntity :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Integer -> Maybe Integer -> m GameLevelResponse{- ^ Searches on game levels that the logged in user has access to. A user would have access if the creator of the game level is managed under the same BillableEntity. -}
  , getQuestionsInLevel :: Maybe Integer -> Maybe Integer -> m QuestionResponse{- ^ Get questions within a level. -}
  , getWordsInLevel :: Maybe Integer -> Maybe Integer -> m WordzWordResponse{- ^ Get words within a level. -}
  , updateGameLevel :: Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Bool -> Maybe Bool -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> m GameLevelResponse{- ^ Update a game level. Currently does NOT support game objects. -}
  , updateQuestionsInLevel :: Maybe Integer -> Maybe Integer -> Maybe Text -> m SirqulResponse{- ^ Updates a level with question game objects. -}
  , updateWordsInLevel :: Maybe Integer -> Maybe Integer -> Maybe Text -> m SirqulResponse{- ^ Updates a level with word game objects. -}
  , acceptInvite :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> m ConsumerInviteResponse{- ^ Allows a user to accept an invite. The user could also become the inviter's friend. -}
  , albumContestInvite :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Double -> m InviteResponse{- ^ Allows a user to invite people to gain access to a contest. This will generate an invite token, which when used, will give the invitee access to a contest (whether it is private or not). The invitee will also become the user's friend when the invitation is accepted. -}
  , albumInvite :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Double -> m InviteResponse{- ^ Allows a user to invite people to gain access to a collection. This will generate an invite token, which when used, will give the invitee access to a collection (whether it is private or not). The invitee will also become the user's friend when the invitation is accepted. -}
  , eventInvite :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> m InviteResponse{- ^ Allows a user to invite people to attend an event. This will generate an invite token, which when used, will allow the invitee to add the offer to their wallet. -}
  , gameInvite :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Double -> m InviteResponse{- ^ Allows a user to invite people to gain access to an album. This will generate an invite token, which when used, will give the invitee access to an album (whether it is private or not). The invitee will also become the user's friend when the invitation is accepted. -}
  , getInvite :: Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> m SirqulResponse{- ^ This is used to determine whether an invite token is valid. If the token is valid, this will also return information about who invited the user, and what they are invited to. -}
  , missionInvite :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Double -> m InviteResponse{- ^ Allows a user to invite people to gain access to a mission. This will generate an invite token, which when used, will give the invitee access to a mission (whether it is private or not). The invitee will also become the user's friend when the invitation is accepted. -}
  , offerInvite :: Maybe Integer -> Maybe Text -> Maybe Integer -> m InviteResponse{- ^ Allows a user to invite people to favorite an offer. This will generate an invite token, which when used, will give the invitee the offer in their favorite's list. -}
  , offerLocationInvite :: Maybe Integer -> Maybe Text -> Maybe Integer -> m InviteResponse{- ^ Allows a user to invite people to favorite an offer location. This will generate an invite token, which when used, will give the invitee the offer location in their favorite's list. -}
  , retailerLocationInvite :: Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> m InviteResponse{- ^ Allows a user to invite people to favorite a retailer location. This will generate an invite token, which when used, will give the invitee the retailer location in their favorite's list. -}
  , createLeaderboard :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe FilePath -> Maybe Integer -> Maybe FilePath -> Maybe Integer -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m LeaderboardResponse{- ^ Create a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation -}
  , deleteLeaderboard :: Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Removes a leader board id. -}
  , getLeaderboard :: Maybe Integer -> Maybe Integer -> Maybe Bool -> m LeaderboardResponse{- ^ Read a leaderboard by id and retrieve the matching ranking list -}
  , searchLeaderboards :: Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Int -> Maybe Int -> m LeaderboardResponse{- ^ Search leaderboard and retrieve the matching ranking list -}
  , updateLeaderboard :: Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe FilePath -> Maybe Integer -> Maybe FilePath -> Maybe Integer -> Maybe Int -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> m LeaderboardResponse{- ^ Update a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation -}
  , registerLike :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> m LikableResponse{- ^ Allows a user to like or dislike accounts, albums, album contests, assets, game levels, notes, and theme descriptors. Multiple likes\\dislikes on the same object will replace the previous one. -}
  , removeLike :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Double -> m LikableResponse{- ^ Removes a like. This will make the user \"neutral\". -}
  , searchLikes :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Integer -> Maybe Integer -> Maybe Int -> Maybe Int -> m SearchResponse{- ^ Search for likes on a likable object. -}
  , createListing :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> m ListingFullResponse{- ^ Creates a listing. -}
  , deleteListing :: Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Delete a listing. -}
  , getListing :: Maybe Integer -> m ListingFullResponse{- ^ Get a listing by id. -}
  , searchListing :: Maybe Integer -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Bool -> Maybe Double -> Maybe Double -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> m [ListingResponse]{- ^ Search for event listings from the start time to end time -}
  , summaryListing :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Int -> Maybe Bool -> m [ListingGroupResponse]{- ^ Search for a list of summary listings from the start time up to 8 days out. -}
  , updateListing :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> m ListingFullResponse{- ^ Updates a listing. -}
  , cacheTrilaterationData :: Maybe Text -> Maybe Integer -> Maybe Int -> Maybe Text -> Maybe FilePath -> m SirqulResponse{- ^ Creates trilateration samples for a source device (i.e. a router). -}
  , cacheTrilaterationDataGzip :: TrilatCacheRequest -> m SirqulResponse{- ^ Creates trilateration samples for a source device (i.e. a router). -}
  , getLocationByIp :: Maybe Text -> m CoordsResponse{- ^ Get location information based on an IP address. -}
  , getLocationByTrilateration :: Maybe Integer -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Text -> m GeoPointResponse{- ^ Send in device data and calculate a position based on signal strengths. -}
  , getLocations :: Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Double -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Double -> Maybe Double -> Maybe Double -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> m LocationSearchResponse{- ^ Searches geographic locations by proximity via address or keyword. -}
  , createLocationV2 :: Location -> m SirqulResponse{- ^ Create a new location from a real object location. -}
  , updateLocationV2 :: Integer -> Location -> m SirqulResponse{- ^ Update an existing location -}
  , createMedia :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Double -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> m MediaOfferResponse{- ^ Create a media offering. -}
  , deleteMedia :: Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Delete a media offering that the user has permissions to. -}
  , getMedia :: Maybe Integer -> Maybe Integer -> m MediaOfferResponse{- ^ Get a media offering. -}
  , searchMedia :: Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> m [MediaOfferResponse]{- ^ Searches on events that the account has access to. -}
  , updateMedia :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Double -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> m MediaOfferResponse{- ^ Update a media offering. -}
  , createMission :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Bool -> Maybe Bool -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m MissionResponse{- ^ Create a user defined mission. -}
  , deleteMission :: Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Delete a mission. -}
  , findMissions :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> m MissionResponse{- ^ Get a set of ad filtered by the parameters provided. -}
  , getMission :: Maybe Integer -> Maybe Integer -> Maybe Bool -> m MissionResponse{- ^ Get a mission. -}
  , importMission :: Maybe Integer -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Text -> m SirqulResponse{- ^ Create a mission using a source item such as an offer location. -}
  , searchMissionFormats :: Maybe Int -> Maybe Int -> Maybe Bool -> m [MissionFormatResponse]{- ^ Searches on pre-defined mission formats -}
  , searchMissions :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Bool -> m [MissionResponse]{- ^ Get the list missions available to the account.   -}
  , searchMissionsByBillableEntity :: Maybe Integer -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Bool -> m [MissionResponse]{- ^ Use the accountId to determine the associated BillableEntity.  From there get a list of all accounts associated as managers.  Get the list missions owned by all associated managers. -}
  , updateMission :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Bool -> Maybe Bool -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m MissionResponse{- ^ Update a mission. -}
  , createMissionInvite :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Bool -> m MissionResponse{- ^ Create the mission invite. An account can only be invited to a mission one time. For missions that require user submission and reviewing the permissionableType and permissionableId need to be provided. -}
  , deleteMissionInvite :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Bool -> m SirqulResponse{- ^ Update the mission invite status to quit. -}
  , getMissionInvite :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Bool -> Maybe Text -> m MissionResponse{- ^ Get the mission invite. An account can only be invited to a mission one time. -}
  , searchMissionInvites :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> m [MissionResponse]{- ^ Get a list of mission invites that the account has. -}
  , updateMissionInvite :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Bool -> m MissionResponse{- ^ Update the mission invite status. An account can only be invited to a mission one time. For missions that require user submission and reviewing the permissionableType and permissionableId need to be provided. -}
  , batchOperation :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> m SirqulResponse{- ^ Perform a batch operation on notes for a notable object (for example: DELETE_ALL_NOTES_IN_NOTABLE).  -}
  , createNote :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe FilePath -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe FilePath -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> m NoteResponse{- ^ This is used to leave a comment (note) on a notable object (i.e. albums, album contests, assets, game levels, offers, offer locations, retailers, retailer locations, and theme descriptors). Leaving a comment on a notable object will be visiable to everyone who has access to view the object. -}
  , deleteNote :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Double -> Maybe Double -> Maybe Text -> m SirqulResponse{- ^ Sets a comment (note) as deleted. -}
  , getNote :: Maybe Text -> Maybe Integer -> Maybe Bool -> Maybe Integer -> m SirqulResponse{- ^ Get for a note based on its Id. -}
  , searchNotes :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Integer -> Maybe Integer -> Maybe Int -> Maybe Int -> m [NoteResponse]{- ^ Search for notes on a notable object. -}
  , updateNote :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe FilePath -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe FilePath -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> m NoteResponse{- ^ Update an existing comment (note). Only the creator of the note have permission to update. -}
  , createNotificationTemplate :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m NotificationTemplateResponse{- ^ Create a notification template. Developers will only be able to create notification templates for their own applications. -}
  , createOrUpdateBlockedNotifications :: Maybe Integer -> Maybe Text -> Maybe Text -> m BlockedNotificationResponse{- ^ Create or update blocked notification settings -}
  , deleteNotificationTemplate :: Maybe Integer -> Maybe Integer -> m NotificationTemplateResponse{- ^ Deletes a notification template. Developers will only be able to delete notification templates for their own applications. -}
  , getNotificationTemplate :: Maybe Integer -> Maybe Integer -> m NotificationTemplateResponse{- ^ Get the details of a notification template. Developers will only be able to see notification templates for their own applications. -}
  , getNotifications :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Integer -> Maybe Double -> Maybe Double -> Maybe Bool -> Maybe Bool -> Maybe Int -> Maybe Int -> m NotificationMessageListResponse{- ^ Get a list of notifications for a user. If the \"markAsRead\" parameter is set to true, the returned notifications will be marked as \"read\" after the response has been sent. By default, read messages will not be returned, so to see read messages, set \"returnReadMessages\" to true. -}
  , registerNotificationToken :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Double -> Maybe Double -> m SirqulResponse{- ^ Register a token to send application dependent notifications like Google Cloud Messaging, or Apple Push Notifications. -}
  , searchBlockedNotifications :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> m BlockedNotificationResponse{- ^ Search on the user's blocked notification settings -}
  , searchNotificationTemplate :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> m NotificationTemplateResponse{- ^ Search for notification templates on owned applications. -}
  , searchRecipients :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> m [NotificationRecipientResponse]{- ^ Search for application users to send notifications. -}
  , searchRecipientsCount :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> m NotificationRecipientResponseListResponse{- ^ Search for application users to send notifications (count/grouped variant). -}
  , sendBatchNotifications :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> m SirqulResponse{- ^ Send notifications to all users of an application. Only someone with permissions to the application can do this. -}
  , sendCustomNotifications :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Double -> Maybe Double -> m SirqulResponse{- ^ Send your own custom notification to a user. NOTE: the EventType of these notifications will be CUSTOM. Notifications sent to yourself will currently be ignored. -}
  , updateNotificationTemplate :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> m NotificationTemplateResponse{- ^ Update a notification template. Developers will only be able to update notification templates for their own applications. -}
  , addField :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m ObjectStoreResponse{- ^ Add a field to a specific object.  The field name should be camel   case with the first letter lower case, for example: myFieldName.  Duplicate   field names are not allowed.   The field name cannot be any of the following   reserved words: ACCESSIBLE, ADD, ALL, ALTER, ANALYZE, AND, AS, ASC, ASENSITIVE,   BEFORE, BETWEEN, BIGINT, BINARY, BLOB, BOTH, BY, CALL, CASCADE, CASE, CHANGE,   CHAR, CHARACTER, CHECK, COLLATE, COLUMN, CONDITION, CONSTRAINT, CONTINUE,   CONVERT, CREATE, CROSS, CURRENT_, ATE, CURRENT_TIME, CURRENT_TIMESTAMP,   CURRENT_USER, CURSOR, DATABASE, DATABASES, DAY_HOUR, DAY_MICROSECOND, DAY_MINUTE,   DAY_SECOND, DEC, DECIMAL, DECLARE, DEFAULT, DELAYED, DELETE, DESC, DESCRIBE,   DETERMINISTIC, DISTINCT, DISTINCTROW, DIV, DOUBLE, DROP, DUAL, EACH, ELSE,   ELSEIF, ENCLOSED, ESCAPED, EXISTS, EXIT, EXPLAIN, FALSE, FETCH, FLOAT, FLOAT4,   FLOAT8, FOR, FORCE, FOREIGN, FROM, FULLTEXT, GRANT, GROUP, HAVING, HIGH_PRIORITY,   HOUR_MICROSECOND, HOUR_MINUTE, HOUR_SECOND, IF, IGNORE, IN, INDEX, INFILE,   INNER, INOUT, INSENSITIVE, INSERT, INT, INT1, INT2, INT3, INT4, INT8, INTEGER,   INTERVAL, INTO, IS, ITERATE, JOIN, KEY, KEYS, KILL, LEADING, LEAVE, LEFT,   LIKE, LIMIT, LINEAR, LINES, LOAD, LOCALTIME, LOCALTIMESTAMP, LOCK, LONG,   LONGBLOB, LONGT, XT, LOOP, LOW_PRIORITY, MASTER_SSL_VERIFY_SERVER_CERT,   MATCH, MAXVALUE, MEDIUMBLOB, MEDIUMINT, MEDIUMTEXT, MIDDLEINT, MINUTE_MICROSECOND,   MINUTE_SECOND, MOD, MODIFIES, NATURAL, NOT, NO_WRITE_TO_BINLOG, NULL, NUMERIC,   ON, OPTIMIZE, OPTION, OPTIONALLY, OR, ORDER, OUT, OUTER, OUTFILE, PRECISION,   PRIMARY, PROCEDURE, PURGE, RANGE, READ, READS, READ_WRITE, REAL, REFERENCES,   REGEXP, RELEASE, RENAME, REPEAT, REPLACE, REQUIRE, RESIGNAL, RESTRICT, RETURN,   REVOKE, RIGHT, RLIKE, SCHEMA, SCHEMAS, SECOND_MICROSECOND, SELECT, SENSITIVE,   SEPARATOR, SET, SHOW, SIGNAL, SMALLINT, SPATIAL, SPECIFIC, SQL, SQLEXCEPTION,   SQLSTATE, SQLWARNING, SQL_BIG_RESULT, SQL_CALC_FOUND_ROWS, SQL_SMALL_RESULT,   SSL, STARTING, STRAIGHT_JOIN, TABLE, TERMINATED, THEN, TINYBLOB, TINYINT,   TINYTEXT, TO, TRAILING, TRIGGER, TRUE, NDO, UNION, UNIQUE, UNLOCK, UNSIGNED,   UPDATE, USAGE, USE, USING, UTC_DATE, UTC_TIME, UTC_TIMESTAMP, VALUES, VARBINARY,   VARCHAR, VARCHARACTER, VARYING, WHEN, WHERE, WHILE, WITH, WRITE, XOR, YEAR_MONTH,   ZEROFILL, GENERAL, IGNORE_SERVER_IDS, MASTER_HEARTBEAT_PERIOD, SLOW.     The following field names are reserved (cannot be used directly) and are automatically   included during object creation: ID, OBJECTID, CREATED, UPDATED, DELETED.   Additionally the field names must start with a letter or number. -}
  , createData :: Text -> Maybe Integer -> Text -> m ObjectStoreResponse{- ^ Create a record for the specified object.  If the object does not exist then a new one will be created prior to inserting the record.  If any of the fields included does not exist for the object then they are added to the object.  -}
  , createObject :: Maybe Integer -> Maybe Text -> Maybe Text -> m ObjectStoreResponse{- ^ Create an Object Store table.  By default tables will have the columns: id, created, updated, deleted.  Names og objects should be camel case with the first letter capitalized, for example: MyTableName.   Duplicate object names are not allowed.   The object name cannot be any of the following reserved words: ACCESSIBLE, ADD, ALL, ALTER, ANALYZE, AND, AS, ASC, ASENSITIVE, BEFORE, BETWEEN, BIGINT, BINARY, BLOB, BOTH, BY, CALL, CASCADE, CASE, CHANGE, CHAR, CHARACTER, CHECK, COLLATE, COLUMN, CONDITION, CONSTRAINT, CONTINUE, CONVERT, CREATE, CROSS, CURRENT_, ATE, CURRENT_TIME, CURRENT_TIMESTAMP, CURRENT_USER, CURSOR, DATABASE, DATABASES, DAY_HOUR, DAY_MICROSECOND, DAY_MINUTE, DAY_SECOND, DEC, DECIMAL, DECLARE, DEFAULT, DELAYED, DELETE, DESC, DESCRIBE, DETERMINISTIC, DISTINCT, DISTINCTROW, DIV, DOUBLE, DROP, DUAL, EACH, ELSE, ELSEIF, ENCLOSED, ESCAPED, EXISTS, EXIT, EXPLAIN, FALSE, FETCH, FLOAT, FLOAT4, FLOAT8, FOR, FORCE, FOREIGN, FROM, FULLTEXT, GRANT, GROUP, HAVING, HIGH_PRIORITY, HOUR_MICROSECOND, HOUR_MINUTE, HOUR_SECOND, IF, IGNORE, IN, INDEX, INFILE, INNER, INOUT, INSENSITIVE, INSERT, INT, INT1, INT2, INT3, INT4, INT8, INTEGER, INTERVAL, INTO, IS, ITERATE, JOIN, KEY, KEYS, KILL, LEADING, LEAVE, LEFT, LIKE, LIMIT, LINEAR, LINES, LOAD, LOCALTIME, LOCALTIMESTAMP, LOCK, LONG, LONGBLOB, LONGT, XT, LOOP, LOW_PRIORITY, MASTER_SSL_VERIFY_SERVER_CERT, MATCH, MAXVALUE, MEDIUMBLOB, MEDIUMINT, MEDIUMTEXT, MIDDLEINT, MINUTE_MICROSECOND, MINUTE_SECOND, MOD, MODIFIES, NATURAL, NOT, NO_WRITE_TO_BINLOG, NULL, NUMERIC, ON, OPTIMIZE, OPTION, OPTIONALLY, OR, ORDER, OUT, OUTER, OUTFILE, PRECISION, PRIMARY, PROCEDURE, PURGE, RANGE, READ, READS, READ_WRITE, REAL, REFERENCES, REGEXP, RELEASE, RENAME, REPEAT, REPLACE, REQUIRE, RESIGNAL, RESTRICT, RETURN, REVOKE, RIGHT, RLIKE, SCHEMA, SCHEMAS, SECOND_MICROSECOND, SELECT, SENSITIVE, SEPARATOR, SET, SHOW, SIGNAL, SMALLINT, SPATIAL, SPECIFIC, SQL, SQLEXCEPTION, SQLSTATE, SQLWARNING, SQL_BIG_RESULT, SQL_CALC_FOUND_ROWS, SQL_SMALL_RESULT, SSL, STARTING, STRAIGHT_JOIN, TABLE, TERMINATED, THEN, TINYBLOB, TINYINT, TINYTEXT, TO, TRAILING, TRIGGER, TRUE, NDO, UNION, UNIQUE, UNLOCK, UNSIGNED, UPDATE, USAGE, USE, USING, UTC_DATE, UTC_TIME, UTC_TIMESTAMP, VALUES, VARBINARY, VARCHAR, VARCHARACTER, VARYING, WHEN, WHERE, WHILE, WITH, WRITE, XOR, YEAR_MONTH, ZEROFILL, GENERAL, IGNORE_SERVER_IDS, MASTER_HEARTBEAT_PERIOD, SLOW.  -}
  , deleteData :: Text -> Text -> Maybe Integer -> m ObjectStoreResponse{- ^ Delete a record for the specified object. Cannot be undone so use only when abolutely sure. -}
  , deleteField :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> m ObjectStoreResponse{- ^ Delete a field from an object.  This will remove the field, indexes,   and foreign keys associated with the field.   The following field names   are reserved and cannot be removed from the object: ID, OBJECTID, CREATED,   UPDATED, DELETED -}
  , deleteObject :: Maybe Integer -> Maybe Text -> Maybe Text -> m ObjectStoreResponse{- ^ Delete and Object in the store.  This will delete the table and clean up and foreign keys referencing it. Cannot be undone so use only when abolutely sure. -}
  , getData :: Text -> Text -> Maybe Integer -> Maybe Text -> m ObjectStoreResponse{- ^ Get a specific record from a specified object. -}
  , getObject :: Maybe Integer -> Maybe Text -> Maybe Text -> m ObjectStoreResponse{- ^ Get the definition of an Object. Returns all field names, types, and current size. The types supported are: STRING, DATE, NUMBER, BOOLEAN, IDENTITY. -}
  , searchData :: Text -> Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> m ObjectStoreResponse{- ^ Search for records given the specified criteria.  The criteria is a defined set of json values used to build a query -}
  , searchObject :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> m ObjectStoreResponse{- ^ Search for Objects and return the list of names found.  Use this in conjunction with the object get service to present the current data model defined. -}
  , updateData :: Text -> Text -> Maybe Integer -> Text -> m ObjectStoreResponse{- ^ Update a record for the specified object.  If the object does not exist the request will be rejected, use the data create service for the first entry. If any of the fields included does not exist for the object then they are added to the object. -}
  , batchUpdateOfferLocations :: Maybe Text -> Maybe Integer -> Maybe Text -> m SirqulResponse{- ^ Batch update offer locations. -}
  , createOffer :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Double -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Double -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Text -> m RetailerOfferResponse{- ^ Create an offer and assign it to the provided retailer locations. -}
  , deleteOffer :: Maybe Text -> Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Set the deleted timestamp to current time. This effectively deletes the offer since all queries should ignore any records with a deleted time stamp. -}
  , deleteOfferLocation :: Maybe Text -> Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Set the deleted timestamp to current time. This effectively deletes the offer location since all queries should ignore any records with a deleted time stamp. -}
  , getOffer :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Bool -> m RetailerOfferResponse{- ^ Gets the details of an offer that the user has access to. -}
  , getOfferDetails :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Double -> Maybe Double -> Maybe Double -> Maybe Bool -> Maybe Bool -> Maybe Bool -> m OfferResponse{- ^ Gets offer or offer location details as a consumer.  Will check if it is a favorite if the deviceId/accountId is provided.  If the offerId is provided it will look up the main offer and ignore the the offerLocationId. If no offerId is provided then an offerLocationId must be specified. -}
  , getOfferListCounts :: Maybe Double -> Maybe Double -> Maybe Double -> Maybe Text -> m ListCountResponse{- ^ Gets the offer list counts. -}
  , getOfferLocation :: Maybe Integer -> Maybe Text -> m OfferShortResponse{- ^ Gets the offer location by offer location id or udid (of a device) -}
  , getOfferLocationsForRetailers :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Integer -> m [OfferShortResponse]{- ^ Searches on offer locations, which are records that represent an offer that has been assigned to a retailer location. If an offer does not have any locations assigned, then it will NOT be returned. -}
  , getOffersForRetailers :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Integer -> m [OfferResponse]{- ^ Searches on offers that the account has access to. -}
  , redeemOfferTransaction :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Int -> m SirqulResponse{- ^ Redeems an offer. -}
  , searchOfferTransactionsForRetailers :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Bool -> m [OfferTransactionResponse]{- ^ Searches on offer transactions for offers that the account has access to. -}
  , searchOffersForConsumer :: Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> m OfferListResponse{- ^ Searches for offers as a consumer. -}
  , topOfferTransactions :: Maybe Int -> Maybe Int -> m OfferListResponse{- ^ Gets the top active offers. -}
  , updateOffer :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Double -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Double -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Text -> m RetailerOfferResponse{- ^ Update an offer, must provide a current list of retailer locations or the current offer locations will be marked as deleted. -}
  , updateOfferStatus :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Bool -> m SirqulResponse{- ^ Sets the activated date on offers. This will make offers visible for consumers. -}
  , createOfferTransactionStatus :: Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Bool -> Maybe Text -> m OfferTransactionStatusResponse{- ^ Create an offer status record -}
  , deleteOfferTransactionStatus :: Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Double -> Maybe Integer -> m SirqulResponse{- ^ Mark an offer status record as deleted -}
  , getOfferTransactionStatus :: Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Double -> Maybe Integer -> m OfferTransactionStatusResponse{- ^ Get an offer status record -}
  , searchOfferTransactionStatuses :: Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Bool -> m [OfferTransactionStatusResponse]{- ^ Search for the available offer statuses -}
  , updateOfferTransactionStatus :: Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Double -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Bool -> Maybe Text -> m OfferTransactionStatusResponse{- ^ Update an offer status record -}
  , imageGeneration :: Maybe Integer -> Maybe Text -> Maybe Bool -> m WrappedProxyItemResponse{- ^ Generate images with OpenAI. -}
  , getOptimizationResult :: Text -> Maybe Int -> Maybe Int -> m ((Map.Map String ShipmentOrder)){- ^ Get the results of the import batch. -}
  , requestOptimization :: Orders -> m ImportStatuses{- ^ Request and upload of shipment orders and create ShipmentImportBatch for optimization. -}
  , addMovie :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe FilePath -> Maybe Text -> Maybe Text -> m OrsonAiAddMovieResponse{- ^ Add a movie to be indexed for Topics. Indexing a movie analyses the content and incorporates it into the topics model for future /topics calls. This does not store the movie file long-term. -}
  , aiDocs :: Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> m OrsonAiProtoResponse{- ^ Takes in a text string representing one or more sentences and it returns a list of documents which are related to the provided document. -}
  , aiFindImages :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m OrsonAiProtoResponse{- ^ Returns a list of URIs of images that match the text. -}
  , aiTags :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m OrsonAiProtoResponse{- ^ Search the tags column of user provided tags using this endpoint. -}
  , aiText :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Int -> m OrsonAiProtoResponse{- ^ Search the movie text column of movie text using this endpoint. -}
  , batch :: Maybe Integer -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe FilePath -> Maybe Text -> Maybe Text -> m OrsonAiBatchResponse{- ^ Run several types of analysis on an audio or video file in a single API call, instead of calling several operations for the same file.. -}
  , createInstantEpisode :: Maybe Integer -> Maybe Text -> m OrsonEpisodeResponse{- ^ Creates an instant episode for a given StoryStrip by providing all necessary inputs, interview recordings, and pictures, kicking off a render immediately. -}
  , createVoiceCanvas :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe FilePath -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Text -> m OrsonAiVoiceCanvasResponse{- ^ Create VoiceCanvas images for provided text, file upload, or file URL -}
  , emotion :: Maybe Integer -> Maybe Text -> Maybe FilePath -> Maybe Text -> Maybe Text -> m OrsonAiEmotionsResponse{- ^ Detects emotions in an audio or video recording. -}
  , getAddMovieResult :: Text -> Maybe Integer -> m OrsonAiAddMovieResponse{- ^ Get the result of an in progress Add Movie request from an earlier POST. -}
  , getBatch :: Text -> Maybe Integer -> m OrsonAiBatchResponse{- ^ Gets the completed Video Batch results, if done, or an error or status update if not. -}
  , getEmotion :: Text -> Maybe Integer -> m OrsonAiEmotionsResponse{- ^ Checks the Emotion analysis and returns in progress, results, or error. -}
  , getEpisodeStatus :: Integer -> Maybe Integer -> m OrsonEpisodeResponse{- ^ Gets a summary of the episode's status, including any renders. -}
  , getRenderStatus :: Text -> Maybe Integer -> m OrsonRenderResponse{- ^ Gets a summary of the episode's status, including any renders. -}
  , getSTT :: Text -> Maybe Integer -> m OrsonAiSTTResponse{- ^ The results of the video transcription and optional translation. -}
  , getTTS :: Text -> Maybe Integer -> m OrsonAiTTSResponse{- ^ Check the status of an in progress Text-to-Speech call or download the result. -}
  , getTechTune :: Text -> Maybe Integer -> m OrsonAiTechTuneResponse{- ^ Get a result or continue waiting for a pending request for TechTune analysis. -}
  , getTopics :: Text -> Maybe Integer -> m OrsonAiTopicsResponse{- ^ Get the result of an in progress Topics Analysis from an earlier POST. -}
  , getVoiceCanvas :: Text -> Maybe Integer -> m OrsonAiVoiceCanvasResponse{- ^ Get a result or continue waiting for a pending request for VoiceCanvas Images. -}
  , startVideoRender :: Maybe Integer -> Maybe Text -> m OrsonRenderResponse{- ^ Starts a StoryStitch video render to produce your final video, returning the status details. -}
  , stt :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe FilePath -> Maybe Text -> Maybe Text -> m OrsonAiSTTResponse{- ^ Accepts a movie URL or uploaded file and transcribes it. You also have the option to translate it into one of our additional supported languages. -}
  , summarizeTopics :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe FilePath -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Text -> m OrsonAiTopicsResponse{- ^ Takes in a string of text sentences (also known as a document) and returns a list of associated topics and their proximity score. -}
  , techTune :: Maybe Integer -> Maybe Text -> Maybe Int -> Maybe FilePath -> Maybe Text -> Maybe Text -> m OrsonAiTechTuneResponse{- ^ Analyses a movie file to detect technical issues, such as too few people in frame. -}
  , tts :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m OrsonAiTTSResponse{- ^ Creates an audio file for the given text, with the option of language and voice selection. -}
  , createPack :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Integer -> Maybe Text -> Maybe Integer -> m PackResponse{- ^ Create a pack. -}
  , deletePack :: Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Delete a pack. -}
  , getPack :: Maybe Integer -> Maybe Integer -> Maybe Bool -> m PackResponse{- ^ Get a pack. -}
  , searchPacks :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Bool -> Maybe Bool -> Maybe Text -> m [PackResponse]{- ^ Search on packs. -}
  , updatePack :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Integer -> Maybe Text -> Maybe Integer -> m PackResponse{- ^ Update a pack. -}
  , processAllParticipants :: Maybe Integer -> Maybe Text -> Maybe Bool -> m SirqulResponse{- ^ Processes all supported participant feeds. -}
  , processParticipants :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe FilePath -> m SirqulResponse{- ^ Processes a participant feed or uploaded file for a specific league. -}
  , computePath :: Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> m PathingResponse{- ^ Calculates the shortest path from point to point on a grid -}
  , createPostalCode :: Maybe Integer -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Text -> Maybe Bool -> m PostalCodeResponse{- ^ Create a Postal Code -}
  , deletePostalCode :: Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Delete a Postal Code -}
  , getPostalCode :: Maybe Integer -> m PostalCodeResponse{- ^ Get a Postal Code -}
  , getPostalCodes :: Maybe Double -> Maybe Double -> Maybe Text -> Maybe Double -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Bool -> m [PostalCodeResponse]{- ^ Get the list of regions. If latitude or longitude is null, will return all postal codes in the system with paginated response. -}
  , updatePostalCode :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Text -> Maybe Bool -> m PostalCodeResponse{- ^ Update a Postal Code -}
  , createPersona :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> m PreviewPersonaResponse{- ^ Creates a new persona. If the given params are null those attributes will be override by null. -}
  , deletePersona :: Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Mark the persona for deletion. -}
  , getPersonaList :: Maybe Integer -> Maybe Integer -> m PreviewPersonaResponse{- ^ Get the persona by the given persona ID. If the persona cannot be found, a invalid response is returned. -}
  , searchPersona :: Maybe Integer -> Maybe Int -> Maybe Int -> m PreviewPersonaResponse{- ^ Search for persona that the account owns by the given account ID. -}
  , updatePersona :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Integer -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> m PreviewPersonaResponse{- ^ Update the persona by the given personaId. If the given params are null those attributes will be override by null. If active is assigned, all other params will be ignored. -}
  , createProgram :: Program -> m Program{- ^ Create a new program -}
  , deleteProgram :: Integer -> m NoContent{- ^ Delete an existing program -}
  , getProgram :: Integer -> m Program{- ^ Get an existing program -}
  , postProgram :: Integer -> Program -> m Program{- ^ Update an existing program -}
  , putProgram :: Integer -> Program -> m Program{- ^ Update an existing program -}
  , searchPrograms :: Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Bool -> m [Program]{- ^ Search for programs -}
  , createPurchaseItem :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Float -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Integer -> Maybe Integer -> m PurchaseItemFullResponse{- ^ Creates a purchase item for in app purchases -}
  , deletePurchaseItem :: Maybe Text -> Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Marks the purchase item as deleted -}
  , getPurchaseItem :: Maybe Text -> Maybe Integer -> Maybe Integer -> m PurchaseItemFullResponse{- ^ Get detailed information about a purchase item -}
  , searchPurchaseItems :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Bool -> m [PurchaseItemResponse]{- ^ Search for purchasable items from the system -}
  , updatePurchaseItem :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Float -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Integer -> Maybe Integer -> m PurchaseItemFullResponse{- ^ Updates a purchase item for in app purchases -}
  , createOrder :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> m OrderResponse{- ^ Creates a new purchase with some number of items associated with it. The purchase is added to the order that was created -}
  , deleteOrder :: Maybe Text -> Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Removes the transaction from the wallet by setting the deleted date to the current date/time.  Requires a valid account and transactionId. -}
  , getOrder :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> m OrderResponse{- ^ Get an order record -}
  , previewOrder :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> m OrderResponse{- ^ Previews a purchase to see the total cost before making it. -}
  , searchOrders :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> m [OrderResponse]{- ^ Search on active orders by customer -}
  , updateOrder :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> m OrderResponse{- ^ Updates new purchase with some number of items associated with it. The orderId provided is used to retrieve the record and the payment is added to it. -}
  , createQuestion :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Bool -> Maybe Bool -> Maybe Integer -> Maybe Text -> Maybe Integer -> m QuestionResponse{- ^ Create a question and related answers by the given params. -}
  , deleteQuestion :: Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Delete a question by the given questionId. The accountId given needs to be the owner or executive to delete. -}
  , getQuestion :: Maybe Integer -> Maybe Integer -> m QuestionResponse{- ^ Get a question by the given id. -}
  , searchQuestions :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Int -> Maybe Int -> m [QuestionResponse]{- ^ Search for questions by the given params. -}
  , updateQuestion :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Bool -> Maybe Bool -> Maybe Integer -> Maybe Text -> Maybe Integer -> m QuestionResponse{- ^ Update a question and related answers. -}
  , getHistoricalRankings :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> m RankFullResponse{- ^ Get historical leaderboard rankings by time-frame. -}
  , getRankings :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> m RankFullResponse{- ^ Get leader board rankings. This is an all in one endpoint that can return multiple ranking types and also the current user rank. -}
  , getUserRank :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> m Value{- ^ Returns the user's ranks for one or more rank types and modes. -}
  , overrideUserRank :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Allows an admin of an application to override a user's scores for a leaderboard. -}
  , updateRankings :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Bool -> Maybe Bool -> m SirqulResponse{- ^ Update the rank value  -}
  , createRating :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Int -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> m RatingResponse{- ^ This is used to leave rating on a ratable object (i.e. retailer locations). Each user can only rate on a ratable object once per category. If a user rates on the same object and category, the previous rating will be overwritten. Leaving a rating on a ratable object will be visible to everyone who has access to view the object. -}
  , deleteRating :: Maybe Text -> Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Sets a rating as deleted. -}
  , searchLocationRatingIndexes :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Double -> Maybe Double -> Maybe Double -> Maybe Bool -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> m [RatingIndexResponse]{- ^ Search for retailer locations by averages near you. -}
  , searchRatingIndexes :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Double -> Maybe Double -> Maybe Bool -> Maybe Bool -> m [RatingIndexResponse]{- ^ Search for ratable items by averages. -}
  , searchRatings :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> m [RatingResponse]{- ^ Search for ratings on a ratable object. -}
  , updateRating :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Int -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> m RatingResponse{- ^ Update an existing rating. Only the creator of the rating have permission to update. -}
  , createRegion :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Int -> Maybe Bool -> Maybe Bool -> m RegionResponse{- ^ Create a region. -}
  , deleteRegion :: Maybe Integer -> Maybe Integer -> m RegionResponse{- ^ Delete a region. -}
  , getRegion :: Maybe Integer -> Maybe Integer -> m RegionResponse{- ^ Get a region. -}
  , searchRegions :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Bool -> Maybe Bool -> Maybe Integer -> Maybe Int -> Maybe Int -> m [RegionResponse]{- ^ Get the list of regions. -}
  , updateRegion :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Int -> Maybe Bool -> Maybe Bool -> Maybe Bool -> m RegionResponse{- ^ Update a region. -}
  , createBatch :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Int -> Maybe Text -> m ReportBatchResponse{- ^ Create an entry for the batch for offline report -}
  , createRegionLegSummaryBatch :: [RegionLegSummary] -> m ReportRegionLegSummaryBatchResponse{- ^ Create an entry for the batch for offline report -}
  , deleteBatch :: Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Deletes a batch report. -}
  , getReportBatch :: Maybe Integer -> Maybe Integer -> Maybe Bool -> m ReportBatchResponse{- ^ Checks status of batch report. -}
  , runReport :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Integer -> Maybe Integer -> Maybe Text -> m ReportResponse{- ^  This endpoint allows you to run a set of predefined reports that can be used to understand your users' behavior as well as trends within your application. -}
  , searchBatch :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Integer -> Maybe Integer -> Maybe Int -> Maybe Int -> m [ReportBatchResponse]{- ^ Retrieves batches for a user.. -}
  , createReservation :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> m NoContent{- ^ Creates a reservation on an offer object -}
  , deleteReservation :: Maybe Text -> Maybe Integer -> Maybe Integer -> m NoContent{- ^ Deleted a reservation on a reservation object -}
  , reservableAvailability :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> m [AvailabilityResponse]{- ^  -}
  , searchAvailability :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Int -> Maybe Int -> m [AvailabilityResponse]{- ^  -}
  , searchReservations :: Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Int -> Maybe Int -> m [ReservationResponse]{- ^  -}
  , searchSchedule :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Int -> m [TimeSlotResponse]{- ^  -}
  , createRetailer :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe FilePath -> Maybe Integer -> Maybe FilePath -> Maybe Integer -> Maybe FilePath -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> m RetailerFullResponse{- ^ Create a retailer record. A billable entity must be created first before a retailer record can be made. -}
  , deleteRetailer :: Maybe Text -> Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Set the deleted timestamp to current time. -}
  , getRetailer :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Bool -> m RetailerFullResponse{- ^ Gets a retailer. Only the owner and the employees of a retailer have access to view its information. -}
  , getRetailers :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Bool -> m [RetailerResponse]{- ^ earches on retailers that the account has access to. -}
  , retailerLoginCheck :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Text -> m AccountLoginResponse{- ^ Retailer login check. -}
  , updateRetailer :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe FilePath -> Maybe Integer -> Maybe FilePath -> Maybe Integer -> Maybe FilePath -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> m RetailerFullResponse{- ^ Update a retailer record. Only the owner and the employees of the retailer have access to update its information. -}
  , createRetailerLocationConsumer :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Double -> Maybe Double -> m RetailerLocationResponse{- ^ Creates a location record for an application that can support crowd sourced locations. -}
  , createRetailerLocations :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe FilePath -> Maybe Integer -> Maybe FilePath -> Maybe Integer -> Maybe FilePath -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m RetailerLocationResponse{- ^ Creates a location record for a retailer. Only the owner and the employees of the retailer have access to do this. -}
  , deleteRetailerLocation :: Maybe Text -> Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Set the deleted timestamp to current time. This effectively deletes the retailer location since all queries should ignore any records with a deleted time stamp. -}
  , getRetailerLocation :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> m RetailerLocationResponse{- ^ Gets a retailer location. Only the owner and the employees of the retailer have access to view its information. -}
  , getRetailerLocationConsumer :: Maybe Text -> Maybe Integer -> Maybe Integer -> m RetailerLocationResponse{- ^ Gets the details of a retailer location as a consumer. -}
  , indexedRetailerLocationDistanceSearch :: Maybe Double -> Maybe Double -> Maybe Integer -> Maybe Text -> Maybe Double -> Maybe Int -> Maybe Int -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> m [RetailerLocationResponse]{- ^ Retailer location indexed search by distance. This searches on any retailer location with location data and returns the results sorted by distance. -}
  , indexedRetailerLocationSearch :: Maybe Integer -> Maybe Int -> Maybe Int -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> m [RetailerLocationResponse]{- ^ Retailer location (faster) indexed search. This searches all retailer locations. -}
  , searchRetailerLocations :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> m [RetailerLocationResponse]{- ^ Searches on retailer locations that the account has access to. -}
  , updateRetailerLocations :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe FilePath -> Maybe Integer -> Maybe FilePath -> Maybe Integer -> Maybe FilePath -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m RetailerLocationResponse{- ^ Updates a location record for a retailer. Only the owner and the employees of the retailer have access to do this. -}
  , getRetaokiler :: Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Bool -> m SirqulResponse{- ^ Gets a retailer. Only the owner and the employees of a retailer have access to view its information. -}
  , approveRoute :: Integer -> m Route{- ^ Approve a route -}
  , copyRoute :: Integer -> Route -> m Route{- ^ Make an copy of the given route with optional overriding properties -}
  , createRoute :: Route -> m Route{- ^ Create new route -}
  , createRouteDirections :: Integer -> m [Direction]{- ^ Regenerate the directions of a route -}
  , createRoutePolyline :: Integer -> m Route{- ^ Update the polyline of the requested route -}
  , deleteRoute :: Integer -> m NoContent{- ^ Delete an existing route -}
  , disapproveRoute :: Integer -> m Route{- ^ Disapprove a route -}
  , getRoute :: Integer -> Maybe Bool -> m Route{- ^ Get an existing route -}
  , getRouteDirections :: Integer -> m [Direction]{- ^ Get the directions of a route -}
  , getRouteShipments :: Integer -> m [Shipment]{- ^ Get the shipments on the requested route -}
  , getRouteStop :: Integer -> Integer -> m Stop{- ^ Get the specific stop on a route -}
  , getRouteStops :: Integer -> Maybe Bool -> m [Stop]{- ^ The stops of the route requested -}
  , getShipmentsAtStop :: Integer -> Integer -> m [Shipment]{- ^ Get the list of shipments on the requested route at a stop -}
  , optimizeRoute :: Integer -> m NoContent{- ^ Optimize a route. The optimization method based on how the server is configured. -}
  , removeStop :: Integer -> Integer -> m NoContent{- ^ Delete a stop on a route -}
  , reorderRouteStopsPatch :: Integer -> [Stop] -> m [Stop]{- ^ Reordering the stops on the route with and update route distance, time, direction, and polyline -}
  , reorderRouteStopsPost :: Integer -> [Stop] -> m [Stop]{- ^ Reordering the stops on the route with and update route distance, time, direction, and polyline -}
  , searchRoutes :: Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Bool -> Maybe Int -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> m [Route]{- ^ Search for routes. -}
  , setDriver :: Integer -> Integer -> m NoContent{- ^ Update the driver of the route. -}
  , updateRoute :: Integer -> Route -> m Route{- ^ Update an existing route -}
  , updateRouteStop :: Integer -> Integer -> Stop -> m NoContent{- ^ Update a stop on a specified route -}
  , createRouteSettings :: RouteSettings -> m RouteSettings{- ^ Create a new route setting -}
  , deleteRouteSettings :: Integer -> m Value{- ^ Delete an existing route setting -}
  , getRouteSettings :: Integer -> m RouteSettings{- ^ Get an existing route settings -}
  , searchRouteSettings :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Bool -> m [RouteSettings]{- ^ Search for route settings -}
  , updateRouteSettings :: Integer -> RouteSettings -> m RouteSettings{- ^ Update an existing route setting -}
  , computeRouting :: Maybe Text -> m RoutingListResponse{- ^ This service finds the most optimal routes for delivering items between locations (reducing transit time/resources). It can take in a list of vehicles and a list of items (to be transported).All load items have pick-up and drop-off locations with time windows for when the item is expected to be picked-up and dropped-off.  -}
  , createScheduledNotification :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Bool -> m ScheduledNotificationFullResponse{- ^ This endpoint creates a Scheduled Notification message that can be configured to process and send periodically at set time periods -}
  , deleteScheduledNotification :: Maybe Integer -> Maybe Integer -> Maybe Bool -> m ScheduledNotificationFullResponse{- ^ This endpoint deletes a Scheduled Notification. Only the original owner of the Scheduled Notification or someone with write permissions can use this endpoint. Permissions can be granted to other users by using the UserPermissionsApi. -}
  , getScheduledNotification :: Maybe Integer -> Maybe Integer -> m ScheduledNotificationFullResponse{- ^ Get a ScheduledNotification -}
  , scheduleNotificationListings :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Integer -> m SirqulResponse{- ^ Use a report to identify events that are starting soon and then create a scheduled notification to push a message to matching users. -}
  , searchScheduledNotifications :: Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Bool -> Maybe Bool -> Maybe Bool -> m ScheduledNotificationFullResponse{- ^ This endpoint searches on Scheduled Notifications. If a scheduled notification was created with the visibility parameter set to PUBLIC, then anyone can search on it if the filter parameter includes the PUBLIC value. PRIVATE visibility means that it can only be searched on by the owner or if it has been shared to the user using the UserPermissionsApi.  In addition, if a PUBLIC Scheduled Notification was created for an application that requires content approval (using the publicContentApproval parameter), then an administrator of the application needs to approve it before it can be search on by other users. Before this happens, it is in a PENDING state, and only the original creator or the owner of the application can search and see it. Also, only the owner of the application can use the UserPermissionsApi to approve or reject it. Scheduled notifications that have been rejected are only visible to the original creators. -}
  , updateScheduledNotification :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Bool -> m ScheduledNotificationFullResponse{- ^ This endpoint updates a Scheduled Notification message that can be configured to process and send periodically at set time periods. Please see createScheduledNotification for more details.  Only the original owner of the Scheduled Notification or someone with write permissions can use this endpoint. Permissions can be granted to other users by using theUserPermissionsApi. -}
  , createScore :: Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Int -> Maybe Int -> Maybe Bool -> m ScoreResponse{- ^ Create a score.  The response object will contain a series of   coded messages detailing what items were completed, the score registered,   and any tickets allocated.  Scoring a  level could complete the pack it   is in, completing that pack could complete the game, which  in turn could   complete the mission.  This completion chain is indicated to the client   via  a list of {@link MessageResponse}. -}
  , getScore :: Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> m ScoreResponse{- ^ Get the high score for an item.  Pass in the full path IDs for the score. -}
  , searchScores :: Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> m [ScoreResponse]{- ^ Search the scores for an item.  Pass in the full path IDs for the scores. -}
  , createSecureApplication :: Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe FilePath -> Maybe FilePath -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m SirqulResponse{- ^ Create a secure application record. -}
  , deleteSecureApplication :: Maybe Integer -> Maybe Text -> m SirqulResponse{- ^ Delete a secure application record. -}
  , loginSecure :: Maybe Text -> Maybe Text -> Maybe FilePath -> Maybe FilePath -> Maybe Int -> Maybe Bool -> Maybe Text -> Maybe Double -> Maybe Double -> m ProfileResponse{- ^ Login via Clear.me. Creates a new account if logging in for the first time. -}
  , purchaseSecure :: PaymentRequest -> m ProfileResponse{- ^ Purchase via Clear.me. Creates a new account if purchasing for the first time. -}
  , resetSecure :: Maybe Integer -> Maybe Text -> m SirqulResponse{- ^ Reset a secure application client. -}
  , updateSecureApplication :: Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe FilePath -> Maybe FilePath -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m SirqulResponse{- ^ Update a secure application record. -}
  , createServiceHub :: ServiceHub -> m ServiceHub{- ^ Create new service hub -}
  , deleteServiceHub :: Integer -> m NoContent{- ^ Delete an existing service hub -}
  , getServiceHub :: Integer -> m Value{- ^ Get an existing service hub -}
  , postServiceHub :: Integer -> ServiceHub -> m ServiceHub{- ^ Update an existing service hub -}
  , putServiceHub :: Integer -> ServiceHub -> m ServiceHub{- ^ Update an existing service hub -}
  , searchServiceHubs :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Bool -> m [ServiceHub]{- ^ Search for service hubs. -}
  , cancelShipment :: Integer -> m NoContent{- ^ Remove shipment from route -}
  , createShipment :: Shipment -> m Shipment{- ^ Create new shipment -}
  , deleteShipment :: Integer -> m NoContent{- ^ Delete an existing shipment -}
  , getShipment :: Integer -> m Shipment{- ^ Get an existing shipment -}
  , searchShipments :: Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Bool -> m [Shipment]{- ^ Search for shipments -}
  , updateShipment :: Integer -> Shipment -> m Shipment{- ^ Update an existing shipment -}
  , updateShipmentStatus :: Integer -> (Map.Map String Bool) -> m NoContent{- ^ Update status of an existing shipment -}
  , createShipmentBatch :: ShipmentBatch -> m ShipmentBatch{- ^ Create a new shipment batch -}
  , deleteShipmentBatch :: Integer -> m NoContent{- ^ Search for shipment batches -}
  , getShipmentBatch :: Integer -> m ShipmentBatch{- ^ Get an existing shipment batch -}
  , getShipmentBatchStatus :: Integer -> Maybe Integer -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> m [ShipmentImportStatus]{- ^ Get the import status list of the import shipment batch -}
  , searchShipmentBatch :: Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> m [ShipmentBatch]{- ^ Search for shipment batches -}
  , simulation :: Maybe Text -> Maybe Bool -> m SirqulResponse{- ^ Simulates routing requests. -}
  , getStop :: Integer -> m Stop{- ^ Get an existing stop -}
  , updateStop :: Integer -> Stop -> m Stop{- ^ Update an existing stop -}
  , createStripeCheckoutSession :: Maybe Text -> Maybe Text -> m SirqulResponse{- ^ Create a Stripe checkout session -}
  , createSubscription :: Maybe Integer -> Maybe Integer -> Maybe Text -> m SubscriptionResponse{- ^ Create a subscription for a billable entity.  Provide a planId, if not provided then the base plan will be assigned. -}
  , deleteSubscription :: Maybe Integer -> m SirqulResponse{- ^ Suspend the current subscription for the billable entity managed by the account.  The account must be the responsible manager to perform this action -}
  , getSubscription :: Maybe Integer -> m SubscriptionResponse{- ^ Use the accountId to determine the associated BillableEntity.  Then get the subscription. -}
  , getSubscriptionPlan :: Maybe Integer -> m SubscriptionPlanResponse{- ^ Get the matched subscription plan -}
  , getSubscriptionPlans :: Maybe Bool -> Maybe Text -> m [SubscriptionPlanResponse]{- ^ Get the matched subscription plan -}
  , getSubscriptionUsage :: Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> m ApplicationUsageResponse{- ^ Use the accountId to determine the associated BillableEntity.  Then get the application usage. -}
  , updateSubscription :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Bool -> m SubscriptionResponse{- ^ Updates the subscription for the billable entity for an account -}
  , createTask :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> m TaskResponse{- ^ Create a Task -}
  , deleteTask :: Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Delete a Task -}
  , getTask :: Maybe Integer -> Maybe Integer -> m TaskResponse{- ^ Get a Task -}
  , searchTasks :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Bool -> m [TaskResponse]{- ^ Search on Tasks -}
  , updateTask :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> m TaskResponse{- ^ Update a Task -}
  , createTerritory :: Maybe Integer -> Maybe Text -> Maybe Bool -> m TerritoryResponse{- ^ Creates a territory. -}
  , deleteTerritory :: Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Deletes a territory. -}
  , getTerritory :: Maybe Integer -> m TerritoryResponse{- ^ Get a territory. -}
  , searchTerritories :: Maybe Text -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Bool -> m [TerritoryResponse]{- ^ Searches on territories. -}
  , updateTerritory :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Bool -> m TerritoryResponse{- ^ Updates a territory. -}
  , addOrUpdateThemeDescriptor :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe FilePath -> Maybe FilePath -> Maybe FilePath -> Maybe FilePath -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Double -> Maybe Double -> m ThemeDescriptorResponse{- ^ Creates or updates a theme descriptor that can be used to give applications a customized look and feel. The theme can be created by consumers and shared to other users, allowing them to use and/or collaborate on making the theme. -}
  , getThemeDescriptor :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Double -> m PurchaseItemListResponse{- ^ Gets a theme. -}
  , getThemeDescriptors :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Integer -> Maybe Text -> Maybe Double -> Maybe Double -> m PurchaseItemListResponse{- ^ Searches for themes. -}
  , removeThemeDescriptor :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Double -> m SirqulResponse{- ^ Removes a theme. -}
  , createCredential :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m ProfileResponse{- ^ This endpoint creates a third-party login for a Sirqul account. A third party login is a way for external systems (Third Party Networks) to link their own user accounts with a Sirqul account.   The thirdPartyId parameter is used to determine if the user already exists in Sirqul or not. This parameter needs to be unique for each user in the Third Party Network (identified by the networkUID parameter). Note that subsequent calls will update the user's third-party login credentials for the user with the same thirdPartyId and networkUID combination.    The thirdPartyToken parameter acts as a shared secret and used by client applications to log users into Sirqul without providing a Sirqul username and password.  -}
  , createNetwork :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe FilePath -> Maybe FilePath -> Maybe Text -> Maybe Text -> Text -> m ThirdPartyNetworkResponse{- ^ Creates a custom third party network. -}
  , deleteCredential :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> m SirqulResponse{- ^ Delete a third party network on a Sirqul account. -}
  , deleteNetwork :: Maybe Integer -> Maybe Text -> m SirqulResponse{- ^ Marks a custom third party network as deleted. Only the network owners and managers have access to this. -}
  , getCredential :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Text -> Maybe Integer -> m ProfileResponse{- ^ Gets the account information given a third party token. -}
  , getNetwork :: Maybe Integer -> Maybe Text -> m ThirdPartyNetworkResponse{- ^ Get the details of a third party network. Only the network owners and managers have access to this. -}
  , searchCredentials :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> m [ThirdPartyCredentialResponse]{- ^ Search on a user's linked third party networks. -}
  , searchNetworks :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Bool -> Maybe Bool -> m [ThirdPartyNetworkShortResponse]{- ^ Search on supported third party networks and custom networks from external users. -}
  , sendMFAChallenge :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> m SirqulResponse{- ^ Sends an MFA challenge (SMS or Email) for networks with MFA enabled. -}
  , updateCredential :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m ProfileResponse{- ^ Updates a third-party login for an account. -}
  , updateNetwork :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe FilePath -> Maybe FilePath -> Maybe Text -> Maybe Text -> Text -> m ThirdPartyNetworkResponse{- ^ Updates a custom third party network. Only the network owners and managers have access to this. -}
  , getTicketCount :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> m CountResponse{- ^ Gets the ticket count. -}
  , getTicketList :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m TicketListResponse{- ^ Gets the list of tickets. -}
  , giftPurchase :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> m SirqulResponse{- ^ Gift tickets to another user. -}
  , saveTicket :: Maybe Bool -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Text -> m ProfileResponse{- ^ Allow user to acquire a purchase item and generate a ticket record. Used to redeem tickets or add tickets to the system. -}
  , saveTicketViaFileUpload :: Maybe Bool -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe FilePath -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Text -> m ProfileResponse{- ^ Similar to the Save Ticket endpoint but allows the receiptData to be in binary format. This must be a multi-part post -}
  , ticketOffers :: m TicketOfferResponse{- ^ Get a list offers for tickets owned by sirqul.  Purchasing these will add the number of tickets to the account specified by the offer. -}
  , createTournament :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Integer -> Maybe Bool -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> m TournamentResponse{- ^ Create a tournament. -}
  , deleteTournament :: Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Delete a tournament. -}
  , getTournament :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Int -> m TournamentResponse{- ^ Get a tournament. -}
  , searchObjects :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> m SirqulResponse{- ^ Search on game objects of tournaments -}
  , searchRounds :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Int -> Maybe Int -> m SirqulResponse{- ^ Search for the user's tournament games. -}
  , searchTournaments :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Int -> Maybe Int -> m MissionShortResponse{- ^ Search for tournaments -}
  , submitTournamentScore :: Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> m SirqulResponse{- ^ Submit an array of scores for a tournament match.  -}
  , submitTournamentVote :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Bool -> m SirqulResponse{- ^ Submit a vote for a multi-stage album tournament. -}
  , substituteTournamentPlayer :: Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Service to replace the user's opponent in the current level - pack - mission with an AI account. -}
  , updateTournament :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Int -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Integer -> Maybe Bool -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> m TournamentResponse{- ^ Update a tournament. -}
  , batchSaveTracking :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> m [Leg]{- ^ Batch create tracking legs -}
  , getPredictedLocations :: Maybe Integer -> Maybe Double -> Maybe Double -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Double -> Maybe Text -> m PredictedLocationResponse{- ^ Get the predicted location for a customer based on previous behavior.  If a customer resides in a place for a period of time this is marked as a preferred location.  We look back over the previous few days and the previous days of the week from the day specified.  If for instance the day was a Wednesday then this would check the days before, including: Tuesday, Monday, Sunday, etc. It will also check some number of previous Wednesdays in the past few weeks. -}
  , getPredictedPath :: Maybe Integer -> Maybe Integer -> Maybe Integer -> m [StepResponse]{- ^ Get the path (lat/long coordinates) between 2 steps previously logged for a customer. -}
  , getPreferredLocations :: Maybe Integer -> Maybe Double -> Maybe Double -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Double -> Maybe Text -> m [PreferredLocationResponse]{- ^ Search on preferred locations for a user, which is created when a customer resides in a place for a period of time. -}
  , getTrackingLegs :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Bool -> m [LegResponse]{- ^ Retrieve tracking data to be able to show where a user has been. -}
  , saveTrackingLeg :: Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Integer -> Maybe Double -> Maybe Double -> Maybe Integer -> Maybe Double -> Maybe Double -> Maybe Integer -> Maybe Text -> Maybe Text -> m SirqulResponse{- ^ Send tracking points to be able to generate pathing data -}
  , saveTrackingStep :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Double -> Maybe Integer -> Maybe Double -> Maybe Double -> Maybe Integer -> Maybe Double -> Maybe Double -> Maybe Integer -> m SirqulResponse{- ^ Send tracking points to be able to generate pathing data -}
  , searchAccountsWithTrackingLegs :: Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Bool -> m [AccountMiniResponse]{- ^ Search for all accounts that have tracking legs data by the given constraints. -}
  , searchTrackingLegs :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Int -> Maybe Int -> m [LegResponse]{- ^ Retrieve tracking data for billable/account scoped queries. -}
  , createTrigger :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> m TriggerResponse{- ^ Create a trigger -}
  , deleteTrigger :: Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Mark a trigger as deleted. -}
  , getTrigger :: Maybe Integer -> Maybe Integer -> m TriggerResponse{- ^ Get a trigger -}
  , searchTriggers :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Bool -> m [TriggerResponse]{- ^ Search for triggers -}
  , updateTrigger :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> m TriggerResponse{- ^ Update a trigger -}
  , createTrip :: Trip -> m Trip{- ^ Create a new trip -}
  , delete :: Integer -> m NoContent{- ^ Delete an existing trip -}
  , driveTrip :: Integer -> Maybe Bool -> m Trip{- ^ Update trip preference to drive, also create a route and assign the trip to the route -}
  , flexibleTrip :: Integer -> Maybe Bool -> m Trip{- ^ Update trip preference to flexible. -}
  , getTrip :: Integer -> m Trip{- ^ Get an existing trip -}
  , getTripMatches :: Integer -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Bool -> m [Trip]{- ^ Get matching trips of specific trip -}
  , processTripMatches :: Maybe Integer -> Maybe Integer -> Maybe Integer -> m [Trip]{- ^ Process trip matching, assign trips with no route to matched trips with route. -}
  , ride :: Integer -> Maybe Bool -> m Trip{- ^ Update trip preference to ride. -}
  , search :: Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Bool -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Bool -> m [Trip]{- ^ Search for trips -}
  , searchTrips :: Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Bool -> m [Trip]{- ^ Search for trips with matching information. -}
  , updateLocations :: Integer -> Trip -> m Trip{- ^  -}
  , updateRecurrenceLocations :: Integer -> Trip -> m [Trip]{- ^  -}
  , updateRecurrenceShipments :: Integer -> Trip -> m [Trip]{- ^  -}
  , updateShipments :: Integer -> Trip -> m Trip{- ^  -}
  , updateTrip :: Integer -> Trip -> m Trip{- ^ Update an existing trip. Does not support recurring trip update. -}
  , updateTripNotifications :: Maybe Integer -> Maybe Text -> m Trip{- ^ Update the trip notifications -}
  , smsBuyOffer :: Text -> Maybe Text -> Maybe Text -> Maybe Text -> m TwiMLResponse{- ^ Recieve an SMS payload from Twillio to purchase an offer. -}
  , authorizeTwitter :: Maybe Text -> m SirqulResponse{- ^ Makes an authorization call to twitter for a user to login and allow any app permissions. -}
  , loginTwitter :: Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Double -> Maybe Double -> m ProfileResponse{- ^ Returns the user profile information given an access token and the secret access token. This call verifies the tokens with twitter and creates a Sirqul account for the user if its their first time logging in. -}
  , addUsersToPermissionable :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Double -> Maybe Double -> Maybe Text -> m SirqulResponse{- ^ Adds a user to a permissionable object. -}
  , approvePermissionable :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Text -> m SirqulResponse{- ^ Sets the approval status of a permissionable object. -}
  , leaveFromPermissionable :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Double -> m SirqulResponse{- ^ Used when the user wants to leave from someone else's permissionable object -}
  , removeUsersFromPermissionable :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Double -> Maybe Double -> Maybe Text -> m SirqulResponse{- ^ Used to remove someone (assuming they have permission) from a permissionable object -}
  , searchPermissionables :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Int -> Maybe Int -> m [UserPermissionsResponse]{- ^ Search on UserPermissions -}
  , searchPermissionablesFollowingDistance :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Double -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Int -> Maybe Int -> m [UserPermissionsResponse]{- ^ Search on UserPermissions by distance -}
  , createFollowing :: Maybe Integer -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Create following. -}
  , createSpace :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Create a Vatom space. -}
  , createVatomEvent :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Create a Vatom event. -}
  , deleteFollowing :: Maybe Integer -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Delete following. -}
  , deletePointsBalance :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Reset All Points Balance. -}
  , deleteSpace :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Delete a Vatom space. -}
  , deleteVatomEvent :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Delete a Vatom event. -}
  , deleteVatomNFT :: Maybe Integer -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Delete Vatom NFT -}
  , executeActionOnNFT :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Execute Action on NFT. -}
  , geomapSearch :: Maybe Integer -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Search Vatom Geo Map -}
  , getBusinessBehaviors :: Maybe Integer -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Gets the behaviors of a business. -}
  , getBusinessCoinsBalance :: Maybe Integer -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Get the coins for a Businesss. -}
  , getBusinessIds :: Maybe Integer -> Maybe Bool -> m NoContent{- ^ Get the business ids the logged in user has access to. -}
  , getBusinessInfo :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Gets the business info tied to this account. -}
  , getBusinessUsers :: Maybe Integer -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Gets the users of a business. -}
  , getCampaignGroupEntities :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Get campaign group entities. -}
  , getCampaignGroupRules :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Get campaign group rules. -}
  , getCampaignGroupStats :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Get campaign group stats. -}
  , getCampaignInfo :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Gets the info on a campaign. -}
  , getEventGuestList :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Gets the guest list of an event. -}
  , getInventory :: Maybe Integer -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Gets the logged in user's Vatom Inventory. -}
  , getMyFollowing :: Maybe Integer -> Maybe Bool -> m NoContent{- ^ Get following. -}
  , getPointsBalance :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Gets the points balance of a Vatom user. -}
  , getPointsBalanceAsBusiness :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Gets the points balance of a Vatom user. -}
  , getSpace :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Gets the details of a space. -}
  , getUserCoinsAsBusiness :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Get the coins for a user (as a Business). -}
  , getUserCoinsBalance :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Gets the coins balance for a Vatom User. -}
  , getUserFollowers :: Maybe Integer -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Get user followers. -}
  , getUserFollowing :: Maybe Integer -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Get user following. -}
  , getUserInfo :: Maybe Integer -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Get a User's Info. -}
  , getUserProfile :: Maybe Integer -> Maybe Bool -> m NoContent{- ^ Gets the logged in user's profile in Vatom. -}
  , getVatomEvent :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Gets the details of a event. -}
  , getVatomNFT :: Maybe Integer -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Get Vatom NFT Details -}
  , listCommunities :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Gets the communities tied to a business. -}
  , listEvents :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Gets the events tied to a business. -}
  , listSpaces :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Gets the spaces tied to a business. -}
  , listUserCoinTransactions :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Gets the logged in user's Vatom coin transactions. -}
  , listUserCoinTransactionsAsBusiness :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ List coin transactions for a user (as a Business). -}
  , performActionOnNFT :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Perform Action on NFT. -}
  , redeemNFT :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Redeem an NFT. -}
  , redeemUserCoinsAsBusiness :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Redeem the coins for a user (as a Business). -}
  , searchBusinesses :: Maybe Integer -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Searches for Vatom businesses. -}
  , searchCampaignGroups :: Maybe Integer -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Search campaign groups. -}
  , searchIdentities :: Maybe Integer -> Maybe Bool -> m NoContent{- ^ Search User Identities. -}
  , searchInventory :: Maybe Integer -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Searches the logged in user's Vatom Inventory. -}
  , sendNFT :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Send an NFT. -}
  , setPointsBalanceAsBusiness :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Sets the points balance of a Vatom user. -}
  , transferUserCoins :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Transfer coins from Vatom Users. -}
  , updateBusinessCoins :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Fund/update coins for a Businesss. -}
  , updateEventGuestList :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Update the guest list of an event. -}
  , updateSpace :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Update a Vatom space. -}
  , updateUserCoinsAsBusiness :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Update the coins for a user (as a Business). -}
  , updateUserProfile :: Maybe Integer -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Gets the logged in user's profile in Vatom. -}
  , updateVatomEvent :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> m NoContent{- ^ Update a Vatom event. -}
  , createVehicle :: Maybe Text -> Vehicle -> m Vehicle{- ^ Create new vehicle -}
  , deleteVehicle :: Integer -> m NoContent{- ^ Delete an existing vehicle -}
  , getVehicle :: Integer -> m Vehicle{- ^ Get an existing vehicle -}
  , searchVehicle :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Bool -> m [Vehicle]{- ^ Search for vehicles -}
  , updateVehicle :: Integer -> Maybe Text -> Vehicle -> m Vehicle{- ^ Update an existing vehicle -}
  , createVehicleType :: Maybe Text -> VehicleType -> m VehicleType{- ^ Create a new vehicle type -}
  , deleteVehicleType :: Integer -> m NoContent{- ^ Delete a vehicle type -}
  , getVehicleType :: Integer -> m VehicleType{- ^ Get a vehicle type -}
  , searchVehicleTypes :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Bool -> m [VehicleType]{- ^ Search for types of vehicles -}
  , updateVehicleType :: Integer -> Maybe Text -> VehicleType -> m VehicleType{- ^ Update a vehicle type -}
  , createOfferTransaction :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> Maybe Int -> m [OfferTransactionResponse]{- ^ Adds offers to the wallet -}
  , deleteOfferTransaction :: Maybe Text -> Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Removes the transaction from the wallet by setting the deleted date to the current date/time.  Requires a valid account and transactionId. -}
  , getOfferTransaction :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Bool -> Maybe Double -> Maybe Double -> Maybe Bool -> m OfferTransactionResponse{- ^  -}
  , previewOfferTransaction :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Text -> m [OfferTransactionResponse]{- ^ Preview the final cost of a transaction without charging the user -}
  , searchOfferTransactions :: Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Int -> Maybe Int -> Maybe Double -> Maybe Double -> Maybe Integer -> Maybe Integer -> Maybe Bool -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Bool -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Bool -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Integer -> m [OfferTransactionResponse]{- ^ Search on active offers currently in the user's wallet, or past offers the user has already redeemed. -}
  , updateOfferTransaction :: Maybe Text -> Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Bool -> Maybe Text -> Maybe Int -> Maybe Double -> Maybe Double -> Maybe Text -> Maybe Bool -> Maybe Text -> m OfferTransactionResponse{- ^ Update offer status. The status values are: 0 - not redeemable, 1 - redeemable.  Not redeemable means the customer has received the offer but has not decided to use (or print) it yet.  Until they choose to do this the merchant cannot redeem the offer (has not been given permission yet).   Redeemable means the customer has chosen to use the offer and wishes to redeem it.  Redeemed means the merchant has accepted the offer and the given the customer its value, then marked it a used in the system.  This status change is handled by a merchant end point. -}
  , searchWeather :: Maybe Integer -> Maybe Double -> Maybe Double -> Maybe Integer -> m WeatherResponse{- ^ Search the weather forcast for the next 5 days -}
  , createWord :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Bool -> Maybe Bool -> Maybe Integer -> Maybe Text -> Maybe Integer -> m WordzWordResponse{- ^ Create a word by the given params. -}
  , deleteWord :: Maybe Integer -> Maybe Integer -> m SirqulResponse{- ^ Delete a word by the given id. The accountId given needs to be the owner or executive to delete. -}
  , getWord :: Maybe Integer -> Maybe Integer -> m WordzWordResponse{- ^ Get a word by the given id. -}
  , getWords :: Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Bool -> Maybe Bool -> Maybe Int -> Maybe Int -> m [WordzWordResponse]{- ^ Search for words by the given params. -}
  , updateWord :: Maybe Integer -> Maybe Integer -> Maybe Text -> Maybe Text -> Maybe Integer -> Maybe Bool -> Maybe Bool -> Maybe Integer -> Maybe Text -> Maybe Integer -> m WordzWordResponse{- ^ Update a word by the given params. -}
  , runWorkflow :: Maybe Integer -> Maybe Integer -> Maybe Integer -> Maybe Int -> Maybe Text -> m SirqulResponse{- ^ Runs a published executable workflow -}
  }

-- | Authentication settings for SirqulIoTPlatform.
-- lookupUser is used to retrieve a user given a header value. The data type can be specified by providing an
-- type instance for AuthServerData. authError is a function that given a request returns a custom error that
-- is returned when the header is not found.
data SirqulIoTPlatformAuth = SirqulIoTPlatformAuth
  { lookupUser :: ByteString -> Handler AuthServer
  , authError :: Request -> ServerError
  }
-- | Authentication settings for SirqulIoTPlatform.
-- lookupUser is used to retrieve a user given a header value. The data type can be specified by providing an
-- type instance for AuthServerData. authError is a function that given a request returns a custom error that
-- is returned when the header is not found.
data SirqulIoTPlatformAuth = SirqulIoTPlatformAuth
  { lookupUser :: ByteString -> Handler AuthServer
  , authError :: Request -> ServerError
  }

newtype SirqulIoTPlatformClient a = SirqulIoTPlatformClient
  { runClient :: ClientEnv -> ExceptT ClientError IO a
  } deriving Functor

instance Applicative SirqulIoTPlatformClient where
  pure x = SirqulIoTPlatformClient (\_ -> pure x)
  (SirqulIoTPlatformClient f) <*> (SirqulIoTPlatformClient x) =
    SirqulIoTPlatformClient (\env -> f env <*> x env)

instance Monad SirqulIoTPlatformClient where
  (SirqulIoTPlatformClient a) >>= f =
    SirqulIoTPlatformClient (\env -> do
      value <- a env
      runClient (f value) env)

instance MonadIO SirqulIoTPlatformClient where
  liftIO io = SirqulIoTPlatformClient (\_ -> liftIO io)

createSirqulIoTPlatformClient :: SirqulIoTPlatformBackend AuthClient SirqulIoTPlatformClient
createSirqulIoTPlatformClient = SirqulIoTPlatformBackend{..}
  where
    ((coerce -> consumerCreate) :<|>
     (coerce -> consumerUpdate) :<|>
     (coerce -> queueCreate) :<|>
     (coerce -> queueDelete) :<|>
     (coerce -> queueGet) :<|>
     (coerce -> queuePublish) :<|>
     (coerce -> queueSearch) :<|>
     (coerce -> queueUpdate) :<|>
     (coerce -> accountLocationSearch) :<|>
     (coerce -> blockAccount) :<|>
     (coerce -> createAccount) :<|>
     (coerce -> editAccount) :<|>
     (coerce -> editUsername) :<|>
     (coerce -> getAccount) :<|>
     (coerce -> getProfileAssets) :<|>
     (coerce -> getReferralList) :<|>
     (coerce -> getSettings) :<|>
     (coerce -> loginDelegate) :<|>
     (coerce -> loginGeneral) :<|>
     (coerce -> loginUsername) :<|>
     (coerce -> logout) :<|>
     (coerce -> mergeAccount) :<|>
     (coerce -> passwordChange) :<|>
     (coerce -> passwordReset) :<|>
     (coerce -> requestPasswordReset) :<|>
     (coerce -> requestValidateAccount) :<|>
     (coerce -> searchAccounts) :<|>
     (coerce -> secureLogin) :<|>
     (coerce -> secureSignup) :<|>
     (coerce -> setMatchToken) :<|>
     (coerce -> updateActveStatus) :<|>
     (coerce -> updateLocation) :<|>
     (coerce -> updateSettings) :<|>
     (coerce -> validateAccountSignup) :<|>
     (coerce -> validatePasswordReset) :<|>
     (coerce -> achievementTierSearchPost) :<|>
     (coerce -> createAchievement) :<|>
     (coerce -> createAchievementTier) :<|>
     (coerce -> deleteAchievement) :<|>
     (coerce -> deleteAchievementTier) :<|>
     (coerce -> getAchievement) :<|>
     (coerce -> getAchievementTier) :<|>
     (coerce -> getUserAchievements) :<|>
     (coerce -> listAchievementTags) :<|>
     (coerce -> listAchievements) :<|>
     (coerce -> searchAchievements) :<|>
     (coerce -> updateAchievement) :<|>
     (coerce -> updateAchievementTier) :<|>
     (coerce -> updateUserAchievement) :<|>
     (coerce -> createEntityReference) :<|>
     (coerce -> addAlbumCollection) :<|>
     (coerce -> addAlbumUsers) :<|>
     (coerce -> approveAlbum) :<|>
     (coerce -> getAlbumCollection) :<|>
     (coerce -> leaveAlbum) :<|>
     (coerce -> removeAlbum) :<|>
     (coerce -> removeAlbumUsers) :<|>
     (coerce -> searchAlbums) :<|>
     (coerce -> updateAlbumCollection) :<|>
     (coerce -> activities) :<|>
     (coerce -> aggregatedFilteredUsage) :<|>
     (coerce -> filteredUsage) :<|>
     (coerce -> usage) :<|>
     (coerce -> usageBatch) :<|>
     (coerce -> getAppData) :<|>
     (coerce -> postAppData) :<|>
     (coerce -> regenAppData) :<|>
     (coerce -> createApplication) :<|>
     (coerce -> createApplicationPlacement) :<|>
     (coerce -> deleteApplication) :<|>
     (coerce -> deleteApplicationPlacement) :<|>
     (coerce -> getApplication) :<|>
     (coerce -> getApplicationPlacement) :<|>
     (coerce -> getApplicationVersions) :<|>
     (coerce -> getUniqueUsersByApp) :<|>
     (coerce -> listApplications) :<|>
     (coerce -> searchApplicationPlacement) :<|>
     (coerce -> searchApplicationSettings) :<|>
     (coerce -> searchApplications) :<|>
     (coerce -> updateApplication) :<|>
     (coerce -> updateApplicationActive) :<|>
     (coerce -> updateApplicationPlacement) :<|>
     (coerce -> uploadApplicationCertificate) :<|>
     (coerce -> createApplicationConfig) :<|>
     (coerce -> deleteApplicationConfig) :<|>
     (coerce -> getApplicationConfig) :<|>
     (coerce -> getApplicationConfigByConfigVersion) :<|>
     (coerce -> searchApplicationConfig) :<|>
     (coerce -> updateApplicationConfig) :<|>
     (coerce -> assetDownload) :<|>
     (coerce -> assetMorph) :<|>
     (coerce -> createAsset) :<|>
     (coerce -> deleteAsset) :<|>
     (coerce -> getAsset) :<|>
     (coerce -> removeAsset) :<|>
     (coerce -> searchAssets) :<|>
     (coerce -> updateAsset) :<|>
     (coerce -> assigmentAssigneeAccountSearch) :<|>
     (coerce -> assignmentCreate) :<|>
     (coerce -> assignmentDelete) :<|>
     (coerce -> assignmentGet) :<|>
     (coerce -> assignmentSearch) :<|>
     (coerce -> assignmentStatusCreate) :<|>
     (coerce -> assignmentStatusDelete) :<|>
     (coerce -> assignmentStatusGet) :<|>
     (coerce -> assignmentStatusSearch) :<|>
     (coerce -> assignmentStatusUpdate) :<|>
     (coerce -> assignmentUpdate) :<|>
     (coerce -> createAudience) :<|>
     (coerce -> deleteAudience) :<|>
     (coerce -> getAgeGroups) :<|>
     (coerce -> getAudience) :<|>
     (coerce -> getAudienceList) :<|>
     (coerce -> getDevices) :<|>
     (coerce -> getExperiences) :<|>
     (coerce -> getGroupedAudiences) :<|>
     (coerce -> listByAccount) :<|>
     (coerce -> listByAudience) :<|>
     (coerce -> listLastestByAccount) :<|>
     (coerce -> sendByAccount) :<|>
     (coerce -> updateAudience) :<|>
     (coerce -> createBid) :<|>
     (coerce -> deleteBid) :<|>
     (coerce -> getBid) :<|>
     (coerce -> updateBid) :<|>
     (coerce -> createBillableEntity) :<|>
     (coerce -> deleteBillableEntity) :<|>
     (coerce -> getBillableEntity) :<|>
     (coerce -> updateBillableEntity) :<|>
     (coerce -> addPaymentMethod) :<|>
     (coerce -> createPaymentMethod) :<|>
     (coerce -> createSmartContract) :<|>
     (coerce -> getCryptoBalance) :<|>
     (coerce -> getPaymentMethod) :<|>
     (coerce -> searchPaymentMethod) :<|>
     (coerce -> getStatusCSV) :<|>
     (coerce -> listStatusCSV) :<|>
     (coerce -> statusCSV) :<|>
     (coerce -> uploadCSV) :<|>
     (coerce -> createCargoType) :<|>
     (coerce -> deleteCargoType) :<|>
     (coerce -> getCargoType) :<|>
     (coerce -> searchCargoTypes) :<|>
     (coerce -> updateCargoType) :<|>
     (coerce -> searchCarriers) :<|>
     (coerce -> categoryDistanceSearch) :<|>
     (coerce -> createCategory) :<|>
     (coerce -> deleteCategory) :<|>
     (coerce -> duplicateCategory) :<|>
     (coerce -> getCategory) :<|>
     (coerce -> searchCategories) :<|>
     (coerce -> updateCategory) :<|>
     (coerce -> addConnectionToGroup) :<|>
     (coerce -> addConnectionsToGroup) :<|>
     (coerce -> addSubGroups) :<|>
     (coerce -> createOrUpdateConnection) :<|>
     (coerce -> createOrUpdateGroup) :<|>
     (coerce -> followAccept) :<|>
     (coerce -> followReject) :<|>
     (coerce -> followRemove) :<|>
     (coerce -> followRequest) :<|>
     (coerce -> friendAccept) :<|>
     (coerce -> friendReject) :<|>
     (coerce -> friendRemove) :<|>
     (coerce -> friendRequest) :<|>
     (coerce -> getConnectionSentFriendRequests) :<|>
     (coerce -> getConnections) :<|>
     (coerce -> getGroupDetails) :<|>
     (coerce -> groupSearch) :<|>
     (coerce -> removeConnectionFromGroup) :<|>
     (coerce -> removeConnectionsFromGroup) :<|>
     (coerce -> removeGroup) :<|>
     (coerce -> removeSubGroups) :<|>
     (coerce -> searchConnections) :<|>
     (coerce -> addOrUpdateAlbumContest) :<|>
     (coerce -> approveAlbumContest) :<|>
     (coerce -> deleteContest) :<|>
     (coerce -> getAlbumContest) :<|>
     (coerce -> getAlbumContests) :<|>
     (coerce -> voteOnAlbumContest) :<|>
     (coerce -> addPreview) :<|>
     (coerce -> adsFind) :<|>
     (coerce -> createCreative) :<|>
     (coerce -> deleteCreative) :<|>
     (coerce -> getCreative) :<|>
     (coerce -> getCreativesByApplication) :<|>
     (coerce -> removePreview) :<|>
     (coerce -> updateCreative) :<|>
     (coerce -> create) :<|>
     (coerce -> getDependents) :<|>
     (coerce -> removeDependent) :<|>
     (coerce -> checkDisbursements) :<|>
     (coerce -> createDisbursement) :<|>
     (coerce -> getDisbursement) :<|>
     (coerce -> searchDisbursements) :<|>
     (coerce -> updateDisbursement) :<|>
     (coerce -> assignEmployee) :<|>
     (coerce -> assignToLocationEmployee) :<|>
     (coerce -> createEmployee) :<|>
     (coerce -> deleteEmployee) :<|>
     (coerce -> getEmployee) :<|>
     (coerce -> searchEmployees) :<|>
     (coerce -> unassignEmployee) :<|>
     (coerce -> updateEmployee) :<|>
     (coerce -> attendEvent) :<|>
     (coerce -> createEvent) :<|>
     (coerce -> deleteEvent) :<|>
     (coerce -> getEvent) :<|>
     (coerce -> searchEventTransactions) :<|>
     (coerce -> searchEvents) :<|>
     (coerce -> updateEvent) :<|>
     (coerce -> getToken) :<|>
     (coerce -> graphInterface) :<|>
     (coerce -> addFavorite) :<|>
     (coerce -> deleteFavorite) :<|>
     (coerce -> getFavorite) :<|>
     (coerce -> searchFavorites) :<|>
     (coerce -> whoHasFavorited) :<|>
     (coerce -> createFilter) :<|>
     (coerce -> deleteFilter) :<|>
     (coerce -> getFilter) :<|>
     (coerce -> searchFilters) :<|>
     (coerce -> updateFilter) :<|>
     (coerce -> createFlag) :<|>
     (coerce -> deleteFlag) :<|>
     (coerce -> getFlag) :<|>
     (coerce -> getFlagThreshold) :<|>
     (coerce -> updateFlagThreshold) :<|>
     (coerce -> createGame) :<|>
     (coerce -> deleteGame) :<|>
     (coerce -> getGame) :<|>
     (coerce -> searchGames) :<|>
     (coerce -> updateGame) :<|>
     (coerce -> createGameLevel) :<|>
     (coerce -> deleteGameLevel) :<|>
     (coerce -> getGameLevel) :<|>
     (coerce -> getGameLevelsByApplication) :<|>
     (coerce -> getGameLevelsByBillableEntity) :<|>
     (coerce -> getQuestionsInLevel) :<|>
     (coerce -> getWordsInLevel) :<|>
     (coerce -> updateGameLevel) :<|>
     (coerce -> updateQuestionsInLevel) :<|>
     (coerce -> updateWordsInLevel) :<|>
     (coerce -> acceptInvite) :<|>
     (coerce -> albumContestInvite) :<|>
     (coerce -> albumInvite) :<|>
     (coerce -> eventInvite) :<|>
     (coerce -> gameInvite) :<|>
     (coerce -> getInvite) :<|>
     (coerce -> missionInvite) :<|>
     (coerce -> offerInvite) :<|>
     (coerce -> offerLocationInvite) :<|>
     (coerce -> retailerLocationInvite) :<|>
     (coerce -> createLeaderboard) :<|>
     (coerce -> deleteLeaderboard) :<|>
     (coerce -> getLeaderboard) :<|>
     (coerce -> searchLeaderboards) :<|>
     (coerce -> updateLeaderboard) :<|>
     (coerce -> registerLike) :<|>
     (coerce -> removeLike) :<|>
     (coerce -> searchLikes) :<|>
     (coerce -> createListing) :<|>
     (coerce -> deleteListing) :<|>
     (coerce -> getListing) :<|>
     (coerce -> searchListing) :<|>
     (coerce -> summaryListing) :<|>
     (coerce -> updateListing) :<|>
     (coerce -> cacheTrilaterationData) :<|>
     (coerce -> cacheTrilaterationDataGzip) :<|>
     (coerce -> getLocationByIp) :<|>
     (coerce -> getLocationByTrilateration) :<|>
     (coerce -> getLocations) :<|>
     (coerce -> createLocationV2) :<|>
     (coerce -> updateLocationV2) :<|>
     (coerce -> createMedia) :<|>
     (coerce -> deleteMedia) :<|>
     (coerce -> getMedia) :<|>
     (coerce -> searchMedia) :<|>
     (coerce -> updateMedia) :<|>
     (coerce -> createMission) :<|>
     (coerce -> deleteMission) :<|>
     (coerce -> findMissions) :<|>
     (coerce -> getMission) :<|>
     (coerce -> importMission) :<|>
     (coerce -> searchMissionFormats) :<|>
     (coerce -> searchMissions) :<|>
     (coerce -> searchMissionsByBillableEntity) :<|>
     (coerce -> updateMission) :<|>
     (coerce -> createMissionInvite) :<|>
     (coerce -> deleteMissionInvite) :<|>
     (coerce -> getMissionInvite) :<|>
     (coerce -> searchMissionInvites) :<|>
     (coerce -> updateMissionInvite) :<|>
     (coerce -> batchOperation) :<|>
     (coerce -> createNote) :<|>
     (coerce -> deleteNote) :<|>
     (coerce -> getNote) :<|>
     (coerce -> searchNotes) :<|>
     (coerce -> updateNote) :<|>
     (coerce -> createNotificationTemplate) :<|>
     (coerce -> createOrUpdateBlockedNotifications) :<|>
     (coerce -> deleteNotificationTemplate) :<|>
     (coerce -> getNotificationTemplate) :<|>
     (coerce -> getNotifications) :<|>
     (coerce -> registerNotificationToken) :<|>
     (coerce -> searchBlockedNotifications) :<|>
     (coerce -> searchNotificationTemplate) :<|>
     (coerce -> searchRecipients) :<|>
     (coerce -> searchRecipientsCount) :<|>
     (coerce -> sendBatchNotifications) :<|>
     (coerce -> sendCustomNotifications) :<|>
     (coerce -> updateNotificationTemplate) :<|>
     (coerce -> addField) :<|>
     (coerce -> createData) :<|>
     (coerce -> createObject) :<|>
     (coerce -> deleteData) :<|>
     (coerce -> deleteField) :<|>
     (coerce -> deleteObject) :<|>
     (coerce -> getData) :<|>
     (coerce -> getObject) :<|>
     (coerce -> searchData) :<|>
     (coerce -> searchObject) :<|>
     (coerce -> updateData) :<|>
     (coerce -> batchUpdateOfferLocations) :<|>
     (coerce -> createOffer) :<|>
     (coerce -> deleteOffer) :<|>
     (coerce -> deleteOfferLocation) :<|>
     (coerce -> getOffer) :<|>
     (coerce -> getOfferDetails) :<|>
     (coerce -> getOfferListCounts) :<|>
     (coerce -> getOfferLocation) :<|>
     (coerce -> getOfferLocationsForRetailers) :<|>
     (coerce -> getOffersForRetailers) :<|>
     (coerce -> redeemOfferTransaction) :<|>
     (coerce -> searchOfferTransactionsForRetailers) :<|>
     (coerce -> searchOffersForConsumer) :<|>
     (coerce -> topOfferTransactions) :<|>
     (coerce -> updateOffer) :<|>
     (coerce -> updateOfferStatus) :<|>
     (coerce -> createOfferTransactionStatus) :<|>
     (coerce -> deleteOfferTransactionStatus) :<|>
     (coerce -> getOfferTransactionStatus) :<|>
     (coerce -> searchOfferTransactionStatuses) :<|>
     (coerce -> updateOfferTransactionStatus) :<|>
     (coerce -> imageGeneration) :<|>
     (coerce -> getOptimizationResult) :<|>
     (coerce -> requestOptimization) :<|>
     (coerce -> addMovie) :<|>
     (coerce -> aiDocs) :<|>
     (coerce -> aiFindImages) :<|>
     (coerce -> aiTags) :<|>
     (coerce -> aiText) :<|>
     (coerce -> batch) :<|>
     (coerce -> createInstantEpisode) :<|>
     (coerce -> createVoiceCanvas) :<|>
     (coerce -> emotion) :<|>
     (coerce -> getAddMovieResult) :<|>
     (coerce -> getBatch) :<|>
     (coerce -> getEmotion) :<|>
     (coerce -> getEpisodeStatus) :<|>
     (coerce -> getRenderStatus) :<|>
     (coerce -> getSTT) :<|>
     (coerce -> getTTS) :<|>
     (coerce -> getTechTune) :<|>
     (coerce -> getTopics) :<|>
     (coerce -> getVoiceCanvas) :<|>
     (coerce -> startVideoRender) :<|>
     (coerce -> stt) :<|>
     (coerce -> summarizeTopics) :<|>
     (coerce -> techTune) :<|>
     (coerce -> tts) :<|>
     (coerce -> createPack) :<|>
     (coerce -> deletePack) :<|>
     (coerce -> getPack) :<|>
     (coerce -> searchPacks) :<|>
     (coerce -> updatePack) :<|>
     (coerce -> processAllParticipants) :<|>
     (coerce -> processParticipants) :<|>
     (coerce -> computePath) :<|>
     (coerce -> createPostalCode) :<|>
     (coerce -> deletePostalCode) :<|>
     (coerce -> getPostalCode) :<|>
     (coerce -> getPostalCodes) :<|>
     (coerce -> updatePostalCode) :<|>
     (coerce -> createPersona) :<|>
     (coerce -> deletePersona) :<|>
     (coerce -> getPersonaList) :<|>
     (coerce -> searchPersona) :<|>
     (coerce -> updatePersona) :<|>
     (coerce -> createProgram) :<|>
     (coerce -> deleteProgram) :<|>
     (coerce -> getProgram) :<|>
     (coerce -> postProgram) :<|>
     (coerce -> putProgram) :<|>
     (coerce -> searchPrograms) :<|>
     (coerce -> createPurchaseItem) :<|>
     (coerce -> deletePurchaseItem) :<|>
     (coerce -> getPurchaseItem) :<|>
     (coerce -> searchPurchaseItems) :<|>
     (coerce -> updatePurchaseItem) :<|>
     (coerce -> createOrder) :<|>
     (coerce -> deleteOrder) :<|>
     (coerce -> getOrder) :<|>
     (coerce -> previewOrder) :<|>
     (coerce -> searchOrders) :<|>
     (coerce -> updateOrder) :<|>
     (coerce -> createQuestion) :<|>
     (coerce -> deleteQuestion) :<|>
     (coerce -> getQuestion) :<|>
     (coerce -> searchQuestions) :<|>
     (coerce -> updateQuestion) :<|>
     (coerce -> getHistoricalRankings) :<|>
     (coerce -> getRankings) :<|>
     (coerce -> getUserRank) :<|>
     (coerce -> overrideUserRank) :<|>
     (coerce -> updateRankings) :<|>
     (coerce -> createRating) :<|>
     (coerce -> deleteRating) :<|>
     (coerce -> searchLocationRatingIndexes) :<|>
     (coerce -> searchRatingIndexes) :<|>
     (coerce -> searchRatings) :<|>
     (coerce -> updateRating) :<|>
     (coerce -> createRegion) :<|>
     (coerce -> deleteRegion) :<|>
     (coerce -> getRegion) :<|>
     (coerce -> searchRegions) :<|>
     (coerce -> updateRegion) :<|>
     (coerce -> createBatch) :<|>
     (coerce -> createRegionLegSummaryBatch) :<|>
     (coerce -> deleteBatch) :<|>
     (coerce -> getReportBatch) :<|>
     (coerce -> runReport) :<|>
     (coerce -> searchBatch) :<|>
     (coerce -> createReservation) :<|>
     (coerce -> deleteReservation) :<|>
     (coerce -> reservableAvailability) :<|>
     (coerce -> searchAvailability) :<|>
     (coerce -> searchReservations) :<|>
     (coerce -> searchSchedule) :<|>
     (coerce -> createRetailer) :<|>
     (coerce -> deleteRetailer) :<|>
     (coerce -> getRetailer) :<|>
     (coerce -> getRetailers) :<|>
     (coerce -> retailerLoginCheck) :<|>
     (coerce -> updateRetailer) :<|>
     (coerce -> createRetailerLocationConsumer) :<|>
     (coerce -> createRetailerLocations) :<|>
     (coerce -> deleteRetailerLocation) :<|>
     (coerce -> getRetailerLocation) :<|>
     (coerce -> getRetailerLocationConsumer) :<|>
     (coerce -> indexedRetailerLocationDistanceSearch) :<|>
     (coerce -> indexedRetailerLocationSearch) :<|>
     (coerce -> searchRetailerLocations) :<|>
     (coerce -> updateRetailerLocations) :<|>
     (coerce -> getRetaokiler) :<|>
     (coerce -> approveRoute) :<|>
     (coerce -> copyRoute) :<|>
     (coerce -> createRoute) :<|>
     (coerce -> createRouteDirections) :<|>
     (coerce -> createRoutePolyline) :<|>
     (coerce -> deleteRoute) :<|>
     (coerce -> disapproveRoute) :<|>
     (coerce -> getRoute) :<|>
     (coerce -> getRouteDirections) :<|>
     (coerce -> getRouteShipments) :<|>
     (coerce -> getRouteStop) :<|>
     (coerce -> getRouteStops) :<|>
     (coerce -> getShipmentsAtStop) :<|>
     (coerce -> optimizeRoute) :<|>
     (coerce -> removeStop) :<|>
     (coerce -> reorderRouteStopsPatch) :<|>
     (coerce -> reorderRouteStopsPost) :<|>
     (coerce -> searchRoutes) :<|>
     (coerce -> setDriver) :<|>
     (coerce -> updateRoute) :<|>
     (coerce -> updateRouteStop) :<|>
     (coerce -> createRouteSettings) :<|>
     (coerce -> deleteRouteSettings) :<|>
     (coerce -> getRouteSettings) :<|>
     (coerce -> searchRouteSettings) :<|>
     (coerce -> updateRouteSettings) :<|>
     (coerce -> computeRouting) :<|>
     (coerce -> createScheduledNotification) :<|>
     (coerce -> deleteScheduledNotification) :<|>
     (coerce -> getScheduledNotification) :<|>
     (coerce -> scheduleNotificationListings) :<|>
     (coerce -> searchScheduledNotifications) :<|>
     (coerce -> updateScheduledNotification) :<|>
     (coerce -> createScore) :<|>
     (coerce -> getScore) :<|>
     (coerce -> searchScores) :<|>
     (coerce -> createSecureApplication) :<|>
     (coerce -> deleteSecureApplication) :<|>
     (coerce -> loginSecure) :<|>
     (coerce -> purchaseSecure) :<|>
     (coerce -> resetSecure) :<|>
     (coerce -> updateSecureApplication) :<|>
     (coerce -> createServiceHub) :<|>
     (coerce -> deleteServiceHub) :<|>
     (coerce -> getServiceHub) :<|>
     (coerce -> postServiceHub) :<|>
     (coerce -> putServiceHub) :<|>
     (coerce -> searchServiceHubs) :<|>
     (coerce -> cancelShipment) :<|>
     (coerce -> createShipment) :<|>
     (coerce -> deleteShipment) :<|>
     (coerce -> getShipment) :<|>
     (coerce -> searchShipments) :<|>
     (coerce -> updateShipment) :<|>
     (coerce -> updateShipmentStatus) :<|>
     (coerce -> createShipmentBatch) :<|>
     (coerce -> deleteShipmentBatch) :<|>
     (coerce -> getShipmentBatch) :<|>
     (coerce -> getShipmentBatchStatus) :<|>
     (coerce -> searchShipmentBatch) :<|>
     (coerce -> simulation) :<|>
     (coerce -> getStop) :<|>
     (coerce -> updateStop) :<|>
     (coerce -> createStripeCheckoutSession) :<|>
     (coerce -> createSubscription) :<|>
     (coerce -> deleteSubscription) :<|>
     (coerce -> getSubscription) :<|>
     (coerce -> getSubscriptionPlan) :<|>
     (coerce -> getSubscriptionPlans) :<|>
     (coerce -> getSubscriptionUsage) :<|>
     (coerce -> updateSubscription) :<|>
     (coerce -> createTask) :<|>
     (coerce -> deleteTask) :<|>
     (coerce -> getTask) :<|>
     (coerce -> searchTasks) :<|>
     (coerce -> updateTask) :<|>
     (coerce -> createTerritory) :<|>
     (coerce -> deleteTerritory) :<|>
     (coerce -> getTerritory) :<|>
     (coerce -> searchTerritories) :<|>
     (coerce -> updateTerritory) :<|>
     (coerce -> addOrUpdateThemeDescriptor) :<|>
     (coerce -> getThemeDescriptor) :<|>
     (coerce -> getThemeDescriptors) :<|>
     (coerce -> removeThemeDescriptor) :<|>
     (coerce -> createCredential) :<|>
     (coerce -> createNetwork) :<|>
     (coerce -> deleteCredential) :<|>
     (coerce -> deleteNetwork) :<|>
     (coerce -> getCredential) :<|>
     (coerce -> getNetwork) :<|>
     (coerce -> searchCredentials) :<|>
     (coerce -> searchNetworks) :<|>
     (coerce -> sendMFAChallenge) :<|>
     (coerce -> updateCredential) :<|>
     (coerce -> updateNetwork) :<|>
     (coerce -> getTicketCount) :<|>
     (coerce -> getTicketList) :<|>
     (coerce -> giftPurchase) :<|>
     (coerce -> saveTicket) :<|>
     (coerce -> saveTicketViaFileUpload) :<|>
     (coerce -> ticketOffers) :<|>
     (coerce -> createTournament) :<|>
     (coerce -> deleteTournament) :<|>
     (coerce -> getTournament) :<|>
     (coerce -> searchObjects) :<|>
     (coerce -> searchRounds) :<|>
     (coerce -> searchTournaments) :<|>
     (coerce -> submitTournamentScore) :<|>
     (coerce -> submitTournamentVote) :<|>
     (coerce -> substituteTournamentPlayer) :<|>
     (coerce -> updateTournament) :<|>
     (coerce -> batchSaveTracking) :<|>
     (coerce -> getPredictedLocations) :<|>
     (coerce -> getPredictedPath) :<|>
     (coerce -> getPreferredLocations) :<|>
     (coerce -> getTrackingLegs) :<|>
     (coerce -> saveTrackingLeg) :<|>
     (coerce -> saveTrackingStep) :<|>
     (coerce -> searchAccountsWithTrackingLegs) :<|>
     (coerce -> searchTrackingLegs) :<|>
     (coerce -> createTrigger) :<|>
     (coerce -> deleteTrigger) :<|>
     (coerce -> getTrigger) :<|>
     (coerce -> searchTriggers) :<|>
     (coerce -> updateTrigger) :<|>
     (coerce -> createTrip) :<|>
     (coerce -> delete) :<|>
     (coerce -> driveTrip) :<|>
     (coerce -> flexibleTrip) :<|>
     (coerce -> getTrip) :<|>
     (coerce -> getTripMatches) :<|>
     (coerce -> processTripMatches) :<|>
     (coerce -> ride) :<|>
     (coerce -> search) :<|>
     (coerce -> searchTrips) :<|>
     (coerce -> updateLocations) :<|>
     (coerce -> updateRecurrenceLocations) :<|>
     (coerce -> updateRecurrenceShipments) :<|>
     (coerce -> updateShipments) :<|>
     (coerce -> updateTrip) :<|>
     (coerce -> updateTripNotifications) :<|>
     (coerce -> smsBuyOffer) :<|>
     (coerce -> authorizeTwitter) :<|>
     (coerce -> loginTwitter) :<|>
     (coerce -> addUsersToPermissionable) :<|>
     (coerce -> approvePermissionable) :<|>
     (coerce -> leaveFromPermissionable) :<|>
     (coerce -> removeUsersFromPermissionable) :<|>
     (coerce -> searchPermissionables) :<|>
     (coerce -> searchPermissionablesFollowingDistance) :<|>
     (coerce -> createFollowing) :<|>
     (coerce -> createSpace) :<|>
     (coerce -> createVatomEvent) :<|>
     (coerce -> deleteFollowing) :<|>
     (coerce -> deletePointsBalance) :<|>
     (coerce -> deleteSpace) :<|>
     (coerce -> deleteVatomEvent) :<|>
     (coerce -> deleteVatomNFT) :<|>
     (coerce -> executeActionOnNFT) :<|>
     (coerce -> geomapSearch) :<|>
     (coerce -> getBusinessBehaviors) :<|>
     (coerce -> getBusinessCoinsBalance) :<|>
     (coerce -> getBusinessIds) :<|>
     (coerce -> getBusinessInfo) :<|>
     (coerce -> getBusinessUsers) :<|>
     (coerce -> getCampaignGroupEntities) :<|>
     (coerce -> getCampaignGroupRules) :<|>
     (coerce -> getCampaignGroupStats) :<|>
     (coerce -> getCampaignInfo) :<|>
     (coerce -> getEventGuestList) :<|>
     (coerce -> getInventory) :<|>
     (coerce -> getMyFollowing) :<|>
     (coerce -> getPointsBalance) :<|>
     (coerce -> getPointsBalanceAsBusiness) :<|>
     (coerce -> getSpace) :<|>
     (coerce -> getUserCoinsAsBusiness) :<|>
     (coerce -> getUserCoinsBalance) :<|>
     (coerce -> getUserFollowers) :<|>
     (coerce -> getUserFollowing) :<|>
     (coerce -> getUserInfo) :<|>
     (coerce -> getUserProfile) :<|>
     (coerce -> getVatomEvent) :<|>
     (coerce -> getVatomNFT) :<|>
     (coerce -> listCommunities) :<|>
     (coerce -> listEvents) :<|>
     (coerce -> listSpaces) :<|>
     (coerce -> listUserCoinTransactions) :<|>
     (coerce -> listUserCoinTransactionsAsBusiness) :<|>
     (coerce -> performActionOnNFT) :<|>
     (coerce -> redeemNFT) :<|>
     (coerce -> redeemUserCoinsAsBusiness) :<|>
     (coerce -> searchBusinesses) :<|>
     (coerce -> searchCampaignGroups) :<|>
     (coerce -> searchIdentities) :<|>
     (coerce -> searchInventory) :<|>
     (coerce -> sendNFT) :<|>
     (coerce -> setPointsBalanceAsBusiness) :<|>
     (coerce -> transferUserCoins) :<|>
     (coerce -> updateBusinessCoins) :<|>
     (coerce -> updateEventGuestList) :<|>
     (coerce -> updateSpace) :<|>
     (coerce -> updateUserCoinsAsBusiness) :<|>
     (coerce -> updateUserProfile) :<|>
     (coerce -> updateVatomEvent) :<|>
     (coerce -> createVehicle) :<|>
     (coerce -> deleteVehicle) :<|>
     (coerce -> getVehicle) :<|>
     (coerce -> searchVehicle) :<|>
     (coerce -> updateVehicle) :<|>
     (coerce -> createVehicleType) :<|>
     (coerce -> deleteVehicleType) :<|>
     (coerce -> getVehicleType) :<|>
     (coerce -> searchVehicleTypes) :<|>
     (coerce -> updateVehicleType) :<|>
     (coerce -> createOfferTransaction) :<|>
     (coerce -> deleteOfferTransaction) :<|>
     (coerce -> getOfferTransaction) :<|>
     (coerce -> previewOfferTransaction) :<|>
     (coerce -> searchOfferTransactions) :<|>
     (coerce -> updateOfferTransaction) :<|>
     (coerce -> searchWeather) :<|>
     (coerce -> createWord) :<|>
     (coerce -> deleteWord) :<|>
     (coerce -> getWord) :<|>
     (coerce -> getWords) :<|>
     (coerce -> updateWord) :<|>
     (coerce -> runWorkflow) :<|>
     _) = client (Proxy :: Proxy SirqulIoTPlatformAPI)

-- | Run requests in the SirqulIoTPlatformClient monad.
runSirqulIoTPlatformClient :: Config -> SirqulIoTPlatformClient a -> ExceptT ClientError IO a
runSirqulIoTPlatformClient clientConfig cl = do
  manager <- liftIO $ newManager tlsManagerSettings
  runSirqulIoTPlatformClientWithManager manager clientConfig cl

-- | Run requests in the SirqulIoTPlatformClient monad using a custom manager.
runSirqulIoTPlatformClientWithManager :: Manager -> Config -> SirqulIoTPlatformClient a -> ExceptT ClientError IO a
runSirqulIoTPlatformClientWithManager manager Config{..} cl = do
  url <- parseBaseUrl configUrl
  runClient cl $ mkClientEnv manager url

-- | Like @runClient@, but returns the response or throws
--   a SirqulIoTPlatformClientError
callSirqulIoTPlatform
  :: (MonadIO m, MonadThrow m)
  => ClientEnv -> SirqulIoTPlatformClient a -> m a
callSirqulIoTPlatform env f = do
  res <- liftIO $ runExceptT $ runClient f env
  case res of
    Left err       -> throwM (SirqulIoTPlatformClientError err)
    Right response -> pure response


requestMiddlewareId :: Application -> Application
requestMiddlewareId a = a

-- | Run the SirqulIoTPlatform server at the provided host and port.
runSirqulIoTPlatformServer
  :: (MonadIO m, MonadThrow m)
  => Config -> SirqulIoTPlatformAuth -> SirqulIoTPlatformBackend AuthServer (ExceptT ServerError IO) -> m ()
runSirqulIoTPlatformServer config auth backend = runSirqulIoTPlatformMiddlewareServer config requestMiddlewareId auth backend

-- | Run the SirqulIoTPlatform server at the provided host and port.
runSirqulIoTPlatformMiddlewareServer
  :: (MonadIO m, MonadThrow m)
  => Config -> Middleware -> SirqulIoTPlatformAuth -> SirqulIoTPlatformBackend AuthServer (ExceptT ServerError IO) -> m ()
runSirqulIoTPlatformMiddlewareServer Config{..} middleware auth backend = do
  url <- parseBaseUrl configUrl
  let warpSettings = Warp.defaultSettings
        & Warp.setPort (baseUrlPort url)
        & Warp.setHost (fromString $ baseUrlHost url)
  liftIO $ Warp.runSettings warpSettings $ middleware $ serverWaiApplicationSirqulIoTPlatform auth backend

-- | Plain "Network.Wai" Application for the SirqulIoTPlatform server.
--
-- Can be used to implement e.g. tests that call the API without a full webserver.
serverWaiApplicationSirqulIoTPlatform :: SirqulIoTPlatformAuth -> SirqulIoTPlatformBackend AuthServer (ExceptT ServerError IO) -> Application
serverWaiApplicationSirqulIoTPlatform auth backend = serveWithContextT (Proxy :: Proxy SirqulIoTPlatformAPI) context id (serverFromBackend backend)
  where
    context = serverContext auth
    serverFromBackend SirqulIoTPlatformBackend{..} =
      (coerce consumerCreate :<|>
       coerce consumerUpdate :<|>
       coerce queueCreate :<|>
       coerce queueDelete :<|>
       coerce queueGet :<|>
       coerce queuePublish :<|>
       coerce queueSearch :<|>
       coerce queueUpdate :<|>
       coerce accountLocationSearch :<|>
       coerce blockAccount :<|>
       coerce createAccount :<|>
       coerce editAccount :<|>
       coerce editUsername :<|>
       coerce getAccount :<|>
       coerce getProfileAssets :<|>
       coerce getReferralList :<|>
       coerce getSettings :<|>
       coerce loginDelegate :<|>
       coerce loginGeneral :<|>
       coerce loginUsername :<|>
       coerce logout :<|>
       coerce mergeAccount :<|>
       coerce passwordChange :<|>
       coerce passwordReset :<|>
       coerce requestPasswordReset :<|>
       coerce requestValidateAccount :<|>
       coerce searchAccounts :<|>
       coerce secureLogin :<|>
       coerce secureSignup :<|>
       coerce setMatchToken :<|>
       coerce updateActveStatus :<|>
       coerce updateLocation :<|>
       coerce updateSettings :<|>
       coerce validateAccountSignup :<|>
       coerce validatePasswordReset :<|>
       coerce achievementTierSearchPost :<|>
       coerce createAchievement :<|>
       coerce createAchievementTier :<|>
       coerce deleteAchievement :<|>
       coerce deleteAchievementTier :<|>
       coerce getAchievement :<|>
       coerce getAchievementTier :<|>
       coerce getUserAchievements :<|>
       coerce listAchievementTags :<|>
       coerce listAchievements :<|>
       coerce searchAchievements :<|>
       coerce updateAchievement :<|>
       coerce updateAchievementTier :<|>
       coerce updateUserAchievement :<|>
       coerce createEntityReference :<|>
       coerce addAlbumCollection :<|>
       coerce addAlbumUsers :<|>
       coerce approveAlbum :<|>
       coerce getAlbumCollection :<|>
       coerce leaveAlbum :<|>
       coerce removeAlbum :<|>
       coerce removeAlbumUsers :<|>
       coerce searchAlbums :<|>
       coerce updateAlbumCollection :<|>
       coerce activities :<|>
       coerce aggregatedFilteredUsage :<|>
       coerce filteredUsage :<|>
       coerce usage :<|>
       coerce usageBatch :<|>
       coerce getAppData :<|>
       coerce postAppData :<|>
       coerce regenAppData :<|>
       coerce createApplication :<|>
       coerce createApplicationPlacement :<|>
       coerce deleteApplication :<|>
       coerce deleteApplicationPlacement :<|>
       coerce getApplication :<|>
       coerce getApplicationPlacement :<|>
       coerce getApplicationVersions :<|>
       coerce getUniqueUsersByApp :<|>
       coerce listApplications :<|>
       coerce searchApplicationPlacement :<|>
       coerce searchApplicationSettings :<|>
       coerce searchApplications :<|>
       coerce updateApplication :<|>
       coerce updateApplicationActive :<|>
       coerce updateApplicationPlacement :<|>
       coerce uploadApplicationCertificate :<|>
       coerce createApplicationConfig :<|>
       coerce deleteApplicationConfig :<|>
       coerce getApplicationConfig :<|>
       coerce getApplicationConfigByConfigVersion :<|>
       coerce searchApplicationConfig :<|>
       coerce updateApplicationConfig :<|>
       coerce assetDownload :<|>
       coerce assetMorph :<|>
       coerce createAsset :<|>
       coerce deleteAsset :<|>
       coerce getAsset :<|>
       coerce removeAsset :<|>
       coerce searchAssets :<|>
       coerce updateAsset :<|>
       coerce assigmentAssigneeAccountSearch :<|>
       coerce assignmentCreate :<|>
       coerce assignmentDelete :<|>
       coerce assignmentGet :<|>
       coerce assignmentSearch :<|>
       coerce assignmentStatusCreate :<|>
       coerce assignmentStatusDelete :<|>
       coerce assignmentStatusGet :<|>
       coerce assignmentStatusSearch :<|>
       coerce assignmentStatusUpdate :<|>
       coerce assignmentUpdate :<|>
       coerce createAudience :<|>
       coerce deleteAudience :<|>
       coerce getAgeGroups :<|>
       coerce getAudience :<|>
       coerce getAudienceList :<|>
       coerce getDevices :<|>
       coerce getExperiences :<|>
       coerce getGroupedAudiences :<|>
       coerce listByAccount :<|>
       coerce listByAudience :<|>
       coerce listLastestByAccount :<|>
       coerce sendByAccount :<|>
       coerce updateAudience :<|>
       coerce createBid :<|>
       coerce deleteBid :<|>
       coerce getBid :<|>
       coerce updateBid :<|>
       coerce createBillableEntity :<|>
       coerce deleteBillableEntity :<|>
       coerce getBillableEntity :<|>
       coerce updateBillableEntity :<|>
       coerce addPaymentMethod :<|>
       coerce createPaymentMethod :<|>
       coerce createSmartContract :<|>
       coerce getCryptoBalance :<|>
       coerce getPaymentMethod :<|>
       coerce searchPaymentMethod :<|>
       coerce getStatusCSV :<|>
       coerce listStatusCSV :<|>
       coerce statusCSV :<|>
       coerce uploadCSV :<|>
       coerce createCargoType :<|>
       coerce deleteCargoType :<|>
       coerce getCargoType :<|>
       coerce searchCargoTypes :<|>
       coerce updateCargoType :<|>
       coerce searchCarriers :<|>
       coerce categoryDistanceSearch :<|>
       coerce createCategory :<|>
       coerce deleteCategory :<|>
       coerce duplicateCategory :<|>
       coerce getCategory :<|>
       coerce searchCategories :<|>
       coerce updateCategory :<|>
       coerce addConnectionToGroup :<|>
       coerce addConnectionsToGroup :<|>
       coerce addSubGroups :<|>
       coerce createOrUpdateConnection :<|>
       coerce createOrUpdateGroup :<|>
       coerce followAccept :<|>
       coerce followReject :<|>
       coerce followRemove :<|>
       coerce followRequest :<|>
       coerce friendAccept :<|>
       coerce friendReject :<|>
       coerce friendRemove :<|>
       coerce friendRequest :<|>
       coerce getConnectionSentFriendRequests :<|>
       coerce getConnections :<|>
       coerce getGroupDetails :<|>
       coerce groupSearch :<|>
       coerce removeConnectionFromGroup :<|>
       coerce removeConnectionsFromGroup :<|>
       coerce removeGroup :<|>
       coerce removeSubGroups :<|>
       coerce searchConnections :<|>
       coerce addOrUpdateAlbumContest :<|>
       coerce approveAlbumContest :<|>
       coerce deleteContest :<|>
       coerce getAlbumContest :<|>
       coerce getAlbumContests :<|>
       coerce voteOnAlbumContest :<|>
       coerce addPreview :<|>
       coerce adsFind :<|>
       coerce createCreative :<|>
       coerce deleteCreative :<|>
       coerce getCreative :<|>
       coerce getCreativesByApplication :<|>
       coerce removePreview :<|>
       coerce updateCreative :<|>
       coerce create :<|>
       coerce getDependents :<|>
       coerce removeDependent :<|>
       coerce checkDisbursements :<|>
       coerce createDisbursement :<|>
       coerce getDisbursement :<|>
       coerce searchDisbursements :<|>
       coerce updateDisbursement :<|>
       coerce assignEmployee :<|>
       coerce assignToLocationEmployee :<|>
       coerce createEmployee :<|>
       coerce deleteEmployee :<|>
       coerce getEmployee :<|>
       coerce searchEmployees :<|>
       coerce unassignEmployee :<|>
       coerce updateEmployee :<|>
       coerce attendEvent :<|>
       coerce createEvent :<|>
       coerce deleteEvent :<|>
       coerce getEvent :<|>
       coerce searchEventTransactions :<|>
       coerce searchEvents :<|>
       coerce updateEvent :<|>
       coerce getToken :<|>
       coerce graphInterface :<|>
       coerce addFavorite :<|>
       coerce deleteFavorite :<|>
       coerce getFavorite :<|>
       coerce searchFavorites :<|>
       coerce whoHasFavorited :<|>
       coerce createFilter :<|>
       coerce deleteFilter :<|>
       coerce getFilter :<|>
       coerce searchFilters :<|>
       coerce updateFilter :<|>
       coerce createFlag :<|>
       coerce deleteFlag :<|>
       coerce getFlag :<|>
       coerce getFlagThreshold :<|>
       coerce updateFlagThreshold :<|>
       coerce createGame :<|>
       coerce deleteGame :<|>
       coerce getGame :<|>
       coerce searchGames :<|>
       coerce updateGame :<|>
       coerce createGameLevel :<|>
       coerce deleteGameLevel :<|>
       coerce getGameLevel :<|>
       coerce getGameLevelsByApplication :<|>
       coerce getGameLevelsByBillableEntity :<|>
       coerce getQuestionsInLevel :<|>
       coerce getWordsInLevel :<|>
       coerce updateGameLevel :<|>
       coerce updateQuestionsInLevel :<|>
       coerce updateWordsInLevel :<|>
       coerce acceptInvite :<|>
       coerce albumContestInvite :<|>
       coerce albumInvite :<|>
       coerce eventInvite :<|>
       coerce gameInvite :<|>
       coerce getInvite :<|>
       coerce missionInvite :<|>
       coerce offerInvite :<|>
       coerce offerLocationInvite :<|>
       coerce retailerLocationInvite :<|>
       coerce createLeaderboard :<|>
       coerce deleteLeaderboard :<|>
       coerce getLeaderboard :<|>
       coerce searchLeaderboards :<|>
       coerce updateLeaderboard :<|>
       coerce registerLike :<|>
       coerce removeLike :<|>
       coerce searchLikes :<|>
       coerce createListing :<|>
       coerce deleteListing :<|>
       coerce getListing :<|>
       coerce searchListing :<|>
       coerce summaryListing :<|>
       coerce updateListing :<|>
       coerce cacheTrilaterationData :<|>
       coerce cacheTrilaterationDataGzip :<|>
       coerce getLocationByIp :<|>
       coerce getLocationByTrilateration :<|>
       coerce getLocations :<|>
       coerce createLocationV2 :<|>
       coerce updateLocationV2 :<|>
       coerce createMedia :<|>
       coerce deleteMedia :<|>
       coerce getMedia :<|>
       coerce searchMedia :<|>
       coerce updateMedia :<|>
       coerce createMission :<|>
       coerce deleteMission :<|>
       coerce findMissions :<|>
       coerce getMission :<|>
       coerce importMission :<|>
       coerce searchMissionFormats :<|>
       coerce searchMissions :<|>
       coerce searchMissionsByBillableEntity :<|>
       coerce updateMission :<|>
       coerce createMissionInvite :<|>
       coerce deleteMissionInvite :<|>
       coerce getMissionInvite :<|>
       coerce searchMissionInvites :<|>
       coerce updateMissionInvite :<|>
       coerce batchOperation :<|>
       coerce createNote :<|>
       coerce deleteNote :<|>
       coerce getNote :<|>
       coerce searchNotes :<|>
       coerce updateNote :<|>
       coerce createNotificationTemplate :<|>
       coerce createOrUpdateBlockedNotifications :<|>
       coerce deleteNotificationTemplate :<|>
       coerce getNotificationTemplate :<|>
       coerce getNotifications :<|>
       coerce registerNotificationToken :<|>
       coerce searchBlockedNotifications :<|>
       coerce searchNotificationTemplate :<|>
       coerce searchRecipients :<|>
       coerce searchRecipientsCount :<|>
       coerce sendBatchNotifications :<|>
       coerce sendCustomNotifications :<|>
       coerce updateNotificationTemplate :<|>
       coerce addField :<|>
       coerce createData :<|>
       coerce createObject :<|>
       coerce deleteData :<|>
       coerce deleteField :<|>
       coerce deleteObject :<|>
       coerce getData :<|>
       coerce getObject :<|>
       coerce searchData :<|>
       coerce searchObject :<|>
       coerce updateData :<|>
       coerce batchUpdateOfferLocations :<|>
       coerce createOffer :<|>
       coerce deleteOffer :<|>
       coerce deleteOfferLocation :<|>
       coerce getOffer :<|>
       coerce getOfferDetails :<|>
       coerce getOfferListCounts :<|>
       coerce getOfferLocation :<|>
       coerce getOfferLocationsForRetailers :<|>
       coerce getOffersForRetailers :<|>
       coerce redeemOfferTransaction :<|>
       coerce searchOfferTransactionsForRetailers :<|>
       coerce searchOffersForConsumer :<|>
       coerce topOfferTransactions :<|>
       coerce updateOffer :<|>
       coerce updateOfferStatus :<|>
       coerce createOfferTransactionStatus :<|>
       coerce deleteOfferTransactionStatus :<|>
       coerce getOfferTransactionStatus :<|>
       coerce searchOfferTransactionStatuses :<|>
       coerce updateOfferTransactionStatus :<|>
       coerce imageGeneration :<|>
       coerce getOptimizationResult :<|>
       coerce requestOptimization :<|>
       coerce addMovie :<|>
       coerce aiDocs :<|>
       coerce aiFindImages :<|>
       coerce aiTags :<|>
       coerce aiText :<|>
       coerce batch :<|>
       coerce createInstantEpisode :<|>
       coerce createVoiceCanvas :<|>
       coerce emotion :<|>
       coerce getAddMovieResult :<|>
       coerce getBatch :<|>
       coerce getEmotion :<|>
       coerce getEpisodeStatus :<|>
       coerce getRenderStatus :<|>
       coerce getSTT :<|>
       coerce getTTS :<|>
       coerce getTechTune :<|>
       coerce getTopics :<|>
       coerce getVoiceCanvas :<|>
       coerce startVideoRender :<|>
       coerce stt :<|>
       coerce summarizeTopics :<|>
       coerce techTune :<|>
       coerce tts :<|>
       coerce createPack :<|>
       coerce deletePack :<|>
       coerce getPack :<|>
       coerce searchPacks :<|>
       coerce updatePack :<|>
       coerce processAllParticipants :<|>
       coerce processParticipants :<|>
       coerce computePath :<|>
       coerce createPostalCode :<|>
       coerce deletePostalCode :<|>
       coerce getPostalCode :<|>
       coerce getPostalCodes :<|>
       coerce updatePostalCode :<|>
       coerce createPersona :<|>
       coerce deletePersona :<|>
       coerce getPersonaList :<|>
       coerce searchPersona :<|>
       coerce updatePersona :<|>
       coerce createProgram :<|>
       coerce deleteProgram :<|>
       coerce getProgram :<|>
       coerce postProgram :<|>
       coerce putProgram :<|>
       coerce searchPrograms :<|>
       coerce createPurchaseItem :<|>
       coerce deletePurchaseItem :<|>
       coerce getPurchaseItem :<|>
       coerce searchPurchaseItems :<|>
       coerce updatePurchaseItem :<|>
       coerce createOrder :<|>
       coerce deleteOrder :<|>
       coerce getOrder :<|>
       coerce previewOrder :<|>
       coerce searchOrders :<|>
       coerce updateOrder :<|>
       coerce createQuestion :<|>
       coerce deleteQuestion :<|>
       coerce getQuestion :<|>
       coerce searchQuestions :<|>
       coerce updateQuestion :<|>
       coerce getHistoricalRankings :<|>
       coerce getRankings :<|>
       coerce getUserRank :<|>
       coerce overrideUserRank :<|>
       coerce updateRankings :<|>
       coerce createRating :<|>
       coerce deleteRating :<|>
       coerce searchLocationRatingIndexes :<|>
       coerce searchRatingIndexes :<|>
       coerce searchRatings :<|>
       coerce updateRating :<|>
       coerce createRegion :<|>
       coerce deleteRegion :<|>
       coerce getRegion :<|>
       coerce searchRegions :<|>
       coerce updateRegion :<|>
       coerce createBatch :<|>
       coerce createRegionLegSummaryBatch :<|>
       coerce deleteBatch :<|>
       coerce getReportBatch :<|>
       coerce runReport :<|>
       coerce searchBatch :<|>
       coerce createReservation :<|>
       coerce deleteReservation :<|>
       coerce reservableAvailability :<|>
       coerce searchAvailability :<|>
       coerce searchReservations :<|>
       coerce searchSchedule :<|>
       coerce createRetailer :<|>
       coerce deleteRetailer :<|>
       coerce getRetailer :<|>
       coerce getRetailers :<|>
       coerce retailerLoginCheck :<|>
       coerce updateRetailer :<|>
       coerce createRetailerLocationConsumer :<|>
       coerce createRetailerLocations :<|>
       coerce deleteRetailerLocation :<|>
       coerce getRetailerLocation :<|>
       coerce getRetailerLocationConsumer :<|>
       coerce indexedRetailerLocationDistanceSearch :<|>
       coerce indexedRetailerLocationSearch :<|>
       coerce searchRetailerLocations :<|>
       coerce updateRetailerLocations :<|>
       coerce getRetaokiler :<|>
       coerce approveRoute :<|>
       coerce copyRoute :<|>
       coerce createRoute :<|>
       coerce createRouteDirections :<|>
       coerce createRoutePolyline :<|>
       coerce deleteRoute :<|>
       coerce disapproveRoute :<|>
       coerce getRoute :<|>
       coerce getRouteDirections :<|>
       coerce getRouteShipments :<|>
       coerce getRouteStop :<|>
       coerce getRouteStops :<|>
       coerce getShipmentsAtStop :<|>
       coerce optimizeRoute :<|>
       coerce removeStop :<|>
       coerce reorderRouteStopsPatch :<|>
       coerce reorderRouteStopsPost :<|>
       coerce searchRoutes :<|>
       coerce setDriver :<|>
       coerce updateRoute :<|>
       coerce updateRouteStop :<|>
       coerce createRouteSettings :<|>
       coerce deleteRouteSettings :<|>
       coerce getRouteSettings :<|>
       coerce searchRouteSettings :<|>
       coerce updateRouteSettings :<|>
       coerce computeRouting :<|>
       coerce createScheduledNotification :<|>
       coerce deleteScheduledNotification :<|>
       coerce getScheduledNotification :<|>
       coerce scheduleNotificationListings :<|>
       coerce searchScheduledNotifications :<|>
       coerce updateScheduledNotification :<|>
       coerce createScore :<|>
       coerce getScore :<|>
       coerce searchScores :<|>
       coerce createSecureApplication :<|>
       coerce deleteSecureApplication :<|>
       coerce loginSecure :<|>
       coerce purchaseSecure :<|>
       coerce resetSecure :<|>
       coerce updateSecureApplication :<|>
       coerce createServiceHub :<|>
       coerce deleteServiceHub :<|>
       coerce getServiceHub :<|>
       coerce postServiceHub :<|>
       coerce putServiceHub :<|>
       coerce searchServiceHubs :<|>
       coerce cancelShipment :<|>
       coerce createShipment :<|>
       coerce deleteShipment :<|>
       coerce getShipment :<|>
       coerce searchShipments :<|>
       coerce updateShipment :<|>
       coerce updateShipmentStatus :<|>
       coerce createShipmentBatch :<|>
       coerce deleteShipmentBatch :<|>
       coerce getShipmentBatch :<|>
       coerce getShipmentBatchStatus :<|>
       coerce searchShipmentBatch :<|>
       coerce simulation :<|>
       coerce getStop :<|>
       coerce updateStop :<|>
       coerce createStripeCheckoutSession :<|>
       coerce createSubscription :<|>
       coerce deleteSubscription :<|>
       coerce getSubscription :<|>
       coerce getSubscriptionPlan :<|>
       coerce getSubscriptionPlans :<|>
       coerce getSubscriptionUsage :<|>
       coerce updateSubscription :<|>
       coerce createTask :<|>
       coerce deleteTask :<|>
       coerce getTask :<|>
       coerce searchTasks :<|>
       coerce updateTask :<|>
       coerce createTerritory :<|>
       coerce deleteTerritory :<|>
       coerce getTerritory :<|>
       coerce searchTerritories :<|>
       coerce updateTerritory :<|>
       coerce addOrUpdateThemeDescriptor :<|>
       coerce getThemeDescriptor :<|>
       coerce getThemeDescriptors :<|>
       coerce removeThemeDescriptor :<|>
       coerce createCredential :<|>
       coerce createNetwork :<|>
       coerce deleteCredential :<|>
       coerce deleteNetwork :<|>
       coerce getCredential :<|>
       coerce getNetwork :<|>
       coerce searchCredentials :<|>
       coerce searchNetworks :<|>
       coerce sendMFAChallenge :<|>
       coerce updateCredential :<|>
       coerce updateNetwork :<|>
       coerce getTicketCount :<|>
       coerce getTicketList :<|>
       coerce giftPurchase :<|>
       coerce saveTicket :<|>
       coerce saveTicketViaFileUpload :<|>
       coerce ticketOffers :<|>
       coerce createTournament :<|>
       coerce deleteTournament :<|>
       coerce getTournament :<|>
       coerce searchObjects :<|>
       coerce searchRounds :<|>
       coerce searchTournaments :<|>
       coerce submitTournamentScore :<|>
       coerce submitTournamentVote :<|>
       coerce substituteTournamentPlayer :<|>
       coerce updateTournament :<|>
       coerce batchSaveTracking :<|>
       coerce getPredictedLocations :<|>
       coerce getPredictedPath :<|>
       coerce getPreferredLocations :<|>
       coerce getTrackingLegs :<|>
       coerce saveTrackingLeg :<|>
       coerce saveTrackingStep :<|>
       coerce searchAccountsWithTrackingLegs :<|>
       coerce searchTrackingLegs :<|>
       coerce createTrigger :<|>
       coerce deleteTrigger :<|>
       coerce getTrigger :<|>
       coerce searchTriggers :<|>
       coerce updateTrigger :<|>
       coerce createTrip :<|>
       coerce delete :<|>
       coerce driveTrip :<|>
       coerce flexibleTrip :<|>
       coerce getTrip :<|>
       coerce getTripMatches :<|>
       coerce processTripMatches :<|>
       coerce ride :<|>
       coerce search :<|>
       coerce searchTrips :<|>
       coerce updateLocations :<|>
       coerce updateRecurrenceLocations :<|>
       coerce updateRecurrenceShipments :<|>
       coerce updateShipments :<|>
       coerce updateTrip :<|>
       coerce updateTripNotifications :<|>
       coerce smsBuyOffer :<|>
       coerce authorizeTwitter :<|>
       coerce loginTwitter :<|>
       coerce addUsersToPermissionable :<|>
       coerce approvePermissionable :<|>
       coerce leaveFromPermissionable :<|>
       coerce removeUsersFromPermissionable :<|>
       coerce searchPermissionables :<|>
       coerce searchPermissionablesFollowingDistance :<|>
       coerce createFollowing :<|>
       coerce createSpace :<|>
       coerce createVatomEvent :<|>
       coerce deleteFollowing :<|>
       coerce deletePointsBalance :<|>
       coerce deleteSpace :<|>
       coerce deleteVatomEvent :<|>
       coerce deleteVatomNFT :<|>
       coerce executeActionOnNFT :<|>
       coerce geomapSearch :<|>
       coerce getBusinessBehaviors :<|>
       coerce getBusinessCoinsBalance :<|>
       coerce getBusinessIds :<|>
       coerce getBusinessInfo :<|>
       coerce getBusinessUsers :<|>
       coerce getCampaignGroupEntities :<|>
       coerce getCampaignGroupRules :<|>
       coerce getCampaignGroupStats :<|>
       coerce getCampaignInfo :<|>
       coerce getEventGuestList :<|>
       coerce getInventory :<|>
       coerce getMyFollowing :<|>
       coerce getPointsBalance :<|>
       coerce getPointsBalanceAsBusiness :<|>
       coerce getSpace :<|>
       coerce getUserCoinsAsBusiness :<|>
       coerce getUserCoinsBalance :<|>
       coerce getUserFollowers :<|>
       coerce getUserFollowing :<|>
       coerce getUserInfo :<|>
       coerce getUserProfile :<|>
       coerce getVatomEvent :<|>
       coerce getVatomNFT :<|>
       coerce listCommunities :<|>
       coerce listEvents :<|>
       coerce listSpaces :<|>
       coerce listUserCoinTransactions :<|>
       coerce listUserCoinTransactionsAsBusiness :<|>
       coerce performActionOnNFT :<|>
       coerce redeemNFT :<|>
       coerce redeemUserCoinsAsBusiness :<|>
       coerce searchBusinesses :<|>
       coerce searchCampaignGroups :<|>
       coerce searchIdentities :<|>
       coerce searchInventory :<|>
       coerce sendNFT :<|>
       coerce setPointsBalanceAsBusiness :<|>
       coerce transferUserCoins :<|>
       coerce updateBusinessCoins :<|>
       coerce updateEventGuestList :<|>
       coerce updateSpace :<|>
       coerce updateUserCoinsAsBusiness :<|>
       coerce updateUserProfile :<|>
       coerce updateVatomEvent :<|>
       coerce createVehicle :<|>
       coerce deleteVehicle :<|>
       coerce getVehicle :<|>
       coerce searchVehicle :<|>
       coerce updateVehicle :<|>
       coerce createVehicleType :<|>
       coerce deleteVehicleType :<|>
       coerce getVehicleType :<|>
       coerce searchVehicleTypes :<|>
       coerce updateVehicleType :<|>
       coerce createOfferTransaction :<|>
       coerce deleteOfferTransaction :<|>
       coerce getOfferTransaction :<|>
       coerce previewOfferTransaction :<|>
       coerce searchOfferTransactions :<|>
       coerce updateOfferTransaction :<|>
       coerce searchWeather :<|>
       coerce createWord :<|>
       coerce deleteWord :<|>
       coerce getWord :<|>
       coerce getWords :<|>
       coerce updateWord :<|>
       coerce runWorkflow :<|>
       serveDirectoryFileServer "static")

-- Authentication is implemented with servants generalized authentication:
-- https://docs.servant.dev/en/stable/tutorial/Authentication.html#generalized-authentication

authHandler :: SirqulIoTPlatformAuth -> AuthHandler Request AuthServer
authHandler SirqulIoTPlatformAuth{..} = mkAuthHandler handler
  where
    handler req = case lookup "Application-Key" (requestHeaders req) of
      Just header -> lookupUser header
      Nothing -> throwError (authError req)

type Protected = AuthProtect "apikey"
type AuthServer = AuthServerData Protected
type AuthClient = AuthenticatedRequest Protected
type instance AuthClientData Protected = Text

clientAuth :: Text -> AuthClient
clientAuth key = mkAuthenticatedRequest key (addHeader "Application-Key")
-- Authentication is implemented with servants generalized authentication:
-- https://docs.servant.dev/en/stable/tutorial/Authentication.html#generalized-authentication

authHandler :: SirqulIoTPlatformAuth -> AuthHandler Request AuthServer
authHandler SirqulIoTPlatformAuth{..} = mkAuthHandler handler
  where
    handler req = case lookup "Application-Rest-Key" (requestHeaders req) of
      Just header -> lookupUser header
      Nothing -> throwError (authError req)

type Protected = AuthProtect "apikey"
type AuthServer = AuthServerData Protected
type AuthClient = AuthenticatedRequest Protected
type instance AuthClientData Protected = Text

clientAuth :: Text -> AuthClient
clientAuth key = mkAuthenticatedRequest key (addHeader "Application-Rest-Key")

serverContext :: SirqulIoTPlatformAuth -> Context (AuthHandler Request AuthServer ': '[])
serverContext auth = authHandler auth :. EmptyContext
