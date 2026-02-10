
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class AttendEventRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The device id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The application of where to send notifications about the attend action
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// The scheduled broadcast or marketing experience id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("listingId")]
    public long? ListingId { get; set; }
    /// <summary>
    /// The retailer location where the event is being held
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationId")]
    public long? RetailerLocationId { get; set; }
    /// <summary>
    /// The actual event being held
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerLocationId")]
    public long? OfferLocationId { get; set; }
    /// <summary>
    /// The wallet item to update the status of, if provided then ignore the listingId, retailerLocationId, and the offerLocationId
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("transactionId")]
    public long? TransactionId { get; set; }
    /// <summary>
    /// Sets whether the user is: undecided (0), attending (1), attending and checked in (2), or not attending (3)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("status")]
    public int? Status { get; set; }
    /// <summary>
    /// The location of the status update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// The location of the status update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
}
public class CreateEventRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The logged in user.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The retailer location to have the event at
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationIds")]
    public string? RetailerLocationIds { get; set; }
    /// <summary>
    /// The event title
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string Title { get; set; }
    /// <summary>
    /// The event sub title
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("subTitle")]
    public string? SubTitle { get; set; }
    /// <summary>
    /// The event details
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("details")]
    public string? Details { get; set; }
    /// <summary>
    /// The categories the associate the event with
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// The filters the associate the event with
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filterIds")]
    public string? FilterIds { get; set; }
    /// <summary>
    /// Is this event active
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// The image to show for the event
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("imageAssetId")]
    public long? ImageAssetId { get; set; }
    /// <summary>
    /// The event start date/time
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("redeemableStart")]
    public long? RedeemableStart { get; set; }
    /// <summary>
    /// The event end date/time
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("redeemableEnd")]
    public long? RedeemableEnd { get; set; }
    /// <summary>
    /// external custom client defined data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
}
public class DeleteEventRequest
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
    /// the id of the event to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("eventId")]
    public long EventId { get; set; }
}
public class GetEventRequest
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
    /// The id of the event to return
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("eventId")]
    public long EventId { get; set; }
}
public class SearchEventTransactionsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The device id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// The keyword to search for
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// Filter results for this retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerId")]
    public long? RetailerId { get; set; }
    /// <summary>
    /// Filter results for this retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationId")]
    public long? RetailerLocationId { get; set; }
    /// <summary>
    /// Exclude results from this retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("excludeRetailerLocationId")]
    public long? ExcludeRetailerLocationId { get; set; }
    /// <summary>
    /// Filter results for this event listing
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("listingId")]
    public long? ListingId { get; set; }
    /// <summary>
    /// Filter results for this offer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerId")]
    public long? OfferId { get; set; }
    /// <summary>
    /// Filter results for this offer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerLocationId")]
    public long? OfferLocationId { get; set; }
    /// <summary>
    /// Filter results by accounts
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("customerAccountIds")]
    public string? CustomerAccountIds { get; set; }
    /// <summary>
    /// Comma separated list of category ids to determine whether the attendee is affiliated with the category
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("affiliatedCategoryIds")]
    public string? AffiliatedCategoryIds { get; set; }
    /// <summary>
    /// Filter on attendance starting on or after this date (milliseconds since epoch)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// Filter on attendance starting on or before this date (milliseconds since epoch)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long? EndDate { get; set; }
    /// <summary>
    /// Comma separated list of transaction statuses to filter on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("statuses")]
    public string? Statuses { get; set; }
    /// <summary>
    /// Determines what to sort the results by {CREATED, UPDATED, SEARCH_TAGS, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, CUSTOMER_ID, CUSTOMER_DISPLAY, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// Determines whether the results are in descending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// The start index for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// The limit for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}
public class SearchEventsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The logged in user.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The keyword used to search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// Return only active results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool? ActiveOnly { get; set; }
    /// <summary>
    /// the IDs of the categories that this event is associated with
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// the IDs of the filters that this event is associated with
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filterIds")]
    public string? FilterIds { get; set; }
    /// <summary>
    /// Offer audience ids to filter on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerAudienceIds")]
    public string? OfferAudienceIds { get; set; }
    /// <summary>
    /// Transaction audience ids to filter on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("transactionAudienceIds")]
    public string? TransactionAudienceIds { get; set; }
    /// <summary>
    /// The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// The order to return the search results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// Filter the events to return only those that start on or after the date
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// Filter the events to return only those that start on or before the date
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long? EndDate { get; set; }
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
}
public class UpdateEventRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The logged in user.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The id of the event to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("eventId")]
    public long EventId { get; set; }
    /// <summary>
    /// The retailer location to have the event at
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationIds")]
    public string? RetailerLocationIds { get; set; }
    /// <summary>
    /// The event title
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string? Title { get; set; }
    /// <summary>
    /// The event sub title
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("subTitle")]
    public string? SubTitle { get; set; }
    /// <summary>
    /// The event details
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("details")]
    public string? Details { get; set; }
    /// <summary>
    /// The categories the associate the event with
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// The filters the associate the event with
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filterIds")]
    public string? FilterIds { get; set; }
    /// <summary>
    /// Is this event active
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// The image to show for the event
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("imageAssetId")]
    public long? ImageAssetId { get; set; }
    /// <summary>
    /// The event start date/time
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("redeemableStart")]
    public long? RedeemableStart { get; set; }
    /// <summary>
    /// The event end date/time
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("redeemableEnd")]
    public long? RedeemableEnd { get; set; }
}


