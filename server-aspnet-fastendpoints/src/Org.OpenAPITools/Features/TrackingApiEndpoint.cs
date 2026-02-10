using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Batch Tracking
/// </summary>

public class BatchSaveTrackingEndpoint : FastEndpoints.Endpoint<BatchSaveTrackingRequest, List<Leg>>
{
    public override void Configure()
    {
        Post("/api/{version}/tracking/batch/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Tracking");
        });

        Summary(s => {
            s.Summary = "Create Batch Tracking";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Data, "JSON array of tracking legs &#x60;&#x60;&#x60;json [   \&quot;distance\&quot;: \&quot;0.08\&quot;,   \&quot;duration\&quot;: \&quot;10000\&quot;,   \&quot;startLatitude\&quot;: \&quot;47.614603\&quot;,   \&quot;startLongitude\&quot;: \&quot;-122.350518\&quot;,   \&quot;endLatitude\&quot;: \&quot;47.614384\&quot;,   \&quot;endLongitude\&quot;: \&quot;-122.349161\&quot;,   \&quot;startDate\&quot;: \&quot;1361924010000\&quot;,   \&quot;endDate\&quot;: \&quot;1361924020000\&quot;,   \&quot;steps\&quot;: [     {       \&quot;distance\&quot;: \&quot;0.03\&quot;,       \&quot;duration\&quot;: \&quot;5000\&quot;,       \&quot;startLat\&quot;: \&quot;47.614603\&quot;,       \&quot;startLng\&quot;: \&quot;-122.350518\&quot;,       \&quot;startDate\&quot;: \&quot;1361924010000\&quot;,       \&quot;endLat\&quot;: \&quot;47.614941\&quot;,       \&quot;endLng\&quot;: \&quot;-122.350062\&quot;,       \&quot;endDate\&quot;: \&quot;1361924015000\&quot;     },{       \&quot;distance\&quot;: \&quot;0.05\&quot;,       \&quot;duration\&quot;: \&quot;5000\&quot;,       \&quot;startLat\&quot;: \&quot;47.614941\&quot;,       \&quot;startLng\&quot;: \&quot;-122.350062\&quot;,       \&quot;startDate\&quot;: \&quot;1361924015000\&quot;,       \&quot;endLat\&quot;: \&quot;47.614384\&quot;,       \&quot;endLng\&quot;: \&quot;-122.349161\&quot;,       \&quot;endDate\&quot;: \&quot;1361924020000\&quot;     }   ] ] &#x60;&#x60;&#x60; ");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.GenerateAccounts, "Whether to generate accounts for tracking entries when the owner does not exist");
            s.RequestParam(r => r.UpdateAccountLocations, "Whether to update the account&#39;s current location from the incoming tracking data");
            s.RequestParam(r => r.DefaultTag, "The default tag to apply to incoming legs when no tag is provided");
            s.RequestParam(r => r.SlaveUID, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(BatchSaveTrackingRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Predicted Locations
/// </summary>

public class GetPredictedLocationsEndpoint : FastEndpoints.Endpoint<GetPredictedLocationsRequest, PredictedLocationResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/tracking/predicted/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Tracking");
        });

        Summary(s => {
            s.Summary = "Get Predicted Locations";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the customer");
            s.RequestParam(r => r.Latitude, "latitude to return a more likely result set based on the user&#39;s current location");
            s.RequestParam(r => r.Longitude, "longitude to return a more likely result set based on the user&#39;s current location");
            s.RequestParam(r => r.DateCheck, "Used to specify which day to get predicted locations for. So if you want to look at where they might be tomorrow, pass in tomorrow&#39;s date (timestamp in milliseconds). If no value is passed in, the current date will be used.");
            s.RequestParam(r => r.HourCheck, "Comma separated list of hours that will filter the results on the hours specified. For example, if you want to see predicted locations for the mornings and evening you can pass in \&quot;8,9,10,11,17,18,19,20\&quot;.");
            s.RequestParam(r => r.Threshold, "The minimum number matches in 1 hour to be considered a likely location.");
            s.RequestParam(r => r.DistanceUnit, "Determines which unit of measurement gets returned for distances: {MILES, KILOMETERS}");
            s.RequestParam(r => r.SearchRange, "Filter results so only locations within the specified radius will be returned. The distance can either be in miles or kilometers as specified in the distanceUnit parameter. A value of \&quot;0\&quot; (zero) will ignore the radius restriction.");
            s.RequestParam(r => r.SortOrder, "The ordering algorithm for sorting the returned results: {MATCHES, DISTANCE, WEIGHTED}");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetPredictedLocationsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Tracking Path
/// </summary>

public class GetPredictedPathEndpoint : FastEndpoints.Endpoint<GetPredictedPathRequest, List<StepResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/tracking/path/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Tracking");
        });

        Summary(s => {
            s.Summary = "Get Tracking Path";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the customer");
            s.RequestParam(r => r.StartStepId, "The stepId to begin from");
            s.RequestParam(r => r.EndStepId, "The stepId to end with");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetPredictedPathRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Preferred Locations
/// </summary>

public class GetPreferredLocationsEndpoint : FastEndpoints.Endpoint<GetPreferredLocationsRequest, List<PreferredLocationResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/tracking/preferred/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Tracking");
        });

        Summary(s => {
            s.Summary = "Search Preferred Locations";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the customer");
            s.RequestParam(r => r.Latitude, "latitude to return a more likely result set based on the user&#39;s current location");
            s.RequestParam(r => r.Longitude, "longitude to return a more likely result set based on the user&#39;s current location");
            s.RequestParam(r => r.DateCheck, "Used to specify which day to get preferred locations for. So if you want to look at where they might be tomorrow, pass in tomorrow&#39;s date (timestamp in milliseconds). If no value is passed in, results from all time will be returned.");
            s.RequestParam(r => r.HourCheck, "Comma separated list of hours that will filter the results on the hours specified. For example, if you want to see preferred locations for the mornings and evening you can pass in \&quot;8,9,10,11,17,18,19,20\&quot;.");
            s.RequestParam(r => r.SortField, "Specifies how the results will be ordered. Supported values include: CREATED - the time of when the preferred location data was processed. PREFERRED_DATE - the time of when the user sent in the tracking data. HOUR - the hour of when the user sent in the tracking data. DURATION - the duration of the preferred location");
            s.RequestParam(r => r.Descending, "Determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.Start, "The start index for pagination");
            s.RequestParam(r => r.Limit, "The limit for pagination");
            s.RequestParam(r => r.SearchRange, "Filter results so only locations within the specified radius will be returned. The distance can either be in miles or kilometers as specified in the distanceUnit parameter. A value of \&quot;0\&quot; (zero) will ignore the radius restriction.");
            s.RequestParam(r => r.DistanceUnit, "Determines which unit of measurement gets returned for distances: {MILES, KILOMETERS}");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetPreferredLocationsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Tracking
/// </summary>

public class GetTrackingLegsEndpoint : FastEndpoints.Endpoint<GetTrackingLegsRequest, List<LegResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/tracking/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Tracking");
        });

        Summary(s => {
            s.Summary = "Search Tracking";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.OwnerId, "the account id of the person the user wants to tracking data for");
            s.RequestParam(r => r.TrackingDeviceId, "the id of the tracking device");
            s.RequestParam(r => r.StartDate, "the start date in (UTC milliseconds) to filter the tracking results. If no startDate is passed in, the last 30 days will be returned.");
            s.RequestParam(r => r.EndDate, "the end date in (UTC milliseconds) to filter the tracking results");
            s.RequestParam(r => r.Tags, "filter results by tag");
            s.RequestParam(r => r.GetLastPoint, "gets the last known location of the user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetTrackingLegsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Tracking Leg
/// </summary>

public class SaveTrackingLegEndpoint : FastEndpoints.Endpoint<SaveTrackingLegRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/tracking/leg/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Tracking");
        });

        Summary(s => {
            s.Summary = "Create Tracking Leg";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.StartLat, "the latitude of the first point");
            s.RequestParam(r => r.StartLng, "the longitude of the first point");
            s.RequestParam(r => r.StartDate, "the start date (in UTC milliseconds) of the first point");
            s.RequestParam(r => r.EndLat, "the latitude of the last point");
            s.RequestParam(r => r.EndLng, "the longitude of the last point");
            s.RequestParam(r => r.EndDate, "the end date (in UTC milliseconds) of the last point");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Distance, "the total distance");
            s.RequestParam(r => r.Duration, "the total duration");
            s.RequestParam(r => r.Steps, "JSON array of tracking vectors used for smoother pathing data. If null then the leg data will be used to generate a single step, if an empty array then no steps will be generated. &#x60;&#x60;&#x60;json [{   \&quot;distance\&quot;: \&quot;0.03\&quot;,   \&quot;duration\&quot;: \&quot;5000\&quot;,   \&quot;startLat\&quot;: \&quot;47.614603\&quot;,   \&quot;startLng\&quot;: \&quot;-122.350518\&quot;,   \&quot;startDate\&quot;: \&quot;1361924010000\&quot;,   \&quot;endLat\&quot;: \&quot;47.614941\&quot;,   \&quot;endLng\&quot;: \&quot;-122.350062\&quot;,   \&quot;endDate\&quot;: \&quot;1361924015000\&quot; }] &#x60;&#x60;&#x60; ");
            s.RequestParam(r => r.Tags, "name the leg for searching");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SaveTrackingLegRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Tracking Step
/// </summary>

public class SaveTrackingStepEndpoint : FastEndpoints.Endpoint<SaveTrackingStepRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/tracking/step/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Tracking");
        });

        Summary(s => {
            s.Summary = "Create Tracking Step";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.LegId, "the leg to add the step to");
            s.RequestParam(r => r.StartLat, "the latitude of the first point");
            s.RequestParam(r => r.StartLng, "the longitude of the first point");
            s.RequestParam(r => r.StartDate, "the start date (in UTC milliseconds) of the first point");
            s.RequestParam(r => r.EndLat, "the latitude of the last point");
            s.RequestParam(r => r.EndLng, "the longitude of the last point");
            s.RequestParam(r => r.EndDate, "the end date (in UTC milliseconds) of the last point");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Distance, "the total distance");
            s.RequestParam(r => r.Duration, "the total duration");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SaveTrackingStepRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List Tracking
/// </summary>

public class SearchAccountsWithTrackingLegsEndpoint : FastEndpoints.Endpoint<SearchAccountsWithTrackingLegsRequest, List<AccountMiniResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/tracking/list");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Tracking");
        });

        Summary(s => {
            s.Summary = "List Tracking";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the user");
            s.RequestParam(r => r.Keyword, "Used for LIKE search of first or last name on the acocunt");
            s.RequestParam(r => r.StartDate, "Range to begin in UTC milliseconds");
            s.RequestParam(r => r.EndDate, "Range to end in UTC milliseconds");
            s.RequestParam(r => r.Tags, "Exact match on tag field of Legs&#39;s searchTag");
            s.RequestParam(r => r.AudienceIds, "");
            s.RequestParam(r => r.Latitude, "Origin latitude to perform searching constraints with given range");
            s.RequestParam(r => r.Longitude, "Origin longitude to perform searching constraints with given range");
            s.RequestParam(r => r.Range, "The radius, in miles, to perform the search for");
            s.RequestParam(r => r.SortField, "The column to sort the search on. Possible values include: {LEG_START_DATE, ACCOUNT_DISPLAY}");
            s.RequestParam(r => r.Descending, "The order to return the results. Default is false, which will return the results in ascending order.");
            s.RequestParam(r => r.Start, "The index into the record set to start with. Default is 0.");
            s.RequestParam(r => r.Limit, "The total number of records to return. Default is 20.");
            s.RequestParam(r => r.ActiveOnly, "Determines whether to return only active results. Default is false.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchAccountsWithTrackingLegsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Tracking (Billable)
/// </summary>

public class SearchTrackingLegsEndpoint : FastEndpoints.Endpoint<SearchTrackingLegsRequest, List<LegResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/tracking/searchByBillable");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Tracking");
        });

        Summary(s => {
            s.Summary = "Search Tracking (Billable)";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id to search tracking for");
            s.RequestParam(r => r.AppKey, "The application key");
            s.RequestParam(r => r.TrackingDeviceId, "The id of the tracking device");
            s.RequestParam(r => r.StartDate, "The start date in (UTC milliseconds) to filter the tracking results");
            s.RequestParam(r => r.EndDate, "The end date in (UTC milliseconds) to filter the tracking results");
            s.RequestParam(r => r.Tags, "Filter results by tag");
            s.RequestParam(r => r.Start, "The start index for pagination");
            s.RequestParam(r => r.Limit, "The limit for pagination");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchTrackingLegsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

