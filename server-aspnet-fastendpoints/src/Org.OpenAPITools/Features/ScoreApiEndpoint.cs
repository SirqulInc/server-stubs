using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Score
/// </summary>

public class CreateScoreEndpoint : FastEndpoints.Endpoint<CreateScoreRequest, ScoreResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/score/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Score");
        });

        Summary(s => {
            s.Summary = "Create Score";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.AppKey, "The game application key to save the score for.");
            s.RequestParam(r => r.Points, "The score");
            s.RequestParam(r => r.MissionId, "The missionId to score for, ignore if not playing mission.");
            s.RequestParam(r => r.GameId, "The gameId to score for, ignore if not playing mission.");
            s.RequestParam(r => r.PackId, "The packId to score for, send -2 if playing community levels.");
            s.RequestParam(r => r.GameLevelId, "The gameLevelId to score for.");
            s.RequestParam(r => r.GameObjectId, "The gameObjectId to score for, ignore if level based scoring.");
            s.RequestParam(r => r.TimeTaken, "The time taken to complete task");
            s.RequestParam(r => r.Highest, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateScoreRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Score
/// </summary>

public class GetScoreEndpoint : FastEndpoints.Endpoint<GetScoreRequest, ScoreResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/score/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Score");
        });

        Summary(s => {
            s.Summary = "Get Score";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.AppKey, "The game application key to get the level for.");
            s.RequestParam(r => r.MissionId, "The missionId to score for, null if not playing mission.");
            s.RequestParam(r => r.GameId, "The gameId to score for, null if not playing mission.");
            s.RequestParam(r => r.PackId, "The packId to score for, null if playing community levels.");
            s.RequestParam(r => r.GameLevelId, "The gameLevelId to score for.");
            s.RequestParam(r => r.GameObjectId, "The gameObjectId to score for, null if level based scoring.");
            s.RequestParam(r => r.ScoreObjectType, "The object type to filter scores by (TicketObjectType)");
            s.RequestParam(r => r.ScoreStatus, "The status of the score to filter (ScoreStatus)");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetScoreRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Score
/// </summary>

public class SearchScoresEndpoint : FastEndpoints.Endpoint<SearchScoresRequest, List<ScoreResponse>>
{
    public override void Configure()
    {
        Get("/api/{version}/score/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Score");
        });

        Summary(s => {
            s.Summary = "Search Score";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.AppKey, "The game application key to get the level for.");
            s.RequestParam(r => r.MissionId, "The missionId to score for, null if not playing mission.");
            s.RequestParam(r => r.GameId, "The gameId to score for, null if not playing mission.");
            s.RequestParam(r => r.PackId, "The packId to score for, null if playing community levels.");
            s.RequestParam(r => r.GameLevelId, "The gameLevelId to score for.");
            s.RequestParam(r => r.GameObjectId, "The gameObjectId to score for, null if level based scoring.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchScoresRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

