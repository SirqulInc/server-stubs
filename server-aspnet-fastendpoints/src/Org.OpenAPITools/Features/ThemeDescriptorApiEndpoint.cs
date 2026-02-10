using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create/Update Theme
/// </summary>

public class AddOrUpdateThemeDescriptorEndpoint : FastEndpoints.Endpoint<AddOrUpdateThemeDescriptorRequest, ThemeDescriptorResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/consumer/theme");
        
        
        AllowAnonymous();
        AllowFileUploads();AllowFileUploads();AllowFileUploads();AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Theme Descriptor");
        });

        Summary(s => {
            s.Summary = "Create/Update Theme";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.PublicRead, "determines whether the theme&#39;s participants have read permissions");
            s.RequestParam(r => r.PublicWrite, "determines whether the theme&#39;s participants have write permissions");
            s.RequestParam(r => r.PublicDelete, "determines whether the theme&#39;s participants have delete permissions");
            s.RequestParam(r => r.PublicAdd, "");
            s.RequestParam(r => r.Visibility, "the determines the theme&#39;s participants (PUBLIC - includes everyone in the system as a potential participant, PRIVATE - only considers people who have been invited as participants)");
            s.RequestParam(r => r.IncludeFriendGroup, "flag to determine whether to share to the user&#39;s \&quot;friends\&quot; group");
            s.RequestParam(r => r.CompleteWithDefaultValues, "determines whether to use default values to complete the theme");
            s.RequestParam(r => r.DeviceId, "a unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account ID of the user (deviceId or accountId required)");
            s.RequestParam(r => r.GameType, "the application key");
            s.RequestParam(r => r.ThemeDescriptorId, "the theme descriptor id used to update an existing theme, leave empty for creating a new theme");
            s.RequestParam(r => r.Title, "the title of the theme");
            s.RequestParam(r => r.Description, "the description of the theme");
            s.RequestParam(r => r.ConnectionIdsToAdd, "a comma separated list of connection IDs to share to users");
            s.RequestParam(r => r.ConnectionGroupIdsToAdd, "a comma separated list of connection group IDs to share to groups");
            s.RequestParam(r => r.AppVersion, "the application version the theme was created for");
            s.RequestParam(r => r.ColorValueJson, "a json array used to replace colors within the application. Example: &#x60;&#x60;&#x60;json [   {     \&quot;name\&quot;: \&quot;sceneAtlas\&quot;,     \&quot;valueString\&quot;: \&quot;100,100,100,255\&quot;   },   {     \&quot;name\&quot;: \&quot;bg\&quot;,     \&quot;valueString\&quot;: \&quot;100,100,100,255\&quot;   } ] &#x60;&#x60;&#x60; ");
            s.RequestParam(r => r.StringReplacerJson, "a json array used to replace strings within the application. Example: &#x60;&#x60;&#x60;json [   {     \&quot;name\&quot;: \&quot;coins\&quot;,     \&quot;valueString\&quot;: \&quot;Gems\&quot;   },   {     \&quot;name\&quot;: \&quot;lives\&quot;,     \&quot;valueString\&quot;: \&quot;lives\&quot;   } ] &#x60;&#x60;&#x60; ");
            s.RequestParam(r => r.CustomJsonObjects, "a json object used by the scene atlas to position sprites. Example: &#x60;&#x60;&#x60;json {   \&quot;pShootingOffset\&quot;: [     {       \&quot;name\&quot;: \&quot;x\&quot;,       \&quot;valueString\&quot;: \&quot;2.2\&quot;     },     {       \&quot;name\&quot;: \&quot;y\&quot;,       \&quot;valueString\&quot;: \&quot;-0.3\&quot;     }   ],   \&quot;e1ShootingOffset\&quot;: [     {       \&quot;name\&quot;: \&quot;x\&quot;,       \&quot;valueString\&quot;: \&quot;0.25\&quot;     },     {       \&quot;name\&quot;: \&quot;y\&quot;,       \&quot;valueString\&quot;: \&quot;0.5\&quot;     }   ] } &#x60;&#x60;&#x60; ");
            s.RequestParam(r => r.IconImage, "a MultipartFile containing the image used as the theme icon");
            s.RequestParam(r => r.SceneAtlasImage, "a MultipartFile containing the scene atlas");
            s.RequestParam(r => r.BgImage, "a MultipartFile containing the background image");
            s.RequestParam(r => r.BgSound, "a MultipartFile containing the background sound file (preferably in MP3 format)");
            s.RequestParam(r => r.MusicSelection, "used to select a default sound file that already exists in the application");
            s.RequestParam(r => r.LocationDescription, "the description of the user&#39;s current location");
            s.RequestParam(r => r.Latitude, "the current latitude of the user");
            s.RequestParam(r => r.Longitude, "the current longitude of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AddOrUpdateThemeDescriptorRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Theme
/// </summary>

public class GetThemeDescriptorEndpoint : FastEndpoints.Endpoint<GetThemeDescriptorRequest, PurchaseItemListResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/consumer/theme/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Theme Descriptor");
        });

        Summary(s => {
            s.Summary = "Get Theme";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ThemeDescriptorId, "the theme id");
            s.RequestParam(r => r.DeviceId, "a unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account ID of the user (deviceId or accountId required)");
            s.RequestParam(r => r.GameType, "the application key");
            s.RequestParam(r => r.Latitude, "latitude used to update the user&#39;s current location");
            s.RequestParam(r => r.Longitude, "longitude used to update the user&#39;s current location");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetThemeDescriptorRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Themes
/// </summary>

public class GetThemeDescriptorsEndpoint : FastEndpoints.Endpoint<GetThemeDescriptorsRequest, PurchaseItemListResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/consumer/theme/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Theme Descriptor");
        });

        Summary(s => {
            s.Summary = "Search Themes";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Filter, "a comma separated list of Ownership");
            s.RequestParam(r => r.SortField, "the field to sort by. See ThemeDescriptorApiMap");
            s.RequestParam(r => r.Descending, "determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.Start, "the start parameter for pagination");
            s.RequestParam(r => r.Limit, "the limit parameter for pagination");
            s.RequestParam(r => r.DeviceId, "a unique id given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.GameType, "the unique title of an application given from the admin tool");
            s.RequestParam(r => r.ContestType, "contest type");
            s.RequestParam(r => r.OwnerId, "search on contests that an account has access to");
            s.RequestParam(r => r.Q, "This parameter is deprecated.");
            s.RequestParam(r => r.Keyword, "a keyword to search on");
            s.RequestParam(r => r.I, "This parameter is deprecated.");
            s.RequestParam(r => r.L, "This parameter is deprecated.");
            s.RequestParam(r => r.DateCreated, "filter on items that have been created before this date");
            s.RequestParam(r => r.AppVersion, "application version of the theme to filter by");
            s.RequestParam(r => r.Latitude, "latitude used to update the user&#39;s current location");
            s.RequestParam(r => r.Longitude, "longitude used to update the user&#39;s current location");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetThemeDescriptorsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Theme
/// </summary>

public class RemoveThemeDescriptorEndpoint : FastEndpoints.Endpoint<RemoveThemeDescriptorRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/consumer/theme/remove");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Theme Descriptor");
        });

        Summary(s => {
            s.Summary = "Delete Theme";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ThemeDescriptorId, "the theme id to remove");
            s.RequestParam(r => r.DeviceId, "a unique id given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.GameType, "the unique title of an application given from the admin tool");
            s.RequestParam(r => r.Latitude, "latitude used to update the user&#39;s current location");
            s.RequestParam(r => r.Longitude, "longitude used to update the user&#39;s current location");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(RemoveThemeDescriptorRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

