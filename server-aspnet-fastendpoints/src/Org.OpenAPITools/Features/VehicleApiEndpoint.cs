using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Vehicle
/// </summary>

public class CreateVehicleEndpoint : FastEndpoints.Endpoint<CreateVehicleRequest, Vehicle>
{
    public override void Configure()
    {
        Post("/api/{version}/vehicle");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vehicle");
        });

        Summary(s => {
            s.Summary = "Create Vehicle";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Vehicle, "A JSON representation of cargo type. &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;Truck\&quot;,   \&quot;vehicleType\&quot;: { \&quot;id\&quot;: 1 },   \&quot;hub\&quot;: { \&quot;id\&quot;: 1 } } &#x60;&#x60;&#x60; ");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateVehicleRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Vehicle
/// </summary>

public class DeleteVehicleEndpoint : FastEndpoints.Endpoint<DeleteVehicleRequest>
{
    public override void Configure()
    {
        Delete("/api/{version}/vehicle/{id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vehicle");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Delete Vehicle";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Id, "The id of the vehicle to delete");
            s.Responses[0] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteVehicleRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Vehicle
/// </summary>

public class GetVehicleEndpoint : FastEndpoints.Endpoint<GetVehicleRequest, Vehicle>
{
    public override void Configure()
    {
        Get("/api/{version}/vehicle/{id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vehicle");
        });

        Summary(s => {
            s.Summary = "Get Vehicle";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Id, "The id of the vehicle requested");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetVehicleRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Vehicle
/// </summary>

public class SearchVehicleEndpoint : FastEndpoints.Endpoint<SearchVehicleRequest, List<Vehicle>>
{
    public override void Configure()
    {
        Get("/api/{version}/vehicle");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vehicle");
        });

        Summary(s => {
            s.Summary = "Search Vehicle";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.HubId, "Filter by service hub");
            s.RequestParam(r => r.SortField, "The field to sort by");
            s.RequestParam(r => r.Descending, "Determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.Start, "The start index for pagination");
            s.RequestParam(r => r.Limit, "The limit for pagination");
            s.RequestParam(r => r.ActiveOnly, "Return only active results");
            s.RequestParam(r => r.Keyword, "The keyword to search for");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchVehicleRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Vehicle
/// </summary>

public class UpdateVehicleEndpoint : FastEndpoints.Endpoint<UpdateVehicleRequest, Vehicle>
{
    public override void Configure()
    {
        Put("/api/{version}/vehicle/{id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vehicle");
        });

        Summary(s => {
            s.Summary = "Update Vehicle";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Id, "The id of the vehicle to update");
            s.RequestParam(r => r.Vehicle, "A JSON representation of cargo type, for example: &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;Truck\&quot;,   \&quot;vehicleType\&quot;: { \&quot;id\&quot;: 1 },   \&quot;hub\&quot;: { \&quot;id\&quot;: 1 } } &#x60;&#x60;&#x60; ");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateVehicleRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

