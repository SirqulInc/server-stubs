
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateRegionRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The id of the account sending the request
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// RegionClass of this region
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("regionClass")]
    public string RegionClass { get; set; }
    /// <summary>
    /// Short name of the region. This is optimized for search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("shortName")]
    public string ShortName { get; set; }
    /// <summary>
    /// Full name of the region
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("fullName")]
    public string? FullName { get; set; }
    /// <summary>
    /// Comma separated region ids that are parents of this region
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parentIds")]
    public string? ParentIds { get; set; }
    /// <summary>
    /// Comma separated region ids that are children of this region
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("childrenIds")]
    public string? ChildrenIds { get; set; }
    /// <summary>
    /// Comma separated postal code ids the region will include
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("postalCodeIds")]
    public string? PostalCodeIds { get; set; }
    /// <summary>
    /// Sets of name,lat,long used to create new postal codes assigned to the region
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locations")]
    public string? Locations { get; set; }
    /// <summary>
    /// the id of the retailer location that the region is being created for
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationId")]
    public long? RetailerLocationId { get; set; }
    /// <summary>
    /// The Visibility of the region
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("visibility")]
    public string? Visibility { get; set; }
    /// <summary>
    /// the categories that the region is assigned to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// the filters that the region is assigned to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filterIds")]
    public string? FilterIds { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public long? Start { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("end")]
    public long? End { get; set; }
    /// <summary>
    /// the polygon generated for the region
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("polygon")]
    public string? Polygon { get; set; }
    /// <summary>
    /// the meta data associated with the region
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
    /// <summary>
    /// the latitude of the region
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// the longitude of the region
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// the version code
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("versionCode")]
    public int? VersionCode { get; set; }
    /// <summary>
    /// If this is a root region or not. If true means this region has no parent regions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("root")]
    public bool? Root { get; set; }
    /// <summary>
    /// Active or inactive status of the region
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
}
public class DeleteRegionRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the account logged in
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the id of the region
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("regionId")]
    public long RegionId { get; set; }
}
public class GetRegionRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the id of the region to get
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("regionId")]
    public long RegionId { get; set; }
}
public class SearchRegionsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the owner account id of the region to be created
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// This parameter is deprecated. deprecated - use \&quot;keyword\&quot;
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("query")]
    public string? Query { get; set; }
    /// <summary>
    /// the keyword to filter results on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// the latitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// the longitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// the search radius
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("range")]
    public double? Range { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("regionClass")]
    public string? RegionClass { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("visibility")]
    public string? Visibility { get; set; }
    /// <summary>
    /// the SearchIndexMode: RDS, LUCENE, or CLOUDINDEX. If not provided, will use the default defined in the Sirqul server
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("searchMode")]
    public string? SearchMode { get; set; }
    /// <summary>
    /// the field to order results by: ID, UPDATED, NAME, or DISTANCE. If not provided, will use the default which is by ID for text and DISTANCE when lat/long is provided.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// determines if the results get ordered in descending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// include the parent region or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeParent")]
    public bool? IncludeParent { get; set; }
    /// <summary>
    /// include the chidren regions or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeChildren")]
    public bool? IncludeChildren { get; set; }
    /// <summary>
    /// include the postal codes associated with the region or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includePostalCodes")]
    public bool? IncludePostalCodes { get; set; }
    /// <summary>
    /// search on the categories associated with the region
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// search on the filters associated with the region
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filterIds")]
    public string? FilterIds { get; set; }
    /// <summary>
    /// filter by a specific version code
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("versionCode")]
    public int? VersionCode { get; set; }
    /// <summary>
    /// filter to show only active results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool? ActiveOnly { get; set; }
    /// <summary>
    /// If showDeleted is true and activeOnly is false, will return regions that have been deleted
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("showDeleted")]
    public bool? ShowDeleted { get; set; }
    /// <summary>
    /// only returns records that have last updated since this date \\(UTC timestamp in milliseconds\\)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("lastUpdatedSince")]
    public long? LastUpdatedSince { get; set; }
    /// <summary>
    /// the start index for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// the limit for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}
public class UpdateRegionRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The id of the account sending the request
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The id of the region to be updated
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("regionId")]
    public long RegionId { get; set; }
    /// <summary>
    /// RegionClass of this region
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("regionClass")]
    public string? RegionClass { get; set; }
    /// <summary>
    /// Short name of the region. This is optimized for search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("shortName")]
    public string? ShortName { get; set; }
    /// <summary>
    /// Full name of the region
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("fullName")]
    public string? FullName { get; set; }
    /// <summary>
    /// Comma separated region ids that are parents of this region
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parentIds")]
    public string? ParentIds { get; set; }
    /// <summary>
    /// Comma separated region ids that are children of this region
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("childrenIds")]
    public string? ChildrenIds { get; set; }
    /// <summary>
    /// Comma separated postal code ids the region will include
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("postalCodeIds")]
    public string? PostalCodeIds { get; set; }
    /// <summary>
    /// Sets of name,lat,long used to create new postal codes assigned to the region
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locations")]
    public string? Locations { get; set; }
    /// <summary>
    /// the retailer location ID that the region is associated with
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationId")]
    public long? RetailerLocationId { get; set; }
    /// <summary>
    /// The Visibility of the region
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("visibility")]
    public string? Visibility { get; set; }
    /// <summary>
    /// the categories that the region is assigned to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// the filters that the region is assigned to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filterIds")]
    public string? FilterIds { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public long? Start { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("end")]
    public long? End { get; set; }
    /// <summary>
    /// the polygon of the region
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("polygon")]
    public string? Polygon { get; set; }
    /// <summary>
    /// the meta data of the region
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
    /// <summary>
    /// the latitude of the region
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// the longitude of the region
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// the version code
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("versionCode")]
    public int? VersionCode { get; set; }
    /// <summary>
    /// If this is a root region or not. If true means this region has no parent regions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("root")]
    public bool? Root { get; set; }
    /// <summary>
    /// Active or inactive status of the region
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// If true clear the children and postal code lists before add new ones, otherwise just append.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("clearLists")]
    public bool? ClearLists { get; set; }
}


