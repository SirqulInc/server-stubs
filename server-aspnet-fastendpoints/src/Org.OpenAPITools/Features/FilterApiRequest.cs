
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateFilterRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the user (must have permissions to the target application)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The appKey of the application to assign the filter to, if not provided then the filter will be applied to the global application (if the account has permissions)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// The ID of the parent filter, if not provided then the parent filter will be null
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parentFilterId")]
    public long? ParentFilterId { get; set; }
    /// <summary>
    /// The name of the filter
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string Name { get; set; }
    /// <summary>
    /// The description of the filter
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
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
    /// Sets whether the filter is active or inactive (hidden from consumers)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// external custom client defined data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
}
public class DeleteFilterRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the user (must have permissions to the filter&#39;s assigned application)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The ID of the filter to delete
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filterId")]
    public long FilterId { get; set; }
}
public class GetFilterRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the filter to get
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filterId")]
    public long FilterId { get; set; }
}
public class SearchFiltersRequest
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
    /// the appKey of the application to retrieve filters for
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// The group of filters to return: ALL, GLOBAL or MINE. ALL returns both global and application specific matches, GLOBAL only returns global matches, and MINE only returns the application specific matches. If not provided search on the application provided.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("responseGroup")]
    public string? ResponseGroup { get; set; }
    /// <summary>
    /// Restrict the search to only those filters with no parent filter assigned.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("rootOnly")]
    public bool? RootOnly { get; set; }
    /// <summary>
    /// The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, NAME, DISPLAY
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
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
}
public class UpdateFilterRequest
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
    /// The ID of the filter to edit
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filterId")]
    public long FilterId { get; set; }
    /// <summary>
    /// The ID of the parent filter, if not provided then the parent filter will be null
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parentFilterId")]
    public long? ParentFilterId { get; set; }
    /// <summary>
    /// The name of the filter
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string? Name { get; set; }
    /// <summary>
    /// The description of the filter
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
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
    /// Sets whether the filter is active or inactive (hidden from consumers)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// external custom client defined data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
}


