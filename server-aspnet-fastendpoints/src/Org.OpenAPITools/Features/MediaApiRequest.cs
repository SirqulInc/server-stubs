
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateMediaRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Comma separated list of retailer location ids. This will assign the offer to these retailer locations.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationIds")]
    public string? RetailerLocationIds { get; set; }
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
    /// The details of the media
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("details")]
    public string? Details { get; set; }
    /// <summary>
    /// A string for custom details (255 char limit)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("subDetails")]
    public string? SubDetails { get; set; }
    /// <summary>
    /// The fine print of the media
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
    /// show how many of the media is remaining (if there is a limit)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("showRemaining")]
    public bool? ShowRemaining { get; set; }
    /// <summary>
    /// show how many of the media has been redeemed
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("showRedeemed")]
    public bool? ShowRedeemed { get; set; }
    /// <summary>
    /// if the media has been replaced
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("replaced")]
    public bool? Replaced { get; set; }
    /// <summary>
    /// if the media should be featured or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("featured")]
    public bool? Featured { get; set; }
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
    /// The condition type of the media
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("conditionType")]
    public string? ConditionType { get; set; }
    /// <summary>
    /// The ISBN id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("isbn")]
    public string? Isbn { get; set; }
    /// <summary>
    /// The ASIN id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("asin")]
    public string? Asin { get; set; }
    /// <summary>
    /// The list of catelog numbers, comma seperated
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("catalogNumbers")]
    public string? CatalogNumbers { get; set; }
    /// <summary>
    /// The parental control rating
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parentalRating")]
    public string? ParentalRating { get; set; }
    /// <summary>
    /// The date the media is available to use
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("availabilityDate")]
    public long? AvailabilityDate { get; set; }
    /// <summary>
    /// the media type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("mediaType")]
    public string? MediaType { get; set; }
    /// <summary>
    /// The total playing time of the media item
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("duration")]
    public int? Duration { get; set; }
    /// <summary>
    /// The created/author of the media item
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("author")]
    public string? Author { get; set; }
    /// <summary>
    /// The date/time of when the media item was originally released
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("releaseDate")]
    public long? ReleaseDate { get; set; }
    /// <summary>
    /// the IDs of the collections this media should be assigned to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("collectionIds")]
    public string? CollectionIds { get; set; }
    /// <summary>
    /// ability to assign if this media should active or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("availability")]
    public string? Availability { get; set; }
    /// <summary>
    /// ability to assign when the media expires
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("availabilitySummary")]
    public string? AvailabilitySummary { get; set; }
}
public class DeleteMediaRequest
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
    /// the ID of the media to delete
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("mediaId")]
    public long MediaId { get; set; }
}
public class GetMediaRequest
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
    /// the id of the media to get
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("mediaId")]
    public long MediaId { get; set; }
}
public class SearchMediaRequest
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
    public bool ActiveOnly { get; set; }
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
    /// The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY, AVAILABILITY_DATE, RELEASE_DATE
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string SortField { get; set; }
    /// <summary>
    /// The order to return the search results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool Descending { get; set; }
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
public class UpdateMediaRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account used to perform the update, must have rights to edit the offer (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("mediaId")]
    public long MediaId { get; set; }
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
    /// The show remaining
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("showRemaining")]
    public bool? ShowRemaining { get; set; }
    /// <summary>
    /// The show redeemed
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("showRedeemed")]
    public bool? ShowRedeemed { get; set; }
    /// <summary>
    /// The replaced
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("replaced")]
    public bool? Replaced { get; set; }
    /// <summary>
    /// The featured
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("featured")]
    public bool? Featured { get; set; }
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
    /// The date available. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("availabilityDate")]
    public long? AvailabilityDate { get; set; }
    /// <summary>
    /// The parental control rating. OfferType PRODUCT only.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parentalRating")]
    public string? ParentalRating { get; set; }
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


