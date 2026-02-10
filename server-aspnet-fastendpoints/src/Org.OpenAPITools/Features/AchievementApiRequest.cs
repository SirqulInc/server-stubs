
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class ApiVersionAchievementTierSearchPostRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// a unique id given by the device (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// the keyword used to filter resutls with (this returns results that have the keyword in the title or the description of the achievement tier)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// filter results by achievementType (these are exact case sensitive matches)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("achievementType")]
    public long? AchievementType { get; set; }
    /// <summary>
    /// filter results by the rankType (these are the exact case sensitive matches)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("rankType")]
    public string? RankType { get; set; }
    /// <summary>
    /// the field to sort by. See {@link AchievementApiMap}
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// determines whether the sort list is in descending or ascending order (of the achievement)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// determines whether the results are in descending or ascending order by the tier goal count (after the initial sort on the achievement)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descendingGoal")]
    public bool? DescendingGoal { get; set; }
    /// <summary>
    /// The start of the index for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public long? Start { get; set; }
    /// <summary>
    /// the limit for pagination (has a hard limit of 1000)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public long? Limit { get; set; }
}
public class CreateAchievementRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// a unique id given by the device (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the application key the achievement is for
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// the analytics tag that will trigger when a user&#39;s achievement count gets updated
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("analyticsTag")]
    public string? AnalyticsTag { get; set; }
    /// <summary>
    /// the title of the achievement (255 character limit)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string Title { get; set; }
    /// <summary>
    /// the description of the achievement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// the rank type for updating leader boards
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("rankType")]
    public string? RankType { get; set; }
    /// <summary>
    /// determines how much the rank count is incremented
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("rankIncrement")]
    public int? RankIncrement { get; set; }
    /// <summary>
    /// restrict scores to be above or equal to this minimum value
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("minIncrement")]
    public int? MinIncrement { get; set; }
    /// <summary>
    /// restrict scores to be below or equal to this maximum value
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("maxIncrement")]
    public int? MaxIncrement { get; set; }
    /// <summary>
    /// determines whether the customId on analytics are used to validate a user&#39;s achievement progress.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("validate")]
    public bool? Validate { get; set; }
    /// <summary>
    /// achievement is active or inactive
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// if provided will define what triggers to run after a tier is completed
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("triggerDefinition")]
    public string? TriggerDefinition { get; set; }
}
public class CreateAchievementTierRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// a unique id given by the device (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the achievement id for adding a new tier
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("achievementId")]
    public long AchievementId { get; set; }
    /// <summary>
    /// achievement tier icon image file
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("icon")]
    public System.IO.Stream? Icon { get; set; }
    /// <summary>
    /// the icon assetId, if icon is provided, icon will overrule
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("iconAssetId")]
    public long? IconAssetId { get; set; }
    /// <summary>
    /// the title of the achievement tier
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string? Title { get; set; }
    /// <summary>
    /// the description of the achievement tier
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// the count requirement for completing the achievement tier
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("goalCount")]
    public long? GoalCount { get; set; }
    /// <summary>
    /// The ID of the mission to associate with the achievement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionId")]
    public long? MissionId { get; set; }
    /// <summary>
    /// The ID of the game to associate with the achievement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameId")]
    public long? GameId { get; set; }
    /// <summary>
    /// The ID of the pack to associate with the achievement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("packId")]
    public long? PackId { get; set; }
    /// <summary>
    /// The ID of the game level to associate with the achievement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameLevelId")]
    public long? GameLevelId { get; set; }
    /// <summary>
    /// The ID of the game object to associate with the achievement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameObjectId")]
    public int? GameObjectId { get; set; }
    /// <summary>
    /// score all instances
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("scoreAllInstances")]
    public bool ScoreAllInstances { get; set; }
}
public class DeleteAchievementRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The ID of the achievement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("achievementId")]
    public long AchievementId { get; set; }
}
public class DeleteAchievementTierRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required).
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the achievement id for deletion
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("achievementTierId")]
    public long AchievementTierId { get; set; }
}
public class GetAchievementRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// a unique id given by the device (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// The ID of the achievement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("achievementId")]
    public long AchievementId { get; set; }
    /// <summary>
    /// achievementType
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("achievementType")]
    public string? AchievementType { get; set; }
}
public class GetAchievementTierRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the achievement tier id that is being retrieved
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("achievementTierId")]
    public long AchievementTierId { get; set; }
}
public class GetUserAchievementsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// determines whether to return null fields in the response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnNulls")]
    public bool ReturnNulls { get; set; }
    /// <summary>
    /// a unique id given by the device (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the email of the account to view achievements
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionAccountEmail")]
    public string? ConnectionAccountEmail { get; set; }
    /// <summary>
    /// the id of the account to view achievements
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionAccountId")]
    public long? ConnectionAccountId { get; set; }
    /// <summary>
    /// the application key for filtering results by application
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// filter results by achievement rankType
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("rankType")]
    public string? RankType { get; set; }
    /// <summary>
    /// filter results by achievement type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("achievementType")]
    public string? AchievementType { get; set; }
    /// <summary>
    /// determines whether to return achievements that the user has not discovered yet
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeUndiscovered")]
    public bool IncludeUndiscovered { get; set; }
    /// <summary>
    /// the current latitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("latitude")]
    public double? Latitude { get; set; }
    /// <summary>
    /// the current longitude of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("longitude")]
    public double? Longitude { get; set; }
}
public class ListAchievementTagsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// filter results by application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
}
public class ListAchievementsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// a unique id given by the device (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// the keyword used to filter results with (this returns results that have the keyword in the title or description of the achievement)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// filter results by the achievementType (these are exact case sensitive matches)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("achievementType")]
    public string? AchievementType { get; set; }
    /// <summary>
    /// filter results by the rankType (these are exact case sensitive matches)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("rankType")]
    public string? RankType { get; set; }
    /// <summary>
    /// the field to sort by. See AchievementApiMap
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string SortField { get; set; }
    /// <summary>
    /// determines whether the sorted list is in descending or ascending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool Descending { get; set; }
    /// <summary>
    /// the start index for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// the limit for pagination (has a hard limit of 1000)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
    /// <summary>
    /// Filter results to only return active achievements
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool ActiveOnly { get; set; }
}
public class SearchAchievementsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// a unique id given by the device (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// the keyword used to filter results with (this returns results that have the keyword in the title or description of the achievement)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// filter results by the achievementType (these are exact case sensitive matches)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("achievementType")]
    public string? AchievementType { get; set; }
    /// <summary>
    /// filter results by the rankType (these are exact case sensitive matches)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("rankType")]
    public string? RankType { get; set; }
    /// <summary>
    /// the field to sort by. See AchievementApiMap
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string SortField { get; set; }
    /// <summary>
    /// determines whether the sorted list is in descending or ascending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool Descending { get; set; }
    /// <summary>
    /// return tiers, only applicable for version &gt;3.18
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeTiers")]
    public bool IncludeTiers { get; set; }
    /// <summary>
    /// return inactive tiers, only applicable when includeTiers is true, only applicable for version &gt;3.18
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeInactiveTiers")]
    public bool IncludeInactiveTiers { get; set; }
    /// <summary>
    /// the start index for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int Start { get; set; }
    /// <summary>
    /// the limit for pagination (has a hard limit of 1000)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int Limit { get; set; }
}
public class UpdateAchievementRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// a unique id given by the device (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the achievement ID for updating an existing achievement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("achievementId")]
    public long? AchievementId { get; set; }
    /// <summary>
    /// the analytics tag that will trigger when a user&#39;s achievement count gets updated
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("analyticsTag")]
    public string? AnalyticsTag { get; set; }
    /// <summary>
    /// the title of the achievement (255 character limit)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string? Title { get; set; }
    /// <summary>
    /// the description of the achievement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// the rank type for updating leader boards
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("rankType")]
    public string? RankType { get; set; }
    /// <summary>
    /// determines how much the rank count is incremented
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("rankIncrement")]
    public int? RankIncrement { get; set; }
    /// <summary>
    /// restrict scores to be above or equal to this minimum value
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("minIncrement")]
    public int? MinIncrement { get; set; }
    /// <summary>
    /// enable to ignore usage of minIncrement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("nullMinIncrement")]
    public bool? NullMinIncrement { get; set; }
    /// <summary>
    /// restrict scores to be below or equal to this maximum value
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("maxIncrement")]
    public int? MaxIncrement { get; set; }
    /// <summary>
    /// enable to ignore usage of maxIncrement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("nullMaxIncrement")]
    public bool? NullMaxIncrement { get; set; }
    /// <summary>
    /// determines whether the customId on analytics are used to validate a user&#39;s achievement progress.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("validate")]
    public bool? Validate { get; set; }
    /// <summary>
    /// if it&#39;s active or inactive
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// if provided will define what triggers to run after a tier is completed
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("triggerDefinition")]
    public string? TriggerDefinition { get; set; }
}
public class UpdateAchievementTierRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// a unique id given by the device (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// the account id of the user (deviceId or accountId required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long? AccountId { get; set; }
    /// <summary>
    /// the achievement tier id for updating
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("achievementTierId")]
    public long AchievementTierId { get; set; }
    /// <summary>
    /// achievement tier icon image file
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("icon")]
    public System.IO.Stream? Icon { get; set; }
    /// <summary>
    /// the icon assetId, if icon is provided, icon will overrule
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("iconAssetId")]
    public long? IconAssetId { get; set; }
    /// <summary>
    /// the title of the achievement tier
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string? Title { get; set; }
    /// <summary>
    /// the description of the achievement tier
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// the count requirement for completing the achievement tier
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("goalCount")]
    public long? GoalCount { get; set; }
    /// <summary>
    /// The ID of the mission to associate with the achievement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionId")]
    public long? MissionId { get; set; }
    /// <summary>
    /// The ID of the game to associate with the achievement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameId")]
    public long? GameId { get; set; }
    /// <summary>
    /// The ID of the pack to associate with the achievement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("packId")]
    public long? PackId { get; set; }
    /// <summary>
    /// The ID of the game level to associate with the achievement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameLevelId")]
    public long? GameLevelId { get; set; }
    /// <summary>
    /// The ID of the game object to associate with the achievement
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameObjectId")]
    public long? GameObjectId { get; set; }
    /// <summary>
    /// score all instances
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("scoreAllInstances")]
    public bool? ScoreAllInstances { get; set; }
}
public class UpdateUserAchievementRequest
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
    public long AccountId { get; set; }
    /// <summary>
    /// the achievement id (achievementId or tag required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("achievementId")]
    public long? AchievementId { get; set; }
    /// <summary>
    /// the analytic tag to identify an achievement (achievementId or tag required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tag")]
    public string? Tag { get; set; }
    /// <summary>
    /// a custom identifier used for validation
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("customId")]
    public long? CustomId { get; set; }
    /// <summary>
    /// the amount to increment an achievement progress by (if no increment is sent in, the server defaults to using the achievement&#39;s rankIncrement value)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("increment")]
    public long? Increment { get; set; }
    /// <summary>
    /// a custom start date that the client can set (not yet used in server logic)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// a custom end date that the client can set (not yet used in server logic)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("endDate")]
    public long? EndDate { get; set; }
    /// <summary>
    /// determines whether to return the achievement progress response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("returnProgress")]
    public bool? ReturnProgress { get; set; }
}


