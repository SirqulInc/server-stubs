using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Dependent
/// </summary>

public class CreateEndpoint : FastEndpoints.Endpoint<CreateRequest, SirqulResponse>
{
    public override void Configure()
    {
        Put("/api/{version}/cargo/dependent/{accountId}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Dependent");
        });

        Summary(s => {
            s.Summary = "Create Dependent";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the parent account to create a dependent for");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get dependent list of an account
/// </summary>

public class GetDependentsEndpoint : FastEndpoints.Endpoint<GetDependentsRequest, SirqulResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/cargo/dependent/{accountId}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Dependent");
        });

        Summary(s => {
            s.Summary = "Get dependent list of an account";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the parent account to get a list of dependents");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetDependentsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Dependent
/// </summary>

public class RemoveDependentEndpoint : FastEndpoints.Endpoint<RemoveDependentRequest>
{
    public override void Configure()
    {
        Delete("/api/{version}/cargo/dependent/{accountId}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Dependent");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Delete Dependent";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the parent account tied to the dependent");
            s.RequestParam(r => r.DependentId, "the id of the dependent to delete");
            s.Responses[0] = "successful operation";
        });
    }

    public override async Task HandleAsync(RemoveDependentRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

