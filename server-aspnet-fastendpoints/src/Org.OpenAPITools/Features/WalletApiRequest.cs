
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateOfferTransactionRequest
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
    /// The id of the offer being added (offerId or offeLocationId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerId")]
    public long? OfferId { get; set; }
    /// <summary>
    /// The id of the offer location being added (offerId or offeLocationId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerLocationId")]
    public long? OfferLocationId { get; set; }
    /// <summary>
    /// A JSON list of offers to purchase. &#x60;&#x60;&#x60;json [   {     \&quot;offerId\&quot;: 123,     \&quot;offerLocationId\&quot;: 234,     \&quot;quantity\&quot;: 2   },   {     \&quot;offerId\&quot;: 456,     \&quot;offerLocationId\&quot;: 567,     \&quot;quantity\&quot;: 1   } ] &#x60;&#x60;&#x60; 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerCart")]
    public string? OfferCart { get; set; }
    /// <summary>
    /// The promoCode
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("promoCode")]
    public string? PromoCode { get; set; }
    /// <summary>
    /// Determines the method of purchasing offer. CASH &#x3D; use card on file, POINTS &#x3D; use points, TICKETS &#x3D; use tickets
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("currencyType")]
    public string? CurrencyType { get; set; }
    /// <summary>
    /// Sets the currencyType to POINTS
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("usePoints")]
    public bool? UsePoints { get; set; }
    /// <summary>
    /// External custom client defined data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
    /// <summary>
    /// The application requesting the purchase, required when currencyType is TICKETS
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// Custom status value to change to (0 or 1 for redeem, 5 or 6 for membership)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("status")]
    public int? Status { get; set; }
}
public class DeleteOfferTransactionRequest
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
    /// The offer transaction id to remove
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("transactionId")]
    public long TransactionId { get; set; }
}
public class GetOfferTransactionRequest
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
    /// The offer transaction id to get details of
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("transactionId")]
    public long TransactionId { get; set; }
    /// <summary>
    /// If true then include mission data, false to not include
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeMission")]
    public bool? IncludeMission { get; set; }
    /// <summary>
    /// The latitude location of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// The latitude location of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// Determines whether to return a detailed version of the response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnFullResponse")]
    public bool? ReturnFullResponse { get; set; }
}
public class PreviewOfferTransactionRequest
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
    /// The id of the offer being added (offerId or offeLocationId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerId")]
    public long? OfferId { get; set; }
    /// <summary>
    /// The id of the offer location being added (offerId or offeLocationId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerLocationId")]
    public long? OfferLocationId { get; set; }
    /// <summary>
    /// A JSON list of offers to purchase.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerCart")]
    public string? OfferCart { get; set; }
    /// <summary>
    /// The promoCode
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("promoCode")]
    public string? PromoCode { get; set; }
    /// <summary>
    /// Determines the method of purchasing offer. CASH &#x3D; use card on file, POINTS &#x3D; use points, TICKETS &#x3D; use tickets
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("currencyType")]
    public string? CurrencyType { get; set; }
    /// <summary>
    /// Sets the currencyType to POINTS
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("usePoints")]
    public bool? UsePoints { get; set; }
    /// <summary>
    /// External custom client defined data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
    /// <summary>
    /// The application requesting the purchase, required when currencyType is TICKETS
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
}
public class SearchOfferTransactionsRequest
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
    /// Filter results for a list of retailers
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerIds")]
    public string? RetailerIds { get; set; }
    /// <summary>
    /// Filter results for this retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationId")]
    public long? RetailerLocationId { get; set; }
    /// <summary>
    /// Filter results for a list of retailer locations
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationIds")]
    public string? RetailerLocationIds { get; set; }
    /// <summary>
    /// Filter results to exclude retailer locations
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("excludeRetailerLocationIds")]
    public string? ExcludeRetailerLocationIds { get; set; }
    /// <summary>
    /// Filter results for this offer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerId")]
    public long? OfferId { get; set; }
    /// <summary>
    /// Filter results for a list of offer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerIds")]
    public string? OfferIds { get; set; }
    /// <summary>
    /// Filter results for this offer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerLocationId")]
    public long? OfferLocationId { get; set; }
    /// <summary>
    /// Filter results for a list of offer locations
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerLocationIds")]
    public string? OfferLocationIds { get; set; }
    /// <summary>
    /// Filter results to return a specific offer type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerType")]
    public string? OfferType { get; set; }
    /// <summary>
    /// Filter results to return specific offer types
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerTypes")]
    public string? OfferTypes { get; set; }
    /// <summary>
    /// Filter results to return a specific special offer type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("specialOfferType")]
    public string? SpecialOfferType { get; set; }
    /// <summary>
    /// Filter results to return specific special offer types
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("specialOfferTypes")]
    public string? SpecialOfferTypes { get; set; }
    /// <summary>
    /// Category Ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// Filter Ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filterIds")]
    public string? FilterIds { get; set; }
    /// <summary>
    /// Offer Audience Ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerAudienceIds")]
    public string? OfferAudienceIds { get; set; }
    /// <summary>
    /// Determines what to sort the results by
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
    /// <summary>
    /// The latitude location of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// The latitude location of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// Filter results by the offer redeemable date
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("redeemableStartDate")]
    public long? RedeemableStartDate { get; set; }
    /// <summary>
    /// Filter results by the offer redeemable date
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("redeemableEndDate")]
    public long? RedeemableEndDate { get; set; }
    /// <summary>
    /// Apply params to offer&#39;s parent
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filterByParentOffer")]
    public bool? FilterByParentOffer { get; set; }
    /// <summary>
    /// Filter results by the offer start date
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startedSince")]
    public long? StartedSince { get; set; }
    /// <summary>
    /// Filter results by the offer start date
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startedBefore")]
    public long? StartedBefore { get; set; }
    /// <summary>
    /// Filter results by the offer end date
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endedSince")]
    public long? EndedSince { get; set; }
    /// <summary>
    /// Filter results by the offer end date
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endedBefore")]
    public long? EndedBefore { get; set; }
    /// <summary>
    /// If true return redeemed transactions (status 2), otherwise return active transactions (status 0 or 1)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("redeemed")]
    public bool? Redeemed { get; set; }
    /// <summary>
    /// Custom status value to change to (0 or 1 for redeem, 5 or 6 for membership)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("statuses")]
    public string? Statuses { get; set; }
    /// <summary>
    /// Returns only reservation transactions if true
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("reservationsOnly")]
    public bool? ReservationsOnly { get; set; }
    /// <summary>
    /// Active Only
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool? ActiveOnly { get; set; }
    /// <summary>
    /// Determines whether to return a detailed version of the response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnFullResponse")]
    public bool? ReturnFullResponse { get; set; }
    /// <summary>
    /// Filter results by the recurring billing start date
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("recurringStartedSince")]
    public long? RecurringStartedSince { get; set; }
    /// <summary>
    /// Filter results by the recurring billing start date
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("recurringStartedBefore")]
    public long? RecurringStartedBefore { get; set; }
    /// <summary>
    /// Filter results by the recurring billing expiration date
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("recurringExpirationSince")]
    public long? RecurringExpirationSince { get; set; }
    /// <summary>
    /// Filter results by the recurring billing expiration date
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("recurringExpirationBefore")]
    public long? RecurringExpirationBefore { get; set; }
}
public class UpdateOfferTransactionRequest
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
    /// The offer transaction id to remove
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("transactionId")]
    public long TransactionId { get; set; }
    /// <summary>
    /// Offer Location Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerLocationId")]
    public long? OfferLocationId { get; set; }
    /// <summary>
    /// Currency Type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("currencyType")]
    public string? CurrencyType { get; set; }
    /// <summary>
    /// Use Points
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("usePoints")]
    public bool? UsePoints { get; set; }
    /// <summary>
    /// App Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// The status value to change to (0 or 1)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("status")]
    public int Status { get; set; }
    /// <summary>
    /// The latitude location of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// The latitude location of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// External custom client defined data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
    /// <summary>
    /// Determines whether to return a detailed version of the response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnFullResponse")]
    public bool? ReturnFullResponse { get; set; }
    /// <summary>
    /// Exception Offers, transaction audiences of these offers won&#39;t be removed out of the account when up
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("exceptionMembershipOfferIds")]
    public string? ExceptionMembershipOfferIds { get; set; }
}


