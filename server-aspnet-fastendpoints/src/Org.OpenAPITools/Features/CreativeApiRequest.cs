
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class AddPreviewRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The id of the creative that want to enable preview. The type of the creative should be CONFIG, otherwise no action will be applied.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("creativeId")]
    public long CreativeId { get; set; }
}
public class AdsFindRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The application key, if provided return missions specific for the app. Will always return mission levels that are app agnostic.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// The type of ads to get, possible values are: BANNER, LEADERBOARD, SKYSCRAPER, FULL, VIDEO, ZIP, CONFIG. Use this instead of suffix.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("type")]
    public string? Type { get; set; }
    /// <summary>
    /// The logged in user.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The version of the application, will not return levels newer than the appVersion.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appVersion")]
    public string? AppVersion { get; set; }
    /// <summary>
    /// The current location of the requesting device
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// The current location of the requesting device
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// Should use deviceId if possible. The name of the requesting device; possible values are: Android, iPhone, iPad, iPod, etc. use /audience/devices for list.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("device")]
    public string? Device { get; set; }
    /// <summary>
    /// The device ID of the requesting device, use /audience/devices for list
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceIdentifier")]
    public long? DeviceIdentifier { get; set; }
    /// <summary>
    /// The requesting device version; examples are: 2.3, 5.1.4, 6.1.4. Supports X, X.X, or X.X.X formated string.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceVersion")]
    public string? DeviceVersion { get; set; }
    /// <summary>
    /// The index into the record set to start with.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// The total number of record to return.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// If true then return the audience data in the response. Default is false.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeAudiences")]
    public bool? IncludeAudiences { get; set; }
    /// <summary>
    /// If true/false only return missions whose game levels allocate (or don&#39;t allocate) tickets. Do not provide a value to return both.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("allocatesTickets")]
    public bool? AllocatesTickets { get; set; }
    /// <summary>
    /// return a random set of results, default is true. If false returns in nature order.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("randomize")]
    public bool Randomize { get; set; }
    /// <summary>
    /// return only ads targets to the specific app, no global ads.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("targetedAdsOnly")]
    public bool TargetedAdsOnly { get; set; }
    /// <summary>
    /// return only ads from the specified campaigns.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionIds")]
    public string? MissionIds { get; set; }
}
public class CreateCreativeRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The logged in user.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The name of the level.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string Name { get; set; }
    /// <summary>
    /// The description of the level.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// The asset Id of the level image.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetImageId")]
    public long? AssetImageId { get; set; }
    /// <summary>
    /// This parameter is deprecated. deprecated use data field
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("action")]
    public string? Action { get; set; }
    /// <summary>
    /// The creative data, json based format depending on type. If not using action then data is required.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("data")]
    public string? Data { get; set; }
    /// <summary>
    /// This parameter is deprecated. deprecated use type field
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("suffix")]
    public string? Suffix { get; set; }
    /// <summary>
    /// The type of creative. If not using suffix then type is required.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("type")]
    public string? Type { get; set; }
    /// <summary>
    /// Set the amount of money available to spend, once 0 deactivate level. Set to a negative value for unlimited.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("balance")]
    public double? Balance { get; set; }
    /// <summary>
    /// If true set the game level as active. Default is false.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool Active { get; set; }
    /// <summary>
    /// if creative related so some other content provided the id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("referenceId")]
    public long? ReferenceId { get; set; }
    /// <summary>
    /// The version of the application, will not return creatives newer than the appVersion. Only used when requesting application configuration creatives.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appVersion")]
    public string? AppVersion { get; set; }
    /// <summary>
    /// Assign the creative to a campaign for timing and audience matching.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionId")]
    public long? MissionId { get; set; }
    /// <summary>
    /// the id of the offer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerId")]
    public long? OfferId { get; set; }
    /// <summary>
    /// determines whether the response will wait until the asset gets created
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("waitForAsset")]
    public bool WaitForAsset { get; set; }
}
public class DeleteCreativeRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the id of the creative to delete
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("creativeId")]
    public long CreativeId { get; set; }
}
public class GetCreativeRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the ID of the creative to get
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("creativeId")]
    public long CreativeId { get; set; }
}
public class GetCreativesByApplicationRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The logged in user.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Creatives contained in the provided mission.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionId")]
    public long? MissionId { get; set; }
    /// <summary>
    /// Match the keyword to the owner name or level name.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// Start the result set at some index.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// Limit the result to some number.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
}
public class RemovePreviewRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the ID of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the ID of the creative to remove preview
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("creativeId")]
    public long CreativeId { get; set; }
}
public class UpdateCreativeRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The logged in user.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the creative Id to upate.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("creativeId")]
    public long CreativeId { get; set; }
    /// <summary>
    /// The name of the level.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string? Name { get; set; }
    /// <summary>
    /// The description of the level.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// The asset Id of the level image.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetImageId")]
    public long? AssetImageId { get; set; }
    /// <summary>
    /// This parameter is deprecated. deprecated use data field
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("action")]
    public string? Action { get; set; }
    /// <summary>
    /// The creative data, json based format depending on type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("data")]
    public string? Data { get; set; }
    /// <summary>
    /// This parameter is deprecated. deprecated use type field
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("suffix")]
    public string? Suffix { get; set; }
    /// <summary>
    /// The type of creative.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("type")]
    public string? Type { get; set; }
    /// <summary>
    /// Set the amount of money available to spend, once 0 deactivate level. Set to a negative value for unlimited.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("balance")]
    public double? Balance { get; set; }
    /// <summary>
    /// If true set the game level as active. Default is false.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// if creative related so some other content provided the id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("referenceId")]
    public long? ReferenceId { get; set; }
    /// <summary>
    /// The version of the application, will not return creatives newer than the appVersion. Only used when requesting application configuration creatives.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appVersion")]
    public string? AppVersion { get; set; }
    /// <summary>
    /// Assign the creative to a campaign for timing and audience matching.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionId")]
    public long? MissionId { get; set; }
}


