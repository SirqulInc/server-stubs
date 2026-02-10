using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create or Update Contest
/// </summary>

public class AddOrUpdateAlbumContestEndpoint : FastEndpoints.Endpoint<AddOrUpdateAlbumContestRequest, AlbumContestResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/consumer/album/contest");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Contest");
        });

        Summary(s => {
            s.Summary = "Create or Update Contest";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.PublicRead, "determines whether the contest&#39;s participants has read permissions");
            s.RequestParam(r => r.PublicWrite, "determines whether the contest&#39;s participants has write permissions");
            s.RequestParam(r => r.PublicDelete, "determines whether the contest&#39;s participants has delete permissions");
            s.RequestParam(r => r.PublicAdd, "determines whether the contest&#39;s participants has add permissions");
            s.RequestParam(r => r.Visibility, "the determines the album&#39;s participants (PUBLIC - includes everyone in the system as a potential participant, PRIVATE - only considers people who have been invited as participants)");
            s.RequestParam(r => r.IncludeFriendGroup, "determines whether to include all friends as participants");
            s.RequestParam(r => r.DeviceId, "a unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account ID of the user (deviceId or accountId required)");
            s.RequestParam(r => r.GameType, "This parameter is deprecated. the application key");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.ContestType, "a custom field used for aggregation and searching");
            s.RequestParam(r => r.AlbumContestId, "the album contest ID for updating (don&#39;t pass in if creating)");
            s.RequestParam(r => r.Title, "the title of the contest");
            s.RequestParam(r => r.Description, "the description of the contest");
            s.RequestParam(r => r.AlbumId1, "the album ID for the first album");
            s.RequestParam(r => r.RemoveAlbum1, "removes album1 from the contest");
            s.RequestParam(r => r.AlbumId2, "the album ID for the second album");
            s.RequestParam(r => r.RemoveAlbum2, "removes album2 from the contest");
            s.RequestParam(r => r.StartDate, "the start date of the contest (time-stamp in milliseconds)");
            s.RequestParam(r => r.EndDate, "the end date of the contest (time-stamp in milliseconds)");
            s.RequestParam(r => r.LocationDescription, "the location description of the contest taking place");
            s.RequestParam(r => r.ConnectionIdsToAdd, "comma separated list of connection IDs");
            s.RequestParam(r => r.ConnectionGroupIdsToAdd, "comma separated list of connection group IDs");
            s.RequestParam(r => r.Latitude, "latitude used to update the user&#39;s current location");
            s.RequestParam(r => r.Longitude, "longitude used to update the user&#39;s current location");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AddOrUpdateAlbumContestRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Approve Contest
/// </summary>

public class ApproveAlbumContestEndpoint : FastEndpoints.Endpoint<ApproveAlbumContestRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/consumer/album/contest/approve");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Contest");
        });

        Summary(s => {
            s.Summary = "Approve Contest";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AlbumContestId, "The ID of the album contest");
            s.RequestParam(r => r.ApprovalStatus, "The approval status to set {PENDING, REJECTED, APPROVED, FEATURED}");
            s.RequestParam(r => r.DeviceId, "A unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account ID of the user (deviceId or accountId required)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ApproveAlbumContestRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Contest
/// </summary>

public class DeleteContestEndpoint : FastEndpoints.Endpoint<DeleteContestRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/consumer/album/contest/remove");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Contest");
        });

        Summary(s => {
            s.Summary = "Delete Contest";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AlbumContestId, "the album contest ID");
            s.RequestParam(r => r.DeviceId, "a unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account ID of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Latitude, "latitude used to update the user&#39;s current location");
            s.RequestParam(r => r.Longitude, "longitude used to update the user&#39;s current location");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteContestRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Contest
/// </summary>

public class GetAlbumContestEndpoint : FastEndpoints.Endpoint<GetAlbumContestRequest, AlbumContestResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/consumer/album/contest/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Contest");
        });

        Summary(s => {
            s.Summary = "Get Contest";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AlbumContestId, "the album contest ID");
            s.RequestParam(r => r.DeviceId, "a unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account ID of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Latitude, "latitude used to update the user&#39;s current location");
            s.RequestParam(r => r.Longitude, "longitude used to update the user&#39;s current location");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetAlbumContestRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Contests
/// </summary>

public class GetAlbumContestsEndpoint : FastEndpoints.Endpoint<GetAlbumContestsRequest, AlbumContestListResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/consumer/album/contest/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Contest");
        });

        Summary(s => {
            s.Summary = "Search Contests";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Filter, "a comma separated list of Ownership");
            s.RequestParam(r => r.SortField, "the field to sort by. See AlbumContestApiMap");
            s.RequestParam(r => r.Descending, "determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.Start, "the start index for pagination");
            s.RequestParam(r => r.Limit, "the limit for pagination (there is a hard limit of 30)");
            s.RequestParam(r => r.DeviceId, "a unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account ID of the user (deviceId or accountId required)");
            s.RequestParam(r => r.GameType, "This parameter is deprecated.");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.AppType, "the application type");
            s.RequestParam(r => r.ContestType, "filter contests with this contest type");
            s.RequestParam(r => r.OwnerId, "search on contests that have been created by this account (that the user has permissions to)");
            s.RequestParam(r => r.Q, "This parameter is deprecated.");
            s.RequestParam(r => r.Keyword, "keyword search string");
            s.RequestParam(r => r.I, "This parameter is deprecated.");
            s.RequestParam(r => r.L, "This parameter is deprecated.");
            s.RequestParam(r => r.DateCreated, "filter on items that have been created before this date");
            s.RequestParam(r => r.Latitude, "latitude used to update the user&#39;s current location");
            s.RequestParam(r => r.Longitude, "longitude used to update the user&#39;s current location");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetAlbumContestsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Vote on Contest
/// </summary>

public class VoteOnAlbumContestEndpoint : FastEndpoints.Endpoint<VoteOnAlbumContestRequest, AlbumContestResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/consumer/album/contest/vote");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Contest");
        });

        Summary(s => {
            s.Summary = "Vote on Contest";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AlbumContestId, "the album contest ID");
            s.RequestParam(r => r.AlbumId, "the ID of the album to vote on");
            s.RequestParam(r => r.DeviceId, "a unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account ID of the user (deviceId or accountId required)");
            s.RequestParam(r => r.ContestType, "a custom field used for aggregation and searching");
            s.RequestParam(r => r.Latitude, "latitude used to update the user&#39;s current location");
            s.RequestParam(r => r.Longitude, "longitude used to update the user&#39;s current location");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(VoteOnAlbumContestRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

