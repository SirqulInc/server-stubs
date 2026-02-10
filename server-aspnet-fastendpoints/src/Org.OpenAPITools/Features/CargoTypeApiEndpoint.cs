using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Cargo Type
/// </summary>

public class CreateCargoTypeEndpoint : FastEndpoints.Endpoint<CreateCargoTypeRequest, CargoType>
{
    public override void Configure()
    {
        Post("/api/{version}/cargo/type");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Cargo Type");
        });

        Summary(s => {
            s.Summary = "Create Cargo Type";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateCargoTypeRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Cargo Type
/// </summary>

public class DeleteCargoTypeEndpoint : FastEndpoints.Endpoint<DeleteCargoTypeRequest>
{
    public override void Configure()
    {
        Delete("/api/{version}/cargo/type/{cargoTypeId}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Cargo Type");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Delete Cargo Type";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.CargoTypeId, "the ID of the cargo type");
            s.Responses[0] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteCargoTypeRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Cargo Type
/// </summary>

public class GetCargoTypeEndpoint : FastEndpoints.Endpoint<GetCargoTypeRequest, CargoType>
{
    public override void Configure()
    {
        Get("/api/{version}/cargo/type/{cargoTypeId}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Cargo Type");
        });

        Summary(s => {
            s.Summary = "Get Cargo Type";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.CargoTypeId, "the cargo type ID");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetCargoTypeRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Cargo Type
/// </summary>

public class SearchCargoTypesEndpoint : FastEndpoints.Endpoint<SearchCargoTypesRequest, List<CargoType>>
{
    public override void Configure()
    {
        Get("/api/{version}/cargo/type");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Cargo Type");
        });

        Summary(s => {
            s.Summary = "Search Cargo Type";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.SortField, "the sort field to use for the cargo type");
            s.RequestParam(r => r.Descending, "if the cargo type should be should be in descending order");
            s.RequestParam(r => r.Start, "the start of the search");
            s.RequestParam(r => r.Limit, "the limit of the search");
            s.RequestParam(r => r.ActiveOnly, "if search should be on active only");
            s.RequestParam(r => r.RetailerId, "the id of the retailer location");
            s.RequestParam(r => r.HubId, "the ID of the hub");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchCargoTypesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Cargo Type
/// </summary>

public class UpdateCargoTypeEndpoint : FastEndpoints.Endpoint<UpdateCargoTypeRequest, CargoType>
{
    public override void Configure()
    {
        Put("/api/{version}/cargo/type/{cargoTypeId}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Cargo Type");
        });

        Summary(s => {
            s.Summary = "Update Cargo Type";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.CargoTypeId, "the ID of the cargo type");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateCargoTypeRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

