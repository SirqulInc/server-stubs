
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class ProcessAllParticipantsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The application key used to identify the application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// Whether to use short name as the participant ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("useShortNameAsID")]
    public bool? UseShortNameAsID { get; set; }
}
public class ProcessParticipantsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The league identifier to process
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("league")]
    public string League { get; set; }
    /// <summary>
    /// The application key used to identify the application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// Whether to use short name as the participant ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("useShortNameAsID")]
    public bool? UseShortNameAsID { get; set; }
    /// <summary>
    /// Multipart file containing participant feed contents
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("file")]
    public System.IO.Stream? File { get; set; }
}


