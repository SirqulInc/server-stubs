using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Get App Data
/// </summary>

public class GetAppDataEndpoint : FastEndpoints.Endpoint<GetAppDataRequest, AppResponse>
{
    public override void Configure()
    {
        Get("/api/{version}/app/get");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("AppData");
        });

        Summary(s => {
            s.Summary = "Get App Data";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.Start, "start the search results at a record.");
            s.RequestParam(r => r.Limit, "limit the search results to some number.");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required).");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required).");
            s.RequestParam(r => r.GameType, "the game to retrieve the data for, use your application key.");
            s.RequestParam(r => r.IncludeGameData, "if true then include the game data blob, otherwise don&#39;t include.");
            s.RequestParam(r => r.Q, "This parameter is deprecated.");
            s.RequestParam(r => r.Keyword, "query string used to filter the search results when looking for community and saved levels.");
            s.RequestParam(r => r.SortField, "how to sort the results when looking for community and saved levels. possible values are: LEVEL_NAME, LEVEL_CREATED, LEVEL_UPDATED, LEVEL_LIKES, LEVEL_DISLIKES, LEVEL_NOTES, LEVEL_PLAYS.");
            s.RequestParam(r => r.Descending, "order the search results descending or ascending when looking for community and saved levels.");
            s.RequestParam(r => r.I, "This parameter is deprecated.");
            s.RequestParam(r => r.L, "This parameter is deprecated.");
            s.RequestParam(r => r.GameObjectCount, "if true then include the game object count, otherwise don&#39;t include.");
            s.RequestParam(r => r.Filter, "restrict the search to items with certain permissions, possible values are: MINE, FRIENDS, PUBLIC, ALL_PUBLIC, ALL, LIKED");
            s.RequestParam(r => r.DateCreated, "restrict the search to items created less then date");
            s.RequestParam(r => r.OwnerId, "get levels owned by a particular account");
            s.RequestParam(r => r.MissionIds, "get missions by specified id, comman seperated list of long ids");
            s.RequestParam(r => r.GameIds, "get games by specified id, comman seperated list of long ids");
            s.RequestParam(r => r.PackIds, "get packs by specified id, comman seperated list of long ids");
            s.RequestParam(r => r.GameLevelIds, "get game levels by specified id, comman seperated list of long ids");
            s.RequestParam(r => r.AppVersion, "the application version, used to versin the game level data");
            s.RequestParam(r => r.IncludeHigherVersionPacks, "default is false and will not include any packs that have levels above the specified appVersion. If true then will return all levels regardless of version.");
            s.RequestParam(r => r.IncludeHigherVersionLevels, "default is false and will not include any levels above the specified appVersion. If true then will return all levels regardless of version.");
            s.RequestParam(r => r.ResponseGroups, "use response groups to include large parts of the structure. possible values are: * MISSION_DEFAULT (default) - include the default mission (built-in packs), excludes all other mission groups * MISSION_DEFAULT_LEVELS_SAVED - include saved levels, excludes all other mission groups * MISSION_DEFAULT_LEVELS_COMMUNITY - include community levels, excludes all other mission groups * MISSION_INVITED (default) - include challenges sent to user * PROFILE (default) - include entire profile * PROFILE_DATA - only include profile date (exclude friends) * PROFILE_FRIENDS - include friends list ");
            s.RequestParam(r => r.PurchaseType, "the will return the correct in app purchases for the device, possible values are: * SIRQUL (default) - purchasing from the sirqul store using tickets * IOS - purchasing from the itunes store for iPhone, iPod, iPod Touch * GOOGLE - purchasing from the google android store * AMAZON - purchasing from the amazon android store * MAC - purchasing from the itunes store for OSX * FREE - the item is free to purchase ");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(GetAppDataRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create App Data
/// </summary>

public class PostAppDataEndpoint : FastEndpoints.Endpoint<PostAppDataRequest, AppResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/app/post");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("AppData");
        });

        Summary(s => {
            s.Summary = "Create App Data";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.GameType, "the game to retrieve the data for, use your application key.");
            s.RequestParam(r => r.Start, "start the search results at a record.");
            s.RequestParam(r => r.Limit, "limit the search results to some number.");
            s.RequestParam(r => r.Data, "The analytic data AnalyticListResponse");
            s.RequestParam(r => r.DeviceId, "the device id (deviceId or accountId required).");
            s.RequestParam(r => r.AccountId, "the account id of the user (deviceId or accountId required).");
            s.RequestParam(r => r.IncludeGameData, "if true then include the game data blob, otherwise don&#39;t include.");
            s.RequestParam(r => r.Q, "This parameter is deprecated.");
            s.RequestParam(r => r.Keyword, "query string used to filter the search results when looking for community and saved levels.");
            s.RequestParam(r => r.SortField, "how to sort the results when looking for community and saved levels. possible values are: LEVEL_NAME, LEVEL_CREATED, LEVEL_UPDATED, LEVEL_LIKES, LEVEL_DISLIKES, LEVEL_NOTES, LEVEL_PLAYS.");
            s.RequestParam(r => r.Descending, "order the search results descending or ascending when looking for community and saved levels.");
            s.RequestParam(r => r.I, "This parameter is deprecated.");
            s.RequestParam(r => r.L, "This parameter is deprecated.");
            s.RequestParam(r => r.GameObjectCount, "if true then include the game object count, otherwise don&#39;t include.");
            s.RequestParam(r => r.Filter, "restrict the search to items with certain permissions, possible values are: MINE, FRIENDS, PUBLIC, ALL_PUBLIC, ALL, LIKED");
            s.RequestParam(r => r.DateCreated, "restrict the search to items created less then date");
            s.RequestParam(r => r.OwnerId, "get levels owned by a particular account");
            s.RequestParam(r => r.MissionIds, "get missions by specified id, comman seperated list of long ids");
            s.RequestParam(r => r.GameIds, "get games by specified id, comman seperated list of long ids");
            s.RequestParam(r => r.PackIds, "get packs by specified id, comman seperated list of long ids");
            s.RequestParam(r => r.GameLevelIds, "get game levels by specified id, comman seperated list of long ids");
            s.RequestParam(r => r.AppVersion, "the application version, used to versin the game level data");
            s.RequestParam(r => r.IncludeHigherVersionPacks, "default is false and will not include any packs that have levels above the specified appVersion. If true then will return all levels regardless of version.");
            s.RequestParam(r => r.IncludeHigherVersionLevels, "default is false and will not include any levels above the specified appVersion. If true then will return all levels regardless of version.");
            s.RequestParam(r => r.ResponseGroups, "use response groups to include large parts of the structure. possible values are: * MISSION_DEFAULT (default) - include the default mission (built-in packs), excludes all other mission groups * MISSION_DEFAULT_LEVELS_SAVED - include saved levels, excludes all other mission groups * MISSION_DEFAULT_LEVELS_COMMUNITY - include community levels, excludes all other mission groups * MISSION_INVITED (default) - include challenges sent to user * PROFILE (default) - include entire profile * PROFILE_DATA - only include profile date (exclude friends) * PROFILE_FRIENDS - include friends list ");
            s.RequestParam(r => r.PurchaseType, "the will return the correct in app purchases for the device, possible values are: * SIRQUL (default) - purchasing from the sirqul store using tickets * IOS - purchasing from the itunes store for iPhone, iPod, iPod Touch * GOOGLE - purchasing from the google android store * AMAZON - purchasing from the amazon android store * MAC - purchasing from the itunes store for OSX * FREE - the item is free to purchase ");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(PostAppDataRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Regenerate App Data
/// </summary>

public class RegenAppDataEndpoint : FastEndpoints.Endpoint<RegenAppDataRequest, SirqulResponse>
{
    public override void Configure()
    {
        Post("/api/{version}/app/regen");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("AppData");
        });

        Summary(s => {
            s.Summary = "Regenerate App Data";
            s.RequestParam(r => r.Version, "");
            s.RequestParam(r => r.AccountId, "the account id of the user");
            s.RequestParam(r => r.AppKey, "process a specific application, if null process all apps with caches");
            s.RequestParam(r => r.BuildVersion, "create a specific version, if null use current version. Be careful if processing all");
            s.RequestParam(r => r.ApiVersion, "create a specific version, if null use current version. Be careful if processing all");
            s.Responses[200] = "successful operation";
        });
    }

    public override async Task HandleAsync(RegenAppDataRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

