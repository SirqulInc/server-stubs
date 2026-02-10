using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Check Disbursements
/// </summary>

public class CheckDisbursementsEndpoint : FastEndpoints.Endpoint<CheckDisbursementsRequest, DisbursementResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/disbursement/check");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Disbursement");
        });

        Summary(s => {
            s.Summary = "Check Disbursements";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.DisbursementId, "the ID of the disbursement being checked on");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CheckDisbursementsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Disbursement
/// </summary>

public class CreateDisbursementEndpoint : FastEndpoints.Endpoint<CreateDisbursementRequest, DisbursementResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/disbursement/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Disbursement");
        });

        Summary(s => {
            s.Summary = "Create Disbursement";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the ID of the logging in user (must be an EXECUTIVE account)");
            s.RequestParam(r => r.ReceiverAccountId, "the ID of the account receiving the disbursement");
            s.RequestParam(r => r.OriginalSenderAccountId, "the ID of the original sender account");
            s.RequestParam(r => r.Amount, "the dollar amount of the disbursement");
            s.RequestParam(r => r.Provider, "the provider (e.g. Authorize.net, Bill.com, etc.)");
            s.RequestParam(r => r.ScheduledDate, "the date that the disbursement is scheduled to go out to the payment provider");
            s.RequestParam(r => r.Title, "a title given for the disbursement");
            s.RequestParam(r => r.Comment, "a comment that could be made for a disbursement");
            s.RequestParam(r => r.ExternalId, "external ID, which can be used as a way to reference the disbursement");
            s.RequestParam(r => r.IntrospectionParams, "This is for specifying parameters to make an http callback request for validating that the disbursement is valid");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateDisbursementRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Disbursement
/// </summary>

public class GetDisbursementEndpoint : FastEndpoints.Endpoint<GetDisbursementRequest, DisbursementResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/disbursement/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Disbursement");
        });

        Summary(s => {
            s.Summary = "Get Disbursement";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.DisbursementId, "the id of the disbursement");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetDisbursementRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Disbursements
/// </summary>

public class SearchDisbursementsEndpoint : FastEndpoints.Endpoint<SearchDisbursementsRequest, List<DisbursementResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/disbursement/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Disbursement");
        });

        Summary(s => {
            s.Summary = "Search Disbursements";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.RequestParam(r => r.ReceiverAccountId, "filter results by the id of the account receiving the disbursement");
            s.RequestParam(r => r.Statuses, "comma separated list of status values to search for, possilbe values include: NEW, APPROVED, VALIDATING, ERROR, AUTHORIZED, CAPTURED, SETTLED");
            s.RequestParam(r => r.Providers, "comma separated list of payment providers to search for, possbile values include: AUTHORIZE_NET, AMAZON_FPS, BILL_COM");
            s.RequestParam(r => r.BeforeDate, "the date for searching disbursements before it has been processed");
            s.RequestParam(r => r.AfterDate, "the date for searching disbursements before it has been processed");
            s.RequestParam(r => r.Start, "the start index for pagination");
            s.RequestParam(r => r.Limit, "the limit per result set for pagination");
            s.RequestParam(r => r.ActiveOnly, "search on disbursements that are active only");
            s.RequestParam(r => r.ExternalId, "search results by this external ID (that can be used to reference the disbursement)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchDisbursementsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Disbursement
/// </summary>

public class UpdateDisbursementEndpoint : FastEndpoints.Endpoint<UpdateDisbursementRequest, DisbursementResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/disbursement/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Disbursement");
        });

        Summary(s => {
            s.Summary = "Update Disbursement";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.RequestParam(r => r.DisbursementId, "the id of the disbursement being updated");
            s.RequestParam(r => r.Amount, "the disbursement dollar amount being updated");
            s.RequestParam(r => r.Provider, "the payments and/or billing provider (e.g. Authorize.net, Bill.com, etc.)");
            s.RequestParam(r => r.ScheduledDate, "the date that the disbursement is scheduled to go out to the payment provider");
            s.RequestParam(r => r.Title, "the title given to the disbursement");
            s.RequestParam(r => r.Comment, "a comment that can be made on a disbursement");
            s.RequestParam(r => r.ExternalId, "an external ID that can be used to reference the disbursement");
            s.RequestParam(r => r.Retry, "determines whether to try sending the disbursement again in the case of a previous failure");
            s.RequestParam(r => r.IntrospectionParams, "for specifying parameters to make an http callback request for validating that the disbursement is valid");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateDisbursementRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

