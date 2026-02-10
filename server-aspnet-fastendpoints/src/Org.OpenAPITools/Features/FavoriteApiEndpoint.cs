using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Favorite
/// </summary>

public class AddFavoriteEndpoint : FastEndpoints.Endpoint<AddFavoriteRequest, WrappedResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/favorite/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Favorite");
        });

        Summary(s => {
            s.Summary = "Create Favorite";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.FavoritableId, "The ID of the object to favorite {offerId, offerLocationId, retailerLocationId, categoryId}");
            s.RequestParam(r => r.FavoritableType, "The type of the object to favorite {OFFER, OFFER_LOCATION, RETAILER_LOCATION, CATEGORY, ALBUM}");
            s.RequestParam(r => r.DeviceId, "The unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account ID of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Latitude, "The current latitude of the user");
            s.RequestParam(r => r.Longitude, "The current longitude of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AddFavoriteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Favorite
/// </summary>

public class DeleteFavoriteEndpoint : FastEndpoints.Endpoint<DeleteFavoriteRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/favorite/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Favorite");
        });

        Summary(s => {
            s.Summary = "Delete Favorite";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account ID of the user (deviceId or accountId required)");
            s.RequestParam(r => r.FavoriteId, "The ID of the favorite reference record (only optional if favoritableId &amp; favoritableType is pass in instead)");
            s.RequestParam(r => r.FavoritableId, "The ID of the object to un-favorite {offerId, offerLocationId, retailerLocationId, categoryId} (this is required if favoriteId is NOT passed in)");
            s.RequestParam(r => r.FavoritableType, "The type of the object to un-favorite {OFFER, OFFER_LOCATION, RETAILER_LOCATION, CATEGORY} (this is required if favoriteId is NOT passed in)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteFavoriteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Favorite
/// </summary>

public class GetFavoriteEndpoint : FastEndpoints.Endpoint<GetFavoriteRequest, WrappedResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/favorite/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Favorite");
        });

        Summary(s => {
            s.Summary = "Get Favorite";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.FavoriteId, "The ID of the favorite reference record");
            s.RequestParam(r => r.DeviceId, "The unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account ID of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Latitude, "The current latitude of the user");
            s.RequestParam(r => r.Longitude, "The current longitude of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetFavoriteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Favorites
/// </summary>

public class SearchFavoritesEndpoint : FastEndpoints.Endpoint<SearchFavoritesRequest, SearchResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/favorite/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Favorite");
        });

        Summary(s => {
            s.Summary = "Search Favorites";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.FavoritableType, "The type of the object to favorite {OFFER, OFFER_LOCATION, RETAILER_LOCATION, CATEGORY}");
            s.RequestParam(r => r.SortField, "Determines what to sort the results by {CREATED, UPDATED, DISPLAY}");
            s.RequestParam(r => r.Descending, "Determines whether the results are in descending order");
            s.RequestParam(r => r.Start, "The start index for pagination");
            s.RequestParam(r => r.Limit, "The limit for pagination (there is a hard limit of 1000)");
            s.RequestParam(r => r.ActiveOnly, "Determines whether to only return active favorites");
            s.RequestParam(r => r.ReturnFullResponse, "Determines whether to return a detailed version of the response list");
            s.RequestParam(r => r.DeviceId, "The unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account ID of the user (deviceId or accountId required)");
            s.RequestParam(r => r.ConnectionAccountId, "The ID of an account the user would like to view favorites for");
            s.RequestParam(r => r.SecondaryType, "");
            s.RequestParam(r => r.Keyword, "The keyword to search for");
            s.RequestParam(r => r.Latitude, "The current latitude of the user");
            s.RequestParam(r => r.Longitude, "The current longitude of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchFavoritesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Who has Favorited
/// </summary>

public class WhoHasFavoritedEndpoint : FastEndpoints.Endpoint<WhoHasFavoritedRequest, List<AccountResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/favorite/whois");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Favorite");
        });

        Summary(s => {
            s.Summary = "Who has Favorited";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.FavoritableId, "The ID of the favoritableType to search on");
            s.RequestParam(r => r.FavoritableType, "The type of the object to favorite {OFFER, OFFER_LOCATION, RETAILER_LOCATION, CATEGORY}");
            s.RequestParam(r => r.Start, "The start index for pagination");
            s.RequestParam(r => r.Limit, "The limit for pagination");
            s.RequestParam(r => r.DeviceId, "The unique ID given by the device (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account ID of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Latitude, "The current latitude of the user");
            s.RequestParam(r => r.Longitude, "The current longitude of the user");
            s.RequestParam(r => r.Keyword, "The keyword to limit that account list");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(WhoHasFavoritedRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

