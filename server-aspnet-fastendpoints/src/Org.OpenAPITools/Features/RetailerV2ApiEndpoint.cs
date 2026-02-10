using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Get Retailer
/// </summary>

public class GetRetaokilerEndpoint : FastEndpoints.Endpoint<GetRetaokilerRequest, SirqulResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/retailer");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Retailer V2");
        });

        Summary(s => {
            s.Summary = "Get Retailer";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RetailerId, "the id of the retailer");
            s.RequestParam(r => r.ActiveOnly, "whether to return results that are active only or all");
            s.RequestParam(r => r.Keyword, "the keyword to search on to get retailer");
            s.RequestParam(r => r.SortField, "the field to sort on");
            s.RequestParam(r => r.Start, "the start of the index and/or pagination");
            s.RequestParam(r => r.Limit, "the limit of the index and/or pagination");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetRetaokilerRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

