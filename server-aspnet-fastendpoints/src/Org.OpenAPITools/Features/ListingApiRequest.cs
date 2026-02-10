
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateListingRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the user&#39;s account ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the name of the listing
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string Name { get; set; }
    /// <summary>
    /// comma separated list of filter IDs
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filterIds")]
    public string? FilterIds { get; set; }
    /// <summary>
    /// the description of the listing
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// the start date of the listing
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public long? Start { get; set; }
    /// <summary>
    /// the end date of the listing
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("end")]
    public long? End { get; set; }
    /// <summary>
    /// the name of the location the listing will be held at
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locationName")]
    public string? LocationName { get; set; }
    /// <summary>
    /// the description of the location the listing will be held at
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locationDescription")]
    public string? LocationDescription { get; set; }
    /// <summary>
    /// determines whether the listing is public or private
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("isPrivate")]
    public bool? IsPrivate { get; set; }
    /// <summary>
    /// external identifier used by a third party
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalId")]
    public string? ExternalId { get; set; }
    /// <summary>
    /// secondary external identifier used by a third party
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalId2")]
    public string? ExternalId2 { get; set; }
    /// <summary>
    /// external group identifier used by a third party
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalGroupId")]
    public string? ExternalGroupId { get; set; }
    /// <summary>
    /// Sets the active flag
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// external custom client defined data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
}
public class DeleteListingRequest
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
    public long AccountId { get; set; }
    /// <summary>
    /// the id of the listing to delete
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("listingId")]
    public long ListingId { get; set; }
}
public class GetListingRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the listing to get
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("listingId")]
    public long ListingId { get; set; }
}
public class SearchListingRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the account id of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// search the event name and description for this keyword
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// the record to begin the return set on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// the number of records to return
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// whether to search on active listings only
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool? ActiveOnly { get; set; }
    /// <summary>
    /// the current latitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// the current longitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// the start date to search from
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// the end date to search to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long? EndDate { get; set; }
    /// <summary>
    /// only return items of these categories
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filterIds")]
    public string? FilterIds { get; set; }
    /// <summary>
    /// determines whether to use configured listing order ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("useListingOrderIds")]
    public bool? UseListingOrderIds { get; set; }
    /// <summary>
    /// external identifier used by a third party
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalId")]
    public string? ExternalId { get; set; }
    /// <summary>
    /// secondary external identifier used by a third party
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalId2")]
    public string? ExternalId2 { get; set; }
    /// <summary>
    /// external group identifier used by a third party
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalGroupId")]
    public string? ExternalGroupId { get; set; }
}
public class SummaryListingRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the account id of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the start date to search from
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// the list of categories to search on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// how far out to search, in days
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("daysToInclude")]
    public int? DaysToInclude { get; set; }
    /// <summary>
    /// determines whether to use configured listing order ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("useListingOrderIds")]
    public bool? UseListingOrderIds { get; set; }
}
public class UpdateListingRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the user&#39;s account ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the listing to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("listingId")]
    public long ListingId { get; set; }
    /// <summary>
    /// comma separated list of filter IDs
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filterIds")]
    public string? FilterIds { get; set; }
    /// <summary>
    /// the name of the listing
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string? Name { get; set; }
    /// <summary>
    /// the description of the listing
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// the start date of the listing
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public long? Start { get; set; }
    /// <summary>
    /// the end date of the listing
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("end")]
    public long? End { get; set; }
    /// <summary>
    /// the name of the location the listing will be held at
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locationName")]
    public string? LocationName { get; set; }
    /// <summary>
    /// the description of the location the listing will be held at
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locationDescription")]
    public string? LocationDescription { get; set; }
    /// <summary>
    /// determines whether the listing is public or private
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("isPrivate")]
    public bool? IsPrivate { get; set; }
    /// <summary>
    /// external identifier used by a third party
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalId")]
    public string? ExternalId { get; set; }
    /// <summary>
    /// secondary external identifier used by a third party
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalId2")]
    public string? ExternalId2 { get; set; }
    /// <summary>
    /// external group identifier used by a third party
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalGroupId")]
    public string? ExternalGroupId { get; set; }
    /// <summary>
    /// Sets the active flag
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// external custom client defined data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
}


