
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateCargoTypeRequest
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
    public CargoType? body { get; set; }
}
public class DeleteCargoTypeRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the ID of the cargo type
    /// </summary>
    [FastEndpoints.BindFrom("cargoTypeId")]
    public long CargoTypeId { get; set; }
}
public class GetCargoTypeRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the cargo type ID
    /// </summary>
    [FastEndpoints.BindFrom("cargoTypeId")]
    public long CargoTypeId { get; set; }
}
public class SearchCargoTypesRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the retailer location
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerId")]
    public long? RetailerId { get; set; }
    /// <summary>
    /// the ID of the hub
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hubId")]
    public long? HubId { get; set; }
    /// <summary>
    /// the sort field to use for the cargo type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string SortField { get; set; }
    /// <summary>
    /// if the cargo type should be should be in descending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool Descending { get; set; }
    /// <summary>
    /// the start of the search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// the limit of the search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
    /// <summary>
    /// if search should be on active only
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool ActiveOnly { get; set; }
}
public class UpdateCargoTypeRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the ID of the cargo type
    /// </summary>
    [FastEndpoints.BindFrom("cargoTypeId")]
    public long CargoTypeId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public CargoType? body { get; set; }
}


