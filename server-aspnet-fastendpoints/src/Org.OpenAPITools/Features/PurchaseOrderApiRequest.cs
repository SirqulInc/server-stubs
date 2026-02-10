
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateOrderRequest
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
    /// The application requesting the purchase
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// A description of the purchase
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// Determines the method of purchasing offer.  * VOID: used for when there is no payment involved (ie. for updating the status of a purchase order)  * CASH: use card on file  * POINTS: use account balance  * TICKETS: use tickets  * REFUND: not allowed for a create, requires a paymentTransactionId.  * CREDIT: add to the account balance  * RELOAD: charge a credit card then add to the account balance  
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("currencyType")]
    public string? CurrencyType { get; set; }
    /// <summary>
    /// &#x60;&#x60;&#x60;json [   { \&quot;orderItemType\&quot;: \&quot;OFFER\&quot;, \&quot;orderItemId\&quot;: 234, \&quot;orderCustomType\&quot;: \&quot;OfferLocation\&quot;, \&quot;orderCustomId\&quot;: 123, \&quot;retailerLocationId\&quot;: 1234, \&quot;quantity\&quot;: 2 },   { \&quot;orderItemType\&quot;: \&quot;OFFER\&quot;, \&quot;orderItemId\&quot;: 235, \&quot;quantity\&quot;: 2 },   { \&quot;orderItemType\&quot;: \&quot;CUSTOM\&quot;, \&quot;amount\&quot;: 10.50, \&quot;orderCustomType\&quot;: \&quot;ServiceFee\&quot; },   { \&quot;orderItemType\&quot;: \&quot;CUSTOM\&quot;, \&quot;amount\&quot;: 25.10, \&quot;quantity\&quot;: 2, \&quot;orderCustomType\&quot;: \&quot;Hat\&quot;, \&quot;orderCustomId\&quot;: 123 } ] &#x60;&#x60;&#x60; 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("cart")]
    public string Cart { get; set; }
    /// <summary>
    /// Use a specific payment method (CASH), if not provided use default
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("paymentMethodId")]
    public long? PaymentMethodId { get; set; }
    /// <summary>
    /// Store identifier from external system
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalOrderId")]
    public string? ExternalOrderId { get; set; }
    /// <summary>
    /// Store identifier from external system
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalPaymentId")]
    public string? ExternalPaymentId { get; set; }
    /// <summary>
    /// Remote Reference type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("remoteRefType")]
    public string? RemoteRefType { get; set; }
    /// <summary>
    /// External Date
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalDate")]
    public long? ExternalDate { get; set; }
    /// <summary>
    /// The Promo Code
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("promoCode")]
    public string? PromoCode { get; set; }
}
public class DeleteOrderRequest
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
    /// Order Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("orderId")]
    public long OrderId { get; set; }
}
public class GetOrderRequest
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
    /// The order id to get details of, either orderId or externalOrderId must be provided
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("orderId")]
    public long? OrderId { get; set; }
    /// <summary>
    /// The external order id to get details of, either orderId or externalOrderId must be provided
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalOrderId")]
    public string? ExternalOrderId { get; set; }
}
public class PreviewOrderRequest
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
    /// The application requesting the purchase
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// A description of the purchase
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// Determines the method of purchasing offer. &#x60;&#x60;&#x60;json {   \&quot;VOID\&quot;: \&quot;used for when there is no payment involved (ie. for updating the status of a purchase order)\&quot;,   \&quot;CASH\&quot;: \&quot;use card on file\&quot;,   \&quot;POINTS\&quot;: \&quot;use account balance\&quot;,   \&quot;TICKETS\&quot;: \&quot;use tickets\&quot;,   \&quot;REFUND\&quot;: \&quot;not allowed for a create, requires a paymentTransactionId\&quot;,   \&quot;CREDIT\&quot;: \&quot;add to the account balance\&quot;,   \&quot;RELOAD\&quot;: \&quot;charge a credit card then add to the account balance\&quot; } &#x60;&#x60;&#x60; 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("currencyType")]
    public string? CurrencyType { get; set; }
    /// <summary>
    /// A JSON list of items to purchase
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("cart")]
    public string Cart { get; set; }
    /// <summary>
    /// Use a specific payment method (CASH), if not provided use default
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("paymentMethodId")]
    public long? PaymentMethodId { get; set; }
    /// <summary>
    /// Store identifier from external system
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalOrderId")]
    public string? ExternalOrderId { get; set; }
    /// <summary>
    /// Store identifier from external system
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalPaymentId")]
    public string? ExternalPaymentId { get; set; }
    /// <summary>
    /// Remote Reference type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("remoteRefType")]
    public string? RemoteRefType { get; set; }
    /// <summary>
    /// External Date
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalDate")]
    public long? ExternalDate { get; set; }
    /// <summary>
    /// The Promo Code
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("promoCode")]
    public string? PromoCode { get; set; }
}
public class SearchOrdersRequest
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
    /// The application requesting the purchase
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
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
    /// Determines whether to return the resulting list in descending or ascending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// Only return active orders
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool? ActiveOnly { get; set; }
    /// <summary>
    /// Determines whether to ignore the customer filter (requires an Admin/Exec account)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ignoreCustomerFilter")]
    public bool? IgnoreCustomerFilter { get; set; }
    /// <summary>
    /// Filter results by orderItemTypes
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("orderItemTypes")]
    public string? OrderItemTypes { get; set; }
    /// <summary>
    /// Filter results by orderItemIds
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("orderItemIds")]
    public string? OrderItemIds { get; set; }
    /// <summary>
    /// Filter results by orderCustomTypes
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("orderCustomTypes")]
    public string? OrderCustomTypes { get; set; }
    /// <summary>
    /// Filter results by orderCustomIds
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("orderCustomIds")]
    public string? OrderCustomIds { get; set; }
    /// <summary>
    /// Determines what to sort the results by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// Filter results by offer type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerTypes")]
    public string? OfferTypes { get; set; }
    /// <summary>
    /// Filter results by special offer type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("specialOfferTypes")]
    public string? SpecialOfferTypes { get; set; }
    /// <summary>
    /// Filter results by category Ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// Filter results by filter Ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filterIds")]
    public string? FilterIds { get; set; }
    /// <summary>
    /// Filter results by offer audience Ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerAudienceIds")]
    public string? OfferAudienceIds { get; set; }
    /// <summary>
    /// Filter results by transaction audience Ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("transactionAudienceIds")]
    public string? TransactionAudienceIds { get; set; }
    /// <summary>
    /// Filter results by offer Ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerIds")]
    public string? OfferIds { get; set; }
    /// <summary>
    /// Filter results by offer location Ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerLocationIds")]
    public string? OfferLocationIds { get; set; }
    /// <summary>
    /// Filter results by retailer Ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerIds")]
    public string? RetailerIds { get; set; }
    /// <summary>
    /// Filter results by retailer location Ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationIds")]
    public string? RetailerLocationIds { get; set; }
    /// <summary>
    /// Filter results by offer transaction status (0: non-redeemable, 1: redeemable, 2: redeemed, 3: user deleted, 4: unclaimed/rewarded, 5: membership active, 6: membership cancelled)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("statuses")]
    public string? Statuses { get; set; }
    /// <summary>
    /// The keyword to search for
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
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
}
public class UpdateOrderRequest
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
    /// The order to add the purchase to, leave null for new order.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("orderId")]
    public long OrderId { get; set; }
    /// <summary>
    /// The payment transaction to apply the refund to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("paymentTransactionId")]
    public long? PaymentTransactionId { get; set; }
    /// <summary>
    /// The application requesting the purchase
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// A description of the purchase
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// Determines the method of purchasing offer.  * VOID: used for when there is no payment involved (ie. for updating the status of a purchase order)  * CASH: use card on file  * POINTS: use account balance  * TICKETS: use tickets  * REFUND: not allowed for a create, requires a paymentTransactionId.  * CREDIT: add to the account balance  * RELOAD: charge a credit card then add to the account balance  
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("currencyType")]
    public string? CurrencyType { get; set; }
    /// <summary>
    /// &#x60;&#x60;&#x60;json [   { \&quot;orderItemType\&quot;: \&quot;OFFER\&quot;, \&quot;orderItemId\&quot;: 234, \&quot;orderCustomType\&quot;: \&quot;OfferLocation\&quot;, \&quot;orderCustomId\&quot;: 123, \&quot;retailerLocationId\&quot;: 1234, \&quot;quantity\&quot;: 2 },   { \&quot;orderItemType\&quot;: \&quot;OFFER\&quot;, \&quot;orderItemId\&quot;: 235, \&quot;quantity\&quot;: 2 },   { \&quot;orderItemType\&quot;: \&quot;CUSTOM\&quot;, \&quot;amount\&quot;: 10.50, \&quot;orderCustomType\&quot;: \&quot;ServiceFee\&quot; },   { \&quot;orderItemType\&quot;: \&quot;CUSTOM\&quot;, \&quot;amount\&quot;: 25.10, \&quot;quantity\&quot;: 2, \&quot;orderCustomType\&quot;: \&quot;Hat\&quot;, \&quot;orderCustomId\&quot;: 123 } ] &#x60;&#x60;&#x60; 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("cart")]
    public string Cart { get; set; }
    /// <summary>
    /// Use a specific payment method (CASH), if not provided use default
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("paymentMethodId")]
    public long? PaymentMethodId { get; set; }
    /// <summary>
    /// Store identifier from external system
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalPaymentId")]
    public string? ExternalPaymentId { get; set; }
    /// <summary>
    /// External Date
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalDate")]
    public long? ExternalDate { get; set; }
}


