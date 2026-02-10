using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Application
/// </summary>

public class CreateApplicationEndpoint : FastEndpoints.Endpoint<CreateApplicationRequest, ApplicationResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/application/create");
        
        
        AllowAnonymous();
        AllowFileUploads();AllowFileUploads();AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Application");
        });

        Summary(s => {
            s.Summary = "Create Application";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AppName, "The name of the application");
            s.RequestParam(r => r.DeviceId, "The unique id of the device making the request (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.About, "The description of the application");
            s.RequestParam(r => r.BundleId, "The application bundle identifier (format - com.company.appName)");
            s.RequestParam(r => r.AppIconAssetId, "The application icon asset id");
            s.RequestParam(r => r.AppLogoAssetId, "The application logo asset id");
            s.RequestParam(r => r.FacebookAppId, "The Facebook application id");
            s.RequestParam(r => r.FacebookAppSecret, "The Facebook application secret");
            s.RequestParam(r => r.GoogleApiKey, "This is the either the &#39;server key&#39; or &#39;browser key&#39; generated from google to enable Google Cloud Messaging");
            s.RequestParam(r => r.UpdateEULADate, "Determines whether to update the EULA date");
            s.RequestParam(r => r.EulaVersion, "The EULA version");
            s.RequestParam(r => r.LandingPageUrl, "The landing page URL");
            s.RequestParam(r => r.ShowInActivities, "Determines whether to show the application in the activity feed");
            s.RequestParam(r => r.ActivityDescription, "The description of the application in the activity feed");
            s.RequestParam(r => r.InviteWelcomeText, "The text to display on the invite page");
            s.RequestParam(r => r.InvitePageUrl, "The url to the application invite page");
            s.RequestParam(r => r.UrlScheme, "The protocal the app uses to load the app via a browser");
            s.RequestParam(r => r.Platforms, "A json object with a list of supported platforms.  &#x60;&#x60;&#x60;json {   \&quot;platforms\&quot;: [     {       \&quot;deviceId\&quot;: 1,       \&quot;minimum\&quot;: 230,       \&quot;maximum\&quot;: 421,       \&quot;downloadUrl\&quot;: \&quot;http://app.store.com/download\&quot;,       \&quot;description\&quot;: \&quot;description and version info\&quot;     }   ] } &#x60;&#x60;&#x60; ");
            s.RequestParam(r => r.DownloadUrls, "Json formatted downloadUrls.  &#x60;&#x60;&#x60;json {   \&quot;ios\&quot;: \&quot;the-url-to-app-store\&quot;,    \&quot;android\&quot;: \&quot;the-url-to-google-play\&quot; } &#x60;&#x60;&#x60;  ");
            s.RequestParam(r => r.CategoryIds, "List of categories to apply");
            s.RequestParam(r => r.ScoringType, "The type of scoring this application will use {GAME_LEVEL, GAME_OBJECT");
            s.RequestParam(r => r.HintCost, "The cost of hints");
            s.RequestParam(r => r.MaxScore, "The maximum score that will be possible");
            s.RequestParam(r => r.TicketsPerPoint, "The point-to-ticket conversion ratio");
            s.RequestParam(r => r.HasGameData, "Determines whether the application uses services to save custom game objects");
            s.RequestParam(r => r.PublicNotifications, "Public Notifications");
            s.RequestParam(r => r.UseMatchingAlgorithm, "Use Matching Algorithm");
            s.RequestParam(r => r.GlobalTickets, "Determines whether earned tickets are applied across all applications");
            s.RequestParam(r => r.BuildVersion, "The current build version of the application");
            s.RequestParam(r => r.ApiVersion, "The current API version the application uses");
            s.RequestParam(r => r.PlacementName, "The name of the placement");
            s.RequestParam(r => r.PlacementDescription, "The description of the placement");
            s.RequestParam(r => r.PlacementSize, "The ad placement size {BANNER, LEADERBOARD, SKYSCRAPER, INTERSTITIAL, CUSTOM (this is required if a placements is to be created)");
            s.RequestParam(r => r.PlacementHeight, "The height of a custom ad size");
            s.RequestParam(r => r.PlacementWidth, "The width of a custom ad size");
            s.RequestParam(r => r.PlacementRefreshInterval, "The refresh interval in seconds");
            s.RequestParam(r => r.CreateObjectStore, "Generate a custom object store to use");
            s.RequestParam(r => r.PublicContentApproval, "Determine whether or not public content requires admin approval before it becomes public");
            s.RequestParam(r => r.ProductionMode, "Determines whether the application uses production or sandbox services");
            s.RequestParam(r => r.MinimumSessionLength, "Minimum Session Length");
            s.RequestParam(r => r.SessionGapLength, "Session Gap Length");
            s.RequestParam(r => r.LocalAdsEnabled, "Local Ads Enabled");
            s.RequestParam(r => r.SqootApiKey, "Sqoot Api Key");
            s.RequestParam(r => r.TrilatProcessingType, "Determines how to process trilateration data. Possible values include: DEFAULT, FINGERPRINT");
            s.RequestParam(r => r.MaxSampleSize, "Determines what the maximum sample size during trilateration");
            s.RequestParam(r => r.MinRSSI, "Determines what the minimum acceptable RSSI value");
            s.RequestParam(r => r.Modules, "List modules allowed to be served by the server, possible values include: COMMON, MEDIA, OFFER, GAME, SOCIAL, CONSUMER_WEBSITE, ALL");
            s.RequestParam(r => r.AuthorizedCount, "How many servers the license will support");
            s.RequestParam(r => r.AuthorizedServers, "The list of ip addresses of servers the license will support, leave null for any server");
            s.RequestParam(r => r.DefaultTimezone, "Sets the default timezone for the app (used for leaderboards and other time specific content)");
            s.RequestParam(r => r.SmtpPass, "SMTP Pass");
            s.RequestParam(r => r.MetaData, "The application meta data. Defined by the client");
            s.RequestParam(r => r.PlacementMetaData, "The ad placement meta data. Defined by the client");
            s.RequestParam(r => r.IpsFloor, "Create floor tables for Ips");
            s.RequestParam(r => r.EnableAPNSBadge, "Enables setting the APNS badge value in the payload");
            s.RequestParam(r => r.IncludeInReport, "Enables using the application in session reports");
            s.RequestParam(r => r.DefaultAppFilterId, "Sets the default filter to use (if none is passed in) for certain search APIs including Album Search.");
            s.RequestParam(r => r.EnableWelcomeEmail, "Enables whether the default welcome email will be sent for new app users");
            s.RequestParam(r => r.AppleAppId, "The Apple Application ID");
            s.RequestParam(r => r.AppleTeamId, "The Apple Team ID");
            s.RequestParam(r => r.AppleAuthKeyId, "The Apple Auth Key ID");
            s.RequestParam(r => r.AppleAuthKey, "The Apple Auth Signin Key (p8) File");
            s.RequestParam(r => r.AppleIssuerId, "The Apple Issuer ID");
            s.RequestParam(r => r.AppStoreKeyId, "The Apple App Store Key ID");
            s.RequestParam(r => r.AppStoreKey, "The Apple App Store Key (p8) File");
            s.RequestParam(r => r.GooglePrivateKeyFile, "This is the private key file for your Google service account.");
            s.RequestParam(r => r.AuthorizeNetApiKey, "Authorize Net Api Key");
            s.RequestParam(r => r.AuthorizeNetTransactionKey, "Authorize Net Transaction Key");
            s.RequestParam(r => r.EmailSender, "Email Sender");
            s.RequestParam(r => r.SmtpUser, "SMTP User");
            s.RequestParam(r => r.SmtpHost, "SMTP Host");
            s.RequestParam(r => r.VatomBusinessId, "Vatom Business Id");
            s.RequestParam(r => r.VatomRestClientId, "Vatom REST Client Id");
            s.RequestParam(r => r.VatomRestSecretKey, "Vatom Secret Key");
            s.RequestParam(r => r.TwilioAccountSID, "Twilio Account SID");
            s.RequestParam(r => r.TwilioAuthToken, "Twilio Auth Token");
            s.RequestParam(r => r.TwilioSenderPhoneNumber, "Twilio Sender Phone Number");
            s.RequestParam(r => r.OpenAISecretKey, "OpenAI Secret API Key");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateApplicationRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Ad Placement
/// </summary>

public class CreateApplicationPlacementEndpoint : FastEndpoints.Endpoint<CreateApplicationPlacementRequest, PlacementResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/application/placement/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Application");
        });

        Summary(s => {
            s.Summary = "Create Ad Placement";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AppKey, "The appKey of the application the ad placement is for");
            s.RequestParam(r => r.Size, "The ad placement size {BANNER, LEADERBOARD, SKYSCRAPER, INTERSTITIAL, CUSTOM");
            s.RequestParam(r => r.DeviceId, "The unique id of the device making the request (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Name, "The name of the placement");
            s.RequestParam(r => r.Description, "The description of the placement");
            s.RequestParam(r => r.Height, "The height of a custom ad size");
            s.RequestParam(r => r.Width, "The width of a custom ad size");
            s.RequestParam(r => r.RefreshInterval, "The refresh interval in seconds");
            s.RequestParam(r => r.DefaultImageId, "Default Image Id");
            s.RequestParam(r => r.Active, "Active");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateApplicationPlacementRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Application
/// </summary>

public class DeleteApplicationEndpoint : FastEndpoints.Endpoint<DeleteApplicationRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/application/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Application");
        });

        Summary(s => {
            s.Summary = "Delete Application";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account used to perform the delete, must have rights to edit the application.");
            s.RequestParam(r => r.AppKey, "The key of the application to be deleted");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteApplicationRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Ad Placement
/// </summary>

public class DeleteApplicationPlacementEndpoint : FastEndpoints.Endpoint<DeleteApplicationPlacementRequest, PlacementResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/application/placement/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Application");
        });

        Summary(s => {
            s.Summary = "Delete Ad Placement";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.PlacementId, "The id of the placement to delete, the user must have rights to the application the ad placement is for");
            s.RequestParam(r => r.DeviceId, "The unique id of the device making the request (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteApplicationPlacementRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Application
/// </summary>

public class GetApplicationEndpoint : FastEndpoints.Endpoint<GetApplicationRequest, ApplicationResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/application/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Application");
        });

        Summary(s => {
            s.Summary = "Get Application";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AppKey, "The key of the application");
            s.RequestParam(r => r.ApplicationId, "Application Id");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetApplicationRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Ad Placement
/// </summary>

public class GetApplicationPlacementEndpoint : FastEndpoints.Endpoint<GetApplicationPlacementRequest, PlacementResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/application/placement/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Application");
        });

        Summary(s => {
            s.Summary = "Get Ad Placement";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.PlacementId, "The id of the placement");
            s.RequestParam(r => r.DeviceId, "The unique id of the device making the request (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetApplicationPlacementRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get API versions
/// </summary>

public class GetApplicationVersionsEndpoint : FastEndpoints.Endpoint<GetApplicationVersionsRequest, SirqulResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/application/versions");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Application");
        });

        Summary(s => {
            s.Summary = "Get API versions";
            s.RequestParam(r => r.Version, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetApplicationVersionsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Application Users
/// </summary>

public class GetUniqueUsersByAppEndpoint : FastEndpoints.Endpoint<GetUniqueUsersByAppRequest, AccountListResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/application/users");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Application");
        });

        Summary(s => {
            s.Summary = "Search Application Users";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AppKey, "The application key");
            s.RequestParam(r => r.Q, "Q");
            s.RequestParam(r => r.Keyword, "The keyword used to search");
            s.RequestParam(r => r.Since, "Return accounts that have been active after this date (UNIX time-stamp in milliseconds)");
            s.RequestParam(r => r.I, "the start of the index");
            s.RequestParam(r => r.Start, "The start of the pagination");
            s.RequestParam(r => r.L, "the limit of the index");
            s.RequestParam(r => r.Limit, "The limit of the pagination");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetUniqueUsersByAppRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List Applications
/// </summary>

public class ListApplicationsEndpoint : FastEndpoints.Endpoint<ListApplicationsRequest, List<ApplicationShortResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/application/list");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Application");
        });

        Summary(s => {
            s.Summary = "List Applications";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the application owner/manager");
            s.RequestParam(r => r.Q, "Q");
            s.RequestParam(r => r.Keyword, "The keyword used to search for title, about, and description fields");
            s.RequestParam(r => r.Platforms, "Deprecated, use deviceIds and deviceVersions");
            s.RequestParam(r => r.DeviceIds, "The list of targeted device ids, comma separated; possible values are retreived via /api/{version/audience/devices com.sirqul.geoapps.common.service.AudienceApi#getDevices getDevices (pass in deviceId values)");
            s.RequestParam(r => r.DeviceVersions, "The list of targeted device version ranges that are aligned  with the provided devices list (see devices param for possible values),  comma separated; examples are: 2.3-X, 0-5.1.4, 4.3.1-6.1.4 where X  is no maximum and 0 is no minimum. ");
            s.RequestParam(r => r.CategoryIds, "The list of category ids to filter the list by");
            s.RequestParam(r => r.SortField, "The column to sort the search on, possible values include: UPDATED (default), CREATED, TITLE");
            s.RequestParam(r => r.HasAds, "Filter results on whether the application supports ads or not. Ignore this parameter to return all results.");
            s.RequestParam(r => r.PublicNotifications, "Filter results on whether the application is available for public trigger notifications");
            s.RequestParam(r => r.FilterBillable, "Determines whether to only return applications that the user has access to");
            s.RequestParam(r => r.FilterContentAdmin, "Determines whether to only return applications that the user is a content admin of");
            s.RequestParam(r => r.Descending, "The order to return the search results");
            s.RequestParam(r => r.I, "the start of the index");
            s.RequestParam(r => r.Start, "The start of the pagination");
            s.RequestParam(r => r.L, "The limit of the index");
            s.RequestParam(r => r.Limit, "The limit of the pagination");
            s.RequestParam(r => r.ApplicationIds, "The list of application ids, comma separated. If provided will ignore all other params.");
            s.RequestParam(r => r.HasObjectStore, "Only include applications with a object store (default is false)");
            s.RequestParam(r => r.ActiveOnly, "Return only active results");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ListApplicationsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search for Ad Placements
/// </summary>

public class SearchApplicationPlacementEndpoint : FastEndpoints.Endpoint<SearchApplicationPlacementRequest, List<PlacementResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/application/placement/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Application");
        });

        Summary(s => {
            s.Summary = "Search for Ad Placements";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AppKey, "The key of the application");
            s.RequestParam(r => r.DeviceId, "The unique id of the device making the request (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Start, "The start of the pagination");
            s.RequestParam(r => r.Limit, "The limit of the pagination");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchApplicationPlacementRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search for Application Settings
/// </summary>

public class SearchApplicationSettingsEndpoint : FastEndpoints.Endpoint<SearchApplicationSettingsRequest, ApplicationSettingsResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/application/settings/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Application");
        });

        Summary(s => {
            s.Summary = "Search for Application Settings";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.ConnectionAccountId, "The account id used to view another person&#39;s account");
            s.RequestParam(r => r.Keyword, "The string to search applications on");
            s.RequestParam(r => r.SortField, "The column to sort the search on. Possible values include: CREATED, UPDATED, APPLICATION_TITLE");
            s.RequestParam(r => r.Descending, "The order to return the search results");
            s.RequestParam(r => r.Start, "The start index for pagination");
            s.RequestParam(r => r.Limit, "The limit per result set for pagination");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchApplicationSettingsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Applications
/// </summary>

public class SearchApplicationsEndpoint : FastEndpoints.Endpoint<SearchApplicationsRequest, List<ApplicationResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/application/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Application");
        });

        Summary(s => {
            s.Summary = "Search Applications";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The unique id of the device making the request (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Latitude, "The location of the device");
            s.RequestParam(r => r.Longitude, "The location of the device");
            s.RequestParam(r => r.Q, "Q");
            s.RequestParam(r => r.Keyword, "The keyword used to search");
            s.RequestParam(r => r.QSearchFields, "The columns to applied the keyword search to");
            s.RequestParam(r => r.SortField, "The column to sort the search on");
            s.RequestParam(r => r.Descending, "The order to return the search results");
            s.RequestParam(r => r.I, "the start of the index");
            s.RequestParam(r => r.Start, "The start of the pagination");
            s.RequestParam(r => r.L, "the limit of the index");
            s.RequestParam(r => r.Limit, "The limit of the pagination");
            s.RequestParam(r => r.HasAds, "Filter results on whether the application supports ads or not. Ignore this parameter to return all results.");
            s.RequestParam(r => r.PublicNotifications, "Filter results on whether the application is available for public trigger notifications");
            s.RequestParam(r => r.ActiveOnly, "Return only active results");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchApplicationsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Application
/// </summary>

public class UpdateApplicationEndpoint : FastEndpoints.Endpoint<UpdateApplicationRequest, ApplicationResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/application/update");
        
        
        AllowAnonymous();
        AllowFileUploads();AllowFileUploads();AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Application");
        });

        Summary(s => {
            s.Summary = "Update Application";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AppKey, "The application key for updating an existing application");
            s.RequestParam(r => r.AppName, "The name of the application");
            s.RequestParam(r => r.DeviceId, "The unique id of the device making the request (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.About, "The description of the application");
            s.RequestParam(r => r.BundleId, "The application bundle identifier (format - com.company.appName)");
            s.RequestParam(r => r.AppIconAssetId, "The application icon asset id");
            s.RequestParam(r => r.AppLogoAssetId, "The application logo asset id");
            s.RequestParam(r => r.FacebookAppId, "The Facebook application id");
            s.RequestParam(r => r.FacebookAppSecret, "The Facebook application secret");
            s.RequestParam(r => r.GoogleApiKey, "This is the either the &#39;server key&#39; or &#39;browser key&#39; generated from google to enable Google Cloud Messaging");
            s.RequestParam(r => r.UpdateEULADate, "Determines whether to update the EULA date");
            s.RequestParam(r => r.EulaVersion, "The EULA version");
            s.RequestParam(r => r.LandingPageUrl, "The landing page URL");
            s.RequestParam(r => r.ShowInActivities, "Determines whether to show the application in the activity feed");
            s.RequestParam(r => r.ActivityDescription, "The description of the application in the activity feed");
            s.RequestParam(r => r.InviteWelcomeText, "The text to display on the invite page");
            s.RequestParam(r => r.InvitePageUrl, "The url to the application invite page");
            s.RequestParam(r => r.UrlScheme, "The protocal the app uses to load the app via a browser");
            s.RequestParam(r => r.Platforms, "A json object with a list of supported platforms.  &#x60;&#x60;&#x60;json {   \&quot;platforms\&quot;: [     {       \&quot;deviceId\&quot;: 1,       \&quot;minimum\&quot;: 230,       \&quot;maximum\&quot;: 421,       \&quot;downloadUrl\&quot;: \&quot;http://app.store.com/download\&quot;,       \&quot;description\&quot;: \&quot;description and version info\&quot;     }   ] } &#x60;&#x60;&#x60; ");
            s.RequestParam(r => r.DownloadUrls, "Json formatted downloadUrls.  &#x60;&#x60;&#x60;json {   \&quot;ios\&quot;: \&quot;the-url-to-app-store\&quot;,    \&quot;android\&quot;: \&quot;the-url-to-google-play\&quot; } &#x60;&#x60;&#x60;  ");
            s.RequestParam(r => r.CategoryIds, "List of categories to apply");
            s.RequestParam(r => r.ScoringType, "The type of scoring this application will use {GAME_LEVEL, GAME_OBJECT");
            s.RequestParam(r => r.HintCost, "The cost of hints");
            s.RequestParam(r => r.MaxScore, "The maximum score that will be possible");
            s.RequestParam(r => r.TicketsPerPoint, "The point-to-ticket conversion ratio");
            s.RequestParam(r => r.HasGameData, "Determines whether the application uses services to save custom game objects");
            s.RequestParam(r => r.PublicNotifications, "Public Notifications");
            s.RequestParam(r => r.UseMatchingAlgorithm, "Use Matching Algorithm");
            s.RequestParam(r => r.GlobalTickets, "Determines whether earned tickets are applied across all applications");
            s.RequestParam(r => r.BuildVersion, "The current build version of the application");
            s.RequestParam(r => r.ApiVersion, "The current API version the application uses");
            s.RequestParam(r => r.PlacementName, "The name of the placement");
            s.RequestParam(r => r.PlacementDescription, "The description of the placement");
            s.RequestParam(r => r.PlacementSize, "The ad placement size {BANNER, LEADERBOARD, SKYSCRAPER, INTERSTITIAL, CUSTOM (this is required if a placements is to be created)");
            s.RequestParam(r => r.PlacementHeight, "The height of a custom ad size");
            s.RequestParam(r => r.PlacementWidth, "The width of a custom ad size");
            s.RequestParam(r => r.PlacementRefreshInterval, "The refresh interval in seconds");
            s.RequestParam(r => r.CreateObjectStore, "Generate a custom object store to use");
            s.RequestParam(r => r.PublicContentApproval, "Determine whether or not public content requires admin approval before it becomes public");
            s.RequestParam(r => r.ProductionMode, "Determines whether the application uses production or sandbox services");
            s.RequestParam(r => r.MinimumSessionLength, "Minimum Session Length");
            s.RequestParam(r => r.SessionGapLength, "Session Gap Length");
            s.RequestParam(r => r.LocalAdsEnabled, "Local Ads Enabled");
            s.RequestParam(r => r.SqootApiKey, "Sqoot Api Key");
            s.RequestParam(r => r.TrilatProcessingType, "Determines how to process trilateration data. Possible values include: DEFAULT, FINGERPRINT");
            s.RequestParam(r => r.MaxSampleSize, "Determines what the maximum sample size during trilateration");
            s.RequestParam(r => r.MinRSSI, "Determines what the minimum acceptable RSSI value");
            s.RequestParam(r => r.Modules, "List modules allowed to be served by the server, possible values include: COMMON, MEDIA, OFFER, GAME, SOCIAL, CONSUMER_WEBSITE, ALL");
            s.RequestParam(r => r.AuthorizedCount, "How many servers the license will support");
            s.RequestParam(r => r.AuthorizedServers, "The list of ip addresses of servers the license will support, leave null for any server");
            s.RequestParam(r => r.DefaultTimezone, "Sets the default timezone for the app (used for leaderboards and other time specific content)");
            s.RequestParam(r => r.SmtpPass, "SMTP Pass");
            s.RequestParam(r => r.MetaData, "The application meta data. Defined by the client");
            s.RequestParam(r => r.PlacementMetaData, "The ad placement meta data. Defined by the client");
            s.RequestParam(r => r.IpsFloor, "Create floor tables for Ips");
            s.RequestParam(r => r.EnableAPNSBadge, "Enables setting the APNS badge value in the payload");
            s.RequestParam(r => r.IncludeInReport, "Enables using the application in session reports");
            s.RequestParam(r => r.DefaultAppFilterId, "Sets the default filter to use (if none is passed in) for certain search APIs including Album Search.");
            s.RequestParam(r => r.EnableWelcomeEmail, "Enables whether the default welcome email will be sent for new app users");
            s.RequestParam(r => r.AppleAppId, "The Apple Application ID");
            s.RequestParam(r => r.AppleTeamId, "The Apple Team ID");
            s.RequestParam(r => r.AppleAuthKeyId, "The Apple Auth Key ID");
            s.RequestParam(r => r.AppleAuthKey, "The Apple Auth Signin Key (p8) File");
            s.RequestParam(r => r.AppleIssuerId, "The Apple Issuer ID");
            s.RequestParam(r => r.AppStoreKeyId, "The Apple App Store Key ID");
            s.RequestParam(r => r.AppStoreKey, "The Apple App Store Key (p8) File");
            s.RequestParam(r => r.GooglePrivateKeyFile, "This is the private key file for your Google service account.");
            s.RequestParam(r => r.AuthorizeNetApiKey, "Authorize Net Api Key");
            s.RequestParam(r => r.AuthorizeNetTransactionKey, "Authorize Net Transaction Key");
            s.RequestParam(r => r.EmailSender, "Email Sender");
            s.RequestParam(r => r.SmtpUser, "SMTP User");
            s.RequestParam(r => r.SmtpHost, "SMTP Host");
            s.RequestParam(r => r.VatomBusinessId, "Vatom Business Id");
            s.RequestParam(r => r.VatomRestClientId, "Vatom REST Client Id");
            s.RequestParam(r => r.VatomRestSecretKey, "Vatom Secret Key");
            s.RequestParam(r => r.TwilioAccountSID, "Twilio Account SID");
            s.RequestParam(r => r.TwilioAuthToken, "Twilio Auth Token");
            s.RequestParam(r => r.TwilioSenderPhoneNumber, "Twilio Sender Phone Number");
            s.RequestParam(r => r.OpenAISecretKey, "OpenAI Secret API Key");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateApplicationRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Change Appliation Status
/// </summary>

public class UpdateApplicationActiveEndpoint : FastEndpoints.Endpoint<UpdateApplicationActiveRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/application/active");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Application");
        });

        Summary(s => {
            s.Summary = "Change Appliation Status";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account used to perform the delete, must have rights to edit the application.");
            s.RequestParam(r => r.AppKey, "The key of the application to be deleted");
            s.RequestParam(r => r.Active, "If true then set to active, false otherwise");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateApplicationActiveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Ad Placement
/// </summary>

public class UpdateApplicationPlacementEndpoint : FastEndpoints.Endpoint<UpdateApplicationPlacementRequest, PlacementResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/application/placement/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Application");
        });

        Summary(s => {
            s.Summary = "Update Ad Placement";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.PlacementId, "The id of the placement to update, the user must have rights to the application the ad placement is for");
            s.RequestParam(r => r.DeviceId, "The unique id of the device making the request (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Name, "The name of the placement");
            s.RequestParam(r => r.Description, "The description of the placement");
            s.RequestParam(r => r.Size, "The ad placement size {BANNER, LEADERBOARD, SKYSCRAPER, INTERSTITIAL, CUSTOM");
            s.RequestParam(r => r.Height, "The height of a custom ad size");
            s.RequestParam(r => r.Width, "The width of a custom ad size");
            s.RequestParam(r => r.RefreshInterval, "The refresh interval in seconds");
            s.RequestParam(r => r.DefaultImageId, "Default Image Id");
            s.RequestParam(r => r.Active, "Active");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateApplicationPlacementRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Application Certificate
/// </summary>

public class UploadApplicationCertificateEndpoint : FastEndpoints.Endpoint<UploadApplicationCertificateRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/application/certificate/create");
        
        
        AllowAnonymous();
        AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Application");
        });

        Summary(s => {
            s.Summary = "Create Application Certificate";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AppKey, "The key of the application");
            s.RequestParam(r => r.DeviceId, "Device Id");
            s.RequestParam(r => r.AccountId, "The account used to perform the delete, must have rights to edit the application.");
            s.RequestParam(r => r.Certificate, "Certificate");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UploadApplicationCertificateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

