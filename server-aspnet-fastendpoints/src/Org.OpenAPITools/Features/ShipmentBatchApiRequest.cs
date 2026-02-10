
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateShipmentBatchRequest
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
    public ShipmentBatch? body { get; set; }
}
public class DeleteShipmentBatchRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the shipment batch to delete
    /// </summary>
    [FastEndpoints.BindFrom("batchId")]
    public long BatchId { get; set; }
}
public class GetShipmentBatchRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the shipment batch to get
    /// </summary>
    [FastEndpoints.BindFrom("batchId")]
    public long BatchId { get; set; }
}
public class GetShipmentBatchStatusRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The id of the requested shipment batch
    /// </summary>
    [FastEndpoints.BindFrom("batchId")]
    public long BatchId { get; set; }
    /// <summary>
    /// the id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// Valid import status only or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("valid")]
    public bool? Valid { get; set; }
    /// <summary>
    /// Started import status only
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("started")]
    public bool? Started { get; set; }
    /// <summary>
    /// Completed import status only
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("completed")]
    public bool? Completed { get; set; }
    /// <summary>
    /// Has shipment associate to the status
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hasShipment")]
    public bool? HasShipment { get; set; }
    /// <summary>
    /// Has route associate to the status
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hasRoute")]
    public bool? HasRoute { get; set; }
    /// <summary>
    /// The keyword to search for
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// The field to sort by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string SortField { get; set; }
    /// <summary>
    /// Determines whether the sorted list is in descending or ascending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool Descending { get; set; }
    /// <summary>
    /// The start index for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// The limit for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
}
public class SearchShipmentBatchRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The associated service hub
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hubId")]
    public long HubId { get; set; }
    /// <summary>
    /// The field to sort by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string SortField { get; set; }
    /// <summary>
    /// Determines whether the sorted list is in descending or ascending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool Descending { get; set; }
    /// <summary>
    /// The start index for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// The limit for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
}


