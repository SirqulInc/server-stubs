
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateRatingRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The unique device identifier that made the request (either deviceId or accountId must be used)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The unique accountId that made the request (either deviceId or accountId must be used)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The ratable object type {RETAILER_LOCATION}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ratableType")]
    public string RatableType { get; set; }
    /// <summary>
    /// The id of the ratable object
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ratableId")]
    public long RatableId { get; set; }
    /// <summary>
    /// The integer value of 0-100
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ratingValue")]
    public int RatingValue { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryId")]
    public long? CategoryId { get; set; }
    /// <summary>
    /// A subject title for the user rating (limited to 255 characters)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("display")]
    public string? Display { get; set; }
    /// <summary>
    /// The description of the rating
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// The description of the location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locationDescription")]
    public string? LocationDescription { get; set; }
    /// <summary>
    /// The current location of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// The current location of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
}
public class DeleteRatingRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The unique device identifier that made the request (either deviceId or accountId must be used)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The unique accountId that made the request (either deviceId or accountId must be used)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The ID of the rating to delete
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ratingId")]
    public long RatingId { get; set; }
}
public class SearchLocationRatingIndexesRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Comma separated list of category ids to filter the results by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// The keyword used to search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// The type of location to filter the results by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locationType")]
    public string? LocationType { get; set; }
    /// <summary>
    /// The column to sort the search on {ID, CREATED, UPDATED, ACTIVE, RATABLE_TYPE, RATABLE_ID, RATABLE_DISPLAY, CATEGORY_ID, CATEGORY_NAME, CATEGORY_SHORT_NAME, CATEGORY_DISPLAY, COUNT, SUMMATION, AVERAGE, VALUE}
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
    /// The search radius in kilometers to filter results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("searchRange")]
    public double? SearchRange { get; set; }
    /// <summary>
    /// The current location of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// The current location of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// Determines whether to return the overall rating record instead
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnOverallRating")]
    public bool? ReturnOverallRating { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("distanceUnit")]
    public string? DistanceUnit { get; set; }
    /// <summary>
    /// whether to return the retailer or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRetailer")]
    public bool? ReturnRetailer { get; set; }
    /// <summary>
    /// whether to return the assets or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnAssets")]
    public bool? ReturnAssets { get; set; }
    /// <summary>
    /// whether to return the offers or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnOffers")]
    public bool? ReturnOffers { get; set; }
    /// <summary>
    /// whether to return the categories or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnCategories")]
    public bool? ReturnCategories { get; set; }
    /// <summary>
    /// whether to return the filters or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnFilters")]
    public bool? ReturnFilters { get; set; }
}
public class SearchRatingIndexesRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Filter results by a ratable type {RETAILER_LOCATION}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ratableType")]
    public string RatableType { get; set; }
    /// <summary>
    /// Comma separated list of ratable ids to filter the resuts by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ratableIds")]
    public string? RatableIds { get; set; }
    /// <summary>
    /// Comma separated list of category ids to filter the results by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("secondaryType")]
    public string? SecondaryType { get; set; }
    /// <summary>
    /// The keyword used to search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// The column to sort the search on {ID, CREATED, UPDATED, ACTIVE, RATABLE_TYPE, RATABLE_ID, RATABLE_DISPLAY, CATEGORY_ID, CATEGORY_NAME, CATEGORY_SHORT_NAME, CATEGORY_DISPLAY, COUNT, SUMMATION, AVERAGE, VALUE}
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
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// Determines whether to return the ratable object in the response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRatable")]
    public bool? ReturnRatable { get; set; }
    /// <summary>
    /// Determines whether to return the overall rating record instead
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnOverallRating")]
    public bool? ReturnOverallRating { get; set; }
}
public class SearchRatingsRequest
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
    /// Filter results for a particular account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filterAccountId")]
    public long? FilterAccountId { get; set; }
    /// <summary>
    /// The ratable object type {RETAILER_LOCATION}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ratableType")]
    public string? RatableType { get; set; }
    /// <summary>
    /// The id of the ratable object
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ratableId")]
    public long? RatableId { get; set; }
    /// <summary>
    /// Comma separated list of category ids to filter the results by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryIds")]
    public string? CategoryIds { get; set; }
    /// <summary>
    /// The keyword used to search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// The column to sort the search on {ID, CREATED, UPDATED, ACTIVE, OWNER_DISPLAY, RATABLE_TYPE, RATABLE_ID, RATABLE_DISPLAY, CATEGORY_ID, CATEGORY_NAME, CATEGORY_SHORT_NAME, CATEGORY_DISPLAY, VALUE}
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
}
public class UpdateRatingRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The unique device identifier that made the request (either deviceId or accountId must be used)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The unique accountId that made the request (either deviceId or accountId must be used)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The id of the rating (Note: this is not the ratable object id)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ratingId")]
    public long RatingId { get; set; }
    /// <summary>
    /// The rating value to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ratingValue")]
    public int? RatingValue { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("categoryId")]
    public long? CategoryId { get; set; }
    /// <summary>
    /// A subject title for the user rating (limited to 255 characters)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("display")]
    public string? Display { get; set; }
    /// <summary>
    /// The description of the rating
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// The description of the location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locationDescription")]
    public string? LocationDescription { get; set; }
    /// <summary>
    /// The current location of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// The current location of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
}


