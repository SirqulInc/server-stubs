using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Accept Invite
/// </summary>

public class AcceptInviteEndpoint : FastEndpoints.Endpoint<AcceptInviteRequest, ConsumerInviteResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/invite/accept");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Invite");
        });

        Summary(s => {
            s.Summary = "Accept Invite";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Token, "the invite token");
            s.RequestParam(r => r.AccountId, "the accountId of the user who is accepting the invite");
            s.RequestParam(r => r.AlbumId, "the album id associated with this invite (if applicable)");
            s.RequestParam(r => r.MissionId, "the mission id associated with this invite (if applicable)");
            s.RequestParam(r => r.AlbumContestId, "the album contest id associated with this invite (if applicable)");
            s.RequestParam(r => r.OfferId, "the offer id associated with this invite (if applicable)");
            s.RequestParam(r => r.OfferLocationId, "the offer location id associated with this invite (if applicable)");
            s.RequestParam(r => r.RetailerLocationId, "the retailer location id associated with this invite (if applicable)");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.AutoFriend, "whether to auto-friend the invite sender and receiver");
            s.RequestParam(r => r.AutoAttendEvent, "whether to mark the event as attending automatically after invite is accepted");
            s.RequestParam(r => r.AutoFavoriteOffer, "whether to mark the offer as favorited automatically after invite is accepted");
            s.RequestParam(r => r.AutoFavoriteOfferLocation, "whether to mark the offer location as favorited automatically after invite is accepted");
            s.RequestParam(r => r.AutoFavoriteRetailerLocation, "whether to mark the retailer location as favorited automatically after invite is accepted");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AcceptInviteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Invite to Contest
/// </summary>

public class AlbumContestInviteEndpoint : FastEndpoints.Endpoint<AlbumContestInviteRequest, InviteResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/invite/albumContest");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Invite");
        });

        Summary(s => {
            s.Summary = "Invite to Contest";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "a unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account ID of the user (deviceId or accountId required)");
            s.RequestParam(r => r.AppId, "This parameter is deprecated.");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.AlbumContestId, "the album contest to share");
            s.RequestParam(r => r.Latitude, "the current latitude of the user");
            s.RequestParam(r => r.Longitude, "the current longitude of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AlbumContestInviteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Invite to Collection
/// </summary>

public class AlbumInviteEndpoint : FastEndpoints.Endpoint<AlbumInviteRequest, InviteResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/invite/album");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Invite");
        });

        Summary(s => {
            s.Summary = "Invite to Collection";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "a unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account ID of the user (deviceId or accountId required)");
            s.RequestParam(r => r.AppId, "This parameter is deprecated.");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.AlbumId, "the album to share");
            s.RequestParam(r => r.Latitude, "the current latitude of the user");
            s.RequestParam(r => r.Longitude, "the current longitude of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AlbumInviteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Invite to Event
/// </summary>

public class EventInviteEndpoint : FastEndpoints.Endpoint<EventInviteRequest, InviteResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/invite/event");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Invite");
        });

        Summary(s => {
            s.Summary = "Invite to Event";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the account ID of the user making the share");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.ListingId, "The ID of the event listing");
            s.RequestParam(r => r.ReceiverAccountIds, "the account ID of a Sirqul user they would like to share an event with");
            s.RequestParam(r => r.RetailerLocationId, "The retailer location id of where the event will take place");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(EventInviteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Invite to Game Level
/// </summary>

public class GameInviteEndpoint : FastEndpoints.Endpoint<GameInviteRequest, InviteResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/invite/gameLevel");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Invite");
        });

        Summary(s => {
            s.Summary = "Invite to Game Level";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "a unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account ID of the user (deviceId or accountId required)");
            s.RequestParam(r => r.AppId, "This parameter is deprecated.");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.GameLevelId, "the game level that the user owns and is giving access to");
            s.RequestParam(r => r.Latitude, "the current latitude of the user");
            s.RequestParam(r => r.Longitude, "the current longitude of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GameInviteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Invite
/// </summary>

public class GetInviteEndpoint : FastEndpoints.Endpoint<GetInviteRequest, SirqulResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/invite/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Invite");
        });

        Summary(s => {
            s.Summary = "Get Invite";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Account ID of the user if they are logged in");
            s.RequestParam(r => r.Token, "the invite token");
            s.RequestParam(r => r.AlbumId, "album id to match the invite against (if applicable)");
            s.RequestParam(r => r.MissionId, "mission id to match the invite against (if applicable)");
            s.RequestParam(r => r.AlbumContestId, "album contest id to match the invite against (if applicable)");
            s.RequestParam(r => r.OfferId, "offer id to match the invite against (if applicable)");
            s.RequestParam(r => r.OfferLocationId, "offer location id to match the invite against (if applicable)");
            s.RequestParam(r => r.RetailerLocationId, "retailer location id to match the invite against (if applicable)");
            s.RequestParam(r => r.AppKey, "the application key");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetInviteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Invite to Mission
/// </summary>

public class MissionInviteEndpoint : FastEndpoints.Endpoint<MissionInviteRequest, InviteResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/invite/mission");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Invite");
        });

        Summary(s => {
            s.Summary = "Invite to Mission";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "a unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account ID of the user (deviceId or accountId required)");
            s.RequestParam(r => r.AppId, "This parameter is deprecated.");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.MissionId, "the mission to share");
            s.RequestParam(r => r.Latitude, "the current latitude of the user");
            s.RequestParam(r => r.Longitude, "the current longitude of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(MissionInviteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Invite to Offer
/// </summary>

public class OfferInviteEndpoint : FastEndpoints.Endpoint<OfferInviteRequest, InviteResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/invite/offer");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Invite");
        });

        Summary(s => {
            s.Summary = "Invite to Offer";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the account ID of the user making the share");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.OfferId, "the ID of the offer used to invite to favorite");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(OfferInviteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Invite to Offer Location
/// </summary>

public class OfferLocationInviteEndpoint : FastEndpoints.Endpoint<OfferLocationInviteRequest, InviteResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/invite/offerLocation");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Invite");
        });

        Summary(s => {
            s.Summary = "Invite to Offer Location";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the account ID of the user making the share");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.OfferLocationId, "the id of the offer location to share");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(OfferLocationInviteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Invite to Retailer Location
/// </summary>

public class RetailerLocationInviteEndpoint : FastEndpoints.Endpoint<RetailerLocationInviteRequest, InviteResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/invite/retailerLocation");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Invite");
        });

        Summary(s => {
            s.Summary = "Invite to Retailer Location";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the account ID of the user making the share");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.RetailerLocationId, "The retailer location id of where the event will take place");
            s.RequestParam(r => r.AlbumId, "Optional album id to link with the invite");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(RetailerLocationInviteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

