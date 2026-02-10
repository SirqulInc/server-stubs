
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateBatchRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the user for passing account related params
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The application key for passing application related params
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// the status of the report
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("status")]
    public string Status { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endpoint")]
    public string? Endpoint { get; set; }
    /// <summary>
    /// a json structure list of the parameter values, example: &#x60;&#x60;&#x60;json {   \&quot;string\&quot;:\&quot;value\&quot;,    \&quot;number\&quot;:3.345,   \&quot;date\&quot;:\&quot;2014-05-01 00:00:00\&quot; } &#x60;&#x60;&#x60; 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parameters")]
    public string? Parameters { get; set; }
    /// <summary>
    /// name of the batch report
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string? Name { get; set; }
    /// <summary>
    /// the start date of the batch report
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// the end date of the batch report
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long? EndDate { get; set; }
    /// <summary>
    /// the description of the batch report
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// the limit on how much you can preview of the batch report
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("previewLimit")]
    public int PreviewLimit { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("pageUrl")]
    public string? PageUrl { get; set; }
}
public class CreateRegionLegSummaryBatchRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public List<RegionLegSummary>? body { get; set; }
}
public class DeleteBatchRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the id of the batch to delete
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("batchId")]
    public long BatchId { get; set; }
}
public class GetReportBatchRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// returned by /report/batch/create
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("batchId")]
    public long BatchId { get; set; }
    /// <summary>
    /// whether to return all batch results or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("allResults")]
    public bool AllResults { get; set; }
}
public class RunReportRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the user for passing account related params
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The named identifier of the query
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("query")]
    public string? Query { get; set; }
    /// <summary>
    /// Parameter values used in the query in JSON format, example: &#x60;&#x60;&#x60;json {   \&quot;string\&quot;:\&quot;value\&quot;,    \&quot;number\&quot;:3.345,   \&quot;date\&quot;:\&quot;2014-05-01 00:00:00\&quot; } &#x60;&#x60;&#x60; 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parameters")]
    public string? Parameters { get; set; }
    /// <summary>
    /// The order to use, must be a column name (see response results for list of column names)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("order")]
    public string? Order { get; set; }
    /// <summary>
    /// If true then descending order, false is ascending
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("desc")]
    public bool Desc { get; set; }
    /// <summary>
    /// The start of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public long? Start { get; set; }
    /// <summary>
    /// The limit of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public long? Limit { get; set; }
    /// <summary>
    /// Determines what response format to return. Options are: JSON or CSV
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("responseFormat")]
    public string? ResponseFormat { get; set; }
}
public class SearchBatchRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the account logged in
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the names of the report batch to search on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("names")]
    public string? Names { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// the report batch status
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("status")]
    public string? Status { get; set; }
    /// <summary>
    /// the global app to search on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("globalAppSearch")]
    public bool? GlobalAppSearch { get; set; }
    /// <summary>
    /// the start date of the report batch to search on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// the end date of the report batch to search on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long? EndDate { get; set; }
    /// <summary>
    /// the start of the index and/or pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// the limit of the index and/or pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
}


