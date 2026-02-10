using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Postal Code
/// </summary>

public class CreatePostalCodeEndpoint : FastEndpoints.Endpoint<CreatePostalCodeRequest, PostalCodeResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/postalCode/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Postal Code");
        });

        Summary(s => {
            s.Summary = "Create Postal Code";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.RequestParam(r => r.Code, "the postal code");
            s.RequestParam(r => r.Latitude, "the latitude of the postal code");
            s.RequestParam(r => r.Longitude, "the longitude of the postal code");
            s.RequestParam(r => r.StateCode, "the state code (e.g WA, WV, WI) that the postal code is located");
            s.RequestParam(r => r.City, "the city that the postal code is located");
            s.RequestParam(r => r.Active, "whether the postal code created should be active or inactive");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreatePostalCodeRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Postal Code
/// </summary>

public class DeletePostalCodeEndpoint : FastEndpoints.Endpoint<DeletePostalCodeRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/postalCode/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Postal Code");
        });

        Summary(s => {
            s.Summary = "Delete Postal Code";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.RequestParam(r => r.PostalCodeId, "the id of the postal code to delete");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeletePostalCodeRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Postal Code
/// </summary>

public class GetPostalCodeEndpoint : FastEndpoints.Endpoint<GetPostalCodeRequest, PostalCodeResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/postalCode/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Postal Code");
        });

        Summary(s => {
            s.Summary = "Get Postal Code";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.PostalCodeId, "the id of the postal code to get");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetPostalCodeRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Postal Codes
/// </summary>

public class GetPostalCodesEndpoint : FastEndpoints.Endpoint<GetPostalCodesRequest, List<PostalCodeResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/postalCode/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Postal Code");
        });

        Summary(s => {
            s.Summary = "Search Postal Codes";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.SortField, "the field to sort the results on");
            s.RequestParam(r => r.Descending, "whether to order results in ascending or descending order");
            s.RequestParam(r => r.Latitude, "the latitude of the postal code to search on");
            s.RequestParam(r => r.Longitude, "the longitude of the postal code to search on");
            s.RequestParam(r => r.Keyword, "the keyword of the postal code to search on");
            s.RequestParam(r => r.Miles, "how far (in miles) to search on for the postal code");
            s.RequestParam(r => r.Start, "the start of the index and/or pagination");
            s.RequestParam(r => r.Limit, "the limit of the index and/or pagination");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetPostalCodesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Postal Code
/// </summary>

public class UpdatePostalCodeEndpoint : FastEndpoints.Endpoint<UpdatePostalCodeRequest, PostalCodeResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/postalCode/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Postal Code");
        });

        Summary(s => {
            s.Summary = "Update Postal Code";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.RequestParam(r => r.PostalCodeId, "the id of the postal code to update");
            s.RequestParam(r => r.Code, "the postal code to update");
            s.RequestParam(r => r.Latitude, "the latitude of the postal code");
            s.RequestParam(r => r.Longitude, "the longitude of the postal code");
            s.RequestParam(r => r.StateCode, "the state code (e.g. WA, WI, WY) where the postal code is located");
            s.RequestParam(r => r.City, "the city where the postal code is located");
            s.RequestParam(r => r.Active, "whether the postal code is active or inactive");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdatePostalCodeRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

