using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Retailer Location (Consumer)
/// </summary>

public class CreateRetailerLocationConsumerEndpoint : FastEndpoints.Endpoint<CreateRetailerLocationConsumerRequest, RetailerLocationResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/location/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Retailer Location");
        });

        Summary(s => {
            s.Summary = "Create Retailer Location (Consumer)";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.Name, "The name of the retailer location");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.StreetAddress, "The street address of the retailer location");
            s.RequestParam(r => r.StreetAddress2, "Additional address information (such as a suite number, floor number, building name, or PO Box)");
            s.RequestParam(r => r.City, "The city of the retailer location");
            s.RequestParam(r => r.State, "The state of the retailer location");
            s.RequestParam(r => r.PostalCode, "The postal code of the retailer location");
            s.RequestParam(r => r.Country, "the country of the retailer location");
            s.RequestParam(r => r.BusinessPhone, "The business phone");
            s.RequestParam(r => r.BusinessPhoneExt, "The business phone extension");
            s.RequestParam(r => r.Website, "The website of the retailer location");
            s.RequestParam(r => r.Email, "The email of the retailer location");
            s.RequestParam(r => r.DetailsHeader, "A brief description about the retailer location (255 character limit)");
            s.RequestParam(r => r.DetailsBody, "A detailed description about the retailer location");
            s.RequestParam(r => r.Hours, "The hours of operation");
            s.RequestParam(r => r.Tags, "Custom string field for doing full-text searches");
            s.RequestParam(r => r.LogoAssetId, "The retailer location logo asset id");
            s.RequestParam(r => r.Picture1AssetId, "An asset id");
            s.RequestParam(r => r.Picture2AssetId, "An asset id");
            s.RequestParam(r => r.CategoryIds, "Comma separated list of category IDs used to filter retailer locations by categories");
            s.RequestParam(r => r.FilterIds, "Comma separated list of filter IDs used to filter retailer locations");
            s.RequestParam(r => r.MetaData, "External custom client defined data");
            s.RequestParam(r => r.PublicLocation, "Whether the location is public");
            s.RequestParam(r => r.Active, "whether the retailer location created should be active or not");
            s.RequestParam(r => r.LocationType, "External custom type identifier");
            s.RequestParam(r => r.Latitude, "The latitude to center the search on");
            s.RequestParam(r => r.Longitude, "The longitude to center the search on");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateRetailerLocationConsumerRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Retailer Location
/// </summary>

public class CreateRetailerLocationsEndpoint : FastEndpoints.Endpoint<CreateRetailerLocationsRequest, RetailerLocationResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/retailer/location/create");
        
        
        AllowAnonymous();
        AllowFileUploads();AllowFileUploads();AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Retailer Location");
        });

        Summary(s => {
            s.Summary = "Create Retailer Location";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RetailerId, "The ID of the retailer");
            s.RequestParam(r => r.Name, "The name of the retailer location");
            s.RequestParam(r => r.StreetAddress, "The street address of the retailer location");
            s.RequestParam(r => r.City, "The city of the retailer location");
            s.RequestParam(r => r.State, "The state of the retailer location");
            s.RequestParam(r => r.PostalCode, "The postal code of the retailer location");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.StreetAddress2, "Additional address information (such as a suite number, floor number, building name, or PO Box)");
            s.RequestParam(r => r.Country, "the country of the retailer location");
            s.RequestParam(r => r.BusinessPhone, "The business phone number of the retailer location");
            s.RequestParam(r => r.BusinessPhoneExt, "The business phone extension");
            s.RequestParam(r => r.Website, "The website of the retailer location");
            s.RequestParam(r => r.Email, "The email of the retailer location");
            s.RequestParam(r => r.InternalId, "An internal identifier used by the retailer");
            s.RequestParam(r => r.DetailsHeader, "A brief description about the retailer location (255 character limit)");
            s.RequestParam(r => r.DetailsBody, "A detailed description about the retailer location");
            s.RequestParam(r => r.Hours, "The hours of operation");
            s.RequestParam(r => r.Logo, "The retailer location logo sent as a multipart binary file (you can optionally use logoAssetId if the asset has already been uploaded before)");
            s.RequestParam(r => r.LogoAssetId, "The retailer location logo asset id");
            s.RequestParam(r => r.Picture1, "Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture1AssetId if the asset has already been uploaded before)");
            s.RequestParam(r => r.Picture1AssetId, "An asset id");
            s.RequestParam(r => r.Picture2, "Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture2AssetId if the asset has already been uploaded before)");
            s.RequestParam(r => r.Picture2AssetId, "An asset id");
            s.RequestParam(r => r.CategoryIds, "Comma separated list of category IDs used to filter retailer locations by categories");
            s.RequestParam(r => r.FilterIds, "Comma separated list of filter IDs used to filter retailer locations");
            s.RequestParam(r => r.Latitude, "the latitude of the retailer location");
            s.RequestParam(r => r.Longitude, "the longitude of the retailer location");
            s.RequestParam(r => r.Building, "");
            s.RequestParam(r => r.GooglePlaceId, "the ID of the Google Place that this retailer location is assigned to");
            s.RequestParam(r => r.YelpId, "the Yelp ID that this retailer location is assigned to");
            s.RequestParam(r => r.Active, "whether the retailer location should be active or inactive");
            s.RequestParam(r => r.PublicLocation, "Sets whether the location is public or not");
            s.RequestParam(r => r.LocationType, "External custom type identifier");
            s.RequestParam(r => r.AudienceIds, "Comma separated list of audience IDs used to assign audiences to the retailer location");
            s.RequestParam(r => r.AudienceIdsToAdd, "Comma separated list of audience IDs to add to the retailer location");
            s.RequestParam(r => r.AudienceIdsToRemove, "Comma separated list of audience IDs to remove from the retailer location");
            s.RequestParam(r => r.ResponseFormat, "The format of the returned response {JSON // default , HTML // for Dojo support when uploading assets}");
            s.RequestParam(r => r.ResponseIncludes, "Comma separated list of response includes (e.g. RETAILER,ASSETS,OFFERS,CATEGORIES,FILTERS,AUDIENCES,QRCODE)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateRetailerLocationsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Retailer Location
/// </summary>

public class DeleteRetailerLocationEndpoint : FastEndpoints.Endpoint<DeleteRetailerLocationRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/retailer/location/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Retailer Location");
        });

        Summary(s => {
            s.Summary = "Delete Retailer Location";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "the device id");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.RequestParam(r => r.RetailerLocationId, "the id of the retailer location to delete");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteRetailerLocationRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Retailer Location
/// </summary>

public class GetRetailerLocationEndpoint : FastEndpoints.Endpoint<GetRetailerLocationRequest, RetailerLocationResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/retailer/location/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Retailer Location");
        });

        Summary(s => {
            s.Summary = "Get Retailer Location";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RetailerLocationId, "The ID of the retailer location");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.RetailerLocationToken, "the unique token of the retailer location");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetRetailerLocationRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Retailer Location (Consumer)
/// </summary>

public class GetRetailerLocationConsumerEndpoint : FastEndpoints.Endpoint<GetRetailerLocationConsumerRequest, RetailerLocationResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/location/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Retailer Location");
        });

        Summary(s => {
            s.Summary = "Get Retailer Location (Consumer)";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RetailerLocationId, "The retailer location id");
            s.RequestParam(r => r.DeviceId, "The device id for returning account information (i.e. favorites)");
            s.RequestParam(r => r.AccountId, "The account id for returning account information (i.e. favorites)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetRetailerLocationConsumerRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Distance Search Retailer Locations (Indexed)
/// </summary>

public class IndexedRetailerLocationDistanceSearchEndpoint : FastEndpoints.Endpoint<IndexedRetailerLocationDistanceSearchRequest, List<RetailerLocationResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/retailer/location/idistancesearch");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Retailer Location");
        });

        Summary(s => {
            s.Summary = "Distance Search Retailer Locations (Indexed)";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Latitude, "The latitude to center the search on");
            s.RequestParam(r => r.Longitude, "The longitude to center the search on");
            s.RequestParam(r => r.SearchRange, "The search range in the distanceUnit specified; default is MILES.");
            s.RequestParam(r => r.Start, "The start index for pagination");
            s.RequestParam(r => r.Limit, "The limit for pagination");
            s.RequestParam(r => r.AccountId, "The account id of the user");
            s.RequestParam(r => r.Address, "Used to return results using this address as the center");
            s.RequestParam(r => r.HasOffers, "boolean to indicate whether to include retailer locations that have no offers");
            s.RequestParam(r => r.Categories, "Comma separate list of category ids");
            s.RequestParam(r => r.Filters, "Comma separated list of filter ids");
            s.RequestParam(r => r.Audiences, "Comma separated list of audience ids");
            s.RequestParam(r => r.RetailerIds, "Comma separated list of retailer ids");
            s.RequestParam(r => r.RetailerLocationIds, "Comma separated list of retailer location ids");
            s.RequestParam(r => r.Tags, "Does a full-text search on tags");
            s.RequestParam(r => r.LocationType, "Location type filter");
            s.RequestParam(r => r.SortField, "The field to sort the result set on. Possible values include: DISTANCE, RETAILER_NAME, RETAILER_LOCATION_NAME");
            s.RequestParam(r => r.Descending, "Determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.Q, "This parameter is deprecated.");
            s.RequestParam(r => r.Keyword, "Search by keyword");
            s.RequestParam(r => r.KeywordOperator, "Determines the operator used when there are multiple words in the &#39;keyword&#39; parameter");
            s.RequestParam(r => r.SearchExpression, "Search expression to further refine results");
            s.RequestParam(r => r.DistanceUnit, "Unit of distance");
            s.RequestParam(r => r.ReturnFavorited, "(deprecated) return favorited flag");
            s.RequestParam(r => r.ReturnRetailer, "Return retailer info");
            s.RequestParam(r => r.ReturnAssets, "Return assets");
            s.RequestParam(r => r.ReturnOffers, "Return offers");
            s.RequestParam(r => r.ReturnCategories, "Return categories");
            s.RequestParam(r => r.ReturnFilters, "Return filters");
            s.RequestParam(r => r.ReturnAudiences, "Return audiences");
            s.RequestParam(r => r.ReturnQrCode, "Return QR code info");
            s.RequestParam(r => r.ReturnExternalCategoryData, "Return external category data");
            s.RequestParam(r => r.IncludeFavorite, "Include favorites in response");
            s.RequestParam(r => r.IncludeLiked, "Include liked flag in response");
            s.RequestParam(r => r.IncludeRating, "Include rating info in response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(IndexedRetailerLocationDistanceSearchRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Keyword Search Retailer Locations (Indexed)
/// </summary>

public class IndexedRetailerLocationSearchEndpoint : FastEndpoints.Endpoint<IndexedRetailerLocationSearchRequest, List<RetailerLocationResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/retailer/location/isearch");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Retailer Location");
        });

        Summary(s => {
            s.Summary = "Keyword Search Retailer Locations (Indexed)";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the user");
            s.RequestParam(r => r.Start, "The start index for pagination");
            s.RequestParam(r => r.Limit, "The limit for pagination");
            s.RequestParam(r => r.HasOffers, "boolean to indicate whether to include retailer locations that have no offers");
            s.RequestParam(r => r.Categories, "Comma separate list of category ids");
            s.RequestParam(r => r.Filters, "Comma separated list of filter ids");
            s.RequestParam(r => r.Audiences, "Comma separated list of audience ids");
            s.RequestParam(r => r.RetailerIds, "Comma separated list of retailer ids");
            s.RequestParam(r => r.RetailerLocationIds, "Comma separated list of retailer location ids");
            s.RequestParam(r => r.Tags, "Does a full-text search on tags");
            s.RequestParam(r => r.LocationType, "Location type filter");
            s.RequestParam(r => r.SortField, "The field to sort the result set on. Possible values include: RETAILER_NAME, RETAILER_LOCATION_NAME");
            s.RequestParam(r => r.Descending, "Determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.Q, "This parameter is deprecated.");
            s.RequestParam(r => r.Keyword, "Search by keyword");
            s.RequestParam(r => r.KeywordOperator, "Determines the operator used when there are multiple words in the &#39;keyword&#39; parameter");
            s.RequestParam(r => r.SearchExpression, "Search expression to further refine results");
            s.RequestParam(r => r.ReturnRetailer, "Return retailer info");
            s.RequestParam(r => r.ReturnAssets, "Return assets");
            s.RequestParam(r => r.ReturnOffers, "Return offers");
            s.RequestParam(r => r.ReturnCategories, "Return categories");
            s.RequestParam(r => r.ReturnFilters, "Return filters");
            s.RequestParam(r => r.ReturnAudiences, "Return audiences");
            s.RequestParam(r => r.ReturnQrCode, "Return QR code info");
            s.RequestParam(r => r.ReturnExternalCategoryData, "Return external category data");
            s.RequestParam(r => r.IncludeFavorite, "Include favorites in response");
            s.RequestParam(r => r.IncludeLiked, "Include liked flag in response");
            s.RequestParam(r => r.IncludeRating, "Include rating info in response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(IndexedRetailerLocationSearchRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Retailer Locations (Owned)
/// </summary>

public class SearchRetailerLocationsEndpoint : FastEndpoints.Endpoint<SearchRetailerLocationsRequest, List<RetailerLocationResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/retailer/location/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Retailer Location");
        });

        Summary(s => {
            s.Summary = "Search Retailer Locations (Owned)";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Q, "This parameter is deprecated.");
            s.RequestParam(r => r.Keyword, "The keyword used to search");
            s.RequestParam(r => r.RetailerIds, "Comma separated list of retailer IDs which when passed in will filter the results to only return these retailers.");
            s.RequestParam(r => r.RetailerLocationIds, "Comma separated list of retailer location IDs");
            s.RequestParam(r => r.LocationType, "Location type filter");
            s.RequestParam(r => r.SortField, "The column to sort the search on");
            s.RequestParam(r => r.Descending, "The order to return the search results");
            s.RequestParam(r => r.I, "This parameter is deprecated.");
            s.RequestParam(r => r.Start, "The record to begin the return set on");
            s.RequestParam(r => r.L, "This parameter is deprecated.");
            s.RequestParam(r => r.Limit, "The number of records to return");
            s.RequestParam(r => r.ShowPublicLocations, "Whether to include public locations in the results");
            s.RequestParam(r => r.ActiveOnly, "Return only active results");
            s.RequestParam(r => r.ReturnRetailer, "Return retailer info");
            s.RequestParam(r => r.ReturnAssets, "Return assets");
            s.RequestParam(r => r.ReturnOffers, "Return offers");
            s.RequestParam(r => r.ReturnCategories, "Return categories");
            s.RequestParam(r => r.ReturnFilters, "Return filters");
            s.RequestParam(r => r.ReturnAudiences, "Return audiences");
            s.RequestParam(r => r.ReturnQrCode, "Return QR code info");
            s.RequestParam(r => r.IncludeFavorite, "Include favorites in response");
            s.RequestParam(r => r.IncludeLiked, "Include liked flag in response");
            s.RequestParam(r => r.IncludeRating, "Include rating info in response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchRetailerLocationsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Retailer Location
/// </summary>

public class UpdateRetailerLocationsEndpoint : FastEndpoints.Endpoint<UpdateRetailerLocationsRequest, RetailerLocationResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/retailer/location/update");
        
        
        AllowAnonymous();
        AllowFileUploads();AllowFileUploads();AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Retailer Location");
        });

        Summary(s => {
            s.Summary = "Update Retailer Location";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RetailerLocationId, "The ID of the retailer location");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Name, "The name of the retailer location");
            s.RequestParam(r => r.StreetAddress, "The street address of the retailer location");
            s.RequestParam(r => r.StreetAddress2, "Additional address information (such as a suite number, floor number, building name, or PO Box)");
            s.RequestParam(r => r.City, "The city of the retailer location");
            s.RequestParam(r => r.State, "The state of the retailer location");
            s.RequestParam(r => r.PostalCode, "The postal code of the retailer location");
            s.RequestParam(r => r.Country, "the country of the retailer location");
            s.RequestParam(r => r.BusinessPhone, "The business phone number of the retailer location");
            s.RequestParam(r => r.BusinessPhoneExt, "The business phone extension of the retailer location");
            s.RequestParam(r => r.Website, "The website of the retailer location");
            s.RequestParam(r => r.Email, "The email of the retailer location");
            s.RequestParam(r => r.InternalId, "An internal identifier used by the retailer");
            s.RequestParam(r => r.DetailsHeader, "A brief description about the retailer location (255 character limit)");
            s.RequestParam(r => r.DetailsBody, "A detailed description about the retailer location");
            s.RequestParam(r => r.Hours, "The hours of operation");
            s.RequestParam(r => r.Logo, "The retailer location logo sent as a multipart binary file (you can optionally use logoAssetId if the asset has already been uploaded before)");
            s.RequestParam(r => r.LogoAssetId, "The retailer location logo asset id");
            s.RequestParam(r => r.Picture1, "Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture1AssetId if the asset has already been uploaded before)");
            s.RequestParam(r => r.Picture1AssetId, "An asset id");
            s.RequestParam(r => r.Picture2, "Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture2AssetId if the asset has already been uploaded before)");
            s.RequestParam(r => r.Picture2AssetId, "An asset id");
            s.RequestParam(r => r.CategoryIds, "Comma separated list of category IDs used to filter retailer locations by categories");
            s.RequestParam(r => r.FilterIds, "Comma separated list of filter IDs used to filter retailer locations");
            s.RequestParam(r => r.Latitude, "the latituede of the retailer location");
            s.RequestParam(r => r.Longitude, "the longitude of the retailer location");
            s.RequestParam(r => r.Building, "");
            s.RequestParam(r => r.GooglePlaceId, "the Google Place ID that the retailer location is associated with");
            s.RequestParam(r => r.YelpId, "the Yelp ID that the retailer location is associated with");
            s.RequestParam(r => r.MetaData, "External custom client defined data");
            s.RequestParam(r => r.PaymentProvider, "Specifies which payment provider Sirqul will use when making payments");
            s.RequestParam(r => r.Active, "Sets whether the retailer is active or inactive (hidden from consumers)");
            s.RequestParam(r => r.PublicLocation, "Sets whether the location is public or not");
            s.RequestParam(r => r.LocationType, "External custom type identifier");
            s.RequestParam(r => r.AudienceIds, "Comma separated list of audience IDs used to assign audiences to the retailer location");
            s.RequestParam(r => r.AudienceIdsToAdd, "Comma separated list of audience IDs to add to the retailer location");
            s.RequestParam(r => r.AudienceIdsToRemove, "Comma separated list of audience IDs to remove from the retailer location");
            s.RequestParam(r => r.ResponseFormat, "The format of the returned response {JSON // default , HTML // for Dojo support when uploading assets}");
            s.RequestParam(r => r.Tags, "Custom string field for doing full-text searches");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateRetailerLocationsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

