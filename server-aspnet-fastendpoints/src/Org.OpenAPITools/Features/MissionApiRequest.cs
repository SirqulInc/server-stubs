
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateMissionRequest
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
    /// The title of the mission
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string Title { get; set; }
    /// <summary>
    /// The description of the mission
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// Custom string client apps can use for searching/filtering missions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("subType")]
    public string? SubType { get; set; }
    /// <summary>
    /// The date/time to start the mission, send 0 to unset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// The date/time to end the mission, send 0 to unset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long? EndDate { get; set; }
    /// <summary>
    /// Activate/deactivate the mission
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// the game level ids to include in the mission, comma separated
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameLevelIds")]
    public string? GameLevelIds { get; set; }
    /// <summary>
    /// creatives to associate with the mission
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("creativeIds")]
    public string? CreativeIds { get; set; }
    /// <summary>
    /// audiences to associate with the mission
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceIds")]
    public string? AudienceIds { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionTask")]
    public string? MissionTask { get; set; }
    /// <summary>
    /// The string identifier for a mission format (this is not the missionFormatId)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("formatType")]
    public string? FormatType { get; set; }
    /// <summary>
    /// The offerId to give as a reward
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerId")]
    public long? OfferId { get; set; }
    /// <summary>
    /// Set the amount of money available to spend, once 0 deactivate mission. Set to a negative value for unlimited.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("balance")]
    public double? Balance { get; set; }
    /// <summary>
    /// Flag to mark the mission as eligible for advanced reporting
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("advancedReporting")]
    public bool? AdvancedReporting { get; set; }
    /// <summary>
    /// Flag to indicate owner should receive tickets for completed missions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("allocateTickets")]
    public bool? AllocateTickets { get; set; }
    /// <summary>
    /// The number of tickets to reward
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ticketCount")]
    public long? TicketCount { get; set; }
    /// <summary>
    /// The type of ticket to reward, null means default type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ticketType")]
    public string? TicketType { get; set; }
    /// <summary>
    /// The number of points to award for completing a mission
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("points")]
    public long? Points { get; set; }
    /// <summary>
    /// external custom client defined data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
    /// <summary>
    /// Comma separated list of application ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("applicationIds")]
    public string? ApplicationIds { get; set; }
    /// <summary>
    /// Deprecated parameter for device names
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("devices")]
    public string? Devices { get; set; }
    /// <summary>
    /// Comma separated list of device ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceIds")]
    public string? DeviceIds { get; set; }
    /// <summary>
    /// Comma separated list of device version ranges
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceVersions")]
    public string? DeviceVersions { get; set; }
    /// <summary>
    /// List of lat/long pairs for mission locations
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locations")]
    public string? Locations { get; set; }
    /// <summary>
    /// Comma separated list of radii for locations
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("radius")]
    public string? Radius { get; set; }
}
public class DeleteMissionRequest
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
    /// the id of the mission to delete
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionId")]
    public long MissionId { get; set; }
}
public class FindMissionsRequest
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
    /// The type of mission to get, possible values are: click_banner, click_leaderboard, click_skyscraper, click_full, click_video, or click_zip
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("suffix")]
    public string? Suffix { get; set; }
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
    /// Include the game level data with the mission.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeGameData")]
    public bool? IncludeGameData { get; set; }
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
    /// return a random set of results, default is true. If false returns in natural order.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("randomize")]
    public bool? Randomize { get; set; }
    /// <summary>
    /// return only ads targeted to the specific app, no global ads.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("targetedAdsOnly")]
    public bool? TargetedAdsOnly { get; set; }
    /// <summary>
    /// return only ads from the specified campaigns.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionIds")]
    public string? MissionIds { get; set; }
    /// <summary>
    /// will return the items that have at least 1 or all of their audiences exist in the logged in user’s audiences, depending if the value is OR or AND
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceOperator")]
    public string? AudienceOperator { get; set; }
}
public class GetMissionRequest
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
    /// The id of the mission to return.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionId")]
    public long MissionId { get; set; }
    /// <summary>
    /// Return creatives associated with the mission when true
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnCreative")]
    public bool? ReturnCreative { get; set; }
}
public class ImportMissionRequest
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
    /// The current location of the requesting device
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double Latitude { get; set; }
    /// <summary>
    /// The current location of the requesting device
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double Longitude { get; set; }
    /// <summary>
    /// the keyword of the mission
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// The starting index in the result set to return. Default is 0.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// The total number of records to return. Default is 20.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// the size of the ad
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("adSize")]
    public string? AdSize { get; set; }
}
public class SearchMissionFormatsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The starting index in the result set to return. Default is 0.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// The total number of records to return. Default is 20.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
    /// <summary>
    /// Determines whether to return only active results. Default is false.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool ActiveOnly { get; set; }
}
public class SearchMissionsRequest
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
    /// Filter by keyword
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// Custom string client apps can use for searching/filtering missions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("subType")]
    public string? SubType { get; set; }
    /// <summary>
    /// The index into the record set to start with. Default is 0.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// The total number of record to return. Default is 20, maximum is 100.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// If true then return the game level data in the response. Default is false.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeGameData")]
    public bool? IncludeGameData { get; set; }
    /// <summary>
    /// If true then return the audience data in the response. Default is false.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeAudiences")]
    public bool? IncludeAudiences { get; set; }
    /// <summary>
    /// If true then include inactive missions. Default is false.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeInactive")]
    public bool? IncludeInactive { get; set; }
    /// <summary>
    /// A list of game types to include; click_leaderboard, click_banner, click_skyscraper, click_full, click_video, click_zip, create, vote, question, invite, share, json, xml
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("suffix")]
    public string? Suffix { get; set; }
    /// <summary>
    /// The field to sort the search on (for example TITLE)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// Whether to sort in descending order (default true)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
}
public class SearchMissionsByBillableEntityRequest
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
    /// Filter by keyword
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// The index into the record set to start with. Default is 0.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// The total number of record to return. Default id 20.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// If true then return the game level data in the response. Default is false.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeGameData")]
    public bool? IncludeGameData { get; set; }
    /// <summary>
    /// If true then return the audience data in the response. Default is false.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeAudiences")]
    public bool? IncludeAudiences { get; set; }
    /// <summary>
    /// If true then include inactive missions. Default is false.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeInactive")]
    public bool? IncludeInactive { get; set; }
    /// <summary>
    /// A list of game types to include; click_leaderboard, click_banner, click_skyscraper, click_full, click_video, click_zip, create, vote, question, invite, share, json, xml
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("suffix")]
    public string? Suffix { get; set; }
    /// <summary>
    /// The field to sort the search on (for example TITLE)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// Whether to sort in descending order (default true)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
}
public class UpdateMissionRequest
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
    /// The id of the mission to update.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionId")]
    public long MissionId { get; set; }
    /// <summary>
    /// The title of the mission
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string? Title { get; set; }
    /// <summary>
    /// The description of the mission
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// Custom string client apps can use for searching/filtering missions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("subType")]
    public string? SubType { get; set; }
    /// <summary>
    /// external custom client defined data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
    /// <summary>
    /// The date/time to start the mission, send 0 to unset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// The date/time to end the mission, send 0 to unset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long? EndDate { get; set; }
    /// <summary>
    /// Activate/deactivate the mission
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// the game level ids to include in the mission, comma separated
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameLevelIds")]
    public string? GameLevelIds { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("creativeIds")]
    public string? CreativeIds { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceIds")]
    public string? AudienceIds { get; set; }
    /// <summary>
    /// The offerId to give as a reward
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerId")]
    public long? OfferId { get; set; }
    /// <summary>
    /// Replace the amount of money available to spend, once 0 deactivate mission. Set to a negative value for unlimited.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("balance")]
    public double? Balance { get; set; }
    /// <summary>
    /// Flag to mark the mission as eligible for advanced reporting
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("advancedReporting")]
    public bool? AdvancedReporting { get; set; }
    /// <summary>
    /// Flag to indicate owner should receive tickets for completed missions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("allocateTickets")]
    public bool? AllocateTickets { get; set; }
    /// <summary>
    /// The number of tickets to reward
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ticketCount")]
    public long? TicketCount { get; set; }
    /// <summary>
    /// The type of ticket to reward, null means default type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ticketType")]
    public string? TicketType { get; set; }
    /// <summary>
    /// The number of points to award for completing a mission
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("points")]
    public long? Points { get; set; }
    /// <summary>
    /// Comma separated list of application ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("applicationIds")]
    public string? ApplicationIds { get; set; }
    /// <summary>
    /// Deprecated parameter for device names
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("devices")]
    public string? Devices { get; set; }
    /// <summary>
    /// Comma separated list of device ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceIds")]
    public string? DeviceIds { get; set; }
    /// <summary>
    /// Comma separated list of device version ranges
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceVersions")]
    public string? DeviceVersions { get; set; }
    /// <summary>
    /// List of lat/long pairs for mission locations
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locations")]
    public string? Locations { get; set; }
    /// <summary>
    /// Comma separated list of radii for locations
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("radius")]
    public string? Radius { get; set; }
}


