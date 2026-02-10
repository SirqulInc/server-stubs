using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Offer Status
/// </summary>

public class CreateOfferTransactionStatusEndpoint : FastEndpoints.Endpoint<CreateOfferTransactionStatusRequest, OfferTransactionStatusResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/offer/status/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Offer Status");
        });

        Summary(s => {
            s.Summary = "Create Offer Status";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Name, "The name of the status");
            s.RequestParam(r => r.Code, "The status code, must be unique ");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Latitude, "Used to update the user&#39;s current location");
            s.RequestParam(r => r.Longitude, "Used to update the user&#39;s current location");
            s.RequestParam(r => r.Description, "The description of the status");
            s.RequestParam(r => r.Role, "The actor that uses the status");
            s.RequestParam(r => r.Active, "The active status");
            s.RequestParam(r => r.ApplicationIds, "The applications to associate the status with, if null then for all.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateOfferTransactionStatusRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Offer Status
/// </summary>

public class DeleteOfferTransactionStatusEndpoint : FastEndpoints.Endpoint<DeleteOfferTransactionStatusRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/offer/status/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Offer Status");
        });

        Summary(s => {
            s.Summary = "Delete Offer Status";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.StatusId, "The id of the record to delete");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Latitude, "Used to update the user&#39;s current location");
            s.RequestParam(r => r.Longitude, "Used to update the user&#39;s current location");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteOfferTransactionStatusRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Offer Status
/// </summary>

public class GetOfferTransactionStatusEndpoint : FastEndpoints.Endpoint<GetOfferTransactionStatusRequest, OfferTransactionStatusResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/offer/status/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Offer Status");
        });

        Summary(s => {
            s.Summary = "Get Offer Status";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.StatusId, "The id of the record to get ");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Latitude, "Used to update the user&#39;s current location");
            s.RequestParam(r => r.Longitude, "Used to update the user&#39;s current location");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetOfferTransactionStatusRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Offer Status
/// </summary>

public class SearchOfferTransactionStatusesEndpoint : FastEndpoints.Endpoint<SearchOfferTransactionStatusesRequest, List<OfferTransactionStatusResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/offer/status/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Offer Status");
        });

        Summary(s => {
            s.Summary = "Search Offer Status";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Latitude, "Used to update the user&#39;s current location");
            s.RequestParam(r => r.Longitude, "Used to update the user&#39;s current location");
            s.RequestParam(r => r.Keyword, "Search the name and description fields");
            s.RequestParam(r => r.Role, "The actors role, possible values are: CUSTOMER, RETAILER, or ANY");
            s.RequestParam(r => r.AppKey, "The application making the request");
            s.RequestParam(r => r.SortField, "The field to sort on, possible values are: ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DESCRIPTION, CODE, ROLE");
            s.RequestParam(r => r.Descending, "Determines whether the results are in descending order");
            s.RequestParam(r => r.Start, "The start index for pagination");
            s.RequestParam(r => r.Limit, "The limit for pagination");
            s.RequestParam(r => r.IncludeInactive, "If true include inactive items");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchOfferTransactionStatusesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Offer Status
/// </summary>

public class UpdateOfferTransactionStatusEndpoint : FastEndpoints.Endpoint<UpdateOfferTransactionStatusRequest, OfferTransactionStatusResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/offer/status/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Offer Status");
        });

        Summary(s => {
            s.Summary = "Update Offer Status";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DeviceId, "The device id (deviceId or accountId required)");
            s.RequestParam(r => r.AccountId, "The account id of the user (deviceId or accountId required)");
            s.RequestParam(r => r.Latitude, "Used to update the user&#39;s current location");
            s.RequestParam(r => r.Longitude, "Used to update the user&#39;s current location");
            s.RequestParam(r => r.StatusId, "The id of the record to update ");
            s.RequestParam(r => r.Name, "The name of th status");
            s.RequestParam(r => r.Description, "The description of the status");
            s.RequestParam(r => r.Code, "The status code, must be unique ");
            s.RequestParam(r => r.Role, "The actor that uses the status");
            s.RequestParam(r => r.Active, "The active status");
            s.RequestParam(r => r.ApplicationIds, "The applications to associate the status with, if null then for all.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateOfferTransactionStatusRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

