using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Territory
/// </summary>

public class CreateTerritoryEndpoint : FastEndpoints.Endpoint<CreateTerritoryRequest, TerritoryResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/territory/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Territory");
        });

        Summary(s => {
            s.Summary = "Create Territory";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.Name, "The name of the territory");
            s.RequestParam(r => r.Active, "If true set the game level as active. Default is true.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateTerritoryRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Territory
/// </summary>

public class DeleteTerritoryEndpoint : FastEndpoints.Endpoint<DeleteTerritoryRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/territory/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Territory");
        });

        Summary(s => {
            s.Summary = "Delete Territory";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.RequestParam(r => r.TerritoryId, "the id of the territory to delete");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteTerritoryRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Territory
/// </summary>

public class GetTerritoryEndpoint : FastEndpoints.Endpoint<GetTerritoryRequest, TerritoryResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/territory/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Territory");
        });

        Summary(s => {
            s.Summary = "Get Territory";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.TerritoryId, "the id of the territory to get");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetTerritoryRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Territories
/// </summary>

public class SearchTerritoriesEndpoint : FastEndpoints.Endpoint<SearchTerritoriesRequest, List<TerritoryResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/territory/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Territory");
        });

        Summary(s => {
            s.Summary = "Search Territories";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.SortField, "the field to sort by. Supported values include: ID, CREATED, UPDATED, NAME");
            s.RequestParam(r => r.Descending, "determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.Keyword, "Return results that match this keyword.");
            s.RequestParam(r => r.Start, "The start index for pagination");
            s.RequestParam(r => r.Limit, "The limit for pagination");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchTerritoriesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Territory
/// </summary>

public class UpdateTerritoryEndpoint : FastEndpoints.Endpoint<UpdateTerritoryRequest, TerritoryResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/territory/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Territory");
        });

        Summary(s => {
            s.Summary = "Update Territory";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.TerritoryId, "the id of the territory to update");
            s.RequestParam(r => r.Name, "The name of the territory");
            s.RequestParam(r => r.Active, "If true set the game level as active.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateTerritoryRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

