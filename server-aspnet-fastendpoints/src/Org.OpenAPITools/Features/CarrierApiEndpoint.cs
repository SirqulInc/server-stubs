using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Search Carriers
/// </summary>

public class SearchCarriersEndpoint : FastEndpoints.Endpoint<SearchCarriersRequest, List<CellCarrierResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/carrier/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Carrier");
        });

        Summary(s => {
            s.Summary = "Search Carriers";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Keyword, "The keyword to search on");
            s.RequestParam(r => r.Descending, "Determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.Start, "The start index for pagination");
            s.RequestParam(r => r.Limit, "The limit for pagination");
            s.RequestParam(r => r.ActiveOnly, "Determines whether to return inactive results");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchCarriersRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

