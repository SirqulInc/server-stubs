
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class ImageGenerationRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Sirqul Account Id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Post Body Parameters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("postBody")]
    public string PostBody { get; set; }
    /// <summary>
    /// Return raw response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnRawResponse")]
    public bool? ReturnRawResponse { get; set; }
}


