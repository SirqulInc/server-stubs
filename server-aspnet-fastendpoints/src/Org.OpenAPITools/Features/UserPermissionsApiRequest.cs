
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class AddUsersToPermissionableRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the device id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the permissionable type of the object
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("permissionableType")]
    public string PermissionableType { get; set; }
    /// <summary>
    /// the id of the permissionable object
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("permissionableId")]
    public long PermissionableId { get; set; }
    /// <summary>
    /// the read permission of the users/groups
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("read")]
    public bool? Read { get; set; }
    /// <summary>
    /// the write permission of the users/groups
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("write")]
    public bool? Write { get; set; }
    /// <summary>
    /// the delete permission of the users/groups
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("delete")]
    public bool? Delete { get; set; }
    /// <summary>
    /// the add permission of the users/groups
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("add")]
    public bool? Add { get; set; }
    /// <summary>
    /// a comma separated list of connection ids (NOT the account ids)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionIds")]
    public string? ConnectionIds { get; set; }
    /// <summary>
    /// a comma separated list of account ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionAccountIds")]
    public string? ConnectionAccountIds { get; set; }
    /// <summary>
    /// a comma separated list of connection group ids (these are groups made by the user)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionGroupIds")]
    public string? ConnectionGroupIds { get; set; }
    /// <summary>
    /// sets whether the added users are marked as pending (and will require the album admins to accept) - admins can set this to false (to accept)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("pending")]
    public bool? Pending { get; set; }
    /// <summary>
    /// sets whether the added users will become admins or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("admin")]
    public bool? Admin { get; set; }
    /// <summary>
    /// flag to determine whether to include the built-in \&quot;friends\&quot; group
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeFriendGroup")]
    public bool? IncludeFriendGroup { get; set; }
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
    /// <summary>
    /// comma separated list of audience ids. This is a feature only available to the permissionable&#39;s application owner (and its employees). This will add all users from these audiences to the permissionable object. Notifications will not be sent to users if this feature is used.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceIds")]
    public string? AudienceIds { get; set; }
}
public class ApprovePermissionableRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// A unique ID given by the device (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account ID of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The permissionable type of the object
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("permissionableType")]
    public string PermissionableType { get; set; }
    /// <summary>
    /// The id of the permissionable object
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("permissionableId")]
    public long PermissionableId { get; set; }
    /// <summary>
    /// The approval status to set {PENDING, REJECTED, APPROVED, FEATURED}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("approvalStatus")]
    public string? ApprovalStatus { get; set; }
}
public class LeaveFromPermissionableRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the device id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the permissionable type PermissionableType
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("permissionableType")]
    public string PermissionableType { get; set; }
    /// <summary>
    /// the id of the permissionable object
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("permissionableId")]
    public long PermissionableId { get; set; }
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
public class RemoveUsersFromPermissionableRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the device id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the permissionable type of the object
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("permissionableType")]
    public string PermissionableType { get; set; }
    /// <summary>
    /// the id of the permissionable object
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("permissionableId")]
    public long PermissionableId { get; set; }
    /// <summary>
    /// a comma separated list of connection ids (NOT the account ids)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionIds")]
    public string? ConnectionIds { get; set; }
    /// <summary>
    /// a comma separated list of account ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionAccountIds")]
    public string? ConnectionAccountIds { get; set; }
    /// <summary>
    /// a comma separated list of connection group ids (these are groups made by the user)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionGroupIds")]
    public string? ConnectionGroupIds { get; set; }
    /// <summary>
    /// flag to determine whether to remove the built-in \&quot;friends\&quot; group
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("removeFriendGroup")]
    public bool? RemoveFriendGroup { get; set; }
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
    /// <summary>
    /// comma separated list of audience ids. This will remove all users from these audiences from the permissionable object. Notifications will not be sent to users if this feature is used.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceIds")]
    public string? AudienceIds { get; set; }
}
public class SearchPermissionablesRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// A unique ID given by the device (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account ID of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// Filter results for a specific user account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionAccountId")]
    public long? ConnectionAccountId { get; set; }
    /// <summary>
    /// Comma separated list of account IDs to filter results with
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionAccountIds")]
    public string? ConnectionAccountIds { get; set; }
    /// <summary>
    /// Filter user permissions by the permissionable object type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("permissionableType")]
    public string? PermissionableType { get; set; }
    /// <summary>
    /// The id of the permissionable object to filter by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("permissionableId")]
    public long? PermissionableId { get; set; }
    /// <summary>
    /// Keyword to search within permissionable records
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// Field to sort results on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// Sort descending when true
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// Return user permissions that are pending
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("pending")]
    public bool? Pending { get; set; }
    /// <summary>
    /// Return user permissions that are admins
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("admin")]
    public bool? Admin { get; set; }
    /// <summary>
    /// the start index for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// the limit for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}
public class SearchPermissionablesFollowingDistanceRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// A unique ID given by the device (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account ID of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// Filter results for a specific user account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionAccountId")]
    public long? ConnectionAccountId { get; set; }
    /// <summary>
    /// Comma separated list of account IDs to filter results with
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionAccountIds")]
    public string? ConnectionAccountIds { get; set; }
    /// <summary>
    /// Filter user permissions by the permissionable object type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("permissionableType")]
    public string? PermissionableType { get; set; }
    /// <summary>
    /// The id of the permissionable object to filter by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("permissionableId")]
    public long? PermissionableId { get; set; }
    /// <summary>
    /// The latitude of the current account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double Latitude { get; set; }
    /// <summary>
    /// The longitude of the current account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double Longitude { get; set; }
    /// <summary>
    /// The search range in miles
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("searchRange")]
    public double? SearchRange { get; set; }
    /// <summary>
    /// Keyword to search within permissionable records
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// Return user permissions that are pending
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("pending")]
    public bool? Pending { get; set; }
    /// <summary>
    /// Return user permissions that are admins
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("admin")]
    public bool? Admin { get; set; }
    /// <summary>
    /// The start index for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// The limit for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}


