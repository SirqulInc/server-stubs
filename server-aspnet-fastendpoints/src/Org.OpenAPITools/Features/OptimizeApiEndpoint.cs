using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Get Optimization Result
/// </summary>

public class GetOptimizationResultEndpoint : FastEndpoints.Endpoint<GetOptimizationResultRequest, Dictionary<string, ShipmentOrder>>
{
    public override void Configure()
    {
        Get("/api/{version}/optimize/result/{batchID}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Optimize");
        });

        Summary(s => {
            s.Summary = "Get Optimization Result";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.BatchID, "The batchID for getting the import status of.");
            s.RequestParam(r => r.Start, "The start index for pagination");
            s.RequestParam(r => r.Limit, "The limit for pagination");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetOptimizationResultRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Request Optimization
/// </summary>

public class RequestOptimizationEndpoint : FastEndpoints.Endpoint<RequestOptimizationRequest, ImportStatuses>
{
    public override void Configure()
    {
        Post("/api/{version}/optimize/request");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Optimize");
        });

        Summary(s => {
            s.Summary = "Request Optimization";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(RequestOptimizationRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

