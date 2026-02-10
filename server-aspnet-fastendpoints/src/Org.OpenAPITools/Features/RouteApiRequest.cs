
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class ApproveRouteRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the route to approve
    /// </summary>
    [FastEndpoints.BindFrom("routeId")]
    public long RouteId { get; set; }
}
public class CopyRouteRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the route to duplicate
    /// </summary>
    [FastEndpoints.BindFrom("routeId")]
    public long RouteId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public Route? body { get; set; }
}
public class CreateRouteRequest
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
    public Route? body { get; set; }
}
public class CreateRouteDirectionsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the route to update directions for
    /// </summary>
    [FastEndpoints.BindFrom("routeId")]
    public long RouteId { get; set; }
}
public class CreateRoutePolylineRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the route to create a polyline for
    /// </summary>
    [FastEndpoints.BindFrom("routeId")]
    public long RouteId { get; set; }
}
public class DeleteRouteRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the route
    /// </summary>
    [FastEndpoints.BindFrom("routeId")]
    public long RouteId { get; set; }
}
public class DisapproveRouteRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the route to reject
    /// </summary>
    [FastEndpoints.BindFrom("routeId")]
    public long RouteId { get; set; }
}
public class GetRouteRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the route to get
    /// </summary>
    [FastEndpoints.BindFrom("routeId")]
    public long RouteId { get; set; }
    /// <summary>
    /// return inherited properties from parent or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("showInheritedProperties")]
    public bool ShowInheritedProperties { get; set; }
}
public class GetRouteDirectionsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the route to get directions for
    /// </summary>
    [FastEndpoints.BindFrom("routeId")]
    public long RouteId { get; set; }
}
public class GetRouteShipmentsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the route to get shipments for
    /// </summary>
    [FastEndpoints.BindFrom("routeId")]
    public long RouteId { get; set; }
}
public class GetRouteStopRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the route to get stops for
    /// </summary>
    [FastEndpoints.BindFrom("routeId")]
    public long RouteId { get; set; }
    /// <summary>
    /// the id of the specific stop on the route
    /// </summary>
    [FastEndpoints.BindFrom("stopId")]
    public long StopId { get; set; }
}
public class GetRouteStopsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the route
    /// </summary>
    [FastEndpoints.BindFrom("routeId")]
    public long RouteId { get; set; }
    /// <summary>
    /// only get stops that have been confirmed or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("confirmedOnly")]
    public bool ConfirmedOnly { get; set; }
}
public class GetShipmentsAtStopRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the route
    /// </summary>
    [FastEndpoints.BindFrom("routeId")]
    public long RouteId { get; set; }
    /// <summary>
    /// the id of the stop to get shipments on
    /// </summary>
    [FastEndpoints.BindFrom("stopId")]
    public long StopId { get; set; }
}
public class OptimizeRouteRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the route to optimize
    /// </summary>
    [FastEndpoints.BindFrom("routeId")]
    public long RouteId { get; set; }
}
public class RemoveStopRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the route
    /// </summary>
    [FastEndpoints.BindFrom("routeId")]
    public long RouteId { get; set; }
    /// <summary>
    /// the id of the specific stop to delete on the route
    /// </summary>
    [FastEndpoints.BindFrom("stopId")]
    public long StopId { get; set; }
}
public class ReorderRouteStopsPatchRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the route
    /// </summary>
    [FastEndpoints.BindFrom("routeId")]
    public long RouteId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public List<Stop>? body { get; set; }
}
public class ReorderRouteStopsPostRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the route
    /// </summary>
    [FastEndpoints.BindFrom("routeId")]
    public long RouteId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public List<Stop>? body { get; set; }
}
public class SearchRoutesRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// Filter results by service hub
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("hubId")]
    public long? HubId { get; set; }
    /// <summary>
    /// Filter results by program
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("programId")]
    public long? ProgramId { get; set; }
    /// <summary>
    /// The start date to filter the results by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("scheduledStart")]
    public long? ScheduledStart { get; set; }
    /// <summary>
    /// The end date to filter the results by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("scheduledEnd")]
    public long? ScheduledEnd { get; set; }
    /// <summary>
    /// The lower bound of updated date
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("updatedStart")]
    public long? UpdatedStart { get; set; }
    /// <summary>
    /// The upper bound of updated date
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("updatedEnd")]
    public long? UpdatedEnd { get; set; }
    /// <summary>
    /// The route is featured or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("featured")]
    public bool? Featured { get; set; }
    /// <summary>
    /// Has at least this many seat available
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("seatCount")]
    public int? SeatCount { get; set; }
    /// <summary>
    /// Has been approved or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("approved")]
    public bool? Approved { get; set; }
    /// <summary>
    /// Has started or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("started")]
    public bool? Started { get; set; }
    /// <summary>
    /// Has completed or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("completed")]
    public bool? Completed { get; set; }
    /// <summary>
    /// Is valid or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("valid")]
    public bool? Valid { get; set; }
    /// <summary>
    /// If it is a recurring route based on the parent route
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("parentId")]
    public long? ParentId { get; set; }
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
    /// <summary>
    /// Include empty routes or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includesEmpty")]
    public bool IncludesEmpty { get; set; }
    /// <summary>
    /// Only return root instance routes
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("rootOnly")]
    public bool RootOnly { get; set; }
    /// <summary>
    /// Display root route properties
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("showInheritedProperties")]
    public bool ShowInheritedProperties { get; set; }
}
public class SetDriverRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the route
    /// </summary>
    [FastEndpoints.BindFrom("id")]
    public long Id { get; set; }
    /// <summary>
    /// the id of the driver
    /// </summary>
    [FastEndpoints.BindFrom("driverId")]
    public long DriverId { get; set; }
}
public class UpdateRouteRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the route
    /// </summary>
    [FastEndpoints.BindFrom("routeId")]
    public long RouteId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public Route? body { get; set; }
}
public class UpdateRouteStopRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the route to update stops for
    /// </summary>
    [FastEndpoints.BindFrom("routeId")]
    public long RouteId { get; set; }
    /// <summary>
    /// the id of the specific stop to update on the route
    /// </summary>
    [FastEndpoints.BindFrom("stopId")]
    public long StopId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public Stop? body { get; set; }
}


