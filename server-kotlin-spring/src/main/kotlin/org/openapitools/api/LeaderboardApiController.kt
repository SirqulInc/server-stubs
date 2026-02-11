package org.openapitools.api

import org.openapitools.model.LeaderboardResponse
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
class LeaderboardApiController() {

    @Operation(
        summary = "Create a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation",
        operationId = "createLeaderboard",
        description = """Create a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = LeaderboardResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/leaderboard/create"
        value = [PATH_CREATE_LEADERBOARD],
        produces = ["*/*"]
    )
    fun createLeaderboard(
        @Parameter(description = "The account id of the user creating the leaderboard.") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "a unique label for identifying the ranking. This can be any alphanumeric string with a maximum length of 64 characters. There are also default rank types to use which include: POINTS, DOWNLOADS, INVITATIONS, CREATIONS, VOTES, REDEEMED, ACTIONS") @Valid @RequestParam(value = "rankType", required = false) rankType: kotlin.String?,
        @Parameter(description = "the type of search to perform. Possible values include: GLOBAL - searches scores globally (all users in the system are included in the ranking); LOCAL - filters results by select users and on users that have logged into the same device; SEARCH - does a GLOBAL search by keyword; CUSTOM - does a LOCAL search by keyword") @Valid @RequestParam(value = "leaderboardMode", required = false) leaderboardMode: kotlin.String?,
        @Parameter(description = "a MultipartFile containing the icon image of the leaderboard (this will only be used if \"iconAssetId\" is empty)") @Valid @RequestParam(value = "iconMedia", required = false) iconMedia: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "The asset ID to set the leaderboard icon") @Valid @RequestParam(value = "iconAssetId", required = false) iconAssetId: kotlin.Long?,
        @Parameter(description = "a MultipartFile containing the icon banner of the leaderboard (this will only be used if \"bannerAssetId\" is empty)") @Valid @RequestParam(value = "bannerMedia", required = false) bannerMedia: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "The asset ID to set the leaderboard banner") @Valid @RequestParam(value = "bannerAssetId", required = false) bannerAssetId: kotlin.Long?,
        @Parameter(description = "limit number of rankings for each leaderboard") @Valid @RequestParam(value = "limitation", required = false) limitation: kotlin.Int?,
        @Parameter(description = "determines how to order and rank the results. Possible values include: TOTAL, WEEKLY, DAILY, TOP, LOWEST") @Valid @RequestParam(value = "sortField", required = false) sortField: kotlin.String?,
        @Parameter(description = "leaderboard's title") @Valid @RequestParam(value = "title", required = false) title: kotlin.String?,
        @Parameter(description = "leaderboard's description") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "custom meta data for the leaderboard") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?
    ): ResponseEntity<LeaderboardResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete the Leader Board",
        operationId = "deleteLeaderboard",
        description = """Removes a leader board id.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/leaderboard/delete"
        value = [PATH_DELETE_LEADERBOARD],
        produces = ["*/*"]
    )
    fun deleteLeaderboard(
        @NotNull @Parameter(description = "The leaderboard id to delete.", required = true) @Valid @RequestParam(value = "leaderboardId", required = true) leaderboardId: kotlin.Long,
        @Parameter(description = "The account id of the user making the request.") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Read a leaderboard by id and retrieve the matching ranking list",
        operationId = "getLeaderboard",
        description = """Read a leaderboard by id and retrieve the matching ranking list""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = LeaderboardResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/leaderboard/get"
        value = [PATH_GET_LEADERBOARD],
        produces = ["*/*"]
    )
    fun getLeaderboard(
        @NotNull @Parameter(description = "The leaderboard id.", required = true) @Valid @RequestParam(value = "leaderboardId", required = true) leaderboardId: kotlin.Long,
        @Parameter(description = "A valid account.") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "set to true if need to return the leaderboard's full ranking list") @Valid @RequestParam(value = "includeFullRankingList", required = false) includeFullRankingList: kotlin.Boolean?
    ): ResponseEntity<LeaderboardResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search leaderboard and retrieve the matching ranking list",
        operationId = "searchLeaderboards",
        description = """Search leaderboard and retrieve the matching ranking list""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = LeaderboardResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/leaderboard/search"
        value = [PATH_SEARCH_LEADERBOARDS],
        produces = ["*/*"]
    )
    fun searchLeaderboards(
        @Parameter(description = "The account id of the user requesting the search.") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The application key.") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "only include global leaderboards (this overrides the appKey filter)") @Valid @RequestParam(value = "globalOnly", required = false) globalOnly: kotlin.Boolean?,
        @Parameter(description = "keyword to search by title") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "comma separated list of leaderboard ids to filter results with") @Valid @RequestParam(value = "leaderboardIds", required = false) leaderboardIds: kotlin.String?,
        @Parameter(description = "comma separated list of rankType to filter results with") @Valid @RequestParam(value = "rankTypes", required = false) rankTypes: kotlin.String?,
        @Parameter(description = "sortField of the result, from LeaderboardApiMap (TITLE, DESCRIPTION, CREATED, UPDATED, RANK_TYPE, RANK_MODE)") @Valid @RequestParam(value = "sortField", required = false) sortField: kotlin.String?,
        @Parameter(description = "Determines whether the sorted list is in descending or ascending order") @Valid @RequestParam(value = "descending", required = false) descending: kotlin.Boolean?,
        @Parameter(description = "include inactive in the result") @Valid @RequestParam(value = "includeInactive", required = false) includeInactive: kotlin.Boolean?,
        @Parameter(description = "determines whether to include the application response for each leaderboard") @Valid @RequestParam(value = "includeAppResponse", required = false) includeAppResponse: kotlin.Boolean?,
        @Parameter(description = "Start the result set at some index.") @Valid @RequestParam(value = "start", required = false) start: kotlin.Int?,
        @Parameter(description = "Limit the result to some number.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?
    ): ResponseEntity<LeaderboardResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation",
        operationId = "updateLeaderboard",
        description = """Update a leaderboard based on the rankingType, rankMode(leaderboardMode), sortField and limitation""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = LeaderboardResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/leaderboard/update"
        value = [PATH_UPDATE_LEADERBOARD],
        produces = ["*/*"]
    )
    fun updateLeaderboard(
        @NotNull @Parameter(description = "The leaderboard id to update.", required = true) @Valid @RequestParam(value = "leaderboardId", required = true) leaderboardId: kotlin.Long,
        @Parameter(description = "The account id of the user updating the leaderboard.") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "a unique label for identifying the ranking. This can be any alphanumeric string with a maximum length of 64 characters.") @Valid @RequestParam(value = "rankType", required = false) rankType: kotlin.String?,
        @Parameter(description = "the type of search to perform. Possible values include: GLOBAL, LOCAL, SEARCH, CUSTOM") @Valid @RequestParam(value = "leaderboardMode", required = false) leaderboardMode: kotlin.String?,
        @Parameter(description = "determines how to order and rank the results. Possible values include: TOTAL, WEEKLY, DAILY, TOP, LOWEST") @Valid @RequestParam(value = "sortField", required = false) sortField: kotlin.String?,
        @Parameter(description = "a MultipartFile containing the icon image of the leaderboard (this will only be used if \"iconAssetId\" is empty)") @Valid @RequestParam(value = "iconMedia", required = false) iconMedia: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "The asset ID to set the leaderboard icon") @Valid @RequestParam(value = "iconAssetId", required = false) iconAssetId: kotlin.Long?,
        @Parameter(description = "a MultipartFile containing the icon banner of the leaderboard (this will only be used if \"bannerAssetId\" is empty)") @Valid @RequestParam(value = "bannerMedia", required = false) bannerMedia: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "The asset ID to set the leaderboard banner") @Valid @RequestParam(value = "bannerAssetId", required = false) bannerAssetId: kotlin.Long?,
        @Parameter(description = "limit number of rankings for each leaderboard") @Valid @RequestParam(value = "limitation", required = false) limitation: kotlin.Int?,
        @Parameter(description = "Whether the leaderboard is active") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "leaderboard's title") @Valid @RequestParam(value = "title", required = false) title: kotlin.String?,
        @Parameter(description = "leaderboard's description") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "custom meta data for the leaderboard") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?
    ): ResponseEntity<LeaderboardResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_LEADERBOARD: String = "/leaderboard/create"
        const val PATH_DELETE_LEADERBOARD: String = "/leaderboard/delete"
        const val PATH_GET_LEADERBOARD: String = "/leaderboard/get"
        const val PATH_SEARCH_LEADERBOARDS: String = "/leaderboard/search"
        const val PATH_UPDATE_LEADERBOARD: String = "/leaderboard/update"
    }
}
