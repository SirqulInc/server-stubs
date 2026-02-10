using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Question
/// </summary>

public class CreateQuestionEndpoint : FastEndpoints.Endpoint<CreateQuestionRequest, QuestionResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/game/question/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Question");
        });

        Summary(s => {
            s.Summary = "Create Question";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.RequestParam(r => r.Question, "the text of the question");
            s.RequestParam(r => r.Answers, "&#x60;&#x60;&#x60;json [   {     \&quot;text\&quot;: \&quot;1942\&quot;,     \&quot;image\&quot;: 123,     \&quot;videoURL\&quot;: \&quot;http://www.here.com\&quot;,     \&quot;correct\&quot;: true   },   {     \&quot;text\&quot;: \&quot;1943\&quot;,     \&quot;image\&quot;: 124,     \&quot;videoURL\&quot;: \&quot;http://www.there.com\&quot;,     \&quot;correct\&quot;: false   } ] &#x60;&#x60;&#x60; ");
            s.RequestParam(r => r.Active, "If true set the question to active. Default to false.");
            s.RequestParam(r => r.AllocateTickets, "If true then scoring will give tickets. Default to false.");
            s.RequestParam(r => r.TicketCount, "The number of tickets to reward");
            s.RequestParam(r => r.Tags, "The tags of the question for search.");
            s.RequestParam(r => r.VideoURL, "The video link for the question.");
            s.RequestParam(r => r.AssetId, "The asset id of the question.");
            s.RequestParam(r => r.TicketType, "The type of ticket to reward, null means default type");
            s.RequestParam(r => r.Points, "The number of points to award for completing a mission");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateQuestionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Question
/// </summary>

public class DeleteQuestionEndpoint : FastEndpoints.Endpoint<DeleteQuestionRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/game/question/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Question");
        });

        Summary(s => {
            s.Summary = "Delete Question";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.QuestionId, "the id of the question to delete");
            s.RequestParam(r => r.AccountId, "the id of the account that can execute this request");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteQuestionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Question
/// </summary>

public class GetQuestionEndpoint : FastEndpoints.Endpoint<GetQuestionRequest, QuestionResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/game/question/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Question");
        });

        Summary(s => {
            s.Summary = "Get Question";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.QuestionId, "the id of the question to get");
            s.RequestParam(r => r.AccountId, "the id of the account that can make this request");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetQuestionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Questions
/// </summary>

public class SearchQuestionsEndpoint : FastEndpoints.Endpoint<SearchQuestionsRequest, List<QuestionResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/game/question/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Question");
        });

        Summary(s => {
            s.Summary = "Search Questions";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.SortField, "The column to sort the search on");
            s.RequestParam(r => r.Descending, "The order to return the search results");
            s.RequestParam(r => r.ActiveOnly, "Return only active results if set to true.");
            s.RequestParam(r => r.Start, "The record to begin the return set on.");
            s.RequestParam(r => r.Limit, "The number of records to return.");
            s.RequestParam(r => r.Keyword, "The keyword for searching questions with matching tags or question text.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchQuestionsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Question
/// </summary>

public class UpdateQuestionEndpoint : FastEndpoints.Endpoint<UpdateQuestionRequest, QuestionResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/game/question/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Question");
        });

        Summary(s => {
            s.Summary = "Update Question";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.QuestionId, "The id of the question to update.");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.TicketCount, "The number of tickets to reward");
            s.RequestParam(r => r.Question, "The text of the question.");
            s.RequestParam(r => r.Answers, "The json representations of answers for the question.");
            s.RequestParam(r => r.Tags, "The tags of the question for search.");
            s.RequestParam(r => r.VideoURL, "The video link for the question.");
            s.RequestParam(r => r.AssetId, "The asset id of the question.");
            s.RequestParam(r => r.Active, "If true set the question to active.");
            s.RequestParam(r => r.AllocateTickets, "If true then scoring will give tickets.");
            s.RequestParam(r => r.TicketType, "The type of ticket to reward, null means default type");
            s.RequestParam(r => r.Points, "The number of points to award for completing a mission");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateQuestionRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

