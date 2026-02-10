using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Stripe Checkout Session
/// </summary>

public class CreateStripeCheckoutSessionEndpoint : FastEndpoints.Endpoint<CreateStripeCheckoutSessionRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/stripe/checkout/session/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Stripe");
        });

        Summary(s => {
            s.Summary = "Create Stripe Checkout Session";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AppKey, "Sirqul Application Key");
            s.RequestParam(r => r.StripeParameters, "Stripe Parameters");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateStripeCheckoutSessionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

