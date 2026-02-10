using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Add User
/// </summary>

public class AddUsersToPermissionableEndpoint : FastEndpoints.Endpoint<AddUsersToPermissionableRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/consumer/permissions/add");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("User Permissions");
        });

        Summary(s => {
            s.Summary = "Add User";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.PermissionableType, "the permissionable type of the object");
            s.RequestParam(r => r.PermissionableId, "the id of the permissionable object");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Read, "the read permission of the users/groups");
            s.RequestParam(r => r.Write, "the write permission of the users/groups");
            s.RequestParam(r => r.Delete, "the delete permission of the users/groups");
            s.RequestParam(r => r.Add, "the add permission of the users/groups");
            s.RequestParam(r => r.ConnectionIds, "a comma separated list of connection ids (NOT the account ids)");
            s.RequestParam(r => r.ConnectionAccountIds, "a comma separated list of account ids");
            s.RequestParam(r => r.ConnectionGroupIds, "a comma separated list of connection group ids (these are groups made by the user)");
            s.RequestParam(r => r.Pending, "sets whether the added users are marked as pending (and will require the album admins to accept) - admins can set this to false (to accept)");
            s.RequestParam(r => r.Admin, "sets whether the added users will become admins or not");
            s.RequestParam(r => r.IncludeFriendGroup, "flag to determine whether to include the built-in \&quot;friends\&quot; group");
            s.RequestParam(r => r.Latitude, "the current latitude of the user");
            s.RequestParam(r => r.Longitude, "the current longitude of the user");
            s.RequestParam(r => r.AudienceIds, "comma separated list of audience ids. This is a feature only available to the permissionable&#39;s application owner (and its employees). This will add all users from these audiences to the permissionable object. Notifications will not be sent to users if this feature is used.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AddUsersToPermissionableRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Approve Permissionable
/// </summary>

public class ApprovePermissionableEndpoint : FastEndpoints.Endpoint<ApprovePermissionableRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/permissionable/approve");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("User Permissions");
        });

        Summary(s => {
            s.Summary = "Approve Permissionable";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.PermissionableType, "The permissionable type of the object");
            s.RequestParam(r => r.PermissionableId, "The id of the permissionable object");
            s.RequestParam(r => r.DeviceId, "A unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account ID of the user (deviceId or accountId required)");
            s.RequestParam(r => r.ApprovalStatus, "The approval status to set {PENDING, REJECTED, APPROVED, FEATURED}");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ApprovePermissionableRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Leave
/// </summary>

public class LeaveFromPermissionableEndpoint : FastEndpoints.Endpoint<LeaveFromPermissionableRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/consumer/permissions/leave");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("User Permissions");
        });

        Summary(s => {
            s.Summary = "Leave";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.PermissionableType, "the permissionable type PermissionableType");
            s.RequestParam(r => r.PermissionableId, "the id of the permissionable object");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Latitude, "the current latitude of the user");
            s.RequestParam(r => r.Longitude, "the current longitude of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(LeaveFromPermissionableRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Remove User
/// </summary>

public class RemoveUsersFromPermissionableEndpoint : FastEndpoints.Endpoint<RemoveUsersFromPermissionableRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/consumer/permissions/remove");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("User Permissions");
        });

        Summary(s => {
            s.Summary = "Remove User";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.PermissionableType, "the permissionable type of the object");
            s.RequestParam(r => r.PermissionableId, "the id of the permissionable object");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.ConnectionIds, "a comma separated list of connection ids (NOT the account ids)");
            s.RequestParam(r => r.ConnectionAccountIds, "a comma separated list of account ids");
            s.RequestParam(r => r.ConnectionGroupIds, "a comma separated list of connection group ids (these are groups made by the user)");
            s.RequestParam(r => r.RemoveFriendGroup, "flag to determine whether to remove the built-in \&quot;friends\&quot; group");
            s.RequestParam(r => r.Latitude, "the current latitude of the user");
            s.RequestParam(r => r.Longitude, "the current longitude of the user");
            s.RequestParam(r => r.AudienceIds, "comma separated list of audience ids. This will remove all users from these audiences from the permissionable object. Notifications will not be sent to users if this feature is used.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(RemoveUsersFromPermissionableRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Permissionables
/// </summary>

public class SearchPermissionablesEndpoint : FastEndpoints.Endpoint<SearchPermissionablesRequest, List<UserPermissionsResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/permissions/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("User Permissions");
        });

        Summary(s => {
            s.Summary = "Search Permissionables";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "A unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account ID of the user (deviceId or accountId required)");
            s.RequestParam(r => r.ConnectionAccountId, "Filter results for a specific user account");
            s.RequestParam(r => r.ConnectionAccountIds, "Comma separated list of account IDs to filter results with");
            s.RequestParam(r => r.PermissionableType, "Filter user permissions by the permissionable object type");
            s.RequestParam(r => r.PermissionableId, "The id of the permissionable object to filter by");
            s.RequestParam(r => r.Keyword, "Keyword to search within permissionable records");
            s.RequestParam(r => r.SortField, "Field to sort results on");
            s.RequestParam(r => r.Descending, "Sort descending when true");
            s.RequestParam(r => r.Pending, "Return user permissions that are pending");
            s.RequestParam(r => r.Admin, "Return user permissions that are admins");
            s.RequestParam(r => r.Start, "the start index for pagination");
            s.RequestParam(r => r.Limit, "the limit for pagination");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchPermissionablesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Permissionables by Distnace
/// </summary>

public class SearchPermissionablesFollowingDistanceEndpoint : FastEndpoints.Endpoint<SearchPermissionablesFollowingDistanceRequest, List<UserPermissionsResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/permissions/distancesearch");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("User Permissions");
        });

        Summary(s => {
            s.Summary = "Search Permissionables by Distnace";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Latitude, "The latitude of the current account");
            s.RequestParam(r => r.Longitude, "The longitude of the current account");
            s.RequestParam(r => r.DeviceId, "A unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account ID of the user (deviceId or accountId required)");
            s.RequestParam(r => r.ConnectionAccountId, "Filter results for a specific user account");
            s.RequestParam(r => r.ConnectionAccountIds, "Comma separated list of account IDs to filter results with");
            s.RequestParam(r => r.PermissionableType, "Filter user permissions by the permissionable object type");
            s.RequestParam(r => r.PermissionableId, "The id of the permissionable object to filter by");
            s.RequestParam(r => r.SearchRange, "The search range in miles");
            s.RequestParam(r => r.Keyword, "Keyword to search within permissionable records");
            s.RequestParam(r => r.Pending, "Return user permissions that are pending");
            s.RequestParam(r => r.Admin, "Return user permissions that are admins");
            s.RequestParam(r => r.Start, "The start index for pagination");
            s.RequestParam(r => r.Limit, "The limit for pagination");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchPermissionablesFollowingDistanceRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

