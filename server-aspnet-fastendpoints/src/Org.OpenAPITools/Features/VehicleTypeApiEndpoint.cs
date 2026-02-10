using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Vehicle Type
/// </summary>

public class CreateVehicleTypeEndpoint : FastEndpoints.Endpoint<CreateVehicleTypeRequest, VehicleType>
{
    public override void Configure()
    {
        Post("/api/{version}/vehicle/type");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vehicle Type");
        });

        Summary(s => {
            s.Summary = "Create Vehicle Type";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.VehicleType, "A JSON representation of cargo type. &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;Truck\&quot;,   \&quot;width\&quot;: 100,   \&quot;height\&quot;: 200,   \&quot;depth\&quot;: 200,   \&quot;maxWeight\&quot;: 5000,   \&quot;hub\&quot;: { \&quot;id\&quot;: 1 } } &#x60;&#x60;&#x60; ");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateVehicleTypeRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Vehicle Type
/// </summary>

public class DeleteVehicleTypeEndpoint : FastEndpoints.Endpoint<DeleteVehicleTypeRequest>
{
    public override void Configure()
    {
        Delete("/api/{version}/vehicle/type/{vehicleTypeId}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vehicle Type");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Delete Vehicle Type";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.VehicleTypeId, "The id of the requested vehicle type");
            s.Responses[0] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteVehicleTypeRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Vehicle Type
/// </summary>

public class GetVehicleTypeEndpoint : FastEndpoints.Endpoint<GetVehicleTypeRequest, VehicleType>
{
    public override void Configure()
    {
        Get("/api/{version}/vehicle/type/{vehicleTypeId}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vehicle Type");
        });

        Summary(s => {
            s.Summary = "Get Vehicle Type";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.VehicleTypeId, "The id of the requested vehicle type");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetVehicleTypeRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Vehicle Type
/// </summary>

public class SearchVehicleTypesEndpoint : FastEndpoints.Endpoint<SearchVehicleTypesRequest, List<VehicleType>>
{
    public override void Configure()
    {
        Get("/api/{version}/vehicle/type");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vehicle Type");
        });

        Summary(s => {
            s.Summary = "Search Vehicle Type";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.SortField, "The field to sort by");
            s.RequestParam(r => r.Descending, "Determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.Start, "The start index for pagination");
            s.RequestParam(r => r.Limit, "The limit for pagination");
            s.RequestParam(r => r.ActiveOnly, "Return only active results");
            s.RequestParam(r => r.RetailerId, "Filter by retailer");
            s.RequestParam(r => r.HubId, "Filter by service hub");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchVehicleTypesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Vehicle Type
/// </summary>

public class UpdateVehicleTypeEndpoint : FastEndpoints.Endpoint<UpdateVehicleTypeRequest, VehicleType>
{
    public override void Configure()
    {
        Put("/api/{version}/vehicle/type/{vehicleTypeId}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Vehicle Type");
        });

        Summary(s => {
            s.Summary = "Update Vehicle Type";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.VehicleTypeId, "The id of the vehicle type to update");
            s.RequestParam(r => r.VehicleType, "The new data for the vehicle type to update to. A JSON representation of cargo type, for example: &#x60;&#x60;&#x60;json {   \&quot;name\&quot;: \&quot;Truck\&quot;,   \&quot;width\&quot;: 100,   \&quot;height\&quot;: 200,   \&quot;depth\&quot;: 200,   \&quot;maxWeight\&quot;: 5000,   \&quot;hub\&quot;: { \&quot;id\&quot;: 1 } } &#x60;&#x60;&#x60; ");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateVehicleTypeRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

