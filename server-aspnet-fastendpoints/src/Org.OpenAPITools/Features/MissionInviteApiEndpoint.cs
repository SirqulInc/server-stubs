using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Mission Invite
/// </summary>

public class CreateMissionInviteEndpoint : FastEndpoints.Endpoint<CreateMissionInviteRequest, MissionResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/mission/invite/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Mission Invite");
        });

        Summary(s => {
            s.Summary = "Create Mission Invite";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required).");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required).");
            s.RequestParam(r => r.MissionId, "The mission to find the invite for.");
            s.RequestParam(r => r.JoinCode, "code to be entered for user to join the mission");
            s.RequestParam(r => r.IncludeGameData, "Include the game level data with the mission.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateMissionInviteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Mission Invite
/// </summary>

public class DeleteMissionInviteEndpoint : FastEndpoints.Endpoint<DeleteMissionInviteRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/mission/invite/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Mission Invite");
        });

        Summary(s => {
            s.Summary = "Delete Mission Invite";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required).");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required).");
            s.RequestParam(r => r.MissionId, "The mission to find the invite for (missionId or missionInviteId requried).");
            s.RequestParam(r => r.MissionInviteId, "The mission invite id. This checks on the user&#39;s billable for permission (missionId or missionInviteId requried).");
            s.RequestParam(r => r.IncludeGameData, "Include the game level data with the mission.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteMissionInviteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Mission Invite
/// </summary>

public class GetMissionInviteEndpoint : FastEndpoints.Endpoint<GetMissionInviteRequest, MissionResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/mission/invite/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Mission Invite");
        });

        Summary(s => {
            s.Summary = "Get Mission Invite";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required).");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required).");
            s.RequestParam(r => r.MissionId, "The mission to find the invite for (missionId or missionInviteId requried).");
            s.RequestParam(r => r.MissionInviteId, "The mission invite id. This checks on the user&#39;s billable for permission (missionId or missionInviteId requried).");
            s.RequestParam(r => r.IncludeGameData, "Include the game level data with the mission.");
            s.RequestParam(r => r.IncludeScores, "include the scores with the mission");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetMissionInviteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Mission Invites
/// </summary>

public class SearchMissionInvitesEndpoint : FastEndpoints.Endpoint<SearchMissionInvitesRequest, List<MissionResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/mission/invite/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Mission Invite");
        });

        Summary(s => {
            s.Summary = "Search Mission Invites";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required).");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required).");
            s.RequestParam(r => r.AppKey, "the app to retrieve the data for, use your application key.");
            s.RequestParam(r => r.AppVersion, "the application version, used to version the game level data");
            s.RequestParam(r => r.MissionId, "the mission id to filter on");
            s.RequestParam(r => r.Status, "The invite status to filter for, comma separated list {AVAILABLE, PENDING, UPDATED, ACCEPTED, ACTIVE, QUIT, COMPLETED, PENDING_REVIEW, REJECTED}");
            s.RequestParam(r => r.LastUpdated, "Only return invites that have been updated since this date/time (long)");
            s.RequestParam(r => r.Start, "The index into the record set to start with.");
            s.RequestParam(r => r.Limit, "The total number of record to return.");
            s.RequestParam(r => r.Keyword, "the keyword to search on");
            s.RequestParam(r => r.MissionTypes, "");
            s.RequestParam(r => r.FilterByBillable, "filter results by the account&#39;s billable");
            s.RequestParam(r => r.IncludeGameData, "Include the game level data with the mission.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchMissionInvitesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Mission Invite
/// </summary>

public class UpdateMissionInviteEndpoint : FastEndpoints.Endpoint<UpdateMissionInviteRequest, MissionResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/mission/invite/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Mission Invite");
        });

        Summary(s => {
            s.Summary = "Update Mission Invite";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required).");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required).");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.MissionId, "The mission to find the invite for (missionId or missionInviteId requried).");
            s.RequestParam(r => r.MissionInviteId, "The mission invite id. This checks on the user&#39;s billable for permission (missionId or missionInviteId requried).");
            s.RequestParam(r => r.PackId, "the pack id to find the invite for");
            s.RequestParam(r => r.GameLevelId, "the game level id to find the invite for");
            s.RequestParam(r => r.Status, "The invite status to filter for, comma separated list {AVAILABLE, PENDING, UPDATED, ACCEPTED, ACTIVE, QUIT, COMPLETED, PENDING_REVIEW, REJECTED}");
            s.RequestParam(r => r.PermissionableType, "This is the content type for missions that require user submission. Note that user submitted content must require a status of PENDING_REVIEW to be accpeted. {ACCOUNT, GAMELEVEL, COLLECTION, ALBUM_CONTEST, THEME_DESCRIPTOR, ALBUM}");
            s.RequestParam(r => r.PermissionableId, "The id of the content being submitted.");
            s.RequestParam(r => r.IncludeGameData, "Include the game level data with the mission.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateMissionInviteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

