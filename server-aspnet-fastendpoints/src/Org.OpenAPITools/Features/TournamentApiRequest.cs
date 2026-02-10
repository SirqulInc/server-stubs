
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateTournamentRequest
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
    /// The appKey the tournament is created for.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// The title of the tournament
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string Title { get; set; }
    /// <summary>
    /// Custom string client apps can use for searching/filtering tournaments
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("subType")]
    public string? SubType { get; set; }
    /// <summary>
    /// The asset ID to attach to the tournament
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("imageAssetId")]
    public long? ImageAssetId { get; set; }
    /// <summary>
    /// The number of seconds in between the start of each tournament game/group
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("secondsBetweenLevels")]
    public int? SecondsBetweenLevels { get; set; }
    /// <summary>
    /// The number of seconds to extend the round end time in the case of a tie breaker
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("secondsForTieBreaker")]
    public int? SecondsForTieBreaker { get; set; }
    /// <summary>
    /// The number of seconds in between the start of each tournament round
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("secondsBetweenPacks")]
    public int? SecondsBetweenPacks { get; set; }
    /// <summary>
    /// The maximum number of seconds the match is expected to end at, which gets used to determine when a match should end when there is no activity
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("maximumLevelLength")]
    public int? MaximumLevelLength { get; set; }
    /// <summary>
    /// The number of tickets required to pay to enter the tournament
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("costToPlay")]
    public int CostToPlay { get; set; }
    /// <summary>
    /// The type of ticket required to pay
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("costToPlayType")]
    public string? CostToPlayType { get; set; }
    /// <summary>
    /// The minimum number of players required to sign up for the tournament to be played
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("minimumToPlay")]
    public int? MinimumToPlay { get; set; }
    /// <summary>
    /// The starting number of players for a tournament (filled with AI&#39;s)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startingLimit")]
    public int? StartingLimit { get; set; }
    /// <summary>
    /// The maximum number of players for a tournament (currently 128 but not enforced)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("availableLimit")]
    public int? AvailableLimit { get; set; }
    /// <summary>
    /// The description of the tournament
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// External custom client defined data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
    /// <summary>
    /// The date/time to start the tournament
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long StartDate { get; set; }
    /// <summary>
    /// The audiences associated with the tournament
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceIds")]
    public string? AudienceIds { get; set; }
    /// <summary>
    /// Activate/deactivate the tournament
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// Determines whether to allow players to buy back into a tournament
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("enableBuyBack")]
    public bool? EnableBuyBack { get; set; }
    /// <summary>
    /// The list of offers to give as a reward beyond the tickets
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerIds")]
    public string? OfferIds { get; set; }
    /// <summary>
    /// The artwork ID to attach to the reward tickets offers
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerAssetId")]
    public long? OfferAssetId { get; set; }
    /// <summary>
    /// If set then do not update the ticket reward, auto set to true if offerIds provided
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("fixedReward")]
    public bool? FixedReward { get; set; }
    /// <summary>
    /// Set the rules for handling the reward in case of a tie, values: EVEN split the reward evenly ALL everyone gets the full reward value FIRST first score submitted RANDOM random player who scored
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("splitReward")]
    public string? SplitReward { get; set; }
    /// <summary>
    /// Flag to indicate owner should receive tickets for completed missions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("allocateTickets")]
    public bool? AllocateTickets { get; set; }
    /// <summary>
    /// A text based string that will be passed into each tournament setup to populate the content
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tournamentData")]
    public string? TournamentData { get; set; }
    /// <summary>
    /// The style of tournament to build, options are: TOURNAMENT, POOLPLAY
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionType")]
    public string? MissionType { get; set; }
    /// <summary>
    /// Sets the visibility flag for the tournament
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("visibility")]
    public string? Visibility { get; set; }
    /// <summary>
    /// The number of initial preliminary groups in a multi-stage tournament (this is expected to be a power of two number)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preliminaryGroups")]
    public int? PreliminaryGroups { get; set; }
    /// <summary>
    /// This determines how many people can advance per round in a preliminary group (this is a comma separated list of integers)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preliminaryGroupAdvancements")]
    public string? PreliminaryGroupAdvancements { get; set; }
    /// <summary>
    /// This determines if multiple submissions/entries are allowed in a multi-stage album tournament
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("enableMultipleEntries")]
    public bool? EnableMultipleEntries { get; set; }
    /// <summary>
    /// This determines if users are allowed to vote multiple times per group in a multi-stage album tournament
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("enableMultipleVotes")]
    public bool? EnableMultipleVotes { get; set; }
    /// <summary>
    /// This determines whether the tournament is \&quot;featured\&quot; or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("featured")]
    public bool? Featured { get; set; }
    /// <summary>
    /// This sets what analytic tag is used when a winner is determined
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("winnerTag")]
    public string? WinnerTag { get; set; }
    /// <summary>
    /// This sets what analytic tag is used when a tie has occurred
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tieTag")]
    public string? TieTag { get; set; }
}
public class DeleteTournamentRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the id of the mission to delete
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionId")]
    public long MissionId { get; set; }
}
public class GetTournamentRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The id of the mission to return (either missionId or joinCode is required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionId")]
    public long? MissionId { get; set; }
    /// <summary>
    /// Optional identifier for getting the tournament (either missionId or joinCode is required)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("joinCode")]
    public string? JoinCode { get; set; }
    /// <summary>
    /// Determines which type of scores are returned. Possible values include: ALL, MINE
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeScores")]
    public string? IncludeScores { get; set; }
    /// <summary>
    /// Determines the max number of game objects that will get returned for each game level response
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("objectPreviewSize")]
    public int? ObjectPreviewSize { get; set; }
}
public class SearchObjectsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the account ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the game level id to filter results by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameLevelId")]
    public long GameLevelId { get; set; }
    /// <summary>
    /// the field to sort by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// determines whether the sorted list is in descending or ascending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// the start index for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// the limit for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}
public class SearchRoundsRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the account ID
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// comma separated list of statuses to filter results by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("status")]
    public string? Status { get; set; }
    /// <summary>
    /// The style of tournament to search for, options are: TOURNAMENT, POOLPLAY
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionType")]
    public string? MissionType { get; set; }
    /// <summary>
    /// search for games that are flagged current only
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("currentOnly")]
    public bool? CurrentOnly { get; set; }
    /// <summary>
    /// Filter tournament rounds by the mission visibility flag
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("visibilities")]
    public string? Visibilities { get; set; }
    /// <summary>
    /// the start index for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// the limit for pagination
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}
public class SearchTournamentsRequest
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
    /// The application key
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// the keyword to search tournament on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("keyword")]
    public string? Keyword { get; set; }
    /// <summary>
    /// filter results by subType
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("subType")]
    public string? SubType { get; set; }
    /// <summary>
    /// whether to include inactives in the search or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("includeInactive")]
    public bool? IncludeInactive { get; set; }
    /// <summary>
    /// comma separated list of mission types to filter results, possbile values include: TOURNAMENT, POOLPLAY, MULTISTAGE
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionTypes")]
    public string? MissionTypes { get; set; }
    /// <summary>
    /// filter tournaments by the tournament&#39;s current state
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("filter")]
    public string? Filter { get; set; }
    /// <summary>
    /// which field to sort on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sortField")]
    public string? SortField { get; set; }
    /// <summary>
    /// Determines whether to return results in descending order. The default value will be true if the filter is \&quot;PAST\&quot;, otherwise the default value will be false.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("descending")]
    public bool? Descending { get; set; }
    /// <summary>
    /// Comma separated list of visibility flags for search for, possible values include: PUBLIC, LISTABLE, REWARDABLE, TRIGGERABLE, PRIVATE
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("visibility")]
    public string? Visibility { get; set; }
    /// <summary>
    /// Start the result set at some index.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start")]
    public int? Start { get; set; }
    /// <summary>
    /// Limit the result to some number
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}
public class SubmitTournamentScoreRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The logged in user account ID.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The application key.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// The missionId to score for
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionId")]
    public long MissionId { get; set; }
    /// <summary>
    /// The gameId to score for
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameId")]
    public long GameId { get; set; }
    /// <summary>
    /// The packId to score for
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("packId")]
    public long PackId { get; set; }
    /// <summary>
    /// The gameLevelId to score for
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameLevelId")]
    public long? GameLevelId { get; set; }
    /// <summary>
    /// a JSON Array of scores to submit for a tournament match &#x60;&#x60;&#x60;json [   {     \&quot;accountId\&quot;: 2,     \&quot;points\&quot;: 3   },   {     \&quot;accountId\&quot;: 1777662,     \&quot;points\&quot;: 7   } ] &#x60;&#x60;&#x60; 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("scores")]
    public string Scores { get; set; }
}
public class SubmitTournamentVoteRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// The unique id of the device making the request (optional)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("deviceId")]
    public string? DeviceId { get; set; }
    /// <summary>
    /// The logged in user.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// The application to target
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("appKey")]
    public string AppKey { get; set; }
    /// <summary>
    /// The tournament&#39;s primary id
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionId")]
    public long MissionId { get; set; }
    /// <summary>
    /// The tournament game object the user wants to vote on
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameObjectId")]
    public long GameObjectId { get; set; }
    /// <summary>
    /// When true, check if the device already voted to prevent duplicate votes from the same device
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("checkIfDeviceAlreadyVoted")]
    public bool? CheckIfDeviceAlreadyVoted { get; set; }
}
public class SubstituteTournamentPlayerRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public decimal Version { get; set; }
    /// <summary>
    /// the id of the logged in user
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("accountId")]
    public long AccountId { get; set; }
    /// <summary>
    /// the id of the mission
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionId")]
    public long MissionId { get; set; }
    /// <summary>
    /// the id of the pack
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("packId")]
    public long PackId { get; set; }
    /// <summary>
    /// the id of the game level
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("gameLevelId")]
    public long GameLevelId { get; set; }
}
public class UpdateTournamentRequest
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
    /// The mission/tournament to update
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("missionId")]
    public long MissionId { get; set; }
    /// <summary>
    /// The title of the tournament
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("title")]
    public string? Title { get; set; }
    /// <summary>
    /// Custom string client apps can use for searching/filtering missions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("subType")]
    public string? SubType { get; set; }
    /// <summary>
    /// The asset ID to attach to the tournament
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("imageAssetId")]
    public long? ImageAssetId { get; set; }
    /// <summary>
    /// The number of seconds in between the start of each tournament game
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("secondsBetweenLevels")]
    public int? SecondsBetweenLevels { get; set; }
    /// <summary>
    /// The number of seconds to extend the round end time in the case of a tie breaker
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("secondsForTieBreaker")]
    public int? SecondsForTieBreaker { get; set; }
    /// <summary>
    /// The number of seconds in between the start of each tournament round
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("secondsBetweenPacks")]
    public int? SecondsBetweenPacks { get; set; }
    /// <summary>
    /// The maximum number of seconds the match is expected to end at, which gets used to determine when a match should end when there is no activity
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("maximumLevelLength")]
    public int? MaximumLevelLength { get; set; }
    /// <summary>
    /// The number of tickets required to pay to enter the tournament
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("costToPlay")]
    public int? CostToPlay { get; set; }
    /// <summary>
    /// The type of ticket required to pay
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("costToPlayType")]
    public string? CostToPlayType { get; set; }
    /// <summary>
    /// The minimum number of players required to sign up for the tournament to be played
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("minimumToPlay")]
    public int? MinimumToPlay { get; set; }
    /// <summary>
    /// The starting number of players for a tournament (filled with AI&#39;s)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startingLimit")]
    public int? StartingLimit { get; set; }
    /// <summary>
    /// The maximum number of players for a tournament (currently 128 but not enforced)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("availableLimit")]
    public int? AvailableLimit { get; set; }
    /// <summary>
    /// The description of the tournament
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("description")]
    public string? Description { get; set; }
    /// <summary>
    /// External custom client defined data
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("metaData")]
    public string? MetaData { get; set; }
    /// <summary>
    /// The date/time to start the tournament
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("startDate")]
    public long? StartDate { get; set; }
    /// <summary>
    /// The audiences associated with the tournament
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("audienceIds")]
    public string? AudienceIds { get; set; }
    /// <summary>
    /// Activate/deactivate the mission
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("active")]
    public bool? Active { get; set; }
    /// <summary>
    /// Determines whether to allow players to buy back into a tournament
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("enableBuyBack")]
    public bool? EnableBuyBack { get; set; }
    /// <summary>
    /// The list of offers to give as a reward beyond the tickets
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerIds")]
    public string? OfferIds { get; set; }
    /// <summary>
    /// The artwork ID to attach to the reward offer
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("offerAssetId")]
    public long? OfferAssetId { get; set; }
    /// <summary>
    /// If set then do not update the ticket reward, auto set to true if offerIds provided
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("fixedReward")]
    public bool? FixedReward { get; set; }
    /// <summary>
    /// Set the rules for handling the reward in case of a tie, values: EVEN split the reward evenly ALL everyone gets the full reward value FIRST first score submitted RANDOM random player who scored
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("splitReward")]
    public string? SplitReward { get; set; }
    /// <summary>
    /// Flag to indicate owner should receive tickets for completed missions
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("allocateTickets")]
    public bool? AllocateTickets { get; set; }
    /// <summary>
    /// A text based string that will be passed into each tournament setup to populate the content
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tournamentData")]
    public string? TournamentData { get; set; }
    /// <summary>
    /// Sets the visibility flag for the tournament
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("visibility")]
    public string? Visibility { get; set; }
    /// <summary>
    /// The number of initial preliminary groups in a multi-stage tournament (this is expected to be a power of two number)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preliminaryGroups")]
    public int? PreliminaryGroups { get; set; }
    /// <summary>
    /// This determines how many people can advance per round in a preliminary group (this is a comma separated list of integers)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("preliminaryGroupAdvancements")]
    public string? PreliminaryGroupAdvancements { get; set; }
    /// <summary>
    /// This determines if multiple submissions/entries are allowed in a multi-stage album tournament
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("enableMultipleEntries")]
    public bool? EnableMultipleEntries { get; set; }
    /// <summary>
    /// This determines if users are allowed to vote multiple times per group in a multi-stage album tournament
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("enableMultipleVotes")]
    public bool? EnableMultipleVotes { get; set; }
    /// <summary>
    /// This determines whether the tournament is \&quot;featured\&quot; or not
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("featured")]
    public bool? Featured { get; set; }
    /// <summary>
    /// This sets what analytic tag is used when a winner is determined
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("winnerTag")]
    public string? WinnerTag { get; set; }
    /// <summary>
    /// This sets what analytic tag is used when a winner is determined
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("tieTag")]
    public string? TieTag { get; set; }
}


