
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class GetStopRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the stop to get
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public long Id { get; set; }
}
public class UpdateStopRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the stop to update
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public long Id { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public Stop? body { get; set; }
}


