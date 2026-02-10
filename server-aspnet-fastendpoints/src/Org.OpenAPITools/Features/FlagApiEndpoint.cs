using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Flag
/// </summary>

public class CreateFlagEndpoint : FastEndpoints.Endpoint<CreateFlagRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/flag/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Flag");
        });

        Summary(s => {
            s.Summary = "Create Flag";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.FlagableType, "The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, NOTE, OFFER}");
            s.RequestParam(r => r.FlagableId, "The flagable object id");
            s.RequestParam(r => r.DeviceId, "The unique device identifier that made the request (either deviceId or accountId must be used)");
            s.RequestParam(r => r.AccountId, "The unique accountId that made the request (either deviceId or accountId must be used)");
            s.RequestParam(r => r.FlagDescription, "An optional description of why is it being flagged");
            s.RequestParam(r => r.Latitude, "The current location of the user");
            s.RequestParam(r => r.Longitude, "The current location of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateFlagRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Flag
/// </summary>

public class DeleteFlagEndpoint : FastEndpoints.Endpoint<DeleteFlagRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/flag/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Flag");
        });

        Summary(s => {
            s.Summary = "Delete Flag";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The unique device identifier that made the request (either deviceId or accountId must be used)");
            s.RequestParam(r => r.AccountId, "The unique accountId that made the request (either deviceId or accountId must be used)");
            s.RequestParam(r => r.ItemBeingFlaggedType, "This parameter is deprecated.");
            s.RequestParam(r => r.ItemBeingFlaggedId, "This parameter is deprecated.");
            s.RequestParam(r => r.FlagableType, "The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, OFFER, NOTE}");
            s.RequestParam(r => r.FlagableId, "The flagable object id");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteFlagRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Flag
/// </summary>

public class GetFlagEndpoint : FastEndpoints.Endpoint<GetFlagRequest, FlagResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/flag/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Flag");
        });

        Summary(s => {
            s.Summary = "Get Flag";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.FlagableType, "The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, NOTE, OFFER}");
            s.RequestParam(r => r.FlagableId, "The flagable object id");
            s.RequestParam(r => r.DeviceId, "The unique device identifier that made the request (either deviceId or accountId must be used)");
            s.RequestParam(r => r.AccountId, "The unique accountId that made the request (either deviceId or accountId must be used)");
            s.RequestParam(r => r.Latitude, "The current location of the user");
            s.RequestParam(r => r.Longitude, "The current location of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetFlagRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Flag Threshold
/// </summary>

public class GetFlagThresholdEndpoint : FastEndpoints.Endpoint<GetFlagThresholdRequest, CountResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/flag/threshold/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Flag");
        });

        Summary(s => {
            s.Summary = "Get Flag Threshold";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ItemBeingFlaggedType, "The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, OFFER, NOTE}");
            s.RequestParam(r => r.AppKey, "The application key");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetFlagThresholdRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Flag Threshold
/// </summary>

public class UpdateFlagThresholdEndpoint : FastEndpoints.Endpoint<UpdateFlagThresholdRequest, CountResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/flag/threshold/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Flag");
        });

        Summary(s => {
            s.Summary = "Update Flag Threshold";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.ItemBeingFlaggedType, "The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, OFFER, NOTE}");
            s.RequestParam(r => r.Threshold, "The threshold value");
            s.RequestParam(r => r.AppKey, "The application key");
            s.RequestParam(r => r.DeviceId, "The unique device identifier that made the request (either deviceId or accountId must be used)");
            s.RequestParam(r => r.AccountId, "The unique accountId that made the request (either deviceId or accountId must be used)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateFlagThresholdRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

