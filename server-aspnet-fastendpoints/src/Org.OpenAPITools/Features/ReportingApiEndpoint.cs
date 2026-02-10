using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Offline Report
/// </summary>

public class CreateBatchEndpoint : FastEndpoints.Endpoint<CreateBatchRequest, ReportBatchResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/report/batch/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Reporting");
        });

        Summary(s => {
            s.Summary = "Create Offline Report";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the user for passing account related params");
            s.RequestParam(r => r.Status, "the status of the report");
            s.RequestParam(r => r.PreviewLimit, "the limit on how much you can preview of the batch report");
            s.RequestParam(r => r.AppKey, "The application key for passing application related params");
            s.RequestParam(r => r.Endpoint, "");
            s.RequestParam(r => r.Parameters, "a json structure list of the parameter values, example: &#x60;&#x60;&#x60;json {   \&quot;string\&quot;:\&quot;value\&quot;,    \&quot;number\&quot;:3.345,   \&quot;date\&quot;:\&quot;2014-05-01 00:00:00\&quot; } &#x60;&#x60;&#x60; ");
            s.RequestParam(r => r.Name, "name of the batch report");
            s.RequestParam(r => r.StartDate, "the start date of the batch report");
            s.RequestParam(r => r.EndDate, "the end date of the batch report");
            s.RequestParam(r => r.Description, "the description of the batch report");
            s.RequestParam(r => r.PageUrl, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateBatchRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create Offline Report
/// </summary>

public class CreateRegionLegSummaryBatchEndpoint : FastEndpoints.Endpoint<CreateRegionLegSummaryBatchRequest, ReportRegionLegSummaryBatchResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/report/region/summary/batch");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Reporting");
        });

        Summary(s => {
            s.Summary = "Create Offline Report";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateRegionLegSummaryBatchRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Offline Report
/// </summary>

public class DeleteBatchEndpoint : FastEndpoints.Endpoint<DeleteBatchRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/report/batch/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Reporting");
        });

        Summary(s => {
            s.Summary = "Delete Offline Report";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the account");
            s.RequestParam(r => r.BatchId, "the id of the batch to delete");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteBatchRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Offline Report
/// </summary>

public class GetReportBatchEndpoint : FastEndpoints.Endpoint<GetReportBatchRequest, ReportBatchResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/report/batch/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Reporting");
        });

        Summary(s => {
            s.Summary = "Get Offline Report";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.RequestParam(r => r.BatchId, "returned by /report/batch/create");
            s.RequestParam(r => r.AllResults, "whether to return all batch results or not");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetReportBatchRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Run Report
/// </summary>

public class RunReportEndpoint : FastEndpoints.Endpoint<RunReportRequest, ReportResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/report/run");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Reporting");
        });

        Summary(s => {
            s.Summary = "Run Report";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Desc, "If true then descending order, false is ascending");
            s.RequestParam(r => r.AccountId, "The account id of the user for passing account related params");
            s.RequestParam(r => r.Query, "The named identifier of the query");
            s.RequestParam(r => r.Parameters, "Parameter values used in the query in JSON format, example: &#x60;&#x60;&#x60;json {   \&quot;string\&quot;:\&quot;value\&quot;,    \&quot;number\&quot;:3.345,   \&quot;date\&quot;:\&quot;2014-05-01 00:00:00\&quot; } &#x60;&#x60;&#x60; ");
            s.RequestParam(r => r.Order, "The order to use, must be a column name (see response results for list of column names)");
            s.RequestParam(r => r.Start, "The start of the pagination");
            s.RequestParam(r => r.Limit, "The limit of the pagination");
            s.RequestParam(r => r.ResponseFormat, "Determines what response format to return. Options are: JSON or CSV");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(RunReportRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Offline Reports
/// </summary>

public class SearchBatchEndpoint : FastEndpoints.Endpoint<SearchBatchRequest, List<ReportBatchResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/report/batch/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Reporting");
        });

        Summary(s => {
            s.Summary = "Search Offline Reports";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the account logged in");
            s.RequestParam(r => r.Start, "the start of the index and/or pagination");
            s.RequestParam(r => r.Limit, "the limit of the index and/or pagination");
            s.RequestParam(r => r.Names, "the names of the report batch to search on");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.Status, "the report batch status");
            s.RequestParam(r => r.GlobalAppSearch, "the global app to search on");
            s.RequestParam(r => r.StartDate, "the start date of the report batch to search on");
            s.RequestParam(r => r.EndDate, "the end date of the report batch to search on");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchBatchRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

