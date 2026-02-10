
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class GetAppDataRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the device id (deviceId or accountId required).
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required).
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the game to retrieve the data for, use your application key.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameType")]
    public string? GameType { get; set; }
    /// <summary>
    /// if true then include the game data blob, otherwise don&#39;t include.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeGameData")]
    public bool? IncludeGameData { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
    /// <summary>
    /// query string used to filter the search results when looking for community and saved levels.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// how to sort the results when looking for community and saved levels. possible values are: LEVEL_NAME, LEVEL_CREATED, LEVEL_UPDATED, LEVEL_LIKES, LEVEL_DISLIKES, LEVEL_NOTES, LEVEL_PLAYS.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// order the search results descending or ascending when looking for community and saved levels.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_i")]
    public int? I { get; set; }
    /// <summary>
    /// start the search results at a record.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_l")]
    public int? L { get; set; }
    /// <summary>
    /// limit the search results to some number.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
    /// <summary>
    /// if true then include the game object count, otherwise don&#39;t include.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameObjectCount")]
    public bool? GameObjectCount { get; set; }
    /// <summary>
    /// restrict the search to items with certain permissions, possible values are: MINE, FRIENDS, PUBLIC, ALL_PUBLIC, ALL, LIKED
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filter")]
    public string? Filter { get; set; }
    /// <summary>
    /// restrict the search to items created less then date
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("dateCreated")]
    public long? DateCreated { get; set; }
    /// <summary>
    /// get levels owned by a particular account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ownerId")]
    public long? OwnerId { get; set; }
    /// <summary>
    /// get missions by specified id, comman seperated list of long ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionIds")]
    public string? MissionIds { get; set; }
    /// <summary>
    /// get games by specified id, comman seperated list of long ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameIds")]
    public string? GameIds { get; set; }
    /// <summary>
    /// get packs by specified id, comman seperated list of long ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("packIds")]
    public string? PackIds { get; set; }
    /// <summary>
    /// get game levels by specified id, comman seperated list of long ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameLevelIds")]
    public string? GameLevelIds { get; set; }
    /// <summary>
    /// the application version, used to versin the game level data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appVersion")]
    public string? AppVersion { get; set; }
    /// <summary>
    /// default is false and will not include any packs that have levels above the specified appVersion. If true then will return all levels regardless of version.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeHigherVersionPacks")]
    public bool? IncludeHigherVersionPacks { get; set; }
    /// <summary>
    /// default is false and will not include any levels above the specified appVersion. If true then will return all levels regardless of version.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeHigherVersionLevels")]
    public bool? IncludeHigherVersionLevels { get; set; }
    /// <summary>
    /// use response groups to include large parts of the structure. possible values are: * MISSION_DEFAULT (default) - include the default mission (built-in packs), excludes all other mission groups * MISSION_DEFAULT_LEVELS_SAVED - include saved levels, excludes all other mission groups * MISSION_DEFAULT_LEVELS_COMMUNITY - include community levels, excludes all other mission groups * MISSION_INVITED (default) - include challenges sent to user * PROFILE (default) - include entire profile * PROFILE_DATA - only include profile date (exclude friends) * PROFILE_FRIENDS - include friends list 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("responseGroups")]
    public string? ResponseGroups { get; set; }
    /// <summary>
    /// the will return the correct in app purchases for the device, possible values are: * SIRQUL (default) - purchasing from the sirqul store using tickets * IOS - purchasing from the itunes store for iPhone, iPod, iPod Touch * GOOGLE - purchasing from the google android store * AMAZON - purchasing from the amazon android store * MAC - purchasing from the itunes store for OSX * FREE - the item is free to purchase 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("purchaseType")]
    public string? PurchaseType { get; set; }
}
public class PostAppDataRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the device id (deviceId or accountId required).
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required).
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the game to retrieve the data for, use your application key.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameType")]
    public string GameType { get; set; }
    /// <summary>
    /// if true then include the game data blob, otherwise don&#39;t include.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeGameData")]
    public bool? IncludeGameData { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("q")]
    public string? Q { get; set; }
    /// <summary>
    /// query string used to filter the search results when looking for community and saved levels.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// how to sort the results when looking for community and saved levels. possible values are: LEVEL_NAME, LEVEL_CREATED, LEVEL_UPDATED, LEVEL_LIKES, LEVEL_DISLIKES, LEVEL_NOTES, LEVEL_PLAYS.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// order the search results descending or ascending when looking for community and saved levels.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_i")]
    public int? I { get; set; }
    /// <summary>
    /// start the search results at a record.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// This parameter is deprecated.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("_l")]
    public int? L { get; set; }
    /// <summary>
    /// limit the search results to some number.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
    /// <summary>
    /// if true then include the game object count, otherwise don&#39;t include.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameObjectCount")]
    public bool? GameObjectCount { get; set; }
    /// <summary>
    /// restrict the search to items with certain permissions, possible values are: MINE, FRIENDS, PUBLIC, ALL_PUBLIC, ALL, LIKED
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filter")]
    public string? Filter { get; set; }
    /// <summary>
    /// restrict the search to items created less then date
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("dateCreated")]
    public long? DateCreated { get; set; }
    /// <summary>
    /// get levels owned by a particular account
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ownerId")]
    public long? OwnerId { get; set; }
    /// <summary>
    /// get missions by specified id, comman seperated list of long ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionIds")]
    public string? MissionIds { get; set; }
    /// <summary>
    /// get games by specified id, comman seperated list of long ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameIds")]
    public string? GameIds { get; set; }
    /// <summary>
    /// get packs by specified id, comman seperated list of long ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("packIds")]
    public string? PackIds { get; set; }
    /// <summary>
    /// get game levels by specified id, comman seperated list of long ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameLevelIds")]
    public string? GameLevelIds { get; set; }
    /// <summary>
    /// the application version, used to versin the game level data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appVersion")]
    public string? AppVersion { get; set; }
    /// <summary>
    /// default is false and will not include any packs that have levels above the specified appVersion. If true then will return all levels regardless of version.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeHigherVersionPacks")]
    public bool? IncludeHigherVersionPacks { get; set; }
    /// <summary>
    /// default is false and will not include any levels above the specified appVersion. If true then will return all levels regardless of version.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeHigherVersionLevels")]
    public bool? IncludeHigherVersionLevels { get; set; }
    /// <summary>
    /// use response groups to include large parts of the structure. possible values are: * MISSION_DEFAULT (default) - include the default mission (built-in packs), excludes all other mission groups * MISSION_DEFAULT_LEVELS_SAVED - include saved levels, excludes all other mission groups * MISSION_DEFAULT_LEVELS_COMMUNITY - include community levels, excludes all other mission groups * MISSION_INVITED (default) - include challenges sent to user * PROFILE (default) - include entire profile * PROFILE_DATA - only include profile date (exclude friends) * PROFILE_FRIENDS - include friends list 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("responseGroups")]
    public string? ResponseGroups { get; set; }
    /// <summary>
    /// the will return the correct in app purchases for the device, possible values are: * SIRQUL (default) - purchasing from the sirqul store using tickets * IOS - purchasing from the itunes store for iPhone, iPod, iPod Touch * GOOGLE - purchasing from the google android store * AMAZON - purchasing from the amazon android store * MAC - purchasing from the itunes store for OSX * FREE - the item is free to purchase 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("purchaseType")]
    public string? PurchaseType { get; set; }
    /// <summary>
    /// The analytic data AnalyticListResponse
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("data")]
    public string Data { get; set; }
}
public class RegenAppDataRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the account id of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// process a specific application, if null process all apps with caches
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// create a specific version, if null use current version. Be careful if processing all
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("buildVersion")]
    public string? BuildVersion { get; set; }
    /// <summary>
    /// create a specific version, if null use current version. Be careful if processing all
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("apiVersion")]
    public string? ApiVersion { get; set; }
}


