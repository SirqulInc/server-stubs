
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateScoreRequest
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
    /// The game application key to save the score for.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// The missionId to score for, ignore if not playing mission.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionId")]
    public long? MissionId { get; set; }
    /// <summary>
    /// The gameId to score for, ignore if not playing mission.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameId")]
    public long? GameId { get; set; }
    /// <summary>
    /// The packId to score for, send -2 if playing community levels.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("packId")]
    public long? PackId { get; set; }
    /// <summary>
    /// The gameLevelId to score for.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameLevelId")]
    public long? GameLevelId { get; set; }
    /// <summary>
    /// The gameObjectId to score for, ignore if level based scoring.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameObjectId")]
    public long? GameObjectId { get; set; }
    /// <summary>
    /// The score
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("points")]
    public int Points { get; set; }
    /// <summary>
    /// The time taken to complete task
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("timeTaken")]
    public int? TimeTaken { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("highest")]
    public bool? Highest { get; set; }
}
public class GetScoreRequest
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
    /// The game application key to get the level for.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// The missionId to score for, null if not playing mission.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionId")]
    public long? MissionId { get; set; }
    /// <summary>
    /// The gameId to score for, null if not playing mission.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameId")]
    public long? GameId { get; set; }
    /// <summary>
    /// The packId to score for, null if playing community levels.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("packId")]
    public long? PackId { get; set; }
    /// <summary>
    /// The gameLevelId to score for.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameLevelId")]
    public long? GameLevelId { get; set; }
    /// <summary>
    /// The gameObjectId to score for, null if level based scoring.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameObjectId")]
    public long? GameObjectId { get; set; }
    /// <summary>
    /// The object type to filter scores by (TicketObjectType)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("scoreObjectType")]
    public string? ScoreObjectType { get; set; }
    /// <summary>
    /// The status of the score to filter (ScoreStatus)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("scoreStatus")]
    public string? ScoreStatus { get; set; }
}
public class SearchScoresRequest
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
    /// The game application key to get the level for.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// The missionId to score for, null if not playing mission.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionId")]
    public long? MissionId { get; set; }
    /// <summary>
    /// The gameId to score for, null if not playing mission.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameId")]
    public long? GameId { get; set; }
    /// <summary>
    /// The packId to score for, null if playing community levels.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("packId")]
    public long? PackId { get; set; }
    /// <summary>
    /// The gameLevelId to score for.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameLevelId")]
    public long? GameLevelId { get; set; }
    /// <summary>
    /// The gameObjectId to score for, null if level based scoring.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameObjectId")]
    public long? GameObjectId { get; set; }
}


