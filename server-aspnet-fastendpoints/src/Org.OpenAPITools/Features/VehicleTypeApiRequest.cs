
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateVehicleTypeRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// A JSON representation of cargo type. &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;Truck\&quot;,   \&quot;width\&quot;: 100,   \&quot;height\&quot;: 200,   \&quot;depth\&quot;: 200,   \&quot;maxWeight\&quot;: 5000,   \&quot;hub\&quot;: { \&quot;id\&quot;: 1 } } &#x60;&#x60;&#x60; 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vehicleType")]
    public string VehicleType { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public VehicleType? body { get; set; }
}
public class DeleteVehicleTypeRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The id of the requested vehicle type
    /// </summary>
    [FastEndpoints.BindFrom("vehicleTypeId")]
    public long VehicleTypeId { get; set; }
}
public class GetVehicleTypeRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The id of the requested vehicle type
    /// </summary>
    [FastEndpoints.BindFrom("vehicleTypeId")]
    public long VehicleTypeId { get; set; }
}
public class SearchVehicleTypesRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Filter by retailer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("retailerId")]
    public long? RetailerId { get; set; }
    /// <summary>
    /// Filter by service hub
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hubId")]
    public long? HubId { get; set; }
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
    /// <summary>
    /// Return only active results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool ActiveOnly { get; set; }
}
public class UpdateVehicleTypeRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The id of the vehicle type to update
    /// </summary>
    [FastEndpoints.BindFrom("vehicleTypeId")]
    public long VehicleTypeId { get; set; }
    /// <summary>
    /// The new data for the vehicle type to update to. A JSON representation of cargo type, for example: &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;Truck\&quot;,   \&quot;width\&quot;: 100,   \&quot;height\&quot;: 200,   \&quot;depth\&quot;: 200,   \&quot;maxWeight\&quot;: 5000,   \&quot;hub\&quot;: { \&quot;id\&quot;: 1 } } &#x60;&#x60;&#x60; 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("vehicleType")]
    public string VehicleType { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public VehicleType? body { get; set; }
}


