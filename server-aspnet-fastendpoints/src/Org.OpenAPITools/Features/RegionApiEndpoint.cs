using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Region
/// </summary>

public class CreateRegionEndpoint : FastEndpoints.Endpoint<CreateRegionRequest, RegionResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/region/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Region");
        });

        Summary(s => {
            s.Summary = "Create Region";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The id of the account sending the request");
            s.RequestParam(r => r.RegionClass, "RegionClass of this region");
            s.RequestParam(r => r.ShortName, "Short name of the region. This is optimized for search");
            s.RequestParam(r => r.FullName, "Full name of the region");
            s.RequestParam(r => r.ParentIds, "Comma separated region ids that are parents of this region");
            s.RequestParam(r => r.ChildrenIds, "Comma separated region ids that are children of this region");
            s.RequestParam(r => r.PostalCodeIds, "Comma separated postal code ids the region will include");
            s.RequestParam(r => r.Locations, "Sets of name,lat,long used to create new postal codes assigned to the region");
            s.RequestParam(r => r.RetailerLocationId, "the id of the retailer location that the region is being created for");
            s.RequestParam(r => r.Visibility, "The Visibility of the region");
            s.RequestParam(r => r.CategoryIds, "the categories that the region is assigned to");
            s.RequestParam(r => r.FilterIds, "the filters that the region is assigned to");
            s.RequestParam(r => r.Start, "");
            s.RequestParam(r => r.End, "");
            s.RequestParam(r => r.Polygon, "the polygon generated for the region");
            s.RequestParam(r => r.MetaData, "the meta data associated with the region");
            s.RequestParam(r => r.Latitude, "the latitude of the region");
            s.RequestParam(r => r.Longitude, "the longitude of the region");
            s.RequestParam(r => r.VersionCode, "the version code");
            s.RequestParam(r => r.Root, "If this is a root region or not. If true means this region has no parent regions");
            s.RequestParam(r => r.Active, "Active or inactive status of the region");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateRegionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Region
/// </summary>

public class DeleteRegionEndpoint : FastEndpoints.Endpoint<DeleteRegionRequest, RegionResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/region/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Region");
        });

        Summary(s => {
            s.Summary = "Delete Region";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the account logged in");
            s.RequestParam(r => r.RegionId, "the id of the region");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteRegionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Region
/// </summary>

public class GetRegionEndpoint : FastEndpoints.Endpoint<GetRegionRequest, RegionResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/region/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Region");
        });

        Summary(s => {
            s.Summary = "Get Region";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RegionId, "the id of the region to get");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetRegionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Regions
/// </summary>

public class SearchRegionsEndpoint : FastEndpoints.Endpoint<SearchRegionsRequest, List<RegionResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/region/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Region");
        });

        Summary(s => {
            s.Summary = "Search Regions";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the owner account id of the region to be created");
            s.RequestParam(r => r.Query, "This parameter is deprecated. deprecated - use \&quot;keyword\&quot;");
            s.RequestParam(r => r.Keyword, "the keyword to filter results on");
            s.RequestParam(r => r.Latitude, "the latitude of the user");
            s.RequestParam(r => r.Longitude, "the longitude of the user");
            s.RequestParam(r => r.Range, "the search radius");
            s.RequestParam(r => r.RegionClass, "");
            s.RequestParam(r => r.Visibility, "");
            s.RequestParam(r => r.SearchMode, "the SearchIndexMode: RDS, LUCENE, or CLOUDINDEX. If not provided, will use the default defined in the Sirqul server");
            s.RequestParam(r => r.SortField, "the field to order results by: ID, UPDATED, NAME, or DISTANCE. If not provided, will use the default which is by ID for text and DISTANCE when lat/long is provided.");
            s.RequestParam(r => r.Descending, "determines if the results get ordered in descending order");
            s.RequestParam(r => r.IncludeParent, "include the parent region or not");
            s.RequestParam(r => r.IncludeChildren, "include the chidren regions or not");
            s.RequestParam(r => r.IncludePostalCodes, "include the postal codes associated with the region or not");
            s.RequestParam(r => r.CategoryIds, "search on the categories associated with the region");
            s.RequestParam(r => r.FilterIds, "search on the filters associated with the region");
            s.RequestParam(r => r.VersionCode, "filter by a specific version code");
            s.RequestParam(r => r.ActiveOnly, "filter to show only active results");
            s.RequestParam(r => r.ShowDeleted, "If showDeleted is true and activeOnly is false, will return regions that have been deleted");
            s.RequestParam(r => r.LastUpdatedSince, "only returns records that have last updated since this date \\(UTC timestamp in milliseconds\\)");
            s.RequestParam(r => r.Start, "the start index for pagination");
            s.RequestParam(r => r.Limit, "the limit for pagination");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchRegionsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Region
/// </summary>

public class UpdateRegionEndpoint : FastEndpoints.Endpoint<UpdateRegionRequest, RegionResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/region/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Region");
        });

        Summary(s => {
            s.Summary = "Update Region";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The id of the account sending the request");
            s.RequestParam(r => r.RegionId, "The id of the region to be updated");
            s.RequestParam(r => r.RegionClass, "RegionClass of this region");
            s.RequestParam(r => r.ShortName, "Short name of the region. This is optimized for search");
            s.RequestParam(r => r.FullName, "Full name of the region");
            s.RequestParam(r => r.ParentIds, "Comma separated region ids that are parents of this region");
            s.RequestParam(r => r.ChildrenIds, "Comma separated region ids that are children of this region");
            s.RequestParam(r => r.PostalCodeIds, "Comma separated postal code ids the region will include");
            s.RequestParam(r => r.Locations, "Sets of name,lat,long used to create new postal codes assigned to the region");
            s.RequestParam(r => r.RetailerLocationId, "the retailer location ID that the region is associated with");
            s.RequestParam(r => r.Visibility, "The Visibility of the region");
            s.RequestParam(r => r.CategoryIds, "the categories that the region is assigned to");
            s.RequestParam(r => r.FilterIds, "the filters that the region is assigned to");
            s.RequestParam(r => r.Start, "");
            s.RequestParam(r => r.End, "");
            s.RequestParam(r => r.Polygon, "the polygon of the region");
            s.RequestParam(r => r.MetaData, "the meta data of the region");
            s.RequestParam(r => r.Latitude, "the latitude of the region");
            s.RequestParam(r => r.Longitude, "the longitude of the region");
            s.RequestParam(r => r.VersionCode, "the version code");
            s.RequestParam(r => r.Root, "If this is a root region or not. If true means this region has no parent regions");
            s.RequestParam(r => r.Active, "Active or inactive status of the region");
            s.RequestParam(r => r.ClearLists, "If true clear the children and postal code lists before add new ones, otherwise just append.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateRegionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

