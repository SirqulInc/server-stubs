
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class SearchWeatherRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Region Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("regionId")]
    public long? RegionId { get; set; }
    /// <summary>
    /// Latitude
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// Longitude
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
    /// <summary>
    /// Timezone Offset
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("timezoneOffset")]
    public long? TimezoneOffset { get; set; }
}


