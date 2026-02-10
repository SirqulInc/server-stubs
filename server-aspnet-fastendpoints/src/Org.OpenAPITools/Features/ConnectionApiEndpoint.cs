using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Add Connection
/// </summary>

public class AddConnectionToGroupEndpoint : FastEndpoints.Endpoint<AddConnectionToGroupRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/consumer/connection/group/addConnection");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Connection");
        });

        Summary(s => {
            s.Summary = "Add Connection";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ReturnNulls, "whether to return nulls or not");
            s.RequestParam(r => r.GroupId, "the group id");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.ConnectionId, "the connection id");
            s.RequestParam(r => r.ConnectionAccountId, "the connection account id");
            s.RequestParam(r => r.PendingId, "the pending id");
            s.RequestParam(r => r.Latitude, "the current latitude of the user");
            s.RequestParam(r => r.Longitude, "the current longitude of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AddConnectionToGroupRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Add Connections
/// </summary>

public class AddConnectionsToGroupEndpoint : FastEndpoints.Endpoint<AddConnectionsToGroupRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/connection/group/addConnections");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Connection");
        });

        Summary(s => {
            s.Summary = "Add Connections";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ConnectionGroupId, "the connection group ID");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.ConnectionIds, "comma separated list of connection ids");
            s.RequestParam(r => r.ConnectionAccountIds, "comma separated list of connection account ids");
            s.RequestParam(r => r.Latitude, "the current latitude of the user");
            s.RequestParam(r => r.Longitude, "the current longitude of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AddConnectionsToGroupRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Add Connection Groups
/// </summary>

public class AddSubGroupsEndpoint : FastEndpoints.Endpoint<AddSubGroupsRequest, ConnectionGroupResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/consumer/connection/group/addSubGroup");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Connection");
        });

        Summary(s => {
            s.Summary = "Add Connection Groups";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ReturnNulls, "whether to return nulls or not");
            s.RequestParam(r => r.GroupId, "the parent group id");
            s.RequestParam(r => r.SubGroupIds, "comma separated list of group IDs to add to the parent group");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Latitude, "the current latitude of the user");
            s.RequestParam(r => r.Longitude, "the current longitude of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AddSubGroupsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create or Update Connection
/// </summary>

public class CreateOrUpdateConnectionEndpoint : FastEndpoints.Endpoint<CreateOrUpdateConnectionRequest, ConnectionResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/consumer/connection/add");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Connection");
        });

        Summary(s => {
            s.Summary = "Create or Update Connection";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.ConnectionId, "the connection id for editing");
            s.RequestParam(r => r.ConnectionAccountId, "the connection account id (i.e. the account id of another user)");
            s.RequestParam(r => r.PendingId, "the pending id (usually for people who do not have a Sirqul account but are already friends via other third party apps)");
            s.RequestParam(r => r.GroupId, "optional group id if the user wants to add this person into a group");
            s.RequestParam(r => r.GameType, "This parameter is deprecated.");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.IsTrusted, "determines whether the user is trusting this account");
            s.RequestParam(r => r.IgnoreFriendRequest, "determines whether the user has set to ignore the user&#39;s friend request");
            s.RequestParam(r => r.IsContact, "determines whether the user is a contact of this account");
            s.RequestParam(r => r.IsBlocked, "determines whether the user is blocking this account");
            s.RequestParam(r => r.IsFollowing, "determines whether the user is following this account");
            s.RequestParam(r => r.ConnectionResponse, "whether to return the connection response or not");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateOrUpdateConnectionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create or Update Connection Group
/// </summary>

public class CreateOrUpdateGroupEndpoint : FastEndpoints.Endpoint<CreateOrUpdateGroupRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/consumer/connection/group");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Connection");
        });

        Summary(s => {
            s.Summary = "Create or Update Connection Group";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ReturnNulls, "whether to return nulls or not");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Name, "the name of the group");
            s.RequestParam(r => r.GroupId, "the group id to update a group (don&#39;t pass anything in if you want to create a new group)");
            s.RequestParam(r => r.AssetId, "the asset to attach to the group");
            s.RequestParam(r => r.Connections, "comma separated list of connection IDs");
            s.RequestParam(r => r.Description, "the description of the group");
            s.RequestParam(r => r.CanViewProfileInfo, "determines whether the connections in the group can see the user&#39;s profile info");
            s.RequestParam(r => r.CanViewGameInfo, "determines whether the connections in the group can see the user&#39;s game info");
            s.RequestParam(r => r.CanViewFriendInfo, "determines whether the connections in the group can see the user&#39;s friends/connections");
            s.RequestParam(r => r.Active, "Sets whether the connection group is active or inactive");
            s.RequestParam(r => r.Latitude, "the latitude of the group");
            s.RequestParam(r => r.Longitude, "the longitude of the group");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateOrUpdateGroupRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Accept Follow Request
/// </summary>

public class FollowAcceptEndpoint : FastEndpoints.Endpoint<FollowAcceptRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/consumer/follow/accept");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Connection");
        });

        Summary(s => {
            s.Summary = "Accept Follow Request";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the account id of the user");
            s.RequestParam(r => r.ConnectionAccountId, "the account ID of the user who initiated the follow");
            s.RequestParam(r => r.AppKey, "the application key for sending notifications");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(FollowAcceptRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Reject Follow Request
/// </summary>

public class FollowRejectEndpoint : FastEndpoints.Endpoint<FollowRejectRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/consumer/follow/reject");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Connection");
        });

        Summary(s => {
            s.Summary = "Reject Follow Request";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the account id of the user");
            s.RequestParam(r => r.ConnectionAccountId, "the account ID of the user who initiated the follow");
            s.RequestParam(r => r.AppKey, "the application key for sending notifications");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(FollowRejectRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Remove Follower / Unfollow
/// </summary>

public class FollowRemoveEndpoint : FastEndpoints.Endpoint<FollowRemoveRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/consumer/follow/remove");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Connection");
        });

        Summary(s => {
            s.Summary = "Remove Follower / Unfollow";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the account id of the user");
            s.RequestParam(r => r.ConnectionAccountId, "the account ID of the user who you want to unfollow");
            s.RequestParam(r => r.AppKey, "the application key for sending notifications");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(FollowRemoveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Send Follow Request
/// </summary>

public class FollowRequestEndpoint : FastEndpoints.Endpoint<FollowRequestRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/consumer/follow/request");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Connection");
        });

        Summary(s => {
            s.Summary = "Send Follow Request";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the account id of the user");
            s.RequestParam(r => r.ConnectionAccountId, "the account ID of the user who you want to follow");
            s.RequestParam(r => r.AppKey, "the application key for sending notifications");
            s.RequestParam(r => r.ApprovalNeeded, "determines if the other user needs to confirm the follow request");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(FollowRequestRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Accept Friend
/// </summary>

public class FriendAcceptEndpoint : FastEndpoints.Endpoint<FriendAcceptRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/consumer/friend/accept");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Connection");
        });

        Summary(s => {
            s.Summary = "Accept Friend";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.FriendAccountId, "the friend&#39;s account id");
            s.RequestParam(r => r.NotifyFriend, "determines whether to send a notification to the afflicting party");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.GameType, "This parameter is deprecated.");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.NotificationMessage, "optional message to send in a notification");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(FriendAcceptRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Decline Friend
/// </summary>

public class FriendRejectEndpoint : FastEndpoints.Endpoint<FriendRejectRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/consumer/friend/reject");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Connection");
        });

        Summary(s => {
            s.Summary = "Decline Friend";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.FriendAccountId, "the friend&#39;s account id");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.GameType, "This parameter is deprecated.");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.NotifyFriend, "determines whether to send a notification to the afflicting party");
            s.RequestParam(r => r.NotificationMessage, "optional message to send in a notification");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(FriendRejectRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Friend
/// </summary>

public class FriendRemoveEndpoint : FastEndpoints.Endpoint<FriendRemoveRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/consumer/friend/remove");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Connection");
        });

        Summary(s => {
            s.Summary = "Delete Friend";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.FriendAccountId, "the account ID of the friend to remove");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.NotifyFriend, "optionally notifies the connection that they have been removed as a friend");
            s.RequestParam(r => r.RemoveFromGroups, "optionally removes the connection from the user&#39;s groups");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(FriendRemoveRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Request Friend
/// </summary>

public class FriendRequestEndpoint : FastEndpoints.Endpoint<FriendRequestRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/consumer/friend/request");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Connection");
        });

        Summary(s => {
            s.Summary = "Request Friend";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.FriendAccountId, "the friend&#39;s account id");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.GameType, "This parameter is deprecated.");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.NotificationMessage, "optional message to send in a notification");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(FriendRequestRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Sent Friend Requests
/// </summary>

public class GetConnectionSentFriendRequestsEndpoint : FastEndpoints.Endpoint<GetConnectionSentFriendRequestsRequest, ConnectionListResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/consumer/connection/getRequested");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Connection");
        });

        Summary(s => {
            s.Summary = "Get Sent Friend Requests";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "the ID of the device");
            s.RequestParam(r => r.AccountId, "the id of the account");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetConnectionSentFriendRequestsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Connections
/// </summary>

public class GetConnectionsEndpoint : FastEndpoints.Endpoint<GetConnectionsRequest, ConnectionListResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/consumer/connection/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Connection");
        });

        Summary(s => {
            s.Summary = "Search Connections";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ReturnNulls, "whether to return nulls or not");
            s.RequestParam(r => r.Filter, "a comma separated list of ConnectionApiMap. (NOTE on FOLLOWER vs FOLLOWING: FOLLOWER will get me a list of followers, FOLLOWING will get me a list of people I am following)");
            s.RequestParam(r => r.SortField, "sorts the response list by ConnectionApiMap");
            s.RequestParam(r => r.Descending, "sorts the response list by descending order if true");
            s.RequestParam(r => r.Start, "start index of the pagination");
            s.RequestParam(r => r.Limit, "limit of the pagination");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id (deviceId or accountId required)");
            s.RequestParam(r => r.ConnectionAccountId, "optional parameter to search on other account&#39;s connections");
            s.RequestParam(r => r.Q, "This parameter is deprecated.");
            s.RequestParam(r => r.Keyword, "an optional keyword to search on, this parameter is ignored if empty");
            s.RequestParam(r => r.I, "This parameter is deprecated.");
            s.RequestParam(r => r.L, "This parameter is deprecated.");
            s.RequestParam(r => r.Latitude, "the current latitude of the user");
            s.RequestParam(r => r.Longitude, "the current longitude of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetConnectionsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Connection Group
/// </summary>

public class GetGroupDetailsEndpoint : FastEndpoints.Endpoint<GetGroupDetailsRequest, ConnectionGroupResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/consumer/connection/group/details/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Connection");
        });

        Summary(s => {
            s.Summary = "Get Connection Group";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.CombineConnections, "whether to combine connections or not");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.GroupId, "the group id");
            s.RequestParam(r => r.Latitude, "the current latitude of the user");
            s.RequestParam(r => r.Longitude, "the current longitude of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetGroupDetailsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Connection Groups
/// </summary>

public class GroupSearchEndpoint : FastEndpoints.Endpoint<GroupSearchRequest, List<ConnectionInfoResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/connection/group/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Connection");
        });

        Summary(s => {
            s.Summary = "Search Connection Groups";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.SortField, "the field to sort by");
            s.RequestParam(r => r.Descending, "whether to return results in descending or ascending order");
            s.RequestParam(r => r.ActiveOnly, "to search on active only or not");
            s.RequestParam(r => r.Start, "The start of the pagination");
            s.RequestParam(r => r.Limit, "the limit of the pagination");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Latitude, "the current latitude of the user");
            s.RequestParam(r => r.Longitude, "the current longitude of the user");
            s.RequestParam(r => r.Keyword, "keyword search string");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GroupSearchRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Connection
/// </summary>

public class RemoveConnectionFromGroupEndpoint : FastEndpoints.Endpoint<RemoveConnectionFromGroupRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/consumer/connection/group/removeConnection");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Connection");
        });

        Summary(s => {
            s.Summary = "Delete Connection";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ReturnNulls, "whether to return nulls or not");
            s.RequestParam(r => r.GroupId, "the group id");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.ConnectionId, "the connection id");
            s.RequestParam(r => r.ConnectionAccountId, "the connection account id");
            s.RequestParam(r => r.PendingId, "the pending id");
            s.RequestParam(r => r.Latitude, "the current latitude of the user");
            s.RequestParam(r => r.Longitude, "the current longitude of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(RemoveConnectionFromGroupRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Remove Connections
/// </summary>

public class RemoveConnectionsFromGroupEndpoint : FastEndpoints.Endpoint<RemoveConnectionsFromGroupRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/connection/group/removeConnections");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Connection");
        });

        Summary(s => {
            s.Summary = "Remove Connections";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ConnectionGroupId, "connection group id");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.ConnectionIds, "comma separated list of connection ids");
            s.RequestParam(r => r.ConnectionAccountIds, "comma separated list of connection account ids");
            s.RequestParam(r => r.Latitude, "the current latitude of the user");
            s.RequestParam(r => r.Longitude, "the current longitude of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(RemoveConnectionsFromGroupRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Connection Group
/// </summary>

public class RemoveGroupEndpoint : FastEndpoints.Endpoint<RemoveGroupRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/consumer/connection/group/remove");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Connection");
        });

        Summary(s => {
            s.Summary = "Delete Connection Group";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ReturnNulls, "whether to return nulls or not");
            s.RequestParam(r => r.GroupId, "the group id");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Latitude, "the current latitude of the user");
            s.RequestParam(r => r.Longitude, "the current longitude of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(RemoveGroupRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Remove Connection Groups
/// </summary>

public class RemoveSubGroupsEndpoint : FastEndpoints.Endpoint<RemoveSubGroupsRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/consumer/connection/group/removeSubGroup");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Connection");
        });

        Summary(s => {
            s.Summary = "Remove Connection Groups";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ReturnNulls, "whether to return nulls or not");
            s.RequestParam(r => r.GroupId, "the parent group id");
            s.RequestParam(r => r.SubGroupIds, "comma separated list of group IDs to remove from the parent group");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Latitude, "the current latitude of the user");
            s.RequestParam(r => r.Longitude, "the current longitude of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(RemoveSubGroupsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Possible Connections
/// </summary>

public class SearchConnectionsEndpoint : FastEndpoints.Endpoint<SearchConnectionsRequest, ConnectionListResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/connection/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Connection");
        });

        Summary(s => {
            s.Summary = "Search Possible Connections";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ReturnNulls, "return all json attributes if true. defualt is true.");
            s.RequestParam(r => r.Start, "start index of the pagination");
            s.RequestParam(r => r.Limit, "limit of the pagination");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id (deviceId or accountId required)");
            s.RequestParam(r => r.Q, "This parameter is deprecated.");
            s.RequestParam(r => r.Keyword, "keyword to search on, optional and this parameter is ignored if empt");
            s.RequestParam(r => r.Latitude, "the current latitude of the user");
            s.RequestParam(r => r.Longitude, "the current longitude of the user");
            s.RequestParam(r => r.GameType, "This parameter is deprecated.");
            s.RequestParam(r => r.AppKey, "the public application key, if provided only looks for users of that application");
            s.RequestParam(r => r.I, "This parameter is deprecated.");
            s.RequestParam(r => r.L, "This parameter is deprecated.");
            s.RequestParam(r => r.SortField, "the field to sort on");
            s.RequestParam(r => r.HasLocation, "whether the search has location or not");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchConnectionsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

