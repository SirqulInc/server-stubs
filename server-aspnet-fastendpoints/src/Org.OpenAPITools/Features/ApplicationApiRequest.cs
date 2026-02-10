
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateApplicationRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The unique id of the device making the request (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The name of the application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appName")]
    public string AppName { get; set; }
    /// <summary>
    /// The description of the application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("about")]
    public string? About { get; set; }
    /// <summary>
    /// The application bundle identifier (format - com.company.appName)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bundleId")]
    public string? BundleId { get; set; }
    /// <summary>
    /// The application icon asset id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appIconAssetId")]
    public long? AppIconAssetId { get; set; }
    /// <summary>
    /// The application logo asset id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appLogoAssetId")]
    public long? AppLogoAssetId { get; set; }
    /// <summary>
    /// The Facebook application id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("facebookAppId")]
    public string? FacebookAppId { get; set; }
    /// <summary>
    /// The Facebook application secret
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("facebookAppSecret")]
    public string? FacebookAppSecret { get; set; }
    /// <summary>
    /// This is the either the &#39;server key&#39; or &#39;browser key&#39; generated from google to enable Google Cloud Messaging
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("googleApiKey")]
    public string? GoogleApiKey { get; set; }
    /// <summary>
    /// Determines whether to update the EULA date
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("updateEULADate")]
    public bool? UpdateEULADate { get; set; }
    /// <summary>
    /// The EULA version
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("eulaVersion")]
    public string? EulaVersion { get; set; }
    /// <summary>
    /// The landing page URL
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("landingPageUrl")]
    public string? LandingPageUrl { get; set; }
    /// <summary>
    /// Determines whether to show the application in the activity feed
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("showInActivities")]
    public bool? ShowInActivities { get; set; }
    /// <summary>
    /// The description of the application in the activity feed
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activityDescription")]
    public string? ActivityDescription { get; set; }
    /// <summary>
    /// The text to display on the invite page
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("inviteWelcomeText")]
    public string? InviteWelcomeText { get; set; }
    /// <summary>
    /// The url to the application invite page
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("invitePageUrl")]
    public string? InvitePageUrl { get; set; }
    /// <summary>
    /// The protocal the app uses to load the app via a browser
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("urlScheme")]
    public string? UrlScheme { get; set; }
    /// <summary>
    /// A json object with a list of supported platforms.  &#x60;&#x60;&#x60;json {   \&quot;platforms\&quot;: [     {       \&quot;deviceId\&quot;: 1,       \&quot;minimum\&quot;: 230,       \&quot;maximum\&quot;: 421,       \&quot;downloadUrl\&quot;: \&quot;http://app.store.com/download\&quot;,       \&quot;description\&quot;: \&quot;description and version info\&quot;     }   ] } &#x60;&#x60;&#x60; 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("platforms")]
    public string? Platforms { get; set; }
    /// <summary>
    /// Json formatted downloadUrls.  &#x60;&#x60;&#x60;json {   \&quot;ios\&quot;: \&quot;the-url-to-app-store\&quot;,    \&quot;android\&quot;: \&quot;the-url-to-google-play\&quot; } &#x60;&#x60;&#x60;  
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("downloadUrls")]
    public string? DownloadUrls { get; set; }
    /// <summary>
    /// List of categories to apply
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// The type of scoring this application will use {GAME_LEVEL, GAME_OBJECT
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("scoringType")]
    public string? ScoringType { get; set; }
    /// <summary>
    /// The cost of hints
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hintCost")]
    public int? HintCost { get; set; }
    /// <summary>
    /// The maximum score that will be possible
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("maxScore")]
    public int? MaxScore { get; set; }
    /// <summary>
    /// The point-to-ticket conversion ratio
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ticketsPerPoint")]
    public float? TicketsPerPoint { get; set; }
    /// <summary>
    /// Determines whether the application uses services to save custom game objects
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hasGameData")]
    public bool? HasGameData { get; set; }
    /// <summary>
    /// Public Notifications
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("publicNotifications")]
    public bool? PublicNotifications { get; set; }
    /// <summary>
    /// Use Matching Algorithm
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("useMatchingAlgorithm")]
    public bool? UseMatchingAlgorithm { get; set; }
    /// <summary>
    /// Determines whether earned tickets are applied across all applications
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("globalTickets")]
    public bool? GlobalTickets { get; set; }
    /// <summary>
    /// The current build version of the application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("buildVersion")]
    public float? BuildVersion { get; set; }
    /// <summary>
    /// The current API version the application uses
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("apiVersion")]
    public float? ApiVersion { get; set; }
    /// <summary>
    /// The name of the placement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("placementName")]
    public string? PlacementName { get; set; }
    /// <summary>
    /// The description of the placement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("placementDescription")]
    public string? PlacementDescription { get; set; }
    /// <summary>
    /// The ad placement size {BANNER, LEADERBOARD, SKYSCRAPER, INTERSTITIAL, CUSTOM (this is required if a placements is to be created)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("placementSize")]
    public string? PlacementSize { get; set; }
    /// <summary>
    /// The height of a custom ad size
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("placementHeight")]
    public int? PlacementHeight { get; set; }
    /// <summary>
    /// The width of a custom ad size
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("placementWidth")]
    public int? PlacementWidth { get; set; }
    /// <summary>
    /// The refresh interval in seconds
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("placementRefreshInterval")]
    public int? PlacementRefreshInterval { get; set; }
    /// <summary>
    /// Generate a custom object store to use
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("createObjectStore")]
    public bool? CreateObjectStore { get; set; }
    /// <summary>
    /// Determine whether or not public content requires admin approval before it becomes public
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("publicContentApproval")]
    public bool? PublicContentApproval { get; set; }
    /// <summary>
    /// Determines whether the application uses production or sandbox services
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("productionMode")]
    public bool? ProductionMode { get; set; }
    /// <summary>
    /// Minimum Session Length
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("minimumSessionLength")]
    public int? MinimumSessionLength { get; set; }
    /// <summary>
    /// Session Gap Length
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sessionGapLength")]
    public int? SessionGapLength { get; set; }
    /// <summary>
    /// Local Ads Enabled
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("localAdsEnabled")]
    public bool? LocalAdsEnabled { get; set; }
    /// <summary>
    /// Sqoot Api Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sqootApiKey")]
    public string? SqootApiKey { get; set; }
    /// <summary>
    /// Determines how to process trilateration data. Possible values include: DEFAULT, FINGERPRINT
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("trilatProcessingType")]
    public string? TrilatProcessingType { get; set; }
    /// <summary>
    /// Determines what the maximum sample size during trilateration
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("maxSampleSize")]
    public int? MaxSampleSize { get; set; }
    /// <summary>
    /// Determines what the minimum acceptable RSSI value
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("minRSSI")]
    public double? MinRSSI { get; set; }
    /// <summary>
    /// List modules allowed to be served by the server, possible values include: COMMON, MEDIA, OFFER, GAME, SOCIAL, CONSUMER_WEBSITE, ALL
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("modules")]
    public string? Modules { get; set; }
    /// <summary>
    /// How many servers the license will support
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("authorizedCount")]
    public int? AuthorizedCount { get; set; }
    /// <summary>
    /// The list of ip addresses of servers the license will support, leave null for any server
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("authorizedServers")]
    public string? AuthorizedServers { get; set; }
    /// <summary>
    /// Sets the default timezone for the app (used for leaderboards and other time specific content)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("defaultTimezone")]
    public string? DefaultTimezone { get; set; }
    /// <summary>
    /// SMTP Pass
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("smtpPass")]
    public string? SmtpPass { get; set; }
    /// <summary>
    /// The application meta data. Defined by the client
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
    /// <summary>
    /// The ad placement meta data. Defined by the client
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("placementMetaData")]
    public string? PlacementMetaData { get; set; }
    /// <summary>
    /// Create floor tables for Ips
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ipsFloor")]
    public bool? IpsFloor { get; set; }
    /// <summary>
    /// Enables setting the APNS badge value in the payload
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("enableAPNSBadge")]
    public bool? EnableAPNSBadge { get; set; }
    /// <summary>
    /// Enables using the application in session reports
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeInReport")]
    public bool? IncludeInReport { get; set; }
    /// <summary>
    /// Sets the default filter to use (if none is passed in) for certain search APIs including Album Search.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("defaultAppFilterId")]
    public long? DefaultAppFilterId { get; set; }
    /// <summary>
    /// Enables whether the default welcome email will be sent for new app users
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("enableWelcomeEmail")]
    public bool? EnableWelcomeEmail { get; set; }
    /// <summary>
    /// The Apple Application ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appleAppId")]
    public string? AppleAppId { get; set; }
    /// <summary>
    /// The Apple Team ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appleTeamId")]
    public string? AppleTeamId { get; set; }
    /// <summary>
    /// The Apple Auth Key ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appleAuthKeyId")]
    public string? AppleAuthKeyId { get; set; }
    /// <summary>
    /// The Apple Auth Signin Key (p8) File
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appleAuthKey")]
    public System.IO.Stream? AppleAuthKey { get; set; }
    /// <summary>
    /// The Apple Issuer ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appleIssuerId")]
    public string? AppleIssuerId { get; set; }
    /// <summary>
    /// The Apple App Store Key ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appStoreKeyId")]
    public string? AppStoreKeyId { get; set; }
    /// <summary>
    /// The Apple App Store Key (p8) File
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appStoreKey")]
    public System.IO.Stream? AppStoreKey { get; set; }
    /// <summary>
    /// This is the private key file for your Google service account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("googlePrivateKeyFile")]
    public System.IO.Stream? GooglePrivateKeyFile { get; set; }
    /// <summary>
    /// Authorize Net Api Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("authorizeNetApiKey")]
    public string? AuthorizeNetApiKey { get; set; }
    /// <summary>
    /// Authorize Net Transaction Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("authorizeNetTransactionKey")]
    public string? AuthorizeNetTransactionKey { get; set; }
    /// <summary>
    /// Email Sender
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("emailSender")]
    public string? EmailSender { get; set; }
    /// <summary>
    /// SMTP User
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("smtpUser")]
    public string? SmtpUser { get; set; }
    /// <summary>
    /// SMTP Host
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("smtpHost")]
    public string? SmtpHost { get; set; }
    /// <summary>
    /// Vatom Business Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomBusinessId")]
    public string? VatomBusinessId { get; set; }
    /// <summary>
    /// Vatom REST Client Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomRestClientId")]
    public string? VatomRestClientId { get; set; }
    /// <summary>
    /// Vatom Secret Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomRestSecretKey")]
    public string? VatomRestSecretKey { get; set; }
    /// <summary>
    /// Twilio Account SID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("twilioAccountSID")]
    public string? TwilioAccountSID { get; set; }
    /// <summary>
    /// Twilio Auth Token
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("twilioAuthToken")]
    public string? TwilioAuthToken { get; set; }
    /// <summary>
    /// Twilio Sender Phone Number
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("twilioSenderPhoneNumber")]
    public string? TwilioSenderPhoneNumber { get; set; }
    /// <summary>
    /// OpenAI Secret API Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("openAISecretKey")]
    public string? OpenAISecretKey { get; set; }
}
public class CreateApplicationPlacementRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The unique id of the device making the request (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The appKey of the application the ad placement is for
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// The name of the placement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string? Name { get; set; }
    /// <summary>
    /// The description of the placement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// The ad placement size {BANNER, LEADERBOARD, SKYSCRAPER, INTERSTITIAL, CUSTOM
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("size")]
    public string Size { get; set; }
    /// <summary>
    /// The height of a custom ad size
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("height")]
    public int? Height { get; set; }
    /// <summary>
    /// The width of a custom ad size
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("width")]
    public int? Width { get; set; }
    /// <summary>
    /// The refresh interval in seconds
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("refreshInterval")]
    public int? RefreshInterval { get; set; }
    /// <summary>
    /// Default Image Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("defaultImageId")]
    public long? DefaultImageId { get; set; }
    /// <summary>
    /// Active
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
}
public class DeleteApplicationRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account used to perform the delete, must have rights to edit the application.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The key of the application to be deleted
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
}
public class DeleteApplicationPlacementRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The unique id of the device making the request (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The id of the placement to delete, the user must have rights to the application the ad placement is for
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("placementId")]
    public long PlacementId { get; set; }
}
public class GetApplicationRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The key of the application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// Application Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("applicationId")]
    public long? ApplicationId { get; set; }
}
public class GetApplicationPlacementRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The unique id of the device making the request (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The id of the placement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("placementId")]
    public long PlacementId { get; set; }
}
public class GetApplicationVersionsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
}
public class GetUniqueUsersByAppRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Q
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
    /// <summary>
    /// The keyword used to search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// Return accounts that have been active after this date (UNIX time-stamp in milliseconds)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("since")]
    public long? Since { get; set; }
    /// <summary>
    /// the start of the index
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_i")]
    public int? I { get; set; }
    /// <summary>
    /// The start of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// the limit of the index
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_l")]
    public int? L { get; set; }
    /// <summary>
    /// The limit of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}
public class ListApplicationsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the application owner/manager
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// Q
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
    /// <summary>
    /// The keyword used to search for title, about, and description fields
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// Deprecated, use deviceIds and deviceVersions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("platforms")]
    public string? Platforms { get; set; }
    /// <summary>
    /// The list of targeted device ids, comma separated; possible values are retreived via /api/{version/audience/devices com.sirqul.geoapps.common.service.AudienceApi#getDevices getDevices (pass in deviceId values)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceIds")]
    public string? DeviceIds { get; set; }
    /// <summary>
    /// The list of targeted device version ranges that are aligned  with the provided devices list (see devices param for possible values),  comma separated; examples are: 2.3-X, 0-5.1.4, 4.3.1-6.1.4 where X  is no maximum and 0 is no minimum. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceVersions")]
    public string? DeviceVersions { get; set; }
    /// <summary>
    /// The list of category ids to filter the list by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// The column to sort the search on, possible values include: UPDATED (default), CREATED, TITLE
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// Filter results on whether the application supports ads or not. Ignore this parameter to return all results.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hasAds")]
    public bool? HasAds { get; set; }
    /// <summary>
    /// Filter results on whether the application is available for public trigger notifications
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("publicNotifications")]
    public bool? PublicNotifications { get; set; }
    /// <summary>
    /// Determines whether to only return applications that the user has access to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filterBillable")]
    public bool? FilterBillable { get; set; }
    /// <summary>
    /// Determines whether to only return applications that the user is a content admin of
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filterContentAdmin")]
    public bool? FilterContentAdmin { get; set; }
    /// <summary>
    /// The order to return the search results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// the start of the index
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_i")]
    public int? I { get; set; }
    /// <summary>
    /// The start of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// The limit of the index
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_l")]
    public int? L { get; set; }
    /// <summary>
    /// The limit of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// The list of application ids, comma separated. If provided will ignore all other params.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("applicationIds")]
    public string? ApplicationIds { get; set; }
    /// <summary>
    /// Only include applications with a object store (default is false)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hasObjectStore")]
    public bool? HasObjectStore { get; set; }
    /// <summary>
    /// Return only active results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool? ActiveOnly { get; set; }
}
public class SearchApplicationPlacementRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The unique id of the device making the request (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The key of the application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// The start of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// The limit of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}
public class SearchApplicationSettingsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The device id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The account id used to view another person&#39;s account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionAccountId")]
    public long? ConnectionAccountId { get; set; }
    /// <summary>
    /// The string to search applications on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// The column to sort the search on. Possible values include: CREATED, UPDATED, APPLICATION_TITLE
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// The order to return the search results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// The start index for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// The limit per result set for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}
public class SearchApplicationsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The unique id of the device making the request (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The location of the device
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// The location of the device
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// Q
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
    /// <summary>
    /// The keyword used to search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// The columns to applied the keyword search to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("qSearchFields")]
    public string? QSearchFields { get; set; }
    /// <summary>
    /// The column to sort the search on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// The order to return the search results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// the start of the index
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_i")]
    public int? I { get; set; }
    /// <summary>
    /// The start of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// the limit of the index
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_l")]
    public int? L { get; set; }
    /// <summary>
    /// The limit of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// Filter results on whether the application supports ads or not. Ignore this parameter to return all results.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hasAds")]
    public bool? HasAds { get; set; }
    /// <summary>
    /// Filter results on whether the application is available for public trigger notifications
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("publicNotifications")]
    public bool? PublicNotifications { get; set; }
    /// <summary>
    /// Return only active results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool? ActiveOnly { get; set; }
}
public class UpdateApplicationRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The unique id of the device making the request (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The application key for updating an existing application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// The name of the application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appName")]
    public string AppName { get; set; }
    /// <summary>
    /// The description of the application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("about")]
    public string? About { get; set; }
    /// <summary>
    /// The application bundle identifier (format - com.company.appName)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bundleId")]
    public string? BundleId { get; set; }
    /// <summary>
    /// The application icon asset id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appIconAssetId")]
    public long? AppIconAssetId { get; set; }
    /// <summary>
    /// The application logo asset id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appLogoAssetId")]
    public long? AppLogoAssetId { get; set; }
    /// <summary>
    /// The Facebook application id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("facebookAppId")]
    public string? FacebookAppId { get; set; }
    /// <summary>
    /// The Facebook application secret
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("facebookAppSecret")]
    public string? FacebookAppSecret { get; set; }
    /// <summary>
    /// This is the either the &#39;server key&#39; or &#39;browser key&#39; generated from google to enable Google Cloud Messaging
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("googleApiKey")]
    public string? GoogleApiKey { get; set; }
    /// <summary>
    /// Determines whether to update the EULA date
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("updateEULADate")]
    public bool? UpdateEULADate { get; set; }
    /// <summary>
    /// The EULA version
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("eulaVersion")]
    public string? EulaVersion { get; set; }
    /// <summary>
    /// The landing page URL
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("landingPageUrl")]
    public string? LandingPageUrl { get; set; }
    /// <summary>
    /// Determines whether to show the application in the activity feed
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("showInActivities")]
    public bool? ShowInActivities { get; set; }
    /// <summary>
    /// The description of the application in the activity feed
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activityDescription")]
    public string? ActivityDescription { get; set; }
    /// <summary>
    /// The text to display on the invite page
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("inviteWelcomeText")]
    public string? InviteWelcomeText { get; set; }
    /// <summary>
    /// The url to the application invite page
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("invitePageUrl")]
    public string? InvitePageUrl { get; set; }
    /// <summary>
    /// The protocal the app uses to load the app via a browser
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("urlScheme")]
    public string? UrlScheme { get; set; }
    /// <summary>
    /// A json object with a list of supported platforms.  &#x60;&#x60;&#x60;json {   \&quot;platforms\&quot;: [     {       \&quot;deviceId\&quot;: 1,       \&quot;minimum\&quot;: 230,       \&quot;maximum\&quot;: 421,       \&quot;downloadUrl\&quot;: \&quot;http://app.store.com/download\&quot;,       \&quot;description\&quot;: \&quot;description and version info\&quot;     }   ] } &#x60;&#x60;&#x60; 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("platforms")]
    public string? Platforms { get; set; }
    /// <summary>
    /// Json formatted downloadUrls.  &#x60;&#x60;&#x60;json {   \&quot;ios\&quot;: \&quot;the-url-to-app-store\&quot;,    \&quot;android\&quot;: \&quot;the-url-to-google-play\&quot; } &#x60;&#x60;&#x60;  
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("downloadUrls")]
    public string? DownloadUrls { get; set; }
    /// <summary>
    /// List of categories to apply
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// The type of scoring this application will use {GAME_LEVEL, GAME_OBJECT
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("scoringType")]
    public string? ScoringType { get; set; }
    /// <summary>
    /// The cost of hints
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hintCost")]
    public int? HintCost { get; set; }
    /// <summary>
    /// The maximum score that will be possible
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("maxScore")]
    public int? MaxScore { get; set; }
    /// <summary>
    /// The point-to-ticket conversion ratio
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ticketsPerPoint")]
    public float? TicketsPerPoint { get; set; }
    /// <summary>
    /// Determines whether the application uses services to save custom game objects
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hasGameData")]
    public bool? HasGameData { get; set; }
    /// <summary>
    /// Public Notifications
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("publicNotifications")]
    public bool? PublicNotifications { get; set; }
    /// <summary>
    /// Use Matching Algorithm
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("useMatchingAlgorithm")]
    public bool? UseMatchingAlgorithm { get; set; }
    /// <summary>
    /// Determines whether earned tickets are applied across all applications
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("globalTickets")]
    public bool? GlobalTickets { get; set; }
    /// <summary>
    /// The current build version of the application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("buildVersion")]
    public float? BuildVersion { get; set; }
    /// <summary>
    /// The current API version the application uses
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("apiVersion")]
    public float? ApiVersion { get; set; }
    /// <summary>
    /// The name of the placement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("placementName")]
    public string? PlacementName { get; set; }
    /// <summary>
    /// The description of the placement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("placementDescription")]
    public string? PlacementDescription { get; set; }
    /// <summary>
    /// The ad placement size {BANNER, LEADERBOARD, SKYSCRAPER, INTERSTITIAL, CUSTOM (this is required if a placements is to be created)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("placementSize")]
    public string? PlacementSize { get; set; }
    /// <summary>
    /// The height of a custom ad size
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("placementHeight")]
    public int? PlacementHeight { get; set; }
    /// <summary>
    /// The width of a custom ad size
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("placementWidth")]
    public int? PlacementWidth { get; set; }
    /// <summary>
    /// The refresh interval in seconds
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("placementRefreshInterval")]
    public int? PlacementRefreshInterval { get; set; }
    /// <summary>
    /// Generate a custom object store to use
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("createObjectStore")]
    public bool? CreateObjectStore { get; set; }
    /// <summary>
    /// Determine whether or not public content requires admin approval before it becomes public
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("publicContentApproval")]
    public bool? PublicContentApproval { get; set; }
    /// <summary>
    /// Determines whether the application uses production or sandbox services
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("productionMode")]
    public bool? ProductionMode { get; set; }
    /// <summary>
    /// Minimum Session Length
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("minimumSessionLength")]
    public int? MinimumSessionLength { get; set; }
    /// <summary>
    /// Session Gap Length
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sessionGapLength")]
    public int? SessionGapLength { get; set; }
    /// <summary>
    /// Local Ads Enabled
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("localAdsEnabled")]
    public bool? LocalAdsEnabled { get; set; }
    /// <summary>
    /// Sqoot Api Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sqootApiKey")]
    public string? SqootApiKey { get; set; }
    /// <summary>
    /// Determines how to process trilateration data. Possible values include: DEFAULT, FINGERPRINT
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("trilatProcessingType")]
    public string? TrilatProcessingType { get; set; }
    /// <summary>
    /// Determines what the maximum sample size during trilateration
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("maxSampleSize")]
    public int? MaxSampleSize { get; set; }
    /// <summary>
    /// Determines what the minimum acceptable RSSI value
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("minRSSI")]
    public double? MinRSSI { get; set; }
    /// <summary>
    /// List modules allowed to be served by the server, possible values include: COMMON, MEDIA, OFFER, GAME, SOCIAL, CONSUMER_WEBSITE, ALL
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("modules")]
    public string? Modules { get; set; }
    /// <summary>
    /// How many servers the license will support
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("authorizedCount")]
    public int? AuthorizedCount { get; set; }
    /// <summary>
    /// The list of ip addresses of servers the license will support, leave null for any server
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("authorizedServers")]
    public string? AuthorizedServers { get; set; }
    /// <summary>
    /// Sets the default timezone for the app (used for leaderboards and other time specific content)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("defaultTimezone")]
    public string? DefaultTimezone { get; set; }
    /// <summary>
    /// SMTP Pass
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("smtpPass")]
    public string? SmtpPass { get; set; }
    /// <summary>
    /// The application meta data. Defined by the client
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
    /// <summary>
    /// The ad placement meta data. Defined by the client
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("placementMetaData")]
    public string? PlacementMetaData { get; set; }
    /// <summary>
    /// Create floor tables for Ips
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ipsFloor")]
    public bool? IpsFloor { get; set; }
    /// <summary>
    /// Enables setting the APNS badge value in the payload
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("enableAPNSBadge")]
    public bool? EnableAPNSBadge { get; set; }
    /// <summary>
    /// Enables using the application in session reports
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeInReport")]
    public bool? IncludeInReport { get; set; }
    /// <summary>
    /// Sets the default filter to use (if none is passed in) for certain search APIs including Album Search.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("defaultAppFilterId")]
    public long? DefaultAppFilterId { get; set; }
    /// <summary>
    /// Enables whether the default welcome email will be sent for new app users
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("enableWelcomeEmail")]
    public bool? EnableWelcomeEmail { get; set; }
    /// <summary>
    /// The Apple Application ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appleAppId")]
    public string? AppleAppId { get; set; }
    /// <summary>
    /// The Apple Team ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appleTeamId")]
    public string? AppleTeamId { get; set; }
    /// <summary>
    /// The Apple Auth Key ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appleAuthKeyId")]
    public string? AppleAuthKeyId { get; set; }
    /// <summary>
    /// The Apple Auth Signin Key (p8) File
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appleAuthKey")]
    public System.IO.Stream? AppleAuthKey { get; set; }
    /// <summary>
    /// The Apple Issuer ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appleIssuerId")]
    public string? AppleIssuerId { get; set; }
    /// <summary>
    /// The Apple App Store Key ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appStoreKeyId")]
    public string? AppStoreKeyId { get; set; }
    /// <summary>
    /// The Apple App Store Key (p8) File
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appStoreKey")]
    public System.IO.Stream? AppStoreKey { get; set; }
    /// <summary>
    /// This is the private key file for your Google service account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("googlePrivateKeyFile")]
    public System.IO.Stream? GooglePrivateKeyFile { get; set; }
    /// <summary>
    /// Authorize Net Api Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("authorizeNetApiKey")]
    public string? AuthorizeNetApiKey { get; set; }
    /// <summary>
    /// Authorize Net Transaction Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("authorizeNetTransactionKey")]
    public string? AuthorizeNetTransactionKey { get; set; }
    /// <summary>
    /// Email Sender
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("emailSender")]
    public string? EmailSender { get; set; }
    /// <summary>
    /// SMTP User
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("smtpUser")]
    public string? SmtpUser { get; set; }
    /// <summary>
    /// SMTP Host
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("smtpHost")]
    public string? SmtpHost { get; set; }
    /// <summary>
    /// Vatom Business Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomBusinessId")]
    public string? VatomBusinessId { get; set; }
    /// <summary>
    /// Vatom REST Client Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomRestClientId")]
    public string? VatomRestClientId { get; set; }
    /// <summary>
    /// Vatom Secret Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vatomRestSecretKey")]
    public string? VatomRestSecretKey { get; set; }
    /// <summary>
    /// Twilio Account SID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("twilioAccountSID")]
    public string? TwilioAccountSID { get; set; }
    /// <summary>
    /// Twilio Auth Token
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("twilioAuthToken")]
    public string? TwilioAuthToken { get; set; }
    /// <summary>
    /// Twilio Sender Phone Number
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("twilioSenderPhoneNumber")]
    public string? TwilioSenderPhoneNumber { get; set; }
    /// <summary>
    /// OpenAI Secret API Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("openAISecretKey")]
    public string? OpenAISecretKey { get; set; }
}
public class UpdateApplicationActiveRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account used to perform the delete, must have rights to edit the application.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The key of the application to be deleted
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// If true then set to active, false otherwise
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool Active { get; set; }
}
public class UpdateApplicationPlacementRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The unique id of the device making the request (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The id of the placement to update, the user must have rights to the application the ad placement is for
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("placementId")]
    public long PlacementId { get; set; }
    /// <summary>
    /// The name of the placement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string? Name { get; set; }
    /// <summary>
    /// The description of the placement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// The ad placement size {BANNER, LEADERBOARD, SKYSCRAPER, INTERSTITIAL, CUSTOM
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("size")]
    public string? Size { get; set; }
    /// <summary>
    /// The height of a custom ad size
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("height")]
    public int? Height { get; set; }
    /// <summary>
    /// The width of a custom ad size
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("width")]
    public int? Width { get; set; }
    /// <summary>
    /// The refresh interval in seconds
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("refreshInterval")]
    public int? RefreshInterval { get; set; }
    /// <summary>
    /// Default Image Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("defaultImageId")]
    public long? DefaultImageId { get; set; }
    /// <summary>
    /// Active
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
}
public class UploadApplicationCertificateRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Device Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account used to perform the delete, must have rights to edit the application.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The key of the application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Certificate
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("certificate")]
    public System.IO.Stream? Certificate { get; set; }
}


