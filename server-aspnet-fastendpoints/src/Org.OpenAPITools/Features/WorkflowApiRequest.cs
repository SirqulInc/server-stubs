
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class RunWorkflowRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the account ID of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the workflow to run
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("workflowId")]
    public long WorkflowId { get; set; }
    /// <summary>
    /// this runs a particular sku on the workflow
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("skuId")]
    public long? SkuId { get; set; }
    /// <summary>
    /// this runs a particular sku version on the workflow
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("versionCode")]
    public int? VersionCode { get; set; }
    /// <summary>
    /// Override parameters in JSON format. Example: &#x60;&#x60;&#x60;json {   \&quot;arguments_81\&quot;: { \&quot;filter\&quot;: \&quot;PUBLIC\&quot; },   \&quot;arguments_87\&quot;: { \&quot;tag\&quot;: \&quot;custom_tag\&quot; } } &#x60;&#x60;&#x60; 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parameters")]
    public string? Parameters { get; set; }
}


