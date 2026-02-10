
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class ComputePathRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the data to with start, end point and exclusion points
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("data")]
    public string Data { get; set; }
    /// <summary>
    /// the system of measurement for directions: {METRIC, IMPERIAL}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("units")]
    public string Units { get; set; }
    /// <summary>
    /// determines whether to reduce the path to go in diagonal lines
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("reducePath")]
    public bool ReducePath { get; set; }
    /// <summary>
    /// determines whether to return text directions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("directions")]
    public bool Directions { get; set; }
}


