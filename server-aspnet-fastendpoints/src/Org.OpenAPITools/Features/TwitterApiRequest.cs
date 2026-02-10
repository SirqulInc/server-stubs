
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class AuthorizeTwitterRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
}
public class LoginTwitterRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The device id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The access token
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accessToken")]
    public string AccessToken { get; set; }
    /// <summary>
    /// The secret access token
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accessTokenSecret")]
    public string AccessTokenSecret { get; set; }
    /// <summary>
    /// The application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// a comma separated list of ProfileFilters for filtering the returned response data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("responseFilters")]
    public string ResponseFilters { get; set; }
    /// <summary>
    /// The current latitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// The current longitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
}


