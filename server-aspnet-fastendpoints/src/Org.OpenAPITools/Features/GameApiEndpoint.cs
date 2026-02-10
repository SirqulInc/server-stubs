using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create a Game
/// </summary>

public class CreateGameEndpoint : FastEndpoints.Endpoint<CreateGameRequest, GameResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/game/create");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Game");
        });

        Summary(s => {
            s.Summary = "Create a Game";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.AppKey, "The game application key to save the level for.");
            s.RequestParam(r => r.Title, "Title of the game.");
            s.RequestParam(r => r.Description, "Description of the game.");
            s.RequestParam(r => r.MetaData, "metaData of the Game.");
            s.RequestParam(r => r.PackIds, "comma separated String of pack Ids that will associate with the game.");
            s.RequestParam(r => r.IncludeGameData, "Show more details in response.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(CreateGameRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete a Game
/// </summary>

public class DeleteGameEndpoint : FastEndpoints.Endpoint<DeleteGameRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/game/delete");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Game");
        });

        Summary(s => {
            s.Summary = "Delete a Game";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.GameId, "the updating game&#39;s id.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(DeleteGameRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get a Game by id
/// </summary>

public class GetGameEndpoint : FastEndpoints.Endpoint<GetGameRequest, GameResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/game/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Game");
        });

        Summary(s => {
            s.Summary = "Get a Game by id";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.GameId, "the updating game&#39;s id.");
            s.RequestParam(r => r.IncludeGameData, "If true include the game level data, otherwise don&#39;t. default is false.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetGameRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Search a Game
/// </summary>

public class SearchGamesEndpoint : FastEndpoints.Endpoint<SearchGamesRequest, GameResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/game/search");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Game");
        });

        Summary(s => {
            s.Summary = "Search a Game";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.AppKey, "the application key");
            s.RequestParam(r => r.Start, "Start the result set at some index.");
            s.RequestParam(r => r.Limit, "Limit the result to some number.");
            s.RequestParam(r => r.Keyword, "Match the keyword to the owner name or level name.");
            s.RequestParam(r => r.AppVersion, "The maximum version of the level to return.");
            s.RequestParam(r => r.IncludeGameData, "more details in response");
            s.RequestParam(r => r.IncludeInactive, "more details in response");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(SearchGamesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Update a Game
/// </summary>

public class UpdateGameEndpoint : FastEndpoints.Endpoint<UpdateGameRequest, GameResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/game/update");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Game");
        });

        Summary(s => {
            s.Summary = "Update a Game";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "The logged in user.");
            s.RequestParam(r => r.GameId, "the updating game&#39;s id");
            s.RequestParam(r => r.AppKey, "The game application key to save the level for.");
            s.RequestParam(r => r.Title, "Title of the Game.");
            s.RequestParam(r => r.Description, "Description of the Game.");
            s.RequestParam(r => r.MetaData, "metaData of the Game.");
            s.RequestParam(r => r.PackIds, "comma separated String of pack Ids that will associate with the game.");
            s.RequestParam(r => r.IncludeGameData, "show more details in response.");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(UpdateGameRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

