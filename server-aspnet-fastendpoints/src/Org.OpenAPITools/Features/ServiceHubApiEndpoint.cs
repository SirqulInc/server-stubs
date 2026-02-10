using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Service Hub
/// </summary>

public class CreateServiceHubEndpoint : FastEndpoints.Endpoint<CreateServiceHubRequest, ServiceHub>
{
    public override void Configure()
    {
        Post("/api/{version}/hub");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Service Hub");
        });

        Summary(s => {
            s.Summary = "Create Service Hub";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateServiceHubRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Service Hub
/// </summary>

public class DeleteServiceHubEndpoint : FastEndpoints.Endpoint<DeleteServiceHubRequest>
{
    public override void Configure()
    {
        Delete("/api/{version}/hub/{id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Service Hub");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Delete Service Hub";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Id, "the id of the service hub to delete");
            s.Responses[0] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteServiceHubRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Service Hub
/// </summary>

public class GetServiceHubEndpoint : FastEndpoints.Endpoint<GetServiceHubRequest, Object>
{
    public override void Configure()
    {
        Get("/api/{version}/hub/{id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Service Hub");
        });

        Summary(s => {
            s.Summary = "Get Service Hub";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Id, "the id of the service hub to get");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetServiceHubRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Service Hub
/// </summary>

public class PostServiceHubEndpoint : FastEndpoints.Endpoint<PostServiceHubRequest, ServiceHub>
{
    public override void Configure()
    {
        Post("/api/{version}/hub/{id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Service Hub");
        });

        Summary(s => {
            s.Summary = "Update Service Hub";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Id, "the id of the service hub");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(PostServiceHubRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Service Hub
/// </summary>

public class PutServiceHubEndpoint : FastEndpoints.Endpoint<PutServiceHubRequest, ServiceHub>
{
    public override void Configure()
    {
        Put("/api/{version}/hub/{id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Service Hub");
        });

        Summary(s => {
            s.Summary = "Update Service Hub";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Id, "the id of the service hub");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(PutServiceHubRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Service Hubs
/// </summary>

public class SearchServiceHubsEndpoint : FastEndpoints.Endpoint<SearchServiceHubsRequest, List<ServiceHub>>
{
    public override void Configure()
    {
        Get("/api/{version}/hub");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Service Hub");
        });

        Summary(s => {
            s.Summary = "Search Service Hubs";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.SortField, "The field to sort by");
            s.RequestParam(r => r.Descending, "Determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.Start, "The start index for pagination");
            s.RequestParam(r => r.Limit, "The limit for pagination");
            s.RequestParam(r => r.ActiveOnly, "Return only active results");
            s.RequestParam(r => r.Keyword, "The keyword to search for");
            s.RequestParam(r => r.RetailerId, "The retailer belongs to");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchServiceHubsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

