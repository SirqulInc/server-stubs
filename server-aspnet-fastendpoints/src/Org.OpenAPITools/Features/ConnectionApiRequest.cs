
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class AddConnectionToGroupRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// whether to return nulls or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnNulls")]
    public bool ReturnNulls { get; set; }
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
    /// the connection id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionId")]
    public long? ConnectionId { get; set; }
    /// <summary>
    /// the connection account id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionAccountId")]
    public long? ConnectionAccountId { get; set; }
    /// <summary>
    /// the pending id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("pendingId")]
    public long? PendingId { get; set; }
    /// <summary>
    /// the group id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("groupId")]
    public long GroupId { get; set; }
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
public class AddConnectionsToGroupRequest
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
    /// comma separated list of connection ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionIds")]
    public string? ConnectionIds { get; set; }
    /// <summary>
    /// comma separated list of connection account ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionAccountIds")]
    public string? ConnectionAccountIds { get; set; }
    /// <summary>
    /// the connection group ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionGroupId")]
    public long ConnectionGroupId { get; set; }
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
public class AddSubGroupsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// whether to return nulls or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnNulls")]
    public bool ReturnNulls { get; set; }
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
    /// the parent group id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("groupId")]
    public long GroupId { get; set; }
    /// <summary>
    /// comma separated list of group IDs to add to the parent group
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("subGroupIds")]
    public string SubGroupIds { get; set; }
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
public class CreateOrUpdateConnectionRequest
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
    /// the connection id for editing
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionId")]
    public long? ConnectionId { get; set; }
    /// <summary>
    /// the connection account id (i.e. the account id of another user)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionAccountId")]
    public long? ConnectionAccountId { get; set; }
    /// <summary>
    /// the pending id (usually for people who do not have a Sirqul account but are already friends via other third party apps)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("pendingId")]
    public long? PendingId { get; set; }
    /// <summary>
    /// optional group id if the user wants to add this person into a group
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("groupId")]
    public long? GroupId { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameType")]
    public string? GameType { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// determines whether the user is trusting this account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("isTrusted")]
    public bool? IsTrusted { get; set; }
    /// <summary>
    /// determines whether the user has set to ignore the user&#39;s friend request
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ignoreFriendRequest")]
    public bool? IgnoreFriendRequest { get; set; }
    /// <summary>
    /// determines whether the user is a contact of this account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("isContact")]
    public bool? IsContact { get; set; }
    /// <summary>
    /// determines whether the user is blocking this account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("isBlocked")]
    public bool? IsBlocked { get; set; }
    /// <summary>
    /// determines whether the user is following this account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("isFollowing")]
    public bool? IsFollowing { get; set; }
    /// <summary>
    /// whether to return the connection response or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionResponse")]
    public bool? ConnectionResponse { get; set; }
}
public class CreateOrUpdateGroupRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// whether to return nulls or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnNulls")]
    public bool ReturnNulls { get; set; }
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
    /// the name of the group
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string? Name { get; set; }
    /// <summary>
    /// the group id to update a group (don&#39;t pass anything in if you want to create a new group)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("groupId")]
    public long? GroupId { get; set; }
    /// <summary>
    /// the asset to attach to the group
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetId")]
    public long? AssetId { get; set; }
    /// <summary>
    /// comma separated list of connection IDs
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connections")]
    public string? Connections { get; set; }
    /// <summary>
    /// the description of the group
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// determines whether the connections in the group can see the user&#39;s profile info
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("canViewProfileInfo")]
    public bool? CanViewProfileInfo { get; set; }
    /// <summary>
    /// determines whether the connections in the group can see the user&#39;s game info
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("canViewGameInfo")]
    public bool? CanViewGameInfo { get; set; }
    /// <summary>
    /// determines whether the connections in the group can see the user&#39;s friends/connections
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("canViewFriendInfo")]
    public bool? CanViewFriendInfo { get; set; }
    /// <summary>
    /// Sets whether the connection group is active or inactive
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// the latitude of the group
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// the longitude of the group
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
}
public class FollowAcceptRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the account id of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the account ID of the user who initiated the follow
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionAccountId")]
    public long ConnectionAccountId { get; set; }
    /// <summary>
    /// the application key for sending notifications
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
}
public class FollowRejectRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the account id of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the account ID of the user who initiated the follow
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionAccountId")]
    public long ConnectionAccountId { get; set; }
    /// <summary>
    /// the application key for sending notifications
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
}
public class FollowRemoveRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the account id of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the account ID of the user who you want to unfollow
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionAccountId")]
    public long ConnectionAccountId { get; set; }
    /// <summary>
    /// the application key for sending notifications
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
}
public class FollowRequestRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the account id of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the account ID of the user who you want to follow
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionAccountId")]
    public long ConnectionAccountId { get; set; }
    /// <summary>
    /// the application key for sending notifications
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// determines if the other user needs to confirm the follow request
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("approvalNeeded")]
    public bool? ApprovalNeeded { get; set; }
}
public class FriendAcceptRequest
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
    /// the friend&#39;s account id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("friendAccountId")]
    public long FriendAccountId { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameType")]
    public string? GameType { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// determines whether to send a notification to the afflicting party
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("notifyFriend")]
    public bool NotifyFriend { get; set; }
    /// <summary>
    /// optional message to send in a notification
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("notificationMessage")]
    public string? NotificationMessage { get; set; }
}
public class FriendRejectRequest
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
    /// the friend&#39;s account id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("friendAccountId")]
    public long FriendAccountId { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameType")]
    public string? GameType { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// determines whether to send a notification to the afflicting party
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("notifyFriend")]
    public bool? NotifyFriend { get; set; }
    /// <summary>
    /// optional message to send in a notification
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("notificationMessage")]
    public string? NotificationMessage { get; set; }
}
public class FriendRemoveRequest
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
    /// the account ID of the friend to remove
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("friendAccountId")]
    public long FriendAccountId { get; set; }
    /// <summary>
    /// optionally notifies the connection that they have been removed as a friend
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("notifyFriend")]
    public bool? NotifyFriend { get; set; }
    /// <summary>
    /// optionally removes the connection from the user&#39;s groups
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("removeFromGroups")]
    public bool? RemoveFromGroups { get; set; }
}
public class FriendRequestRequest
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
    /// the friend&#39;s account id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("friendAccountId")]
    public long FriendAccountId { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameType")]
    public string? GameType { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// optional message to send in a notification
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("notificationMessage")]
    public string? NotificationMessage { get; set; }
}
public class GetConnectionSentFriendRequestsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the ID of the device
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the id of the account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
}
public class GetConnectionsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// whether to return nulls or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnNulls")]
    public bool ReturnNulls { get; set; }
    /// <summary>
    /// the device id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// optional parameter to search on other account&#39;s connections
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionAccountId")]
    public long? ConnectionAccountId { get; set; }
    /// <summary>
    /// a comma separated list of ConnectionApiMap. (NOTE on FOLLOWER vs FOLLOWING: FOLLOWER will get me a list of followers, FOLLOWING will get me a list of people I am following)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filter")]
    public string Filter { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
    /// <summary>
    /// an optional keyword to search on, this parameter is ignored if empty
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// sorts the response list by ConnectionApiMap
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string SortField { get; set; }
    /// <summary>
    /// sorts the response list by descending order if true
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool Descending { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_i")]
    public int? I { get; set; }
    /// <summary>
    /// start index of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_l")]
    public int? L { get; set; }
    /// <summary>
    /// limit of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
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
public class GetGroupDetailsRequest
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
    /// the group id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("groupId")]
    public long? GroupId { get; set; }
    /// <summary>
    /// whether to combine connections or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("combineConnections")]
    public bool CombineConnections { get; set; }
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
public class GroupSearchRequest
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
    /// keyword search string
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// the field to sort by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string SortField { get; set; }
    /// <summary>
    /// whether to return results in descending or ascending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool Descending { get; set; }
    /// <summary>
    /// to search on active only or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool ActiveOnly { get; set; }
    /// <summary>
    /// The start of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// the limit of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
}
public class RemoveConnectionFromGroupRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// whether to return nulls or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnNulls")]
    public bool ReturnNulls { get; set; }
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
    /// the connection id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionId")]
    public long? ConnectionId { get; set; }
    /// <summary>
    /// the connection account id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionAccountId")]
    public long? ConnectionAccountId { get; set; }
    /// <summary>
    /// the pending id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("pendingId")]
    public long? PendingId { get; set; }
    /// <summary>
    /// the group id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("groupId")]
    public long GroupId { get; set; }
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
public class RemoveConnectionsFromGroupRequest
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
    /// comma separated list of connection ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionIds")]
    public string? ConnectionIds { get; set; }
    /// <summary>
    /// comma separated list of connection account ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionAccountIds")]
    public string? ConnectionAccountIds { get; set; }
    /// <summary>
    /// connection group id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionGroupId")]
    public long ConnectionGroupId { get; set; }
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
public class RemoveGroupRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// whether to return nulls or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnNulls")]
    public bool ReturnNulls { get; set; }
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
    /// the group id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("groupId")]
    public long GroupId { get; set; }
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
public class RemoveSubGroupsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// whether to return nulls or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnNulls")]
    public bool ReturnNulls { get; set; }
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
    /// the parent group id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("groupId")]
    public long GroupId { get; set; }
    /// <summary>
    /// comma separated list of group IDs to remove from the parent group
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("subGroupIds")]
    public string SubGroupIds { get; set; }
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
public class SearchConnectionsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// return all json attributes if true. defualt is true.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnNulls")]
    public bool ReturnNulls { get; set; }
    /// <summary>
    /// the device id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
    /// <summary>
    /// keyword to search on, optional and this parameter is ignored if empt
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
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
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameType")]
    public string? GameType { get; set; }
    /// <summary>
    /// the public application key, if provided only looks for users of that application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_i")]
    public int? I { get; set; }
    /// <summary>
    /// start index of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_l")]
    public int? L { get; set; }
    /// <summary>
    /// limit of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
    /// <summary>
    /// the field to sort on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// whether the search has location or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hasLocation")]
    public bool? HasLocation { get; set; }
}


