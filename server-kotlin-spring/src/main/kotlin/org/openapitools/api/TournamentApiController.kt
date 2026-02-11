package org.openapitools.api

import org.openapitools.model.MissionShortResponse
import org.openapitools.model.SirqulResponse
import org.openapitools.model.TournamentResponse
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:/api/3.18}")
class TournamentApiController() {

    @Operation(
        summary = "Create Tournament",
        operationId = "createTournament",
        description = """Create a tournament.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = TournamentResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/tournament/create"
        value = [PATH_CREATE_TOURNAMENT],
        produces = ["*/*"]
    )
    fun createTournament(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The appKey the tournament is created for.", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "The title of the tournament", required = true) @Valid @RequestParam(value = "title", required = true) title: kotlin.String,
        @NotNull @Parameter(description = "The number of tickets required to pay to enter the tournament", required = true) @Valid @RequestParam(value = "costToPlay", required = true) costToPlay: kotlin.Int,
        @NotNull @Parameter(description = "The date/time to start the tournament", required = true) @Valid @RequestParam(value = "startDate", required = true) startDate: kotlin.Long,
        @Parameter(description = "Custom string client apps can use for searching/filtering tournaments") @Valid @RequestParam(value = "subType", required = false) subType: kotlin.String?,
        @Parameter(description = "The asset ID to attach to the tournament") @Valid @RequestParam(value = "imageAssetId", required = false) imageAssetId: kotlin.Long?,
        @Parameter(description = "The number of seconds in between the start of each tournament game/group", schema = Schema(defaultValue = "600")) @Valid @RequestParam(value = "secondsBetweenLevels", required = false, defaultValue = "600") secondsBetweenLevels: kotlin.Int,
        @Parameter(description = "The number of seconds to extend the round end time in the case of a tie breaker", schema = Schema(defaultValue = "600")) @Valid @RequestParam(value = "secondsForTieBreaker", required = false, defaultValue = "600") secondsForTieBreaker: kotlin.Int,
        @Parameter(description = "The number of seconds in between the start of each tournament round", schema = Schema(defaultValue = "86400")) @Valid @RequestParam(value = "secondsBetweenPacks", required = false, defaultValue = "86400") secondsBetweenPacks: kotlin.Int,
        @Parameter(description = "The maximum number of seconds the match is expected to end at, which gets used to determine when a match should end when there is no activity", schema = Schema(defaultValue = "1800")) @Valid @RequestParam(value = "maximumLevelLength", required = false, defaultValue = "1800") maximumLevelLength: kotlin.Int,
        @Parameter(description = "The type of ticket required to pay") @Valid @RequestParam(value = "costToPlayType", required = false) costToPlayType: kotlin.String?,
        @Parameter(description = "The minimum number of players required to sign up for the tournament to be played", schema = Schema(defaultValue = "1")) @Valid @RequestParam(value = "minimumToPlay", required = false, defaultValue = "1") minimumToPlay: kotlin.Int,
        @Parameter(description = "The starting number of players for a tournament (filled with AI's)") @Valid @RequestParam(value = "startingLimit", required = false) startingLimit: kotlin.Int?,
        @Parameter(description = "The maximum number of players for a tournament (currently 128 but not enforced)") @Valid @RequestParam(value = "availableLimit", required = false) availableLimit: kotlin.Int?,
        @Parameter(description = "The description of the tournament") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "External custom client defined data") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?,
        @Parameter(description = "The audiences associated with the tournament") @Valid @RequestParam(value = "audienceIds", required = false) audienceIds: kotlin.String?,
        @Parameter(description = "Activate/deactivate the tournament") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "Determines whether to allow players to buy back into a tournament", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "enableBuyBack", required = false, defaultValue = "false") enableBuyBack: kotlin.Boolean,
        @Parameter(description = "The list of offers to give as a reward beyond the tickets") @Valid @RequestParam(value = "offerIds", required = false) offerIds: kotlin.String?,
        @Parameter(description = "The artwork ID to attach to the reward tickets offers") @Valid @RequestParam(value = "offerAssetId", required = false) offerAssetId: kotlin.Long?,
        @Parameter(description = "If set then do not update the ticket reward, auto set to true if offerIds provided", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "fixedReward", required = false, defaultValue = "false") fixedReward: kotlin.Boolean,
        @Parameter(description = "Set the rules for handling the reward in case of a tie, values: EVEN split the reward evenly ALL everyone gets the full reward value FIRST first score submitted RANDOM random player who scored", schema = Schema(allowableValues = ["EVEN", "ALL", "FIRST", "RANDOM"], defaultValue = "ALL")) @Valid @RequestParam(value = "splitReward", required = false, defaultValue = "ALL") splitReward: kotlin.String,
        @Parameter(description = "Flag to indicate owner should receive tickets for completed missions") @Valid @RequestParam(value = "allocateTickets", required = false) allocateTickets: kotlin.Boolean?,
        @Parameter(description = "A text based string that will be passed into each tournament setup to populate the content") @Valid @RequestParam(value = "tournamentData", required = false) tournamentData: kotlin.String?,
        @Parameter(description = "The style of tournament to build, options are: TOURNAMENT, POOLPLAY", schema = Schema(allowableValues = ["TOURNAMENT", "POOLPLAY", "MULTISTAGE"], defaultValue = "MULTISTAGE")) @Valid @RequestParam(value = "missionType", required = false, defaultValue = "MULTISTAGE") missionType: kotlin.String,
        @Parameter(description = "Sets the visibility flag for the tournament", schema = Schema(allowableValues = ["PUBLIC", "LISTABLE", "REWARDABLE", "TRIGGERABLE", "PRIVATE"], defaultValue = "PUBLIC")) @Valid @RequestParam(value = "visibility", required = false, defaultValue = "PUBLIC") visibility: kotlin.String,
        @Parameter(description = "The number of initial preliminary groups in a multi-stage tournament (this is expected to be a power of two number)", schema = Schema(defaultValue = "1")) @Valid @RequestParam(value = "preliminaryGroups", required = false, defaultValue = "1") preliminaryGroups: kotlin.Int,
        @Parameter(description = "This determines how many people can advance per round in a preliminary group (this is a comma separated list of integers)", schema = Schema(defaultValue = "1")) @Valid @RequestParam(value = "preliminaryGroupAdvancements", required = false, defaultValue = "1") preliminaryGroupAdvancements: kotlin.String,
        @Parameter(description = "This determines if multiple submissions/entries are allowed in a multi-stage album tournament", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "enableMultipleEntries", required = false, defaultValue = "false") enableMultipleEntries: kotlin.Boolean,
        @Parameter(description = "This determines if users are allowed to vote multiple times per group in a multi-stage album tournament", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "enableMultipleVotes", required = false, defaultValue = "false") enableMultipleVotes: kotlin.Boolean,
        @Parameter(description = "This determines whether the tournament is \"featured\" or not", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "featured", required = false, defaultValue = "false") featured: kotlin.Boolean,
        @Parameter(description = "This sets what analytic tag is used when a winner is determined") @Valid @RequestParam(value = "winnerTag", required = false) winnerTag: kotlin.String?,
        @Parameter(description = "This sets what analytic tag is used when a tie has occurred") @Valid @RequestParam(value = "tieTag", required = false) tieTag: kotlin.String?
    ): ResponseEntity<TournamentResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Tournament",
        operationId = "deleteTournament",
        description = """Delete a tournament.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/tournament/delete"
        value = [PATH_DELETE_TOURNAMENT],
        produces = ["*/*"]
    )
    fun deleteTournament(
        @NotNull @Parameter(description = "the id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the mission to delete", required = true) @Valid @RequestParam(value = "missionId", required = true) missionId: kotlin.Long
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Tournament",
        operationId = "getTournament",
        description = """Get a tournament.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = TournamentResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/tournament/get"
        value = [PATH_GET_TOURNAMENT],
        produces = ["*/*"]
    )
    fun getTournament(
        @NotNull @Parameter(description = "The id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "The id of the mission to return (either missionId or joinCode is required)") @Valid @RequestParam(value = "missionId", required = false) missionId: kotlin.Long?,
        @Parameter(description = "Optional identifier for getting the tournament (either missionId or joinCode is required)") @Valid @RequestParam(value = "joinCode", required = false) joinCode: kotlin.String?,
        @Parameter(description = "Determines which type of scores are returned. Possible values include: ALL, MINE", schema = Schema(allowableValues = ["ALL", "MINE"])) @Valid @RequestParam(value = "includeScores", required = false) includeScores: kotlin.String?,
        @Parameter(description = "Determines the max number of game objects that will get returned for each game level response", schema = Schema(defaultValue = "50")) @Valid @RequestParam(value = "objectPreviewSize", required = false, defaultValue = "50") objectPreviewSize: kotlin.Int
    ): ResponseEntity<TournamentResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Tournament Objects",
        operationId = "searchObjects",
        description = """Search on game objects of tournaments""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/tournament/object/search"
        value = [PATH_SEARCH_OBJECTS],
        produces = ["*/*"]
    )
    fun searchObjects(
        @NotNull @Parameter(description = "the account ID", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the game level id to filter results by", required = true) @Valid @RequestParam(value = "gameLevelId", required = true) gameLevelId: kotlin.Long,
        @Parameter(description = "the field to sort by", schema = Schema(allowableValues = ["ID", "PLAYER_SCORE_COUNT"], defaultValue = "PLAYER_SCORE_COUNT")) @Valid @RequestParam(value = "sortField", required = false, defaultValue = "PLAYER_SCORE_COUNT") sortField: kotlin.String,
        @Parameter(description = "determines whether the sorted list is in descending or ascending order", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "descending", required = false, defaultValue = "true") descending: kotlin.Boolean,
        @Parameter(description = "the start index for pagination", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "the limit for pagination", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Tournament Rounds",
        operationId = "searchRounds",
        description = """Search for the user's tournament games.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/tournament/round/search"
        value = [PATH_SEARCH_ROUNDS],
        produces = ["*/*"]
    )
    fun searchRounds(
        @NotNull @Parameter(description = "the account ID", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the application key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "comma separated list of statuses to filter results by", schema = Schema(defaultValue = "ACCEPTED,ACTIVE")) @Valid @RequestParam(value = "status", required = false, defaultValue = "ACCEPTED,ACTIVE") status: kotlin.String,
        @Parameter(description = "The style of tournament to search for, options are: TOURNAMENT, POOLPLAY", schema = Schema(allowableValues = ["TOURNAMENT", "POOLPLAY"])) @Valid @RequestParam(value = "missionType", required = false) missionType: kotlin.String?,
        @Parameter(description = "search for games that are flagged current only", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "currentOnly", required = false, defaultValue = "true") currentOnly: kotlin.Boolean,
        @Parameter(description = "Filter tournament rounds by the mission visibility flag", schema = Schema(defaultValue = "PUBLIC")) @Valid @RequestParam(value = "visibilities", required = false, defaultValue = "PUBLIC") visibilities: kotlin.String,
        @Parameter(description = "the start index for pagination", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "the limit for pagination", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Tournaments",
        operationId = "searchTournaments",
        description = """Search for tournaments""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = MissionShortResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/tournament/search"
        value = [PATH_SEARCH_TOURNAMENTS],
        produces = ["*/*"]
    )
    fun searchTournaments(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The application key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "the keyword to search tournament on") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "filter results by subType") @Valid @RequestParam(value = "subType", required = false) subType: kotlin.String?,
        @Parameter(description = "whether to include inactives in the search or not", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "includeInactive", required = false, defaultValue = "false") includeInactive: kotlin.Boolean,
        @Parameter(description = "comma separated list of mission types to filter results, possbile values include: TOURNAMENT, POOLPLAY, MULTISTAGE", schema = Schema(defaultValue = "MULTISTAGE,TOURNAMENT,POOLPLAY")) @Valid @RequestParam(value = "missionTypes", required = false, defaultValue = "MULTISTAGE,TOURNAMENT,POOLPLAY") missionTypes: kotlin.String,
        @Parameter(description = "filter tournaments by the tournament's current state", schema = Schema(allowableValues = ["ALL", "UPCOMING", "PAST", "PRESENT", "ACTIVE"], defaultValue = "UPCOMING")) @Valid @RequestParam(value = "filter", required = false, defaultValue = "UPCOMING") filter: kotlin.String,
        @Parameter(description = "which field to sort on", schema = Schema(allowableValues = ["ACTIVE", "TITLE", "DESCRIPTION", "CREATED", "UPDATED", "MISSION_TYPE", "OWNER_DISPLAY", "START_DATE", "END_DATE", "STARTING_LIMIT", "AVAILABLE_LIMIT", "INVITE_COUNT", "ACCEPTED_COUNT"], defaultValue = "START_DATE")) @Valid @RequestParam(value = "sortField", required = false, defaultValue = "START_DATE") sortField: kotlin.String,
        @Parameter(description = "Determines whether to return results in descending order. The default value will be true if the filter is \"PAST\", otherwise the default value will be false.") @Valid @RequestParam(value = "descending", required = false) descending: kotlin.Boolean?,
        @Parameter(description = "Comma separated list of visibility flags for search for, possible values include: PUBLIC, LISTABLE, REWARDABLE, TRIGGERABLE, PRIVATE", schema = Schema(defaultValue = "PUBLIC")) @Valid @RequestParam(value = "visibility", required = false, defaultValue = "PUBLIC") visibility: kotlin.String,
        @Parameter(description = "Start the result set at some index.", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "Limit the result to some number", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int
    ): ResponseEntity<MissionShortResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Submit Tournament Score",
        operationId = "submitTournamentScore",
        description = """Submit an array of scores for a tournament match. """,
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/tournament/score"
        value = [PATH_SUBMIT_TOURNAMENT_SCORE],
        produces = ["*/*"]
    )
    fun submitTournamentScore(
        @NotNull @Parameter(description = "The logged in user account ID.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The application key.", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "The missionId to score for", required = true) @Valid @RequestParam(value = "missionId", required = true) missionId: kotlin.Long,
        @NotNull @Parameter(description = "The gameId to score for", required = true) @Valid @RequestParam(value = "gameId", required = true) gameId: kotlin.Long,
        @NotNull @Parameter(description = "The packId to score for", required = true) @Valid @RequestParam(value = "packId", required = true) packId: kotlin.Long,
        @NotNull @Parameter(description = "a JSON Array of scores to submit for a tournament match ```json [   {     \"accountId\": 2,     \"points\": 3   },   {     \"accountId\": 1777662,     \"points\": 7   } ] ``` ", required = true) @Valid @RequestParam(value = "scores", required = true) scores: kotlin.String,
        @Parameter(description = "The gameLevelId to score for") @Valid @RequestParam(value = "gameLevelId", required = false) gameLevelId: kotlin.Long?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Submit a vote for a multi-stage album tournament.",
        operationId = "submitTournamentVote",
        description = """Submit a vote for a multi-stage album tournament.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/tournament/vote"
        value = [PATH_SUBMIT_TOURNAMENT_VOTE],
        produces = ["*/*"]
    )
    fun submitTournamentVote(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The application to target", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "The tournament's primary id", required = true) @Valid @RequestParam(value = "missionId", required = true) missionId: kotlin.Long,
        @NotNull @Parameter(description = "The tournament game object the user wants to vote on", required = true) @Valid @RequestParam(value = "gameObjectId", required = true) gameObjectId: kotlin.Long,
        @Parameter(description = "The unique id of the device making the request (optional)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "When true, check if the device already voted to prevent duplicate votes from the same device", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "checkIfDeviceAlreadyVoted", required = false, defaultValue = "false") checkIfDeviceAlreadyVoted: kotlin.Boolean
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Substitute Tournament Player",
        operationId = "substituteTournamentPlayer",
        description = """Service to replace the user's opponent in the current level - pack - mission with an AI account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/tournament/substitute"
        value = [PATH_SUBSTITUTE_TOURNAMENT_PLAYER],
        produces = ["*/*"]
    )
    fun substituteTournamentPlayer(
        @NotNull @Parameter(description = "the id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the mission", required = true) @Valid @RequestParam(value = "missionId", required = true) missionId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the pack", required = true) @Valid @RequestParam(value = "packId", required = true) packId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the game level", required = true) @Valid @RequestParam(value = "gameLevelId", required = true) gameLevelId: kotlin.Long
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Tournament",
        operationId = "updateTournament",
        description = """Update a tournament.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = TournamentResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/tournament/update"
        value = [PATH_UPDATE_TOURNAMENT],
        produces = ["*/*"]
    )
    fun updateTournament(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The mission/tournament to update", required = true) @Valid @RequestParam(value = "missionId", required = true) missionId: kotlin.Long,
        @Parameter(description = "The title of the tournament") @Valid @RequestParam(value = "title", required = false) title: kotlin.String?,
        @Parameter(description = "Custom string client apps can use for searching/filtering missions") @Valid @RequestParam(value = "subType", required = false) subType: kotlin.String?,
        @Parameter(description = "The asset ID to attach to the tournament") @Valid @RequestParam(value = "imageAssetId", required = false) imageAssetId: kotlin.Long?,
        @Parameter(description = "The number of seconds in between the start of each tournament game") @Valid @RequestParam(value = "secondsBetweenLevels", required = false) secondsBetweenLevels: kotlin.Int?,
        @Parameter(description = "The number of seconds to extend the round end time in the case of a tie breaker") @Valid @RequestParam(value = "secondsForTieBreaker", required = false) secondsForTieBreaker: kotlin.Int?,
        @Parameter(description = "The number of seconds in between the start of each tournament round") @Valid @RequestParam(value = "secondsBetweenPacks", required = false) secondsBetweenPacks: kotlin.Int?,
        @Parameter(description = "The maximum number of seconds the match is expected to end at, which gets used to determine when a match should end when there is no activity") @Valid @RequestParam(value = "maximumLevelLength", required = false) maximumLevelLength: kotlin.Int?,
        @Parameter(description = "The number of tickets required to pay to enter the tournament") @Valid @RequestParam(value = "costToPlay", required = false) costToPlay: kotlin.Int?,
        @Parameter(description = "The type of ticket required to pay") @Valid @RequestParam(value = "costToPlayType", required = false) costToPlayType: kotlin.String?,
        @Parameter(description = "The minimum number of players required to sign up for the tournament to be played") @Valid @RequestParam(value = "minimumToPlay", required = false) minimumToPlay: kotlin.Int?,
        @Parameter(description = "The starting number of players for a tournament (filled with AI's)") @Valid @RequestParam(value = "startingLimit", required = false) startingLimit: kotlin.Int?,
        @Parameter(description = "The maximum number of players for a tournament (currently 128 but not enforced)") @Valid @RequestParam(value = "availableLimit", required = false) availableLimit: kotlin.Int?,
        @Parameter(description = "The description of the tournament") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "External custom client defined data") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?,
        @Parameter(description = "The date/time to start the tournament") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "The audiences associated with the tournament") @Valid @RequestParam(value = "audienceIds", required = false) audienceIds: kotlin.String?,
        @Parameter(description = "Activate/deactivate the mission") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "Determines whether to allow players to buy back into a tournament") @Valid @RequestParam(value = "enableBuyBack", required = false) enableBuyBack: kotlin.Boolean?,
        @Parameter(description = "The list of offers to give as a reward beyond the tickets") @Valid @RequestParam(value = "offerIds", required = false) offerIds: kotlin.String?,
        @Parameter(description = "The artwork ID to attach to the reward offer") @Valid @RequestParam(value = "offerAssetId", required = false) offerAssetId: kotlin.Long?,
        @Parameter(description = "If set then do not update the ticket reward, auto set to true if offerIds provided") @Valid @RequestParam(value = "fixedReward", required = false) fixedReward: kotlin.Boolean?,
        @Parameter(description = "Set the rules for handling the reward in case of a tie, values: EVEN split the reward evenly ALL everyone gets the full reward value FIRST first score submitted RANDOM random player who scored", schema = Schema(allowableValues = ["EVEN", "ALL", "FIRST", "RANDOM"])) @Valid @RequestParam(value = "splitReward", required = false) splitReward: kotlin.String?,
        @Parameter(description = "Flag to indicate owner should receive tickets for completed missions") @Valid @RequestParam(value = "allocateTickets", required = false) allocateTickets: kotlin.Boolean?,
        @Parameter(description = "A text based string that will be passed into each tournament setup to populate the content") @Valid @RequestParam(value = "tournamentData", required = false) tournamentData: kotlin.String?,
        @Parameter(description = "Sets the visibility flag for the tournament", schema = Schema(allowableValues = ["PUBLIC", "LISTABLE", "REWARDABLE", "TRIGGERABLE", "PRIVATE"])) @Valid @RequestParam(value = "visibility", required = false) visibility: kotlin.String?,
        @Parameter(description = "The number of initial preliminary groups in a multi-stage tournament (this is expected to be a power of two number)") @Valid @RequestParam(value = "preliminaryGroups", required = false) preliminaryGroups: kotlin.Int?,
        @Parameter(description = "This determines how many people can advance per round in a preliminary group (this is a comma separated list of integers)") @Valid @RequestParam(value = "preliminaryGroupAdvancements", required = false) preliminaryGroupAdvancements: kotlin.String?,
        @Parameter(description = "This determines if multiple submissions/entries are allowed in a multi-stage album tournament") @Valid @RequestParam(value = "enableMultipleEntries", required = false) enableMultipleEntries: kotlin.Boolean?,
        @Parameter(description = "This determines if users are allowed to vote multiple times per group in a multi-stage album tournament") @Valid @RequestParam(value = "enableMultipleVotes", required = false) enableMultipleVotes: kotlin.Boolean?,
        @Parameter(description = "This determines whether the tournament is \"featured\" or not") @Valid @RequestParam(value = "featured", required = false) featured: kotlin.Boolean?,
        @Parameter(description = "This sets what analytic tag is used when a winner is determined") @Valid @RequestParam(value = "winnerTag", required = false) winnerTag: kotlin.String?,
        @Parameter(description = "This sets what analytic tag is used when a winner is determined") @Valid @RequestParam(value = "tieTag", required = false) tieTag: kotlin.String?
    ): ResponseEntity<TournamentResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_TOURNAMENT: String = "/tournament/create"
        const val PATH_DELETE_TOURNAMENT: String = "/tournament/delete"
        const val PATH_GET_TOURNAMENT: String = "/tournament/get"
        const val PATH_SEARCH_OBJECTS: String = "/tournament/object/search"
        const val PATH_SEARCH_ROUNDS: String = "/tournament/round/search"
        const val PATH_SEARCH_TOURNAMENTS: String = "/tournament/search"
        const val PATH_SUBMIT_TOURNAMENT_SCORE: String = "/tournament/score"
        const val PATH_SUBMIT_TOURNAMENT_VOTE: String = "/tournament/vote"
        const val PATH_SUBSTITUTE_TOURNAMENT_PLAYER: String = "/tournament/substitute"
        const val PATH_UPDATE_TOURNAMENT: String = "/tournament/update"
    }
}
