using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Calculate Path
/// </summary>

public class ComputePathEndpoint : FastEndpoints.Endpoint<ComputePathRequest, PathingResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/pathing/compute");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Pathing");
        });

        Summary(s => {
            s.Summary = "Calculate Path";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Data, "the data to with start, end point and exclusion points");
            s.RequestParam(r => r.Units, "the system of measurement for directions: {METRIC, IMPERIAL}");
            s.RequestParam(r => r.ReducePath, "determines whether to reduce the path to go in diagonal lines");
            s.RequestParam(r => r.Directions, "determines whether to return text directions");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ComputePathRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

