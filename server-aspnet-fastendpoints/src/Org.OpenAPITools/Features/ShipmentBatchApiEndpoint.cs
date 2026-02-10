using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Shipment Batch
/// </summary>

public class CreateShipmentBatchEndpoint : FastEndpoints.Endpoint<CreateShipmentBatchRequest, ShipmentBatch>
{
    public override void Configure()
    {
        Post("/api/{version}/shipment/batch");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Shipment Batch");
        });

        Summary(s => {
            s.Summary = "Create Shipment Batch";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateShipmentBatchRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Shipment Batch
/// </summary>

public class DeleteShipmentBatchEndpoint : FastEndpoints.Endpoint<DeleteShipmentBatchRequest>
{
    public override void Configure()
    {
        Delete("/api/{version}/shipment/batch/{batchId}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Shipment Batch");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Delete Shipment Batch";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.BatchId, "the id of the shipment batch to delete");
            s.Responses[0] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteShipmentBatchRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Shipment Batch
/// </summary>

public class GetShipmentBatchEndpoint : FastEndpoints.Endpoint<GetShipmentBatchRequest, ShipmentBatch>
{
    public override void Configure()
    {
        Get("/api/{version}/shipment/batch/{batchId}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Shipment Batch");
        });

        Summary(s => {
            s.Summary = "Get Shipment Batch";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.BatchId, "the id of the shipment batch to get");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetShipmentBatchRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Shipment Batch Status
/// </summary>

public class GetShipmentBatchStatusEndpoint : FastEndpoints.Endpoint<GetShipmentBatchStatusRequest, List<ShipmentImportStatus>>
{
    public override void Configure()
    {
        Get("/api/{version}/shipment/batch/{batchId}/status");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Shipment Batch");
        });

        Summary(s => {
            s.Summary = "Get Shipment Batch Status";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.BatchId, "The id of the requested shipment batch");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.RequestParam(r => r.SortField, "The field to sort by");
            s.RequestParam(r => r.Descending, "Determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.Start, "The start index for pagination");
            s.RequestParam(r => r.Limit, "The limit for pagination");
            s.RequestParam(r => r.Valid, "Valid import status only or not");
            s.RequestParam(r => r.Started, "Started import status only");
            s.RequestParam(r => r.Completed, "Completed import status only");
            s.RequestParam(r => r.HasShipment, "Has shipment associate to the status");
            s.RequestParam(r => r.HasRoute, "Has route associate to the status");
            s.RequestParam(r => r.Keyword, "The keyword to search for");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetShipmentBatchStatusRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Shipment Batch
/// </summary>

public class SearchShipmentBatchEndpoint : FastEndpoints.Endpoint<SearchShipmentBatchRequest, List<ShipmentBatch>>
{
    public override void Configure()
    {
        Get("/api/{version}/shipment/batch");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Shipment Batch");
        });

        Summary(s => {
            s.Summary = "Search Shipment Batch";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.HubId, "The associated service hub");
            s.RequestParam(r => r.SortField, "The field to sort by");
            s.RequestParam(r => r.Descending, "Determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.Start, "The start index for pagination");
            s.RequestParam(r => r.Limit, "The limit for pagination");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchShipmentBatchRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

