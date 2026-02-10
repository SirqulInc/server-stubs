
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CategoryDistanceSearchRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The keyword string to search on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// the appKey of the application to retrieve categories for, if not specified then search on the global application.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// Restrict the search by specific categories
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// Restrict the search by specific parent categories so that only its sub children are searched.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parentCategoryIds")]
    public string? ParentCategoryIds { get; set; }
    /// <summary>
    /// Restrict the search to only those categories with no parent category assigned.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("rootOnly")]
    public bool? RootOnly { get; set; }
    /// <summary>
    /// The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, NAME, DISPLAY
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// The group of categories to return: ALL, GLOBAL or MINE. ALL returns both global and application specific matches, GLOBAL only returns global matches, and MINE only returns the application specific matches. If not provided search on the application provided.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("responseGroup")]
    public string? ResponseGroup { get; set; }
    /// <summary>
    /// The order to return the search results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// The record to begin the return set on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// The number of records to return
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// Determines whether to return only active categories
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool? ActiveOnly { get; set; }
    /// <summary>
    /// Determines whether to return extra info about the category&#39;s \&quot;Participant\&quot; reference
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnExternal")]
    public bool? ReturnExternal { get; set; }
    /// <summary>
    /// If true search categories using the exact keyword, if false then do a partial match (like) search.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("exactMatch")]
    public bool? ExactMatch { get; set; }
    /// <summary>
    /// Filters results by the Category&#39;s type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("type")]
    public string? Type { get; set; }
    /// <summary>
    /// Filters results by externalType
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalType")]
    public string? ExternalType { get; set; }
    /// <summary>
    /// Filters results to only return Categories that have been referenced by a minimum number of Offers
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("minOfferCount")]
    public int? MinOfferCount { get; set; }
    /// <summary>
    /// the latitude of where the search is centered on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// the longitude of where the search is centered on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// the maximum range the category can be from the center
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("range")]
    public double? Range { get; set; }
}
public class CreateCategoryRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The appKey of the application to assign the category to, if not provided then the category will be applied to the global application (if the account has permissions)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// The account id of the user (must have permissions to the target application)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The ID of the parent category, if not provided then the parent category will be null
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parentCategoryId")]
    public long? ParentCategoryId { get; set; }
    /// <summary>
    /// The name of the category
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string Name { get; set; }
    /// <summary>
    /// The description of the category
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// The type of the category
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("type")]
    public string? Type { get; set; }
    /// <summary>
    /// The ID of the image asset previously uploaded using the media service
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetId")]
    public long? AssetId { get; set; }
    /// <summary>
    /// A string identifier used by client applications to store external information
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalId")]
    public string? ExternalId { get; set; }
    /// <summary>
    /// A string type used by client applications to store external information
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalType")]
    public string? ExternalType { get; set; }
    /// <summary>
    /// external category slug
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalCategorySlug")]
    public string? ExternalCategorySlug { get; set; }
    /// <summary>
    /// sqoot slug
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sqootSlug")]
    public string? SqootSlug { get; set; }
    /// <summary>
    /// Sets whether the category is active or inactive (hidden from consumers)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// external custom client defined data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
    /// <summary>
    /// user defined strings for searching
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("searchTags")]
    public string? SearchTags { get; set; }
}
public class DeleteCategoryRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the ID of the account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the ID of the category
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryId")]
    public long CategoryId { get; set; }
}
public class DuplicateCategoryRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The application to assign the new category to, may be different then the application the source category is assigned to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// The account id of the user (must have permissions to the target application)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The category ID to duplicate (includes all children)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryId")]
    public long CategoryId { get; set; }
    /// <summary>
    /// The parent category ID to add the target category to.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parentCategoryId")]
    public long? ParentCategoryId { get; set; }
}
public class GetCategoryRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the ID of the category
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryId")]
    public long CategoryId { get; set; }
    /// <summary>
    /// Determines whether to return extra info about the category&#39;s \&quot;Participant\&quot; reference
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnExternal")]
    public bool? ReturnExternal { get; set; }
}
public class SearchCategoriesRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The string to search on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// the appKey of the application to retrieve categories for, if not specified then search on the global application.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// @Deprecated, use parentCategoryIds instead
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryId")]
    public string? CategoryId { get; set; }
    /// <summary>
    /// Restrict the search by specific categories
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// Restrict the search by specific parent categories so that only its sub children are searched.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parentCategoryIds")]
    public string? ParentCategoryIds { get; set; }
    /// <summary>
    /// Restrict the search to only those categories with no parent category assigned.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("rootOnly")]
    public bool? RootOnly { get; set; }
    /// <summary>
    /// The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, NAME, DISPLAY
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// The group of categories to return: ALL, GLOBAL or MINE. ALL returns both global and application specific matches, GLOBAL only returns global matches, and MINE only returns the application specific matches. If not provided search on the application provided.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("responseGroup")]
    public string? ResponseGroup { get; set; }
    /// <summary>
    /// The order to return the search results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// The record to begin the return set on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// The number of records to return
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// Determines whether to return only active categories
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool? ActiveOnly { get; set; }
    /// <summary>
    /// Determines whether to return extra info about the category&#39;s \&quot;Participant\&quot; reference
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnExternal")]
    public bool? ReturnExternal { get; set; }
    /// <summary>
    /// If true search categories using the exact keyword, if false then do a partial match (like) search. Default is false.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("exactMatch")]
    public bool? ExactMatch { get; set; }
    /// <summary>
    /// Filters results by the Category&#39;s type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("type")]
    public string? Type { get; set; }
    /// <summary>
    /// Filters results by externalType
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalType")]
    public string? ExternalType { get; set; }
    /// <summary>
    /// Determines whether the \&quot;externalType\&quot; param is excluded from the search results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("excludeExternalType")]
    public bool? ExcludeExternalType { get; set; }
    /// <summary>
    /// Filters results to only return Categories that have been referenced by a minimum number of Offers
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("minOfferCount")]
    public int? MinOfferCount { get; set; }
    /// <summary>
    /// When searching by a specific parent category (to return sub children), this determines the number of child layers to search in. The minimum is 1, the maximum is 4.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("searchDepth")]
    public int? SearchDepth { get; set; }
    /// <summary>
    /// The search index mode to use (e.g. OPENSEARCH or RDS)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("searchMode")]
    public string? SearchMode { get; set; }
}
public class UpdateCategoryRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The ID of the category to edit
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryId")]
    public long CategoryId { get; set; }
    /// <summary>
    /// The ID of the parent category, if not provided then the parent category will be null
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parentCategoryId")]
    public long? ParentCategoryId { get; set; }
    /// <summary>
    /// The name of the category
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string? Name { get; set; }
    /// <summary>
    /// The description of the category
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// The type of the category
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("type")]
    public string? Type { get; set; }
    /// <summary>
    /// The ID of the image asset previously uploaded using the media service
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetId")]
    public long? AssetId { get; set; }
    /// <summary>
    /// A string identifier used by client applications to store external information
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalId")]
    public string? ExternalId { get; set; }
    /// <summary>
    /// A string type used by client applications to store external information
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalType")]
    public string? ExternalType { get; set; }
    /// <summary>
    /// external category slug
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalCategorySlug")]
    public string? ExternalCategorySlug { get; set; }
    /// <summary>
    /// sqoot slug
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sqootSlug")]
    public string? SqootSlug { get; set; }
    /// <summary>
    /// Sets whether the category is active or inactive (hidden from consumers)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// external custom client defined data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
    /// <summary>
    /// user defined strings for searching
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("searchTags")]
    public string? SearchTags { get; set; }
}


