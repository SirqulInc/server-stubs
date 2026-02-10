using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Get Facebook Token
/// </summary>

public class GetTokenEndpoint : FastEndpoints.Endpoint<GetTokenRequest, TokenResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/facebook/getfbtoken");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Facebook");
        });

        Summary(s => {
            s.Summary = "Get Facebook Token";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "a unique id given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Latitude, "used to update the user&#39;s current location");
            s.RequestParam(r => r.Longitude, "used to update the user&#39;s current location");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetTokenRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Post to Facebook
/// </summary>

public class GraphInterfaceEndpoint : FastEndpoints.Endpoint<GraphInterfaceRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/facebook/graph");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Facebook");
        });

        Summary(s => {
            s.Summary = "Post to Facebook";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.VarEvent, "the type of Sirqul event {DOWNLOADED_APP, CHALLENGE, LEVEL_COMPLETED, LEVEL_CREATED}");
            s.RequestParam(r => r.DeviceId, "a unique id given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.PermissionableType, "for posting about information related to an object. Possible types: {ALBUM, ALBUM_CONTEST, GAME_LEVEL, THEME_DESCRIPTOR}");
            s.RequestParam(r => r.PermissionableId, "the object id");
            s.RequestParam(r => r.AssetId, "used to include an asset on a Facebook post");
            s.RequestParam(r => r.GameType, "This parameter is deprecated.");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.Latitude, "used to update the user&#39;s current location");
            s.RequestParam(r => r.Longitude, "used to update the user&#39;s current location");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GraphInterfaceRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

