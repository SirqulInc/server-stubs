using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create Game Level
/// </summary>

public class CreateGameLevelEndpoint : FastEndpoints.Endpoint<CreateGameLevelRequest, GameLevelResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/level/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Game Level");
        });

        Summary(s => {
            s.Summary = "Create Game Level";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.Name, "The name of the level.");
            s.RequestParam(r => r.GameData, "The game level data: xml, json, or other text based format.");
            s.RequestParam(r => r.GameDataSuffix, "The game level data format type.");
            s.RequestParam(r => r.AppKey, "The game application key to save the level for.");
            s.RequestParam(r => r.Description, "The description of the level.");
            s.RequestParam(r => r.Difficulty, "The difficulty, possible values are: VERY_EASY, EASY, MEDIUM, HARD, VERY_HARD.");
            s.RequestParam(r => r.AppVersion, "The version number of the application required to correctly load/play the level.");
            s.RequestParam(r => r.AssetImageId, "The asset Id of the level image.");
            s.RequestParam(r => r.AssetIconId, "The asset Id of the level icon.");
            s.RequestParam(r => r.Visibility, "Is the level visible to others, possible values are: PUBLIC, PRIVATE.");
            s.RequestParam(r => r.FriendGroup, "Make the level be readable by all friends.");
            s.RequestParam(r => r.ConnectionIds, "Make the level be readable by connections in this list.");
            s.RequestParam(r => r.ConnectionGroupIds, "Make the level be readable by connection groups in this list.");
            s.RequestParam(r => r.Balance, "Set the amount of money available to spend, once 0 deactivate level. Set to a negative value for unlimited.");
            s.RequestParam(r => r.Active, "If true set the game level as active. Default is false.");
            s.RequestParam(r => r.AllocateTickets, "If true then scoring will give tickets. Default is false.");
            s.RequestParam(r => r.TicketCount, "The number of tickets to reward");
            s.RequestParam(r => r.TicketType, "The type of ticket to reward, null means default type");
            s.RequestParam(r => r.Points, "The number of points to award for completing a level");
            s.RequestParam(r => r.TutorialTitle, "Title of the tutorial.");
            s.RequestParam(r => r.TutorialMessage, "Message of the tutotrial.");
            s.RequestParam(r => r.TutorialAlignment, "Alignment of the tutorial image. Default to NONE. Possible values are: NONE, IMAGE_ABOVE, IMAGE_BELOW, IMAGE_LEFT, IMAGE_RIGHT, IMAGE_ONLY, TEXT_ONLY");
            s.RequestParam(r => r.TutorialImageAssetId, "Asset id of the tutorial image.");
            s.RequestParam(r => r.OfferId, "id of the offer");
            s.RequestParam(r => r.MetaData, "external custom client defined data");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateGameLevelRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete Game Level
/// </summary>

public class DeleteGameLevelEndpoint : FastEndpoints.Endpoint<DeleteGameLevelRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/level/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Game Level");
        });

        Summary(s => {
            s.Summary = "Delete Game Level";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.LevelId, "The id of the level to return.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteGameLevelRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Game Level
/// </summary>

public class GetGameLevelEndpoint : FastEndpoints.Endpoint<GetGameLevelRequest, GameLevelResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/level/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Game Level");
        });

        Summary(s => {
            s.Summary = "Get Game Level";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.LevelId, "The id of the level to return.");
            s.RequestParam(r => r.IncludeGameData, "If true include the game level data, otherwise don&#39;t. default is false.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetGameLevelRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Game Levels
/// </summary>

public class GetGameLevelsByApplicationEndpoint : FastEndpoints.Endpoint<GetGameLevelsByApplicationRequest, GameLevelListResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/level/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Game Level");
        });

        Summary(s => {
            s.Summary = "Search Game Levels";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.Keyword, "Match the keyword to the owner name or level name.");
            s.RequestParam(r => r.SortField, "what field to sort on");
            s.RequestParam(r => r.Descending, "whether to return levels in ascending or descending order");
            s.RequestParam(r => r.Start, "Start the result set at some index.");
            s.RequestParam(r => r.Limit, "Limit the result to some number.");
            s.RequestParam(r => r.AppVersion, "The maximum version of the level to return.");
            s.RequestParam(r => r.IncludeGameData, "If true include the game level data, otherwise don&#39;t. default is false.");
            s.RequestParam(r => r.Filters, "");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetGameLevelsByApplicationRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search Game Level by Billable Entity
/// </summary>

public class GetGameLevelsByBillableEntityEndpoint : FastEndpoints.Endpoint<GetGameLevelsByBillableEntityRequest, GameLevelResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/level/searchByBillableEntity");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Game Level");
        });

        Summary(s => {
            s.Summary = "Search Game Level by Billable Entity";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The account id of the user");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.Keyword, "The keyword used to search");
            s.RequestParam(r => r.SortField, "The column to sort the search on");
            s.RequestParam(r => r.Descending, "The order to return the search results");
            s.RequestParam(r => r.ActiveOnly, "Return only active results");
            s.RequestParam(r => r.Start, "The record to begin the return set on");
            s.RequestParam(r => r.Limit, "The number of records to return");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetGameLevelsByBillableEntityRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Level Questions
/// </summary>

public class GetQuestionsInLevelEndpoint : FastEndpoints.Endpoint<GetQuestionsInLevelRequest, QuestionResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/level/questions/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Game Level");
        });

        Summary(s => {
            s.Summary = "Get Level Questions";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.LevelId, "the id of the level to get questions from");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetQuestionsInLevelRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Level Words
/// </summary>

public class GetWordsInLevelEndpoint : FastEndpoints.Endpoint<GetWordsInLevelRequest, WordzWordResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/level/words/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Game Level");
        });

        Summary(s => {
            s.Summary = "Get Level Words";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.LevelId, "the id of the level to get words for");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetWordsInLevelRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Game Level
/// </summary>

public class UpdateGameLevelEndpoint : FastEndpoints.Endpoint<UpdateGameLevelRequest, GameLevelResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/level/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Game Level");
        });

        Summary(s => {
            s.Summary = "Update Game Level";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.LevelId, "If update then include the level Id.");
            s.RequestParam(r => r.AppKey, "The game application key to save the level for.");
            s.RequestParam(r => r.Name, "The name of the level.");
            s.RequestParam(r => r.Description, "The description of the level.");
            s.RequestParam(r => r.Difficulty, "The difficulty, possible values are: VERY_EASY, EASY, MEDIUM, HARD, VERY_HARD.");
            s.RequestParam(r => r.AppVersion, "The version number of the applicatuion required to correctly load/play the level.");
            s.RequestParam(r => r.AssetImageId, "The asset Id of the level image.");
            s.RequestParam(r => r.AssetIconId, "The asset Id of the level icon.");
            s.RequestParam(r => r.GameData, "The game level data: xml, json, or other texted based format.");
            s.RequestParam(r => r.GameDataSuffix, "The game level data format type.");
            s.RequestParam(r => r.Visibility, "Is the level visible to others, possible values are: PUBLIC, PRIVATE.");
            s.RequestParam(r => r.FriendGroup, "Make the level be readable by all friends.");
            s.RequestParam(r => r.ConnectionIds, "Make the level be readable by connections in this list.");
            s.RequestParam(r => r.ConnectionGroupIds, "Make the level be readable by connection groups in this list.");
            s.RequestParam(r => r.Balance, "Set the amount of money available to spend, once 0 deactivate level. Set to a negative value for unlimited.");
            s.RequestParam(r => r.Active, "If true set the game level as active.");
            s.RequestParam(r => r.AllocateTickets, "If true then scoring will give tickets.");
            s.RequestParam(r => r.TicketCount, "The number of tickets to reward");
            s.RequestParam(r => r.TicketType, "The type of ticket to reward, null means default type");
            s.RequestParam(r => r.Points, "The number of points to award for completing a level");
            s.RequestParam(r => r.TutorialTitle, "Title of the tutorial.");
            s.RequestParam(r => r.TutorialMessage, "Message of the tutorial.");
            s.RequestParam(r => r.TutorialAlignment, "Alignment of the tutorial image, possible values are: NONE, IMAGE_ABOVE, IMAGE_BELOW, IMAGE_LEFT, IMAGE_RIGHT, IMAGE_ONLY, TEXT_ONLY");
            s.RequestParam(r => r.TutorialImageAssetId, "Asset id of the tutorial image.");
            s.RequestParam(r => r.OfferId, "");
            s.RequestParam(r => r.MetaData, "external custom client defined data");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateGameLevelRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Level Questions
/// </summary>

public class UpdateQuestionsInLevelEndpoint : FastEndpoints.Endpoint<UpdateQuestionsInLevelRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/level/questions/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Game Level");
        });

        Summary(s => {
            s.Summary = "Update Level Questions";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.LevelId, "the id of the level to update questions on");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.RequestParam(r => r.QuestionIds, "the IDs of the questions to update");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateQuestionsInLevelRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update Level Words
/// </summary>

public class UpdateWordsInLevelEndpoint : FastEndpoints.Endpoint<UpdateWordsInLevelRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/level/words/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Game Level");
        });

        Summary(s => {
            s.Summary = "Update Level Words";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.LevelId, "the id of the level to update words for");
            s.RequestParam(r => r.AccountId, "the id of the logged in user");
            s.RequestParam(r => r.WordIds, "the ids of the words to update for the level");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateWordsInLevelRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

