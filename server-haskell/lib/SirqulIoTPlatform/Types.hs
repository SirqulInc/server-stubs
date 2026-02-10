{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE DeriveDataTypeable         #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE DuplicateRecordFields      #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module SirqulIoTPlatform.Types (
  Account (..),
  AccountListResponse (..),
  AccountLoginResponse (..),
  AccountMiniResponse (..),
  AccountProfileInfo (..),
  AccountResponse (..),
  AccountShortResponse (..),
  AchievementProgressResponse (..),
  AchievementResponse (..),
  AchievementShortResponse (..),
  AchievementTierResponse (..),
  ActivityResponse (..),
  Address (..),
  AddressResponse (..),
  AgeGroupResponse (..),
  Album (..),
  AlbumContestListResponse (..),
  AlbumContestResponse (..),
  AlbumFullResponse (..),
  AlbumResponse (..),
  AnswerResponse (..),
  AppInfoResponse (..),
  AppResponse (..),
  AppVersion (..),
  Application (..),
  ApplicationConfigResponse (..),
  ApplicationMiniResponse (..),
  ApplicationResponse (..),
  ApplicationSettingsResponse (..),
  ApplicationShortResponse (..),
  ApplicationUsageResponse (..),
  Asset (..),
  AssetFullResponse (..),
  AssetListResponse (..),
  AssetResponse (..),
  AssetShortResponse (..),
  Assignment (..),
  AssignmentResponse (..),
  AssignmentStatus (..),
  AssignmentStatusResponse (..),
  Audience (..),
  AudienceDevice (..),
  AudienceDeviceResponse (..),
  AudienceDeviceVersionRange (..),
  AudienceLocation (..),
  AudienceResponse (..),
  AudienceTargetType (..),
  AvailabilityResponse (..),
  BaseOfferResponse (..),
  BidResponse (..),
  BillableEntity (..),
  BillableEntityResponse (..),
  BillableEntityShortResponse (..),
  BiometricImage (..),
  BiometricRequest (..),
  BlobFile (..),
  BlockedNotificationResponse (..),
  Building (..),
  CargoType (..),
  Category (..),
  CategoryResponse (..),
  CategoryTreeResponse (..),
  CellCarrier (..),
  CellCarrierResponse (..),
  ChartData (..),
  Chronology (..),
  ConfigRoutingRequest (..),
  ConnectedFriend (..),
  Connection (..),
  ConnectionGroup (..),
  ConnectionGroupResponse (..),
  ConnectionGroupShortResponse (..),
  ConnectionInfoResponse (..),
  ConnectionListResponse (..),
  ConnectionResponse (..),
  ConsumerInviteResponse (..),
  Contact (..),
  ContactInfo (..),
  ContactInfoResponse (..),
  ContactResponse (..),
  CoordsResponse (..),
  CountResponse (..),
  CreativeResponse (..),
  CsvImportResponse (..),
  DateTimeField (..),
  DateTimeFieldType (..),
  DateTimeRange (..),
  DateTimeZone (..),
  Device (..),
  Dimensions (..),
  Direction (..),
  DirectionResponse (..),
  DisbursementResponse (..),
  DriverResponse (..),
  DurationField (..),
  DurationFieldType (..),
  EmployeeResponse (..),
  EntityReference (..),
  Event (..),
  EventAttendanceResponse (..),
  EventResponse (..),
  Filter (..),
  FilterResponse (..),
  FilterTreeResponse (..),
  FingerprintBiometricImage (..),
  Flag (..),
  FlagResponse (..),
  FlagThreshold (..),
  Game (..),
  GameLevel (..),
  GameLevelListResponse (..),
  GameLevelResponse (..),
  GameListResponse (..),
  GameObjectListResponse (..),
  GameObjectResponse (..),
  GameResponse (..),
  GeoBox (..),
  GeoPointResponse (..),
  GeoResponse (..),
  GeocodeLatLngResponse (..),
  GroupPermissions (..),
  ImageGenerationResponse (..),
  ImportStatuses (..),
  Interval (..),
  InviteResponse (..),
  Invoice (..),
  ItineraryResponse (..),
  JsonArray (..),
  JsonElement (..),
  JsonNull (..),
  JsonObject (..),
  JsonPrimitive (..),
  Leaderboard (..),
  LeaderboardFullResponse (..),
  LeaderboardResponse (..),
  Leg (..),
  LegResponse (..),
  LikableResponse (..),
  LikeResponse (..),
  LineItem (..),
  ListCountResponse (..),
  ListResponse (..),
  Listing (..),
  ListingFullResponse (..),
  ListingGroupResponse (..),
  ListingResponse (..),
  LoadResponse (..),
  LoadShortResponse (..),
  LocalTime (..),
  Location (..),
  LocationResponse (..),
  LocationSearchResponse (..),
  Media (..),
  MediaOfferResponse (..),
  MediaResponse (..),
  MessageListResponse (..),
  MessageResponse (..),
  Mission (..),
  MissionFormatResponse (..),
  MissionInviteResponse (..),
  MissionListResponse (..),
  MissionResponse (..),
  MissionShortResponse (..),
  MissionTask (..),
  NameStringValueResponse (..),
  Node (..),
  NodeRequest (..),
  Note (..),
  NoteFullResponse (..),
  NoteResponse (..),
  NotificationMessageListResponse (..),
  NotificationMessageResponse (..),
  NotificationRecipientResponse (..),
  NotificationRecipientResponseListResponse (..),
  NotificationSettingsResponse (..),
  NotificationTemplateResponse (..),
  ObjectStoreResponse (..),
  Offer (..),
  OfferListResponse (..),
  OfferLocation (..),
  OfferResponse (..),
  OfferShortResponse (..),
  OfferTransactionResponse (..),
  OfferTransactionStatusResponse (..),
  OrderItemRequest (..),
  OrderPackage (..),
  OrderResponse (..),
  Orders (..),
  OrsonAiAddMovieResponse (..),
  OrsonAiBatchEmotionsResponse (..),
  OrsonAiBatchResponse (..),
  OrsonAiBatchTopicsResponse (..),
  OrsonAiBatchTranscriptResponse (..),
  OrsonAiEmotionsResponse (..),
  OrsonAiProdResponse (..),
  OrsonAiProtoResponse (..),
  OrsonAiSTTResponse (..),
  OrsonAiTTSResponse (..),
  OrsonAiTechTuneResponse (..),
  OrsonAiTopicResponse (..),
  OrsonAiTopicsResponse (..),
  OrsonAiVisualEmotionResponse (..),
  OrsonAiVoiceCanvasResponse (..),
  OrsonEpisodeResponse (..),
  OrsonRenderResponse (..),
  OrsonVideoResponse (..),
  Pack (..),
  PackListResponse (..),
  PackResponse (..),
  Participant (..),
  ParticipantResponse (..),
  PathingResponse (..),
  PaymentRequest (..),
  PaymentTransactionResponse (..),
  PaymentTypesResponse (..),
  PermissionResponse (..),
  Permissions (..),
  PersonalProfileResponse (..),
  Placement (..),
  PlacementResponse (..),
  Platform (..),
  PlatformResponse (..),
  PostalCode (..),
  PostalCodeResponse (..),
  PredictedLocationResponse (..),
  PreferredLocationResponse (..),
  PreviewPersonaResponse (..),
  Product (..),
  ProductResponse (..),
  ProfileInfoResponse (..),
  ProfileResponse (..),
  ProfileShortResponse (..),
  Program (..),
  PromoCode (..),
  PurchaseItemFullResponse (..),
  PurchaseItemListResponse (..),
  PurchaseItemResponse (..),
  PurchaseItemShortResponse (..),
  PurchaseOrderItemResponse (..),
  QuestionResponse (..),
  QueueResponse (..),
  RankFullResponse (..),
  RankListResponse (..),
  RankResponse (..),
  RatingIndexResponse (..),
  RatingResponse (..),
  Recurrence (..),
  Region (..),
  RegionLegSummary (..),
  RegionResponse (..),
  ReportBatchResponse (..),
  ReportDefinition (..),
  ReportRegionLegSummaryBatchResponse (..),
  ReportResponse (..),
  ReportTypeResponse (..),
  ReservationResponse (..),
  Retailer (..),
  RetailerCountResponse (..),
  RetailerFullResponse (..),
  RetailerLocation (..),
  RetailerLocationResponse (..),
  RetailerLocationShortResponse (..),
  RetailerOfferResponse (..),
  RetailerProfile (..),
  RetailerResponse (..),
  RetailerShortResponse (..),
  RewardResponse (..),
  Route (..),
  RouteSettings (..),
  RoutingListResponse (..),
  RoutingResponse (..),
  RuleListResponse (..),
  RuleResponse (..),
  ScheduledNotification (..),
  ScheduledNotificationFullResponse (..),
  ScheduledNotificationShortResponse (..),
  ScoreListResponse (..),
  ScoreResponse (..),
  SearchResponse (..),
  ServiceHub (..),
  ServiceType (..),
  Shipment (..),
  ShipmentBatch (..),
  ShipmentImportStatus (..),
  ShipmentOrder (..),
  SirqulResponse (..),
  SizeGroup (..),
  SizeGroupResponse (..),
  Step (..),
  StepResponse (..),
  Stop (..),
  StopResponse (..),
  Subscription (..),
  SubscriptionOption (..),
  SubscriptionOptionResponse (..),
  SubscriptionPlan (..),
  SubscriptionPlanResponse (..),
  SubscriptionResponse (..),
  TaskResponse (..),
  Territory (..),
  TerritoryResponse (..),
  ThemeDescriptorResponse (..),
  ThirdPartyCredentialResponse (..),
  ThirdPartyCredentials (..),
  ThirdPartyNetwork (..),
  ThirdPartyNetworkResponse (..),
  ThirdPartyNetworkShortResponse (..),
  TicketCountResponse (..),
  TicketListResponse (..),
  TicketOfferResponse (..),
  TicketResponse (..),
  TimeSlotResponse (..),
  TokenResponse (..),
  TournamentResponse (..),
  TriggerResponse (..),
  TrilatAppSettings (..),
  TrilatCacheRequest (..),
  TrilatCacheSample (..),
  Trip (..),
  Tutorial (..),
  TutorialResponse (..),
  TwiMLResponse (..),
  UrlResponse (..),
  UserActivityResponse (..),
  UserLocationListResponse (..),
  UserLocationResponse (..),
  UserLocationSearchResponse (..),
  UserPermissions (..),
  UserPermissionsListResponse (..),
  UserPermissionsResponse (..),
  UserSettingsResponse (..),
  Vehicle (..),
  VehicleCargoSetting (..),
  VehicleResponse (..),
  VehicleType (..),
  Verb (..),
  WeatherForecastResponse (..),
  WeatherResponse (..),
  WordzWordResponse (..),
  WrappedProxyItemResponse (..),
  WrappedProxyResponse (..),
  WrappedResponse (..),
  YayOrNay (..),
  ) where

import Data.Data (Data)
import Data.UUID (UUID)
import Data.List (lookup)
import Data.Maybe (fromMaybe)
import Data.Aeson (Value, FromJSON(..), ToJSON(..), genericToJSON, genericParseJSON)
import Data.Aeson.Types (Options(..), defaultOptions)
import Data.Set (Set)
import Data.Text (Text)
import Data.Time
import Data.Swagger (ToSchema, declareNamedSchema)
import qualified Data.Swagger as Swagger
import qualified Data.Char as Char
import qualified Data.Text as T
import qualified Data.Map as Map
import GHC.Generics (Generic)


-- | 
data Account = Account
  { accountId :: Maybe Integer -- ^ 
  , accountCreated :: Maybe UTCTime -- ^ 
  , accountUpdated :: Maybe UTCTime -- ^ 
  , accountActive :: Maybe Bool -- ^ 
  , accountValid :: Maybe Bool -- ^ 
  , accountLatitude :: Maybe Double -- ^ 
  , accountLongitude :: Maybe Double -- ^ 
  , accountLocationDescription :: Maybe Text -- ^ 
  , accountCurrentRegion :: Maybe Region -- ^ 
  , accountLocationLastUpdated :: Maybe UTCTime -- ^ 
  , accountCurrentPostalCode :: Maybe Text -- ^ 
  , accountCurrentPostalCodeLatitude :: Maybe Double -- ^ 
  , accountCurrentPostalCodeLongitude :: Maybe Double -- ^ 
  , accountLocationUpdated :: Maybe Bool -- ^ 
  , accountPremigrationId :: Maybe Integer -- ^ 
  , accountUsername :: Maybe Text -- ^ 
  , accountLocale :: Maybe Text -- ^ 
  , accountInviteCode :: Maybe Text -- ^ 
  , accountRetailerInviteCode :: Maybe Text -- ^ 
  , accountAboutUs :: Maybe Text -- ^ 
  , accountBusinessName :: Maybe Text -- ^ 
  , accountLikeCount :: Maybe Integer -- ^ 
  , accountDislikeCount :: Maybe Integer -- ^ 
  , accountThirdPartyCredentials :: Maybe [ThirdPartyCredentials] -- ^ 
  , accountPartnerActive :: Maybe Bool -- ^ 
  , accountResetToken :: Maybe Text -- ^ 
  , accountProfileImage :: Maybe Text -- ^ 
  , accountAccountType :: Maybe Text -- ^ 
  , accountMedia :: Maybe [Asset] -- ^ 
  , accountPicture :: Maybe Asset -- ^ 
  , accountFirstName :: Maybe Text -- ^ 
  , accountMiddleName :: Maybe Text -- ^ 
  , accountLastName :: Maybe Text -- ^ 
  , accountPrefix :: Maybe Text -- ^ 
  , accountSuffix :: Maybe Text -- ^ 
  , accountTitle :: Maybe Text -- ^ 
  , accountHomePhone :: Maybe Text -- ^ 
  , accountCellPhone :: Maybe Text -- ^ 
  , accountCellCarrier :: Maybe CellCarrier -- ^ 
  , accountBusinessPhone :: Maybe Text -- ^ 
  , accountBusinessPhoneExt :: Maybe Text -- ^ 
  , accountFaxNumber :: Maybe Text -- ^ 
  , accountTimeZone :: Maybe Text -- ^ 
  , accountUtcOffset :: Maybe Text -- ^ 
  , accountCode501c3 :: Maybe Text -- ^ 
  , accountEmailAddress :: Maybe Text -- ^ 
  , accountAddress :: Maybe Address -- ^ 
  , accountWeb :: Maybe Text -- ^ 
  , accountDisplay :: Maybe Text -- ^ 
  , accountWebsite :: Maybe Text -- ^ 
  , accountConsumersNotes :: Maybe Text -- ^ 
  , accountConsumersAboutUs :: Maybe Text -- ^ 
  , accountAccountProfile :: Maybe AccountProfileInfo -- ^ 
  , accountRetailerLocations :: Maybe [RetailerLocation] -- ^ 
  , accountExecutive :: Maybe Bool -- ^ 
  , accountContentName :: Maybe Text -- ^ 
  , accountDefaultThreshold :: Maybe Integer -- ^ 
  , accountAudienceInfoUnderscoregender :: Maybe Text -- ^ 
  , accountFlagThresholdUnderscoreid :: Maybe Integer -- ^ 
  , accountContentType :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Account where
  parseJSON = genericParseJSON optionsAccount
instance ToJSON Account where
  toJSON = genericToJSON optionsAccount

optionsAccount :: Options
optionsAccount =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("accountId", "id")
      , ("accountCreated", "created")
      , ("accountUpdated", "updated")
      , ("accountActive", "active")
      , ("accountValid", "valid")
      , ("accountLatitude", "latitude")
      , ("accountLongitude", "longitude")
      , ("accountLocationDescription", "locationDescription")
      , ("accountCurrentRegion", "currentRegion")
      , ("accountLocationLastUpdated", "locationLastUpdated")
      , ("accountCurrentPostalCode", "currentPostalCode")
      , ("accountCurrentPostalCodeLatitude", "currentPostalCodeLatitude")
      , ("accountCurrentPostalCodeLongitude", "currentPostalCodeLongitude")
      , ("accountLocationUpdated", "locationUpdated")
      , ("accountPremigrationId", "premigrationId")
      , ("accountUsername", "username")
      , ("accountLocale", "locale")
      , ("accountInviteCode", "inviteCode")
      , ("accountRetailerInviteCode", "retailerInviteCode")
      , ("accountAboutUs", "aboutUs")
      , ("accountBusinessName", "businessName")
      , ("accountLikeCount", "likeCount")
      , ("accountDislikeCount", "dislikeCount")
      , ("accountThirdPartyCredentials", "thirdPartyCredentials")
      , ("accountPartnerActive", "partnerActive")
      , ("accountResetToken", "resetToken")
      , ("accountProfileImage", "profileImage")
      , ("accountAccountType", "accountType")
      , ("accountMedia", "media")
      , ("accountPicture", "picture")
      , ("accountFirstName", "firstName")
      , ("accountMiddleName", "middleName")
      , ("accountLastName", "lastName")
      , ("accountPrefix", "prefix")
      , ("accountSuffix", "suffix")
      , ("accountTitle", "title")
      , ("accountHomePhone", "homePhone")
      , ("accountCellPhone", "cellPhone")
      , ("accountCellCarrier", "cellCarrier")
      , ("accountBusinessPhone", "businessPhone")
      , ("accountBusinessPhoneExt", "businessPhoneExt")
      , ("accountFaxNumber", "faxNumber")
      , ("accountTimeZone", "timeZone")
      , ("accountUtcOffset", "utcOffset")
      , ("accountCode501c3", "code501c3")
      , ("accountEmailAddress", "emailAddress")
      , ("accountAddress", "address")
      , ("accountWeb", "web")
      , ("accountDisplay", "display")
      , ("accountWebsite", "website")
      , ("accountConsumersNotes", "consumersNotes")
      , ("accountConsumersAboutUs", "consumersAboutUs")
      , ("accountAccountProfile", "accountProfile")
      , ("accountRetailerLocations", "retailerLocations")
      , ("accountExecutive", "executive")
      , ("accountContentName", "contentName")
      , ("accountDefaultThreshold", "defaultThreshold")
      , ("accountAudienceInfoUnderscoregender", "audienceInfo_gender")
      , ("accountFlagThresholdUnderscoreid", "flagThreshold_id")
      , ("accountContentType", "contentType")
      ]


-- | 
data AccountListResponse = AccountListResponse
  { accountListResponseValid :: Maybe Bool -- ^ 
  , accountListResponseMessage :: Maybe Text -- ^ 
  , accountListResponseVersion :: Maybe Double -- ^ 
  , accountListResponseSerializeNulls :: Maybe Bool -- ^ 
  , accountListResponseStartTimeLog :: Maybe Integer -- ^ 
  , accountListResponseErrorCode :: Maybe Text -- ^ 
  , accountListResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , accountListResponseItems :: Maybe [AccountResponse] -- ^ 
  , accountListResponseCount :: Maybe Int -- ^ 
  , accountListResponseHasMoreResults :: Maybe Bool -- ^ 
  , accountListResponseStart :: Maybe Int -- ^ 
  , accountListResponseLimit :: Maybe Int -- ^ 
  , accountListResponseCountTotal :: Maybe Integer -- ^ 
  , accountListResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AccountListResponse where
  parseJSON = genericParseJSON optionsAccountListResponse
instance ToJSON AccountListResponse where
  toJSON = genericToJSON optionsAccountListResponse

optionsAccountListResponse :: Options
optionsAccountListResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("accountListResponseValid", "valid")
      , ("accountListResponseMessage", "message")
      , ("accountListResponseVersion", "version")
      , ("accountListResponseSerializeNulls", "serializeNulls")
      , ("accountListResponseStartTimeLog", "startTimeLog")
      , ("accountListResponseErrorCode", "errorCode")
      , ("accountListResponseRequest", "request")
      , ("accountListResponseItems", "items")
      , ("accountListResponseCount", "count")
      , ("accountListResponseHasMoreResults", "hasMoreResults")
      , ("accountListResponseStart", "start")
      , ("accountListResponseLimit", "limit")
      , ("accountListResponseCountTotal", "countTotal")
      , ("accountListResponseReturning", "returning")
      ]


-- | 
data AccountLoginResponse = AccountLoginResponse
  { accountLoginResponseValid :: Maybe Bool -- ^ 
  , accountLoginResponseMessage :: Maybe Text -- ^ 
  , accountLoginResponseVersion :: Maybe Double -- ^ 
  , accountLoginResponseSerializeNulls :: Maybe Bool -- ^ 
  , accountLoginResponseStartTimeLog :: Maybe Integer -- ^ 
  , accountLoginResponseErrorCode :: Maybe Text -- ^ 
  , accountLoginResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , accountLoginResponseAccountId :: Maybe Integer -- ^ 
  , accountLoginResponseLocationDisplay :: Maybe Text -- ^ 
  , accountLoginResponseDisplay :: Maybe Text -- ^ 
  , accountLoginResponseUsername :: Maybe Text -- ^ 
  , accountLoginResponseAccountType :: Maybe Text -- ^ 
  , accountLoginResponseValidated :: Maybe Bool -- ^ 
  , accountLoginResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AccountLoginResponse where
  parseJSON = genericParseJSON optionsAccountLoginResponse
instance ToJSON AccountLoginResponse where
  toJSON = genericToJSON optionsAccountLoginResponse

optionsAccountLoginResponse :: Options
optionsAccountLoginResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("accountLoginResponseValid", "valid")
      , ("accountLoginResponseMessage", "message")
      , ("accountLoginResponseVersion", "version")
      , ("accountLoginResponseSerializeNulls", "serializeNulls")
      , ("accountLoginResponseStartTimeLog", "startTimeLog")
      , ("accountLoginResponseErrorCode", "errorCode")
      , ("accountLoginResponseRequest", "request")
      , ("accountLoginResponseAccountId", "accountId")
      , ("accountLoginResponseLocationDisplay", "locationDisplay")
      , ("accountLoginResponseDisplay", "display")
      , ("accountLoginResponseUsername", "username")
      , ("accountLoginResponseAccountType", "accountType")
      , ("accountLoginResponseValidated", "validated")
      , ("accountLoginResponseReturning", "returning")
      ]


-- | 
data AccountMiniResponse = AccountMiniResponse
  { accountMiniResponseAccountId :: Maybe Integer -- ^ 
  , accountMiniResponseLocationDisplay :: Maybe Text -- ^ 
  , accountMiniResponseDisplay :: Maybe Text -- ^ 
  , accountMiniResponseUsername :: Maybe Text -- ^ 
  , accountMiniResponseAccountType :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AccountMiniResponse where
  parseJSON = genericParseJSON optionsAccountMiniResponse
instance ToJSON AccountMiniResponse where
  toJSON = genericToJSON optionsAccountMiniResponse

optionsAccountMiniResponse :: Options
optionsAccountMiniResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("accountMiniResponseAccountId", "accountId")
      , ("accountMiniResponseLocationDisplay", "locationDisplay")
      , ("accountMiniResponseDisplay", "display")
      , ("accountMiniResponseUsername", "username")
      , ("accountMiniResponseAccountType", "accountType")
      ]


-- | 
data AccountProfileInfo = AccountProfileInfo
  { accountProfileInfoId :: Maybe Integer -- ^ 
  , accountProfileInfoCreated :: Maybe UTCTime -- ^ 
  , accountProfileInfoUpdated :: Maybe UTCTime -- ^ 
  , accountProfileInfoActive :: Maybe Bool -- ^ 
  , accountProfileInfoValid :: Maybe Bool -- ^ 
  , accountProfileInfoAccount :: Maybe Account -- ^ 
  , accountProfileInfoGender :: Maybe Text -- ^ 
  , accountProfileInfoBirthday :: Maybe UTCTime -- ^ 
  , accountProfileInfoAgeGroup :: Maybe Text -- ^ 
  , accountProfileInfoPreferredMinAge :: Maybe Int -- ^ 
  , accountProfileInfoPreferredMaxAge :: Maybe Int -- ^ 
  , accountProfileInfoPreferredMinHeight :: Maybe Int -- ^ 
  , accountProfileInfoPreferredMaxHeight :: Maybe Int -- ^ 
  , accountProfileInfoPreferredGender :: Maybe Text -- ^ 
  , accountProfileInfoPreferredEducation :: Maybe Text -- ^ 
  , accountProfileInfoPreferredEducationIndex :: Maybe Int -- ^ 
  , accountProfileInfoPreferredBodyType :: Maybe Text -- ^ 
  , accountProfileInfoPreferredEthnicity :: Maybe Text -- ^ 
  , accountProfileInfoPreferredLocation :: Maybe Text -- ^ 
  , accountProfileInfoPreferredLocationRange :: Maybe Double -- ^ 
  , accountProfileInfoHeight :: Maybe Text -- ^ 
  , accountProfileInfoHeightIndex :: Maybe Int -- ^ 
  , accountProfileInfoEthnicity :: Maybe Text -- ^ 
  , accountProfileInfoBodyType :: Maybe Text -- ^ 
  , accountProfileInfoMaritalStatus :: Maybe Text -- ^ 
  , accountProfileInfoChildren :: Maybe Text -- ^ 
  , accountProfileInfoReligion :: Maybe Text -- ^ 
  , accountProfileInfoEducation :: Maybe Text -- ^ 
  , accountProfileInfoEducationIndex :: Maybe Int -- ^ 
  , accountProfileInfoSmoke :: Maybe Text -- ^ 
  , accountProfileInfoDrink :: Maybe Text -- ^ 
  , accountProfileInfoCompanionship :: Maybe Text -- ^ 
  , accountProfileInfoCompanionshipIndex :: Maybe Int -- ^ 
  , accountProfileInfoDevelopmentPlatforms :: Maybe [Text] -- ^ 
  , accountProfileInfoMatchToken :: Maybe Integer -- ^ 
  , accountProfileInfoMatchString :: Maybe Text -- ^ 
  , accountProfileInfoNoneZeroMatchToken :: Maybe Integer -- ^ 
  , accountProfileInfoPreferredMaxBirthday :: Maybe UTCTime -- ^ 
  , accountProfileInfoPreferredMinBirthday :: Maybe UTCTime -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AccountProfileInfo where
  parseJSON = genericParseJSON optionsAccountProfileInfo
instance ToJSON AccountProfileInfo where
  toJSON = genericToJSON optionsAccountProfileInfo

optionsAccountProfileInfo :: Options
optionsAccountProfileInfo =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("accountProfileInfoId", "id")
      , ("accountProfileInfoCreated", "created")
      , ("accountProfileInfoUpdated", "updated")
      , ("accountProfileInfoActive", "active")
      , ("accountProfileInfoValid", "valid")
      , ("accountProfileInfoAccount", "account")
      , ("accountProfileInfoGender", "gender")
      , ("accountProfileInfoBirthday", "birthday")
      , ("accountProfileInfoAgeGroup", "ageGroup")
      , ("accountProfileInfoPreferredMinAge", "preferredMinAge")
      , ("accountProfileInfoPreferredMaxAge", "preferredMaxAge")
      , ("accountProfileInfoPreferredMinHeight", "preferredMinHeight")
      , ("accountProfileInfoPreferredMaxHeight", "preferredMaxHeight")
      , ("accountProfileInfoPreferredGender", "preferredGender")
      , ("accountProfileInfoPreferredEducation", "preferredEducation")
      , ("accountProfileInfoPreferredEducationIndex", "preferredEducationIndex")
      , ("accountProfileInfoPreferredBodyType", "preferredBodyType")
      , ("accountProfileInfoPreferredEthnicity", "preferredEthnicity")
      , ("accountProfileInfoPreferredLocation", "preferredLocation")
      , ("accountProfileInfoPreferredLocationRange", "preferredLocationRange")
      , ("accountProfileInfoHeight", "height")
      , ("accountProfileInfoHeightIndex", "heightIndex")
      , ("accountProfileInfoEthnicity", "ethnicity")
      , ("accountProfileInfoBodyType", "bodyType")
      , ("accountProfileInfoMaritalStatus", "maritalStatus")
      , ("accountProfileInfoChildren", "children")
      , ("accountProfileInfoReligion", "religion")
      , ("accountProfileInfoEducation", "education")
      , ("accountProfileInfoEducationIndex", "educationIndex")
      , ("accountProfileInfoSmoke", "smoke")
      , ("accountProfileInfoDrink", "drink")
      , ("accountProfileInfoCompanionship", "companionship")
      , ("accountProfileInfoCompanionshipIndex", "companionshipIndex")
      , ("accountProfileInfoDevelopmentPlatforms", "developmentPlatforms")
      , ("accountProfileInfoMatchToken", "matchToken")
      , ("accountProfileInfoMatchString", "matchString")
      , ("accountProfileInfoNoneZeroMatchToken", "noneZeroMatchToken")
      , ("accountProfileInfoPreferredMaxBirthday", "preferredMaxBirthday")
      , ("accountProfileInfoPreferredMinBirthday", "preferredMinBirthday")
      ]


-- | 
data AccountResponse = AccountResponse
  { accountResponseAccountId :: Maybe Integer -- ^ 
  , accountResponseLocationDisplay :: Maybe Text -- ^ 
  , accountResponseDisplay :: Maybe Text -- ^ 
  , accountResponseUsername :: Maybe Text -- ^ 
  , accountResponseAccountType :: Maybe Text -- ^ 
  , accountResponseProfileImage :: Maybe Text -- ^ 
  , accountResponseGender :: Maybe Text -- ^ 
  , accountResponseContactEmail :: Maybe Text -- ^ 
  , accountResponseContact :: Maybe ContactResponse -- ^ 
  , accountResponseManager :: Maybe AccountMiniResponse -- ^ 
  , accountResponseActive :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AccountResponse where
  parseJSON = genericParseJSON optionsAccountResponse
instance ToJSON AccountResponse where
  toJSON = genericToJSON optionsAccountResponse

optionsAccountResponse :: Options
optionsAccountResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("accountResponseAccountId", "accountId")
      , ("accountResponseLocationDisplay", "locationDisplay")
      , ("accountResponseDisplay", "display")
      , ("accountResponseUsername", "username")
      , ("accountResponseAccountType", "accountType")
      , ("accountResponseProfileImage", "profileImage")
      , ("accountResponseGender", "gender")
      , ("accountResponseContactEmail", "contactEmail")
      , ("accountResponseContact", "contact")
      , ("accountResponseManager", "manager")
      , ("accountResponseActive", "active")
      ]


-- | 
data AccountShortResponse = AccountShortResponse
  { accountShortResponseAccountId :: Maybe Integer -- ^ 
  , accountShortResponseLocationDisplay :: Maybe Text -- ^ 
  , accountShortResponseDisplay :: Maybe Text -- ^ 
  , accountShortResponseUsername :: Maybe Text -- ^ 
  , accountShortResponseAccountType :: Maybe Text -- ^ 
  , accountShortResponseProfileImage :: Maybe Text -- ^ 
  , accountShortResponseGender :: Maybe Text -- ^ 
  , accountShortResponseContactEmail :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AccountShortResponse where
  parseJSON = genericParseJSON optionsAccountShortResponse
instance ToJSON AccountShortResponse where
  toJSON = genericToJSON optionsAccountShortResponse

optionsAccountShortResponse :: Options
optionsAccountShortResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("accountShortResponseAccountId", "accountId")
      , ("accountShortResponseLocationDisplay", "locationDisplay")
      , ("accountShortResponseDisplay", "display")
      , ("accountShortResponseUsername", "username")
      , ("accountShortResponseAccountType", "accountType")
      , ("accountShortResponseProfileImage", "profileImage")
      , ("accountShortResponseGender", "gender")
      , ("accountShortResponseContactEmail", "contactEmail")
      ]


-- | 
data AchievementProgressResponse = AchievementProgressResponse
  { achievementProgressResponseAchievementId :: Maybe Integer -- ^ 
  , achievementProgressResponseAchievementTierId :: Maybe Integer -- ^ 
  , achievementProgressResponseTitle :: Maybe Text -- ^ 
  , achievementProgressResponseDescription :: Maybe Text -- ^ 
  , achievementProgressResponseIcon :: Maybe AssetShortResponse -- ^ 
  , achievementProgressResponseCompleted :: Maybe Bool -- ^ 
  , achievementProgressResponseProgressCount :: Maybe Integer -- ^ 
  , achievementProgressResponseGoalCount :: Maybe Integer -- ^ 
  , achievementProgressResponseDateUpdated :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AchievementProgressResponse where
  parseJSON = genericParseJSON optionsAchievementProgressResponse
instance ToJSON AchievementProgressResponse where
  toJSON = genericToJSON optionsAchievementProgressResponse

optionsAchievementProgressResponse :: Options
optionsAchievementProgressResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("achievementProgressResponseAchievementId", "achievementId")
      , ("achievementProgressResponseAchievementTierId", "achievementTierId")
      , ("achievementProgressResponseTitle", "title")
      , ("achievementProgressResponseDescription", "description")
      , ("achievementProgressResponseIcon", "icon")
      , ("achievementProgressResponseCompleted", "completed")
      , ("achievementProgressResponseProgressCount", "progressCount")
      , ("achievementProgressResponseGoalCount", "goalCount")
      , ("achievementProgressResponseDateUpdated", "dateUpdated")
      ]


-- | 
data AchievementResponse = AchievementResponse
  { achievementResponseValid :: Maybe Bool -- ^ 
  , achievementResponseMessage :: Maybe Text -- ^ 
  , achievementResponseVersion :: Maybe Double -- ^ 
  , achievementResponseSerializeNulls :: Maybe Bool -- ^ 
  , achievementResponseStartTimeLog :: Maybe Integer -- ^ 
  , achievementResponseErrorCode :: Maybe Text -- ^ 
  , achievementResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , achievementResponseAchievementId :: Maybe Integer -- ^ 
  , achievementResponseTitle :: Maybe Text -- ^ 
  , achievementResponseDescription :: Maybe Text -- ^ 
  , achievementResponseAnalyticsTag :: Maybe Text -- ^ 
  , achievementResponseRankType :: Maybe Text -- ^ 
  , achievementResponseRankIncrement :: Maybe Int -- ^ 
  , achievementResponseValidate :: Maybe Bool -- ^ 
  , achievementResponseAppName :: Maybe Text -- ^ 
  , achievementResponseActive :: Maybe Bool -- ^ 
  , achievementResponseUpdated :: Maybe Integer -- ^ 
  , achievementResponseCreated :: Maybe Integer -- ^ 
  , achievementResponseTierCount :: Maybe Int -- ^ 
  , achievementResponseMinIncrement :: Maybe Int -- ^ 
  , achievementResponseMaxIncrement :: Maybe Int -- ^ 
  , achievementResponseTiers :: Maybe [AchievementTierResponse] -- ^ 
  , achievementResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AchievementResponse where
  parseJSON = genericParseJSON optionsAchievementResponse
instance ToJSON AchievementResponse where
  toJSON = genericToJSON optionsAchievementResponse

optionsAchievementResponse :: Options
optionsAchievementResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("achievementResponseValid", "valid")
      , ("achievementResponseMessage", "message")
      , ("achievementResponseVersion", "version")
      , ("achievementResponseSerializeNulls", "serializeNulls")
      , ("achievementResponseStartTimeLog", "startTimeLog")
      , ("achievementResponseErrorCode", "errorCode")
      , ("achievementResponseRequest", "request")
      , ("achievementResponseAchievementId", "achievementId")
      , ("achievementResponseTitle", "title")
      , ("achievementResponseDescription", "description")
      , ("achievementResponseAnalyticsTag", "analyticsTag")
      , ("achievementResponseRankType", "rankType")
      , ("achievementResponseRankIncrement", "rankIncrement")
      , ("achievementResponseValidate", "validate")
      , ("achievementResponseAppName", "appName")
      , ("achievementResponseActive", "active")
      , ("achievementResponseUpdated", "updated")
      , ("achievementResponseCreated", "created")
      , ("achievementResponseTierCount", "tierCount")
      , ("achievementResponseMinIncrement", "minIncrement")
      , ("achievementResponseMaxIncrement", "maxIncrement")
      , ("achievementResponseTiers", "tiers")
      , ("achievementResponseReturning", "returning")
      ]


-- | 
data AchievementShortResponse = AchievementShortResponse
  { achievementShortResponseValid :: Maybe Bool -- ^ 
  , achievementShortResponseMessage :: Maybe Text -- ^ 
  , achievementShortResponseVersion :: Maybe Double -- ^ 
  , achievementShortResponseSerializeNulls :: Maybe Bool -- ^ 
  , achievementShortResponseStartTimeLog :: Maybe Integer -- ^ 
  , achievementShortResponseErrorCode :: Maybe Text -- ^ 
  , achievementShortResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , achievementShortResponseAchievementId :: Maybe Integer -- ^ 
  , achievementShortResponseTitle :: Maybe Text -- ^ 
  , achievementShortResponseDescription :: Maybe Text -- ^ 
  , achievementShortResponseAnalyticsTag :: Maybe Text -- ^ 
  , achievementShortResponseRankType :: Maybe Text -- ^ 
  , achievementShortResponseRankIncrement :: Maybe Int -- ^ 
  , achievementShortResponseValidate :: Maybe Bool -- ^ 
  , achievementShortResponseAppName :: Maybe Text -- ^ 
  , achievementShortResponseActive :: Maybe Bool -- ^ 
  , achievementShortResponseUpdated :: Maybe Integer -- ^ 
  , achievementShortResponseCreated :: Maybe Integer -- ^ 
  , achievementShortResponseTierCount :: Maybe Int -- ^ 
  , achievementShortResponseMinIncrement :: Maybe Int -- ^ 
  , achievementShortResponseMaxIncrement :: Maybe Int -- ^ 
  , achievementShortResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AchievementShortResponse where
  parseJSON = genericParseJSON optionsAchievementShortResponse
instance ToJSON AchievementShortResponse where
  toJSON = genericToJSON optionsAchievementShortResponse

optionsAchievementShortResponse :: Options
optionsAchievementShortResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("achievementShortResponseValid", "valid")
      , ("achievementShortResponseMessage", "message")
      , ("achievementShortResponseVersion", "version")
      , ("achievementShortResponseSerializeNulls", "serializeNulls")
      , ("achievementShortResponseStartTimeLog", "startTimeLog")
      , ("achievementShortResponseErrorCode", "errorCode")
      , ("achievementShortResponseRequest", "request")
      , ("achievementShortResponseAchievementId", "achievementId")
      , ("achievementShortResponseTitle", "title")
      , ("achievementShortResponseDescription", "description")
      , ("achievementShortResponseAnalyticsTag", "analyticsTag")
      , ("achievementShortResponseRankType", "rankType")
      , ("achievementShortResponseRankIncrement", "rankIncrement")
      , ("achievementShortResponseValidate", "validate")
      , ("achievementShortResponseAppName", "appName")
      , ("achievementShortResponseActive", "active")
      , ("achievementShortResponseUpdated", "updated")
      , ("achievementShortResponseCreated", "created")
      , ("achievementShortResponseTierCount", "tierCount")
      , ("achievementShortResponseMinIncrement", "minIncrement")
      , ("achievementShortResponseMaxIncrement", "maxIncrement")
      , ("achievementShortResponseReturning", "returning")
      ]


-- | 
data AchievementTierResponse = AchievementTierResponse
  { achievementTierResponseAchievementTierId :: Maybe Integer -- ^ 
  , achievementTierResponseTitle :: Maybe Text -- ^ 
  , achievementTierResponseDescription :: Maybe Text -- ^ 
  , achievementTierResponseGoalCount :: Maybe Integer -- ^ 
  , achievementTierResponseIcon :: Maybe AssetShortResponse -- ^ 
  , achievementTierResponseMissionId :: Maybe Integer -- ^ 
  , achievementTierResponseGameId :: Maybe Integer -- ^ 
  , achievementTierResponsePackId :: Maybe Integer -- ^ 
  , achievementTierResponseGameLevelId :: Maybe Integer -- ^ 
  , achievementTierResponseGameObjectId :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AchievementTierResponse where
  parseJSON = genericParseJSON optionsAchievementTierResponse
instance ToJSON AchievementTierResponse where
  toJSON = genericToJSON optionsAchievementTierResponse

optionsAchievementTierResponse :: Options
optionsAchievementTierResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("achievementTierResponseAchievementTierId", "achievementTierId")
      , ("achievementTierResponseTitle", "title")
      , ("achievementTierResponseDescription", "description")
      , ("achievementTierResponseGoalCount", "goalCount")
      , ("achievementTierResponseIcon", "icon")
      , ("achievementTierResponseMissionId", "missionId")
      , ("achievementTierResponseGameId", "gameId")
      , ("achievementTierResponsePackId", "packId")
      , ("achievementTierResponseGameLevelId", "gameLevelId")
      , ("achievementTierResponseGameObjectId", "gameObjectId")
      ]


-- | 
data ActivityResponse = ActivityResponse
  { activityResponseActivityId :: Maybe Integer -- ^ 
  , activityResponseCreated :: Maybe Integer -- ^ 
  , activityResponseAppKey :: Maybe Text -- ^ 
  , activityResponseTargetId :: Maybe Integer -- ^ 
  , activityResponseTargetType :: Maybe Text -- ^ 
  , activityResponseTargetLegacyId :: Maybe Text -- ^ 
  , activityResponseTargetDescription :: Maybe Text -- ^ 
  , activityResponseTargetActive :: Maybe Bool -- ^ 
  , activityResponseAction :: Maybe Text -- ^ 
  , activityResponseSlaveEntityId :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ActivityResponse where
  parseJSON = genericParseJSON optionsActivityResponse
instance ToJSON ActivityResponse where
  toJSON = genericToJSON optionsActivityResponse

optionsActivityResponse :: Options
optionsActivityResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("activityResponseActivityId", "activityId")
      , ("activityResponseCreated", "created")
      , ("activityResponseAppKey", "appKey")
      , ("activityResponseTargetId", "targetId")
      , ("activityResponseTargetType", "targetType")
      , ("activityResponseTargetLegacyId", "targetLegacyId")
      , ("activityResponseTargetDescription", "targetDescription")
      , ("activityResponseTargetActive", "targetActive")
      , ("activityResponseAction", "action")
      , ("activityResponseSlaveEntityId", "slaveEntityId")
      ]


-- | 
data Address = Address
  { addressStreetAddress :: Maybe Text -- ^ 
  , addressStreetAddress2 :: Maybe Text -- ^ 
  , addressCity :: Maybe Text -- ^ 
  , addressStateCode :: Maybe Text -- ^ 
  , addressState :: Maybe Text -- ^ 
  , addressPostalCode :: Maybe Text -- ^ 
  , addressCountryCode :: Maybe Text -- ^ 
  , addressCountry :: Maybe Text -- ^ 
  , addressDisplay :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Address where
  parseJSON = genericParseJSON optionsAddress
instance ToJSON Address where
  toJSON = genericToJSON optionsAddress

optionsAddress :: Options
optionsAddress =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("addressStreetAddress", "streetAddress")
      , ("addressStreetAddress2", "streetAddress2")
      , ("addressCity", "city")
      , ("addressStateCode", "stateCode")
      , ("addressState", "state")
      , ("addressPostalCode", "postalCode")
      , ("addressCountryCode", "countryCode")
      , ("addressCountry", "country")
      , ("addressDisplay", "display")
      ]


-- | 
data AddressResponse = AddressResponse
  { addressResponseStreetAddress :: Maybe Text -- ^ 
  , addressResponseStreetAddress2 :: Maybe Text -- ^ 
  , addressResponseCity :: Maybe Text -- ^ 
  , addressResponseStateCode :: Maybe Text -- ^ 
  , addressResponseState :: Maybe Text -- ^ 
  , addressResponsePostalCode :: Maybe Text -- ^ 
  , addressResponseCountryCode :: Maybe Text -- ^ 
  , addressResponseCountry :: Maybe Text -- ^ 
  , addressResponseDisplay :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AddressResponse where
  parseJSON = genericParseJSON optionsAddressResponse
instance ToJSON AddressResponse where
  toJSON = genericToJSON optionsAddressResponse

optionsAddressResponse :: Options
optionsAddressResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("addressResponseStreetAddress", "streetAddress")
      , ("addressResponseStreetAddress2", "streetAddress2")
      , ("addressResponseCity", "city")
      , ("addressResponseStateCode", "stateCode")
      , ("addressResponseState", "state")
      , ("addressResponsePostalCode", "postalCode")
      , ("addressResponseCountryCode", "countryCode")
      , ("addressResponseCountry", "country")
      , ("addressResponseDisplay", "display")
      ]


-- | 
data AgeGroupResponse = AgeGroupResponse
  { ageGroupResponseKey :: Maybe Text -- ^ 
  , ageGroupResponseToString :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AgeGroupResponse where
  parseJSON = genericParseJSON optionsAgeGroupResponse
instance ToJSON AgeGroupResponse where
  toJSON = genericToJSON optionsAgeGroupResponse

optionsAgeGroupResponse :: Options
optionsAgeGroupResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("ageGroupResponseKey", "key")
      , ("ageGroupResponseToString", "toString")
      ]


-- | 
data Album = Album
  { albumId :: Maybe Integer -- ^ 
  , albumActive :: Maybe Bool -- ^ 
  , albumValid :: Maybe Bool -- ^ 
  , albumLatitude :: Maybe Double -- ^ 
  , albumLongitude :: Maybe Double -- ^ 
  , albumLocationDescription :: Maybe Text -- ^ 
  , albumOwner :: Maybe Account -- ^ 
  , albumTitle :: Maybe Text -- ^ 
  , albumApplication :: Maybe Application -- ^ 
  , albumApprovalStatus :: Maybe Text -- ^ 
  , albumPublicPermissions :: Maybe Permissions -- ^ 
  , albumUserPermissions :: Maybe [UserPermissions] -- ^ 
  , albumVisibility :: Maybe Text -- ^ 
  , albumNotes :: Maybe [Note] -- ^ 
  , albumNoteCount :: Maybe Integer -- ^ 
  , albumLikes :: Maybe [YayOrNay] -- ^ 
  , albumLikeCount :: Maybe Integer -- ^ 
  , albumDislikeCount :: Maybe Integer -- ^ 
  , albumFlags :: Maybe [Flag] -- ^ 
  , albumFlagCount :: Maybe Integer -- ^ 
  , albumFlagThreshold :: Maybe FlagThreshold -- ^ 
  , albumDescription :: Maybe Text -- ^ 
  , albumAlbumType :: Maybe Text -- ^ 
  , albumAssets :: Maybe [Asset] -- ^ 
  , albumCoverAsset :: Maybe Asset -- ^ 
  , albumTags :: Maybe Text -- ^ 
  , albumStartDate :: Maybe UTCTime -- ^ 
  , albumEndDate :: Maybe UTCTime -- ^ 
  , albumContactInfo :: Maybe ContactInfo -- ^ 
  , albumAssetCount :: Maybe Integer -- ^ 
  , albumFavoriteCount :: Maybe Integer -- ^ 
  , albumViewedCount :: Maybe Integer -- ^ 
  , albumClickedCount :: Maybe Integer -- ^ 
  , albumSharedCount :: Maybe Integer -- ^ 
  , albumAnonymous :: Maybe Bool -- ^ 
  , albumOwnerUsername :: Maybe Text -- ^ 
  , albumDisplay :: Maybe Text -- ^ 
  , albumAppKey :: Maybe Text -- ^ 
  , albumBillableId :: Maybe Integer -- ^ 
  , albumSubType :: Maybe Text -- ^ 
  , albumContentAsset :: Maybe Asset -- ^ 
  , albumSecondaryType :: Maybe Text -- ^ 
  , albumContentName :: Maybe Text -- ^ 
  , albumApplicationTitle :: Maybe Text -- ^ 
  , albumShortTitle :: Maybe Text -- ^ 
  , albumDefaultThreshold :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Album where
  parseJSON = genericParseJSON optionsAlbum
instance ToJSON Album where
  toJSON = genericToJSON optionsAlbum

optionsAlbum :: Options
optionsAlbum =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("albumId", "id")
      , ("albumActive", "active")
      , ("albumValid", "valid")
      , ("albumLatitude", "latitude")
      , ("albumLongitude", "longitude")
      , ("albumLocationDescription", "locationDescription")
      , ("albumOwner", "owner")
      , ("albumTitle", "title")
      , ("albumApplication", "application")
      , ("albumApprovalStatus", "approvalStatus")
      , ("albumPublicPermissions", "publicPermissions")
      , ("albumUserPermissions", "userPermissions")
      , ("albumVisibility", "visibility")
      , ("albumNotes", "notes")
      , ("albumNoteCount", "noteCount")
      , ("albumLikes", "likes")
      , ("albumLikeCount", "likeCount")
      , ("albumDislikeCount", "dislikeCount")
      , ("albumFlags", "flags")
      , ("albumFlagCount", "flagCount")
      , ("albumFlagThreshold", "flagThreshold")
      , ("albumDescription", "description")
      , ("albumAlbumType", "albumType")
      , ("albumAssets", "assets")
      , ("albumCoverAsset", "coverAsset")
      , ("albumTags", "tags")
      , ("albumStartDate", "startDate")
      , ("albumEndDate", "endDate")
      , ("albumContactInfo", "contactInfo")
      , ("albumAssetCount", "assetCount")
      , ("albumFavoriteCount", "favoriteCount")
      , ("albumViewedCount", "viewedCount")
      , ("albumClickedCount", "clickedCount")
      , ("albumSharedCount", "sharedCount")
      , ("albumAnonymous", "anonymous")
      , ("albumOwnerUsername", "ownerUsername")
      , ("albumDisplay", "display")
      , ("albumAppKey", "appKey")
      , ("albumBillableId", "billableId")
      , ("albumSubType", "subType")
      , ("albumContentAsset", "contentAsset")
      , ("albumSecondaryType", "secondaryType")
      , ("albumContentName", "contentName")
      , ("albumApplicationTitle", "applicationTitle")
      , ("albumShortTitle", "shortTitle")
      , ("albumDefaultThreshold", "defaultThreshold")
      ]


-- | 
data AlbumContestListResponse = AlbumContestListResponse
  { albumContestListResponseValid :: Maybe Bool -- ^ 
  , albumContestListResponseMessage :: Maybe Text -- ^ 
  , albumContestListResponseVersion :: Maybe Double -- ^ 
  , albumContestListResponseSerializeNulls :: Maybe Bool -- ^ 
  , albumContestListResponseStartTimeLog :: Maybe Integer -- ^ 
  , albumContestListResponseErrorCode :: Maybe Text -- ^ 
  , albumContestListResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , albumContestListResponseItems :: Maybe [AlbumContestResponse] -- ^ 
  , albumContestListResponseHasMoreResults :: Maybe Bool -- ^ 
  , albumContestListResponseCount :: Maybe Int -- ^ 
  , albumContestListResponseCountTotal :: Maybe Integer -- ^ 
  , albumContestListResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AlbumContestListResponse where
  parseJSON = genericParseJSON optionsAlbumContestListResponse
instance ToJSON AlbumContestListResponse where
  toJSON = genericToJSON optionsAlbumContestListResponse

optionsAlbumContestListResponse :: Options
optionsAlbumContestListResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("albumContestListResponseValid", "valid")
      , ("albumContestListResponseMessage", "message")
      , ("albumContestListResponseVersion", "version")
      , ("albumContestListResponseSerializeNulls", "serializeNulls")
      , ("albumContestListResponseStartTimeLog", "startTimeLog")
      , ("albumContestListResponseErrorCode", "errorCode")
      , ("albumContestListResponseRequest", "request")
      , ("albumContestListResponseItems", "items")
      , ("albumContestListResponseHasMoreResults", "hasMoreResults")
      , ("albumContestListResponseCount", "count")
      , ("albumContestListResponseCountTotal", "countTotal")
      , ("albumContestListResponseReturning", "returning")
      ]


-- | 
data AlbumContestResponse = AlbumContestResponse
  { albumContestResponseValid :: Maybe Bool -- ^ 
  , albumContestResponseMessage :: Maybe Text -- ^ 
  , albumContestResponseVersion :: Maybe Double -- ^ 
  , albumContestResponseSerializeNulls :: Maybe Bool -- ^ 
  , albumContestResponseStartTimeLog :: Maybe Integer -- ^ 
  , albumContestResponseErrorCode :: Maybe Text -- ^ 
  , albumContestResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , albumContestResponseAlbumContestId :: Maybe Integer -- ^ 
  , albumContestResponseContestType :: Maybe Text -- ^ 
  , albumContestResponseOwner :: Maybe AccountShortResponse -- ^ 
  , albumContestResponseTitle :: Maybe Text -- ^ 
  , albumContestResponseDescription :: Maybe Text -- ^ 
  , albumContestResponseVisibility :: Maybe Text -- ^ 
  , albumContestResponseStartDate :: Maybe Integer -- ^ 
  , albumContestResponseEndDate :: Maybe Integer -- ^ 
  , albumContestResponseLikeCount :: Maybe Integer -- ^ 
  , albumContestResponseDislikeCount :: Maybe Integer -- ^ 
  , albumContestResponseCommentsCount :: Maybe Int -- ^ 
  , albumContestResponseUserCount :: Maybe Int -- ^ 
  , albumContestResponseComments :: Maybe [NoteFullResponse] -- ^ 
  , albumContestResponseLikes :: Maybe [LikeResponse] -- ^ 
  , albumContestResponseConnectionGroups :: Maybe [ConnectionGroupShortResponse] -- ^ 
  , albumContestResponseConnections :: Maybe [ConnectionResponse] -- ^ 
  , albumContestResponseHasLiked :: Maybe Bool -- ^ 
  , albumContestResponseUserPermissions :: Maybe Permissions -- ^ 
  , albumContestResponsePublicPermissions :: Maybe Permissions -- ^ 
  , albumContestResponseAlbum1 :: Maybe AlbumFullResponse -- ^ 
  , albumContestResponseAlbum2 :: Maybe AlbumFullResponse -- ^ 
  , albumContestResponseLatitude :: Maybe Double -- ^ 
  , albumContestResponseLongitude :: Maybe Double -- ^ 
  , albumContestResponseLocationDescription :: Maybe Text -- ^ 
  , albumContestResponseDistance :: Maybe Double -- ^ 
  , albumContestResponseDateCreated :: Maybe Integer -- ^ 
  , albumContestResponseDateUpdated :: Maybe Integer -- ^ 
  , albumContestResponseApprovalStatus :: Maybe Text -- ^ 
  , albumContestResponseVoteCount :: Maybe Integer -- ^ 
  , albumContestResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AlbumContestResponse where
  parseJSON = genericParseJSON optionsAlbumContestResponse
instance ToJSON AlbumContestResponse where
  toJSON = genericToJSON optionsAlbumContestResponse

optionsAlbumContestResponse :: Options
optionsAlbumContestResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("albumContestResponseValid", "valid")
      , ("albumContestResponseMessage", "message")
      , ("albumContestResponseVersion", "version")
      , ("albumContestResponseSerializeNulls", "serializeNulls")
      , ("albumContestResponseStartTimeLog", "startTimeLog")
      , ("albumContestResponseErrorCode", "errorCode")
      , ("albumContestResponseRequest", "request")
      , ("albumContestResponseAlbumContestId", "albumContestId")
      , ("albumContestResponseContestType", "contestType")
      , ("albumContestResponseOwner", "owner")
      , ("albumContestResponseTitle", "title")
      , ("albumContestResponseDescription", "description")
      , ("albumContestResponseVisibility", "visibility")
      , ("albumContestResponseStartDate", "startDate")
      , ("albumContestResponseEndDate", "endDate")
      , ("albumContestResponseLikeCount", "likeCount")
      , ("albumContestResponseDislikeCount", "dislikeCount")
      , ("albumContestResponseCommentsCount", "commentsCount")
      , ("albumContestResponseUserCount", "userCount")
      , ("albumContestResponseComments", "comments")
      , ("albumContestResponseLikes", "likes")
      , ("albumContestResponseConnectionGroups", "connectionGroups")
      , ("albumContestResponseConnections", "connections")
      , ("albumContestResponseHasLiked", "hasLiked")
      , ("albumContestResponseUserPermissions", "userPermissions")
      , ("albumContestResponsePublicPermissions", "publicPermissions")
      , ("albumContestResponseAlbum1", "album1")
      , ("albumContestResponseAlbum2", "album2")
      , ("albumContestResponseLatitude", "latitude")
      , ("albumContestResponseLongitude", "longitude")
      , ("albumContestResponseLocationDescription", "locationDescription")
      , ("albumContestResponseDistance", "distance")
      , ("albumContestResponseDateCreated", "dateCreated")
      , ("albumContestResponseDateUpdated", "dateUpdated")
      , ("albumContestResponseApprovalStatus", "approvalStatus")
      , ("albumContestResponseVoteCount", "voteCount")
      , ("albumContestResponseReturning", "returning")
      ]


-- | 
data AlbumFullResponse = AlbumFullResponse
  { albumFullResponseValid :: Maybe Bool -- ^ 
  , albumFullResponseMessage :: Maybe Text -- ^ 
  , albumFullResponseVersion :: Maybe Double -- ^ 
  , albumFullResponseSerializeNulls :: Maybe Bool -- ^ 
  , albumFullResponseStartTimeLog :: Maybe Integer -- ^ 
  , albumFullResponseErrorCode :: Maybe Text -- ^ 
  , albumFullResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , albumFullResponseAlbumId :: Maybe Integer -- ^ 
  , albumFullResponseAlbumType :: Maybe Text -- ^ 
  , albumFullResponseOwnerId :: Maybe Integer -- ^ 
  , albumFullResponseOwner :: Maybe AccountShortResponse -- ^ 
  , albumFullResponseTitle :: Maybe Text -- ^ 
  , albumFullResponseDescription :: Maybe Text -- ^ 
  , albumFullResponseCoverAsset :: Maybe AssetResponse -- ^ 
  , albumFullResponseTags :: Maybe Text -- ^ 
  , albumFullResponseVisibility :: Maybe Text -- ^ 
  , albumFullResponseStartDate :: Maybe Integer -- ^ 
  , albumFullResponseEndDate :: Maybe Integer -- ^ 
  , albumFullResponseAssetCount :: Maybe Int -- ^ 
  , albumFullResponseLikeCount :: Maybe Integer -- ^ 
  , albumFullResponseDislikeCount :: Maybe Integer -- ^ 
  , albumFullResponseCommentsCount :: Maybe Integer -- ^ 
  , albumFullResponseUserCount :: Maybe Int -- ^ 
  , albumFullResponseNotifications :: Maybe Bool -- ^ 
  , albumFullResponseLatitude :: Maybe Double -- ^ 
  , albumFullResponseLongitude :: Maybe Double -- ^ 
  , albumFullResponseLocationDescription :: Maybe Text -- ^ 
  , albumFullResponseDistance :: Maybe Double -- ^ 
  , albumFullResponseDateCreated :: Maybe Integer -- ^ 
  , albumFullResponseDateUpdated :: Maybe Integer -- ^ 
  , albumFullResponseCellPhone :: Maybe Text -- ^ 
  , albumFullResponseFullAddress :: Maybe Text -- ^ 
  , albumFullResponseApprovalStatus :: Maybe Text -- ^ 
  , albumFullResponseFavoriteCount :: Maybe Integer -- ^ 
  , albumFullResponseLiked :: Maybe Bool -- ^ 
  , albumFullResponseFavorite :: Maybe Bool -- ^ 
  , albumFullResponseFavoriteId :: Maybe Integer -- ^ 
  , albumFullResponseAnonymous :: Maybe Bool -- ^ 
  , albumFullResponseFlagCount :: Maybe Integer -- ^ 
  , albumFullResponseViewedCount :: Maybe Integer -- ^ 
  , albumFullResponseClickedCount :: Maybe Integer -- ^ 
  , albumFullResponseSharedCount :: Maybe Integer -- ^ 
  , albumFullResponseAssets :: Maybe [AssetResponse] -- ^ 
  , albumFullResponseComments :: Maybe [NoteFullResponse] -- ^ 
  , albumFullResponseLikes :: Maybe [LikeResponse] -- ^ 
  , albumFullResponseConnectionGroups :: Maybe [ConnectionGroupShortResponse] -- ^ 
  , albumFullResponseConnections :: Maybe [ConnectionResponse] -- ^ 
  , albumFullResponseHasLiked :: Maybe Bool -- ^ 
  , albumFullResponseHasDisliked :: Maybe Bool -- ^ 
  , albumFullResponseUserPermissions :: Maybe Permissions -- ^ 
  , albumFullResponsePublicPermissions :: Maybe Permissions -- ^ 
  , albumFullResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AlbumFullResponse where
  parseJSON = genericParseJSON optionsAlbumFullResponse
instance ToJSON AlbumFullResponse where
  toJSON = genericToJSON optionsAlbumFullResponse

optionsAlbumFullResponse :: Options
optionsAlbumFullResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("albumFullResponseValid", "valid")
      , ("albumFullResponseMessage", "message")
      , ("albumFullResponseVersion", "version")
      , ("albumFullResponseSerializeNulls", "serializeNulls")
      , ("albumFullResponseStartTimeLog", "startTimeLog")
      , ("albumFullResponseErrorCode", "errorCode")
      , ("albumFullResponseRequest", "request")
      , ("albumFullResponseAlbumId", "albumId")
      , ("albumFullResponseAlbumType", "albumType")
      , ("albumFullResponseOwnerId", "ownerId")
      , ("albumFullResponseOwner", "owner")
      , ("albumFullResponseTitle", "title")
      , ("albumFullResponseDescription", "description")
      , ("albumFullResponseCoverAsset", "coverAsset")
      , ("albumFullResponseTags", "tags")
      , ("albumFullResponseVisibility", "visibility")
      , ("albumFullResponseStartDate", "startDate")
      , ("albumFullResponseEndDate", "endDate")
      , ("albumFullResponseAssetCount", "assetCount")
      , ("albumFullResponseLikeCount", "likeCount")
      , ("albumFullResponseDislikeCount", "dislikeCount")
      , ("albumFullResponseCommentsCount", "commentsCount")
      , ("albumFullResponseUserCount", "userCount")
      , ("albumFullResponseNotifications", "notifications")
      , ("albumFullResponseLatitude", "latitude")
      , ("albumFullResponseLongitude", "longitude")
      , ("albumFullResponseLocationDescription", "locationDescription")
      , ("albumFullResponseDistance", "distance")
      , ("albumFullResponseDateCreated", "dateCreated")
      , ("albumFullResponseDateUpdated", "dateUpdated")
      , ("albumFullResponseCellPhone", "cellPhone")
      , ("albumFullResponseFullAddress", "fullAddress")
      , ("albumFullResponseApprovalStatus", "approvalStatus")
      , ("albumFullResponseFavoriteCount", "favoriteCount")
      , ("albumFullResponseLiked", "liked")
      , ("albumFullResponseFavorite", "favorite")
      , ("albumFullResponseFavoriteId", "favoriteId")
      , ("albumFullResponseAnonymous", "anonymous")
      , ("albumFullResponseFlagCount", "flagCount")
      , ("albumFullResponseViewedCount", "viewedCount")
      , ("albumFullResponseClickedCount", "clickedCount")
      , ("albumFullResponseSharedCount", "sharedCount")
      , ("albumFullResponseAssets", "assets")
      , ("albumFullResponseComments", "comments")
      , ("albumFullResponseLikes", "likes")
      , ("albumFullResponseConnectionGroups", "connectionGroups")
      , ("albumFullResponseConnections", "connections")
      , ("albumFullResponseHasLiked", "hasLiked")
      , ("albumFullResponseHasDisliked", "hasDisliked")
      , ("albumFullResponseUserPermissions", "userPermissions")
      , ("albumFullResponsePublicPermissions", "publicPermissions")
      , ("albumFullResponseReturning", "returning")
      ]


-- | 
data AlbumResponse = AlbumResponse
  { albumResponseValid :: Maybe Bool -- ^ 
  , albumResponseMessage :: Maybe Text -- ^ 
  , albumResponseVersion :: Maybe Double -- ^ 
  , albumResponseSerializeNulls :: Maybe Bool -- ^ 
  , albumResponseStartTimeLog :: Maybe Integer -- ^ 
  , albumResponseErrorCode :: Maybe Text -- ^ 
  , albumResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , albumResponseAlbumId :: Maybe Integer -- ^ 
  , albumResponseAlbumType :: Maybe Text -- ^ 
  , albumResponseOwnerId :: Maybe Integer -- ^ 
  , albumResponseOwner :: Maybe AccountShortResponse -- ^ 
  , albumResponseTitle :: Maybe Text -- ^ 
  , albumResponseDescription :: Maybe Text -- ^ 
  , albumResponseCoverAsset :: Maybe AssetResponse -- ^ 
  , albumResponseTags :: Maybe Text -- ^ 
  , albumResponseVisibility :: Maybe Text -- ^ 
  , albumResponseStartDate :: Maybe Integer -- ^ 
  , albumResponseEndDate :: Maybe Integer -- ^ 
  , albumResponseAssetCount :: Maybe Int -- ^ 
  , albumResponseLikeCount :: Maybe Integer -- ^ 
  , albumResponseDislikeCount :: Maybe Integer -- ^ 
  , albumResponseCommentsCount :: Maybe Integer -- ^ 
  , albumResponseUserCount :: Maybe Int -- ^ 
  , albumResponseNotifications :: Maybe Bool -- ^ 
  , albumResponseLatitude :: Maybe Double -- ^ 
  , albumResponseLongitude :: Maybe Double -- ^ 
  , albumResponseLocationDescription :: Maybe Text -- ^ 
  , albumResponseDistance :: Maybe Double -- ^ 
  , albumResponseDateCreated :: Maybe Integer -- ^ 
  , albumResponseDateUpdated :: Maybe Integer -- ^ 
  , albumResponseCellPhone :: Maybe Text -- ^ 
  , albumResponseFullAddress :: Maybe Text -- ^ 
  , albumResponseApprovalStatus :: Maybe Text -- ^ 
  , albumResponseFavoriteCount :: Maybe Integer -- ^ 
  , albumResponseLiked :: Maybe Bool -- ^ 
  , albumResponseFavorite :: Maybe Bool -- ^ 
  , albumResponseFavoriteId :: Maybe Integer -- ^ 
  , albumResponseAnonymous :: Maybe Bool -- ^ 
  , albumResponseFlagCount :: Maybe Integer -- ^ 
  , albumResponseViewedCount :: Maybe Integer -- ^ 
  , albumResponseClickedCount :: Maybe Integer -- ^ 
  , albumResponseSharedCount :: Maybe Integer -- ^ 
  , albumResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AlbumResponse where
  parseJSON = genericParseJSON optionsAlbumResponse
instance ToJSON AlbumResponse where
  toJSON = genericToJSON optionsAlbumResponse

optionsAlbumResponse :: Options
optionsAlbumResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("albumResponseValid", "valid")
      , ("albumResponseMessage", "message")
      , ("albumResponseVersion", "version")
      , ("albumResponseSerializeNulls", "serializeNulls")
      , ("albumResponseStartTimeLog", "startTimeLog")
      , ("albumResponseErrorCode", "errorCode")
      , ("albumResponseRequest", "request")
      , ("albumResponseAlbumId", "albumId")
      , ("albumResponseAlbumType", "albumType")
      , ("albumResponseOwnerId", "ownerId")
      , ("albumResponseOwner", "owner")
      , ("albumResponseTitle", "title")
      , ("albumResponseDescription", "description")
      , ("albumResponseCoverAsset", "coverAsset")
      , ("albumResponseTags", "tags")
      , ("albumResponseVisibility", "visibility")
      , ("albumResponseStartDate", "startDate")
      , ("albumResponseEndDate", "endDate")
      , ("albumResponseAssetCount", "assetCount")
      , ("albumResponseLikeCount", "likeCount")
      , ("albumResponseDislikeCount", "dislikeCount")
      , ("albumResponseCommentsCount", "commentsCount")
      , ("albumResponseUserCount", "userCount")
      , ("albumResponseNotifications", "notifications")
      , ("albumResponseLatitude", "latitude")
      , ("albumResponseLongitude", "longitude")
      , ("albumResponseLocationDescription", "locationDescription")
      , ("albumResponseDistance", "distance")
      , ("albumResponseDateCreated", "dateCreated")
      , ("albumResponseDateUpdated", "dateUpdated")
      , ("albumResponseCellPhone", "cellPhone")
      , ("albumResponseFullAddress", "fullAddress")
      , ("albumResponseApprovalStatus", "approvalStatus")
      , ("albumResponseFavoriteCount", "favoriteCount")
      , ("albumResponseLiked", "liked")
      , ("albumResponseFavorite", "favorite")
      , ("albumResponseFavoriteId", "favoriteId")
      , ("albumResponseAnonymous", "anonymous")
      , ("albumResponseFlagCount", "flagCount")
      , ("albumResponseViewedCount", "viewedCount")
      , ("albumResponseClickedCount", "clickedCount")
      , ("albumResponseSharedCount", "sharedCount")
      , ("albumResponseReturning", "returning")
      ]


-- | 
data AnswerResponse = AnswerResponse
  { answerResponseAnswerId :: Maybe Integer -- ^ 
  , answerResponseAnswer :: Maybe Text -- ^ 
  , answerResponseCorrect :: Maybe Bool -- ^ 
  , answerResponseImage :: Maybe AssetShortResponse -- ^ 
  , answerResponseVideoURL :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AnswerResponse where
  parseJSON = genericParseJSON optionsAnswerResponse
instance ToJSON AnswerResponse where
  toJSON = genericToJSON optionsAnswerResponse

optionsAnswerResponse :: Options
optionsAnswerResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("answerResponseAnswerId", "answerId")
      , ("answerResponseAnswer", "answer")
      , ("answerResponseCorrect", "correct")
      , ("answerResponseImage", "image")
      , ("answerResponseVideoURL", "videoURL")
      ]


-- | 
data AppInfoResponse = AppInfoResponse
  { appInfoResponsePoints :: Maybe Integer -- ^ 
  , appInfoResponseTicketsAvailable :: Maybe Integer -- ^ 
  , appInfoResponseTicketsEarned :: Maybe Integer -- ^ 
  , appInfoResponseTicketsPurchased :: Maybe Integer -- ^ 
  , appInfoResponseTicketsUsed :: Maybe Integer -- ^ 
  , appInfoResponseRank :: Maybe Text -- ^ 
  , appInfoResponseMaxPoints :: Maybe Integer -- ^ 
  , appInfoResponseMaxTickets :: Maybe Integer -- ^ 
  , appInfoResponsePointToTicketModifier :: Maybe Float -- ^ 
  , appInfoResponseScoringType :: Maybe Text -- ^ 
  , appInfoResponsePurchaseItemListResponse :: Maybe PurchaseItemListResponse -- ^ 
  , appInfoResponseTermsAcceptedDate :: Maybe Integer -- ^ 
  , appInfoResponseRequiresTermsAcceptance :: Maybe Bool -- ^ 
  , appInfoResponseCompletedAchievements :: Maybe [AchievementProgressResponse] -- ^ 
  , appInfoResponseWipAchievements :: Maybe [AchievementProgressResponse] -- ^ 
  , appInfoResponseAppBlob :: Maybe Text -- ^ 
  , appInfoResponseEnablePush :: Maybe Bool -- ^ 
  , appInfoResponseEnableSMS :: Maybe Bool -- ^ 
  , appInfoResponseEnableEmail :: Maybe Bool -- ^ 
  , appInfoResponseTicketCounts :: Maybe [TicketCountResponse] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AppInfoResponse where
  parseJSON = genericParseJSON optionsAppInfoResponse
instance ToJSON AppInfoResponse where
  toJSON = genericToJSON optionsAppInfoResponse

optionsAppInfoResponse :: Options
optionsAppInfoResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("appInfoResponsePoints", "points")
      , ("appInfoResponseTicketsAvailable", "ticketsAvailable")
      , ("appInfoResponseTicketsEarned", "ticketsEarned")
      , ("appInfoResponseTicketsPurchased", "ticketsPurchased")
      , ("appInfoResponseTicketsUsed", "ticketsUsed")
      , ("appInfoResponseRank", "rank")
      , ("appInfoResponseMaxPoints", "maxPoints")
      , ("appInfoResponseMaxTickets", "maxTickets")
      , ("appInfoResponsePointToTicketModifier", "pointToTicketModifier")
      , ("appInfoResponseScoringType", "scoringType")
      , ("appInfoResponsePurchaseItemListResponse", "purchaseItemListResponse")
      , ("appInfoResponseTermsAcceptedDate", "termsAcceptedDate")
      , ("appInfoResponseRequiresTermsAcceptance", "requiresTermsAcceptance")
      , ("appInfoResponseCompletedAchievements", "completedAchievements")
      , ("appInfoResponseWipAchievements", "wipAchievements")
      , ("appInfoResponseAppBlob", "appBlob")
      , ("appInfoResponseEnablePush", "enablePush")
      , ("appInfoResponseEnableSMS", "enableSMS")
      , ("appInfoResponseEnableEmail", "enableEmail")
      , ("appInfoResponseTicketCounts", "ticketCounts")
      ]


-- | 
data AppResponse = AppResponse
  { appResponseValid :: Maybe Bool -- ^ 
  , appResponseMessage :: Maybe Text -- ^ 
  , appResponseVersion :: Maybe Double -- ^ 
  , appResponseSerializeNulls :: Maybe Bool -- ^ 
  , appResponseStartTimeLog :: Maybe Integer -- ^ 
  , appResponseErrorCode :: Maybe Text -- ^ 
  , appResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , appResponseMissions :: Maybe MissionListResponse -- ^ 
  , appResponseProfile :: Maybe ProfileResponse -- ^ 
  , appResponseMessages :: Maybe MessageListResponse -- ^ 
  , appResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AppResponse where
  parseJSON = genericParseJSON optionsAppResponse
instance ToJSON AppResponse where
  toJSON = genericToJSON optionsAppResponse

optionsAppResponse :: Options
optionsAppResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("appResponseValid", "valid")
      , ("appResponseMessage", "message")
      , ("appResponseVersion", "version")
      , ("appResponseSerializeNulls", "serializeNulls")
      , ("appResponseStartTimeLog", "startTimeLog")
      , ("appResponseErrorCode", "errorCode")
      , ("appResponseRequest", "request")
      , ("appResponseMissions", "missions")
      , ("appResponseProfile", "profile")
      , ("appResponseMessages", "messages")
      , ("appResponseReturning", "returning")
      ]


-- | 
data AppVersion = AppVersion
  { appVersionMinorVersion :: Maybe Int -- ^ 
  , appVersionMajorVersion :: Maybe Int -- ^ 
  , appVersionVersionIndex :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AppVersion where
  parseJSON = genericParseJSON optionsAppVersion
instance ToJSON AppVersion where
  toJSON = genericToJSON optionsAppVersion

optionsAppVersion :: Options
optionsAppVersion =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("appVersionMinorVersion", "minorVersion")
      , ("appVersionMajorVersion", "majorVersion")
      , ("appVersionVersionIndex", "versionIndex")
      ]


-- | 
data Application = Application
  { applicationId :: Maybe Integer -- ^ 
  , applicationActive :: Maybe Bool -- ^ 
  , applicationValid :: Maybe Bool -- ^ 
  , applicationTitle :: Maybe Text -- ^ 
  , applicationAbout :: Maybe Text -- ^ 
  , applicationCertificateUrl :: Maybe Text -- ^ 
  , applicationCertificateName :: Maybe Text -- ^ 
  , applicationCertificate :: Maybe BlobFile -- ^ 
  , applicationCertificateLastUpdated :: Maybe UTCTime -- ^ 
  , applicationAppDescription :: Maybe Text -- ^ 
  , applicationShowInActivities :: Maybe Bool -- ^ 
  , applicationCssClass :: Maybe Text -- ^ 
  , applicationInviteWelcomeText :: Maybe Text -- ^ 
  , applicationBundleId :: Maybe Text -- ^ 
  , applicationAppType :: Maybe Text -- ^ 
  , applicationScoringType :: Maybe Text -- ^ 
  , applicationAppKey :: Maybe Text -- ^ 
  , applicationAppRestKey :: Maybe Text -- ^ 
  , applicationAppTokenKey :: Maybe Text -- ^ 
  , applicationHintCost :: Maybe Int -- ^ 
  , applicationEulaDate :: Maybe UTCTime -- ^ 
  , applicationEulaVersion :: Maybe Text -- ^ 
  , applicationLandingPageUrl :: Maybe Text -- ^ 
  , applicationInvitePageUrl :: Maybe Text -- ^ 
  , applicationDownloadUrls :: Maybe Text -- ^ 
  , applicationAppName :: Maybe Text -- ^ 
  , applicationAppIcon :: Maybe Asset -- ^ 
  , applicationAppLogo :: Maybe Asset -- ^ 
  , applicationBillableEntity :: Maybe BillableEntity -- ^ 
  , applicationFacebookAppId :: Maybe Text -- ^ 
  , applicationFacebookAppSecret :: Maybe Text -- ^ 
  , applicationTwitterAppId :: Maybe Text -- ^ 
  , applicationTwitterAppSecret :: Maybe Text -- ^ 
  , applicationTwitterCallbackURL :: Maybe Text -- ^ 
  , applicationDefaultImage :: Maybe Text -- ^ 
  , applicationModules :: Maybe Text -- ^ 
  , applicationAuthorizedServers :: Maybe Text -- ^ 
  , applicationAuthorizedCount :: Maybe Int -- ^ 
  , applicationActiveServers :: Maybe Text -- ^ 
  , applicationLicensePeriod :: Maybe UTCTime -- ^ 
  , applicationHasGameData :: Maybe Bool -- ^ 
  , applicationCurrentBuildVersion :: Maybe Text -- ^ 
  , applicationCurrentApiVersion :: Maybe Text -- ^ 
  , applicationGlobalTickets :: Maybe Bool -- ^ 
  , applicationTicketsPerPoint :: Maybe Float -- ^ 
  , applicationMaxPointsPerScore :: Maybe Int -- ^ 
  , applicationUseAppCache :: Maybe Bool -- ^ 
  , applicationUniqueUserTag :: Maybe Text -- ^ 
  , applicationUseMatchingAlgorithm :: Maybe Bool -- ^ 
  , applicationPlatforms :: Maybe [Platform] -- ^ 
  , applicationCategories :: Maybe [Category] -- ^ 
  , applicationPlacements :: Maybe [Placement] -- ^ 
  , applicationHasAdvertisements :: Maybe Bool -- ^ 
  , applicationAppleAppId :: Maybe Text -- ^ 
  , applicationGoogleAppId :: Maybe Text -- ^ 
  , applicationGoogleApiKey :: Maybe Text -- ^ 
  , applicationGoogleOAuthClientId :: Maybe Text -- ^ 
  , applicationGoogleOAuthSecret :: Maybe Text -- ^ 
  , applicationGoogleOAuthAccessToken :: Maybe Text -- ^ 
  , applicationGoogleOAuthRefreshToken :: Maybe Text -- ^ 
  , applicationBaiduApiKey :: Maybe Text -- ^ 
  , applicationBaiduSecretKey :: Maybe Text -- ^ 
  , applicationJpushAppKey :: Maybe Text -- ^ 
  , applicationJpushMasterSecret :: Maybe Text -- ^ 
  , applicationXgPushSecretKey :: Maybe Text -- ^ 
  , applicationPublicNotifications :: Maybe Bool -- ^ 
  , applicationUrlScheme :: Maybe Text -- ^ 
  , applicationRetailer :: Maybe Retailer -- ^ 
  , applicationObjectStoreSession :: Maybe Text -- ^ 
  , applicationPublicContentApproval :: Maybe Bool -- ^ 
  , applicationProductionMode :: Maybe Bool -- ^ 
  , applicationGriplyBaseUrl :: Maybe Text -- ^ 
  , applicationMinimumSessionLength :: Maybe Int -- ^ 
  , applicationSessionGapLength :: Maybe Int -- ^ 
  , applicationProcessSessionData :: Maybe Bool -- ^ 
  , applicationLocalAdsEnabled :: Maybe Bool -- ^ 
  , applicationIncludeInReport :: Maybe Bool -- ^ 
  , applicationSqootApiKey :: Maybe Text -- ^ 
  , applicationAmqpEnabled :: Maybe Bool -- ^ 
  , applicationTrilatSettings :: Maybe TrilatAppSettings -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Application where
  parseJSON = genericParseJSON optionsApplication
instance ToJSON Application where
  toJSON = genericToJSON optionsApplication

optionsApplication :: Options
optionsApplication =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("applicationId", "id")
      , ("applicationActive", "active")
      , ("applicationValid", "valid")
      , ("applicationTitle", "title")
      , ("applicationAbout", "about")
      , ("applicationCertificateUrl", "certificateUrl")
      , ("applicationCertificateName", "certificateName")
      , ("applicationCertificate", "certificate")
      , ("applicationCertificateLastUpdated", "certificateLastUpdated")
      , ("applicationAppDescription", "appDescription")
      , ("applicationShowInActivities", "showInActivities")
      , ("applicationCssClass", "cssClass")
      , ("applicationInviteWelcomeText", "inviteWelcomeText")
      , ("applicationBundleId", "bundleId")
      , ("applicationAppType", "appType")
      , ("applicationScoringType", "scoringType")
      , ("applicationAppKey", "appKey")
      , ("applicationAppRestKey", "appRestKey")
      , ("applicationAppTokenKey", "appTokenKey")
      , ("applicationHintCost", "hintCost")
      , ("applicationEulaDate", "eulaDate")
      , ("applicationEulaVersion", "eulaVersion")
      , ("applicationLandingPageUrl", "landingPageUrl")
      , ("applicationInvitePageUrl", "invitePageUrl")
      , ("applicationDownloadUrls", "downloadUrls")
      , ("applicationAppName", "appName")
      , ("applicationAppIcon", "appIcon")
      , ("applicationAppLogo", "appLogo")
      , ("applicationBillableEntity", "billableEntity")
      , ("applicationFacebookAppId", "facebookAppId")
      , ("applicationFacebookAppSecret", "facebookAppSecret")
      , ("applicationTwitterAppId", "twitterAppId")
      , ("applicationTwitterAppSecret", "twitterAppSecret")
      , ("applicationTwitterCallbackURL", "twitterCallbackURL")
      , ("applicationDefaultImage", "defaultImage")
      , ("applicationModules", "modules")
      , ("applicationAuthorizedServers", "authorizedServers")
      , ("applicationAuthorizedCount", "authorizedCount")
      , ("applicationActiveServers", "activeServers")
      , ("applicationLicensePeriod", "licensePeriod")
      , ("applicationHasGameData", "hasGameData")
      , ("applicationCurrentBuildVersion", "currentBuildVersion")
      , ("applicationCurrentApiVersion", "currentApiVersion")
      , ("applicationGlobalTickets", "globalTickets")
      , ("applicationTicketsPerPoint", "ticketsPerPoint")
      , ("applicationMaxPointsPerScore", "maxPointsPerScore")
      , ("applicationUseAppCache", "useAppCache")
      , ("applicationUniqueUserTag", "uniqueUserTag")
      , ("applicationUseMatchingAlgorithm", "useMatchingAlgorithm")
      , ("applicationPlatforms", "platforms")
      , ("applicationCategories", "categories")
      , ("applicationPlacements", "placements")
      , ("applicationHasAdvertisements", "hasAdvertisements")
      , ("applicationAppleAppId", "appleAppId")
      , ("applicationGoogleAppId", "googleAppId")
      , ("applicationGoogleApiKey", "googleApiKey")
      , ("applicationGoogleOAuthClientId", "googleOAuthClientId")
      , ("applicationGoogleOAuthSecret", "googleOAuthSecret")
      , ("applicationGoogleOAuthAccessToken", "googleOAuthAccessToken")
      , ("applicationGoogleOAuthRefreshToken", "googleOAuthRefreshToken")
      , ("applicationBaiduApiKey", "baiduApiKey")
      , ("applicationBaiduSecretKey", "baiduSecretKey")
      , ("applicationJpushAppKey", "jpushAppKey")
      , ("applicationJpushMasterSecret", "jpushMasterSecret")
      , ("applicationXgPushSecretKey", "xgPushSecretKey")
      , ("applicationPublicNotifications", "publicNotifications")
      , ("applicationUrlScheme", "urlScheme")
      , ("applicationRetailer", "retailer")
      , ("applicationObjectStoreSession", "objectStoreSession")
      , ("applicationPublicContentApproval", "publicContentApproval")
      , ("applicationProductionMode", "productionMode")
      , ("applicationGriplyBaseUrl", "griplyBaseUrl")
      , ("applicationMinimumSessionLength", "minimumSessionLength")
      , ("applicationSessionGapLength", "sessionGapLength")
      , ("applicationProcessSessionData", "processSessionData")
      , ("applicationLocalAdsEnabled", "localAdsEnabled")
      , ("applicationIncludeInReport", "includeInReport")
      , ("applicationSqootApiKey", "sqootApiKey")
      , ("applicationAmqpEnabled", "amqpEnabled")
      , ("applicationTrilatSettings", "trilatSettings")
      ]


-- | 
data ApplicationConfigResponse = ApplicationConfigResponse
  { applicationConfigResponseValid :: Maybe Bool -- ^ 
  , applicationConfigResponseMessage :: Maybe Text -- ^ 
  , applicationConfigResponseVersion :: Maybe Double -- ^ 
  , applicationConfigResponseSerializeNulls :: Maybe Bool -- ^ 
  , applicationConfigResponseStartTimeLog :: Maybe Integer -- ^ 
  , applicationConfigResponseErrorCode :: Maybe Text -- ^ 
  , applicationConfigResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , applicationConfigResponseConfigId :: Maybe Integer -- ^ 
  , applicationConfigResponseCreated :: Maybe Integer -- ^ 
  , applicationConfigResponseUpdated :: Maybe Integer -- ^ 
  , applicationConfigResponseConfigVersion :: Maybe Text -- ^ 
  , applicationConfigResponseConfigJson :: Maybe Text -- ^ 
  , applicationConfigResponseConfigJsonURL :: Maybe Text -- ^ 
  , applicationConfigResponseAssetId :: Maybe Integer -- ^ 
  , applicationConfigResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ApplicationConfigResponse where
  parseJSON = genericParseJSON optionsApplicationConfigResponse
instance ToJSON ApplicationConfigResponse where
  toJSON = genericToJSON optionsApplicationConfigResponse

optionsApplicationConfigResponse :: Options
optionsApplicationConfigResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("applicationConfigResponseValid", "valid")
      , ("applicationConfigResponseMessage", "message")
      , ("applicationConfigResponseVersion", "version")
      , ("applicationConfigResponseSerializeNulls", "serializeNulls")
      , ("applicationConfigResponseStartTimeLog", "startTimeLog")
      , ("applicationConfigResponseErrorCode", "errorCode")
      , ("applicationConfigResponseRequest", "request")
      , ("applicationConfigResponseConfigId", "configId")
      , ("applicationConfigResponseCreated", "created")
      , ("applicationConfigResponseUpdated", "updated")
      , ("applicationConfigResponseConfigVersion", "configVersion")
      , ("applicationConfigResponseConfigJson", "configJson")
      , ("applicationConfigResponseConfigJsonURL", "configJsonURL")
      , ("applicationConfigResponseAssetId", "assetId")
      , ("applicationConfigResponseReturning", "returning")
      ]


-- | 
data ApplicationMiniResponse = ApplicationMiniResponse
  { applicationMiniResponseValid :: Maybe Bool -- ^ 
  , applicationMiniResponseMessage :: Maybe Text -- ^ 
  , applicationMiniResponseVersion :: Maybe Double -- ^ 
  , applicationMiniResponseSerializeNulls :: Maybe Bool -- ^ 
  , applicationMiniResponseStartTimeLog :: Maybe Integer -- ^ 
  , applicationMiniResponseErrorCode :: Maybe Text -- ^ 
  , applicationMiniResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , applicationMiniResponseApplicationId :: Maybe Integer -- ^ 
  , applicationMiniResponseAppKey :: Maybe Text -- ^ 
  , applicationMiniResponseTitle :: Maybe Text -- ^ 
  , applicationMiniResponseCurrentBuildVersion :: Maybe Text -- ^ 
  , applicationMiniResponseCurrentApiVersion :: Maybe Text -- ^ 
  , applicationMiniResponseAppIcon :: Maybe AssetShortResponse -- ^ 
  , applicationMiniResponseAppLogo :: Maybe AssetShortResponse -- ^ 
  , applicationMiniResponseActive :: Maybe Bool -- ^ 
  , applicationMiniResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ApplicationMiniResponse where
  parseJSON = genericParseJSON optionsApplicationMiniResponse
instance ToJSON ApplicationMiniResponse where
  toJSON = genericToJSON optionsApplicationMiniResponse

optionsApplicationMiniResponse :: Options
optionsApplicationMiniResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("applicationMiniResponseValid", "valid")
      , ("applicationMiniResponseMessage", "message")
      , ("applicationMiniResponseVersion", "version")
      , ("applicationMiniResponseSerializeNulls", "serializeNulls")
      , ("applicationMiniResponseStartTimeLog", "startTimeLog")
      , ("applicationMiniResponseErrorCode", "errorCode")
      , ("applicationMiniResponseRequest", "request")
      , ("applicationMiniResponseApplicationId", "applicationId")
      , ("applicationMiniResponseAppKey", "appKey")
      , ("applicationMiniResponseTitle", "title")
      , ("applicationMiniResponseCurrentBuildVersion", "currentBuildVersion")
      , ("applicationMiniResponseCurrentApiVersion", "currentApiVersion")
      , ("applicationMiniResponseAppIcon", "appIcon")
      , ("applicationMiniResponseAppLogo", "appLogo")
      , ("applicationMiniResponseActive", "active")
      , ("applicationMiniResponseReturning", "returning")
      ]


-- | 
data ApplicationResponse = ApplicationResponse
  { applicationResponseValid :: Maybe Bool -- ^ 
  , applicationResponseMessage :: Maybe Text -- ^ 
  , applicationResponseVersion :: Maybe Double -- ^ 
  , applicationResponseSerializeNulls :: Maybe Bool -- ^ 
  , applicationResponseStartTimeLog :: Maybe Integer -- ^ 
  , applicationResponseErrorCode :: Maybe Text -- ^ 
  , applicationResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , applicationResponseApplicationId :: Maybe Integer -- ^ 
  , applicationResponseAppKey :: Maybe Text -- ^ 
  , applicationResponseTitle :: Maybe Text -- ^ 
  , applicationResponseCurrentBuildVersion :: Maybe Text -- ^ 
  , applicationResponseCurrentApiVersion :: Maybe Text -- ^ 
  , applicationResponseAppIcon :: Maybe AssetShortResponse -- ^ 
  , applicationResponseAppLogo :: Maybe AssetShortResponse -- ^ 
  , applicationResponseActive :: Maybe Bool -- ^ 
  , applicationResponseAbout :: Maybe Text -- ^ 
  , applicationResponseLandingPageUrl :: Maybe Text -- ^ 
  , applicationResponseLandingPageFullUrl :: Maybe Text -- ^ 
  , applicationResponseDefaultImageFullUrl :: Maybe Text -- ^ 
  , applicationResponseActivityDescription :: Maybe Text -- ^ 
  , applicationResponsePlatforms :: Maybe [PlatformResponse] -- ^ 
  , applicationResponseCategories :: Maybe [CategoryResponse] -- ^ 
  , applicationResponsePlacementCount :: Maybe Int -- ^ 
  , applicationResponseBillable :: Maybe BillableEntityShortResponse -- ^ 
  , applicationResponseHasAds :: Maybe Bool -- ^ 
  , applicationResponsePublicNotifications :: Maybe Bool -- ^ 
  , applicationResponseUrlScheme :: Maybe Text -- ^ 
  , applicationResponseGlobal :: Maybe Bool -- ^ 
  , applicationResponseDownloadUrls :: Maybe Text -- ^ 
  , applicationResponseLocalAdsEnabled :: Maybe Bool -- ^ 
  , applicationResponseTrilatSettings :: Maybe TrilatAppSettings -- ^ 
  , applicationResponseAppType :: Maybe Text -- ^ 
  , applicationResponseAppName :: Maybe Text -- ^ 
  , applicationResponseBundleId :: Maybe Text -- ^ 
  , applicationResponseScoringType :: Maybe Text -- ^ 
  , applicationResponseHintCost :: Maybe Int -- ^ 
  , applicationResponseMaxScore :: Maybe Int -- ^ 
  , applicationResponseTicketsPerPoint :: Maybe Float -- ^ 
  , applicationResponseHasGameData :: Maybe Bool -- ^ 
  , applicationResponseGlobalTickets :: Maybe Bool -- ^ 
  , applicationResponseEulaVersion :: Maybe Text -- ^ 
  , applicationResponseEulaDateUpdated :: Maybe Integer -- ^ 
  , applicationResponseModules :: Maybe Text -- ^ 
  , applicationResponseBillableEntityName :: Maybe Text -- ^ 
  , applicationResponseShowInActivities :: Maybe Bool -- ^ 
  , applicationResponseCssClass :: Maybe Text -- ^ 
  , applicationResponseInviteWelcomeText :: Maybe Text -- ^ 
  , applicationResponseInvitePageUrl :: Maybe Text -- ^ 
  , applicationResponseApnsCertificateFileName :: Maybe Text -- ^ 
  , applicationResponseFacebookAppId :: Maybe Text -- ^ 
  , applicationResponseFacebookAppSecret :: Maybe Text -- ^ 
  , applicationResponseAppToken :: Maybe Text -- ^ 
  , applicationResponseGoogleApiKey :: Maybe Text -- ^ 
  , applicationResponseAppRestKey :: Maybe Text -- ^ 
  , applicationResponsePublicContentApproval :: Maybe Bool -- ^ 
  , applicationResponseProductionMode :: Maybe Bool -- ^ 
  , applicationResponseMinimumSessionLength :: Maybe Int -- ^ 
  , applicationResponseSessionGapLength :: Maybe Int -- ^ 
  , applicationResponseSqootApiKey :: Maybe Text -- ^ 
  , applicationResponseAmqpEnabled :: Maybe Bool -- ^ 
  , applicationResponseAuthorizedCount :: Maybe Int -- ^ 
  , applicationResponseAuthorizedServers :: Maybe Text -- ^ 
  , applicationResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ApplicationResponse where
  parseJSON = genericParseJSON optionsApplicationResponse
instance ToJSON ApplicationResponse where
  toJSON = genericToJSON optionsApplicationResponse

optionsApplicationResponse :: Options
optionsApplicationResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("applicationResponseValid", "valid")
      , ("applicationResponseMessage", "message")
      , ("applicationResponseVersion", "version")
      , ("applicationResponseSerializeNulls", "serializeNulls")
      , ("applicationResponseStartTimeLog", "startTimeLog")
      , ("applicationResponseErrorCode", "errorCode")
      , ("applicationResponseRequest", "request")
      , ("applicationResponseApplicationId", "applicationId")
      , ("applicationResponseAppKey", "appKey")
      , ("applicationResponseTitle", "title")
      , ("applicationResponseCurrentBuildVersion", "currentBuildVersion")
      , ("applicationResponseCurrentApiVersion", "currentApiVersion")
      , ("applicationResponseAppIcon", "appIcon")
      , ("applicationResponseAppLogo", "appLogo")
      , ("applicationResponseActive", "active")
      , ("applicationResponseAbout", "about")
      , ("applicationResponseLandingPageUrl", "landingPageUrl")
      , ("applicationResponseLandingPageFullUrl", "landingPageFullUrl")
      , ("applicationResponseDefaultImageFullUrl", "defaultImageFullUrl")
      , ("applicationResponseActivityDescription", "activityDescription")
      , ("applicationResponsePlatforms", "platforms")
      , ("applicationResponseCategories", "categories")
      , ("applicationResponsePlacementCount", "placementCount")
      , ("applicationResponseBillable", "billable")
      , ("applicationResponseHasAds", "hasAds")
      , ("applicationResponsePublicNotifications", "publicNotifications")
      , ("applicationResponseUrlScheme", "urlScheme")
      , ("applicationResponseGlobal", "global")
      , ("applicationResponseDownloadUrls", "downloadUrls")
      , ("applicationResponseLocalAdsEnabled", "localAdsEnabled")
      , ("applicationResponseTrilatSettings", "trilatSettings")
      , ("applicationResponseAppType", "appType")
      , ("applicationResponseAppName", "appName")
      , ("applicationResponseBundleId", "bundleId")
      , ("applicationResponseScoringType", "scoringType")
      , ("applicationResponseHintCost", "hintCost")
      , ("applicationResponseMaxScore", "maxScore")
      , ("applicationResponseTicketsPerPoint", "ticketsPerPoint")
      , ("applicationResponseHasGameData", "hasGameData")
      , ("applicationResponseGlobalTickets", "globalTickets")
      , ("applicationResponseEulaVersion", "eulaVersion")
      , ("applicationResponseEulaDateUpdated", "eulaDateUpdated")
      , ("applicationResponseModules", "modules")
      , ("applicationResponseBillableEntityName", "billableEntityName")
      , ("applicationResponseShowInActivities", "showInActivities")
      , ("applicationResponseCssClass", "cssClass")
      , ("applicationResponseInviteWelcomeText", "inviteWelcomeText")
      , ("applicationResponseInvitePageUrl", "invitePageUrl")
      , ("applicationResponseApnsCertificateFileName", "apnsCertificateFileName")
      , ("applicationResponseFacebookAppId", "facebookAppId")
      , ("applicationResponseFacebookAppSecret", "facebookAppSecret")
      , ("applicationResponseAppToken", "appToken")
      , ("applicationResponseGoogleApiKey", "googleApiKey")
      , ("applicationResponseAppRestKey", "appRestKey")
      , ("applicationResponsePublicContentApproval", "publicContentApproval")
      , ("applicationResponseProductionMode", "productionMode")
      , ("applicationResponseMinimumSessionLength", "minimumSessionLength")
      , ("applicationResponseSessionGapLength", "sessionGapLength")
      , ("applicationResponseSqootApiKey", "sqootApiKey")
      , ("applicationResponseAmqpEnabled", "amqpEnabled")
      , ("applicationResponseAuthorizedCount", "authorizedCount")
      , ("applicationResponseAuthorizedServers", "authorizedServers")
      , ("applicationResponseReturning", "returning")
      ]


-- | 
data ApplicationSettingsResponse = ApplicationSettingsResponse
  { applicationSettingsResponseApplication :: Maybe ApplicationMiniResponse -- ^ 
  , applicationSettingsResponseTermsAcceptedDate :: Maybe Integer -- ^ 
  , applicationSettingsResponseUpdated :: Maybe Integer -- ^ 
  , applicationSettingsResponseCreated :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ApplicationSettingsResponse where
  parseJSON = genericParseJSON optionsApplicationSettingsResponse
instance ToJSON ApplicationSettingsResponse where
  toJSON = genericToJSON optionsApplicationSettingsResponse

optionsApplicationSettingsResponse :: Options
optionsApplicationSettingsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("applicationSettingsResponseApplication", "application")
      , ("applicationSettingsResponseTermsAcceptedDate", "termsAcceptedDate")
      , ("applicationSettingsResponseUpdated", "updated")
      , ("applicationSettingsResponseCreated", "created")
      ]


-- | 
data ApplicationShortResponse = ApplicationShortResponse
  { applicationShortResponseValid :: Maybe Bool -- ^ 
  , applicationShortResponseMessage :: Maybe Text -- ^ 
  , applicationShortResponseVersion :: Maybe Double -- ^ 
  , applicationShortResponseSerializeNulls :: Maybe Bool -- ^ 
  , applicationShortResponseStartTimeLog :: Maybe Integer -- ^ 
  , applicationShortResponseErrorCode :: Maybe Text -- ^ 
  , applicationShortResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , applicationShortResponseApplicationId :: Maybe Integer -- ^ 
  , applicationShortResponseAppKey :: Maybe Text -- ^ 
  , applicationShortResponseTitle :: Maybe Text -- ^ 
  , applicationShortResponseCurrentBuildVersion :: Maybe Text -- ^ 
  , applicationShortResponseCurrentApiVersion :: Maybe Text -- ^ 
  , applicationShortResponseAppIcon :: Maybe AssetShortResponse -- ^ 
  , applicationShortResponseAppLogo :: Maybe AssetShortResponse -- ^ 
  , applicationShortResponseActive :: Maybe Bool -- ^ 
  , applicationShortResponseAbout :: Maybe Text -- ^ 
  , applicationShortResponseLandingPageUrl :: Maybe Text -- ^ 
  , applicationShortResponseLandingPageFullUrl :: Maybe Text -- ^ 
  , applicationShortResponseDefaultImageFullUrl :: Maybe Text -- ^ 
  , applicationShortResponseActivityDescription :: Maybe Text -- ^ 
  , applicationShortResponsePlatforms :: Maybe [PlatformResponse] -- ^ 
  , applicationShortResponseCategories :: Maybe [CategoryResponse] -- ^ 
  , applicationShortResponsePlacementCount :: Maybe Int -- ^ 
  , applicationShortResponseBillable :: Maybe BillableEntityShortResponse -- ^ 
  , applicationShortResponseHasAds :: Maybe Bool -- ^ 
  , applicationShortResponsePublicNotifications :: Maybe Bool -- ^ 
  , applicationShortResponseUrlScheme :: Maybe Text -- ^ 
  , applicationShortResponseGlobal :: Maybe Bool -- ^ 
  , applicationShortResponseDownloadUrls :: Maybe Text -- ^ 
  , applicationShortResponseLocalAdsEnabled :: Maybe Bool -- ^ 
  , applicationShortResponseTrilatSettings :: Maybe TrilatAppSettings -- ^ 
  , applicationShortResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ApplicationShortResponse where
  parseJSON = genericParseJSON optionsApplicationShortResponse
instance ToJSON ApplicationShortResponse where
  toJSON = genericToJSON optionsApplicationShortResponse

optionsApplicationShortResponse :: Options
optionsApplicationShortResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("applicationShortResponseValid", "valid")
      , ("applicationShortResponseMessage", "message")
      , ("applicationShortResponseVersion", "version")
      , ("applicationShortResponseSerializeNulls", "serializeNulls")
      , ("applicationShortResponseStartTimeLog", "startTimeLog")
      , ("applicationShortResponseErrorCode", "errorCode")
      , ("applicationShortResponseRequest", "request")
      , ("applicationShortResponseApplicationId", "applicationId")
      , ("applicationShortResponseAppKey", "appKey")
      , ("applicationShortResponseTitle", "title")
      , ("applicationShortResponseCurrentBuildVersion", "currentBuildVersion")
      , ("applicationShortResponseCurrentApiVersion", "currentApiVersion")
      , ("applicationShortResponseAppIcon", "appIcon")
      , ("applicationShortResponseAppLogo", "appLogo")
      , ("applicationShortResponseActive", "active")
      , ("applicationShortResponseAbout", "about")
      , ("applicationShortResponseLandingPageUrl", "landingPageUrl")
      , ("applicationShortResponseLandingPageFullUrl", "landingPageFullUrl")
      , ("applicationShortResponseDefaultImageFullUrl", "defaultImageFullUrl")
      , ("applicationShortResponseActivityDescription", "activityDescription")
      , ("applicationShortResponsePlatforms", "platforms")
      , ("applicationShortResponseCategories", "categories")
      , ("applicationShortResponsePlacementCount", "placementCount")
      , ("applicationShortResponseBillable", "billable")
      , ("applicationShortResponseHasAds", "hasAds")
      , ("applicationShortResponsePublicNotifications", "publicNotifications")
      , ("applicationShortResponseUrlScheme", "urlScheme")
      , ("applicationShortResponseGlobal", "global")
      , ("applicationShortResponseDownloadUrls", "downloadUrls")
      , ("applicationShortResponseLocalAdsEnabled", "localAdsEnabled")
      , ("applicationShortResponseTrilatSettings", "trilatSettings")
      , ("applicationShortResponseReturning", "returning")
      ]


-- | 
data ApplicationUsageResponse = ApplicationUsageResponse
  { applicationUsageResponseBillableEntity :: Maybe BillableEntityResponse -- ^ 
  , applicationUsageResponseApplicationId :: Maybe Integer -- ^ 
  , applicationUsageResponseInvoiceDate :: Maybe UTCTime -- ^ 
  , applicationUsageResponseBalance :: Maybe Double -- ^ 
  , applicationUsageResponseTotalRequests :: Maybe Integer -- ^ 
  , applicationUsageResponseTotalDataStorage :: Maybe Integer -- ^ 
  , applicationUsageResponseTotalMediaStorage :: Maybe Integer -- ^ 
  , applicationUsageResponseTotalNotifications :: Maybe Integer -- ^ 
  , applicationUsageResponseMaxMissions :: Maybe Integer -- ^ 
  , applicationUsageResponseMaxVouchers :: Maybe Integer -- ^ 
  , applicationUsageResponseMaxCoupons :: Maybe Integer -- ^ 
  , applicationUsageResponseMaxProducts :: Maybe Integer -- ^ 
  , applicationUsageResponseMaxEvents :: Maybe Integer -- ^ 
  , applicationUsageResponseMaxMedia :: Maybe Integer -- ^ 
  , applicationUsageResponseMaxLocations :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ApplicationUsageResponse where
  parseJSON = genericParseJSON optionsApplicationUsageResponse
instance ToJSON ApplicationUsageResponse where
  toJSON = genericToJSON optionsApplicationUsageResponse

optionsApplicationUsageResponse :: Options
optionsApplicationUsageResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("applicationUsageResponseBillableEntity", "billableEntity")
      , ("applicationUsageResponseApplicationId", "applicationId")
      , ("applicationUsageResponseInvoiceDate", "invoiceDate")
      , ("applicationUsageResponseBalance", "balance")
      , ("applicationUsageResponseTotalRequests", "totalRequests")
      , ("applicationUsageResponseTotalDataStorage", "totalDataStorage")
      , ("applicationUsageResponseTotalMediaStorage", "totalMediaStorage")
      , ("applicationUsageResponseTotalNotifications", "totalNotifications")
      , ("applicationUsageResponseMaxMissions", "maxMissions")
      , ("applicationUsageResponseMaxVouchers", "maxVouchers")
      , ("applicationUsageResponseMaxCoupons", "maxCoupons")
      , ("applicationUsageResponseMaxProducts", "maxProducts")
      , ("applicationUsageResponseMaxEvents", "maxEvents")
      , ("applicationUsageResponseMaxMedia", "maxMedia")
      , ("applicationUsageResponseMaxLocations", "maxLocations")
      ]


-- | 
data Asset = Asset
  { assetId :: Maybe Integer -- ^ 
  , assetActive :: Maybe Bool -- ^ 
  , assetValid :: Maybe Bool -- ^ 
  , assetLatitude :: Maybe Double -- ^ 
  , assetLongitude :: Maybe Double -- ^ 
  , assetLocationDescription :: Maybe Text -- ^ 
  , assetPremigrationId :: Maybe Integer -- ^ 
  , assetNewOwnerId :: Maybe Integer -- ^ 
  , assetFolderUri :: Maybe Text -- ^ 
  , assetFileName :: Maybe Text -- ^ 
  , assetMediaType :: Maybe Text -- ^ 
  , assetMimeType :: Maybe Text -- ^ 
  , assetMetaData :: Maybe Text -- ^ 
  , assetCaption :: Maybe Text -- ^ 
  , assetVersionCode :: Maybe Int -- ^ 
  , assetVersionName :: Maybe Text -- ^ 
  , assetLikeCount :: Maybe Integer -- ^ 
  , assetDislikeCount :: Maybe Integer -- ^ 
  , assetNoteCount :: Maybe Integer -- ^ 
  , assetOwner :: Maybe Account -- ^ 
  , assetNotes :: Maybe [Note] -- ^ 
  , assetLikes :: Maybe [YayOrNay] -- ^ 
  , assetAttachedAssetId :: Maybe Integer -- ^ 
  , assetFlags :: Maybe [Flag] -- ^ 
  , assetFlagCount :: Maybe Integer -- ^ 
  , assetFlagThreshold :: Maybe FlagThreshold -- ^ 
  , assetDefaultAlbumType :: Maybe Text -- ^ 
  , assetAlbum :: Maybe Album -- ^ 
  , assetAssignment :: Maybe Assignment -- ^ 
  , assetApplication :: Maybe Application -- ^ 
  , assetDisplay :: Maybe Text -- ^ 
  , assetAppKey :: Maybe Text -- ^ 
  , assetBillableId :: Maybe Integer -- ^ 
  , assetSubType :: Maybe Text -- ^ 
  , assetContentName :: Maybe Text -- ^ 
  , assetUrifolder :: Maybe Text -- ^ 
  , assetDefaultThreshold :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Asset where
  parseJSON = genericParseJSON optionsAsset
instance ToJSON Asset where
  toJSON = genericToJSON optionsAsset

optionsAsset :: Options
optionsAsset =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("assetId", "id")
      , ("assetActive", "active")
      , ("assetValid", "valid")
      , ("assetLatitude", "latitude")
      , ("assetLongitude", "longitude")
      , ("assetLocationDescription", "locationDescription")
      , ("assetPremigrationId", "premigrationId")
      , ("assetNewOwnerId", "newOwnerId")
      , ("assetFolderUri", "folderUri")
      , ("assetFileName", "fileName")
      , ("assetMediaType", "mediaType")
      , ("assetMimeType", "mimeType")
      , ("assetMetaData", "metaData")
      , ("assetCaption", "caption")
      , ("assetVersionCode", "versionCode")
      , ("assetVersionName", "versionName")
      , ("assetLikeCount", "likeCount")
      , ("assetDislikeCount", "dislikeCount")
      , ("assetNoteCount", "noteCount")
      , ("assetOwner", "owner")
      , ("assetNotes", "notes")
      , ("assetLikes", "likes")
      , ("assetAttachedAssetId", "attachedAssetId")
      , ("assetFlags", "flags")
      , ("assetFlagCount", "flagCount")
      , ("assetFlagThreshold", "flagThreshold")
      , ("assetDefaultAlbumType", "defaultAlbumType")
      , ("assetAlbum", "album")
      , ("assetAssignment", "assignment")
      , ("assetApplication", "application")
      , ("assetDisplay", "display")
      , ("assetAppKey", "appKey")
      , ("assetBillableId", "billableId")
      , ("assetSubType", "subType")
      , ("assetContentName", "contentName")
      , ("assetUrifolder", "urifolder")
      , ("assetDefaultThreshold", "defaultThreshold")
      ]


-- | 
data AssetFullResponse = AssetFullResponse
  { assetFullResponseValid :: Maybe Bool -- ^ 
  , assetFullResponseMessage :: Maybe Text -- ^ 
  , assetFullResponseVersion :: Maybe Double -- ^ 
  , assetFullResponseSerializeNulls :: Maybe Bool -- ^ 
  , assetFullResponseStartTimeLog :: Maybe Integer -- ^ 
  , assetFullResponseErrorCode :: Maybe Text -- ^ 
  , assetFullResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , assetFullResponseAssetId :: Maybe Integer -- ^ 
  , assetFullResponseFileName :: Maybe Text -- ^ 
  , assetFullResponseCaption :: Maybe Text -- ^ 
  , assetFullResponseMediaType :: Maybe Text -- ^ 
  , assetFullResponseThumbnailURL :: Maybe Text -- ^ 
  , assetFullResponseCoverURL :: Maybe Text -- ^ 
  , assetFullResponseFullURL :: Maybe Text -- ^ 
  , assetFullResponseAssetVersion :: Maybe Text -- ^ 
  , assetFullResponseVersionName :: Maybe Text -- ^ 
  , assetFullResponseVersionCode :: Maybe Int -- ^ 
  , assetFullResponseDisplay :: Maybe Text -- ^ 
  , assetFullResponseLocationDescription :: Maybe Text -- ^ 
  , assetFullResponseUploader :: Maybe AccountShortResponse -- ^ 
  , assetFullResponseLikesCount :: Maybe Integer -- ^ 
  , assetFullResponseCommentsCount :: Maybe Int -- ^ 
  , assetFullResponseLatitude :: Maybe Double -- ^ 
  , assetFullResponseLongitude :: Maybe Double -- ^ 
  , assetFullResponseAttachedMediaType :: Maybe Text -- ^ 
  , assetFullResponseAttachedAssetURL :: Maybe Text -- ^ 
  , assetFullResponseCreated :: Maybe Integer -- ^ 
  , assetFullResponseUpdated :: Maybe Integer -- ^ 
  , assetFullResponseSearchTags :: Maybe Text -- ^ 
  , assetFullResponseMetaData :: Maybe Text -- ^ 
  , assetFullResponseComments :: Maybe [NoteFullResponse] -- ^ 
  , assetFullResponseLikes :: Maybe [LikeResponse] -- ^ 
  , assetFullResponseHasLiked :: Maybe Bool -- ^ 
  , assetFullResponseHasDisliked :: Maybe Bool -- ^ 
  , assetFullResponseMetFlagThreshold :: Maybe Bool -- ^ 
  , assetFullResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AssetFullResponse where
  parseJSON = genericParseJSON optionsAssetFullResponse
instance ToJSON AssetFullResponse where
  toJSON = genericToJSON optionsAssetFullResponse

optionsAssetFullResponse :: Options
optionsAssetFullResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("assetFullResponseValid", "valid")
      , ("assetFullResponseMessage", "message")
      , ("assetFullResponseVersion", "version")
      , ("assetFullResponseSerializeNulls", "serializeNulls")
      , ("assetFullResponseStartTimeLog", "startTimeLog")
      , ("assetFullResponseErrorCode", "errorCode")
      , ("assetFullResponseRequest", "request")
      , ("assetFullResponseAssetId", "assetId")
      , ("assetFullResponseFileName", "fileName")
      , ("assetFullResponseCaption", "caption")
      , ("assetFullResponseMediaType", "mediaType")
      , ("assetFullResponseThumbnailURL", "thumbnailURL")
      , ("assetFullResponseCoverURL", "coverURL")
      , ("assetFullResponseFullURL", "fullURL")
      , ("assetFullResponseAssetVersion", "assetVersion")
      , ("assetFullResponseVersionName", "versionName")
      , ("assetFullResponseVersionCode", "versionCode")
      , ("assetFullResponseDisplay", "display")
      , ("assetFullResponseLocationDescription", "locationDescription")
      , ("assetFullResponseUploader", "uploader")
      , ("assetFullResponseLikesCount", "likesCount")
      , ("assetFullResponseCommentsCount", "commentsCount")
      , ("assetFullResponseLatitude", "latitude")
      , ("assetFullResponseLongitude", "longitude")
      , ("assetFullResponseAttachedMediaType", "attachedMediaType")
      , ("assetFullResponseAttachedAssetURL", "attachedAssetURL")
      , ("assetFullResponseCreated", "created")
      , ("assetFullResponseUpdated", "updated")
      , ("assetFullResponseSearchTags", "searchTags")
      , ("assetFullResponseMetaData", "metaData")
      , ("assetFullResponseComments", "comments")
      , ("assetFullResponseLikes", "likes")
      , ("assetFullResponseHasLiked", "hasLiked")
      , ("assetFullResponseHasDisliked", "hasDisliked")
      , ("assetFullResponseMetFlagThreshold", "metFlagThreshold")
      , ("assetFullResponseReturning", "returning")
      ]


-- | 
data AssetListResponse = AssetListResponse
  { assetListResponseValid :: Maybe Bool -- ^ 
  , assetListResponseMessage :: Maybe Text -- ^ 
  , assetListResponseVersion :: Maybe Double -- ^ 
  , assetListResponseSerializeNulls :: Maybe Bool -- ^ 
  , assetListResponseStartTimeLog :: Maybe Integer -- ^ 
  , assetListResponseErrorCode :: Maybe Text -- ^ 
  , assetListResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , assetListResponseItems :: Maybe [AssetResponse] -- ^ 
  , assetListResponseHasMoreResults :: Maybe Bool -- ^ 
  , assetListResponseCount :: Maybe Int -- ^ 
  , assetListResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AssetListResponse where
  parseJSON = genericParseJSON optionsAssetListResponse
instance ToJSON AssetListResponse where
  toJSON = genericToJSON optionsAssetListResponse

optionsAssetListResponse :: Options
optionsAssetListResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("assetListResponseValid", "valid")
      , ("assetListResponseMessage", "message")
      , ("assetListResponseVersion", "version")
      , ("assetListResponseSerializeNulls", "serializeNulls")
      , ("assetListResponseStartTimeLog", "startTimeLog")
      , ("assetListResponseErrorCode", "errorCode")
      , ("assetListResponseRequest", "request")
      , ("assetListResponseItems", "items")
      , ("assetListResponseHasMoreResults", "hasMoreResults")
      , ("assetListResponseCount", "count")
      , ("assetListResponseReturning", "returning")
      ]


-- | 
data AssetResponse = AssetResponse
  { assetResponseValid :: Maybe Bool -- ^ 
  , assetResponseMessage :: Maybe Text -- ^ 
  , assetResponseVersion :: Maybe Double -- ^ 
  , assetResponseSerializeNulls :: Maybe Bool -- ^ 
  , assetResponseStartTimeLog :: Maybe Integer -- ^ 
  , assetResponseErrorCode :: Maybe Text -- ^ 
  , assetResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , assetResponseAssetId :: Maybe Integer -- ^ 
  , assetResponseFileName :: Maybe Text -- ^ 
  , assetResponseCaption :: Maybe Text -- ^ 
  , assetResponseMediaType :: Maybe Text -- ^ 
  , assetResponseThumbnailURL :: Maybe Text -- ^ 
  , assetResponseCoverURL :: Maybe Text -- ^ 
  , assetResponseFullURL :: Maybe Text -- ^ 
  , assetResponseAssetVersion :: Maybe Text -- ^ 
  , assetResponseVersionName :: Maybe Text -- ^ 
  , assetResponseVersionCode :: Maybe Int -- ^ 
  , assetResponseDisplay :: Maybe Text -- ^ 
  , assetResponseLocationDescription :: Maybe Text -- ^ 
  , assetResponseUploader :: Maybe AccountShortResponse -- ^ 
  , assetResponseLikesCount :: Maybe Integer -- ^ 
  , assetResponseCommentsCount :: Maybe Int -- ^ 
  , assetResponseLatitude :: Maybe Double -- ^ 
  , assetResponseLongitude :: Maybe Double -- ^ 
  , assetResponseAttachedMediaType :: Maybe Text -- ^ 
  , assetResponseAttachedAssetURL :: Maybe Text -- ^ 
  , assetResponseCreated :: Maybe Integer -- ^ 
  , assetResponseUpdated :: Maybe Integer -- ^ 
  , assetResponseSearchTags :: Maybe Text -- ^ 
  , assetResponseMetaData :: Maybe Text -- ^ 
  , assetResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AssetResponse where
  parseJSON = genericParseJSON optionsAssetResponse
instance ToJSON AssetResponse where
  toJSON = genericToJSON optionsAssetResponse

optionsAssetResponse :: Options
optionsAssetResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("assetResponseValid", "valid")
      , ("assetResponseMessage", "message")
      , ("assetResponseVersion", "version")
      , ("assetResponseSerializeNulls", "serializeNulls")
      , ("assetResponseStartTimeLog", "startTimeLog")
      , ("assetResponseErrorCode", "errorCode")
      , ("assetResponseRequest", "request")
      , ("assetResponseAssetId", "assetId")
      , ("assetResponseFileName", "fileName")
      , ("assetResponseCaption", "caption")
      , ("assetResponseMediaType", "mediaType")
      , ("assetResponseThumbnailURL", "thumbnailURL")
      , ("assetResponseCoverURL", "coverURL")
      , ("assetResponseFullURL", "fullURL")
      , ("assetResponseAssetVersion", "assetVersion")
      , ("assetResponseVersionName", "versionName")
      , ("assetResponseVersionCode", "versionCode")
      , ("assetResponseDisplay", "display")
      , ("assetResponseLocationDescription", "locationDescription")
      , ("assetResponseUploader", "uploader")
      , ("assetResponseLikesCount", "likesCount")
      , ("assetResponseCommentsCount", "commentsCount")
      , ("assetResponseLatitude", "latitude")
      , ("assetResponseLongitude", "longitude")
      , ("assetResponseAttachedMediaType", "attachedMediaType")
      , ("assetResponseAttachedAssetURL", "attachedAssetURL")
      , ("assetResponseCreated", "created")
      , ("assetResponseUpdated", "updated")
      , ("assetResponseSearchTags", "searchTags")
      , ("assetResponseMetaData", "metaData")
      , ("assetResponseReturning", "returning")
      ]


-- | 
data AssetShortResponse = AssetShortResponse
  { assetShortResponseValid :: Maybe Bool -- ^ 
  , assetShortResponseMessage :: Maybe Text -- ^ 
  , assetShortResponseVersion :: Maybe Double -- ^ 
  , assetShortResponseSerializeNulls :: Maybe Bool -- ^ 
  , assetShortResponseStartTimeLog :: Maybe Integer -- ^ 
  , assetShortResponseErrorCode :: Maybe Text -- ^ 
  , assetShortResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , assetShortResponseAssetId :: Maybe Integer -- ^ 
  , assetShortResponseFileName :: Maybe Text -- ^ 
  , assetShortResponseCaption :: Maybe Text -- ^ 
  , assetShortResponseMediaType :: Maybe Text -- ^ 
  , assetShortResponseThumbnailURL :: Maybe Text -- ^ 
  , assetShortResponseCoverURL :: Maybe Text -- ^ 
  , assetShortResponseFullURL :: Maybe Text -- ^ 
  , assetShortResponseAssetVersion :: Maybe Text -- ^ 
  , assetShortResponseVersionName :: Maybe Text -- ^ 
  , assetShortResponseVersionCode :: Maybe Int -- ^ 
  , assetShortResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AssetShortResponse where
  parseJSON = genericParseJSON optionsAssetShortResponse
instance ToJSON AssetShortResponse where
  toJSON = genericToJSON optionsAssetShortResponse

optionsAssetShortResponse :: Options
optionsAssetShortResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("assetShortResponseValid", "valid")
      , ("assetShortResponseMessage", "message")
      , ("assetShortResponseVersion", "version")
      , ("assetShortResponseSerializeNulls", "serializeNulls")
      , ("assetShortResponseStartTimeLog", "startTimeLog")
      , ("assetShortResponseErrorCode", "errorCode")
      , ("assetShortResponseRequest", "request")
      , ("assetShortResponseAssetId", "assetId")
      , ("assetShortResponseFileName", "fileName")
      , ("assetShortResponseCaption", "caption")
      , ("assetShortResponseMediaType", "mediaType")
      , ("assetShortResponseThumbnailURL", "thumbnailURL")
      , ("assetShortResponseCoverURL", "coverURL")
      , ("assetShortResponseFullURL", "fullURL")
      , ("assetShortResponseAssetVersion", "assetVersion")
      , ("assetShortResponseVersionName", "versionName")
      , ("assetShortResponseVersionCode", "versionCode")
      , ("assetShortResponseReturning", "returning")
      ]


-- | 
data Assignment = Assignment
  { assignmentId :: Maybe Integer -- ^ 
  , assignmentActive :: Maybe Bool -- ^ 
  , assignmentValid :: Maybe Bool -- ^ 
  , assignmentName :: Maybe Text -- ^ 
  , assignmentDescription :: Maybe Text -- ^ 
  , assignmentAssignee :: Maybe Account -- ^ 
  , assignmentRetailerLocation :: Maybe RetailerLocation -- ^ 
  , assignmentCreator :: Maybe Account -- ^ 
  , assignmentLastUpdatedBy :: Maybe Account -- ^ 
  , assignmentCurrentStatus :: Maybe AssignmentStatus -- ^ 
  , assignmentCurrentStatusType :: Maybe Text -- ^ 
  , assignmentAssets :: Maybe [Asset] -- ^ 
  , assignmentNotes :: Maybe [Note] -- ^ 
  , assignmentPublicPermissions :: Maybe Permissions -- ^ 
  , assignmentUserPermissions :: Maybe [UserPermissions] -- ^ 
  , assignmentVisibility :: Maybe Text -- ^ 
  , assignmentStatuses :: Maybe [AssignmentStatus] -- ^ 
  , assignmentApplication :: Maybe Application -- ^ 
  , assignmentApprovalStatus :: Maybe Text -- ^ 
  , assignmentContentName :: Maybe Text -- ^ 
  , assignmentContentAsset :: Maybe Asset -- ^ 
  , assignmentOwner :: Maybe Account -- ^ 
  , assignmentNoteCount :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Assignment where
  parseJSON = genericParseJSON optionsAssignment
instance ToJSON Assignment where
  toJSON = genericToJSON optionsAssignment

optionsAssignment :: Options
optionsAssignment =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("assignmentId", "id")
      , ("assignmentActive", "active")
      , ("assignmentValid", "valid")
      , ("assignmentName", "name")
      , ("assignmentDescription", "description")
      , ("assignmentAssignee", "assignee")
      , ("assignmentRetailerLocation", "retailerLocation")
      , ("assignmentCreator", "creator")
      , ("assignmentLastUpdatedBy", "lastUpdatedBy")
      , ("assignmentCurrentStatus", "currentStatus")
      , ("assignmentCurrentStatusType", "currentStatusType")
      , ("assignmentAssets", "assets")
      , ("assignmentNotes", "notes")
      , ("assignmentPublicPermissions", "publicPermissions")
      , ("assignmentUserPermissions", "userPermissions")
      , ("assignmentVisibility", "visibility")
      , ("assignmentStatuses", "statuses")
      , ("assignmentApplication", "application")
      , ("assignmentApprovalStatus", "approvalStatus")
      , ("assignmentContentName", "contentName")
      , ("assignmentContentAsset", "contentAsset")
      , ("assignmentOwner", "owner")
      , ("assignmentNoteCount", "noteCount")
      ]


-- | 
data AssignmentResponse = AssignmentResponse
  { assignmentResponseAssignmentId :: Maybe Integer -- ^ 
  , assignmentResponseName :: Maybe Text -- ^ 
  , assignmentResponseDescription :: Maybe Text -- ^ 
  , assignmentResponseActive :: Maybe Bool -- ^ 
  , assignmentResponseCreated :: Maybe Integer -- ^ 
  , assignmentResponseUpdated :: Maybe Integer -- ^ 
  , assignmentResponseAssignee :: Maybe AccountShortResponse -- ^ 
  , assignmentResponseCreator :: Maybe AccountShortResponse -- ^ 
  , assignmentResponseLastReportedBy :: Maybe AccountShortResponse -- ^ 
  , assignmentResponseLocation :: Maybe RetailerLocationShortResponse -- ^ 
  , assignmentResponseCurrentStatus :: Maybe AssignmentStatusResponse -- ^ 
  , assignmentResponseCurrentStatusType :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AssignmentResponse where
  parseJSON = genericParseJSON optionsAssignmentResponse
instance ToJSON AssignmentResponse where
  toJSON = genericToJSON optionsAssignmentResponse

optionsAssignmentResponse :: Options
optionsAssignmentResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("assignmentResponseAssignmentId", "assignmentId")
      , ("assignmentResponseName", "name")
      , ("assignmentResponseDescription", "description")
      , ("assignmentResponseActive", "active")
      , ("assignmentResponseCreated", "created")
      , ("assignmentResponseUpdated", "updated")
      , ("assignmentResponseAssignee", "assignee")
      , ("assignmentResponseCreator", "creator")
      , ("assignmentResponseLastReportedBy", "lastReportedBy")
      , ("assignmentResponseLocation", "location")
      , ("assignmentResponseCurrentStatus", "currentStatus")
      , ("assignmentResponseCurrentStatusType", "currentStatusType")
      ]


-- | 
data AssignmentStatus = AssignmentStatus
  { assignmentStatusId :: Maybe Integer -- ^ 
  , assignmentStatusActive :: Maybe Bool -- ^ 
  , assignmentStatusValid :: Maybe Bool -- ^ 
  , assignmentStatusAssignment :: Maybe Assignment -- ^ 
  , assignmentStatusCreator :: Maybe Account -- ^ 
  , assignmentStatusToDo :: Maybe Text -- ^ 
  , assignmentStatusConnection :: Maybe Text -- ^ 
  , assignmentStatusMethod :: Maybe Text -- ^ 
  , assignmentStatusStatus :: Maybe Text -- ^ 
  , assignmentStatusClosure :: Maybe Text -- ^ 
  , assignmentStatusMessage :: Maybe Text -- ^ 
  , assignmentStatusFollowUp :: Maybe UTCTime -- ^ 
  , assignmentStatusNotification :: Maybe ScheduledNotification -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AssignmentStatus where
  parseJSON = genericParseJSON optionsAssignmentStatus
instance ToJSON AssignmentStatus where
  toJSON = genericToJSON optionsAssignmentStatus

optionsAssignmentStatus :: Options
optionsAssignmentStatus =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("assignmentStatusId", "id")
      , ("assignmentStatusActive", "active")
      , ("assignmentStatusValid", "valid")
      , ("assignmentStatusAssignment", "assignment")
      , ("assignmentStatusCreator", "creator")
      , ("assignmentStatusToDo", "toDo")
      , ("assignmentStatusConnection", "connection")
      , ("assignmentStatusMethod", "method")
      , ("assignmentStatusStatus", "status")
      , ("assignmentStatusClosure", "closure")
      , ("assignmentStatusMessage", "message")
      , ("assignmentStatusFollowUp", "followUp")
      , ("assignmentStatusNotification", "notification")
      ]


-- | 
data AssignmentStatusResponse = AssignmentStatusResponse
  { assignmentStatusResponseAssignmentStatusId :: Maybe Integer -- ^ 
  , assignmentStatusResponseActive :: Maybe Bool -- ^ 
  , assignmentStatusResponseToDo :: Maybe Text -- ^ 
  , assignmentStatusResponseConnection :: Maybe Text -- ^ 
  , assignmentStatusResponseMethod :: Maybe Text -- ^ 
  , assignmentStatusResponseStatus :: Maybe Text -- ^ 
  , assignmentStatusResponseClosure :: Maybe Text -- ^ 
  , assignmentStatusResponseMessage :: Maybe Text -- ^ 
  , assignmentStatusResponseFollowUp :: Maybe Integer -- ^ 
  , assignmentStatusResponseCreated :: Maybe Integer -- ^ 
  , assignmentStatusResponseUpdated :: Maybe Integer -- ^ 
  , assignmentStatusResponseNotification :: Maybe ScheduledNotificationShortResponse -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AssignmentStatusResponse where
  parseJSON = genericParseJSON optionsAssignmentStatusResponse
instance ToJSON AssignmentStatusResponse where
  toJSON = genericToJSON optionsAssignmentStatusResponse

optionsAssignmentStatusResponse :: Options
optionsAssignmentStatusResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("assignmentStatusResponseAssignmentStatusId", "assignmentStatusId")
      , ("assignmentStatusResponseActive", "active")
      , ("assignmentStatusResponseToDo", "toDo")
      , ("assignmentStatusResponseConnection", "connection")
      , ("assignmentStatusResponseMethod", "method")
      , ("assignmentStatusResponseStatus", "status")
      , ("assignmentStatusResponseClosure", "closure")
      , ("assignmentStatusResponseMessage", "message")
      , ("assignmentStatusResponseFollowUp", "followUp")
      , ("assignmentStatusResponseCreated", "created")
      , ("assignmentStatusResponseUpdated", "updated")
      , ("assignmentStatusResponseNotification", "notification")
      ]


-- | 
data Audience = Audience
  { audienceId :: Maybe Integer -- ^ 
  , audienceActive :: Maybe Bool -- ^ 
  , audienceValid :: Maybe Bool -- ^ 
  , audienceLatitude :: Maybe Double -- ^ 
  , audienceLongitude :: Maybe Double -- ^ 
  , audienceLocationDescription :: Maybe Text -- ^ 
  , audienceName :: Maybe Text -- ^ 
  , audienceDisplay :: Maybe Bool -- ^ 
  , audienceDescription :: Maybe Text -- ^ 
  , audienceOwner :: Maybe Account -- ^ 
  , audienceGender :: Maybe Text -- ^ 
  , audienceAgeGroups :: Maybe [Text] -- ^ 
  , audienceGameExperienceLevel :: Maybe Text -- ^ 
  , audienceDeviceVersionRanges :: Maybe [AudienceDeviceVersionRange] -- ^ 
  , audienceCategories :: Maybe [Category] -- ^ 
  , audienceApplications :: Maybe [Application] -- ^ 
  , audienceRadius :: Maybe Double -- ^ 
  , audienceLocations :: Maybe [AudienceLocation] -- ^ 
  , audienceSendSuggestion :: Maybe Bool -- ^ 
  , audienceStartTimeOffset :: Maybe Int -- ^ 
  , audienceEndTimeOffset :: Maybe Int -- ^ 
  , audienceTarget :: Maybe AudienceTargetType -- ^ 
  , audienceAssociateContentName :: Maybe Text -- ^ 
  , audiencePolygon :: Maybe Text -- ^ 
  , audienceAssociateType :: Maybe Text -- ^ 
  , audienceAssociateId :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Audience where
  parseJSON = genericParseJSON optionsAudience
instance ToJSON Audience where
  toJSON = genericToJSON optionsAudience

optionsAudience :: Options
optionsAudience =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("audienceId", "id")
      , ("audienceActive", "active")
      , ("audienceValid", "valid")
      , ("audienceLatitude", "latitude")
      , ("audienceLongitude", "longitude")
      , ("audienceLocationDescription", "locationDescription")
      , ("audienceName", "name")
      , ("audienceDisplay", "display")
      , ("audienceDescription", "description")
      , ("audienceOwner", "owner")
      , ("audienceGender", "gender")
      , ("audienceAgeGroups", "ageGroups")
      , ("audienceGameExperienceLevel", "gameExperienceLevel")
      , ("audienceDeviceVersionRanges", "deviceVersionRanges")
      , ("audienceCategories", "categories")
      , ("audienceApplications", "applications")
      , ("audienceRadius", "radius")
      , ("audienceLocations", "locations")
      , ("audienceSendSuggestion", "sendSuggestion")
      , ("audienceStartTimeOffset", "startTimeOffset")
      , ("audienceEndTimeOffset", "endTimeOffset")
      , ("audienceTarget", "target")
      , ("audienceAssociateContentName", "associateContentName")
      , ("audiencePolygon", "polygon")
      , ("audienceAssociateType", "associateType")
      , ("audienceAssociateId", "associateId")
      ]


-- | 
data AudienceDevice = AudienceDevice
  { audienceDeviceId :: Maybe Integer -- ^ 
  , audienceDeviceActive :: Maybe Bool -- ^ 
  , audienceDeviceValid :: Maybe Bool -- ^ 
  , audienceDeviceName :: Maybe Text -- ^ 
  , audienceDeviceMinimum :: Maybe Integer -- ^ 
  , audienceDeviceMaximum :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AudienceDevice where
  parseJSON = genericParseJSON optionsAudienceDevice
instance ToJSON AudienceDevice where
  toJSON = genericToJSON optionsAudienceDevice

optionsAudienceDevice :: Options
optionsAudienceDevice =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("audienceDeviceId", "id")
      , ("audienceDeviceActive", "active")
      , ("audienceDeviceValid", "valid")
      , ("audienceDeviceName", "name")
      , ("audienceDeviceMinimum", "minimum")
      , ("audienceDeviceMaximum", "maximum")
      ]


-- | 
data AudienceDeviceResponse = AudienceDeviceResponse
  { audienceDeviceResponseDeviceId :: Maybe Integer -- ^ 
  , audienceDeviceResponseActive :: Maybe Bool -- ^ 
  , audienceDeviceResponseName :: Maybe Text -- ^ 
  , audienceDeviceResponseDisplay :: Maybe Text -- ^ 
  , audienceDeviceResponseMinimum :: Maybe Integer -- ^ 
  , audienceDeviceResponseMaximum :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AudienceDeviceResponse where
  parseJSON = genericParseJSON optionsAudienceDeviceResponse
instance ToJSON AudienceDeviceResponse where
  toJSON = genericToJSON optionsAudienceDeviceResponse

optionsAudienceDeviceResponse :: Options
optionsAudienceDeviceResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("audienceDeviceResponseDeviceId", "deviceId")
      , ("audienceDeviceResponseActive", "active")
      , ("audienceDeviceResponseName", "name")
      , ("audienceDeviceResponseDisplay", "display")
      , ("audienceDeviceResponseMinimum", "minimum")
      , ("audienceDeviceResponseMaximum", "maximum")
      ]


-- | 
data AudienceDeviceVersionRange = AudienceDeviceVersionRange
  { audienceDeviceVersionRangeId :: Maybe Integer -- ^ 
  , audienceDeviceVersionRangeActive :: Maybe Bool -- ^ 
  , audienceDeviceVersionRangeValid :: Maybe Bool -- ^ 
  , audienceDeviceVersionRangeDevice :: Maybe AudienceDevice -- ^ 
  , audienceDeviceVersionRangeMinimum :: Maybe Integer -- ^ 
  , audienceDeviceVersionRangeMaximum :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AudienceDeviceVersionRange where
  parseJSON = genericParseJSON optionsAudienceDeviceVersionRange
instance ToJSON AudienceDeviceVersionRange where
  toJSON = genericToJSON optionsAudienceDeviceVersionRange

optionsAudienceDeviceVersionRange :: Options
optionsAudienceDeviceVersionRange =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("audienceDeviceVersionRangeId", "id")
      , ("audienceDeviceVersionRangeActive", "active")
      , ("audienceDeviceVersionRangeValid", "valid")
      , ("audienceDeviceVersionRangeDevice", "device")
      , ("audienceDeviceVersionRangeMinimum", "minimum")
      , ("audienceDeviceVersionRangeMaximum", "maximum")
      ]


-- | 
data AudienceLocation = AudienceLocation
  { audienceLocationId :: Maybe Integer -- ^ 
  , audienceLocationActive :: Maybe Bool -- ^ 
  , audienceLocationValid :: Maybe Bool -- ^ 
  , audienceLocationLatitude :: Maybe Double -- ^ 
  , audienceLocationLongitude :: Maybe Double -- ^ 
  , audienceLocationLocationDescription :: Maybe Text -- ^ 
  , audienceLocationRadius :: Maybe Double -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AudienceLocation where
  parseJSON = genericParseJSON optionsAudienceLocation
instance ToJSON AudienceLocation where
  toJSON = genericToJSON optionsAudienceLocation

optionsAudienceLocation :: Options
optionsAudienceLocation =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("audienceLocationId", "id")
      , ("audienceLocationActive", "active")
      , ("audienceLocationValid", "valid")
      , ("audienceLocationLatitude", "latitude")
      , ("audienceLocationLongitude", "longitude")
      , ("audienceLocationLocationDescription", "locationDescription")
      , ("audienceLocationRadius", "radius")
      ]


-- | 
data AudienceResponse = AudienceResponse
  { audienceResponseId :: Maybe Integer -- ^ 
  , audienceResponseName :: Maybe Text -- ^ 
  , audienceResponseLatitude :: Maybe Double -- ^ 
  , audienceResponseLongitude :: Maybe Double -- ^ 
  , audienceResponseRadius :: Maybe Double -- ^ 
  , audienceResponseSendSuggestion :: Maybe Bool -- ^ 
  , audienceResponseDescription :: Maybe Text -- ^ 
  , audienceResponseActive :: Maybe Bool -- ^ 
  , audienceResponseSearchTags :: Maybe Text -- ^ 
  , audienceResponseOwnerId :: Maybe Integer -- ^ 
  , audienceResponseGender :: Maybe Text -- ^ 
  , audienceResponseAgeGroups :: Maybe [AgeGroupResponse] -- ^ 
  , audienceResponseCategories :: Maybe [CategoryResponse] -- ^ 
  , audienceResponseApplications :: Maybe [ApplicationShortResponse] -- ^ 
  , audienceResponseDevices :: Maybe [AudienceDeviceResponse] -- ^ 
  , audienceResponseGameExperienceLevel :: Maybe Text -- ^ 
  , audienceResponseLocations :: Maybe [GeocodeLatLngResponse] -- ^ 
  , audienceResponseAssociateType :: Maybe Text -- ^ 
  , audienceResponseAssociateId :: Maybe Integer -- ^ 
  , audienceResponseAssociateDescription :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AudienceResponse where
  parseJSON = genericParseJSON optionsAudienceResponse
instance ToJSON AudienceResponse where
  toJSON = genericToJSON optionsAudienceResponse

optionsAudienceResponse :: Options
optionsAudienceResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("audienceResponseId", "id")
      , ("audienceResponseName", "name")
      , ("audienceResponseLatitude", "latitude")
      , ("audienceResponseLongitude", "longitude")
      , ("audienceResponseRadius", "radius")
      , ("audienceResponseSendSuggestion", "sendSuggestion")
      , ("audienceResponseDescription", "description")
      , ("audienceResponseActive", "active")
      , ("audienceResponseSearchTags", "searchTags")
      , ("audienceResponseOwnerId", "ownerId")
      , ("audienceResponseGender", "gender")
      , ("audienceResponseAgeGroups", "ageGroups")
      , ("audienceResponseCategories", "categories")
      , ("audienceResponseApplications", "applications")
      , ("audienceResponseDevices", "devices")
      , ("audienceResponseGameExperienceLevel", "gameExperienceLevel")
      , ("audienceResponseLocations", "locations")
      , ("audienceResponseAssociateType", "associateType")
      , ("audienceResponseAssociateId", "associateId")
      , ("audienceResponseAssociateDescription", "associateDescription")
      ]


-- | 
data AudienceTargetType = AudienceTargetType
  { audienceTargetTypeTargetType :: Maybe Text -- ^ 
  , audienceTargetTypeTargetDescription :: Maybe Text -- ^ 
  , audienceTargetTypeRetailerLocation :: Maybe RetailerLocation -- ^ 
  , audienceTargetTypeOfferLocation :: Maybe OfferLocation -- ^ 
  , audienceTargetTypeAccount :: Maybe Account -- ^ 
  , audienceTargetTypeRegion :: Maybe Region -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AudienceTargetType where
  parseJSON = genericParseJSON optionsAudienceTargetType
instance ToJSON AudienceTargetType where
  toJSON = genericToJSON optionsAudienceTargetType

optionsAudienceTargetType :: Options
optionsAudienceTargetType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("audienceTargetTypeTargetType", "targetType")
      , ("audienceTargetTypeTargetDescription", "targetDescription")
      , ("audienceTargetTypeRetailerLocation", "retailerLocation")
      , ("audienceTargetTypeOfferLocation", "offerLocation")
      , ("audienceTargetTypeAccount", "account")
      , ("audienceTargetTypeRegion", "region")
      ]


-- | 
data AvailabilityResponse = AvailabilityResponse
  { availabilityResponseAvailabilityId :: Maybe Integer -- ^ 
  , availabilityResponseStartDate :: Maybe Integer -- ^ 
  , availabilityResponseEndDate :: Maybe Integer -- ^ 
  , availabilityResponseDayOfWeek :: Maybe Int -- ^ 
  , availabilityResponseStartTime :: Maybe Integer -- ^ 
  , availabilityResponseEndTime :: Maybe Integer -- ^ 
  , availabilityResponseTimeZone :: Maybe Text -- ^ 
  , availabilityResponseDeleted :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON AvailabilityResponse where
  parseJSON = genericParseJSON optionsAvailabilityResponse
instance ToJSON AvailabilityResponse where
  toJSON = genericToJSON optionsAvailabilityResponse

optionsAvailabilityResponse :: Options
optionsAvailabilityResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("availabilityResponseAvailabilityId", "availabilityId")
      , ("availabilityResponseStartDate", "startDate")
      , ("availabilityResponseEndDate", "endDate")
      , ("availabilityResponseDayOfWeek", "dayOfWeek")
      , ("availabilityResponseStartTime", "startTime")
      , ("availabilityResponseEndTime", "endTime")
      , ("availabilityResponseTimeZone", "timeZone")
      , ("availabilityResponseDeleted", "deleted")
      ]


-- | 
data BaseOfferResponse = BaseOfferResponse
  { baseOfferResponseTitle :: Maybe Text -- ^ 
  , baseOfferResponseDetails :: Maybe Text -- ^ 
  , baseOfferResponseSubTitle :: Maybe Text -- ^ 
  , baseOfferResponseActivated :: Maybe Integer -- ^ 
  , baseOfferResponseExpiration :: Maybe Integer -- ^ 
  , baseOfferResponseRedeemableStart :: Maybe Integer -- ^ 
  , baseOfferResponseRedeemableEnd :: Maybe Integer -- ^ 
  , baseOfferResponseOfferType :: Maybe Text -- ^ 
  , baseOfferResponseOfferVisibility :: Maybe Text -- ^ 
  , baseOfferResponseFavorite :: Maybe Bool -- ^ 
  , baseOfferResponseDeleted :: Maybe Integer -- ^ 
  , baseOfferResponseFullPrice :: Maybe Double -- ^ 
  , baseOfferResponseDiscountPrice :: Maybe Double -- ^ 
  , baseOfferResponseImage :: Maybe Text -- ^ 
  , baseOfferResponseImage1 :: Maybe Text -- ^ 
  , baseOfferResponseImage2 :: Maybe Text -- ^ 
  , baseOfferResponseImage3 :: Maybe Text -- ^ 
  , baseOfferResponseImage4 :: Maybe Text -- ^ 
  , baseOfferResponseImage5 :: Maybe Text -- ^ 
  , baseOfferResponseImages :: Maybe [AssetResponse] -- ^ 
  , baseOfferResponseBarcode :: Maybe Text -- ^ 
  , baseOfferResponseExternalUrl :: Maybe Text -- ^ 
  , baseOfferResponseActive :: Maybe Bool -- ^ 
  , baseOfferResponseSubDetails :: Maybe Text -- ^ 
  , baseOfferResponseExternalRedeemOptions :: Maybe Text -- ^ 
  , baseOfferResponsePublisher :: Maybe Text -- ^ 
  , baseOfferResponseViewedCount :: Maybe Int -- ^ 
  , baseOfferResponseClickedCount :: Maybe Int -- ^ 
  , baseOfferResponseAddedLimit :: Maybe Int -- ^ 
  , baseOfferResponseAddedCount :: Maybe Int -- ^ 
  , baseOfferResponseUsedCount :: Maybe Int -- ^ 
  , baseOfferResponseRemovedCount :: Maybe Int -- ^ 
  , baseOfferResponseTicketsReward :: Maybe Integer -- ^ 
  , baseOfferResponseTicketsRewardType :: Maybe Text -- ^ 
  , baseOfferResponseSpecialOfferType :: Maybe Text -- ^ 
  , baseOfferResponseLikeCount :: Maybe Integer -- ^ 
  , baseOfferResponseDislikeCount :: Maybe Integer -- ^ 
  , baseOfferResponseFavoriteCount :: Maybe Integer -- ^ 
  , baseOfferResponseNoteCount :: Maybe Integer -- ^ 
  , baseOfferResponseBillableEntityId :: Maybe Integer -- ^ 
  , baseOfferResponseResponsibleAccountId :: Maybe Integer -- ^ 
  , baseOfferResponseAvailabilitySummary :: Maybe Text -- ^ 
  , baseOfferResponseFlagCount :: Maybe Integer -- ^ 
  , baseOfferResponseFlagThreshold :: Maybe Integer -- ^ 
  , baseOfferResponseExternalId :: Maybe Text -- ^ 
  , baseOfferResponseParentOffer :: Maybe BaseOfferResponse -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON BaseOfferResponse where
  parseJSON = genericParseJSON optionsBaseOfferResponse
instance ToJSON BaseOfferResponse where
  toJSON = genericToJSON optionsBaseOfferResponse

optionsBaseOfferResponse :: Options
optionsBaseOfferResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("baseOfferResponseTitle", "title")
      , ("baseOfferResponseDetails", "details")
      , ("baseOfferResponseSubTitle", "subTitle")
      , ("baseOfferResponseActivated", "activated")
      , ("baseOfferResponseExpiration", "expiration")
      , ("baseOfferResponseRedeemableStart", "redeemableStart")
      , ("baseOfferResponseRedeemableEnd", "redeemableEnd")
      , ("baseOfferResponseOfferType", "offerType")
      , ("baseOfferResponseOfferVisibility", "offerVisibility")
      , ("baseOfferResponseFavorite", "favorite")
      , ("baseOfferResponseDeleted", "deleted")
      , ("baseOfferResponseFullPrice", "fullPrice")
      , ("baseOfferResponseDiscountPrice", "discountPrice")
      , ("baseOfferResponseImage", "image")
      , ("baseOfferResponseImage1", "image1")
      , ("baseOfferResponseImage2", "image2")
      , ("baseOfferResponseImage3", "image3")
      , ("baseOfferResponseImage4", "image4")
      , ("baseOfferResponseImage5", "image5")
      , ("baseOfferResponseImages", "images")
      , ("baseOfferResponseBarcode", "barcode")
      , ("baseOfferResponseExternalUrl", "externalUrl")
      , ("baseOfferResponseActive", "active")
      , ("baseOfferResponseSubDetails", "subDetails")
      , ("baseOfferResponseExternalRedeemOptions", "externalRedeemOptions")
      , ("baseOfferResponsePublisher", "publisher")
      , ("baseOfferResponseViewedCount", "viewedCount")
      , ("baseOfferResponseClickedCount", "clickedCount")
      , ("baseOfferResponseAddedLimit", "addedLimit")
      , ("baseOfferResponseAddedCount", "addedCount")
      , ("baseOfferResponseUsedCount", "usedCount")
      , ("baseOfferResponseRemovedCount", "removedCount")
      , ("baseOfferResponseTicketsReward", "ticketsReward")
      , ("baseOfferResponseTicketsRewardType", "ticketsRewardType")
      , ("baseOfferResponseSpecialOfferType", "specialOfferType")
      , ("baseOfferResponseLikeCount", "likeCount")
      , ("baseOfferResponseDislikeCount", "dislikeCount")
      , ("baseOfferResponseFavoriteCount", "favoriteCount")
      , ("baseOfferResponseNoteCount", "noteCount")
      , ("baseOfferResponseBillableEntityId", "billableEntityId")
      , ("baseOfferResponseResponsibleAccountId", "responsibleAccountId")
      , ("baseOfferResponseAvailabilitySummary", "availabilitySummary")
      , ("baseOfferResponseFlagCount", "flagCount")
      , ("baseOfferResponseFlagThreshold", "flagThreshold")
      , ("baseOfferResponseExternalId", "externalId")
      , ("baseOfferResponseParentOffer", "parentOffer")
      ]


-- | 
data BidResponse = BidResponse
  { bidResponseBidId :: Maybe Integer -- ^ 
  , bidResponseBiddableType :: Maybe Text -- ^ 
  , bidResponseBiddableId :: Maybe Integer -- ^ 
  , bidResponseAmountPerView :: Maybe Double -- ^ 
  , bidResponseAmountPerAction :: Maybe Double -- ^ 
  , bidResponseCurrentDailyBudget :: Maybe Double -- ^ 
  , bidResponseCurrentBudget :: Maybe Double -- ^ 
  , bidResponseCurrentBudgetExpiration :: Maybe Integer -- ^ 
  , bidResponseCurrentBudgetStart :: Maybe Integer -- ^ 
  , bidResponseBudgetAmount :: Maybe Double -- ^ 
  , bidResponseBudgetSchedule :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON BidResponse where
  parseJSON = genericParseJSON optionsBidResponse
instance ToJSON BidResponse where
  toJSON = genericToJSON optionsBidResponse

optionsBidResponse :: Options
optionsBidResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("bidResponseBidId", "bidId")
      , ("bidResponseBiddableType", "biddableType")
      , ("bidResponseBiddableId", "biddableId")
      , ("bidResponseAmountPerView", "amountPerView")
      , ("bidResponseAmountPerAction", "amountPerAction")
      , ("bidResponseCurrentDailyBudget", "currentDailyBudget")
      , ("bidResponseCurrentBudget", "currentBudget")
      , ("bidResponseCurrentBudgetExpiration", "currentBudgetExpiration")
      , ("bidResponseCurrentBudgetStart", "currentBudgetStart")
      , ("bidResponseBudgetAmount", "budgetAmount")
      , ("bidResponseBudgetSchedule", "budgetSchedule")
      ]


-- | 
data BillableEntity = BillableEntity
  { billableEntityId :: Maybe Integer -- ^ 
  , billableEntityActive :: Maybe Bool -- ^ 
  , billableEntityValid :: Maybe Bool -- ^ 
  , billableEntityName :: Maybe Text -- ^ 
  , billableEntityContactInfo :: Maybe ContactInfo -- ^ 
  , billableEntityResponsible :: Maybe Account -- ^ 
  , billableEntityRetailers :: Maybe [Retailer] -- ^ 
  , billableEntityManagers :: Maybe [Account] -- ^ 
  , billableEntityCategories :: Maybe [Category] -- ^ 
  , billableEntityFilters :: Maybe [Filter] -- ^ 
  , billableEntityMedia :: Maybe [Asset] -- ^ 
  , billableEntityMediaAlbum :: Maybe Album -- ^ 
  , billableEntitySubscription :: Maybe Subscription -- ^ 
  , billableEntityDisbursementIntrospect :: Maybe ThirdPartyNetwork -- ^ 
  , billableEntityAuthorizeNetTransactionKey :: Maybe Text -- ^ 
  , billableEntityAuthorizeNetApiKey :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON BillableEntity where
  parseJSON = genericParseJSON optionsBillableEntity
instance ToJSON BillableEntity where
  toJSON = genericToJSON optionsBillableEntity

optionsBillableEntity :: Options
optionsBillableEntity =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("billableEntityId", "id")
      , ("billableEntityActive", "active")
      , ("billableEntityValid", "valid")
      , ("billableEntityName", "name")
      , ("billableEntityContactInfo", "contactInfo")
      , ("billableEntityResponsible", "responsible")
      , ("billableEntityRetailers", "retailers")
      , ("billableEntityManagers", "managers")
      , ("billableEntityCategories", "categories")
      , ("billableEntityFilters", "filters")
      , ("billableEntityMedia", "media")
      , ("billableEntityMediaAlbum", "mediaAlbum")
      , ("billableEntitySubscription", "subscription")
      , ("billableEntityDisbursementIntrospect", "disbursementIntrospect")
      , ("billableEntityAuthorizeNetTransactionKey", "authorizeNetTransactionKey")
      , ("billableEntityAuthorizeNetApiKey", "authorizeNetApiKey")
      ]


-- | 
data BillableEntityResponse = BillableEntityResponse
  { billableEntityResponseBillableEntityId :: Maybe Integer -- ^ 
  , billableEntityResponseName :: Maybe Text -- ^ 
  , billableEntityResponseResponsible :: Maybe ProfileShortResponse -- ^ 
  , billableEntityResponseContact :: Maybe ContactInfoResponse -- ^ 
  , billableEntityResponseSubscription :: Maybe SubscriptionResponse -- ^ 
  , billableEntityResponsePayment :: Maybe PaymentTypesResponse -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON BillableEntityResponse where
  parseJSON = genericParseJSON optionsBillableEntityResponse
instance ToJSON BillableEntityResponse where
  toJSON = genericToJSON optionsBillableEntityResponse

optionsBillableEntityResponse :: Options
optionsBillableEntityResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("billableEntityResponseBillableEntityId", "billableEntityId")
      , ("billableEntityResponseName", "name")
      , ("billableEntityResponseResponsible", "responsible")
      , ("billableEntityResponseContact", "contact")
      , ("billableEntityResponseSubscription", "subscription")
      , ("billableEntityResponsePayment", "payment")
      ]


-- | 
data BillableEntityShortResponse = BillableEntityShortResponse
  { billableEntityShortResponseBillableEntityId :: Maybe Integer -- ^ 
  , billableEntityShortResponseName :: Maybe Text -- ^ 
  , billableEntityShortResponseResponsible :: Maybe ProfileShortResponse -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON BillableEntityShortResponse where
  parseJSON = genericParseJSON optionsBillableEntityShortResponse
instance ToJSON BillableEntityShortResponse where
  toJSON = genericToJSON optionsBillableEntityShortResponse

optionsBillableEntityShortResponse :: Options
optionsBillableEntityShortResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("billableEntityShortResponseBillableEntityId", "billableEntityId")
      , ("billableEntityShortResponseName", "name")
      , ("billableEntityShortResponseResponsible", "responsible")
      ]


-- | 
data BiometricImage = BiometricImage
  { biometricImagePosition :: Maybe Text -- ^ 
  , biometricImageData :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON BiometricImage where
  parseJSON = genericParseJSON optionsBiometricImage
instance ToJSON BiometricImage where
  toJSON = genericToJSON optionsBiometricImage

optionsBiometricImage :: Options
optionsBiometricImage =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("biometricImagePosition", "position")
      , ("biometricImageData", "data")
      ]


-- | 
data BiometricRequest = BiometricRequest
  { biometricRequestFace :: Maybe BiometricImage -- ^ 
  , biometricRequestFingerprints :: Maybe [FingerprintBiometricImage] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON BiometricRequest where
  parseJSON = genericParseJSON optionsBiometricRequest
instance ToJSON BiometricRequest where
  toJSON = genericToJSON optionsBiometricRequest

optionsBiometricRequest :: Options
optionsBiometricRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("biometricRequestFace", "face")
      , ("biometricRequestFingerprints", "fingerprints")
      ]


-- | 
data BlobFile = BlobFile
  { blobFileId :: Maybe Integer -- ^ 
  , blobFileActive :: Maybe Bool -- ^ 
  , blobFileValid :: Maybe Bool -- ^ 
  , blobFileOwner :: Maybe Account -- ^ 
  , blobFileApplication :: Maybe Application -- ^ 
  , blobFileFolderUri :: Maybe Text -- ^ 
  , blobFileFileName :: Maybe Text -- ^ 
  , blobFileFile :: Maybe [Text] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON BlobFile where
  parseJSON = genericParseJSON optionsBlobFile
instance ToJSON BlobFile where
  toJSON = genericToJSON optionsBlobFile

optionsBlobFile :: Options
optionsBlobFile =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("blobFileId", "id")
      , ("blobFileActive", "active")
      , ("blobFileValid", "valid")
      , ("blobFileOwner", "owner")
      , ("blobFileApplication", "application")
      , ("blobFileFolderUri", "folderUri")
      , ("blobFileFileName", "fileName")
      , ("blobFileFile", "file")
      ]


-- | 
data BlockedNotificationResponse = BlockedNotificationResponse
  { blockedNotificationResponseBlockedNotificationId :: Maybe Integer -- ^ 
  , blockedNotificationResponseCreated :: Maybe Integer -- ^ 
  , blockedNotificationResponseEvent :: Maybe Text -- ^ 
  , blockedNotificationResponseConduit :: Maybe Text -- ^ 
  , blockedNotificationResponseCustomType :: Maybe Text -- ^ 
  , blockedNotificationResponseContentType :: Maybe Text -- ^ 
  , blockedNotificationResponseContentId :: Maybe Integer -- ^ 
  , blockedNotificationResponseSearchTags :: Maybe Text -- ^ 
  , blockedNotificationResponseBlocked :: Maybe Bool -- ^ 
  , blockedNotificationResponseDeleted :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON BlockedNotificationResponse where
  parseJSON = genericParseJSON optionsBlockedNotificationResponse
instance ToJSON BlockedNotificationResponse where
  toJSON = genericToJSON optionsBlockedNotificationResponse

optionsBlockedNotificationResponse :: Options
optionsBlockedNotificationResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("blockedNotificationResponseBlockedNotificationId", "blockedNotificationId")
      , ("blockedNotificationResponseCreated", "created")
      , ("blockedNotificationResponseEvent", "event")
      , ("blockedNotificationResponseConduit", "conduit")
      , ("blockedNotificationResponseCustomType", "customType")
      , ("blockedNotificationResponseContentType", "contentType")
      , ("blockedNotificationResponseContentId", "contentId")
      , ("blockedNotificationResponseSearchTags", "searchTags")
      , ("blockedNotificationResponseBlocked", "blocked")
      , ("blockedNotificationResponseDeleted", "deleted")
      ]


-- | 
data Building = Building
  { buildingId :: Maybe Integer -- ^ 
  , buildingActive :: Maybe Bool -- ^ 
  , buildingValid :: Maybe Bool -- ^ 
  , buildingName :: Maybe Text -- ^ 
  , buildingBuildingType :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Building where
  parseJSON = genericParseJSON optionsBuilding
instance ToJSON Building where
  toJSON = genericToJSON optionsBuilding

optionsBuilding :: Options
optionsBuilding =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("buildingId", "id")
      , ("buildingActive", "active")
      , ("buildingValid", "valid")
      , ("buildingName", "name")
      , ("buildingBuildingType", "buildingType")
      ]


-- | 
data CargoType = CargoType
  { cargoTypeId :: Maybe Integer -- ^ 
  , cargoTypeActive :: Maybe Bool -- ^ 
  , cargoTypeValid :: Maybe Bool -- ^ 
  , cargoTypeBusiness :: Maybe Retailer -- ^ 
  , cargoTypeHub :: Maybe ServiceHub -- ^ 
  , cargoTypeName :: Maybe Text -- ^ 
  , cargoTypeWidth :: Maybe Double -- ^ 
  , cargoTypeHeight :: Maybe Double -- ^ 
  , cargoTypeDepth :: Maybe Double -- ^ 
  , cargoTypeVolume :: Maybe Double -- ^ 
  , cargoTypeWeight :: Maybe Double -- ^ 
  , cargoTypeLoadTime :: Maybe Integer -- ^ 
  , cargoTypePalletizable :: Maybe Bool -- ^ 
  , cargoTypePalletRatio :: Maybe Int -- ^ 
  , cargoTypeAdminOnly :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON CargoType where
  parseJSON = genericParseJSON optionsCargoType
instance ToJSON CargoType where
  toJSON = genericToJSON optionsCargoType

optionsCargoType :: Options
optionsCargoType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("cargoTypeId", "id")
      , ("cargoTypeActive", "active")
      , ("cargoTypeValid", "valid")
      , ("cargoTypeBusiness", "business")
      , ("cargoTypeHub", "hub")
      , ("cargoTypeName", "name")
      , ("cargoTypeWidth", "width")
      , ("cargoTypeHeight", "height")
      , ("cargoTypeDepth", "depth")
      , ("cargoTypeVolume", "volume")
      , ("cargoTypeWeight", "weight")
      , ("cargoTypeLoadTime", "loadTime")
      , ("cargoTypePalletizable", "palletizable")
      , ("cargoTypePalletRatio", "palletRatio")
      , ("cargoTypeAdminOnly", "adminOnly")
      ]


-- | 
data Category = Category
  { categoryId :: Maybe Integer -- ^ 
  , categoryActive :: Maybe Bool -- ^ 
  , categoryValid :: Maybe Bool -- ^ 
  , categoryName :: Maybe Text -- ^ 
  , categoryShortName :: Maybe Text -- ^ 
  , categoryDescription :: Maybe Text -- ^ 
  , categoryType :: Maybe Text -- ^ 
  , categoryApplication :: Maybe Application -- ^ 
  , categoryParent :: Maybe Category -- ^ 
  , categoryChildren :: Maybe [Category] -- ^ 
  , categoryChildrenCount :: Maybe Integer -- ^ 
  , categoryDisplay :: Maybe Text -- ^ 
  , categorySqootSlug :: Maybe Text -- ^ 
  , categoryAsset :: Maybe Asset -- ^ 
  , categoryExternalId :: Maybe Text -- ^ 
  , categoryExternalType :: Maybe Text -- ^ 
  , categoryFavoriteCount :: Maybe Integer -- ^ 
  , categoryRoot :: Maybe Category -- ^ 
  , categoryTree :: Maybe Text -- ^ 
  , categoryParentName :: Maybe Text -- ^ 
  , categoryParentId :: Maybe Integer -- ^ 
  , categoryApplicationId :: Maybe Integer -- ^ 
  , categorySecondaryType :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Category where
  parseJSON = genericParseJSON optionsCategory
instance ToJSON Category where
  toJSON = genericToJSON optionsCategory

optionsCategory :: Options
optionsCategory =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("categoryId", "id")
      , ("categoryActive", "active")
      , ("categoryValid", "valid")
      , ("categoryName", "name")
      , ("categoryShortName", "shortName")
      , ("categoryDescription", "description")
      , ("categoryType", "type")
      , ("categoryApplication", "application")
      , ("categoryParent", "parent")
      , ("categoryChildren", "children")
      , ("categoryChildrenCount", "childrenCount")
      , ("categoryDisplay", "display")
      , ("categorySqootSlug", "sqootSlug")
      , ("categoryAsset", "asset")
      , ("categoryExternalId", "externalId")
      , ("categoryExternalType", "externalType")
      , ("categoryFavoriteCount", "favoriteCount")
      , ("categoryRoot", "root")
      , ("categoryTree", "tree")
      , ("categoryParentName", "parentName")
      , ("categoryParentId", "parentId")
      , ("categoryApplicationId", "applicationId")
      , ("categorySecondaryType", "secondaryType")
      ]


-- | 
data CategoryResponse = CategoryResponse
  { categoryResponseCategoryId :: Maybe Integer -- ^ 
  , categoryResponseName :: Maybe Text -- ^ 
  , categoryResponseDisplay :: Maybe Text -- ^ 
  , categoryResponseSubCategoryCount :: Maybe Integer -- ^ 
  , categoryResponseParentId :: Maybe Integer -- ^ 
  , categoryResponseParentName :: Maybe Text -- ^ 
  , categoryResponseDescription :: Maybe Text -- ^ 
  , categoryResponseActive :: Maybe Bool -- ^ 
  , categoryResponseAsset :: Maybe AssetShortResponse -- ^ 
  , categoryResponseFavoriteId :: Maybe Integer -- ^ 
  , categoryResponseFavorite :: Maybe Bool -- ^ 
  , categoryResponseApplicationId :: Maybe Integer -- ^ 
  , categoryResponseType :: Maybe Text -- ^ 
  , categoryResponseExternalId :: Maybe Text -- ^ 
  , categoryResponseExternalType :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON CategoryResponse where
  parseJSON = genericParseJSON optionsCategoryResponse
instance ToJSON CategoryResponse where
  toJSON = genericToJSON optionsCategoryResponse

optionsCategoryResponse :: Options
optionsCategoryResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("categoryResponseCategoryId", "categoryId")
      , ("categoryResponseName", "name")
      , ("categoryResponseDisplay", "display")
      , ("categoryResponseSubCategoryCount", "subCategoryCount")
      , ("categoryResponseParentId", "parentId")
      , ("categoryResponseParentName", "parentName")
      , ("categoryResponseDescription", "description")
      , ("categoryResponseActive", "active")
      , ("categoryResponseAsset", "asset")
      , ("categoryResponseFavoriteId", "favoriteId")
      , ("categoryResponseFavorite", "favorite")
      , ("categoryResponseApplicationId", "applicationId")
      , ("categoryResponseType", "type")
      , ("categoryResponseExternalId", "externalId")
      , ("categoryResponseExternalType", "externalType")
      ]


-- | 
data CategoryTreeResponse = CategoryTreeResponse
  { categoryTreeResponseCategoryId :: Maybe Integer -- ^ 
  , categoryTreeResponseName :: Maybe Text -- ^ 
  , categoryTreeResponseDisplay :: Maybe Text -- ^ 
  , categoryTreeResponseSubCategoryCount :: Maybe Integer -- ^ 
  , categoryTreeResponseParentId :: Maybe Integer -- ^ 
  , categoryTreeResponseParentName :: Maybe Text -- ^ 
  , categoryTreeResponseDescription :: Maybe Text -- ^ 
  , categoryTreeResponseActive :: Maybe Bool -- ^ 
  , categoryTreeResponseAsset :: Maybe AssetShortResponse -- ^ 
  , categoryTreeResponseFavoriteId :: Maybe Integer -- ^ 
  , categoryTreeResponseFavorite :: Maybe Bool -- ^ 
  , categoryTreeResponseApplicationId :: Maybe Integer -- ^ 
  , categoryTreeResponseType :: Maybe Text -- ^ 
  , categoryTreeResponseExternalId :: Maybe Text -- ^ 
  , categoryTreeResponseExternalType :: Maybe Text -- ^ 
  , categoryTreeResponseChildren :: Maybe [CategoryTreeResponse] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON CategoryTreeResponse where
  parseJSON = genericParseJSON optionsCategoryTreeResponse
instance ToJSON CategoryTreeResponse where
  toJSON = genericToJSON optionsCategoryTreeResponse

optionsCategoryTreeResponse :: Options
optionsCategoryTreeResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("categoryTreeResponseCategoryId", "categoryId")
      , ("categoryTreeResponseName", "name")
      , ("categoryTreeResponseDisplay", "display")
      , ("categoryTreeResponseSubCategoryCount", "subCategoryCount")
      , ("categoryTreeResponseParentId", "parentId")
      , ("categoryTreeResponseParentName", "parentName")
      , ("categoryTreeResponseDescription", "description")
      , ("categoryTreeResponseActive", "active")
      , ("categoryTreeResponseAsset", "asset")
      , ("categoryTreeResponseFavoriteId", "favoriteId")
      , ("categoryTreeResponseFavorite", "favorite")
      , ("categoryTreeResponseApplicationId", "applicationId")
      , ("categoryTreeResponseType", "type")
      , ("categoryTreeResponseExternalId", "externalId")
      , ("categoryTreeResponseExternalType", "externalType")
      , ("categoryTreeResponseChildren", "children")
      ]


-- | 
data CellCarrier = CellCarrier
  { cellCarrierId :: Maybe Integer -- ^ 
  , cellCarrierActive :: Maybe Bool -- ^ 
  , cellCarrierValid :: Maybe Bool -- ^ 
  , cellCarrierUid :: Maybe Text -- ^ 
  , cellCarrierDisplay :: Maybe Text -- ^ 
  , cellCarrierEmailFormat :: Maybe Text -- ^ 
  , cellCarrierApiUrl :: Maybe Text -- ^ 
  , cellCarrierAuthUrl :: Maybe Text -- ^ 
  , cellCarrierShortCode :: Maybe Text -- ^ 
  , cellCarrierClientId :: Maybe Text -- ^ 
  , cellCarrierClientSecret :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON CellCarrier where
  parseJSON = genericParseJSON optionsCellCarrier
instance ToJSON CellCarrier where
  toJSON = genericToJSON optionsCellCarrier

optionsCellCarrier :: Options
optionsCellCarrier =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("cellCarrierId", "id")
      , ("cellCarrierActive", "active")
      , ("cellCarrierValid", "valid")
      , ("cellCarrierUid", "uid")
      , ("cellCarrierDisplay", "display")
      , ("cellCarrierEmailFormat", "emailFormat")
      , ("cellCarrierApiUrl", "apiUrl")
      , ("cellCarrierAuthUrl", "authUrl")
      , ("cellCarrierShortCode", "shortCode")
      , ("cellCarrierClientId", "clientId")
      , ("cellCarrierClientSecret", "clientSecret")
      ]


-- | 
data CellCarrierResponse = CellCarrierResponse
  { cellCarrierResponseId :: Maybe Integer -- ^ 
  , cellCarrierResponseUid :: Maybe Text -- ^ 
  , cellCarrierResponseDisplay :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON CellCarrierResponse where
  parseJSON = genericParseJSON optionsCellCarrierResponse
instance ToJSON CellCarrierResponse where
  toJSON = genericToJSON optionsCellCarrierResponse

optionsCellCarrierResponse :: Options
optionsCellCarrierResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("cellCarrierResponseId", "id")
      , ("cellCarrierResponseUid", "uid")
      , ("cellCarrierResponseDisplay", "display")
      ]


-- | 
data ChartData = ChartData
  { chartDataValid :: Maybe Bool -- ^ 
  , chartDataMessage :: Maybe Text -- ^ 
  , chartDataVersion :: Maybe Double -- ^ 
  , chartDataSerializeNulls :: Maybe Bool -- ^ 
  , chartDataStartTimeLog :: Maybe Integer -- ^ 
  , chartDataErrorCode :: Maybe Text -- ^ 
  , chartDataRequest :: Maybe [NameStringValueResponse] -- ^ 
  , chartDataIdentifier :: Maybe Text -- ^ 
  , chartDataIdAttribute :: Maybe Text -- ^ 
  , chartDataLabel :: Maybe Text -- ^ 
  , chartDataMaxValue :: Maybe Integer -- ^ 
  , chartDataTotalCount :: Maybe Integer -- ^ 
  , chartDataItems :: Maybe [Value] -- ^ 
  , chartDataAggregatedItems :: Maybe [Value] -- ^ 
  , chartDataCaption :: Maybe Text -- ^ 
  , chartDataShowAnchor :: Maybe Text -- ^ 
  , chartDataAnchorAlpha :: Maybe Text -- ^ 
  , chartDataGetxAxisName :: Maybe Text -- ^ 
  , chartDataGetyAxisMinValue :: Maybe Text -- ^ 
  , chartDataGetyAxisName :: Maybe Text -- ^ 
  , chartDataDecimalPrecision :: Maybe Text -- ^ 
  , chartDataFormatNumberScale :: Maybe Text -- ^ 
  , chartDataNumberPrefix :: Maybe Text -- ^ 
  , chartDataShowNames :: Maybe Text -- ^ 
  , chartDataShowValues :: Maybe Text -- ^ 
  , chartDataShowAlternateHGridColor :: Maybe Text -- ^ 
  , chartDataAlternateHGridColor :: Maybe Text -- ^ 
  , chartDataDivLineColor :: Maybe Text -- ^ 
  , chartDataDivLineAlpha :: Maybe Text -- ^ 
  , chartDataAlternateHGridAlpha :: Maybe Text -- ^ 
  , chartDataRotateNames :: Maybe Text -- ^ 
  , chartDataReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ChartData where
  parseJSON = genericParseJSON optionsChartData
instance ToJSON ChartData where
  toJSON = genericToJSON optionsChartData

optionsChartData :: Options
optionsChartData =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("chartDataValid", "valid")
      , ("chartDataMessage", "message")
      , ("chartDataVersion", "version")
      , ("chartDataSerializeNulls", "serializeNulls")
      , ("chartDataStartTimeLog", "startTimeLog")
      , ("chartDataErrorCode", "errorCode")
      , ("chartDataRequest", "request")
      , ("chartDataIdentifier", "identifier")
      , ("chartDataIdAttribute", "idAttribute")
      , ("chartDataLabel", "label")
      , ("chartDataMaxValue", "maxValue")
      , ("chartDataTotalCount", "totalCount")
      , ("chartDataItems", "items")
      , ("chartDataAggregatedItems", "aggregatedItems")
      , ("chartDataCaption", "caption")
      , ("chartDataShowAnchor", "showAnchor")
      , ("chartDataAnchorAlpha", "anchorAlpha")
      , ("chartDataGetxAxisName", "getxAxisName")
      , ("chartDataGetyAxisMinValue", "getyAxisMinValue")
      , ("chartDataGetyAxisName", "getyAxisName")
      , ("chartDataDecimalPrecision", "decimalPrecision")
      , ("chartDataFormatNumberScale", "formatNumberScale")
      , ("chartDataNumberPrefix", "numberPrefix")
      , ("chartDataShowNames", "showNames")
      , ("chartDataShowValues", "showValues")
      , ("chartDataShowAlternateHGridColor", "showAlternateHGridColor")
      , ("chartDataAlternateHGridColor", "alternateHGridColor")
      , ("chartDataDivLineColor", "divLineColor")
      , ("chartDataDivLineAlpha", "divLineAlpha")
      , ("chartDataAlternateHGridAlpha", "alternateHGridAlpha")
      , ("chartDataRotateNames", "rotateNames")
      , ("chartDataReturning", "returning")
      ]


-- | 
data Chronology = Chronology
  { chronologyZone :: Maybe DateTimeZone -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Chronology where
  parseJSON = genericParseJSON optionsChronology
instance ToJSON Chronology where
  toJSON = genericToJSON optionsChronology

optionsChronology :: Options
optionsChronology =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("chronologyZone", "zone")
      ]


-- | 
data ConfigRoutingRequest = ConfigRoutingRequest
  { configRoutingRequestDebugMode :: Maybe Bool -- ^ 
  , configRoutingRequestThreaded :: Maybe Bool -- ^ 
  , configRoutingRequestThreadType :: Maybe Text -- ^ 
  , configRoutingRequestMaxRuntime :: Maybe Integer -- ^ 
  , configRoutingRequestNumberOfMatches :: Maybe Int -- ^ 
  , configRoutingRequestMaxItineraryTime :: Maybe Int -- ^ 
  , configRoutingRequestMaxStopsPerVehicle :: Maybe Int -- ^ 
  , configRoutingRequestAverageCityTimePerMile :: Maybe Int -- ^ 
  , configRoutingRequestAverageFreewayTimePerMile :: Maybe Int -- ^ 
  , configRoutingRequestFreewayTravelDistance :: Maybe Float -- ^ 
  , configRoutingRequestSameStopBuffer :: Maybe Double -- ^ 
  , configRoutingRequestOrderAlgorithm :: Maybe Text -- ^ 
  , configRoutingRequestScoreAlgorithm :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ConfigRoutingRequest where
  parseJSON = genericParseJSON optionsConfigRoutingRequest
instance ToJSON ConfigRoutingRequest where
  toJSON = genericToJSON optionsConfigRoutingRequest

optionsConfigRoutingRequest :: Options
optionsConfigRoutingRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("configRoutingRequestDebugMode", "debugMode")
      , ("configRoutingRequestThreaded", "threaded")
      , ("configRoutingRequestThreadType", "threadType")
      , ("configRoutingRequestMaxRuntime", "maxRuntime")
      , ("configRoutingRequestNumberOfMatches", "numberOfMatches")
      , ("configRoutingRequestMaxItineraryTime", "maxItineraryTime")
      , ("configRoutingRequestMaxStopsPerVehicle", "maxStopsPerVehicle")
      , ("configRoutingRequestAverageCityTimePerMile", "averageCityTimePerMile")
      , ("configRoutingRequestAverageFreewayTimePerMile", "averageFreewayTimePerMile")
      , ("configRoutingRequestFreewayTravelDistance", "freewayTravelDistance")
      , ("configRoutingRequestSameStopBuffer", "sameStopBuffer")
      , ("configRoutingRequestOrderAlgorithm", "orderAlgorithm")
      , ("configRoutingRequestScoreAlgorithm", "scoreAlgorithm")
      ]


-- | 
data ConnectedFriend = ConnectedFriend
  { connectedFriendId :: Maybe Integer -- ^ 
  , connectedFriendActive :: Maybe Bool -- ^ 
  , connectedFriendValid :: Maybe Bool -- ^ 
  , connectedFriendDisplay :: Maybe Text -- ^ 
  , connectedFriendAvatar :: Maybe Asset -- ^ 
  , connectedFriendAvatarURL :: Maybe Text -- ^ 
  , connectedFriendPlatform :: Maybe Text -- ^ 
  , connectedFriendPlatformId :: Maybe Text -- ^ 
  , connectedFriendInvited :: Maybe Bool -- ^ 
  , connectedFriendLocationDescription :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ConnectedFriend where
  parseJSON = genericParseJSON optionsConnectedFriend
instance ToJSON ConnectedFriend where
  toJSON = genericToJSON optionsConnectedFriend

optionsConnectedFriend :: Options
optionsConnectedFriend =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("connectedFriendId", "id")
      , ("connectedFriendActive", "active")
      , ("connectedFriendValid", "valid")
      , ("connectedFriendDisplay", "display")
      , ("connectedFriendAvatar", "avatar")
      , ("connectedFriendAvatarURL", "avatarURL")
      , ("connectedFriendPlatform", "platform")
      , ("connectedFriendPlatformId", "platformId")
      , ("connectedFriendInvited", "invited")
      , ("connectedFriendLocationDescription", "locationDescription")
      ]


-- | 
data Connection = Connection
  { connectionId :: Maybe Integer -- ^ 
  , connectionCreated :: Maybe UTCTime -- ^ 
  , connectionUpdated :: Maybe UTCTime -- ^ 
  , connectionDeleted :: Maybe UTCTime -- ^ 
  , connectionObjectType :: Maybe Text -- ^ 
  , connectionLegacyId :: Maybe Text -- ^ 
  , connectionSearchTags :: Maybe Text -- ^ 
  , connectionActive :: Maybe Bool -- ^ 
  , connectionValid :: Maybe Bool -- ^ 
  , connectionAccount :: Maybe Account -- ^ 
  , connectionConnection :: Maybe Account -- ^ 
  , connectionPendingConnection :: Maybe ConnectedFriend -- ^ 
  , connectionFriend :: Maybe Bool -- ^ 
  , connectionFriendRequested :: Maybe Bool -- ^ 
  , connectionFriendRequestPending :: Maybe Bool -- ^ 
  , connectionFollowing :: Maybe Bool -- ^ 
  , connectionFollower :: Maybe Bool -- ^ 
  , connectionTrusted :: Maybe Bool -- ^ 
  , connectionBlocked :: Maybe Bool -- ^ 
  , connectionFriendRequestDate :: Maybe UTCTime -- ^ 
  , connectionFriendResponseDate :: Maybe UTCTime -- ^ 
  , connectionDisplay :: Maybe Text -- ^ 
  , connectionConnectionViewedDate :: Maybe UTCTime -- ^ 
  , connectionConnectionType :: Maybe Text -- ^ 
  , connectionTitle :: Maybe Text -- ^ 
  , connectionPendingConnectionUnderscoreid :: Maybe Integer -- ^ 
  , connectionLatitude :: Maybe Double -- ^ 
  , connectionLongitude :: Maybe Double -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Connection where
  parseJSON = genericParseJSON optionsConnection
instance ToJSON Connection where
  toJSON = genericToJSON optionsConnection

optionsConnection :: Options
optionsConnection =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("connectionId", "id")
      , ("connectionCreated", "created")
      , ("connectionUpdated", "updated")
      , ("connectionDeleted", "deleted")
      , ("connectionObjectType", "objectType")
      , ("connectionLegacyId", "legacyId")
      , ("connectionSearchTags", "searchTags")
      , ("connectionActive", "active")
      , ("connectionValid", "valid")
      , ("connectionAccount", "account")
      , ("connectionConnection", "connection")
      , ("connectionPendingConnection", "pendingConnection")
      , ("connectionFriend", "friend")
      , ("connectionFriendRequested", "friendRequested")
      , ("connectionFriendRequestPending", "friendRequestPending")
      , ("connectionFollowing", "following")
      , ("connectionFollower", "follower")
      , ("connectionTrusted", "trusted")
      , ("connectionBlocked", "blocked")
      , ("connectionFriendRequestDate", "friendRequestDate")
      , ("connectionFriendResponseDate", "friendResponseDate")
      , ("connectionDisplay", "display")
      , ("connectionConnectionViewedDate", "connectionViewedDate")
      , ("connectionConnectionType", "connectionType")
      , ("connectionTitle", "title")
      , ("connectionPendingConnectionUnderscoreid", "pendingConnection_id")
      , ("connectionLatitude", "latitude")
      , ("connectionLongitude", "longitude")
      ]


-- | 
data ConnectionGroup = ConnectionGroup
  { connectionGroupId :: Maybe Integer -- ^ 
  , connectionGroupActive :: Maybe Bool -- ^ 
  , connectionGroupValid :: Maybe Bool -- ^ 
  , connectionGroupOwner :: Maybe Account -- ^ 
  , connectionGroupName :: Maybe Text -- ^ 
  , connectionGroupDescription :: Maybe Text -- ^ 
  , connectionGroupConnections :: Maybe [Connection] -- ^ 
  , connectionGroupPermissions :: Maybe GroupPermissions -- ^ 
  , connectionGroupImage :: Maybe Asset -- ^ 
  , connectionGroupSubGroups :: Maybe [ConnectionGroup] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ConnectionGroup where
  parseJSON = genericParseJSON optionsConnectionGroup
instance ToJSON ConnectionGroup where
  toJSON = genericToJSON optionsConnectionGroup

optionsConnectionGroup :: Options
optionsConnectionGroup =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("connectionGroupId", "id")
      , ("connectionGroupActive", "active")
      , ("connectionGroupValid", "valid")
      , ("connectionGroupOwner", "owner")
      , ("connectionGroupName", "name")
      , ("connectionGroupDescription", "description")
      , ("connectionGroupConnections", "connections")
      , ("connectionGroupPermissions", "permissions")
      , ("connectionGroupImage", "image")
      , ("connectionGroupSubGroups", "subGroups")
      ]


-- | 
data ConnectionGroupResponse = ConnectionGroupResponse
  { connectionGroupResponseValid :: Maybe Bool -- ^ 
  , connectionGroupResponseMessage :: Maybe Text -- ^ 
  , connectionGroupResponseVersion :: Maybe Double -- ^ 
  , connectionGroupResponseSerializeNulls :: Maybe Bool -- ^ 
  , connectionGroupResponseStartTimeLog :: Maybe Integer -- ^ 
  , connectionGroupResponseErrorCode :: Maybe Text -- ^ 
  , connectionGroupResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , connectionGroupResponseConnectionGroupId :: Maybe Integer -- ^ 
  , connectionGroupResponseName :: Maybe Text -- ^ 
  , connectionGroupResponseGroupType :: Maybe Text -- ^ 
  , connectionGroupResponseThumbnailURL :: Maybe Text -- ^ 
  , connectionGroupResponseSubGroups :: Maybe [ConnectionGroupResponse] -- ^ 
  , connectionGroupResponseDescription :: Maybe Text -- ^ 
  , connectionGroupResponseActive :: Maybe Bool -- ^ 
  , connectionGroupResponseConnectionCount :: Maybe Int -- ^ 
  , connectionGroupResponseConnections :: Maybe [ConnectionResponse] -- ^ 
  , connectionGroupResponseGroupPermissions :: Maybe GroupPermissions -- ^ 
  , connectionGroupResponseOwnerId :: Maybe Integer -- ^ 
  , connectionGroupResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ConnectionGroupResponse where
  parseJSON = genericParseJSON optionsConnectionGroupResponse
instance ToJSON ConnectionGroupResponse where
  toJSON = genericToJSON optionsConnectionGroupResponse

optionsConnectionGroupResponse :: Options
optionsConnectionGroupResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("connectionGroupResponseValid", "valid")
      , ("connectionGroupResponseMessage", "message")
      , ("connectionGroupResponseVersion", "version")
      , ("connectionGroupResponseSerializeNulls", "serializeNulls")
      , ("connectionGroupResponseStartTimeLog", "startTimeLog")
      , ("connectionGroupResponseErrorCode", "errorCode")
      , ("connectionGroupResponseRequest", "request")
      , ("connectionGroupResponseConnectionGroupId", "connectionGroupId")
      , ("connectionGroupResponseName", "name")
      , ("connectionGroupResponseGroupType", "groupType")
      , ("connectionGroupResponseThumbnailURL", "thumbnailURL")
      , ("connectionGroupResponseSubGroups", "subGroups")
      , ("connectionGroupResponseDescription", "description")
      , ("connectionGroupResponseActive", "active")
      , ("connectionGroupResponseConnectionCount", "connectionCount")
      , ("connectionGroupResponseConnections", "connections")
      , ("connectionGroupResponseGroupPermissions", "groupPermissions")
      , ("connectionGroupResponseOwnerId", "ownerId")
      , ("connectionGroupResponseReturning", "returning")
      ]


-- | 
data ConnectionGroupShortResponse = ConnectionGroupShortResponse
  { connectionGroupShortResponseValid :: Maybe Bool -- ^ 
  , connectionGroupShortResponseMessage :: Maybe Text -- ^ 
  , connectionGroupShortResponseVersion :: Maybe Double -- ^ 
  , connectionGroupShortResponseSerializeNulls :: Maybe Bool -- ^ 
  , connectionGroupShortResponseStartTimeLog :: Maybe Integer -- ^ 
  , connectionGroupShortResponseErrorCode :: Maybe Text -- ^ 
  , connectionGroupShortResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , connectionGroupShortResponseConnectionGroupId :: Maybe Integer -- ^ 
  , connectionGroupShortResponseName :: Maybe Text -- ^ 
  , connectionGroupShortResponseGroupType :: Maybe Text -- ^ 
  , connectionGroupShortResponseThumbnailURL :: Maybe Text -- ^ 
  , connectionGroupShortResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ConnectionGroupShortResponse where
  parseJSON = genericParseJSON optionsConnectionGroupShortResponse
instance ToJSON ConnectionGroupShortResponse where
  toJSON = genericToJSON optionsConnectionGroupShortResponse

optionsConnectionGroupShortResponse :: Options
optionsConnectionGroupShortResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("connectionGroupShortResponseValid", "valid")
      , ("connectionGroupShortResponseMessage", "message")
      , ("connectionGroupShortResponseVersion", "version")
      , ("connectionGroupShortResponseSerializeNulls", "serializeNulls")
      , ("connectionGroupShortResponseStartTimeLog", "startTimeLog")
      , ("connectionGroupShortResponseErrorCode", "errorCode")
      , ("connectionGroupShortResponseRequest", "request")
      , ("connectionGroupShortResponseConnectionGroupId", "connectionGroupId")
      , ("connectionGroupShortResponseName", "name")
      , ("connectionGroupShortResponseGroupType", "groupType")
      , ("connectionGroupShortResponseThumbnailURL", "thumbnailURL")
      , ("connectionGroupShortResponseReturning", "returning")
      ]


-- | 
data ConnectionInfoResponse = ConnectionInfoResponse
  { connectionInfoResponseValid :: Maybe Bool -- ^ 
  , connectionInfoResponseMessage :: Maybe Text -- ^ 
  , connectionInfoResponseVersion :: Maybe Double -- ^ 
  , connectionInfoResponseSerializeNulls :: Maybe Bool -- ^ 
  , connectionInfoResponseStartTimeLog :: Maybe Integer -- ^ 
  , connectionInfoResponseErrorCode :: Maybe Text -- ^ 
  , connectionInfoResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , connectionInfoResponseGroups :: Maybe [ConnectionGroupResponse] -- ^ 
  , connectionInfoResponseFollowerCount :: Maybe Int -- ^ 
  , connectionInfoResponseFollowingCount :: Maybe Int -- ^ 
  , connectionInfoResponseFriendCount :: Maybe Int -- ^ 
  , connectionInfoResponsePrivateGroupCount :: Maybe Int -- ^ 
  , connectionInfoResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ConnectionInfoResponse where
  parseJSON = genericParseJSON optionsConnectionInfoResponse
instance ToJSON ConnectionInfoResponse where
  toJSON = genericToJSON optionsConnectionInfoResponse

optionsConnectionInfoResponse :: Options
optionsConnectionInfoResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("connectionInfoResponseValid", "valid")
      , ("connectionInfoResponseMessage", "message")
      , ("connectionInfoResponseVersion", "version")
      , ("connectionInfoResponseSerializeNulls", "serializeNulls")
      , ("connectionInfoResponseStartTimeLog", "startTimeLog")
      , ("connectionInfoResponseErrorCode", "errorCode")
      , ("connectionInfoResponseRequest", "request")
      , ("connectionInfoResponseGroups", "groups")
      , ("connectionInfoResponseFollowerCount", "followerCount")
      , ("connectionInfoResponseFollowingCount", "followingCount")
      , ("connectionInfoResponseFriendCount", "friendCount")
      , ("connectionInfoResponsePrivateGroupCount", "privateGroupCount")
      , ("connectionInfoResponseReturning", "returning")
      ]


-- | 
data ConnectionListResponse = ConnectionListResponse
  { connectionListResponseValid :: Maybe Bool -- ^ 
  , connectionListResponseMessage :: Maybe Text -- ^ 
  , connectionListResponseVersion :: Maybe Double -- ^ 
  , connectionListResponseSerializeNulls :: Maybe Bool -- ^ 
  , connectionListResponseStartTimeLog :: Maybe Integer -- ^ 
  , connectionListResponseErrorCode :: Maybe Text -- ^ 
  , connectionListResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , connectionListResponseConnections :: Maybe [ConnectionResponse] -- ^ 
  , connectionListResponseFriendCount :: Maybe Int -- ^ 
  , connectionListResponseFollowingCount :: Maybe Int -- ^ 
  , connectionListResponseItemCount :: Maybe Int -- ^ 
  , connectionListResponseHasMoreResults :: Maybe Bool -- ^ 
  , connectionListResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ConnectionListResponse where
  parseJSON = genericParseJSON optionsConnectionListResponse
instance ToJSON ConnectionListResponse where
  toJSON = genericToJSON optionsConnectionListResponse

optionsConnectionListResponse :: Options
optionsConnectionListResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("connectionListResponseValid", "valid")
      , ("connectionListResponseMessage", "message")
      , ("connectionListResponseVersion", "version")
      , ("connectionListResponseSerializeNulls", "serializeNulls")
      , ("connectionListResponseStartTimeLog", "startTimeLog")
      , ("connectionListResponseErrorCode", "errorCode")
      , ("connectionListResponseRequest", "request")
      , ("connectionListResponseConnections", "connections")
      , ("connectionListResponseFriendCount", "friendCount")
      , ("connectionListResponseFollowingCount", "followingCount")
      , ("connectionListResponseItemCount", "itemCount")
      , ("connectionListResponseHasMoreResults", "hasMoreResults")
      , ("connectionListResponseReturning", "returning")
      ]


-- | 
data ConnectionResponse = ConnectionResponse
  { connectionResponseConnectionId :: Maybe Integer -- ^ 
  , connectionResponseConnectionAccountId :: Maybe Text -- ^ 
  , connectionResponseConnectionPendingId :: Maybe Text -- ^ 
  , connectionResponseDisplay :: Maybe Text -- ^ 
  , connectionResponseLocationDisplay :: Maybe Text -- ^ 
  , connectionResponseConnectionViewedDate :: Maybe Integer -- ^ 
  , connectionResponseProfileImage :: Maybe Text -- ^ 
  , connectionResponseTitle :: Maybe Text -- ^ 
  , connectionResponseConnectionAccountType :: Maybe Text -- ^ 
  , connectionResponseTrusted :: Maybe Bool -- ^ 
  , connectionResponseFollowing :: Maybe Bool -- ^ 
  , connectionResponseFriendRequested :: Maybe Bool -- ^ 
  , connectionResponseFriendRequestPending :: Maybe Bool -- ^ 
  , connectionResponseBlocked :: Maybe Bool -- ^ 
  , connectionResponseFriend :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ConnectionResponse where
  parseJSON = genericParseJSON optionsConnectionResponse
instance ToJSON ConnectionResponse where
  toJSON = genericToJSON optionsConnectionResponse

optionsConnectionResponse :: Options
optionsConnectionResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("connectionResponseConnectionId", "connectionId")
      , ("connectionResponseConnectionAccountId", "connectionAccountId")
      , ("connectionResponseConnectionPendingId", "connectionPendingId")
      , ("connectionResponseDisplay", "display")
      , ("connectionResponseLocationDisplay", "locationDisplay")
      , ("connectionResponseConnectionViewedDate", "connectionViewedDate")
      , ("connectionResponseProfileImage", "profileImage")
      , ("connectionResponseTitle", "title")
      , ("connectionResponseConnectionAccountType", "connectionAccountType")
      , ("connectionResponseTrusted", "trusted")
      , ("connectionResponseFollowing", "following")
      , ("connectionResponseFriendRequested", "friendRequested")
      , ("connectionResponseFriendRequestPending", "friendRequestPending")
      , ("connectionResponseBlocked", "blocked")
      , ("connectionResponseFriend", "friend")
      ]


-- | 
data ConsumerInviteResponse = ConsumerInviteResponse
  { consumerInviteResponseValid :: Maybe Bool -- ^ 
  , consumerInviteResponseMessage :: Maybe Text -- ^ 
  , consumerInviteResponseVersion :: Maybe Double -- ^ 
  , consumerInviteResponseSerializeNulls :: Maybe Bool -- ^ 
  , consumerInviteResponseStartTimeLog :: Maybe Integer -- ^ 
  , consumerInviteResponseErrorCode :: Maybe Text -- ^ 
  , consumerInviteResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , consumerInviteResponseInviterId :: Maybe Integer -- ^ 
  , consumerInviteResponseInviter :: Maybe AccountShortResponse -- ^ 
  , consumerInviteResponseConnection :: Maybe ConnectionResponse -- ^ 
  , consumerInviteResponseInviteText :: Maybe Text -- ^ 
  , consumerInviteResponseToken :: Maybe Text -- ^ 
  , consumerInviteResponseAlbumCoverUrl :: Maybe Text -- ^ 
  , consumerInviteResponseAlbumTitle :: Maybe Text -- ^ 
  , consumerInviteResponseAppName :: Maybe Text -- ^ 
  , consumerInviteResponseWelcomeText :: Maybe Text -- ^ 
  , consumerInviteResponseApplication :: Maybe ApplicationShortResponse -- ^ 
  , consumerInviteResponseRetailerLocation :: Maybe RetailerLocationResponse -- ^ 
  , consumerInviteResponseOffer :: Maybe OfferShortResponse -- ^ 
  , consumerInviteResponseAlbum :: Maybe AlbumResponse -- ^ 
  , consumerInviteResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ConsumerInviteResponse where
  parseJSON = genericParseJSON optionsConsumerInviteResponse
instance ToJSON ConsumerInviteResponse where
  toJSON = genericToJSON optionsConsumerInviteResponse

optionsConsumerInviteResponse :: Options
optionsConsumerInviteResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("consumerInviteResponseValid", "valid")
      , ("consumerInviteResponseMessage", "message")
      , ("consumerInviteResponseVersion", "version")
      , ("consumerInviteResponseSerializeNulls", "serializeNulls")
      , ("consumerInviteResponseStartTimeLog", "startTimeLog")
      , ("consumerInviteResponseErrorCode", "errorCode")
      , ("consumerInviteResponseRequest", "request")
      , ("consumerInviteResponseInviterId", "inviterId")
      , ("consumerInviteResponseInviter", "inviter")
      , ("consumerInviteResponseConnection", "connection")
      , ("consumerInviteResponseInviteText", "inviteText")
      , ("consumerInviteResponseToken", "token")
      , ("consumerInviteResponseAlbumCoverUrl", "albumCoverUrl")
      , ("consumerInviteResponseAlbumTitle", "albumTitle")
      , ("consumerInviteResponseAppName", "appName")
      , ("consumerInviteResponseWelcomeText", "welcomeText")
      , ("consumerInviteResponseApplication", "application")
      , ("consumerInviteResponseRetailerLocation", "retailerLocation")
      , ("consumerInviteResponseOffer", "offer")
      , ("consumerInviteResponseAlbum", "album")
      , ("consumerInviteResponseReturning", "returning")
      ]


-- | 
data Contact = Contact
  { contactFirstName :: Maybe Text -- ^ 
  , contactMiddleName :: Maybe Text -- ^ 
  , contactLastName :: Maybe Text -- ^ 
  , contactPrefix :: Maybe Text -- ^ 
  , contactSuffix :: Maybe Text -- ^ 
  , contactTitle :: Maybe Text -- ^ 
  , contactHomePhone :: Maybe Text -- ^ 
  , contactCellPhone :: Maybe Text -- ^ 
  , contactCellCarrier :: Maybe CellCarrier -- ^ 
  , contactBusinessPhone :: Maybe Text -- ^ 
  , contactBusinessPhoneExt :: Maybe Text -- ^ 
  , contactFaxNumber :: Maybe Text -- ^ 
  , contactTimeZone :: Maybe Text -- ^ 
  , contactUtcOffset :: Maybe Text -- ^ 
  , contactCode501c3 :: Maybe Text -- ^ 
  , contactEmailAddress :: Maybe Text -- ^ 
  , contactAddress :: Maybe Address -- ^ 
  , contactWeb :: Maybe Text -- ^ 
  , contactDisplay :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Contact where
  parseJSON = genericParseJSON optionsContact
instance ToJSON Contact where
  toJSON = genericToJSON optionsContact

optionsContact :: Options
optionsContact =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("contactFirstName", "firstName")
      , ("contactMiddleName", "middleName")
      , ("contactLastName", "lastName")
      , ("contactPrefix", "prefix")
      , ("contactSuffix", "suffix")
      , ("contactTitle", "title")
      , ("contactHomePhone", "homePhone")
      , ("contactCellPhone", "cellPhone")
      , ("contactCellCarrier", "cellCarrier")
      , ("contactBusinessPhone", "businessPhone")
      , ("contactBusinessPhoneExt", "businessPhoneExt")
      , ("contactFaxNumber", "faxNumber")
      , ("contactTimeZone", "timeZone")
      , ("contactUtcOffset", "utcOffset")
      , ("contactCode501c3", "code501c3")
      , ("contactEmailAddress", "emailAddress")
      , ("contactAddress", "address")
      , ("contactWeb", "web")
      , ("contactDisplay", "display")
      ]


-- | 
data ContactInfo = ContactInfo
  { contactInfoHomePhone :: Maybe Text -- ^ 
  , contactInfoCellPhone :: Maybe Text -- ^ 
  , contactInfoCellCarrier :: Maybe CellCarrier -- ^ 
  , contactInfoBusinessPhone :: Maybe Text -- ^ 
  , contactInfoBusinessPhoneExt :: Maybe Text -- ^ 
  , contactInfoFaxNumber :: Maybe Text -- ^ 
  , contactInfoTimeZone :: Maybe Text -- ^ 
  , contactInfoUtcOffset :: Maybe Text -- ^ 
  , contactInfoCode501c3 :: Maybe Text -- ^ 
  , contactInfoEmailAddress :: Maybe Text -- ^ 
  , contactInfoAddress :: Maybe Address -- ^ 
  , contactInfoWeb :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ContactInfo where
  parseJSON = genericParseJSON optionsContactInfo
instance ToJSON ContactInfo where
  toJSON = genericToJSON optionsContactInfo

optionsContactInfo :: Options
optionsContactInfo =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("contactInfoHomePhone", "homePhone")
      , ("contactInfoCellPhone", "cellPhone")
      , ("contactInfoCellCarrier", "cellCarrier")
      , ("contactInfoBusinessPhone", "businessPhone")
      , ("contactInfoBusinessPhoneExt", "businessPhoneExt")
      , ("contactInfoFaxNumber", "faxNumber")
      , ("contactInfoTimeZone", "timeZone")
      , ("contactInfoUtcOffset", "utcOffset")
      , ("contactInfoCode501c3", "code501c3")
      , ("contactInfoEmailAddress", "emailAddress")
      , ("contactInfoAddress", "address")
      , ("contactInfoWeb", "web")
      ]


-- | 
data ContactInfoResponse = ContactInfoResponse
  { contactInfoResponseHomePhone :: Maybe Text -- ^ 
  , contactInfoResponseCellPhone :: Maybe Text -- ^ 
  , contactInfoResponseCellPhoneCarrier :: Maybe Text -- ^ 
  , contactInfoResponseBusinessPhone :: Maybe Text -- ^ 
  , contactInfoResponseBusinessPhoneExt :: Maybe Text -- ^ 
  , contactInfoResponseFaxNumber :: Maybe Text -- ^ 
  , contactInfoResponseTimeZone :: Maybe Text -- ^ 
  , contactInfoResponseUtcOffset :: Maybe Text -- ^ 
  , contactInfoResponseCode501c3 :: Maybe Text -- ^ 
  , contactInfoResponseEmailAddress :: Maybe Text -- ^ 
  , contactInfoResponseAddress :: Maybe AddressResponse -- ^ 
  , contactInfoResponseWeb :: Maybe Text -- ^ 
  , contactInfoResponseCellCarrier :: Maybe CellCarrierResponse -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ContactInfoResponse where
  parseJSON = genericParseJSON optionsContactInfoResponse
instance ToJSON ContactInfoResponse where
  toJSON = genericToJSON optionsContactInfoResponse

optionsContactInfoResponse :: Options
optionsContactInfoResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("contactInfoResponseHomePhone", "homePhone")
      , ("contactInfoResponseCellPhone", "cellPhone")
      , ("contactInfoResponseCellPhoneCarrier", "cellPhoneCarrier")
      , ("contactInfoResponseBusinessPhone", "businessPhone")
      , ("contactInfoResponseBusinessPhoneExt", "businessPhoneExt")
      , ("contactInfoResponseFaxNumber", "faxNumber")
      , ("contactInfoResponseTimeZone", "timeZone")
      , ("contactInfoResponseUtcOffset", "utcOffset")
      , ("contactInfoResponseCode501c3", "code501c3")
      , ("contactInfoResponseEmailAddress", "emailAddress")
      , ("contactInfoResponseAddress", "address")
      , ("contactInfoResponseWeb", "web")
      , ("contactInfoResponseCellCarrier", "cellCarrier")
      ]


-- | 
data ContactResponse = ContactResponse
  { contactResponseFirstName :: Maybe Text -- ^ 
  , contactResponseMiddleName :: Maybe Text -- ^ 
  , contactResponseLastName :: Maybe Text -- ^ 
  , contactResponsePrefix :: Maybe Text -- ^ 
  , contactResponseSuffix :: Maybe Text -- ^ 
  , contactResponseTitle :: Maybe Text -- ^ 
  , contactResponseContactInfo :: Maybe ContactInfoResponse -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ContactResponse where
  parseJSON = genericParseJSON optionsContactResponse
instance ToJSON ContactResponse where
  toJSON = genericToJSON optionsContactResponse

optionsContactResponse :: Options
optionsContactResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("contactResponseFirstName", "firstName")
      , ("contactResponseMiddleName", "middleName")
      , ("contactResponseLastName", "lastName")
      , ("contactResponsePrefix", "prefix")
      , ("contactResponseSuffix", "suffix")
      , ("contactResponseTitle", "title")
      , ("contactResponseContactInfo", "contactInfo")
      ]


-- | 
data CoordsResponse = CoordsResponse
  { coordsResponseValid :: Maybe Bool -- ^ 
  , coordsResponseMessage :: Maybe Text -- ^ 
  , coordsResponseVersion :: Maybe Double -- ^ 
  , coordsResponseSerializeNulls :: Maybe Bool -- ^ 
  , coordsResponseStartTimeLog :: Maybe Integer -- ^ 
  , coordsResponseErrorCode :: Maybe Text -- ^ 
  , coordsResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , coordsResponseLatitude :: Maybe Double -- ^ 
  , coordsResponseLongitude :: Maybe Double -- ^ 
  , coordsResponseCountry :: Maybe Text -- ^ 
  , coordsResponseCountryCode :: Maybe Text -- ^ 
  , coordsResponseRegion :: Maybe Text -- ^ 
  , coordsResponseCity :: Maybe Text -- ^ 
  , coordsResponsePostalCode :: Maybe Text -- ^ 
  , coordsResponseRegionCode :: Maybe Text -- ^ 
  , coordsResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON CoordsResponse where
  parseJSON = genericParseJSON optionsCoordsResponse
instance ToJSON CoordsResponse where
  toJSON = genericToJSON optionsCoordsResponse

optionsCoordsResponse :: Options
optionsCoordsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("coordsResponseValid", "valid")
      , ("coordsResponseMessage", "message")
      , ("coordsResponseVersion", "version")
      , ("coordsResponseSerializeNulls", "serializeNulls")
      , ("coordsResponseStartTimeLog", "startTimeLog")
      , ("coordsResponseErrorCode", "errorCode")
      , ("coordsResponseRequest", "request")
      , ("coordsResponseLatitude", "latitude")
      , ("coordsResponseLongitude", "longitude")
      , ("coordsResponseCountry", "country")
      , ("coordsResponseCountryCode", "countryCode")
      , ("coordsResponseRegion", "region")
      , ("coordsResponseCity", "city")
      , ("coordsResponsePostalCode", "postalCode")
      , ("coordsResponseRegionCode", "regionCode")
      , ("coordsResponseReturning", "returning")
      ]


-- | 
data CountResponse = CountResponse
  { countResponseValid :: Maybe Bool -- ^ 
  , countResponseMessage :: Maybe Text -- ^ 
  , countResponseVersion :: Maybe Double -- ^ 
  , countResponseSerializeNulls :: Maybe Bool -- ^ 
  , countResponseStartTimeLog :: Maybe Integer -- ^ 
  , countResponseErrorCode :: Maybe Text -- ^ 
  , countResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , countResponseCount :: Maybe Integer -- ^ 
  , countResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON CountResponse where
  parseJSON = genericParseJSON optionsCountResponse
instance ToJSON CountResponse where
  toJSON = genericToJSON optionsCountResponse

optionsCountResponse :: Options
optionsCountResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("countResponseValid", "valid")
      , ("countResponseMessage", "message")
      , ("countResponseVersion", "version")
      , ("countResponseSerializeNulls", "serializeNulls")
      , ("countResponseStartTimeLog", "startTimeLog")
      , ("countResponseErrorCode", "errorCode")
      , ("countResponseRequest", "request")
      , ("countResponseCount", "count")
      , ("countResponseReturning", "returning")
      ]


-- | 
data CreativeResponse = CreativeResponse
  { creativeResponseCreativeId :: Maybe Integer -- ^ 
  , creativeResponseActive :: Maybe Bool -- ^ 
  , creativeResponseName :: Maybe Text -- ^ 
  , creativeResponseDescription :: Maybe Text -- ^ 
  , creativeResponseImage :: Maybe AssetShortResponse -- ^ 
  , creativeResponseAction :: Maybe Text -- ^ 
  , creativeResponseContent :: Maybe JsonElement -- ^ 
  , creativeResponseSuffix :: Maybe Text -- ^ 
  , creativeResponseType :: Maybe Text -- ^ 
  , creativeResponseAppVersion :: Maybe Text -- ^ 
  , creativeResponsePreview :: Maybe Bool -- ^ 
  , creativeResponseOwner :: Maybe AccountShortResponse -- ^ 
  , creativeResponseCurrentBid :: Maybe BidResponse -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON CreativeResponse where
  parseJSON = genericParseJSON optionsCreativeResponse
instance ToJSON CreativeResponse where
  toJSON = genericToJSON optionsCreativeResponse

optionsCreativeResponse :: Options
optionsCreativeResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("creativeResponseCreativeId", "creativeId")
      , ("creativeResponseActive", "active")
      , ("creativeResponseName", "name")
      , ("creativeResponseDescription", "description")
      , ("creativeResponseImage", "image")
      , ("creativeResponseAction", "action")
      , ("creativeResponseContent", "content")
      , ("creativeResponseSuffix", "suffix")
      , ("creativeResponseType", "type")
      , ("creativeResponseAppVersion", "appVersion")
      , ("creativeResponsePreview", "preview")
      , ("creativeResponseOwner", "owner")
      , ("creativeResponseCurrentBid", "currentBid")
      ]


-- | 
data CsvImportResponse = CsvImportResponse
  { csvImportResponseValid :: Maybe Bool -- ^ 
  , csvImportResponseMessage :: Maybe Text -- ^ 
  , csvImportResponseVersion :: Maybe Double -- ^ 
  , csvImportResponseSerializeNulls :: Maybe Bool -- ^ 
  , csvImportResponseStartTimeLog :: Maybe Integer -- ^ 
  , csvImportResponseErrorCode :: Maybe Text -- ^ 
  , csvImportResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , csvImportResponseBatchId :: Maybe Integer -- ^ 
  , csvImportResponseCsvImportBatchStatus :: Maybe Text -- ^ 
  , csvImportResponseErrorMessage :: Maybe Text -- ^ 
  , csvImportResponseObjectType :: Maybe Text -- ^ 
  , csvImportResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON CsvImportResponse where
  parseJSON = genericParseJSON optionsCsvImportResponse
instance ToJSON CsvImportResponse where
  toJSON = genericToJSON optionsCsvImportResponse

optionsCsvImportResponse :: Options
optionsCsvImportResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("csvImportResponseValid", "valid")
      , ("csvImportResponseMessage", "message")
      , ("csvImportResponseVersion", "version")
      , ("csvImportResponseSerializeNulls", "serializeNulls")
      , ("csvImportResponseStartTimeLog", "startTimeLog")
      , ("csvImportResponseErrorCode", "errorCode")
      , ("csvImportResponseRequest", "request")
      , ("csvImportResponseBatchId", "batchId")
      , ("csvImportResponseCsvImportBatchStatus", "csvImportBatchStatus")
      , ("csvImportResponseErrorMessage", "errorMessage")
      , ("csvImportResponseObjectType", "objectType")
      , ("csvImportResponseReturning", "returning")
      ]


-- | 
data DateTimeField = DateTimeField
  { dateTimeFieldName :: Maybe Text -- ^ 
  , dateTimeFieldType :: Maybe DateTimeFieldType -- ^ 
  , dateTimeFieldSupported :: Maybe Bool -- ^ 
  , dateTimeFieldMinimumValue :: Maybe Int -- ^ 
  , dateTimeFieldMaximumValue :: Maybe Int -- ^ 
  , dateTimeFieldDurationField :: Maybe DurationField -- ^ 
  , dateTimeFieldLeapDurationField :: Maybe DurationField -- ^ 
  , dateTimeFieldRangeDurationField :: Maybe DurationField -- ^ 
  , dateTimeFieldLenient :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DateTimeField where
  parseJSON = genericParseJSON optionsDateTimeField
instance ToJSON DateTimeField where
  toJSON = genericToJSON optionsDateTimeField

optionsDateTimeField :: Options
optionsDateTimeField =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("dateTimeFieldName", "name")
      , ("dateTimeFieldType", "type")
      , ("dateTimeFieldSupported", "supported")
      , ("dateTimeFieldMinimumValue", "minimumValue")
      , ("dateTimeFieldMaximumValue", "maximumValue")
      , ("dateTimeFieldDurationField", "durationField")
      , ("dateTimeFieldLeapDurationField", "leapDurationField")
      , ("dateTimeFieldRangeDurationField", "rangeDurationField")
      , ("dateTimeFieldLenient", "lenient")
      ]


-- | 
data DateTimeFieldType = DateTimeFieldType
  { dateTimeFieldTypeName :: Maybe Text -- ^ 
  , dateTimeFieldTypeRangeDurationType :: Maybe DurationFieldType -- ^ 
  , dateTimeFieldTypeDurationType :: Maybe DurationFieldType -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DateTimeFieldType where
  parseJSON = genericParseJSON optionsDateTimeFieldType
instance ToJSON DateTimeFieldType where
  toJSON = genericToJSON optionsDateTimeFieldType

optionsDateTimeFieldType :: Options
optionsDateTimeFieldType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("dateTimeFieldTypeName", "name")
      , ("dateTimeFieldTypeRangeDurationType", "rangeDurationType")
      , ("dateTimeFieldTypeDurationType", "durationType")
      ]


-- | 
data DateTimeRange = DateTimeRange
  { dateTimeRangeStart :: Maybe UTCTime -- ^ 
  , dateTimeRangeEnd :: Maybe UTCTime -- ^ 
  , dateTimeRangeInterval :: Maybe Interval -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DateTimeRange where
  parseJSON = genericParseJSON optionsDateTimeRange
instance ToJSON DateTimeRange where
  toJSON = genericToJSON optionsDateTimeRange

optionsDateTimeRange :: Options
optionsDateTimeRange =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("dateTimeRangeStart", "start")
      , ("dateTimeRangeEnd", "end")
      , ("dateTimeRangeInterval", "interval")
      ]


-- | 
data DateTimeZone = DateTimeZone
  { dateTimeZoneId :: Maybe Text -- ^ 
  , dateTimeZoneFixed :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DateTimeZone where
  parseJSON = genericParseJSON optionsDateTimeZone
instance ToJSON DateTimeZone where
  toJSON = genericToJSON optionsDateTimeZone

optionsDateTimeZone :: Options
optionsDateTimeZone =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("dateTimeZoneId", "id")
      , ("dateTimeZoneFixed", "fixed")
      ]


-- | 
data Device = Device
  { deviceRebootTimeHour :: Maybe Int -- ^ 
  , deviceRebootTimeMinute :: Maybe Int -- ^ 
  , deviceIdleTimeoutInSecond :: Maybe Int -- ^ 
  , deviceSerialNumber :: Maybe Text -- ^ 
  , deviceUdid :: Maybe Text -- ^ 
  , deviceDeviceType :: Maybe Text -- ^ 
  , deviceDevicePower :: Maybe Double -- ^ 
  , deviceDeviceInterference :: Maybe Double -- ^ 
  , deviceLastHeartbeatSent :: Maybe UTCTime -- ^ 
  , deviceLastDown :: Maybe UTCTime -- ^ 
  , deviceLastUp :: Maybe UTCTime -- ^ 
  , deviceLastNotificationSent :: Maybe UTCTime -- ^ 
  , deviceHealth :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Device where
  parseJSON = genericParseJSON optionsDevice
instance ToJSON Device where
  toJSON = genericToJSON optionsDevice

optionsDevice :: Options
optionsDevice =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("deviceRebootTimeHour", "rebootTimeHour")
      , ("deviceRebootTimeMinute", "rebootTimeMinute")
      , ("deviceIdleTimeoutInSecond", "idleTimeoutInSecond")
      , ("deviceSerialNumber", "serialNumber")
      , ("deviceUdid", "udid")
      , ("deviceDeviceType", "deviceType")
      , ("deviceDevicePower", "devicePower")
      , ("deviceDeviceInterference", "deviceInterference")
      , ("deviceLastHeartbeatSent", "lastHeartbeatSent")
      , ("deviceLastDown", "lastDown")
      , ("deviceLastUp", "lastUp")
      , ("deviceLastNotificationSent", "lastNotificationSent")
      , ("deviceHealth", "health")
      ]


-- | 
data Dimensions = Dimensions
  { dimensionsWidth :: Maybe Double -- ^ 
  , dimensionsHeight :: Maybe Double -- ^ 
  , dimensionsDepth :: Maybe Double -- ^ 
  , dimensionsVolume :: Maybe Double -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Dimensions where
  parseJSON = genericParseJSON optionsDimensions
instance ToJSON Dimensions where
  toJSON = genericToJSON optionsDimensions

optionsDimensions :: Options
optionsDimensions =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("dimensionsWidth", "width")
      , ("dimensionsHeight", "height")
      , ("dimensionsDepth", "depth")
      , ("dimensionsVolume", "volume")
      ]


-- | 
data Direction = Direction
  { directionId :: Maybe Integer -- ^ 
  , directionActive :: Maybe Bool -- ^ 
  , directionValid :: Maybe Bool -- ^ 
  , directionDistance :: Maybe Text -- ^ 
  , directionDuration :: Maybe Text -- ^ 
  , directionEndLatitude :: Maybe Double -- ^ 
  , directionEndLongitude :: Maybe Double -- ^ 
  , directionStartLatitude :: Maybe Double -- ^ 
  , directionStartLongitude :: Maybe Double -- ^ 
  , directionInstruction :: Maybe Text -- ^ 
  , directionPolyline :: Maybe Text -- ^ 
  , directionProgressStatus :: Maybe Text -- ^ 
  , directionHighlight :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Direction where
  parseJSON = genericParseJSON optionsDirection
instance ToJSON Direction where
  toJSON = genericToJSON optionsDirection

optionsDirection :: Options
optionsDirection =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("directionId", "id")
      , ("directionActive", "active")
      , ("directionValid", "valid")
      , ("directionDistance", "distance")
      , ("directionDuration", "duration")
      , ("directionEndLatitude", "endLatitude")
      , ("directionEndLongitude", "endLongitude")
      , ("directionStartLatitude", "startLatitude")
      , ("directionStartLongitude", "startLongitude")
      , ("directionInstruction", "instruction")
      , ("directionPolyline", "polyline")
      , ("directionProgressStatus", "progressStatus")
      , ("directionHighlight", "highlight")
      ]


-- | 
data DirectionResponse = DirectionResponse
  { directionResponseAction :: Maybe Text -- ^ 
  , directionResponseBearing :: Maybe Double -- ^ 
  , directionResponseBearingDifference :: Maybe Double -- ^ 
  , directionResponseHeading :: Maybe Text -- ^ 
  , directionResponseDistance :: Maybe Double -- ^ 
  , directionResponseDistanceUnits :: Maybe Text -- ^ 
  , directionResponseDistanceString :: Maybe Text -- ^ 
  , directionResponseStartLatitude :: Maybe Double -- ^ 
  , directionResponseStartLongitude :: Maybe Double -- ^ 
  , directionResponseEndLatitude :: Maybe Double -- ^ 
  , directionResponseEndLongitude :: Maybe Double -- ^ 
  , directionResponseInstruction :: Maybe Text -- ^ 
  , directionResponseProgressStatus :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DirectionResponse where
  parseJSON = genericParseJSON optionsDirectionResponse
instance ToJSON DirectionResponse where
  toJSON = genericToJSON optionsDirectionResponse

optionsDirectionResponse :: Options
optionsDirectionResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("directionResponseAction", "action")
      , ("directionResponseBearing", "bearing")
      , ("directionResponseBearingDifference", "bearingDifference")
      , ("directionResponseHeading", "heading")
      , ("directionResponseDistance", "distance")
      , ("directionResponseDistanceUnits", "distanceUnits")
      , ("directionResponseDistanceString", "distanceString")
      , ("directionResponseStartLatitude", "startLatitude")
      , ("directionResponseStartLongitude", "startLongitude")
      , ("directionResponseEndLatitude", "endLatitude")
      , ("directionResponseEndLongitude", "endLongitude")
      , ("directionResponseInstruction", "instruction")
      , ("directionResponseProgressStatus", "progressStatus")
      ]


-- | 
data DisbursementResponse = DisbursementResponse
  { disbursementResponseDisbursementId :: Maybe Integer -- ^ 
  , disbursementResponseTitle :: Maybe Text -- ^ 
  , disbursementResponseComment :: Maybe Text -- ^ 
  , disbursementResponseExternalId :: Maybe Text -- ^ 
  , disbursementResponseIntrospectionParams :: Maybe Text -- ^ 
  , disbursementResponseAmount :: Maybe Double -- ^ 
  , disbursementResponseScheduledDate :: Maybe Integer -- ^ 
  , disbursementResponseCaptureDate :: Maybe Integer -- ^ 
  , disbursementResponseEstimatedDate :: Maybe Integer -- ^ 
  , disbursementResponseSettledDate :: Maybe Integer -- ^ 
  , disbursementResponseStatus :: Maybe Text -- ^ 
  , disbursementResponseProvider :: Maybe Text -- ^ 
  , disbursementResponseSenderBillable :: Maybe BillableEntityShortResponse -- ^ 
  , disbursementResponseReceiverBillable :: Maybe BillableEntityShortResponse -- ^ 
  , disbursementResponseErrorCode :: Maybe Text -- ^ 
  , disbursementResponseErrorMessage :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DisbursementResponse where
  parseJSON = genericParseJSON optionsDisbursementResponse
instance ToJSON DisbursementResponse where
  toJSON = genericToJSON optionsDisbursementResponse

optionsDisbursementResponse :: Options
optionsDisbursementResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("disbursementResponseDisbursementId", "disbursementId")
      , ("disbursementResponseTitle", "title")
      , ("disbursementResponseComment", "comment")
      , ("disbursementResponseExternalId", "externalId")
      , ("disbursementResponseIntrospectionParams", "introspectionParams")
      , ("disbursementResponseAmount", "amount")
      , ("disbursementResponseScheduledDate", "scheduledDate")
      , ("disbursementResponseCaptureDate", "captureDate")
      , ("disbursementResponseEstimatedDate", "estimatedDate")
      , ("disbursementResponseSettledDate", "settledDate")
      , ("disbursementResponseStatus", "status")
      , ("disbursementResponseProvider", "provider")
      , ("disbursementResponseSenderBillable", "senderBillable")
      , ("disbursementResponseReceiverBillable", "receiverBillable")
      , ("disbursementResponseErrorCode", "errorCode")
      , ("disbursementResponseErrorMessage", "errorMessage")
      ]


-- | 
data DriverResponse = DriverResponse
  { driverResponseId :: Maybe Text -- ^ 
  , driverResponseName :: Maybe Text -- ^ 
  , driverResponseDepot :: Maybe LocationResponse -- ^ 
  , driverResponseAvailability :: Maybe [AvailabilityResponse] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DriverResponse where
  parseJSON = genericParseJSON optionsDriverResponse
instance ToJSON DriverResponse where
  toJSON = genericToJSON optionsDriverResponse

optionsDriverResponse :: Options
optionsDriverResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("driverResponseId", "id")
      , ("driverResponseName", "name")
      , ("driverResponseDepot", "depot")
      , ("driverResponseAvailability", "availability")
      ]


-- | 
data DurationField = DurationField
  { durationFieldName :: Maybe Text -- ^ 
  , durationFieldType :: Maybe DurationFieldType -- ^ 
  , durationFieldSupported :: Maybe Bool -- ^ 
  , durationFieldPrecise :: Maybe Bool -- ^ 
  , durationFieldUnitMillis :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DurationField where
  parseJSON = genericParseJSON optionsDurationField
instance ToJSON DurationField where
  toJSON = genericToJSON optionsDurationField

optionsDurationField :: Options
optionsDurationField =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("durationFieldName", "name")
      , ("durationFieldType", "type")
      , ("durationFieldSupported", "supported")
      , ("durationFieldPrecise", "precise")
      , ("durationFieldUnitMillis", "unitMillis")
      ]


-- | 
data DurationFieldType = DurationFieldType
  { durationFieldTypeName :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON DurationFieldType where
  parseJSON = genericParseJSON optionsDurationFieldType
instance ToJSON DurationFieldType where
  toJSON = genericToJSON optionsDurationFieldType

optionsDurationFieldType :: Options
optionsDurationFieldType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("durationFieldTypeName", "name")
      ]


-- | 
data EmployeeResponse = EmployeeResponse
  { employeeResponseAccountId :: Maybe Integer -- ^ 
  , employeeResponseLocationDisplay :: Maybe Text -- ^ 
  , employeeResponseDisplay :: Maybe Text -- ^ 
  , employeeResponseUsername :: Maybe Text -- ^ 
  , employeeResponseAccountType :: Maybe Text -- ^ 
  , employeeResponseProfileImage :: Maybe Text -- ^ 
  , employeeResponseGender :: Maybe Text -- ^ 
  , employeeResponseContactEmail :: Maybe Text -- ^ 
  , employeeResponseContact :: Maybe ContactResponse -- ^ 
  , employeeResponseManager :: Maybe AccountMiniResponse -- ^ 
  , employeeResponseActive :: Maybe Bool -- ^ 
  , employeeResponseLocations :: Maybe [RetailerLocationShortResponse] -- ^ 
  , employeeResponseHasDelegateAccess :: Maybe Bool -- ^ 
  , employeeResponseLatitude :: Maybe Double -- ^ 
  , employeeResponseLongitude :: Maybe Double -- ^ 
  , employeeResponseLocationLastUpdated :: Maybe Integer -- ^ 
  , employeeResponseLocationCount :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON EmployeeResponse where
  parseJSON = genericParseJSON optionsEmployeeResponse
instance ToJSON EmployeeResponse where
  toJSON = genericToJSON optionsEmployeeResponse

optionsEmployeeResponse :: Options
optionsEmployeeResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("employeeResponseAccountId", "accountId")
      , ("employeeResponseLocationDisplay", "locationDisplay")
      , ("employeeResponseDisplay", "display")
      , ("employeeResponseUsername", "username")
      , ("employeeResponseAccountType", "accountType")
      , ("employeeResponseProfileImage", "profileImage")
      , ("employeeResponseGender", "gender")
      , ("employeeResponseContactEmail", "contactEmail")
      , ("employeeResponseContact", "contact")
      , ("employeeResponseManager", "manager")
      , ("employeeResponseActive", "active")
      , ("employeeResponseLocations", "locations")
      , ("employeeResponseHasDelegateAccess", "hasDelegateAccess")
      , ("employeeResponseLatitude", "latitude")
      , ("employeeResponseLongitude", "longitude")
      , ("employeeResponseLocationLastUpdated", "locationLastUpdated")
      , ("employeeResponseLocationCount", "locationCount")
      ]


-- | 
data EntityReference = EntityReference
  { entityReferenceId :: Maybe Integer -- ^ 
  , entityReferenceActive :: Maybe Bool -- ^ 
  , entityReferenceValid :: Maybe Bool -- ^ 
  , entityReferenceEntityType :: Maybe Text -- ^ 
  , entityReferenceMasterEntityId :: Maybe Integer -- ^ 
  , entityReferenceSlaveUID :: Maybe Text -- ^ 
  , entityReferenceSlaveEntityId :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON EntityReference where
  parseJSON = genericParseJSON optionsEntityReference
instance ToJSON EntityReference where
  toJSON = genericToJSON optionsEntityReference

optionsEntityReference :: Options
optionsEntityReference =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("entityReferenceId", "id")
      , ("entityReferenceActive", "active")
      , ("entityReferenceValid", "valid")
      , ("entityReferenceEntityType", "entityType")
      , ("entityReferenceMasterEntityId", "masterEntityId")
      , ("entityReferenceSlaveUID", "slaveUID")
      , ("entityReferenceSlaveEntityId", "slaveEntityId")
      ]


-- | 
data Event = Event
  { eventSponsered :: Maybe Bool -- ^ 
  , eventListing :: Maybe Listing -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Event where
  parseJSON = genericParseJSON optionsEvent
instance ToJSON Event where
  toJSON = genericToJSON optionsEvent

optionsEvent :: Options
optionsEvent =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("eventSponsered", "sponsered")
      , ("eventListing", "listing")
      ]


-- | 
data EventAttendanceResponse = EventAttendanceResponse
  { eventAttendanceResponseEvent :: Maybe OfferShortResponse -- ^ 
  , eventAttendanceResponseAffiliatedCategories :: Maybe [CategoryResponse] -- ^ 
  , eventAttendanceResponseAttendee :: Maybe AccountShortResponse -- ^ 
  , eventAttendanceResponseFriend :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON EventAttendanceResponse where
  parseJSON = genericParseJSON optionsEventAttendanceResponse
instance ToJSON EventAttendanceResponse where
  toJSON = genericToJSON optionsEventAttendanceResponse

optionsEventAttendanceResponse :: Options
optionsEventAttendanceResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("eventAttendanceResponseEvent", "event")
      , ("eventAttendanceResponseAffiliatedCategories", "affiliatedCategories")
      , ("eventAttendanceResponseAttendee", "attendee")
      , ("eventAttendanceResponseFriend", "friend")
      ]


-- | 
data EventResponse = EventResponse
  { eventResponseListing :: Maybe ListingResponse -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON EventResponse where
  parseJSON = genericParseJSON optionsEventResponse
instance ToJSON EventResponse where
  toJSON = genericToJSON optionsEventResponse

optionsEventResponse :: Options
optionsEventResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("eventResponseListing", "listing")
      ]


-- | 
data Filter = Filter
  { filterId :: Maybe Integer -- ^ 
  , filterActive :: Maybe Bool -- ^ 
  , filterValid :: Maybe Bool -- ^ 
  , filterApplication :: Maybe Application -- ^ 
  , filterName :: Maybe Text -- ^ 
  , filterDescription :: Maybe Text -- ^ 
  , filterParent :: Maybe Filter -- ^ 
  , filterChildren :: Maybe [Filter] -- ^ 
  , filterDisplay :: Maybe Text -- ^ 
  , filterExternalId :: Maybe Text -- ^ 
  , filterExternalType :: Maybe Text -- ^ 
  , filterTree :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Filter where
  parseJSON = genericParseJSON optionsFilter
instance ToJSON Filter where
  toJSON = genericToJSON optionsFilter

optionsFilter :: Options
optionsFilter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("filterId", "id")
      , ("filterActive", "active")
      , ("filterValid", "valid")
      , ("filterApplication", "application")
      , ("filterName", "name")
      , ("filterDescription", "description")
      , ("filterParent", "parent")
      , ("filterChildren", "children")
      , ("filterDisplay", "display")
      , ("filterExternalId", "externalId")
      , ("filterExternalType", "externalType")
      , ("filterTree", "tree")
      ]


-- | 
data FilterResponse = FilterResponse
  { filterResponseFilterId :: Maybe Integer -- ^ 
  , filterResponseName :: Maybe Text -- ^ 
  , filterResponseDisplay :: Maybe Text -- ^ 
  , filterResponseSubFilterCount :: Maybe Int -- ^ 
  , filterResponseParentId :: Maybe Integer -- ^ 
  , filterResponseDescription :: Maybe Text -- ^ 
  , filterResponseActive :: Maybe Bool -- ^ 
  , filterResponseExternalId :: Maybe Text -- ^ 
  , filterResponseExternalType :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON FilterResponse where
  parseJSON = genericParseJSON optionsFilterResponse
instance ToJSON FilterResponse where
  toJSON = genericToJSON optionsFilterResponse

optionsFilterResponse :: Options
optionsFilterResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("filterResponseFilterId", "filterId")
      , ("filterResponseName", "name")
      , ("filterResponseDisplay", "display")
      , ("filterResponseSubFilterCount", "subFilterCount")
      , ("filterResponseParentId", "parentId")
      , ("filterResponseDescription", "description")
      , ("filterResponseActive", "active")
      , ("filterResponseExternalId", "externalId")
      , ("filterResponseExternalType", "externalType")
      ]


-- | 
data FilterTreeResponse = FilterTreeResponse
  { filterTreeResponseFilterId :: Maybe Integer -- ^ 
  , filterTreeResponseName :: Maybe Text -- ^ 
  , filterTreeResponseDisplay :: Maybe Text -- ^ 
  , filterTreeResponseSubFilterCount :: Maybe Int -- ^ 
  , filterTreeResponseParentId :: Maybe Integer -- ^ 
  , filterTreeResponseDescription :: Maybe Text -- ^ 
  , filterTreeResponseActive :: Maybe Bool -- ^ 
  , filterTreeResponseExternalId :: Maybe Text -- ^ 
  , filterTreeResponseExternalType :: Maybe Text -- ^ 
  , filterTreeResponseChildren :: Maybe [FilterTreeResponse] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON FilterTreeResponse where
  parseJSON = genericParseJSON optionsFilterTreeResponse
instance ToJSON FilterTreeResponse where
  toJSON = genericToJSON optionsFilterTreeResponse

optionsFilterTreeResponse :: Options
optionsFilterTreeResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("filterTreeResponseFilterId", "filterId")
      , ("filterTreeResponseName", "name")
      , ("filterTreeResponseDisplay", "display")
      , ("filterTreeResponseSubFilterCount", "subFilterCount")
      , ("filterTreeResponseParentId", "parentId")
      , ("filterTreeResponseDescription", "description")
      , ("filterTreeResponseActive", "active")
      , ("filterTreeResponseExternalId", "externalId")
      , ("filterTreeResponseExternalType", "externalType")
      , ("filterTreeResponseChildren", "children")
      ]


-- | 
data FingerprintBiometricImage = FingerprintBiometricImage
  { fingerprintBiometricImagePosition :: Maybe Text -- ^ 
  , fingerprintBiometricImageData :: Maybe Text -- ^ 
  , fingerprintBiometricImageImageFormat :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON FingerprintBiometricImage where
  parseJSON = genericParseJSON optionsFingerprintBiometricImage
instance ToJSON FingerprintBiometricImage where
  toJSON = genericToJSON optionsFingerprintBiometricImage

optionsFingerprintBiometricImage :: Options
optionsFingerprintBiometricImage =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("fingerprintBiometricImagePosition", "position")
      , ("fingerprintBiometricImageData", "data")
      , ("fingerprintBiometricImageImageFormat", "imageFormat")
      ]


-- | 
data Flag = Flag
  { flagId :: Maybe Integer -- ^ 
  , flagActive :: Maybe Bool -- ^ 
  , flagValid :: Maybe Bool -- ^ 
  , flagOwner :: Maybe Account -- ^ 
  , flagFlagableObjectType :: Maybe Text -- ^ 
  , flagFlagableObjectId :: Maybe Integer -- ^ 
  , flagFlagDescription :: Maybe Text -- ^ 
  , flagApp :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Flag where
  parseJSON = genericParseJSON optionsFlag
instance ToJSON Flag where
  toJSON = genericToJSON optionsFlag

optionsFlag :: Options
optionsFlag =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("flagId", "id")
      , ("flagActive", "active")
      , ("flagValid", "valid")
      , ("flagOwner", "owner")
      , ("flagFlagableObjectType", "flagableObjectType")
      , ("flagFlagableObjectId", "flagableObjectId")
      , ("flagFlagDescription", "flagDescription")
      , ("flagApp", "app")
      ]


-- | 
data FlagResponse = FlagResponse
  { flagResponseFlagId :: Maybe Integer -- ^ 
  , flagResponseFlagableId :: Maybe Integer -- ^ 
  , flagResponseFlagableType :: Maybe Text -- ^ 
  , flagResponseFlagDescription :: Maybe Text -- ^ 
  , flagResponseCreatedDate :: Maybe Integer -- ^ 
  , flagResponseUpdatedDate :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON FlagResponse where
  parseJSON = genericParseJSON optionsFlagResponse
instance ToJSON FlagResponse where
  toJSON = genericToJSON optionsFlagResponse

optionsFlagResponse :: Options
optionsFlagResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("flagResponseFlagId", "flagId")
      , ("flagResponseFlagableId", "flagableId")
      , ("flagResponseFlagableType", "flagableType")
      , ("flagResponseFlagDescription", "flagDescription")
      , ("flagResponseCreatedDate", "createdDate")
      , ("flagResponseUpdatedDate", "updatedDate")
      ]


-- | 
data FlagThreshold = FlagThreshold
  { flagThresholdId :: Maybe Integer -- ^ 
  , flagThresholdActive :: Maybe Bool -- ^ 
  , flagThresholdValid :: Maybe Bool -- ^ 
  , flagThresholdThreshold :: Maybe Integer -- ^ 
  , flagThresholdFlagableObjectType :: Maybe Text -- ^ 
  , flagThresholdApplication :: Maybe Application -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON FlagThreshold where
  parseJSON = genericParseJSON optionsFlagThreshold
instance ToJSON FlagThreshold where
  toJSON = genericToJSON optionsFlagThreshold

optionsFlagThreshold :: Options
optionsFlagThreshold =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("flagThresholdId", "id")
      , ("flagThresholdActive", "active")
      , ("flagThresholdValid", "valid")
      , ("flagThresholdThreshold", "threshold")
      , ("flagThresholdFlagableObjectType", "flagableObjectType")
      , ("flagThresholdApplication", "application")
      ]


-- | 
data Game = Game
  { gameId :: Maybe Integer -- ^ 
  , gameActive :: Maybe Bool -- ^ 
  , gameValid :: Maybe Bool -- ^ 
  , gameOwner :: Maybe Account -- ^ 
  , gameApplication :: Maybe Application -- ^ 
  , gameTitle :: Maybe Text -- ^ 
  , gameDescription :: Maybe Text -- ^ 
  , gameStartDate :: Maybe UTCTime -- ^ 
  , gameEndDate :: Maybe UTCTime -- ^ 
  , gamePacks :: Maybe [Pack] -- ^ 
  , gameSequenceType :: Maybe Text -- ^ 
  , gameAuthorOverride :: Maybe Text -- ^ 
  , gameIcon :: Maybe Asset -- ^ 
  , gameImage :: Maybe Asset -- ^ 
  , gamePoints :: Maybe Integer -- ^ 
  , gameTicketType :: Maybe Text -- ^ 
  , gameTicketCount :: Maybe Integer -- ^ 
  , gameAllocateTickets :: Maybe Bool -- ^ 
  , gameAllGameLevels :: Maybe [GameLevel] -- ^ 
  , gameContentName :: Maybe Text -- ^ 
  , gameContentType :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Game where
  parseJSON = genericParseJSON optionsGame
instance ToJSON Game where
  toJSON = genericToJSON optionsGame

optionsGame :: Options
optionsGame =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("gameId", "id")
      , ("gameActive", "active")
      , ("gameValid", "valid")
      , ("gameOwner", "owner")
      , ("gameApplication", "application")
      , ("gameTitle", "title")
      , ("gameDescription", "description")
      , ("gameStartDate", "startDate")
      , ("gameEndDate", "endDate")
      , ("gamePacks", "packs")
      , ("gameSequenceType", "sequenceType")
      , ("gameAuthorOverride", "authorOverride")
      , ("gameIcon", "icon")
      , ("gameImage", "image")
      , ("gamePoints", "points")
      , ("gameTicketType", "ticketType")
      , ("gameTicketCount", "ticketCount")
      , ("gameAllocateTickets", "allocateTickets")
      , ("gameAllGameLevels", "allGameLevels")
      , ("gameContentName", "contentName")
      , ("gameContentType", "contentType")
      ]


-- | 
data GameLevel = GameLevel
  { gameLevelId :: Maybe Integer -- ^ 
  , gameLevelActive :: Maybe Bool -- ^ 
  , gameLevelValid :: Maybe Bool -- ^ 
  , gameLevelNewOwnerId :: Maybe Integer -- ^ 
  , gameLevelGameDifficulty :: Maybe Text -- ^ 
  , gameLevelName :: Maybe Text -- ^ 
  , gameLevelImage :: Maybe Asset -- ^ 
  , gameLevelIcon :: Maybe Asset -- ^ 
  , gameLevelDescription :: Maybe Text -- ^ 
  , gameLevelStartDate :: Maybe UTCTime -- ^ 
  , gameLevelEndDate :: Maybe UTCTime -- ^ 
  , gameLevelRandomizeGameObjects :: Maybe Bool -- ^ 
  , gameLevelOwner :: Maybe Account -- ^ 
  , gameLevelVersion :: Maybe AppVersion -- ^ 
  , gameLevelNotes :: Maybe [Note] -- ^ 
  , gameLevelNoteCount :: Maybe Integer -- ^ 
  , gameLevelLikes :: Maybe [YayOrNay] -- ^ 
  , gameLevelLikeCount :: Maybe Integer -- ^ 
  , gameLevelDislikeCount :: Maybe Integer -- ^ 
  , gameLevelPlayCount :: Maybe Integer -- ^ 
  , gameLevelDownloadCount :: Maybe Integer -- ^ 
  , gameLevelGameObjectCount :: Maybe Int -- ^ 
  , gameLevelPublicPermissions :: Maybe Permissions -- ^ 
  , gameLevelVisibility :: Maybe Text -- ^ 
  , gameLevelUserPermissions :: Maybe [UserPermissions] -- ^ 
  , gameLevelFlags :: Maybe [Flag] -- ^ 
  , gameLevelFlagCount :: Maybe Integer -- ^ 
  , gameLevelFlagThreshold :: Maybe FlagThreshold -- ^ 
  , gameLevelApplication :: Maybe Application -- ^ 
  , gameLevelAssignMission :: Maybe Bool -- ^ 
  , gameLevelAuthorOverride :: Maybe Text -- ^ 
  , gameLevelSplashTitle :: Maybe Text -- ^ 
  , gameLevelSplashMessage :: Maybe Text -- ^ 
  , gameLevelWinnerMessage :: Maybe Text -- ^ 
  , gameLevelTutorial :: Maybe Tutorial -- ^ 
  , gameLevelApprovalStatus :: Maybe Text -- ^ 
  , gameLevelNextLevel :: Maybe GameLevel -- ^ 
  , gameLevelOffer :: Maybe Offer -- ^ 
  , gameLevelBalance :: Maybe Double -- ^ 
  , gameLevelLevelNumber :: Maybe Int -- ^ 
  , gameLevelPoints :: Maybe Integer -- ^ 
  , gameLevelTicketType :: Maybe Text -- ^ 
  , gameLevelTicketCount :: Maybe Integer -- ^ 
  , gameLevelAllocateTickets :: Maybe Bool -- ^ 
  , gameLevelApplicationTitle :: Maybe Text -- ^ 
  , gameLevelOwnerUsername :: Maybe Text -- ^ 
  , gameLevelLikableNotificationModels :: Maybe [(Map.Map String Value)] -- ^ 
  , gameLevelNotableNotificationModels :: Maybe [(Map.Map String Value)] -- ^ 
  , gameLevelPublished :: Maybe Bool -- ^ 
  , gameLevelContentName :: Maybe Text -- ^ 
  , gameLevelDefaultThreshold :: Maybe Integer -- ^ 
  , gameLevelContentAsset :: Maybe Asset -- ^ 
  , gameLevelContentType :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON GameLevel where
  parseJSON = genericParseJSON optionsGameLevel
instance ToJSON GameLevel where
  toJSON = genericToJSON optionsGameLevel

optionsGameLevel :: Options
optionsGameLevel =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("gameLevelId", "id")
      , ("gameLevelActive", "active")
      , ("gameLevelValid", "valid")
      , ("gameLevelNewOwnerId", "newOwnerId")
      , ("gameLevelGameDifficulty", "gameDifficulty")
      , ("gameLevelName", "name")
      , ("gameLevelImage", "image")
      , ("gameLevelIcon", "icon")
      , ("gameLevelDescription", "description")
      , ("gameLevelStartDate", "startDate")
      , ("gameLevelEndDate", "endDate")
      , ("gameLevelRandomizeGameObjects", "randomizeGameObjects")
      , ("gameLevelOwner", "owner")
      , ("gameLevelVersion", "version")
      , ("gameLevelNotes", "notes")
      , ("gameLevelNoteCount", "noteCount")
      , ("gameLevelLikes", "likes")
      , ("gameLevelLikeCount", "likeCount")
      , ("gameLevelDislikeCount", "dislikeCount")
      , ("gameLevelPlayCount", "playCount")
      , ("gameLevelDownloadCount", "downloadCount")
      , ("gameLevelGameObjectCount", "gameObjectCount")
      , ("gameLevelPublicPermissions", "publicPermissions")
      , ("gameLevelVisibility", "visibility")
      , ("gameLevelUserPermissions", "userPermissions")
      , ("gameLevelFlags", "flags")
      , ("gameLevelFlagCount", "flagCount")
      , ("gameLevelFlagThreshold", "flagThreshold")
      , ("gameLevelApplication", "application")
      , ("gameLevelAssignMission", "assignMission")
      , ("gameLevelAuthorOverride", "authorOverride")
      , ("gameLevelSplashTitle", "splashTitle")
      , ("gameLevelSplashMessage", "splashMessage")
      , ("gameLevelWinnerMessage", "winnerMessage")
      , ("gameLevelTutorial", "tutorial")
      , ("gameLevelApprovalStatus", "approvalStatus")
      , ("gameLevelNextLevel", "nextLevel")
      , ("gameLevelOffer", "offer")
      , ("gameLevelBalance", "balance")
      , ("gameLevelLevelNumber", "levelNumber")
      , ("gameLevelPoints", "points")
      , ("gameLevelTicketType", "ticketType")
      , ("gameLevelTicketCount", "ticketCount")
      , ("gameLevelAllocateTickets", "allocateTickets")
      , ("gameLevelApplicationTitle", "applicationTitle")
      , ("gameLevelOwnerUsername", "ownerUsername")
      , ("gameLevelLikableNotificationModels", "likableNotificationModels")
      , ("gameLevelNotableNotificationModels", "notableNotificationModels")
      , ("gameLevelPublished", "published")
      , ("gameLevelContentName", "contentName")
      , ("gameLevelDefaultThreshold", "defaultThreshold")
      , ("gameLevelContentAsset", "contentAsset")
      , ("gameLevelContentType", "contentType")
      ]


-- | 
data GameLevelListResponse = GameLevelListResponse
  { gameLevelListResponseStart :: Maybe Int -- ^ 
  , gameLevelListResponseLimit :: Maybe Int -- ^ 
  , gameLevelListResponseCountTotal :: Maybe Integer -- ^ 
  , gameLevelListResponseItems :: Maybe [GameLevelResponse] -- ^ 
  , gameLevelListResponseCount :: Maybe Int -- ^ 
  , gameLevelListResponseHasMoreResults :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON GameLevelListResponse where
  parseJSON = genericParseJSON optionsGameLevelListResponse
instance ToJSON GameLevelListResponse where
  toJSON = genericToJSON optionsGameLevelListResponse

optionsGameLevelListResponse :: Options
optionsGameLevelListResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("gameLevelListResponseStart", "start")
      , ("gameLevelListResponseLimit", "limit")
      , ("gameLevelListResponseCountTotal", "countTotal")
      , ("gameLevelListResponseItems", "items")
      , ("gameLevelListResponseCount", "count")
      , ("gameLevelListResponseHasMoreResults", "hasMoreResults")
      ]


-- | 
data GameLevelResponse = GameLevelResponse
  { gameLevelResponseAction :: Maybe Text -- ^ 
  , gameLevelResponseGameLevelId :: Maybe Integer -- ^ 
  , gameLevelResponseGameType :: Maybe Text -- ^ 
  , gameLevelResponseActive :: Maybe Bool -- ^ 
  , gameLevelResponseName :: Maybe Text -- ^ 
  , gameLevelResponseDescription :: Maybe Text -- ^ 
  , gameLevelResponseDifficulty :: Maybe Text -- ^ 
  , gameLevelResponseAppVersion :: Maybe Text -- ^ 
  , gameLevelResponseLikesCount :: Maybe Integer -- ^ 
  , gameLevelResponseDislikesCount :: Maybe Integer -- ^ 
  , gameLevelResponseCommentsCount :: Maybe Integer -- ^ 
  , gameLevelResponseDownloadCount :: Maybe Integer -- ^ 
  , gameLevelResponseComments :: Maybe [NoteResponse] -- ^ 
  , gameLevelResponseLocked :: Maybe Bool -- ^ 
  , gameLevelResponseCompleted :: Maybe Bool -- ^ 
  , gameLevelResponseTicketsEarned :: Maybe Integer -- ^ 
  , gameLevelResponseGameObjects :: Maybe GameObjectListResponse -- ^ 
  , gameLevelResponseHasLiked :: Maybe Bool -- ^ 
  , gameLevelResponseImage :: Maybe AssetShortResponse -- ^ 
  , gameLevelResponseGameData :: Maybe Text -- ^ 
  , gameLevelResponseGameDataSuffix :: Maybe Text -- ^ 
  , gameLevelResponseScores :: Maybe ScoreListResponse -- ^ 
  , gameLevelResponseOwner :: Maybe AccountShortResponse -- ^ 
  , gameLevelResponseUserPermissionsList :: Maybe UserPermissionsListResponse -- ^ 
  , gameLevelResponseResults :: Maybe [NameStringValueResponse] -- ^ 
  , gameLevelResponseRandomizeGameObjects :: Maybe Bool -- ^ 
  , gameLevelResponseTickets :: Maybe TicketListResponse -- ^ 
  , gameLevelResponseAssignMission :: Maybe Bool -- ^ 
  , gameLevelResponseIcon :: Maybe AssetShortResponse -- ^ 
  , gameLevelResponseAuthorOverride :: Maybe Text -- ^ 
  , gameLevelResponseUpdatedDate :: Maybe Integer -- ^ 
  , gameLevelResponseStartDate :: Maybe Integer -- ^ 
  , gameLevelResponseEndDate :: Maybe Integer -- ^ 
  , gameLevelResponseSplashTitle :: Maybe Text -- ^ 
  , gameLevelResponseSplashMessage :: Maybe Text -- ^ 
  , gameLevelResponseHasFlagged :: Maybe Bool -- ^ 
  , gameLevelResponseAllocateTickets :: Maybe Bool -- ^ 
  , gameLevelResponseTicketType :: Maybe Text -- ^ 
  , gameLevelResponseTicketCount :: Maybe Integer -- ^ 
  , gameLevelResponsePoints :: Maybe Integer -- ^ 
  , gameLevelResponseWinnerMessage :: Maybe Text -- ^ 
  , gameLevelResponseTutorial :: Maybe TutorialResponse -- ^ 
  , gameLevelResponseAppKey :: Maybe Text -- ^ 
  , gameLevelResponseAppName :: Maybe Text -- ^ 
  , gameLevelResponseScoringType :: Maybe Text -- ^ 
  , gameLevelResponseTutorialTitle :: Maybe Text -- ^ 
  , gameLevelResponseTutorialMessage :: Maybe Text -- ^ 
  , gameLevelResponseTutorialAlignment :: Maybe Text -- ^ 
  , gameLevelResponseTutorialImage :: Maybe AssetShortResponse -- ^ 
  , gameLevelResponseNextLevelId :: Maybe Integer -- ^ 
  , gameLevelResponseOffer :: Maybe OfferShortResponse -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON GameLevelResponse where
  parseJSON = genericParseJSON optionsGameLevelResponse
instance ToJSON GameLevelResponse where
  toJSON = genericToJSON optionsGameLevelResponse

optionsGameLevelResponse :: Options
optionsGameLevelResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("gameLevelResponseAction", "action")
      , ("gameLevelResponseGameLevelId", "gameLevelId")
      , ("gameLevelResponseGameType", "gameType")
      , ("gameLevelResponseActive", "active")
      , ("gameLevelResponseName", "name")
      , ("gameLevelResponseDescription", "description")
      , ("gameLevelResponseDifficulty", "difficulty")
      , ("gameLevelResponseAppVersion", "appVersion")
      , ("gameLevelResponseLikesCount", "likesCount")
      , ("gameLevelResponseDislikesCount", "dislikesCount")
      , ("gameLevelResponseCommentsCount", "commentsCount")
      , ("gameLevelResponseDownloadCount", "downloadCount")
      , ("gameLevelResponseComments", "comments")
      , ("gameLevelResponseLocked", "locked")
      , ("gameLevelResponseCompleted", "completed")
      , ("gameLevelResponseTicketsEarned", "ticketsEarned")
      , ("gameLevelResponseGameObjects", "gameObjects")
      , ("gameLevelResponseHasLiked", "hasLiked")
      , ("gameLevelResponseImage", "image")
      , ("gameLevelResponseGameData", "gameData")
      , ("gameLevelResponseGameDataSuffix", "gameDataSuffix")
      , ("gameLevelResponseScores", "scores")
      , ("gameLevelResponseOwner", "owner")
      , ("gameLevelResponseUserPermissionsList", "userPermissionsList")
      , ("gameLevelResponseResults", "results")
      , ("gameLevelResponseRandomizeGameObjects", "randomizeGameObjects")
      , ("gameLevelResponseTickets", "tickets")
      , ("gameLevelResponseAssignMission", "assignMission")
      , ("gameLevelResponseIcon", "icon")
      , ("gameLevelResponseAuthorOverride", "authorOverride")
      , ("gameLevelResponseUpdatedDate", "updatedDate")
      , ("gameLevelResponseStartDate", "startDate")
      , ("gameLevelResponseEndDate", "endDate")
      , ("gameLevelResponseSplashTitle", "splashTitle")
      , ("gameLevelResponseSplashMessage", "splashMessage")
      , ("gameLevelResponseHasFlagged", "hasFlagged")
      , ("gameLevelResponseAllocateTickets", "allocateTickets")
      , ("gameLevelResponseTicketType", "ticketType")
      , ("gameLevelResponseTicketCount", "ticketCount")
      , ("gameLevelResponsePoints", "points")
      , ("gameLevelResponseWinnerMessage", "winnerMessage")
      , ("gameLevelResponseTutorial", "tutorial")
      , ("gameLevelResponseAppKey", "appKey")
      , ("gameLevelResponseAppName", "appName")
      , ("gameLevelResponseScoringType", "scoringType")
      , ("gameLevelResponseTutorialTitle", "tutorialTitle")
      , ("gameLevelResponseTutorialMessage", "tutorialMessage")
      , ("gameLevelResponseTutorialAlignment", "tutorialAlignment")
      , ("gameLevelResponseTutorialImage", "tutorialImage")
      , ("gameLevelResponseNextLevelId", "nextLevelId")
      , ("gameLevelResponseOffer", "offer")
      ]


-- | 
data GameListResponse = GameListResponse
  { gameListResponseStart :: Maybe Int -- ^ 
  , gameListResponseLimit :: Maybe Int -- ^ 
  , gameListResponseCountTotal :: Maybe Integer -- ^ 
  , gameListResponseItems :: Maybe [GameResponse] -- ^ 
  , gameListResponseHasMoreResults :: Maybe Bool -- ^ 
  , gameListResponseCount :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON GameListResponse where
  parseJSON = genericParseJSON optionsGameListResponse
instance ToJSON GameListResponse where
  toJSON = genericToJSON optionsGameListResponse

optionsGameListResponse :: Options
optionsGameListResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("gameListResponseStart", "start")
      , ("gameListResponseLimit", "limit")
      , ("gameListResponseCountTotal", "countTotal")
      , ("gameListResponseItems", "items")
      , ("gameListResponseHasMoreResults", "hasMoreResults")
      , ("gameListResponseCount", "count")
      ]


-- | 
data GameObjectListResponse = GameObjectListResponse
  { gameObjectListResponseStart :: Maybe Int -- ^ 
  , gameObjectListResponseLimit :: Maybe Int -- ^ 
  , gameObjectListResponseCountTotal :: Maybe Integer -- ^ 
  , gameObjectListResponseItems :: Maybe [GameObjectResponse] -- ^ 
  , gameObjectListResponseCount :: Maybe Int -- ^ 
  , gameObjectListResponseHasMoreResults :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON GameObjectListResponse where
  parseJSON = genericParseJSON optionsGameObjectListResponse
instance ToJSON GameObjectListResponse where
  toJSON = genericToJSON optionsGameObjectListResponse

optionsGameObjectListResponse :: Options
optionsGameObjectListResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("gameObjectListResponseStart", "start")
      , ("gameObjectListResponseLimit", "limit")
      , ("gameObjectListResponseCountTotal", "countTotal")
      , ("gameObjectListResponseItems", "items")
      , ("gameObjectListResponseCount", "count")
      , ("gameObjectListResponseHasMoreResults", "hasMoreResults")
      ]


-- | 
data GameObjectResponse = GameObjectResponse
  { gameObjectResponseAction :: Maybe Text -- ^ 
  , gameObjectResponseGameObjectId :: Maybe Integer -- ^ 
  , gameObjectResponseGameType :: Maybe Text -- ^ 
  , gameObjectResponseTicketsEarned :: Maybe Integer -- ^ 
  , gameObjectResponseScores :: Maybe ScoreListResponse -- ^ 
  , gameObjectResponseTickets :: Maybe TicketListResponse -- ^ 
  , gameObjectResponseItems :: Maybe [NameStringValueResponse] -- ^ 
  , gameObjectResponseAllocateTickets :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON GameObjectResponse where
  parseJSON = genericParseJSON optionsGameObjectResponse
instance ToJSON GameObjectResponse where
  toJSON = genericToJSON optionsGameObjectResponse

optionsGameObjectResponse :: Options
optionsGameObjectResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("gameObjectResponseAction", "action")
      , ("gameObjectResponseGameObjectId", "gameObjectId")
      , ("gameObjectResponseGameType", "gameType")
      , ("gameObjectResponseTicketsEarned", "ticketsEarned")
      , ("gameObjectResponseScores", "scores")
      , ("gameObjectResponseTickets", "tickets")
      , ("gameObjectResponseItems", "items")
      , ("gameObjectResponseAllocateTickets", "allocateTickets")
      ]


-- | 
data GameResponse = GameResponse
  { gameResponseAction :: Maybe Text -- ^ 
  , gameResponseHighestAppVersion :: Maybe Text -- ^ 
  , gameResponseGameId :: Maybe Integer -- ^ 
  , gameResponseGameType :: Maybe Text -- ^ 
  , gameResponsePacks :: Maybe PackListResponse -- ^ 
  , gameResponseScores :: Maybe ScoreListResponse -- ^ 
  , gameResponseOwner :: Maybe AccountShortResponse -- ^ 
  , gameResponseUserPermissionsList :: Maybe UserPermissionsListResponse -- ^ 
  , gameResponseRules :: Maybe RuleListResponse -- ^ 
  , gameResponseResults :: Maybe [NameStringValueResponse] -- ^ 
  , gameResponseTicketsEarned :: Maybe Integer -- ^ 
  , gameResponseTitle :: Maybe Text -- ^ 
  , gameResponseDescription :: Maybe Text -- ^ 
  , gameResponseAuthorOverride :: Maybe Text -- ^ 
  , gameResponseIcon :: Maybe AssetShortResponse -- ^ 
  , gameResponseImage :: Maybe AssetShortResponse -- ^ 
  , gameResponseSequenceType :: Maybe Text -- ^ 
  , gameResponseUpdatedDate :: Maybe Integer -- ^ 
  , gameResponseStartDate :: Maybe Integer -- ^ 
  , gameResponseEndDate :: Maybe Integer -- ^ 
  , gameResponseAppKey :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON GameResponse where
  parseJSON = genericParseJSON optionsGameResponse
instance ToJSON GameResponse where
  toJSON = genericToJSON optionsGameResponse

optionsGameResponse :: Options
optionsGameResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("gameResponseAction", "action")
      , ("gameResponseHighestAppVersion", "highestAppVersion")
      , ("gameResponseGameId", "gameId")
      , ("gameResponseGameType", "gameType")
      , ("gameResponsePacks", "packs")
      , ("gameResponseScores", "scores")
      , ("gameResponseOwner", "owner")
      , ("gameResponseUserPermissionsList", "userPermissionsList")
      , ("gameResponseRules", "rules")
      , ("gameResponseResults", "results")
      , ("gameResponseTicketsEarned", "ticketsEarned")
      , ("gameResponseTitle", "title")
      , ("gameResponseDescription", "description")
      , ("gameResponseAuthorOverride", "authorOverride")
      , ("gameResponseIcon", "icon")
      , ("gameResponseImage", "image")
      , ("gameResponseSequenceType", "sequenceType")
      , ("gameResponseUpdatedDate", "updatedDate")
      , ("gameResponseStartDate", "startDate")
      , ("gameResponseEndDate", "endDate")
      , ("gameResponseAppKey", "appKey")
      ]


-- | 
data GeoBox = GeoBox
  { geoBoxNorth :: Maybe Double -- ^ 
  , geoBoxEast :: Maybe Double -- ^ 
  , geoBoxSouth :: Maybe Double -- ^ 
  , geoBoxWest :: Maybe Double -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON GeoBox where
  parseJSON = genericParseJSON optionsGeoBox
instance ToJSON GeoBox where
  toJSON = genericToJSON optionsGeoBox

optionsGeoBox :: Options
optionsGeoBox =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("geoBoxNorth", "north")
      , ("geoBoxEast", "east")
      , ("geoBoxSouth", "south")
      , ("geoBoxWest", "west")
      ]


-- | 
data GeoPointResponse = GeoPointResponse
  { geoPointResponseObjectId :: Maybe Text -- ^ 
  , geoPointResponseLatitude :: Maybe Double -- ^ 
  , geoPointResponseLongitude :: Maybe Double -- ^ 
  , geoPointResponseAltitude :: Maybe Double -- ^ 
  , geoPointResponseLocationDescription :: Maybe Text -- ^ 
  , geoPointResponseLocatableId :: Maybe Integer -- ^ 
  , geoPointResponseLocatableObjectId :: Maybe Text -- ^ 
  , geoPointResponseLocatableObjectName :: Maybe Text -- ^ 
  , geoPointResponseLocatableDisplay :: Maybe Text -- ^ 
  , geoPointResponseAsset :: Maybe AssetShortResponse -- ^ 
  , geoPointResponseDistance :: Maybe Double -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON GeoPointResponse where
  parseJSON = genericParseJSON optionsGeoPointResponse
instance ToJSON GeoPointResponse where
  toJSON = genericToJSON optionsGeoPointResponse

optionsGeoPointResponse :: Options
optionsGeoPointResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("geoPointResponseObjectId", "objectId")
      , ("geoPointResponseLatitude", "latitude")
      , ("geoPointResponseLongitude", "longitude")
      , ("geoPointResponseAltitude", "altitude")
      , ("geoPointResponseLocationDescription", "locationDescription")
      , ("geoPointResponseLocatableId", "locatableId")
      , ("geoPointResponseLocatableObjectId", "locatableObjectId")
      , ("geoPointResponseLocatableObjectName", "locatableObjectName")
      , ("geoPointResponseLocatableDisplay", "locatableDisplay")
      , ("geoPointResponseAsset", "asset")
      , ("geoPointResponseDistance", "distance")
      ]


-- | 
data GeoResponse = GeoResponse
  { geoResponseGeoId :: Maybe Text -- ^ 
  , geoResponseLatitude :: Maybe Double -- ^ 
  , geoResponseLongitude :: Maybe Double -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON GeoResponse where
  parseJSON = genericParseJSON optionsGeoResponse
instance ToJSON GeoResponse where
  toJSON = genericToJSON optionsGeoResponse

optionsGeoResponse :: Options
optionsGeoResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("geoResponseGeoId", "geoId")
      , ("geoResponseLatitude", "latitude")
      , ("geoResponseLongitude", "longitude")
      ]


-- | 
data GeocodeLatLngResponse = GeocodeLatLngResponse
  { geocodeLatLngResponseLat :: Maybe Double -- ^ 
  , geocodeLatLngResponseLng :: Maybe Double -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON GeocodeLatLngResponse where
  parseJSON = genericParseJSON optionsGeocodeLatLngResponse
instance ToJSON GeocodeLatLngResponse where
  toJSON = genericToJSON optionsGeocodeLatLngResponse

optionsGeocodeLatLngResponse :: Options
optionsGeocodeLatLngResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("geocodeLatLngResponseLat", "lat")
      , ("geocodeLatLngResponseLng", "lng")
      ]


-- | 
data GroupPermissions = GroupPermissions
  { groupPermissionsCanViewProfileInfo :: Maybe Bool -- ^ 
  , groupPermissionsCanViewGameInfo :: Maybe Bool -- ^ 
  , groupPermissionsCanViewFriendInfo :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON GroupPermissions where
  parseJSON = genericParseJSON optionsGroupPermissions
instance ToJSON GroupPermissions where
  toJSON = genericToJSON optionsGroupPermissions

optionsGroupPermissions :: Options
optionsGroupPermissions =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("groupPermissionsCanViewProfileInfo", "canViewProfileInfo")
      , ("groupPermissionsCanViewGameInfo", "canViewGameInfo")
      , ("groupPermissionsCanViewFriendInfo", "canViewFriendInfo")
      ]


-- | 
data ImageGenerationResponse = ImageGenerationResponse
  { imageGenerationResponseCreated :: Maybe Integer -- ^ 
  , imageGenerationResponseData :: Maybe [UrlResponse] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ImageGenerationResponse where
  parseJSON = genericParseJSON optionsImageGenerationResponse
instance ToJSON ImageGenerationResponse where
  toJSON = genericToJSON optionsImageGenerationResponse

optionsImageGenerationResponse :: Options
optionsImageGenerationResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("imageGenerationResponseCreated", "created")
      , ("imageGenerationResponseData", "data")
      ]


-- | 
data ImportStatuses = ImportStatuses
  { importStatusesStatuses :: Maybe [ShipmentImportStatus] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ImportStatuses where
  parseJSON = genericParseJSON optionsImportStatuses
instance ToJSON ImportStatuses where
  toJSON = genericToJSON optionsImportStatuses

optionsImportStatuses :: Options
optionsImportStatuses =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("importStatusesStatuses", "statuses")
      ]


-- | 
data Interval = Interval
  { intervalEnd :: Maybe UTCTime -- ^ 
  , intervalStart :: Maybe UTCTime -- ^ 
  , intervalChronology :: Maybe Chronology -- ^ 
  , intervalStartMillis :: Maybe Integer -- ^ 
  , intervalEndMillis :: Maybe Integer -- ^ 
  , intervalBeforeNow :: Maybe Bool -- ^ 
  , intervalAfterNow :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Interval where
  parseJSON = genericParseJSON optionsInterval
instance ToJSON Interval where
  toJSON = genericToJSON optionsInterval

optionsInterval :: Options
optionsInterval =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("intervalEnd", "end")
      , ("intervalStart", "start")
      , ("intervalChronology", "chronology")
      , ("intervalStartMillis", "startMillis")
      , ("intervalEndMillis", "endMillis")
      , ("intervalBeforeNow", "beforeNow")
      , ("intervalAfterNow", "afterNow")
      ]


-- | 
data InviteResponse = InviteResponse
  { inviteResponseValid :: Maybe Bool -- ^ 
  , inviteResponseMessage :: Maybe Text -- ^ 
  , inviteResponseVersion :: Maybe Double -- ^ 
  , inviteResponseSerializeNulls :: Maybe Bool -- ^ 
  , inviteResponseStartTimeLog :: Maybe Integer -- ^ 
  , inviteResponseErrorCode :: Maybe Text -- ^ 
  , inviteResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , inviteResponseUrl :: Maybe Text -- ^ 
  , inviteResponseToken :: Maybe Text -- ^ 
  , inviteResponseOfferId :: Maybe Integer -- ^ 
  , inviteResponseOfferLocationId :: Maybe Integer -- ^ 
  , inviteResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON InviteResponse where
  parseJSON = genericParseJSON optionsInviteResponse
instance ToJSON InviteResponse where
  toJSON = genericToJSON optionsInviteResponse

optionsInviteResponse :: Options
optionsInviteResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("inviteResponseValid", "valid")
      , ("inviteResponseMessage", "message")
      , ("inviteResponseVersion", "version")
      , ("inviteResponseSerializeNulls", "serializeNulls")
      , ("inviteResponseStartTimeLog", "startTimeLog")
      , ("inviteResponseErrorCode", "errorCode")
      , ("inviteResponseRequest", "request")
      , ("inviteResponseUrl", "url")
      , ("inviteResponseToken", "token")
      , ("inviteResponseOfferId", "offerId")
      , ("inviteResponseOfferLocationId", "offerLocationId")
      , ("inviteResponseReturning", "returning")
      ]


-- | 
data Invoice = Invoice
  { invoiceLocation :: Maybe Text -- ^ 
  , invoiceTax :: Maybe Int -- ^ 
  , invoiceTotal :: Maybe Int -- ^ 
  , invoiceLineItems :: Maybe [LineItem] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Invoice where
  parseJSON = genericParseJSON optionsInvoice
instance ToJSON Invoice where
  toJSON = genericToJSON optionsInvoice

optionsInvoice :: Options
optionsInvoice =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("invoiceLocation", "location")
      , ("invoiceTax", "tax")
      , ("invoiceTotal", "total")
      , ("invoiceLineItems", "lineItems")
      ]


-- | 
data ItineraryResponse = ItineraryResponse
  { itineraryResponseItineraryId :: Maybe Text -- ^ 
  , itineraryResponseWaypointCount :: Maybe Integer -- ^ 
  , itineraryResponseScore :: Maybe Integer -- ^ 
  , itineraryResponseErrorCode :: Maybe Text -- ^ 
  , itineraryResponseError :: Maybe Text -- ^ 
  , itineraryResponseItemCount :: Maybe Int -- ^ 
  , itineraryResponseVehicle :: Maybe VehicleResponse -- ^ 
  , itineraryResponseStops :: Maybe [StopResponse] -- ^ 
  , itineraryResponseEstimatedStartTime :: Maybe Integer -- ^ 
  , itineraryResponseEstimatedEndTime :: Maybe Integer -- ^ 
  , itineraryResponseEstimatedDuration :: Maybe Integer -- ^ 
  , itineraryResponseEstimatedDistance :: Maybe Double -- ^ 
  , itineraryResponseWaitTime :: Maybe Integer -- ^ 
  , itineraryResponseGenerated :: Maybe Bool -- ^ 
  , itineraryResponseValid :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ItineraryResponse where
  parseJSON = genericParseJSON optionsItineraryResponse
instance ToJSON ItineraryResponse where
  toJSON = genericToJSON optionsItineraryResponse

optionsItineraryResponse :: Options
optionsItineraryResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("itineraryResponseItineraryId", "itineraryId")
      , ("itineraryResponseWaypointCount", "waypointCount")
      , ("itineraryResponseScore", "score")
      , ("itineraryResponseErrorCode", "errorCode")
      , ("itineraryResponseError", "error")
      , ("itineraryResponseItemCount", "itemCount")
      , ("itineraryResponseVehicle", "vehicle")
      , ("itineraryResponseStops", "stops")
      , ("itineraryResponseEstimatedStartTime", "estimatedStartTime")
      , ("itineraryResponseEstimatedEndTime", "estimatedEndTime")
      , ("itineraryResponseEstimatedDuration", "estimatedDuration")
      , ("itineraryResponseEstimatedDistance", "estimatedDistance")
      , ("itineraryResponseWaitTime", "waitTime")
      , ("itineraryResponseGenerated", "generated")
      , ("itineraryResponseValid", "valid")
      ]


-- | 
data JsonArray = JsonArray
  { jsonArrayAsInt :: Maybe Int -- ^ 
  , jsonArrayAsString :: Maybe Text -- ^ 
  , jsonArrayAsBoolean :: Maybe Bool -- ^ 
  , jsonArrayAsNumber :: Maybe Value -- ^ 
  , jsonArrayAsDouble :: Maybe Double -- ^ 
  , jsonArrayAsFloat :: Maybe Float -- ^ 
  , jsonArrayAsLong :: Maybe Integer -- ^ 
  , jsonArrayAsByte :: Maybe Text -- ^ 
  , jsonArrayAsCharacter :: Maybe Text -- ^ 
  , jsonArrayAsBigDecimal :: Maybe Double -- ^ 
  , jsonArrayAsBigInteger :: Maybe Int -- ^ 
  , jsonArrayAsShort :: Maybe Int -- ^ 
  , jsonArrayAsJsonObject :: Maybe JsonObject -- ^ 
  , jsonArrayJsonNull :: Maybe Bool -- ^ 
  , jsonArrayJsonArray :: Maybe Bool -- ^ 
  , jsonArrayJsonObject :: Maybe Bool -- ^ 
  , jsonArrayJsonPrimitive :: Maybe Bool -- ^ 
  , jsonArrayAsJsonArray :: Maybe JsonArray -- ^ 
  , jsonArrayAsJsonPrimitive :: Maybe JsonPrimitive -- ^ 
  , jsonArrayAsJsonNull :: Maybe JsonNull -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON JsonArray where
  parseJSON = genericParseJSON optionsJsonArray
instance ToJSON JsonArray where
  toJSON = genericToJSON optionsJsonArray

optionsJsonArray :: Options
optionsJsonArray =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("jsonArrayAsInt", "asInt")
      , ("jsonArrayAsString", "asString")
      , ("jsonArrayAsBoolean", "asBoolean")
      , ("jsonArrayAsNumber", "asNumber")
      , ("jsonArrayAsDouble", "asDouble")
      , ("jsonArrayAsFloat", "asFloat")
      , ("jsonArrayAsLong", "asLong")
      , ("jsonArrayAsByte", "asByte")
      , ("jsonArrayAsCharacter", "asCharacter")
      , ("jsonArrayAsBigDecimal", "asBigDecimal")
      , ("jsonArrayAsBigInteger", "asBigInteger")
      , ("jsonArrayAsShort", "asShort")
      , ("jsonArrayAsJsonObject", "asJsonObject")
      , ("jsonArrayJsonNull", "jsonNull")
      , ("jsonArrayJsonArray", "jsonArray")
      , ("jsonArrayJsonObject", "jsonObject")
      , ("jsonArrayJsonPrimitive", "jsonPrimitive")
      , ("jsonArrayAsJsonArray", "asJsonArray")
      , ("jsonArrayAsJsonPrimitive", "asJsonPrimitive")
      , ("jsonArrayAsJsonNull", "asJsonNull")
      ]


-- | 
data JsonElement = JsonElement
  { jsonElementAsInt :: Maybe Int -- ^ 
  , jsonElementAsJsonObject :: Maybe JsonObject -- ^ 
  , jsonElementJsonNull :: Maybe Bool -- ^ 
  , jsonElementAsString :: Maybe Text -- ^ 
  , jsonElementAsBoolean :: Maybe Bool -- ^ 
  , jsonElementJsonArray :: Maybe Bool -- ^ 
  , jsonElementJsonObject :: Maybe Bool -- ^ 
  , jsonElementJsonPrimitive :: Maybe Bool -- ^ 
  , jsonElementAsJsonArray :: Maybe JsonArray -- ^ 
  , jsonElementAsJsonPrimitive :: Maybe JsonPrimitive -- ^ 
  , jsonElementAsJsonNull :: Maybe JsonNull -- ^ 
  , jsonElementAsNumber :: Maybe Value -- ^ 
  , jsonElementAsDouble :: Maybe Double -- ^ 
  , jsonElementAsFloat :: Maybe Float -- ^ 
  , jsonElementAsLong :: Maybe Integer -- ^ 
  , jsonElementAsByte :: Maybe Text -- ^ 
  , jsonElementAsCharacter :: Maybe Text -- ^ 
  , jsonElementAsBigDecimal :: Maybe Double -- ^ 
  , jsonElementAsBigInteger :: Maybe Int -- ^ 
  , jsonElementAsShort :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON JsonElement where
  parseJSON = genericParseJSON optionsJsonElement
instance ToJSON JsonElement where
  toJSON = genericToJSON optionsJsonElement

optionsJsonElement :: Options
optionsJsonElement =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("jsonElementAsInt", "asInt")
      , ("jsonElementAsJsonObject", "asJsonObject")
      , ("jsonElementJsonNull", "jsonNull")
      , ("jsonElementAsString", "asString")
      , ("jsonElementAsBoolean", "asBoolean")
      , ("jsonElementJsonArray", "jsonArray")
      , ("jsonElementJsonObject", "jsonObject")
      , ("jsonElementJsonPrimitive", "jsonPrimitive")
      , ("jsonElementAsJsonArray", "asJsonArray")
      , ("jsonElementAsJsonPrimitive", "asJsonPrimitive")
      , ("jsonElementAsJsonNull", "asJsonNull")
      , ("jsonElementAsNumber", "asNumber")
      , ("jsonElementAsDouble", "asDouble")
      , ("jsonElementAsFloat", "asFloat")
      , ("jsonElementAsLong", "asLong")
      , ("jsonElementAsByte", "asByte")
      , ("jsonElementAsCharacter", "asCharacter")
      , ("jsonElementAsBigDecimal", "asBigDecimal")
      , ("jsonElementAsBigInteger", "asBigInteger")
      , ("jsonElementAsShort", "asShort")
      ]


-- | 
data JsonNull = JsonNull
  { jsonNullAsInt :: Maybe Int -- ^ 
  , jsonNullAsJsonObject :: Maybe JsonObject -- ^ 
  , jsonNullJsonNull :: Maybe Bool -- ^ 
  , jsonNullAsString :: Maybe Text -- ^ 
  , jsonNullAsBoolean :: Maybe Bool -- ^ 
  , jsonNullJsonArray :: Maybe Bool -- ^ 
  , jsonNullJsonObject :: Maybe Bool -- ^ 
  , jsonNullJsonPrimitive :: Maybe Bool -- ^ 
  , jsonNullAsJsonArray :: Maybe JsonArray -- ^ 
  , jsonNullAsJsonPrimitive :: Maybe JsonPrimitive -- ^ 
  , jsonNullAsJsonNull :: Maybe JsonNull -- ^ 
  , jsonNullAsNumber :: Maybe Value -- ^ 
  , jsonNullAsDouble :: Maybe Double -- ^ 
  , jsonNullAsFloat :: Maybe Float -- ^ 
  , jsonNullAsLong :: Maybe Integer -- ^ 
  , jsonNullAsByte :: Maybe Text -- ^ 
  , jsonNullAsCharacter :: Maybe Text -- ^ 
  , jsonNullAsBigDecimal :: Maybe Double -- ^ 
  , jsonNullAsBigInteger :: Maybe Int -- ^ 
  , jsonNullAsShort :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON JsonNull where
  parseJSON = genericParseJSON optionsJsonNull
instance ToJSON JsonNull where
  toJSON = genericToJSON optionsJsonNull

optionsJsonNull :: Options
optionsJsonNull =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("jsonNullAsInt", "asInt")
      , ("jsonNullAsJsonObject", "asJsonObject")
      , ("jsonNullJsonNull", "jsonNull")
      , ("jsonNullAsString", "asString")
      , ("jsonNullAsBoolean", "asBoolean")
      , ("jsonNullJsonArray", "jsonArray")
      , ("jsonNullJsonObject", "jsonObject")
      , ("jsonNullJsonPrimitive", "jsonPrimitive")
      , ("jsonNullAsJsonArray", "asJsonArray")
      , ("jsonNullAsJsonPrimitive", "asJsonPrimitive")
      , ("jsonNullAsJsonNull", "asJsonNull")
      , ("jsonNullAsNumber", "asNumber")
      , ("jsonNullAsDouble", "asDouble")
      , ("jsonNullAsFloat", "asFloat")
      , ("jsonNullAsLong", "asLong")
      , ("jsonNullAsByte", "asByte")
      , ("jsonNullAsCharacter", "asCharacter")
      , ("jsonNullAsBigDecimal", "asBigDecimal")
      , ("jsonNullAsBigInteger", "asBigInteger")
      , ("jsonNullAsShort", "asShort")
      ]


-- | 
data JsonObject = JsonObject
  { jsonObjectAsInt :: Maybe Int -- ^ 
  , jsonObjectAsJsonObject :: Maybe JsonObject -- ^ 
  , jsonObjectJsonNull :: Maybe Bool -- ^ 
  , jsonObjectAsString :: Maybe Text -- ^ 
  , jsonObjectAsBoolean :: Maybe Bool -- ^ 
  , jsonObjectJsonArray :: Maybe Bool -- ^ 
  , jsonObjectJsonObject :: Maybe Bool -- ^ 
  , jsonObjectJsonPrimitive :: Maybe Bool -- ^ 
  , jsonObjectAsJsonArray :: Maybe JsonArray -- ^ 
  , jsonObjectAsJsonPrimitive :: Maybe JsonPrimitive -- ^ 
  , jsonObjectAsJsonNull :: Maybe JsonNull -- ^ 
  , jsonObjectAsNumber :: Maybe Value -- ^ 
  , jsonObjectAsDouble :: Maybe Double -- ^ 
  , jsonObjectAsFloat :: Maybe Float -- ^ 
  , jsonObjectAsLong :: Maybe Integer -- ^ 
  , jsonObjectAsByte :: Maybe Text -- ^ 
  , jsonObjectAsCharacter :: Maybe Text -- ^ 
  , jsonObjectAsBigDecimal :: Maybe Double -- ^ 
  , jsonObjectAsBigInteger :: Maybe Int -- ^ 
  , jsonObjectAsShort :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON JsonObject where
  parseJSON = genericParseJSON optionsJsonObject
instance ToJSON JsonObject where
  toJSON = genericToJSON optionsJsonObject

optionsJsonObject :: Options
optionsJsonObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("jsonObjectAsInt", "asInt")
      , ("jsonObjectAsJsonObject", "asJsonObject")
      , ("jsonObjectJsonNull", "jsonNull")
      , ("jsonObjectAsString", "asString")
      , ("jsonObjectAsBoolean", "asBoolean")
      , ("jsonObjectJsonArray", "jsonArray")
      , ("jsonObjectJsonObject", "jsonObject")
      , ("jsonObjectJsonPrimitive", "jsonPrimitive")
      , ("jsonObjectAsJsonArray", "asJsonArray")
      , ("jsonObjectAsJsonPrimitive", "asJsonPrimitive")
      , ("jsonObjectAsJsonNull", "asJsonNull")
      , ("jsonObjectAsNumber", "asNumber")
      , ("jsonObjectAsDouble", "asDouble")
      , ("jsonObjectAsFloat", "asFloat")
      , ("jsonObjectAsLong", "asLong")
      , ("jsonObjectAsByte", "asByte")
      , ("jsonObjectAsCharacter", "asCharacter")
      , ("jsonObjectAsBigDecimal", "asBigDecimal")
      , ("jsonObjectAsBigInteger", "asBigInteger")
      , ("jsonObjectAsShort", "asShort")
      ]


-- | 
data JsonPrimitive = JsonPrimitive
  { jsonPrimitiveAsInt :: Maybe Int -- ^ 
  , jsonPrimitiveNumber :: Maybe Bool -- ^ 
  , jsonPrimitiveBoolean :: Maybe Bool -- ^ 
  , jsonPrimitiveAsString :: Maybe Text -- ^ 
  , jsonPrimitiveAsBoolean :: Maybe Bool -- ^ 
  , jsonPrimitiveAsNumber :: Maybe Value -- ^ 
  , jsonPrimitiveAsDouble :: Maybe Double -- ^ 
  , jsonPrimitiveAsFloat :: Maybe Float -- ^ 
  , jsonPrimitiveAsLong :: Maybe Integer -- ^ 
  , jsonPrimitiveAsByte :: Maybe Text -- ^ 
  , jsonPrimitiveAsCharacter :: Maybe Text -- ^ 
  , jsonPrimitiveAsBigDecimal :: Maybe Double -- ^ 
  , jsonPrimitiveAsBigInteger :: Maybe Int -- ^ 
  , jsonPrimitiveAsShort :: Maybe Int -- ^ 
  , jsonPrimitiveString :: Maybe Bool -- ^ 
  , jsonPrimitiveAsJsonObject :: Maybe JsonObject -- ^ 
  , jsonPrimitiveJsonNull :: Maybe Bool -- ^ 
  , jsonPrimitiveJsonArray :: Maybe Bool -- ^ 
  , jsonPrimitiveJsonObject :: Maybe Bool -- ^ 
  , jsonPrimitiveJsonPrimitive :: Maybe Bool -- ^ 
  , jsonPrimitiveAsJsonArray :: Maybe JsonArray -- ^ 
  , jsonPrimitiveAsJsonPrimitive :: Maybe JsonPrimitive -- ^ 
  , jsonPrimitiveAsJsonNull :: Maybe JsonNull -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON JsonPrimitive where
  parseJSON = genericParseJSON optionsJsonPrimitive
instance ToJSON JsonPrimitive where
  toJSON = genericToJSON optionsJsonPrimitive

optionsJsonPrimitive :: Options
optionsJsonPrimitive =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("jsonPrimitiveAsInt", "asInt")
      , ("jsonPrimitiveNumber", "number")
      , ("jsonPrimitiveBoolean", "boolean")
      , ("jsonPrimitiveAsString", "asString")
      , ("jsonPrimitiveAsBoolean", "asBoolean")
      , ("jsonPrimitiveAsNumber", "asNumber")
      , ("jsonPrimitiveAsDouble", "asDouble")
      , ("jsonPrimitiveAsFloat", "asFloat")
      , ("jsonPrimitiveAsLong", "asLong")
      , ("jsonPrimitiveAsByte", "asByte")
      , ("jsonPrimitiveAsCharacter", "asCharacter")
      , ("jsonPrimitiveAsBigDecimal", "asBigDecimal")
      , ("jsonPrimitiveAsBigInteger", "asBigInteger")
      , ("jsonPrimitiveAsShort", "asShort")
      , ("jsonPrimitiveString", "string")
      , ("jsonPrimitiveAsJsonObject", "asJsonObject")
      , ("jsonPrimitiveJsonNull", "jsonNull")
      , ("jsonPrimitiveJsonArray", "jsonArray")
      , ("jsonPrimitiveJsonObject", "jsonObject")
      , ("jsonPrimitiveJsonPrimitive", "jsonPrimitive")
      , ("jsonPrimitiveAsJsonArray", "asJsonArray")
      , ("jsonPrimitiveAsJsonPrimitive", "asJsonPrimitive")
      , ("jsonPrimitiveAsJsonNull", "asJsonNull")
      ]


-- | 
data Leaderboard = Leaderboard
  { leaderboardId :: Maybe Integer -- ^ 
  , leaderboardRankType :: Maybe Text -- ^ 
  , leaderboardRankMode :: Maybe Text -- ^ One of GLOBAL, FRIENDS, LOCAL, SEARCH, CUSTOM
  , leaderboardSortType :: Maybe Text -- ^ 
  , leaderboardLimitation :: Maybe Int -- ^ 
  , leaderboardTitle :: Maybe Text -- ^ 
  , leaderboardDescription :: Maybe Text -- ^ 
  , leaderboardIconAsset :: Maybe AssetResponse -- ^ 
  , leaderboardBannerAsset :: Maybe AssetResponse -- ^ 
  , leaderboardApplication :: Maybe ApplicationMiniResponse -- ^ 
  , leaderboardMetaData :: Maybe Text -- ^ 
  , leaderboardActive :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Leaderboard where
  parseJSON = genericParseJSON optionsLeaderboard
instance ToJSON Leaderboard where
  toJSON = genericToJSON optionsLeaderboard

optionsLeaderboard :: Options
optionsLeaderboard =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("leaderboardId", "id")
      , ("leaderboardRankType", "rankType")
      , ("leaderboardRankMode", "rankMode")
      , ("leaderboardSortType", "sortType")
      , ("leaderboardLimitation", "limitation")
      , ("leaderboardTitle", "title")
      , ("leaderboardDescription", "description")
      , ("leaderboardIconAsset", "iconAsset")
      , ("leaderboardBannerAsset", "bannerAsset")
      , ("leaderboardApplication", "application")
      , ("leaderboardMetaData", "metaData")
      , ("leaderboardActive", "active")
      ]


-- | 
data LeaderboardFullResponse = LeaderboardFullResponse
  { leaderboardFullResponseLeaderboardId :: Maybe Integer -- ^ 
  , leaderboardFullResponseRankType :: Maybe Text -- ^ 
  , leaderboardFullResponseRankMode :: Maybe Text -- ^ 
  , leaderboardFullResponseSortType :: Maybe Text -- ^ 
  , leaderboardFullResponseLimitation :: Maybe Int -- ^ 
  , leaderboardFullResponseTitle :: Maybe Text -- ^ 
  , leaderboardFullResponseDescription :: Maybe Text -- ^ 
  , leaderboardFullResponseMetaData :: Maybe Text -- ^ 
  , leaderboardFullResponseIconAsset :: Maybe AssetResponse -- ^ 
  , leaderboardFullResponseBannerAsset :: Maybe AssetResponse -- ^ 
  , leaderboardFullResponseActive :: Maybe Bool -- ^ 
  , leaderboardFullResponseApplication :: Maybe ApplicationMiniResponse -- ^ 
  , leaderboardFullResponseLeaderboardRankings :: Maybe RankListResponse -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON LeaderboardFullResponse where
  parseJSON = genericParseJSON optionsLeaderboardFullResponse
instance ToJSON LeaderboardFullResponse where
  toJSON = genericToJSON optionsLeaderboardFullResponse

optionsLeaderboardFullResponse :: Options
optionsLeaderboardFullResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("leaderboardFullResponseLeaderboardId", "leaderboardId")
      , ("leaderboardFullResponseRankType", "rankType")
      , ("leaderboardFullResponseRankMode", "rankMode")
      , ("leaderboardFullResponseSortType", "sortType")
      , ("leaderboardFullResponseLimitation", "limitation")
      , ("leaderboardFullResponseTitle", "title")
      , ("leaderboardFullResponseDescription", "description")
      , ("leaderboardFullResponseMetaData", "metaData")
      , ("leaderboardFullResponseIconAsset", "iconAsset")
      , ("leaderboardFullResponseBannerAsset", "bannerAsset")
      , ("leaderboardFullResponseActive", "active")
      , ("leaderboardFullResponseApplication", "application")
      , ("leaderboardFullResponseLeaderboardRankings", "leaderboardRankings")
      ]


-- | 
data LeaderboardResponse = LeaderboardResponse
  { leaderboardResponseLeaderboardId :: Maybe Integer -- ^ 
  , leaderboardResponseRankType :: Maybe Text -- ^ 
  , leaderboardResponseRankMode :: Maybe Text -- ^ 
  , leaderboardResponseSortType :: Maybe Text -- ^ 
  , leaderboardResponseLimitation :: Maybe Int -- ^ 
  , leaderboardResponseTitle :: Maybe Text -- ^ 
  , leaderboardResponseDescription :: Maybe Text -- ^ 
  , leaderboardResponseMetaData :: Maybe Text -- ^ 
  , leaderboardResponseIconAsset :: Maybe AssetResponse -- ^ 
  , leaderboardResponseBannerAsset :: Maybe AssetResponse -- ^ 
  , leaderboardResponseActive :: Maybe Bool -- ^ 
  , leaderboardResponseApplication :: Maybe ApplicationMiniResponse -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON LeaderboardResponse where
  parseJSON = genericParseJSON optionsLeaderboardResponse
instance ToJSON LeaderboardResponse where
  toJSON = genericToJSON optionsLeaderboardResponse

optionsLeaderboardResponse :: Options
optionsLeaderboardResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("leaderboardResponseLeaderboardId", "leaderboardId")
      , ("leaderboardResponseRankType", "rankType")
      , ("leaderboardResponseRankMode", "rankMode")
      , ("leaderboardResponseSortType", "sortType")
      , ("leaderboardResponseLimitation", "limitation")
      , ("leaderboardResponseTitle", "title")
      , ("leaderboardResponseDescription", "description")
      , ("leaderboardResponseMetaData", "metaData")
      , ("leaderboardResponseIconAsset", "iconAsset")
      , ("leaderboardResponseBannerAsset", "bannerAsset")
      , ("leaderboardResponseActive", "active")
      , ("leaderboardResponseApplication", "application")
      ]


-- | 
data Leg = Leg
  { legId :: Maybe Integer -- ^ 
  , legActive :: Maybe Bool -- ^ 
  , legValid :: Maybe Bool -- ^ 
  , legOwner :: Maybe Account -- ^ 
  , legParentOwner :: Maybe Account -- ^ 
  , legApplication :: Maybe Application -- ^ 
  , legDeviceId :: Maybe Text -- ^ 
  , legDistance :: Maybe Double -- ^ 
  , legDuration :: Maybe Integer -- ^ 
  , legStartLatitude :: Maybe Double -- ^ 
  , legStartLongitude :: Maybe Double -- ^ 
  , legStartAltitude :: Maybe Double -- ^ 
  , legStartDate :: Maybe UTCTime -- ^ 
  , legEndLatitude :: Maybe Double -- ^ 
  , legEndLongitude :: Maybe Double -- ^ 
  , legEndAltitude :: Maybe Double -- ^ 
  , legEndDate :: Maybe UTCTime -- ^ 
  , legType :: Maybe Text -- ^ 
  , legRetailerLocationId :: Maybe Integer -- ^ 
  , legFloorId :: Maybe Text -- ^ 
  , legSteps :: Maybe [Step] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Leg where
  parseJSON = genericParseJSON optionsLeg
instance ToJSON Leg where
  toJSON = genericToJSON optionsLeg

optionsLeg :: Options
optionsLeg =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("legId", "id")
      , ("legActive", "active")
      , ("legValid", "valid")
      , ("legOwner", "owner")
      , ("legParentOwner", "parentOwner")
      , ("legApplication", "application")
      , ("legDeviceId", "deviceId")
      , ("legDistance", "distance")
      , ("legDuration", "duration")
      , ("legStartLatitude", "startLatitude")
      , ("legStartLongitude", "startLongitude")
      , ("legStartAltitude", "startAltitude")
      , ("legStartDate", "startDate")
      , ("legEndLatitude", "endLatitude")
      , ("legEndLongitude", "endLongitude")
      , ("legEndAltitude", "endAltitude")
      , ("legEndDate", "endDate")
      , ("legType", "type")
      , ("legRetailerLocationId", "retailerLocationId")
      , ("legFloorId", "floorId")
      , ("legSteps", "steps")
      ]


-- | 
data LegResponse = LegResponse
  { legResponseValid :: Maybe Bool -- ^ 
  , legResponseMessage :: Maybe Text -- ^ 
  , legResponseVersion :: Maybe Double -- ^ 
  , legResponseSerializeNulls :: Maybe Bool -- ^ 
  , legResponseStartTimeLog :: Maybe Integer -- ^ 
  , legResponseErrorCode :: Maybe Text -- ^ 
  , legResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , legResponseAppKey :: Maybe Text -- ^ 
  , legResponseDistance :: Maybe Double -- ^ 
  , legResponseDuration :: Maybe Integer -- ^ 
  , legResponseStartLatitude :: Maybe Double -- ^ 
  , legResponseStartLongitude :: Maybe Double -- ^ 
  , legResponseStartAltitude :: Maybe Double -- ^ 
  , legResponseStartDate :: Maybe Integer -- ^ 
  , legResponseEndLatitude :: Maybe Double -- ^ 
  , legResponseEndLongitude :: Maybe Double -- ^ 
  , legResponseEndAltitude :: Maybe Double -- ^ 
  , legResponseEndDate :: Maybe Integer -- ^ 
  , legResponseCreated :: Maybe Integer -- ^ 
  , legResponseTags :: Maybe Text -- ^ 
  , legResponseDeviceId :: Maybe Text -- ^ 
  , legResponseAccountId :: Maybe Integer -- ^ 
  , legResponseDeviceSignature :: Maybe Text -- ^ 
  , legResponseParentAccountId :: Maybe Integer -- ^ 
  , legResponseSteps :: Maybe [StepResponse] -- ^ 
  , legResponseType :: Maybe Text -- ^ 
  , legResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON LegResponse where
  parseJSON = genericParseJSON optionsLegResponse
instance ToJSON LegResponse where
  toJSON = genericToJSON optionsLegResponse

optionsLegResponse :: Options
optionsLegResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("legResponseValid", "valid")
      , ("legResponseMessage", "message")
      , ("legResponseVersion", "version")
      , ("legResponseSerializeNulls", "serializeNulls")
      , ("legResponseStartTimeLog", "startTimeLog")
      , ("legResponseErrorCode", "errorCode")
      , ("legResponseRequest", "request")
      , ("legResponseAppKey", "appKey")
      , ("legResponseDistance", "distance")
      , ("legResponseDuration", "duration")
      , ("legResponseStartLatitude", "startLatitude")
      , ("legResponseStartLongitude", "startLongitude")
      , ("legResponseStartAltitude", "startAltitude")
      , ("legResponseStartDate", "startDate")
      , ("legResponseEndLatitude", "endLatitude")
      , ("legResponseEndLongitude", "endLongitude")
      , ("legResponseEndAltitude", "endAltitude")
      , ("legResponseEndDate", "endDate")
      , ("legResponseCreated", "created")
      , ("legResponseTags", "tags")
      , ("legResponseDeviceId", "deviceId")
      , ("legResponseAccountId", "accountId")
      , ("legResponseDeviceSignature", "deviceSignature")
      , ("legResponseParentAccountId", "parentAccountId")
      , ("legResponseSteps", "steps")
      , ("legResponseType", "type")
      , ("legResponseReturning", "returning")
      ]


-- | 
data LikableResponse = LikableResponse
  { likableResponseValid :: Maybe Bool -- ^ 
  , likableResponseMessage :: Maybe Text -- ^ 
  , likableResponseVersion :: Maybe Double -- ^ 
  , likableResponseSerializeNulls :: Maybe Bool -- ^ 
  , likableResponseStartTimeLog :: Maybe Integer -- ^ 
  , likableResponseErrorCode :: Maybe Text -- ^ 
  , likableResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , likableResponseLikeCount :: Maybe Integer -- ^ 
  , likableResponseDislikeCount :: Maybe Integer -- ^ 
  , likableResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON LikableResponse where
  parseJSON = genericParseJSON optionsLikableResponse
instance ToJSON LikableResponse where
  toJSON = genericToJSON optionsLikableResponse

optionsLikableResponse :: Options
optionsLikableResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("likableResponseValid", "valid")
      , ("likableResponseMessage", "message")
      , ("likableResponseVersion", "version")
      , ("likableResponseSerializeNulls", "serializeNulls")
      , ("likableResponseStartTimeLog", "startTimeLog")
      , ("likableResponseErrorCode", "errorCode")
      , ("likableResponseRequest", "request")
      , ("likableResponseLikeCount", "likeCount")
      , ("likableResponseDislikeCount", "dislikeCount")
      , ("likableResponseReturning", "returning")
      ]


-- | 
data LikeResponse = LikeResponse
  { likeResponseAccount :: Maybe AccountShortResponse -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON LikeResponse where
  parseJSON = genericParseJSON optionsLikeResponse
instance ToJSON LikeResponse where
  toJSON = genericToJSON optionsLikeResponse

optionsLikeResponse :: Options
optionsLikeResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("likeResponseAccount", "account")
      ]


-- | 
data LineItem = LineItem
  { lineItemDescription :: Maybe Text -- ^ 
  , lineItemItem :: Maybe Text -- ^ 
  , lineItemPricePerItem :: Maybe Int -- ^ 
  , lineItemTotal :: Maybe Int -- ^ 
  , lineItemTax :: Maybe Int -- ^ 
  , lineItemQuantity :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON LineItem where
  parseJSON = genericParseJSON optionsLineItem
instance ToJSON LineItem where
  toJSON = genericToJSON optionsLineItem

optionsLineItem :: Options
optionsLineItem =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("lineItemDescription", "description")
      , ("lineItemItem", "item")
      , ("lineItemPricePerItem", "pricePerItem")
      , ("lineItemTotal", "total")
      , ("lineItemTax", "tax")
      , ("lineItemQuantity", "quantity")
      ]


-- | 
data ListCountResponse = ListCountResponse
  { listCountResponseValid :: Maybe Bool -- ^ 
  , listCountResponseMessage :: Maybe Text -- ^ 
  , listCountResponseVersion :: Maybe Double -- ^ 
  , listCountResponseSerializeNulls :: Maybe Bool -- ^ 
  , listCountResponseStartTimeLog :: Maybe Integer -- ^ 
  , listCountResponseErrorCode :: Maybe Text -- ^ 
  , listCountResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , listCountResponseLocationOffersCount :: Maybe Integer -- ^ 
  , listCountResponseInstantOffersCount :: Maybe Integer -- ^ 
  , listCountResponseAllOffersCount :: Maybe Integer -- ^ 
  , listCountResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ListCountResponse where
  parseJSON = genericParseJSON optionsListCountResponse
instance ToJSON ListCountResponse where
  toJSON = genericToJSON optionsListCountResponse

optionsListCountResponse :: Options
optionsListCountResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("listCountResponseValid", "valid")
      , ("listCountResponseMessage", "message")
      , ("listCountResponseVersion", "version")
      , ("listCountResponseSerializeNulls", "serializeNulls")
      , ("listCountResponseStartTimeLog", "startTimeLog")
      , ("listCountResponseErrorCode", "errorCode")
      , ("listCountResponseRequest", "request")
      , ("listCountResponseLocationOffersCount", "locationOffersCount")
      , ("listCountResponseInstantOffersCount", "instantOffersCount")
      , ("listCountResponseAllOffersCount", "allOffersCount")
      , ("listCountResponseReturning", "returning")
      ]


-- | 
data ListResponse = ListResponse
  { listResponseValid :: Maybe Bool -- ^ 
  , listResponseMessage :: Maybe Text -- ^ 
  , listResponseVersion :: Maybe Double -- ^ 
  , listResponseSerializeNulls :: Maybe Bool -- ^ 
  , listResponseStartTimeLog :: Maybe Integer -- ^ 
  , listResponseErrorCode :: Maybe Text -- ^ 
  , listResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , listResponseItems :: Maybe [Value] -- ^ 
  , listResponseCount :: Maybe Int -- ^ 
  , listResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ListResponse where
  parseJSON = genericParseJSON optionsListResponse
instance ToJSON ListResponse where
  toJSON = genericToJSON optionsListResponse

optionsListResponse :: Options
optionsListResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("listResponseValid", "valid")
      , ("listResponseMessage", "message")
      , ("listResponseVersion", "version")
      , ("listResponseSerializeNulls", "serializeNulls")
      , ("listResponseStartTimeLog", "startTimeLog")
      , ("listResponseErrorCode", "errorCode")
      , ("listResponseRequest", "request")
      , ("listResponseItems", "items")
      , ("listResponseCount", "count")
      , ("listResponseReturning", "returning")
      ]


-- | 
data Listing = Listing
  { listingId :: Maybe Integer -- ^ 
  , listingActive :: Maybe Bool -- ^ 
  , listingValid :: Maybe Bool -- ^ 
  , listingOwner :: Maybe Account -- ^ 
  , listingName :: Maybe Text -- ^ 
  , listingDescription :: Maybe Text -- ^ 
  , listingStart :: Maybe UTCTime -- ^ 
  , listingEnd :: Maybe UTCTime -- ^ 
  , listingLocationName :: Maybe Text -- ^ 
  , listingLocationDescription :: Maybe Text -- ^ 
  , listingParticipants :: Maybe [Participant] -- ^ 
  , listingExternalId :: Maybe Text -- ^ 
  , listingExternalGroupId :: Maybe Text -- ^ 
  , listingFilters :: Maybe [Filter] -- ^ 
  , listingPrivate :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Listing where
  parseJSON = genericParseJSON optionsListing
instance ToJSON Listing where
  toJSON = genericToJSON optionsListing

optionsListing :: Options
optionsListing =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("listingId", "id")
      , ("listingActive", "active")
      , ("listingValid", "valid")
      , ("listingOwner", "owner")
      , ("listingName", "name")
      , ("listingDescription", "description")
      , ("listingStart", "start")
      , ("listingEnd", "end")
      , ("listingLocationName", "locationName")
      , ("listingLocationDescription", "locationDescription")
      , ("listingParticipants", "participants")
      , ("listingExternalId", "externalId")
      , ("listingExternalGroupId", "externalGroupId")
      , ("listingFilters", "filters")
      , ("listingPrivate", "private")
      ]


-- | 
data ListingFullResponse = ListingFullResponse
  { listingFullResponseId :: Maybe Integer -- ^ 
  , listingFullResponseName :: Maybe Text -- ^ 
  , listingFullResponseDescription :: Maybe Text -- ^ 
  , listingFullResponseStart :: Maybe Integer -- ^ 
  , listingFullResponseEnd :: Maybe Integer -- ^ 
  , listingFullResponseLocationName :: Maybe Text -- ^ 
  , listingFullResponseLocationDescription :: Maybe Text -- ^ 
  , listingFullResponsePrivateListing :: Maybe Bool -- ^ 
  , listingFullResponseActive :: Maybe Bool -- ^ 
  , listingFullResponseParticipants :: Maybe [ParticipantResponse] -- ^ 
  , listingFullResponseOwner :: Maybe AccountShortResponse -- ^ 
  , listingFullResponseFilters :: Maybe [FilterResponse] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ListingFullResponse where
  parseJSON = genericParseJSON optionsListingFullResponse
instance ToJSON ListingFullResponse where
  toJSON = genericToJSON optionsListingFullResponse

optionsListingFullResponse :: Options
optionsListingFullResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("listingFullResponseId", "id")
      , ("listingFullResponseName", "name")
      , ("listingFullResponseDescription", "description")
      , ("listingFullResponseStart", "start")
      , ("listingFullResponseEnd", "end")
      , ("listingFullResponseLocationName", "locationName")
      , ("listingFullResponseLocationDescription", "locationDescription")
      , ("listingFullResponsePrivateListing", "privateListing")
      , ("listingFullResponseActive", "active")
      , ("listingFullResponseParticipants", "participants")
      , ("listingFullResponseOwner", "owner")
      , ("listingFullResponseFilters", "filters")
      ]


-- | 
data ListingGroupResponse = ListingGroupResponse
  { listingGroupResponseCategory :: Maybe CategoryResponse -- ^ 
  , listingGroupResponseListings :: Maybe [ListingResponse] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ListingGroupResponse where
  parseJSON = genericParseJSON optionsListingGroupResponse
instance ToJSON ListingGroupResponse where
  toJSON = genericToJSON optionsListingGroupResponse

optionsListingGroupResponse :: Options
optionsListingGroupResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("listingGroupResponseCategory", "category")
      , ("listingGroupResponseListings", "listings")
      ]


-- | 
data ListingResponse = ListingResponse
  { listingResponseId :: Maybe Integer -- ^ 
  , listingResponseName :: Maybe Text -- ^ 
  , listingResponseDescription :: Maybe Text -- ^ 
  , listingResponseStart :: Maybe Integer -- ^ 
  , listingResponseEnd :: Maybe Integer -- ^ 
  , listingResponseLocationName :: Maybe Text -- ^ 
  , listingResponseLocationDescription :: Maybe Text -- ^ 
  , listingResponsePrivateListing :: Maybe Bool -- ^ 
  , listingResponseActive :: Maybe Bool -- ^ 
  , listingResponseParticipants :: Maybe [ParticipantResponse] -- ^ 
  , listingResponseOwner :: Maybe AccountShortResponse -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ListingResponse where
  parseJSON = genericParseJSON optionsListingResponse
instance ToJSON ListingResponse where
  toJSON = genericToJSON optionsListingResponse

optionsListingResponse :: Options
optionsListingResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("listingResponseId", "id")
      , ("listingResponseName", "name")
      , ("listingResponseDescription", "description")
      , ("listingResponseStart", "start")
      , ("listingResponseEnd", "end")
      , ("listingResponseLocationName", "locationName")
      , ("listingResponseLocationDescription", "locationDescription")
      , ("listingResponsePrivateListing", "privateListing")
      , ("listingResponseActive", "active")
      , ("listingResponseParticipants", "participants")
      , ("listingResponseOwner", "owner")
      ]


-- | 
data LoadResponse = LoadResponse
  { loadResponseId :: Maybe Text -- ^ 
  , loadResponseName :: Maybe Text -- ^ 
  , loadResponseSize :: Maybe Integer -- ^ 
  , loadResponseLoadingTime :: Maybe Integer -- ^ 
  , loadResponseSeparatePayloads :: Maybe Bool -- ^ 
  , loadResponsePickup :: Maybe StopResponse -- ^ 
  , loadResponseDropoff :: Maybe StopResponse -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON LoadResponse where
  parseJSON = genericParseJSON optionsLoadResponse
instance ToJSON LoadResponse where
  toJSON = genericToJSON optionsLoadResponse

optionsLoadResponse :: Options
optionsLoadResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("loadResponseId", "id")
      , ("loadResponseName", "name")
      , ("loadResponseSize", "size")
      , ("loadResponseLoadingTime", "loadingTime")
      , ("loadResponseSeparatePayloads", "separatePayloads")
      , ("loadResponsePickup", "pickup")
      , ("loadResponseDropoff", "dropoff")
      ]


-- | 
data LoadShortResponse = LoadShortResponse
  { loadShortResponseId :: Maybe Text -- ^ 
  , loadShortResponseName :: Maybe Text -- ^ 
  , loadShortResponseSize :: Maybe Integer -- ^ 
  , loadShortResponseLoadingTime :: Maybe Integer -- ^ 
  , loadShortResponseSeparatePayloads :: Maybe Bool -- ^ 
  , loadShortResponsePickup :: Maybe StopResponse -- ^ 
  , loadShortResponseDropoff :: Maybe StopResponse -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON LoadShortResponse where
  parseJSON = genericParseJSON optionsLoadShortResponse
instance ToJSON LoadShortResponse where
  toJSON = genericToJSON optionsLoadShortResponse

optionsLoadShortResponse :: Options
optionsLoadShortResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("loadShortResponseId", "id")
      , ("loadShortResponseName", "name")
      , ("loadShortResponseSize", "size")
      , ("loadShortResponseLoadingTime", "loadingTime")
      , ("loadShortResponseSeparatePayloads", "separatePayloads")
      , ("loadShortResponsePickup", "pickup")
      , ("loadShortResponseDropoff", "dropoff")
      ]


-- | 
data LocalTime = LocalTime
  { localTimeChronology :: Maybe Chronology -- ^ 
  , localTimeHourOfDay :: Maybe Int -- ^ 
  , localTimeMinuteOfHour :: Maybe Int -- ^ 
  , localTimeSecondOfMinute :: Maybe Int -- ^ 
  , localTimeMillisOfSecond :: Maybe Int -- ^ 
  , localTimeMillisOfDay :: Maybe Int -- ^ 
  , localTimeFields :: Maybe [DateTimeField] -- ^ 
  , localTimeValues :: Maybe [Int] -- ^ 
  , localTimeFieldTypes :: Maybe [DateTimeFieldType] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON LocalTime where
  parseJSON = genericParseJSON optionsLocalTime
instance ToJSON LocalTime where
  toJSON = genericToJSON optionsLocalTime

optionsLocalTime :: Options
optionsLocalTime =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("localTimeChronology", "chronology")
      , ("localTimeHourOfDay", "hourOfDay")
      , ("localTimeMinuteOfHour", "minuteOfHour")
      , ("localTimeSecondOfMinute", "secondOfMinute")
      , ("localTimeMillisOfSecond", "millisOfSecond")
      , ("localTimeMillisOfDay", "millisOfDay")
      , ("localTimeFields", "fields")
      , ("localTimeValues", "values")
      , ("localTimeFieldTypes", "fieldTypes")
      ]


-- | 
data Location = Location
  { locationId :: Maybe Integer -- ^ 
  , locationActive :: Maybe Bool -- ^ 
  , locationValid :: Maybe Bool -- ^ 
  , locationLatitude :: Maybe Double -- ^ 
  , locationLongitude :: Maybe Double -- ^ 
  , locationLocationDescription :: Maybe Text -- ^ 
  , locationName :: Maybe Text -- ^ 
  , locationTerritory :: Maybe Territory -- ^ 
  , locationHub :: Maybe ServiceHub -- ^ 
  , locationPicture :: Maybe Asset -- ^ 
  , locationNotes :: Maybe [Note] -- ^ 
  , locationNoteCount :: Maybe Integer -- ^ 
  , locationHomePhone :: Maybe Text -- ^ 
  , locationCellPhone :: Maybe Text -- ^ 
  , locationCellCarrier :: Maybe CellCarrier -- ^ 
  , locationBusinessPhone :: Maybe Text -- ^ 
  , locationBusinessPhoneExt :: Maybe Text -- ^ 
  , locationFaxNumber :: Maybe Text -- ^ 
  , locationTimeZone :: Maybe Text -- ^ 
  , locationUtcOffset :: Maybe Text -- ^ 
  , locationCode501c3 :: Maybe Text -- ^ 
  , locationEmailAddress :: Maybe Text -- ^ 
  , locationAddress :: Maybe Address -- ^ 
  , locationWeb :: Maybe Text -- ^ 
  , locationProgram :: Maybe Program -- ^ 
  , locationVisibility :: Maybe Text -- ^ 
  , locationGroupingId :: Maybe Text -- ^ 
  , locationDestination :: Maybe Bool -- ^ 
  , locationDockingTime :: Maybe Integer -- ^ 
  , locationUsageCount :: Maybe Integer -- ^ 
  , locationTimeFramesAllowed :: Maybe Text -- ^ 
  , locationLikes :: Maybe [YayOrNay] -- ^ 
  , locationLikeCount :: Maybe Integer -- ^ 
  , locationDislikeCount :: Maybe Integer -- ^ 
  , locationOwnerDisplay :: Maybe Text -- ^ 
  , locationContentName :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Location where
  parseJSON = genericParseJSON optionsLocation
instance ToJSON Location where
  toJSON = genericToJSON optionsLocation

optionsLocation :: Options
optionsLocation =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("locationId", "id")
      , ("locationActive", "active")
      , ("locationValid", "valid")
      , ("locationLatitude", "latitude")
      , ("locationLongitude", "longitude")
      , ("locationLocationDescription", "locationDescription")
      , ("locationName", "name")
      , ("locationTerritory", "territory")
      , ("locationHub", "hub")
      , ("locationPicture", "picture")
      , ("locationNotes", "notes")
      , ("locationNoteCount", "noteCount")
      , ("locationHomePhone", "homePhone")
      , ("locationCellPhone", "cellPhone")
      , ("locationCellCarrier", "cellCarrier")
      , ("locationBusinessPhone", "businessPhone")
      , ("locationBusinessPhoneExt", "businessPhoneExt")
      , ("locationFaxNumber", "faxNumber")
      , ("locationTimeZone", "timeZone")
      , ("locationUtcOffset", "utcOffset")
      , ("locationCode501c3", "code501c3")
      , ("locationEmailAddress", "emailAddress")
      , ("locationAddress", "address")
      , ("locationWeb", "web")
      , ("locationProgram", "program")
      , ("locationVisibility", "visibility")
      , ("locationGroupingId", "groupingId")
      , ("locationDestination", "destination")
      , ("locationDockingTime", "dockingTime")
      , ("locationUsageCount", "usageCount")
      , ("locationTimeFramesAllowed", "timeFramesAllowed")
      , ("locationLikes", "likes")
      , ("locationLikeCount", "likeCount")
      , ("locationDislikeCount", "dislikeCount")
      , ("locationOwnerDisplay", "ownerDisplay")
      , ("locationContentName", "contentName")
      ]


-- | 
data LocationResponse = LocationResponse
  { locationResponseValid :: Maybe Bool -- ^ 
  , locationResponseMessage :: Maybe Text -- ^ 
  , locationResponseVersion :: Maybe Double -- ^ 
  , locationResponseSerializeNulls :: Maybe Bool -- ^ 
  , locationResponseStartTimeLog :: Maybe Integer -- ^ 
  , locationResponseErrorCode :: Maybe Text -- ^ 
  , locationResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , locationResponseId :: Maybe Integer -- ^ 
  , locationResponseGetUnderscoredistanceUnderscoremiles :: Maybe Text -- ^ 
  , locationResponseZip :: Maybe Text -- ^ 
  , locationResponseName :: Maybe Text -- ^ 
  , locationResponseLatitude :: Maybe Text -- ^ 
  , locationResponseLongitude :: Maybe Text -- ^ 
  , locationResponseGetUnderscoresource :: Maybe Text -- ^ 
  , locationResponseType :: Maybe Text -- ^ 
  , locationResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON LocationResponse where
  parseJSON = genericParseJSON optionsLocationResponse
instance ToJSON LocationResponse where
  toJSON = genericToJSON optionsLocationResponse

optionsLocationResponse :: Options
optionsLocationResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("locationResponseValid", "valid")
      , ("locationResponseMessage", "message")
      , ("locationResponseVersion", "version")
      , ("locationResponseSerializeNulls", "serializeNulls")
      , ("locationResponseStartTimeLog", "startTimeLog")
      , ("locationResponseErrorCode", "errorCode")
      , ("locationResponseRequest", "request")
      , ("locationResponseId", "id")
      , ("locationResponseGetUnderscoredistanceUnderscoremiles", "get_distance_miles")
      , ("locationResponseZip", "zip")
      , ("locationResponseName", "name")
      , ("locationResponseLatitude", "latitude")
      , ("locationResponseLongitude", "longitude")
      , ("locationResponseGetUnderscoresource", "get_source")
      , ("locationResponseType", "type")
      , ("locationResponseReturning", "returning")
      ]


-- | 
data LocationSearchResponse = LocationSearchResponse
  { locationSearchResponseValid :: Maybe Bool -- ^ 
  , locationSearchResponseMessage :: Maybe Text -- ^ 
  , locationSearchResponseVersion :: Maybe Double -- ^ 
  , locationSearchResponseSerializeNulls :: Maybe Bool -- ^ 
  , locationSearchResponseStartTimeLog :: Maybe Integer -- ^ 
  , locationSearchResponseErrorCode :: Maybe Text -- ^ 
  , locationSearchResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , locationSearchResponseCount :: Maybe Integer -- ^ 
  , locationSearchResponseLocations :: Maybe [LocationResponse] -- ^ 
  , locationSearchResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON LocationSearchResponse where
  parseJSON = genericParseJSON optionsLocationSearchResponse
instance ToJSON LocationSearchResponse where
  toJSON = genericToJSON optionsLocationSearchResponse

optionsLocationSearchResponse :: Options
optionsLocationSearchResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("locationSearchResponseValid", "valid")
      , ("locationSearchResponseMessage", "message")
      , ("locationSearchResponseVersion", "version")
      , ("locationSearchResponseSerializeNulls", "serializeNulls")
      , ("locationSearchResponseStartTimeLog", "startTimeLog")
      , ("locationSearchResponseErrorCode", "errorCode")
      , ("locationSearchResponseRequest", "request")
      , ("locationSearchResponseCount", "count")
      , ("locationSearchResponseLocations", "locations")
      , ("locationSearchResponseReturning", "returning")
      ]


-- | 
data Media = Media
  { mediaMediaType :: Maybe Text -- ^ 
  , mediaCondition :: Maybe Text -- ^ 
  , mediaIsbn :: Maybe Text -- ^ 
  , mediaAsin :: Maybe Text -- ^ 
  , mediaCatalogNumbers :: Maybe [Text] -- ^ 
  , mediaDuration :: Maybe Int -- ^ 
  , mediaAuthor :: Maybe Text -- ^ 
  , mediaReleaseDate :: Maybe Integer -- ^ 
  , mediaAvailabilityDate :: Maybe Integer -- ^ 
  , mediaParentalRating :: Maybe Text -- ^ 
  , mediaCollections :: Maybe [Album] -- ^ 
  , mediaCollectionCount :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Media where
  parseJSON = genericParseJSON optionsMedia
instance ToJSON Media where
  toJSON = genericToJSON optionsMedia

optionsMedia :: Options
optionsMedia =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("mediaMediaType", "mediaType")
      , ("mediaCondition", "condition")
      , ("mediaIsbn", "isbn")
      , ("mediaAsin", "asin")
      , ("mediaCatalogNumbers", "catalogNumbers")
      , ("mediaDuration", "duration")
      , ("mediaAuthor", "author")
      , ("mediaReleaseDate", "releaseDate")
      , ("mediaAvailabilityDate", "availabilityDate")
      , ("mediaParentalRating", "parentalRating")
      , ("mediaCollections", "collections")
      , ("mediaCollectionCount", "collectionCount")
      ]


-- | 
data MediaOfferResponse = MediaOfferResponse
  { mediaOfferResponseTitle :: Maybe Text -- ^ 
  , mediaOfferResponseDetails :: Maybe Text -- ^ 
  , mediaOfferResponseSubTitle :: Maybe Text -- ^ 
  , mediaOfferResponseActivated :: Maybe Integer -- ^ 
  , mediaOfferResponseExpiration :: Maybe Integer -- ^ 
  , mediaOfferResponseRedeemableStart :: Maybe Integer -- ^ 
  , mediaOfferResponseRedeemableEnd :: Maybe Integer -- ^ 
  , mediaOfferResponseOfferType :: Maybe Text -- ^ 
  , mediaOfferResponseOfferVisibility :: Maybe Text -- ^ 
  , mediaOfferResponseFavorite :: Maybe Bool -- ^ 
  , mediaOfferResponseDeleted :: Maybe Integer -- ^ 
  , mediaOfferResponseFullPrice :: Maybe Double -- ^ 
  , mediaOfferResponseDiscountPrice :: Maybe Double -- ^ 
  , mediaOfferResponseImage :: Maybe Text -- ^ 
  , mediaOfferResponseImage1 :: Maybe Text -- ^ 
  , mediaOfferResponseImage2 :: Maybe Text -- ^ 
  , mediaOfferResponseImage3 :: Maybe Text -- ^ 
  , mediaOfferResponseImage4 :: Maybe Text -- ^ 
  , mediaOfferResponseImage5 :: Maybe Text -- ^ 
  , mediaOfferResponseImages :: Maybe [AssetResponse] -- ^ 
  , mediaOfferResponseBarcode :: Maybe Text -- ^ 
  , mediaOfferResponseExternalUrl :: Maybe Text -- ^ 
  , mediaOfferResponseActive :: Maybe Bool -- ^ 
  , mediaOfferResponseSubDetails :: Maybe Text -- ^ 
  , mediaOfferResponseExternalRedeemOptions :: Maybe Text -- ^ 
  , mediaOfferResponsePublisher :: Maybe Text -- ^ 
  , mediaOfferResponseViewedCount :: Maybe Int -- ^ 
  , mediaOfferResponseClickedCount :: Maybe Int -- ^ 
  , mediaOfferResponseAddedLimit :: Maybe Int -- ^ 
  , mediaOfferResponseAddedCount :: Maybe Int -- ^ 
  , mediaOfferResponseUsedCount :: Maybe Int -- ^ 
  , mediaOfferResponseRemovedCount :: Maybe Int -- ^ 
  , mediaOfferResponseTicketsReward :: Maybe Integer -- ^ 
  , mediaOfferResponseTicketsRewardType :: Maybe Text -- ^ 
  , mediaOfferResponseSpecialOfferType :: Maybe Text -- ^ 
  , mediaOfferResponseLikeCount :: Maybe Integer -- ^ 
  , mediaOfferResponseDislikeCount :: Maybe Integer -- ^ 
  , mediaOfferResponseFavoriteCount :: Maybe Integer -- ^ 
  , mediaOfferResponseNoteCount :: Maybe Integer -- ^ 
  , mediaOfferResponseBillableEntityId :: Maybe Integer -- ^ 
  , mediaOfferResponseResponsibleAccountId :: Maybe Integer -- ^ 
  , mediaOfferResponseAvailabilitySummary :: Maybe Text -- ^ 
  , mediaOfferResponseFlagCount :: Maybe Integer -- ^ 
  , mediaOfferResponseFlagThreshold :: Maybe Integer -- ^ 
  , mediaOfferResponseExternalId :: Maybe Text -- ^ 
  , mediaOfferResponseParentOffer :: Maybe BaseOfferResponse -- ^ 
  , mediaOfferResponseCategories :: Maybe [CategoryResponse] -- ^ 
  , mediaOfferResponseFilters :: Maybe [FilterResponse] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON MediaOfferResponse where
  parseJSON = genericParseJSON optionsMediaOfferResponse
instance ToJSON MediaOfferResponse where
  toJSON = genericToJSON optionsMediaOfferResponse

optionsMediaOfferResponse :: Options
optionsMediaOfferResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("mediaOfferResponseTitle", "title")
      , ("mediaOfferResponseDetails", "details")
      , ("mediaOfferResponseSubTitle", "subTitle")
      , ("mediaOfferResponseActivated", "activated")
      , ("mediaOfferResponseExpiration", "expiration")
      , ("mediaOfferResponseRedeemableStart", "redeemableStart")
      , ("mediaOfferResponseRedeemableEnd", "redeemableEnd")
      , ("mediaOfferResponseOfferType", "offerType")
      , ("mediaOfferResponseOfferVisibility", "offerVisibility")
      , ("mediaOfferResponseFavorite", "favorite")
      , ("mediaOfferResponseDeleted", "deleted")
      , ("mediaOfferResponseFullPrice", "fullPrice")
      , ("mediaOfferResponseDiscountPrice", "discountPrice")
      , ("mediaOfferResponseImage", "image")
      , ("mediaOfferResponseImage1", "image1")
      , ("mediaOfferResponseImage2", "image2")
      , ("mediaOfferResponseImage3", "image3")
      , ("mediaOfferResponseImage4", "image4")
      , ("mediaOfferResponseImage5", "image5")
      , ("mediaOfferResponseImages", "images")
      , ("mediaOfferResponseBarcode", "barcode")
      , ("mediaOfferResponseExternalUrl", "externalUrl")
      , ("mediaOfferResponseActive", "active")
      , ("mediaOfferResponseSubDetails", "subDetails")
      , ("mediaOfferResponseExternalRedeemOptions", "externalRedeemOptions")
      , ("mediaOfferResponsePublisher", "publisher")
      , ("mediaOfferResponseViewedCount", "viewedCount")
      , ("mediaOfferResponseClickedCount", "clickedCount")
      , ("mediaOfferResponseAddedLimit", "addedLimit")
      , ("mediaOfferResponseAddedCount", "addedCount")
      , ("mediaOfferResponseUsedCount", "usedCount")
      , ("mediaOfferResponseRemovedCount", "removedCount")
      , ("mediaOfferResponseTicketsReward", "ticketsReward")
      , ("mediaOfferResponseTicketsRewardType", "ticketsRewardType")
      , ("mediaOfferResponseSpecialOfferType", "specialOfferType")
      , ("mediaOfferResponseLikeCount", "likeCount")
      , ("mediaOfferResponseDislikeCount", "dislikeCount")
      , ("mediaOfferResponseFavoriteCount", "favoriteCount")
      , ("mediaOfferResponseNoteCount", "noteCount")
      , ("mediaOfferResponseBillableEntityId", "billableEntityId")
      , ("mediaOfferResponseResponsibleAccountId", "responsibleAccountId")
      , ("mediaOfferResponseAvailabilitySummary", "availabilitySummary")
      , ("mediaOfferResponseFlagCount", "flagCount")
      , ("mediaOfferResponseFlagThreshold", "flagThreshold")
      , ("mediaOfferResponseExternalId", "externalId")
      , ("mediaOfferResponseParentOffer", "parentOffer")
      , ("mediaOfferResponseCategories", "categories")
      , ("mediaOfferResponseFilters", "filters")
      ]


-- | 
data MediaResponse = MediaResponse
  { mediaResponseMediaType :: Maybe Text -- ^ 
  , mediaResponseDuration :: Maybe Int -- ^ 
  , mediaResponseAuthor :: Maybe Text -- ^ 
  , mediaResponseReleaseDate :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON MediaResponse where
  parseJSON = genericParseJSON optionsMediaResponse
instance ToJSON MediaResponse where
  toJSON = genericToJSON optionsMediaResponse

optionsMediaResponse :: Options
optionsMediaResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("mediaResponseMediaType", "mediaType")
      , ("mediaResponseDuration", "duration")
      , ("mediaResponseAuthor", "author")
      , ("mediaResponseReleaseDate", "releaseDate")
      ]


-- | 
data MessageListResponse = MessageListResponse
  { messageListResponseStart :: Maybe Int -- ^ 
  , messageListResponseLimit :: Maybe Int -- ^ 
  , messageListResponseCountTotal :: Maybe Integer -- ^ 
  , messageListResponseItems :: Maybe [MessageResponse] -- ^ 
  , messageListResponseCount :: Maybe Int -- ^ 
  , messageListResponseHasMoreResults :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON MessageListResponse where
  parseJSON = genericParseJSON optionsMessageListResponse
instance ToJSON MessageListResponse where
  toJSON = genericToJSON optionsMessageListResponse

optionsMessageListResponse :: Options
optionsMessageListResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("messageListResponseStart", "start")
      , ("messageListResponseLimit", "limit")
      , ("messageListResponseCountTotal", "countTotal")
      , ("messageListResponseItems", "items")
      , ("messageListResponseCount", "count")
      , ("messageListResponseHasMoreResults", "hasMoreResults")
      ]


-- | 
data MessageResponse = MessageResponse
  { messageResponseMessage :: Maybe Text -- ^ 
  , messageResponseCode :: Maybe Int -- ^ 
  , messageResponseIds :: Maybe Text -- ^ 
  , messageResponseUpdateValue :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON MessageResponse where
  parseJSON = genericParseJSON optionsMessageResponse
instance ToJSON MessageResponse where
  toJSON = genericToJSON optionsMessageResponse

optionsMessageResponse :: Options
optionsMessageResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("messageResponseMessage", "message")
      , ("messageResponseCode", "code")
      , ("messageResponseIds", "ids")
      , ("messageResponseUpdateValue", "updateValue")
      ]


-- | 
data Mission = Mission
  { missionId :: Maybe Integer -- ^ 
  , missionActive :: Maybe Bool -- ^ 
  , missionValid :: Maybe Bool -- ^ 
  , missionOwner :: Maybe Account -- ^ 
  , missionMissionType :: Maybe Text -- ^ 
  , missionTitle :: Maybe Text -- ^ 
  , missionDescription :: Maybe Text -- ^ 
  , missionCostToPlay :: Maybe Int -- ^ 
  , missionCostToPlayType :: Maybe Text -- ^ 
  , missionGames :: Maybe [Game] -- ^ 
  , missionAudiences :: Maybe [Audience] -- ^ 
  , missionStartDate :: Maybe UTCTime -- ^ 
  , missionEndDate :: Maybe UTCTime -- ^ 
  , missionSequenceType :: Maybe Text -- ^ 
  , missionAuthorOverride :: Maybe Text -- ^ 
  , missionIcon :: Maybe Asset -- ^ 
  , missionImage :: Maybe Asset -- ^ 
  , missionOffers :: Maybe [Offer] -- ^ 
  , missionVisibility :: Maybe Text -- ^ 
  , missionTask :: Maybe MissionTask -- ^ 
  , missionPoints :: Maybe Integer -- ^ 
  , missionTicketType :: Maybe Text -- ^ 
  , missionTicketCount :: Maybe Integer -- ^ 
  , missionAllocateTickets :: Maybe Bool -- ^ 
  , missionBillableEntity :: Maybe BillableEntity -- ^ 
  , missionBalance :: Maybe Double -- ^ 
  , missionStartingLimit :: Maybe Int -- ^ 
  , missionAvailableLimit :: Maybe Int -- ^ 
  , missionInviteCount :: Maybe Int -- ^ 
  , missionAcceptedCount :: Maybe Int -- ^ 
  , missionInviteStatus :: Maybe Text -- ^ 
  , missionChildCount :: Maybe Integer -- ^ 
  , missionSecondsBetweenLevels :: Maybe Int -- ^ 
  , missionSecondsBetweenPacks :: Maybe Int -- ^ 
  , missionMaximumLevelLength :: Maybe Int -- ^ 
  , missionEnableBuyBack :: Maybe Bool -- ^ 
  , missionActivePack :: Maybe Pack -- ^ 
  , missionMinimumToPlay :: Maybe Int -- ^ 
  , missionFixedReward :: Maybe Bool -- ^ 
  , missionRefunded :: Maybe Bool -- ^ 
  , missionNotificationsCreated :: Maybe Bool -- ^ 
  , missionRewarded :: Maybe Bool -- ^ 
  , missionExternalId :: Maybe Integer -- ^ 
  , missionAdvancedReporting :: Maybe Bool -- ^ 
  , missionSplitReward :: Maybe Text -- ^ 
  , missionJoinCode :: Maybe Text -- ^ 
  , missionFirstPack :: Maybe Pack -- ^ 
  , missionAllGameLevels :: Maybe [GameLevel] -- ^ 
  , missionAllPacks :: Maybe [Pack] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Mission where
  parseJSON = genericParseJSON optionsMission
instance ToJSON Mission where
  toJSON = genericToJSON optionsMission

optionsMission :: Options
optionsMission =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("missionId", "id")
      , ("missionActive", "active")
      , ("missionValid", "valid")
      , ("missionOwner", "owner")
      , ("missionMissionType", "missionType")
      , ("missionTitle", "title")
      , ("missionDescription", "description")
      , ("missionCostToPlay", "costToPlay")
      , ("missionCostToPlayType", "costToPlayType")
      , ("missionGames", "games")
      , ("missionAudiences", "audiences")
      , ("missionStartDate", "startDate")
      , ("missionEndDate", "endDate")
      , ("missionSequenceType", "sequenceType")
      , ("missionAuthorOverride", "authorOverride")
      , ("missionIcon", "icon")
      , ("missionImage", "image")
      , ("missionOffers", "offers")
      , ("missionVisibility", "visibility")
      , ("missionTask", "task")
      , ("missionPoints", "points")
      , ("missionTicketType", "ticketType")
      , ("missionTicketCount", "ticketCount")
      , ("missionAllocateTickets", "allocateTickets")
      , ("missionBillableEntity", "billableEntity")
      , ("missionBalance", "balance")
      , ("missionStartingLimit", "startingLimit")
      , ("missionAvailableLimit", "availableLimit")
      , ("missionInviteCount", "inviteCount")
      , ("missionAcceptedCount", "acceptedCount")
      , ("missionInviteStatus", "inviteStatus")
      , ("missionChildCount", "childCount")
      , ("missionSecondsBetweenLevels", "secondsBetweenLevels")
      , ("missionSecondsBetweenPacks", "secondsBetweenPacks")
      , ("missionMaximumLevelLength", "maximumLevelLength")
      , ("missionEnableBuyBack", "enableBuyBack")
      , ("missionActivePack", "activePack")
      , ("missionMinimumToPlay", "minimumToPlay")
      , ("missionFixedReward", "fixedReward")
      , ("missionRefunded", "refunded")
      , ("missionNotificationsCreated", "notificationsCreated")
      , ("missionRewarded", "rewarded")
      , ("missionExternalId", "externalId")
      , ("missionAdvancedReporting", "advancedReporting")
      , ("missionSplitReward", "splitReward")
      , ("missionJoinCode", "joinCode")
      , ("missionFirstPack", "firstPack")
      , ("missionAllGameLevels", "allGameLevels")
      , ("missionAllPacks", "allPacks")
      ]


-- | 
data MissionFormatResponse = MissionFormatResponse
  { missionFormatResponseMissionFormatId :: Maybe Integer -- ^ 
  , missionFormatResponseFormatType :: Maybe Text -- ^ 
  , missionFormatResponseActive :: Maybe Bool -- ^ 
  , missionFormatResponseName :: Maybe Text -- ^ 
  , missionFormatResponseDescription :: Maybe Text -- ^ 
  , missionFormatResponseFormat :: Maybe Text -- ^ 
  , missionFormatResponseSuffix :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON MissionFormatResponse where
  parseJSON = genericParseJSON optionsMissionFormatResponse
instance ToJSON MissionFormatResponse where
  toJSON = genericToJSON optionsMissionFormatResponse

optionsMissionFormatResponse :: Options
optionsMissionFormatResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("missionFormatResponseMissionFormatId", "missionFormatId")
      , ("missionFormatResponseFormatType", "formatType")
      , ("missionFormatResponseActive", "active")
      , ("missionFormatResponseName", "name")
      , ("missionFormatResponseDescription", "description")
      , ("missionFormatResponseFormat", "format")
      , ("missionFormatResponseSuffix", "suffix")
      ]


-- | 
data MissionInviteResponse = MissionInviteResponse
  { missionInviteResponseId :: Maybe Integer -- ^ 
  , missionInviteResponseStatus :: Maybe Text -- ^ 
  , missionInviteResponseTitle :: Maybe Text -- ^ 
  , missionInviteResponseDescription :: Maybe Text -- ^ 
  , missionInviteResponseOwner :: Maybe AccountShortResponse -- ^ 
  , missionInviteResponsePermissionableId :: Maybe Integer -- ^ 
  , missionInviteResponsePermissionableType :: Maybe Text -- ^ 
  , missionInviteResponseRanked :: Maybe Bool -- ^ 
  , missionInviteResponseRewarded :: Maybe Bool -- ^ 
  , missionInviteResponseStartDate :: Maybe Integer -- ^ 
  , missionInviteResponseEndDate :: Maybe Integer -- ^ 
  , missionInviteResponseUpdated :: Maybe Integer -- ^ 
  , missionInviteResponseBuyBackAvailable :: Maybe Bool -- ^ 
  , missionInviteResponseInviteStatus :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON MissionInviteResponse where
  parseJSON = genericParseJSON optionsMissionInviteResponse
instance ToJSON MissionInviteResponse where
  toJSON = genericToJSON optionsMissionInviteResponse

optionsMissionInviteResponse :: Options
optionsMissionInviteResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("missionInviteResponseId", "id")
      , ("missionInviteResponseStatus", "status")
      , ("missionInviteResponseTitle", "title")
      , ("missionInviteResponseDescription", "description")
      , ("missionInviteResponseOwner", "owner")
      , ("missionInviteResponsePermissionableId", "permissionableId")
      , ("missionInviteResponsePermissionableType", "permissionableType")
      , ("missionInviteResponseRanked", "ranked")
      , ("missionInviteResponseRewarded", "rewarded")
      , ("missionInviteResponseStartDate", "startDate")
      , ("missionInviteResponseEndDate", "endDate")
      , ("missionInviteResponseUpdated", "updated")
      , ("missionInviteResponseBuyBackAvailable", "buyBackAvailable")
      , ("missionInviteResponseInviteStatus", "inviteStatus")
      ]


-- | 
data MissionListResponse = MissionListResponse
  { missionListResponseStart :: Maybe Int -- ^ 
  , missionListResponseLimit :: Maybe Int -- ^ 
  , missionListResponseCountTotal :: Maybe Integer -- ^ 
  , missionListResponseItems :: Maybe [MissionResponse] -- ^ 
  , missionListResponseHasMoreResults :: Maybe Bool -- ^ 
  , missionListResponseCount :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON MissionListResponse where
  parseJSON = genericParseJSON optionsMissionListResponse
instance ToJSON MissionListResponse where
  toJSON = genericToJSON optionsMissionListResponse

optionsMissionListResponse :: Options
optionsMissionListResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("missionListResponseStart", "start")
      , ("missionListResponseLimit", "limit")
      , ("missionListResponseCountTotal", "countTotal")
      , ("missionListResponseItems", "items")
      , ("missionListResponseHasMoreResults", "hasMoreResults")
      , ("missionListResponseCount", "count")
      ]


-- | 
data MissionResponse = MissionResponse
  { missionResponseAction :: Maybe Text -- ^ 
  , missionResponseHighestAppVersion :: Maybe Text -- ^ 
  , missionResponseMissionId :: Maybe Integer -- ^ 
  , missionResponseTicketsEarned :: Maybe Integer -- ^ 
  , missionResponseCostToPlay :: Maybe Int -- ^ 
  , missionResponseCostToPlayType :: Maybe Text -- ^ 
  , missionResponseOwner :: Maybe AccountShortResponse -- ^ 
  , missionResponseTitle :: Maybe Text -- ^ 
  , missionResponseDescription :: Maybe Text -- ^ 
  , missionResponseAuthorOverride :: Maybe Text -- ^ 
  , missionResponseIcon :: Maybe AssetShortResponse -- ^ 
  , missionResponseImage :: Maybe AssetShortResponse -- ^ 
  , missionResponseSequenceType :: Maybe Text -- ^ 
  , missionResponseUpdatedDate :: Maybe Integer -- ^ 
  , missionResponseStartDate :: Maybe Integer -- ^ 
  , missionResponseEndDate :: Maybe Integer -- ^ 
  , missionResponseMissionType :: Maybe Text -- ^ 
  , missionResponseActive :: Maybe Bool -- ^ 
  , missionResponseBalance :: Maybe Double -- ^ 
  , missionResponseAvailableLimit :: Maybe Int -- ^ 
  , missionResponseInviteCount :: Maybe Int -- ^ 
  , missionResponseAcceptedCount :: Maybe Int -- ^ 
  , missionResponseChildCount :: Maybe Integer -- ^ 
  , missionResponseEnableBuyBack :: Maybe Bool -- ^ 
  , missionResponseMinimumToPlay :: Maybe Int -- ^ 
  , missionResponseRewarded :: Maybe Bool -- ^ 
  , missionResponseRefunded :: Maybe Bool -- ^ 
  , missionResponseJoinCode :: Maybe Text -- ^ 
  , missionResponseRewards :: Maybe [RewardResponse] -- ^ 
  , missionResponseGames :: Maybe GameListResponse -- ^ 
  , missionResponseScores :: Maybe ScoreListResponse -- ^ 
  , missionResponseUserPermissionsList :: Maybe UserPermissionsListResponse -- ^ 
  , missionResponseResults :: Maybe [NameStringValueResponse] -- ^ 
  , missionResponseInviteStatus :: Maybe Text -- ^ 
  , missionResponseAudiences :: Maybe [AudienceResponse] -- ^ 
  , missionResponseMissionInviteId :: Maybe Integer -- ^ 
  , missionResponseMissionInvite :: Maybe MissionInviteResponse -- ^ 
  , missionResponseInvitee :: Maybe AccountShortResponse -- ^ 
  , missionResponseFormatType :: Maybe Text -- ^ 
  , missionResponseCreatives :: Maybe [CreativeResponse] -- ^ 
  , missionResponseFixedReward :: Maybe Bool -- ^ 
  , missionResponseAllocateTickets :: Maybe Bool -- ^ 
  , missionResponseTicketType :: Maybe Text -- ^ 
  , missionResponseTicketCount :: Maybe Integer -- ^ 
  , missionResponsePoints :: Maybe Integer -- ^ 
  , missionResponseSplitReward :: Maybe Text -- ^ 
  , missionResponseSecondsBetweenLevels :: Maybe Int -- ^ 
  , missionResponseSecondsBetweenPacks :: Maybe Int -- ^ 
  , missionResponseAdvancedReporting :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON MissionResponse where
  parseJSON = genericParseJSON optionsMissionResponse
instance ToJSON MissionResponse where
  toJSON = genericToJSON optionsMissionResponse

optionsMissionResponse :: Options
optionsMissionResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("missionResponseAction", "action")
      , ("missionResponseHighestAppVersion", "highestAppVersion")
      , ("missionResponseMissionId", "missionId")
      , ("missionResponseTicketsEarned", "ticketsEarned")
      , ("missionResponseCostToPlay", "costToPlay")
      , ("missionResponseCostToPlayType", "costToPlayType")
      , ("missionResponseOwner", "owner")
      , ("missionResponseTitle", "title")
      , ("missionResponseDescription", "description")
      , ("missionResponseAuthorOverride", "authorOverride")
      , ("missionResponseIcon", "icon")
      , ("missionResponseImage", "image")
      , ("missionResponseSequenceType", "sequenceType")
      , ("missionResponseUpdatedDate", "updatedDate")
      , ("missionResponseStartDate", "startDate")
      , ("missionResponseEndDate", "endDate")
      , ("missionResponseMissionType", "missionType")
      , ("missionResponseActive", "active")
      , ("missionResponseBalance", "balance")
      , ("missionResponseAvailableLimit", "availableLimit")
      , ("missionResponseInviteCount", "inviteCount")
      , ("missionResponseAcceptedCount", "acceptedCount")
      , ("missionResponseChildCount", "childCount")
      , ("missionResponseEnableBuyBack", "enableBuyBack")
      , ("missionResponseMinimumToPlay", "minimumToPlay")
      , ("missionResponseRewarded", "rewarded")
      , ("missionResponseRefunded", "refunded")
      , ("missionResponseJoinCode", "joinCode")
      , ("missionResponseRewards", "rewards")
      , ("missionResponseGames", "games")
      , ("missionResponseScores", "scores")
      , ("missionResponseUserPermissionsList", "userPermissionsList")
      , ("missionResponseResults", "results")
      , ("missionResponseInviteStatus", "inviteStatus")
      , ("missionResponseAudiences", "audiences")
      , ("missionResponseMissionInviteId", "missionInviteId")
      , ("missionResponseMissionInvite", "missionInvite")
      , ("missionResponseInvitee", "invitee")
      , ("missionResponseFormatType", "formatType")
      , ("missionResponseCreatives", "creatives")
      , ("missionResponseFixedReward", "fixedReward")
      , ("missionResponseAllocateTickets", "allocateTickets")
      , ("missionResponseTicketType", "ticketType")
      , ("missionResponseTicketCount", "ticketCount")
      , ("missionResponsePoints", "points")
      , ("missionResponseSplitReward", "splitReward")
      , ("missionResponseSecondsBetweenLevels", "secondsBetweenLevels")
      , ("missionResponseSecondsBetweenPacks", "secondsBetweenPacks")
      , ("missionResponseAdvancedReporting", "advancedReporting")
      ]


-- | 
data MissionShortResponse = MissionShortResponse
  { missionShortResponseAction :: Maybe Text -- ^ 
  , missionShortResponseHighestAppVersion :: Maybe Text -- ^ 
  , missionShortResponseMissionId :: Maybe Integer -- ^ 
  , missionShortResponseTicketsEarned :: Maybe Integer -- ^ 
  , missionShortResponseCostToPlay :: Maybe Int -- ^ 
  , missionShortResponseCostToPlayType :: Maybe Text -- ^ 
  , missionShortResponseOwner :: Maybe AccountShortResponse -- ^ 
  , missionShortResponseTitle :: Maybe Text -- ^ 
  , missionShortResponseDescription :: Maybe Text -- ^ 
  , missionShortResponseAuthorOverride :: Maybe Text -- ^ 
  , missionShortResponseIcon :: Maybe AssetShortResponse -- ^ 
  , missionShortResponseImage :: Maybe AssetShortResponse -- ^ 
  , missionShortResponseSequenceType :: Maybe Text -- ^ 
  , missionShortResponseUpdatedDate :: Maybe Integer -- ^ 
  , missionShortResponseStartDate :: Maybe Integer -- ^ 
  , missionShortResponseEndDate :: Maybe Integer -- ^ 
  , missionShortResponseMissionType :: Maybe Text -- ^ 
  , missionShortResponseActive :: Maybe Bool -- ^ 
  , missionShortResponseBalance :: Maybe Double -- ^ 
  , missionShortResponseAvailableLimit :: Maybe Int -- ^ 
  , missionShortResponseInviteCount :: Maybe Int -- ^ 
  , missionShortResponseAcceptedCount :: Maybe Int -- ^ 
  , missionShortResponseChildCount :: Maybe Integer -- ^ 
  , missionShortResponseEnableBuyBack :: Maybe Bool -- ^ 
  , missionShortResponseMinimumToPlay :: Maybe Int -- ^ 
  , missionShortResponseRewarded :: Maybe Bool -- ^ 
  , missionShortResponseRefunded :: Maybe Bool -- ^ 
  , missionShortResponseJoinCode :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON MissionShortResponse where
  parseJSON = genericParseJSON optionsMissionShortResponse
instance ToJSON MissionShortResponse where
  toJSON = genericToJSON optionsMissionShortResponse

optionsMissionShortResponse :: Options
optionsMissionShortResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("missionShortResponseAction", "action")
      , ("missionShortResponseHighestAppVersion", "highestAppVersion")
      , ("missionShortResponseMissionId", "missionId")
      , ("missionShortResponseTicketsEarned", "ticketsEarned")
      , ("missionShortResponseCostToPlay", "costToPlay")
      , ("missionShortResponseCostToPlayType", "costToPlayType")
      , ("missionShortResponseOwner", "owner")
      , ("missionShortResponseTitle", "title")
      , ("missionShortResponseDescription", "description")
      , ("missionShortResponseAuthorOverride", "authorOverride")
      , ("missionShortResponseIcon", "icon")
      , ("missionShortResponseImage", "image")
      , ("missionShortResponseSequenceType", "sequenceType")
      , ("missionShortResponseUpdatedDate", "updatedDate")
      , ("missionShortResponseStartDate", "startDate")
      , ("missionShortResponseEndDate", "endDate")
      , ("missionShortResponseMissionType", "missionType")
      , ("missionShortResponseActive", "active")
      , ("missionShortResponseBalance", "balance")
      , ("missionShortResponseAvailableLimit", "availableLimit")
      , ("missionShortResponseInviteCount", "inviteCount")
      , ("missionShortResponseAcceptedCount", "acceptedCount")
      , ("missionShortResponseChildCount", "childCount")
      , ("missionShortResponseEnableBuyBack", "enableBuyBack")
      , ("missionShortResponseMinimumToPlay", "minimumToPlay")
      , ("missionShortResponseRewarded", "rewarded")
      , ("missionShortResponseRefunded", "refunded")
      , ("missionShortResponseJoinCode", "joinCode")
      ]


-- | 
data MissionTask = MissionTask
  { missionTaskId :: Maybe Integer -- ^ 
  , missionTaskActive :: Maybe Bool -- ^ 
  , missionTaskValid :: Maybe Bool -- ^ 
  , missionTaskName :: Maybe Text -- ^ 
  , missionTaskDescription :: Maybe Text -- ^ 
  , missionTaskFormat :: Maybe Text -- ^ 
  , missionTaskSuffix :: Maybe Text -- ^ 
  , missionTaskTaskType :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON MissionTask where
  parseJSON = genericParseJSON optionsMissionTask
instance ToJSON MissionTask where
  toJSON = genericToJSON optionsMissionTask

optionsMissionTask :: Options
optionsMissionTask =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("missionTaskId", "id")
      , ("missionTaskActive", "active")
      , ("missionTaskValid", "valid")
      , ("missionTaskName", "name")
      , ("missionTaskDescription", "description")
      , ("missionTaskFormat", "format")
      , ("missionTaskSuffix", "suffix")
      , ("missionTaskTaskType", "taskType")
      ]


-- | 
data NameStringValueResponse = NameStringValueResponse
  { nameStringValueResponseName :: Maybe Text -- ^ 
  , nameStringValueResponseValueString :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON NameStringValueResponse where
  parseJSON = genericParseJSON optionsNameStringValueResponse
instance ToJSON NameStringValueResponse where
  toJSON = genericToJSON optionsNameStringValueResponse

optionsNameStringValueResponse :: Options
optionsNameStringValueResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("nameStringValueResponseName", "name")
      , ("nameStringValueResponseValueString", "valueString")
      ]


-- | 
data Node = Node
  { nodeX :: Maybe Int -- ^ 
  , nodeY :: Maybe Int -- ^ 
  , nodeZ :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Node where
  parseJSON = genericParseJSON optionsNode
instance ToJSON Node where
  toJSON = genericToJSON optionsNode

optionsNode :: Options
optionsNode =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("nodeX", "x")
      , ("nodeY", "y")
      , ("nodeZ", "z")
      ]


-- | 
data NodeRequest = NodeRequest
  { nodeRequestX :: Maybe Int -- ^ 
  , nodeRequestY :: Maybe Int -- ^ 
  , nodeRequestZ :: Maybe Int -- ^ 
  , nodeRequestLatitude :: Maybe Double -- ^ 
  , nodeRequestLongitude :: Maybe Double -- ^ 
  , nodeRequestAltitude :: Maybe Double -- ^ 
  , nodeRequestDate :: Maybe Integer -- ^ 
  , nodeRequestIsWaypoint :: Maybe Bool -- ^ 
  , nodeRequestAccountId :: Maybe Integer -- ^ 
  , nodeRequestNode :: Maybe Node -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON NodeRequest where
  parseJSON = genericParseJSON optionsNodeRequest
instance ToJSON NodeRequest where
  toJSON = genericToJSON optionsNodeRequest

optionsNodeRequest :: Options
optionsNodeRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("nodeRequestX", "x")
      , ("nodeRequestY", "y")
      , ("nodeRequestZ", "z")
      , ("nodeRequestLatitude", "latitude")
      , ("nodeRequestLongitude", "longitude")
      , ("nodeRequestAltitude", "altitude")
      , ("nodeRequestDate", "date")
      , ("nodeRequestIsWaypoint", "isWaypoint")
      , ("nodeRequestAccountId", "accountId")
      , ("nodeRequestNode", "node")
      ]


-- | 
data Note = Note
  { noteId :: Maybe Integer -- ^ 
  , noteActive :: Maybe Bool -- ^ 
  , noteValid :: Maybe Bool -- ^ 
  , noteLatitude :: Maybe Double -- ^ 
  , noteLongitude :: Maybe Double -- ^ 
  , noteLocationDescription :: Maybe Text -- ^ 
  , noteOwner :: Maybe Account -- ^ 
  , noteNotableType :: Maybe Text -- ^ 
  , noteNotableId :: Maybe Integer -- ^ 
  , noteNoteTag :: Maybe Text -- ^ 
  , noteNotes :: Maybe [Note] -- ^ 
  , noteLikes :: Maybe [YayOrNay] -- ^ 
  , noteAssets :: Maybe [Asset] -- ^ 
  , noteNoteDescription :: Maybe Text -- ^ 
  , noteLikeCount :: Maybe Integer -- ^ 
  , noteDislikeCount :: Maybe Integer -- ^ 
  , noteNoteCount :: Maybe Integer -- ^ 
  , noteFlags :: Maybe [Flag] -- ^ 
  , noteFlagCount :: Maybe Integer -- ^ 
  , noteFlagThreshold :: Maybe FlagThreshold -- ^ 
  , noteContentName :: Maybe Text -- ^ 
  , noteDefaultThreshold :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Note where
  parseJSON = genericParseJSON optionsNote
instance ToJSON Note where
  toJSON = genericToJSON optionsNote

optionsNote :: Options
optionsNote =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("noteId", "id")
      , ("noteActive", "active")
      , ("noteValid", "valid")
      , ("noteLatitude", "latitude")
      , ("noteLongitude", "longitude")
      , ("noteLocationDescription", "locationDescription")
      , ("noteOwner", "owner")
      , ("noteNotableType", "notableType")
      , ("noteNotableId", "notableId")
      , ("noteNoteTag", "noteTag")
      , ("noteNotes", "notes")
      , ("noteLikes", "likes")
      , ("noteAssets", "assets")
      , ("noteNoteDescription", "noteDescription")
      , ("noteLikeCount", "likeCount")
      , ("noteDislikeCount", "dislikeCount")
      , ("noteNoteCount", "noteCount")
      , ("noteFlags", "flags")
      , ("noteFlagCount", "flagCount")
      , ("noteFlagThreshold", "flagThreshold")
      , ("noteContentName", "contentName")
      , ("noteDefaultThreshold", "defaultThreshold")
      ]


-- | 
data NoteFullResponse = NoteFullResponse
  { noteFullResponseValid :: Maybe Bool -- ^ 
  , noteFullResponseMessage :: Maybe Text -- ^ 
  , noteFullResponseVersion :: Maybe Double -- ^ 
  , noteFullResponseSerializeNulls :: Maybe Bool -- ^ 
  , noteFullResponseStartTimeLog :: Maybe Integer -- ^ 
  , noteFullResponseErrorCode :: Maybe Text -- ^ 
  , noteFullResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , noteFullResponseNoteId :: Maybe Integer -- ^ 
  , noteFullResponseComment :: Maybe Text -- ^ 
  , noteFullResponseTags :: Maybe Text -- ^ 
  , noteFullResponseLikesCount :: Maybe Integer -- ^ 
  , noteFullResponseDislikesCount :: Maybe Integer -- ^ 
  , noteFullResponseDateCreated :: Maybe Integer -- ^ 
  , noteFullResponseCreatedDate :: Maybe Integer -- ^ 
  , noteFullResponseUpdatedDate :: Maybe Integer -- ^ 
  , noteFullResponseOwner :: Maybe AccountShortResponse -- ^ 
  , noteFullResponseLatitude :: Maybe Double -- ^ 
  , noteFullResponseLongitude :: Maybe Double -- ^ 
  , noteFullResponseLocationDescription :: Maybe Text -- ^ 
  , noteFullResponseAttachedAssets :: Maybe [AssetShortResponse] -- ^ 
  , noteFullResponseLikes :: Maybe [LikeResponse] -- ^ 
  , noteFullResponseHasLiked :: Maybe Bool -- ^ 
  , noteFullResponseHasDisliked :: Maybe Bool -- ^ 
  , noteFullResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON NoteFullResponse where
  parseJSON = genericParseJSON optionsNoteFullResponse
instance ToJSON NoteFullResponse where
  toJSON = genericToJSON optionsNoteFullResponse

optionsNoteFullResponse :: Options
optionsNoteFullResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("noteFullResponseValid", "valid")
      , ("noteFullResponseMessage", "message")
      , ("noteFullResponseVersion", "version")
      , ("noteFullResponseSerializeNulls", "serializeNulls")
      , ("noteFullResponseStartTimeLog", "startTimeLog")
      , ("noteFullResponseErrorCode", "errorCode")
      , ("noteFullResponseRequest", "request")
      , ("noteFullResponseNoteId", "noteId")
      , ("noteFullResponseComment", "comment")
      , ("noteFullResponseTags", "tags")
      , ("noteFullResponseLikesCount", "likesCount")
      , ("noteFullResponseDislikesCount", "dislikesCount")
      , ("noteFullResponseDateCreated", "dateCreated")
      , ("noteFullResponseCreatedDate", "createdDate")
      , ("noteFullResponseUpdatedDate", "updatedDate")
      , ("noteFullResponseOwner", "owner")
      , ("noteFullResponseLatitude", "latitude")
      , ("noteFullResponseLongitude", "longitude")
      , ("noteFullResponseLocationDescription", "locationDescription")
      , ("noteFullResponseAttachedAssets", "attachedAssets")
      , ("noteFullResponseLikes", "likes")
      , ("noteFullResponseHasLiked", "hasLiked")
      , ("noteFullResponseHasDisliked", "hasDisliked")
      , ("noteFullResponseReturning", "returning")
      ]


-- | 
data NoteResponse = NoteResponse
  { noteResponseValid :: Maybe Bool -- ^ 
  , noteResponseMessage :: Maybe Text -- ^ 
  , noteResponseVersion :: Maybe Double -- ^ 
  , noteResponseSerializeNulls :: Maybe Bool -- ^ 
  , noteResponseStartTimeLog :: Maybe Integer -- ^ 
  , noteResponseErrorCode :: Maybe Text -- ^ 
  , noteResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , noteResponseNoteId :: Maybe Integer -- ^ 
  , noteResponseComment :: Maybe Text -- ^ 
  , noteResponseTags :: Maybe Text -- ^ 
  , noteResponseLikesCount :: Maybe Integer -- ^ 
  , noteResponseDislikesCount :: Maybe Integer -- ^ 
  , noteResponseDateCreated :: Maybe Integer -- ^ 
  , noteResponseCreatedDate :: Maybe Integer -- ^ 
  , noteResponseUpdatedDate :: Maybe Integer -- ^ 
  , noteResponseOwner :: Maybe AccountShortResponse -- ^ 
  , noteResponseLatitude :: Maybe Double -- ^ 
  , noteResponseLongitude :: Maybe Double -- ^ 
  , noteResponseLocationDescription :: Maybe Text -- ^ 
  , noteResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON NoteResponse where
  parseJSON = genericParseJSON optionsNoteResponse
instance ToJSON NoteResponse where
  toJSON = genericToJSON optionsNoteResponse

optionsNoteResponse :: Options
optionsNoteResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("noteResponseValid", "valid")
      , ("noteResponseMessage", "message")
      , ("noteResponseVersion", "version")
      , ("noteResponseSerializeNulls", "serializeNulls")
      , ("noteResponseStartTimeLog", "startTimeLog")
      , ("noteResponseErrorCode", "errorCode")
      , ("noteResponseRequest", "request")
      , ("noteResponseNoteId", "noteId")
      , ("noteResponseComment", "comment")
      , ("noteResponseTags", "tags")
      , ("noteResponseLikesCount", "likesCount")
      , ("noteResponseDislikesCount", "dislikesCount")
      , ("noteResponseDateCreated", "dateCreated")
      , ("noteResponseCreatedDate", "createdDate")
      , ("noteResponseUpdatedDate", "updatedDate")
      , ("noteResponseOwner", "owner")
      , ("noteResponseLatitude", "latitude")
      , ("noteResponseLongitude", "longitude")
      , ("noteResponseLocationDescription", "locationDescription")
      , ("noteResponseReturning", "returning")
      ]


-- | 
data NotificationMessageListResponse = NotificationMessageListResponse
  { notificationMessageListResponseValid :: Maybe Bool -- ^ 
  , notificationMessageListResponseMessage :: Maybe Text -- ^ 
  , notificationMessageListResponseVersion :: Maybe Double -- ^ 
  , notificationMessageListResponseSerializeNulls :: Maybe Bool -- ^ 
  , notificationMessageListResponseStartTimeLog :: Maybe Integer -- ^ 
  , notificationMessageListResponseErrorCode :: Maybe Text -- ^ 
  , notificationMessageListResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , notificationMessageListResponseItems :: Maybe [NotificationMessageResponse] -- ^ 
  , notificationMessageListResponseCount :: Maybe Int -- ^ 
  , notificationMessageListResponseHasMoreResults :: Maybe Bool -- ^ 
  , notificationMessageListResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON NotificationMessageListResponse where
  parseJSON = genericParseJSON optionsNotificationMessageListResponse
instance ToJSON NotificationMessageListResponse where
  toJSON = genericToJSON optionsNotificationMessageListResponse

optionsNotificationMessageListResponse :: Options
optionsNotificationMessageListResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("notificationMessageListResponseValid", "valid")
      , ("notificationMessageListResponseMessage", "message")
      , ("notificationMessageListResponseVersion", "version")
      , ("notificationMessageListResponseSerializeNulls", "serializeNulls")
      , ("notificationMessageListResponseStartTimeLog", "startTimeLog")
      , ("notificationMessageListResponseErrorCode", "errorCode")
      , ("notificationMessageListResponseRequest", "request")
      , ("notificationMessageListResponseItems", "items")
      , ("notificationMessageListResponseCount", "count")
      , ("notificationMessageListResponseHasMoreResults", "hasMoreResults")
      , ("notificationMessageListResponseReturning", "returning")
      ]


-- | 
data NotificationMessageResponse = NotificationMessageResponse
  { notificationMessageResponseSender :: Maybe AccountShortResponse -- ^ 
  , notificationMessageResponseEvent :: Maybe Text -- ^ 
  , notificationMessageResponseNotificationMessage :: Maybe Text -- ^ 
  , notificationMessageResponseCreated :: Maybe Integer -- ^ 
  , notificationMessageResponseHasRead :: Maybe Bool -- ^ 
  , notificationMessageResponseContentId :: Maybe Integer -- ^ 
  , notificationMessageResponseContentType :: Maybe Text -- ^ 
  , notificationMessageResponseContentName :: Maybe Text -- ^ 
  , notificationMessageResponseParentId :: Maybe Integer -- ^ 
  , notificationMessageResponseParentType :: Maybe Text -- ^ 
  , notificationMessageResponseActionCategory :: Maybe Text -- ^ 
  , notificationMessageResponseThumbnailURL :: Maybe Text -- ^ 
  , notificationMessageResponseCoverURL :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON NotificationMessageResponse where
  parseJSON = genericParseJSON optionsNotificationMessageResponse
instance ToJSON NotificationMessageResponse where
  toJSON = genericToJSON optionsNotificationMessageResponse

optionsNotificationMessageResponse :: Options
optionsNotificationMessageResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("notificationMessageResponseSender", "sender")
      , ("notificationMessageResponseEvent", "event")
      , ("notificationMessageResponseNotificationMessage", "notificationMessage")
      , ("notificationMessageResponseCreated", "created")
      , ("notificationMessageResponseHasRead", "hasRead")
      , ("notificationMessageResponseContentId", "contentId")
      , ("notificationMessageResponseContentType", "contentType")
      , ("notificationMessageResponseContentName", "contentName")
      , ("notificationMessageResponseParentId", "parentId")
      , ("notificationMessageResponseParentType", "parentType")
      , ("notificationMessageResponseActionCategory", "actionCategory")
      , ("notificationMessageResponseThumbnailURL", "thumbnailURL")
      , ("notificationMessageResponseCoverURL", "coverURL")
      ]


-- | 
data NotificationRecipientResponse = NotificationRecipientResponse
  { notificationRecipientResponseAccountId :: Maybe Integer -- ^ 
  , notificationRecipientResponseLocationDisplay :: Maybe Text -- ^ 
  , notificationRecipientResponseDisplay :: Maybe Text -- ^ 
  , notificationRecipientResponseUsername :: Maybe Text -- ^ 
  , notificationRecipientResponseAccountType :: Maybe Text -- ^ 
  , notificationRecipientResponseProfileImage :: Maybe Text -- ^ 
  , notificationRecipientResponseGender :: Maybe Text -- ^ 
  , notificationRecipientResponseContactEmail :: Maybe Text -- ^ 
  , notificationRecipientResponseApplicationId :: Maybe Integer -- ^ 
  , notificationRecipientResponseAppName :: Maybe Text -- ^ 
  , notificationRecipientResponseHasApns :: Maybe Bool -- ^ 
  , notificationRecipientResponseHasGcm :: Maybe Bool -- ^ 
  , notificationRecipientResponseHasEmail :: Maybe Bool -- ^ 
  , notificationRecipientResponseHasSms :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON NotificationRecipientResponse where
  parseJSON = genericParseJSON optionsNotificationRecipientResponse
instance ToJSON NotificationRecipientResponse where
  toJSON = genericToJSON optionsNotificationRecipientResponse

optionsNotificationRecipientResponse :: Options
optionsNotificationRecipientResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("notificationRecipientResponseAccountId", "accountId")
      , ("notificationRecipientResponseLocationDisplay", "locationDisplay")
      , ("notificationRecipientResponseDisplay", "display")
      , ("notificationRecipientResponseUsername", "username")
      , ("notificationRecipientResponseAccountType", "accountType")
      , ("notificationRecipientResponseProfileImage", "profileImage")
      , ("notificationRecipientResponseGender", "gender")
      , ("notificationRecipientResponseContactEmail", "contactEmail")
      , ("notificationRecipientResponseApplicationId", "applicationId")
      , ("notificationRecipientResponseAppName", "appName")
      , ("notificationRecipientResponseHasApns", "hasApns")
      , ("notificationRecipientResponseHasGcm", "hasGcm")
      , ("notificationRecipientResponseHasEmail", "hasEmail")
      , ("notificationRecipientResponseHasSms", "hasSms")
      ]


-- | 
data NotificationRecipientResponseListResponse = NotificationRecipientResponseListResponse
  { notificationRecipientResponseListResponseItems :: Maybe [Value] -- ^ 
  , notificationRecipientResponseListResponseCount :: Maybe Int -- ^ 
  , notificationRecipientResponseListResponseStartIndexAudiences :: Maybe Int -- ^ 
  , notificationRecipientResponseListResponseStartIndexGroups :: Maybe Int -- ^ 
  , notificationRecipientResponseListResponseTotal :: Maybe Integer -- ^ 
  , notificationRecipientResponseListResponseCountAudiences :: Maybe Integer -- ^ 
  , notificationRecipientResponseListResponseCountGroups :: Maybe Integer -- ^ 
  , notificationRecipientResponseListResponseHasMoreResults :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON NotificationRecipientResponseListResponse where
  parseJSON = genericParseJSON optionsNotificationRecipientResponseListResponse
instance ToJSON NotificationRecipientResponseListResponse where
  toJSON = genericToJSON optionsNotificationRecipientResponseListResponse

optionsNotificationRecipientResponseListResponse :: Options
optionsNotificationRecipientResponseListResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("notificationRecipientResponseListResponseItems", "items")
      , ("notificationRecipientResponseListResponseCount", "count")
      , ("notificationRecipientResponseListResponseStartIndexAudiences", "startIndexAudiences")
      , ("notificationRecipientResponseListResponseStartIndexGroups", "startIndexGroups")
      , ("notificationRecipientResponseListResponseTotal", "total")
      , ("notificationRecipientResponseListResponseCountAudiences", "countAudiences")
      , ("notificationRecipientResponseListResponseCountGroups", "countGroups")
      , ("notificationRecipientResponseListResponseHasMoreResults", "hasMoreResults")
      ]


-- | 
data NotificationSettingsResponse = NotificationSettingsResponse
  { notificationSettingsResponseBlockedNotifications :: Maybe [Text] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON NotificationSettingsResponse where
  parseJSON = genericParseJSON optionsNotificationSettingsResponse
instance ToJSON NotificationSettingsResponse where
  toJSON = genericToJSON optionsNotificationSettingsResponse

optionsNotificationSettingsResponse :: Options
optionsNotificationSettingsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("notificationSettingsResponseBlockedNotifications", "blockedNotifications")
      ]


-- | 
data NotificationTemplateResponse = NotificationTemplateResponse
  { notificationTemplateResponseNotificationTemplateId :: Maybe Integer -- ^ 
  , notificationTemplateResponseEvent :: Maybe Text -- ^ 
  , notificationTemplateResponseConduit :: Maybe Text -- ^ 
  , notificationTemplateResponseTitle :: Maybe Text -- ^ 
  , notificationTemplateResponseBody :: Maybe Text -- ^ 
  , notificationTemplateResponsePublicBody :: Maybe Text -- ^ 
  , notificationTemplateResponseApplication :: Maybe ApplicationMiniResponse -- ^ 
  , notificationTemplateResponseUpdated :: Maybe Integer -- ^ 
  , notificationTemplateResponseCreated :: Maybe Integer -- ^ 
  , notificationTemplateResponseTags :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON NotificationTemplateResponse where
  parseJSON = genericParseJSON optionsNotificationTemplateResponse
instance ToJSON NotificationTemplateResponse where
  toJSON = genericToJSON optionsNotificationTemplateResponse

optionsNotificationTemplateResponse :: Options
optionsNotificationTemplateResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("notificationTemplateResponseNotificationTemplateId", "notificationTemplateId")
      , ("notificationTemplateResponseEvent", "event")
      , ("notificationTemplateResponseConduit", "conduit")
      , ("notificationTemplateResponseTitle", "title")
      , ("notificationTemplateResponseBody", "body")
      , ("notificationTemplateResponsePublicBody", "publicBody")
      , ("notificationTemplateResponseApplication", "application")
      , ("notificationTemplateResponseUpdated", "updated")
      , ("notificationTemplateResponseCreated", "created")
      , ("notificationTemplateResponseTags", "tags")
      ]


-- | 
data ObjectStoreResponse = ObjectStoreResponse
  { objectStoreResponseJsonObject :: Maybe JsonObject -- ^ 
  , objectStoreResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ObjectStoreResponse where
  parseJSON = genericParseJSON optionsObjectStoreResponse
instance ToJSON ObjectStoreResponse where
  toJSON = genericToJSON optionsObjectStoreResponse

optionsObjectStoreResponse :: Options
optionsObjectStoreResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("objectStoreResponseJsonObject", "jsonObject")
      , ("objectStoreResponseRequest", "request")
      ]


-- | 
data Offer = Offer
  { offerId :: Maybe Integer -- ^ 
  , offerActive :: Maybe Bool -- ^ 
  , offerValid :: Maybe Bool -- ^ 
  , offerTestField :: Maybe Text -- ^ 
  , offerBillableEntity :: Maybe BillableEntity -- ^ 
  , offerOfferLocations :: Maybe [OfferLocation] -- ^ 
  , offerMissions :: Maybe [Mission] -- ^ 
  , offerActivated :: Maybe UTCTime -- ^ 
  , offerExpires :: Maybe UTCTime -- ^ 
  , offerRedeemableStart :: Maybe UTCTime -- ^ 
  , offerRedeemableEnd :: Maybe UTCTime -- ^ 
  , offerTitle :: Maybe Text -- ^ 
  , offerSubTitle :: Maybe Text -- ^ 
  , offerType :: Maybe Text -- ^ 
  , offerSpecialOfferType :: Maybe Text -- ^ 
  , offerDetails :: Maybe Text -- ^ 
  , offerSubDetails :: Maybe Text -- ^ 
  , offerFinePrint :: Maybe Text -- ^ 
  , offerGetThereNowNotification :: Maybe Text -- ^ 
  , offerMaxPrints :: Maybe Int -- ^ 
  , offerViewLimit :: Maybe Int -- ^ 
  , offerFeatured :: Maybe Bool -- ^ 
  , offerReplaced :: Maybe Bool -- ^ 
  , offerShowRemaining :: Maybe Bool -- ^ 
  , offerShowRedeemed :: Maybe Bool -- ^ 
  , offerParentOffer :: Maybe Offer -- ^ 
  , offerArtwork :: Maybe Asset -- ^ 
  , offerOfferImage1 :: Maybe Asset -- ^ 
  , offerOfferImage2 :: Maybe Asset -- ^ 
  , offerOfferImage3 :: Maybe Asset -- ^ 
  , offerOfferImage4 :: Maybe Asset -- ^ 
  , offerOfferImage5 :: Maybe Asset -- ^ 
  , offerBarCode :: Maybe Asset -- ^ 
  , offerBarCodeType :: Maybe Text -- ^ 
  , offerBarCodeEntry :: Maybe Text -- ^ 
  , offerCategories :: Maybe [Category] -- ^ 
  , offerFilters :: Maybe [Filter] -- ^ 
  , offerTicketType :: Maybe Text -- ^ 
  , offerAllocateTickets :: Maybe Bool -- ^ 
  , offerTicketPriceType :: Maybe Text -- ^ 
  , offerTicketPrice :: Maybe Integer -- ^ 
  , offerFullPrice :: Maybe Double -- ^ 
  , offerDiscountPrice :: Maybe Double -- ^ 
  , offerAvailableLimit :: Maybe Int -- ^ 
  , offerAvailableLimitPerUser :: Maybe Int -- ^ 
  , offerAddedLimit :: Maybe Int -- ^ 
  , offerUsedCount :: Maybe Int -- ^ 
  , offerAddedCount :: Maybe Int -- ^ 
  , offerRemovedCount :: Maybe Int -- ^ 
  , offerViewedCount :: Maybe Int -- ^ 
  , offerClickedCount :: Maybe Int -- ^ 
  , offerOfferVisibility :: Maybe Text -- ^ 
  , offerOfferProcessorId :: Maybe Text -- ^ 
  , offerExternalId :: Maybe Text -- ^ 
  , offerExternalUrl :: Maybe Text -- ^ 
  , offerExternalUntrackedUrl :: Maybe Text -- ^ 
  , offerSqootId :: Maybe Integer -- ^ 
  , offerSqootUrl :: Maybe Text -- ^ 
  , offerSqootCategorySlug :: Maybe Text -- ^ 
  , offerSqootCategoryName :: Maybe Text -- ^ 
  , offerYipitId :: Maybe Integer -- ^ 
  , offerRedeemAuthOptions :: Maybe Text -- ^ 
  , offerPublisher :: Maybe Text -- ^ 
  , offerProduct :: Maybe Product -- ^ 
  , offerMedia :: Maybe Media -- ^ 
  , offerEvent :: Maybe Event -- ^ 
  , offerDevice :: Maybe Device -- ^ 
  , offerNotes :: Maybe [Note] -- ^ 
  , offerNoteCount :: Maybe Integer -- ^ 
  , offerFavoriteCount :: Maybe Integer -- ^ 
  , offerHasRatings :: Maybe Bool -- ^ 
  , offerLikes :: Maybe [YayOrNay] -- ^ 
  , offerLikeCount :: Maybe Integer -- ^ 
  , offerDislikeCount :: Maybe Integer -- ^ 
  , offerAvailabilitySummary :: Maybe Text -- ^ 
  , offerFlags :: Maybe [Flag] -- ^ 
  , offerFlagCount :: Maybe Integer -- ^ 
  , offerFlagThreshold :: Maybe FlagThreshold -- ^ 
  , offerSavings :: Maybe Double -- ^ 
  , offerClickStream :: Maybe Double -- ^ 
  , offerTicketCount :: Maybe Integer -- ^ 
  , offerDisplay :: Maybe Text -- ^ 
  , offerAppKey :: Maybe Text -- ^ 
  , offerCategoryTree :: Maybe Text -- ^ 
  , offerFilterTree :: Maybe Text -- ^ 
  , offerIndexable :: Maybe Bool -- ^ 
  , offerBillableId :: Maybe Integer -- ^ 
  , offerSubType :: Maybe Text -- ^ 
  , offerContentName :: Maybe Text -- ^ 
  , offerDefaultThreshold :: Maybe Integer -- ^ 
  , offerContentAsset :: Maybe Asset -- ^ 
  , offerOwner :: Maybe Account -- ^ 
  , offerSecondaryType :: Maybe Text -- ^ 
  , offerDiscountPercentage :: Maybe Double -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Offer where
  parseJSON = genericParseJSON optionsOffer
instance ToJSON Offer where
  toJSON = genericToJSON optionsOffer

optionsOffer :: Options
optionsOffer =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("offerId", "id")
      , ("offerActive", "active")
      , ("offerValid", "valid")
      , ("offerTestField", "testField")
      , ("offerBillableEntity", "billableEntity")
      , ("offerOfferLocations", "offerLocations")
      , ("offerMissions", "missions")
      , ("offerActivated", "activated")
      , ("offerExpires", "expires")
      , ("offerRedeemableStart", "redeemableStart")
      , ("offerRedeemableEnd", "redeemableEnd")
      , ("offerTitle", "title")
      , ("offerSubTitle", "subTitle")
      , ("offerType", "type")
      , ("offerSpecialOfferType", "specialOfferType")
      , ("offerDetails", "details")
      , ("offerSubDetails", "subDetails")
      , ("offerFinePrint", "finePrint")
      , ("offerGetThereNowNotification", "getThereNowNotification")
      , ("offerMaxPrints", "maxPrints")
      , ("offerViewLimit", "viewLimit")
      , ("offerFeatured", "featured")
      , ("offerReplaced", "replaced")
      , ("offerShowRemaining", "showRemaining")
      , ("offerShowRedeemed", "showRedeemed")
      , ("offerParentOffer", "parentOffer")
      , ("offerArtwork", "artwork")
      , ("offerOfferImage1", "offerImage1")
      , ("offerOfferImage2", "offerImage2")
      , ("offerOfferImage3", "offerImage3")
      , ("offerOfferImage4", "offerImage4")
      , ("offerOfferImage5", "offerImage5")
      , ("offerBarCode", "barCode")
      , ("offerBarCodeType", "barCodeType")
      , ("offerBarCodeEntry", "barCodeEntry")
      , ("offerCategories", "categories")
      , ("offerFilters", "filters")
      , ("offerTicketType", "ticketType")
      , ("offerAllocateTickets", "allocateTickets")
      , ("offerTicketPriceType", "ticketPriceType")
      , ("offerTicketPrice", "ticketPrice")
      , ("offerFullPrice", "fullPrice")
      , ("offerDiscountPrice", "discountPrice")
      , ("offerAvailableLimit", "availableLimit")
      , ("offerAvailableLimitPerUser", "availableLimitPerUser")
      , ("offerAddedLimit", "addedLimit")
      , ("offerUsedCount", "usedCount")
      , ("offerAddedCount", "addedCount")
      , ("offerRemovedCount", "removedCount")
      , ("offerViewedCount", "viewedCount")
      , ("offerClickedCount", "clickedCount")
      , ("offerOfferVisibility", "offerVisibility")
      , ("offerOfferProcessorId", "offerProcessorId")
      , ("offerExternalId", "externalId")
      , ("offerExternalUrl", "externalUrl")
      , ("offerExternalUntrackedUrl", "externalUntrackedUrl")
      , ("offerSqootId", "sqootId")
      , ("offerSqootUrl", "sqootUrl")
      , ("offerSqootCategorySlug", "sqootCategorySlug")
      , ("offerSqootCategoryName", "sqootCategoryName")
      , ("offerYipitId", "yipitId")
      , ("offerRedeemAuthOptions", "redeemAuthOptions")
      , ("offerPublisher", "publisher")
      , ("offerProduct", "product")
      , ("offerMedia", "media")
      , ("offerEvent", "event")
      , ("offerDevice", "device")
      , ("offerNotes", "notes")
      , ("offerNoteCount", "noteCount")
      , ("offerFavoriteCount", "favoriteCount")
      , ("offerHasRatings", "hasRatings")
      , ("offerLikes", "likes")
      , ("offerLikeCount", "likeCount")
      , ("offerDislikeCount", "dislikeCount")
      , ("offerAvailabilitySummary", "availabilitySummary")
      , ("offerFlags", "flags")
      , ("offerFlagCount", "flagCount")
      , ("offerFlagThreshold", "flagThreshold")
      , ("offerSavings", "savings")
      , ("offerClickStream", "clickStream")
      , ("offerTicketCount", "ticketCount")
      , ("offerDisplay", "display")
      , ("offerAppKey", "appKey")
      , ("offerCategoryTree", "categoryTree")
      , ("offerFilterTree", "filterTree")
      , ("offerIndexable", "indexable")
      , ("offerBillableId", "billableId")
      , ("offerSubType", "subType")
      , ("offerContentName", "contentName")
      , ("offerDefaultThreshold", "defaultThreshold")
      , ("offerContentAsset", "contentAsset")
      , ("offerOwner", "owner")
      , ("offerSecondaryType", "secondaryType")
      , ("offerDiscountPercentage", "discountPercentage")
      ]


-- | 
data OfferListResponse = OfferListResponse
  { offerListResponseValid :: Maybe Bool -- ^ 
  , offerListResponseMessage :: Maybe Text -- ^ 
  , offerListResponseVersion :: Maybe Double -- ^ 
  , offerListResponseSerializeNulls :: Maybe Bool -- ^ 
  , offerListResponseStartTimeLog :: Maybe Integer -- ^ 
  , offerListResponseErrorCode :: Maybe Text -- ^ 
  , offerListResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , offerListResponseItems :: Maybe [OfferResponse] -- ^ 
  , offerListResponseHasMoreResults :: Maybe Bool -- ^ 
  , offerListResponseCount :: Maybe Int -- ^ 
  , offerListResponseStart :: Maybe Int -- ^ 
  , offerListResponseLimit :: Maybe Int -- ^ 
  , offerListResponseCountTotal :: Maybe Integer -- ^ 
  , offerListResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON OfferListResponse where
  parseJSON = genericParseJSON optionsOfferListResponse
instance ToJSON OfferListResponse where
  toJSON = genericToJSON optionsOfferListResponse

optionsOfferListResponse :: Options
optionsOfferListResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("offerListResponseValid", "valid")
      , ("offerListResponseMessage", "message")
      , ("offerListResponseVersion", "version")
      , ("offerListResponseSerializeNulls", "serializeNulls")
      , ("offerListResponseStartTimeLog", "startTimeLog")
      , ("offerListResponseErrorCode", "errorCode")
      , ("offerListResponseRequest", "request")
      , ("offerListResponseItems", "items")
      , ("offerListResponseHasMoreResults", "hasMoreResults")
      , ("offerListResponseCount", "count")
      , ("offerListResponseStart", "start")
      , ("offerListResponseLimit", "limit")
      , ("offerListResponseCountTotal", "countTotal")
      , ("offerListResponseReturning", "returning")
      ]


-- | 
data OfferLocation = OfferLocation
  { offerLocationId :: Maybe Integer -- ^ 
  , offerLocationActive :: Maybe Bool -- ^ 
  , offerLocationValid :: Maybe Bool -- ^ 
  , offerLocationLatitude :: Maybe Double -- ^ 
  , offerLocationLongitude :: Maybe Double -- ^ 
  , offerLocationLocationDescription :: Maybe Text -- ^ 
  , offerLocationOffer :: Maybe Offer -- ^ 
  , offerLocationLocation :: Maybe RetailerLocation -- ^ 
  , offerLocationDistance :: Maybe Double -- ^ 
  , offerLocationAltitude :: Maybe Double -- ^ 
  , offerLocationCustomValue :: Maybe Double -- ^ 
  , offerLocationLocationDetail :: Maybe Text -- ^ 
  , offerLocationAudiences :: Maybe [Audience] -- ^ 
  , offerLocationQrInviteCode :: Maybe Asset -- ^ 
  , offerLocationNotes :: Maybe [Note] -- ^ 
  , offerLocationNoteCount :: Maybe Integer -- ^ 
  , offerLocationSearchIndexUpdated :: Maybe UTCTime -- ^ 
  , offerLocationInSearchIndex :: Maybe Bool -- ^ 
  , offerLocationFavoriteCount :: Maybe Integer -- ^ 
  , offerLocationAddedCount :: Maybe Int -- ^ 
  , offerLocationDisplay :: Maybe Text -- ^ 
  , offerLocationAppKey :: Maybe Text -- ^ 
  , offerLocationDevicePower :: Maybe Double -- ^ 
  , offerLocationPowerLoss :: Maybe Double -- ^ 
  , offerLocationUdid :: Maybe Text -- ^ 
  , offerLocationBillableId :: Maybe Integer -- ^ 
  , offerLocationSubType :: Maybe Text -- ^ 
  , offerLocationContentName :: Maybe Text -- ^ 
  , offerLocationContentAsset :: Maybe Asset -- ^ 
  , offerLocationOwner :: Maybe Account -- ^ 
  , offerLocationSecondaryType :: Maybe Text -- ^ 
  , offerLocationCategoryIds :: Maybe [Integer] -- ^ 
  , offerLocationFilterIds :: Maybe [Integer] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON OfferLocation where
  parseJSON = genericParseJSON optionsOfferLocation
instance ToJSON OfferLocation where
  toJSON = genericToJSON optionsOfferLocation

optionsOfferLocation :: Options
optionsOfferLocation =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("offerLocationId", "id")
      , ("offerLocationActive", "active")
      , ("offerLocationValid", "valid")
      , ("offerLocationLatitude", "latitude")
      , ("offerLocationLongitude", "longitude")
      , ("offerLocationLocationDescription", "locationDescription")
      , ("offerLocationOffer", "offer")
      , ("offerLocationLocation", "location")
      , ("offerLocationDistance", "distance")
      , ("offerLocationAltitude", "altitude")
      , ("offerLocationCustomValue", "customValue")
      , ("offerLocationLocationDetail", "locationDetail")
      , ("offerLocationAudiences", "audiences")
      , ("offerLocationQrInviteCode", "qrInviteCode")
      , ("offerLocationNotes", "notes")
      , ("offerLocationNoteCount", "noteCount")
      , ("offerLocationSearchIndexUpdated", "searchIndexUpdated")
      , ("offerLocationInSearchIndex", "inSearchIndex")
      , ("offerLocationFavoriteCount", "favoriteCount")
      , ("offerLocationAddedCount", "addedCount")
      , ("offerLocationDisplay", "display")
      , ("offerLocationAppKey", "appKey")
      , ("offerLocationDevicePower", "devicePower")
      , ("offerLocationPowerLoss", "powerLoss")
      , ("offerLocationUdid", "udid")
      , ("offerLocationBillableId", "billableId")
      , ("offerLocationSubType", "subType")
      , ("offerLocationContentName", "contentName")
      , ("offerLocationContentAsset", "contentAsset")
      , ("offerLocationOwner", "owner")
      , ("offerLocationSecondaryType", "secondaryType")
      , ("offerLocationCategoryIds", "categoryIds")
      , ("offerLocationFilterIds", "filterIds")
      ]


-- | 
data OfferResponse = OfferResponse
  { offerResponseValid :: Maybe Bool -- ^ 
  , offerResponseMessage :: Maybe Text -- ^ 
  , offerResponseVersion :: Maybe Double -- ^ 
  , offerResponseSerializeNulls :: Maybe Bool -- ^ 
  , offerResponseStartTimeLog :: Maybe Integer -- ^ 
  , offerResponseErrorCode :: Maybe Text -- ^ 
  , offerResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , offerResponseOfferLocationId :: Maybe Integer -- ^ 
  , offerResponseOfferId :: Maybe Integer -- ^ 
  , offerResponseRetailerId :: Maybe Integer -- ^ 
  , offerResponseTransactionId :: Maybe Integer -- ^ 
  , offerResponseFavoriteId :: Maybe Integer -- ^ 
  , offerResponseOfferName :: Maybe Text -- ^ 
  , offerResponseSubTitle :: Maybe Text -- ^ 
  , offerResponseLocationName :: Maybe Text -- ^ 
  , offerResponseStarts :: Maybe UTCTime -- ^ 
  , offerResponseExpires :: Maybe UTCTime -- ^ 
  , offerResponseActivated :: Maybe Integer -- ^ 
  , offerResponseExpiration :: Maybe Integer -- ^ 
  , offerResponseRedeemableStart :: Maybe Integer -- ^ 
  , offerResponseRedeemableEnd :: Maybe Integer -- ^ 
  , offerResponseDistance :: Maybe Double -- ^ 
  , offerResponseOfferType :: Maybe Text -- ^ 
  , offerResponseLongitude :: Maybe Double -- ^ 
  , offerResponseLatitude :: Maybe Double -- ^ 
  , offerResponseFavorite :: Maybe Bool -- ^ 
  , offerResponseFullPrice :: Maybe Double -- ^ 
  , offerResponseDiscountPrice :: Maybe Double -- ^ 
  , offerResponseEstimatedValue :: Maybe Double -- ^ 
  , offerResponseVoucherDiscountPrice :: Maybe Double -- ^ 
  , offerResponseMissionListResponse :: Maybe MissionListResponse -- ^ 
  , offerResponseImage :: Maybe Text -- ^ 
  , offerResponseImage1 :: Maybe Text -- ^ 
  , offerResponseImage2 :: Maybe Text -- ^ 
  , offerResponseImage3 :: Maybe Text -- ^ 
  , offerResponseImage4 :: Maybe Text -- ^ 
  , offerResponseImage5 :: Maybe Text -- ^ 
  , offerResponseImages :: Maybe [AssetResponse] -- ^ 
  , offerResponseBarcode :: Maybe Text -- ^ 
  , offerResponseExternalUrl :: Maybe Text -- ^ 
  , offerResponseSqootUrl :: Maybe Text -- ^ 
  , offerResponseActive :: Maybe Bool -- ^ 
  , offerResponseLocation :: Maybe RetailerLocationResponse -- ^ 
  , offerResponseSubDetails :: Maybe Text -- ^ 
  , offerResponseExternalRedeemAuth :: Maybe Int -- ^ 
  , offerResponseExternalRedeemOptions :: Maybe Text -- ^ 
  , offerResponsePublisher :: Maybe Text -- ^ 
  , offerResponseProduct :: Maybe ProductResponse -- ^ 
  , offerResponseEvent :: Maybe EventResponse -- ^ 
  , offerResponseMedia :: Maybe MediaResponse -- ^ 
  , offerResponseViewedCount :: Maybe Int -- ^ 
  , offerResponseClickedCount :: Maybe Int -- ^ 
  , offerResponseAddedLimit :: Maybe Int -- ^ 
  , offerResponseAddedCount :: Maybe Int -- ^ 
  , offerResponseUsedCount :: Maybe Int -- ^ 
  , offerResponseRemovedCount :: Maybe Int -- ^ 
  , offerResponseLocationAddedCount :: Maybe Int -- ^ 
  , offerResponseBarcodeEntry :: Maybe Text -- ^ 
  , offerResponseBarcodeType :: Maybe Text -- ^ 
  , offerResponseTicketsReward :: Maybe Integer -- ^ 
  , offerResponseTicketsRewardType :: Maybe Text -- ^ 
  , offerResponseSpecialOfferType :: Maybe Text -- ^ 
  , offerResponseLikeCount :: Maybe Integer -- ^ 
  , offerResponseDislikeCount :: Maybe Integer -- ^ 
  , offerResponseFavoriteCount :: Maybe Integer -- ^ 
  , offerResponseNoteCount :: Maybe Integer -- ^ 
  , offerResponseLogId :: Maybe Integer -- ^ 
  , offerResponseBillableEntityId :: Maybe Integer -- ^ 
  , offerResponseResponsibleAccountId :: Maybe Integer -- ^ 
  , offerResponseAvailabilitySummary :: Maybe Text -- ^ 
  , offerResponseExternalId :: Maybe Text -- ^ 
  , offerResponseParentOffer :: Maybe OfferShortResponse -- ^ 
  , offerResponseAddress :: Maybe Text -- ^ 
  , offerResponseDetails :: Maybe Text -- ^ 
  , offerResponseFinePrint :: Maybe Text -- ^ 
  , offerResponseRetailerPhoneNumber :: Maybe Text -- ^ 
  , offerResponseTicketPriceType :: Maybe Text -- ^ 
  , offerResponseTicketPrice :: Maybe Integer -- ^ 
  , offerResponseDiscountPercentage :: Maybe Double -- ^ 
  , offerResponsePaymentFees :: Maybe Double -- ^ 
  , offerResponseVoucherPrice :: Maybe Double -- ^ 
  , offerResponsePurchasesRemaining :: Maybe Int -- ^ 
  , offerResponseRedemptionsRemaining :: Maybe Int -- ^ 
  , offerResponseRedemptionStatus :: Maybe Int -- ^ 
  , offerResponseRedemptionCode :: Maybe Text -- ^ 
  , offerResponseAudiences :: Maybe [AudienceResponse] -- ^ 
  , offerResponseAudienceCount :: Maybe Int -- ^ 
  , offerResponseWalletCount :: Maybe Int -- ^ 
  , offerResponseQrCodeUrl :: Maybe Text -- ^ 
  , offerResponseShowRemaining :: Maybe Bool -- ^ 
  , offerResponseShowRedeemed :: Maybe Bool -- ^ 
  , offerResponsePurchaseLimit :: Maybe Int -- ^ 
  , offerResponsePurchaseLimitPerUser :: Maybe Int -- ^ 
  , offerResponseRedemptionLimit :: Maybe Int -- ^ 
  , offerResponseUserRedemptionLimit :: Maybe Int -- ^ 
  , offerResponseCategories :: Maybe [CategoryResponse] -- ^ 
  , offerResponseFilters :: Maybe [FilterResponse] -- ^ 
  , offerResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON OfferResponse where
  parseJSON = genericParseJSON optionsOfferResponse
instance ToJSON OfferResponse where
  toJSON = genericToJSON optionsOfferResponse

optionsOfferResponse :: Options
optionsOfferResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("offerResponseValid", "valid")
      , ("offerResponseMessage", "message")
      , ("offerResponseVersion", "version")
      , ("offerResponseSerializeNulls", "serializeNulls")
      , ("offerResponseStartTimeLog", "startTimeLog")
      , ("offerResponseErrorCode", "errorCode")
      , ("offerResponseRequest", "request")
      , ("offerResponseOfferLocationId", "offerLocationId")
      , ("offerResponseOfferId", "offerId")
      , ("offerResponseRetailerId", "retailerId")
      , ("offerResponseTransactionId", "transactionId")
      , ("offerResponseFavoriteId", "favoriteId")
      , ("offerResponseOfferName", "offerName")
      , ("offerResponseSubTitle", "subTitle")
      , ("offerResponseLocationName", "locationName")
      , ("offerResponseStarts", "starts")
      , ("offerResponseExpires", "expires")
      , ("offerResponseActivated", "activated")
      , ("offerResponseExpiration", "expiration")
      , ("offerResponseRedeemableStart", "redeemableStart")
      , ("offerResponseRedeemableEnd", "redeemableEnd")
      , ("offerResponseDistance", "distance")
      , ("offerResponseOfferType", "offerType")
      , ("offerResponseLongitude", "longitude")
      , ("offerResponseLatitude", "latitude")
      , ("offerResponseFavorite", "favorite")
      , ("offerResponseFullPrice", "fullPrice")
      , ("offerResponseDiscountPrice", "discountPrice")
      , ("offerResponseEstimatedValue", "estimatedValue")
      , ("offerResponseVoucherDiscountPrice", "voucherDiscountPrice")
      , ("offerResponseMissionListResponse", "missionListResponse")
      , ("offerResponseImage", "image")
      , ("offerResponseImage1", "image1")
      , ("offerResponseImage2", "image2")
      , ("offerResponseImage3", "image3")
      , ("offerResponseImage4", "image4")
      , ("offerResponseImage5", "image5")
      , ("offerResponseImages", "images")
      , ("offerResponseBarcode", "barcode")
      , ("offerResponseExternalUrl", "externalUrl")
      , ("offerResponseSqootUrl", "sqootUrl")
      , ("offerResponseActive", "active")
      , ("offerResponseLocation", "location")
      , ("offerResponseSubDetails", "subDetails")
      , ("offerResponseExternalRedeemAuth", "externalRedeemAuth")
      , ("offerResponseExternalRedeemOptions", "externalRedeemOptions")
      , ("offerResponsePublisher", "publisher")
      , ("offerResponseProduct", "product")
      , ("offerResponseEvent", "event")
      , ("offerResponseMedia", "media")
      , ("offerResponseViewedCount", "viewedCount")
      , ("offerResponseClickedCount", "clickedCount")
      , ("offerResponseAddedLimit", "addedLimit")
      , ("offerResponseAddedCount", "addedCount")
      , ("offerResponseUsedCount", "usedCount")
      , ("offerResponseRemovedCount", "removedCount")
      , ("offerResponseLocationAddedCount", "locationAddedCount")
      , ("offerResponseBarcodeEntry", "barcodeEntry")
      , ("offerResponseBarcodeType", "barcodeType")
      , ("offerResponseTicketsReward", "ticketsReward")
      , ("offerResponseTicketsRewardType", "ticketsRewardType")
      , ("offerResponseSpecialOfferType", "specialOfferType")
      , ("offerResponseLikeCount", "likeCount")
      , ("offerResponseDislikeCount", "dislikeCount")
      , ("offerResponseFavoriteCount", "favoriteCount")
      , ("offerResponseNoteCount", "noteCount")
      , ("offerResponseLogId", "logId")
      , ("offerResponseBillableEntityId", "billableEntityId")
      , ("offerResponseResponsibleAccountId", "responsibleAccountId")
      , ("offerResponseAvailabilitySummary", "availabilitySummary")
      , ("offerResponseExternalId", "externalId")
      , ("offerResponseParentOffer", "parentOffer")
      , ("offerResponseAddress", "address")
      , ("offerResponseDetails", "details")
      , ("offerResponseFinePrint", "finePrint")
      , ("offerResponseRetailerPhoneNumber", "retailerPhoneNumber")
      , ("offerResponseTicketPriceType", "ticketPriceType")
      , ("offerResponseTicketPrice", "ticketPrice")
      , ("offerResponseDiscountPercentage", "discountPercentage")
      , ("offerResponsePaymentFees", "paymentFees")
      , ("offerResponseVoucherPrice", "voucherPrice")
      , ("offerResponsePurchasesRemaining", "purchasesRemaining")
      , ("offerResponseRedemptionsRemaining", "redemptionsRemaining")
      , ("offerResponseRedemptionStatus", "redemptionStatus")
      , ("offerResponseRedemptionCode", "redemptionCode")
      , ("offerResponseAudiences", "audiences")
      , ("offerResponseAudienceCount", "audienceCount")
      , ("offerResponseWalletCount", "walletCount")
      , ("offerResponseQrCodeUrl", "qrCodeUrl")
      , ("offerResponseShowRemaining", "showRemaining")
      , ("offerResponseShowRedeemed", "showRedeemed")
      , ("offerResponsePurchaseLimit", "purchaseLimit")
      , ("offerResponsePurchaseLimitPerUser", "purchaseLimitPerUser")
      , ("offerResponseRedemptionLimit", "redemptionLimit")
      , ("offerResponseUserRedemptionLimit", "userRedemptionLimit")
      , ("offerResponseCategories", "categories")
      , ("offerResponseFilters", "filters")
      , ("offerResponseReturning", "returning")
      ]


-- | 
data OfferShortResponse = OfferShortResponse
  { offerShortResponseValid :: Maybe Bool -- ^ 
  , offerShortResponseMessage :: Maybe Text -- ^ 
  , offerShortResponseVersion :: Maybe Double -- ^ 
  , offerShortResponseSerializeNulls :: Maybe Bool -- ^ 
  , offerShortResponseStartTimeLog :: Maybe Integer -- ^ 
  , offerShortResponseErrorCode :: Maybe Text -- ^ 
  , offerShortResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , offerShortResponseOfferLocationId :: Maybe Integer -- ^ 
  , offerShortResponseOfferId :: Maybe Integer -- ^ 
  , offerShortResponseRetailerId :: Maybe Integer -- ^ 
  , offerShortResponseTransactionId :: Maybe Integer -- ^ 
  , offerShortResponseFavoriteId :: Maybe Integer -- ^ 
  , offerShortResponseOfferName :: Maybe Text -- ^ 
  , offerShortResponseSubTitle :: Maybe Text -- ^ 
  , offerShortResponseLocationName :: Maybe Text -- ^ 
  , offerShortResponseStarts :: Maybe UTCTime -- ^ 
  , offerShortResponseExpires :: Maybe UTCTime -- ^ 
  , offerShortResponseActivated :: Maybe Integer -- ^ 
  , offerShortResponseExpiration :: Maybe Integer -- ^ 
  , offerShortResponseRedeemableStart :: Maybe Integer -- ^ 
  , offerShortResponseRedeemableEnd :: Maybe Integer -- ^ 
  , offerShortResponseDistance :: Maybe Double -- ^ 
  , offerShortResponseOfferType :: Maybe Text -- ^ 
  , offerShortResponseLongitude :: Maybe Double -- ^ 
  , offerShortResponseLatitude :: Maybe Double -- ^ 
  , offerShortResponseFavorite :: Maybe Bool -- ^ 
  , offerShortResponseFullPrice :: Maybe Double -- ^ 
  , offerShortResponseDiscountPrice :: Maybe Double -- ^ 
  , offerShortResponseEstimatedValue :: Maybe Double -- ^ 
  , offerShortResponseVoucherDiscountPrice :: Maybe Double -- ^ 
  , offerShortResponseMissionListResponse :: Maybe MissionListResponse -- ^ 
  , offerShortResponseImage :: Maybe Text -- ^ 
  , offerShortResponseImage1 :: Maybe Text -- ^ 
  , offerShortResponseImage2 :: Maybe Text -- ^ 
  , offerShortResponseImage3 :: Maybe Text -- ^ 
  , offerShortResponseImage4 :: Maybe Text -- ^ 
  , offerShortResponseImage5 :: Maybe Text -- ^ 
  , offerShortResponseImages :: Maybe [AssetResponse] -- ^ 
  , offerShortResponseBarcode :: Maybe Text -- ^ 
  , offerShortResponseExternalUrl :: Maybe Text -- ^ 
  , offerShortResponseSqootUrl :: Maybe Text -- ^ 
  , offerShortResponseActive :: Maybe Bool -- ^ 
  , offerShortResponseLocation :: Maybe RetailerLocationResponse -- ^ 
  , offerShortResponseSubDetails :: Maybe Text -- ^ 
  , offerShortResponseExternalRedeemAuth :: Maybe Int -- ^ 
  , offerShortResponseExternalRedeemOptions :: Maybe Text -- ^ 
  , offerShortResponsePublisher :: Maybe Text -- ^ 
  , offerShortResponseProduct :: Maybe ProductResponse -- ^ 
  , offerShortResponseEvent :: Maybe EventResponse -- ^ 
  , offerShortResponseMedia :: Maybe MediaResponse -- ^ 
  , offerShortResponseViewedCount :: Maybe Int -- ^ 
  , offerShortResponseClickedCount :: Maybe Int -- ^ 
  , offerShortResponseAddedLimit :: Maybe Int -- ^ 
  , offerShortResponseAddedCount :: Maybe Int -- ^ 
  , offerShortResponseUsedCount :: Maybe Int -- ^ 
  , offerShortResponseRemovedCount :: Maybe Int -- ^ 
  , offerShortResponseLocationAddedCount :: Maybe Int -- ^ 
  , offerShortResponseBarcodeEntry :: Maybe Text -- ^ 
  , offerShortResponseBarcodeType :: Maybe Text -- ^ 
  , offerShortResponseTicketsReward :: Maybe Integer -- ^ 
  , offerShortResponseTicketsRewardType :: Maybe Text -- ^ 
  , offerShortResponseSpecialOfferType :: Maybe Text -- ^ 
  , offerShortResponseLikeCount :: Maybe Integer -- ^ 
  , offerShortResponseDislikeCount :: Maybe Integer -- ^ 
  , offerShortResponseFavoriteCount :: Maybe Integer -- ^ 
  , offerShortResponseNoteCount :: Maybe Integer -- ^ 
  , offerShortResponseLogId :: Maybe Integer -- ^ 
  , offerShortResponseBillableEntityId :: Maybe Integer -- ^ 
  , offerShortResponseResponsibleAccountId :: Maybe Integer -- ^ 
  , offerShortResponseAvailabilitySummary :: Maybe Text -- ^ 
  , offerShortResponseExternalId :: Maybe Text -- ^ 
  , offerShortResponseParentOffer :: Maybe OfferShortResponse -- ^ 
  , offerShortResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON OfferShortResponse where
  parseJSON = genericParseJSON optionsOfferShortResponse
instance ToJSON OfferShortResponse where
  toJSON = genericToJSON optionsOfferShortResponse

optionsOfferShortResponse :: Options
optionsOfferShortResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("offerShortResponseValid", "valid")
      , ("offerShortResponseMessage", "message")
      , ("offerShortResponseVersion", "version")
      , ("offerShortResponseSerializeNulls", "serializeNulls")
      , ("offerShortResponseStartTimeLog", "startTimeLog")
      , ("offerShortResponseErrorCode", "errorCode")
      , ("offerShortResponseRequest", "request")
      , ("offerShortResponseOfferLocationId", "offerLocationId")
      , ("offerShortResponseOfferId", "offerId")
      , ("offerShortResponseRetailerId", "retailerId")
      , ("offerShortResponseTransactionId", "transactionId")
      , ("offerShortResponseFavoriteId", "favoriteId")
      , ("offerShortResponseOfferName", "offerName")
      , ("offerShortResponseSubTitle", "subTitle")
      , ("offerShortResponseLocationName", "locationName")
      , ("offerShortResponseStarts", "starts")
      , ("offerShortResponseExpires", "expires")
      , ("offerShortResponseActivated", "activated")
      , ("offerShortResponseExpiration", "expiration")
      , ("offerShortResponseRedeemableStart", "redeemableStart")
      , ("offerShortResponseRedeemableEnd", "redeemableEnd")
      , ("offerShortResponseDistance", "distance")
      , ("offerShortResponseOfferType", "offerType")
      , ("offerShortResponseLongitude", "longitude")
      , ("offerShortResponseLatitude", "latitude")
      , ("offerShortResponseFavorite", "favorite")
      , ("offerShortResponseFullPrice", "fullPrice")
      , ("offerShortResponseDiscountPrice", "discountPrice")
      , ("offerShortResponseEstimatedValue", "estimatedValue")
      , ("offerShortResponseVoucherDiscountPrice", "voucherDiscountPrice")
      , ("offerShortResponseMissionListResponse", "missionListResponse")
      , ("offerShortResponseImage", "image")
      , ("offerShortResponseImage1", "image1")
      , ("offerShortResponseImage2", "image2")
      , ("offerShortResponseImage3", "image3")
      , ("offerShortResponseImage4", "image4")
      , ("offerShortResponseImage5", "image5")
      , ("offerShortResponseImages", "images")
      , ("offerShortResponseBarcode", "barcode")
      , ("offerShortResponseExternalUrl", "externalUrl")
      , ("offerShortResponseSqootUrl", "sqootUrl")
      , ("offerShortResponseActive", "active")
      , ("offerShortResponseLocation", "location")
      , ("offerShortResponseSubDetails", "subDetails")
      , ("offerShortResponseExternalRedeemAuth", "externalRedeemAuth")
      , ("offerShortResponseExternalRedeemOptions", "externalRedeemOptions")
      , ("offerShortResponsePublisher", "publisher")
      , ("offerShortResponseProduct", "product")
      , ("offerShortResponseEvent", "event")
      , ("offerShortResponseMedia", "media")
      , ("offerShortResponseViewedCount", "viewedCount")
      , ("offerShortResponseClickedCount", "clickedCount")
      , ("offerShortResponseAddedLimit", "addedLimit")
      , ("offerShortResponseAddedCount", "addedCount")
      , ("offerShortResponseUsedCount", "usedCount")
      , ("offerShortResponseRemovedCount", "removedCount")
      , ("offerShortResponseLocationAddedCount", "locationAddedCount")
      , ("offerShortResponseBarcodeEntry", "barcodeEntry")
      , ("offerShortResponseBarcodeType", "barcodeType")
      , ("offerShortResponseTicketsReward", "ticketsReward")
      , ("offerShortResponseTicketsRewardType", "ticketsRewardType")
      , ("offerShortResponseSpecialOfferType", "specialOfferType")
      , ("offerShortResponseLikeCount", "likeCount")
      , ("offerShortResponseDislikeCount", "dislikeCount")
      , ("offerShortResponseFavoriteCount", "favoriteCount")
      , ("offerShortResponseNoteCount", "noteCount")
      , ("offerShortResponseLogId", "logId")
      , ("offerShortResponseBillableEntityId", "billableEntityId")
      , ("offerShortResponseResponsibleAccountId", "responsibleAccountId")
      , ("offerShortResponseAvailabilitySummary", "availabilitySummary")
      , ("offerShortResponseExternalId", "externalId")
      , ("offerShortResponseParentOffer", "parentOffer")
      , ("offerShortResponseReturning", "returning")
      ]


-- | 
data OfferTransactionResponse = OfferTransactionResponse
  { offerTransactionResponseValid :: Maybe Bool -- ^ 
  , offerTransactionResponseMessage :: Maybe Text -- ^ 
  , offerTransactionResponseVersion :: Maybe Double -- ^ 
  , offerTransactionResponseSerializeNulls :: Maybe Bool -- ^ 
  , offerTransactionResponseStartTimeLog :: Maybe Integer -- ^ 
  , offerTransactionResponseErrorCode :: Maybe Text -- ^ 
  , offerTransactionResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , offerTransactionResponseOfferLocationId :: Maybe Integer -- ^ 
  , offerTransactionResponseOfferId :: Maybe Integer -- ^ 
  , offerTransactionResponseRetailerId :: Maybe Integer -- ^ 
  , offerTransactionResponseTransactionId :: Maybe Integer -- ^ 
  , offerTransactionResponseFavoriteId :: Maybe Integer -- ^ 
  , offerTransactionResponseOfferName :: Maybe Text -- ^ 
  , offerTransactionResponseSubTitle :: Maybe Text -- ^ 
  , offerTransactionResponseLocationName :: Maybe Text -- ^ 
  , offerTransactionResponseStarts :: Maybe UTCTime -- ^ 
  , offerTransactionResponseExpires :: Maybe UTCTime -- ^ 
  , offerTransactionResponseActivated :: Maybe Integer -- ^ 
  , offerTransactionResponseExpiration :: Maybe Integer -- ^ 
  , offerTransactionResponseRedeemableStart :: Maybe Integer -- ^ 
  , offerTransactionResponseRedeemableEnd :: Maybe Integer -- ^ 
  , offerTransactionResponseDistance :: Maybe Double -- ^ 
  , offerTransactionResponseOfferType :: Maybe Text -- ^ 
  , offerTransactionResponseLongitude :: Maybe Double -- ^ 
  , offerTransactionResponseLatitude :: Maybe Double -- ^ 
  , offerTransactionResponseFavorite :: Maybe Bool -- ^ 
  , offerTransactionResponseFullPrice :: Maybe Double -- ^ 
  , offerTransactionResponseDiscountPrice :: Maybe Double -- ^ 
  , offerTransactionResponseEstimatedValue :: Maybe Double -- ^ 
  , offerTransactionResponseVoucherDiscountPrice :: Maybe Double -- ^ 
  , offerTransactionResponseMissionListResponse :: Maybe MissionListResponse -- ^ 
  , offerTransactionResponseImage :: Maybe Text -- ^ 
  , offerTransactionResponseImage1 :: Maybe Text -- ^ 
  , offerTransactionResponseImage2 :: Maybe Text -- ^ 
  , offerTransactionResponseImage3 :: Maybe Text -- ^ 
  , offerTransactionResponseImage4 :: Maybe Text -- ^ 
  , offerTransactionResponseImage5 :: Maybe Text -- ^ 
  , offerTransactionResponseImages :: Maybe [AssetResponse] -- ^ 
  , offerTransactionResponseBarcode :: Maybe Text -- ^ 
  , offerTransactionResponseExternalUrl :: Maybe Text -- ^ 
  , offerTransactionResponseSqootUrl :: Maybe Text -- ^ 
  , offerTransactionResponseActive :: Maybe Bool -- ^ 
  , offerTransactionResponseLocation :: Maybe RetailerLocationResponse -- ^ 
  , offerTransactionResponseSubDetails :: Maybe Text -- ^ 
  , offerTransactionResponseExternalRedeemAuth :: Maybe Int -- ^ 
  , offerTransactionResponseExternalRedeemOptions :: Maybe Text -- ^ 
  , offerTransactionResponsePublisher :: Maybe Text -- ^ 
  , offerTransactionResponseProduct :: Maybe ProductResponse -- ^ 
  , offerTransactionResponseEvent :: Maybe EventResponse -- ^ 
  , offerTransactionResponseMedia :: Maybe MediaResponse -- ^ 
  , offerTransactionResponseViewedCount :: Maybe Int -- ^ 
  , offerTransactionResponseClickedCount :: Maybe Int -- ^ 
  , offerTransactionResponseAddedLimit :: Maybe Int -- ^ 
  , offerTransactionResponseAddedCount :: Maybe Int -- ^ 
  , offerTransactionResponseUsedCount :: Maybe Int -- ^ 
  , offerTransactionResponseRemovedCount :: Maybe Int -- ^ 
  , offerTransactionResponseLocationAddedCount :: Maybe Int -- ^ 
  , offerTransactionResponseBarcodeEntry :: Maybe Text -- ^ 
  , offerTransactionResponseBarcodeType :: Maybe Text -- ^ 
  , offerTransactionResponseTicketsReward :: Maybe Integer -- ^ 
  , offerTransactionResponseTicketsRewardType :: Maybe Text -- ^ 
  , offerTransactionResponseSpecialOfferType :: Maybe Text -- ^ 
  , offerTransactionResponseLikeCount :: Maybe Integer -- ^ 
  , offerTransactionResponseDislikeCount :: Maybe Integer -- ^ 
  , offerTransactionResponseFavoriteCount :: Maybe Integer -- ^ 
  , offerTransactionResponseNoteCount :: Maybe Integer -- ^ 
  , offerTransactionResponseLogId :: Maybe Integer -- ^ 
  , offerTransactionResponseBillableEntityId :: Maybe Integer -- ^ 
  , offerTransactionResponseResponsibleAccountId :: Maybe Integer -- ^ 
  , offerTransactionResponseAvailabilitySummary :: Maybe Text -- ^ 
  , offerTransactionResponseExternalId :: Maybe Text -- ^ 
  , offerTransactionResponseParentOffer :: Maybe OfferShortResponse -- ^ 
  , offerTransactionResponseAddress :: Maybe Text -- ^ 
  , offerTransactionResponseDetails :: Maybe Text -- ^ 
  , offerTransactionResponseFinePrint :: Maybe Text -- ^ 
  , offerTransactionResponseRetailerPhoneNumber :: Maybe Text -- ^ 
  , offerTransactionResponseTicketPriceType :: Maybe Text -- ^ 
  , offerTransactionResponseTicketPrice :: Maybe Integer -- ^ 
  , offerTransactionResponseDiscountPercentage :: Maybe Double -- ^ 
  , offerTransactionResponsePaymentFees :: Maybe Double -- ^ 
  , offerTransactionResponseVoucherPrice :: Maybe Double -- ^ 
  , offerTransactionResponsePurchasesRemaining :: Maybe Int -- ^ 
  , offerTransactionResponseRedemptionsRemaining :: Maybe Int -- ^ 
  , offerTransactionResponseRedemptionStatus :: Maybe Int -- ^ 
  , offerTransactionResponseRedemptionCode :: Maybe Text -- ^ 
  , offerTransactionResponseAudiences :: Maybe [AudienceResponse] -- ^ 
  , offerTransactionResponseAudienceCount :: Maybe Int -- ^ 
  , offerTransactionResponseWalletCount :: Maybe Int -- ^ 
  , offerTransactionResponseQrCodeUrl :: Maybe Text -- ^ 
  , offerTransactionResponseShowRemaining :: Maybe Bool -- ^ 
  , offerTransactionResponseShowRedeemed :: Maybe Bool -- ^ 
  , offerTransactionResponsePurchaseLimit :: Maybe Int -- ^ 
  , offerTransactionResponsePurchaseLimitPerUser :: Maybe Int -- ^ 
  , offerTransactionResponseRedemptionLimit :: Maybe Int -- ^ 
  , offerTransactionResponseUserRedemptionLimit :: Maybe Int -- ^ 
  , offerTransactionResponseCategories :: Maybe [CategoryResponse] -- ^ 
  , offerTransactionResponseFilters :: Maybe [FilterResponse] -- ^ 
  , offerTransactionResponseCustomer :: Maybe AccountShortResponse -- ^ 
  , offerTransactionResponsePurchasedDate :: Maybe Integer -- ^ 
  , offerTransactionResponseUsedDate :: Maybe Integer -- ^ 
  , offerTransactionResponseTransactionCreated :: Maybe Integer -- ^ 
  , offerTransactionResponseTransactionUpdated :: Maybe Integer -- ^ 
  , offerTransactionResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON OfferTransactionResponse where
  parseJSON = genericParseJSON optionsOfferTransactionResponse
instance ToJSON OfferTransactionResponse where
  toJSON = genericToJSON optionsOfferTransactionResponse

optionsOfferTransactionResponse :: Options
optionsOfferTransactionResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("offerTransactionResponseValid", "valid")
      , ("offerTransactionResponseMessage", "message")
      , ("offerTransactionResponseVersion", "version")
      , ("offerTransactionResponseSerializeNulls", "serializeNulls")
      , ("offerTransactionResponseStartTimeLog", "startTimeLog")
      , ("offerTransactionResponseErrorCode", "errorCode")
      , ("offerTransactionResponseRequest", "request")
      , ("offerTransactionResponseOfferLocationId", "offerLocationId")
      , ("offerTransactionResponseOfferId", "offerId")
      , ("offerTransactionResponseRetailerId", "retailerId")
      , ("offerTransactionResponseTransactionId", "transactionId")
      , ("offerTransactionResponseFavoriteId", "favoriteId")
      , ("offerTransactionResponseOfferName", "offerName")
      , ("offerTransactionResponseSubTitle", "subTitle")
      , ("offerTransactionResponseLocationName", "locationName")
      , ("offerTransactionResponseStarts", "starts")
      , ("offerTransactionResponseExpires", "expires")
      , ("offerTransactionResponseActivated", "activated")
      , ("offerTransactionResponseExpiration", "expiration")
      , ("offerTransactionResponseRedeemableStart", "redeemableStart")
      , ("offerTransactionResponseRedeemableEnd", "redeemableEnd")
      , ("offerTransactionResponseDistance", "distance")
      , ("offerTransactionResponseOfferType", "offerType")
      , ("offerTransactionResponseLongitude", "longitude")
      , ("offerTransactionResponseLatitude", "latitude")
      , ("offerTransactionResponseFavorite", "favorite")
      , ("offerTransactionResponseFullPrice", "fullPrice")
      , ("offerTransactionResponseDiscountPrice", "discountPrice")
      , ("offerTransactionResponseEstimatedValue", "estimatedValue")
      , ("offerTransactionResponseVoucherDiscountPrice", "voucherDiscountPrice")
      , ("offerTransactionResponseMissionListResponse", "missionListResponse")
      , ("offerTransactionResponseImage", "image")
      , ("offerTransactionResponseImage1", "image1")
      , ("offerTransactionResponseImage2", "image2")
      , ("offerTransactionResponseImage3", "image3")
      , ("offerTransactionResponseImage4", "image4")
      , ("offerTransactionResponseImage5", "image5")
      , ("offerTransactionResponseImages", "images")
      , ("offerTransactionResponseBarcode", "barcode")
      , ("offerTransactionResponseExternalUrl", "externalUrl")
      , ("offerTransactionResponseSqootUrl", "sqootUrl")
      , ("offerTransactionResponseActive", "active")
      , ("offerTransactionResponseLocation", "location")
      , ("offerTransactionResponseSubDetails", "subDetails")
      , ("offerTransactionResponseExternalRedeemAuth", "externalRedeemAuth")
      , ("offerTransactionResponseExternalRedeemOptions", "externalRedeemOptions")
      , ("offerTransactionResponsePublisher", "publisher")
      , ("offerTransactionResponseProduct", "product")
      , ("offerTransactionResponseEvent", "event")
      , ("offerTransactionResponseMedia", "media")
      , ("offerTransactionResponseViewedCount", "viewedCount")
      , ("offerTransactionResponseClickedCount", "clickedCount")
      , ("offerTransactionResponseAddedLimit", "addedLimit")
      , ("offerTransactionResponseAddedCount", "addedCount")
      , ("offerTransactionResponseUsedCount", "usedCount")
      , ("offerTransactionResponseRemovedCount", "removedCount")
      , ("offerTransactionResponseLocationAddedCount", "locationAddedCount")
      , ("offerTransactionResponseBarcodeEntry", "barcodeEntry")
      , ("offerTransactionResponseBarcodeType", "barcodeType")
      , ("offerTransactionResponseTicketsReward", "ticketsReward")
      , ("offerTransactionResponseTicketsRewardType", "ticketsRewardType")
      , ("offerTransactionResponseSpecialOfferType", "specialOfferType")
      , ("offerTransactionResponseLikeCount", "likeCount")
      , ("offerTransactionResponseDislikeCount", "dislikeCount")
      , ("offerTransactionResponseFavoriteCount", "favoriteCount")
      , ("offerTransactionResponseNoteCount", "noteCount")
      , ("offerTransactionResponseLogId", "logId")
      , ("offerTransactionResponseBillableEntityId", "billableEntityId")
      , ("offerTransactionResponseResponsibleAccountId", "responsibleAccountId")
      , ("offerTransactionResponseAvailabilitySummary", "availabilitySummary")
      , ("offerTransactionResponseExternalId", "externalId")
      , ("offerTransactionResponseParentOffer", "parentOffer")
      , ("offerTransactionResponseAddress", "address")
      , ("offerTransactionResponseDetails", "details")
      , ("offerTransactionResponseFinePrint", "finePrint")
      , ("offerTransactionResponseRetailerPhoneNumber", "retailerPhoneNumber")
      , ("offerTransactionResponseTicketPriceType", "ticketPriceType")
      , ("offerTransactionResponseTicketPrice", "ticketPrice")
      , ("offerTransactionResponseDiscountPercentage", "discountPercentage")
      , ("offerTransactionResponsePaymentFees", "paymentFees")
      , ("offerTransactionResponseVoucherPrice", "voucherPrice")
      , ("offerTransactionResponsePurchasesRemaining", "purchasesRemaining")
      , ("offerTransactionResponseRedemptionsRemaining", "redemptionsRemaining")
      , ("offerTransactionResponseRedemptionStatus", "redemptionStatus")
      , ("offerTransactionResponseRedemptionCode", "redemptionCode")
      , ("offerTransactionResponseAudiences", "audiences")
      , ("offerTransactionResponseAudienceCount", "audienceCount")
      , ("offerTransactionResponseWalletCount", "walletCount")
      , ("offerTransactionResponseQrCodeUrl", "qrCodeUrl")
      , ("offerTransactionResponseShowRemaining", "showRemaining")
      , ("offerTransactionResponseShowRedeemed", "showRedeemed")
      , ("offerTransactionResponsePurchaseLimit", "purchaseLimit")
      , ("offerTransactionResponsePurchaseLimitPerUser", "purchaseLimitPerUser")
      , ("offerTransactionResponseRedemptionLimit", "redemptionLimit")
      , ("offerTransactionResponseUserRedemptionLimit", "userRedemptionLimit")
      , ("offerTransactionResponseCategories", "categories")
      , ("offerTransactionResponseFilters", "filters")
      , ("offerTransactionResponseCustomer", "customer")
      , ("offerTransactionResponsePurchasedDate", "purchasedDate")
      , ("offerTransactionResponseUsedDate", "usedDate")
      , ("offerTransactionResponseTransactionCreated", "transactionCreated")
      , ("offerTransactionResponseTransactionUpdated", "transactionUpdated")
      , ("offerTransactionResponseReturning", "returning")
      ]


-- | 
data OfferTransactionStatusResponse = OfferTransactionStatusResponse
  { offerTransactionStatusResponseId :: Maybe Integer -- ^ 
  , offerTransactionStatusResponseActive :: Maybe Bool -- ^ 
  , offerTransactionStatusResponseName :: Maybe Text -- ^ 
  , offerTransactionStatusResponseDescription :: Maybe Text -- ^ 
  , offerTransactionStatusResponseCode :: Maybe Int -- ^ 
  , offerTransactionStatusResponseRole :: Maybe Text -- ^ 
  , offerTransactionStatusResponseApplications :: Maybe [ApplicationShortResponse] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON OfferTransactionStatusResponse where
  parseJSON = genericParseJSON optionsOfferTransactionStatusResponse
instance ToJSON OfferTransactionStatusResponse where
  toJSON = genericToJSON optionsOfferTransactionStatusResponse

optionsOfferTransactionStatusResponse :: Options
optionsOfferTransactionStatusResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("offerTransactionStatusResponseId", "id")
      , ("offerTransactionStatusResponseActive", "active")
      , ("offerTransactionStatusResponseName", "name")
      , ("offerTransactionStatusResponseDescription", "description")
      , ("offerTransactionStatusResponseCode", "code")
      , ("offerTransactionStatusResponseRole", "role")
      , ("offerTransactionStatusResponseApplications", "applications")
      ]


-- | 
data OrderItemRequest = OrderItemRequest
  { orderItemRequestOrderItemType :: Maybe Text -- ^ 
  , orderItemRequestOrderItemId :: Maybe Integer -- ^ 
  , orderItemRequestOfferName :: Maybe Text -- ^ 
  , orderItemRequestOrderCustomType :: Maybe Text -- ^ 
  , orderItemRequestOrderCustomId :: Maybe Text -- ^ 
  , orderItemRequestRetailerLocationId :: Maybe Integer -- ^ 
  , orderItemRequestQuantity :: Maybe Int -- ^ 
  , orderItemRequestAmount :: Maybe Double -- ^ 
  , orderItemRequestTax :: Maybe Double -- ^ 
  , orderItemRequestReserveStartDate :: Maybe Integer -- ^ 
  , orderItemRequestReserveEndDate :: Maybe Integer -- ^ 
  , orderItemRequestMessage :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON OrderItemRequest where
  parseJSON = genericParseJSON optionsOrderItemRequest
instance ToJSON OrderItemRequest where
  toJSON = genericToJSON optionsOrderItemRequest

optionsOrderItemRequest :: Options
optionsOrderItemRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("orderItemRequestOrderItemType", "orderItemType")
      , ("orderItemRequestOrderItemId", "orderItemId")
      , ("orderItemRequestOfferName", "offerName")
      , ("orderItemRequestOrderCustomType", "orderCustomType")
      , ("orderItemRequestOrderCustomId", "orderCustomId")
      , ("orderItemRequestRetailerLocationId", "retailerLocationId")
      , ("orderItemRequestQuantity", "quantity")
      , ("orderItemRequestAmount", "amount")
      , ("orderItemRequestTax", "tax")
      , ("orderItemRequestReserveStartDate", "reserveStartDate")
      , ("orderItemRequestReserveEndDate", "reserveEndDate")
      , ("orderItemRequestMessage", "message")
      ]


-- | 
data OrderPackage = OrderPackage
  { orderPackageValid :: Maybe Bool -- ^ 
  , orderPackagePackageTypeName :: Maybe Text -- ^ 
  , orderPackagePackageCount :: Maybe Int -- ^ 
  , orderPackageCubicFeet :: Maybe Double -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON OrderPackage where
  parseJSON = genericParseJSON optionsOrderPackage
instance ToJSON OrderPackage where
  toJSON = genericToJSON optionsOrderPackage

optionsOrderPackage :: Options
optionsOrderPackage =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("orderPackageValid", "valid")
      , ("orderPackagePackageTypeName", "PackageTypeName")
      , ("orderPackagePackageCount", "PackageCount")
      , ("orderPackageCubicFeet", "CubicFeet")
      ]


-- | 
data OrderResponse = OrderResponse
  { orderResponseValid :: Maybe Bool -- ^ 
  , orderResponseMessage :: Maybe Text -- ^ 
  , orderResponseVersion :: Maybe Double -- ^ 
  , orderResponseSerializeNulls :: Maybe Bool -- ^ 
  , orderResponseStartTimeLog :: Maybe Integer -- ^ 
  , orderResponseErrorCode :: Maybe Text -- ^ 
  , orderResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , orderResponseOrderId :: Maybe Integer -- ^ 
  , orderResponseApplication :: Maybe ApplicationMiniResponse -- ^ 
  , orderResponseCustomer :: Maybe AccountShortResponse -- ^ 
  , orderResponseAmount :: Maybe Double -- ^ 
  , orderResponsePurchases :: Maybe Double -- ^ 
  , orderResponseCredits :: Maybe Double -- ^ 
  , orderResponsePayments :: Maybe [PaymentTransactionResponse] -- ^ 
  , orderResponseExternalOrderId :: Maybe Text -- ^ 
  , orderResponseCreated :: Maybe Integer -- ^ 
  , orderResponseUpdated :: Maybe Integer -- ^ 
  , orderResponseExternalDate :: Maybe Integer -- ^ 
  , orderResponseDescription :: Maybe Text -- ^ 
  , orderResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON OrderResponse where
  parseJSON = genericParseJSON optionsOrderResponse
instance ToJSON OrderResponse where
  toJSON = genericToJSON optionsOrderResponse

optionsOrderResponse :: Options
optionsOrderResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("orderResponseValid", "valid")
      , ("orderResponseMessage", "message")
      , ("orderResponseVersion", "version")
      , ("orderResponseSerializeNulls", "serializeNulls")
      , ("orderResponseStartTimeLog", "startTimeLog")
      , ("orderResponseErrorCode", "errorCode")
      , ("orderResponseRequest", "request")
      , ("orderResponseOrderId", "orderId")
      , ("orderResponseApplication", "application")
      , ("orderResponseCustomer", "customer")
      , ("orderResponseAmount", "amount")
      , ("orderResponsePurchases", "purchases")
      , ("orderResponseCredits", "credits")
      , ("orderResponsePayments", "payments")
      , ("orderResponseExternalOrderId", "externalOrderId")
      , ("orderResponseCreated", "created")
      , ("orderResponseUpdated", "updated")
      , ("orderResponseExternalDate", "externalDate")
      , ("orderResponseDescription", "description")
      , ("orderResponseReturning", "returning")
      ]


-- | 
data Orders = Orders
  { ordersOrders :: Maybe [ShipmentOrder] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Orders where
  parseJSON = genericParseJSON optionsOrders
instance ToJSON Orders where
  toJSON = genericToJSON optionsOrders

optionsOrders :: Options
optionsOrders =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("ordersOrders", "Orders")
      ]


-- | 
data OrsonAiAddMovieResponse = OrsonAiAddMovieResponse
  { orsonAiAddMovieResponseRequestId :: Maybe Text -- ^ 
  , orsonAiAddMovieResponseResponseCode :: Maybe Int -- ^ 
  , orsonAiAddMovieResponseResponseRaw :: Maybe Text -- ^ 
  , orsonAiAddMovieResponseId :: Maybe Text -- ^ 
  , orsonAiAddMovieResponseHasBeenIndexed :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON OrsonAiAddMovieResponse where
  parseJSON = genericParseJSON optionsOrsonAiAddMovieResponse
instance ToJSON OrsonAiAddMovieResponse where
  toJSON = genericToJSON optionsOrsonAiAddMovieResponse

optionsOrsonAiAddMovieResponse :: Options
optionsOrsonAiAddMovieResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("orsonAiAddMovieResponseRequestId", "requestId")
      , ("orsonAiAddMovieResponseResponseCode", "responseCode")
      , ("orsonAiAddMovieResponseResponseRaw", "responseRaw")
      , ("orsonAiAddMovieResponseId", "id")
      , ("orsonAiAddMovieResponseHasBeenIndexed", "hasBeenIndexed")
      ]


-- | 
data OrsonAiBatchEmotionsResponse = OrsonAiBatchEmotionsResponse
  { orsonAiBatchEmotionsResponseRequestId :: Maybe Text -- ^ 
  , orsonAiBatchEmotionsResponseResponseCode :: Maybe Int -- ^ 
  , orsonAiBatchEmotionsResponseResponseRaw :: Maybe Text -- ^ 
  , orsonAiBatchEmotionsResponseStatus :: Maybe Text -- ^ 
  , orsonAiBatchEmotionsResponseError :: Maybe Text -- ^ 
  , orsonAiBatchEmotionsResponseResult :: Maybe OrsonAiEmotionsResponse -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON OrsonAiBatchEmotionsResponse where
  parseJSON = genericParseJSON optionsOrsonAiBatchEmotionsResponse
instance ToJSON OrsonAiBatchEmotionsResponse where
  toJSON = genericToJSON optionsOrsonAiBatchEmotionsResponse

optionsOrsonAiBatchEmotionsResponse :: Options
optionsOrsonAiBatchEmotionsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("orsonAiBatchEmotionsResponseRequestId", "requestId")
      , ("orsonAiBatchEmotionsResponseResponseCode", "responseCode")
      , ("orsonAiBatchEmotionsResponseResponseRaw", "responseRaw")
      , ("orsonAiBatchEmotionsResponseStatus", "status")
      , ("orsonAiBatchEmotionsResponseError", "error")
      , ("orsonAiBatchEmotionsResponseResult", "result")
      ]


-- | 
data OrsonAiBatchResponse = OrsonAiBatchResponse
  { orsonAiBatchResponseRequestId :: Maybe Text -- ^ 
  , orsonAiBatchResponseResponseCode :: Maybe Int -- ^ 
  , orsonAiBatchResponseResponseRaw :: Maybe Text -- ^ 
  , orsonAiBatchResponseTranscript :: Maybe OrsonAiBatchTranscriptResponse -- ^ 
  , orsonAiBatchResponseTopics :: Maybe OrsonAiBatchTopicsResponse -- ^ 
  , orsonAiBatchResponseEmotions :: Maybe OrsonAiBatchEmotionsResponse -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON OrsonAiBatchResponse where
  parseJSON = genericParseJSON optionsOrsonAiBatchResponse
instance ToJSON OrsonAiBatchResponse where
  toJSON = genericToJSON optionsOrsonAiBatchResponse

optionsOrsonAiBatchResponse :: Options
optionsOrsonAiBatchResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("orsonAiBatchResponseRequestId", "requestId")
      , ("orsonAiBatchResponseResponseCode", "responseCode")
      , ("orsonAiBatchResponseResponseRaw", "responseRaw")
      , ("orsonAiBatchResponseTranscript", "transcript")
      , ("orsonAiBatchResponseTopics", "topics")
      , ("orsonAiBatchResponseEmotions", "emotions")
      ]


-- | 
data OrsonAiBatchTopicsResponse = OrsonAiBatchTopicsResponse
  { orsonAiBatchTopicsResponseRequestId :: Maybe Text -- ^ 
  , orsonAiBatchTopicsResponseResponseCode :: Maybe Int -- ^ 
  , orsonAiBatchTopicsResponseResponseRaw :: Maybe Text -- ^ 
  , orsonAiBatchTopicsResponseStatus :: Maybe Text -- ^ 
  , orsonAiBatchTopicsResponseError :: Maybe Text -- ^ 
  , orsonAiBatchTopicsResponseResult :: Maybe OrsonAiTopicsResponse -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON OrsonAiBatchTopicsResponse where
  parseJSON = genericParseJSON optionsOrsonAiBatchTopicsResponse
instance ToJSON OrsonAiBatchTopicsResponse where
  toJSON = genericToJSON optionsOrsonAiBatchTopicsResponse

optionsOrsonAiBatchTopicsResponse :: Options
optionsOrsonAiBatchTopicsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("orsonAiBatchTopicsResponseRequestId", "requestId")
      , ("orsonAiBatchTopicsResponseResponseCode", "responseCode")
      , ("orsonAiBatchTopicsResponseResponseRaw", "responseRaw")
      , ("orsonAiBatchTopicsResponseStatus", "status")
      , ("orsonAiBatchTopicsResponseError", "error")
      , ("orsonAiBatchTopicsResponseResult", "result")
      ]


-- | 
data OrsonAiBatchTranscriptResponse = OrsonAiBatchTranscriptResponse
  { orsonAiBatchTranscriptResponseRequestId :: Maybe Text -- ^ 
  , orsonAiBatchTranscriptResponseResponseCode :: Maybe Int -- ^ 
  , orsonAiBatchTranscriptResponseResponseRaw :: Maybe Text -- ^ 
  , orsonAiBatchTranscriptResponseStatus :: Maybe Text -- ^ 
  , orsonAiBatchTranscriptResponseError :: Maybe Text -- ^ 
  , orsonAiBatchTranscriptResponseResult :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON OrsonAiBatchTranscriptResponse where
  parseJSON = genericParseJSON optionsOrsonAiBatchTranscriptResponse
instance ToJSON OrsonAiBatchTranscriptResponse where
  toJSON = genericToJSON optionsOrsonAiBatchTranscriptResponse

optionsOrsonAiBatchTranscriptResponse :: Options
optionsOrsonAiBatchTranscriptResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("orsonAiBatchTranscriptResponseRequestId", "requestId")
      , ("orsonAiBatchTranscriptResponseResponseCode", "responseCode")
      , ("orsonAiBatchTranscriptResponseResponseRaw", "responseRaw")
      , ("orsonAiBatchTranscriptResponseStatus", "status")
      , ("orsonAiBatchTranscriptResponseError", "error")
      , ("orsonAiBatchTranscriptResponseResult", "result")
      ]


-- | 
data OrsonAiEmotionsResponse = OrsonAiEmotionsResponse
  { orsonAiEmotionsResponseRequestId :: Maybe Text -- ^ 
  , orsonAiEmotionsResponseResponseCode :: Maybe Int -- ^ 
  , orsonAiEmotionsResponseResponseRaw :: Maybe Text -- ^ 
  , orsonAiEmotionsResponseStatus :: Maybe Text -- ^ 
  , orsonAiEmotionsResponseError :: Maybe Text -- ^ 
  , orsonAiEmotionsResponseAudioEmotions :: Maybe [Text] -- ^ 
  , orsonAiEmotionsResponseVisualEmotions :: Maybe [OrsonAiVisualEmotionResponse] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON OrsonAiEmotionsResponse where
  parseJSON = genericParseJSON optionsOrsonAiEmotionsResponse
instance ToJSON OrsonAiEmotionsResponse where
  toJSON = genericToJSON optionsOrsonAiEmotionsResponse

optionsOrsonAiEmotionsResponse :: Options
optionsOrsonAiEmotionsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("orsonAiEmotionsResponseRequestId", "requestId")
      , ("orsonAiEmotionsResponseResponseCode", "responseCode")
      , ("orsonAiEmotionsResponseResponseRaw", "responseRaw")
      , ("orsonAiEmotionsResponseStatus", "status")
      , ("orsonAiEmotionsResponseError", "error")
      , ("orsonAiEmotionsResponseAudioEmotions", "audioEmotions")
      , ("orsonAiEmotionsResponseVisualEmotions", "visualEmotions")
      ]


-- | 
data OrsonAiProdResponse = OrsonAiProdResponse
  { orsonAiProdResponseRequestId :: Maybe Text -- ^ 
  , orsonAiProdResponseResponseCode :: Maybe Int -- ^ 
  , orsonAiProdResponseResponseRaw :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON OrsonAiProdResponse where
  parseJSON = genericParseJSON optionsOrsonAiProdResponse
instance ToJSON OrsonAiProdResponse where
  toJSON = genericToJSON optionsOrsonAiProdResponse

optionsOrsonAiProdResponse :: Options
optionsOrsonAiProdResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("orsonAiProdResponseRequestId", "requestId")
      , ("orsonAiProdResponseResponseCode", "responseCode")
      , ("orsonAiProdResponseResponseRaw", "responseRaw")
      ]


-- | 
data OrsonAiProtoResponse = OrsonAiProtoResponse
  { orsonAiProtoResponseRawResponse :: Maybe Text -- ^ 
  , orsonAiProtoResponseAssetResponse :: Maybe AssetShortResponse -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON OrsonAiProtoResponse where
  parseJSON = genericParseJSON optionsOrsonAiProtoResponse
instance ToJSON OrsonAiProtoResponse where
  toJSON = genericToJSON optionsOrsonAiProtoResponse

optionsOrsonAiProtoResponse :: Options
optionsOrsonAiProtoResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("orsonAiProtoResponseRawResponse", "rawResponse")
      , ("orsonAiProtoResponseAssetResponse", "assetResponse")
      ]


-- | 
data OrsonAiSTTResponse = OrsonAiSTTResponse
  { orsonAiSTTResponseRequestId :: Maybe Text -- ^ 
  , orsonAiSTTResponseResponseCode :: Maybe Int -- ^ 
  , orsonAiSTTResponseResponseRaw :: Maybe Text -- ^ 
  , orsonAiSTTResponseText :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON OrsonAiSTTResponse where
  parseJSON = genericParseJSON optionsOrsonAiSTTResponse
instance ToJSON OrsonAiSTTResponse where
  toJSON = genericToJSON optionsOrsonAiSTTResponse

optionsOrsonAiSTTResponse :: Options
optionsOrsonAiSTTResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("orsonAiSTTResponseRequestId", "requestId")
      , ("orsonAiSTTResponseResponseCode", "responseCode")
      , ("orsonAiSTTResponseResponseRaw", "responseRaw")
      , ("orsonAiSTTResponseText", "text")
      ]


-- | 
data OrsonAiTTSResponse = OrsonAiTTSResponse
  { orsonAiTTSResponseRequestId :: Maybe Text -- ^ 
  , orsonAiTTSResponseResponseCode :: Maybe Int -- ^ 
  , orsonAiTTSResponseResponseRaw :: Maybe Text -- ^ 
  , orsonAiTTSResponseAsset :: Maybe AssetShortResponse -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON OrsonAiTTSResponse where
  parseJSON = genericParseJSON optionsOrsonAiTTSResponse
instance ToJSON OrsonAiTTSResponse where
  toJSON = genericToJSON optionsOrsonAiTTSResponse

optionsOrsonAiTTSResponse :: Options
optionsOrsonAiTTSResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("orsonAiTTSResponseRequestId", "requestId")
      , ("orsonAiTTSResponseResponseCode", "responseCode")
      , ("orsonAiTTSResponseResponseRaw", "responseRaw")
      , ("orsonAiTTSResponseAsset", "asset")
      ]


-- | 
data OrsonAiTechTuneResponse = OrsonAiTechTuneResponse
  { orsonAiTechTuneResponseRequestId :: Maybe Text -- ^ 
  , orsonAiTechTuneResponseResponseCode :: Maybe Int -- ^ 
  , orsonAiTechTuneResponseResponseRaw :: Maybe Text -- ^ 
  , orsonAiTechTuneResponsePeople :: Maybe Int -- ^ 
  , orsonAiTechTuneResponseWasCutoff :: Maybe Bool -- ^ 
  , orsonAiTechTuneResponseFrames :: Maybe Int -- ^ 
  , orsonAiTechTuneResponseFramesWithoutAFace :: Maybe Int -- ^ 
  , orsonAiTechTuneResponseFramesWithFaceOffscreen :: Maybe Int -- ^ 
  , orsonAiTechTuneResponseFramesWithWrongNumberOfPeople :: Maybe Int -- ^ 
  , orsonAiTechTuneResponseHeight :: Maybe Int -- ^ 
  , orsonAiTechTuneResponseWidth :: Maybe Int -- ^ 
  , orsonAiTechTuneResponseFps :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON OrsonAiTechTuneResponse where
  parseJSON = genericParseJSON optionsOrsonAiTechTuneResponse
instance ToJSON OrsonAiTechTuneResponse where
  toJSON = genericToJSON optionsOrsonAiTechTuneResponse

optionsOrsonAiTechTuneResponse :: Options
optionsOrsonAiTechTuneResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("orsonAiTechTuneResponseRequestId", "requestId")
      , ("orsonAiTechTuneResponseResponseCode", "responseCode")
      , ("orsonAiTechTuneResponseResponseRaw", "responseRaw")
      , ("orsonAiTechTuneResponsePeople", "people")
      , ("orsonAiTechTuneResponseWasCutoff", "wasCutoff")
      , ("orsonAiTechTuneResponseFrames", "frames")
      , ("orsonAiTechTuneResponseFramesWithoutAFace", "framesWithoutAFace")
      , ("orsonAiTechTuneResponseFramesWithFaceOffscreen", "framesWithFaceOffscreen")
      , ("orsonAiTechTuneResponseFramesWithWrongNumberOfPeople", "framesWithWrongNumberOfPeople")
      , ("orsonAiTechTuneResponseHeight", "height")
      , ("orsonAiTechTuneResponseWidth", "width")
      , ("orsonAiTechTuneResponseFps", "fps")
      ]


-- | 
data OrsonAiTopicResponse = OrsonAiTopicResponse
  { orsonAiTopicResponseWord :: Maybe Text -- ^ 
  , orsonAiTopicResponseScore :: Maybe Double -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON OrsonAiTopicResponse where
  parseJSON = genericParseJSON optionsOrsonAiTopicResponse
instance ToJSON OrsonAiTopicResponse where
  toJSON = genericToJSON optionsOrsonAiTopicResponse

optionsOrsonAiTopicResponse :: Options
optionsOrsonAiTopicResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("orsonAiTopicResponseWord", "word")
      , ("orsonAiTopicResponseScore", "score")
      ]


-- | 
data OrsonAiTopicsResponse = OrsonAiTopicsResponse
  { orsonAiTopicsResponseRequestId :: Maybe Text -- ^ 
  , orsonAiTopicsResponseResponseCode :: Maybe Int -- ^ 
  , orsonAiTopicsResponseResponseRaw :: Maybe Text -- ^ 
  , orsonAiTopicsResponseTopics :: Maybe [OrsonAiTopicResponse] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON OrsonAiTopicsResponse where
  parseJSON = genericParseJSON optionsOrsonAiTopicsResponse
instance ToJSON OrsonAiTopicsResponse where
  toJSON = genericToJSON optionsOrsonAiTopicsResponse

optionsOrsonAiTopicsResponse :: Options
optionsOrsonAiTopicsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("orsonAiTopicsResponseRequestId", "requestId")
      , ("orsonAiTopicsResponseResponseCode", "responseCode")
      , ("orsonAiTopicsResponseResponseRaw", "responseRaw")
      , ("orsonAiTopicsResponseTopics", "topics")
      ]


-- | 
data OrsonAiVisualEmotionResponse = OrsonAiVisualEmotionResponse
  { orsonAiVisualEmotionResponseRequestId :: Maybe Text -- ^ 
  , orsonAiVisualEmotionResponseResponseCode :: Maybe Int -- ^ 
  , orsonAiVisualEmotionResponseResponseRaw :: Maybe Text -- ^ 
  , orsonAiVisualEmotionResponseUserIndex :: Maybe Integer -- ^ 
  , orsonAiVisualEmotionResponseEmotion :: Maybe Text -- ^ 
  , orsonAiVisualEmotionResponseProbability :: Maybe Double -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON OrsonAiVisualEmotionResponse where
  parseJSON = genericParseJSON optionsOrsonAiVisualEmotionResponse
instance ToJSON OrsonAiVisualEmotionResponse where
  toJSON = genericToJSON optionsOrsonAiVisualEmotionResponse

optionsOrsonAiVisualEmotionResponse :: Options
optionsOrsonAiVisualEmotionResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("orsonAiVisualEmotionResponseRequestId", "requestId")
      , ("orsonAiVisualEmotionResponseResponseCode", "responseCode")
      , ("orsonAiVisualEmotionResponseResponseRaw", "responseRaw")
      , ("orsonAiVisualEmotionResponseUserIndex", "userIndex")
      , ("orsonAiVisualEmotionResponseEmotion", "emotion")
      , ("orsonAiVisualEmotionResponseProbability", "probability")
      ]


-- | 
data OrsonAiVoiceCanvasResponse = OrsonAiVoiceCanvasResponse
  { orsonAiVoiceCanvasResponseRequestId :: Maybe Text -- ^ 
  , orsonAiVoiceCanvasResponseResponseCode :: Maybe Int -- ^ 
  , orsonAiVoiceCanvasResponseResponseRaw :: Maybe Text -- ^ 
  , orsonAiVoiceCanvasResponseFilenames :: Maybe [Text] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON OrsonAiVoiceCanvasResponse where
  parseJSON = genericParseJSON optionsOrsonAiVoiceCanvasResponse
instance ToJSON OrsonAiVoiceCanvasResponse where
  toJSON = genericToJSON optionsOrsonAiVoiceCanvasResponse

optionsOrsonAiVoiceCanvasResponse :: Options
optionsOrsonAiVoiceCanvasResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("orsonAiVoiceCanvasResponseRequestId", "requestId")
      , ("orsonAiVoiceCanvasResponseResponseCode", "responseCode")
      , ("orsonAiVoiceCanvasResponseResponseRaw", "responseRaw")
      , ("orsonAiVoiceCanvasResponseFilenames", "filenames")
      ]


-- | 
data OrsonEpisodeResponse = OrsonEpisodeResponse
  { orsonEpisodeResponseId :: Maybe Text -- ^ 
  , orsonEpisodeResponseStatus :: Maybe Text -- ^ 
  , orsonEpisodeResponseStatusDescription :: Maybe Text -- ^ 
  , orsonEpisodeResponseResponseCode :: Maybe Int -- ^ 
  , orsonEpisodeResponseResponseRaw :: Maybe Text -- ^ 
  , orsonEpisodeResponseRenders :: Maybe [OrsonRenderResponse] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON OrsonEpisodeResponse where
  parseJSON = genericParseJSON optionsOrsonEpisodeResponse
instance ToJSON OrsonEpisodeResponse where
  toJSON = genericToJSON optionsOrsonEpisodeResponse

optionsOrsonEpisodeResponse :: Options
optionsOrsonEpisodeResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("orsonEpisodeResponseId", "id")
      , ("orsonEpisodeResponseStatus", "status")
      , ("orsonEpisodeResponseStatusDescription", "statusDescription")
      , ("orsonEpisodeResponseResponseCode", "responseCode")
      , ("orsonEpisodeResponseResponseRaw", "responseRaw")
      , ("orsonEpisodeResponseRenders", "renders")
      ]


-- | 
data OrsonRenderResponse = OrsonRenderResponse
  { orsonRenderResponseId :: Maybe Text -- ^ 
  , orsonRenderResponseThirdPartyAccountId :: Maybe Text -- ^ 
  , orsonRenderResponseStatus :: Maybe Text -- ^ 
  , orsonRenderResponseStatusDescription :: Maybe Text -- ^ 
  , orsonRenderResponseCompletedOn :: Maybe Text -- ^ 
  , orsonRenderResponseResponseCode :: Maybe Int -- ^ 
  , orsonRenderResponseResponseRaw :: Maybe Text -- ^ 
  , orsonRenderResponseVideo :: Maybe OrsonVideoResponse -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON OrsonRenderResponse where
  parseJSON = genericParseJSON optionsOrsonRenderResponse
instance ToJSON OrsonRenderResponse where
  toJSON = genericToJSON optionsOrsonRenderResponse

optionsOrsonRenderResponse :: Options
optionsOrsonRenderResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("orsonRenderResponseId", "id")
      , ("orsonRenderResponseThirdPartyAccountId", "thirdPartyAccountId")
      , ("orsonRenderResponseStatus", "status")
      , ("orsonRenderResponseStatusDescription", "statusDescription")
      , ("orsonRenderResponseCompletedOn", "completedOn")
      , ("orsonRenderResponseResponseCode", "responseCode")
      , ("orsonRenderResponseResponseRaw", "responseRaw")
      , ("orsonRenderResponseVideo", "video")
      ]


-- | 
data OrsonVideoResponse = OrsonVideoResponse
  { orsonVideoResponseUri :: Maybe Text -- ^ 
  , orsonVideoResponseExpires :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON OrsonVideoResponse where
  parseJSON = genericParseJSON optionsOrsonVideoResponse
instance ToJSON OrsonVideoResponse where
  toJSON = genericToJSON optionsOrsonVideoResponse

optionsOrsonVideoResponse :: Options
optionsOrsonVideoResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("orsonVideoResponseUri", "uri")
      , ("orsonVideoResponseExpires", "expires")
      ]


-- | 
data Pack = Pack
  { packId :: Maybe Integer -- ^ 
  , packActive :: Maybe Bool -- ^ 
  , packValid :: Maybe Bool -- ^ 
  , packNewOwnerId :: Maybe Integer -- ^ 
  , packOwner :: Maybe Account -- ^ 
  , packApplication :: Maybe Application -- ^ 
  , packSequenceType :: Maybe Text -- ^ 
  , packTitle :: Maybe Text -- ^ 
  , packDescription :: Maybe Text -- ^ 
  , packStartDate :: Maybe UTCTime -- ^ 
  , packEndDate :: Maybe UTCTime -- ^ 
  , packPackType :: Maybe Text -- ^ 
  , packImage :: Maybe Asset -- ^ 
  , packBackground :: Maybe Asset -- ^ 
  , packImageURL :: Maybe Text -- ^ 
  , packGameLevels :: Maybe [GameLevel] -- ^ 
  , packHasMoreItems :: Maybe Bool -- ^ 
  , packTotalCount :: Maybe Integer -- ^ 
  , packDownloaded :: Maybe Bool -- ^ 
  , packAuthorOverride :: Maybe Text -- ^ 
  , packPackOrder :: Maybe Integer -- ^ 
  , packInGame :: Maybe Bool -- ^ 
  , packHighest :: Maybe Bool -- ^ 
  , packNotificationCount :: Maybe Int -- ^ 
  , packPoints :: Maybe Integer -- ^ 
  , packTicketType :: Maybe Text -- ^ 
  , packTicketCount :: Maybe Integer -- ^ 
  , packPriceType :: Maybe Text -- ^ 
  , packPrice :: Maybe Int -- ^ 
  , packAllocateTickets :: Maybe Bool -- ^ 
  , packApplicationTitle :: Maybe Text -- ^ 
  , packLevelNumberMap :: Maybe (Map.Map String GameLevel) -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Pack where
  parseJSON = genericParseJSON optionsPack
instance ToJSON Pack where
  toJSON = genericToJSON optionsPack

optionsPack :: Options
optionsPack =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("packId", "id")
      , ("packActive", "active")
      , ("packValid", "valid")
      , ("packNewOwnerId", "newOwnerId")
      , ("packOwner", "owner")
      , ("packApplication", "application")
      , ("packSequenceType", "sequenceType")
      , ("packTitle", "title")
      , ("packDescription", "description")
      , ("packStartDate", "startDate")
      , ("packEndDate", "endDate")
      , ("packPackType", "packType")
      , ("packImage", "image")
      , ("packBackground", "background")
      , ("packImageURL", "imageURL")
      , ("packGameLevels", "gameLevels")
      , ("packHasMoreItems", "hasMoreItems")
      , ("packTotalCount", "totalCount")
      , ("packDownloaded", "downloaded")
      , ("packAuthorOverride", "authorOverride")
      , ("packPackOrder", "packOrder")
      , ("packInGame", "inGame")
      , ("packHighest", "highest")
      , ("packNotificationCount", "notificationCount")
      , ("packPoints", "points")
      , ("packTicketType", "ticketType")
      , ("packTicketCount", "ticketCount")
      , ("packPriceType", "priceType")
      , ("packPrice", "price")
      , ("packAllocateTickets", "allocateTickets")
      , ("packApplicationTitle", "applicationTitle")
      , ("packLevelNumberMap", "levelNumberMap")
      ]


-- | 
data PackListResponse = PackListResponse
  { packListResponseStart :: Maybe Int -- ^ 
  , packListResponseLimit :: Maybe Int -- ^ 
  , packListResponseCountTotal :: Maybe Integer -- ^ 
  , packListResponseItems :: Maybe [PackResponse] -- ^ 
  , packListResponseCount :: Maybe Int -- ^ 
  , packListResponseHasMoreResults :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PackListResponse where
  parseJSON = genericParseJSON optionsPackListResponse
instance ToJSON PackListResponse where
  toJSON = genericToJSON optionsPackListResponse

optionsPackListResponse :: Options
optionsPackListResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("packListResponseStart", "start")
      , ("packListResponseLimit", "limit")
      , ("packListResponseCountTotal", "countTotal")
      , ("packListResponseItems", "items")
      , ("packListResponseCount", "count")
      , ("packListResponseHasMoreResults", "hasMoreResults")
      ]


-- | 
data PackResponse = PackResponse
  { packResponseAction :: Maybe Text -- ^ 
  , packResponseHighestAppVersion :: Maybe Text -- ^ 
  , packResponseGameType :: Maybe Text -- ^ 
  , packResponsePackId :: Maybe Integer -- ^ 
  , packResponseName :: Maybe Text -- ^ 
  , packResponseDescription :: Maybe Text -- ^ 
  , packResponseActive :: Maybe Bool -- ^ 
  , packResponseDownloaded :: Maybe Bool -- ^ 
  , packResponseCompleted :: Maybe Bool -- ^ 
  , packResponseIcon :: Maybe AssetShortResponse -- ^ 
  , packResponseBackground :: Maybe AssetShortResponse -- ^ 
  , packResponseTicketsEarned :: Maybe Integer -- ^ 
  , packResponseLevels :: Maybe GameLevelListResponse -- ^ 
  , packResponseSequenceType :: Maybe Text -- ^ 
  , packResponseScores :: Maybe ScoreListResponse -- ^ 
  , packResponseOwner :: Maybe AccountShortResponse -- ^ 
  , packResponseCostToRedeem :: Maybe Integer -- ^ 
  , packResponsePrice :: Maybe Integer -- ^ 
  , packResponsePriceType :: Maybe Text -- ^ 
  , packResponseUserPermissionsList :: Maybe UserPermissionsListResponse -- ^ 
  , packResponseResults :: Maybe [NameStringValueResponse] -- ^ 
  , packResponseTickets :: Maybe TicketListResponse -- ^ 
  , packResponseAuthorOverride :: Maybe Text -- ^ 
  , packResponseUpdatedDate :: Maybe Integer -- ^ 
  , packResponseStartDate :: Maybe Integer -- ^ 
  , packResponseEndDate :: Maybe Integer -- ^ 
  , packResponsePackType :: Maybe Text -- ^ 
  , packResponsePackOrder :: Maybe Integer -- ^ 
  , packResponseAppKey :: Maybe Text -- ^ 
  , packResponseApplication :: Maybe ApplicationShortResponse -- ^ 
  , packResponseInGame :: Maybe Bool -- ^ 
  , packResponseHighest :: Maybe Bool -- ^ 
  , packResponseAllocateTickets :: Maybe Bool -- ^ 
  , packResponseTicketType :: Maybe Text -- ^ 
  , packResponseTicketCount :: Maybe Integer -- ^ 
  , packResponsePoints :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PackResponse where
  parseJSON = genericParseJSON optionsPackResponse
instance ToJSON PackResponse where
  toJSON = genericToJSON optionsPackResponse

optionsPackResponse :: Options
optionsPackResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("packResponseAction", "action")
      , ("packResponseHighestAppVersion", "highestAppVersion")
      , ("packResponseGameType", "gameType")
      , ("packResponsePackId", "packId")
      , ("packResponseName", "name")
      , ("packResponseDescription", "description")
      , ("packResponseActive", "active")
      , ("packResponseDownloaded", "downloaded")
      , ("packResponseCompleted", "completed")
      , ("packResponseIcon", "icon")
      , ("packResponseBackground", "background")
      , ("packResponseTicketsEarned", "ticketsEarned")
      , ("packResponseLevels", "levels")
      , ("packResponseSequenceType", "sequenceType")
      , ("packResponseScores", "scores")
      , ("packResponseOwner", "owner")
      , ("packResponseCostToRedeem", "costToRedeem")
      , ("packResponsePrice", "price")
      , ("packResponsePriceType", "priceType")
      , ("packResponseUserPermissionsList", "userPermissionsList")
      , ("packResponseResults", "results")
      , ("packResponseTickets", "tickets")
      , ("packResponseAuthorOverride", "authorOverride")
      , ("packResponseUpdatedDate", "updatedDate")
      , ("packResponseStartDate", "startDate")
      , ("packResponseEndDate", "endDate")
      , ("packResponsePackType", "packType")
      , ("packResponsePackOrder", "packOrder")
      , ("packResponseAppKey", "appKey")
      , ("packResponseApplication", "application")
      , ("packResponseInGame", "inGame")
      , ("packResponseHighest", "highest")
      , ("packResponseAllocateTickets", "allocateTickets")
      , ("packResponseTicketType", "ticketType")
      , ("packResponseTicketCount", "ticketCount")
      , ("packResponsePoints", "points")
      ]


-- | 
data Participant = Participant
  { participantId :: Maybe Integer -- ^ 
  , participantActive :: Maybe Bool -- ^ 
  , participantValid :: Maybe Bool -- ^ 
  , participantAccount :: Maybe Account -- ^ 
  , participantAvailableStart :: Maybe UTCTime -- ^ 
  , participantAvailableEnd :: Maybe UTCTime -- ^ 
  , participantColor1 :: Maybe Text -- ^ 
  , participantColor2 :: Maybe Text -- ^ 
  , participantType :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Participant where
  parseJSON = genericParseJSON optionsParticipant
instance ToJSON Participant where
  toJSON = genericToJSON optionsParticipant

optionsParticipant :: Options
optionsParticipant =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("participantId", "id")
      , ("participantActive", "active")
      , ("participantValid", "valid")
      , ("participantAccount", "account")
      , ("participantAvailableStart", "availableStart")
      , ("participantAvailableEnd", "availableEnd")
      , ("participantColor1", "color1")
      , ("participantColor2", "color2")
      , ("participantType", "type")
      ]


-- | 
data ParticipantResponse = ParticipantResponse
  { participantResponseId :: Maybe Integer -- ^ 
  , participantResponseAccount :: Maybe AccountMiniResponse -- ^ 
  , participantResponseAvailableStart :: Maybe Integer -- ^ 
  , participantResponseAvailableEnd :: Maybe Integer -- ^ 
  , participantResponseColor1 :: Maybe Text -- ^ 
  , participantResponseColor2 :: Maybe Text -- ^ 
  , participantResponseType :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ParticipantResponse where
  parseJSON = genericParseJSON optionsParticipantResponse
instance ToJSON ParticipantResponse where
  toJSON = genericToJSON optionsParticipantResponse

optionsParticipantResponse :: Options
optionsParticipantResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("participantResponseId", "id")
      , ("participantResponseAccount", "account")
      , ("participantResponseAvailableStart", "availableStart")
      , ("participantResponseAvailableEnd", "availableEnd")
      , ("participantResponseColor1", "color1")
      , ("participantResponseColor2", "color2")
      , ("participantResponseType", "type")
      ]


-- | 
data PathingResponse = PathingResponse
  { pathingResponseStart :: Maybe NodeRequest -- ^ 
  , pathingResponseEnd :: Maybe NodeRequest -- ^ 
  , pathingResponseWaypoints :: Maybe [NodeRequest] -- ^ 
  , pathingResponseExclusions :: Maybe [NodeRequest] -- ^ 
  , pathingResponseWidth :: Maybe Int -- ^ 
  , pathingResponseHeight :: Maybe Int -- ^ 
  , pathingResponseSouthwest :: Maybe NodeRequest -- ^ 
  , pathingResponseNortheast :: Maybe NodeRequest -- ^ 
  , pathingResponseMetersPerX :: Maybe Double -- ^ 
  , pathingResponseMetersPerY :: Maybe Double -- ^ 
  , pathingResponsePath :: Maybe [NodeRequest] -- ^ 
  , pathingResponsePathCount :: Maybe Int -- ^ 
  , pathingResponseDirections :: Maybe [DirectionResponse] -- ^ 
  , pathingResponseDirectionCount :: Maybe Int -- ^ 
  , pathingResponseSwcalibration :: Maybe NodeRequest -- ^ 
  , pathingResponseCalibrationBearings :: Maybe Double -- ^ 
  , pathingResponseNecalibration :: Maybe NodeRequest -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PathingResponse where
  parseJSON = genericParseJSON optionsPathingResponse
instance ToJSON PathingResponse where
  toJSON = genericToJSON optionsPathingResponse

optionsPathingResponse :: Options
optionsPathingResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("pathingResponseStart", "start")
      , ("pathingResponseEnd", "end")
      , ("pathingResponseWaypoints", "waypoints")
      , ("pathingResponseExclusions", "exclusions")
      , ("pathingResponseWidth", "width")
      , ("pathingResponseHeight", "height")
      , ("pathingResponseSouthwest", "southwest")
      , ("pathingResponseNortheast", "northeast")
      , ("pathingResponseMetersPerX", "metersPerX")
      , ("pathingResponseMetersPerY", "metersPerY")
      , ("pathingResponsePath", "path")
      , ("pathingResponsePathCount", "pathCount")
      , ("pathingResponseDirections", "directions")
      , ("pathingResponseDirectionCount", "directionCount")
      , ("pathingResponseSwcalibration", "swcalibration")
      , ("pathingResponseCalibrationBearings", "calibrationBearings")
      , ("pathingResponseNecalibration", "necalibration")
      ]


-- | 
data PaymentRequest = PaymentRequest
  { paymentRequestAppKey :: Maybe Text -- ^ 
  , paymentRequestClientPaymentId :: Maybe Text -- ^ 
  , paymentRequestMinAgeYears :: Maybe Int -- ^ 
  , paymentRequestInvoice :: Maybe Invoice -- ^ 
  , paymentRequestBiometrics :: Maybe BiometricRequest -- ^ 
  , paymentRequestOrderItems :: Maybe [OrderItemRequest] -- ^ 
  , paymentRequestAcceptedBilling :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PaymentRequest where
  parseJSON = genericParseJSON optionsPaymentRequest
instance ToJSON PaymentRequest where
  toJSON = genericToJSON optionsPaymentRequest

optionsPaymentRequest :: Options
optionsPaymentRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("paymentRequestAppKey", "appKey")
      , ("paymentRequestClientPaymentId", "clientPaymentId")
      , ("paymentRequestMinAgeYears", "minAgeYears")
      , ("paymentRequestInvoice", "invoice")
      , ("paymentRequestBiometrics", "biometrics")
      , ("paymentRequestOrderItems", "orderItems")
      , ("paymentRequestAcceptedBilling", "acceptedBilling")
      ]


-- | 
data PaymentTransactionResponse = PaymentTransactionResponse
  { paymentTransactionResponseValid :: Maybe Bool -- ^ 
  , paymentTransactionResponseMessage :: Maybe Text -- ^ 
  , paymentTransactionResponseVersion :: Maybe Double -- ^ 
  , paymentTransactionResponseSerializeNulls :: Maybe Bool -- ^ 
  , paymentTransactionResponseStartTimeLog :: Maybe Integer -- ^ 
  , paymentTransactionResponseErrorCode :: Maybe Text -- ^ 
  , paymentTransactionResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , paymentTransactionResponsePaymentTransactionId :: Maybe Integer -- ^ 
  , paymentTransactionResponseCustomer :: Maybe AccountShortResponse -- ^ 
  , paymentTransactionResponsePromoCode :: Maybe Text -- ^ 
  , paymentTransactionResponseRemoteRefId :: Maybe Text -- ^ 
  , paymentTransactionResponseCurrencyType :: Maybe Text -- ^ 
  , paymentTransactionResponseAmount :: Maybe Double -- ^ 
  , paymentTransactionResponseTax :: Maybe Double -- ^ 
  , paymentTransactionResponseOfferTransactions :: Maybe [OfferTransactionResponse] -- ^ 
  , paymentTransactionResponseOrderItems :: Maybe [PurchaseOrderItemResponse] -- ^ 
  , paymentTransactionResponseExternalPaymentId :: Maybe Text -- ^ 
  , paymentTransactionResponseMetadata :: Maybe Text -- ^ 
  , paymentTransactionResponseCreated :: Maybe Integer -- ^ 
  , paymentTransactionResponseUpdated :: Maybe Integer -- ^ 
  , paymentTransactionResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PaymentTransactionResponse where
  parseJSON = genericParseJSON optionsPaymentTransactionResponse
instance ToJSON PaymentTransactionResponse where
  toJSON = genericToJSON optionsPaymentTransactionResponse

optionsPaymentTransactionResponse :: Options
optionsPaymentTransactionResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("paymentTransactionResponseValid", "valid")
      , ("paymentTransactionResponseMessage", "message")
      , ("paymentTransactionResponseVersion", "version")
      , ("paymentTransactionResponseSerializeNulls", "serializeNulls")
      , ("paymentTransactionResponseStartTimeLog", "startTimeLog")
      , ("paymentTransactionResponseErrorCode", "errorCode")
      , ("paymentTransactionResponseRequest", "request")
      , ("paymentTransactionResponsePaymentTransactionId", "paymentTransactionId")
      , ("paymentTransactionResponseCustomer", "customer")
      , ("paymentTransactionResponsePromoCode", "promoCode")
      , ("paymentTransactionResponseRemoteRefId", "remoteRefId")
      , ("paymentTransactionResponseCurrencyType", "currencyType")
      , ("paymentTransactionResponseAmount", "amount")
      , ("paymentTransactionResponseTax", "tax")
      , ("paymentTransactionResponseOfferTransactions", "offerTransactions")
      , ("paymentTransactionResponseOrderItems", "orderItems")
      , ("paymentTransactionResponseExternalPaymentId", "externalPaymentId")
      , ("paymentTransactionResponseMetadata", "metadata")
      , ("paymentTransactionResponseCreated", "created")
      , ("paymentTransactionResponseUpdated", "updated")
      , ("paymentTransactionResponseReturning", "returning")
      ]


-- | 
data PaymentTypesResponse = PaymentTypesResponse
  { paymentTypesResponseValid :: Maybe Bool -- ^ 
  , paymentTypesResponseMessage :: Maybe Text -- ^ 
  , paymentTypesResponseVersion :: Maybe Double -- ^ 
  , paymentTypesResponseSerializeNulls :: Maybe Bool -- ^ 
  , paymentTypesResponseStartTimeLog :: Maybe Integer -- ^ 
  , paymentTypesResponseErrorCode :: Maybe Text -- ^ 
  , paymentTypesResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , paymentTypesResponseCreditCardOnFile :: Maybe Bool -- ^ 
  , paymentTypesResponseCreditCardNumber :: Maybe Text -- ^ 
  , paymentTypesResponseCreditCardExpirationMonth :: Maybe Text -- ^ 
  , paymentTypesResponseCreditCardExpirationYear :: Maybe Text -- ^ 
  , paymentTypesResponsePointsOnFile :: Maybe Bool -- ^ 
  , paymentTypesResponsePointsAmount :: Maybe Double -- ^ 
  , paymentTypesResponseAccount :: Maybe AccountShortResponse -- ^ 
  , paymentTypesResponseFirstName :: Maybe Text -- ^ 
  , paymentTypesResponseLastName :: Maybe Text -- ^ 
  , paymentTypesResponseAddress :: Maybe Text -- ^ 
  , paymentTypesResponseCity :: Maybe Text -- ^ 
  , paymentTypesResponseState :: Maybe Text -- ^ 
  , paymentTypesResponsePostalCode :: Maybe Text -- ^ 
  , paymentTypesResponsePhone :: Maybe Text -- ^ 
  , paymentTypesResponseProvider :: Maybe Text -- ^ 
  , paymentTypesResponsePaymentMethodId :: Maybe Integer -- ^ 
  , paymentTypesResponseValidated :: Maybe Bool -- ^ 
  , paymentTypesResponseAccountNumber :: Maybe Text -- ^ 
  , paymentTypesResponseBankName :: Maybe Text -- ^ 
  , paymentTypesResponseRoutingNumber :: Maybe Text -- ^ 
  , paymentTypesResponseIsDefaultPaymentMethod :: Maybe Bool -- ^ 
  , paymentTypesResponseAccountName :: Maybe Text -- ^ 
  , paymentTypesResponsePaymentMethodNickname :: Maybe Text -- ^ 
  , paymentTypesResponseTaxId :: Maybe Text -- ^ 
  , paymentTypesResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PaymentTypesResponse where
  parseJSON = genericParseJSON optionsPaymentTypesResponse
instance ToJSON PaymentTypesResponse where
  toJSON = genericToJSON optionsPaymentTypesResponse

optionsPaymentTypesResponse :: Options
optionsPaymentTypesResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("paymentTypesResponseValid", "valid")
      , ("paymentTypesResponseMessage", "message")
      , ("paymentTypesResponseVersion", "version")
      , ("paymentTypesResponseSerializeNulls", "serializeNulls")
      , ("paymentTypesResponseStartTimeLog", "startTimeLog")
      , ("paymentTypesResponseErrorCode", "errorCode")
      , ("paymentTypesResponseRequest", "request")
      , ("paymentTypesResponseCreditCardOnFile", "creditCardOnFile")
      , ("paymentTypesResponseCreditCardNumber", "creditCardNumber")
      , ("paymentTypesResponseCreditCardExpirationMonth", "creditCardExpirationMonth")
      , ("paymentTypesResponseCreditCardExpirationYear", "creditCardExpirationYear")
      , ("paymentTypesResponsePointsOnFile", "pointsOnFile")
      , ("paymentTypesResponsePointsAmount", "pointsAmount")
      , ("paymentTypesResponseAccount", "account")
      , ("paymentTypesResponseFirstName", "firstName")
      , ("paymentTypesResponseLastName", "lastName")
      , ("paymentTypesResponseAddress", "address")
      , ("paymentTypesResponseCity", "city")
      , ("paymentTypesResponseState", "state")
      , ("paymentTypesResponsePostalCode", "postalCode")
      , ("paymentTypesResponsePhone", "phone")
      , ("paymentTypesResponseProvider", "provider")
      , ("paymentTypesResponsePaymentMethodId", "paymentMethodId")
      , ("paymentTypesResponseValidated", "validated")
      , ("paymentTypesResponseAccountNumber", "accountNumber")
      , ("paymentTypesResponseBankName", "bankName")
      , ("paymentTypesResponseRoutingNumber", "routingNumber")
      , ("paymentTypesResponseIsDefaultPaymentMethod", "isDefaultPaymentMethod")
      , ("paymentTypesResponseAccountName", "accountName")
      , ("paymentTypesResponsePaymentMethodNickname", "paymentMethodNickname")
      , ("paymentTypesResponseTaxId", "taxId")
      , ("paymentTypesResponseReturning", "returning")
      ]


-- | 
data PermissionResponse = PermissionResponse
  { permissionResponseValid :: Maybe Bool -- ^ 
  , permissionResponseMessage :: Maybe Text -- ^ 
  , permissionResponseVersion :: Maybe Double -- ^ 
  , permissionResponseSerializeNulls :: Maybe Bool -- ^ 
  , permissionResponseStartTimeLog :: Maybe Integer -- ^ 
  , permissionResponseErrorCode :: Maybe Text -- ^ 
  , permissionResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , permissionResponseRead :: Maybe Bool -- ^ 
  , permissionResponseWrite :: Maybe Bool -- ^ 
  , permissionResponseDelete :: Maybe Bool -- ^ 
  , permissionResponseAdd :: Maybe Bool -- ^ 
  , permissionResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PermissionResponse where
  parseJSON = genericParseJSON optionsPermissionResponse
instance ToJSON PermissionResponse where
  toJSON = genericToJSON optionsPermissionResponse

optionsPermissionResponse :: Options
optionsPermissionResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("permissionResponseValid", "valid")
      , ("permissionResponseMessage", "message")
      , ("permissionResponseVersion", "version")
      , ("permissionResponseSerializeNulls", "serializeNulls")
      , ("permissionResponseStartTimeLog", "startTimeLog")
      , ("permissionResponseErrorCode", "errorCode")
      , ("permissionResponseRequest", "request")
      , ("permissionResponseRead", "read")
      , ("permissionResponseWrite", "write")
      , ("permissionResponseDelete", "delete")
      , ("permissionResponseAdd", "add")
      , ("permissionResponseReturning", "returning")
      ]


-- | 
data Permissions = Permissions
  { permissionsRead :: Maybe Bool -- ^ 
  , permissionsWrite :: Maybe Bool -- ^ 
  , permissionsDelete :: Maybe Bool -- ^ 
  , permissionsAdd :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Permissions where
  parseJSON = genericParseJSON optionsPermissions
instance ToJSON Permissions where
  toJSON = genericToJSON optionsPermissions

optionsPermissions :: Options
optionsPermissions =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("permissionsRead", "read")
      , ("permissionsWrite", "write")
      , ("permissionsDelete", "delete")
      , ("permissionsAdd", "add")
      ]


-- | 
data PersonalProfileResponse = PersonalProfileResponse
  { personalProfileResponseValid :: Maybe Bool -- ^ 
  , personalProfileResponseMessage :: Maybe Text -- ^ 
  , personalProfileResponseVersion :: Maybe Double -- ^ 
  , personalProfileResponseSerializeNulls :: Maybe Bool -- ^ 
  , personalProfileResponseStartTimeLog :: Maybe Integer -- ^ 
  , personalProfileResponseErrorCode :: Maybe Text -- ^ 
  , personalProfileResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , personalProfileResponsePreferredGender :: Maybe Text -- ^ 
  , personalProfileResponsePreferredEthnicity :: Maybe Text -- ^ 
  , personalProfileResponsePreferredEducation :: Maybe Text -- ^ 
  , personalProfileResponsePreferredEducationIndex :: Maybe Int -- ^ 
  , personalProfileResponsePreferredBodyType :: Maybe Text -- ^ 
  , personalProfileResponsePreferredMinAge :: Maybe Int -- ^ 
  , personalProfileResponsePreferredMaxAge :: Maybe Int -- ^ 
  , personalProfileResponsePreferredMinHeight :: Maybe Int -- ^ 
  , personalProfileResponsePreferredMaxHeight :: Maybe Int -- ^ 
  , personalProfileResponsePreferredLocationRange :: Maybe Double -- ^ 
  , personalProfileResponseGender :: Maybe Text -- ^ 
  , personalProfileResponseHometown :: Maybe Text -- ^ 
  , personalProfileResponseHeight :: Maybe Text -- ^ 
  , personalProfileResponseHeightIndex :: Maybe Int -- ^ 
  , personalProfileResponseEthnicity :: Maybe Text -- ^ 
  , personalProfileResponseBodyType :: Maybe Text -- ^ 
  , personalProfileResponseChildren :: Maybe Text -- ^ 
  , personalProfileResponseCompanionship :: Maybe Text -- ^ 
  , personalProfileResponseCompanionshipIndex :: Maybe Int -- ^ 
  , personalProfileResponseDrink :: Maybe Text -- ^ 
  , personalProfileResponseEducation :: Maybe Text -- ^ 
  , personalProfileResponseEducationIndex :: Maybe Int -- ^ 
  , personalProfileResponseMaritalStatus :: Maybe Text -- ^ 
  , personalProfileResponseSmoke :: Maybe Text -- ^ 
  , personalProfileResponseReligion :: Maybe Text -- ^ 
  , personalProfileResponseBirthday :: Maybe Integer -- ^ 
  , personalProfileResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PersonalProfileResponse where
  parseJSON = genericParseJSON optionsPersonalProfileResponse
instance ToJSON PersonalProfileResponse where
  toJSON = genericToJSON optionsPersonalProfileResponse

optionsPersonalProfileResponse :: Options
optionsPersonalProfileResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("personalProfileResponseValid", "valid")
      , ("personalProfileResponseMessage", "message")
      , ("personalProfileResponseVersion", "version")
      , ("personalProfileResponseSerializeNulls", "serializeNulls")
      , ("personalProfileResponseStartTimeLog", "startTimeLog")
      , ("personalProfileResponseErrorCode", "errorCode")
      , ("personalProfileResponseRequest", "request")
      , ("personalProfileResponsePreferredGender", "preferredGender")
      , ("personalProfileResponsePreferredEthnicity", "preferredEthnicity")
      , ("personalProfileResponsePreferredEducation", "preferredEducation")
      , ("personalProfileResponsePreferredEducationIndex", "preferredEducationIndex")
      , ("personalProfileResponsePreferredBodyType", "preferredBodyType")
      , ("personalProfileResponsePreferredMinAge", "preferredMinAge")
      , ("personalProfileResponsePreferredMaxAge", "preferredMaxAge")
      , ("personalProfileResponsePreferredMinHeight", "preferredMinHeight")
      , ("personalProfileResponsePreferredMaxHeight", "preferredMaxHeight")
      , ("personalProfileResponsePreferredLocationRange", "preferredLocationRange")
      , ("personalProfileResponseGender", "gender")
      , ("personalProfileResponseHometown", "hometown")
      , ("personalProfileResponseHeight", "height")
      , ("personalProfileResponseHeightIndex", "heightIndex")
      , ("personalProfileResponseEthnicity", "ethnicity")
      , ("personalProfileResponseBodyType", "bodyType")
      , ("personalProfileResponseChildren", "children")
      , ("personalProfileResponseCompanionship", "companionship")
      , ("personalProfileResponseCompanionshipIndex", "companionshipIndex")
      , ("personalProfileResponseDrink", "drink")
      , ("personalProfileResponseEducation", "education")
      , ("personalProfileResponseEducationIndex", "educationIndex")
      , ("personalProfileResponseMaritalStatus", "maritalStatus")
      , ("personalProfileResponseSmoke", "smoke")
      , ("personalProfileResponseReligion", "religion")
      , ("personalProfileResponseBirthday", "birthday")
      , ("personalProfileResponseReturning", "returning")
      ]


-- | 
data Placement = Placement
  { placementId :: Maybe Integer -- ^ 
  , placementActive :: Maybe Bool -- ^ 
  , placementValid :: Maybe Bool -- ^ 
  , placementApplication :: Maybe Application -- ^ 
  , placementName :: Maybe Text -- ^ 
  , placementDescription :: Maybe Text -- ^ 
  , placementSize :: Maybe Text -- ^ 
  , placementClickType :: Maybe Text -- ^ 
  , placementHeight :: Maybe Int -- ^ 
  , placementWidth :: Maybe Int -- ^ 
  , placementRefreshInterval :: Maybe Int -- ^ 
  , placementDefaultImage :: Maybe Asset -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Placement where
  parseJSON = genericParseJSON optionsPlacement
instance ToJSON Placement where
  toJSON = genericToJSON optionsPlacement

optionsPlacement :: Options
optionsPlacement =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("placementId", "id")
      , ("placementActive", "active")
      , ("placementValid", "valid")
      , ("placementApplication", "application")
      , ("placementName", "name")
      , ("placementDescription", "description")
      , ("placementSize", "size")
      , ("placementClickType", "clickType")
      , ("placementHeight", "height")
      , ("placementWidth", "width")
      , ("placementRefreshInterval", "refreshInterval")
      , ("placementDefaultImage", "defaultImage")
      ]


-- | 
data PlacementResponse = PlacementResponse
  { placementResponsePlacementId :: Maybe Integer -- ^ 
  , placementResponseName :: Maybe Text -- ^ 
  , placementResponseDescription :: Maybe Text -- ^ 
  , placementResponseSize :: Maybe Text -- ^ 
  , placementResponseHeight :: Maybe Int -- ^ 
  , placementResponseWidth :: Maybe Int -- ^ 
  , placementResponseRefreshInterval :: Maybe Int -- ^ 
  , placementResponseAppName :: Maybe Text -- ^ 
  , placementResponseAppKey :: Maybe Text -- ^ 
  , placementResponseActive :: Maybe Bool -- ^ 
  , placementResponseDefaultImage :: Maybe AssetShortResponse -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PlacementResponse where
  parseJSON = genericParseJSON optionsPlacementResponse
instance ToJSON PlacementResponse where
  toJSON = genericToJSON optionsPlacementResponse

optionsPlacementResponse :: Options
optionsPlacementResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("placementResponsePlacementId", "placementId")
      , ("placementResponseName", "name")
      , ("placementResponseDescription", "description")
      , ("placementResponseSize", "size")
      , ("placementResponseHeight", "height")
      , ("placementResponseWidth", "width")
      , ("placementResponseRefreshInterval", "refreshInterval")
      , ("placementResponseAppName", "appName")
      , ("placementResponseAppKey", "appKey")
      , ("placementResponseActive", "active")
      , ("placementResponseDefaultImage", "defaultImage")
      ]


-- | 
data Platform = Platform
  { platformId :: Maybe Integer -- ^ 
  , platformActive :: Maybe Bool -- ^ 
  , platformValid :: Maybe Bool -- ^ 
  , platformDevice :: Maybe AudienceDevice -- ^ 
  , platformMinimum :: Maybe Integer -- ^ 
  , platformMaximum :: Maybe Integer -- ^ 
  , platformDownloadUrl :: Maybe Text -- ^ 
  , platformDescription :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Platform where
  parseJSON = genericParseJSON optionsPlatform
instance ToJSON Platform where
  toJSON = genericToJSON optionsPlatform

optionsPlatform :: Options
optionsPlatform =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("platformId", "id")
      , ("platformActive", "active")
      , ("platformValid", "valid")
      , ("platformDevice", "device")
      , ("platformMinimum", "minimum")
      , ("platformMaximum", "maximum")
      , ("platformDownloadUrl", "downloadUrl")
      , ("platformDescription", "description")
      ]


-- | 
data PlatformResponse = PlatformResponse
  { platformResponseDeviceId :: Maybe Integer -- ^ 
  , platformResponseActive :: Maybe Bool -- ^ 
  , platformResponseName :: Maybe Text -- ^ 
  , platformResponseDisplay :: Maybe Text -- ^ 
  , platformResponseMinimum :: Maybe Integer -- ^ 
  , platformResponseMaximum :: Maybe Integer -- ^ 
  , platformResponseDownloadUrl :: Maybe Text -- ^ 
  , platformResponseDescription :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PlatformResponse where
  parseJSON = genericParseJSON optionsPlatformResponse
instance ToJSON PlatformResponse where
  toJSON = genericToJSON optionsPlatformResponse

optionsPlatformResponse :: Options
optionsPlatformResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("platformResponseDeviceId", "deviceId")
      , ("platformResponseActive", "active")
      , ("platformResponseName", "name")
      , ("platformResponseDisplay", "display")
      , ("platformResponseMinimum", "minimum")
      , ("platformResponseMaximum", "maximum")
      , ("platformResponseDownloadUrl", "downloadUrl")
      , ("platformResponseDescription", "description")
      ]


-- | 
data PostalCode = PostalCode
  { postalCodeId :: Maybe Integer -- ^ 
  , postalCodeActive :: Maybe Bool -- ^ 
  , postalCodeValid :: Maybe Bool -- ^ 
  , postalCodeLatitude :: Maybe Double -- ^ 
  , postalCodeLongitude :: Maybe Double -- ^ 
  , postalCodeLocationDescription :: Maybe Text -- ^ 
  , postalCodeCode :: Maybe Text -- ^ 
  , postalCodePlus4 :: Maybe Text -- ^ 
  , postalCodeStateCode :: Maybe Text -- ^ 
  , postalCodeCity :: Maybe Text -- ^ 
  , postalCodeTimeZone :: Maybe Text -- ^ 
  , postalCodeUtcOffset :: Maybe Int -- ^ 
  , postalCodeRegions :: Maybe [Region] -- ^ 
  , postalCodeEliminated :: Maybe Bool -- ^ 
  , postalCodeSearchPoint :: Maybe Bool -- ^ 
  , postalCodeLastOfferImport :: Maybe UTCTime -- ^ 
  , postalCodeTruncatedLatitude :: Maybe Double -- ^ 
  , postalCodeTruncatedLongitude :: Maybe Double -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PostalCode where
  parseJSON = genericParseJSON optionsPostalCode
instance ToJSON PostalCode where
  toJSON = genericToJSON optionsPostalCode

optionsPostalCode :: Options
optionsPostalCode =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("postalCodeId", "id")
      , ("postalCodeActive", "active")
      , ("postalCodeValid", "valid")
      , ("postalCodeLatitude", "latitude")
      , ("postalCodeLongitude", "longitude")
      , ("postalCodeLocationDescription", "locationDescription")
      , ("postalCodeCode", "code")
      , ("postalCodePlus4", "plus4")
      , ("postalCodeStateCode", "stateCode")
      , ("postalCodeCity", "city")
      , ("postalCodeTimeZone", "timeZone")
      , ("postalCodeUtcOffset", "utcOffset")
      , ("postalCodeRegions", "regions")
      , ("postalCodeEliminated", "eliminated")
      , ("postalCodeSearchPoint", "searchPoint")
      , ("postalCodeLastOfferImport", "lastOfferImport")
      , ("postalCodeTruncatedLatitude", "truncatedLatitude")
      , ("postalCodeTruncatedLongitude", "truncatedLongitude")
      ]


-- | 
data PostalCodeResponse = PostalCodeResponse
  { postalCodeResponseCity :: Maybe Text -- ^ 
  , postalCodeResponseStateCode :: Maybe Text -- ^ 
  , postalCodeResponseCode :: Maybe Text -- ^ 
  , postalCodeResponseLatitude :: Maybe Double -- ^ 
  , postalCodeResponseLongitude :: Maybe Double -- ^ 
  , postalCodeResponseTimezone :: Maybe Text -- ^ 
  , postalCodeResponseUtcOffset :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PostalCodeResponse where
  parseJSON = genericParseJSON optionsPostalCodeResponse
instance ToJSON PostalCodeResponse where
  toJSON = genericToJSON optionsPostalCodeResponse

optionsPostalCodeResponse :: Options
optionsPostalCodeResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("postalCodeResponseCity", "city")
      , ("postalCodeResponseStateCode", "stateCode")
      , ("postalCodeResponseCode", "code")
      , ("postalCodeResponseLatitude", "latitude")
      , ("postalCodeResponseLongitude", "longitude")
      , ("postalCodeResponseTimezone", "timezone")
      , ("postalCodeResponseUtcOffset", "utcOffset")
      ]


-- | 
data PredictedLocationResponse = PredictedLocationResponse
  { predictedLocationResponseOwnerId :: Maybe Integer -- ^ 
  , predictedLocationResponseOnDate :: Maybe Text -- ^ 
  , predictedLocationResponseOnDateMilli :: Maybe Integer -- ^ 
  , predictedLocationResponseHour :: Maybe Int -- ^ 
  , predictedLocationResponseLatitude :: Maybe Double -- ^ 
  , predictedLocationResponseLongitude :: Maybe Double -- ^ 
  , predictedLocationResponseDistance :: Maybe Double -- ^ 
  , predictedLocationResponseMatches :: Maybe Integer -- ^ 
  , predictedLocationResponseAverageDuration :: Maybe Double -- ^ 
  , predictedLocationResponseWeightedScore :: Maybe Double -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PredictedLocationResponse where
  parseJSON = genericParseJSON optionsPredictedLocationResponse
instance ToJSON PredictedLocationResponse where
  toJSON = genericToJSON optionsPredictedLocationResponse

optionsPredictedLocationResponse :: Options
optionsPredictedLocationResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("predictedLocationResponseOwnerId", "ownerId")
      , ("predictedLocationResponseOnDate", "onDate")
      , ("predictedLocationResponseOnDateMilli", "onDateMilli")
      , ("predictedLocationResponseHour", "hour")
      , ("predictedLocationResponseLatitude", "latitude")
      , ("predictedLocationResponseLongitude", "longitude")
      , ("predictedLocationResponseDistance", "distance")
      , ("predictedLocationResponseMatches", "matches")
      , ("predictedLocationResponseAverageDuration", "averageDuration")
      , ("predictedLocationResponseWeightedScore", "weightedScore")
      ]


-- | 
data PreferredLocationResponse = PreferredLocationResponse
  { preferredLocationResponseOwnerId :: Maybe Integer -- ^ 
  , preferredLocationResponseOnDate :: Maybe Text -- ^ 
  , preferredLocationResponseOnDateMilli :: Maybe Integer -- ^ 
  , preferredLocationResponseHour :: Maybe Int -- ^ 
  , preferredLocationResponseLatitude :: Maybe Double -- ^ 
  , preferredLocationResponseLongitude :: Maybe Double -- ^ 
  , preferredLocationResponseDistance :: Maybe Double -- ^ 
  , preferredLocationResponseDuration :: Maybe Integer -- ^ 
  , preferredLocationResponseStartStepId :: Maybe Integer -- ^ 
  , preferredLocationResponseEndStepId :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PreferredLocationResponse where
  parseJSON = genericParseJSON optionsPreferredLocationResponse
instance ToJSON PreferredLocationResponse where
  toJSON = genericToJSON optionsPreferredLocationResponse

optionsPreferredLocationResponse :: Options
optionsPreferredLocationResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("preferredLocationResponseOwnerId", "ownerId")
      , ("preferredLocationResponseOnDate", "onDate")
      , ("preferredLocationResponseOnDateMilli", "onDateMilli")
      , ("preferredLocationResponseHour", "hour")
      , ("preferredLocationResponseLatitude", "latitude")
      , ("preferredLocationResponseLongitude", "longitude")
      , ("preferredLocationResponseDistance", "distance")
      , ("preferredLocationResponseDuration", "duration")
      , ("preferredLocationResponseStartStepId", "startStepId")
      , ("preferredLocationResponseEndStepId", "endStepId")
      ]


-- | 
data PreviewPersonaResponse = PreviewPersonaResponse
  { previewPersonaResponsePersonaId :: Maybe Integer -- ^ 
  , previewPersonaResponseTitle :: Maybe Text -- ^ 
  , previewPersonaResponsePreviewAccounts :: Maybe [AccountMiniResponse] -- ^ 
  , previewPersonaResponseActive :: Maybe Bool -- ^ 
  , previewPersonaResponseDate :: Maybe Integer -- ^ 
  , previewPersonaResponseAge :: Maybe Int -- ^ 
  , previewPersonaResponseGender :: Maybe Text -- ^ 
  , previewPersonaResponseGameExperienceLevel :: Maybe Text -- ^ 
  , previewPersonaResponseLatitude :: Maybe Double -- ^ 
  , previewPersonaResponseLongitude :: Maybe Double -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PreviewPersonaResponse where
  parseJSON = genericParseJSON optionsPreviewPersonaResponse
instance ToJSON PreviewPersonaResponse where
  toJSON = genericToJSON optionsPreviewPersonaResponse

optionsPreviewPersonaResponse :: Options
optionsPreviewPersonaResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("previewPersonaResponsePersonaId", "personaId")
      , ("previewPersonaResponseTitle", "title")
      , ("previewPersonaResponsePreviewAccounts", "previewAccounts")
      , ("previewPersonaResponseActive", "active")
      , ("previewPersonaResponseDate", "date")
      , ("previewPersonaResponseAge", "age")
      , ("previewPersonaResponseGender", "gender")
      , ("previewPersonaResponseGameExperienceLevel", "gameExperienceLevel")
      , ("previewPersonaResponseLatitude", "latitude")
      , ("previewPersonaResponseLongitude", "longitude")
      ]


-- | 
data Product = Product
  { productBrand :: Maybe Text -- ^ 
  , productProductType :: Maybe Text -- ^ 
  , productCondition :: Maybe Text -- ^ 
  , productIsbn :: Maybe Text -- ^ 
  , productAsin :: Maybe Text -- ^ 
  , productCatalogNumbers :: Maybe [Text] -- ^ 
  , productDepartment :: Maybe Text -- ^ 
  , productFeatures :: Maybe [Text] -- ^ 
  , productMinimumPrice :: Maybe Double -- ^ 
  , productWidth :: Maybe Double -- ^ 
  , productHeight :: Maybe Double -- ^ 
  , productDepth :: Maybe Double -- ^ 
  , productWeight :: Maybe Double -- ^ 
  , productUnit :: Maybe Text -- ^ 
  , productStudio :: Maybe Text -- ^ 
  , productParentalRating :: Maybe Text -- ^ 
  , productPublishDate :: Maybe Integer -- ^ 
  , productAvailabilityDate :: Maybe Integer -- ^ 
  , productSize :: Maybe SizeGroup -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Product where
  parseJSON = genericParseJSON optionsProduct
instance ToJSON Product where
  toJSON = genericToJSON optionsProduct

optionsProduct :: Options
optionsProduct =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("productBrand", "brand")
      , ("productProductType", "productType")
      , ("productCondition", "condition")
      , ("productIsbn", "isbn")
      , ("productAsin", "asin")
      , ("productCatalogNumbers", "catalogNumbers")
      , ("productDepartment", "department")
      , ("productFeatures", "features")
      , ("productMinimumPrice", "minimumPrice")
      , ("productWidth", "width")
      , ("productHeight", "height")
      , ("productDepth", "depth")
      , ("productWeight", "weight")
      , ("productUnit", "unit")
      , ("productStudio", "studio")
      , ("productParentalRating", "parentalRating")
      , ("productPublishDate", "publishDate")
      , ("productAvailabilityDate", "availabilityDate")
      , ("productSize", "size")
      ]


-- | 
data ProductResponse = ProductResponse
  { productResponseBrand :: Maybe Text -- ^ 
  , productResponseProductType :: Maybe Text -- ^ 
  , productResponseCondition :: Maybe Text -- ^ 
  , productResponseIsbn :: Maybe Text -- ^ 
  , productResponseAsin :: Maybe Text -- ^ 
  , productResponseCatalogNumbers :: Maybe [Text] -- ^ 
  , productResponseDepartment :: Maybe Text -- ^ 
  , productResponseFeatures :: Maybe [Text] -- ^ 
  , productResponseMinimumPrice :: Maybe Double -- ^ 
  , productResponseWidth :: Maybe Double -- ^ 
  , productResponseHeight :: Maybe Double -- ^ 
  , productResponseDepth :: Maybe Double -- ^ 
  , productResponseWeight :: Maybe Double -- ^ 
  , productResponseUnit :: Maybe Text -- ^ 
  , productResponseStudio :: Maybe Text -- ^ 
  , productResponseParentalRating :: Maybe Text -- ^ 
  , productResponsePublishDate :: Maybe Integer -- ^ 
  , productResponseAvailabilityDate :: Maybe Integer -- ^ 
  , productResponseSize :: Maybe SizeGroupResponse -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ProductResponse where
  parseJSON = genericParseJSON optionsProductResponse
instance ToJSON ProductResponse where
  toJSON = genericToJSON optionsProductResponse

optionsProductResponse :: Options
optionsProductResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("productResponseBrand", "brand")
      , ("productResponseProductType", "productType")
      , ("productResponseCondition", "condition")
      , ("productResponseIsbn", "isbn")
      , ("productResponseAsin", "asin")
      , ("productResponseCatalogNumbers", "catalogNumbers")
      , ("productResponseDepartment", "department")
      , ("productResponseFeatures", "features")
      , ("productResponseMinimumPrice", "minimumPrice")
      , ("productResponseWidth", "width")
      , ("productResponseHeight", "height")
      , ("productResponseDepth", "depth")
      , ("productResponseWeight", "weight")
      , ("productResponseUnit", "unit")
      , ("productResponseStudio", "studio")
      , ("productResponseParentalRating", "parentalRating")
      , ("productResponsePublishDate", "publishDate")
      , ("productResponseAvailabilityDate", "availabilityDate")
      , ("productResponseSize", "size")
      ]


-- | 
data ProfileInfoResponse = ProfileInfoResponse
  { profileInfoResponseValid :: Maybe Bool -- ^ 
  , profileInfoResponseMessage :: Maybe Text -- ^ 
  , profileInfoResponseVersion :: Maybe Double -- ^ 
  , profileInfoResponseSerializeNulls :: Maybe Bool -- ^ 
  , profileInfoResponseStartTimeLog :: Maybe Integer -- ^ 
  , profileInfoResponseErrorCode :: Maybe Text -- ^ 
  , profileInfoResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , profileInfoResponseAccountId :: Maybe Integer -- ^ 
  , profileInfoResponseLocationDisplay :: Maybe Text -- ^ 
  , profileInfoResponseDisplay :: Maybe Text -- ^ 
  , profileInfoResponseUsername :: Maybe Text -- ^ 
  , profileInfoResponseProfileImage :: Maybe Text -- ^ 
  , profileInfoResponseProfileAvatar :: Maybe AssetShortResponse -- ^ 
  , profileInfoResponseAboutUs :: Maybe Text -- ^ 
  , profileInfoResponseLocale :: Maybe Text -- ^ 
  , profileInfoResponseSummaryTitle :: Maybe Text -- ^ 
  , profileInfoResponseGender :: Maybe Text -- ^ 
  , profileInfoResponseAge :: Maybe Text -- ^ 
  , profileInfoResponseGameExperience :: Maybe Text -- ^ 
  , profileInfoResponseContact :: Maybe ContactResponse -- ^ 
  , profileInfoResponseCategories :: Maybe [CategoryResponse] -- ^ 
  , profileInfoResponsePersonalProfile :: Maybe PersonalProfileResponse -- ^ 
  , profileInfoResponseUserSettings :: Maybe UserSettingsResponse -- ^ 
  , profileInfoResponseLatitude :: Maybe Double -- ^ 
  , profileInfoResponseLongitude :: Maybe Double -- ^ 
  , profileInfoResponseCurrentPostalCode :: Maybe PostalCodeResponse -- ^ 
  , profileInfoResponseAccountType :: Maybe Text -- ^ 
  , profileInfoResponsePremiumExpiration :: Maybe Integer -- ^ 
  , profileInfoResponseMatchIndex :: Maybe Int -- ^ 
  , profileInfoResponseTags :: Maybe Text -- ^ 
  , profileInfoResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ProfileInfoResponse where
  parseJSON = genericParseJSON optionsProfileInfoResponse
instance ToJSON ProfileInfoResponse where
  toJSON = genericToJSON optionsProfileInfoResponse

optionsProfileInfoResponse :: Options
optionsProfileInfoResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("profileInfoResponseValid", "valid")
      , ("profileInfoResponseMessage", "message")
      , ("profileInfoResponseVersion", "version")
      , ("profileInfoResponseSerializeNulls", "serializeNulls")
      , ("profileInfoResponseStartTimeLog", "startTimeLog")
      , ("profileInfoResponseErrorCode", "errorCode")
      , ("profileInfoResponseRequest", "request")
      , ("profileInfoResponseAccountId", "accountId")
      , ("profileInfoResponseLocationDisplay", "locationDisplay")
      , ("profileInfoResponseDisplay", "display")
      , ("profileInfoResponseUsername", "username")
      , ("profileInfoResponseProfileImage", "profileImage")
      , ("profileInfoResponseProfileAvatar", "profileAvatar")
      , ("profileInfoResponseAboutUs", "aboutUs")
      , ("profileInfoResponseLocale", "locale")
      , ("profileInfoResponseSummaryTitle", "summaryTitle")
      , ("profileInfoResponseGender", "gender")
      , ("profileInfoResponseAge", "age")
      , ("profileInfoResponseGameExperience", "gameExperience")
      , ("profileInfoResponseContact", "contact")
      , ("profileInfoResponseCategories", "categories")
      , ("profileInfoResponsePersonalProfile", "personalProfile")
      , ("profileInfoResponseUserSettings", "userSettings")
      , ("profileInfoResponseLatitude", "latitude")
      , ("profileInfoResponseLongitude", "longitude")
      , ("profileInfoResponseCurrentPostalCode", "currentPostalCode")
      , ("profileInfoResponseAccountType", "accountType")
      , ("profileInfoResponsePremiumExpiration", "premiumExpiration")
      , ("profileInfoResponseMatchIndex", "matchIndex")
      , ("profileInfoResponseTags", "tags")
      , ("profileInfoResponseReturning", "returning")
      ]


-- | 
data ProfileResponse = ProfileResponse
  { profileResponseValid :: Maybe Bool -- ^ 
  , profileResponseMessage :: Maybe Text -- ^ 
  , profileResponseVersion :: Maybe Double -- ^ 
  , profileResponseSerializeNulls :: Maybe Bool -- ^ 
  , profileResponseStartTimeLog :: Maybe Integer -- ^ 
  , profileResponseErrorCode :: Maybe Text -- ^ 
  , profileResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , profileResponseLoginAccountId :: Maybe Integer -- ^ 
  , profileResponseValidated :: Maybe Bool -- ^ 
  , profileResponseAppInfo :: Maybe AppInfoResponse -- ^ 
  , profileResponseCanViewAppInfo :: Maybe Bool -- ^ 
  , profileResponseCanViewFriendInfo :: Maybe Bool -- ^ 
  , profileResponseCanViewProfileInfo :: Maybe Bool -- ^ 
  , profileResponseFlagCount :: Maybe Integer -- ^ 
  , profileResponseFriendInfo :: Maybe ConnectionInfoResponse -- ^ 
  , profileResponseIsBlocked :: Maybe Bool -- ^ 
  , profileResponseIsProfileOwner :: Maybe Bool -- ^ 
  , profileResponseMetFlagThreshold :: Maybe Bool -- ^ 
  , profileResponseProfileInfo :: Maybe ProfileInfoResponse -- ^ 
  , profileResponseTrusted :: Maybe Bool -- ^ 
  , profileResponseFollowing :: Maybe Bool -- ^ 
  , profileResponseFriendRequested :: Maybe Bool -- ^ 
  , profileResponseFriendRequestPending :: Maybe Bool -- ^ 
  , profileResponseBlocked :: Maybe Bool -- ^ 
  , profileResponseFlagged :: Maybe Bool -- ^ 
  , profileResponseProfileOwner :: Maybe Bool -- ^ 
  , profileResponseFriend :: Maybe Bool -- ^ 
  , profileResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ProfileResponse where
  parseJSON = genericParseJSON optionsProfileResponse
instance ToJSON ProfileResponse where
  toJSON = genericToJSON optionsProfileResponse

optionsProfileResponse :: Options
optionsProfileResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("profileResponseValid", "valid")
      , ("profileResponseMessage", "message")
      , ("profileResponseVersion", "version")
      , ("profileResponseSerializeNulls", "serializeNulls")
      , ("profileResponseStartTimeLog", "startTimeLog")
      , ("profileResponseErrorCode", "errorCode")
      , ("profileResponseRequest", "request")
      , ("profileResponseLoginAccountId", "loginAccountId")
      , ("profileResponseValidated", "validated")
      , ("profileResponseAppInfo", "appInfo")
      , ("profileResponseCanViewAppInfo", "canViewAppInfo")
      , ("profileResponseCanViewFriendInfo", "canViewFriendInfo")
      , ("profileResponseCanViewProfileInfo", "canViewProfileInfo")
      , ("profileResponseFlagCount", "flagCount")
      , ("profileResponseFriendInfo", "friendInfo")
      , ("profileResponseIsBlocked", "isBlocked")
      , ("profileResponseIsProfileOwner", "isProfileOwner")
      , ("profileResponseMetFlagThreshold", "metFlagThreshold")
      , ("profileResponseProfileInfo", "profileInfo")
      , ("profileResponseTrusted", "trusted")
      , ("profileResponseFollowing", "following")
      , ("profileResponseFriendRequested", "friendRequested")
      , ("profileResponseFriendRequestPending", "friendRequestPending")
      , ("profileResponseBlocked", "blocked")
      , ("profileResponseFlagged", "flagged")
      , ("profileResponseProfileOwner", "profileOwner")
      , ("profileResponseFriend", "friend")
      , ("profileResponseReturning", "returning")
      ]


-- | 
data ProfileShortResponse = ProfileShortResponse
  { profileShortResponseValid :: Maybe Bool -- ^ 
  , profileShortResponseMessage :: Maybe Text -- ^ 
  , profileShortResponseVersion :: Maybe Double -- ^ 
  , profileShortResponseSerializeNulls :: Maybe Bool -- ^ 
  , profileShortResponseStartTimeLog :: Maybe Integer -- ^ 
  , profileShortResponseErrorCode :: Maybe Text -- ^ 
  , profileShortResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , profileShortResponseAccountId :: Maybe Integer -- ^ 
  , profileShortResponseLocationDisplay :: Maybe Text -- ^ 
  , profileShortResponseDisplay :: Maybe Text -- ^ 
  , profileShortResponseUsername :: Maybe Text -- ^ 
  , profileShortResponseProfileImage :: Maybe Text -- ^ 
  , profileShortResponseProfileAvatar :: Maybe AssetShortResponse -- ^ 
  , profileShortResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ProfileShortResponse where
  parseJSON = genericParseJSON optionsProfileShortResponse
instance ToJSON ProfileShortResponse where
  toJSON = genericToJSON optionsProfileShortResponse

optionsProfileShortResponse :: Options
optionsProfileShortResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("profileShortResponseValid", "valid")
      , ("profileShortResponseMessage", "message")
      , ("profileShortResponseVersion", "version")
      , ("profileShortResponseSerializeNulls", "serializeNulls")
      , ("profileShortResponseStartTimeLog", "startTimeLog")
      , ("profileShortResponseErrorCode", "errorCode")
      , ("profileShortResponseRequest", "request")
      , ("profileShortResponseAccountId", "accountId")
      , ("profileShortResponseLocationDisplay", "locationDisplay")
      , ("profileShortResponseDisplay", "display")
      , ("profileShortResponseUsername", "username")
      , ("profileShortResponseProfileImage", "profileImage")
      , ("profileShortResponseProfileAvatar", "profileAvatar")
      , ("profileShortResponseReturning", "returning")
      ]


-- | 
data Program = Program
  { programId :: Maybe Integer -- ^ 
  , programActive :: Maybe Bool -- ^ 
  , programValid :: Maybe Bool -- ^ 
  , programName :: Maybe Text -- ^ 
  , programDescription :: Maybe Text -- ^ 
  , programCostPerRide :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Program where
  parseJSON = genericParseJSON optionsProgram
instance ToJSON Program where
  toJSON = genericToJSON optionsProgram

optionsProgram :: Options
optionsProgram =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("programId", "id")
      , ("programActive", "active")
      , ("programValid", "valid")
      , ("programName", "name")
      , ("programDescription", "description")
      , ("programCostPerRide", "costPerRide")
      ]


-- | 
data PromoCode = PromoCode
  { promoCodeId :: Maybe Integer -- ^ 
  , promoCodeActive :: Maybe Bool -- ^ 
  , promoCodeValid :: Maybe Bool -- ^ 
  , promoCodeCode :: Maybe Text -- ^ 
  , promoCodeName :: Maybe Text -- ^ 
  , promoCodeDays :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PromoCode where
  parseJSON = genericParseJSON optionsPromoCode
instance ToJSON PromoCode where
  toJSON = genericToJSON optionsPromoCode

optionsPromoCode :: Options
optionsPromoCode =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("promoCodeId", "id")
      , ("promoCodeActive", "active")
      , ("promoCodeValid", "valid")
      , ("promoCodeCode", "code")
      , ("promoCodeName", "name")
      , ("promoCodeDays", "days")
      ]


-- | 
data PurchaseItemFullResponse = PurchaseItemFullResponse
  { purchaseItemFullResponseId :: Maybe Integer -- ^ 
  , purchaseItemFullResponseName :: Maybe Text -- ^ 
  , purchaseItemFullResponseDescription :: Maybe Text -- ^ 
  , purchaseItemFullResponseTickets :: Maybe Int -- ^ 
  , purchaseItemFullResponseCoverAsset :: Maybe AssetShortResponse -- ^ 
  , purchaseItemFullResponsePromoAsset :: Maybe AssetShortResponse -- ^ 
  , purchaseItemFullResponseGiftable :: Maybe Bool -- ^ 
  , purchaseItemFullResponseAssetable :: Maybe Bool -- ^ 
  , purchaseItemFullResponseGameType :: Maybe Text -- ^ 
  , purchaseItemFullResponsePrice :: Maybe Float -- ^ 
  , purchaseItemFullResponsePurchaseType :: Maybe Text -- ^ 
  , purchaseItemFullResponsePurchaseCode :: Maybe Text -- ^ 
  , purchaseItemFullResponsePurchaseLimit :: Maybe Int -- ^ 
  , purchaseItemFullResponseQuantity :: Maybe Int -- ^ 
  , purchaseItemFullResponseServiceAction :: Maybe Text -- ^ 
  , purchaseItemFullResponseAppName :: Maybe Text -- ^ 
  , purchaseItemFullResponseSecretKey :: Maybe Text -- ^ 
  , purchaseItemFullResponseAppKey :: Maybe Text -- ^ 
  , purchaseItemFullResponseAllocateTickets :: Maybe Bool -- ^ 
  , purchaseItemFullResponseTicketType :: Maybe Text -- ^ 
  , purchaseItemFullResponseTicketCount :: Maybe Integer -- ^ 
  , purchaseItemFullResponsePoints :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PurchaseItemFullResponse where
  parseJSON = genericParseJSON optionsPurchaseItemFullResponse
instance ToJSON PurchaseItemFullResponse where
  toJSON = genericToJSON optionsPurchaseItemFullResponse

optionsPurchaseItemFullResponse :: Options
optionsPurchaseItemFullResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("purchaseItemFullResponseId", "id")
      , ("purchaseItemFullResponseName", "name")
      , ("purchaseItemFullResponseDescription", "description")
      , ("purchaseItemFullResponseTickets", "tickets")
      , ("purchaseItemFullResponseCoverAsset", "coverAsset")
      , ("purchaseItemFullResponsePromoAsset", "promoAsset")
      , ("purchaseItemFullResponseGiftable", "giftable")
      , ("purchaseItemFullResponseAssetable", "assetable")
      , ("purchaseItemFullResponseGameType", "gameType")
      , ("purchaseItemFullResponsePrice", "price")
      , ("purchaseItemFullResponsePurchaseType", "purchaseType")
      , ("purchaseItemFullResponsePurchaseCode", "purchaseCode")
      , ("purchaseItemFullResponsePurchaseLimit", "purchaseLimit")
      , ("purchaseItemFullResponseQuantity", "quantity")
      , ("purchaseItemFullResponseServiceAction", "serviceAction")
      , ("purchaseItemFullResponseAppName", "appName")
      , ("purchaseItemFullResponseSecretKey", "secretKey")
      , ("purchaseItemFullResponseAppKey", "appKey")
      , ("purchaseItemFullResponseAllocateTickets", "allocateTickets")
      , ("purchaseItemFullResponseTicketType", "ticketType")
      , ("purchaseItemFullResponseTicketCount", "ticketCount")
      , ("purchaseItemFullResponsePoints", "points")
      ]


-- | 
data PurchaseItemListResponse = PurchaseItemListResponse
  { purchaseItemListResponseValid :: Maybe Bool -- ^ 
  , purchaseItemListResponseMessage :: Maybe Text -- ^ 
  , purchaseItemListResponseVersion :: Maybe Double -- ^ 
  , purchaseItemListResponseSerializeNulls :: Maybe Bool -- ^ 
  , purchaseItemListResponseStartTimeLog :: Maybe Integer -- ^ 
  , purchaseItemListResponseErrorCode :: Maybe Text -- ^ 
  , purchaseItemListResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , purchaseItemListResponseItems :: Maybe [PurchaseItemResponse] -- ^ 
  , purchaseItemListResponseCount :: Maybe Int -- ^ 
  , purchaseItemListResponseHasMoreResults :: Maybe Bool -- ^ 
  , purchaseItemListResponseStart :: Maybe Int -- ^ 
  , purchaseItemListResponseLimit :: Maybe Int -- ^ 
  , purchaseItemListResponseCountTotal :: Maybe Integer -- ^ 
  , purchaseItemListResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PurchaseItemListResponse where
  parseJSON = genericParseJSON optionsPurchaseItemListResponse
instance ToJSON PurchaseItemListResponse where
  toJSON = genericToJSON optionsPurchaseItemListResponse

optionsPurchaseItemListResponse :: Options
optionsPurchaseItemListResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("purchaseItemListResponseValid", "valid")
      , ("purchaseItemListResponseMessage", "message")
      , ("purchaseItemListResponseVersion", "version")
      , ("purchaseItemListResponseSerializeNulls", "serializeNulls")
      , ("purchaseItemListResponseStartTimeLog", "startTimeLog")
      , ("purchaseItemListResponseErrorCode", "errorCode")
      , ("purchaseItemListResponseRequest", "request")
      , ("purchaseItemListResponseItems", "items")
      , ("purchaseItemListResponseCount", "count")
      , ("purchaseItemListResponseHasMoreResults", "hasMoreResults")
      , ("purchaseItemListResponseStart", "start")
      , ("purchaseItemListResponseLimit", "limit")
      , ("purchaseItemListResponseCountTotal", "countTotal")
      , ("purchaseItemListResponseReturning", "returning")
      ]


-- | 
data PurchaseItemResponse = PurchaseItemResponse
  { purchaseItemResponseId :: Maybe Integer -- ^ 
  , purchaseItemResponseName :: Maybe Text -- ^ 
  , purchaseItemResponseDescription :: Maybe Text -- ^ 
  , purchaseItemResponseTickets :: Maybe Int -- ^ 
  , purchaseItemResponseCoverAsset :: Maybe AssetShortResponse -- ^ 
  , purchaseItemResponsePromoAsset :: Maybe AssetShortResponse -- ^ 
  , purchaseItemResponseGiftable :: Maybe Bool -- ^ 
  , purchaseItemResponseAssetable :: Maybe Bool -- ^ 
  , purchaseItemResponseGameType :: Maybe Text -- ^ 
  , purchaseItemResponsePrice :: Maybe Float -- ^ 
  , purchaseItemResponsePurchaseType :: Maybe Text -- ^ 
  , purchaseItemResponsePurchaseCode :: Maybe Text -- ^ 
  , purchaseItemResponsePurchaseLimit :: Maybe Int -- ^ 
  , purchaseItemResponseQuantity :: Maybe Int -- ^ 
  , purchaseItemResponseServiceAction :: Maybe Text -- ^ 
  , purchaseItemResponseAppName :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PurchaseItemResponse where
  parseJSON = genericParseJSON optionsPurchaseItemResponse
instance ToJSON PurchaseItemResponse where
  toJSON = genericToJSON optionsPurchaseItemResponse

optionsPurchaseItemResponse :: Options
optionsPurchaseItemResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("purchaseItemResponseId", "id")
      , ("purchaseItemResponseName", "name")
      , ("purchaseItemResponseDescription", "description")
      , ("purchaseItemResponseTickets", "tickets")
      , ("purchaseItemResponseCoverAsset", "coverAsset")
      , ("purchaseItemResponsePromoAsset", "promoAsset")
      , ("purchaseItemResponseGiftable", "giftable")
      , ("purchaseItemResponseAssetable", "assetable")
      , ("purchaseItemResponseGameType", "gameType")
      , ("purchaseItemResponsePrice", "price")
      , ("purchaseItemResponsePurchaseType", "purchaseType")
      , ("purchaseItemResponsePurchaseCode", "purchaseCode")
      , ("purchaseItemResponsePurchaseLimit", "purchaseLimit")
      , ("purchaseItemResponseQuantity", "quantity")
      , ("purchaseItemResponseServiceAction", "serviceAction")
      , ("purchaseItemResponseAppName", "appName")
      ]


-- | 
data PurchaseItemShortResponse = PurchaseItemShortResponse
  { purchaseItemShortResponseId :: Maybe Integer -- ^ 
  , purchaseItemShortResponseName :: Maybe Text -- ^ 
  , purchaseItemShortResponseDescription :: Maybe Text -- ^ 
  , purchaseItemShortResponseTickets :: Maybe Int -- ^ 
  , purchaseItemShortResponseCoverAsset :: Maybe AssetShortResponse -- ^ 
  , purchaseItemShortResponsePromoAsset :: Maybe AssetShortResponse -- ^ 
  , purchaseItemShortResponseGiftable :: Maybe Bool -- ^ 
  , purchaseItemShortResponseAssetable :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PurchaseItemShortResponse where
  parseJSON = genericParseJSON optionsPurchaseItemShortResponse
instance ToJSON PurchaseItemShortResponse where
  toJSON = genericToJSON optionsPurchaseItemShortResponse

optionsPurchaseItemShortResponse :: Options
optionsPurchaseItemShortResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("purchaseItemShortResponseId", "id")
      , ("purchaseItemShortResponseName", "name")
      , ("purchaseItemShortResponseDescription", "description")
      , ("purchaseItemShortResponseTickets", "tickets")
      , ("purchaseItemShortResponseCoverAsset", "coverAsset")
      , ("purchaseItemShortResponsePromoAsset", "promoAsset")
      , ("purchaseItemShortResponseGiftable", "giftable")
      , ("purchaseItemShortResponseAssetable", "assetable")
      ]


-- | 
data PurchaseOrderItemResponse = PurchaseOrderItemResponse
  { purchaseOrderItemResponseValid :: Maybe Bool -- ^ 
  , purchaseOrderItemResponseMessage :: Maybe Text -- ^ 
  , purchaseOrderItemResponseVersion :: Maybe Double -- ^ 
  , purchaseOrderItemResponseSerializeNulls :: Maybe Bool -- ^ 
  , purchaseOrderItemResponseStartTimeLog :: Maybe Integer -- ^ 
  , purchaseOrderItemResponseErrorCode :: Maybe Text -- ^ 
  , purchaseOrderItemResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , purchaseOrderItemResponsePurchaseOrderItemId :: Maybe Integer -- ^ 
  , purchaseOrderItemResponseCreated :: Maybe Integer -- ^ 
  , purchaseOrderItemResponseUpdated :: Maybe Integer -- ^ 
  , purchaseOrderItemResponseCustomer :: Maybe AccountShortResponse -- ^ 
  , purchaseOrderItemResponseOrderItemType :: Maybe Text -- ^ 
  , purchaseOrderItemResponseOrderItemId :: Maybe Integer -- ^ 
  , purchaseOrderItemResponseOrderCustomType :: Maybe Text -- ^ 
  , purchaseOrderItemResponseOrderCustomId :: Maybe Text -- ^ 
  , purchaseOrderItemResponseRetailerLocationId :: Maybe Integer -- ^ 
  , purchaseOrderItemResponseAmount :: Maybe Double -- ^ 
  , purchaseOrderItemResponseTax :: Maybe Double -- ^ 
  , purchaseOrderItemResponseComment :: Maybe Text -- ^ 
  , purchaseOrderItemResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON PurchaseOrderItemResponse where
  parseJSON = genericParseJSON optionsPurchaseOrderItemResponse
instance ToJSON PurchaseOrderItemResponse where
  toJSON = genericToJSON optionsPurchaseOrderItemResponse

optionsPurchaseOrderItemResponse :: Options
optionsPurchaseOrderItemResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("purchaseOrderItemResponseValid", "valid")
      , ("purchaseOrderItemResponseMessage", "message")
      , ("purchaseOrderItemResponseVersion", "version")
      , ("purchaseOrderItemResponseSerializeNulls", "serializeNulls")
      , ("purchaseOrderItemResponseStartTimeLog", "startTimeLog")
      , ("purchaseOrderItemResponseErrorCode", "errorCode")
      , ("purchaseOrderItemResponseRequest", "request")
      , ("purchaseOrderItemResponsePurchaseOrderItemId", "purchaseOrderItemId")
      , ("purchaseOrderItemResponseCreated", "created")
      , ("purchaseOrderItemResponseUpdated", "updated")
      , ("purchaseOrderItemResponseCustomer", "customer")
      , ("purchaseOrderItemResponseOrderItemType", "orderItemType")
      , ("purchaseOrderItemResponseOrderItemId", "orderItemId")
      , ("purchaseOrderItemResponseOrderCustomType", "orderCustomType")
      , ("purchaseOrderItemResponseOrderCustomId", "orderCustomId")
      , ("purchaseOrderItemResponseRetailerLocationId", "retailerLocationId")
      , ("purchaseOrderItemResponseAmount", "amount")
      , ("purchaseOrderItemResponseTax", "tax")
      , ("purchaseOrderItemResponseComment", "comment")
      , ("purchaseOrderItemResponseReturning", "returning")
      ]


-- | 
data QuestionResponse = QuestionResponse
  { questionResponseId :: Maybe Integer -- ^ 
  , questionResponseQuestion :: Maybe Text -- ^ 
  , questionResponseImage :: Maybe AssetShortResponse -- ^ 
  , questionResponseVideoURL :: Maybe Text -- ^ 
  , questionResponseActive :: Maybe Bool -- ^ 
  , questionResponseAnswers :: Maybe [AnswerResponse] -- ^ 
  , questionResponseScores :: Maybe ScoreListResponse -- ^ 
  , questionResponseTickets :: Maybe TicketListResponse -- ^ 
  , questionResponseOwner :: Maybe AccountShortResponse -- ^ 
  , questionResponseIcon :: Maybe AssetShortResponse -- ^ 
  , questionResponseAuthorOverride :: Maybe Text -- ^ 
  , questionResponseUpdatedDate :: Maybe Integer -- ^ 
  , questionResponseStartDate :: Maybe Integer -- ^ 
  , questionResponseEndDate :: Maybe Integer -- ^ 
  , questionResponseCreatedDate :: Maybe Integer -- ^ 
  , questionResponseTags :: Maybe Text -- ^ 
  , questionResponseAllocateTickets :: Maybe Bool -- ^ 
  , questionResponseTicketType :: Maybe Text -- ^ 
  , questionResponseTicketCount :: Maybe Integer -- ^ 
  , questionResponsePoints :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON QuestionResponse where
  parseJSON = genericParseJSON optionsQuestionResponse
instance ToJSON QuestionResponse where
  toJSON = genericToJSON optionsQuestionResponse

optionsQuestionResponse :: Options
optionsQuestionResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("questionResponseId", "id")
      , ("questionResponseQuestion", "question")
      , ("questionResponseImage", "image")
      , ("questionResponseVideoURL", "videoURL")
      , ("questionResponseActive", "active")
      , ("questionResponseAnswers", "answers")
      , ("questionResponseScores", "scores")
      , ("questionResponseTickets", "tickets")
      , ("questionResponseOwner", "owner")
      , ("questionResponseIcon", "icon")
      , ("questionResponseAuthorOverride", "authorOverride")
      , ("questionResponseUpdatedDate", "updatedDate")
      , ("questionResponseStartDate", "startDate")
      , ("questionResponseEndDate", "endDate")
      , ("questionResponseCreatedDate", "createdDate")
      , ("questionResponseTags", "tags")
      , ("questionResponseAllocateTickets", "allocateTickets")
      , ("questionResponseTicketType", "ticketType")
      , ("questionResponseTicketCount", "ticketCount")
      , ("questionResponsePoints", "points")
      ]


-- | 
data QueueResponse = QueueResponse
  { queueResponseQueueId :: Maybe Integer -- ^ 
  , queueResponseName :: Maybe Text -- ^ 
  , queueResponseHost :: Maybe Text -- ^ 
  , queueResponsePort :: Maybe Int -- ^ 
  , queueResponseUsername :: Maybe Text -- ^ 
  , queueResponsePassword :: Maybe Text -- ^ 
  , queueResponseVirtualHost :: Maybe Text -- ^ 
  , queueResponseWorkers :: Maybe Int -- ^ 
  , queueResponseExchanger :: Maybe Text -- ^ 
  , queueResponseExchangerType :: Maybe Text -- ^ 
  , queueResponseHandleDelivery :: Maybe Bool -- ^ 
  , queueResponseDataMapping :: Maybe Text -- ^ 
  , queueResponseAnalyticTags :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON QueueResponse where
  parseJSON = genericParseJSON optionsQueueResponse
instance ToJSON QueueResponse where
  toJSON = genericToJSON optionsQueueResponse

optionsQueueResponse :: Options
optionsQueueResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("queueResponseQueueId", "queueId")
      , ("queueResponseName", "name")
      , ("queueResponseHost", "host")
      , ("queueResponsePort", "port")
      , ("queueResponseUsername", "username")
      , ("queueResponsePassword", "password")
      , ("queueResponseVirtualHost", "virtualHost")
      , ("queueResponseWorkers", "workers")
      , ("queueResponseExchanger", "exchanger")
      , ("queueResponseExchangerType", "exchangerType")
      , ("queueResponseHandleDelivery", "handleDelivery")
      , ("queueResponseDataMapping", "dataMapping")
      , ("queueResponseAnalyticTags", "analyticTags")
      ]


-- | 
data RankFullResponse = RankFullResponse
  { rankFullResponseValid :: Maybe Bool -- ^ 
  , rankFullResponseMessage :: Maybe Text -- ^ 
  , rankFullResponseVersion :: Maybe Double -- ^ 
  , rankFullResponseSerializeNulls :: Maybe Bool -- ^ 
  , rankFullResponseStartTimeLog :: Maybe Integer -- ^ 
  , rankFullResponseErrorCode :: Maybe Text -- ^ 
  , rankFullResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , rankFullResponseRankings :: Maybe [RankListResponse] -- ^ 
  , rankFullResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RankFullResponse where
  parseJSON = genericParseJSON optionsRankFullResponse
instance ToJSON RankFullResponse where
  toJSON = genericToJSON optionsRankFullResponse

optionsRankFullResponse :: Options
optionsRankFullResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("rankFullResponseValid", "valid")
      , ("rankFullResponseMessage", "message")
      , ("rankFullResponseVersion", "version")
      , ("rankFullResponseSerializeNulls", "serializeNulls")
      , ("rankFullResponseStartTimeLog", "startTimeLog")
      , ("rankFullResponseErrorCode", "errorCode")
      , ("rankFullResponseRequest", "request")
      , ("rankFullResponseRankings", "rankings")
      , ("rankFullResponseReturning", "returning")
      ]


-- | 
data RankListResponse = RankListResponse
  { rankListResponseItems :: Maybe [RankResponse] -- ^ 
  , rankListResponseUserRank :: Maybe RankResponse -- ^ 
  , rankListResponseHasMoreResults :: Maybe Bool -- ^ 
  , rankListResponseCount :: Maybe Int -- ^ 
  , rankListResponseRankType :: Maybe Text -- ^ 
  , rankListResponseApp :: Maybe Text -- ^ 
  , rankListResponseSortField :: Maybe Text -- ^ 
  , rankListResponseLeaderboardMode :: Maybe Text -- ^ 
  , rankListResponseStart :: Maybe Integer -- ^ 
  , rankListResponseLimit :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RankListResponse where
  parseJSON = genericParseJSON optionsRankListResponse
instance ToJSON RankListResponse where
  toJSON = genericToJSON optionsRankListResponse

optionsRankListResponse :: Options
optionsRankListResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("rankListResponseItems", "items")
      , ("rankListResponseUserRank", "userRank")
      , ("rankListResponseHasMoreResults", "hasMoreResults")
      , ("rankListResponseCount", "count")
      , ("rankListResponseRankType", "rankType")
      , ("rankListResponseApp", "app")
      , ("rankListResponseSortField", "sortField")
      , ("rankListResponseLeaderboardMode", "leaderboardMode")
      , ("rankListResponseStart", "start")
      , ("rankListResponseLimit", "limit")
      ]


-- | 
data RankResponse = RankResponse
  { rankResponseOwner :: Maybe AccountShortResponse -- ^ 
  , rankResponseRank :: Maybe Text -- ^ 
  , rankResponseScoreValue :: Maybe Integer -- ^ 
  , rankResponseTimeValue :: Maybe Integer -- ^ 
  , rankResponseCountValue :: Maybe Integer -- ^ 
  , rankResponseUpdated :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RankResponse where
  parseJSON = genericParseJSON optionsRankResponse
instance ToJSON RankResponse where
  toJSON = genericToJSON optionsRankResponse

optionsRankResponse :: Options
optionsRankResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("rankResponseOwner", "owner")
      , ("rankResponseRank", "rank")
      , ("rankResponseScoreValue", "scoreValue")
      , ("rankResponseTimeValue", "timeValue")
      , ("rankResponseCountValue", "countValue")
      , ("rankResponseUpdated", "updated")
      ]


-- | 
data RatingIndexResponse = RatingIndexResponse
  { ratingIndexResponseRatingIndexId :: Maybe Integer -- ^ 
  , ratingIndexResponseRatingCount :: Maybe Integer -- ^ 
  , ratingIndexResponseRatingAverage :: Maybe Float -- ^ 
  , ratingIndexResponseValue :: Maybe Float -- ^ 
  , ratingIndexResponseDisplay :: Maybe Text -- ^ 
  , ratingIndexResponseRatableType :: Maybe Text -- ^ 
  , ratingIndexResponseRatableId :: Maybe Integer -- ^ 
  , ratingIndexResponseCategory :: Maybe CategoryResponse -- ^ 
  , ratingIndexResponseRatable :: Maybe Value -- ^ 
  , ratingIndexResponseSecondaryType :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RatingIndexResponse where
  parseJSON = genericParseJSON optionsRatingIndexResponse
instance ToJSON RatingIndexResponse where
  toJSON = genericToJSON optionsRatingIndexResponse

optionsRatingIndexResponse :: Options
optionsRatingIndexResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("ratingIndexResponseRatingIndexId", "ratingIndexId")
      , ("ratingIndexResponseRatingCount", "ratingCount")
      , ("ratingIndexResponseRatingAverage", "ratingAverage")
      , ("ratingIndexResponseValue", "value")
      , ("ratingIndexResponseDisplay", "display")
      , ("ratingIndexResponseRatableType", "ratableType")
      , ("ratingIndexResponseRatableId", "ratableId")
      , ("ratingIndexResponseCategory", "category")
      , ("ratingIndexResponseRatable", "ratable")
      , ("ratingIndexResponseSecondaryType", "secondaryType")
      ]


-- | 
data RatingResponse = RatingResponse
  { ratingResponseRatingId :: Maybe Integer -- ^ 
  , ratingResponseRatingValue :: Maybe Int -- ^ 
  , ratingResponseLatitude :: Maybe Double -- ^ 
  , ratingResponseLongitude :: Maybe Double -- ^ 
  , ratingResponseLocationDescription :: Maybe Text -- ^ 
  , ratingResponseCategory :: Maybe CategoryResponse -- ^ 
  , ratingResponseOwner :: Maybe AccountShortResponse -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RatingResponse where
  parseJSON = genericParseJSON optionsRatingResponse
instance ToJSON RatingResponse where
  toJSON = genericToJSON optionsRatingResponse

optionsRatingResponse :: Options
optionsRatingResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("ratingResponseRatingId", "ratingId")
      , ("ratingResponseRatingValue", "ratingValue")
      , ("ratingResponseLatitude", "latitude")
      , ("ratingResponseLongitude", "longitude")
      , ("ratingResponseLocationDescription", "locationDescription")
      , ("ratingResponseCategory", "category")
      , ("ratingResponseOwner", "owner")
      ]


-- | 
data Recurrence = Recurrence
  { recurrenceFrequency :: Maybe Text -- ^ 
  , recurrenceDaysOfWeek :: Maybe [Int] -- ^ 
  , recurrenceStart :: Maybe Day -- ^ 
  , recurrenceCount :: Maybe Int -- ^ 
  , recurrenceUntil :: Maybe Day -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Recurrence where
  parseJSON = genericParseJSON optionsRecurrence
instance ToJSON Recurrence where
  toJSON = genericToJSON optionsRecurrence

optionsRecurrence :: Options
optionsRecurrence =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("recurrenceFrequency", "frequency")
      , ("recurrenceDaysOfWeek", "daysOfWeek")
      , ("recurrenceStart", "start")
      , ("recurrenceCount", "count")
      , ("recurrenceUntil", "until")
      ]


-- | 
data Region = Region
  { regionId :: Maybe Integer -- ^ 
  , regionActive :: Maybe Bool -- ^ 
  , regionValid :: Maybe Bool -- ^ 
  , regionLatitude :: Maybe Double -- ^ 
  , regionLongitude :: Maybe Double -- ^ 
  , regionLocationDescription :: Maybe Text -- ^ 
  , regionOwner :: Maybe Account -- ^ 
  , regionShortName :: Maybe Text -- ^ 
  , regionFullName :: Maybe Text -- ^ 
  , regionBounds :: Maybe GeoBox -- ^ 
  , regionStart :: Maybe UTCTime -- ^ 
  , regionEnd :: Maybe UTCTime -- ^ 
  , regionPolygon :: Maybe Text -- ^ 
  , regionMetaData :: Maybe Text -- ^ 
  , regionChildren :: Maybe [Region] -- ^ 
  , regionParents :: Maybe [Region] -- ^ 
  , regionPostalCodes :: Maybe [PostalCode] -- ^ 
  , regionRegionClass :: Maybe Text -- ^ 
  , regionRoot :: Maybe Bool -- ^ 
  , regionWebActive :: Maybe Bool -- ^ 
  , regionAdminActive :: Maybe Bool -- ^ 
  , regionVisibility :: Maybe Text -- ^ 
  , regionCategories :: Maybe [Category] -- ^ 
  , regionFilters :: Maybe [Filter] -- ^ 
  , regionTruncatedLatitude :: Maybe Double -- ^ 
  , regionTruncatedLongitude :: Maybe Double -- ^ 
  , regionVersionCode :: Maybe Int -- ^ 
  , regionDisplay :: Maybe Text -- ^ 
  , regionContentName :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Region where
  parseJSON = genericParseJSON optionsRegion
instance ToJSON Region where
  toJSON = genericToJSON optionsRegion

optionsRegion :: Options
optionsRegion =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("regionId", "id")
      , ("regionActive", "active")
      , ("regionValid", "valid")
      , ("regionLatitude", "latitude")
      , ("regionLongitude", "longitude")
      , ("regionLocationDescription", "locationDescription")
      , ("regionOwner", "owner")
      , ("regionShortName", "shortName")
      , ("regionFullName", "fullName")
      , ("regionBounds", "bounds")
      , ("regionStart", "start")
      , ("regionEnd", "end")
      , ("regionPolygon", "polygon")
      , ("regionMetaData", "metaData")
      , ("regionChildren", "children")
      , ("regionParents", "parents")
      , ("regionPostalCodes", "postalCodes")
      , ("regionRegionClass", "regionClass")
      , ("regionRoot", "root")
      , ("regionWebActive", "webActive")
      , ("regionAdminActive", "adminActive")
      , ("regionVisibility", "visibility")
      , ("regionCategories", "categories")
      , ("regionFilters", "filters")
      , ("regionTruncatedLatitude", "truncatedLatitude")
      , ("regionTruncatedLongitude", "truncatedLongitude")
      , ("regionVersionCode", "versionCode")
      , ("regionDisplay", "display")
      , ("regionContentName", "contentName")
      ]


-- | 
data RegionLegSummary = RegionLegSummary
  { regionLegSummaryId :: Maybe Integer -- ^ 
  , regionLegSummaryActive :: Maybe Bool -- ^ 
  , regionLegSummaryValid :: Maybe Bool -- ^ 
  , regionLegSummaryRegionId :: Maybe Integer -- ^ 
  , regionLegSummaryFloorId :: Maybe Text -- ^ 
  , regionLegSummaryRetailerLocationId :: Maybe Integer -- ^ 
  , regionLegSummaryLegId :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RegionLegSummary where
  parseJSON = genericParseJSON optionsRegionLegSummary
instance ToJSON RegionLegSummary where
  toJSON = genericToJSON optionsRegionLegSummary

optionsRegionLegSummary :: Options
optionsRegionLegSummary =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("regionLegSummaryId", "id")
      , ("regionLegSummaryActive", "active")
      , ("regionLegSummaryValid", "valid")
      , ("regionLegSummaryRegionId", "regionId")
      , ("regionLegSummaryFloorId", "floorId")
      , ("regionLegSummaryRetailerLocationId", "retailerLocationId")
      , ("regionLegSummaryLegId", "legId")
      ]


-- | 
data RegionResponse = RegionResponse
  { regionResponseId :: Maybe Integer -- ^ 
  , regionResponseShortName :: Maybe Text -- ^ 
  , regionResponseFullName :: Maybe Text -- ^ 
  , regionResponseParent :: Maybe RegionResponse -- ^ 
  , regionResponseChildren :: Maybe [RegionResponse] -- ^ 
  , regionResponsePostalCodes :: Maybe [PostalCodeResponse] -- ^ 
  , regionResponseLatitude :: Maybe Double -- ^ 
  , regionResponseLongitude :: Maybe Double -- ^ 
  , regionResponseActive :: Maybe Bool -- ^ 
  , regionResponseRoot :: Maybe Bool -- ^ 
  , regionResponseRegionClass :: Maybe Text -- ^ 
  , regionResponseStart :: Maybe Integer -- ^ 
  , regionResponseEnd :: Maybe Integer -- ^ 
  , regionResponsePolygon :: Maybe Text -- ^ 
  , regionResponseMetaData :: Maybe Text -- ^ 
  , regionResponseDistance :: Maybe Double -- ^ 
  , regionResponseVersionCode :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RegionResponse where
  parseJSON = genericParseJSON optionsRegionResponse
instance ToJSON RegionResponse where
  toJSON = genericToJSON optionsRegionResponse

optionsRegionResponse :: Options
optionsRegionResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("regionResponseId", "id")
      , ("regionResponseShortName", "shortName")
      , ("regionResponseFullName", "fullName")
      , ("regionResponseParent", "parent")
      , ("regionResponseChildren", "children")
      , ("regionResponsePostalCodes", "postalCodes")
      , ("regionResponseLatitude", "latitude")
      , ("regionResponseLongitude", "longitude")
      , ("regionResponseActive", "active")
      , ("regionResponseRoot", "root")
      , ("regionResponseRegionClass", "regionClass")
      , ("regionResponseStart", "start")
      , ("regionResponseEnd", "end")
      , ("regionResponsePolygon", "polygon")
      , ("regionResponseMetaData", "metaData")
      , ("regionResponseDistance", "distance")
      , ("regionResponseVersionCode", "versionCode")
      ]


-- | 
data ReportBatchResponse = ReportBatchResponse
  { reportBatchResponseValid :: Maybe Bool -- ^ 
  , reportBatchResponseMessage :: Maybe Text -- ^ 
  , reportBatchResponseVersion :: Maybe Double -- ^ 
  , reportBatchResponseSerializeNulls :: Maybe Bool -- ^ 
  , reportBatchResponseStartTimeLog :: Maybe Integer -- ^ 
  , reportBatchResponseErrorCode :: Maybe Text -- ^ 
  , reportBatchResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , reportBatchResponseBatchId :: Maybe Integer -- ^ 
  , reportBatchResponseReportBatchStatus :: Maybe Text -- ^ 
  , reportBatchResponseErrorMessage :: Maybe Text -- ^ 
  , reportBatchResponseEndpoint :: Maybe Text -- ^ 
  , reportBatchResponsePageUrl :: Maybe Text -- ^ 
  , reportBatchResponseName :: Maybe Text -- ^ 
  , reportBatchResponseDescription :: Maybe Text -- ^ 
  , reportBatchResponseCreated :: Maybe Integer -- ^ 
  , reportBatchResponseUpdated :: Maybe Integer -- ^ 
  , reportBatchResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ReportBatchResponse where
  parseJSON = genericParseJSON optionsReportBatchResponse
instance ToJSON ReportBatchResponse where
  toJSON = genericToJSON optionsReportBatchResponse

optionsReportBatchResponse :: Options
optionsReportBatchResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("reportBatchResponseValid", "valid")
      , ("reportBatchResponseMessage", "message")
      , ("reportBatchResponseVersion", "version")
      , ("reportBatchResponseSerializeNulls", "serializeNulls")
      , ("reportBatchResponseStartTimeLog", "startTimeLog")
      , ("reportBatchResponseErrorCode", "errorCode")
      , ("reportBatchResponseRequest", "request")
      , ("reportBatchResponseBatchId", "batchId")
      , ("reportBatchResponseReportBatchStatus", "reportBatchStatus")
      , ("reportBatchResponseErrorMessage", "errorMessage")
      , ("reportBatchResponseEndpoint", "endpoint")
      , ("reportBatchResponsePageUrl", "pageUrl")
      , ("reportBatchResponseName", "name")
      , ("reportBatchResponseDescription", "description")
      , ("reportBatchResponseCreated", "created")
      , ("reportBatchResponseUpdated", "updated")
      , ("reportBatchResponseReturning", "returning")
      ]


-- | 
data ReportDefinition = ReportDefinition
  { reportDefinitionId :: Maybe Integer -- ^ 
  , reportDefinitionActive :: Maybe Bool -- ^ 
  , reportDefinitionValid :: Maybe Bool -- ^ 
  , reportDefinitionQuery :: Maybe Text -- ^ 
  , reportDefinitionQueryName :: Maybe Text -- ^ 
  , reportDefinitionDisplayName :: Maybe Text -- ^ 
  , reportDefinitionColumnNames :: Maybe [Text] -- ^ 
  , reportDefinitionNativeSql :: Maybe Bool -- ^ 
  , reportDefinitionDisplay :: Maybe Bool -- ^ 
  , reportDefinitionDataSource :: Maybe Text -- ^ 
  , reportDefinitionMaxLimit :: Maybe Integer -- ^ 
  , reportDefinitionMaxDateRange :: Maybe Int -- ^ 
  , reportDefinitionDisplayParams :: Maybe Text -- ^ 
  , reportDefinitionMetaData :: Maybe Text -- ^ 
  , reportDefinitionColumnNamesRaw :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ReportDefinition where
  parseJSON = genericParseJSON optionsReportDefinition
instance ToJSON ReportDefinition where
  toJSON = genericToJSON optionsReportDefinition

optionsReportDefinition :: Options
optionsReportDefinition =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("reportDefinitionId", "id")
      , ("reportDefinitionActive", "active")
      , ("reportDefinitionValid", "valid")
      , ("reportDefinitionQuery", "query")
      , ("reportDefinitionQueryName", "queryName")
      , ("reportDefinitionDisplayName", "displayName")
      , ("reportDefinitionColumnNames", "columnNames")
      , ("reportDefinitionNativeSql", "nativeSql")
      , ("reportDefinitionDisplay", "display")
      , ("reportDefinitionDataSource", "dataSource")
      , ("reportDefinitionMaxLimit", "maxLimit")
      , ("reportDefinitionMaxDateRange", "maxDateRange")
      , ("reportDefinitionDisplayParams", "displayParams")
      , ("reportDefinitionMetaData", "metaData")
      , ("reportDefinitionColumnNamesRaw", "columnNamesRaw")
      ]


-- | 
data ReportRegionLegSummaryBatchResponse = ReportRegionLegSummaryBatchResponse
  { reportRegionLegSummaryBatchResponseValid :: Maybe Bool -- ^ 
  , reportRegionLegSummaryBatchResponseMessage :: Maybe Text -- ^ 
  , reportRegionLegSummaryBatchResponseVersion :: Maybe Double -- ^ 
  , reportRegionLegSummaryBatchResponseSerializeNulls :: Maybe Bool -- ^ 
  , reportRegionLegSummaryBatchResponseStartTimeLog :: Maybe Integer -- ^ 
  , reportRegionLegSummaryBatchResponseErrorCode :: Maybe Text -- ^ 
  , reportRegionLegSummaryBatchResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , reportRegionLegSummaryBatchResponseSuccessCount :: Maybe Integer -- ^ 
  , reportRegionLegSummaryBatchResponseFailureCount :: Maybe Integer -- ^ 
  , reportRegionLegSummaryBatchResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ReportRegionLegSummaryBatchResponse where
  parseJSON = genericParseJSON optionsReportRegionLegSummaryBatchResponse
instance ToJSON ReportRegionLegSummaryBatchResponse where
  toJSON = genericToJSON optionsReportRegionLegSummaryBatchResponse

optionsReportRegionLegSummaryBatchResponse :: Options
optionsReportRegionLegSummaryBatchResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("reportRegionLegSummaryBatchResponseValid", "valid")
      , ("reportRegionLegSummaryBatchResponseMessage", "message")
      , ("reportRegionLegSummaryBatchResponseVersion", "version")
      , ("reportRegionLegSummaryBatchResponseSerializeNulls", "serializeNulls")
      , ("reportRegionLegSummaryBatchResponseStartTimeLog", "startTimeLog")
      , ("reportRegionLegSummaryBatchResponseErrorCode", "errorCode")
      , ("reportRegionLegSummaryBatchResponseRequest", "request")
      , ("reportRegionLegSummaryBatchResponseSuccessCount", "successCount")
      , ("reportRegionLegSummaryBatchResponseFailureCount", "failureCount")
      , ("reportRegionLegSummaryBatchResponseReturning", "returning")
      ]


-- | 
data ReportResponse = ReportResponse
  { reportResponseValid :: Maybe Bool -- ^ 
  , reportResponseMessage :: Maybe Text -- ^ 
  , reportResponseVersion :: Maybe Double -- ^ 
  , reportResponseSerializeNulls :: Maybe Bool -- ^ 
  , reportResponseStartTimeLog :: Maybe Integer -- ^ 
  , reportResponseErrorCode :: Maybe Text -- ^ 
  , reportResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , reportResponseColumns :: Maybe [ReportTypeResponse] -- ^ 
  , reportResponseRows :: Maybe [(Map.Map String Value)] -- ^ 
  , reportResponseSummations :: Maybe (Map.Map String Double) -- ^ 
  , reportResponseCount :: Maybe Integer -- ^ 
  , reportResponseQueryName :: Maybe Text -- ^ 
  , reportResponseHasMore :: Maybe Bool -- ^ 
  , reportResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ReportResponse where
  parseJSON = genericParseJSON optionsReportResponse
instance ToJSON ReportResponse where
  toJSON = genericToJSON optionsReportResponse

optionsReportResponse :: Options
optionsReportResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("reportResponseValid", "valid")
      , ("reportResponseMessage", "message")
      , ("reportResponseVersion", "version")
      , ("reportResponseSerializeNulls", "serializeNulls")
      , ("reportResponseStartTimeLog", "startTimeLog")
      , ("reportResponseErrorCode", "errorCode")
      , ("reportResponseRequest", "request")
      , ("reportResponseColumns", "columns")
      , ("reportResponseRows", "rows")
      , ("reportResponseSummations", "summations")
      , ("reportResponseCount", "count")
      , ("reportResponseQueryName", "queryName")
      , ("reportResponseHasMore", "hasMore")
      , ("reportResponseReturning", "returning")
      ]


-- | 
data ReportTypeResponse = ReportTypeResponse
  { reportTypeResponseType :: Maybe Text -- ^ 
  , reportTypeResponseJavaType :: Maybe Text -- ^ 
  , reportTypeResponseLabel :: Maybe Text -- ^ 
  , reportTypeResponseNumber :: Maybe Bool -- ^ 
  , reportTypeResponseMajorAxis :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ReportTypeResponse where
  parseJSON = genericParseJSON optionsReportTypeResponse
instance ToJSON ReportTypeResponse where
  toJSON = genericToJSON optionsReportTypeResponse

optionsReportTypeResponse :: Options
optionsReportTypeResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("reportTypeResponseType", "type")
      , ("reportTypeResponseJavaType", "javaType")
      , ("reportTypeResponseLabel", "label")
      , ("reportTypeResponseNumber", "number")
      , ("reportTypeResponseMajorAxis", "majorAxis")
      ]


-- | 
data ReservationResponse = ReservationResponse
  { reservationResponseReservationId :: Maybe Integer -- ^ 
  , reservationResponseReservableId :: Maybe Integer -- ^ 
  , reservationResponseReservableType :: Maybe Text -- ^ 
  , reservationResponseAccount :: Maybe AccountShortResponse -- ^ 
  , reservationResponseCreatedDate :: Maybe Integer -- ^ 
  , reservationResponseUpdatedDate :: Maybe Integer -- ^ 
  , reservationResponseStartDate :: Maybe Integer -- ^ 
  , reservationResponseEndDate :: Maybe Integer -- ^ 
  , reservationResponseTransaction :: Maybe OfferShortResponse -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ReservationResponse where
  parseJSON = genericParseJSON optionsReservationResponse
instance ToJSON ReservationResponse where
  toJSON = genericToJSON optionsReservationResponse

optionsReservationResponse :: Options
optionsReservationResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("reservationResponseReservationId", "reservationId")
      , ("reservationResponseReservableId", "reservableId")
      , ("reservationResponseReservableType", "reservableType")
      , ("reservationResponseAccount", "account")
      , ("reservationResponseCreatedDate", "createdDate")
      , ("reservationResponseUpdatedDate", "updatedDate")
      , ("reservationResponseStartDate", "startDate")
      , ("reservationResponseEndDate", "endDate")
      , ("reservationResponseTransaction", "transaction")
      ]


-- | 
data Retailer = Retailer
  { retailerId :: Maybe Integer -- ^ 
  , retailerActive :: Maybe Bool -- ^ 
  , retailerValid :: Maybe Bool -- ^ 
  , retailerLatitude :: Maybe Double -- ^ 
  , retailerLongitude :: Maybe Double -- ^ 
  , retailerLocationDescription :: Maybe Text -- ^ 
  , retailerName :: Maybe Text -- ^ 
  , retailerResponsible :: Maybe Account -- ^ 
  , retailerManager :: Maybe Account -- ^ 
  , retailerDetailsHeader :: Maybe Text -- ^ 
  , retailerDetailsBody :: Maybe Text -- ^ 
  , retailerDetailsLineLeft1 :: Maybe Text -- ^ 
  , retailerDetailsLineLeft2 :: Maybe Text -- ^ 
  , retailerDetailsLineRight1 :: Maybe Text -- ^ 
  , retailerMetaDescription :: Maybe Text -- ^ 
  , retailerDirections :: Maybe Text -- ^ 
  , retailerHours :: Maybe Text -- ^ 
  , retailerHomePhone :: Maybe Text -- ^ 
  , retailerCellPhone :: Maybe Text -- ^ 
  , retailerCellCarrier :: Maybe CellCarrier -- ^ 
  , retailerBusinessPhone :: Maybe Text -- ^ 
  , retailerBusinessPhoneExt :: Maybe Text -- ^ 
  , retailerFaxNumber :: Maybe Text -- ^ 
  , retailerTimeZone :: Maybe Text -- ^ 
  , retailerUtcOffset :: Maybe Text -- ^ 
  , retailerCode501c3 :: Maybe Text -- ^ 
  , retailerEmailAddress :: Maybe Text -- ^ 
  , retailerAddress :: Maybe Address -- ^ 
  , retailerWeb :: Maybe Text -- ^ 
  , retailerFeatured :: Maybe Bool -- ^ 
  , retailerListed :: Maybe Bool -- ^ 
  , retailerCategories :: Maybe [Category] -- ^ 
  , retailerTerritory :: Maybe Territory -- ^ 
  , retailerLocations :: Maybe [RetailerLocation] -- ^ 
  , retailerYipitId :: Maybe Integer -- ^ 
  , retailerFacebookUrl :: Maybe Text -- ^ 
  , retailerTwitterUrl :: Maybe Text -- ^ 
  , retailerVisibility :: Maybe Text -- ^ 
  , retailerNotes :: Maybe [Note] -- ^ 
  , retailerNoteCount :: Maybe Integer -- ^ 
  , retailerAppKey :: Maybe Text -- ^ 
  , retailerCategoryTree :: Maybe Text -- ^ 
  , retailerFilterTree :: Maybe Text -- ^ 
  , retailerBillableId :: Maybe Integer -- ^ 
  , retailerSubType :: Maybe Text -- ^ 
  , retailerContentName :: Maybe Text -- ^ 
  , retailerOwner :: Maybe Account -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Retailer where
  parseJSON = genericParseJSON optionsRetailer
instance ToJSON Retailer where
  toJSON = genericToJSON optionsRetailer

optionsRetailer :: Options
optionsRetailer =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("retailerId", "id")
      , ("retailerActive", "active")
      , ("retailerValid", "valid")
      , ("retailerLatitude", "latitude")
      , ("retailerLongitude", "longitude")
      , ("retailerLocationDescription", "locationDescription")
      , ("retailerName", "name")
      , ("retailerResponsible", "responsible")
      , ("retailerManager", "manager")
      , ("retailerDetailsHeader", "detailsHeader")
      , ("retailerDetailsBody", "detailsBody")
      , ("retailerDetailsLineLeft1", "detailsLineLeft1")
      , ("retailerDetailsLineLeft2", "detailsLineLeft2")
      , ("retailerDetailsLineRight1", "detailsLineRight1")
      , ("retailerMetaDescription", "metaDescription")
      , ("retailerDirections", "directions")
      , ("retailerHours", "hours")
      , ("retailerHomePhone", "homePhone")
      , ("retailerCellPhone", "cellPhone")
      , ("retailerCellCarrier", "cellCarrier")
      , ("retailerBusinessPhone", "businessPhone")
      , ("retailerBusinessPhoneExt", "businessPhoneExt")
      , ("retailerFaxNumber", "faxNumber")
      , ("retailerTimeZone", "timeZone")
      , ("retailerUtcOffset", "utcOffset")
      , ("retailerCode501c3", "code501c3")
      , ("retailerEmailAddress", "emailAddress")
      , ("retailerAddress", "address")
      , ("retailerWeb", "web")
      , ("retailerFeatured", "featured")
      , ("retailerListed", "listed")
      , ("retailerCategories", "categories")
      , ("retailerTerritory", "territory")
      , ("retailerLocations", "locations")
      , ("retailerYipitId", "yipitId")
      , ("retailerFacebookUrl", "facebookUrl")
      , ("retailerTwitterUrl", "twitterUrl")
      , ("retailerVisibility", "visibility")
      , ("retailerNotes", "notes")
      , ("retailerNoteCount", "noteCount")
      , ("retailerAppKey", "appKey")
      , ("retailerCategoryTree", "categoryTree")
      , ("retailerFilterTree", "filterTree")
      , ("retailerBillableId", "billableId")
      , ("retailerSubType", "subType")
      , ("retailerContentName", "contentName")
      , ("retailerOwner", "owner")
      ]


-- | 
data RetailerCountResponse = RetailerCountResponse
  { retailerCountResponseLocations :: Maybe Int -- ^ 
  , retailerCountResponseTransactions :: Maybe Int -- ^ 
  , retailerCountResponseOffers :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RetailerCountResponse where
  parseJSON = genericParseJSON optionsRetailerCountResponse
instance ToJSON RetailerCountResponse where
  toJSON = genericToJSON optionsRetailerCountResponse

optionsRetailerCountResponse :: Options
optionsRetailerCountResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("retailerCountResponseLocations", "locations")
      , ("retailerCountResponseTransactions", "transactions")
      , ("retailerCountResponseOffers", "offers")
      ]


-- | 
data RetailerFullResponse = RetailerFullResponse
  { retailerFullResponseRetailerId :: Maybe Integer -- ^ 
  , retailerFullResponseName :: Maybe Text -- ^ 
  , retailerFullResponseFacebookUrl :: Maybe Text -- ^ 
  , retailerFullResponseTwitterUrl :: Maybe Text -- ^ 
  , retailerFullResponseActive :: Maybe Bool -- ^ 
  , retailerFullResponseContact :: Maybe ContactInfoResponse -- ^ 
  , retailerFullResponseLogo :: Maybe AssetShortResponse -- ^ 
  , retailerFullResponsePicture1 :: Maybe AssetShortResponse -- ^ 
  , retailerFullResponsePicture2 :: Maybe AssetShortResponse -- ^ 
  , retailerFullResponseLatitude :: Maybe Double -- ^ 
  , retailerFullResponseLongitude :: Maybe Double -- ^ 
  , retailerFullResponseVisibility :: Maybe Text -- ^ 
  , retailerFullResponseResponsible :: Maybe ProfileShortResponse -- ^ 
  , retailerFullResponseManager :: Maybe ProfileShortResponse -- ^ 
  , retailerFullResponseBillableEntity :: Maybe BillableEntityResponse -- ^ 
  , retailerFullResponseCounts :: Maybe RetailerCountResponse -- ^ 
  , retailerFullResponseLocations :: Maybe [RetailerLocationShortResponse] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RetailerFullResponse where
  parseJSON = genericParseJSON optionsRetailerFullResponse
instance ToJSON RetailerFullResponse where
  toJSON = genericToJSON optionsRetailerFullResponse

optionsRetailerFullResponse :: Options
optionsRetailerFullResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("retailerFullResponseRetailerId", "retailerId")
      , ("retailerFullResponseName", "name")
      , ("retailerFullResponseFacebookUrl", "facebookUrl")
      , ("retailerFullResponseTwitterUrl", "twitterUrl")
      , ("retailerFullResponseActive", "active")
      , ("retailerFullResponseContact", "contact")
      , ("retailerFullResponseLogo", "logo")
      , ("retailerFullResponsePicture1", "picture1")
      , ("retailerFullResponsePicture2", "picture2")
      , ("retailerFullResponseLatitude", "latitude")
      , ("retailerFullResponseLongitude", "longitude")
      , ("retailerFullResponseVisibility", "visibility")
      , ("retailerFullResponseResponsible", "responsible")
      , ("retailerFullResponseManager", "manager")
      , ("retailerFullResponseBillableEntity", "billableEntity")
      , ("retailerFullResponseCounts", "counts")
      , ("retailerFullResponseLocations", "locations")
      ]


-- | 
data RetailerLocation = RetailerLocation
  { retailerLocationId :: Maybe Integer -- ^ 
  , retailerLocationActive :: Maybe Bool -- ^ 
  , retailerLocationValid :: Maybe Bool -- ^ 
  , retailerLocationLatitude :: Maybe Double -- ^ 
  , retailerLocationLongitude :: Maybe Double -- ^ 
  , retailerLocationLocationDescription :: Maybe Text -- ^ 
  , retailerLocationCategories :: Maybe [Category] -- ^ 
  , retailerLocationFilters :: Maybe [Filter] -- ^ 
  , retailerLocationOfferLocations :: Maybe [OfferLocation] -- ^ 
  , retailerLocationLogo :: Maybe Asset -- ^ 
  , retailerLocationPicture1 :: Maybe Asset -- ^ 
  , retailerLocationPicture2 :: Maybe Asset -- ^ 
  , retailerLocationQrCode :: Maybe Asset -- ^ 
  , retailerLocationName :: Maybe Text -- ^ 
  , retailerLocationLocationId :: Maybe Text -- ^ 
  , retailerLocationCode :: Maybe Text -- ^ 
  , retailerLocationRetailer :: Maybe Retailer -- ^ 
  , retailerLocationAssignments :: Maybe [Assignment] -- ^ 
  , retailerLocationCurrentAssignment :: Maybe Assignment -- ^ 
  , retailerLocationProfile :: Maybe RetailerProfile -- ^ 
  , retailerLocationRegions :: Maybe [Region] -- ^ 
  , retailerLocationOfferPrintKeyPrefix :: Maybe Text -- ^ 
  , retailerLocationAdministrators :: Maybe [Account] -- ^ 
  , retailerLocationSqootId :: Maybe Integer -- ^ 
  , retailerLocationYipitId :: Maybe Integer -- ^ 
  , retailerLocationLocationToken :: Maybe Text -- ^ 
  , retailerLocationBuilding :: Maybe Building -- ^ 
  , retailerLocationNotes :: Maybe [Note] -- ^ 
  , retailerLocationNoteCount :: Maybe Integer -- ^ 
  , retailerLocationSearchIndexUpdated :: Maybe UTCTime -- ^ 
  , retailerLocationInSearchIndex :: Maybe Bool -- ^ 
  , retailerLocationFavoriteCount :: Maybe Integer -- ^ 
  , retailerLocationHasRatings :: Maybe Bool -- ^ 
  , retailerLocationGooglePlaceId :: Maybe Text -- ^ 
  , retailerLocationYelpId :: Maybe Text -- ^ 
  , retailerLocationDisplay :: Maybe Text -- ^ 
  , retailerLocationAppKey :: Maybe Text -- ^ 
  , retailerLocationCategoryTree :: Maybe Text -- ^ 
  , retailerLocationFilterTree :: Maybe Text -- ^ 
  , retailerLocationAddressDisplay :: Maybe Text -- ^ 
  , retailerLocationMapQuery :: Maybe Text -- ^ 
  , retailerLocationSortName :: Maybe Text -- ^ 
  , retailerLocationFullDisplay :: Maybe Text -- ^ 
  , retailerLocationHasOffers :: Maybe Bool -- ^ 
  , retailerLocationBillableId :: Maybe Integer -- ^ 
  , retailerLocationSubType :: Maybe Text -- ^ 
  , retailerLocationContentName :: Maybe Text -- ^ 
  , retailerLocationOwner :: Maybe Account -- ^ 
  , retailerLocationSecondaryType :: Maybe Text -- ^ 
  , retailerLocationLocationAddress :: Maybe Text -- ^ 
  , retailerLocationValidOfferLocationIds :: Maybe [Integer] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RetailerLocation where
  parseJSON = genericParseJSON optionsRetailerLocation
instance ToJSON RetailerLocation where
  toJSON = genericToJSON optionsRetailerLocation

optionsRetailerLocation :: Options
optionsRetailerLocation =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("retailerLocationId", "id")
      , ("retailerLocationActive", "active")
      , ("retailerLocationValid", "valid")
      , ("retailerLocationLatitude", "latitude")
      , ("retailerLocationLongitude", "longitude")
      , ("retailerLocationLocationDescription", "locationDescription")
      , ("retailerLocationCategories", "categories")
      , ("retailerLocationFilters", "filters")
      , ("retailerLocationOfferLocations", "offerLocations")
      , ("retailerLocationLogo", "logo")
      , ("retailerLocationPicture1", "picture1")
      , ("retailerLocationPicture2", "picture2")
      , ("retailerLocationQrCode", "qrCode")
      , ("retailerLocationName", "name")
      , ("retailerLocationLocationId", "locationId")
      , ("retailerLocationCode", "code")
      , ("retailerLocationRetailer", "retailer")
      , ("retailerLocationAssignments", "assignments")
      , ("retailerLocationCurrentAssignment", "currentAssignment")
      , ("retailerLocationProfile", "profile")
      , ("retailerLocationRegions", "regions")
      , ("retailerLocationOfferPrintKeyPrefix", "offerPrintKeyPrefix")
      , ("retailerLocationAdministrators", "administrators")
      , ("retailerLocationSqootId", "sqootId")
      , ("retailerLocationYipitId", "yipitId")
      , ("retailerLocationLocationToken", "locationToken")
      , ("retailerLocationBuilding", "building")
      , ("retailerLocationNotes", "notes")
      , ("retailerLocationNoteCount", "noteCount")
      , ("retailerLocationSearchIndexUpdated", "searchIndexUpdated")
      , ("retailerLocationInSearchIndex", "inSearchIndex")
      , ("retailerLocationFavoriteCount", "favoriteCount")
      , ("retailerLocationHasRatings", "hasRatings")
      , ("retailerLocationGooglePlaceId", "googlePlaceId")
      , ("retailerLocationYelpId", "yelpId")
      , ("retailerLocationDisplay", "display")
      , ("retailerLocationAppKey", "appKey")
      , ("retailerLocationCategoryTree", "categoryTree")
      , ("retailerLocationFilterTree", "filterTree")
      , ("retailerLocationAddressDisplay", "addressDisplay")
      , ("retailerLocationMapQuery", "mapQuery")
      , ("retailerLocationSortName", "sortName")
      , ("retailerLocationFullDisplay", "fullDisplay")
      , ("retailerLocationHasOffers", "hasOffers")
      , ("retailerLocationBillableId", "billableId")
      , ("retailerLocationSubType", "subType")
      , ("retailerLocationContentName", "contentName")
      , ("retailerLocationOwner", "owner")
      , ("retailerLocationSecondaryType", "secondaryType")
      , ("retailerLocationLocationAddress", "locationAddress")
      , ("retailerLocationValidOfferLocationIds", "validOfferLocationIds")
      ]


-- | 
data RetailerLocationResponse = RetailerLocationResponse
  { retailerLocationResponseRetailerLocationId :: Maybe Integer -- ^ 
  , retailerLocationResponseName :: Maybe Text -- ^ 
  , retailerLocationResponseContact :: Maybe ContactInfoResponse -- ^ 
  , retailerLocationResponseLatitude :: Maybe Double -- ^ 
  , retailerLocationResponseLongitude :: Maybe Double -- ^ 
  , retailerLocationResponseActive :: Maybe Bool -- ^ 
  , retailerLocationResponseFavoriteId :: Maybe Integer -- ^ 
  , retailerLocationResponseFavorite :: Maybe Bool -- ^ 
  , retailerLocationResponseResponsible :: Maybe ProfileShortResponse -- ^ 
  , retailerLocationResponseManager :: Maybe ProfileShortResponse -- ^ 
  , retailerLocationResponseCategories :: Maybe [CategoryResponse] -- ^ 
  , retailerLocationResponseFilters :: Maybe [FilterResponse] -- ^ 
  , retailerLocationResponseLogo :: Maybe AssetShortResponse -- ^ 
  , retailerLocationResponsePicture1 :: Maybe AssetShortResponse -- ^ 
  , retailerLocationResponsePicture2 :: Maybe AssetShortResponse -- ^ 
  , retailerLocationResponseBillableEntity :: Maybe BillableEntityResponse -- ^ 
  , retailerLocationResponseCounts :: Maybe RetailerCountResponse -- ^ 
  , retailerLocationResponseRetailer :: Maybe RetailerShortResponse -- ^ 
  , retailerLocationResponseOffers :: Maybe ListResponse -- ^ 
  , retailerLocationResponseInternalId :: Maybe Text -- ^ 
  , retailerLocationResponseDetailsHeader :: Maybe Text -- ^ 
  , retailerLocationResponseDetailsBody :: Maybe Text -- ^ 
  , retailerLocationResponseHours :: Maybe Text -- ^ 
  , retailerLocationResponseLocationToken :: Maybe Text -- ^ 
  , retailerLocationResponseBuilding :: Maybe Text -- ^ 
  , retailerLocationResponseQrCodeUrl :: Maybe Text -- ^ 
  , retailerLocationResponseDistance :: Maybe Double -- ^ 
  , retailerLocationResponseGooglePlaceId :: Maybe Text -- ^ 
  , retailerLocationResponseYelpId :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RetailerLocationResponse where
  parseJSON = genericParseJSON optionsRetailerLocationResponse
instance ToJSON RetailerLocationResponse where
  toJSON = genericToJSON optionsRetailerLocationResponse

optionsRetailerLocationResponse :: Options
optionsRetailerLocationResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("retailerLocationResponseRetailerLocationId", "retailerLocationId")
      , ("retailerLocationResponseName", "name")
      , ("retailerLocationResponseContact", "contact")
      , ("retailerLocationResponseLatitude", "latitude")
      , ("retailerLocationResponseLongitude", "longitude")
      , ("retailerLocationResponseActive", "active")
      , ("retailerLocationResponseFavoriteId", "favoriteId")
      , ("retailerLocationResponseFavorite", "favorite")
      , ("retailerLocationResponseResponsible", "responsible")
      , ("retailerLocationResponseManager", "manager")
      , ("retailerLocationResponseCategories", "categories")
      , ("retailerLocationResponseFilters", "filters")
      , ("retailerLocationResponseLogo", "logo")
      , ("retailerLocationResponsePicture1", "picture1")
      , ("retailerLocationResponsePicture2", "picture2")
      , ("retailerLocationResponseBillableEntity", "billableEntity")
      , ("retailerLocationResponseCounts", "counts")
      , ("retailerLocationResponseRetailer", "retailer")
      , ("retailerLocationResponseOffers", "offers")
      , ("retailerLocationResponseInternalId", "internalId")
      , ("retailerLocationResponseDetailsHeader", "detailsHeader")
      , ("retailerLocationResponseDetailsBody", "detailsBody")
      , ("retailerLocationResponseHours", "hours")
      , ("retailerLocationResponseLocationToken", "locationToken")
      , ("retailerLocationResponseBuilding", "building")
      , ("retailerLocationResponseQrCodeUrl", "qrCodeUrl")
      , ("retailerLocationResponseDistance", "distance")
      , ("retailerLocationResponseGooglePlaceId", "googlePlaceId")
      , ("retailerLocationResponseYelpId", "yelpId")
      ]


-- | 
data RetailerLocationShortResponse = RetailerLocationShortResponse
  { retailerLocationShortResponseRetailerLocationId :: Maybe Integer -- ^ 
  , retailerLocationShortResponseName :: Maybe Text -- ^ 
  , retailerLocationShortResponseContact :: Maybe ContactInfoResponse -- ^ 
  , retailerLocationShortResponseLatitude :: Maybe Double -- ^ 
  , retailerLocationShortResponseLongitude :: Maybe Double -- ^ 
  , retailerLocationShortResponseActive :: Maybe Bool -- ^ 
  , retailerLocationShortResponseFavoriteId :: Maybe Integer -- ^ 
  , retailerLocationShortResponseFavorite :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RetailerLocationShortResponse where
  parseJSON = genericParseJSON optionsRetailerLocationShortResponse
instance ToJSON RetailerLocationShortResponse where
  toJSON = genericToJSON optionsRetailerLocationShortResponse

optionsRetailerLocationShortResponse :: Options
optionsRetailerLocationShortResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("retailerLocationShortResponseRetailerLocationId", "retailerLocationId")
      , ("retailerLocationShortResponseName", "name")
      , ("retailerLocationShortResponseContact", "contact")
      , ("retailerLocationShortResponseLatitude", "latitude")
      , ("retailerLocationShortResponseLongitude", "longitude")
      , ("retailerLocationShortResponseActive", "active")
      , ("retailerLocationShortResponseFavoriteId", "favoriteId")
      , ("retailerLocationShortResponseFavorite", "favorite")
      ]


-- | 
data RetailerOfferResponse = RetailerOfferResponse
  { retailerOfferResponseValid :: Maybe Bool -- ^ 
  , retailerOfferResponseMessage :: Maybe Text -- ^ 
  , retailerOfferResponseVersion :: Maybe Double -- ^ 
  , retailerOfferResponseSerializeNulls :: Maybe Bool -- ^ 
  , retailerOfferResponseStartTimeLog :: Maybe Integer -- ^ 
  , retailerOfferResponseErrorCode :: Maybe Text -- ^ 
  , retailerOfferResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , retailerOfferResponseOfferLocationId :: Maybe Integer -- ^ 
  , retailerOfferResponseOfferId :: Maybe Integer -- ^ 
  , retailerOfferResponseRetailerId :: Maybe Integer -- ^ 
  , retailerOfferResponseTransactionId :: Maybe Integer -- ^ 
  , retailerOfferResponseFavoriteId :: Maybe Integer -- ^ 
  , retailerOfferResponseOfferName :: Maybe Text -- ^ 
  , retailerOfferResponseSubTitle :: Maybe Text -- ^ 
  , retailerOfferResponseLocationName :: Maybe Text -- ^ 
  , retailerOfferResponseStarts :: Maybe UTCTime -- ^ 
  , retailerOfferResponseExpires :: Maybe UTCTime -- ^ 
  , retailerOfferResponseActivated :: Maybe Integer -- ^ 
  , retailerOfferResponseExpiration :: Maybe Integer -- ^ 
  , retailerOfferResponseRedeemableStart :: Maybe Integer -- ^ 
  , retailerOfferResponseRedeemableEnd :: Maybe Integer -- ^ 
  , retailerOfferResponseDistance :: Maybe Double -- ^ 
  , retailerOfferResponseOfferType :: Maybe Text -- ^ 
  , retailerOfferResponseLongitude :: Maybe Double -- ^ 
  , retailerOfferResponseLatitude :: Maybe Double -- ^ 
  , retailerOfferResponseFavorite :: Maybe Bool -- ^ 
  , retailerOfferResponseFullPrice :: Maybe Double -- ^ 
  , retailerOfferResponseDiscountPrice :: Maybe Double -- ^ 
  , retailerOfferResponseEstimatedValue :: Maybe Double -- ^ 
  , retailerOfferResponseVoucherDiscountPrice :: Maybe Double -- ^ 
  , retailerOfferResponseMissionListResponse :: Maybe MissionListResponse -- ^ 
  , retailerOfferResponseImage :: Maybe Text -- ^ 
  , retailerOfferResponseImage1 :: Maybe Text -- ^ 
  , retailerOfferResponseImage2 :: Maybe Text -- ^ 
  , retailerOfferResponseImage3 :: Maybe Text -- ^ 
  , retailerOfferResponseImage4 :: Maybe Text -- ^ 
  , retailerOfferResponseImage5 :: Maybe Text -- ^ 
  , retailerOfferResponseImages :: Maybe [AssetResponse] -- ^ 
  , retailerOfferResponseBarcode :: Maybe Text -- ^ 
  , retailerOfferResponseExternalUrl :: Maybe Text -- ^ 
  , retailerOfferResponseSqootUrl :: Maybe Text -- ^ 
  , retailerOfferResponseActive :: Maybe Bool -- ^ 
  , retailerOfferResponseLocation :: Maybe RetailerLocationResponse -- ^ 
  , retailerOfferResponseSubDetails :: Maybe Text -- ^ 
  , retailerOfferResponseExternalRedeemAuth :: Maybe Int -- ^ 
  , retailerOfferResponseExternalRedeemOptions :: Maybe Text -- ^ 
  , retailerOfferResponsePublisher :: Maybe Text -- ^ 
  , retailerOfferResponseProduct :: Maybe ProductResponse -- ^ 
  , retailerOfferResponseEvent :: Maybe EventResponse -- ^ 
  , retailerOfferResponseMedia :: Maybe MediaResponse -- ^ 
  , retailerOfferResponseViewedCount :: Maybe Int -- ^ 
  , retailerOfferResponseClickedCount :: Maybe Int -- ^ 
  , retailerOfferResponseAddedLimit :: Maybe Int -- ^ 
  , retailerOfferResponseAddedCount :: Maybe Int -- ^ 
  , retailerOfferResponseUsedCount :: Maybe Int -- ^ 
  , retailerOfferResponseRemovedCount :: Maybe Int -- ^ 
  , retailerOfferResponseLocationAddedCount :: Maybe Int -- ^ 
  , retailerOfferResponseBarcodeEntry :: Maybe Text -- ^ 
  , retailerOfferResponseBarcodeType :: Maybe Text -- ^ 
  , retailerOfferResponseTicketsReward :: Maybe Integer -- ^ 
  , retailerOfferResponseTicketsRewardType :: Maybe Text -- ^ 
  , retailerOfferResponseSpecialOfferType :: Maybe Text -- ^ 
  , retailerOfferResponseLikeCount :: Maybe Integer -- ^ 
  , retailerOfferResponseDislikeCount :: Maybe Integer -- ^ 
  , retailerOfferResponseFavoriteCount :: Maybe Integer -- ^ 
  , retailerOfferResponseNoteCount :: Maybe Integer -- ^ 
  , retailerOfferResponseLogId :: Maybe Integer -- ^ 
  , retailerOfferResponseBillableEntityId :: Maybe Integer -- ^ 
  , retailerOfferResponseResponsibleAccountId :: Maybe Integer -- ^ 
  , retailerOfferResponseAvailabilitySummary :: Maybe Text -- ^ 
  , retailerOfferResponseExternalId :: Maybe Text -- ^ 
  , retailerOfferResponseParentOffer :: Maybe OfferShortResponse -- ^ 
  , retailerOfferResponseAddress :: Maybe Text -- ^ 
  , retailerOfferResponseDetails :: Maybe Text -- ^ 
  , retailerOfferResponseFinePrint :: Maybe Text -- ^ 
  , retailerOfferResponseRetailerPhoneNumber :: Maybe Text -- ^ 
  , retailerOfferResponseTicketPriceType :: Maybe Text -- ^ 
  , retailerOfferResponseTicketPrice :: Maybe Integer -- ^ 
  , retailerOfferResponseDiscountPercentage :: Maybe Double -- ^ 
  , retailerOfferResponsePaymentFees :: Maybe Double -- ^ 
  , retailerOfferResponseVoucherPrice :: Maybe Double -- ^ 
  , retailerOfferResponsePurchasesRemaining :: Maybe Int -- ^ 
  , retailerOfferResponseRedemptionsRemaining :: Maybe Int -- ^ 
  , retailerOfferResponseRedemptionStatus :: Maybe Int -- ^ 
  , retailerOfferResponseRedemptionCode :: Maybe Text -- ^ 
  , retailerOfferResponseAudiences :: Maybe [AudienceResponse] -- ^ 
  , retailerOfferResponseAudienceCount :: Maybe Int -- ^ 
  , retailerOfferResponseWalletCount :: Maybe Int -- ^ 
  , retailerOfferResponseQrCodeUrl :: Maybe Text -- ^ 
  , retailerOfferResponseShowRemaining :: Maybe Bool -- ^ 
  , retailerOfferResponseShowRedeemed :: Maybe Bool -- ^ 
  , retailerOfferResponsePurchaseLimit :: Maybe Int -- ^ 
  , retailerOfferResponsePurchaseLimitPerUser :: Maybe Int -- ^ 
  , retailerOfferResponseRedemptionLimit :: Maybe Int -- ^ 
  , retailerOfferResponseUserRedemptionLimit :: Maybe Int -- ^ 
  , retailerOfferResponseCategories :: Maybe [CategoryResponse] -- ^ 
  , retailerOfferResponseFilters :: Maybe [FilterResponse] -- ^ 
  , retailerOfferResponseLocations :: Maybe [(Map.Map String Value)] -- ^ 
  , retailerOfferResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RetailerOfferResponse where
  parseJSON = genericParseJSON optionsRetailerOfferResponse
instance ToJSON RetailerOfferResponse where
  toJSON = genericToJSON optionsRetailerOfferResponse

optionsRetailerOfferResponse :: Options
optionsRetailerOfferResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("retailerOfferResponseValid", "valid")
      , ("retailerOfferResponseMessage", "message")
      , ("retailerOfferResponseVersion", "version")
      , ("retailerOfferResponseSerializeNulls", "serializeNulls")
      , ("retailerOfferResponseStartTimeLog", "startTimeLog")
      , ("retailerOfferResponseErrorCode", "errorCode")
      , ("retailerOfferResponseRequest", "request")
      , ("retailerOfferResponseOfferLocationId", "offerLocationId")
      , ("retailerOfferResponseOfferId", "offerId")
      , ("retailerOfferResponseRetailerId", "retailerId")
      , ("retailerOfferResponseTransactionId", "transactionId")
      , ("retailerOfferResponseFavoriteId", "favoriteId")
      , ("retailerOfferResponseOfferName", "offerName")
      , ("retailerOfferResponseSubTitle", "subTitle")
      , ("retailerOfferResponseLocationName", "locationName")
      , ("retailerOfferResponseStarts", "starts")
      , ("retailerOfferResponseExpires", "expires")
      , ("retailerOfferResponseActivated", "activated")
      , ("retailerOfferResponseExpiration", "expiration")
      , ("retailerOfferResponseRedeemableStart", "redeemableStart")
      , ("retailerOfferResponseRedeemableEnd", "redeemableEnd")
      , ("retailerOfferResponseDistance", "distance")
      , ("retailerOfferResponseOfferType", "offerType")
      , ("retailerOfferResponseLongitude", "longitude")
      , ("retailerOfferResponseLatitude", "latitude")
      , ("retailerOfferResponseFavorite", "favorite")
      , ("retailerOfferResponseFullPrice", "fullPrice")
      , ("retailerOfferResponseDiscountPrice", "discountPrice")
      , ("retailerOfferResponseEstimatedValue", "estimatedValue")
      , ("retailerOfferResponseVoucherDiscountPrice", "voucherDiscountPrice")
      , ("retailerOfferResponseMissionListResponse", "missionListResponse")
      , ("retailerOfferResponseImage", "image")
      , ("retailerOfferResponseImage1", "image1")
      , ("retailerOfferResponseImage2", "image2")
      , ("retailerOfferResponseImage3", "image3")
      , ("retailerOfferResponseImage4", "image4")
      , ("retailerOfferResponseImage5", "image5")
      , ("retailerOfferResponseImages", "images")
      , ("retailerOfferResponseBarcode", "barcode")
      , ("retailerOfferResponseExternalUrl", "externalUrl")
      , ("retailerOfferResponseSqootUrl", "sqootUrl")
      , ("retailerOfferResponseActive", "active")
      , ("retailerOfferResponseLocation", "location")
      , ("retailerOfferResponseSubDetails", "subDetails")
      , ("retailerOfferResponseExternalRedeemAuth", "externalRedeemAuth")
      , ("retailerOfferResponseExternalRedeemOptions", "externalRedeemOptions")
      , ("retailerOfferResponsePublisher", "publisher")
      , ("retailerOfferResponseProduct", "product")
      , ("retailerOfferResponseEvent", "event")
      , ("retailerOfferResponseMedia", "media")
      , ("retailerOfferResponseViewedCount", "viewedCount")
      , ("retailerOfferResponseClickedCount", "clickedCount")
      , ("retailerOfferResponseAddedLimit", "addedLimit")
      , ("retailerOfferResponseAddedCount", "addedCount")
      , ("retailerOfferResponseUsedCount", "usedCount")
      , ("retailerOfferResponseRemovedCount", "removedCount")
      , ("retailerOfferResponseLocationAddedCount", "locationAddedCount")
      , ("retailerOfferResponseBarcodeEntry", "barcodeEntry")
      , ("retailerOfferResponseBarcodeType", "barcodeType")
      , ("retailerOfferResponseTicketsReward", "ticketsReward")
      , ("retailerOfferResponseTicketsRewardType", "ticketsRewardType")
      , ("retailerOfferResponseSpecialOfferType", "specialOfferType")
      , ("retailerOfferResponseLikeCount", "likeCount")
      , ("retailerOfferResponseDislikeCount", "dislikeCount")
      , ("retailerOfferResponseFavoriteCount", "favoriteCount")
      , ("retailerOfferResponseNoteCount", "noteCount")
      , ("retailerOfferResponseLogId", "logId")
      , ("retailerOfferResponseBillableEntityId", "billableEntityId")
      , ("retailerOfferResponseResponsibleAccountId", "responsibleAccountId")
      , ("retailerOfferResponseAvailabilitySummary", "availabilitySummary")
      , ("retailerOfferResponseExternalId", "externalId")
      , ("retailerOfferResponseParentOffer", "parentOffer")
      , ("retailerOfferResponseAddress", "address")
      , ("retailerOfferResponseDetails", "details")
      , ("retailerOfferResponseFinePrint", "finePrint")
      , ("retailerOfferResponseRetailerPhoneNumber", "retailerPhoneNumber")
      , ("retailerOfferResponseTicketPriceType", "ticketPriceType")
      , ("retailerOfferResponseTicketPrice", "ticketPrice")
      , ("retailerOfferResponseDiscountPercentage", "discountPercentage")
      , ("retailerOfferResponsePaymentFees", "paymentFees")
      , ("retailerOfferResponseVoucherPrice", "voucherPrice")
      , ("retailerOfferResponsePurchasesRemaining", "purchasesRemaining")
      , ("retailerOfferResponseRedemptionsRemaining", "redemptionsRemaining")
      , ("retailerOfferResponseRedemptionStatus", "redemptionStatus")
      , ("retailerOfferResponseRedemptionCode", "redemptionCode")
      , ("retailerOfferResponseAudiences", "audiences")
      , ("retailerOfferResponseAudienceCount", "audienceCount")
      , ("retailerOfferResponseWalletCount", "walletCount")
      , ("retailerOfferResponseQrCodeUrl", "qrCodeUrl")
      , ("retailerOfferResponseShowRemaining", "showRemaining")
      , ("retailerOfferResponseShowRedeemed", "showRedeemed")
      , ("retailerOfferResponsePurchaseLimit", "purchaseLimit")
      , ("retailerOfferResponsePurchaseLimitPerUser", "purchaseLimitPerUser")
      , ("retailerOfferResponseRedemptionLimit", "redemptionLimit")
      , ("retailerOfferResponseUserRedemptionLimit", "userRedemptionLimit")
      , ("retailerOfferResponseCategories", "categories")
      , ("retailerOfferResponseFilters", "filters")
      , ("retailerOfferResponseLocations", "locations")
      , ("retailerOfferResponseReturning", "returning")
      ]


-- | 
data RetailerProfile = RetailerProfile
  { retailerProfileDetailsHeader :: Maybe Text -- ^ 
  , retailerProfileDetailsBody :: Maybe Text -- ^ 
  , retailerProfileDetailsLineLeft1 :: Maybe Text -- ^ 
  , retailerProfileDetailsLineLeft2 :: Maybe Text -- ^ 
  , retailerProfileDetailsLineRight1 :: Maybe Text -- ^ 
  , retailerProfileMetaDescription :: Maybe Text -- ^ 
  , retailerProfileDirections :: Maybe Text -- ^ 
  , retailerProfileHours :: Maybe Text -- ^ 
  , retailerProfileHomePhone :: Maybe Text -- ^ 
  , retailerProfileCellPhone :: Maybe Text -- ^ 
  , retailerProfileCellCarrier :: Maybe CellCarrier -- ^ 
  , retailerProfileBusinessPhone :: Maybe Text -- ^ 
  , retailerProfileBusinessPhoneExt :: Maybe Text -- ^ 
  , retailerProfileFaxNumber :: Maybe Text -- ^ 
  , retailerProfileTimeZone :: Maybe Text -- ^ 
  , retailerProfileUtcOffset :: Maybe Text -- ^ 
  , retailerProfileCode501c3 :: Maybe Text -- ^ 
  , retailerProfileEmailAddress :: Maybe Text -- ^ 
  , retailerProfileAddress :: Maybe Address -- ^ 
  , retailerProfileWeb :: Maybe Text -- ^ 
  , retailerProfileFeatured :: Maybe Bool -- ^ 
  , retailerProfileListed :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RetailerProfile where
  parseJSON = genericParseJSON optionsRetailerProfile
instance ToJSON RetailerProfile where
  toJSON = genericToJSON optionsRetailerProfile

optionsRetailerProfile :: Options
optionsRetailerProfile =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("retailerProfileDetailsHeader", "detailsHeader")
      , ("retailerProfileDetailsBody", "detailsBody")
      , ("retailerProfileDetailsLineLeft1", "detailsLineLeft1")
      , ("retailerProfileDetailsLineLeft2", "detailsLineLeft2")
      , ("retailerProfileDetailsLineRight1", "detailsLineRight1")
      , ("retailerProfileMetaDescription", "metaDescription")
      , ("retailerProfileDirections", "directions")
      , ("retailerProfileHours", "hours")
      , ("retailerProfileHomePhone", "homePhone")
      , ("retailerProfileCellPhone", "cellPhone")
      , ("retailerProfileCellCarrier", "cellCarrier")
      , ("retailerProfileBusinessPhone", "businessPhone")
      , ("retailerProfileBusinessPhoneExt", "businessPhoneExt")
      , ("retailerProfileFaxNumber", "faxNumber")
      , ("retailerProfileTimeZone", "timeZone")
      , ("retailerProfileUtcOffset", "utcOffset")
      , ("retailerProfileCode501c3", "code501c3")
      , ("retailerProfileEmailAddress", "emailAddress")
      , ("retailerProfileAddress", "address")
      , ("retailerProfileWeb", "web")
      , ("retailerProfileFeatured", "featured")
      , ("retailerProfileListed", "listed")
      ]


-- | 
data RetailerResponse = RetailerResponse
  { retailerResponseRetailerId :: Maybe Integer -- ^ 
  , retailerResponseName :: Maybe Text -- ^ 
  , retailerResponseFacebookUrl :: Maybe Text -- ^ 
  , retailerResponseTwitterUrl :: Maybe Text -- ^ 
  , retailerResponseActive :: Maybe Bool -- ^ 
  , retailerResponseContact :: Maybe ContactInfoResponse -- ^ 
  , retailerResponseLogo :: Maybe AssetShortResponse -- ^ 
  , retailerResponsePicture1 :: Maybe AssetShortResponse -- ^ 
  , retailerResponsePicture2 :: Maybe AssetShortResponse -- ^ 
  , retailerResponseLatitude :: Maybe Double -- ^ 
  , retailerResponseLongitude :: Maybe Double -- ^ 
  , retailerResponseVisibility :: Maybe Text -- ^ 
  , retailerResponseResponsible :: Maybe ProfileShortResponse -- ^ 
  , retailerResponseManager :: Maybe ProfileShortResponse -- ^ 
  , retailerResponseBillableEntity :: Maybe BillableEntityResponse -- ^ 
  , retailerResponseCounts :: Maybe RetailerCountResponse -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RetailerResponse where
  parseJSON = genericParseJSON optionsRetailerResponse
instance ToJSON RetailerResponse where
  toJSON = genericToJSON optionsRetailerResponse

optionsRetailerResponse :: Options
optionsRetailerResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("retailerResponseRetailerId", "retailerId")
      , ("retailerResponseName", "name")
      , ("retailerResponseFacebookUrl", "facebookUrl")
      , ("retailerResponseTwitterUrl", "twitterUrl")
      , ("retailerResponseActive", "active")
      , ("retailerResponseContact", "contact")
      , ("retailerResponseLogo", "logo")
      , ("retailerResponsePicture1", "picture1")
      , ("retailerResponsePicture2", "picture2")
      , ("retailerResponseLatitude", "latitude")
      , ("retailerResponseLongitude", "longitude")
      , ("retailerResponseVisibility", "visibility")
      , ("retailerResponseResponsible", "responsible")
      , ("retailerResponseManager", "manager")
      , ("retailerResponseBillableEntity", "billableEntity")
      , ("retailerResponseCounts", "counts")
      ]


-- | 
data RetailerShortResponse = RetailerShortResponse
  { retailerShortResponseRetailerId :: Maybe Integer -- ^ 
  , retailerShortResponseName :: Maybe Text -- ^ 
  , retailerShortResponseFacebookUrl :: Maybe Text -- ^ 
  , retailerShortResponseTwitterUrl :: Maybe Text -- ^ 
  , retailerShortResponseActive :: Maybe Bool -- ^ 
  , retailerShortResponseContact :: Maybe ContactInfoResponse -- ^ 
  , retailerShortResponseLogo :: Maybe AssetShortResponse -- ^ 
  , retailerShortResponsePicture1 :: Maybe AssetShortResponse -- ^ 
  , retailerShortResponsePicture2 :: Maybe AssetShortResponse -- ^ 
  , retailerShortResponseLatitude :: Maybe Double -- ^ 
  , retailerShortResponseLongitude :: Maybe Double -- ^ 
  , retailerShortResponseVisibility :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RetailerShortResponse where
  parseJSON = genericParseJSON optionsRetailerShortResponse
instance ToJSON RetailerShortResponse where
  toJSON = genericToJSON optionsRetailerShortResponse

optionsRetailerShortResponse :: Options
optionsRetailerShortResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("retailerShortResponseRetailerId", "retailerId")
      , ("retailerShortResponseName", "name")
      , ("retailerShortResponseFacebookUrl", "facebookUrl")
      , ("retailerShortResponseTwitterUrl", "twitterUrl")
      , ("retailerShortResponseActive", "active")
      , ("retailerShortResponseContact", "contact")
      , ("retailerShortResponseLogo", "logo")
      , ("retailerShortResponsePicture1", "picture1")
      , ("retailerShortResponsePicture2", "picture2")
      , ("retailerShortResponseLatitude", "latitude")
      , ("retailerShortResponseLongitude", "longitude")
      , ("retailerShortResponseVisibility", "visibility")
      ]


-- | 
data RewardResponse = RewardResponse
  { rewardResponseOfferId :: Maybe Integer -- ^ 
  , rewardResponseTitle :: Maybe Text -- ^ 
  , rewardResponseSubTitle :: Maybe Text -- ^ 
  , rewardResponseDetails :: Maybe Text -- ^ 
  , rewardResponseArtwork :: Maybe AssetShortResponse -- ^ 
  , rewardResponseFinePrint :: Maybe Text -- ^ 
  , rewardResponseRedemptionCode :: Maybe Text -- ^ 
  , rewardResponseRedemptionStatus :: Maybe Int -- ^ 
  , rewardResponseTransactionId :: Maybe Integer -- ^ 
  , rewardResponseEstimatedValue :: Maybe Double -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RewardResponse where
  parseJSON = genericParseJSON optionsRewardResponse
instance ToJSON RewardResponse where
  toJSON = genericToJSON optionsRewardResponse

optionsRewardResponse :: Options
optionsRewardResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("rewardResponseOfferId", "offerId")
      , ("rewardResponseTitle", "title")
      , ("rewardResponseSubTitle", "subTitle")
      , ("rewardResponseDetails", "details")
      , ("rewardResponseArtwork", "artwork")
      , ("rewardResponseFinePrint", "finePrint")
      , ("rewardResponseRedemptionCode", "redemptionCode")
      , ("rewardResponseRedemptionStatus", "redemptionStatus")
      , ("rewardResponseTransactionId", "transactionId")
      , ("rewardResponseEstimatedValue", "estimatedValue")
      ]


-- | 
data Route = Route
  { routeId :: Maybe Integer -- ^ 
  , routeActive :: Maybe Bool -- ^ 
  , routeValid :: Maybe Bool -- ^ 
  , routeName :: Maybe Text -- ^ 
  , routeExternalId :: Maybe Text -- ^ 
  , routeHub :: Maybe ServiceHub -- ^ 
  , routeProgram :: Maybe Program -- ^ 
  , routeZone :: Maybe Region -- ^ 
  , routeVehicle :: Maybe Vehicle -- ^ 
  , routeDriver :: Maybe Account -- ^ 
  , routeConcierge :: Maybe Account -- ^ 
  , routeScheduled :: Maybe UTCTime -- ^ 
  , routeApproved :: Maybe UTCTime -- ^ 
  , routeStarted :: Maybe UTCTime -- ^ 
  , routeCompleted :: Maybe UTCTime -- ^ 
  , routeTotalDistance :: Maybe Float -- ^ 
  , routeTotalTime :: Maybe Integer -- ^ 
  , routeEstimatedDistance :: Maybe Double -- ^ 
  , routeEstimatedTime :: Maybe Integer -- ^ 
  , routeStartStop :: Maybe Stop -- ^ 
  , routeEndStop :: Maybe Stop -- ^ 
  , routeStops :: Maybe [Stop] -- ^ 
  , routeShipments :: Maybe [Shipment] -- ^ 
  , routeAllShipmentsConfirmed :: Maybe Bool -- ^ 
  , routeShipmentOrderCount :: Maybe Int -- ^ 
  , routePolyline :: Maybe Text -- ^ 
  , routeNotes :: Maybe [Note] -- ^ 
  , routeNoteCount :: Maybe Integer -- ^ 
  , routeGlympseToken :: Maybe Text -- ^ 
  , routeEnableOptimization :: Maybe Bool -- ^ 
  , routeOptimizedDate :: Maybe UTCTime -- ^ 
  , routeOptimizationStarted :: Maybe UTCTime -- ^ 
  , routeOptimizationCompleted :: Maybe UTCTime -- ^ 
  , routeFeatured :: Maybe Bool -- ^ 
  , routeImage :: Maybe Asset -- ^ 
  , routeParent :: Maybe Route -- ^ 
  , routeContentName :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Route where
  parseJSON = genericParseJSON optionsRoute
instance ToJSON Route where
  toJSON = genericToJSON optionsRoute

optionsRoute :: Options
optionsRoute =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("routeId", "id")
      , ("routeActive", "active")
      , ("routeValid", "valid")
      , ("routeName", "name")
      , ("routeExternalId", "externalId")
      , ("routeHub", "hub")
      , ("routeProgram", "program")
      , ("routeZone", "zone")
      , ("routeVehicle", "vehicle")
      , ("routeDriver", "driver")
      , ("routeConcierge", "concierge")
      , ("routeScheduled", "scheduled")
      , ("routeApproved", "approved")
      , ("routeStarted", "started")
      , ("routeCompleted", "completed")
      , ("routeTotalDistance", "totalDistance")
      , ("routeTotalTime", "totalTime")
      , ("routeEstimatedDistance", "estimatedDistance")
      , ("routeEstimatedTime", "estimatedTime")
      , ("routeStartStop", "startStop")
      , ("routeEndStop", "endStop")
      , ("routeStops", "stops")
      , ("routeShipments", "shipments")
      , ("routeAllShipmentsConfirmed", "allShipmentsConfirmed")
      , ("routeShipmentOrderCount", "shipmentOrderCount")
      , ("routePolyline", "polyline")
      , ("routeNotes", "notes")
      , ("routeNoteCount", "noteCount")
      , ("routeGlympseToken", "glympseToken")
      , ("routeEnableOptimization", "enableOptimization")
      , ("routeOptimizedDate", "optimizedDate")
      , ("routeOptimizationStarted", "optimizationStarted")
      , ("routeOptimizationCompleted", "optimizationCompleted")
      , ("routeFeatured", "featured")
      , ("routeImage", "image")
      , ("routeParent", "parent")
      , ("routeContentName", "contentName")
      ]


-- | 
data RouteSettings = RouteSettings
  { routeSettingsId :: Maybe Integer -- ^ 
  , routeSettingsActive :: Maybe Bool -- ^ 
  , routeSettingsValid :: Maybe Bool -- ^ 
  , routeSettingsName :: Maybe Text -- ^ 
  , routeSettingsDescription :: Maybe Text -- ^ 
  , routeSettingsSetting :: Maybe Text -- ^ 
  , routeSettingsSettingType :: Maybe Text -- ^ 
  , routeSettingsProgram :: Maybe Program -- ^ 
  , routeSettingsHub :: Maybe ServiceHub -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RouteSettings where
  parseJSON = genericParseJSON optionsRouteSettings
instance ToJSON RouteSettings where
  toJSON = genericToJSON optionsRouteSettings

optionsRouteSettings :: Options
optionsRouteSettings =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("routeSettingsId", "id")
      , ("routeSettingsActive", "active")
      , ("routeSettingsValid", "valid")
      , ("routeSettingsName", "name")
      , ("routeSettingsDescription", "description")
      , ("routeSettingsSetting", "setting")
      , ("routeSettingsSettingType", "settingType")
      , ("routeSettingsProgram", "program")
      , ("routeSettingsHub", "hub")
      ]


-- | 
data RoutingListResponse = RoutingListResponse
  { routingListResponseValid :: Maybe Bool -- ^ 
  , routingListResponseMessage :: Maybe Text -- ^ 
  , routingListResponseVersion :: Maybe Double -- ^ 
  , routingListResponseSerializeNulls :: Maybe Bool -- ^ 
  , routingListResponseStartTimeLog :: Maybe Integer -- ^ 
  , routingListResponseErrorCode :: Maybe Text -- ^ 
  , routingListResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , routingListResponseItems :: Maybe [RoutingResponse] -- ^ 
  , routingListResponseCount :: Maybe Int -- ^ 
  , routingListResponseDebug :: Maybe [Text] -- ^ 
  , routingListResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RoutingListResponse where
  parseJSON = genericParseJSON optionsRoutingListResponse
instance ToJSON RoutingListResponse where
  toJSON = genericToJSON optionsRoutingListResponse

optionsRoutingListResponse :: Options
optionsRoutingListResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("routingListResponseValid", "valid")
      , ("routingListResponseMessage", "message")
      , ("routingListResponseVersion", "version")
      , ("routingListResponseSerializeNulls", "serializeNulls")
      , ("routingListResponseStartTimeLog", "startTimeLog")
      , ("routingListResponseErrorCode", "errorCode")
      , ("routingListResponseRequest", "request")
      , ("routingListResponseItems", "items")
      , ("routingListResponseCount", "count")
      , ("routingListResponseDebug", "debug")
      , ("routingListResponseReturning", "returning")
      ]


-- | 
data RoutingResponse = RoutingResponse
  { routingResponseValid :: Maybe Bool -- ^ 
  , routingResponseMessage :: Maybe Text -- ^ 
  , routingResponseVersion :: Maybe Double -- ^ 
  , routingResponseSerializeNulls :: Maybe Bool -- ^ 
  , routingResponseStartTimeLog :: Maybe Integer -- ^ 
  , routingResponseErrorCode :: Maybe Text -- ^ 
  , routingResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , routingResponseItems :: Maybe [LoadResponse] -- ^ 
  , routingResponseVehicles :: Maybe [VehicleResponse] -- ^ 
  , routingResponseDrivers :: Maybe [DriverResponse] -- ^ 
  , routingResponseConfig :: Maybe ConfigRoutingRequest -- ^ 
  , routingResponseError :: Maybe Text -- ^ 
  , routingResponseDebug :: Maybe [Text] -- ^ 
  , routingResponseStartTime :: Maybe UTCTime -- ^ 
  , routingResponseEndTime :: Maybe UTCTime -- ^ 
  , routingResponseResponses :: Maybe [RoutingResponse] -- ^ 
  , routingResponseOrignalRequest :: Maybe Text -- ^ 
  , routingResponseGenerated :: Maybe Bool -- ^ 
  , routingResponseItineraries :: Maybe [ItineraryResponse] -- ^ 
  , routingResponseScore :: Maybe Integer -- ^ 
  , routingResponseLoadSize :: Maybe Int -- ^ 
  , routingResponseRuntime :: Maybe Integer -- ^ 
  , routingResponseEarliestPickupWindow :: Maybe Integer -- ^ 
  , routingResponseLatestPickupWindow :: Maybe Integer -- ^ 
  , routingResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RoutingResponse where
  parseJSON = genericParseJSON optionsRoutingResponse
instance ToJSON RoutingResponse where
  toJSON = genericToJSON optionsRoutingResponse

optionsRoutingResponse :: Options
optionsRoutingResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("routingResponseValid", "valid")
      , ("routingResponseMessage", "message")
      , ("routingResponseVersion", "version")
      , ("routingResponseSerializeNulls", "serializeNulls")
      , ("routingResponseStartTimeLog", "startTimeLog")
      , ("routingResponseErrorCode", "errorCode")
      , ("routingResponseRequest", "request")
      , ("routingResponseItems", "items")
      , ("routingResponseVehicles", "vehicles")
      , ("routingResponseDrivers", "drivers")
      , ("routingResponseConfig", "config")
      , ("routingResponseError", "error")
      , ("routingResponseDebug", "debug")
      , ("routingResponseStartTime", "startTime")
      , ("routingResponseEndTime", "endTime")
      , ("routingResponseResponses", "responses")
      , ("routingResponseOrignalRequest", "orignalRequest")
      , ("routingResponseGenerated", "generated")
      , ("routingResponseItineraries", "itineraries")
      , ("routingResponseScore", "score")
      , ("routingResponseLoadSize", "loadSize")
      , ("routingResponseRuntime", "runtime")
      , ("routingResponseEarliestPickupWindow", "earliestPickupWindow")
      , ("routingResponseLatestPickupWindow", "latestPickupWindow")
      , ("routingResponseReturning", "returning")
      ]


-- | 
data RuleListResponse = RuleListResponse
  { ruleListResponseStart :: Maybe Int -- ^ 
  , ruleListResponseLimit :: Maybe Int -- ^ 
  , ruleListResponseCountTotal :: Maybe Integer -- ^ 
  , ruleListResponseItems :: Maybe [RuleResponse] -- ^ 
  , ruleListResponseCount :: Maybe Int -- ^ 
  , ruleListResponseHasMoreResults :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RuleListResponse where
  parseJSON = genericParseJSON optionsRuleListResponse
instance ToJSON RuleListResponse where
  toJSON = genericToJSON optionsRuleListResponse

optionsRuleListResponse :: Options
optionsRuleListResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("ruleListResponseStart", "start")
      , ("ruleListResponseLimit", "limit")
      , ("ruleListResponseCountTotal", "countTotal")
      , ("ruleListResponseItems", "items")
      , ("ruleListResponseCount", "count")
      , ("ruleListResponseHasMoreResults", "hasMoreResults")
      ]


-- | 
data RuleResponse = RuleResponse
  { ruleResponseRuleId :: Maybe Integer -- ^ 
  , ruleResponseTitle :: Maybe Text -- ^ 
  , ruleResponseDescription :: Maybe Text -- ^ 
  , ruleResponseRuleTypeId :: Maybe Integer -- ^ 
  , ruleResponseRuleTypeTitle :: Maybe Text -- ^ 
  , ruleResponseRuleTypeDescription :: Maybe Text -- ^ 
  , ruleResponseRuleValueType :: Maybe Text -- ^ 
  , ruleResponseRuleValue :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON RuleResponse where
  parseJSON = genericParseJSON optionsRuleResponse
instance ToJSON RuleResponse where
  toJSON = genericToJSON optionsRuleResponse

optionsRuleResponse :: Options
optionsRuleResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("ruleResponseRuleId", "ruleId")
      , ("ruleResponseTitle", "title")
      , ("ruleResponseDescription", "description")
      , ("ruleResponseRuleTypeId", "ruleTypeId")
      , ("ruleResponseRuleTypeTitle", "ruleTypeTitle")
      , ("ruleResponseRuleTypeDescription", "ruleTypeDescription")
      , ("ruleResponseRuleValueType", "ruleValueType")
      , ("ruleResponseRuleValue", "ruleValue")
      ]


-- | 
data ScheduledNotification = ScheduledNotification
  { scheduledNotificationId :: Maybe Integer -- ^ 
  , scheduledNotificationActive :: Maybe Bool -- ^ 
  , scheduledNotificationValid :: Maybe Bool -- ^ 
  , scheduledNotificationOwner :: Maybe Account -- ^ 
  , scheduledNotificationBillableEntity :: Maybe BillableEntity -- ^ 
  , scheduledNotificationType :: Maybe Text -- ^ 
  , scheduledNotificationStatus :: Maybe Text -- ^ 
  , scheduledNotificationTemplateType :: Maybe Text -- ^ 
  , scheduledNotificationName :: Maybe Text -- ^ 
  , scheduledNotificationErrorMessage :: Maybe Text -- ^ 
  , scheduledNotificationMessage :: Maybe Text -- ^ 
  , scheduledNotificationPayload :: Maybe Text -- ^ 
  , scheduledNotificationContentName :: Maybe Text -- ^ 
  , scheduledNotificationContentId :: Maybe Integer -- ^ 
  , scheduledNotificationContentType :: Maybe Text -- ^ 
  , scheduledNotificationParentId :: Maybe Integer -- ^ 
  , scheduledNotificationParentType :: Maybe Text -- ^ 
  , scheduledNotificationApplication :: Maybe Application -- ^ 
  , scheduledNotificationConnectionGroups :: Maybe [ConnectionGroup] -- ^ 
  , scheduledNotificationAccountIds :: Maybe [Integer] -- ^ 
  , scheduledNotificationAudiences :: Maybe [Audience] -- ^ 
  , scheduledNotificationReport :: Maybe ReportDefinition -- ^ 
  , scheduledNotificationReportParams :: Maybe Text -- ^ 
  , scheduledNotificationEndpointURL :: Maybe Text -- ^ 
  , scheduledNotificationLastActionDate :: Maybe UTCTime -- ^ 
  , scheduledNotificationScheduledDate :: Maybe UTCTime -- ^ 
  , scheduledNotificationStartDate :: Maybe UTCTime -- ^ 
  , scheduledNotificationEndDate :: Maybe UTCTime -- ^ 
  , scheduledNotificationCronExpression :: Maybe Text -- ^ 
  , scheduledNotificationDeliverEstimate :: Maybe Integer -- ^ 
  , scheduledNotificationDeliverCount :: Maybe Integer -- ^ 
  , scheduledNotificationDeliverFailed :: Maybe Integer -- ^ 
  , scheduledNotificationDeliverTotal :: Maybe Integer -- ^ 
  , scheduledNotificationDeliverStart :: Maybe Integer -- ^ 
  , scheduledNotificationDeliverLimit :: Maybe Integer -- ^ 
  , scheduledNotificationProcessingTime :: Maybe Integer -- ^ 
  , scheduledNotificationSendingTime :: Maybe Integer -- ^ 
  , scheduledNotificationGroupingId :: Maybe Text -- ^ 
  , scheduledNotificationConditionalInput :: Maybe Text -- ^ 
  , scheduledNotificationConditionalCode :: Maybe Text -- ^ 
  , scheduledNotificationPublicPermissions :: Maybe Permissions -- ^ 
  , scheduledNotificationUserPermissions :: Maybe [UserPermissions] -- ^ 
  , scheduledNotificationVisibility :: Maybe Text -- ^ 
  , scheduledNotificationApprovalStatus :: Maybe Text -- ^ 
  , scheduledNotificationContentAsset :: Maybe Asset -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ScheduledNotification where
  parseJSON = genericParseJSON optionsScheduledNotification
instance ToJSON ScheduledNotification where
  toJSON = genericToJSON optionsScheduledNotification

optionsScheduledNotification :: Options
optionsScheduledNotification =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("scheduledNotificationId", "id")
      , ("scheduledNotificationActive", "active")
      , ("scheduledNotificationValid", "valid")
      , ("scheduledNotificationOwner", "owner")
      , ("scheduledNotificationBillableEntity", "billableEntity")
      , ("scheduledNotificationType", "type")
      , ("scheduledNotificationStatus", "status")
      , ("scheduledNotificationTemplateType", "templateType")
      , ("scheduledNotificationName", "name")
      , ("scheduledNotificationErrorMessage", "errorMessage")
      , ("scheduledNotificationMessage", "message")
      , ("scheduledNotificationPayload", "payload")
      , ("scheduledNotificationContentName", "contentName")
      , ("scheduledNotificationContentId", "contentId")
      , ("scheduledNotificationContentType", "contentType")
      , ("scheduledNotificationParentId", "parentId")
      , ("scheduledNotificationParentType", "parentType")
      , ("scheduledNotificationApplication", "application")
      , ("scheduledNotificationConnectionGroups", "connectionGroups")
      , ("scheduledNotificationAccountIds", "accountIds")
      , ("scheduledNotificationAudiences", "audiences")
      , ("scheduledNotificationReport", "report")
      , ("scheduledNotificationReportParams", "reportParams")
      , ("scheduledNotificationEndpointURL", "endpointURL")
      , ("scheduledNotificationLastActionDate", "lastActionDate")
      , ("scheduledNotificationScheduledDate", "scheduledDate")
      , ("scheduledNotificationStartDate", "startDate")
      , ("scheduledNotificationEndDate", "endDate")
      , ("scheduledNotificationCronExpression", "cronExpression")
      , ("scheduledNotificationDeliverEstimate", "deliverEstimate")
      , ("scheduledNotificationDeliverCount", "deliverCount")
      , ("scheduledNotificationDeliverFailed", "deliverFailed")
      , ("scheduledNotificationDeliverTotal", "deliverTotal")
      , ("scheduledNotificationDeliverStart", "deliverStart")
      , ("scheduledNotificationDeliverLimit", "deliverLimit")
      , ("scheduledNotificationProcessingTime", "processingTime")
      , ("scheduledNotificationSendingTime", "sendingTime")
      , ("scheduledNotificationGroupingId", "groupingId")
      , ("scheduledNotificationConditionalInput", "conditionalInput")
      , ("scheduledNotificationConditionalCode", "conditionalCode")
      , ("scheduledNotificationPublicPermissions", "publicPermissions")
      , ("scheduledNotificationUserPermissions", "userPermissions")
      , ("scheduledNotificationVisibility", "visibility")
      , ("scheduledNotificationApprovalStatus", "approvalStatus")
      , ("scheduledNotificationContentAsset", "contentAsset")
      ]


-- | 
data ScheduledNotificationFullResponse = ScheduledNotificationFullResponse
  { scheduledNotificationFullResponseScheduledNotificationId :: Maybe Integer -- ^ 
  , scheduledNotificationFullResponseActive :: Maybe Bool -- ^ 
  , scheduledNotificationFullResponseStatus :: Maybe Text -- ^ 
  , scheduledNotificationFullResponseType :: Maybe Text -- ^ 
  , scheduledNotificationFullResponseName :: Maybe Text -- ^ 
  , scheduledNotificationFullResponseMessage :: Maybe Text -- ^ 
  , scheduledNotificationFullResponseGroupingId :: Maybe Text -- ^ 
  , scheduledNotificationFullResponseScheduledDate :: Maybe Integer -- ^ 
  , scheduledNotificationFullResponseStartDate :: Maybe Integer -- ^ 
  , scheduledNotificationFullResponseEndDate :: Maybe Integer -- ^ 
  , scheduledNotificationFullResponseOwner :: Maybe AccountShortResponse -- ^ 
  , scheduledNotificationFullResponseBillableEntity :: Maybe BillableEntityShortResponse -- ^ 
  , scheduledNotificationFullResponseContentId :: Maybe Integer -- ^ 
  , scheduledNotificationFullResponseContentName :: Maybe Text -- ^ 
  , scheduledNotificationFullResponseContentType :: Maybe Text -- ^ 
  , scheduledNotificationFullResponseParentId :: Maybe Integer -- ^ 
  , scheduledNotificationFullResponseParentType :: Maybe Text -- ^ 
  , scheduledNotificationFullResponseApplication :: Maybe ApplicationMiniResponse -- ^ 
  , scheduledNotificationFullResponseTargetId :: Maybe Integer -- ^ 
  , scheduledNotificationFullResponseTargetName :: Maybe Text -- ^ 
  , scheduledNotificationFullResponseTargetType :: Maybe Text -- ^ 
  , scheduledNotificationFullResponseTargetParams :: Maybe Text -- ^ 
  , scheduledNotificationFullResponseDeliverEstimate :: Maybe Integer -- ^ 
  , scheduledNotificationFullResponseDeliverCount :: Maybe Integer -- ^ 
  , scheduledNotificationFullResponseDeliverTotal :: Maybe Integer -- ^ 
  , scheduledNotificationFullResponseDeliverFailed :: Maybe Integer -- ^ 
  , scheduledNotificationFullResponseProcessingTime :: Maybe Integer -- ^ 
  , scheduledNotificationFullResponseSendingTime :: Maybe Integer -- ^ 
  , scheduledNotificationFullResponseUpdated :: Maybe Integer -- ^ 
  , scheduledNotificationFullResponseCreated :: Maybe Integer -- ^ 
  , scheduledNotificationFullResponseCronExpression :: Maybe Text -- ^ 
  , scheduledNotificationFullResponseEndpointURL :: Maybe Text -- ^ 
  , scheduledNotificationFullResponsePayload :: Maybe Text -- ^ 
  , scheduledNotificationFullResponseConditionalInput :: Maybe Text -- ^ 
  , scheduledNotificationFullResponseConnectionAccountIds :: Maybe [Integer] -- ^ 
  , scheduledNotificationFullResponseTemplateType :: Maybe Text -- ^ 
  , scheduledNotificationFullResponseGroupedTypes :: Maybe [Text] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ScheduledNotificationFullResponse where
  parseJSON = genericParseJSON optionsScheduledNotificationFullResponse
instance ToJSON ScheduledNotificationFullResponse where
  toJSON = genericToJSON optionsScheduledNotificationFullResponse

optionsScheduledNotificationFullResponse :: Options
optionsScheduledNotificationFullResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("scheduledNotificationFullResponseScheduledNotificationId", "scheduledNotificationId")
      , ("scheduledNotificationFullResponseActive", "active")
      , ("scheduledNotificationFullResponseStatus", "status")
      , ("scheduledNotificationFullResponseType", "type")
      , ("scheduledNotificationFullResponseName", "name")
      , ("scheduledNotificationFullResponseMessage", "message")
      , ("scheduledNotificationFullResponseGroupingId", "groupingId")
      , ("scheduledNotificationFullResponseScheduledDate", "scheduledDate")
      , ("scheduledNotificationFullResponseStartDate", "startDate")
      , ("scheduledNotificationFullResponseEndDate", "endDate")
      , ("scheduledNotificationFullResponseOwner", "owner")
      , ("scheduledNotificationFullResponseBillableEntity", "billableEntity")
      , ("scheduledNotificationFullResponseContentId", "contentId")
      , ("scheduledNotificationFullResponseContentName", "contentName")
      , ("scheduledNotificationFullResponseContentType", "contentType")
      , ("scheduledNotificationFullResponseParentId", "parentId")
      , ("scheduledNotificationFullResponseParentType", "parentType")
      , ("scheduledNotificationFullResponseApplication", "application")
      , ("scheduledNotificationFullResponseTargetId", "targetId")
      , ("scheduledNotificationFullResponseTargetName", "targetName")
      , ("scheduledNotificationFullResponseTargetType", "targetType")
      , ("scheduledNotificationFullResponseTargetParams", "targetParams")
      , ("scheduledNotificationFullResponseDeliverEstimate", "deliverEstimate")
      , ("scheduledNotificationFullResponseDeliverCount", "deliverCount")
      , ("scheduledNotificationFullResponseDeliverTotal", "deliverTotal")
      , ("scheduledNotificationFullResponseDeliverFailed", "deliverFailed")
      , ("scheduledNotificationFullResponseProcessingTime", "processingTime")
      , ("scheduledNotificationFullResponseSendingTime", "sendingTime")
      , ("scheduledNotificationFullResponseUpdated", "updated")
      , ("scheduledNotificationFullResponseCreated", "created")
      , ("scheduledNotificationFullResponseCronExpression", "cronExpression")
      , ("scheduledNotificationFullResponseEndpointURL", "endpointURL")
      , ("scheduledNotificationFullResponsePayload", "payload")
      , ("scheduledNotificationFullResponseConditionalInput", "conditionalInput")
      , ("scheduledNotificationFullResponseConnectionAccountIds", "connectionAccountIds")
      , ("scheduledNotificationFullResponseTemplateType", "templateType")
      , ("scheduledNotificationFullResponseGroupedTypes", "groupedTypes")
      ]


-- | 
data ScheduledNotificationShortResponse = ScheduledNotificationShortResponse
  { scheduledNotificationShortResponseScheduledNotificationId :: Maybe Integer -- ^ 
  , scheduledNotificationShortResponseActive :: Maybe Bool -- ^ 
  , scheduledNotificationShortResponseStatus :: Maybe Text -- ^ 
  , scheduledNotificationShortResponseType :: Maybe Text -- ^ 
  , scheduledNotificationShortResponseName :: Maybe Text -- ^ 
  , scheduledNotificationShortResponseMessage :: Maybe Text -- ^ 
  , scheduledNotificationShortResponseGroupingId :: Maybe Text -- ^ 
  , scheduledNotificationShortResponseScheduledDate :: Maybe Integer -- ^ 
  , scheduledNotificationShortResponseStartDate :: Maybe Integer -- ^ 
  , scheduledNotificationShortResponseEndDate :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ScheduledNotificationShortResponse where
  parseJSON = genericParseJSON optionsScheduledNotificationShortResponse
instance ToJSON ScheduledNotificationShortResponse where
  toJSON = genericToJSON optionsScheduledNotificationShortResponse

optionsScheduledNotificationShortResponse :: Options
optionsScheduledNotificationShortResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("scheduledNotificationShortResponseScheduledNotificationId", "scheduledNotificationId")
      , ("scheduledNotificationShortResponseActive", "active")
      , ("scheduledNotificationShortResponseStatus", "status")
      , ("scheduledNotificationShortResponseType", "type")
      , ("scheduledNotificationShortResponseName", "name")
      , ("scheduledNotificationShortResponseMessage", "message")
      , ("scheduledNotificationShortResponseGroupingId", "groupingId")
      , ("scheduledNotificationShortResponseScheduledDate", "scheduledDate")
      , ("scheduledNotificationShortResponseStartDate", "startDate")
      , ("scheduledNotificationShortResponseEndDate", "endDate")
      ]


-- | 
data ScoreListResponse = ScoreListResponse
  { scoreListResponseStart :: Maybe Int -- ^ 
  , scoreListResponseLimit :: Maybe Int -- ^ 
  , scoreListResponseCountTotal :: Maybe Integer -- ^ 
  , scoreListResponseItems :: Maybe [ScoreResponse] -- ^ 
  , scoreListResponseCount :: Maybe Int -- ^ 
  , scoreListResponseHasMoreResults :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ScoreListResponse where
  parseJSON = genericParseJSON optionsScoreListResponse
instance ToJSON ScoreListResponse where
  toJSON = genericToJSON optionsScoreListResponse

optionsScoreListResponse :: Options
optionsScoreListResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("scoreListResponseStart", "start")
      , ("scoreListResponseLimit", "limit")
      , ("scoreListResponseCountTotal", "countTotal")
      , ("scoreListResponseItems", "items")
      , ("scoreListResponseCount", "count")
      , ("scoreListResponseHasMoreResults", "hasMoreResults")
      ]


-- | 
data ScoreResponse = ScoreResponse
  { scoreResponseAction :: Maybe Text -- ^ 
  , scoreResponseScoreId :: Maybe Integer -- ^ 
  , scoreResponseStatus :: Maybe Text -- ^ 
  , scoreResponsePoints :: Maybe Int -- ^ 
  , scoreResponseTimeTaken :: Maybe Int -- ^ 
  , scoreResponseTicketsEarned :: Maybe Integer -- ^ 
  , scoreResponseGameType :: Maybe Text -- ^ 
  , scoreResponseAccountId :: Maybe Integer -- ^ 
  , scoreResponseAccountDisplay :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ScoreResponse where
  parseJSON = genericParseJSON optionsScoreResponse
instance ToJSON ScoreResponse where
  toJSON = genericToJSON optionsScoreResponse

optionsScoreResponse :: Options
optionsScoreResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("scoreResponseAction", "action")
      , ("scoreResponseScoreId", "scoreId")
      , ("scoreResponseStatus", "status")
      , ("scoreResponsePoints", "points")
      , ("scoreResponseTimeTaken", "timeTaken")
      , ("scoreResponseTicketsEarned", "ticketsEarned")
      , ("scoreResponseGameType", "gameType")
      , ("scoreResponseAccountId", "accountId")
      , ("scoreResponseAccountDisplay", "accountDisplay")
      ]


-- | 
data SearchResponse = SearchResponse
  { searchResponseValid :: Maybe Bool -- ^ 
  , searchResponseMessage :: Maybe Text -- ^ 
  , searchResponseVersion :: Maybe Double -- ^ 
  , searchResponseSerializeNulls :: Maybe Bool -- ^ 
  , searchResponseStartTimeLog :: Maybe Integer -- ^ 
  , searchResponseErrorCode :: Maybe Text -- ^ 
  , searchResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , searchResponseItems :: Maybe [Value] -- ^ 
  , searchResponseCount :: Maybe Int -- ^ 
  , searchResponseHasMoreResults :: Maybe Bool -- ^ 
  , searchResponseCountTotal :: Maybe Integer -- ^ 
  , searchResponseStart :: Maybe Integer -- ^ 
  , searchResponseLimit :: Maybe Integer -- ^ 
  , searchResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON SearchResponse where
  parseJSON = genericParseJSON optionsSearchResponse
instance ToJSON SearchResponse where
  toJSON = genericToJSON optionsSearchResponse

optionsSearchResponse :: Options
optionsSearchResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("searchResponseValid", "valid")
      , ("searchResponseMessage", "message")
      , ("searchResponseVersion", "version")
      , ("searchResponseSerializeNulls", "serializeNulls")
      , ("searchResponseStartTimeLog", "startTimeLog")
      , ("searchResponseErrorCode", "errorCode")
      , ("searchResponseRequest", "request")
      , ("searchResponseItems", "items")
      , ("searchResponseCount", "count")
      , ("searchResponseHasMoreResults", "hasMoreResults")
      , ("searchResponseCountTotal", "countTotal")
      , ("searchResponseStart", "start")
      , ("searchResponseLimit", "limit")
      , ("searchResponseReturning", "returning")
      ]


-- | 
data ServiceHub = ServiceHub
  { serviceHubId :: Maybe Integer -- ^ 
  , serviceHubActive :: Maybe Bool -- ^ 
  , serviceHubValid :: Maybe Bool -- ^ 
  , serviceHubLatitude :: Maybe Double -- ^ 
  , serviceHubLongitude :: Maybe Double -- ^ 
  , serviceHubLocationDescription :: Maybe Text -- ^ 
  , serviceHubName :: Maybe Text -- ^ 
  , serviceHubExternalId :: Maybe Text -- ^ 
  , serviceHubBusiness :: Maybe Retailer -- ^ 
  , serviceHubLocation :: Maybe Location -- ^ 
  , serviceHubTimeZone :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ServiceHub where
  parseJSON = genericParseJSON optionsServiceHub
instance ToJSON ServiceHub where
  toJSON = genericToJSON optionsServiceHub

optionsServiceHub :: Options
optionsServiceHub =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("serviceHubId", "id")
      , ("serviceHubActive", "active")
      , ("serviceHubValid", "valid")
      , ("serviceHubLatitude", "latitude")
      , ("serviceHubLongitude", "longitude")
      , ("serviceHubLocationDescription", "locationDescription")
      , ("serviceHubName", "name")
      , ("serviceHubExternalId", "externalId")
      , ("serviceHubBusiness", "business")
      , ("serviceHubLocation", "location")
      , ("serviceHubTimeZone", "timeZone")
      ]


-- | 
data ServiceType = ServiceType
  { serviceTypeId :: Maybe Integer -- ^ 
  , serviceTypeActive :: Maybe Bool -- ^ 
  , serviceTypeValid :: Maybe Bool -- ^ 
  , serviceTypeBusiness :: Maybe Retailer -- ^ 
  , serviceTypeHub :: Maybe ServiceHub -- ^ 
  , serviceTypeName :: Maybe Text -- ^ 
  , serviceTypeAdditionalLoadTime :: Maybe Integer -- ^ 
  , serviceTypePickupAddressOverride :: Maybe Address -- ^ 
  , serviceTypeDropoffAddressOverride :: Maybe Address -- ^ 
  , serviceTypePickupStartTimeOverride :: Maybe LocalTime -- ^ 
  , serviceTypePickupEndTimeOverride :: Maybe LocalTime -- ^ 
  , serviceTypeDropoffStartTimeOverride :: Maybe LocalTime -- ^ 
  , serviceTypeDropoffEndTimeOverride :: Maybe LocalTime -- ^ 
  , serviceTypeDateOverride :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ServiceType where
  parseJSON = genericParseJSON optionsServiceType
instance ToJSON ServiceType where
  toJSON = genericToJSON optionsServiceType

optionsServiceType :: Options
optionsServiceType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("serviceTypeId", "id")
      , ("serviceTypeActive", "active")
      , ("serviceTypeValid", "valid")
      , ("serviceTypeBusiness", "business")
      , ("serviceTypeHub", "hub")
      , ("serviceTypeName", "name")
      , ("serviceTypeAdditionalLoadTime", "additionalLoadTime")
      , ("serviceTypePickupAddressOverride", "pickupAddressOverride")
      , ("serviceTypeDropoffAddressOverride", "dropoffAddressOverride")
      , ("serviceTypePickupStartTimeOverride", "pickupStartTimeOverride")
      , ("serviceTypePickupEndTimeOverride", "pickupEndTimeOverride")
      , ("serviceTypeDropoffStartTimeOverride", "dropoffStartTimeOverride")
      , ("serviceTypeDropoffEndTimeOverride", "dropoffEndTimeOverride")
      , ("serviceTypeDateOverride", "dateOverride")
      ]


-- | 
data Shipment = Shipment
  { shipmentId :: Maybe Integer -- ^ 
  , shipmentActive :: Maybe Bool -- ^ 
  , shipmentValid :: Maybe Bool -- ^ 
  , shipmentName :: Maybe Text -- ^ 
  , shipmentOwner :: Maybe Account -- ^ 
  , shipmentRider :: Maybe Account -- ^ 
  , shipmentPickupStop :: Maybe Stop -- ^ 
  , shipmentDropOffStop :: Maybe Stop -- ^ 
  , shipmentNotes :: Maybe [Note] -- ^ 
  , shipmentNoteCount :: Maybe Integer -- ^ 
  , shipmentBatchId :: Maybe Text -- ^ 
  , shipmentReserved :: Maybe UTCTime -- ^ 
  , shipmentCanceled :: Maybe UTCTime -- ^ 
  , shipmentConfirmed :: Maybe UTCTime -- ^ 
  , shipmentRoute :: Maybe Route -- ^ 
  , shipmentPolyline :: Maybe Text -- ^ 
  , shipmentReplacePassenger :: Maybe Shipment -- ^ 
  , shipmentRefunded :: Maybe Bool -- ^ 
  , shipmentPromoCode :: Maybe PromoCode -- ^ 
  , shipmentQuantity :: Maybe Int -- ^ 
  , shipmentPickupTimeWindow :: Maybe DateTimeRange -- ^ 
  , shipmentDropOffTimeWindow :: Maybe DateTimeRange -- ^ 
  , shipmentCargoType :: Maybe CargoType -- ^ 
  , shipmentServiceType :: Maybe ServiceType -- ^ 
  , shipmentRouteId :: Maybe Integer -- ^ 
  , shipmentTotalVolume :: Maybe Double -- ^ 
  , shipmentComplete :: Maybe Bool -- ^ 
  , shipmentContentName :: Maybe Text -- ^ 
  , shipmentRiderName :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Shipment where
  parseJSON = genericParseJSON optionsShipment
instance ToJSON Shipment where
  toJSON = genericToJSON optionsShipment

optionsShipment :: Options
optionsShipment =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("shipmentId", "id")
      , ("shipmentActive", "active")
      , ("shipmentValid", "valid")
      , ("shipmentName", "name")
      , ("shipmentOwner", "owner")
      , ("shipmentRider", "rider")
      , ("shipmentPickupStop", "pickupStop")
      , ("shipmentDropOffStop", "dropOffStop")
      , ("shipmentNotes", "notes")
      , ("shipmentNoteCount", "noteCount")
      , ("shipmentBatchId", "batchId")
      , ("shipmentReserved", "reserved")
      , ("shipmentCanceled", "canceled")
      , ("shipmentConfirmed", "confirmed")
      , ("shipmentRoute", "route")
      , ("shipmentPolyline", "polyline")
      , ("shipmentReplacePassenger", "replacePassenger")
      , ("shipmentRefunded", "refunded")
      , ("shipmentPromoCode", "promoCode")
      , ("shipmentQuantity", "quantity")
      , ("shipmentPickupTimeWindow", "pickupTimeWindow")
      , ("shipmentDropOffTimeWindow", "dropOffTimeWindow")
      , ("shipmentCargoType", "cargoType")
      , ("shipmentServiceType", "serviceType")
      , ("shipmentRouteId", "routeId")
      , ("shipmentTotalVolume", "totalVolume")
      , ("shipmentComplete", "complete")
      , ("shipmentContentName", "contentName")
      , ("shipmentRiderName", "riderName")
      ]


-- | 
data ShipmentBatch = ShipmentBatch
  { shipmentBatchId :: Maybe Integer -- ^ 
  , shipmentBatchCreated :: Maybe UTCTime -- ^ 
  , shipmentBatchUpdated :: Maybe UTCTime -- ^ 
  , shipmentBatchActive :: Maybe Bool -- ^ 
  , shipmentBatchValid :: Maybe Bool -- ^ 
  , shipmentBatchRetailer :: Maybe Retailer -- ^ 
  , shipmentBatchHub :: Maybe ServiceHub -- ^ 
  , shipmentBatchProgram :: Maybe Program -- ^ 
  , shipmentBatchShipmentImportStatuses :: Maybe [ShipmentImportStatus] -- ^ 
  , shipmentBatchShipments :: Maybe [Shipment] -- ^ 
  , shipmentBatchUploaded :: Maybe UTCTime -- ^ 
  , shipmentBatchStarted :: Maybe UTCTime -- ^ 
  , shipmentBatchOptimizationStarted :: Maybe UTCTime -- ^ 
  , shipmentBatchCompleted :: Maybe UTCTime -- ^ 
  , shipmentBatchOptimizationCompleted :: Maybe UTCTime -- ^ 
  , shipmentBatchSource :: Maybe Text -- ^ 
  , shipmentBatchExternalId :: Maybe Text -- ^ 
  , shipmentBatchTotal :: Maybe Int -- ^ 
  , shipmentBatchProcessedCount :: Maybe Int -- ^ 
  , shipmentBatchSuccessCount :: Maybe Int -- ^ 
  , shipmentBatchFailedCount :: Maybe Int -- ^ 
  , shipmentBatchValidCount :: Maybe Int -- ^ 
  , shipmentBatchInvalidCount :: Maybe Int -- ^ 
  , shipmentBatchAverageTravelSpeed :: Maybe Double -- ^ 
  , shipmentBatchMaxSeconds :: Maybe Integer -- ^ 
  , shipmentBatchImportStatus :: Maybe Text -- ^ 
  , shipmentBatchTotalRoutes :: Maybe Int -- ^ 
  , shipmentBatchRoutesCreated :: Maybe Int -- ^ 
  , shipmentBatchTotalLegsRequests :: Maybe Int -- ^ 
  , shipmentBatchLegsRequested :: Maybe Int -- ^ 
  , shipmentBatchInitScore :: Maybe Int -- ^ 
  , shipmentBatchHardScore :: Maybe Integer -- ^ 
  , shipmentBatchMediumScore :: Maybe Integer -- ^ 
  , shipmentBatchSoftScore :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ShipmentBatch where
  parseJSON = genericParseJSON optionsShipmentBatch
instance ToJSON ShipmentBatch where
  toJSON = genericToJSON optionsShipmentBatch

optionsShipmentBatch :: Options
optionsShipmentBatch =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("shipmentBatchId", "id")
      , ("shipmentBatchCreated", "created")
      , ("shipmentBatchUpdated", "updated")
      , ("shipmentBatchActive", "active")
      , ("shipmentBatchValid", "valid")
      , ("shipmentBatchRetailer", "retailer")
      , ("shipmentBatchHub", "hub")
      , ("shipmentBatchProgram", "program")
      , ("shipmentBatchShipmentImportStatuses", "shipmentImportStatuses")
      , ("shipmentBatchShipments", "shipments")
      , ("shipmentBatchUploaded", "uploaded")
      , ("shipmentBatchStarted", "started")
      , ("shipmentBatchOptimizationStarted", "optimizationStarted")
      , ("shipmentBatchCompleted", "completed")
      , ("shipmentBatchOptimizationCompleted", "optimizationCompleted")
      , ("shipmentBatchSource", "source")
      , ("shipmentBatchExternalId", "externalId")
      , ("shipmentBatchTotal", "total")
      , ("shipmentBatchProcessedCount", "processedCount")
      , ("shipmentBatchSuccessCount", "successCount")
      , ("shipmentBatchFailedCount", "failedCount")
      , ("shipmentBatchValidCount", "validCount")
      , ("shipmentBatchInvalidCount", "invalidCount")
      , ("shipmentBatchAverageTravelSpeed", "averageTravelSpeed")
      , ("shipmentBatchMaxSeconds", "maxSeconds")
      , ("shipmentBatchImportStatus", "importStatus")
      , ("shipmentBatchTotalRoutes", "totalRoutes")
      , ("shipmentBatchRoutesCreated", "routesCreated")
      , ("shipmentBatchTotalLegsRequests", "totalLegsRequests")
      , ("shipmentBatchLegsRequested", "legsRequested")
      , ("shipmentBatchInitScore", "initScore")
      , ("shipmentBatchHardScore", "hardScore")
      , ("shipmentBatchMediumScore", "mediumScore")
      , ("shipmentBatchSoftScore", "softScore")
      ]


-- | 
data ShipmentImportStatus = ShipmentImportStatus
  { shipmentImportStatusId :: Maybe Integer -- ^ 
  , shipmentImportStatusActive :: Maybe Bool -- ^ 
  , shipmentImportStatusValid :: Maybe Bool -- ^ 
  , shipmentImportStatusName :: Maybe Text -- ^ 
  , shipmentImportStatusBatchId :: Maybe Text -- ^ 
  , shipmentImportStatusMessage :: Maybe Text -- ^ 
  , shipmentImportStatusShipment :: Maybe Shipment -- ^ 
  , shipmentImportStatusStarted :: Maybe UTCTime -- ^ 
  , shipmentImportStatusCompleted :: Maybe UTCTime -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ShipmentImportStatus where
  parseJSON = genericParseJSON optionsShipmentImportStatus
instance ToJSON ShipmentImportStatus where
  toJSON = genericToJSON optionsShipmentImportStatus

optionsShipmentImportStatus :: Options
optionsShipmentImportStatus =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("shipmentImportStatusId", "id")
      , ("shipmentImportStatusActive", "active")
      , ("shipmentImportStatusValid", "valid")
      , ("shipmentImportStatusName", "name")
      , ("shipmentImportStatusBatchId", "batchId")
      , ("shipmentImportStatusMessage", "message")
      , ("shipmentImportStatusShipment", "shipment")
      , ("shipmentImportStatusStarted", "started")
      , ("shipmentImportStatusCompleted", "completed")
      ]


-- | 
data ShipmentOrder = ShipmentOrder
  { shipmentOrderValid :: Maybe Bool -- ^ 
  , shipmentOrderBatchID :: Maybe Int -- ^ 
  , shipmentOrderBatchSize :: Maybe Int -- ^ 
  , shipmentOrderOrderTrackingID :: Maybe Double -- ^ 
  , shipmentOrderClientRefNo :: Maybe Text -- ^ 
  , shipmentOrderClientRefNo2 :: Maybe Text -- ^ 
  , shipmentOrderHubCode :: Maybe Text -- ^ 
  , shipmentOrderAccountNo :: Maybe Text -- ^ 
  , shipmentOrderCompanyName :: Maybe Text -- ^ 
  , shipmentOrderVehicleTypeName :: Maybe Text -- ^ 
  , shipmentOrderServiceTypeName :: Maybe Text -- ^ 
  , shipmentOrderServiceCode :: Maybe Text -- ^ 
  , shipmentOrderPieces :: Maybe Int -- ^ 
  , shipmentOrderWeight :: Maybe Double -- ^ 
  , shipmentOrderCubicFeet :: Maybe Double -- ^ 
  , shipmentOrderPickupCompany :: Maybe Text -- ^ 
  , shipmentOrderPickupContact :: Maybe Text -- ^ 
  , shipmentOrderPickupPhone :: Maybe Text -- ^ 
  , shipmentOrderPickupStreet :: Maybe Text -- ^ 
  , shipmentOrderPickupStreet2 :: Maybe Text -- ^ 
  , shipmentOrderPickupCity :: Maybe Text -- ^ 
  , shipmentOrderPickupState :: Maybe Text -- ^ 
  , shipmentOrderPickupZip :: Maybe Text -- ^ 
  , shipmentOrderPickupTargetFrom :: Maybe UTCTime -- ^ 
  , shipmentOrderPickupTargetTo :: Maybe UTCTime -- ^ 
  , shipmentOrderDeliveryCompany :: Maybe Text -- ^ 
  , shipmentOrderDeliveryContact :: Maybe Text -- ^ 
  , shipmentOrderDeliveryPhone :: Maybe Text -- ^ 
  , shipmentOrderDeliveryStreet :: Maybe Text -- ^ 
  , shipmentOrderDeliveryStreet2 :: Maybe Text -- ^ 
  , shipmentOrderDeliveryCity :: Maybe Text -- ^ 
  , shipmentOrderDeliveryState :: Maybe Text -- ^ 
  , shipmentOrderDeliveryZip :: Maybe Text -- ^ 
  , shipmentOrderDeliveryTargetFrom :: Maybe UTCTime -- ^ 
  , shipmentOrderDeliveryTargetTo :: Maybe UTCTime -- ^ 
  , shipmentOrderOrderPackages :: Maybe [OrderPackage] -- ^ 
  , shipmentOrderRouteID :: Maybe Int -- ^ 
  , shipmentOrderDriverID :: Maybe Int -- ^ 
  , shipmentOrderPickupSequenceNo :: Maybe Int -- ^ 
  , shipmentOrderDeliverySequenceNo :: Maybe Int -- ^ 
  , shipmentOrderPickupETA :: Maybe Text -- ^ 
  , shipmentOrderDeliveryETA :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ShipmentOrder where
  parseJSON = genericParseJSON optionsShipmentOrder
instance ToJSON ShipmentOrder where
  toJSON = genericToJSON optionsShipmentOrder

optionsShipmentOrder :: Options
optionsShipmentOrder =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("shipmentOrderValid", "valid")
      , ("shipmentOrderBatchID", "BatchID")
      , ("shipmentOrderBatchSize", "BatchSize")
      , ("shipmentOrderOrderTrackingID", "OrderTrackingID")
      , ("shipmentOrderClientRefNo", "ClientRefNo")
      , ("shipmentOrderClientRefNo2", "ClientRefNo2")
      , ("shipmentOrderHubCode", "HubCode")
      , ("shipmentOrderAccountNo", "AccountNo")
      , ("shipmentOrderCompanyName", "CompanyName")
      , ("shipmentOrderVehicleTypeName", "VehicleTypeName")
      , ("shipmentOrderServiceTypeName", "ServiceTypeName")
      , ("shipmentOrderServiceCode", "ServiceCode")
      , ("shipmentOrderPieces", "Pieces")
      , ("shipmentOrderWeight", "Weight")
      , ("shipmentOrderCubicFeet", "CubicFeet")
      , ("shipmentOrderPickupCompany", "PickupCompany")
      , ("shipmentOrderPickupContact", "PickupContact")
      , ("shipmentOrderPickupPhone", "PickupPhone")
      , ("shipmentOrderPickupStreet", "PickupStreet")
      , ("shipmentOrderPickupStreet2", "PickupStreet2")
      , ("shipmentOrderPickupCity", "PickupCity")
      , ("shipmentOrderPickupState", "PickupState")
      , ("shipmentOrderPickupZip", "PickupZip")
      , ("shipmentOrderPickupTargetFrom", "PickupTargetFrom")
      , ("shipmentOrderPickupTargetTo", "PickupTargetTo")
      , ("shipmentOrderDeliveryCompany", "DeliveryCompany")
      , ("shipmentOrderDeliveryContact", "DeliveryContact")
      , ("shipmentOrderDeliveryPhone", "DeliveryPhone")
      , ("shipmentOrderDeliveryStreet", "DeliveryStreet")
      , ("shipmentOrderDeliveryStreet2", "DeliveryStreet2")
      , ("shipmentOrderDeliveryCity", "DeliveryCity")
      , ("shipmentOrderDeliveryState", "DeliveryState")
      , ("shipmentOrderDeliveryZip", "DeliveryZip")
      , ("shipmentOrderDeliveryTargetFrom", "DeliveryTargetFrom")
      , ("shipmentOrderDeliveryTargetTo", "DeliveryTargetTo")
      , ("shipmentOrderOrderPackages", "OrderPackages")
      , ("shipmentOrderRouteID", "RouteID")
      , ("shipmentOrderDriverID", "DriverID")
      , ("shipmentOrderPickupSequenceNo", "PickupSequenceNo")
      , ("shipmentOrderDeliverySequenceNo", "DeliverySequenceNo")
      , ("shipmentOrderPickupETA", "PickupETA")
      , ("shipmentOrderDeliveryETA", "DeliveryETA")
      ]


-- | 
data SirqulResponse = SirqulResponse
  { sirqulResponseValid :: Maybe Bool -- ^ 
  , sirqulResponseMessage :: Maybe Text -- ^ 
  , sirqulResponseVersion :: Maybe Double -- ^ 
  , sirqulResponseSerializeNulls :: Maybe Bool -- ^ 
  , sirqulResponseStartTimeLog :: Maybe Integer -- ^ 
  , sirqulResponseErrorCode :: Maybe Text -- ^ 
  , sirqulResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , sirqulResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON SirqulResponse where
  parseJSON = genericParseJSON optionsSirqulResponse
instance ToJSON SirqulResponse where
  toJSON = genericToJSON optionsSirqulResponse

optionsSirqulResponse :: Options
optionsSirqulResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("sirqulResponseValid", "valid")
      , ("sirqulResponseMessage", "message")
      , ("sirqulResponseVersion", "version")
      , ("sirqulResponseSerializeNulls", "serializeNulls")
      , ("sirqulResponseStartTimeLog", "startTimeLog")
      , ("sirqulResponseErrorCode", "errorCode")
      , ("sirqulResponseRequest", "request")
      , ("sirqulResponseReturning", "returning")
      ]


-- | 
data SizeGroup = SizeGroup
  { sizeGroupId :: Maybe Integer -- ^ 
  , sizeGroupActive :: Maybe Bool -- ^ 
  , sizeGroupValid :: Maybe Bool -- ^ 
  , sizeGroupGroupingId :: Maybe Integer -- ^ 
  , sizeGroupName :: Maybe Text -- ^ 
  , sizeGroupDescription :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON SizeGroup where
  parseJSON = genericParseJSON optionsSizeGroup
instance ToJSON SizeGroup where
  toJSON = genericToJSON optionsSizeGroup

optionsSizeGroup :: Options
optionsSizeGroup =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("sizeGroupId", "id")
      , ("sizeGroupActive", "active")
      , ("sizeGroupValid", "valid")
      , ("sizeGroupGroupingId", "groupingId")
      , ("sizeGroupName", "name")
      , ("sizeGroupDescription", "description")
      ]


-- | 
data SizeGroupResponse = SizeGroupResponse
  { sizeGroupResponseId :: Maybe Integer -- ^ 
  , sizeGroupResponseName :: Maybe Text -- ^ 
  , sizeGroupResponseDescription :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON SizeGroupResponse where
  parseJSON = genericParseJSON optionsSizeGroupResponse
instance ToJSON SizeGroupResponse where
  toJSON = genericToJSON optionsSizeGroupResponse

optionsSizeGroupResponse :: Options
optionsSizeGroupResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("sizeGroupResponseId", "id")
      , ("sizeGroupResponseName", "name")
      , ("sizeGroupResponseDescription", "description")
      ]


-- | 
data Step = Step
  { stepId :: Maybe Integer -- ^ 
  , stepActive :: Maybe Bool -- ^ 
  , stepValid :: Maybe Bool -- ^ 
  , stepOwner :: Maybe Account -- ^ 
  , stepDeviceId :: Maybe Text -- ^ 
  , stepLeg :: Maybe Leg -- ^ 
  , stepDistance :: Maybe Double -- ^ 
  , stepDuration :: Maybe Integer -- ^ 
  , stepStartLatitude :: Maybe Double -- ^ 
  , stepStartLongitude :: Maybe Double -- ^ 
  , stepStartAltitude :: Maybe Double -- ^ 
  , stepStartDate :: Maybe UTCTime -- ^ 
  , stepEndLatitude :: Maybe Double -- ^ 
  , stepEndLongitude :: Maybe Double -- ^ 
  , stepEndAltitude :: Maybe Double -- ^ 
  , stepEndDate :: Maybe UTCTime -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Step where
  parseJSON = genericParseJSON optionsStep
instance ToJSON Step where
  toJSON = genericToJSON optionsStep

optionsStep :: Options
optionsStep =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("stepId", "id")
      , ("stepActive", "active")
      , ("stepValid", "valid")
      , ("stepOwner", "owner")
      , ("stepDeviceId", "deviceId")
      , ("stepLeg", "leg")
      , ("stepDistance", "distance")
      , ("stepDuration", "duration")
      , ("stepStartLatitude", "startLatitude")
      , ("stepStartLongitude", "startLongitude")
      , ("stepStartAltitude", "startAltitude")
      , ("stepStartDate", "startDate")
      , ("stepEndLatitude", "endLatitude")
      , ("stepEndLongitude", "endLongitude")
      , ("stepEndAltitude", "endAltitude")
      , ("stepEndDate", "endDate")
      ]


-- | 
data StepResponse = StepResponse
  { stepResponseLeg :: Maybe LegResponse -- ^ 
  , stepResponseDistance :: Maybe Double -- ^ 
  , stepResponseDuration :: Maybe Integer -- ^ 
  , stepResponseStartLat :: Maybe Double -- ^ 
  , stepResponseStartLng :: Maybe Double -- ^ 
  , stepResponseStartAlt :: Maybe Double -- ^ 
  , stepResponseStartDate :: Maybe Integer -- ^ 
  , stepResponseEndLat :: Maybe Double -- ^ 
  , stepResponseEndLng :: Maybe Double -- ^ 
  , stepResponseEndAlt :: Maybe Double -- ^ 
  , stepResponseEndDate :: Maybe Integer -- ^ 
  , stepResponseAccuracy :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON StepResponse where
  parseJSON = genericParseJSON optionsStepResponse
instance ToJSON StepResponse where
  toJSON = genericToJSON optionsStepResponse

optionsStepResponse :: Options
optionsStepResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("stepResponseLeg", "leg")
      , ("stepResponseDistance", "distance")
      , ("stepResponseDuration", "duration")
      , ("stepResponseStartLat", "startLat")
      , ("stepResponseStartLng", "startLng")
      , ("stepResponseStartAlt", "startAlt")
      , ("stepResponseStartDate", "startDate")
      , ("stepResponseEndLat", "endLat")
      , ("stepResponseEndLng", "endLng")
      , ("stepResponseEndAlt", "endAlt")
      , ("stepResponseEndDate", "endDate")
      , ("stepResponseAccuracy", "accuracy")
      ]


-- | 
data Stop = Stop
  { stopId :: Maybe Integer -- ^ 
  , stopActive :: Maybe Bool -- ^ 
  , stopValid :: Maybe Bool -- ^ 
  , stopLatitude :: Maybe Double -- ^ 
  , stopLongitude :: Maybe Double -- ^ 
  , stopLocationDescription :: Maybe Text -- ^ 
  , stopName :: Maybe Text -- ^ 
  , stopOwner :: Maybe Account -- ^ 
  , stopLocation :: Maybe Location -- ^ 
  , stopNotes :: Maybe [Note] -- ^ 
  , stopNoteCount :: Maybe Integer -- ^ 
  , stopStopType :: Maybe Text -- ^ 
  , stopOrderIndex :: Maybe Integer -- ^ 
  , stopStartTime :: Maybe UTCTime -- ^ 
  , stopEndTime :: Maybe UTCTime -- ^ 
  , stopEstimatedTime :: Maybe UTCTime -- ^ 
  , stopEstimatedArrivalTime :: Maybe UTCTime -- ^ 
  , stopEstimatedDepartureTime :: Maybe UTCTime -- ^ 
  , stopActualTime :: Maybe UTCTime -- ^ 
  , stopDesiredTime :: Maybe UTCTime -- ^ 
  , stopTimePadding :: Maybe Int -- ^ 
  , stopRoute :: Maybe Route -- ^ 
  , stopShipment :: Maybe Shipment -- ^ 
  , stopProgressStatus :: Maybe Text -- ^ 
  , stopCompareEstimatedTime :: Maybe UTCTime -- ^ 
  , stopCompareEstimatedArrivalTime :: Maybe UTCTime -- ^ 
  , stopCompareEstimiatedDepartureTime :: Maybe UTCTime -- ^ 
  , stopPolyline :: Maybe Text -- ^ 
  , stopParent :: Maybe Stop -- ^ 
  , stopLocationDisplay :: Maybe Text -- ^ 
  , stopComplete :: Maybe Bool -- ^ 
  , stopContentName :: Maybe Text -- ^ 
  , stopLocationAddress :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Stop where
  parseJSON = genericParseJSON optionsStop
instance ToJSON Stop where
  toJSON = genericToJSON optionsStop

optionsStop :: Options
optionsStop =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("stopId", "id")
      , ("stopActive", "active")
      , ("stopValid", "valid")
      , ("stopLatitude", "latitude")
      , ("stopLongitude", "longitude")
      , ("stopLocationDescription", "locationDescription")
      , ("stopName", "name")
      , ("stopOwner", "owner")
      , ("stopLocation", "location")
      , ("stopNotes", "notes")
      , ("stopNoteCount", "noteCount")
      , ("stopStopType", "stopType")
      , ("stopOrderIndex", "orderIndex")
      , ("stopStartTime", "startTime")
      , ("stopEndTime", "endTime")
      , ("stopEstimatedTime", "estimatedTime")
      , ("stopEstimatedArrivalTime", "estimatedArrivalTime")
      , ("stopEstimatedDepartureTime", "estimatedDepartureTime")
      , ("stopActualTime", "actualTime")
      , ("stopDesiredTime", "desiredTime")
      , ("stopTimePadding", "timePadding")
      , ("stopRoute", "route")
      , ("stopShipment", "shipment")
      , ("stopProgressStatus", "progressStatus")
      , ("stopCompareEstimatedTime", "compareEstimatedTime")
      , ("stopCompareEstimatedArrivalTime", "compareEstimatedArrivalTime")
      , ("stopCompareEstimiatedDepartureTime", "compareEstimiatedDepartureTime")
      , ("stopPolyline", "polyline")
      , ("stopParent", "parent")
      , ("stopLocationDisplay", "locationDisplay")
      , ("stopComplete", "complete")
      , ("stopContentName", "contentName")
      , ("stopLocationAddress", "locationAddress")
      ]


-- | 
data StopResponse = StopResponse
  { stopResponseGeoId :: Maybe Text -- ^ 
  , stopResponseLatitude :: Maybe Double -- ^ 
  , stopResponseLongitude :: Maybe Double -- ^ 
  , stopResponseStartWindow :: Maybe Integer -- ^ 
  , stopResponseEndWindow :: Maybe Integer -- ^ 
  , stopResponseType :: Maybe Text -- ^ 
  , stopResponseEta :: Maybe Integer -- ^ 
  , stopResponseEtd :: Maybe Integer -- ^ 
  , stopResponseScore :: Maybe Integer -- ^ 
  , stopResponseErrorCode :: Maybe Text -- ^ 
  , stopResponseError :: Maybe Text -- ^ 
  , stopResponseItemId :: Maybe Text -- ^ 
  , stopResponseItemSize :: Maybe Integer -- ^ 
  , stopResponseLoad :: Maybe LoadShortResponse -- ^ 
  , stopResponseFloorPlanPath :: Maybe [NodeRequest] -- ^ 
  , stopResponseValid :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON StopResponse where
  parseJSON = genericParseJSON optionsStopResponse
instance ToJSON StopResponse where
  toJSON = genericToJSON optionsStopResponse

optionsStopResponse :: Options
optionsStopResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("stopResponseGeoId", "geoId")
      , ("stopResponseLatitude", "latitude")
      , ("stopResponseLongitude", "longitude")
      , ("stopResponseStartWindow", "startWindow")
      , ("stopResponseEndWindow", "endWindow")
      , ("stopResponseType", "type")
      , ("stopResponseEta", "eta")
      , ("stopResponseEtd", "etd")
      , ("stopResponseScore", "score")
      , ("stopResponseErrorCode", "errorCode")
      , ("stopResponseError", "error")
      , ("stopResponseItemId", "itemId")
      , ("stopResponseItemSize", "itemSize")
      , ("stopResponseLoad", "load")
      , ("stopResponseFloorPlanPath", "floorPlanPath")
      , ("stopResponseValid", "valid")
      ]


-- | 
data Subscription = Subscription
  { subscriptionId :: Maybe Integer -- ^ 
  , subscriptionActive :: Maybe Bool -- ^ 
  , subscriptionValid :: Maybe Bool -- ^ 
  , subscriptionSubscriptionPlan :: Maybe SubscriptionPlan -- ^ 
  , subscriptionRemoteSubscriptionId :: Maybe Text -- ^ 
  , subscriptionPromoCode :: Maybe Text -- ^ 
  , subscriptionFailed :: Maybe Bool -- ^ 
  , subscriptionMessage :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Subscription where
  parseJSON = genericParseJSON optionsSubscription
instance ToJSON Subscription where
  toJSON = genericToJSON optionsSubscription

optionsSubscription :: Options
optionsSubscription =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("subscriptionId", "id")
      , ("subscriptionActive", "active")
      , ("subscriptionValid", "valid")
      , ("subscriptionSubscriptionPlan", "subscriptionPlan")
      , ("subscriptionRemoteSubscriptionId", "remoteSubscriptionId")
      , ("subscriptionPromoCode", "promoCode")
      , ("subscriptionFailed", "failed")
      , ("subscriptionMessage", "message")
      ]


-- | 
data SubscriptionOption = SubscriptionOption
  { subscriptionOptionId :: Maybe Integer -- ^ 
  , subscriptionOptionActive :: Maybe Bool -- ^ 
  , subscriptionOptionValid :: Maybe Bool -- ^ 
  , subscriptionOptionName :: Maybe Text -- ^ 
  , subscriptionOptionPrice :: Maybe Double -- ^ 
  , subscriptionOptionQuantity :: Maybe Int -- ^ 
  , subscriptionOptionThreshold :: Maybe Int -- ^ 
  , subscriptionOptionVisible :: Maybe Bool -- ^ 
  , subscriptionOptionOptionType :: Maybe Text -- ^ 
  , subscriptionOptionOfferType :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON SubscriptionOption where
  parseJSON = genericParseJSON optionsSubscriptionOption
instance ToJSON SubscriptionOption where
  toJSON = genericToJSON optionsSubscriptionOption

optionsSubscriptionOption :: Options
optionsSubscriptionOption =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("subscriptionOptionId", "id")
      , ("subscriptionOptionActive", "active")
      , ("subscriptionOptionValid", "valid")
      , ("subscriptionOptionName", "name")
      , ("subscriptionOptionPrice", "price")
      , ("subscriptionOptionQuantity", "quantity")
      , ("subscriptionOptionThreshold", "threshold")
      , ("subscriptionOptionVisible", "visible")
      , ("subscriptionOptionOptionType", "optionType")
      , ("subscriptionOptionOfferType", "offerType")
      ]


-- | 
data SubscriptionOptionResponse = SubscriptionOptionResponse
  { subscriptionOptionResponseId :: Maybe Integer -- ^ 
  , subscriptionOptionResponseName :: Maybe Text -- ^ 
  , subscriptionOptionResponsePrice :: Maybe Double -- ^ 
  , subscriptionOptionResponseQuantity :: Maybe Int -- ^ 
  , subscriptionOptionResponseThreshold :: Maybe Int -- ^ 
  , subscriptionOptionResponseVisible :: Maybe Bool -- ^ 
  , subscriptionOptionResponseOptionType :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON SubscriptionOptionResponse where
  parseJSON = genericParseJSON optionsSubscriptionOptionResponse
instance ToJSON SubscriptionOptionResponse where
  toJSON = genericToJSON optionsSubscriptionOptionResponse

optionsSubscriptionOptionResponse :: Options
optionsSubscriptionOptionResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("subscriptionOptionResponseId", "id")
      , ("subscriptionOptionResponseName", "name")
      , ("subscriptionOptionResponsePrice", "price")
      , ("subscriptionOptionResponseQuantity", "quantity")
      , ("subscriptionOptionResponseThreshold", "threshold")
      , ("subscriptionOptionResponseVisible", "visible")
      , ("subscriptionOptionResponseOptionType", "optionType")
      ]


-- | 
data SubscriptionPlan = SubscriptionPlan
  { subscriptionPlanId :: Maybe Integer -- ^ 
  , subscriptionPlanActive :: Maybe Bool -- ^ 
  , subscriptionPlanValid :: Maybe Bool -- ^ 
  , subscriptionPlanName :: Maybe Text -- ^ 
  , subscriptionPlanDescription :: Maybe Text -- ^ 
  , subscriptionPlanOptions :: Maybe [SubscriptionOption] -- ^ 
  , subscriptionPlanPrice :: Maybe Double -- ^ 
  , subscriptionPlanPromo :: Maybe Double -- ^ 
  , subscriptionPlanTransactionFee :: Maybe Double -- ^ 
  , subscriptionPlanRole :: Maybe Text -- ^ 
  , subscriptionPlanDefaultPlan :: Maybe Bool -- ^ 
  , subscriptionPlanVisible :: Maybe Bool -- ^ 
  , subscriptionPlanImage :: Maybe Asset -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON SubscriptionPlan where
  parseJSON = genericParseJSON optionsSubscriptionPlan
instance ToJSON SubscriptionPlan where
  toJSON = genericToJSON optionsSubscriptionPlan

optionsSubscriptionPlan :: Options
optionsSubscriptionPlan =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("subscriptionPlanId", "id")
      , ("subscriptionPlanActive", "active")
      , ("subscriptionPlanValid", "valid")
      , ("subscriptionPlanName", "name")
      , ("subscriptionPlanDescription", "description")
      , ("subscriptionPlanOptions", "options")
      , ("subscriptionPlanPrice", "price")
      , ("subscriptionPlanPromo", "promo")
      , ("subscriptionPlanTransactionFee", "transactionFee")
      , ("subscriptionPlanRole", "role")
      , ("subscriptionPlanDefaultPlan", "defaultPlan")
      , ("subscriptionPlanVisible", "visible")
      , ("subscriptionPlanImage", "image")
      ]


-- | 
data SubscriptionPlanResponse = SubscriptionPlanResponse
  { subscriptionPlanResponseId :: Maybe Integer -- ^ 
  , subscriptionPlanResponseName :: Maybe Text -- ^ 
  , subscriptionPlanResponseDescription :: Maybe Text -- ^ 
  , subscriptionPlanResponseOptions :: Maybe [SubscriptionOptionResponse] -- ^ 
  , subscriptionPlanResponsePrice :: Maybe Double -- ^ 
  , subscriptionPlanResponsePromo :: Maybe Double -- ^ 
  , subscriptionPlanResponseTransactionFee :: Maybe Double -- ^ 
  , subscriptionPlanResponseRole :: Maybe Text -- ^ 
  , subscriptionPlanResponseDefaultPlan :: Maybe Bool -- ^ 
  , subscriptionPlanResponseVisible :: Maybe Bool -- ^ 
  , subscriptionPlanResponseImage :: Maybe AssetShortResponse -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON SubscriptionPlanResponse where
  parseJSON = genericParseJSON optionsSubscriptionPlanResponse
instance ToJSON SubscriptionPlanResponse where
  toJSON = genericToJSON optionsSubscriptionPlanResponse

optionsSubscriptionPlanResponse :: Options
optionsSubscriptionPlanResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("subscriptionPlanResponseId", "id")
      , ("subscriptionPlanResponseName", "name")
      , ("subscriptionPlanResponseDescription", "description")
      , ("subscriptionPlanResponseOptions", "options")
      , ("subscriptionPlanResponsePrice", "price")
      , ("subscriptionPlanResponsePromo", "promo")
      , ("subscriptionPlanResponseTransactionFee", "transactionFee")
      , ("subscriptionPlanResponseRole", "role")
      , ("subscriptionPlanResponseDefaultPlan", "defaultPlan")
      , ("subscriptionPlanResponseVisible", "visible")
      , ("subscriptionPlanResponseImage", "image")
      ]


-- | 
data SubscriptionResponse = SubscriptionResponse
  { subscriptionResponseId :: Maybe Integer -- ^ 
  , subscriptionResponseSubscriptionPlan :: Maybe SubscriptionPlanResponse -- ^ 
  , subscriptionResponsePromoCode :: Maybe Text -- ^ 
  , subscriptionResponseActive :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON SubscriptionResponse where
  parseJSON = genericParseJSON optionsSubscriptionResponse
instance ToJSON SubscriptionResponse where
  toJSON = genericToJSON optionsSubscriptionResponse

optionsSubscriptionResponse :: Options
optionsSubscriptionResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("subscriptionResponseId", "id")
      , ("subscriptionResponseSubscriptionPlan", "subscriptionPlan")
      , ("subscriptionResponsePromoCode", "promoCode")
      , ("subscriptionResponseActive", "active")
      ]


-- | 
data TaskResponse = TaskResponse
  { taskResponseScheduledNotificationId :: Maybe Integer -- ^ 
  , taskResponseActive :: Maybe Bool -- ^ 
  , taskResponseStatus :: Maybe Text -- ^ 
  , taskResponseType :: Maybe Text -- ^ 
  , taskResponseName :: Maybe Text -- ^ 
  , taskResponseMessage :: Maybe Text -- ^ 
  , taskResponseGroupingId :: Maybe Text -- ^ 
  , taskResponseScheduledDate :: Maybe Integer -- ^ 
  , taskResponseStartDate :: Maybe Integer -- ^ 
  , taskResponseEndDate :: Maybe Integer -- ^ 
  , taskResponseOwner :: Maybe AccountShortResponse -- ^ 
  , taskResponseBillableEntity :: Maybe BillableEntityShortResponse -- ^ 
  , taskResponseContentId :: Maybe Integer -- ^ 
  , taskResponseContentName :: Maybe Text -- ^ 
  , taskResponseContentType :: Maybe Text -- ^ 
  , taskResponseParentId :: Maybe Integer -- ^ 
  , taskResponseParentType :: Maybe Text -- ^ 
  , taskResponseApplication :: Maybe ApplicationMiniResponse -- ^ 
  , taskResponseTargetId :: Maybe Integer -- ^ 
  , taskResponseTargetName :: Maybe Text -- ^ 
  , taskResponseTargetType :: Maybe Text -- ^ 
  , taskResponseTargetParams :: Maybe Text -- ^ 
  , taskResponseDeliverEstimate :: Maybe Integer -- ^ 
  , taskResponseDeliverCount :: Maybe Integer -- ^ 
  , taskResponseDeliverTotal :: Maybe Integer -- ^ 
  , taskResponseDeliverFailed :: Maybe Integer -- ^ 
  , taskResponseProcessingTime :: Maybe Integer -- ^ 
  , taskResponseSendingTime :: Maybe Integer -- ^ 
  , taskResponseUpdated :: Maybe Integer -- ^ 
  , taskResponseCreated :: Maybe Integer -- ^ 
  , taskResponseCronExpression :: Maybe Text -- ^ 
  , taskResponseEndpointURL :: Maybe Text -- ^ 
  , taskResponsePayload :: Maybe Text -- ^ 
  , taskResponseConditionalInput :: Maybe Text -- ^ 
  , taskResponseConnectionAccountIds :: Maybe [Integer] -- ^ 
  , taskResponseTemplateType :: Maybe Text -- ^ 
  , taskResponseGroupedTypes :: Maybe [Text] -- ^ 
  , taskResponseTaskId :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TaskResponse where
  parseJSON = genericParseJSON optionsTaskResponse
instance ToJSON TaskResponse where
  toJSON = genericToJSON optionsTaskResponse

optionsTaskResponse :: Options
optionsTaskResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("taskResponseScheduledNotificationId", "scheduledNotificationId")
      , ("taskResponseActive", "active")
      , ("taskResponseStatus", "status")
      , ("taskResponseType", "type")
      , ("taskResponseName", "name")
      , ("taskResponseMessage", "message")
      , ("taskResponseGroupingId", "groupingId")
      , ("taskResponseScheduledDate", "scheduledDate")
      , ("taskResponseStartDate", "startDate")
      , ("taskResponseEndDate", "endDate")
      , ("taskResponseOwner", "owner")
      , ("taskResponseBillableEntity", "billableEntity")
      , ("taskResponseContentId", "contentId")
      , ("taskResponseContentName", "contentName")
      , ("taskResponseContentType", "contentType")
      , ("taskResponseParentId", "parentId")
      , ("taskResponseParentType", "parentType")
      , ("taskResponseApplication", "application")
      , ("taskResponseTargetId", "targetId")
      , ("taskResponseTargetName", "targetName")
      , ("taskResponseTargetType", "targetType")
      , ("taskResponseTargetParams", "targetParams")
      , ("taskResponseDeliverEstimate", "deliverEstimate")
      , ("taskResponseDeliverCount", "deliverCount")
      , ("taskResponseDeliverTotal", "deliverTotal")
      , ("taskResponseDeliverFailed", "deliverFailed")
      , ("taskResponseProcessingTime", "processingTime")
      , ("taskResponseSendingTime", "sendingTime")
      , ("taskResponseUpdated", "updated")
      , ("taskResponseCreated", "created")
      , ("taskResponseCronExpression", "cronExpression")
      , ("taskResponseEndpointURL", "endpointURL")
      , ("taskResponsePayload", "payload")
      , ("taskResponseConditionalInput", "conditionalInput")
      , ("taskResponseConnectionAccountIds", "connectionAccountIds")
      , ("taskResponseTemplateType", "templateType")
      , ("taskResponseGroupedTypes", "groupedTypes")
      , ("taskResponseTaskId", "taskId")
      ]


-- | 
data Territory = Territory
  { territoryId :: Maybe Integer -- ^ 
  , territoryActive :: Maybe Bool -- ^ 
  , territoryValid :: Maybe Bool -- ^ 
  , territoryName :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Territory where
  parseJSON = genericParseJSON optionsTerritory
instance ToJSON Territory where
  toJSON = genericToJSON optionsTerritory

optionsTerritory :: Options
optionsTerritory =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("territoryId", "id")
      , ("territoryActive", "active")
      , ("territoryValid", "valid")
      , ("territoryName", "name")
      ]


-- | 
data TerritoryResponse = TerritoryResponse
  { territoryResponseId :: Maybe Integer -- ^ 
  , territoryResponseName :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TerritoryResponse where
  parseJSON = genericParseJSON optionsTerritoryResponse
instance ToJSON TerritoryResponse where
  toJSON = genericToJSON optionsTerritoryResponse

optionsTerritoryResponse :: Options
optionsTerritoryResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("territoryResponseId", "id")
      , ("territoryResponseName", "name")
      ]


-- | 
data ThemeDescriptorResponse = ThemeDescriptorResponse
  { themeDescriptorResponseValid :: Maybe Bool -- ^ 
  , themeDescriptorResponseMessage :: Maybe Text -- ^ 
  , themeDescriptorResponseVersion :: Maybe Double -- ^ 
  , themeDescriptorResponseSerializeNulls :: Maybe Bool -- ^ 
  , themeDescriptorResponseStartTimeLog :: Maybe Integer -- ^ 
  , themeDescriptorResponseErrorCode :: Maybe Text -- ^ 
  , themeDescriptorResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , themeDescriptorResponseThemeDescriptorId :: Maybe Integer -- ^ 
  , themeDescriptorResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ThemeDescriptorResponse where
  parseJSON = genericParseJSON optionsThemeDescriptorResponse
instance ToJSON ThemeDescriptorResponse where
  toJSON = genericToJSON optionsThemeDescriptorResponse

optionsThemeDescriptorResponse :: Options
optionsThemeDescriptorResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("themeDescriptorResponseValid", "valid")
      , ("themeDescriptorResponseMessage", "message")
      , ("themeDescriptorResponseVersion", "version")
      , ("themeDescriptorResponseSerializeNulls", "serializeNulls")
      , ("themeDescriptorResponseStartTimeLog", "startTimeLog")
      , ("themeDescriptorResponseErrorCode", "errorCode")
      , ("themeDescriptorResponseRequest", "request")
      , ("themeDescriptorResponseThemeDescriptorId", "themeDescriptorId")
      , ("themeDescriptorResponseReturning", "returning")
      ]


-- | 
data ThirdPartyCredentialResponse = ThirdPartyCredentialResponse
  { thirdPartyCredentialResponseThirdPartyCredentialId :: Maybe Integer -- ^ 
  , thirdPartyCredentialResponseThirdPartyId :: Maybe Text -- ^ 
  , thirdPartyCredentialResponseThirdPartyName :: Maybe Text -- ^ 
  , thirdPartyCredentialResponseNetwork :: Maybe ThirdPartyNetworkShortResponse -- ^ 
  , thirdPartyCredentialResponseUpdated :: Maybe Integer -- ^ 
  , thirdPartyCredentialResponseCreated :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ThirdPartyCredentialResponse where
  parseJSON = genericParseJSON optionsThirdPartyCredentialResponse
instance ToJSON ThirdPartyCredentialResponse where
  toJSON = genericToJSON optionsThirdPartyCredentialResponse

optionsThirdPartyCredentialResponse :: Options
optionsThirdPartyCredentialResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("thirdPartyCredentialResponseThirdPartyCredentialId", "thirdPartyCredentialId")
      , ("thirdPartyCredentialResponseThirdPartyId", "thirdPartyId")
      , ("thirdPartyCredentialResponseThirdPartyName", "thirdPartyName")
      , ("thirdPartyCredentialResponseNetwork", "network")
      , ("thirdPartyCredentialResponseUpdated", "updated")
      , ("thirdPartyCredentialResponseCreated", "created")
      ]


-- | 
data ThirdPartyCredentials = ThirdPartyCredentials
  { thirdPartyCredentialsId :: Maybe Integer -- ^ 
  , thirdPartyCredentialsActive :: Maybe Bool -- ^ 
  , thirdPartyCredentialsValid :: Maybe Bool -- ^ 
  , thirdPartyCredentialsAccount :: Maybe Account -- ^ 
  , thirdPartyCredentialsThirdPartyNetwork :: Maybe ThirdPartyNetwork -- ^ 
  , thirdPartyCredentialsThirdPartyUID :: Maybe Integer -- ^ 
  , thirdPartyCredentialsThirdPartyId :: Maybe Text -- ^ 
  , thirdPartyCredentialsThirdPartyToken :: Maybe Text -- ^ 
  , thirdPartyCredentialsThirdPartySecret :: Maybe Text -- ^ 
  , thirdPartyCredentialsThirdPartyName :: Maybe Text -- ^ 
  , thirdPartyCredentialsThirdPartyUnencryptedToken :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ThirdPartyCredentials where
  parseJSON = genericParseJSON optionsThirdPartyCredentials
instance ToJSON ThirdPartyCredentials where
  toJSON = genericToJSON optionsThirdPartyCredentials

optionsThirdPartyCredentials :: Options
optionsThirdPartyCredentials =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("thirdPartyCredentialsId", "id")
      , ("thirdPartyCredentialsActive", "active")
      , ("thirdPartyCredentialsValid", "valid")
      , ("thirdPartyCredentialsAccount", "account")
      , ("thirdPartyCredentialsThirdPartyNetwork", "thirdPartyNetwork")
      , ("thirdPartyCredentialsThirdPartyUID", "thirdPartyUID")
      , ("thirdPartyCredentialsThirdPartyId", "thirdPartyId")
      , ("thirdPartyCredentialsThirdPartyToken", "thirdPartyToken")
      , ("thirdPartyCredentialsThirdPartySecret", "thirdPartySecret")
      , ("thirdPartyCredentialsThirdPartyName", "thirdPartyName")
      , ("thirdPartyCredentialsThirdPartyUnencryptedToken", "thirdPartyUnencryptedToken")
      ]


-- | 
data ThirdPartyNetwork = ThirdPartyNetwork
  { thirdPartyNetworkId :: Maybe Integer -- ^ 
  , thirdPartyNetworkActive :: Maybe Bool -- ^ 
  , thirdPartyNetworkValid :: Maybe Bool -- ^ 
  , thirdPartyNetworkNetworkUID :: Maybe Text -- ^ 
  , thirdPartyNetworkName :: Maybe Text -- ^ 
  , thirdPartyNetworkDescription :: Maybe Text -- ^ 
  , thirdPartyNetworkIntrospectionMethod :: Maybe Text -- ^ 
  , thirdPartyNetworkIntrospectionURL :: Maybe Text -- ^ 
  , thirdPartyNetworkIntrospectionParams :: Maybe Text -- ^ 
  , thirdPartyNetworkRequiredRootField :: Maybe Text -- ^ 
  , thirdPartyNetworkBillableEntity :: Maybe BillableEntity -- ^ 
  , thirdPartyNetworkSupportedNetwork :: Maybe Text -- ^ 
  , thirdPartyNetworkEnableIntrospection :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ThirdPartyNetwork where
  parseJSON = genericParseJSON optionsThirdPartyNetwork
instance ToJSON ThirdPartyNetwork where
  toJSON = genericToJSON optionsThirdPartyNetwork

optionsThirdPartyNetwork :: Options
optionsThirdPartyNetwork =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("thirdPartyNetworkId", "id")
      , ("thirdPartyNetworkActive", "active")
      , ("thirdPartyNetworkValid", "valid")
      , ("thirdPartyNetworkNetworkUID", "networkUID")
      , ("thirdPartyNetworkName", "name")
      , ("thirdPartyNetworkDescription", "description")
      , ("thirdPartyNetworkIntrospectionMethod", "introspectionMethod")
      , ("thirdPartyNetworkIntrospectionURL", "introspectionURL")
      , ("thirdPartyNetworkIntrospectionParams", "introspectionParams")
      , ("thirdPartyNetworkRequiredRootField", "requiredRootField")
      , ("thirdPartyNetworkBillableEntity", "billableEntity")
      , ("thirdPartyNetworkSupportedNetwork", "supportedNetwork")
      , ("thirdPartyNetworkEnableIntrospection", "enableIntrospection")
      ]


-- | 
data ThirdPartyNetworkResponse = ThirdPartyNetworkResponse
  { thirdPartyNetworkResponseUpdated :: Maybe Integer -- ^ 
  , thirdPartyNetworkResponseCreated :: Maybe Integer -- ^ 
  , thirdPartyNetworkResponseActive :: Maybe Bool -- ^ 
  , thirdPartyNetworkResponseName :: Maybe Text -- ^ 
  , thirdPartyNetworkResponseDescription :: Maybe Text -- ^ 
  , thirdPartyNetworkResponseNetworkUID :: Maybe Text -- ^ 
  , thirdPartyNetworkResponseNetwork :: Maybe Text -- ^ 
  , thirdPartyNetworkResponseIntrospectionMethod :: Maybe Text -- ^ 
  , thirdPartyNetworkResponseEnableIntrospection :: Maybe Bool -- ^ 
  , thirdPartyNetworkResponseIntrospectionURL :: Maybe Text -- ^ 
  , thirdPartyNetworkResponseIntrospectionParams :: Maybe Text -- ^ 
  , thirdPartyNetworkResponseRequiredRootField :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ThirdPartyNetworkResponse where
  parseJSON = genericParseJSON optionsThirdPartyNetworkResponse
instance ToJSON ThirdPartyNetworkResponse where
  toJSON = genericToJSON optionsThirdPartyNetworkResponse

optionsThirdPartyNetworkResponse :: Options
optionsThirdPartyNetworkResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("thirdPartyNetworkResponseUpdated", "updated")
      , ("thirdPartyNetworkResponseCreated", "created")
      , ("thirdPartyNetworkResponseActive", "active")
      , ("thirdPartyNetworkResponseName", "name")
      , ("thirdPartyNetworkResponseDescription", "description")
      , ("thirdPartyNetworkResponseNetworkUID", "networkUID")
      , ("thirdPartyNetworkResponseNetwork", "network")
      , ("thirdPartyNetworkResponseIntrospectionMethod", "introspectionMethod")
      , ("thirdPartyNetworkResponseEnableIntrospection", "enableIntrospection")
      , ("thirdPartyNetworkResponseIntrospectionURL", "introspectionURL")
      , ("thirdPartyNetworkResponseIntrospectionParams", "introspectionParams")
      , ("thirdPartyNetworkResponseRequiredRootField", "requiredRootField")
      ]


-- | 
data ThirdPartyNetworkShortResponse = ThirdPartyNetworkShortResponse
  { thirdPartyNetworkShortResponseUpdated :: Maybe Integer -- ^ 
  , thirdPartyNetworkShortResponseCreated :: Maybe Integer -- ^ 
  , thirdPartyNetworkShortResponseActive :: Maybe Bool -- ^ 
  , thirdPartyNetworkShortResponseName :: Maybe Text -- ^ 
  , thirdPartyNetworkShortResponseDescription :: Maybe Text -- ^ 
  , thirdPartyNetworkShortResponseNetworkUID :: Maybe Text -- ^ 
  , thirdPartyNetworkShortResponseNetwork :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON ThirdPartyNetworkShortResponse where
  parseJSON = genericParseJSON optionsThirdPartyNetworkShortResponse
instance ToJSON ThirdPartyNetworkShortResponse where
  toJSON = genericToJSON optionsThirdPartyNetworkShortResponse

optionsThirdPartyNetworkShortResponse :: Options
optionsThirdPartyNetworkShortResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("thirdPartyNetworkShortResponseUpdated", "updated")
      , ("thirdPartyNetworkShortResponseCreated", "created")
      , ("thirdPartyNetworkShortResponseActive", "active")
      , ("thirdPartyNetworkShortResponseName", "name")
      , ("thirdPartyNetworkShortResponseDescription", "description")
      , ("thirdPartyNetworkShortResponseNetworkUID", "networkUID")
      , ("thirdPartyNetworkShortResponseNetwork", "network")
      ]


-- | 
data TicketCountResponse = TicketCountResponse
  { ticketCountResponseCount :: Maybe Integer -- ^ 
  , ticketCountResponseType :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TicketCountResponse where
  parseJSON = genericParseJSON optionsTicketCountResponse
instance ToJSON TicketCountResponse where
  toJSON = genericToJSON optionsTicketCountResponse

optionsTicketCountResponse :: Options
optionsTicketCountResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("ticketCountResponseCount", "count")
      , ("ticketCountResponseType", "type")
      ]


-- | 
data TicketListResponse = TicketListResponse
  { ticketListResponseValid :: Maybe Bool -- ^ 
  , ticketListResponseMessage :: Maybe Text -- ^ 
  , ticketListResponseVersion :: Maybe Double -- ^ 
  , ticketListResponseSerializeNulls :: Maybe Bool -- ^ 
  , ticketListResponseStartTimeLog :: Maybe Integer -- ^ 
  , ticketListResponseErrorCode :: Maybe Text -- ^ 
  , ticketListResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , ticketListResponseItems :: Maybe [TicketResponse] -- ^ 
  , ticketListResponseCount :: Maybe Int -- ^ 
  , ticketListResponseHasMoreResults :: Maybe Bool -- ^ 
  , ticketListResponseStart :: Maybe Int -- ^ 
  , ticketListResponseLimit :: Maybe Int -- ^ 
  , ticketListResponseCountTotal :: Maybe Integer -- ^ 
  , ticketListResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TicketListResponse where
  parseJSON = genericParseJSON optionsTicketListResponse
instance ToJSON TicketListResponse where
  toJSON = genericToJSON optionsTicketListResponse

optionsTicketListResponse :: Options
optionsTicketListResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("ticketListResponseValid", "valid")
      , ("ticketListResponseMessage", "message")
      , ("ticketListResponseVersion", "version")
      , ("ticketListResponseSerializeNulls", "serializeNulls")
      , ("ticketListResponseStartTimeLog", "startTimeLog")
      , ("ticketListResponseErrorCode", "errorCode")
      , ("ticketListResponseRequest", "request")
      , ("ticketListResponseItems", "items")
      , ("ticketListResponseCount", "count")
      , ("ticketListResponseHasMoreResults", "hasMoreResults")
      , ("ticketListResponseStart", "start")
      , ("ticketListResponseLimit", "limit")
      , ("ticketListResponseCountTotal", "countTotal")
      , ("ticketListResponseReturning", "returning")
      ]


-- | 
data TicketOfferResponse = TicketOfferResponse
  { ticketOfferResponseId :: Maybe Integer -- ^ 
  , ticketOfferResponseTitle :: Maybe Text -- ^ 
  , ticketOfferResponseDescription :: Maybe Text -- ^ 
  , ticketOfferResponseImageURL :: Maybe Text -- ^ 
  , ticketOfferResponseRetailer :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TicketOfferResponse where
  parseJSON = genericParseJSON optionsTicketOfferResponse
instance ToJSON TicketOfferResponse where
  toJSON = genericToJSON optionsTicketOfferResponse

optionsTicketOfferResponse :: Options
optionsTicketOfferResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("ticketOfferResponseId", "id")
      , ("ticketOfferResponseTitle", "title")
      , ("ticketOfferResponseDescription", "description")
      , ("ticketOfferResponseImageURL", "imageURL")
      , ("ticketOfferResponseRetailer", "retailer")
      ]


-- | 
data TicketResponse = TicketResponse
  { ticketResponseAction :: Maybe Text -- ^ 
  , ticketResponseId :: Maybe Integer -- ^ 
  , ticketResponseAccountId :: Maybe Integer -- ^ 
  , ticketResponseObjectId :: Maybe Integer -- ^ 
  , ticketResponseType :: Maybe Text -- ^ 
  , ticketResponseActionType :: Maybe Text -- ^ 
  , ticketResponseUsed :: Maybe Integer -- ^ 
  , ticketResponseCount :: Maybe Integer -- ^ 
  , ticketResponsePurchaseItem :: Maybe PurchaseItemShortResponse -- ^ 
  , ticketResponseCustomMessage :: Maybe Text -- ^ 
  , ticketResponseSender :: Maybe AccountShortResponse -- ^ 
  , ticketResponseReceiver :: Maybe [AccountShortResponse] -- ^ 
  , ticketResponseCustomAsset :: Maybe AssetShortResponse -- ^ 
  , ticketResponseReceiptToken :: Maybe Text -- ^ 
  , ticketResponseTicketType :: Maybe Text -- ^ 
  , ticketResponseApplication :: Maybe ApplicationShortResponse -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TicketResponse where
  parseJSON = genericParseJSON optionsTicketResponse
instance ToJSON TicketResponse where
  toJSON = genericToJSON optionsTicketResponse

optionsTicketResponse :: Options
optionsTicketResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("ticketResponseAction", "action")
      , ("ticketResponseId", "id")
      , ("ticketResponseAccountId", "accountId")
      , ("ticketResponseObjectId", "objectId")
      , ("ticketResponseType", "type")
      , ("ticketResponseActionType", "actionType")
      , ("ticketResponseUsed", "used")
      , ("ticketResponseCount", "count")
      , ("ticketResponsePurchaseItem", "purchaseItem")
      , ("ticketResponseCustomMessage", "customMessage")
      , ("ticketResponseSender", "sender")
      , ("ticketResponseReceiver", "receiver")
      , ("ticketResponseCustomAsset", "customAsset")
      , ("ticketResponseReceiptToken", "receiptToken")
      , ("ticketResponseTicketType", "ticketType")
      , ("ticketResponseApplication", "application")
      ]


-- | 
data TimeSlotResponse = TimeSlotResponse
  { timeSlotResponseScheduledDate :: Maybe Integer -- ^ 
  , timeSlotResponseStartTime :: Maybe Integer -- ^ 
  , timeSlotResponseEndTime :: Maybe Integer -- ^ 
  , timeSlotResponseDayOfWeek :: Maybe Int -- ^ 
  , timeSlotResponseTimeZone :: Maybe Text -- ^ 
  , timeSlotResponseReservationCount :: Maybe Int -- ^ 
  , timeSlotResponseReservations :: Maybe [AccountShortResponse] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TimeSlotResponse where
  parseJSON = genericParseJSON optionsTimeSlotResponse
instance ToJSON TimeSlotResponse where
  toJSON = genericToJSON optionsTimeSlotResponse

optionsTimeSlotResponse :: Options
optionsTimeSlotResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("timeSlotResponseScheduledDate", "scheduledDate")
      , ("timeSlotResponseStartTime", "startTime")
      , ("timeSlotResponseEndTime", "endTime")
      , ("timeSlotResponseDayOfWeek", "dayOfWeek")
      , ("timeSlotResponseTimeZone", "timeZone")
      , ("timeSlotResponseReservationCount", "reservationCount")
      , ("timeSlotResponseReservations", "reservations")
      ]


-- | 
data TokenResponse = TokenResponse
  { tokenResponseValid :: Maybe Bool -- ^ 
  , tokenResponseMessage :: Maybe Text -- ^ 
  , tokenResponseVersion :: Maybe Double -- ^ 
  , tokenResponseSerializeNulls :: Maybe Bool -- ^ 
  , tokenResponseStartTimeLog :: Maybe Integer -- ^ 
  , tokenResponseErrorCode :: Maybe Text -- ^ 
  , tokenResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , tokenResponseToken :: Maybe Text -- ^ 
  , tokenResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TokenResponse where
  parseJSON = genericParseJSON optionsTokenResponse
instance ToJSON TokenResponse where
  toJSON = genericToJSON optionsTokenResponse

optionsTokenResponse :: Options
optionsTokenResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("tokenResponseValid", "valid")
      , ("tokenResponseMessage", "message")
      , ("tokenResponseVersion", "version")
      , ("tokenResponseSerializeNulls", "serializeNulls")
      , ("tokenResponseStartTimeLog", "startTimeLog")
      , ("tokenResponseErrorCode", "errorCode")
      , ("tokenResponseRequest", "request")
      , ("tokenResponseToken", "token")
      , ("tokenResponseReturning", "returning")
      ]


-- | 
data TournamentResponse = TournamentResponse
  { tournamentResponseAction :: Maybe Text -- ^ 
  , tournamentResponseHighestAppVersion :: Maybe Text -- ^ 
  , tournamentResponseMissionId :: Maybe Integer -- ^ 
  , tournamentResponseTicketsEarned :: Maybe Integer -- ^ 
  , tournamentResponseCostToPlay :: Maybe Int -- ^ 
  , tournamentResponseCostToPlayType :: Maybe Text -- ^ 
  , tournamentResponseOwner :: Maybe AccountShortResponse -- ^ 
  , tournamentResponseTitle :: Maybe Text -- ^ 
  , tournamentResponseDescription :: Maybe Text -- ^ 
  , tournamentResponseAuthorOverride :: Maybe Text -- ^ 
  , tournamentResponseIcon :: Maybe AssetShortResponse -- ^ 
  , tournamentResponseImage :: Maybe AssetShortResponse -- ^ 
  , tournamentResponseSequenceType :: Maybe Text -- ^ 
  , tournamentResponseUpdatedDate :: Maybe Integer -- ^ 
  , tournamentResponseStartDate :: Maybe Integer -- ^ 
  , tournamentResponseEndDate :: Maybe Integer -- ^ 
  , tournamentResponseMissionType :: Maybe Text -- ^ 
  , tournamentResponseActive :: Maybe Bool -- ^ 
  , tournamentResponseBalance :: Maybe Double -- ^ 
  , tournamentResponseAvailableLimit :: Maybe Int -- ^ 
  , tournamentResponseInviteCount :: Maybe Int -- ^ 
  , tournamentResponseAcceptedCount :: Maybe Int -- ^ 
  , tournamentResponseChildCount :: Maybe Integer -- ^ 
  , tournamentResponseEnableBuyBack :: Maybe Bool -- ^ 
  , tournamentResponseMinimumToPlay :: Maybe Int -- ^ 
  , tournamentResponseRewarded :: Maybe Bool -- ^ 
  , tournamentResponseRefunded :: Maybe Bool -- ^ 
  , tournamentResponseJoinCode :: Maybe Text -- ^ 
  , tournamentResponseRewards :: Maybe [RewardResponse] -- ^ 
  , tournamentResponseGames :: Maybe GameListResponse -- ^ 
  , tournamentResponseScores :: Maybe ScoreListResponse -- ^ 
  , tournamentResponseUserPermissionsList :: Maybe UserPermissionsListResponse -- ^ 
  , tournamentResponseResults :: Maybe [NameStringValueResponse] -- ^ 
  , tournamentResponseInviteStatus :: Maybe Text -- ^ 
  , tournamentResponseAudiences :: Maybe [AudienceResponse] -- ^ 
  , tournamentResponseMissionInviteId :: Maybe Integer -- ^ 
  , tournamentResponseMissionInvite :: Maybe MissionInviteResponse -- ^ 
  , tournamentResponseInvitee :: Maybe AccountShortResponse -- ^ 
  , tournamentResponseFormatType :: Maybe Text -- ^ 
  , tournamentResponseCreatives :: Maybe [CreativeResponse] -- ^ 
  , tournamentResponseFixedReward :: Maybe Bool -- ^ 
  , tournamentResponseAllocateTickets :: Maybe Bool -- ^ 
  , tournamentResponseTicketType :: Maybe Text -- ^ 
  , tournamentResponseTicketCount :: Maybe Integer -- ^ 
  , tournamentResponsePoints :: Maybe Integer -- ^ 
  , tournamentResponseSplitReward :: Maybe Text -- ^ 
  , tournamentResponseSecondsBetweenLevels :: Maybe Int -- ^ 
  , tournamentResponseSecondsBetweenPacks :: Maybe Int -- ^ 
  , tournamentResponseAdvancedReporting :: Maybe Bool -- ^ 
  , tournamentResponseTournamentData :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TournamentResponse where
  parseJSON = genericParseJSON optionsTournamentResponse
instance ToJSON TournamentResponse where
  toJSON = genericToJSON optionsTournamentResponse

optionsTournamentResponse :: Options
optionsTournamentResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("tournamentResponseAction", "action")
      , ("tournamentResponseHighestAppVersion", "highestAppVersion")
      , ("tournamentResponseMissionId", "missionId")
      , ("tournamentResponseTicketsEarned", "ticketsEarned")
      , ("tournamentResponseCostToPlay", "costToPlay")
      , ("tournamentResponseCostToPlayType", "costToPlayType")
      , ("tournamentResponseOwner", "owner")
      , ("tournamentResponseTitle", "title")
      , ("tournamentResponseDescription", "description")
      , ("tournamentResponseAuthorOverride", "authorOverride")
      , ("tournamentResponseIcon", "icon")
      , ("tournamentResponseImage", "image")
      , ("tournamentResponseSequenceType", "sequenceType")
      , ("tournamentResponseUpdatedDate", "updatedDate")
      , ("tournamentResponseStartDate", "startDate")
      , ("tournamentResponseEndDate", "endDate")
      , ("tournamentResponseMissionType", "missionType")
      , ("tournamentResponseActive", "active")
      , ("tournamentResponseBalance", "balance")
      , ("tournamentResponseAvailableLimit", "availableLimit")
      , ("tournamentResponseInviteCount", "inviteCount")
      , ("tournamentResponseAcceptedCount", "acceptedCount")
      , ("tournamentResponseChildCount", "childCount")
      , ("tournamentResponseEnableBuyBack", "enableBuyBack")
      , ("tournamentResponseMinimumToPlay", "minimumToPlay")
      , ("tournamentResponseRewarded", "rewarded")
      , ("tournamentResponseRefunded", "refunded")
      , ("tournamentResponseJoinCode", "joinCode")
      , ("tournamentResponseRewards", "rewards")
      , ("tournamentResponseGames", "games")
      , ("tournamentResponseScores", "scores")
      , ("tournamentResponseUserPermissionsList", "userPermissionsList")
      , ("tournamentResponseResults", "results")
      , ("tournamentResponseInviteStatus", "inviteStatus")
      , ("tournamentResponseAudiences", "audiences")
      , ("tournamentResponseMissionInviteId", "missionInviteId")
      , ("tournamentResponseMissionInvite", "missionInvite")
      , ("tournamentResponseInvitee", "invitee")
      , ("tournamentResponseFormatType", "formatType")
      , ("tournamentResponseCreatives", "creatives")
      , ("tournamentResponseFixedReward", "fixedReward")
      , ("tournamentResponseAllocateTickets", "allocateTickets")
      , ("tournamentResponseTicketType", "ticketType")
      , ("tournamentResponseTicketCount", "ticketCount")
      , ("tournamentResponsePoints", "points")
      , ("tournamentResponseSplitReward", "splitReward")
      , ("tournamentResponseSecondsBetweenLevels", "secondsBetweenLevels")
      , ("tournamentResponseSecondsBetweenPacks", "secondsBetweenPacks")
      , ("tournamentResponseAdvancedReporting", "advancedReporting")
      , ("tournamentResponseTournamentData", "tournamentData")
      ]


-- | 
data TriggerResponse = TriggerResponse
  { triggerResponseScheduledNotificationId :: Maybe Integer -- ^ 
  , triggerResponseActive :: Maybe Bool -- ^ 
  , triggerResponseStatus :: Maybe Text -- ^ 
  , triggerResponseType :: Maybe Text -- ^ 
  , triggerResponseName :: Maybe Text -- ^ 
  , triggerResponseMessage :: Maybe Text -- ^ 
  , triggerResponseGroupingId :: Maybe Text -- ^ 
  , triggerResponseScheduledDate :: Maybe Integer -- ^ 
  , triggerResponseStartDate :: Maybe Integer -- ^ 
  , triggerResponseEndDate :: Maybe Integer -- ^ 
  , triggerResponseOwner :: Maybe AccountShortResponse -- ^ 
  , triggerResponseBillableEntity :: Maybe BillableEntityShortResponse -- ^ 
  , triggerResponseContentId :: Maybe Integer -- ^ 
  , triggerResponseContentName :: Maybe Text -- ^ 
  , triggerResponseContentType :: Maybe Text -- ^ 
  , triggerResponseParentId :: Maybe Integer -- ^ 
  , triggerResponseParentType :: Maybe Text -- ^ 
  , triggerResponseApplication :: Maybe ApplicationMiniResponse -- ^ 
  , triggerResponseTargetId :: Maybe Integer -- ^ 
  , triggerResponseTargetName :: Maybe Text -- ^ 
  , triggerResponseTargetType :: Maybe Text -- ^ 
  , triggerResponseTargetParams :: Maybe Text -- ^ 
  , triggerResponseDeliverEstimate :: Maybe Integer -- ^ 
  , triggerResponseDeliverCount :: Maybe Integer -- ^ 
  , triggerResponseDeliverTotal :: Maybe Integer -- ^ 
  , triggerResponseDeliverFailed :: Maybe Integer -- ^ 
  , triggerResponseProcessingTime :: Maybe Integer -- ^ 
  , triggerResponseSendingTime :: Maybe Integer -- ^ 
  , triggerResponseUpdated :: Maybe Integer -- ^ 
  , triggerResponseCreated :: Maybe Integer -- ^ 
  , triggerResponseCronExpression :: Maybe Text -- ^ 
  , triggerResponseEndpointURL :: Maybe Text -- ^ 
  , triggerResponsePayload :: Maybe Text -- ^ 
  , triggerResponseConditionalInput :: Maybe Text -- ^ 
  , triggerResponseConnectionAccountIds :: Maybe [Integer] -- ^ 
  , triggerResponseTemplateType :: Maybe Text -- ^ 
  , triggerResponseGroupedTypes :: Maybe [Text] -- ^ 
  , triggerResponseTriggerId :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TriggerResponse where
  parseJSON = genericParseJSON optionsTriggerResponse
instance ToJSON TriggerResponse where
  toJSON = genericToJSON optionsTriggerResponse

optionsTriggerResponse :: Options
optionsTriggerResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("triggerResponseScheduledNotificationId", "scheduledNotificationId")
      , ("triggerResponseActive", "active")
      , ("triggerResponseStatus", "status")
      , ("triggerResponseType", "type")
      , ("triggerResponseName", "name")
      , ("triggerResponseMessage", "message")
      , ("triggerResponseGroupingId", "groupingId")
      , ("triggerResponseScheduledDate", "scheduledDate")
      , ("triggerResponseStartDate", "startDate")
      , ("triggerResponseEndDate", "endDate")
      , ("triggerResponseOwner", "owner")
      , ("triggerResponseBillableEntity", "billableEntity")
      , ("triggerResponseContentId", "contentId")
      , ("triggerResponseContentName", "contentName")
      , ("triggerResponseContentType", "contentType")
      , ("triggerResponseParentId", "parentId")
      , ("triggerResponseParentType", "parentType")
      , ("triggerResponseApplication", "application")
      , ("triggerResponseTargetId", "targetId")
      , ("triggerResponseTargetName", "targetName")
      , ("triggerResponseTargetType", "targetType")
      , ("triggerResponseTargetParams", "targetParams")
      , ("triggerResponseDeliverEstimate", "deliverEstimate")
      , ("triggerResponseDeliverCount", "deliverCount")
      , ("triggerResponseDeliverTotal", "deliverTotal")
      , ("triggerResponseDeliverFailed", "deliverFailed")
      , ("triggerResponseProcessingTime", "processingTime")
      , ("triggerResponseSendingTime", "sendingTime")
      , ("triggerResponseUpdated", "updated")
      , ("triggerResponseCreated", "created")
      , ("triggerResponseCronExpression", "cronExpression")
      , ("triggerResponseEndpointURL", "endpointURL")
      , ("triggerResponsePayload", "payload")
      , ("triggerResponseConditionalInput", "conditionalInput")
      , ("triggerResponseConnectionAccountIds", "connectionAccountIds")
      , ("triggerResponseTemplateType", "templateType")
      , ("triggerResponseGroupedTypes", "groupedTypes")
      , ("triggerResponseTriggerId", "triggerId")
      ]


-- | 
data TrilatAppSettings = TrilatAppSettings
  { trilatAppSettingsProcessingType :: Maybe Text -- ^ 
  , trilatAppSettingsMaxSampleSize :: Maybe Int -- ^ 
  , trilatAppSettingsMinRSSI :: Maybe Double -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TrilatAppSettings where
  parseJSON = genericParseJSON optionsTrilatAppSettings
instance ToJSON TrilatAppSettings where
  toJSON = genericToJSON optionsTrilatAppSettings

optionsTrilatAppSettings :: Options
optionsTrilatAppSettings =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("trilatAppSettingsProcessingType", "processingType")
      , ("trilatAppSettingsMaxSampleSize", "maxSampleSize")
      , ("trilatAppSettingsMinRSSI", "minRSSI")
      ]


-- | 
data TrilatCacheRequest = TrilatCacheRequest
  { trilatCacheRequestUdid :: Maybe Text -- ^ 
  , trilatCacheRequestSourceTime :: Maybe Integer -- ^ 
  , trilatCacheRequestMinimumSampleSize :: Maybe Int -- ^ 
  , trilatCacheRequestSamples :: Maybe [TrilatCacheSample] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TrilatCacheRequest where
  parseJSON = genericParseJSON optionsTrilatCacheRequest
instance ToJSON TrilatCacheRequest where
  toJSON = genericToJSON optionsTrilatCacheRequest

optionsTrilatCacheRequest :: Options
optionsTrilatCacheRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("trilatCacheRequestUdid", "udid")
      , ("trilatCacheRequestSourceTime", "sourceTime")
      , ("trilatCacheRequestMinimumSampleSize", "minimumSampleSize")
      , ("trilatCacheRequestSamples", "samples")
      ]


-- | 
data TrilatCacheSample = TrilatCacheSample
  { trilatCacheSampleAvatarId :: Maybe Text -- ^ 
  , trilatCacheSampleDeviceId :: Maybe Text -- ^ 
  , trilatCacheSampleRssi :: Maybe [Int] -- ^ 
  , trilatCacheSampleFilteredRssi :: Maybe Double -- ^ 
  , trilatCacheSampleTime :: Maybe Integer -- ^ 
  , trilatCacheSampleNetworkName :: Maybe Text -- ^ 
  , trilatCacheSampleRandomizedId :: Maybe Bool -- ^ 
  , trilatCacheSampleDeviceSignature :: Maybe Text -- ^ 
  , trilatCacheSampleAlternateId :: Maybe Text -- ^ 
  , trilatCacheSampleType :: Maybe Text -- ^ 
  , trilatCacheSampleProbeType :: Maybe Text -- ^ 
  , trilatCacheSampleAvgRssi :: Maybe Double -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TrilatCacheSample where
  parseJSON = genericParseJSON optionsTrilatCacheSample
instance ToJSON TrilatCacheSample where
  toJSON = genericToJSON optionsTrilatCacheSample

optionsTrilatCacheSample :: Options
optionsTrilatCacheSample =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("trilatCacheSampleAvatarId", "avatarId")
      , ("trilatCacheSampleDeviceId", "deviceId")
      , ("trilatCacheSampleRssi", "rssi")
      , ("trilatCacheSampleFilteredRssi", "filteredRssi")
      , ("trilatCacheSampleTime", "time")
      , ("trilatCacheSampleNetworkName", "networkName")
      , ("trilatCacheSampleRandomizedId", "randomizedId")
      , ("trilatCacheSampleDeviceSignature", "deviceSignature")
      , ("trilatCacheSampleAlternateId", "alternateId")
      , ("trilatCacheSampleType", "type")
      , ("trilatCacheSampleProbeType", "probeType")
      , ("trilatCacheSampleAvgRssi", "avgRssi")
      ]


-- | 
data Trip = Trip
  { tripId :: Maybe Integer -- ^ 
  , tripActive :: Maybe Bool -- ^ 
  , tripValid :: Maybe Bool -- ^ 
  , tripOwner :: Maybe Account -- ^ 
  , tripPickupLocation :: Maybe Location -- ^ 
  , tripPickupTime :: Maybe UTCTime -- ^ 
  , tripDropOffLocation :: Maybe Location -- ^ 
  , tripDropOffTime :: Maybe UTCTime -- ^ 
  , tripShipments :: Maybe [Shipment] -- ^ 
  , tripRecurrence :: Maybe Recurrence -- ^ 
  , tripTimeZone :: Maybe Text -- ^ 
  , tripRoute :: Maybe Route -- ^ 
  , tripPreference :: Maybe Text -- ^ 
  , tripNotifications :: Maybe Text -- ^ 
  , tripMatches :: Maybe [Trip] -- ^ 
  , tripOwnerConnection :: Maybe Connection -- ^ 
  , tripOriginalId :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Trip where
  parseJSON = genericParseJSON optionsTrip
instance ToJSON Trip where
  toJSON = genericToJSON optionsTrip

optionsTrip :: Options
optionsTrip =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("tripId", "id")
      , ("tripActive", "active")
      , ("tripValid", "valid")
      , ("tripOwner", "owner")
      , ("tripPickupLocation", "pickupLocation")
      , ("tripPickupTime", "pickupTime")
      , ("tripDropOffLocation", "dropOffLocation")
      , ("tripDropOffTime", "dropOffTime")
      , ("tripShipments", "shipments")
      , ("tripRecurrence", "recurrence")
      , ("tripTimeZone", "timeZone")
      , ("tripRoute", "route")
      , ("tripPreference", "preference")
      , ("tripNotifications", "notifications")
      , ("tripMatches", "matches")
      , ("tripOwnerConnection", "ownerConnection")
      , ("tripOriginalId", "originalId")
      ]


-- | 
data Tutorial = Tutorial
  { tutorialId :: Maybe Integer -- ^ 
  , tutorialActive :: Maybe Bool -- ^ 
  , tutorialValid :: Maybe Bool -- ^ 
  , tutorialName :: Maybe Text -- ^ 
  , tutorialDescription :: Maybe Text -- ^ 
  , tutorialAlignment :: Maybe Text -- ^ 
  , tutorialImage :: Maybe Asset -- ^ 
  , tutorialOrderIndex :: Maybe Integer -- ^ 
  , tutorialTutorialObjectType :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Tutorial where
  parseJSON = genericParseJSON optionsTutorial
instance ToJSON Tutorial where
  toJSON = genericToJSON optionsTutorial

optionsTutorial :: Options
optionsTutorial =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("tutorialId", "id")
      , ("tutorialActive", "active")
      , ("tutorialValid", "valid")
      , ("tutorialName", "name")
      , ("tutorialDescription", "description")
      , ("tutorialAlignment", "alignment")
      , ("tutorialImage", "image")
      , ("tutorialOrderIndex", "orderIndex")
      , ("tutorialTutorialObjectType", "tutorialObjectType")
      ]


-- | 
data TutorialResponse = TutorialResponse
  { tutorialResponseValid :: Maybe Bool -- ^ 
  , tutorialResponseMessage :: Maybe Text -- ^ 
  , tutorialResponseVersion :: Maybe Double -- ^ 
  , tutorialResponseSerializeNulls :: Maybe Bool -- ^ 
  , tutorialResponseStartTimeLog :: Maybe Integer -- ^ 
  , tutorialResponseErrorCode :: Maybe Text -- ^ 
  , tutorialResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , tutorialResponseId :: Maybe Integer -- ^ 
  , tutorialResponseName :: Maybe Text -- ^ 
  , tutorialResponseDescription :: Maybe Text -- ^ 
  , tutorialResponseAlignment :: Maybe Text -- ^ 
  , tutorialResponseImage :: Maybe AssetShortResponse -- ^ 
  , tutorialResponseOrderIndex :: Maybe Integer -- ^ 
  , tutorialResponseObjectType :: Maybe Text -- ^ 
  , tutorialResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TutorialResponse where
  parseJSON = genericParseJSON optionsTutorialResponse
instance ToJSON TutorialResponse where
  toJSON = genericToJSON optionsTutorialResponse

optionsTutorialResponse :: Options
optionsTutorialResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("tutorialResponseValid", "valid")
      , ("tutorialResponseMessage", "message")
      , ("tutorialResponseVersion", "version")
      , ("tutorialResponseSerializeNulls", "serializeNulls")
      , ("tutorialResponseStartTimeLog", "startTimeLog")
      , ("tutorialResponseErrorCode", "errorCode")
      , ("tutorialResponseRequest", "request")
      , ("tutorialResponseId", "id")
      , ("tutorialResponseName", "name")
      , ("tutorialResponseDescription", "description")
      , ("tutorialResponseAlignment", "alignment")
      , ("tutorialResponseImage", "image")
      , ("tutorialResponseOrderIndex", "orderIndex")
      , ("tutorialResponseObjectType", "objectType")
      , ("tutorialResponseReturning", "returning")
      ]


-- | 
data TwiMLResponse = TwiMLResponse
  { twiMLResponseTag :: Maybe Text -- ^ 
  , twiMLResponseBody :: Maybe Text -- ^ 
  , twiMLResponseAttributes :: Maybe (Map.Map String Text) -- ^ 
  , twiMLResponseChildren :: Maybe [Verb] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON TwiMLResponse where
  parseJSON = genericParseJSON optionsTwiMLResponse
instance ToJSON TwiMLResponse where
  toJSON = genericToJSON optionsTwiMLResponse

optionsTwiMLResponse :: Options
optionsTwiMLResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("twiMLResponseTag", "tag")
      , ("twiMLResponseBody", "body")
      , ("twiMLResponseAttributes", "attributes")
      , ("twiMLResponseChildren", "children")
      ]


-- | 
data UrlResponse = UrlResponse
  { urlResponseUrl :: Maybe Text -- ^ 
  , urlResponseAsset :: Maybe AssetShortResponse -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON UrlResponse where
  parseJSON = genericParseJSON optionsUrlResponse
instance ToJSON UrlResponse where
  toJSON = genericToJSON optionsUrlResponse

optionsUrlResponse :: Options
optionsUrlResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("urlResponseUrl", "url")
      , ("urlResponseAsset", "asset")
      ]


-- | 
data UserActivityResponse = UserActivityResponse
  { userActivityResponseValid :: Maybe Bool -- ^ 
  , userActivityResponseMessage :: Maybe Text -- ^ 
  , userActivityResponseVersion :: Maybe Double -- ^ 
  , userActivityResponseSerializeNulls :: Maybe Bool -- ^ 
  , userActivityResponseStartTimeLog :: Maybe Integer -- ^ 
  , userActivityResponseErrorCode :: Maybe Text -- ^ 
  , userActivityResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , userActivityResponseCreated :: Maybe UTCTime -- ^ 
  , userActivityResponseLatitude :: Maybe Double -- ^ 
  , userActivityResponseLongitude :: Maybe Double -- ^ 
  , userActivityResponseTag :: Maybe Text -- ^ 
  , userActivityResponseCustomId :: Maybe Integer -- ^ 
  , userActivityResponseCustomType :: Maybe Text -- ^ 
  , userActivityResponseUserId :: Maybe Integer -- ^ 
  , userActivityResponseUsername :: Maybe Text -- ^ 
  , userActivityResponseAppTitle :: Maybe Text -- ^ 
  , userActivityResponseAppId :: Maybe Integer -- ^ 
  , userActivityResponseAppUrl :: Maybe Text -- ^ 
  , userActivityResponseAppDescription :: Maybe Text -- ^ 
  , userActivityResponseImageURL :: Maybe Text -- ^ 
  , userActivityResponseProfileImage :: Maybe Text -- ^ 
  , userActivityResponseFields :: Maybe Text -- ^ 
  , userActivityResponseId :: Maybe Integer -- ^ 
  , userActivityResponseCustomText :: Maybe Text -- ^ 
  , userActivityResponseCustomValue :: Maybe Double -- ^ 
  , userActivityResponseCustomMessage :: Maybe Text -- ^ 
  , userActivityResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON UserActivityResponse where
  parseJSON = genericParseJSON optionsUserActivityResponse
instance ToJSON UserActivityResponse where
  toJSON = genericToJSON optionsUserActivityResponse

optionsUserActivityResponse :: Options
optionsUserActivityResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("userActivityResponseValid", "valid")
      , ("userActivityResponseMessage", "message")
      , ("userActivityResponseVersion", "version")
      , ("userActivityResponseSerializeNulls", "serializeNulls")
      , ("userActivityResponseStartTimeLog", "startTimeLog")
      , ("userActivityResponseErrorCode", "errorCode")
      , ("userActivityResponseRequest", "request")
      , ("userActivityResponseCreated", "created")
      , ("userActivityResponseLatitude", "latitude")
      , ("userActivityResponseLongitude", "longitude")
      , ("userActivityResponseTag", "tag")
      , ("userActivityResponseCustomId", "customId")
      , ("userActivityResponseCustomType", "customType")
      , ("userActivityResponseUserId", "userId")
      , ("userActivityResponseUsername", "username")
      , ("userActivityResponseAppTitle", "appTitle")
      , ("userActivityResponseAppId", "appId")
      , ("userActivityResponseAppUrl", "appUrl")
      , ("userActivityResponseAppDescription", "appDescription")
      , ("userActivityResponseImageURL", "imageURL")
      , ("userActivityResponseProfileImage", "profileImage")
      , ("userActivityResponseFields", "fields")
      , ("userActivityResponseId", "id")
      , ("userActivityResponseCustomText", "customText")
      , ("userActivityResponseCustomValue", "customValue")
      , ("userActivityResponseCustomMessage", "customMessage")
      , ("userActivityResponseReturning", "returning")
      ]


-- | 
data UserLocationListResponse = UserLocationListResponse
  { userLocationListResponseValid :: Maybe Bool -- ^ 
  , userLocationListResponseMessage :: Maybe Text -- ^ 
  , userLocationListResponseVersion :: Maybe Double -- ^ 
  , userLocationListResponseSerializeNulls :: Maybe Bool -- ^ 
  , userLocationListResponseStartTimeLog :: Maybe Integer -- ^ 
  , userLocationListResponseErrorCode :: Maybe Text -- ^ 
  , userLocationListResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , userLocationListResponseItems :: Maybe [UserLocationResponse] -- ^ 
  , userLocationListResponseUserLocationType :: Maybe Text -- ^ 
  , userLocationListResponseLatitude :: Maybe Double -- ^ 
  , userLocationListResponseLongitude :: Maybe Double -- ^ 
  , userLocationListResponsePostalCode :: Maybe Text -- ^ 
  , userLocationListResponseCount :: Maybe Int -- ^ 
  , userLocationListResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON UserLocationListResponse where
  parseJSON = genericParseJSON optionsUserLocationListResponse
instance ToJSON UserLocationListResponse where
  toJSON = genericToJSON optionsUserLocationListResponse

optionsUserLocationListResponse :: Options
optionsUserLocationListResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("userLocationListResponseValid", "valid")
      , ("userLocationListResponseMessage", "message")
      , ("userLocationListResponseVersion", "version")
      , ("userLocationListResponseSerializeNulls", "serializeNulls")
      , ("userLocationListResponseStartTimeLog", "startTimeLog")
      , ("userLocationListResponseErrorCode", "errorCode")
      , ("userLocationListResponseRequest", "request")
      , ("userLocationListResponseItems", "items")
      , ("userLocationListResponseUserLocationType", "userLocationType")
      , ("userLocationListResponseLatitude", "latitude")
      , ("userLocationListResponseLongitude", "longitude")
      , ("userLocationListResponsePostalCode", "postalCode")
      , ("userLocationListResponseCount", "count")
      , ("userLocationListResponseReturning", "returning")
      ]


-- | 
data UserLocationResponse = UserLocationResponse
  { userLocationResponseValid :: Maybe Bool -- ^ 
  , userLocationResponseMessage :: Maybe Text -- ^ 
  , userLocationResponseVersion :: Maybe Double -- ^ 
  , userLocationResponseSerializeNulls :: Maybe Bool -- ^ 
  , userLocationResponseStartTimeLog :: Maybe Integer -- ^ 
  , userLocationResponseErrorCode :: Maybe Text -- ^ 
  , userLocationResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , userLocationResponseAccountId :: Maybe Integer -- ^ 
  , userLocationResponseLocationDisplay :: Maybe Text -- ^ 
  , userLocationResponseDisplay :: Maybe Text -- ^ 
  , userLocationResponseUsername :: Maybe Text -- ^ 
  , userLocationResponseProfileImage :: Maybe Text -- ^ 
  , userLocationResponseProfileAvatar :: Maybe AssetShortResponse -- ^ 
  , userLocationResponseAboutUs :: Maybe Text -- ^ 
  , userLocationResponseLocale :: Maybe Text -- ^ 
  , userLocationResponseSummaryTitle :: Maybe Text -- ^ 
  , userLocationResponseGender :: Maybe Text -- ^ 
  , userLocationResponseAge :: Maybe Text -- ^ 
  , userLocationResponseGameExperience :: Maybe Text -- ^ 
  , userLocationResponseContact :: Maybe ContactResponse -- ^ 
  , userLocationResponseCategories :: Maybe [CategoryResponse] -- ^ 
  , userLocationResponsePersonalProfile :: Maybe PersonalProfileResponse -- ^ 
  , userLocationResponseUserSettings :: Maybe UserSettingsResponse -- ^ 
  , userLocationResponseLatitude :: Maybe Double -- ^ 
  , userLocationResponseLongitude :: Maybe Double -- ^ 
  , userLocationResponseCurrentPostalCode :: Maybe PostalCodeResponse -- ^ 
  , userLocationResponseAccountType :: Maybe Text -- ^ 
  , userLocationResponsePremiumExpiration :: Maybe Integer -- ^ 
  , userLocationResponseMatchIndex :: Maybe Int -- ^ 
  , userLocationResponseTags :: Maybe Text -- ^ 
  , userLocationResponseLocationLastUpdated :: Maybe Integer -- ^ 
  , userLocationResponseDistanceFromMe :: Maybe Text -- ^ 
  , userLocationResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON UserLocationResponse where
  parseJSON = genericParseJSON optionsUserLocationResponse
instance ToJSON UserLocationResponse where
  toJSON = genericToJSON optionsUserLocationResponse

optionsUserLocationResponse :: Options
optionsUserLocationResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("userLocationResponseValid", "valid")
      , ("userLocationResponseMessage", "message")
      , ("userLocationResponseVersion", "version")
      , ("userLocationResponseSerializeNulls", "serializeNulls")
      , ("userLocationResponseStartTimeLog", "startTimeLog")
      , ("userLocationResponseErrorCode", "errorCode")
      , ("userLocationResponseRequest", "request")
      , ("userLocationResponseAccountId", "accountId")
      , ("userLocationResponseLocationDisplay", "locationDisplay")
      , ("userLocationResponseDisplay", "display")
      , ("userLocationResponseUsername", "username")
      , ("userLocationResponseProfileImage", "profileImage")
      , ("userLocationResponseProfileAvatar", "profileAvatar")
      , ("userLocationResponseAboutUs", "aboutUs")
      , ("userLocationResponseLocale", "locale")
      , ("userLocationResponseSummaryTitle", "summaryTitle")
      , ("userLocationResponseGender", "gender")
      , ("userLocationResponseAge", "age")
      , ("userLocationResponseGameExperience", "gameExperience")
      , ("userLocationResponseContact", "contact")
      , ("userLocationResponseCategories", "categories")
      , ("userLocationResponsePersonalProfile", "personalProfile")
      , ("userLocationResponseUserSettings", "userSettings")
      , ("userLocationResponseLatitude", "latitude")
      , ("userLocationResponseLongitude", "longitude")
      , ("userLocationResponseCurrentPostalCode", "currentPostalCode")
      , ("userLocationResponseAccountType", "accountType")
      , ("userLocationResponsePremiumExpiration", "premiumExpiration")
      , ("userLocationResponseMatchIndex", "matchIndex")
      , ("userLocationResponseTags", "tags")
      , ("userLocationResponseLocationLastUpdated", "locationLastUpdated")
      , ("userLocationResponseDistanceFromMe", "distanceFromMe")
      , ("userLocationResponseReturning", "returning")
      ]


-- | 
data UserLocationSearchResponse = UserLocationSearchResponse
  { userLocationSearchResponseValid :: Maybe Bool -- ^ 
  , userLocationSearchResponseMessage :: Maybe Text -- ^ 
  , userLocationSearchResponseVersion :: Maybe Double -- ^ 
  , userLocationSearchResponseSerializeNulls :: Maybe Bool -- ^ 
  , userLocationSearchResponseStartTimeLog :: Maybe Integer -- ^ 
  , userLocationSearchResponseErrorCode :: Maybe Text -- ^ 
  , userLocationSearchResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , userLocationSearchResponseHasMoreResults :: Maybe Bool -- ^ 
  , userLocationSearchResponseCount :: Maybe Int -- ^ 
  , userLocationSearchResponseUserLocations :: Maybe [UserLocationListResponse] -- ^ 
  , userLocationSearchResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON UserLocationSearchResponse where
  parseJSON = genericParseJSON optionsUserLocationSearchResponse
instance ToJSON UserLocationSearchResponse where
  toJSON = genericToJSON optionsUserLocationSearchResponse

optionsUserLocationSearchResponse :: Options
optionsUserLocationSearchResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("userLocationSearchResponseValid", "valid")
      , ("userLocationSearchResponseMessage", "message")
      , ("userLocationSearchResponseVersion", "version")
      , ("userLocationSearchResponseSerializeNulls", "serializeNulls")
      , ("userLocationSearchResponseStartTimeLog", "startTimeLog")
      , ("userLocationSearchResponseErrorCode", "errorCode")
      , ("userLocationSearchResponseRequest", "request")
      , ("userLocationSearchResponseHasMoreResults", "hasMoreResults")
      , ("userLocationSearchResponseCount", "count")
      , ("userLocationSearchResponseUserLocations", "userLocations")
      , ("userLocationSearchResponseReturning", "returning")
      ]


-- | 
data UserPermissions = UserPermissions
  { userPermissionsId :: Maybe Integer -- ^ 
  , userPermissionsActive :: Maybe Bool -- ^ 
  , userPermissionsValid :: Maybe Bool -- ^ 
  , userPermissionsPermissionableType :: Maybe Text -- ^ 
  , userPermissionsPermissionableId :: Maybe Integer -- ^ 
  , userPermissionsConnectionGroup :: Maybe ConnectionGroup -- ^ 
  , userPermissionsFriendGroup :: Maybe Bool -- ^ 
  , userPermissionsConnection :: Maybe Connection -- ^ 
  , userPermissionsPermissions :: Maybe Permissions -- ^ 
  , userPermissionsExclude :: Maybe Bool -- ^ 
  , userPermissionsBlocked :: Maybe Bool -- ^ 
  , userPermissionsOwner :: Maybe Account -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON UserPermissions where
  parseJSON = genericParseJSON optionsUserPermissions
instance ToJSON UserPermissions where
  toJSON = genericToJSON optionsUserPermissions

optionsUserPermissions :: Options
optionsUserPermissions =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("userPermissionsId", "id")
      , ("userPermissionsActive", "active")
      , ("userPermissionsValid", "valid")
      , ("userPermissionsPermissionableType", "permissionableType")
      , ("userPermissionsPermissionableId", "permissionableId")
      , ("userPermissionsConnectionGroup", "connectionGroup")
      , ("userPermissionsFriendGroup", "friendGroup")
      , ("userPermissionsConnection", "connection")
      , ("userPermissionsPermissions", "permissions")
      , ("userPermissionsExclude", "exclude")
      , ("userPermissionsBlocked", "blocked")
      , ("userPermissionsOwner", "owner")
      ]


-- | 
data UserPermissionsListResponse = UserPermissionsListResponse
  { userPermissionsListResponseAction :: Maybe Text -- ^ 
  , userPermissionsListResponseVisibility :: Maybe Text -- ^ 
  , userPermissionsListResponsePublicPermissions :: Maybe PermissionResponse -- ^ 
  , userPermissionsListResponseUserPermissions :: Maybe [UserPermissionsResponse] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON UserPermissionsListResponse where
  parseJSON = genericParseJSON optionsUserPermissionsListResponse
instance ToJSON UserPermissionsListResponse where
  toJSON = genericToJSON optionsUserPermissionsListResponse

optionsUserPermissionsListResponse :: Options
optionsUserPermissionsListResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("userPermissionsListResponseAction", "action")
      , ("userPermissionsListResponseVisibility", "visibility")
      , ("userPermissionsListResponsePublicPermissions", "publicPermissions")
      , ("userPermissionsListResponseUserPermissions", "userPermissions")
      ]


-- | 
data UserPermissionsResponse = UserPermissionsResponse
  { userPermissionsResponseValid :: Maybe Bool -- ^ 
  , userPermissionsResponseMessage :: Maybe Text -- ^ 
  , userPermissionsResponseVersion :: Maybe Double -- ^ 
  , userPermissionsResponseSerializeNulls :: Maybe Bool -- ^ 
  , userPermissionsResponseStartTimeLog :: Maybe Integer -- ^ 
  , userPermissionsResponseErrorCode :: Maybe Text -- ^ 
  , userPermissionsResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , userPermissionsResponsePermissions :: Maybe PermissionResponse -- ^ 
  , userPermissionsResponseConnection :: Maybe ConnectionResponse -- ^ 
  , userPermissionsResponseConnectionGroup :: Maybe ConnectionGroupResponse -- ^ 
  , userPermissionsResponseExclude :: Maybe Bool -- ^ 
  , userPermissionsResponseBlocked :: Maybe Bool -- ^ 
  , userPermissionsResponseFriendGroup :: Maybe Bool -- ^ 
  , userPermissionsResponsePermissionableId :: Maybe Integer -- ^ 
  , userPermissionsResponsePermissionableType :: Maybe Text -- ^ 
  , userPermissionsResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON UserPermissionsResponse where
  parseJSON = genericParseJSON optionsUserPermissionsResponse
instance ToJSON UserPermissionsResponse where
  toJSON = genericToJSON optionsUserPermissionsResponse

optionsUserPermissionsResponse :: Options
optionsUserPermissionsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("userPermissionsResponseValid", "valid")
      , ("userPermissionsResponseMessage", "message")
      , ("userPermissionsResponseVersion", "version")
      , ("userPermissionsResponseSerializeNulls", "serializeNulls")
      , ("userPermissionsResponseStartTimeLog", "startTimeLog")
      , ("userPermissionsResponseErrorCode", "errorCode")
      , ("userPermissionsResponseRequest", "request")
      , ("userPermissionsResponsePermissions", "permissions")
      , ("userPermissionsResponseConnection", "connection")
      , ("userPermissionsResponseConnectionGroup", "connectionGroup")
      , ("userPermissionsResponseExclude", "exclude")
      , ("userPermissionsResponseBlocked", "blocked")
      , ("userPermissionsResponseFriendGroup", "friendGroup")
      , ("userPermissionsResponsePermissionableId", "permissionableId")
      , ("userPermissionsResponsePermissionableType", "permissionableType")
      , ("userPermissionsResponseReturning", "returning")
      ]


-- | 
data UserSettingsResponse = UserSettingsResponse
  { userSettingsResponseShowAsZipcode :: Maybe Bool -- ^ 
  , userSettingsResponseShowExactLocation :: Maybe Bool -- ^ 
  , userSettingsResponseShowOthersExactLocation :: Maybe Bool -- ^ 
  , userSettingsResponseSuggestionCount :: Maybe Int -- ^ 
  , userSettingsResponseSuggestionTimeFrame :: Maybe Int -- ^ 
  , userSettingsResponseSuggestionMethod :: Maybe Text -- ^ 
  , userSettingsResponseNotifications :: Maybe NotificationSettingsResponse -- ^ 
  , userSettingsResponsePublicShowFriendInfo :: Maybe Bool -- ^ 
  , userSettingsResponsePublicShowGameInfo :: Maybe Bool -- ^ 
  , userSettingsResponsePublicShowProfileInfo :: Maybe Bool -- ^ 
  , userSettingsResponseFavoriteVisibility :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON UserSettingsResponse where
  parseJSON = genericParseJSON optionsUserSettingsResponse
instance ToJSON UserSettingsResponse where
  toJSON = genericToJSON optionsUserSettingsResponse

optionsUserSettingsResponse :: Options
optionsUserSettingsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("userSettingsResponseShowAsZipcode", "showAsZipcode")
      , ("userSettingsResponseShowExactLocation", "showExactLocation")
      , ("userSettingsResponseShowOthersExactLocation", "showOthersExactLocation")
      , ("userSettingsResponseSuggestionCount", "suggestionCount")
      , ("userSettingsResponseSuggestionTimeFrame", "suggestionTimeFrame")
      , ("userSettingsResponseSuggestionMethod", "suggestionMethod")
      , ("userSettingsResponseNotifications", "notifications")
      , ("userSettingsResponsePublicShowFriendInfo", "publicShowFriendInfo")
      , ("userSettingsResponsePublicShowGameInfo", "publicShowGameInfo")
      , ("userSettingsResponsePublicShowProfileInfo", "publicShowProfileInfo")
      , ("userSettingsResponseFavoriteVisibility", "favoriteVisibility")
      ]


-- | 
data Vehicle = Vehicle
  { vehicleId :: Maybe Integer -- ^ 
  , vehicleActive :: Maybe Bool -- ^ 
  , vehicleValid :: Maybe Bool -- ^ 
  , vehicleName :: Maybe Text -- ^ 
  , vehicleDescription :: Maybe Text -- ^ 
  , vehicleVehicleType :: Maybe VehicleType -- ^ 
  , vehicleVin :: Maybe Text -- ^ 
  , vehicleLicensePlateNumber :: Maybe Text -- ^ 
  , vehicleExternalId :: Maybe Text -- ^ 
  , vehicleHub :: Maybe ServiceHub -- ^ 
  , vehiclePrograms :: Maybe [Program] -- ^ 
  , vehicleSeatQuantity :: Maybe Integer -- ^ 
  , vehiclePicture :: Maybe Asset -- ^ 
  , vehicleMarkerIcon :: Maybe Asset -- ^ 
  , vehicleTrackingColor :: Maybe Text -- ^ 
  , vehicleBelongsTo :: Maybe Account -- ^ 
  , vehicleZone :: Maybe Region -- ^ 
  , vehicleNotes :: Maybe [Note] -- ^ 
  , vehicleNoteCount :: Maybe Integer -- ^ 
  , vehicleInUse :: Maybe Bool -- ^ 
  , vehicleContentName :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Vehicle where
  parseJSON = genericParseJSON optionsVehicle
instance ToJSON Vehicle where
  toJSON = genericToJSON optionsVehicle

optionsVehicle :: Options
optionsVehicle =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("vehicleId", "id")
      , ("vehicleActive", "active")
      , ("vehicleValid", "valid")
      , ("vehicleName", "name")
      , ("vehicleDescription", "description")
      , ("vehicleVehicleType", "vehicleType")
      , ("vehicleVin", "vin")
      , ("vehicleLicensePlateNumber", "licensePlateNumber")
      , ("vehicleExternalId", "externalId")
      , ("vehicleHub", "hub")
      , ("vehiclePrograms", "programs")
      , ("vehicleSeatQuantity", "seatQuantity")
      , ("vehiclePicture", "picture")
      , ("vehicleMarkerIcon", "markerIcon")
      , ("vehicleTrackingColor", "trackingColor")
      , ("vehicleBelongsTo", "belongsTo")
      , ("vehicleZone", "zone")
      , ("vehicleNotes", "notes")
      , ("vehicleNoteCount", "noteCount")
      , ("vehicleInUse", "inUse")
      , ("vehicleContentName", "contentName")
      ]


-- | 
data VehicleCargoSetting = VehicleCargoSetting
  { vehicleCargoSettingValid :: Maybe Bool -- ^ 
  , vehicleCargoSettingCargoType :: Maybe CargoType -- ^ 
  , vehicleCargoSettingMaxUnit :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON VehicleCargoSetting where
  parseJSON = genericParseJSON optionsVehicleCargoSetting
instance ToJSON VehicleCargoSetting where
  toJSON = genericToJSON optionsVehicleCargoSetting

optionsVehicleCargoSetting :: Options
optionsVehicleCargoSetting =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("vehicleCargoSettingValid", "valid")
      , ("vehicleCargoSettingCargoType", "cargoType")
      , ("vehicleCargoSettingMaxUnit", "maxUnit")
      ]


-- | 
data VehicleResponse = VehicleResponse
  { vehicleResponseId :: Maybe Text -- ^ 
  , vehicleResponseName :: Maybe Text -- ^ 
  , vehicleResponseCapacity :: Maybe Integer -- ^ 
  , vehicleResponseDepot :: Maybe GeoResponse -- ^ 
  , vehicleResponseStartWindow :: Maybe Integer -- ^ 
  , vehicleResponseEndWindow :: Maybe Integer -- ^ 
  , vehicleResponseCurrent :: Maybe GeoResponse -- ^ 
  , vehicleResponseDepotAsStop :: Maybe StopResponse -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON VehicleResponse where
  parseJSON = genericParseJSON optionsVehicleResponse
instance ToJSON VehicleResponse where
  toJSON = genericToJSON optionsVehicleResponse

optionsVehicleResponse :: Options
optionsVehicleResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("vehicleResponseId", "id")
      , ("vehicleResponseName", "name")
      , ("vehicleResponseCapacity", "capacity")
      , ("vehicleResponseDepot", "depot")
      , ("vehicleResponseStartWindow", "startWindow")
      , ("vehicleResponseEndWindow", "endWindow")
      , ("vehicleResponseCurrent", "current")
      , ("vehicleResponseDepotAsStop", "depotAsStop")
      ]


-- | 
data VehicleType = VehicleType
  { vehicleTypeId :: Maybe Integer -- ^ 
  , vehicleTypeActive :: Maybe Bool -- ^ 
  , vehicleTypeValid :: Maybe Bool -- ^ 
  , vehicleTypeBusiness :: Maybe Retailer -- ^ 
  , vehicleTypeHub :: Maybe ServiceHub -- ^ 
  , vehicleTypeName :: Maybe Text -- ^ 
  , vehicleTypeWidth :: Maybe Double -- ^ 
  , vehicleTypeHeight :: Maybe Double -- ^ 
  , vehicleTypeDepth :: Maybe Double -- ^ 
  , vehicleTypeVolume :: Maybe Double -- ^ 
  , vehicleTypeMaxWeight :: Maybe Double -- ^ 
  , vehicleTypeVehicleCargoSettings :: Maybe [VehicleCargoSetting] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON VehicleType where
  parseJSON = genericParseJSON optionsVehicleType
instance ToJSON VehicleType where
  toJSON = genericToJSON optionsVehicleType

optionsVehicleType :: Options
optionsVehicleType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("vehicleTypeId", "id")
      , ("vehicleTypeActive", "active")
      , ("vehicleTypeValid", "valid")
      , ("vehicleTypeBusiness", "business")
      , ("vehicleTypeHub", "hub")
      , ("vehicleTypeName", "name")
      , ("vehicleTypeWidth", "width")
      , ("vehicleTypeHeight", "height")
      , ("vehicleTypeDepth", "depth")
      , ("vehicleTypeVolume", "volume")
      , ("vehicleTypeMaxWeight", "maxWeight")
      , ("vehicleTypeVehicleCargoSettings", "vehicleCargoSettings")
      ]


-- | 
data Verb = Verb
  { verbTag :: Maybe Text -- ^ 
  , verbBody :: Maybe Text -- ^ 
  , verbAttributes :: Maybe (Map.Map String Text) -- ^ 
  , verbChildren :: Maybe [Verb] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON Verb where
  parseJSON = genericParseJSON optionsVerb
instance ToJSON Verb where
  toJSON = genericToJSON optionsVerb

optionsVerb :: Options
optionsVerb =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("verbTag", "tag")
      , ("verbBody", "body")
      , ("verbAttributes", "attributes")
      , ("verbChildren", "children")
      ]


-- | 
data WeatherForecastResponse = WeatherForecastResponse
  { weatherForecastResponseId :: Maybe Integer -- ^ 
  , weatherForecastResponseForecastDate :: Maybe Integer -- ^ 
  , weatherForecastResponsePrecipMM :: Maybe Double -- ^ 
  , weatherForecastResponseTempMaxC :: Maybe Int -- ^ 
  , weatherForecastResponseTempMaxF :: Maybe Int -- ^ 
  , weatherForecastResponseTempMinC :: Maybe Int -- ^ 
  , weatherForecastResponseTempMinF :: Maybe Int -- ^ 
  , weatherForecastResponseWeatherCode :: Maybe Int -- ^ 
  , weatherForecastResponseWeatherDesc :: Maybe Text -- ^ 
  , weatherForecastResponseWeatherIconUrl :: Maybe Text -- ^ 
  , weatherForecastResponseWinddir16Point :: Maybe Text -- ^ 
  , weatherForecastResponseWinddirDegree :: Maybe Int -- ^ 
  , weatherForecastResponseWinddirection :: Maybe Text -- ^ 
  , weatherForecastResponseWindspeedKmph :: Maybe Int -- ^ 
  , weatherForecastResponseWindspeedMiles :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON WeatherForecastResponse where
  parseJSON = genericParseJSON optionsWeatherForecastResponse
instance ToJSON WeatherForecastResponse where
  toJSON = genericToJSON optionsWeatherForecastResponse

optionsWeatherForecastResponse :: Options
optionsWeatherForecastResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("weatherForecastResponseId", "id")
      , ("weatherForecastResponseForecastDate", "forecastDate")
      , ("weatherForecastResponsePrecipMM", "precipMM")
      , ("weatherForecastResponseTempMaxC", "tempMaxC")
      , ("weatherForecastResponseTempMaxF", "tempMaxF")
      , ("weatherForecastResponseTempMinC", "tempMinC")
      , ("weatherForecastResponseTempMinF", "tempMinF")
      , ("weatherForecastResponseWeatherCode", "weatherCode")
      , ("weatherForecastResponseWeatherDesc", "weatherDesc")
      , ("weatherForecastResponseWeatherIconUrl", "weatherIconUrl")
      , ("weatherForecastResponseWinddir16Point", "winddir16Point")
      , ("weatherForecastResponseWinddirDegree", "winddirDegree")
      , ("weatherForecastResponseWinddirection", "winddirection")
      , ("weatherForecastResponseWindspeedKmph", "windspeedKmph")
      , ("weatherForecastResponseWindspeedMiles", "windspeedMiles")
      ]


-- | 
data WeatherResponse = WeatherResponse
  { weatherResponseId :: Maybe Integer -- ^ 
  , weatherResponseCloudcover :: Maybe Int -- ^ 
  , weatherResponseHumidity :: Maybe Int -- ^ 
  , weatherResponseObservationTime :: Maybe Integer -- ^ 
  , weatherResponsePrecipMM :: Maybe Double -- ^ 
  , weatherResponsePressure :: Maybe Int -- ^ 
  , weatherResponseTempUnderscoreC :: Maybe Int -- ^ 
  , weatherResponseTempUnderscoreF :: Maybe Int -- ^ 
  , weatherResponseVisibility :: Maybe Int -- ^ 
  , weatherResponseWeatherCode :: Maybe Int -- ^ 
  , weatherResponseWeatherDesc :: Maybe Text -- ^ 
  , weatherResponseWeatherIconUrl :: Maybe Text -- ^ 
  , weatherResponseWinddir16Point :: Maybe Text -- ^ 
  , weatherResponseWinddirDegree :: Maybe Int -- ^ 
  , weatherResponseWindspeedKmph :: Maybe Int -- ^ 
  , weatherResponseWindspeedMiles :: Maybe Int -- ^ 
  , weatherResponseForecasts :: Maybe [WeatherForecastResponse] -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON WeatherResponse where
  parseJSON = genericParseJSON optionsWeatherResponse
instance ToJSON WeatherResponse where
  toJSON = genericToJSON optionsWeatherResponse

optionsWeatherResponse :: Options
optionsWeatherResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("weatherResponseId", "id")
      , ("weatherResponseCloudcover", "cloudcover")
      , ("weatherResponseHumidity", "humidity")
      , ("weatherResponseObservationTime", "observationTime")
      , ("weatherResponsePrecipMM", "precipMM")
      , ("weatherResponsePressure", "pressure")
      , ("weatherResponseTempUnderscoreC", "temp_C")
      , ("weatherResponseTempUnderscoreF", "temp_F")
      , ("weatherResponseVisibility", "visibility")
      , ("weatherResponseWeatherCode", "weatherCode")
      , ("weatherResponseWeatherDesc", "weatherDesc")
      , ("weatherResponseWeatherIconUrl", "weatherIconUrl")
      , ("weatherResponseWinddir16Point", "winddir16Point")
      , ("weatherResponseWinddirDegree", "winddirDegree")
      , ("weatherResponseWindspeedKmph", "windspeedKmph")
      , ("weatherResponseWindspeedMiles", "windspeedMiles")
      , ("weatherResponseForecasts", "forecasts")
      ]


-- | 
data WordzWordResponse = WordzWordResponse
  { wordzWordResponseId :: Maybe Integer -- ^ 
  , wordzWordResponseWord :: Maybe Text -- ^ 
  , wordzWordResponseDefinition :: Maybe Text -- ^ 
  , wordzWordResponseScores :: Maybe ScoreListResponse -- ^ 
  , wordzWordResponseIcon :: Maybe AssetShortResponse -- ^ 
  , wordzWordResponseImage :: Maybe AssetShortResponse -- ^ 
  , wordzWordResponseAuthorOverride :: Maybe Text -- ^ 
  , wordzWordResponseUpdatedDate :: Maybe Integer -- ^ 
  , wordzWordResponseStartDate :: Maybe Integer -- ^ 
  , wordzWordResponseEndDate :: Maybe Integer -- ^ 
  , wordzWordResponseCreatedDate :: Maybe Integer -- ^ 
  , wordzWordResponseActive :: Maybe Bool -- ^ 
  , wordzWordResponseAllocateTickets :: Maybe Bool -- ^ 
  , wordzWordResponseTicketType :: Maybe Text -- ^ 
  , wordzWordResponseTicketCount :: Maybe Integer -- ^ 
  , wordzWordResponsePoints :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON WordzWordResponse where
  parseJSON = genericParseJSON optionsWordzWordResponse
instance ToJSON WordzWordResponse where
  toJSON = genericToJSON optionsWordzWordResponse

optionsWordzWordResponse :: Options
optionsWordzWordResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("wordzWordResponseId", "id")
      , ("wordzWordResponseWord", "word")
      , ("wordzWordResponseDefinition", "definition")
      , ("wordzWordResponseScores", "scores")
      , ("wordzWordResponseIcon", "icon")
      , ("wordzWordResponseImage", "image")
      , ("wordzWordResponseAuthorOverride", "authorOverride")
      , ("wordzWordResponseUpdatedDate", "updatedDate")
      , ("wordzWordResponseStartDate", "startDate")
      , ("wordzWordResponseEndDate", "endDate")
      , ("wordzWordResponseCreatedDate", "createdDate")
      , ("wordzWordResponseActive", "active")
      , ("wordzWordResponseAllocateTickets", "allocateTickets")
      , ("wordzWordResponseTicketType", "ticketType")
      , ("wordzWordResponseTicketCount", "ticketCount")
      , ("wordzWordResponsePoints", "points")
      ]


-- | 
data WrappedProxyItemResponse = WrappedProxyItemResponse
  { wrappedProxyItemResponseValid :: Maybe Bool -- ^ 
  , wrappedProxyItemResponseMessage :: Maybe Text -- ^ 
  , wrappedProxyItemResponseVersion :: Maybe Double -- ^ 
  , wrappedProxyItemResponseSerializeNulls :: Maybe Bool -- ^ 
  , wrappedProxyItemResponseStartTimeLog :: Maybe Integer -- ^ 
  , wrappedProxyItemResponseErrorCode :: Maybe Text -- ^ 
  , wrappedProxyItemResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , wrappedProxyItemResponseReturning :: Maybe Text -- ^ 
  , wrappedProxyItemResponseType :: Maybe Text -- ^ 
  , wrappedProxyItemResponseResponseCode :: Maybe Int -- ^ 
  , wrappedProxyItemResponseResponseRaw :: Maybe Text -- ^ 
  , wrappedProxyItemResponseRequestDuration :: Maybe Integer -- ^ 
  , wrappedProxyItemResponseRequestEndTime :: Maybe Integer -- ^ 
  , wrappedProxyItemResponseItem :: Maybe ImageGenerationResponse -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON WrappedProxyItemResponse where
  parseJSON = genericParseJSON optionsWrappedProxyItemResponse
instance ToJSON WrappedProxyItemResponse where
  toJSON = genericToJSON optionsWrappedProxyItemResponse

optionsWrappedProxyItemResponse :: Options
optionsWrappedProxyItemResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("wrappedProxyItemResponseValid", "valid")
      , ("wrappedProxyItemResponseMessage", "message")
      , ("wrappedProxyItemResponseVersion", "version")
      , ("wrappedProxyItemResponseSerializeNulls", "serializeNulls")
      , ("wrappedProxyItemResponseStartTimeLog", "startTimeLog")
      , ("wrappedProxyItemResponseErrorCode", "errorCode")
      , ("wrappedProxyItemResponseRequest", "request")
      , ("wrappedProxyItemResponseReturning", "returning")
      , ("wrappedProxyItemResponseType", "type")
      , ("wrappedProxyItemResponseResponseCode", "responseCode")
      , ("wrappedProxyItemResponseResponseRaw", "responseRaw")
      , ("wrappedProxyItemResponseRequestDuration", "requestDuration")
      , ("wrappedProxyItemResponseRequestEndTime", "requestEndTime")
      , ("wrappedProxyItemResponseItem", "item")
      ]


-- | 
data WrappedProxyResponse = WrappedProxyResponse
  { wrappedProxyResponseValid :: Maybe Bool -- ^ 
  , wrappedProxyResponseMessage :: Maybe Text -- ^ 
  , wrappedProxyResponseVersion :: Maybe Double -- ^ 
  , wrappedProxyResponseSerializeNulls :: Maybe Bool -- ^ 
  , wrappedProxyResponseStartTimeLog :: Maybe Integer -- ^ 
  , wrappedProxyResponseErrorCode :: Maybe Text -- ^ 
  , wrappedProxyResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , wrappedProxyResponseReturning :: Maybe Text -- ^ 
  , wrappedProxyResponseType :: Maybe Text -- ^ 
  , wrappedProxyResponseResponseCode :: Maybe Int -- ^ 
  , wrappedProxyResponseResponseRaw :: Maybe Text -- ^ 
  , wrappedProxyResponseRequestDuration :: Maybe Integer -- ^ 
  , wrappedProxyResponseRequestEndTime :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON WrappedProxyResponse where
  parseJSON = genericParseJSON optionsWrappedProxyResponse
instance ToJSON WrappedProxyResponse where
  toJSON = genericToJSON optionsWrappedProxyResponse

optionsWrappedProxyResponse :: Options
optionsWrappedProxyResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("wrappedProxyResponseValid", "valid")
      , ("wrappedProxyResponseMessage", "message")
      , ("wrappedProxyResponseVersion", "version")
      , ("wrappedProxyResponseSerializeNulls", "serializeNulls")
      , ("wrappedProxyResponseStartTimeLog", "startTimeLog")
      , ("wrappedProxyResponseErrorCode", "errorCode")
      , ("wrappedProxyResponseRequest", "request")
      , ("wrappedProxyResponseReturning", "returning")
      , ("wrappedProxyResponseType", "type")
      , ("wrappedProxyResponseResponseCode", "responseCode")
      , ("wrappedProxyResponseResponseRaw", "responseRaw")
      , ("wrappedProxyResponseRequestDuration", "requestDuration")
      , ("wrappedProxyResponseRequestEndTime", "requestEndTime")
      ]


-- | 
data WrappedResponse = WrappedResponse
  { wrappedResponseValid :: Maybe Bool -- ^ 
  , wrappedResponseMessage :: Maybe Text -- ^ 
  , wrappedResponseVersion :: Maybe Double -- ^ 
  , wrappedResponseSerializeNulls :: Maybe Bool -- ^ 
  , wrappedResponseStartTimeLog :: Maybe Integer -- ^ 
  , wrappedResponseErrorCode :: Maybe Text -- ^ 
  , wrappedResponseRequest :: Maybe [NameStringValueResponse] -- ^ 
  , wrappedResponseType :: Maybe Text -- ^ 
  , wrappedResponseItem :: Maybe Value -- ^ 
  , wrappedResponseMessages :: Maybe MessageListResponse -- ^ 
  , wrappedResponseReturning :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON WrappedResponse where
  parseJSON = genericParseJSON optionsWrappedResponse
instance ToJSON WrappedResponse where
  toJSON = genericToJSON optionsWrappedResponse

optionsWrappedResponse :: Options
optionsWrappedResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("wrappedResponseValid", "valid")
      , ("wrappedResponseMessage", "message")
      , ("wrappedResponseVersion", "version")
      , ("wrappedResponseSerializeNulls", "serializeNulls")
      , ("wrappedResponseStartTimeLog", "startTimeLog")
      , ("wrappedResponseErrorCode", "errorCode")
      , ("wrappedResponseRequest", "request")
      , ("wrappedResponseType", "type")
      , ("wrappedResponseItem", "item")
      , ("wrappedResponseMessages", "messages")
      , ("wrappedResponseReturning", "returning")
      ]


-- | 
data YayOrNay = YayOrNay
  { yayOrNayId :: Maybe Integer -- ^ 
  , yayOrNayActive :: Maybe Bool -- ^ 
  , yayOrNayValid :: Maybe Bool -- ^ 
  , yayOrNayOwner :: Maybe Account -- ^ 
  , yayOrNayYayOrNay :: Maybe Bool -- ^ 
  , yayOrNayLikableObjectType :: Maybe Text -- ^ 
  , yayOrNayLikableObjectId :: Maybe Integer -- ^ 
  } deriving (Show, Eq, Generic, Data)

instance FromJSON YayOrNay where
  parseJSON = genericParseJSON optionsYayOrNay
instance ToJSON YayOrNay where
  toJSON = genericToJSON optionsYayOrNay

optionsYayOrNay :: Options
optionsYayOrNay =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ lookup s table
    }
  where
    table =
      [ ("yayOrNayId", "id")
      , ("yayOrNayActive", "active")
      , ("yayOrNayValid", "valid")
      , ("yayOrNayOwner", "owner")
      , ("yayOrNayYayOrNay", "yayOrNay")
      , ("yayOrNayLikableObjectType", "likableObjectType")
      , ("yayOrNayLikableObjectId", "likableObjectId")
      ]

