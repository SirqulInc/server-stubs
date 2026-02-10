
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateMissionInviteRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the device id (deviceId or accountId required).
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required).
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The mission to find the invite for.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionId")]
    public long? MissionId { get; set; }
    /// <summary>
    /// code to be entered for user to join the mission
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("joinCode")]
    public string? JoinCode { get; set; }
    /// <summary>
    /// Include the game level data with the mission.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeGameData")]
    public bool? IncludeGameData { get; set; }
}
public class DeleteMissionInviteRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the device id (deviceId or accountId required).
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required).
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The mission to find the invite for (missionId or missionInviteId requried).
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionId")]
    public long? MissionId { get; set; }
    /// <summary>
    /// The mission invite id. This checks on the user&#39;s billable for permission (missionId or missionInviteId requried).
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionInviteId")]
    public long? MissionInviteId { get; set; }
    /// <summary>
    /// Include the game level data with the mission.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeGameData")]
    public bool? IncludeGameData { get; set; }
}
public class GetMissionInviteRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the device id (deviceId or accountId required).
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required).
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The mission to find the invite for (missionId or missionInviteId requried).
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionId")]
    public long? MissionId { get; set; }
    /// <summary>
    /// The mission invite id. This checks on the user&#39;s billable for permission (missionId or missionInviteId requried).
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionInviteId")]
    public long? MissionInviteId { get; set; }
    /// <summary>
    /// Include the game level data with the mission.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeGameData")]
    public bool? IncludeGameData { get; set; }
    /// <summary>
    /// include the scores with the mission
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeScores")]
    public string? IncludeScores { get; set; }
}
public class SearchMissionInvitesRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the device id (deviceId or accountId required).
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required).
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the app to retrieve the data for, use your application key.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// the application version, used to version the game level data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appVersion")]
    public string? AppVersion { get; set; }
    /// <summary>
    /// the mission id to filter on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionId")]
    public long? MissionId { get; set; }
    /// <summary>
    /// The invite status to filter for, comma separated list {AVAILABLE, PENDING, UPDATED, ACCEPTED, ACTIVE, QUIT, COMPLETED, PENDING_REVIEW, REJECTED}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("status")]
    public string? Status { get; set; }
    /// <summary>
    /// Only return invites that have been updated since this date/time (long)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("lastUpdated")]
    public long? LastUpdated { get; set; }
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
    /// the keyword to search on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionTypes")]
    public string? MissionTypes { get; set; }
    /// <summary>
    /// filter results by the account&#39;s billable
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filterByBillable")]
    public bool? FilterByBillable { get; set; }
    /// <summary>
    /// Include the game level data with the mission.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeGameData")]
    public bool? IncludeGameData { get; set; }
}
public class UpdateMissionInviteRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the device id (deviceId or accountId required).
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required).
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// The mission to find the invite for (missionId or missionInviteId requried).
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionId")]
    public long? MissionId { get; set; }
    /// <summary>
    /// The mission invite id. This checks on the user&#39;s billable for permission (missionId or missionInviteId requried).
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionInviteId")]
    public long? MissionInviteId { get; set; }
    /// <summary>
    /// the pack id to find the invite for
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("packId")]
    public long? PackId { get; set; }
    /// <summary>
    /// the game level id to find the invite for
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameLevelId")]
    public long? GameLevelId { get; set; }
    /// <summary>
    /// The invite status to filter for, comma separated list {AVAILABLE, PENDING, UPDATED, ACCEPTED, ACTIVE, QUIT, COMPLETED, PENDING_REVIEW, REJECTED}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("status")]
    public string? Status { get; set; }
    /// <summary>
    /// This is the content type for missions that require user submission. Note that user submitted content must require a status of PENDING_REVIEW to be accpeted. {ACCOUNT, GAMELEVEL, COLLECTION, ALBUM_CONTEST, THEME_DESCRIPTOR, ALBUM}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("permissionableType")]
    public string? PermissionableType { get; set; }
    /// <summary>
    /// The id of the content being submitted.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("permissionableId")]
    public long? PermissionableId { get; set; }
    /// <summary>
    /// Include the game level data with the mission.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeGameData")]
    public bool? IncludeGameData { get; set; }
}


