package api

import play.api.libs.json._
import model.AccountListResponse
import model.ApplicationResponse
import model.ApplicationSettingsResponse
import model.ApplicationShortResponse
import model.BigDecimal
import model.PlacementResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait ApplicationApi {
  /**
    * Create Application
    * Create an application record and one placement record for that application. You can create more placements for this application by using {@link createApplicationPlacement}.
    * @param appName The name of the application
    * @param deviceId The unique id of the device making the request (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param about The description of the application
    * @param bundleId The application bundle identifier (format - com.company.appName)
    * @param appIconAssetId The application icon asset id
    * @param appLogoAssetId The application logo asset id
    * @param facebookAppId The Facebook application id
    * @param facebookAppSecret The Facebook application secret
    * @param googleApiKey This is the either the &#39;server key&#39; or &#39;browser key&#39; generated from google to enable Google Cloud Messaging
    * @param updateEULADate Determines whether to update the EULA date
    * @param eulaVersion The EULA version
    * @param landingPageUrl The landing page URL
    * @param showInActivities Determines whether to show the application in the activity feed
    * @param activityDescription The description of the application in the activity feed
    * @param inviteWelcomeText The text to display on the invite page
    * @param invitePageUrl The url to the application invite page
    * @param urlScheme The protocal the app uses to load the app via a browser
    * @param platforms A json object with a list of supported platforms.  &#x60;&#x60;&#x60;json {   \&quot;platforms\&quot;: [     {       \&quot;deviceId\&quot;: 1,       \&quot;minimum\&quot;: 230,       \&quot;maximum\&quot;: 421,       \&quot;downloadUrl\&quot;: \&quot;http://app.store.com/download\&quot;,       \&quot;description\&quot;: \&quot;description and version info\&quot;     }   ] } &#x60;&#x60;&#x60; 
    * @param downloadUrls Json formatted downloadUrls.  &#x60;&#x60;&#x60;json {   \&quot;ios\&quot;: \&quot;the-url-to-app-store\&quot;,    \&quot;android\&quot;: \&quot;the-url-to-google-play\&quot; } &#x60;&#x60;&#x60;  
    * @param categoryIds List of categories to apply
    * @param scoringType The type of scoring this application will use {GAME_LEVEL, GAME_OBJECT
    * @param hintCost The cost of hints
    * @param maxScore The maximum score that will be possible
    * @param ticketsPerPoint The point-to-ticket conversion ratio
    * @param hasGameData Determines whether the application uses services to save custom game objects
    * @param publicNotifications Public Notifications
    * @param useMatchingAlgorithm Use Matching Algorithm
    * @param globalTickets Determines whether earned tickets are applied across all applications
    * @param buildVersion The current build version of the application
    * @param apiVersion The current API version the application uses
    * @param placementName The name of the placement
    * @param placementDescription The description of the placement
    * @param placementSize The ad placement size {BANNER, LEADERBOARD, SKYSCRAPER, INTERSTITIAL, CUSTOM (this is required if a placements is to be created)
    * @param placementHeight The height of a custom ad size
    * @param placementWidth The width of a custom ad size
    * @param placementRefreshInterval The refresh interval in seconds
    * @param createObjectStore Generate a custom object store to use
    * @param publicContentApproval Determine whether or not public content requires admin approval before it becomes public
    * @param productionMode Determines whether the application uses production or sandbox services
    * @param minimumSessionLength Minimum Session Length
    * @param sessionGapLength Session Gap Length
    * @param localAdsEnabled Local Ads Enabled
    * @param sqootApiKey Sqoot Api Key
    * @param trilatProcessingType Determines how to process trilateration data. Possible values include: DEFAULT, FINGERPRINT
    * @param maxSampleSize Determines what the maximum sample size during trilateration
    * @param minRSSI Determines what the minimum acceptable RSSI value
    * @param modules List modules allowed to be served by the server, possible values include: COMMON, MEDIA, OFFER, GAME, SOCIAL, CONSUMER_WEBSITE, ALL
    * @param authorizedCount How many servers the license will support
    * @param authorizedServers The list of ip addresses of servers the license will support, leave null for any server
    * @param defaultTimezone Sets the default timezone for the app (used for leaderboards and other time specific content)
    * @param smtpPass SMTP Pass
    * @param metaData The application meta data. Defined by the client
    * @param placementMetaData The ad placement meta data. Defined by the client
    * @param ipsFloor Create floor tables for Ips
    * @param enableAPNSBadge Enables setting the APNS badge value in the payload
    * @param includeInReport Enables using the application in session reports
    * @param defaultAppFilterId Sets the default filter to use (if none is passed in) for certain search APIs including Album Search.
    * @param enableWelcomeEmail Enables whether the default welcome email will be sent for new app users
    * @param appleAppId The Apple Application ID
    * @param appleTeamId The Apple Team ID
    * @param appleAuthKeyId The Apple Auth Key ID
    * @param appleAuthKey The Apple Auth Signin Key (p8) File
    * @param appleIssuerId The Apple Issuer ID
    * @param appStoreKeyId The Apple App Store Key ID
    * @param appStoreKey The Apple App Store Key (p8) File
    * @param googlePrivateKeyFile This is the private key file for your Google service account.
    * @param authorizeNetApiKey Authorize Net Api Key
    * @param authorizeNetTransactionKey Authorize Net Transaction Key
    * @param emailSender Email Sender
    * @param smtpUser SMTP User
    * @param smtpHost SMTP Host
    * @param vatomBusinessId Vatom Business Id
    * @param vatomRestClientId Vatom REST Client Id
    * @param vatomRestSecretKey Vatom Secret Key
    * @param twilioAccountSID Twilio Account SID
    * @param twilioAuthToken Twilio Auth Token
    * @param twilioSenderPhoneNumber Twilio Sender Phone Number
    * @param openAISecretKey OpenAI Secret API Key
    */
  def createApplication(version: BigDecimal, appName: String, deviceId: Option[String], accountId: Option[Long], about: Option[String], bundleId: Option[String], appIconAssetId: Option[Long], appLogoAssetId: Option[Long], facebookAppId: Option[String], facebookAppSecret: Option[String], googleApiKey: Option[String], updateEULADate: Option[Boolean], eulaVersion: Option[String], landingPageUrl: Option[String], showInActivities: Option[Boolean], activityDescription: Option[String], inviteWelcomeText: Option[String], invitePageUrl: Option[String], urlScheme: Option[String], platforms: Option[String], downloadUrls: Option[String], categoryIds: Option[String], scoringType: Option[String], hintCost: Option[Int], maxScore: Option[Int], ticketsPerPoint: Option[Float], hasGameData: Option[Boolean], publicNotifications: Option[Boolean], useMatchingAlgorithm: Option[Boolean], globalTickets: Option[Boolean], buildVersion: Option[Float], apiVersion: Option[Float], placementName: Option[String], placementDescription: Option[String], placementSize: Option[String], placementHeight: Option[Int], placementWidth: Option[Int], placementRefreshInterval: Option[Int], createObjectStore: Option[Boolean], publicContentApproval: Option[Boolean], productionMode: Option[Boolean], minimumSessionLength: Option[Int], sessionGapLength: Option[Int], localAdsEnabled: Option[Boolean], sqootApiKey: Option[String], trilatProcessingType: Option[String], maxSampleSize: Option[Int], minRSSI: Option[Double], modules: Option[String], authorizedCount: Option[Int], authorizedServers: Option[String], defaultTimezone: Option[String], smtpPass: Option[String], metaData: Option[String], placementMetaData: Option[String], ipsFloor: Option[Boolean], enableAPNSBadge: Option[Boolean], includeInReport: Option[Boolean], defaultAppFilterId: Option[Long], enableWelcomeEmail: Option[Boolean], appleAppId: Option[String], appleTeamId: Option[String], appleAuthKeyId: Option[String], appleAuthKey: Option[TemporaryFile], appleIssuerId: Option[String], appStoreKeyId: Option[String], appStoreKey: Option[TemporaryFile], googlePrivateKeyFile: Option[TemporaryFile], authorizeNetApiKey: Option[String], authorizeNetTransactionKey: Option[String], emailSender: Option[String], smtpUser: Option[String], smtpHost: Option[String], vatomBusinessId: Option[String], vatomRestClientId: Option[String], vatomRestSecretKey: Option[String], twilioAccountSID: Option[String], twilioAuthToken: Option[String], twilioSenderPhoneNumber: Option[String], openAISecretKey: Option[String]): ApplicationResponse

  /**
    * Create Ad Placement
    * Creates a new ad placement for an application.
    * @param appKey The appKey of the application the ad placement is for
    * @param size The ad placement size {BANNER, LEADERBOARD, SKYSCRAPER, INTERSTITIAL, CUSTOM
    * @param deviceId The unique id of the device making the request (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param name The name of the placement
    * @param description The description of the placement
    * @param height The height of a custom ad size
    * @param width The width of a custom ad size
    * @param refreshInterval The refresh interval in seconds
    * @param defaultImageId Default Image Id
    * @param active Active
    */
  def createApplicationPlacement(version: BigDecimal, appKey: String, size: String, deviceId: Option[String], accountId: Option[Long], name: Option[String], description: Option[String], height: Option[Int], width: Option[Int], refreshInterval: Option[Int], defaultImageId: Option[Long], active: Option[Boolean]): PlacementResponse

  /**
    * Delete Application
    * Set the deleted timestamp to current time. This effectively deletes the application since all queries should ignore any records with a deleted timestamp
    * @param accountId The account used to perform the delete, must have rights to edit the application.
    * @param appKey The key of the application to be deleted
    */
  def deleteApplication(version: BigDecimal, accountId: Option[Long], appKey: Option[String]): SirqulResponse

  /**
    * Delete Ad Placement
    * Deletes an ad placement for an application.
    * @param placementId The id of the placement to delete, the user must have rights to the application the ad placement is for
    * @param deviceId The unique id of the device making the request (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    */
  def deleteApplicationPlacement(version: BigDecimal, placementId: Long, deviceId: Option[String], accountId: Option[Long]): PlacementResponse

  /**
    * Get Application
    * Get a specific application by appKey
    * @param appKey The key of the application
    * @param applicationId Application Id
    */
  def getApplication(version: BigDecimal, appKey: Option[String], applicationId: Option[Long]): ApplicationResponse

  /**
    * Get Ad Placement
    * Get details of an ad placement
    * @param placementId The id of the placement
    * @param deviceId The unique id of the device making the request (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    */
  def getApplicationPlacement(version: BigDecimal, placementId: Long, deviceId: Option[String], accountId: Option[Long]): PlacementResponse

  /**
    * Get API versions
    * Will return a comma separated list of numbers, newest first. For example: 3.0, 2.2, 2.1, 1.8
    */
  def getApplicationVersions(version: BigDecimal): SirqulResponse

  /**
    * Search Application Users
    * Get a list of users per application
    * @param appKey The application key
    * @param q Q
    * @param keyword The keyword used to search
    * @param since Return accounts that have been active after this date (UNIX time-stamp in milliseconds)
    * @param i the start of the index
    * @param start The start of the pagination
    * @param l the limit of the index
    * @param limit The limit of the pagination
    */
  def getUniqueUsersByApp(version: BigDecimal, appKey: String, q: Option[String], keyword: Option[String], since: Option[Long], i: Option[Int], start: Option[Int], l: Option[Int], limit: Option[Int]): AccountListResponse

  /**
    * List Applications
    * List active applications matching the criteria (as a consumer)
    * @param accountId The account id of the application owner/manager
    * @param q Q
    * @param keyword The keyword used to search for title, about, and description fields
    * @param platforms Deprecated, use deviceIds and deviceVersions
    * @param deviceIds The list of targeted device ids, comma separated; possible values are retreived via /api/{version/audience/devices com.sirqul.geoapps.common.service.AudienceApi#getDevices getDevices (pass in deviceId values)
    * @param deviceVersions The list of targeted device version ranges that are aligned  with the provided devices list (see devices param for possible values),  comma separated; examples are: 2.3-X, 0-5.1.4, 4.3.1-6.1.4 where X  is no maximum and 0 is no minimum. 
    * @param categoryIds The list of category ids to filter the list by
    * @param sortField The column to sort the search on, possible values include: UPDATED (default), CREATED, TITLE
    * @param hasAds Filter results on whether the application supports ads or not. Ignore this parameter to return all results.
    * @param publicNotifications Filter results on whether the application is available for public trigger notifications
    * @param filterBillable Determines whether to only return applications that the user has access to
    * @param filterContentAdmin Determines whether to only return applications that the user is a content admin of
    * @param descending The order to return the search results
    * @param i the start of the index
    * @param start The start of the pagination
    * @param l The limit of the index
    * @param limit The limit of the pagination
    * @param applicationIds The list of application ids, comma separated. If provided will ignore all other params.
    * @param hasObjectStore Only include applications with a object store (default is false)
    * @param activeOnly Return only active results
    */
  def listApplications(version: BigDecimal, accountId: Option[Long], q: Option[String], keyword: Option[String], platforms: Option[String], deviceIds: Option[String], deviceVersions: Option[String], categoryIds: Option[String], sortField: Option[String], hasAds: Option[Boolean], publicNotifications: Option[Boolean], filterBillable: Option[Boolean], filterContentAdmin: Option[Boolean], descending: Option[Boolean], i: Option[Int], start: Option[Int], l: Option[Int], limit: Option[Int], applicationIds: Option[String], hasObjectStore: Option[Boolean], activeOnly: Option[Boolean]): List[ApplicationShortResponse]

  /**
    * Search for Ad Placements
    * Searches placements for an application.
    * @param appKey The key of the application
    * @param deviceId The unique id of the device making the request (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param start The start of the pagination
    * @param limit The limit of the pagination
    */
  def searchApplicationPlacement(version: BigDecimal, appKey: String, deviceId: Option[String], accountId: Option[Long], start: Option[Int], limit: Option[Int]): List[PlacementResponse]

  /**
    * Search for Application Settings
    * Returns a list of applications that the user has logged into before, and returns specific settings for that application and user
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param connectionAccountId The account id used to view another person&#39;s account
    * @param keyword The string to search applications on
    * @param sortField The column to sort the search on. Possible values include: CREATED, UPDATED, APPLICATION_TITLE
    * @param descending The order to return the search results
    * @param start The start index for pagination
    * @param limit The limit per result set for pagination
    */
  def searchApplicationSettings(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], connectionAccountId: Option[Long], keyword: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int]): ApplicationSettingsResponse

  /**
    * Search Applications
    * Search for applications matching the criteria that the logged in user has access to
    * @param deviceId The unique id of the device making the request (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param latitude The location of the device
    * @param longitude The location of the device
    * @param q Q
    * @param keyword The keyword used to search
    * @param qSearchFields The columns to applied the keyword search to
    * @param sortField The column to sort the search on
    * @param descending The order to return the search results
    * @param i the start of the index
    * @param start The start of the pagination
    * @param l the limit of the index
    * @param limit The limit of the pagination
    * @param hasAds Filter results on whether the application supports ads or not. Ignore this parameter to return all results.
    * @param publicNotifications Filter results on whether the application is available for public trigger notifications
    * @param activeOnly Return only active results
    */
  def searchApplications(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double], q: Option[String], keyword: Option[String], qSearchFields: Option[String], sortField: Option[String], descending: Option[Boolean], i: Option[Int], start: Option[Int], l: Option[Int], limit: Option[Int], hasAds: Option[Boolean], publicNotifications: Option[Boolean], activeOnly: Option[Boolean]): List[ApplicationResponse]

  /**
    * Update Application
    * Update an application record
    * @param appKey The application key for updating an existing application
    * @param appName The name of the application
    * @param deviceId The unique id of the device making the request (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param about The description of the application
    * @param bundleId The application bundle identifier (format - com.company.appName)
    * @param appIconAssetId The application icon asset id
    * @param appLogoAssetId The application logo asset id
    * @param facebookAppId The Facebook application id
    * @param facebookAppSecret The Facebook application secret
    * @param googleApiKey This is the either the &#39;server key&#39; or &#39;browser key&#39; generated from google to enable Google Cloud Messaging
    * @param updateEULADate Determines whether to update the EULA date
    * @param eulaVersion The EULA version
    * @param landingPageUrl The landing page URL
    * @param showInActivities Determines whether to show the application in the activity feed
    * @param activityDescription The description of the application in the activity feed
    * @param inviteWelcomeText The text to display on the invite page
    * @param invitePageUrl The url to the application invite page
    * @param urlScheme The protocal the app uses to load the app via a browser
    * @param platforms A json object with a list of supported platforms.  &#x60;&#x60;&#x60;json {   \&quot;platforms\&quot;: [     {       \&quot;deviceId\&quot;: 1,       \&quot;minimum\&quot;: 230,       \&quot;maximum\&quot;: 421,       \&quot;downloadUrl\&quot;: \&quot;http://app.store.com/download\&quot;,       \&quot;description\&quot;: \&quot;description and version info\&quot;     }   ] } &#x60;&#x60;&#x60; 
    * @param downloadUrls Json formatted downloadUrls.  &#x60;&#x60;&#x60;json {   \&quot;ios\&quot;: \&quot;the-url-to-app-store\&quot;,    \&quot;android\&quot;: \&quot;the-url-to-google-play\&quot; } &#x60;&#x60;&#x60;  
    * @param categoryIds List of categories to apply
    * @param scoringType The type of scoring this application will use {GAME_LEVEL, GAME_OBJECT
    * @param hintCost The cost of hints
    * @param maxScore The maximum score that will be possible
    * @param ticketsPerPoint The point-to-ticket conversion ratio
    * @param hasGameData Determines whether the application uses services to save custom game objects
    * @param publicNotifications Public Notifications
    * @param useMatchingAlgorithm Use Matching Algorithm
    * @param globalTickets Determines whether earned tickets are applied across all applications
    * @param buildVersion The current build version of the application
    * @param apiVersion The current API version the application uses
    * @param placementName The name of the placement
    * @param placementDescription The description of the placement
    * @param placementSize The ad placement size {BANNER, LEADERBOARD, SKYSCRAPER, INTERSTITIAL, CUSTOM (this is required if a placements is to be created)
    * @param placementHeight The height of a custom ad size
    * @param placementWidth The width of a custom ad size
    * @param placementRefreshInterval The refresh interval in seconds
    * @param createObjectStore Generate a custom object store to use
    * @param publicContentApproval Determine whether or not public content requires admin approval before it becomes public
    * @param productionMode Determines whether the application uses production or sandbox services
    * @param minimumSessionLength Minimum Session Length
    * @param sessionGapLength Session Gap Length
    * @param localAdsEnabled Local Ads Enabled
    * @param sqootApiKey Sqoot Api Key
    * @param trilatProcessingType Determines how to process trilateration data. Possible values include: DEFAULT, FINGERPRINT
    * @param maxSampleSize Determines what the maximum sample size during trilateration
    * @param minRSSI Determines what the minimum acceptable RSSI value
    * @param modules List modules allowed to be served by the server, possible values include: COMMON, MEDIA, OFFER, GAME, SOCIAL, CONSUMER_WEBSITE, ALL
    * @param authorizedCount How many servers the license will support
    * @param authorizedServers The list of ip addresses of servers the license will support, leave null for any server
    * @param defaultTimezone Sets the default timezone for the app (used for leaderboards and other time specific content)
    * @param smtpPass SMTP Pass
    * @param metaData The application meta data. Defined by the client
    * @param placementMetaData The ad placement meta data. Defined by the client
    * @param ipsFloor Create floor tables for Ips
    * @param enableAPNSBadge Enables setting the APNS badge value in the payload
    * @param includeInReport Enables using the application in session reports
    * @param defaultAppFilterId Sets the default filter to use (if none is passed in) for certain search APIs including Album Search.
    * @param enableWelcomeEmail Enables whether the default welcome email will be sent for new app users
    * @param appleAppId The Apple Application ID
    * @param appleTeamId The Apple Team ID
    * @param appleAuthKeyId The Apple Auth Key ID
    * @param appleAuthKey The Apple Auth Signin Key (p8) File
    * @param appleIssuerId The Apple Issuer ID
    * @param appStoreKeyId The Apple App Store Key ID
    * @param appStoreKey The Apple App Store Key (p8) File
    * @param googlePrivateKeyFile This is the private key file for your Google service account.
    * @param authorizeNetApiKey Authorize Net Api Key
    * @param authorizeNetTransactionKey Authorize Net Transaction Key
    * @param emailSender Email Sender
    * @param smtpUser SMTP User
    * @param smtpHost SMTP Host
    * @param vatomBusinessId Vatom Business Id
    * @param vatomRestClientId Vatom REST Client Id
    * @param vatomRestSecretKey Vatom Secret Key
    * @param twilioAccountSID Twilio Account SID
    * @param twilioAuthToken Twilio Auth Token
    * @param twilioSenderPhoneNumber Twilio Sender Phone Number
    * @param openAISecretKey OpenAI Secret API Key
    */
  def updateApplication(version: BigDecimal, appKey: String, appName: String, deviceId: Option[String], accountId: Option[Long], about: Option[String], bundleId: Option[String], appIconAssetId: Option[Long], appLogoAssetId: Option[Long], facebookAppId: Option[String], facebookAppSecret: Option[String], googleApiKey: Option[String], updateEULADate: Option[Boolean], eulaVersion: Option[String], landingPageUrl: Option[String], showInActivities: Option[Boolean], activityDescription: Option[String], inviteWelcomeText: Option[String], invitePageUrl: Option[String], urlScheme: Option[String], platforms: Option[String], downloadUrls: Option[String], categoryIds: Option[String], scoringType: Option[String], hintCost: Option[Int], maxScore: Option[Int], ticketsPerPoint: Option[Float], hasGameData: Option[Boolean], publicNotifications: Option[Boolean], useMatchingAlgorithm: Option[Boolean], globalTickets: Option[Boolean], buildVersion: Option[Float], apiVersion: Option[Float], placementName: Option[String], placementDescription: Option[String], placementSize: Option[String], placementHeight: Option[Int], placementWidth: Option[Int], placementRefreshInterval: Option[Int], createObjectStore: Option[Boolean], publicContentApproval: Option[Boolean], productionMode: Option[Boolean], minimumSessionLength: Option[Int], sessionGapLength: Option[Int], localAdsEnabled: Option[Boolean], sqootApiKey: Option[String], trilatProcessingType: Option[String], maxSampleSize: Option[Int], minRSSI: Option[Double], modules: Option[String], authorizedCount: Option[Int], authorizedServers: Option[String], defaultTimezone: Option[String], smtpPass: Option[String], metaData: Option[String], placementMetaData: Option[String], ipsFloor: Option[Boolean], enableAPNSBadge: Option[Boolean], includeInReport: Option[Boolean], defaultAppFilterId: Option[Long], enableWelcomeEmail: Option[Boolean], appleAppId: Option[String], appleTeamId: Option[String], appleAuthKeyId: Option[String], appleAuthKey: Option[TemporaryFile], appleIssuerId: Option[String], appStoreKeyId: Option[String], appStoreKey: Option[TemporaryFile], googlePrivateKeyFile: Option[TemporaryFile], authorizeNetApiKey: Option[String], authorizeNetTransactionKey: Option[String], emailSender: Option[String], smtpUser: Option[String], smtpHost: Option[String], vatomBusinessId: Option[String], vatomRestClientId: Option[String], vatomRestSecretKey: Option[String], twilioAccountSID: Option[String], twilioAuthToken: Option[String], twilioSenderPhoneNumber: Option[String], openAISecretKey: Option[String]): ApplicationResponse

  /**
    * Change Appliation Status
    * Set the application&#39;s active flag to true/false. This effectively activates or deactivates the application.
    * @param accountId The account used to perform the delete, must have rights to edit the application.
    * @param appKey The key of the application to be deleted
    * @param active If true then set to active, false otherwise
    */
  def updateApplicationActive(version: BigDecimal, accountId: Long, appKey: String, active: Boolean): SirqulResponse

  /**
    * Update Ad Placement
    * Updates an ad placement for an application.
    * @param placementId The id of the placement to update, the user must have rights to the application the ad placement is for
    * @param deviceId The unique id of the device making the request (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param name The name of the placement
    * @param description The description of the placement
    * @param size The ad placement size {BANNER, LEADERBOARD, SKYSCRAPER, INTERSTITIAL, CUSTOM
    * @param height The height of a custom ad size
    * @param width The width of a custom ad size
    * @param refreshInterval The refresh interval in seconds
    * @param defaultImageId Default Image Id
    * @param active Active
    */
  def updateApplicationPlacement(version: BigDecimal, placementId: Long, deviceId: Option[String], accountId: Option[Long], name: Option[String], description: Option[String], size: Option[String], height: Option[Int], width: Option[Int], refreshInterval: Option[Int], defaultImageId: Option[Long], active: Option[Boolean]): PlacementResponse

  /**
    * Create Application Certificate
    * Uploads a certificate for an application that the user has access to.
    * @param appKey The key of the application
    * @param deviceId Device Id
    * @param accountId The account used to perform the delete, must have rights to edit the application.
    * @param certificate Certificate
    */
  def uploadApplicationCertificate(version: BigDecimal, appKey: String, deviceId: Option[String], accountId: Option[Long], certificate: Option[TemporaryFile]): SirqulResponse
}
