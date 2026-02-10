
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class ActivitiesRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The start of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// The limit of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
    /// <summary>
    /// the account id of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
}
public class AggregatedFilteredUsageRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The unique id of the device making the request (deviceId or accountId required)
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
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("applicationId")]
    public long? ApplicationId { get; set; }
    /// <summary>
    /// The application key used to filter results by application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// Used to search for results after or equal to this date (UNIX time-stamp in milliseconds)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// Used to search for results before or equal to this date (UNIX time-stamp in milliseconds)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long? EndDate { get; set; }
    /// <summary>
    /// The device type to filter results by (performs a LIKE search)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceType")]
    public string? DeviceType { get; set; }
    /// <summary>
    /// The device to filter results by (performs a LIKE search)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("device")]
    public string? Device { get; set; }
    /// <summary>
    /// The device OS to filter results by (performs a LIKE search)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceOS")]
    public string? DeviceOS { get; set; }
    /// <summary>
    /// The gender to filter results by {MALE, FEMALE}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gender")]
    public string? Gender { get; set; }
    /// <summary>
    /// Comma separated list of age groups to filter by {AGE_0_13, AGE_14_17, AGE_18_22, AGE_23_30, AGE_31_54, AGE_55_PLUS}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ageGroup")]
    public string? AgeGroup { get; set; }
    /// <summary>
    /// The country to filter results by (performs a wild-card search)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("country")]
    public string? Country { get; set; }
    /// <summary>
    /// The state to filter results by (performs a wild-card search)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("state")]
    public string? State { get; set; }
    /// <summary>
    /// The city to filter results by (performs a wild-card search)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("city")]
    public string? City { get; set; }
    /// <summary>
    /// The zip to filter results by (performs a wild-card search)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("zip")]
    public string? Zip { get; set; }
    /// <summary>
    /// The model to filter results by (performs a wild-card search)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("model")]
    public string? Model { get; set; }
    /// <summary>
    /// The tag to filter results by (performs a wild-card search)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tag")]
    public string? Tag { get; set; }
    /// <summary>
    /// The account id to filter results for a particular user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("userAccountId")]
    public long? UserAccountId { get; set; }
    /// <summary>
    /// The user display to filter results by (performs a wild-card search)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("userAccountDisplay")]
    public string? UserAccountDisplay { get; set; }
    /// <summary>
    /// The username to filter results by (performs a wild-card search)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("userAccountUsername")]
    public string? UserAccountUsername { get; set; }
    /// <summary>
    /// Determines how to group results. For example, passing in &#39;CREATED&#39; will return results by date. Passing in &#39;ACCOUNT&#39; will return results by user {TAG, CUSTOM_ID, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, ACCOUNT, APPLICATION_ID, APPLICATION_NAME_BY_ID}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("groupByRoot")]
    public string? GroupByRoot { get; set; }
    /// <summary>
    /// Determines how to group the nested data. {TAG, CUSTOM_ID, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, ACCOUNT, APPLICATION_ID, APPLICATION_NAME_BY_ID}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("groupBy")]
    public string? GroupBy { get; set; }
    /// <summary>
    /// Performs a unique query on the specified column. For example, passing in &#39;ACCOUNT&#39; will return the number of unique users. {TAG, CUSTOM_ID, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, ACCOUNT, APPLICATION_ID, NEW_ACCOUNT}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("distinctCount")]
    public string? DistinctCount { get; set; }
    /// <summary>
    /// Determines whether the results will be sorted by day or by number of hits {CREATED, TAG_COUNT}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// Determines whether to return results in descending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// Determines whether to return data that has empty or unknown values
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hideUnknown")]
    public bool? HideUnknown { get; set; }
    /// <summary>
    /// Determines whether to return a JOSN or XML representation of the graph results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("responseFormat")]
    public string? ResponseFormat { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_l")]
    public int? L { get; set; }
    /// <summary>
    /// Used to limit results to get a cleaner graph. The results that gets filtered out will be combined
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
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
}
public class FilteredUsageRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The unique id of the device making the request (deviceId or accountId required)
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
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("applicationId")]
    public long? ApplicationId { get; set; }
    /// <summary>
    /// The application key used to filter results by application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// Used to search for results after or equal to this date (UNIX time-stamp in milliseconds)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// Used to search for results before or equal to this date (UNIX time-stamp in milliseconds)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long? EndDate { get; set; }
    /// <summary>
    /// The device type to filter results by (performs a LIKE search)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceType")]
    public string? DeviceType { get; set; }
    /// <summary>
    /// The device to filter results by (performs a LIKE search)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("device")]
    public string? Device { get; set; }
    /// <summary>
    /// The device OS to filter results by (performs a LIKE search)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceOS")]
    public string? DeviceOS { get; set; }
    /// <summary>
    /// The gender to filter results by {MALE, FEMALE}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gender")]
    public string? Gender { get; set; }
    /// <summary>
    /// Comma separated list of age groups to filter by {AGE_0_13, AGE_14_17, AGE_18_22, AGE_23_30, AGE_31_54, AGE_55_PLUS}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ageGroup")]
    public string? AgeGroup { get; set; }
    /// <summary>
    /// The country to filter results by (performs a wild-card search)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("country")]
    public string? Country { get; set; }
    /// <summary>
    /// The state to filter results by (performs a wild-card search)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("state")]
    public string? State { get; set; }
    /// <summary>
    /// The city to filter results by (performs a wild-card search)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("city")]
    public string? City { get; set; }
    /// <summary>
    /// The zip to filter results by (performs a wild-card search)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("zip")]
    public string? Zip { get; set; }
    /// <summary>
    /// The model to filter results by (performs a wild-card search)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("model")]
    public string? Model { get; set; }
    /// <summary>
    /// The tag to filter results by (performs a wild-card search)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tag")]
    public string? Tag { get; set; }
    /// <summary>
    /// The account id to filter results for a particular user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("userAccountId")]
    public long? UserAccountId { get; set; }
    /// <summary>
    /// The user display to filter results by (performs a wild-card search)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("userAccountDisplay")]
    public string? UserAccountDisplay { get; set; }
    /// <summary>
    /// The username to filter results by (performs a wild-card search)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("userAccountUsername")]
    public string? UserAccountUsername { get; set; }
    /// <summary>
    /// The ID for the custom table column
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("customId")]
    public long? CustomId { get; set; }
    /// <summary>
    /// The type defined for the custom table column
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("customType")]
    public string? CustomType { get; set; }
    /// <summary>
    /// The value for the custom table column
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("customValue")]
    public double? CustomValue { get; set; }
    /// <summary>
    /// The value for another custom table column
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("customValue2")]
    public double? CustomValue2 { get; set; }
    /// <summary>
    /// The value that supports Longs for custom table column
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("customLong")]
    public long? CustomLong { get; set; }
    /// <summary>
    /// The value that supports Longs for custom table column
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("customLong2")]
    public long? CustomLong2 { get; set; }
    /// <summary>
    /// The message for the custom table column
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("customMessage")]
    public string? CustomMessage { get; set; }
    /// <summary>
    /// The message for the custom table column
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("customMessage2")]
    public string? CustomMessage2 { get; set; }
    /// <summary>
    /// Determines how to group results. For example, passing in &#39;CREATED&#39; will return results by date. Passing in &#39;ACCOUNT&#39; will return results by user {TAG, CUSTOM_ID, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, DEVICE_ID, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, ACCOUNT, APPLICATION_ID}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("groupBy")]
    public string? GroupBy { get; set; }
    /// <summary>
    /// Performs a unique query on the specified column. For example, passing in &#39;ACCOUNT&#39; will return the number of unique users. {TAG, CUSTOM_ID, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, DEVICE_ID, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, ACCOUNT, APPLICATION_ID}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("distinctCount")]
    public string? DistinctCount { get; set; }
    /// <summary>
    /// sum of the column values
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sumColumn")]
    public string? SumColumn { get; set; }
    /// <summary>
    /// Determines whether the results will be sorted by day or by number of hits {CREATED, TAG_COUNT}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// Determines whether to return results in descending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// Determines whether to return data that has empty or unknown values
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hideUnknown")]
    public bool? HideUnknown { get; set; }
    /// <summary>
    /// Determines whether to return a JOSN or XML representation of the graph results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("responseFormat")]
    public string? ResponseFormat { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_l")]
    public int? L { get; set; }
    /// <summary>
    /// Used to limit results to get a cleaner graph. The results that gets filtered out will be combined
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
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
}
public class UsageRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The tag to apply: the name of the action or thing being logged.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tag")]
    public string Tag { get; set; }
    /// <summary>
    /// The client deviceID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The logged in user ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// This parameter is deprecated. This is deprecated, use appKey.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("applicationId")]
    public long? ApplicationId { get; set; }
    /// <summary>
    /// The application key unique to each application.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// The current build version of the application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appVersion")]
    public string? AppVersion { get; set; }
    /// <summary>
    /// The name of the device being used (iPhone5,1 , HTC Nexus One, x86_64, etc.)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("device")]
    public string? Device { get; set; }
    /// <summary>
    /// The type of device (Handheld or Desktop)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceType")]
    public string? DeviceType { get; set; }
    /// <summary>
    /// The operating system that the device is using (iPhone OS 5.0, Android OS 2.3.6, Windows 7 Service Pack 1, etc)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceOS")]
    public string? DeviceOS { get; set; }
    /// <summary>
    /// The model of the device (iPhone5,1 , Nexus One, etc.)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("model")]
    public string? Model { get; set; }
    /// <summary>
    /// The current position of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// The current position of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// A customId used to associate the usage record with some other record in the system
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("customId")]
    public long? CustomId { get; set; }
    /// <summary>
    /// The type of record the customId is recorded for
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("customType")]
    public string? CustomType { get; set; }
    /// <summary>
    /// This parameter is deprecated. This is deprecated, use \&quot;customValue\&quot;. Determines how many achievement points and/or ranking points the user gets if this analytic is associated with an achievement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("achievementIncrement")]
    public long? AchievementIncrement { get; set; }
    /// <summary>
    /// The current city of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("city")]
    public string? City { get; set; }
    /// <summary>
    /// The current state of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("state")]
    public string? State { get; set; }
    /// <summary>
    /// The current country of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("country")]
    public string? Country { get; set; }
    /// <summary>
    /// The current zip of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("zip")]
    public string? Zip { get; set; }
    /// <summary>
    /// The general description of the user&#39;s location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locationDescription")]
    public string? LocationDescription { get; set; }
    /// <summary>
    /// Timestamp sent from device
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("clientTime")]
    public long? ClientTime { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("errorMessage")]
    public string? ErrorMessage { get; set; }
    /// <summary>
    /// the ip address of the client device
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ip")]
    public string? Ip { get; set; }
    /// <summary>
    /// this is a description of the client (might contain the device&#39;s OS, browser version etc - its a common term)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("userAgent")]
    public string? UserAgent { get; set; }
    /// <summary>
    /// This is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("backgroundEvent")]
    public bool? BackgroundEvent { get; set; }
    /// <summary>
    /// a custom message for the usage record
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("customMessage")]
    public string? CustomMessage { get; set; }
    /// <summary>
    /// a custom message for the usage record
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("customMessage2")]
    public string? CustomMessage2 { get; set; }
    /// <summary>
    /// a custom value for the usage record
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("customValue")]
    public double? CustomValue { get; set; }
    /// <summary>
    /// a custom value for the usage record
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("customValue2")]
    public double? CustomValue2 { get; set; }
    /// <summary>
    /// a custom long value for the usage record
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("customLong")]
    public long? CustomLong { get; set; }
    /// <summary>
    /// a custom long value for the usage record
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("customLong2")]
    public long? CustomLong2 { get; set; }
}
public class UsageBatchRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The unique id of the device making the request
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The account ID of the logged in user making the request
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The application key unique to each application.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// The current build version of the application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appVersion")]
    public string? AppVersion { get; set; }
    /// <summary>
    /// The name of the device being used (iPhone5,1 , HTC Nexus One, x86_64, etc.)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("device")]
    public string Device { get; set; }
    /// <summary>
    /// The type of device (Handheld or Desktop)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceType")]
    public string? DeviceType { get; set; }
    /// <summary>
    /// The operating system that the device is using (iPhone OS 5.0, Android OS 2.3.6, Windows 7 Service Pack 1, etc.)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceOS")]
    public string? DeviceOS { get; set; }
    /// <summary>
    /// The model of the device (iPhone5,1 , Nexus One, etc.)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("model")]
    public string? Model { get; set; }
    /// <summary>
    /// The analytic data AnalyticListResponse
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("data")]
    public string Data { get; set; }
    /// <summary>
    /// Will create a leaderboard if one does not exist for the \&quot;tag\&quot; yet
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("updateRanking")]
    public bool? UpdateRanking { get; set; }
    /// <summary>
    /// Returns a summary response of the achievements that have been completed due to the analytics
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnSummaryResponse")]
    public bool? ReturnSummaryResponse { get; set; }
}


