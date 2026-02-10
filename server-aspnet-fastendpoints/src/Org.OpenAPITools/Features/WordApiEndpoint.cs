using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Word
/// </summary>

public class CreateWordEndpoint : FastEndpoints.Endpoint<CreateWordRequest, WordzWordResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/game/word/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Word");
        });

        Summary(s => {
            s.Summary = "Create Word";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.Word, "The text of the word.");
            s.RequestParam(r => r.Definition, "The definition of the word.");
            s.RequestParam(r => r.Active, "If true set the word to active. Default to false.");
            s.RequestParam(r => r.AllocateTickets, "If true then scoring will give tickets. Default to false.");
            s.RequestParam(r => r.TicketCount, "The number of tickets to reward");
            s.RequestParam(r => r.AssetId, "The asset id of the word.");
            s.RequestParam(r => r.TicketType, "The type of ticket to reward, null means default type");
            s.RequestParam(r => r.Points, "The number of points to award for completing a mission");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateWordRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Word
/// </summary>

public class DeleteWordEndpoint : FastEndpoints.Endpoint<DeleteWordRequest, SirqulResponse>
{
    public override void Configure()
    {
        Delete("/api/{version}/game/word/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Word");
        });

        Summary(s => {
            s.Summary = "Delete Word";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.WordId, "The id of the word to delete.");
            s.RequestParam(r => r.AccountId, "The account vor validating permission");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteWordRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Word
/// </summary>

public class GetWordEndpoint : FastEndpoints.Endpoint<GetWordRequest, WordzWordResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/game/word/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Word");
        });

        Summary(s => {
            s.Summary = "Get Word";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.WordId, "The id of the word to get.");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetWordRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Words
/// </summary>

public class GetWordsEndpoint : FastEndpoints.Endpoint<GetWordsRequest, List<WordzWordResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/game/word/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Word");
        });

        Summary(s => {
            s.Summary = "Search Words";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.SortField, "The column to sort the search on");
            s.RequestParam(r => r.Descending, "The order to return the search results");
            s.RequestParam(r => r.ActiveOnly, "Return only active results if set to true.");
            s.RequestParam(r => r.Start, "The record to begin the return set on.");
            s.RequestParam(r => r.Limit, "The number of records to return.");
            s.RequestParam(r => r.Keyword, "The keyword for searching words with matching definition or word text.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetWordsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Word
/// </summary>

public class UpdateWordEndpoint : FastEndpoints.Endpoint<UpdateWordRequest, WordzWordResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/game/word/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Word");
        });

        Summary(s => {
            s.Summary = "Update Word";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.WordId, "The id of the word to update.");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.TicketCount, "The number of tickets to reward");
            s.RequestParam(r => r.WordText, "The text for the word");
            s.RequestParam(r => r.Definition, "The definition of the word.");
            s.RequestParam(r => r.AssetId, "The asset id of the word.");
            s.RequestParam(r => r.Active, "If true set the word to active.");
            s.RequestParam(r => r.AllocateTickets, "If true then scoring will give tickets.");
            s.RequestParam(r => r.TicketType, "The type of ticket to reward, null means default type");
            s.RequestParam(r => r.Points, "The number of points to award for completing a mission");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateWordRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

