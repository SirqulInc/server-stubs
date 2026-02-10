using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Get User Activity
/// </summary>

public class ActivitiesEndpoint : FastEndpoints.Endpoint<ActivitiesRequest, List<UserActivityResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/analytics/useractivity");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Analytics");
        });

        Summary(s => {
            s.Summary = "Get User Activity";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Start, "The start of the pagination");
            s.RequestParam(r => r.Limit, "The limit of the pagination");
            s.RequestParam(r => r.AccountId, "the account id of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ActivitiesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Aggregated Filtered Usage
/// </summary>

public class AggregatedFilteredUsageEndpoint : FastEndpoints.Endpoint<AggregatedFilteredUsageRequest, ChartData>
{
    public override void Configure()
    {
        Get("/api/{version}/analytics/aggregatedFilteredUsage");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Analytics");
        });

        Summary(s => {
            s.Summary = "Get Aggregated Filtered Usage";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The unique id of the device making the request (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.ApplicationId, "This parameter is deprecated.");
            s.RequestParam(r => r.AppKey, "The application key used to filter results by application");
            s.RequestParam(r => r.StartDate, "Used to search for results after or equal to this date (UNIX time-stamp in milliseconds)");
            s.RequestParam(r => r.EndDate, "Used to search for results before or equal to this date (UNIX time-stamp in milliseconds)");
            s.RequestParam(r => r.DeviceType, "The device type to filter results by (performs a LIKE search)");
            s.RequestParam(r => r.Device, "The device to filter results by (performs a LIKE search)");
            s.RequestParam(r => r.DeviceOS, "The device OS to filter results by (performs a LIKE search)");
            s.RequestParam(r => r.Gender, "The gender to filter results by {MALE, FEMALE}");
            s.RequestParam(r => r.AgeGroup, "Comma separated list of age groups to filter by {AGE_0_13, AGE_14_17, AGE_18_22, AGE_23_30, AGE_31_54, AGE_55_PLUS}");
            s.RequestParam(r => r.Country, "The country to filter results by (performs a wild-card search)");
            s.RequestParam(r => r.State, "The state to filter results by (performs a wild-card search)");
            s.RequestParam(r => r.City, "The city to filter results by (performs a wild-card search)");
            s.RequestParam(r => r.Zip, "The zip to filter results by (performs a wild-card search)");
            s.RequestParam(r => r.Model, "The model to filter results by (performs a wild-card search)");
            s.RequestParam(r => r.Tag, "The tag to filter results by (performs a wild-card search)");
            s.RequestParam(r => r.UserAccountId, "The account id to filter results for a particular user");
            s.RequestParam(r => r.UserAccountDisplay, "The user display to filter results by (performs a wild-card search)");
            s.RequestParam(r => r.UserAccountUsername, "The username to filter results by (performs a wild-card search)");
            s.RequestParam(r => r.GroupByRoot, "Determines how to group results. For example, passing in &#39;CREATED&#39; will return results by date. Passing in &#39;ACCOUNT&#39; will return results by user {TAG, CUSTOM_ID, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, ACCOUNT, APPLICATION_ID, APPLICATION_NAME_BY_ID}");
            s.RequestParam(r => r.GroupBy, "Determines how to group the nested data. {TAG, CUSTOM_ID, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, ACCOUNT, APPLICATION_ID, APPLICATION_NAME_BY_ID}");
            s.RequestParam(r => r.DistinctCount, "Performs a unique query on the specified column. For example, passing in &#39;ACCOUNT&#39; will return the number of unique users. {TAG, CUSTOM_ID, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, ACCOUNT, APPLICATION_ID, NEW_ACCOUNT}");
            s.RequestParam(r => r.SortField, "Determines whether the results will be sorted by day or by number of hits {CREATED, TAG_COUNT}");
            s.RequestParam(r => r.Descending, "Determines whether to return results in descending order");
            s.RequestParam(r => r.HideUnknown, "Determines whether to return data that has empty or unknown values");
            s.RequestParam(r => r.ResponseFormat, "Determines whether to return a JOSN or XML representation of the graph results");
            s.RequestParam(r => r.L, "This parameter is deprecated.");
            s.RequestParam(r => r.Limit, "Used to limit results to get a cleaner graph. The results that gets filtered out will be combined");
            s.RequestParam(r => r.Latitude, "the current latitude of the user");
            s.RequestParam(r => r.Longitude, "the current longitude of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(AggregatedFilteredUsageRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Filtered Usage
/// </summary>

public class FilteredUsageEndpoint : FastEndpoints.Endpoint<FilteredUsageRequest, ChartData>
{
    public override void Configure()
    {
        Get("/api/{version}/analytics/filteredUsage");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Analytics");
        });

        Summary(s => {
            s.Summary = "Get Filtered Usage";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The unique id of the device making the request (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.ApplicationId, "This parameter is deprecated.");
            s.RequestParam(r => r.AppKey, "The application key used to filter results by application");
            s.RequestParam(r => r.StartDate, "Used to search for results after or equal to this date (UNIX time-stamp in milliseconds)");
            s.RequestParam(r => r.EndDate, "Used to search for results before or equal to this date (UNIX time-stamp in milliseconds)");
            s.RequestParam(r => r.DeviceType, "The device type to filter results by (performs a LIKE search)");
            s.RequestParam(r => r.Device, "The device to filter results by (performs a LIKE search)");
            s.RequestParam(r => r.DeviceOS, "The device OS to filter results by (performs a LIKE search)");
            s.RequestParam(r => r.Gender, "The gender to filter results by {MALE, FEMALE}");
            s.RequestParam(r => r.AgeGroup, "Comma separated list of age groups to filter by {AGE_0_13, AGE_14_17, AGE_18_22, AGE_23_30, AGE_31_54, AGE_55_PLUS}");
            s.RequestParam(r => r.Country, "The country to filter results by (performs a wild-card search)");
            s.RequestParam(r => r.State, "The state to filter results by (performs a wild-card search)");
            s.RequestParam(r => r.City, "The city to filter results by (performs a wild-card search)");
            s.RequestParam(r => r.Zip, "The zip to filter results by (performs a wild-card search)");
            s.RequestParam(r => r.Model, "The model to filter results by (performs a wild-card search)");
            s.RequestParam(r => r.Tag, "The tag to filter results by (performs a wild-card search)");
            s.RequestParam(r => r.UserAccountId, "The account id to filter results for a particular user");
            s.RequestParam(r => r.UserAccountDisplay, "The user display to filter results by (performs a wild-card search)");
            s.RequestParam(r => r.UserAccountUsername, "The username to filter results by (performs a wild-card search)");
            s.RequestParam(r => r.CustomId, "The ID for the custom table column");
            s.RequestParam(r => r.CustomType, "The type defined for the custom table column");
            s.RequestParam(r => r.CustomValue, "The value for the custom table column");
            s.RequestParam(r => r.CustomValue2, "The value for another custom table column");
            s.RequestParam(r => r.CustomLong, "The value that supports Longs for custom table column");
            s.RequestParam(r => r.CustomLong2, "The value that supports Longs for custom table column");
            s.RequestParam(r => r.CustomMessage, "The message for the custom table column");
            s.RequestParam(r => r.CustomMessage2, "The message for the custom table column");
            s.RequestParam(r => r.GroupBy, "Determines how to group results. For example, passing in &#39;CREATED&#39; will return results by date. Passing in &#39;ACCOUNT&#39; will return results by user {TAG, CUSTOM_ID, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, DEVICE_ID, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, ACCOUNT, APPLICATION_ID}");
            s.RequestParam(r => r.DistinctCount, "Performs a unique query on the specified column. For example, passing in &#39;ACCOUNT&#39; will return the number of unique users. {TAG, CUSTOM_ID, TOKEN, MODEL, DEVICE_TYPE, DEVICE, DEVICE_OS, DEVICE_ID, IP_ADDRESS, STATE, CITY, ZIP, COUNTRY, ACCOUNT, APPLICATION_ID}");
            s.RequestParam(r => r.SumColumn, "sum of the column values");
            s.RequestParam(r => r.SortField, "Determines whether the results will be sorted by day or by number of hits {CREATED, TAG_COUNT}");
            s.RequestParam(r => r.Descending, "Determines whether to return results in descending order");
            s.RequestParam(r => r.HideUnknown, "Determines whether to return data that has empty or unknown values");
            s.RequestParam(r => r.ResponseFormat, "Determines whether to return a JOSN or XML representation of the graph results");
            s.RequestParam(r => r.L, "This parameter is deprecated.");
            s.RequestParam(r => r.Limit, "Used to limit results to get a cleaner graph. The results that gets filtered out will be combined");
            s.RequestParam(r => r.Latitude, "the current latitude of the user");
            s.RequestParam(r => r.Longitude, "the current longitude of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(FilteredUsageRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Usage Record
/// </summary>

public class UsageEndpoint : FastEndpoints.Endpoint<UsageRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/analytics/usage");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Analytics");
        });

        Summary(s => {
            s.Summary = "Create Usage Record";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Tag, "The tag to apply: the name of the action or thing being logged.");
            s.RequestParam(r => r.DeviceId, "The client deviceID");
            s.RequestParam(r => r.AccountId, "The logged in user ID");
            s.RequestParam(r => r.ApplicationId, "This parameter is deprecated. This is deprecated, use appKey.");
            s.RequestParam(r => r.AppKey, "The application key unique to each application.");
            s.RequestParam(r => r.AppVersion, "The current build version of the application");
            s.RequestParam(r => r.Device, "The name of the device being used (iPhone5,1 , HTC Nexus One, x86_64, etc.)");
            s.RequestParam(r => r.DeviceType, "The type of device (Handheld or Desktop)");
            s.RequestParam(r => r.DeviceOS, "The operating system that the device is using (iPhone OS 5.0, Android OS 2.3.6, Windows 7 Service Pack 1, etc)");
            s.RequestParam(r => r.Model, "The model of the device (iPhone5,1 , Nexus One, etc.)");
            s.RequestParam(r => r.Latitude, "The current position of the user");
            s.RequestParam(r => r.Longitude, "The current position of the user");
            s.RequestParam(r => r.CustomId, "A customId used to associate the usage record with some other record in the system");
            s.RequestParam(r => r.CustomType, "The type of record the customId is recorded for");
            s.RequestParam(r => r.AchievementIncrement, "This parameter is deprecated. This is deprecated, use \&quot;customValue\&quot;. Determines how many achievement points and/or ranking points the user gets if this analytic is associated with an achievement");
            s.RequestParam(r => r.City, "The current city of the user");
            s.RequestParam(r => r.State, "The current state of the user");
            s.RequestParam(r => r.Country, "The current country of the user");
            s.RequestParam(r => r.Zip, "The current zip of the user");
            s.RequestParam(r => r.LocationDescription, "The general description of the user&#39;s location");
            s.RequestParam(r => r.ClientTime, "Timestamp sent from device");
            s.RequestParam(r => r.ErrorMessage, "This parameter is deprecated.");
            s.RequestParam(r => r.Ip, "the ip address of the client device");
            s.RequestParam(r => r.UserAgent, "this is a description of the client (might contain the device&#39;s OS, browser version etc - its a common term)");
            s.RequestParam(r => r.BackgroundEvent, "This is deprecated.");
            s.RequestParam(r => r.CustomMessage, "a custom message for the usage record");
            s.RequestParam(r => r.CustomMessage2, "a custom message for the usage record");
            s.RequestParam(r => r.CustomValue, "a custom value for the usage record");
            s.RequestParam(r => r.CustomValue2, "a custom value for the usage record");
            s.RequestParam(r => r.CustomLong, "a custom long value for the usage record");
            s.RequestParam(r => r.CustomLong2, "a custom long value for the usage record");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UsageRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Multiple Usage Records
/// </summary>

public class UsageBatchEndpoint : FastEndpoints.Endpoint<UsageBatchRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/analytics/usage/batch");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Analytics");
        });

        Summary(s => {
            s.Summary = "Create Multiple Usage Records";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AppKey, "The application key unique to each application.");
            s.RequestParam(r => r.Device, "The name of the device being used (iPhone5,1 , HTC Nexus One, x86_64, etc.)");
            s.RequestParam(r => r.Data, "The analytic data AnalyticListResponse");
            s.RequestParam(r => r.DeviceId, "The unique id of the device making the request");
            s.RequestParam(r => r.AccountId, "The account ID of the logged in user making the request");
            s.RequestParam(r => r.AppVersion, "The current build version of the application");
            s.RequestParam(r => r.DeviceType, "The type of device (Handheld or Desktop)");
            s.RequestParam(r => r.DeviceOS, "The operating system that the device is using (iPhone OS 5.0, Android OS 2.3.6, Windows 7 Service Pack 1, etc.)");
            s.RequestParam(r => r.Model, "The model of the device (iPhone5,1 , Nexus One, etc.)");
            s.RequestParam(r => r.UpdateRanking, "Will create a leaderboard if one does not exist for the \&quot;tag\&quot; yet");
            s.RequestParam(r => r.ReturnSummaryResponse, "Returns a summary response of the achievements that have been completed due to the analytics");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UsageBatchRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

