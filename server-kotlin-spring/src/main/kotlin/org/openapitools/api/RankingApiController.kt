package org.openapitools.api

import org.openapitools.model.RankFullResponse
import org.openapitools.model.SirqulResponse
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
class RankingApiController() {

    @Operation(
        summary = "Search Historical Rankings",
        operationId = "getHistoricalRankings",
        description = """Get historical leaderboard rankings by time-frame.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = RankFullResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ranking/historical/search"
        value = [PATH_GET_HISTORICAL_RANKINGS],
        produces = ["*/*"]
    )
    fun getHistoricalRankings(
        @NotNull @Parameter(description = "the application key for filtering results by application", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "the rank type to return", required = true) @Valid @RequestParam(value = "rankType", required = true) rankType: kotlin.String,
        @NotNull @Parameter(description = "timestamp in milliseconds to filter results with", required = true) @Valid @RequestParam(value = "startDate", required = true) startDate: kotlin.Long,
        @NotNull @Parameter(description = "timestamp in milliseconds to filter results with", required = true) @Valid @RequestParam(value = "endDate", required = true) endDate: kotlin.Long,
        @Parameter(description = "a unique id given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "determines how to order and rank the results. Possible values include: TOTAL, MONTHLY, WEEKLY, DAILY, TOP, LOWEST", schema = Schema(defaultValue = "TOTAL")) @Valid @RequestParam(value = "sortField", required = false, defaultValue = "TOTAL") sortField: kotlin.String,
        @Parameter(description = "determines whether to return results in ascending or descending order", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "descending", required = false, defaultValue = "true") descending: kotlin.Boolean,
        @Parameter(description = "the start index for pagination", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "the limit for pagination", schema = Schema(defaultValue = "100")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "100") limit: kotlin.Int
    ): ResponseEntity<RankFullResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Rankings",
        operationId = "getRankings",
        description = """Get leader board rankings. This is an all in one endpoint that can return multiple ranking types and also the current user rank.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = RankFullResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ranking/search"
        value = [PATH_GET_RANKINGS],
        produces = ["*/*"]
    )
    fun getRankings(
        @Parameter(description = "a unique id given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "gameType", required = false) gameType: kotlin.String?,
        @Parameter(description = "the application key for filtering results by application (required for non-EXECUTIVE users)") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?,
        @Parameter(description = "keyword to search for") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "a comma separated list of rank types to return. Possible default rank types: POINTS, DOWNLOADS, INVITATIONS", schema = Schema(defaultValue = "POINTS,DOWNLOADS,INVITATIONS")) @Valid @RequestParam(value = "rankType", required = false, defaultValue = "POINTS,DOWNLOADS,INVITATIONS") rankType: kotlin.String,
        @Parameter(description = "the type of search to perform. Possible values include: GLOBAL - searches scores globally (all users in the system are included in the ranking) LOCAL - filters results by select users and on users that have logged into the same device CUSTOM - allows for custom filtering using the params: withinAccountIds, albumId, audienceId", schema = Schema(defaultValue = "GLOBAL")) @Valid @RequestParam(value = "leaderboardMode", required = false, defaultValue = "GLOBAL") leaderboardMode: kotlin.String,
        @Parameter(description = "comma separated list of account ids. If performing a LOCAL or CUSTOM search, the query will include these accounts.") @Valid @RequestParam(value = "withinAccountIds", required = false) withinAccountIds: kotlin.String?,
        @Parameter(description = "determines whether to return the user's current rank in the response. This can be turned off for sequential paginated requests.", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "returnUserRank", required = false, defaultValue = "true") returnUserRank: kotlin.Boolean,
        @Parameter(description = "album id to use when performing CUSTOM filters") @Valid @RequestParam(value = "albumId", required = false) albumId: kotlin.Long?,
        @Parameter(description = "audience id to use when performing CUSTOM filters") @Valid @RequestParam(value = "audienceId", required = false) audienceId: kotlin.Long?,
        @Parameter(description = "determines how to order and rank the results. Possible values include: TOTAL - order results by total score MONTHLY - order results by monthly score WEEKLY - order results by weekly score DAILY - order results by daily score TOP - order results by top score LOWEST - order results by lowest score", schema = Schema(defaultValue = "TOTAL")) @Valid @RequestParam(value = "sortField", required = false, defaultValue = "TOTAL") sortField: kotlin.String,
        @Parameter(description = "determines whether to return results in ascending or descending order", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "descending", required = false, defaultValue = "true") descending: kotlin.Boolean,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "_i", required = false) i: kotlin.Int?,
        @Parameter(description = "the start index for pagination", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "_l", required = false) l: kotlin.Int?,
        @Parameter(description = "the limit for pagination", schema = Schema(defaultValue = "100")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "100") limit: kotlin.Int
    ): ResponseEntity<RankFullResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Personal Rankings",
        operationId = "getUserRank",
        description = """Returns the user's ranks for one or more rank types and modes.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = kotlin.Any::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ranking/personal/ranks"
        value = [PATH_GET_USER_RANK],
        produces = ["*/*"]
    )
    fun getUserRank(
        @Parameter(description = "a unique id given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the application key for filtering results by application (required)") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "pass in all rankTypes and children rankTypes") @Valid @RequestParam(value = "rankType", required = false) rankType: kotlin.String?,
        @Parameter(description = "determines whether to return the user's current rank in the response, for each rankType", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "returnUserRank", required = false, defaultValue = "false") returnUserRank: kotlin.Boolean,
        @Parameter(description = "the type of search to perform. Possible values include: GLOBAL, LOCAL, SEARCH, CUSTOM", schema = Schema(defaultValue = "GLOBAL")) @Valid @RequestParam(value = "leaderboardMode", required = false, defaultValue = "GLOBAL") leaderboardMode: kotlin.String,
        @Parameter(description = "determines how to order and rank the results. Possible values include: TOTAL, MONTHLY, WEEKLY, DAILY, TOP, LOWEST", schema = Schema(defaultValue = "TOTAL")) @Valid @RequestParam(value = "sortField", required = false, defaultValue = "TOTAL") sortField: kotlin.String,
        @Parameter(description = "keyword to search for (on rankType)") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "determines whether to return results in descending order", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "descending", required = false, defaultValue = "true") descending: kotlin.Boolean,
        @Parameter(description = "the start index for pagination", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "the limit for pagination", schema = Schema(defaultValue = "100")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "100") limit: kotlin.Int
    ): ResponseEntity<kotlin.Any> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Override User Rank",
        operationId = "overrideUserRank",
        description = """Allows an admin of an application to override a user's scores for a leaderboard.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ranking/override"
        value = [PATH_OVERRIDE_USER_RANK],
        produces = ["*/*"]
    )
    fun overrideUserRank(
        @NotNull @Parameter(description = "the logged in user's account id (must have permissions to manage data for the application)", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the end user's account id to override", required = true) @Valid @RequestParam(value = "ownerAccountId", required = true) ownerAccountId: kotlin.Long,
        @NotNull @Parameter(description = "the application key the leaderboard is for", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "the rankType of the leaderboard", required = true) @Valid @RequestParam(value = "rankType", required = true) rankType: kotlin.String,
        @Parameter(description = "the total score to update") @Valid @RequestParam(value = "totalScore", required = false) totalScore: kotlin.Long?,
        @Parameter(description = "the total count to update") @Valid @RequestParam(value = "totalCount", required = false) totalCount: kotlin.Long?,
        @Parameter(description = "the total time to update") @Valid @RequestParam(value = "totalTime", required = false) totalTime: kotlin.Long?,
        @Parameter(description = "the daily score to update") @Valid @RequestParam(value = "dailyScore", required = false) dailyScore: kotlin.Long?,
        @Parameter(description = "the daily count to update") @Valid @RequestParam(value = "dailyCount", required = false) dailyCount: kotlin.Long?,
        @Parameter(description = "the daily time to update") @Valid @RequestParam(value = "dailyTime", required = false) dailyTime: kotlin.Long?,
        @Parameter(description = "the weekly score to update") @Valid @RequestParam(value = "weeklyScore", required = false) weeklyScore: kotlin.Long?,
        @Parameter(description = "the weekly count to update") @Valid @RequestParam(value = "weeklyCount", required = false) weeklyCount: kotlin.Long?,
        @Parameter(description = "the weekly time to update") @Valid @RequestParam(value = "weeklyTime", required = false) weeklyTime: kotlin.Long?,
        @Parameter(description = "the monthly score to update") @Valid @RequestParam(value = "monthlyScore", required = false) monthlyScore: kotlin.Long?,
        @Parameter(description = "the monthly count to update") @Valid @RequestParam(value = "monthlyCount", required = false) monthlyCount: kotlin.Long?,
        @Parameter(description = "the monthly time to update") @Valid @RequestParam(value = "monthlyTime", required = false) monthlyTime: kotlin.Long?,
        @Parameter(description = "the top score to update") @Valid @RequestParam(value = "topScore", required = false) topScore: kotlin.Long?,
        @Parameter(description = "the lowest score to update") @Valid @RequestParam(value = "lowestScore", required = false) lowestScore: kotlin.Long?,
        @Parameter(description = "the streak count to update") @Valid @RequestParam(value = "streakCount", required = false) streakCount: kotlin.Long?,
        @Parameter(description = "the best streak count to update") @Valid @RequestParam(value = "streakBestCount", required = false) streakBestCount: kotlin.Long?,
        @Parameter(description = "the start date to update") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "the end date to update") @Valid @RequestParam(value = "endDate", required = false) endDate: kotlin.Long?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Ranking",
        operationId = "updateRankings",
        description = """Update the rank value """,
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ranking/update"
        value = [PATH_UPDATE_RANKINGS],
        produces = ["*/*"]
    )
    fun updateRankings(
        @NotNull @Parameter(description = "the account id of the user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the application key for filtering results by application", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "a unique label for identifying the ranking. This can be any alphanumeric string (no spaces or special characters) with a maximum length of 64 characters. There are also default rank types to use which include: POINTS, DOWNLOADS, INVITATIONS, CREATIONS, VOTES, REDEEMED, ACTIONS", required = true) @Valid @RequestParam(value = "rankType", required = true) rankType: kotlin.String,
        @Parameter(description = "the value to increment", schema = Schema(defaultValue = "1L")) @Valid @RequestParam(value = "increment", required = false, defaultValue = "1L") increment: kotlin.Long,
        @Parameter(description = "the time value to increment") @Valid @RequestParam(value = "timeIncrement", required = false) timeIncrement: kotlin.Long?,
        @Parameter(description = "the analytic tag for this achievement (used to validate scores)") @Valid @RequestParam(value = "tag", required = false) tag: kotlin.String?,
        @Parameter(description = "custom date you can save along with the score for the user") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "custom date you can save along with the score for the user") @Valid @RequestParam(value = "endDate", required = false) endDate: kotlin.Long?,
        @Parameter(description = "update the global rankings if true, default is false") @Valid @RequestParam(value = "updateGlobal", required = false) updateGlobal: kotlin.Boolean?,
        @Parameter(description = "create the leaderboard if it does not exist (default false)", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "createLeaderboard", required = false, defaultValue = "false") createLeaderboard: kotlin.Boolean
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_GET_HISTORICAL_RANKINGS: String = "/ranking/historical/search"
        const val PATH_GET_RANKINGS: String = "/ranking/search"
        const val PATH_GET_USER_RANK: String = "/ranking/personal/ranks"
        const val PATH_OVERRIDE_USER_RANK: String = "/ranking/override"
        const val PATH_UPDATE_RANKINGS: String = "/ranking/update"
    }
}
