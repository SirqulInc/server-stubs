
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateStripeCheckoutSessionRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Sirqul Application Key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Stripe Parameters
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("stripeParameters")]
    public string StripeParameters { get; set; }
}


