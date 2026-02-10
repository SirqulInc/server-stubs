using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Like
/// </summary>

public class RegisterLikeEndpoint : FastEndpoints.Endpoint<RegisterLikeRequest, LikableResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/like");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Like");
        });

        Summary(s => {
            s.Summary = "Create Like";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.LikableType, "The type of likable object {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, NOTE, THEME_DESCRIPTOR}");
            s.RequestParam(r => r.LikableId, "The id of the likable object");
            s.RequestParam(r => r.DeviceId, "The unique device identifier that made the request (either deviceId or accountId must be used)");
            s.RequestParam(r => r.AccountId, "The unique accountId that made the request (either deviceId or accountId must be used)");
            s.RequestParam(r => r.PermissionableType, "This is used for sending out group notifications. For example, when someone likes an asset which is also a part of an album, everyone in the album will receive a notification. This is achieved by passing in the permissionable type (in this case \&quot;album\&quot;), and the permissionable id (the album id). Possible types: {ALBUM, ALBUM_CONTEST, GAME_LEVEL, THEME_DESCRIPTOR}");
            s.RequestParam(r => r.PermissionableId, "The id of the permissionable object (for sending group notifications)");
            s.RequestParam(r => r.Like, "determines whether the user likes or dislikes the object");
            s.RequestParam(r => r.App, "This parameter is deprecated. This is deprecated, use \&quot;appKey\&quot; instead.");
            s.RequestParam(r => r.GameType, "This parameter is deprecated. This is deprecated, use \&quot;appKey\&quot; instead.");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.Latitude, "The current location of the user");
            s.RequestParam(r => r.Longitude, "The current location of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(RegisterLikeRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Like
/// </summary>

public class RemoveLikeEndpoint : FastEndpoints.Endpoint<RemoveLikeRequest, LikableResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/like/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Like");
        });

        Summary(s => {
            s.Summary = "Delete Like";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.LikableType, "The type of the likable object {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, NOTE, THEME_DESCRIPTOR}");
            s.RequestParam(r => r.LikableId, "The id of the likable object");
            s.RequestParam(r => r.DeviceId, "The unique device identifier that made the request (either deviceId or accountId must be used)");
            s.RequestParam(r => r.AccountId, "The unique accountId that made the request (either deviceId or accountId must be used)");
            s.RequestParam(r => r.Latitude, "The current location of the user");
            s.RequestParam(r => r.Longitude, "The current location of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(RemoveLikeRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Likes
/// </summary>

public class SearchLikesEndpoint : FastEndpoints.Endpoint<SearchLikesRequest, SearchResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/like/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Like");
        });

        Summary(s => {
            s.Summary = "Search Likes";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.LikableType, "The type of the likable object {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, NOTE, THEME_DESCRIPTOR}");
            s.RequestParam(r => r.LikableId, "The id of the likable object");
            s.RequestParam(r => r.DeviceId, "The unique device identifier that made the request (either deviceId or accountId must be used)");
            s.RequestParam(r => r.AccountId, "The unique accountId that made the request (either deviceId or accountId must be used)");
            s.RequestParam(r => r.ConnectionAccountIds, "Comma separated list of account IDs for filtering on users");
            s.RequestParam(r => r.SortField, "The field to sort by. Possible values include: ID");
            s.RequestParam(r => r.Descending, "Determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.UpdatedSince, "return items that have been updated since this date (time-stamp in milliseconds)");
            s.RequestParam(r => r.UpdatedBefore, "return items that have been updated before this date (time-stamp in milliseconds)");
            s.RequestParam(r => r.Start, "the start index for pagination");
            s.RequestParam(r => r.Limit, "the limit for pagination");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchLikesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

