using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Detail Status
/// </summary>

public class GetStatusCSVEndpoint : FastEndpoints.Endpoint<GetStatusCSVRequest, SirqulResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/csvimport/batch/status/details");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("CSV Import");
        });

        Summary(s => {
            s.Summary = "Detail Status";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.RequestParam(r => r.BatchId, "the id of the batch");
            s.RequestParam(r => r.ResponseGroup, "The group of categories to return: SUMMARY, DETAILS, ERRORS, OR ALL");
            s.RequestParam(r => r.Start, "the start of the pagination");
            s.RequestParam(r => r.Limit, "the limit of the pagination");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetStatusCSVRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Status
/// </summary>

public class ListStatusCSVEndpoint : FastEndpoints.Endpoint<ListStatusCSVRequest, CsvImportResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/csvimport/batch/list");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("CSV Import");
        });

        Summary(s => {
            s.Summary = "Search Status";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the account");
            s.RequestParam(r => r.Start, "the start of the pagination");
            s.RequestParam(r => r.Limit, "the limit of the pagination");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(ListStatusCSVRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Batch Status
/// </summary>

public class StatusCSVEndpoint : FastEndpoints.Endpoint<StatusCSVRequest, CsvImportResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/csvimport/batch/status");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("CSV Import");
        });

        Summary(s => {
            s.Summary = "Batch Status";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the account");
            s.RequestParam(r => r.BatchId, "the id of the batch to get its status");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(StatusCSVRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Upload CSV
/// </summary>

public class UploadCSVEndpoint : FastEndpoints.Endpoint<UploadCSVRequest, CsvImportResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/csvimport/upload");
        
        
        AllowAnonymous();
        AllowFileUploads();
        Description(x =>
        {
            x.WithTags("CSV Import");
        });

        Summary(s => {
            s.Summary = "Upload CSV";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the account");
            s.RequestParam(r => r.UploadType, "the upload type: OFFERS, RETAILERS, RETAILERLOCATIONS, CATEGORIES, OR FILTERS");
            s.RequestParam(r => r.ImportFile, "the import file to reference");
            s.RequestParam(r => r.FileFormat, "the format of the file");
            s.RequestParam(r => r.AppKey, "the application key");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UploadCSVRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

