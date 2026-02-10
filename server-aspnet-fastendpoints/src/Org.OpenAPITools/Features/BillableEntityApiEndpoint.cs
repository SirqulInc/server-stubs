using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Billable
/// </summary>

public class CreateBillableEntityEndpoint : FastEndpoints.Endpoint<CreateBillableEntityRequest, BillableEntityResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/billable/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Billable Entity");
        });

        Summary(s => {
            s.Summary = "Create Billable";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The unique device identifier that made the request (either deviceId or accountId must be used)");
            s.RequestParam(r => r.AccountId, "The unique accountId that made the request (either deviceId or accountId must be used)");
            s.RequestParam(r => r.Name, "The name of the entity responsible for billing ");
            s.RequestParam(r => r.StreetAddress, "The street address of the billable entity");
            s.RequestParam(r => r.StreetAddress2, "Additional address information (such as a suite number, floor number, building name, or PO Box) ");
            s.RequestParam(r => r.City, "The city of the billable entity");
            s.RequestParam(r => r.State, "The state of the billable entity");
            s.RequestParam(r => r.PostalCode, "The postal code of the billable entity");
            s.RequestParam(r => r.BusinessPhone, "The business phone of the billable entity");
            s.RequestParam(r => r.BusinessPhoneExt, "The business phone extension");
            s.RequestParam(r => r.AuthorizeNetApiKey, "Authorize Net Api Key");
            s.RequestParam(r => r.AuthorizeNetTransactionKey, "Authorize Net Transaction Key");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateBillableEntityRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Billable
/// </summary>

public class DeleteBillableEntityEndpoint : FastEndpoints.Endpoint<DeleteBillableEntityRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/billable/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Billable Entity");
        });

        Summary(s => {
            s.Summary = "Delete Billable";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account used to perform the delete, must have rights to edit the billable entity.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteBillableEntityRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Billable
/// </summary>

public class GetBillableEntityEndpoint : FastEndpoints.Endpoint<GetBillableEntityRequest, BillableEntityResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/billable/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Billable Entity");
        });

        Summary(s => {
            s.Summary = "Get Billable";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The unique device identifier that made the request (either deviceId or accountId must be used)");
            s.RequestParam(r => r.AccountId, "The unique accountId that made the request (either deviceId or accountId must be used)");
            s.RequestParam(r => r.IncludeCounts, "Determines whether to include the retailer dash board counts into the response");
            s.RequestParam(r => r.IncludePayments, "Whether to enable payments or not");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetBillableEntityRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Billable
/// </summary>

public class UpdateBillableEntityEndpoint : FastEndpoints.Endpoint<UpdateBillableEntityRequest, BillableEntityResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/billable/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Billable Entity");
        });

        Summary(s => {
            s.Summary = "Update Billable";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The unique device identifier that made the request (either deviceId or accountId must be used)");
            s.RequestParam(r => r.AccountId, "The unique accountId that made the request (either deviceId or accountId must be used). The account must have rights to edit the billable entity.");
            s.RequestParam(r => r.Name, "The name of the entity responsible for billing ");
            s.RequestParam(r => r.StreetAddress, "The street address of the billable entity");
            s.RequestParam(r => r.StreetAddress2, "Additional address information (such as a suite number, floor number, building name, or PO Box) ");
            s.RequestParam(r => r.City, "The city of the billable entity");
            s.RequestParam(r => r.State, "The state of the billable entity");
            s.RequestParam(r => r.PostalCode, "The postal code of the billable entity");
            s.RequestParam(r => r.BusinessPhone, "The business phone of the billable entity");
            s.RequestParam(r => r.BusinessPhoneExt, "The business phone extension of the billable entity");
            s.RequestParam(r => r.AuthorizeNetApiKey, "Authorize Net Api Key of the billable entity");
            s.RequestParam(r => r.AuthorizeNetTransactionKey, "Authorize Net Transaction Key of the billable entity");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateBillableEntityRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

