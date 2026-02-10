
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class BatchUpdateOfferLocationsRequest
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
    /// JSON string in the following format: &#x60;&#x60;&#x60;json [{   \&quot;offerLocationId\&quot;: 1705,   \&quot;latitude\&quot;: 54.0,   \&quot;longitude\&quot;: -122.0,   \&quot;altitude\&quot;: 1.0,   \&quot;locationDetail\&quot;: \&quot;floor 1\&quot;,   \&quot;locationDescription\&quot;: \&quot;behind the Coke sign\&quot; }, {   \&quot;offerLocationId\&quot;: 1704,   \&quot;latitude\&quot;: 54.1,   \&quot;longitude\&quot;: -122.1 }] &#x60;&#x60;&#x60; 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("data")]
    public string Data { get; set; }
}
public class CreateOfferRequest
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
    /// Custom string field for doing full-text searches
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tags")]
    public string? Tags { get; set; }
    /// <summary>
    /// the parent offer id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parentOfferId")]
    public long? ParentOfferId { get; set; }
    /// <summary>
    /// If true return all the offer locations associated with the offer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeOfferLocations")]
    public bool IncludeOfferLocations { get; set; }
    /// <summary>
    /// Comma separated list of retailer location ids. This will assign the offer to these retailer locations.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationIds")]
    public string? RetailerLocationIds { get; set; }
    /// <summary>
    /// A list of json data that has offer location specific values.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerLocations")]
    public string? OfferLocations { get; set; }
    /// <summary>
    /// The title (255 char limit)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string Title { get; set; }
    /// <summary>
    /// The sub title (255 char limit)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("subTitle")]
    public string? SubTitle { get; set; }
    /// <summary>
    /// The details
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("details")]
    public string? Details { get; set; }
    /// <summary>
    /// A string for custom details (255 char limit)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("subDetails")]
    public string? SubDetails { get; set; }
    /// <summary>
    /// The fine print
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("finePrint")]
    public string? FinePrint { get; set; }
    /// <summary>
    /// The bar code type {NONE, UPC, CODE_128, QR, CUSTOM_MEDIA}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("barcodeType")]
    public string BarcodeType { get; set; }
    /// <summary>
    /// The bar code entry string
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("barcodeEntry")]
    public string? BarcodeEntry { get; set; }
    /// <summary>
    /// An external identifier. What the identifier will be used for and how it is formatted is up to the frontend developer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalRedeemOptions")]
    public string? ExternalRedeemOptions { get; set; }
    /// <summary>
    /// The clickUrl of the offer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalUrl")]
    public string? ExternalUrl { get; set; }
    /// <summary>
    /// an external identifier. What the identifier will be used for and how it is formatted is up to the frontend developer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalId")]
    public string? ExternalId { get; set; }
    /// <summary>
    /// The type of ticket to reward, null means default type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ticketsRewardType")]
    public string? TicketsRewardType { get; set; }
    /// <summary>
    /// Determines how many tickets are awarded
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ticketsReward")]
    public long? TicketsReward { get; set; }
    /// <summary>
    /// The date of when the offer will be visible to consumers
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activated")]
    public long? Activated { get; set; }
    /// <summary>
    /// The date of when the offer expires
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("expires")]
    public long? Expires { get; set; }
    /// <summary>
    /// Overrides the expiration date so that the offer does not expire
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("noExpiration")]
    public bool NoExpiration { get; set; }
    /// <summary>
    /// The limit of how many times the offer can be used by consumers
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("availableLimit")]
    public int AvailableLimit { get; set; }
    /// <summary>
    /// The limit of how many times a user can used the same offer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("availableLimitPerUser")]
    public int AvailableLimitPerUser { get; set; }
    /// <summary>
    /// The limit of how many times the offer can be added to consumer wallets
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("addedLimit")]
    public int AddedLimit { get; set; }
    /// <summary>
    /// The limit of how many times the offer can be viewed
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("viewLimit")]
    public int ViewLimit { get; set; }
    /// <summary>
    /// The maximum number of times the offer can be printed
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("maxPrints")]
    public int MaxPrints { get; set; }
    /// <summary>
    /// the type of ticket needed to buy offer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ticketPriceType")]
    public string? TicketPriceType { get; set; }
    /// <summary>
    /// The cost of the offer in tickets
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ticketPrice")]
    public long TicketPrice { get; set; }
    /// <summary>
    /// The retail/full price cost of the offer in real currency
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("fullPrice")]
    public double FullPrice { get; set; }
    /// <summary>
    /// The cost of the offer at a discounted price (what the consumer pays)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("discountPrice")]
    public double DiscountPrice { get; set; }
    /// <summary>
    /// show remaining offers available
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("showRemaining")]
    public bool? ShowRemaining { get; set; }
    /// <summary>
    /// show how many offers have been redeemed
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("showRedeemed")]
    public bool? ShowRedeemed { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("replaced")]
    public bool? Replaced { get; set; }
    /// <summary>
    /// flag if offer is featured or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("featured")]
    public bool? Featured { get; set; }
    /// <summary>
    /// The offer type {VOUCHER, COUPON, PRODUCT, EVENT, MEDIA, DEVICE}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerType")]
    public string OfferType { get; set; }
    /// <summary>
    /// The special offer type {ALL, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("specialOfferType")]
    public string SpecialOfferType { get; set; }
    /// <summary>
    /// The offer visibility {PUBLIC, REWARDABLE, TRIGGERABLE}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerVisibility")]
    public string OfferVisibility { get; set; }
    /// <summary>
    /// Comma separated list of category ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// Comma separated list of filter ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filterIds")]
    public string? FilterIds { get; set; }
    /// <summary>
    /// Sets the active flag
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool Active { get; set; }
    /// <summary>
    /// The id of the barcode asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("barcodeAssetId")]
    public long? BarcodeAssetId { get; set; }
    /// <summary>
    /// The id of the an offer asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("imageAssetId")]
    public long? ImageAssetId { get; set; }
    /// <summary>
    /// The id of the an offer asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("imageAssetId1")]
    public long? ImageAssetId1 { get; set; }
    /// <summary>
    /// The id of the an offer asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("imageAssetId2")]
    public long? ImageAssetId2 { get; set; }
    /// <summary>
    /// The id of the an offer asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("imageAssetId3")]
    public long? ImageAssetId3 { get; set; }
    /// <summary>
    /// The id of the an offer asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("imageAssetId4")]
    public long? ImageAssetId4 { get; set; }
    /// <summary>
    /// The id of the an offer asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("imageAssetId5")]
    public long? ImageAssetId5 { get; set; }
    /// <summary>
    /// The maker of the item.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("publisher")]
    public string? Publisher { get; set; }
    /// <summary>
    /// The redeemable start date/time of the offer.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("redeemableStart")]
    public long? RedeemableStart { get; set; }
    /// <summary>
    /// The redeemable start date/time of the offer.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("redeemableEnd")]
    public long? RedeemableEnd { get; set; }
    /// <summary>
    /// The brand. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("brand")]
    public string? Brand { get; set; }
    /// <summary>
    /// The product type. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("productType")]
    public string? ProductType { get; set; }
    /// <summary>
    /// The condition. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("conditionType")]
    public string? ConditionType { get; set; }
    /// <summary>
    /// The ISBN id. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("isbn")]
    public string? Isbn { get; set; }
    /// <summary>
    /// The ASIN id. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("asin")]
    public string? Asin { get; set; }
    /// <summary>
    /// The list of catelog numbers, comma seperated. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("catalogNumbers")]
    public string? CatalogNumbers { get; set; }
    /// <summary>
    /// The department name. The OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("department")]
    public string? Department { get; set; }
    /// <summary>
    /// The list of features, comma seperated. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("features")]
    public string? Features { get; set; }
    /// <summary>
    /// The MAP price. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("minimumPrice")]
    public double? MinimumPrice { get; set; }
    /// <summary>
    /// The width of the item. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("width")]
    public double? Width { get; set; }
    /// <summary>
    /// The height of the item. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("height")]
    public double? Height { get; set; }
    /// <summary>
    /// The depth of the item. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("depth")]
    public double? Depth { get; set; }
    /// <summary>
    /// The weight of the item. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("weight")]
    public double? Weight { get; set; }
    /// <summary>
    /// The unit of measurement. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("unit")]
    public string? Unit { get; set; }
    /// <summary>
    /// The studio name. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("studio")]
    public string? Studio { get; set; }
    /// <summary>
    /// The parental control rating. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parentalRating")]
    public string? ParentalRating { get; set; }
    /// <summary>
    /// The date published. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("publishDate")]
    public long? PublishDate { get; set; }
    /// <summary>
    /// The date available. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("availabilityDate")]
    public long? AvailabilityDate { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sizeId")]
    public long? SizeId { get; set; }
    /// <summary>
    /// The ID of the event listing
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("listingId")]
    public long? ListingId { get; set; }
    /// <summary>
    /// the media type of the offer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("mediaType")]
    public string? MediaType { get; set; }
    /// <summary>
    /// The total playing time of the media item. OfferType MEDIA only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("duration")]
    public int? Duration { get; set; }
    /// <summary>
    /// The created/author of the media item. OfferType MEDIA only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("author")]
    public string? Author { get; set; }
    /// <summary>
    /// The date/time of when the media item was originally released. OfferType MEDIA only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("releaseDate")]
    public long? ReleaseDate { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("collectionIds")]
    public string? CollectionIds { get; set; }
    /// <summary>
    /// The reboot hour time ranging from 0 to 23
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("rebootTimeHour")]
    public int? RebootTimeHour { get; set; }
    /// <summary>
    /// The reboot minute time ranging from 0 to 59
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("rebootTimeMinute")]
    public int? RebootTimeMinute { get; set; }
    /// <summary>
    /// If the device is idle for idleTimeoutInSecond then the device should timeout
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("idleTimeoutInSecond")]
    public int? IdleTimeoutInSecond { get; set; }
    /// <summary>
    /// The serial number on the device
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("serialNumber")]
    public string? SerialNumber { get; set; }
    /// <summary>
    /// The unique device id for the device
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("udid")]
    public string? Udid { get; set; }
    /// <summary>
    /// The type of the device, for example: \&quot;Kiosk\&quot;, \&quot;Beacon\&quot;.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceType")]
    public string? DeviceType { get; set; }
    /// <summary>
    /// Edysen device power level setting
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("devicePower")]
    public double? DevicePower { get; set; }
    /// <summary>
    /// Edysen device inteference setting
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceInterference")]
    public double? DeviceInterference { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("availability")]
    public string? Availability { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("availabilitySummary")]
    public string? AvailabilitySummary { get; set; }
}
public class DeleteOfferRequest
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
    /// The account used to perform the delete, must have rights to edit the offer.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The ID of the offer to be deleted
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerId")]
    public long OfferId { get; set; }
}
public class DeleteOfferLocationRequest
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
    /// The account used to perform the delete, must have rights to edit the offer location.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The ID of the offer location to be deleted
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerLocationId")]
    public long OfferLocationId { get; set; }
}
public class GetOfferRequest
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
    /// The id of the offer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerId")]
    public long OfferId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeOfferLocations")]
    public bool IncludeOfferLocations { get; set; }
}
public class GetOfferDetailsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The device id for returning account information (i.e. favorites)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account id for returning account information (i.e. favorites)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The offer id (either offeLocationId or offerId must be provided)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerId")]
    public long? OfferId { get; set; }
    /// <summary>
    /// The offer location id (either offeLocationId or offerId must be provided)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerLocationId")]
    public long? OfferLocationId { get; set; }
    /// <summary>
    /// The distance of the offer from the user&#39;s current location (this is returned when the offer is searched)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("distance")]
    public double? Distance { get; set; }
    /// <summary>
    /// The latitude to calculate distance from the offer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// The longitude to calculate distance from the offer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// Determines whether to return offer locations for the offer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeOfferLocations")]
    public bool? IncludeOfferLocations { get; set; }
    /// <summary>
    /// Determines whether to return the retailer location info for each offer location response (includeOfferLocations must also be true for this to work)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeRetailerLocations")]
    public bool? IncludeRetailerLocations { get; set; }
    /// <summary>
    /// Determines whether to include child offers in the response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeChildOffers")]
    public bool? IncludeChildOffers { get; set; }
}
public class GetOfferListCountsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The latitude of where the search will center at
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double Latitude { get; set; }
    /// <summary>
    /// The longitude of where the search will center at
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double Longitude { get; set; }
    /// <summary>
    /// The range of the search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("searchRange")]
    public decimal? SearchRange { get; set; }
    /// <summary>
    /// The units to use for distance calculations (e.g. MILES, KILOMETERS)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("distanceUnit")]
    public string? DistanceUnit { get; set; }
}
public class GetOfferLocationRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the offer location to get
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerLocationId")]
    public long? OfferLocationId { get; set; }
    /// <summary>
    /// the UDID of the device
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("udid")]
    public string? Udid { get; set; }
}
public class GetOfferLocationsForRetailersRequest
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
    /// The keyword used to search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// Filter results for a specific retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerId")]
    public long? RetailerId { get; set; }
    /// <summary>
    /// Filter results for a specific retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationId")]
    public long? RetailerLocationId { get; set; }
    /// <summary>
    /// Filter results to only return COUPON, VOUCHER, PRODUCT, MEDIA, or EVENT offers
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerType")]
    public string? OfferType { get; set; }
    /// <summary>
    /// Filter results to only return REGULAR_OFFER, ACT_NOW, GET_THERE_NOW offer specials
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("specialOfferType")]
    public string? SpecialOfferType { get; set; }
    /// <summary>
    /// The column to sort the results on. Default is \&quot;TITLE\&quot;, which will sort the results by the offer title. Possible input values: {CREATED, UPDATED, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, RETAILER_ID,RETAILER_LOCATION_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string SortField { get; set; }
    /// <summary>
    /// The order to return the results. Default is false, which will return the results in ascending order.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool Descending { get; set; }
    /// <summary>
    /// The index into the record set to start with. Default is 0.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// The total number of records to return. Default is 20.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
    /// <summary>
    /// Determines whether to return only active results. Default is false.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool ActiveOnly { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeRetailerLocation")]
    public bool IncludeRetailerLocation { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("barcodeType")]
    public string? BarcodeType { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("barcodeEntry")]
    public string? BarcodeEntry { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("isbn")]
    public string? Isbn { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("asin")]
    public string? Asin { get; set; }
    /// <summary>
    /// Edysen device status, running, warning, or down
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceStatus")]
    public string? DeviceStatus { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("needsNotificationSent")]
    public bool? NeedsNotificationSent { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("lastNotificationSent")]
    public long? LastNotificationSent { get; set; }
}
public class GetOffersForRetailersRequest
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
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filterIds")]
    public string? FilterIds { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
    /// <summary>
    /// The keyword used to search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// the id of the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerId")]
    public long? RetailerId { get; set; }
    /// <summary>
    /// the id of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationId")]
    public long? RetailerLocationId { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("couponType")]
    public string? CouponType { get; set; }
    /// <summary>
    /// This parameter is deprecated. Use offer types. Filter results to only return COUPON, VOUCHER, PRODUCT, MEDIA, or EVENT offers
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerType")]
    public string? OfferType { get; set; }
    /// <summary>
    /// Comma separated list of offer types {COUPON, VOUCHER, PRODUCT, MEDIA, EVENT, DEVICE}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerTypes")]
    public string? OfferTypes { get; set; }
    /// <summary>
    /// Filter results to only return REGULAR_OFFER, ACT_NOW, GET_THERE_NOW offer specials
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("specialOfferType")]
    public string? SpecialOfferType { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerVisibility")]
    public string OfferVisibility { get; set; }
    /// <summary>
    /// The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string SortField { get; set; }
    /// <summary>
    /// The order to return the search results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool Descending { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_i")]
    public int? I { get; set; }
    /// <summary>
    /// The record to begin the return set on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_l")]
    public int? L { get; set; }
    /// <summary>
    /// The number of records to return
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
    /// <summary>
    /// Return only results that are currently being promoted (is activated and not expired)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("availableOnly")]
    public bool AvailableOnly { get; set; }
    /// <summary>
    /// Return only active results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool ActiveOnly { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeCategories")]
    public bool IncludeCategories { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeFilters")]
    public bool IncludeFilters { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeOfferLocations")]
    public bool IncludeOfferLocations { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("barcodeType")]
    public string? BarcodeType { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("barcodeEntry")]
    public string? BarcodeEntry { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("isbn")]
    public string? Isbn { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("asin")]
    public string? Asin { get; set; }
    /// <summary>
    /// Edysen device status
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceStatus")]
    public string? DeviceStatus { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("needsNotificationSent")]
    public bool? NeedsNotificationSent { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("lastNotificationSent")]
    public long? LastNotificationSent { get; set; }
}
public class RedeemOfferTransactionRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the device id (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the OfferTransaction ID of the transaction being redeemed
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerTransactionId")]
    public long OfferTransactionId { get; set; }
    /// <summary>
    /// the OfferLocation ID where the offer is being redeemed
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerLocationId")]
    public long? OfferLocationId { get; set; }
    /// <summary>
    /// the status to set the offer transaction to - 1 sets it to redeemable and 2 sets it to redeemed
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("status")]
    public int Status { get; set; }
}
public class SearchOfferTransactionsForRetailersRequest
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
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
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
    /// if true return redeemed transactions (status 2), if false return active transactions (status 0 or 1)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("redeemed")]
    public bool? Redeemed { get; set; }
    /// <summary>
    /// returns only reservation transactions if true
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("reservationsOnly")]
    public bool? ReservationsOnly { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("couponType")]
    public string? CouponType { get; set; }
    /// <summary>
    /// Filter results to only return COUPON, VOUCHER, PRODUCT, MEDIA, or EVENT offers
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerType")]
    public string? OfferType { get; set; }
    /// <summary>
    /// Filter results to only return REGULAR_OFFER, ACT_NOW, GET_THERE_NOW offer specials
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("specialOfferType")]
    public string? SpecialOfferType { get; set; }
    /// <summary>
    /// Filter results by accounts
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("customerAccountIds")]
    public string? CustomerAccountIds { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("redeemableStartDate")]
    public long? RedeemableStartDate { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("redeemableEndDate")]
    public long? RedeemableEndDate { get; set; }
    /// <summary>
    /// Determines what to sort the results by {CREATED, UPDATED, SEARCH_TAGS, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, CUSTOMER_ID, CUSTOMER_DISPLAY, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string SortField { get; set; }
    /// <summary>
    /// Determines whether the results are in descending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool Descending { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_i")]
    public int? I { get; set; }
    /// <summary>
    /// The start index for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_l")]
    public int? L { get; set; }
    /// <summary>
    /// The limit for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
    /// <summary>
    /// Determines whether to only return active offer transactions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool ActiveOnly { get; set; }
}
public class SearchOffersForConsumerRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The application key used to identify the application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// The device id for returning account information (i.e. offer transactions made by the user)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account id for returning account information (i.e. offer transactions made by the user)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The latitude of where the search will center at
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double Latitude { get; set; }
    /// <summary>
    /// The longitude of where the search will center at
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double Longitude { get; set; }
    /// <summary>
    /// The range of the search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("searchRange")]
    public double? SearchRange { get; set; }
    /// <summary>
    /// Does a full-text search on tags
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tags")]
    public string? Tags { get; set; }
    /// <summary>
    /// supported postal codes
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("supportedPostalCodes")]
    public string? SupportedPostalCodes { get; set; }
    /// <summary>
    /// The keyword to filter results by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// Comma separate list of category ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categories")]
    public string? Categories { get; set; }
    /// <summary>
    /// Comma separated list of filter ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filters")]
    public string? Filters { get; set; }
    /// <summary>
    /// Comma separated list of offer types {COUPON, VOUCHER, PRODUCT, MEDIA, EVENT, DEVICE}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerTypes")]
    public string? OfferTypes { get; set; }
    /// <summary>
    /// The special offer type {ALL, RESERVABLE, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("type")]
    public string? Type { get; set; }
    /// <summary>
    /// The field to sort the result set on:DISTANCE Sort the offers nearest to farthest BUSINESS_NAME Sort the offers alphabetically by location name SHUFFLE Sort the nearest offers randomly USERPREFS accountId must accompany this parameter. Gives the first X recommendations where X equals the parameter maxRecommendations
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// Return recommendations based on these offers IDs
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("recommendOfferIds")]
    public string? RecommendOfferIds { get; set; }
    /// <summary>
    /// The method to use to gather recommendations: WALLET base relevance on items in users wallets CLICKS base relevance on items users have clicked on BLENDED blend using all methods available
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("recommendationType")]
    public string RecommendationType { get; set; }
    /// <summary>
    /// This parameter is deprecated. The location id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locationId")]
    public long LocationId { get; set; }
    /// <summary>
    /// Only return offer locations for the specific retailer locations.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationIds")]
    public string? RetailerLocationIds { get; set; }
    /// <summary>
    /// Only return offer locations for the specific offer.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerId")]
    public long? OfferId { get; set; }
    /// <summary>
    /// If true include the mission response as part of the offer. Default is false.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeMission")]
    public bool? IncludeMission { get; set; }
    /// <summary>
    /// If true include the category list response as part of the offer. Default is false.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeCategories")]
    public bool? IncludeCategories { get; set; }
    /// <summary>
    /// If true include the filter list response as part of the offer. Default is false.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeFilters")]
    public bool? IncludeFilters { get; set; }
    /// <summary>
    /// If true then ignore the expired dates. Default is false.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeExpired")]
    public bool? IncludeExpired { get; set; }
    /// <summary>
    /// If true then ignore the favorite. Default is false.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeFavorite")]
    public bool? IncludeFavorite { get; set; }
    /// <summary>
    /// The start index for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// The limit for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("maxRecommendations")]
    public int MaxRecommendations { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("distanceUnit")]
    public string DistanceUnit { get; set; }
    /// <summary>
    /// This parameter is deprecated. see groupBy. If true then it only returns the offer location for an offer closest to the given lat/lon
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("closestOfferOnly")]
    public bool? ClosestOfferOnly { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("searchExpression")]
    public string? SearchExpression { get; set; }
    /// <summary>
    /// groups the results by a certain field. For example, if you want to return the closest offer location of an offer, then pass in groupBy&#x3D;OFFER_ID and sortField&#x3D;DISTANCE (to sort by distance).
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("groupBy")]
    public string? GroupBy { get; set; }
}
public class TopOfferTransactionsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The index into the record set to start with. Default is 0.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// The total number of record to return. Default id 20.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}
public class UpdateOfferRequest
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
    /// The account used to perform the update, must have rights to edit the offer (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The offer to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerId")]
    public long OfferId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parentOfferId")]
    public long? ParentOfferId { get; set; }
    /// <summary>
    /// If true return all the offer locations associated with the offer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeOfferLocations")]
    public bool IncludeOfferLocations { get; set; }
    /// <summary>
    /// Comma separated list of retailer location ids. This will assign the offer to these retailer locations.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationIds")]
    public string? RetailerLocationIds { get; set; }
    /// <summary>
    /// A list of json data that has offer location specific values.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerLocations")]
    public string? OfferLocations { get; set; }
    /// <summary>
    /// Custom string field for doing full-text searches
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tags")]
    public string? Tags { get; set; }
    /// <summary>
    /// The title (255 char limit)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string? Title { get; set; }
    /// <summary>
    /// The sub title (255 char limit)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("subTitle")]
    public string? SubTitle { get; set; }
    /// <summary>
    /// The details
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("details")]
    public string? Details { get; set; }
    /// <summary>
    /// A string for custom details (255 char limit)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("subDetails")]
    public string? SubDetails { get; set; }
    /// <summary>
    /// The fine print
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("finePrint")]
    public string? FinePrint { get; set; }
    /// <summary>
    /// The bar code type {NONE, UPC, CODE_128, QR, CUSTOM_MEDIA}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("barcodeType")]
    public string? BarcodeType { get; set; }
    /// <summary>
    /// The bar code entry string
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("barcodeEntry")]
    public string? BarcodeEntry { get; set; }
    /// <summary>
    /// An external identifier. What the identifier will be used for and how it is formatted is up to the frontend developer.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalRedeemOptions")]
    public string? ExternalRedeemOptions { get; set; }
    /// <summary>
    /// The clickUrl of the offer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalUrl")]
    public string? ExternalUrl { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("externalId")]
    public string? ExternalId { get; set; }
    /// <summary>
    /// The type of ticket to reward, null means default type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ticketsRewardType")]
    public string? TicketsRewardType { get; set; }
    /// <summary>
    /// Determines how many tickets are awarded
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ticketsReward")]
    public long? TicketsReward { get; set; }
    /// <summary>
    /// The date of when the offer will be visible to consumers
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activated")]
    public long? Activated { get; set; }
    /// <summary>
    /// The date of when the offer expires
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("expires")]
    public long? Expires { get; set; }
    /// <summary>
    /// Overrides the expiration date so that the offer does not expire
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("noExpiration")]
    public bool? NoExpiration { get; set; }
    /// <summary>
    /// The limit of how many times the offer can be used by consumers
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("availableLimit")]
    public int? AvailableLimit { get; set; }
    /// <summary>
    /// The limit of how many times a user can used the same offer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("availableLimitPerUser")]
    public int? AvailableLimitPerUser { get; set; }
    /// <summary>
    /// The limit of how many times the offer can be added to consumer wallets
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("addedLimit")]
    public int? AddedLimit { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("viewLimit")]
    public int? ViewLimit { get; set; }
    /// <summary>
    /// The maximum number of times the offer can be printed
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("maxPrints")]
    public int? MaxPrints { get; set; }
    /// <summary>
    /// the type of ticket needed to buy the offer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ticketPriceType")]
    public string? TicketPriceType { get; set; }
    /// <summary>
    /// The cost of the offer in tickets
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ticketPrice")]
    public long? TicketPrice { get; set; }
    /// <summary>
    /// The retail/full price cost of the offer in real currency
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("fullPrice")]
    public double? FullPrice { get; set; }
    /// <summary>
    /// The cost of the offer at a discounted price (what the consumer pays)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("discountPrice")]
    public double? DiscountPrice { get; set; }
    /// <summary>
    /// show remaining offers available
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("showRemaining")]
    public bool? ShowRemaining { get; set; }
    /// <summary>
    /// show how many offers have been redeemed
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("showRedeemed")]
    public bool? ShowRedeemed { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("replaced")]
    public bool? Replaced { get; set; }
    /// <summary>
    /// whether the offer is featured or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("featured")]
    public bool? Featured { get; set; }
    /// <summary>
    /// The offer type {VOUCHER, COUPON, PRODUCT, MEDIA, EVENT}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerType")]
    public string? OfferType { get; set; }
    /// <summary>
    /// The special offer type {ALL, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("specialOfferType")]
    public string? SpecialOfferType { get; set; }
    /// <summary>
    /// The offer visibility {PUBLIC, REWARDABLE, TRIGGERABLE}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerVisibility")]
    public string? OfferVisibility { get; set; }
    /// <summary>
    /// Comma separated list of category ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// Comma separated list of filter ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filterIds")]
    public string? FilterIds { get; set; }
    /// <summary>
    /// Sets the active flag
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// The id of the barcode asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("barcodeAssetId")]
    public long? BarcodeAssetId { get; set; }
    /// <summary>
    /// The id of the an offer asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("imageAssetId")]
    public long? ImageAssetId { get; set; }
    /// <summary>
    /// The id of the an offer asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("imageAssetId1")]
    public long? ImageAssetId1 { get; set; }
    /// <summary>
    /// The id of the an offer asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("imageAssetId2")]
    public long? ImageAssetId2 { get; set; }
    /// <summary>
    /// The id of the an offer asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("imageAssetId3")]
    public long? ImageAssetId3 { get; set; }
    /// <summary>
    /// The id of the an offer asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("imageAssetId4")]
    public long? ImageAssetId4 { get; set; }
    /// <summary>
    /// The id of the an offer asset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("imageAssetId5")]
    public long? ImageAssetId5 { get; set; }
    /// <summary>
    /// The maker of the item.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("publisher")]
    public string? Publisher { get; set; }
    /// <summary>
    /// The redeemable start date/time of the offer.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("redeemableStart")]
    public long? RedeemableStart { get; set; }
    /// <summary>
    /// The redeemable start date/time of the offer.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("redeemableEnd")]
    public long? RedeemableEnd { get; set; }
    /// <summary>
    /// The brand. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("brand")]
    public string? Brand { get; set; }
    /// <summary>
    /// The product type. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("productType")]
    public string? ProductType { get; set; }
    /// <summary>
    /// The condition. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("conditionType")]
    public string? ConditionType { get; set; }
    /// <summary>
    /// The ISBN id. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("isbn")]
    public string? Isbn { get; set; }
    /// <summary>
    /// The ASIN id. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("asin")]
    public string? Asin { get; set; }
    /// <summary>
    /// The list of catelog numbers, comma seperated. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("catalogNumbers")]
    public string? CatalogNumbers { get; set; }
    /// <summary>
    /// The department name. The OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("department")]
    public string? Department { get; set; }
    /// <summary>
    /// The list of features, comma seperated. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("features")]
    public string? Features { get; set; }
    /// <summary>
    /// The MAP price. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("minimumPrice")]
    public double? MinimumPrice { get; set; }
    /// <summary>
    /// The width of the item. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("width")]
    public double? Width { get; set; }
    /// <summary>
    /// The height of the item. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("height")]
    public double? Height { get; set; }
    /// <summary>
    /// The depth of the item. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("depth")]
    public double? Depth { get; set; }
    /// <summary>
    /// The weight of the item. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("weight")]
    public double? Weight { get; set; }
    /// <summary>
    /// The unit of measurement. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("unit")]
    public string? Unit { get; set; }
    /// <summary>
    /// The studio name. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("studio")]
    public string? Studio { get; set; }
    /// <summary>
    /// The parental control rating. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parentalRating")]
    public string? ParentalRating { get; set; }
    /// <summary>
    /// The date published. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("publishDate")]
    public long? PublishDate { get; set; }
    /// <summary>
    /// The date available. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("availabilityDate")]
    public long? AvailabilityDate { get; set; }
    /// <summary>
    /// The size Id. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sizeId")]
    public long? SizeId { get; set; }
    /// <summary>
    /// The ID of the event listing
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("listingId")]
    public long? ListingId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("mediaType")]
    public string? MediaType { get; set; }
    /// <summary>
    /// The total playing time of the media item. OfferType MEDIA only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("duration")]
    public int? Duration { get; set; }
    /// <summary>
    /// The created/author of the media item. OfferType MEDIA only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("author")]
    public string? Author { get; set; }
    /// <summary>
    /// The date/time of when the media item was originally released. OfferType MEDIA only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("releaseDate")]
    public long? ReleaseDate { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("collectionIds")]
    public string? CollectionIds { get; set; }
    /// <summary>
    /// The reboot hour time ranging from 0 to 23
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("rebootTimeHour")]
    public int? RebootTimeHour { get; set; }
    /// <summary>
    /// The reboot minute time ranging from 0 to 59
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("rebootTimeMinute")]
    public int? RebootTimeMinute { get; set; }
    /// <summary>
    /// If the device is idle for idleTimeoutInSecond then the device should timeout
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("idleTimeoutInSecond")]
    public int? IdleTimeoutInSecond { get; set; }
    /// <summary>
    /// The serial number on the device
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("serialNumber")]
    public string? SerialNumber { get; set; }
    /// <summary>
    /// The unique device id for the device
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("udid")]
    public string? Udid { get; set; }
    /// <summary>
    /// The type of the device, for example: \&quot;Kiosk\&quot;, \&quot;Beacon\&quot;.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceType")]
    public string? DeviceType { get; set; }
    /// <summary>
    /// RSSI reading at 1 meter from device (-10 to -140)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("devicePower")]
    public double? DevicePower { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceInterference")]
    public double? DeviceInterference { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("availability")]
    public string? Availability { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("availabilitySummary")]
    public string? AvailabilitySummary { get; set; }
}
public class UpdateOfferStatusRequest
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
    /// The account used to perform the activation, must have rights to edit the offer.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// Comma separated list of offer ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerIds")]
    public string OfferIds { get; set; }
    /// <summary>
    /// Determines whether to make the offer active as well
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool Active { get; set; }
}


