package api

import play.api.libs.json._
import model.BigDecimal
import model.MissionShortResponse
import model.SirqulResponse
import model.TournamentResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait TournamentApi {
  /**
    * Create Tournament
    * Create a tournament.
    * @param accountId The logged in user.
    * @param appKey The appKey the tournament is created for.
    * @param title The title of the tournament
    * @param costToPlay The number of tickets required to pay to enter the tournament
    * @param startDate The date/time to start the tournament
    * @param subType Custom string client apps can use for searching/filtering tournaments
    * @param imageAssetId The asset ID to attach to the tournament
    * @param secondsBetweenLevels The number of seconds in between the start of each tournament game/group
    * @param secondsForTieBreaker The number of seconds to extend the round end time in the case of a tie breaker
    * @param secondsBetweenPacks The number of seconds in between the start of each tournament round
    * @param maximumLevelLength The maximum number of seconds the match is expected to end at, which gets used to determine when a match should end when there is no activity
    * @param costToPlayType The type of ticket required to pay
    * @param minimumToPlay The minimum number of players required to sign up for the tournament to be played
    * @param startingLimit The starting number of players for a tournament (filled with AI&#39;s)
    * @param availableLimit The maximum number of players for a tournament (currently 128 but not enforced)
    * @param description The description of the tournament
    * @param metaData External custom client defined data
    * @param audienceIds The audiences associated with the tournament
    * @param active Activate/deactivate the tournament
    * @param enableBuyBack Determines whether to allow players to buy back into a tournament
    * @param offerIds The list of offers to give as a reward beyond the tickets
    * @param offerAssetId The artwork ID to attach to the reward tickets offers
    * @param fixedReward If set then do not update the ticket reward, auto set to true if offerIds provided
    * @param splitReward Set the rules for handling the reward in case of a tie, values: EVEN split the reward evenly ALL everyone gets the full reward value FIRST first score submitted RANDOM random player who scored
    * @param allocateTickets Flag to indicate owner should receive tickets for completed missions
    * @param tournamentData A text based string that will be passed into each tournament setup to populate the content
    * @param missionType The style of tournament to build, options are: TOURNAMENT, POOLPLAY
    * @param visibility Sets the visibility flag for the tournament
    * @param preliminaryGroups The number of initial preliminary groups in a multi-stage tournament (this is expected to be a power of two number)
    * @param preliminaryGroupAdvancements This determines how many people can advance per round in a preliminary group (this is a comma separated list of integers)
    * @param enableMultipleEntries This determines if multiple submissions/entries are allowed in a multi-stage album tournament
    * @param enableMultipleVotes This determines if users are allowed to vote multiple times per group in a multi-stage album tournament
    * @param featured This determines whether the tournament is \&quot;featured\&quot; or not
    * @param winnerTag This sets what analytic tag is used when a winner is determined
    * @param tieTag This sets what analytic tag is used when a tie has occurred
    */
  def createTournament(version: BigDecimal, accountId: Long, appKey: String, title: String, costToPlay: Int, startDate: Long, subType: Option[String], imageAssetId: Option[Long], secondsBetweenLevels: Option[Int], secondsForTieBreaker: Option[Int], secondsBetweenPacks: Option[Int], maximumLevelLength: Option[Int], costToPlayType: Option[String], minimumToPlay: Option[Int], startingLimit: Option[Int], availableLimit: Option[Int], description: Option[String], metaData: Option[String], audienceIds: Option[String], active: Option[Boolean], enableBuyBack: Option[Boolean], offerIds: Option[String], offerAssetId: Option[Long], fixedReward: Option[Boolean], splitReward: Option[String], allocateTickets: Option[Boolean], tournamentData: Option[String], missionType: Option[String], visibility: Option[String], preliminaryGroups: Option[Int], preliminaryGroupAdvancements: Option[String], enableMultipleEntries: Option[Boolean], enableMultipleVotes: Option[Boolean], featured: Option[Boolean], winnerTag: Option[String], tieTag: Option[String]): TournamentResponse

  /**
    * Delete Tournament
    * Delete a tournament.
    * @param accountId the id of the logged in user
    * @param missionId the id of the mission to delete
    */
  def deleteTournament(version: BigDecimal, accountId: Long, missionId: Long): SirqulResponse

  /**
    * Get Tournament
    * Get a tournament.
    * @param accountId The id of the logged in user
    * @param missionId The id of the mission to return (either missionId or joinCode is required)
    * @param joinCode Optional identifier for getting the tournament (either missionId or joinCode is required)
    * @param includeScores Determines which type of scores are returned. Possible values include: ALL, MINE
    * @param objectPreviewSize Determines the max number of game objects that will get returned for each game level response
    */
  def getTournament(version: BigDecimal, accountId: Long, missionId: Option[Long], joinCode: Option[String], includeScores: Option[String], objectPreviewSize: Option[Int]): TournamentResponse

  /**
    * Search Tournament Objects
    * Search on game objects of tournaments
    * @param accountId the account ID
    * @param gameLevelId the game level id to filter results by
    * @param sortField the field to sort by
    * @param descending determines whether the sorted list is in descending or ascending order
    * @param start the start index for pagination
    * @param limit the limit for pagination
    */
  def searchObjects(version: BigDecimal, accountId: Long, gameLevelId: Long, sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int]): SirqulResponse

  /**
    * Search Tournament Rounds
    * Search for the user&#39;s tournament games.
    * @param accountId the account ID
    * @param appKey the application key
    * @param status comma separated list of statuses to filter results by
    * @param missionType The style of tournament to search for, options are: TOURNAMENT, POOLPLAY
    * @param currentOnly search for games that are flagged current only
    * @param visibilities Filter tournament rounds by the mission visibility flag
    * @param start the start index for pagination
    * @param limit the limit for pagination
    */
  def searchRounds(version: BigDecimal, accountId: Long, appKey: String, status: Option[String], missionType: Option[String], currentOnly: Option[Boolean], visibilities: Option[String], start: Option[Int], limit: Option[Int]): SirqulResponse

  /**
    * Search Tournaments
    * Search for tournaments
    * @param accountId The logged in user.
    * @param appKey The application key
    * @param keyword the keyword to search tournament on
    * @param subType filter results by subType
    * @param includeInactive whether to include inactives in the search or not
    * @param missionTypes comma separated list of mission types to filter results, possbile values include: TOURNAMENT, POOLPLAY, MULTISTAGE
    * @param filter filter tournaments by the tournament&#39;s current state
    * @param sortField which field to sort on
    * @param descending Determines whether to return results in descending order. The default value will be true if the filter is \&quot;PAST\&quot;, otherwise the default value will be false.
    * @param visibility Comma separated list of visibility flags for search for, possible values include: PUBLIC, LISTABLE, REWARDABLE, TRIGGERABLE, PRIVATE
    * @param start Start the result set at some index.
    * @param limit Limit the result to some number
    */
  def searchTournaments(version: BigDecimal, accountId: Long, appKey: String, keyword: Option[String], subType: Option[String], includeInactive: Option[Boolean], missionTypes: Option[String], filter: Option[String], sortField: Option[String], descending: Option[Boolean], visibility: Option[String], start: Option[Int], limit: Option[Int]): MissionShortResponse

  /**
    * Submit Tournament Score
    * Submit an array of scores for a tournament match. 
    * @param accountId The logged in user account ID.
    * @param appKey The application key.
    * @param missionId The missionId to score for
    * @param gameId The gameId to score for
    * @param packId The packId to score for
    * @param scores a JSON Array of scores to submit for a tournament match &#x60;&#x60;&#x60;json [   {     \&quot;accountId\&quot;: 2,     \&quot;points\&quot;: 3   },   {     \&quot;accountId\&quot;: 1777662,     \&quot;points\&quot;: 7   } ] &#x60;&#x60;&#x60; 
    * @param gameLevelId The gameLevelId to score for
    */
  def submitTournamentScore(version: BigDecimal, accountId: Long, appKey: String, missionId: Long, gameId: Long, packId: Long, scores: String, gameLevelId: Option[Long]): SirqulResponse

  /**
    * Submit a vote for a multi-stage album tournament.
    * Submit a vote for a multi-stage album tournament.
    * @param accountId The logged in user.
    * @param appKey The application to target
    * @param missionId The tournament&#39;s primary id
    * @param gameObjectId The tournament game object the user wants to vote on
    * @param deviceId The unique id of the device making the request (optional)
    * @param checkIfDeviceAlreadyVoted When true, check if the device already voted to prevent duplicate votes from the same device
    */
  def submitTournamentVote(version: BigDecimal, accountId: Long, appKey: String, missionId: Long, gameObjectId: Long, deviceId: Option[String], checkIfDeviceAlreadyVoted: Option[Boolean]): SirqulResponse

  /**
    * Substitute Tournament Player
    * Service to replace the user&#39;s opponent in the current level - pack - mission with an AI account.
    * @param accountId the id of the logged in user
    * @param missionId the id of the mission
    * @param packId the id of the pack
    * @param gameLevelId the id of the game level
    */
  def substituteTournamentPlayer(version: BigDecimal, accountId: Long, missionId: Long, packId: Long, gameLevelId: Long): SirqulResponse

  /**
    * Update Tournament
    * Update a tournament.
    * @param accountId The logged in user.
    * @param missionId The mission/tournament to update
    * @param title The title of the tournament
    * @param subType Custom string client apps can use for searching/filtering missions
    * @param imageAssetId The asset ID to attach to the tournament
    * @param secondsBetweenLevels The number of seconds in between the start of each tournament game
    * @param secondsForTieBreaker The number of seconds to extend the round end time in the case of a tie breaker
    * @param secondsBetweenPacks The number of seconds in between the start of each tournament round
    * @param maximumLevelLength The maximum number of seconds the match is expected to end at, which gets used to determine when a match should end when there is no activity
    * @param costToPlay The number of tickets required to pay to enter the tournament
    * @param costToPlayType The type of ticket required to pay
    * @param minimumToPlay The minimum number of players required to sign up for the tournament to be played
    * @param startingLimit The starting number of players for a tournament (filled with AI&#39;s)
    * @param availableLimit The maximum number of players for a tournament (currently 128 but not enforced)
    * @param description The description of the tournament
    * @param metaData External custom client defined data
    * @param startDate The date/time to start the tournament
    * @param audienceIds The audiences associated with the tournament
    * @param active Activate/deactivate the mission
    * @param enableBuyBack Determines whether to allow players to buy back into a tournament
    * @param offerIds The list of offers to give as a reward beyond the tickets
    * @param offerAssetId The artwork ID to attach to the reward offer
    * @param fixedReward If set then do not update the ticket reward, auto set to true if offerIds provided
    * @param splitReward Set the rules for handling the reward in case of a tie, values: EVEN split the reward evenly ALL everyone gets the full reward value FIRST first score submitted RANDOM random player who scored
    * @param allocateTickets Flag to indicate owner should receive tickets for completed missions
    * @param tournamentData A text based string that will be passed into each tournament setup to populate the content
    * @param visibility Sets the visibility flag for the tournament
    * @param preliminaryGroups The number of initial preliminary groups in a multi-stage tournament (this is expected to be a power of two number)
    * @param preliminaryGroupAdvancements This determines how many people can advance per round in a preliminary group (this is a comma separated list of integers)
    * @param enableMultipleEntries This determines if multiple submissions/entries are allowed in a multi-stage album tournament
    * @param enableMultipleVotes This determines if users are allowed to vote multiple times per group in a multi-stage album tournament
    * @param featured This determines whether the tournament is \&quot;featured\&quot; or not
    * @param winnerTag This sets what analytic tag is used when a winner is determined
    * @param tieTag This sets what analytic tag is used when a winner is determined
    */
  def updateTournament(version: BigDecimal, accountId: Long, missionId: Long, title: Option[String], subType: Option[String], imageAssetId: Option[Long], secondsBetweenLevels: Option[Int], secondsForTieBreaker: Option[Int], secondsBetweenPacks: Option[Int], maximumLevelLength: Option[Int], costToPlay: Option[Int], costToPlayType: Option[String], minimumToPlay: Option[Int], startingLimit: Option[Int], availableLimit: Option[Int], description: Option[String], metaData: Option[String], startDate: Option[Long], audienceIds: Option[String], active: Option[Boolean], enableBuyBack: Option[Boolean], offerIds: Option[String], offerAssetId: Option[Long], fixedReward: Option[Boolean], splitReward: Option[String], allocateTickets: Option[Boolean], tournamentData: Option[String], visibility: Option[String], preliminaryGroups: Option[Int], preliminaryGroupAdvancements: Option[String], enableMultipleEntries: Option[Boolean], enableMultipleVotes: Option[Boolean], featured: Option[Boolean], winnerTag: Option[String], tieTag: Option[String]): TournamentResponse
}
