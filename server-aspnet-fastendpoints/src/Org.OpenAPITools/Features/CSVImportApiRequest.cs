
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class GetStatusCSVRequest
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
    /// the id of the batch
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("batchId")]
    public long BatchId { get; set; }
    /// <summary>
    /// The group of categories to return: SUMMARY, DETAILS, ERRORS, OR ALL
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("responseGroup")]
    public string ResponseGroup { get; set; }
    /// <summary>
    /// the start of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public long Start { get; set; }
    /// <summary>
    /// the limit of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public long Limit { get; set; }
}
public class ListStatusCSVRequest
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
    /// the start of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// the limit of the pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
}
public class StatusCSVRequest
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
    /// the id of the batch to get its status
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("batchId")]
    public long BatchId { get; set; }
}
public class UploadCSVRequest
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
    /// the upload type: OFFERS, RETAILERS, RETAILERLOCATIONS, CATEGORIES, OR FILTERS
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("uploadType")]
    public string UploadType { get; set; }
    /// <summary>
    /// the import file to reference
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("importFile")]
    public System.IO.Stream ImportFile { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// the format of the file
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("fileFormat")]
    public string FileFormat { get; set; }
}


