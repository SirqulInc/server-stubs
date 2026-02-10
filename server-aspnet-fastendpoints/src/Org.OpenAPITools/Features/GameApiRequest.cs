
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateGameRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The logged in user.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The game application key to save the level for.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// Title of the game.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string? Title { get; set; }
    /// <summary>
    /// Description of the game.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// metaData of the Game.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
    /// <summary>
    /// comma separated String of pack Ids that will associate with the game.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("packIds")]
    public string? PackIds { get; set; }
    /// <summary>
    /// Show more details in response.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeGameData")]
    public bool? IncludeGameData { get; set; }
}
public class DeleteGameRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The logged in user.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the updating game&#39;s id.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameId")]
    public long GameId { get; set; }
}
public class GetGameRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The logged in user.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the updating game&#39;s id.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameId")]
    public long GameId { get; set; }
    /// <summary>
    /// If true include the game level data, otherwise don&#39;t. default is false.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeGameData")]
    public bool? IncludeGameData { get; set; }
}
public class SearchGamesRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The logged in user.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// Match the keyword to the owner name or level name.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// Start the result set at some index.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// Limit the result to some number.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
    /// <summary>
    /// The maximum version of the level to return.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appVersion")]
    public string? AppVersion { get; set; }
    /// <summary>
    /// more details in response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeGameData")]
    public bool? IncludeGameData { get; set; }
    /// <summary>
    /// more details in response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeInactive")]
    public bool? IncludeInactive { get; set; }
}
public class UpdateGameRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The logged in user.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the updating game&#39;s id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameId")]
    public long? GameId { get; set; }
    /// <summary>
    /// The game application key to save the level for.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// Title of the Game.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string? Title { get; set; }
    /// <summary>
    /// Description of the Game.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// metaData of the Game.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
    /// <summary>
    /// comma separated String of pack Ids that will associate with the game.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("packIds")]
    public string? PackIds { get; set; }
    /// <summary>
    /// show more details in response.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeGameData")]
    public bool? IncludeGameData { get; set; }
}


