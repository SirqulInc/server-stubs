using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Filter
/// </summary>

public class CreateFilterEndpoint : FastEndpoints.Endpoint<CreateFilterRequest, FilterTreeResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/filter/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Filter");
        });

        Summary(s => {
            s.Summary = "Create Filter";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the user (must have permissions to the target application)");
            s.RequestParam(r => r.Name, "The name of the filter");
            s.RequestParam(r => r.AppKey, "The appKey of the application to assign the filter to, if not provided then the filter will be applied to the global application (if the account has permissions)");
            s.RequestParam(r => r.ParentFilterId, "The ID of the parent filter, if not provided then the parent filter will be null");
            s.RequestParam(r => r.Description, "The description of the filter");
            s.RequestParam(r => r.ExternalId, "A string identifier used by client applications to store external information");
            s.RequestParam(r => r.ExternalType, "A string type used by client applications to store external information");
            s.RequestParam(r => r.Active, "Sets whether the filter is active or inactive (hidden from consumers)");
            s.RequestParam(r => r.MetaData, "external custom client defined data");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateFilterRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Filter
/// </summary>

public class DeleteFilterEndpoint : FastEndpoints.Endpoint<DeleteFilterRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/filter/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Filter");
        });

        Summary(s => {
            s.Summary = "Delete Filter";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the user (must have permissions to the filter&#39;s assigned application)");
            s.RequestParam(r => r.FilterId, "The ID of the filter to delete");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteFilterRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Filter
/// </summary>

public class GetFilterEndpoint : FastEndpoints.Endpoint<GetFilterRequest, FilterTreeResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/filter/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Filter");
        });

        Summary(s => {
            s.Summary = "Get Filter";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.FilterId, "the id of the filter to get");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetFilterRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Filters
/// </summary>

public class SearchFiltersEndpoint : FastEndpoints.Endpoint<SearchFiltersRequest, List<FilterResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/filter/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Filter");
        });

        Summary(s => {
            s.Summary = "Search Filters";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the user");
            s.RequestParam(r => r.Keyword, "The string to search on");
            s.RequestParam(r => r.AppKey, "the appKey of the application to retrieve filters for");
            s.RequestParam(r => r.ResponseGroup, "The group of filters to return: ALL, GLOBAL or MINE. ALL returns both global and application specific matches, GLOBAL only returns global matches, and MINE only returns the application specific matches. If not provided search on the application provided.");
            s.RequestParam(r => r.RootOnly, "Restrict the search to only those filters with no parent filter assigned.");
            s.RequestParam(r => r.SortField, "The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, NAME, DISPLAY");
            s.RequestParam(r => r.Descending, "The order to return the search results");
            s.RequestParam(r => r.Start, "The record to begin the return set on");
            s.RequestParam(r => r.Limit, "The number of records to return");
            s.RequestParam(r => r.ActiveOnly, "Determines whether to return only active categories");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchFiltersRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Filter
/// </summary>

public class UpdateFilterEndpoint : FastEndpoints.Endpoint<UpdateFilterRequest, FilterTreeResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/filter/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Filter");
        });

        Summary(s => {
            s.Summary = "Update Filter";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the user");
            s.RequestParam(r => r.FilterId, "The ID of the filter to edit");
            s.RequestParam(r => r.ParentFilterId, "The ID of the parent filter, if not provided then the parent filter will be null");
            s.RequestParam(r => r.Name, "The name of the filter");
            s.RequestParam(r => r.Description, "The description of the filter");
            s.RequestParam(r => r.ExternalId, "A string identifier used by client applications to store external information");
            s.RequestParam(r => r.ExternalType, "A string type used by client applications to store external information");
            s.RequestParam(r => r.Active, "Sets whether the filter is active or inactive (hidden from consumers)");
            s.RequestParam(r => r.MetaData, "external custom client defined data");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateFilterRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

