using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Buy Offer by SMS
/// </summary>

public class SmsBuyOfferEndpoint : FastEndpoints.Endpoint<SmsBuyOfferRequest, TwiMLResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/sms/buyoffer/{appKey}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Twilio");
        });

        Summary(s => {
            s.Summary = "Buy Offer by SMS";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.Body, "the message of the text");
            s.RequestParam(r => r.From, "the sender of the sms");
            s.RequestParam(r => r.CurrencyType, "the type of currency");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SmsBuyOfferRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

