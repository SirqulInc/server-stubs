using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create an entity reference.
/// </summary>

public class CreateEntityReferenceEndpoint : FastEndpoints.Endpoint<CreateEntityReferenceRequest, ActivityResponse>
{
    public override void Configure()
    {
        Post("/api/3.18/entity/reference");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Activity");
        });

        Summary(s => {
            s.Summary = "Create an entity reference.";
            s.RequestParam(r => r.body, "The entity reference object");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateEntityReferenceRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

