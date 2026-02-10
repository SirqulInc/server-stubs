
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreatePurchaseItemRequest
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
    /// The application key that the purchase can be used in
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// The name of the purchase item
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string Name { get; set; }
    /// <summary>
    /// The description of the purchase item
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// How much the purchase item is worth in tickets
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tickets")]
    public int? Tickets { get; set; }
    /// <summary>
    /// How much the purchase item will cost in real money
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("price")]
    public float? Price { get; set; }
    /// <summary>
    /// The purchase provider &lt;ul&gt; &lt;li&gt;SIRQUL - the Sirqul store to make purchases using tickets&lt;/li&gt; &lt;li&gt;IOS - the iTunes store for iPhone, iPod, iPod Touch&lt;/li&gt; &lt;li&gt;GOOGLE - the Google Play store&lt;/li&gt; &lt;li&gt;AMAZON - the Amazon Android store&lt;/li&gt; &lt;li&gt;MAC - the iTunes store for OSX&lt;/li&gt; &lt;li&gt;WP8 - the Windows Phone 8 store&lt;/li&gt; &lt;li&gt;FREE - used for purchase items that are free (can be used for development/testing purposes)&lt;/li&gt; &lt;/ul&gt;
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("purchaseType")]
    public string PurchaseType { get; set; }
    /// <summary>
    /// The unique identifier used by purchase providers to identify in-app-purchases
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("purchaseCode")]
    public string? PurchaseCode { get; set; }
    /// <summary>
    /// A secret key from purchase providers that would be used for validation
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("secretKey")]
    public string? SecretKey { get; set; }
    /// <summary>
    /// How many times a user acquire the same purchase item
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("purchaseLimit")]
    public int? PurchaseLimit { get; set; }
    /// <summary>
    /// Determines whether the purchase item will enable certain features &lt;ul&gt; &lt;li&gt;DAY_PREMIUM - subscribes a user for a day of membership&lt;/li&gt; &lt;li&gt;WEEK_PREMIUM - subscribes a user for a week of membership&lt;/li&gt; &lt;li&gt;MONTH_PREMIUM - subscribes a user for a month of membership&lt;/li&gt; &lt;li&gt;ADD_TICKET - allows a user to add more tickets to their account&lt;/li&gt; &lt;li&gt;ADD_GIFT - allows a user to send/recieve the purchase item as a gift&lt;/li&gt; &lt;/ul&gt;
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("serviceAction")]
    public string? ServiceAction { get; set; }
    /// <summary>
    /// The cover image of the purchase item
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("coverAssetId")]
    public long? CoverAssetId { get; set; }
    /// <summary>
    /// An application specific asset that can be used to store/provide additional data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("promoAssetId")]
    public long? PromoAssetId { get; set; }
    /// <summary>
    /// Determines whether the purchase item can be gifted to other users
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("giftable")]
    public bool? Giftable { get; set; }
    /// <summary>
    /// Determines whether users can attach their own media/asset to the purchase item
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetable")]
    public bool? Assetable { get; set; }
    /// <summary>
    /// Flag to indicate owner should receive tickets for completed missions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("allocateTickets")]
    public bool? AllocateTickets { get; set; }
    /// <summary>
    /// The type of ticket to reward, null means default type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ticketType")]
    public string? TicketType { get; set; }
    /// <summary>
    /// The number of points to award for completing a mission
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("points")]
    public long? Points { get; set; }
    /// <summary>
    /// The offer location that will get added to the user&#39;s wallet after purchase.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerLocationId")]
    public long? OfferLocationId { get; set; }
}
public class DeletePurchaseItemRequest
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
    /// The purchase item id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("purchaseItemId")]
    public long PurchaseItemId { get; set; }
}
public class GetPurchaseItemRequest
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
    /// The purchase item id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("purchaseItemId")]
    public long PurchaseItemId { get; set; }
}
public class SearchPurchaseItemsRequest
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
    /// The application key to filter results by application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// Determines whether to filter results by the user&#39;s billable entity
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filterByBillable")]
    public bool? FilterByBillable { get; set; }
    /// <summary>
    /// A comma separated list of purchase providers to filter by. Possible values include: &lt;ul&gt; &lt;li&gt;SIRQUL - purchases from the Sirqul store using tickets&lt;/li&gt; &lt;li&gt;IOS - purchases from the iTunes store for iPhone, iPod, iPod Touch&lt;/li&gt; &lt;li&gt;GOOGLE - purchases from the Google Play store&lt;/li&gt; &lt;li&gt;AMAZON - purchases from the Amazon Android store&lt;/li&gt; &lt;li&gt;MAC - purchases from the iTunes store for OSX&lt;/li&gt; &lt;li&gt;WP8 - purchases from the Windows Phone 8 store&lt;/li&gt; &lt;li&gt;FREE - purchases that are free (can be used for development/testing purposes)&lt;/li&gt; &lt;/ul&gt;
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("purchaseType")]
    public string? PurchaseType { get; set; }
    /// <summary>
    /// A comma separated list of service actions to filter results by. Possible values include: &lt;ul&gt; &lt;li&gt;DAY_PREMIUM - purchases that subscribes a user for a day of membership&lt;/li&gt; &lt;li&gt;WEEK_PREMIUM - purchases that subscribes a user for a week of membership&lt;/li&gt; &lt;li&gt;MONTH_PREMIUM - purchases that subscribes a user for a month of membership&lt;/li&gt; &lt;li&gt;ADD_TICKET - purchases that allow users to add more tickets&lt;/li&gt; &lt;li&gt;ADD_GIFT - purchases that allow users to recieve gifts&lt;/li&gt; &lt;/ul&gt;
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("serviceAction")]
    public string? ServiceAction { get; set; }
    /// <summary>
    /// The keyword used to search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
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
    /// Return only active results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool? ActiveOnly { get; set; }
}
public class UpdatePurchaseItemRequest
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
    /// The purchase item id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("purchaseItemId")]
    public long PurchaseItemId { get; set; }
    /// <summary>
    /// The name of the purchase item
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string? Name { get; set; }
    /// <summary>
    /// The description of the purchase item
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// How much the purchase item is worth in tickets
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tickets")]
    public int? Tickets { get; set; }
    /// <summary>
    /// How much the purchase item will cost in real money
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("price")]
    public float? Price { get; set; }
    /// <summary>
    /// The purchase provider &lt;ul&gt; &lt;li&gt;SIRQUL - the Sirqul store to make purchases using tickets&lt;/li&gt; &lt;li&gt;IOS - the iTunes store for iPhone, iPod, iPod Touch&lt;/li&gt; &lt;li&gt;GOOGLE - the Google Play store&lt;/li&gt; &lt;li&gt;AMAZON - the Amazon Android store&lt;/li&gt; &lt;li&gt;MAC - the iTunes store for OSX&lt;/li&gt; &lt;li&gt;WP8 - the Windows Phone 8 store&lt;/li&gt; &lt;li&gt;FREE - used for purchase items that are free (can be used for development/testing purposes)&lt;/li&gt; &lt;/ul&gt;
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("purchaseType")]
    public string? PurchaseType { get; set; }
    /// <summary>
    /// The unique identifier used by purchase providers to identify in-app-purchases
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("purchaseCode")]
    public string? PurchaseCode { get; set; }
    /// <summary>
    /// A secret key from purchase providers that would be used for validation
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("secretKey")]
    public string? SecretKey { get; set; }
    /// <summary>
    /// How many times a user acquire the same purchase item
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("purchaseLimit")]
    public int? PurchaseLimit { get; set; }
    /// <summary>
    /// Determines whether the purchase item will enable certain features &lt;ul&gt; &lt;li&gt;DAY_PREMIUM - subscribes a user for a day of membership&lt;/li&gt; &lt;li&gt;WEEK_PREMIUM - subscribes a user for a week of membership&lt;/li&gt; &lt;li&gt;MONTH_PREMIUM - subscribes a user for a month of membership&lt;/li&gt; &lt;li&gt;ADD_TICKET - allows a user to add more tickets to their account&lt;/li&gt; &lt;li&gt;ADD_GIFT - allows a user to send/recieve the purchase item as a gift&lt;/li&gt; &lt;/ul&gt;
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("serviceAction")]
    public string? ServiceAction { get; set; }
    /// <summary>
    /// The cover image of the purchase item
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("coverAssetId")]
    public long? CoverAssetId { get; set; }
    /// <summary>
    /// An application specific asset that can be used to store/provide additional data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("promoAssetId")]
    public long? PromoAssetId { get; set; }
    /// <summary>
    /// Determines whether the purchase item can be gifted to other users
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("giftable")]
    public bool? Giftable { get; set; }
    /// <summary>
    /// Determines whether users can attach their own media/asset to the purchase item
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetable")]
    public bool? Assetable { get; set; }
    /// <summary>
    /// Sets whether the purchase item is active or inactive (hidden from consumers)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// Flag to indicate owner should receive tickets for completed missions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("allocateTickets")]
    public bool? AllocateTickets { get; set; }
    /// <summary>
    /// The type of ticket to reward, null means default type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ticketType")]
    public string? TicketType { get; set; }
    /// <summary>
    /// The number of points to award for completing a mission
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("points")]
    public long? Points { get; set; }
    /// <summary>
    /// The offer location that will get added to the user&#39;s wallet after purchase.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerLocationId")]
    public long? OfferLocationId { get; set; }
}


