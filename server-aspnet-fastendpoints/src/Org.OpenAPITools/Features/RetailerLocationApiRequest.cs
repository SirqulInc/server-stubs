
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateRetailerLocationConsumerRequest
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
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// The name of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string Name { get; set; }
    /// <summary>
    /// The street address of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("streetAddress")]
    public string? StreetAddress { get; set; }
    /// <summary>
    /// Additional address information (such as a suite number, floor number, building name, or PO Box)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("streetAddress2")]
    public string? StreetAddress2 { get; set; }
    /// <summary>
    /// The city of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("city")]
    public string? City { get; set; }
    /// <summary>
    /// The state of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("state")]
    public string? State { get; set; }
    /// <summary>
    /// The postal code of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("postalCode")]
    public string? PostalCode { get; set; }
    /// <summary>
    /// the country of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("country")]
    public string? Country { get; set; }
    /// <summary>
    /// The business phone
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("businessPhone")]
    public string? BusinessPhone { get; set; }
    /// <summary>
    /// The business phone extension
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("businessPhoneExt")]
    public string? BusinessPhoneExt { get; set; }
    /// <summary>
    /// The website of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("website")]
    public string? Website { get; set; }
    /// <summary>
    /// The email of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("email")]
    public string? Email { get; set; }
    /// <summary>
    /// A brief description about the retailer location (255 character limit)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("detailsHeader")]
    public string? DetailsHeader { get; set; }
    /// <summary>
    /// A detailed description about the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("detailsBody")]
    public string? DetailsBody { get; set; }
    /// <summary>
    /// The hours of operation
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hours")]
    public string? Hours { get; set; }
    /// <summary>
    /// Custom string field for doing full-text searches
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tags")]
    public string? Tags { get; set; }
    /// <summary>
    /// The retailer location logo asset id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("logoAssetId")]
    public long? LogoAssetId { get; set; }
    /// <summary>
    /// An asset id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("picture1AssetId")]
    public long? Picture1AssetId { get; set; }
    /// <summary>
    /// An asset id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("picture2AssetId")]
    public long? Picture2AssetId { get; set; }
    /// <summary>
    /// Comma separated list of category IDs used to filter retailer locations by categories
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// Comma separated list of filter IDs used to filter retailer locations
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filterIds")]
    public string? FilterIds { get; set; }
    /// <summary>
    /// External custom client defined data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
    /// <summary>
    /// Whether the location is public
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("publicLocation")]
    public bool? PublicLocation { get; set; }
    /// <summary>
    /// whether the retailer location created should be active or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// External custom type identifier
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locationType")]
    public string? LocationType { get; set; }
    /// <summary>
    /// The latitude to center the search on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// The longitude to center the search on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
}
public class CreateRetailerLocationsRequest
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
    /// The ID of the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerId")]
    public long RetailerId { get; set; }
    /// <summary>
    /// The name of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string Name { get; set; }
    /// <summary>
    /// The street address of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("streetAddress")]
    public string StreetAddress { get; set; }
    /// <summary>
    /// Additional address information (such as a suite number, floor number, building name, or PO Box)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("streetAddress2")]
    public string? StreetAddress2 { get; set; }
    /// <summary>
    /// The city of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("city")]
    public string City { get; set; }
    /// <summary>
    /// The state of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("state")]
    public string State { get; set; }
    /// <summary>
    /// The postal code of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("postalCode")]
    public string PostalCode { get; set; }
    /// <summary>
    /// the country of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("country")]
    public string? Country { get; set; }
    /// <summary>
    /// The business phone number of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("businessPhone")]
    public string? BusinessPhone { get; set; }
    /// <summary>
    /// The business phone extension
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("businessPhoneExt")]
    public string? BusinessPhoneExt { get; set; }
    /// <summary>
    /// The website of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("website")]
    public string? Website { get; set; }
    /// <summary>
    /// The email of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("email")]
    public string? Email { get; set; }
    /// <summary>
    /// An internal identifier used by the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("internalId")]
    public string? InternalId { get; set; }
    /// <summary>
    /// A brief description about the retailer location (255 character limit)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("detailsHeader")]
    public string? DetailsHeader { get; set; }
    /// <summary>
    /// A detailed description about the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("detailsBody")]
    public string? DetailsBody { get; set; }
    /// <summary>
    /// The hours of operation
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hours")]
    public string? Hours { get; set; }
    /// <summary>
    /// The retailer location logo sent as a multipart binary file (you can optionally use logoAssetId if the asset has already been uploaded before)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("logo")]
    public System.IO.Stream? Logo { get; set; }
    /// <summary>
    /// The retailer location logo asset id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("logoAssetId")]
    public long? LogoAssetId { get; set; }
    /// <summary>
    /// Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture1AssetId if the asset has already been uploaded before)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("picture1")]
    public System.IO.Stream? Picture1 { get; set; }
    /// <summary>
    /// An asset id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("picture1AssetId")]
    public long? Picture1AssetId { get; set; }
    /// <summary>
    /// Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture2AssetId if the asset has already been uploaded before)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("picture2")]
    public System.IO.Stream? Picture2 { get; set; }
    /// <summary>
    /// An asset id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("picture2AssetId")]
    public long? Picture2AssetId { get; set; }
    /// <summary>
    /// Comma separated list of category IDs used to filter retailer locations by categories
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// Comma separated list of filter IDs used to filter retailer locations
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filterIds")]
    public string? FilterIds { get; set; }
    /// <summary>
    /// the latitude of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// the longitude of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("building")]
    public string? Building { get; set; }
    /// <summary>
    /// the ID of the Google Place that this retailer location is assigned to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("googlePlaceId")]
    public string? GooglePlaceId { get; set; }
    /// <summary>
    /// the Yelp ID that this retailer location is assigned to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("yelpId")]
    public string? YelpId { get; set; }
    /// <summary>
    /// whether the retailer location should be active or inactive
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// Sets whether the location is public or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("publicLocation")]
    public bool? PublicLocation { get; set; }
    /// <summary>
    /// External custom type identifier
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locationType")]
    public string? LocationType { get; set; }
    /// <summary>
    /// Comma separated list of audience IDs used to assign audiences to the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceIds")]
    public string? AudienceIds { get; set; }
    /// <summary>
    /// Comma separated list of audience IDs to add to the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceIdsToAdd")]
    public string? AudienceIdsToAdd { get; set; }
    /// <summary>
    /// Comma separated list of audience IDs to remove from the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceIdsToRemove")]
    public string? AudienceIdsToRemove { get; set; }
    /// <summary>
    /// The format of the returned response {JSON // default , HTML // for Dojo support when uploading assets}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("responseFormat")]
    public string? ResponseFormat { get; set; }
    /// <summary>
    /// Comma separated list of response includes (e.g. RETAILER,ASSETS,OFFERS,CATEGORIES,FILTERS,AUDIENCES,QRCODE)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("responseIncludes")]
    public string? ResponseIncludes { get; set; }
}
public class DeleteRetailerLocationRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the device id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the id of the retailer location to delete
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationId")]
    public long? RetailerLocationId { get; set; }
}
public class GetRetailerLocationRequest
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
    /// The ID of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationId")]
    public long RetailerLocationId { get; set; }
    /// <summary>
    /// the unique token of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationToken")]
    public string? RetailerLocationToken { get; set; }
}
public class GetRetailerLocationConsumerRequest
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
    /// The retailer location id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationId")]
    public long RetailerLocationId { get; set; }
}
public class IndexedRetailerLocationDistanceSearchRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The latitude to center the search on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double Latitude { get; set; }
    /// <summary>
    /// The longitude to center the search on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double Longitude { get; set; }
    /// <summary>
    /// The account id of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// Used to return results using this address as the center
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("address")]
    public string? Address { get; set; }
    /// <summary>
    /// The search range in the distanceUnit specified; default is MILES.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("searchRange")]
    public double SearchRange { get; set; }
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
    /// boolean to indicate whether to include retailer locations that have no offers
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hasOffers")]
    public bool? HasOffers { get; set; }
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
    /// Comma separated list of audience ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audiences")]
    public string? Audiences { get; set; }
    /// <summary>
    /// Comma separated list of retailer ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerIds")]
    public string? RetailerIds { get; set; }
    /// <summary>
    /// Comma separated list of retailer location ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationIds")]
    public string? RetailerLocationIds { get; set; }
    /// <summary>
    /// Does a full-text search on tags
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tags")]
    public string? Tags { get; set; }
    /// <summary>
    /// Location type filter
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locationType")]
    public string? LocationType { get; set; }
    /// <summary>
    /// The field to sort the result set on. Possible values include: DISTANCE, RETAILER_NAME, RETAILER_LOCATION_NAME
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// Determines whether the sorted list is in descending or ascending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
    /// <summary>
    /// Search by keyword
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// Determines the operator used when there are multiple words in the &#39;keyword&#39; parameter
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keywordOperator")]
    public string? KeywordOperator { get; set; }
    /// <summary>
    /// Search expression to further refine results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("searchExpression")]
    public string? SearchExpression { get; set; }
    /// <summary>
    /// Unit of distance
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("distanceUnit")]
    public string? DistanceUnit { get; set; }
    /// <summary>
    /// (deprecated) return favorited flag
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnFavorited")]
    public bool? ReturnFavorited { get; set; }
    /// <summary>
    /// Return retailer info
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRetailer")]
    public bool? ReturnRetailer { get; set; }
    /// <summary>
    /// Return assets
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnAssets")]
    public bool? ReturnAssets { get; set; }
    /// <summary>
    /// Return offers
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnOffers")]
    public bool? ReturnOffers { get; set; }
    /// <summary>
    /// Return categories
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnCategories")]
    public bool? ReturnCategories { get; set; }
    /// <summary>
    /// Return filters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnFilters")]
    public bool? ReturnFilters { get; set; }
    /// <summary>
    /// Return audiences
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnAudiences")]
    public bool? ReturnAudiences { get; set; }
    /// <summary>
    /// Return QR code info
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnQrCode")]
    public bool? ReturnQrCode { get; set; }
    /// <summary>
    /// Return external category data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnExternalCategoryData")]
    public bool? ReturnExternalCategoryData { get; set; }
    /// <summary>
    /// Include favorites in response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeFavorite")]
    public bool? IncludeFavorite { get; set; }
    /// <summary>
    /// Include liked flag in response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeLiked")]
    public bool? IncludeLiked { get; set; }
    /// <summary>
    /// Include rating info in response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeRating")]
    public bool? IncludeRating { get; set; }
}
public class IndexedRetailerLocationSearchRequest
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
    /// boolean to indicate whether to include retailer locations that have no offers
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hasOffers")]
    public bool? HasOffers { get; set; }
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
    /// Comma separated list of audience ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audiences")]
    public string? Audiences { get; set; }
    /// <summary>
    /// Comma separated list of retailer ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerIds")]
    public string? RetailerIds { get; set; }
    /// <summary>
    /// Comma separated list of retailer location ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationIds")]
    public string? RetailerLocationIds { get; set; }
    /// <summary>
    /// Does a full-text search on tags
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tags")]
    public string? Tags { get; set; }
    /// <summary>
    /// Location type filter
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locationType")]
    public string? LocationType { get; set; }
    /// <summary>
    /// The field to sort the result set on. Possible values include: RETAILER_NAME, RETAILER_LOCATION_NAME
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// Determines whether the sorted list is in descending or ascending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
    /// <summary>
    /// Search by keyword
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// Determines the operator used when there are multiple words in the &#39;keyword&#39; parameter
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keywordOperator")]
    public string? KeywordOperator { get; set; }
    /// <summary>
    /// Search expression to further refine results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("searchExpression")]
    public string? SearchExpression { get; set; }
    /// <summary>
    /// Return retailer info
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRetailer")]
    public bool? ReturnRetailer { get; set; }
    /// <summary>
    /// Return assets
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnAssets")]
    public bool? ReturnAssets { get; set; }
    /// <summary>
    /// Return offers
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnOffers")]
    public bool? ReturnOffers { get; set; }
    /// <summary>
    /// Return categories
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnCategories")]
    public bool? ReturnCategories { get; set; }
    /// <summary>
    /// Return filters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnFilters")]
    public bool? ReturnFilters { get; set; }
    /// <summary>
    /// Return audiences
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnAudiences")]
    public bool? ReturnAudiences { get; set; }
    /// <summary>
    /// Return QR code info
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnQrCode")]
    public bool? ReturnQrCode { get; set; }
    /// <summary>
    /// Return external category data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnExternalCategoryData")]
    public bool? ReturnExternalCategoryData { get; set; }
    /// <summary>
    /// Include favorites in response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeFavorite")]
    public bool? IncludeFavorite { get; set; }
    /// <summary>
    /// Include liked flag in response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeLiked")]
    public bool? IncludeLiked { get; set; }
    /// <summary>
    /// Include rating info in response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeRating")]
    public bool? IncludeRating { get; set; }
}
public class SearchRetailerLocationsRequest
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
    /// The keyword used to search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// Comma separated list of retailer IDs which when passed in will filter the results to only return these retailers.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerIds")]
    public string? RetailerIds { get; set; }
    /// <summary>
    /// Comma separated list of retailer location IDs
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationIds")]
    public string? RetailerLocationIds { get; set; }
    /// <summary>
    /// Location type filter
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locationType")]
    public string? LocationType { get; set; }
    /// <summary>
    /// The column to sort the search on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// The order to return the search results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_i")]
    public int? I { get; set; }
    /// <summary>
    /// The record to begin the return set on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_l")]
    public int? L { get; set; }
    /// <summary>
    /// The number of records to return
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// Whether to include public locations in the results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("showPublicLocations")]
    public bool? ShowPublicLocations { get; set; }
    /// <summary>
    /// Return only active results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool? ActiveOnly { get; set; }
    /// <summary>
    /// Return retailer info
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRetailer")]
    public bool? ReturnRetailer { get; set; }
    /// <summary>
    /// Return assets
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnAssets")]
    public bool? ReturnAssets { get; set; }
    /// <summary>
    /// Return offers
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnOffers")]
    public bool? ReturnOffers { get; set; }
    /// <summary>
    /// Return categories
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnCategories")]
    public bool? ReturnCategories { get; set; }
    /// <summary>
    /// Return filters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnFilters")]
    public bool? ReturnFilters { get; set; }
    /// <summary>
    /// Return audiences
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnAudiences")]
    public bool? ReturnAudiences { get; set; }
    /// <summary>
    /// Return QR code info
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnQrCode")]
    public bool? ReturnQrCode { get; set; }
    /// <summary>
    /// Include favorites in response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeFavorite")]
    public bool? IncludeFavorite { get; set; }
    /// <summary>
    /// Include liked flag in response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeLiked")]
    public bool? IncludeLiked { get; set; }
    /// <summary>
    /// Include rating info in response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeRating")]
    public bool? IncludeRating { get; set; }
}
public class UpdateRetailerLocationsRequest
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
    /// The ID of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerLocationId")]
    public long RetailerLocationId { get; set; }
    /// <summary>
    /// The name of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string? Name { get; set; }
    /// <summary>
    /// The street address of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("streetAddress")]
    public string? StreetAddress { get; set; }
    /// <summary>
    /// Additional address information (such as a suite number, floor number, building name, or PO Box)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("streetAddress2")]
    public string? StreetAddress2 { get; set; }
    /// <summary>
    /// The city of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("city")]
    public string? City { get; set; }
    /// <summary>
    /// The state of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("state")]
    public string? State { get; set; }
    /// <summary>
    /// The postal code of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("postalCode")]
    public string? PostalCode { get; set; }
    /// <summary>
    /// the country of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("country")]
    public string? Country { get; set; }
    /// <summary>
    /// The business phone number of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("businessPhone")]
    public string? BusinessPhone { get; set; }
    /// <summary>
    /// The business phone extension of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("businessPhoneExt")]
    public string? BusinessPhoneExt { get; set; }
    /// <summary>
    /// The website of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("website")]
    public string? Website { get; set; }
    /// <summary>
    /// The email of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("email")]
    public string? Email { get; set; }
    /// <summary>
    /// An internal identifier used by the retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("internalId")]
    public string? InternalId { get; set; }
    /// <summary>
    /// A brief description about the retailer location (255 character limit)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("detailsHeader")]
    public string? DetailsHeader { get; set; }
    /// <summary>
    /// A detailed description about the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("detailsBody")]
    public string? DetailsBody { get; set; }
    /// <summary>
    /// The hours of operation
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hours")]
    public string? Hours { get; set; }
    /// <summary>
    /// The retailer location logo sent as a multipart binary file (you can optionally use logoAssetId if the asset has already been uploaded before)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("logo")]
    public System.IO.Stream? Logo { get; set; }
    /// <summary>
    /// The retailer location logo asset id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("logoAssetId")]
    public long? LogoAssetId { get; set; }
    /// <summary>
    /// Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture1AssetId if the asset has already been uploaded before)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("picture1")]
    public System.IO.Stream? Picture1 { get; set; }
    /// <summary>
    /// An asset id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("picture1AssetId")]
    public long? Picture1AssetId { get; set; }
    /// <summary>
    /// Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture2AssetId if the asset has already been uploaded before)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("picture2")]
    public System.IO.Stream? Picture2 { get; set; }
    /// <summary>
    /// An asset id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("picture2AssetId")]
    public long? Picture2AssetId { get; set; }
    /// <summary>
    /// Comma separated list of category IDs used to filter retailer locations by categories
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// Comma separated list of filter IDs used to filter retailer locations
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filterIds")]
    public string? FilterIds { get; set; }
    /// <summary>
    /// the latituede of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// the longitude of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("building")]
    public string? Building { get; set; }
    /// <summary>
    /// the Google Place ID that the retailer location is associated with
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("googlePlaceId")]
    public string? GooglePlaceId { get; set; }
    /// <summary>
    /// the Yelp ID that the retailer location is associated with
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("yelpId")]
    public string? YelpId { get; set; }
    /// <summary>
    /// External custom client defined data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
    /// <summary>
    /// Specifies which payment provider Sirqul will use when making payments
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("paymentProvider")]
    public string? PaymentProvider { get; set; }
    /// <summary>
    /// Sets whether the retailer is active or inactive (hidden from consumers)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// Sets whether the location is public or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("publicLocation")]
    public bool? PublicLocation { get; set; }
    /// <summary>
    /// External custom type identifier
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locationType")]
    public string? LocationType { get; set; }
    /// <summary>
    /// Comma separated list of audience IDs used to assign audiences to the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceIds")]
    public string? AudienceIds { get; set; }
    /// <summary>
    /// Comma separated list of audience IDs to add to the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceIdsToAdd")]
    public string? AudienceIdsToAdd { get; set; }
    /// <summary>
    /// Comma separated list of audience IDs to remove from the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceIdsToRemove")]
    public string? AudienceIdsToRemove { get; set; }
    /// <summary>
    /// The format of the returned response {JSON // default , HTML // for Dojo support when uploading assets}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("responseFormat")]
    public string? ResponseFormat { get; set; }
    /// <summary>
    /// Custom string field for doing full-text searches
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tags")]
    public string? Tags { get; set; }
}


