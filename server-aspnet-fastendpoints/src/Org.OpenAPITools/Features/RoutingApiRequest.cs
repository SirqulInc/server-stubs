
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class ComputeRoutingRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Json object containing inputs for generating the routes. See description for more info. Also see RoutingRequest
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("data")]
    public string Data { get; set; }
}


