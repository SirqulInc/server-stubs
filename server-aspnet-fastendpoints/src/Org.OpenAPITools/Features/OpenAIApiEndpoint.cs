using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Generate images with OpenAI
/// </summary>

public class ImageGenerationEndpoint : FastEndpoints.Endpoint<ImageGenerationRequest, WrappedProxyItemResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/openai/v1/images/generations");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("OpenAI");
        });

        Summary(s => {
            s.Summary = "Generate images with OpenAI";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "Sirqul Account Id");
            s.RequestParam(r => r.PostBody, "Post Body Parameters");
            s.RequestParam(r => r.ReturnRawResponse, "Return raw response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ImageGenerationRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

