
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateGameLevelRequest
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
    /// The game application key to save the level for.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// The name of the level.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string Name { get; set; }
    /// <summary>
    /// The description of the level.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// The difficulty, possible values are: VERY_EASY, EASY, MEDIUM, HARD, VERY_HARD.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("difficulty")]
    public string? Difficulty { get; set; }
    /// <summary>
    /// The version number of the application required to correctly load/play the level.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appVersion")]
    public string? AppVersion { get; set; }
    /// <summary>
    /// The asset Id of the level image.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetImageId")]
    public long? AssetImageId { get; set; }
    /// <summary>
    /// The asset Id of the level icon.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetIconId")]
    public long? AssetIconId { get; set; }
    /// <summary>
    /// The game level data: xml, json, or other text based format.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameData")]
    public string GameData { get; set; }
    /// <summary>
    /// The game level data format type.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameDataSuffix")]
    public string GameDataSuffix { get; set; }
    /// <summary>
    /// Is the level visible to others, possible values are: PUBLIC, PRIVATE.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("visibility")]
    public string? Visibility { get; set; }
    /// <summary>
    /// Make the level be readable by all friends.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("friendGroup")]
    public bool? FriendGroup { get; set; }
    /// <summary>
    /// Make the level be readable by connections in this list.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionIds")]
    public string? ConnectionIds { get; set; }
    /// <summary>
    /// Make the level be readable by connection groups in this list.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionGroupIds")]
    public string? ConnectionGroupIds { get; set; }
    /// <summary>
    /// Set the amount of money available to spend, once 0 deactivate level. Set to a negative value for unlimited.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("balance")]
    public double? Balance { get; set; }
    /// <summary>
    /// If true set the game level as active. Default is false.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// If true then scoring will give tickets. Default is false.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("allocateTickets")]
    public bool? AllocateTickets { get; set; }
    /// <summary>
    /// The number of tickets to reward
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ticketCount")]
    public long? TicketCount { get; set; }
    /// <summary>
    /// The type of ticket to reward, null means default type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ticketType")]
    public string? TicketType { get; set; }
    /// <summary>
    /// The number of points to award for completing a level
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("points")]
    public long? Points { get; set; }
    /// <summary>
    /// Title of the tutorial.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tutorialTitle")]
    public string? TutorialTitle { get; set; }
    /// <summary>
    /// Message of the tutotrial.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tutorialMessage")]
    public string? TutorialMessage { get; set; }
    /// <summary>
    /// Alignment of the tutorial image. Default to NONE. Possible values are: NONE, IMAGE_ABOVE, IMAGE_BELOW, IMAGE_LEFT, IMAGE_RIGHT, IMAGE_ONLY, TEXT_ONLY
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tutorialAlignment")]
    public string? TutorialAlignment { get; set; }
    /// <summary>
    /// Asset id of the tutorial image.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tutorialImageAssetId")]
    public long? TutorialImageAssetId { get; set; }
    /// <summary>
    /// id of the offer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerId")]
    public long? OfferId { get; set; }
    /// <summary>
    /// external custom client defined data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
}
public class DeleteGameLevelRequest
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
    /// The id of the level to return.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("levelId")]
    public long LevelId { get; set; }
}
public class GetGameLevelRequest
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
    /// The id of the level to return.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("levelId")]
    public long LevelId { get; set; }
    /// <summary>
    /// If true include the game level data, otherwise don&#39;t. default is false.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeGameData")]
    public bool? IncludeGameData { get; set; }
}
public class GetGameLevelsByApplicationRequest
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
    /// what field to sort on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// whether to return levels in ascending or descending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// Start the result set at some index.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// Limit the result to some number.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// The maximum version of the level to return.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appVersion")]
    public string? AppVersion { get; set; }
    /// <summary>
    /// If true include the game level data, otherwise don&#39;t. default is false.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeGameData")]
    public bool? IncludeGameData { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filters")]
    public string? Filters { get; set; }
}
public class GetGameLevelsByBillableEntityRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The account id of the user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// The keyword used to search
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// The column to sort the search on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// The order to return the search results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// Return only active results
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("activeOnly")]
    public bool? ActiveOnly { get; set; }
    /// <summary>
    /// The record to begin the return set on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public long? Start { get; set; }
    /// <summary>
    /// The number of records to return
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public long? Limit { get; set; }
}
public class GetQuestionsInLevelRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the level to get questions from
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("levelId")]
    public long LevelId { get; set; }
    /// <summary>
    /// the id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
}
public class GetWordsInLevelRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the level to get words for
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("levelId")]
    public long LevelId { get; set; }
    /// <summary>
    /// the id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
}
public class UpdateGameLevelRequest
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
    /// The game application key to save the level for.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string? AppKey { get; set; }
    /// <summary>
    /// If update then include the level Id.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("levelId")]
    public long LevelId { get; set; }
    /// <summary>
    /// The name of the level.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("name")]
    public string? Name { get; set; }
    /// <summary>
    /// The description of the level.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// The difficulty, possible values are: VERY_EASY, EASY, MEDIUM, HARD, VERY_HARD.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("difficulty")]
    public string? Difficulty { get; set; }
    /// <summary>
    /// The version number of the applicatuion required to correctly load/play the level.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appVersion")]
    public string? AppVersion { get; set; }
    /// <summary>
    /// The asset Id of the level image.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetImageId")]
    public long? AssetImageId { get; set; }
    /// <summary>
    /// The asset Id of the level icon.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assetIconId")]
    public long? AssetIconId { get; set; }
    /// <summary>
    /// The game level data: xml, json, or other texted based format.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameData")]
    public string? GameData { get; set; }
    /// <summary>
    /// The game level data format type.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameDataSuffix")]
    public string? GameDataSuffix { get; set; }
    /// <summary>
    /// Is the level visible to others, possible values are: PUBLIC, PRIVATE.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("visibility")]
    public string? Visibility { get; set; }
    /// <summary>
    /// Make the level be readable by all friends.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("friendGroup")]
    public bool? FriendGroup { get; set; }
    /// <summary>
    /// Make the level be readable by connections in this list.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionIds")]
    public string? ConnectionIds { get; set; }
    /// <summary>
    /// Make the level be readable by connection groups in this list.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("connectionGroupIds")]
    public string? ConnectionGroupIds { get; set; }
    /// <summary>
    /// Set the amount of money available to spend, once 0 deactivate level. Set to a negative value for unlimited.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("balance")]
    public double? Balance { get; set; }
    /// <summary>
    /// If true set the game level as active.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// If true then scoring will give tickets.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("allocateTickets")]
    public bool? AllocateTickets { get; set; }
    /// <summary>
    /// The number of tickets to reward
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ticketCount")]
    public long? TicketCount { get; set; }
    /// <summary>
    /// The type of ticket to reward, null means default type
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ticketType")]
    public string? TicketType { get; set; }
    /// <summary>
    /// The number of points to award for completing a level
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("points")]
    public long? Points { get; set; }
    /// <summary>
    /// Title of the tutorial.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tutorialTitle")]
    public string? TutorialTitle { get; set; }
    /// <summary>
    /// Message of the tutorial.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tutorialMessage")]
    public string? TutorialMessage { get; set; }
    /// <summary>
    /// Alignment of the tutorial image, possible values are: NONE, IMAGE_ABOVE, IMAGE_BELOW, IMAGE_LEFT, IMAGE_RIGHT, IMAGE_ONLY, TEXT_ONLY
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tutorialAlignment")]
    public string? TutorialAlignment { get; set; }
    /// <summary>
    /// Asset id of the tutorial image.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tutorialImageAssetId")]
    public long? TutorialImageAssetId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerId")]
    public long? OfferId { get; set; }
    /// <summary>
    /// external custom client defined data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
}
public class UpdateQuestionsInLevelRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the level to update questions on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("levelId")]
    public long LevelId { get; set; }
    /// <summary>
    /// the id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the IDs of the questions to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("questionIds")]
    public string QuestionIds { get; set; }
}
public class UpdateWordsInLevelRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the level to update words for
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("levelId")]
    public long LevelId { get; set; }
    /// <summary>
    /// the id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the ids of the words to update for the level
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("wordIds")]
    public string WordIds { get; set; }
}


