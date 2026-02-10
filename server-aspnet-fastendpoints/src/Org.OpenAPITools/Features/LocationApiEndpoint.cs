using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Trilateration Data with File
/// </summary>

public class CacheTrilaterationDataEndpoint : FastEndpoints.Endpoint<CacheTrilaterationDataRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/location/trilaterate/cache");
        
        
        AllowAnonymous();
        AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Location");
        });

        Summary(s => {
            s.Summary = "Create Trilateration Data with File";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Udid, "The unique identifier of the source device");
            s.RequestParam(r => r.SourceTime, "The current timestamp of the source device");
            s.RequestParam(r => r.MinimumSampleSize, "the minimum number of Edysen devices that must be used to be able to trilaterate a device");
            s.RequestParam(r => r.Data, "The json formated sample data:  &#x60;&#x60;&#x60;json {    \&quot;count\&quot;: 2,   \&quot;timespan\&quot;: 10,    \&quot;samples\&quot;: [     {       \&quot;deviceId\&quot;: \&quot;device1\&quot;,       \&quot;randomizedId\&quot;: true,        \&quot;deviceSignature\&quot;: \&quot;probe:xyz...\&quot;,        \&quot;alternativeId\&quot;:\&quot;adc123\&quot;,        \&quot;rssi\&quot;: [-63, -75]     },      {       \&quot;deviceId\&quot;: \&quot;device2\&quot;,       \&quot;randomizedId\&quot;: true,        \&quot;deviceSignature\&quot;: \&quot;probe:xyz...\&quot;,        \&quot;alternativeId\&quot;: \&quot;adc123\&quot;,        \&quot;rssi\&quot;: [-83, -79]     }   ] } &#x60;&#x60;&#x60; ");
            s.RequestParam(r => r.DataFile, "Binary file containing data (multipart upload)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CacheTrilaterationDataRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Trilateration Data with Rest
/// </summary>

public class CacheTrilaterationDataGzipEndpoint : FastEndpoints.Endpoint<CacheTrilaterationDataGzipRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/location/trilaterate/cache/submit");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Location");
        });

        Summary(s => {
            s.Summary = "Create Trilateration Data with Rest";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CacheTrilaterationDataGzipRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Location by IP
/// </summary>

public class GetLocationByIpEndpoint : FastEndpoints.Endpoint<GetLocationByIpRequest, CoordsResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/location/ip");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Location");
        });

        Summary(s => {
            s.Summary = "Get Location by IP";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Ip, "the ip address of the client device");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetLocationByIpRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Location by Trilateration
/// </summary>

public class GetLocationByTrilaterationEndpoint : FastEndpoints.Endpoint<GetLocationByTrilaterationRequest, GeoPointResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/account/location/trilaterate");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Location");
        });

        Summary(s => {
            s.Summary = "Get Location by Trilateration";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account making the request, if provided the last know location will be updated");
            s.RequestParam(r => r.Latitude, "The known GPS latitude to compare to the calculated version");
            s.RequestParam(r => r.Longitude, "The known GPS longitude to compare to the calculated version");
            s.RequestParam(r => r.Data, "The json formated sample data:  &#x60;&#x60;&#x60;json {    \&quot;count\&quot;: 2,   \&quot;timespan\&quot;: 10,    \&quot;samples\&quot;: [     {       \&quot;deviceId\&quot;: \&quot;device1\&quot;,       \&quot;rssi\&quot;: [-63, -75]     },      {       \&quot;deviceId\&quot;: \&quot;device2\&quot;,       \&quot;rssi\&quot;: [-83, -79]     }   ] } &#x60;&#x60;&#x60; ");
            s.RequestParam(r => r.ResponseFilters, "Optional response filters (not used currently)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetLocationByTrilaterationRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Regions or Postal Codes
/// </summary>

public class GetLocationsEndpoint : FastEndpoints.Endpoint<GetLocationsRequest, LocationSearchResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/location/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Location");
        });

        Summary(s => {
            s.Summary = "Search Regions or Postal Codes";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "the device id");
            s.RequestParam(r => r.AccountId, "the account id");
            s.RequestParam(r => r.Currentlatitude, "This parameter is deprecated.");
            s.RequestParam(r => r.Currentlongitude, "This parameter is deprecated.");
            s.RequestParam(r => r.CurrentLatitude, "the current latitude of the user");
            s.RequestParam(r => r.CurrentLongitude, "the current longitude of the user");
            s.RequestParam(r => r.Query, "the query results by keyword or address");
            s.RequestParam(r => r.Zipcode, "This parameter is deprecated.");
            s.RequestParam(r => r.ZipCode, "the zip code to filter results");
            s.RequestParam(r => r.SelectedMaplatitude, "This parameter is deprecated.");
            s.RequestParam(r => r.SelectedMaplongitude, "This parameter is deprecated.");
            s.RequestParam(r => r.SelectedMapLatitude, "the latitude of where the search should originate from");
            s.RequestParam(r => r.SelectedMapLongitude, "the longitude of where the search should originate from");
            s.RequestParam(r => r.SearchRange, "the search range of the search in miles");
            s.RequestParam(r => r.UseGeocode, "determines whether to allow searches via address");
            s.RequestParam(r => r.I, "This parameter is deprecated.");
            s.RequestParam(r => r.Start, "the start index for pagination");
            s.RequestParam(r => r.L, "This parameter is deprecated.");
            s.RequestParam(r => r.Limit, "the limit for pagination");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetLocationsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

