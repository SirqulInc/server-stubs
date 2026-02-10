using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Approve Route
/// </summary>

public class ApproveRouteEndpoint : FastEndpoints.Endpoint<ApproveRouteRequest, Route>
{
    public override void Configure()
    {
        Post("/api/{version}/route/{routeId}/approve");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Route");
        });

        Summary(s => {
            s.Summary = "Approve Route";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RouteId, "the id of the route to approve");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ApproveRouteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Copy Route
/// </summary>

public class CopyRouteEndpoint : FastEndpoints.Endpoint<CopyRouteRequest, Route>
{
    public override void Configure()
    {
        Post("/api/{version}/route/{routeId}/copy");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Route");
        });

        Summary(s => {
            s.Summary = "Copy Route";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RouteId, "the id of the route to duplicate");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CopyRouteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Route
/// </summary>

public class CreateRouteEndpoint : FastEndpoints.Endpoint<CreateRouteRequest, Route>
{
    public override void Configure()
    {
        Post("/api/{version}/route");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Route");
        });

        Summary(s => {
            s.Summary = "Create Route";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateRouteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Route Directions
/// </summary>

public class CreateRouteDirectionsEndpoint : FastEndpoints.Endpoint<CreateRouteDirectionsRequest, List<Direction>>
{
    public override void Configure()
    {
        Put("/api/{version}/route/{routeId}/directions");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Route");
        });

        Summary(s => {
            s.Summary = "Update Route Directions";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RouteId, "the id of the route to update directions for");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateRouteDirectionsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Route Polyline
/// </summary>

public class CreateRoutePolylineEndpoint : FastEndpoints.Endpoint<CreateRoutePolylineRequest, Route>
{
    public override void Configure()
    {
        Put("/api/{version}/route/{routeId}/polyline");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Route");
        });

        Summary(s => {
            s.Summary = "Create Route Polyline";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RouteId, "the id of the route to create a polyline for");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateRoutePolylineRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Route
/// </summary>

public class DeleteRouteEndpoint : FastEndpoints.Endpoint<DeleteRouteRequest>
{
    public override void Configure()
    {
        Delete("/api/{version}/route/{routeId}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Route");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Delete Route";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RouteId, "the id of the route");
            s.Responses[0] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteRouteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Disapprove Route
/// </summary>

public class DisapproveRouteEndpoint : FastEndpoints.Endpoint<DisapproveRouteRequest, Route>
{
    public override void Configure()
    {
        Post("/api/{version}/route/{routeId}/disapprove");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Route");
        });

        Summary(s => {
            s.Summary = "Disapprove Route";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RouteId, "the id of the route to reject");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DisapproveRouteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Route
/// </summary>

public class GetRouteEndpoint : FastEndpoints.Endpoint<GetRouteRequest, Route>
{
    public override void Configure()
    {
        Get("/api/{version}/route/{routeId}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Route");
        });

        Summary(s => {
            s.Summary = "Get Route";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RouteId, "the id of the route to get");
            s.RequestParam(r => r.ShowInheritedProperties, "return inherited properties from parent or not");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetRouteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Route Directions
/// </summary>

public class GetRouteDirectionsEndpoint : FastEndpoints.Endpoint<GetRouteDirectionsRequest, List<Direction>>
{
    public override void Configure()
    {
        Get("/api/{version}/route/{routeId}/directions");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Route");
        });

        Summary(s => {
            s.Summary = "Get Route Directions";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RouteId, "the id of the route to get directions for");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetRouteDirectionsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Route Shipments
/// </summary>

public class GetRouteShipmentsEndpoint : FastEndpoints.Endpoint<GetRouteShipmentsRequest, List<Shipment>>
{
    public override void Configure()
    {
        Get("/api/{version}/route/{routeId}/shipments");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Route");
        });

        Summary(s => {
            s.Summary = "Get Route Shipments";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RouteId, "the id of the route to get shipments for");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetRouteShipmentsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Route Stop
/// </summary>

public class GetRouteStopEndpoint : FastEndpoints.Endpoint<GetRouteStopRequest, Stop>
{
    public override void Configure()
    {
        Get("/api/{version}/route/{routeId}/stop/{stopId}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Route");
        });

        Summary(s => {
            s.Summary = "Get Route Stop";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RouteId, "the id of the route to get stops for");
            s.RequestParam(r => r.StopId, "the id of the specific stop on the route");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetRouteStopRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Route Stops
/// </summary>

public class GetRouteStopsEndpoint : FastEndpoints.Endpoint<GetRouteStopsRequest, List<Stop>>
{
    public override void Configure()
    {
        Get("/api/{version}/route/{routeId}/stops");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Route");
        });

        Summary(s => {
            s.Summary = "Get Route Stops";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RouteId, "the id of the route");
            s.RequestParam(r => r.ConfirmedOnly, "only get stops that have been confirmed or not");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetRouteStopsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Shipments At Stop
/// </summary>

public class GetShipmentsAtStopEndpoint : FastEndpoints.Endpoint<GetShipmentsAtStopRequest, List<Shipment>>
{
    public override void Configure()
    {
        Get("/api/{version}/route/{routeId}/stop/{stopId}/shipments");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Route");
        });

        Summary(s => {
            s.Summary = "Get Shipments At Stop";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RouteId, "the id of the route");
            s.RequestParam(r => r.StopId, "the id of the stop to get shipments on");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetShipmentsAtStopRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Optimize Route
/// </summary>

public class OptimizeRouteEndpoint : FastEndpoints.Endpoint<OptimizeRouteRequest>
{
    public override void Configure()
    {
        Post("/api/{version}/route/{routeId}/optimize");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Route");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Optimize Route";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RouteId, "the id of the route to optimize");
            s.Responses[0] = "successful operation";
        });
    }

    public override async Task HandleAsync(OptimizeRouteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Stop
/// </summary>

public class RemoveStopEndpoint : FastEndpoints.Endpoint<RemoveStopRequest>
{
    public override void Configure()
    {
        Delete("/api/{version}/route/{routeId}/stop/{stopId}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Route");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Delete Stop";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RouteId, "the id of the route");
            s.RequestParam(r => r.StopId, "the id of the specific stop to delete on the route");
            s.Responses[0] = "successful operation";
        });
    }

    public override async Task HandleAsync(RemoveStopRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Reorder Route Stops
/// </summary>

public class ReorderRouteStopsPatchEndpoint : FastEndpoints.Endpoint<ReorderRouteStopsPatchRequest, List<Stop>>
{
    public override void Configure()
    {
        Patch("/api/{version}/route/{routeId}/stops/reorder");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Route");
        });

        Summary(s => {
            s.Summary = "Reorder Route Stops";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RouteId, "the id of the route");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ReorderRouteStopsPatchRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Reorder Route Stops
/// </summary>

public class ReorderRouteStopsPostEndpoint : FastEndpoints.Endpoint<ReorderRouteStopsPostRequest, List<Stop>>
{
    public override void Configure()
    {
        Post("/api/{version}/route/{routeId}/stops/reorder");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Route");
        });

        Summary(s => {
            s.Summary = "Reorder Route Stops";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RouteId, "the id of the route");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ReorderRouteStopsPostRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Routes
/// </summary>

public class SearchRoutesEndpoint : FastEndpoints.Endpoint<SearchRoutesRequest, List<Route>>
{
    public override void Configure()
    {
        Get("/api/{version}/route");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Route");
        });

        Summary(s => {
            s.Summary = "Search Routes";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.SortField, "The field to sort by");
            s.RequestParam(r => r.Descending, "Determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.Start, "The start index for pagination");
            s.RequestParam(r => r.Limit, "The limit for pagination");
            s.RequestParam(r => r.ActiveOnly, "Return only active results");
            s.RequestParam(r => r.IncludesEmpty, "Include empty routes or not");
            s.RequestParam(r => r.RootOnly, "Only return root instance routes");
            s.RequestParam(r => r.ShowInheritedProperties, "Display root route properties");
            s.RequestParam(r => r.HubId, "Filter results by service hub");
            s.RequestParam(r => r.ProgramId, "Filter results by program");
            s.RequestParam(r => r.ScheduledStart, "The start date to filter the results by");
            s.RequestParam(r => r.ScheduledEnd, "The end date to filter the results by");
            s.RequestParam(r => r.UpdatedStart, "The lower bound of updated date");
            s.RequestParam(r => r.UpdatedEnd, "The upper bound of updated date");
            s.RequestParam(r => r.Featured, "The route is featured or not");
            s.RequestParam(r => r.SeatCount, "Has at least this many seat available");
            s.RequestParam(r => r.Approved, "Has been approved or not");
            s.RequestParam(r => r.Started, "Has started or not");
            s.RequestParam(r => r.Completed, "Has completed or not");
            s.RequestParam(r => r.Valid, "Is valid or not");
            s.RequestParam(r => r.ParentId, "If it is a recurring route based on the parent route");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchRoutesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Set Driver
/// </summary>

public class SetDriverEndpoint : FastEndpoints.Endpoint<SetDriverRequest>
{
    public override void Configure()
    {
        Post("/api/{version}/route/{id}/driver/{driverId}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Route");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Set Driver";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Id, "the id of the route");
            s.RequestParam(r => r.DriverId, "the id of the driver");
            s.Responses[0] = "successful operation";
        });
    }

    public override async Task HandleAsync(SetDriverRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Route
/// </summary>

public class UpdateRouteEndpoint : FastEndpoints.Endpoint<UpdateRouteRequest, Route>
{
    public override void Configure()
    {
        Put("/api/{version}/route/{routeId}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Route");
        });

        Summary(s => {
            s.Summary = "Update Route";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RouteId, "the id of the route");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateRouteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Route Stop
/// </summary>

public class UpdateRouteStopEndpoint : FastEndpoints.Endpoint<UpdateRouteStopRequest>
{
    public override void Configure()
    {
        Put("/api/{version}/route/{routeId}/stop/{stopId}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Route");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Update Route Stop";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RouteId, "the id of the route to update stops for");
            s.RequestParam(r => r.StopId, "the id of the specific stop to update on the route");
            s.RequestParam(r => r.body, "");
            s.Responses[0] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateRouteStopRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

