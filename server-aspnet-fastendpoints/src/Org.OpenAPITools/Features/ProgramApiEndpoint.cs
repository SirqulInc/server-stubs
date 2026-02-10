using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Program
/// </summary>

public class CreateProgramEndpoint : FastEndpoints.Endpoint<CreateProgramRequest, Program>
{
    public override void Configure()
    {
        Post("/api/{version}/program");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Program");
        });

        Summary(s => {
            s.Summary = "Create Program";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateProgramRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Program
/// </summary>

public class DeleteProgramEndpoint : FastEndpoints.Endpoint<DeleteProgramRequest>
{
    public override void Configure()
    {
        Delete("/api/{version}/program/{id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Program");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Delete Program";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Id, "the id of the program");
            s.Responses[0] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteProgramRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Program
/// </summary>

public class GetProgramEndpoint : FastEndpoints.Endpoint<GetProgramRequest, Program>
{
    public override void Configure()
    {
        Get("/api/{version}/program/{id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Program");
        });

        Summary(s => {
            s.Summary = "Get Program";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Id, "the id of the program");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetProgramRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Program
/// </summary>

public class PostProgramEndpoint : FastEndpoints.Endpoint<PostProgramRequest, Program>
{
    public override void Configure()
    {
        Post("/api/{version}/program/{id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Program");
        });

        Summary(s => {
            s.Summary = "Update Program";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Id, "the id of the program");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(PostProgramRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Program
/// </summary>

public class PutProgramEndpoint : FastEndpoints.Endpoint<PutProgramRequest, Program>
{
    public override void Configure()
    {
        Put("/api/{version}/program/{id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Program");
        });

        Summary(s => {
            s.Summary = "Update Program";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Id, "the id of the program");
            s.RequestParam(r => r.body, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(PutProgramRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Programs
/// </summary>

public class SearchProgramsEndpoint : FastEndpoints.Endpoint<SearchProgramsRequest, List<Program>>
{
    public override void Configure()
    {
        Get("/api/{version}/program");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Program");
        });

        Summary(s => {
            s.Summary = "Search Programs";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.SortField, "The field to sort by");
            s.RequestParam(r => r.Descending, "Determines whether the sorted list is in descending or ascending order");
            s.RequestParam(r => r.Start, "The start index for pagination");
            s.RequestParam(r => r.Limit, "The limit for pagination");
            s.RequestParam(r => r.ActiveOnly, "Return only active results");
            s.RequestParam(r => r.Keyword, "The keyword to filter results by");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchProgramsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

