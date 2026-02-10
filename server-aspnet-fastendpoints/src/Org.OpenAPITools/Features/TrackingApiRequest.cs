
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class BatchSaveTrackingRequest
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
    /// JSON array of tracking legs &#x60;&#x60;&#x60;json [   \&quot;distance\&quot;: \&quot;0.08\&quot;,   \&quot;duration\&quot;: \&quot;10000\&quot;,   \&quot;startLatitude\&quot;: \&quot;47.614603\&quot;,   \&quot;startLongitude\&quot;: \&quot;-122.350518\&quot;,   \&quot;endLatitude\&quot;: \&quot;47.614384\&quot;,   \&quot;endLongitude\&quot;: \&quot;-122.349161\&quot;,   \&quot;startDate\&quot;: \&quot;1361924010000\&quot;,   \&quot;endDate\&quot;: \&quot;1361924020000\&quot;,   \&quot;steps\&quot;: [     {       \&quot;distance\&quot;: \&quot;0.03\&quot;,       \&quot;duration\&quot;: \&quot;5000\&quot;,       \&quot;startLat\&quot;: \&quot;47.614603\&quot;,       \&quot;startLng\&quot;: \&quot;-122.350518\&quot;,       \&quot;startDate\&quot;: \&quot;1361924010000\&quot;,       \&quot;endLat\&quot;: \&quot;47.614941\&quot;,       \&quot;endLng\&quot;: \&quot;-122.350062\&quot;,       \&quot;endDate\&quot;: \&quot;1361924015000\&quot;     },{       \&quot;distance\&quot;: \&quot;0.05\&quot;,       \&quot;duration\&quot;: \&quot;5000\&quot;,       \&quot;startLat\&quot;: \&quot;47.614941\&quot;,       \&quot;startLng\&quot;: \&quot;-122.350062\&quot;,       \&quot;startDate\&quot;: \&quot;1361924015000\&quot;,       \&quot;endLat\&quot;: \&quot;47.614384\&quot;,       \&quot;endLng\&quot;: \&quot;-122.349161\&quot;,       \&quot;endDate\&quot;: \&quot;1361924020000\&quot;     }   ] ] &#x60;&#x60;&#x60; 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("data")]
    public string Data { get; set; }
    /// <summary>
    /// Whether to generate accounts for tracking entries when the owner does not exist
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("generateAccounts")]
    public bool? GenerateAccounts { get; set; }
    /// <summary>
    /// Whether to update the account&#39;s current location from the incoming tracking data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("updateAccountLocations")]
    public bool? UpdateAccountLocations { get; set; }
    /// <summary>
    /// The default tag to apply to incoming legs when no tag is provided
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("defaultTag")]
    public string? DefaultTag { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("slaveUID")]
    public string? SlaveUID { get; set; }
}
public class GetPredictedLocationsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the customer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// latitude to return a more likely result set based on the user&#39;s current location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// longitude to return a more likely result set based on the user&#39;s current location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// Used to specify which day to get predicted locations for. So if you want to look at where they might be tomorrow, pass in tomorrow&#39;s date (timestamp in milliseconds). If no value is passed in, the current date will be used.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("dateCheck")]
    public long? DateCheck { get; set; }
    /// <summary>
    /// Comma separated list of hours that will filter the results on the hours specified. For example, if you want to see predicted locations for the mornings and evening you can pass in \&quot;8,9,10,11,17,18,19,20\&quot;.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hourCheck")]
    public string? HourCheck { get; set; }
    /// <summary>
    /// The minimum number matches in 1 hour to be considered a likely location.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("threshold")]
    public long? Threshold { get; set; }
    /// <summary>
    /// Determines which unit of measurement gets returned for distances: {MILES, KILOMETERS}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("distanceUnit")]
    public string? DistanceUnit { get; set; }
    /// <summary>
    /// Filter results so only locations within the specified radius will be returned. The distance can either be in miles or kilometers as specified in the distanceUnit parameter. A value of \&quot;0\&quot; (zero) will ignore the radius restriction.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("searchRange")]
    public double? SearchRange { get; set; }
    /// <summary>
    /// The ordering algorithm for sorting the returned results: {MATCHES, DISTANCE, WEIGHTED}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortOrder")]
    public string? SortOrder { get; set; }
}
public class GetPredictedPathRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the customer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The stepId to begin from
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startStepId")]
    public long StartStepId { get; set; }
    /// <summary>
    /// The stepId to end with
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endStepId")]
    public long EndStepId { get; set; }
}
public class GetPreferredLocationsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the customer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// latitude to return a more likely result set based on the user&#39;s current location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// longitude to return a more likely result set based on the user&#39;s current location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// Used to specify which day to get preferred locations for. So if you want to look at where they might be tomorrow, pass in tomorrow&#39;s date (timestamp in milliseconds). If no value is passed in, results from all time will be returned.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("dateCheck")]
    public long? DateCheck { get; set; }
    /// <summary>
    /// Comma separated list of hours that will filter the results on the hours specified. For example, if you want to see preferred locations for the mornings and evening you can pass in \&quot;8,9,10,11,17,18,19,20\&quot;.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hourCheck")]
    public string? HourCheck { get; set; }
    /// <summary>
    /// Specifies how the results will be ordered. Supported values include: CREATED - the time of when the preferred location data was processed. PREFERRED_DATE - the time of when the user sent in the tracking data. HOUR - the hour of when the user sent in the tracking data. DURATION - the duration of the preferred location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// Determines whether the sorted list is in descending or ascending order
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
    /// Filter results so only locations within the specified radius will be returned. The distance can either be in miles or kilometers as specified in the distanceUnit parameter. A value of \&quot;0\&quot; (zero) will ignore the radius restriction.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("searchRange")]
    public double? SearchRange { get; set; }
    /// <summary>
    /// Determines which unit of measurement gets returned for distances: {MILES, KILOMETERS}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("distanceUnit")]
    public string? DistanceUnit { get; set; }
}
public class GetTrackingLegsRequest
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
    /// the account id of the person the user wants to tracking data for
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ownerId")]
    public long? OwnerId { get; set; }
    /// <summary>
    /// the id of the tracking device
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("trackingDeviceId")]
    public string? TrackingDeviceId { get; set; }
    /// <summary>
    /// the start date in (UTC milliseconds) to filter the tracking results. If no startDate is passed in, the last 30 days will be returned.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// the end date in (UTC milliseconds) to filter the tracking results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long? EndDate { get; set; }
    /// <summary>
    /// filter results by tag
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tags")]
    public string? Tags { get; set; }
    /// <summary>
    /// gets the last known location of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("getLastPoint")]
    public bool? GetLastPoint { get; set; }
}
public class SaveTrackingLegRequest
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
    /// the total distance
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("distance")]
    public double? Distance { get; set; }
    /// <summary>
    /// the total duration
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("duration")]
    public long? Duration { get; set; }
    /// <summary>
    /// the latitude of the first point
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startLat")]
    public double StartLat { get; set; }
    /// <summary>
    /// the longitude of the first point
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startLng")]
    public double StartLng { get; set; }
    /// <summary>
    /// the start date (in UTC milliseconds) of the first point
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long StartDate { get; set; }
    /// <summary>
    /// the latitude of the last point
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endLat")]
    public double EndLat { get; set; }
    /// <summary>
    /// the longitude of the last point
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endLng")]
    public double EndLng { get; set; }
    /// <summary>
    /// the end date (in UTC milliseconds) of the last point
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long EndDate { get; set; }
    /// <summary>
    /// JSON array of tracking vectors used for smoother pathing data. If null then the leg data will be used to generate a single step, if an empty array then no steps will be generated. &#x60;&#x60;&#x60;json [{   \&quot;distance\&quot;: \&quot;0.03\&quot;,   \&quot;duration\&quot;: \&quot;5000\&quot;,   \&quot;startLat\&quot;: \&quot;47.614603\&quot;,   \&quot;startLng\&quot;: \&quot;-122.350518\&quot;,   \&quot;startDate\&quot;: \&quot;1361924010000\&quot;,   \&quot;endLat\&quot;: \&quot;47.614941\&quot;,   \&quot;endLng\&quot;: \&quot;-122.350062\&quot;,   \&quot;endDate\&quot;: \&quot;1361924015000\&quot; }] &#x60;&#x60;&#x60; 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("steps")]
    public string? Steps { get; set; }
    /// <summary>
    /// name the leg for searching
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tags")]
    public string? Tags { get; set; }
}
public class SaveTrackingStepRequest
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
    /// the leg to add the step to
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("legId")]
    public long LegId { get; set; }
    /// <summary>
    /// the total distance
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("distance")]
    public double? Distance { get; set; }
    /// <summary>
    /// the total duration
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("duration")]
    public long? Duration { get; set; }
    /// <summary>
    /// the latitude of the first point
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startLat")]
    public double StartLat { get; set; }
    /// <summary>
    /// the longitude of the first point
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startLng")]
    public double StartLng { get; set; }
    /// <summary>
    /// the start date (in UTC milliseconds) of the first point
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long StartDate { get; set; }
    /// <summary>
    /// the latitude of the last point
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endLat")]
    public double EndLat { get; set; }
    /// <summary>
    /// the longitude of the last point
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endLng")]
    public double EndLng { get; set; }
    /// <summary>
    /// the end date (in UTC milliseconds) of the last point
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long EndDate { get; set; }
}
public class SearchAccountsWithTrackingLegsRequest
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
    public long AccountId { get; set; }
    /// <summary>
    /// Used for LIKE search of first or last name on the acocunt
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// Range to begin in UTC milliseconds
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// Range to end in UTC milliseconds
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long? EndDate { get; set; }
    /// <summary>
    /// Exact match on tag field of Legs&#39;s searchTag
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tags")]
    public string? Tags { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceIds")]
    public string? AudienceIds { get; set; }
    /// <summary>
    /// Origin latitude to perform searching constraints with given range
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// Origin longitude to perform searching constraints with given range
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// The radius, in miles, to perform the search for
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("range")]
    public double? Range { get; set; }
    /// <summary>
    /// The column to sort the search on. Possible values include: {LEG_START_DATE, ACCOUNT_DISPLAY}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// The order to return the results. Default is false, which will return the results in ascending order.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// The index into the record set to start with. Default is 0.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// The total number of records to return. Default is 20.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// Determines whether to return only active results. Default is false.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool? ActiveOnly { get; set; }
}
public class SearchTrackingLegsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id to search tracking for
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// The id of the tracking device
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("trackingDeviceId")]
    public string? TrackingDeviceId { get; set; }
    /// <summary>
    /// The start date in (UTC milliseconds) to filter the tracking results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// The end date in (UTC milliseconds) to filter the tracking results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long? EndDate { get; set; }
    /// <summary>
    /// Filter results by tag
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tags")]
    public string? Tags { get; set; }
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


