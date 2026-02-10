package api

import play.api.libs.json._
import model.AccountLoginResponse
import model.AssetListResponse
import model.BigDecimal
import model.ProfileInfoResponse
import model.ProfileResponse
import model.SirqulResponse
import model.UserLocationSearchResponse
import model.UserSettingsResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait AccountApi {
  /**
    * Search Accounts by Location
    * Search accounts by their location. This only searches on users that have location data. Use ConnectionApi to perform a regular search on accounts.
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param q Deprecated - legacy query parameter
    * @param keyword An optional keyword to search on, will be ignore if empty (NOT implemented yet)
    * @param postalCode The postal code to search on, either postalCode or the user&#39;s exact location is required
    * @param latitude The latitude of the user, either postalCode or the user&#39;s exact location is required
    * @param longitude The longitude of the user, either postalCode or the user&#39;s exact location is required
    * @param appKey The application key
    * @param range The range to search on
    * @param locationLastUpdated Searches for user&#39;s that has updated their location since this date
    * @param gender The preferred gender
    * @param minAge The preferred min age
    * @param maxAge The preferred max age
    * @param companionshipIndex The preferred companionship index
    * @param i this is the start index of a query
    * @param start Start of the pagination
    * @param l this is the limit index of a query
    * @param limit Limit of the pagination
    * @param searchMode Search mode to use for index searches (e.g. CLOUDINDEX, OPENSEARCH)
    * @param sortField Sorting field for results (default: DISTANCE)
    * @param descending Whether to sort descending (default: false)
    * @param roles Roles to filter on
    * @param tags Tags to filter on
    * @param experience The experience to filter on
    * @param categoryIds The category ids to filter on (comma separated)
    * @param audienceIds The audience ids to filter on (comma separated)
    * @param audienceOperator Operator used to combine audience filters (default: AND)
    * @param updateCurrentLocation Whether to use the given lat &amp; long to update the user&#39;s current location
    * @param updatePreferredSettings Whether to use the given parameters to update the user&#39;s preferred settings
    * @param showExactLocations Determines whether to always display user exact locations
    * @param showConnectionToSearcher Return connection of the accounts in the result to the passed in account if there exists any
    * @param flagCountMinimum Return any results that have a minimum of the specified flag count (even ones that have met the flag threshold)
    * @param verifiedUserOnly Returns only verified users
    * @param contentAdminOnly Returns only content admin users
    */
  def accountLocationSearch(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], q: Option[String], keyword: Option[String], postalCode: Option[String], latitude: Option[Double], longitude: Option[Double], appKey: Option[String], range: Option[Double], locationLastUpdated: Option[Long], gender: Option[String], minAge: Option[Int], maxAge: Option[Int], companionshipIndex: Option[Int], i: Option[Int], start: Option[Int], l: Option[Int], limit: Option[Int], searchMode: Option[String], sortField: Option[String], descending: Option[Boolean], roles: Option[String], tags: Option[String], experience: Option[String], categoryIds: Option[String], audienceIds: Option[String], audienceOperator: Option[String], updateCurrentLocation: Option[Boolean], updatePreferredSettings: Option[Boolean], showExactLocations: Option[Boolean], showConnectionToSearcher: Option[Boolean], flagCountMinimum: Option[Long], verifiedUserOnly: Option[Boolean], contentAdminOnly: Option[Boolean]): UserLocationSearchResponse

  /**
    * Block Account
    * Moves or removes an account into the user&#39;s blocked group.
    * @param accountIdBeingBlocked The id of the account to be blocked/unblocked
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param blockFlagValue Determines whether the account is blocked or unblocked
    * @param removeFromGroupsIfBlocked Determines whether the account is removed from all other groups if blocked
    * @param latitude The current latitude of the user
    * @param longitude The current longitude of the user
    */
  def blockAccount(version: BigDecimal, accountIdBeingBlocked: Long, deviceId: Option[String], accountId: Option[Long], blockFlagValue: Option[Boolean], removeFromGroupsIfBlocked: Option[Boolean], latitude: Option[Double], longitude: Option[Double]): SirqulResponse

  /**
    * Create Account
    * Create a new account by role.
    * @param username The access token to authenticate with (ex: username)
    * @param password The secret to authenticate with (ex: password)
    * @param name The full name of the user. If this parameter is NOT empty, the following parameters will be ignored: prefixName, firstName, middleName, lastName, and suffixName
    * @param prefixName If the parameter &#39;name&#39; is empty or not present, this field will be used to set the prefix of the user&#39;s name
    * @param firstName If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s first name
    * @param middleName If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s middle name
    * @param lastName If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s last name
    * @param suffixName If the parameter &#39;name&#39; is empty or not present, this field will be used to set the suffix of the user&#39;s name
    * @param title This field will be used to set the user&#39;s job title
    * @param deviceId The unique id of the device making the request
    * @param deviceIdType The type of device id (this is defined by the client), ie. MAC_ADDRESS, APPLE_UDID, etc
    * @param emailAddress The user&#39;s contact email address (NOT the username)
    * @param assetId The asset id to set the user&#39;s profile image
    * @param streetAddress The street address of the user&#39;s contact location
    * @param zipcode The zipcode of the user&#39;s contact location
    * @param gender The gender of the user (AudienceGender)
    * @param birthday The birthday date of the user in UTC milliseconds
    * @param homePhone The home phone number
    * @param cellPhone The cellular phone number
    * @param cellPhoneCarrier The cellular service provider
    * @param businessPhone The business phone number
    * @param role The account role (default: MEMBER)
    * @param platforms Comma separated list of development platforms
    * @param tags Search tags
    * @param aboutUs About us information
    * @param gameExperience Game experience of the user
    * @param categoryIds A list of category ids that represent interests and associations
    * @param hometown The user&#39;s hometown
    * @param height The user&#39;s height
    * @param heightIndex The user&#39;s height in a numerical value that can be used for ordering/searching
    * @param ethnicity The user&#39;s ethnicity
    * @param bodyType The user&#39;s body type
    * @param maritalStatus The user&#39;s marital status
    * @param children The user&#39;s children status
    * @param religion The user&#39;s religion
    * @param education The user&#39;s education
    * @param educationIndex The user&#39;s education in a numerical value that can be used for ordering/searching
    * @param smoke The user&#39;s smoke status
    * @param drink The user&#39;s drink status
    * @param companionship The user&#39;s companionship status
    * @param companionshipIndex The user&#39;s companionship index
    * @param preferredMinAge The preferred minimum age in the account location search
    * @param preferredMaxAge The preferred maximum age in the account location search
    * @param preferredMinHeight The preferred minimum height in the account location search
    * @param preferredMaxHeight The preferred maximum height in the account location search
    * @param preferredGender The preferred gender in the account location search
    * @param preferredEducation The preferred education in the account location search
    * @param preferredEducationIndex The preferred education in a numerical value that can be used for ordering/searching
    * @param preferredBodyType The preferred body type in the account location search
    * @param preferredEthnicity The preferred ethnicity in the account location search
    * @param preferredLocation The preferred location in the account location search
    * @param preferredLocationRange The preferred location range in the account location search
    * @param latitude The current latitude of the user
    * @param longitude The current longitude of the user
    * @param acceptedTerms Accepted Terms
    * @param inviteToken The inviteToken that the referrer used for this account to sign up
    * @param referralAccountId The accountId of the referrer (used if there is no inviteToken)
    * @param sendValidation Whether to send validation email
    * @param gameType Deprecated: use appKey
    * @param appKey The application key
    * @param appVersion The application version
    * @param responseType Returns an AccountLoginResponse if \&quot;AccountLoginResponse\&quot; is passed in
    * @param audienceIdsToAdd Comma separated list of audience ids to assign to the user
    * @param appBlob Application blob data
    * @param appEnablePush Enable push for the app
    * @param appEnableSMS Enable SMS for the app
    * @param appEnableEmail Enable email for the app
    * @param locationVisibility Location visibility setting
    * @param homeLatitude Home latitude
    * @param homeLongitude Home longitude
    * @param appNickname The nickname used in the application for this account
    * @param personalAudienceId Personal audience id to associate with this account
    */
  def createAccount(version: BigDecimal, username: String, password: String, name: Option[String], prefixName: Option[String], firstName: Option[String], middleName: Option[String], lastName: Option[String], suffixName: Option[String], title: Option[String], deviceId: Option[String], deviceIdType: Option[String], emailAddress: Option[String], assetId: Option[Long], streetAddress: Option[String], zipcode: Option[String], gender: Option[String], birthday: Option[Long], homePhone: Option[String], cellPhone: Option[String], cellPhoneCarrier: Option[String], businessPhone: Option[String], role: Option[String], platforms: Option[String], tags: Option[String], aboutUs: Option[String], gameExperience: Option[String], categoryIds: Option[String], hometown: Option[String], height: Option[String], heightIndex: Option[Int], ethnicity: Option[String], bodyType: Option[String], maritalStatus: Option[String], children: Option[String], religion: Option[String], education: Option[String], educationIndex: Option[Int], smoke: Option[String], drink: Option[String], companionship: Option[String], companionshipIndex: Option[Int], preferredMinAge: Option[Int], preferredMaxAge: Option[Int], preferredMinHeight: Option[Int], preferredMaxHeight: Option[Int], preferredGender: Option[String], preferredEducation: Option[String], preferredEducationIndex: Option[Int], preferredBodyType: Option[String], preferredEthnicity: Option[String], preferredLocation: Option[String], preferredLocationRange: Option[Double], latitude: Option[Double], longitude: Option[Double], acceptedTerms: Option[Boolean], inviteToken: Option[String], referralAccountId: Option[Long], sendValidation: Option[Boolean], gameType: Option[String], appKey: Option[String], appVersion: Option[String], responseType: Option[String], audienceIdsToAdd: Option[String], appBlob: Option[String], appEnablePush: Option[Boolean], appEnableSMS: Option[Boolean], appEnableEmail: Option[Boolean], locationVisibility: Option[String], homeLatitude: Option[Double], homeLongitude: Option[Double], appNickname: Option[String], personalAudienceId: Option[Long]): AccountLoginResponse

  /**
    * Update Account
    * Edit the user&#39;s profile information
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param connectionAccountId The account id used to edit another person&#39;s account
    * @param role The account role to change to
    * @param assetId The asset id to set the user&#39;s profile image
    * @param name The full name of the user. If this parameter is NOT empty, the  following parameters will be ignored: prefixName, firstName, middleName,  lastName, and suffixName 
    * @param prefixName If the parameter &#39;name&#39; is empty or not present, this field will be used to set the prefix of the user&#39;s name
    * @param firstName If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s first name
    * @param middleName If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s middle name
    * @param lastName If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s last name
    * @param suffixName If the parameter &#39;name&#39; is empty or not present, this field will be used to set the suffix of the user&#39;s name
    * @param title This field will be used to set the user&#39;s job title
    * @param gender The gender of the user AudienceGender
    * @param age This is deperecated, use the birthday parameter
    * @param birthday The birthday date of the user in UTC milliseconds
    * @param homePhone The home phone number
    * @param cellPhone The cellular phone number
    * @param cellPhoneCarrier The cellular service provider
    * @param businessPhone The business phone number
    * @param emailAddress The user&#39;s contact email address (NOT the username)
    * @param streetAddress The street address of the user&#39;s contact location
    * @param streetAddress2 Additional address information (such as a suite number, floor number, building name, or PO Box)
    * @param city The city of the user&#39;s contact location
    * @param state The state of the user&#39;s contact location
    * @param zipcode The zipcode of the user&#39;s contact location
    * @param country The country of the user&#39;s contact location
    * @param makeProfileInfoPublic Allow anyone to view the user&#39;s personal profile
    * @param makeGameInfoPublic Allow anyone to view the user&#39;s game/app info
    * @param makeFriendsInfoPublic Allow anyone to view the user&#39;s friends list
    * @param hometown The user&#39;s hometown
    * @param height The user&#39;s height
    * @param heightIndex The user&#39;s height in a numerical value that can be used for ordering/searching
    * @param ethnicity The user&#39;s ethnicity
    * @param bodyType The user&#39;s body type
    * @param maritalStatus The user&#39;s marital status
    * @param children The user&#39;s children status
    * @param religion The user&#39;s religion
    * @param education The user&#39;s education
    * @param educationIndex The user&#39;s education in a numerical value that can be used for ordering/searching
    * @param smoke The user&#39;s smoke status
    * @param drink The user&#39;s drink status
    * @param companionship The user&#39;s companionship status
    * @param companionshipIndex The user&#39;s companionship index
    * @param preferredMinAge The preferred minimum age in the account location search
    * @param preferredMaxAge The preferred maximum age in the account location search
    * @param preferredMinHeight The preferred minimum height in the account location search
    * @param preferredMaxHeight The preferred maximum height in the account location search
    * @param preferredGender The preferred gender in the account location search
    * @param preferredEducation The preferred education in the account location search
    * @param preferredEducationIndex The preferred education in a numerical value that can be used for ordering/searching
    * @param preferredBodyType The preferred body type in the account location search
    * @param preferredEthnicity The preferred ethnicity in the account location search
    * @param preferredLocation The preferred education in the account location search
    * @param preferredLocationRange The preferred location range in the account location search
    * @param platforms Platforms
    * @param tags Tags
    * @param aboutUs About Us
    * @param matchToken Match Token
    * @param gameExperience Game Experience
    * @param categories Deprecated use categoryIds
    * @param categoryIds A list of category ids that represent interests and associations
    * @param responseFilters A comma separated list of ProfileFilters for filtering the returned response data
    * @param showAsZipcode The user&#39;s preference if they want to be shown by zipcode on a map
    * @param showExactLocation The user&#39;s preference if they want to be shown by their exact location on a map
    * @param showOthersExactLocation The user&#39;s preference if they want to see others exact location on a map
    * @param acceptedTerms Accepted Terms
    * @param locationVisibility Location Visibility
    * @param appBlob App Blob
    * @param appEnablePush App Enable Push
    * @param appEnableSMS App Enable SMS
    * @param appEnableEmail App Enable Email
    * @param gameType Game Type
    * @param appKey The application key
    * @param latitude The current latitude of the user
    * @param longitude The current longitude of the user
    * @param returnProfile Return Profile
    * @param audienceIdsToAdd Audience Ids to add
    * @param audienceIdsToRemove Audience Ids to remove
    * @param referralAccountId The account id of the referrer
    * @param appNickname App nickname
    * @param personalAudienceId Personal Audience
    * @param nonGuestUsername The user&#39;s username to update with if they currently have a guest username
    */
  def editAccount(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], connectionAccountId: Option[Long], role: Option[String], assetId: Option[Long], name: Option[String], prefixName: Option[String], firstName: Option[String], middleName: Option[String], lastName: Option[String], suffixName: Option[String], title: Option[String], gender: Option[String], age: Option[Int], birthday: Option[Long], homePhone: Option[String], cellPhone: Option[String], cellPhoneCarrier: Option[String], businessPhone: Option[String], emailAddress: Option[String], streetAddress: Option[String], streetAddress2: Option[String], city: Option[String], state: Option[String], zipcode: Option[String], country: Option[String], makeProfileInfoPublic: Option[Boolean], makeGameInfoPublic: Option[Boolean], makeFriendsInfoPublic: Option[Boolean], hometown: Option[String], height: Option[String], heightIndex: Option[Int], ethnicity: Option[String], bodyType: Option[String], maritalStatus: Option[String], children: Option[String], religion: Option[String], education: Option[String], educationIndex: Option[Int], smoke: Option[String], drink: Option[String], companionship: Option[String], companionshipIndex: Option[Int], preferredMinAge: Option[Int], preferredMaxAge: Option[Int], preferredMinHeight: Option[Int], preferredMaxHeight: Option[Int], preferredGender: Option[String], preferredEducation: Option[String], preferredEducationIndex: Option[Int], preferredBodyType: Option[String], preferredEthnicity: Option[String], preferredLocation: Option[String], preferredLocationRange: Option[Double], platforms: Option[String], tags: Option[String], aboutUs: Option[String], matchToken: Option[String], gameExperience: Option[String], categories: Option[String], categoryIds: Option[String], responseFilters: Option[String], showAsZipcode: Option[Boolean], showExactLocation: Option[Boolean], showOthersExactLocation: Option[Boolean], acceptedTerms: Option[Boolean], locationVisibility: Option[String], appBlob: Option[String], appEnablePush: Option[Boolean], appEnableSMS: Option[Boolean], appEnableEmail: Option[Boolean], gameType: Option[String], appKey: Option[String], latitude: Option[Double], longitude: Option[Double], returnProfile: Option[Boolean], audienceIdsToAdd: Option[String], audienceIdsToRemove: Option[String], referralAccountId: Option[Long], appNickname: Option[String], personalAudienceId: Option[Long], nonGuestUsername: Option[String]): ProfileInfoResponse

  /**
    * Update Username and Email
    * Update account&#39;s own username and/or emailAddress
    * @param deviceId The device id
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param emailAddress the user&#39;s contact email address (NOT the username) which is also used for email validation
    * @param username the user&#39;s username to update with if they currently have a guest username
    */
  def editUsername(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], emailAddress: Option[String], username: Option[String]): SirqulResponse

  /**
    * Get Account
    * Gets a user&#39;s account profile. Application settings and account settings will also be returned for the owner of the account.
    * @param returnNulls Return Nulls
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param connectionAccountEmail Connection Account Email
    * @param connectionAccountId The account id used to view another person&#39;s account
    * @param responseFilters A comma separated list of ProfileFilters for filtering the returned response data
    * @param gameType Game Type
    * @param appKey The application key
    * @param purchaseType Purchase Type
    * @param updateViewedDate Determines whether to track if a person has viewed someone&#39;s profile
    * @param latitude Latitude used to update the user&#39;s current location
    * @param longitude Longitude used to update the user&#39;s current location
    */
  def getAccount(version: BigDecimal, returnNulls: Option[Boolean], deviceId: Option[String], accountId: Option[Long], connectionAccountEmail: Option[String], connectionAccountId: Option[Long], responseFilters: Option[String], gameType: Option[String], appKey: Option[String], purchaseType: Option[String], updateViewedDate: Option[Boolean], latitude: Option[Double], longitude: Option[Double]): ProfileResponse

  /**
    * Get Profile Assets
    * Get a list of assets a person has ever uploaded. Filters the list based on parameters.
    * @param returnNulls Determines whether to return null fields in the response
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param ownerId The account id of the person the user wants to view
    * @param mediaTypes Comma separated list of MediaType
    * @param mimeTypes Comma separated list of mime types
    * @param sortField Determines what the returning list will be sorted by (see AssetApiMap)
    * @param descending Determines whether to return the resulting list in descending or ascending order
    * @param latitude Latitude used to update the user&#39;s current location
    * @param longitude Longitude used to update the user&#39;s current location
    * @param i _i
    * @param start Start of the pagination
    * @param l _l
    * @param limit Limit of the pagination
    */
  def getProfileAssets(version: BigDecimal, returnNulls: Option[Boolean], deviceId: Option[String], accountId: Option[Long], ownerId: Option[Long], mediaTypes: Option[String], mimeTypes: Option[String], sortField: Option[String], descending: Option[Boolean], latitude: Option[Double], longitude: Option[Double], i: Option[Int], start: Option[Int], l: Option[Int], limit: Option[Int]): AssetListResponse

  /**
    * Search Accounts
    * Gets a user&#39;s account profile and their referral List.
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param appKey The application key
    * @param retrieveType one of these option - GET_CHILDREN will get all accounts that had signed up using the current account invite link - GET_ANCESTOR will get all accounts that referred the current account and it&#39;s parents, recursively - GET_ALL will get all of the above
    * @param levelLimit level limit for children and ancestors of current account, starts from current account
    * @param ancestorLevelLimit level limit for ancestors, will override levelLimit if this is set
    * @param childrenLevelLimit level limit for children, will override levelLimit if this is set
    * @param ancestorListStart pagination start for children list
    * @param ancestorListLimit pagination limit for children list
    * @param childrenListStart pagination start for children list
    * @param childrenListLimit pagination limit for children list
    * @param childrenChildren if true, on each item in ancestor and children list, return the childrenTotalNumber and ancestorTotalNumber for that item
    */
  def getReferralList(version: BigDecimal, accountId: Option[Long], appKey: Option[String], retrieveType: Option[String], levelLimit: Option[BigDecimal], ancestorLevelLimit: Option[BigDecimal], childrenLevelLimit: Option[BigDecimal], ancestorListStart: Option[BigDecimal], ancestorListLimit: Option[BigDecimal], childrenListStart: Option[BigDecimal], childrenListLimit: Option[BigDecimal], childrenChildren: Option[Boolean]): Unit

  /**
    * Get Account Settings
    * Get the account settings for a user
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param latitude The current latitude of the user
    * @param longitude The current longitude of the user
    */
  def getSettings(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double]): UserSettingsResponse

  /**
    * Login as Account
    * A login service that supports logging in as someone else (accounts that the user manages). Intended for internal use for now.
    * @param networkUID The access provider to authenticate against (default: USERNAME). Supported values: FACEBOOK, TWITTER, USERNAME, PHONE
    * @param ageRestriction Checks user&#39;s birthday to see if they meet an age requirement. If the user is under age, an error message is returned.
    * @param responseFilters This determines how much of the profile should be returned, see ProfileFilters
    */
  def loginDelegate(version: BigDecimal, accessToken: String, appKey: String, deviceId: Option[String], accessTokenSecret: Option[String], delegatedAccountId: Option[Long], delegatedUsername: Option[String], networkUID: Option[String], ageRestriction: Option[Int], responseFilters: Option[String], latitude: Option[Double], longitude: Option[Double]): ProfileResponse

  /**
    * Login Account
    * General login service that supports various authentication methods. Currently supports Facebook, Twitter, Sirqul Username, and Sirqul Phone by default. Can also support custom networks created using the {@link ThirdPartyApi}
    * @param accessToken The access token to authenticate with (ex: username or fb token)
    * @param networkUID The access provider to authenticate against. This can be custom  networks created using the ThirdPartyApi as well. Supported values by default  include: FACEBOOK, TWITTER, USERNAME, PHONE 
    * @param appKey The application key
    * @param deviceId The unique id of the device making the request
    * @param deviceIdType The type of device id (this is defined by the client), ie. MAC_ADDRESS, APPLE_UDID, etc
    * @param accessTokenSecret The secret to authenticate with (ex: password)
    * @param ageRestriction Checks user&#39;s birthday to see if they meet an age requirement. If the user is under age, an error message is returned.
    * @param responseFilters This determines how much of the profile should be returned, see ProfileFilters
    * @param latitude Used to update the user&#39;s current location
    * @param longitude Used to update the user&#39;s current location
    * @param emailMatch Option to check for email if username doesn&#39;t match, also support multiple accounts
    * @param chosenAccountId Chosen account Id sent from the app - pass in the 2nd request to choose an account from multiple accounts matching the email - use one of the account id from the previous request
    * @param thirdPartyCredentialId Third-party credential Id, pass in the 2nd request to choose an account from multiple accounts matching the email - use the id from the previous call ThirdPartyCredential object
    */
  def loginGeneral(version: BigDecimal, accessToken: String, networkUID: String, appKey: String, deviceId: Option[String], deviceIdType: Option[String], accessTokenSecret: Option[String], ageRestriction: Option[Int], responseFilters: Option[String], latitude: Option[Double], longitude: Option[Double], emailMatch: Option[Boolean], chosenAccountId: Option[Long], thirdPartyCredentialId: Option[Long]): ProfileResponse

  /**
    * Login Account (Username)
    * Login to system with an account
    * @param username the user&#39;s email address they used to sign-up
    * @param password the password
    * @param deviceId the device id
    * @param latitude the current latitude of the user
    * @param longitude the current longitude of the user
    * @param app the app
    * @param gameType This parameter is deprecated. This is deprecated, use appKey.
    * @param appKey the application key
    * @param returnProfile the profile to return
    * @param responseFilters a comma separated list of ProfileFilters for filtering the returned response data
    */
  def loginUsername(version: BigDecimal, username: String, password: String, deviceId: Option[String], latitude: Option[Double], longitude: Option[Double], app: Option[String], gameType: Option[String], appKey: Option[String], returnProfile: Option[Boolean], responseFilters: Option[String]): ProfileResponse

  /**
    * Logout Account
    * Cleans up the users data for logging out.
    * @param deviceId The device id (deviceId or accountId required)
    * @param deviceIdType Device Id Type
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param latitude The current latitude of the user
    * @param longitude The current longitude of the user
    */
  def logout(version: BigDecimal, deviceId: Option[String], deviceIdType: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double]): SirqulResponse

  /**
    * Merge Account
    * Merges the analytics, achievements, leaderboards of two accounts.
    * @param mergeAccountId The id of the account to being merged
    * @param appKey The application key
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    */
  def mergeAccount(version: BigDecimal, mergeAccountId: Long, appKey: String, deviceId: Option[String], accountId: Option[Long]): SirqulResponse

  /**
    * Update Password
    * Update the account password.
    * @param accountId The account to update
    * @param oldPassword The current password, used to validate access
    * @param newPassword The new password to set, cannot be empty
    * @param confirmPassword The new password to confirm, must match newPassword
    */
  def passwordChange(version: BigDecimal, accountId: Long, oldPassword: String, newPassword: String, confirmPassword: String): SirqulResponse

  /**
    * Reset Password
    * Reset the account password. The token must be valid and not expired. Use the RequestPasswordReset end point to request a token.
    * @param token The token associated with the account to update, good for 24 hours
    * @param password The new password to set, cannot be empty
    * @param confirm The new password to confirm, must match newPassword
    */
  def passwordReset(version: BigDecimal, token: String, password: String, confirm: String): SirqulResponse

  /**
    * Request Password Reset
    * Request that an account password be reset. The account is looked up by email address and then a link is sent via email to that account with a reset token. The token is valid for 24 hours.
    * @param email The email/username of the account
    * @param from this is the sender email
    * @param domain this is the domain (like dev.sirqul.com) used to generate the password reset link
    * @param subUrl this is the the subUrl (like resetpassword) used to generate a password reset link
    * @param referer this is used to generate a password reset link
    */
  def requestPasswordReset(version: BigDecimal, email: String, from: Option[String], domain: Option[String], subUrl: Option[String], referer: Option[String]): SirqulResponse

  /**
    * Send Validation Request
    * Send an email to validate a user&#39;s account.
    * @param accountId The account id of the user
    */
  def requestValidateAccount(version: BigDecimal, accountId: Long): SirqulResponse

  /**
    * Search Accounts
    * Search for account profiles.
    * @param accountId The id of the account requesting
    * @param appKey The application key
    * @param keyword The keyword for for querying the account
    * @param latitude the latitude
    * @param longitude the longitude
    * @param radius the radius
    * @param gender the user&#39;s gender
    * @param gameExperience the user&#39;s Game Experience
    * @param age the user&#39;s age
    * @param categoryIds the user&#39;s Category Ids
    * @param returnNulls Return Nulls
    * @param responseFilters A comma separated list of ProfileFilters for filtering the returned response data
    * @param purchaseType A comma separated list of PurchaseType
    * @param sortField The field to sort by
    * @param descending The order to return the results. Default is false, which will return the results in ascending order.
    * @param start The index into the record set to start with.
    * @param limit The total number of record to return.
    * @param activeOnly Determines whether to return only active results. Default is false.
    */
  def searchAccounts(version: BigDecimal, accountId: Long, appKey: String, keyword: Option[String], latitude: Option[Double], longitude: Option[Double], radius: Option[Double], gender: Option[String], gameExperience: Option[String], age: Option[Int], categoryIds: Option[String], returnNulls: Option[Boolean], responseFilters: Option[String], purchaseType: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], activeOnly: Option[Boolean]): List[ProfileResponse]

  /**
    * Login Account (Encrypted Username)
    * ogin with encrypted user-name and password.
    * @param username The user&#39;s encrypted email address they used to sign-up
    * @param password The encrypted password
    * @param gameType The application key
    * @param deviceId The device id
    * @param charsetName Charset Name
    * @param latitude The current latitude of the user
    * @param longitude The current longitude of the user
    * @param returnProfile Return Profile
    * @param responseFilters A comma separated list of ProfileFilters for filtering the returned response data
    */
  def secureLogin(version: BigDecimal, username: String, password: String, gameType: String, deviceId: Option[String], charsetName: Option[String], latitude: Option[Double], longitude: Option[Double], returnProfile: Option[Boolean], responseFilters: Option[String]): ProfileResponse

  /**
    * Create Account (Encrypted Username)
    * Create a new account by role (with encrypted user-name and password)
    * @param deviceId The device id
    * @param username The encrypted email of the user, this is what will be used when they login
    * @param password The encrypted password of the user
    * @param name The full name of the user. If this parameter is not empty, the  following parameters will be ignored: prefixName, firstName, middleName,  lastName, and suffixName 
    * @param inviteToken the inviteToken that the referrer use for this account to sign up
    * @param prefixName If the parameter &#39;name&#39; is empty or not present, this field will be used to set the prefix of the user&#39;s name
    * @param firstName If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s first name
    * @param middleName If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s middle name
    * @param lastName If the parameter &#39;name&#39; is empty or not present, this field will be used to set the user&#39;s last name
    * @param suffixName If the parameter &#39;name&#39; is empty or not present, this field will be used to set the suffix of the user&#39;s name
    * @param title Title
    * @param deviceIdType Device Id Type
    * @param emailAddress The user&#39;s contact email address (NOT the username) which is also used for email validation
    * @param assetId The asset id to set the user&#39;s profile image
    * @param address the user&#39;s address
    * @param zipcode The street zipcode of the user&#39;s contact location
    * @param gender The gender of the user AudienceGender
    * @param birthday The birthday date of the user in milliseconds
    * @param homePhone the user&#39;s home phone number
    * @param cellPhone the user&#39;s cell phone number
    * @param cellPhoneCarrier the user&#39;s Cell Phone Carrier
    * @param businessPhone the user&#39;s Business Phone Number
    * @param role The type of account being created {RETAILER, MEMBER, DEVELOPER, GUEST
    * @param platforms Comma separated list of development platforms: MAC, WINDOWS, IOS, ANDROID, WINDOWSPHONE, KINDLE, UNITY3D, COCOS2D, HTML5, FACEBOOK
    * @param tags Search tags
    * @param aboutUs About Us information
    * @param gameExperience Game experience level of the user {ANY, NEW, BEGINNER, INTERMEDIATE, EXPERT
    * @param categoryIds A list of category ids that represent interests and associations
    * @param hometown The user&#39;s hometown
    * @param height The user&#39;s height
    * @param heightIndex The user&#39;s height in a numerical value that can be used for ordering/searching
    * @param ethnicity The user&#39;s ethnicity
    * @param bodyType The user&#39;s body type
    * @param maritalStatus The user&#39;s maritial status
    * @param children The user&#39;s children status
    * @param religion The user&#39;s religion
    * @param education The user&#39;s education
    * @param educationIndex The user&#39;s education in a numerical value that can be used for ordering/searching
    * @param smoke The user&#39;s smoke status
    * @param drink The user&#39;s drink status
    * @param companionship The user&#39;s companionship status
    * @param companionshipIndex The user&#39;s companionship index
    * @param preferredMinAge The preferred minimum age in the account location search
    * @param preferredMaxAge The preferred maximum age in the account location search
    * @param preferredMinHeight The preferred minimum height in the account location search
    * @param preferredMaxHeight The preferred maximum height in the account location search
    * @param preferredGender The preferred gender in the account location search
    * @param preferredEducation The preferred education in the account location search
    * @param preferredEducationIndex The preferred education in a numerical value that can be used for ordering/searching
    * @param preferredBodyType The preferred body type in the account location search
    * @param preferredEthnicity The preferred ethnicity in the account location search
    * @param preferredLocation The preferred education in the account location search
    * @param preferredLocationRange The preferred location range in the account location search
    * @param latitude The current latitude of the user
    * @param longitude The current longitude of the user
    * @param acceptedTerms Accepted Terms
    * @param charsetName Charset Name
    * @param gameType Game Type
    * @param appKey The application key
    * @param appVersion App Version
    * @param responseType Response Type
    */
  def secureSignup(version: BigDecimal, deviceId: String, username: String, password: String, name: Option[String], inviteToken: Option[String], prefixName: Option[String], firstName: Option[String], middleName: Option[String], lastName: Option[String], suffixName: Option[String], title: Option[String], deviceIdType: Option[String], emailAddress: Option[String], assetId: Option[Long], address: Option[String], zipcode: Option[String], gender: Option[String], birthday: Option[Long], homePhone: Option[String], cellPhone: Option[String], cellPhoneCarrier: Option[String], businessPhone: Option[String], role: Option[String], platforms: Option[String], tags: Option[String], aboutUs: Option[String], gameExperience: Option[String], categoryIds: Option[String], hometown: Option[String], height: Option[String], heightIndex: Option[Int], ethnicity: Option[String], bodyType: Option[String], maritalStatus: Option[String], children: Option[String], religion: Option[String], education: Option[String], educationIndex: Option[Int], smoke: Option[String], drink: Option[String], companionship: Option[String], companionshipIndex: Option[Int], preferredMinAge: Option[Int], preferredMaxAge: Option[Int], preferredMinHeight: Option[Int], preferredMaxHeight: Option[Int], preferredGender: Option[String], preferredEducation: Option[String], preferredEducationIndex: Option[Int], preferredBodyType: Option[String], preferredEthnicity: Option[String], preferredLocation: Option[String], preferredLocationRange: Option[Double], latitude: Option[Double], longitude: Option[Double], acceptedTerms: Option[Boolean], charsetName: Option[String], gameType: Option[String], appKey: Option[String], appVersion: Option[String], responseType: Option[String]): ProfileInfoResponse

  /**
    * Save Match Token
    * Save user&#39;s match token to be used for profile match making
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param matchToken A string of numbers
    * @param gameType Game Type (deprecated)
    * @param appKey The application key
    * @param latitude The current latitude of the user
    * @param longitude The current longitude of the user
    */
  def setMatchToken(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], matchToken: Option[String], gameType: Option[String], appKey: Option[String], latitude: Option[Double], longitude: Option[Double]): SirqulResponse

  /**
    * Update Account Active Status
    * Activate or deactivate an account (requires appropriate permissions).
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param connectionAccountId The account id of the user you want to modify (if this is not set, then the accountId parameter will be used instead)
    * @param active true will activate the user and false will deactivate
    * @param deviceId the device id (deviceId or accountId required)
    * @param appKey the application key that the user belongs to
    */
  def updateActveStatus(version: BigDecimal, accountId: Long, connectionAccountId: Long, active: Boolean, deviceId: Option[String], appKey: Option[String]): SirqulResponse

  /**
    * Update Location
    * Update the account location
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param latitude The current latitude of the user
    * @param longitude The current longitude of the user
    * @param clientTime The time of the update
    */
  def updateLocation(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double], clientTime: Option[Long]): SirqulResponse

  /**
    * Update Account Settings
    * Update the account settings for a user
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param blockedNotifications The notifications to be blocked
    * @param suggestionMethod How suggestions are to be sent (APNS, MOBILE_NOTIFICATION, SMS)
    * @param suggestionCount How many suggestions to receive per time frame
    * @param suggestionTimeFrame The time frame in seconds, 3600 would be a 1 hour time frame
    * @param showOthersExactLocation Show Others Exact Location
    * @param showAsZipcode Show As Zipcode
    * @param showExactLocation Show Exact Location
    * @param favoriteVisibility Show favorites
    * @param latitude The current latitude of the user
    * @param longitude The current longitude of the user
    */
  def updateSettings(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], blockedNotifications: Option[String], suggestionMethod: Option[String], suggestionCount: Option[Int], suggestionTimeFrame: Option[Int], showOthersExactLocation: Option[Boolean], showAsZipcode: Option[Boolean], showExactLocation: Option[Boolean], favoriteVisibility: Option[String], latitude: Option[Double], longitude: Option[Double]): UserSettingsResponse

  /**
    * Save Validation Status
    * Validate the account&#39;s email address. The token must be valid and not expired. Use the RequestValidateAccount end point to request a new token.
    * @param token The token associated with the account to update, good for 24 hours
    */
  def validateAccountSignup(version: BigDecimal, token: String): AccountLoginResponse

  /**
    * Validate Password Reset Token
    * Validate the password reset token. The token must be valid and not expired. Use the RequestPasswordReset end point to request a token. The user receives and email with the reset page, therefore it should be validated before bwing used to reset the password.
    * @param token The token associated with the account to update, good for 24 hours
    */
  def validatePasswordReset(version: BigDecimal, token: String): SirqulResponse
}
