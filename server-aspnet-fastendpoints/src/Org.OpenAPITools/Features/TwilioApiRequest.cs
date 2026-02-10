
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class SmsBuyOfferRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// the message of the text
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("Body")]
    public string Body { get; set; }
    /// <summary>
    /// the sender of the sms
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("From")]
    public string From { get; set; }
    /// <summary>
    /// the type of currency
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("currencyType")]
    public string CurrencyType { get; set; }
}


