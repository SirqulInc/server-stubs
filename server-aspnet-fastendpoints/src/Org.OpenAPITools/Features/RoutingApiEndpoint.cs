using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Compute Route
/// </summary>

public class ComputeRoutingEndpoint : FastEndpoints.Endpoint<ComputeRoutingRequest, RoutingListResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/routing/compute");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Routing");
        });

        Summary(s => {
            s.Summary = "Compute Route";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Data, "Json object containing inputs for generating the routes. See description for more info. Also see RoutingRequest");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ComputeRoutingRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

