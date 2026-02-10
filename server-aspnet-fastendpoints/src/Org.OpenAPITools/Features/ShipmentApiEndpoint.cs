using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Cancel Shipment
/// </summary>

public class CancelShipmentEndpoint : FastEndpoints.Endpoint<CancelShipmentRequest>
{
    public override void Configure()
    {
        Post("/api/{version}/shipment/{id}/cancel");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Shipment");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Cancel Shipment";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Id, "the id of the shipment to cancel");
            s.Responses[0] = "successful operation";
        });
    }

    public override async Task HandleAsync(CancelShipmentRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Shipment
/// </summary>

public class CreateShipmentEndpoint : FastEndpoints.Endpoint<CreateShipmentRequest, Shipment>
{
    public override void Configure()
    {
        Post("/api/{version}/shipment");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Shipment");
        });

        Summary(s => {
            s.Summary = "Create Shipment";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateShipmentRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Shipment
/// </summary>

public class DeleteShipmentEndpoint : FastEndpoints.Endpoint<DeleteShipmentRequest>
{
    public override void Configure()
    {
        Delete("/api/{version}/shipment/{id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Shipment");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Delete Shipment";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Id, "the id of the shipment to delete");
            s.Responses[0] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteShipmentRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Shipment
/// </summary>

public class GetShipmentEndpoint : FastEndpoints.Endpoint<GetShipmentRequest, Shipment>
{
    public override void Configure()
    {
        Get("/api/{version}/shipment/{id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Shipment");
        });

        Summary(s => {
            s.Summary = "Get Shipment";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Id, "the id of the shipment to get");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetShipmentRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Shipments
/// </summary>

public class SearchShipmentsEndpoint : FastEndpoints.Endpoint<SearchShipmentsRequest, List<Shipment>>
{
    public override void Configure()
    {
        Get("/api/{version}/shipment");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Shipment");
        });

        Summary(s => {
            s.Summary = "Search Shipments";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.SortField, "The field to sort by");
            s.RequestParam(r => r.Descending, "Determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.Start, "The start index for pagination");
            s.RequestParam(r => r.Limit, "The limit for pagination");
            s.RequestParam(r => r.ActiveOnly, "Return only active results");
            s.RequestParam(r => r.OwnerId, "The owner of the shipment");
            s.RequestParam(r => r.RiderId, "The rider associate to this shipment");
            s.RequestParam(r => r.RouteId, "The route associate to this shipment");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchShipmentsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Shipment
/// </summary>

public class UpdateShipmentEndpoint : FastEndpoints.Endpoint<UpdateShipmentRequest, Shipment>
{
    public override void Configure()
    {
        Put("/api/{version}/shipment/{id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Shipment");
        });

        Summary(s => {
            s.Summary = "Update Shipment";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Id, "the id of the shipment to update");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateShipmentRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Uupdate Shipment Status
/// </summary>

public class UpdateShipmentStatusEndpoint : FastEndpoints.Endpoint<UpdateShipmentStatusRequest>
{
    public override void Configure()
    {
        Post("/api/{version}/shipment/{id}/status");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Shipment");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Uupdate Shipment Status";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Id, "the id of the shipment to update status");
            s.RequestParam(r => r.body, "");
            s.Responses[0] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateShipmentStatusRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

