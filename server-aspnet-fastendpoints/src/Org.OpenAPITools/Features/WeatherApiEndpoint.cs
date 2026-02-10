using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Search Weather
/// </summary>

public class SearchWeatherEndpoint : FastEndpoints.Endpoint<SearchWeatherRequest, WeatherResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/weather/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Weather");
        });

        Summary(s => {
            s.Summary = "Search Weather";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RegionId, "Region Id");
            s.RequestParam(r => r.Latitude, "Latitude");
            s.RequestParam(r => r.Longitude, "Longitude");
            s.RequestParam(r => r.TimezoneOffset, "Timezone Offset");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchWeatherRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

