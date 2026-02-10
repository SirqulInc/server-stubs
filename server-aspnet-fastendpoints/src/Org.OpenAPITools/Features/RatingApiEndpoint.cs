using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Rating
/// </summary>

public class CreateRatingEndpoint : FastEndpoints.Endpoint<CreateRatingRequest, RatingResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/rating/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Rating");
        });

        Summary(s => {
            s.Summary = "Create Rating";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RatableType, "The ratable object type {RETAILER_LOCATION}");
            s.RequestParam(r => r.RatableId, "The id of the ratable object");
            s.RequestParam(r => r.RatingValue, "The integer value of 0-100");
            s.RequestParam(r => r.DeviceId, "The unique device identifier that made the request (either deviceId or accountId must be used)");
            s.RequestParam(r => r.AccountId, "The unique accountId that made the request (either deviceId or accountId must be used)");
            s.RequestParam(r => r.CategoryId, "");
            s.RequestParam(r => r.Display, "A subject title for the user rating (limited to 255 characters)");
            s.RequestParam(r => r.Description, "The description of the rating");
            s.RequestParam(r => r.LocationDescription, "The description of the location");
            s.RequestParam(r => r.Latitude, "The current location of the user");
            s.RequestParam(r => r.Longitude, "The current location of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateRatingRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Rating
/// </summary>

public class DeleteRatingEndpoint : FastEndpoints.Endpoint<DeleteRatingRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/rating/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Rating");
        });

        Summary(s => {
            s.Summary = "Delete Rating";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RatingId, "The ID of the rating to delete");
            s.RequestParam(r => r.DeviceId, "The unique device identifier that made the request (either deviceId or accountId must be used)");
            s.RequestParam(r => r.AccountId, "The unique accountId that made the request (either deviceId or accountId must be used)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteRatingRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Location Rating Indexes
/// </summary>

public class SearchLocationRatingIndexesEndpoint : FastEndpoints.Endpoint<SearchLocationRatingIndexesRequest, List<RatingIndexResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/location/rating/index/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Rating");
        });

        Summary(s => {
            s.Summary = "Search Location Rating Indexes";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.CategoryIds, "Comma separated list of category ids to filter the results by");
            s.RequestParam(r => r.Keyword, "The keyword used to search");
            s.RequestParam(r => r.LocationType, "The type of location to filter the results by");
            s.RequestParam(r => r.SortField, "The column to sort the search on {ID, CREATED, UPDATED, ACTIVE, RATABLE_TYPE, RATABLE_ID, RATABLE_DISPLAY, CATEGORY_ID, CATEGORY_NAME, CATEGORY_SHORT_NAME, CATEGORY_DISPLAY, COUNT, SUMMATION, AVERAGE, VALUE}");
            s.RequestParam(r => r.Descending, "The order to return the search results");
            s.RequestParam(r => r.Start, "The record to begin the return set on");
            s.RequestParam(r => r.Limit, "The number of records to return");
            s.RequestParam(r => r.SearchRange, "The search radius in kilometers to filter results");
            s.RequestParam(r => r.Latitude, "The current location of the user");
            s.RequestParam(r => r.Longitude, "The current location of the user");
            s.RequestParam(r => r.ReturnOverallRating, "Determines whether to return the overall rating record instead");
            s.RequestParam(r => r.DistanceUnit, "");
            s.RequestParam(r => r.ReturnRetailer, "whether to return the retailer or not");
            s.RequestParam(r => r.ReturnAssets, "whether to return the assets or not");
            s.RequestParam(r => r.ReturnOffers, "whether to return the offers or not");
            s.RequestParam(r => r.ReturnCategories, "whether to return the categories or not");
            s.RequestParam(r => r.ReturnFilters, "whether to return the filters or not");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchLocationRatingIndexesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Rating Indexes
/// </summary>

public class SearchRatingIndexesEndpoint : FastEndpoints.Endpoint<SearchRatingIndexesRequest, List<RatingIndexResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/rating/index/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Rating");
        });

        Summary(s => {
            s.Summary = "Search Rating Indexes";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RatableType, "Filter results by a ratable type {RETAILER_LOCATION}");
            s.RequestParam(r => r.RatableIds, "Comma separated list of ratable ids to filter the resuts by");
            s.RequestParam(r => r.CategoryIds, "Comma separated list of category ids to filter the results by");
            s.RequestParam(r => r.SecondaryType, "");
            s.RequestParam(r => r.Keyword, "The keyword used to search");
            s.RequestParam(r => r.SortField, "The column to sort the search on {ID, CREATED, UPDATED, ACTIVE, RATABLE_TYPE, RATABLE_ID, RATABLE_DISPLAY, CATEGORY_ID, CATEGORY_NAME, CATEGORY_SHORT_NAME, CATEGORY_DISPLAY, COUNT, SUMMATION, AVERAGE, VALUE}");
            s.RequestParam(r => r.Descending, "The order to return the search results");
            s.RequestParam(r => r.Start, "The record to begin the return set on");
            s.RequestParam(r => r.Limit, "The number of records to return");
            s.RequestParam(r => r.Latitude, "");
            s.RequestParam(r => r.Longitude, "");
            s.RequestParam(r => r.ReturnRatable, "Determines whether to return the ratable object in the response");
            s.RequestParam(r => r.ReturnOverallRating, "Determines whether to return the overall rating record instead");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchRatingIndexesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Ratings
/// </summary>

public class SearchRatingsEndpoint : FastEndpoints.Endpoint<SearchRatingsRequest, List<RatingResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/rating/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Rating");
        });

        Summary(s => {
            s.Summary = "Search Ratings";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.FilterAccountId, "Filter results for a particular account");
            s.RequestParam(r => r.RatableType, "The ratable object type {RETAILER_LOCATION}");
            s.RequestParam(r => r.RatableId, "The id of the ratable object");
            s.RequestParam(r => r.CategoryIds, "Comma separated list of category ids to filter the results by");
            s.RequestParam(r => r.Keyword, "The keyword used to search");
            s.RequestParam(r => r.SortField, "The column to sort the search on {ID, CREATED, UPDATED, ACTIVE, OWNER_DISPLAY, RATABLE_TYPE, RATABLE_ID, RATABLE_DISPLAY, CATEGORY_ID, CATEGORY_NAME, CATEGORY_SHORT_NAME, CATEGORY_DISPLAY, VALUE}");
            s.RequestParam(r => r.Descending, "The order to return the search results");
            s.RequestParam(r => r.Start, "The record to begin the return set on");
            s.RequestParam(r => r.Limit, "The number of records to return");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchRatingsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Rating
/// </summary>

public class UpdateRatingEndpoint : FastEndpoints.Endpoint<UpdateRatingRequest, RatingResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/rating/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Rating");
        });

        Summary(s => {
            s.Summary = "Update Rating";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RatingId, "The id of the rating (Note: this is not the ratable object id)");
            s.RequestParam(r => r.DeviceId, "The unique device identifier that made the request (either deviceId or accountId must be used)");
            s.RequestParam(r => r.AccountId, "The unique accountId that made the request (either deviceId or accountId must be used)");
            s.RequestParam(r => r.RatingValue, "The rating value to update");
            s.RequestParam(r => r.CategoryId, "");
            s.RequestParam(r => r.Display, "A subject title for the user rating (limited to 255 characters)");
            s.RequestParam(r => r.Description, "The description of the rating");
            s.RequestParam(r => r.LocationDescription, "The description of the location");
            s.RequestParam(r => r.Latitude, "The current location of the user");
            s.RequestParam(r => r.Longitude, "The current location of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateRatingRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

