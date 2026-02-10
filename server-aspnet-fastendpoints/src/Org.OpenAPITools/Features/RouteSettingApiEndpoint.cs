using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Route Setting
/// </summary>

public class CreateRouteSettingsEndpoint : FastEndpoints.Endpoint<CreateRouteSettingsRequest, RouteSettings>
{
    public override void Configure()
    {
        Post("/api/{version}/route/setting");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Route Setting");
        });

        Summary(s => {
            s.Summary = "Create Route Setting";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateRouteSettingsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Route Setting
/// </summary>

public class DeleteRouteSettingsEndpoint : FastEndpoints.Endpoint<DeleteRouteSettingsRequest, Object>
{
    public override void Configure()
    {
        Delete("/api/{version}/route/setting/{routeSettingsId}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Route Setting");
        });

        Summary(s => {
            s.Summary = "Delete Route Setting";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RouteSettingsId, "the id of the route setting to delete");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteRouteSettingsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Route Setting
/// </summary>

public class GetRouteSettingsEndpoint : FastEndpoints.Endpoint<GetRouteSettingsRequest, RouteSettings>
{
    public override void Configure()
    {
        Get("/api/{version}/route/setting/{routeSettingsId}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Route Setting");
        });

        Summary(s => {
            s.Summary = "Get Route Setting";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RouteSettingsId, "the id of the route settings to get");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetRouteSettingsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Route Settings
/// </summary>

public class SearchRouteSettingsEndpoint : FastEndpoints.Endpoint<SearchRouteSettingsRequest, List<RouteSettings>>
{
    public override void Configure()
    {
        Get("/api/{version}/route/setting");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Route Setting");
        });

        Summary(s => {
            s.Summary = "Search Route Settings";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.SortField, "The field to sort by");
            s.RequestParam(r => r.Descending, "Determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.Start, "The start index for pagination");
            s.RequestParam(r => r.Limit, "The limit for pagination");
            s.RequestParam(r => r.ActiveOnly, "Return only active results");
            s.RequestParam(r => r.HubId, "The service hub that the route belongs under");
            s.RequestParam(r => r.ProgramId, "The program that the route belongs under");
            s.RequestParam(r => r.Keyword, "The keyword to search for the route");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchRouteSettingsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Route Setting
/// </summary>

public class UpdateRouteSettingsEndpoint : FastEndpoints.Endpoint<UpdateRouteSettingsRequest, RouteSettings>
{
    public override void Configure()
    {
        Put("/api/{version}/route/setting/{routeSettingsId}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Route Setting");
        });

        Summary(s => {
            s.Summary = "Update Route Setting";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.RouteSettingsId, "the id of the route settings to update");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateRouteSettingsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

