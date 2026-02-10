
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class AddOrUpdateThemeDescriptorRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// a unique ID given by the device (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account ID of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameType")]
    public string? GameType { get; set; }
    /// <summary>
    /// the theme descriptor id used to update an existing theme, leave empty for creating a new theme
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("themeDescriptorId")]
    public long? ThemeDescriptorId { get; set; }
    /// <summary>
    /// the title of the theme
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string? Title { get; set; }
    /// <summary>
    /// the description of the theme
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// determines whether the theme&#39;s participants have read permissions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("publicRead")]
    public bool PublicRead { get; set; }
    /// <summary>
    /// determines whether the theme&#39;s participants have write permissions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("publicWrite")]
    public bool PublicWrite { get; set; }
    /// <summary>
    /// determines whether the theme&#39;s participants have delete permissions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("publicDelete")]
    public bool PublicDelete { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("publicAdd")]
    public bool PublicAdd { get; set; }
    /// <summary>
    /// the determines the theme&#39;s participants (PUBLIC - includes everyone in the system as a potential participant, PRIVATE - only considers people who have been invited as participants)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("visibility")]
    public string Visibility { get; set; }
    /// <summary>
    /// a comma separated list of connection IDs to share to users
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionIdsToAdd")]
    public string? ConnectionIdsToAdd { get; set; }
    /// <summary>
    /// a comma separated list of connection group IDs to share to groups
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionGroupIdsToAdd")]
    public string? ConnectionGroupIdsToAdd { get; set; }
    /// <summary>
    /// flag to determine whether to share to the user&#39;s \&quot;friends\&quot; group
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeFriendGroup")]
    public bool IncludeFriendGroup { get; set; }
    /// <summary>
    /// the application version the theme was created for
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appVersion")]
    public string? AppVersion { get; set; }
    /// <summary>
    /// a json array used to replace colors within the application. Example: &#x60;&#x60;&#x60;json [   {     \&quot;name\&quot;: \&quot;sceneAtlas\&quot;,     \&quot;valueString\&quot;: \&quot;100,100,100,255\&quot;   },   {     \&quot;name\&quot;: \&quot;bg\&quot;,     \&quot;valueString\&quot;: \&quot;100,100,100,255\&quot;   } ] &#x60;&#x60;&#x60; 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("colorValueJson")]
    public string? ColorValueJson { get; set; }
    /// <summary>
    /// a json array used to replace strings within the application. Example: &#x60;&#x60;&#x60;json [   {     \&quot;name\&quot;: \&quot;coins\&quot;,     \&quot;valueString\&quot;: \&quot;Gems\&quot;   },   {     \&quot;name\&quot;: \&quot;lives\&quot;,     \&quot;valueString\&quot;: \&quot;lives\&quot;   } ] &#x60;&#x60;&#x60; 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("stringReplacerJson")]
    public string? StringReplacerJson { get; set; }
    /// <summary>
    /// a json object used by the scene atlas to position sprites. Example: &#x60;&#x60;&#x60;json {   \&quot;pShootingOffset\&quot;: [     {       \&quot;name\&quot;: \&quot;x\&quot;,       \&quot;valueString\&quot;: \&quot;2.2\&quot;     },     {       \&quot;name\&quot;: \&quot;y\&quot;,       \&quot;valueString\&quot;: \&quot;-0.3\&quot;     }   ],   \&quot;e1ShootingOffset\&quot;: [     {       \&quot;name\&quot;: \&quot;x\&quot;,       \&quot;valueString\&quot;: \&quot;0.25\&quot;     },     {       \&quot;name\&quot;: \&quot;y\&quot;,       \&quot;valueString\&quot;: \&quot;0.5\&quot;     }   ] } &#x60;&#x60;&#x60; 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("customJsonObjects")]
    public string? CustomJsonObjects { get; set; }
    /// <summary>
    /// a MultipartFile containing the image used as the theme icon
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("iconImage")]
    public System.IO.Stream? IconImage { get; set; }
    /// <summary>
    /// a MultipartFile containing the scene atlas
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sceneAtlasImage")]
    public System.IO.Stream? SceneAtlasImage { get; set; }
    /// <summary>
    /// a MultipartFile containing the background image
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bgImage")]
    public System.IO.Stream? BgImage { get; set; }
    /// <summary>
    /// a MultipartFile containing the background sound file (preferably in MP3 format)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bgSound")]
    public System.IO.Stream? BgSound { get; set; }
    /// <summary>
    /// used to select a default sound file that already exists in the application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("musicSelection")]
    public string? MusicSelection { get; set; }
    /// <summary>
    /// determines whether to use default values to complete the theme
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("completeWithDefaultValues")]
    public bool CompleteWithDefaultValues { get; set; }
    /// <summary>
    /// the description of the user&#39;s current location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locationDescription")]
    public string? LocationDescription { get; set; }
    /// <summary>
    /// the current latitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// the current longitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
}
public class GetThemeDescriptorRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// a unique ID given by the device (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account ID of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameType")]
    public string? GameType { get; set; }
    /// <summary>
    /// the theme id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("themeDescriptorId")]
    public long ThemeDescriptorId { get; set; }
    /// <summary>
    /// latitude used to update the user&#39;s current location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// longitude used to update the user&#39;s current location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
}
public class GetThemeDescriptorsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// a unique id given by the device (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the unique title of an application given from the admin tool
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameType")]
    public string? GameType { get; set; }
    /// <summary>
    /// contest type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("contestType")]
    public string? ContestType { get; set; }
    /// <summary>
    /// search on contests that an account has access to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ownerId")]
    public long? OwnerId { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
    /// <summary>
    /// a keyword to search on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// a comma separated list of Ownership
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filter")]
    public string Filter { get; set; }
    /// <summary>
    /// the field to sort by. See ThemeDescriptorApiMap
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string SortField { get; set; }
    /// <summary>
    /// determines whether the sorted list is in descending or ascending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool Descending { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_i")]
    public int? I { get; set; }
    /// <summary>
    /// the start parameter for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_l")]
    public int? L { get; set; }
    /// <summary>
    /// the limit parameter for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
    /// <summary>
    /// filter on items that have been created before this date
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("dateCreated")]
    public long? DateCreated { get; set; }
    /// <summary>
    /// application version of the theme to filter by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appVersion")]
    public string? AppVersion { get; set; }
    /// <summary>
    /// latitude used to update the user&#39;s current location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// longitude used to update the user&#39;s current location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
}
public class RemoveThemeDescriptorRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// a unique id given by the device (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the unique title of an application given from the admin tool
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameType")]
    public string? GameType { get; set; }
    /// <summary>
    /// the theme id to remove
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("themeDescriptorId")]
    public long ThemeDescriptorId { get; set; }
    /// <summary>
    /// latitude used to update the user&#39;s current location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// longitude used to update the user&#39;s current location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
}


