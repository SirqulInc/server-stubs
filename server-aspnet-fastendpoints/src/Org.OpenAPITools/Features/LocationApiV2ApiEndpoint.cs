using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create new location
/// </summary>

public class CreateLocationV2Endpoint : FastEndpoints.Endpoint<CreateLocationV2Request, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/location");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("LocationApiV2");
        });

        Summary(s => {
            s.Summary = "Create new location";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateLocationV2Request req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update an existing location
/// </summary>

public class UpdateLocationV2Endpoint : FastEndpoints.Endpoint<UpdateLocationV2Request, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/location/{id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("LocationApiV2");
        });

        Summary(s => {
            s.Summary = "Update an existing location";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Id, "the id of the location to update");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateLocationV2Request req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

