using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create following
/// </summary>

public class CreateFollowingEndpoint : FastEndpoints.Endpoint<CreateFollowingRequest>
{
    public override void Configure()
    {
        Post("/api/{version}/vatom/me/rels/following/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Create following";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.VatomParameters, "Vatom Parameters");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateFollowingRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Vatom Space
/// </summary>

public class CreateSpaceEndpoint : FastEndpoints.Endpoint<CreateSpaceRequest>
{
    public override void Configure()
    {
        Post("/api/{version}/vatom/b/spaces/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Create Vatom Space";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.VatomParameters, "Vatom Parameters");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateSpaceRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Vatom Event
/// </summary>

public class CreateVatomEventEndpoint : FastEndpoints.Endpoint<CreateVatomEventRequest>
{
    public override void Configure()
    {
        Post("/api/{version}/vatom/b/events/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Create Vatom Event";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.VatomParameters, "Vatom Parameters");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateVatomEventRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete following
/// </summary>

public class DeleteFollowingEndpoint : FastEndpoints.Endpoint<DeleteFollowingRequest>
{
    public override void Configure()
    {
        Post("/api/{version}/vatom/me/rels/following/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Delete following";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.VatomRelsKey, "Vatom Rels Key");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteFollowingRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Reset All Points Balance
/// </summary>

public class DeletePointsBalanceEndpoint : FastEndpoints.Endpoint<DeletePointsBalanceRequest>
{
    public override void Configure()
    {
        Post("/api/{version}/vatom/b/campaign/points/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Reset All Points Balance";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.VatomCampaignId, "Vatom Campaign Id");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeletePointsBalanceRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Vatom Space
/// </summary>

public class DeleteSpaceEndpoint : FastEndpoints.Endpoint<DeleteSpaceRequest>
{
    public override void Configure()
    {
        Post("/api/{version}/vatom/b/spaces/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Delete Vatom Space";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.VatomSpaceId, "Vatom Space Id");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteSpaceRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Vatom Event
/// </summary>

public class DeleteVatomEventEndpoint : FastEndpoints.Endpoint<DeleteVatomEventRequest>
{
    public override void Configure()
    {
        Post("/api/{version}/vatom/b/events/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Delete Vatom Event";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.VatomEventId, "Vatom Event Id");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteVatomEventRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Vatom NFT
/// </summary>

public class DeleteVatomNFTEndpoint : FastEndpoints.Endpoint<DeleteVatomNFTRequest>
{
    public override void Configure()
    {
        Post("/api/{version}/vatom/vatoms/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Delete Vatom NFT";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.VatomId, "Vatom NFT Id");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteVatomNFTRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Execute Action on NFT
/// </summary>

public class ExecuteActionOnNFTEndpoint : FastEndpoints.Endpoint<ExecuteActionOnNFTRequest>
{
    public override void Configure()
    {
        Post("/api/{version}/vatom/vatoms/execute-action");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Execute Action on NFT";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.VatomId, "Vatom NFT Id");
            s.RequestParam(r => r.VatomParameters, "Vatom Parameters");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ExecuteActionOnNFTRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Vatom Geo Map
/// </summary>

public class GeomapSearchEndpoint : FastEndpoints.Endpoint<GeomapSearchRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/vatoms/geo-map/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Search Vatom Geo Map";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.VatomParameters, "Vatom Parameters");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GeomapSearchRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Vatom Business Behaviors
/// </summary>

public class GetBusinessBehaviorsEndpoint : FastEndpoints.Endpoint<GetBusinessBehaviorsRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/b/behaviors");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Get Vatom Business Behaviors";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetBusinessBehaviorsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get the coins for a Business
/// </summary>

public class GetBusinessCoinsBalanceEndpoint : FastEndpoints.Endpoint<GetBusinessCoinsBalanceRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/b/coins/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Get the coins for a Business";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetBusinessCoinsBalanceRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get the user business ids
/// </summary>

public class GetBusinessIdsEndpoint : FastEndpoints.Endpoint<GetBusinessIdsRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/me/businesses");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Get the user business ids";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetBusinessIdsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Vatom Business Info
/// </summary>

public class GetBusinessInfoEndpoint : FastEndpoints.Endpoint<GetBusinessInfoRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/b/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Get Vatom Business Info";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.VatomParameters, "Vatom Parameters");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetBusinessInfoRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Vatom Business Users
/// </summary>

public class GetBusinessUsersEndpoint : FastEndpoints.Endpoint<GetBusinessUsersRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/b/users");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Get Vatom Business Users";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetBusinessUsersRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Campaign Group Entities
/// </summary>

public class GetCampaignGroupEntitiesEndpoint : FastEndpoints.Endpoint<GetCampaignGroupEntitiesRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/b/campaign-groups/entities");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Get Campaign Group Entities";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.VatomCampaignId, "Vatom Campaign Id");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetCampaignGroupEntitiesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Campaign Group Rules
/// </summary>

public class GetCampaignGroupRulesEndpoint : FastEndpoints.Endpoint<GetCampaignGroupRulesRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/b/campaign-groups/rules");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Get Campaign Group Rules";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.VatomCampaignId, "Vatom Campaign Id");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetCampaignGroupRulesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Campaign Group Stats
/// </summary>

public class GetCampaignGroupStatsEndpoint : FastEndpoints.Endpoint<GetCampaignGroupStatsRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/b/campaign-groups/stats");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Get Campaign Group Stats";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.VatomCampaignId, "Vatom Campaign Id");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetCampaignGroupStatsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Campaign Info
/// </summary>

public class GetCampaignInfoEndpoint : FastEndpoints.Endpoint<GetCampaignInfoRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/b/campaign-groups/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Get Campaign Info";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.VatomCampaignId, "Vatom Campaign Id");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetCampaignInfoRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Vatom Event Guest List
/// </summary>

public class GetEventGuestListEndpoint : FastEndpoints.Endpoint<GetEventGuestListRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/b/events/guests/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Get Vatom Event Guest List";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.VatomEventId, "Vatom Event Id");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetEventGuestListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Vatom User&#39;s Inventory
/// </summary>

public class GetInventoryEndpoint : FastEndpoints.Endpoint<GetInventoryRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/me/inventory");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Get Vatom User&#39;s Inventory";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.VatomParameters, "Vatom Parameters");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetInventoryRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get following
/// </summary>

public class GetMyFollowingEndpoint : FastEndpoints.Endpoint<GetMyFollowingRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/me/rels/following");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Get following";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetMyFollowingRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Points Balance
/// </summary>

public class GetPointsBalanceEndpoint : FastEndpoints.Endpoint<GetPointsBalanceRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/u/campaign/points/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Get Points Balance";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.VatomUserId, "Vatom User Id");
            s.RequestParam(r => r.VatomCampaignId, "Vatom Campaign Id");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetPointsBalanceRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Points Balance as Business
/// </summary>

public class GetPointsBalanceAsBusinessEndpoint : FastEndpoints.Endpoint<GetPointsBalanceAsBusinessRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/b/campaign/u/points/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Get Points Balance as Business";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.VatomUserId, "Vatom User Id");
            s.RequestParam(r => r.VatomCampaignId, "Vatom Campaign Id");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetPointsBalanceAsBusinessRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Vatom Space
/// </summary>

public class GetSpaceEndpoint : FastEndpoints.Endpoint<GetSpaceRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/b/spaces/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Get Vatom Space";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.VatomSpaceId, "Vatom Space Id");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetSpaceRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get the coins for a user (as a Business)
/// </summary>

public class GetUserCoinsAsBusinessEndpoint : FastEndpoints.Endpoint<GetUserCoinsAsBusinessRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/b/users/coins/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Get the coins for a user (as a Business)";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.VatomUserId, "Vatom User Id");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetUserCoinsAsBusinessRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Gets the coins balance for a Vatom User
/// </summary>

public class GetUserCoinsBalanceEndpoint : FastEndpoints.Endpoint<GetUserCoinsBalanceRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/u/coins/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Gets the coins balance for a Vatom User";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.VatomUserId, "Vatom User Id");
            s.RequestParam(r => r.VatomParameters, "Vatom Parameters");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetUserCoinsBalanceRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get user followers
/// </summary>

public class GetUserFollowersEndpoint : FastEndpoints.Endpoint<GetUserFollowersRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/users/rels/followers");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Get user followers";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.VatomUserId, "Vatom User Id");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetUserFollowersRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get user following
/// </summary>

public class GetUserFollowingEndpoint : FastEndpoints.Endpoint<GetUserFollowingRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/users/rels/following");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Get user following";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.VatomUserId, "Vatom User Id");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetUserFollowingRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get User Info
/// </summary>

public class GetUserInfoEndpoint : FastEndpoints.Endpoint<GetUserInfoRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/user/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Get User Info";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.VatomUserId, "Vatom User Id");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetUserInfoRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Vatom User Profile
/// </summary>

public class GetUserProfileEndpoint : FastEndpoints.Endpoint<GetUserProfileRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/me/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Get Vatom User Profile";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetUserProfileRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Vatom Event
/// </summary>

public class GetVatomEventEndpoint : FastEndpoints.Endpoint<GetVatomEventRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/b/events/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Get Vatom Event";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.VatomEventId, "Vatom Event Id");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetVatomEventRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Vatom NFT Details
/// </summary>

public class GetVatomNFTEndpoint : FastEndpoints.Endpoint<GetVatomNFTRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/vatoms/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Get Vatom NFT Details";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.VatomId, "Vatom NFT Id");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetVatomNFTRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List Vatom Communities
/// </summary>

public class ListCommunitiesEndpoint : FastEndpoints.Endpoint<ListCommunitiesRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/b/communities/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "List Vatom Communities";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.VatomParameters, "Vatom Parameters");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ListCommunitiesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List Vatom Events
/// </summary>

public class ListEventsEndpoint : FastEndpoints.Endpoint<ListEventsRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/b/events/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "List Vatom Events";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.VatomParameters, "Vatom Parameters");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ListEventsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List Vatom Spaces
/// </summary>

public class ListSpacesEndpoint : FastEndpoints.Endpoint<ListSpacesRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/b/spaces/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "List Vatom Spaces";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.VatomParameters, "Vatom Parameters");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ListSpacesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List Coin Transactions for a Vatom User
/// </summary>

public class ListUserCoinTransactionsEndpoint : FastEndpoints.Endpoint<ListUserCoinTransactionsRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/u/coins/txns/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "List Coin Transactions for a Vatom User";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.VatomUserId, "Vatom User Id");
            s.RequestParam(r => r.VatomParameters, "Vatom Parameters");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ListUserCoinTransactionsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List coin transactions for a user (as a Business)
/// </summary>

public class ListUserCoinTransactionsAsBusinessEndpoint : FastEndpoints.Endpoint<ListUserCoinTransactionsAsBusinessRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/b/users/coins/txns/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "List coin transactions for a user (as a Business)";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.VatomUserId, "Vatom User Id");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.VatomParameters, "Vatom Parameters");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ListUserCoinTransactionsAsBusinessRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Perform Action on NFT
/// </summary>

public class PerformActionOnNFTEndpoint : FastEndpoints.Endpoint<PerformActionOnNFTRequest>
{
    public override void Configure()
    {
        Post("/api/{version}/vatom/me/vatoms/actions");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Perform Action on NFT";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.VatomId, "Vatom NFT Id");
            s.RequestParam(r => r.VatomAction, "Vatom Action");
            s.RequestParam(r => r.VatomParameters, "Vatom Parameters");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(PerformActionOnNFTRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Redeem NFT
/// </summary>

public class RedeemNFTEndpoint : FastEndpoints.Endpoint<RedeemNFTRequest>
{
    public override void Configure()
    {
        Post("/api/{version}/vatom/b/redemptions");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Redeem NFT";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.VatomParameters, "Vatom Parameters");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(RedeemNFTRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Redeem the coins for a user (as a Business)
/// </summary>

public class RedeemUserCoinsAsBusinessEndpoint : FastEndpoints.Endpoint<RedeemUserCoinsAsBusinessRequest>
{
    public override void Configure()
    {
        Post("/api/{version}/vatom/b/users/coins/redeem");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Redeem the coins for a user (as a Business)";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.VatomUserId, "Vatom User Id");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.VatomParameters, "Vatom Parameters");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(RedeemUserCoinsAsBusinessRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search for Vatom Businesses
/// </summary>

public class SearchBusinessesEndpoint : FastEndpoints.Endpoint<SearchBusinessesRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/b/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Search for Vatom Businesses";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.VatomParameters, "Vatom Parameters");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchBusinessesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Campaign Groups
/// </summary>

public class SearchCampaignGroupsEndpoint : FastEndpoints.Endpoint<SearchCampaignGroupsRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/b/campaign-groups/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Search Campaign Groups";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchCampaignGroupsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search User Identities
/// </summary>

public class SearchIdentitiesEndpoint : FastEndpoints.Endpoint<SearchIdentitiesRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/me/identities/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Search User Identities";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchIdentitiesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Vatom User&#39;s Inventory
/// </summary>

public class SearchInventoryEndpoint : FastEndpoints.Endpoint<SearchInventoryRequest>
{
    public override void Configure()
    {
        Get("/api/{version}/vatom/user-inventory/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Search Vatom User&#39;s Inventory";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.VatomParameters, "Vatom Parameters");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchInventoryRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Send NFT
/// </summary>

public class SendNFTEndpoint : FastEndpoints.Endpoint<SendNFTRequest>
{
    public override void Configure()
    {
        Post("/api/{version}/vatom/b/campaigns/send");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Send NFT";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.VatomCampaignId, "Vatom Campaign Id");
            s.RequestParam(r => r.VatomParameters, "Vatom Parameters");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SendNFTRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Set Points Balance as Business
/// </summary>

public class SetPointsBalanceAsBusinessEndpoint : FastEndpoints.Endpoint<SetPointsBalanceAsBusinessRequest>
{
    public override void Configure()
    {
        Post("/api/{version}/vatom/b/campaign/u/points/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Set Points Balance as Business";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.VatomUserId, "Vatom User Id");
            s.RequestParam(r => r.VatomCampaignId, "Vatom Campaign Id");
            s.RequestParam(r => r.VatomParameters, "Vatom Parameters");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SetPointsBalanceAsBusinessRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Transfer coins from Vatom Users
/// </summary>

public class TransferUserCoinsEndpoint : FastEndpoints.Endpoint<TransferUserCoinsRequest>
{
    public override void Configure()
    {
        Post("/api/{version}/vatom/u/coins/transfer");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Transfer coins from Vatom Users";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.VatomUserId, "Vatom User Id");
            s.RequestParam(r => r.VatomParameters, "Vatom Parameters");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(TransferUserCoinsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Fund coins for a Business
/// </summary>

public class UpdateBusinessCoinsEndpoint : FastEndpoints.Endpoint<UpdateBusinessCoinsRequest>
{
    public override void Configure()
    {
        Post("/api/{version}/vatom/b/coins/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Fund coins for a Business";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.VatomParameters, "Vatom Parameters");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateBusinessCoinsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Vatom Event Guest List
/// </summary>

public class UpdateEventGuestListEndpoint : FastEndpoints.Endpoint<UpdateEventGuestListRequest>
{
    public override void Configure()
    {
        Post("/api/{version}/vatom/b/events/guests/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Update Vatom Event Guest List";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.VatomEventId, "Vatom Event Id");
            s.RequestParam(r => r.VatomParameters, "Vatom Parameters");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateEventGuestListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Vatom Space
/// </summary>

public class UpdateSpaceEndpoint : FastEndpoints.Endpoint<UpdateSpaceRequest>
{
    public override void Configure()
    {
        Post("/api/{version}/vatom/b/spaces/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Update Vatom Space";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.VatomSpaceId, "Vatom Space Id");
            s.RequestParam(r => r.VatomParameters, "Vatom Parameters");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateSpaceRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update the coins for a user (as a Business)
/// </summary>

public class UpdateUserCoinsAsBusinessEndpoint : FastEndpoints.Endpoint<UpdateUserCoinsAsBusinessRequest>
{
    public override void Configure()
    {
        Post("/api/{version}/vatom/b/users/coins/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Update the coins for a user (as a Business)";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.VatomUserId, "Vatom User Id");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.VatomParameters, "Vatom Parameters");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateUserCoinsAsBusinessRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Vatom User Profile
/// </summary>

public class UpdateUserProfileEndpoint : FastEndpoints.Endpoint<UpdateUserProfileRequest>
{
    public override void Configure()
    {
        Post("/api/{version}/vatom/me/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Update Vatom User Profile";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.VatomParameters, "Vatom Parameters");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateUserProfileRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Vatom Event
/// </summary>

public class UpdateVatomEventEndpoint : FastEndpoints.Endpoint<UpdateVatomEventRequest>
{
    public override void Configure()
    {
        Post("/api/{version}/vatom/b/events/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vatom");
        });

        Summary(s => {
            s.Summary = "Update Vatom Event";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.VatomEventId, "Vatom Event Id");
            s.RequestParam(r => r.VatomParameters, "Vatom Parameters");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateVatomEventRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

