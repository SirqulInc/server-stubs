using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Search Categories by Distance
/// </summary>

public class CategoryDistanceSearchEndpoint : FastEndpoints.Endpoint<CategoryDistanceSearchRequest, List<CategoryResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/category/distancesearch");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Category");
        });

        Summary(s => {
            s.Summary = "Search Categories by Distance";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the user");
            s.RequestParam(r => r.Keyword, "The keyword string to search on");
            s.RequestParam(r => r.AppKey, "the appKey of the application to retrieve categories for, if not specified then search on the global application.");
            s.RequestParam(r => r.CategoryIds, "Restrict the search by specific categories");
            s.RequestParam(r => r.ParentCategoryIds, "Restrict the search by specific parent categories so that only its sub children are searched.");
            s.RequestParam(r => r.RootOnly, "Restrict the search to only those categories with no parent category assigned.");
            s.RequestParam(r => r.SortField, "The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, NAME, DISPLAY");
            s.RequestParam(r => r.ResponseGroup, "The group of categories to return: ALL, GLOBAL or MINE. ALL returns both global and application specific matches, GLOBAL only returns global matches, and MINE only returns the application specific matches. If not provided search on the application provided.");
            s.RequestParam(r => r.Descending, "The order to return the search results");
            s.RequestParam(r => r.Start, "The record to begin the return set on");
            s.RequestParam(r => r.Limit, "The number of records to return");
            s.RequestParam(r => r.ActiveOnly, "Determines whether to return only active categories");
            s.RequestParam(r => r.ReturnExternal, "Determines whether to return extra info about the category&#39;s \&quot;Participant\&quot; reference");
            s.RequestParam(r => r.ExactMatch, "If true search categories using the exact keyword, if false then do a partial match (like) search.");
            s.RequestParam(r => r.Type, "Filters results by the Category&#39;s type");
            s.RequestParam(r => r.ExternalType, "Filters results by externalType");
            s.RequestParam(r => r.MinOfferCount, "Filters results to only return Categories that have been referenced by a minimum number of Offers");
            s.RequestParam(r => r.Latitude, "the latitude of where the search is centered on");
            s.RequestParam(r => r.Longitude, "the longitude of where the search is centered on");
            s.RequestParam(r => r.Range, "the maximum range the category can be from the center");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CategoryDistanceSearchRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Category
/// </summary>

public class CreateCategoryEndpoint : FastEndpoints.Endpoint<CreateCategoryRequest, CategoryTreeResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/category/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Category");
        });

        Summary(s => {
            s.Summary = "Create Category";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the user (must have permissions to the target application)");
            s.RequestParam(r => r.Name, "The name of the category");
            s.RequestParam(r => r.AppKey, "The appKey of the application to assign the category to, if not provided then the category will be applied to the global application (if the account has permissions)");
            s.RequestParam(r => r.ParentCategoryId, "The ID of the parent category, if not provided then the parent category will be null");
            s.RequestParam(r => r.Description, "The description of the category");
            s.RequestParam(r => r.Type, "The type of the category");
            s.RequestParam(r => r.AssetId, "The ID of the image asset previously uploaded using the media service");
            s.RequestParam(r => r.ExternalId, "A string identifier used by client applications to store external information");
            s.RequestParam(r => r.ExternalType, "A string type used by client applications to store external information");
            s.RequestParam(r => r.ExternalCategorySlug, "external category slug");
            s.RequestParam(r => r.SqootSlug, "sqoot slug");
            s.RequestParam(r => r.Active, "Sets whether the category is active or inactive (hidden from consumers)");
            s.RequestParam(r => r.MetaData, "external custom client defined data");
            s.RequestParam(r => r.SearchTags, "user defined strings for searching");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateCategoryRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Category
/// </summary>

public class DeleteCategoryEndpoint : FastEndpoints.Endpoint<DeleteCategoryRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/category/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Category");
        });

        Summary(s => {
            s.Summary = "Delete Category";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the ID of the account");
            s.RequestParam(r => r.CategoryId, "the ID of the category");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteCategoryRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Duplicate Category
/// </summary>

public class DuplicateCategoryEndpoint : FastEndpoints.Endpoint<DuplicateCategoryRequest, CategoryTreeResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/category/duplicate");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Category");
        });

        Summary(s => {
            s.Summary = "Duplicate Category";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the user (must have permissions to the target application)");
            s.RequestParam(r => r.CategoryId, "The category ID to duplicate (includes all children)");
            s.RequestParam(r => r.AppKey, "The application to assign the new category to, may be different then the application the source category is assigned to");
            s.RequestParam(r => r.ParentCategoryId, "The parent category ID to add the target category to.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DuplicateCategoryRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Category
/// </summary>

public class GetCategoryEndpoint : FastEndpoints.Endpoint<GetCategoryRequest, CategoryTreeResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/category/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Category");
        });

        Summary(s => {
            s.Summary = "Get Category";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.CategoryId, "the ID of the category");
            s.RequestParam(r => r.ReturnExternal, "Determines whether to return extra info about the category&#39;s \&quot;Participant\&quot; reference");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetCategoryRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Categories
/// </summary>

public class SearchCategoriesEndpoint : FastEndpoints.Endpoint<SearchCategoriesRequest, List<CategoryResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/category/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Category");
        });

        Summary(s => {
            s.Summary = "Search Categories";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the user");
            s.RequestParam(r => r.Keyword, "The string to search on");
            s.RequestParam(r => r.AppKey, "the appKey of the application to retrieve categories for, if not specified then search on the global application.");
            s.RequestParam(r => r.CategoryId, "@Deprecated, use parentCategoryIds instead");
            s.RequestParam(r => r.CategoryIds, "Restrict the search by specific categories");
            s.RequestParam(r => r.ParentCategoryIds, "Restrict the search by specific parent categories so that only its sub children are searched.");
            s.RequestParam(r => r.RootOnly, "Restrict the search to only those categories with no parent category assigned.");
            s.RequestParam(r => r.SortField, "The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, NAME, DISPLAY");
            s.RequestParam(r => r.ResponseGroup, "The group of categories to return: ALL, GLOBAL or MINE. ALL returns both global and application specific matches, GLOBAL only returns global matches, and MINE only returns the application specific matches. If not provided search on the application provided.");
            s.RequestParam(r => r.Descending, "The order to return the search results");
            s.RequestParam(r => r.Start, "The record to begin the return set on");
            s.RequestParam(r => r.Limit, "The number of records to return");
            s.RequestParam(r => r.ActiveOnly, "Determines whether to return only active categories");
            s.RequestParam(r => r.ReturnExternal, "Determines whether to return extra info about the category&#39;s \&quot;Participant\&quot; reference");
            s.RequestParam(r => r.ExactMatch, "If true search categories using the exact keyword, if false then do a partial match (like) search. Default is false.");
            s.RequestParam(r => r.Type, "Filters results by the Category&#39;s type");
            s.RequestParam(r => r.ExternalType, "Filters results by externalType");
            s.RequestParam(r => r.ExcludeExternalType, "Determines whether the \&quot;externalType\&quot; param is excluded from the search results");
            s.RequestParam(r => r.MinOfferCount, "Filters results to only return Categories that have been referenced by a minimum number of Offers");
            s.RequestParam(r => r.SearchDepth, "When searching by a specific parent category (to return sub children), this determines the number of child layers to search in. The minimum is 1, the maximum is 4.");
            s.RequestParam(r => r.SearchMode, "The search index mode to use (e.g. OPENSEARCH or RDS)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchCategoriesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Category
/// </summary>

public class UpdateCategoryEndpoint : FastEndpoints.Endpoint<UpdateCategoryRequest, CategoryTreeResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/category/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Category");
        });

        Summary(s => {
            s.Summary = "Update Category";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the user");
            s.RequestParam(r => r.CategoryId, "The ID of the category to edit");
            s.RequestParam(r => r.ParentCategoryId, "The ID of the parent category, if not provided then the parent category will be null");
            s.RequestParam(r => r.Name, "The name of the category");
            s.RequestParam(r => r.Description, "The description of the category");
            s.RequestParam(r => r.Type, "The type of the category");
            s.RequestParam(r => r.AssetId, "The ID of the image asset previously uploaded using the media service");
            s.RequestParam(r => r.ExternalId, "A string identifier used by client applications to store external information");
            s.RequestParam(r => r.ExternalType, "A string type used by client applications to store external information");
            s.RequestParam(r => r.ExternalCategorySlug, "external category slug");
            s.RequestParam(r => r.SqootSlug, "sqoot slug");
            s.RequestParam(r => r.Active, "Sets whether the category is active or inactive (hidden from consumers)");
            s.RequestParam(r => r.MetaData, "external custom client defined data");
            s.RequestParam(r => r.SearchTags, "user defined strings for searching");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateCategoryRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

