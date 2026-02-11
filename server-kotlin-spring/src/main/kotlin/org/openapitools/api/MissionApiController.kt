package org.openapitools.api

import org.openapitools.model.MissionFormatResponse
import org.openapitools.model.MissionResponse
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
class MissionApiController() {

    @Operation(
        summary = "Create Mission",
        operationId = "createMission",
        description = """Create a user defined mission.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = MissionResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/mission/create"
        value = [PATH_CREATE_MISSION],
        produces = ["*/*"]
    )
    fun createMission(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The title of the mission", required = true) @Valid @RequestParam(value = "title", required = true) title: kotlin.String,
        @Parameter(description = "The description of the mission") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "Custom string client apps can use for searching/filtering missions") @Valid @RequestParam(value = "subType", required = false) subType: kotlin.String?,
        @Parameter(description = "The date/time to start the mission, send 0 to unset") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "The date/time to end the mission, send 0 to unset") @Valid @RequestParam(value = "endDate", required = false) endDate: kotlin.Long?,
        @Parameter(description = "Activate/deactivate the mission") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "the game level ids to include in the mission, comma separated") @Valid @RequestParam(value = "gameLevelIds", required = false) gameLevelIds: kotlin.String?,
        @Parameter(description = "creatives to associate with the mission") @Valid @RequestParam(value = "creativeIds", required = false) creativeIds: kotlin.String?,
        @Parameter(description = "audiences to associate with the mission") @Valid @RequestParam(value = "audienceIds", required = false) audienceIds: kotlin.String?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "missionTask", required = false) missionTask: kotlin.String?,
        @Parameter(description = "The string identifier for a mission format (this is not the missionFormatId)") @Valid @RequestParam(value = "formatType", required = false) formatType: kotlin.String?,
        @Parameter(description = "The offerId to give as a reward") @Valid @RequestParam(value = "offerId", required = false) offerId: kotlin.Long?,
        @Parameter(description = "Set the amount of money available to spend, once 0 deactivate mission. Set to a negative value for unlimited.") @Valid @RequestParam(value = "balance", required = false) balance: kotlin.Double?,
        @Parameter(description = "Flag to mark the mission as eligible for advanced reporting") @Valid @RequestParam(value = "advancedReporting", required = false) advancedReporting: kotlin.Boolean?,
        @Parameter(description = "Flag to indicate owner should receive tickets for completed missions") @Valid @RequestParam(value = "allocateTickets", required = false) allocateTickets: kotlin.Boolean?,
        @Parameter(description = "The number of tickets to reward") @Valid @RequestParam(value = "ticketCount", required = false) ticketCount: kotlin.Long?,
        @Parameter(description = "The type of ticket to reward, null means default type") @Valid @RequestParam(value = "ticketType", required = false) ticketType: kotlin.String?,
        @Parameter(description = "The number of points to award for completing a mission") @Valid @RequestParam(value = "points", required = false) points: kotlin.Long?,
        @Parameter(description = "external custom client defined data") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?,
        @Parameter(description = "Comma separated list of application ids") @Valid @RequestParam(value = "applicationIds", required = false) applicationIds: kotlin.String?,
        @Parameter(description = "Deprecated parameter for device names") @Valid @RequestParam(value = "devices", required = false) devices: kotlin.String?,
        @Parameter(description = "Comma separated list of device ids") @Valid @RequestParam(value = "deviceIds", required = false) deviceIds: kotlin.String?,
        @Parameter(description = "Comma separated list of device version ranges") @Valid @RequestParam(value = "deviceVersions", required = false) deviceVersions: kotlin.String?,
        @Parameter(description = "List of lat/long pairs for mission locations") @Valid @RequestParam(value = "locations", required = false) locations: kotlin.String?,
        @Parameter(description = "Comma separated list of radii for locations") @Valid @RequestParam(value = "radius", required = false) radius: kotlin.String?
    ): ResponseEntity<MissionResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Mission Invite",
        operationId = "createMissionInvite",
        description = """Create the mission invite. An account can only be invited to a mission one time. For missions that require user submission and reviewing the permissionableType and permissionableId need to be provided.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = MissionResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/mission/invite/create"
        value = [PATH_CREATE_MISSION_INVITE],
        produces = ["*/*"]
    )
    fun createMissionInvite(
        @Parameter(description = "the device id (deviceId or accountId required).") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required).") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The mission to find the invite for.") @Valid @RequestParam(value = "missionId", required = false) missionId: kotlin.Long?,
        @Parameter(description = "code to be entered for user to join the mission") @Valid @RequestParam(value = "joinCode", required = false) joinCode: kotlin.String?,
        @Parameter(description = "Include the game level data with the mission.") @Valid @RequestParam(value = "includeGameData", required = false) includeGameData: kotlin.Boolean?
    ): ResponseEntity<MissionResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Mission",
        operationId = "deleteMission",
        description = """Delete a mission.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/mission/delete"
        value = [PATH_DELETE_MISSION],
        produces = ["*/*"]
    )
    fun deleteMission(
        @NotNull @Parameter(description = "the id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the mission to delete", required = true) @Valid @RequestParam(value = "missionId", required = true) missionId: kotlin.Long
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Mission Invite",
        operationId = "deleteMissionInvite",
        description = """Update the mission invite status to quit.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/mission/invite/delete"
        value = [PATH_DELETE_MISSION_INVITE],
        produces = ["*/*"]
    )
    fun deleteMissionInvite(
        @Parameter(description = "the device id (deviceId or accountId required).") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required).") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The mission to find the invite for (missionId or missionInviteId requried).") @Valid @RequestParam(value = "missionId", required = false) missionId: kotlin.Long?,
        @Parameter(description = "The mission invite id. This checks on the user's billable for permission (missionId or missionInviteId requried).") @Valid @RequestParam(value = "missionInviteId", required = false) missionInviteId: kotlin.Long?,
        @Parameter(description = "Include the game level data with the mission.") @Valid @RequestParam(value = "includeGameData", required = false) includeGameData: kotlin.Boolean?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Find Missions",
        operationId = "findMissions",
        description = """Get a set of ad filtered by the parameters provided.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = MissionResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/mission/find"
        value = [PATH_FIND_MISSIONS],
        produces = ["*/*"]
    )
    fun findMissions(
        @NotNull @Parameter(description = "The application key, if provided return missions specific for the app. Will always return mission levels that are app agnostic.", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "The type of mission to get, possible values are: click_banner, click_leaderboard, click_skyscraper, click_full, click_video, or click_zip") @Valid @RequestParam(value = "suffix", required = false) suffix: kotlin.String?,
        @Parameter(description = "The type of ads to get, possible values are: BANNER, LEADERBOARD, SKYSCRAPER, FULL, VIDEO, ZIP, CONFIG. Use this instead of suffix.") @Valid @RequestParam(value = "type", required = false) type: kotlin.String?,
        @Parameter(description = "The logged in user.") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The version of the application, will not return levels newer than the appVersion.") @Valid @RequestParam(value = "appVersion", required = false) appVersion: kotlin.String?,
        @Parameter(description = "The current location of the requesting device") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The current location of the requesting device") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "Should use deviceId if possible. The name of the requesting device; possible values are: Android, iPhone, iPad, iPod, etc. use /audience/devices for list.") @Valid @RequestParam(value = "device", required = false) device: kotlin.String?,
        @Parameter(description = "The device ID of the requesting device, use /audience/devices for list") @Valid @RequestParam(value = "deviceIdentifier", required = false) deviceIdentifier: kotlin.Long?,
        @Parameter(description = "The requesting device version; examples are: 2.3, 5.1.4, 6.1.4. Supports X, X.X, or X.X.X formated string.") @Valid @RequestParam(value = "deviceVersion", required = false) deviceVersion: kotlin.String?,
        @Parameter(description = "The index into the record set to start with.") @Valid @RequestParam(value = "start", required = false) start: kotlin.Int?,
        @Parameter(description = "The total number of record to return.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "Include the game level data with the mission.") @Valid @RequestParam(value = "includeGameData", required = false) includeGameData: kotlin.Boolean?,
        @Parameter(description = "If true then return the audience data in the response. Default is false.") @Valid @RequestParam(value = "includeAudiences", required = false) includeAudiences: kotlin.Boolean?,
        @Parameter(description = "If true/false only return missions whose game levels allocate (or don't allocate) tickets. Do not provide a value to return both.") @Valid @RequestParam(value = "allocatesTickets", required = false) allocatesTickets: kotlin.Boolean?,
        @Parameter(description = "return a random set of results, default is true. If false returns in natural order.") @Valid @RequestParam(value = "randomize", required = false) randomize: kotlin.Boolean?,
        @Parameter(description = "return only ads targeted to the specific app, no global ads.") @Valid @RequestParam(value = "targetedAdsOnly", required = false) targetedAdsOnly: kotlin.Boolean?,
        @Parameter(description = "return only ads from the specified campaigns.") @Valid @RequestParam(value = "missionIds", required = false) missionIds: kotlin.String?,
        @Parameter(description = "will return the items that have at least 1 or all of their audiences exist in the logged in user’s audiences, depending if the value is OR or AND") @Valid @RequestParam(value = "audienceOperator", required = false) audienceOperator: kotlin.String?
    ): ResponseEntity<MissionResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Mission",
        operationId = "getMission",
        description = """Get a mission.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = MissionResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/mission/get"
        value = [PATH_GET_MISSION],
        produces = ["*/*"]
    )
    fun getMission(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The id of the mission to return.", required = true) @Valid @RequestParam(value = "missionId", required = true) missionId: kotlin.Long,
        @Parameter(description = "Return creatives associated with the mission when true") @Valid @RequestParam(value = "returnCreative", required = false) returnCreative: kotlin.Boolean?
    ): ResponseEntity<MissionResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Mission Invite",
        operationId = "getMissionInvite",
        description = """Get the mission invite. An account can only be invited to a mission one time.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = MissionResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/mission/invite/get"
        value = [PATH_GET_MISSION_INVITE],
        produces = ["*/*"]
    )
    fun getMissionInvite(
        @Parameter(description = "the device id (deviceId or accountId required).") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required).") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The mission to find the invite for (missionId or missionInviteId requried).") @Valid @RequestParam(value = "missionId", required = false) missionId: kotlin.Long?,
        @Parameter(description = "The mission invite id. This checks on the user's billable for permission (missionId or missionInviteId requried).") @Valid @RequestParam(value = "missionInviteId", required = false) missionInviteId: kotlin.Long?,
        @Parameter(description = "Include the game level data with the mission.") @Valid @RequestParam(value = "includeGameData", required = false) includeGameData: kotlin.Boolean?,
        @Parameter(description = "include the scores with the mission") @Valid @RequestParam(value = "includeScores", required = false) includeScores: kotlin.String?
    ): ResponseEntity<MissionResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Import Mission",
        operationId = "importMission",
        description = """Create a mission using a source item such as an offer location.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/mission/import"
        value = [PATH_IMPORT_MISSION],
        produces = ["*/*"]
    )
    fun importMission(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The current location of the requesting device", required = true) @Valid @RequestParam(value = "latitude", required = true) latitude: kotlin.Double,
        @NotNull @Parameter(description = "The current location of the requesting device", required = true) @Valid @RequestParam(value = "longitude", required = true) longitude: kotlin.Double,
        @NotNull @Parameter(description = "the application key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "the keyword of the mission") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "The starting index in the result set to return. Default is 0.") @Valid @RequestParam(value = "start", required = false) start: kotlin.Int?,
        @Parameter(description = "The total number of records to return. Default is 20.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "the size of the ad", schema = Schema(allowableValues = ["CONFIG", "BANNER", "LEADERBOARD", "SKYSCRAPER", "VIDEO", "ZIP", "INTERSTITIAL", "CUSTOM1", "CUSTOM2", "CUSTOM3", "CUSTOM4", "CUSTOM5", "CUSTOM6", "CUSTOM7", "CUSTOM8", "CUSTOM9", "CUSTOM10"])) @Valid @RequestParam(value = "adSize", required = false) adSize: kotlin.String?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Mission Formats",
        operationId = "searchMissionFormats",
        description = """Searches on pre-defined mission formats""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = MissionFormatResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/mission/format/search"
        value = [PATH_SEARCH_MISSION_FORMATS],
        produces = ["*/*"]
    )
    fun searchMissionFormats(
        @NotNull @Parameter(description = "The starting index in the result set to return. Default is 0.", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "The total number of records to return. Default is 20.", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @NotNull @Parameter(description = "Determines whether to return only active results. Default is false.", required = true) @Valid @RequestParam(value = "activeOnly", required = true) activeOnly: kotlin.Boolean
    ): ResponseEntity<List<MissionFormatResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Mission Invites",
        operationId = "searchMissionInvites",
        description = """Get a list of mission invites that the account has.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = MissionResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/mission/invite/search"
        value = [PATH_SEARCH_MISSION_INVITES],
        produces = ["*/*"]
    )
    fun searchMissionInvites(
        @Parameter(description = "the device id (deviceId or accountId required).") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required).") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the app to retrieve the data for, use your application key.") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "the application version, used to version the game level data") @Valid @RequestParam(value = "appVersion", required = false) appVersion: kotlin.String?,
        @Parameter(description = "the mission id to filter on") @Valid @RequestParam(value = "missionId", required = false) missionId: kotlin.Long?,
        @Parameter(description = "The invite status to filter for, comma separated list {AVAILABLE, PENDING, UPDATED, ACCEPTED, ACTIVE, QUIT, COMPLETED, PENDING_REVIEW, REJECTED}") @Valid @RequestParam(value = "status", required = false) status: kotlin.String?,
        @Parameter(description = "Only return invites that have been updated since this date/time (long)") @Valid @RequestParam(value = "lastUpdated", required = false) lastUpdated: kotlin.Long?,
        @Parameter(description = "The index into the record set to start with.") @Valid @RequestParam(value = "start", required = false) start: kotlin.Int?,
        @Parameter(description = "The total number of record to return.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "the keyword to search on") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "missionTypes", required = false) missionTypes: kotlin.String?,
        @Parameter(description = "filter results by the account's billable") @Valid @RequestParam(value = "filterByBillable", required = false) filterByBillable: kotlin.Boolean?,
        @Parameter(description = "Include the game level data with the mission.") @Valid @RequestParam(value = "includeGameData", required = false) includeGameData: kotlin.Boolean?
    ): ResponseEntity<List<MissionResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Missions",
        operationId = "searchMissions",
        description = """Get the list missions available to the account.  """,
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = MissionResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/mission/search"
        value = [PATH_SEARCH_MISSIONS],
        produces = ["*/*"]
    )
    fun searchMissions(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "Filter by keyword") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "Custom string client apps can use for searching/filtering missions") @Valid @RequestParam(value = "subType", required = false) subType: kotlin.String?,
        @Parameter(description = "The index into the record set to start with. Default is 0.") @Valid @RequestParam(value = "start", required = false) start: kotlin.Int?,
        @Parameter(description = "The total number of record to return. Default is 20, maximum is 100.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "If true then return the game level data in the response. Default is false.") @Valid @RequestParam(value = "includeGameData", required = false) includeGameData: kotlin.Boolean?,
        @Parameter(description = "If true then return the audience data in the response. Default is false.") @Valid @RequestParam(value = "includeAudiences", required = false) includeAudiences: kotlin.Boolean?,
        @Parameter(description = "If true then include inactive missions. Default is false.") @Valid @RequestParam(value = "includeInactive", required = false) includeInactive: kotlin.Boolean?,
        @Parameter(description = "A list of game types to include; click_leaderboard, click_banner, click_skyscraper, click_full, click_video, click_zip, create, vote, question, invite, share, json, xml") @Valid @RequestParam(value = "suffix", required = false) suffix: kotlin.String?,
        @Parameter(description = "The field to sort the search on (for example TITLE)") @Valid @RequestParam(value = "sortField", required = false) sortField: kotlin.String?,
        @Parameter(description = "Whether to sort in descending order (default true)") @Valid @RequestParam(value = "descending", required = false) descending: kotlin.Boolean?
    ): ResponseEntity<List<MissionResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Missions by Billable Entity",
        operationId = "searchMissionsByBillableEntity",
        description = """Use the accountId to determine the associated BillableEntity.  From there get a list of all accounts associated as managers.  Get the list missions owned by all associated managers.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = MissionResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/mission/searchByBillableEntity"
        value = [PATH_SEARCH_MISSIONS_BY_BILLABLE_ENTITY],
        produces = ["*/*"]
    )
    fun searchMissionsByBillableEntity(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "Filter by keyword") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "The index into the record set to start with. Default is 0.") @Valid @RequestParam(value = "start", required = false) start: kotlin.Int?,
        @Parameter(description = "The total number of record to return. Default id 20.") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "If true then return the game level data in the response. Default is false.") @Valid @RequestParam(value = "includeGameData", required = false) includeGameData: kotlin.Boolean?,
        @Parameter(description = "If true then return the audience data in the response. Default is false.") @Valid @RequestParam(value = "includeAudiences", required = false) includeAudiences: kotlin.Boolean?,
        @Parameter(description = "If true then include inactive missions. Default is false.") @Valid @RequestParam(value = "includeInactive", required = false) includeInactive: kotlin.Boolean?,
        @Parameter(description = "A list of game types to include; click_leaderboard, click_banner, click_skyscraper, click_full, click_video, click_zip, create, vote, question, invite, share, json, xml") @Valid @RequestParam(value = "suffix", required = false) suffix: kotlin.String?,
        @Parameter(description = "The field to sort the search on (for example TITLE)") @Valid @RequestParam(value = "sortField", required = false) sortField: kotlin.String?,
        @Parameter(description = "Whether to sort in descending order (default true)") @Valid @RequestParam(value = "descending", required = false) descending: kotlin.Boolean?
    ): ResponseEntity<List<MissionResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Mission",
        operationId = "updateMission",
        description = """Update a mission.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = MissionResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/mission/update"
        value = [PATH_UPDATE_MISSION],
        produces = ["*/*"]
    )
    fun updateMission(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The id of the mission to update.", required = true) @Valid @RequestParam(value = "missionId", required = true) missionId: kotlin.Long,
        @Parameter(description = "The title of the mission") @Valid @RequestParam(value = "title", required = false) title: kotlin.String?,
        @Parameter(description = "The description of the mission") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "Custom string client apps can use for searching/filtering missions") @Valid @RequestParam(value = "subType", required = false) subType: kotlin.String?,
        @Parameter(description = "external custom client defined data") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?,
        @Parameter(description = "The date/time to start the mission, send 0 to unset") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "The date/time to end the mission, send 0 to unset") @Valid @RequestParam(value = "endDate", required = false) endDate: kotlin.Long?,
        @Parameter(description = "Activate/deactivate the mission") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "the game level ids to include in the mission, comma separated") @Valid @RequestParam(value = "gameLevelIds", required = false) gameLevelIds: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "creativeIds", required = false) creativeIds: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "audienceIds", required = false) audienceIds: kotlin.String?,
        @Parameter(description = "The offerId to give as a reward") @Valid @RequestParam(value = "offerId", required = false) offerId: kotlin.Long?,
        @Parameter(description = "Replace the amount of money available to spend, once 0 deactivate mission. Set to a negative value for unlimited.") @Valid @RequestParam(value = "balance", required = false) balance: kotlin.Double?,
        @Parameter(description = "Flag to mark the mission as eligible for advanced reporting") @Valid @RequestParam(value = "advancedReporting", required = false) advancedReporting: kotlin.Boolean?,
        @Parameter(description = "Flag to indicate owner should receive tickets for completed missions") @Valid @RequestParam(value = "allocateTickets", required = false) allocateTickets: kotlin.Boolean?,
        @Parameter(description = "The number of tickets to reward") @Valid @RequestParam(value = "ticketCount", required = false) ticketCount: kotlin.Long?,
        @Parameter(description = "The type of ticket to reward, null means default type") @Valid @RequestParam(value = "ticketType", required = false) ticketType: kotlin.String?,
        @Parameter(description = "The number of points to award for completing a mission") @Valid @RequestParam(value = "points", required = false) points: kotlin.Long?,
        @Parameter(description = "Comma separated list of application ids") @Valid @RequestParam(value = "applicationIds", required = false) applicationIds: kotlin.String?,
        @Parameter(description = "Deprecated parameter for device names") @Valid @RequestParam(value = "devices", required = false) devices: kotlin.String?,
        @Parameter(description = "Comma separated list of device ids") @Valid @RequestParam(value = "deviceIds", required = false) deviceIds: kotlin.String?,
        @Parameter(description = "Comma separated list of device version ranges") @Valid @RequestParam(value = "deviceVersions", required = false) deviceVersions: kotlin.String?,
        @Parameter(description = "List of lat/long pairs for mission locations") @Valid @RequestParam(value = "locations", required = false) locations: kotlin.String?,
        @Parameter(description = "Comma separated list of radii for locations") @Valid @RequestParam(value = "radius", required = false) radius: kotlin.String?
    ): ResponseEntity<MissionResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Mission Invite",
        operationId = "updateMissionInvite",
        description = """Update the mission invite status. An account can only be invited to a mission one time. For missions that require user submission and reviewing the permissionableType and permissionableId need to be provided.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = MissionResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/mission/invite/update"
        value = [PATH_UPDATE_MISSION_INVITE],
        produces = ["*/*"]
    )
    fun updateMissionInvite(
        @Parameter(description = "the device id (deviceId or accountId required).") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required).") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "The mission to find the invite for (missionId or missionInviteId requried).") @Valid @RequestParam(value = "missionId", required = false) missionId: kotlin.Long?,
        @Parameter(description = "The mission invite id. This checks on the user's billable for permission (missionId or missionInviteId requried).") @Valid @RequestParam(value = "missionInviteId", required = false) missionInviteId: kotlin.Long?,
        @Parameter(description = "the pack id to find the invite for") @Valid @RequestParam(value = "packId", required = false) packId: kotlin.Long?,
        @Parameter(description = "the game level id to find the invite for") @Valid @RequestParam(value = "gameLevelId", required = false) gameLevelId: kotlin.Long?,
        @Parameter(description = "The invite status to filter for, comma separated list {AVAILABLE, PENDING, UPDATED, ACCEPTED, ACTIVE, QUIT, COMPLETED, PENDING_REVIEW, REJECTED}") @Valid @RequestParam(value = "status", required = false) status: kotlin.String?,
        @Parameter(description = "This is the content type for missions that require user submission. Note that user submitted content must require a status of PENDING_REVIEW to be accpeted. {ACCOUNT, GAMELEVEL, COLLECTION, ALBUM_CONTEST, THEME_DESCRIPTOR, ALBUM}") @Valid @RequestParam(value = "permissionableType", required = false) permissionableType: kotlin.String?,
        @Parameter(description = "The id of the content being submitted.") @Valid @RequestParam(value = "permissionableId", required = false) permissionableId: kotlin.Long?,
        @Parameter(description = "Include the game level data with the mission.") @Valid @RequestParam(value = "includeGameData", required = false) includeGameData: kotlin.Boolean?
    ): ResponseEntity<MissionResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_MISSION: String = "/mission/create"
        const val PATH_CREATE_MISSION_INVITE: String = "/mission/invite/create"
        const val PATH_DELETE_MISSION: String = "/mission/delete"
        const val PATH_DELETE_MISSION_INVITE: String = "/mission/invite/delete"
        const val PATH_FIND_MISSIONS: String = "/mission/find"
        const val PATH_GET_MISSION: String = "/mission/get"
        const val PATH_GET_MISSION_INVITE: String = "/mission/invite/get"
        const val PATH_IMPORT_MISSION: String = "/mission/import"
        const val PATH_SEARCH_MISSION_FORMATS: String = "/mission/format/search"
        const val PATH_SEARCH_MISSION_INVITES: String = "/mission/invite/search"
        const val PATH_SEARCH_MISSIONS: String = "/mission/search"
        const val PATH_SEARCH_MISSIONS_BY_BILLABLE_ENTITY: String = "/mission/searchByBillableEntity"
        const val PATH_UPDATE_MISSION: String = "/mission/update"
        const val PATH_UPDATE_MISSION_INVITE: String = "/mission/invite/update"
    }
}
