
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class GetStopRequest
{
    /// <summary>
    /// the id of the stop to get
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public long Id { get; set; }
}
public class UpdateStopRequest
{
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


