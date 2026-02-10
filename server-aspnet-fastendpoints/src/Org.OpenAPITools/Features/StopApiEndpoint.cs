using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Get Stop
/// </summary>

public class GetStopEndpoint : FastEndpoints.Endpoint<GetStopRequest, Stop>
{
    public override void Configure()
    {
        Get("/api/{version}/stop/{id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Stop");
        });

        Summary(s => {
            s.Summary = "Get Stop";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Id, "the id of the stop to get");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetStopRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Stop
/// </summary>

public class UpdateStopEndpoint : FastEndpoints.Endpoint<UpdateStopRequest, Stop>
{
    public override void Configure()
    {
        Put("/api/{version}/stop/{id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Stop");
        });

        Summary(s => {
            s.Summary = "Update Stop";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Id, "the id of the stop to update");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateStopRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

