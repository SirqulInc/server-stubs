package org.openapitools.api

import org.openapitools.model.ConnectionInfoResponse
import org.openapitools.model.ConnectionListResponse
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
class ConnectionApiController() {

    @Operation(
        summary = "Add Connections",
        operationId = "addConnectionsToGroup",
        description = """Adds a list of connections to a group.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/connection/group/addConnections"
        value = [PATH_ADD_CONNECTIONS_TO_GROUP],
        produces = ["*/*"]
    )
    fun addConnectionsToGroup(
        @NotNull @Parameter(description = "the connection group ID", required = true) @Valid @RequestParam(value = "connectionGroupId", required = true) connectionGroupId: kotlin.Long,
        @Parameter(description = "the device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "comma separated list of connection ids") @Valid @RequestParam(value = "connectionIds", required = false) connectionIds: kotlin.String?,
        @Parameter(description = "comma separated list of connection account ids") @Valid @RequestParam(value = "connectionAccountIds", required = false) connectionAccountIds: kotlin.String?,
        @Parameter(description = "the current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Connection Groups",
        operationId = "groupSearch",
        description = """Gets a user's private groups and default groups.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = ConnectionInfoResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/connection/group/search"
        value = [PATH_GROUP_SEARCH],
        produces = ["*/*"]
    )
    fun groupSearch(
        @NotNull @Parameter(description = "the field to sort by", required = true, schema = Schema(allowableValues = ["CREATED", "UPDATED", "ACTIVE", "NAME", "DESCRIPTION", "CAN_VIEW_PROFILE_INFO", "CAN_VIEW_GAME_INFO", "CAN_VIEW_FRIEND_INFO", "INVITE_CODE", "OWNER_DISPLAY", "OWNER_USERNAME"])) @Valid @RequestParam(value = "sortField", required = true) sortField: kotlin.String,
        @NotNull @Parameter(description = "whether to return results in descending or ascending order", required = true) @Valid @RequestParam(value = "descending", required = true) descending: kotlin.Boolean,
        @NotNull @Parameter(description = "to search on active only or not", required = true) @Valid @RequestParam(value = "activeOnly", required = true) activeOnly: kotlin.Boolean,
        @NotNull @Parameter(description = "The start of the pagination", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "the limit of the pagination", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @Parameter(description = "the device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "keyword search string") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?
    ): ResponseEntity<List<ConnectionInfoResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Remove Connections",
        operationId = "removeConnectionsFromGroup",
        description = """Remove a list of connections from a group.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/connection/group/removeConnections"
        value = [PATH_REMOVE_CONNECTIONS_FROM_GROUP],
        produces = ["*/*"]
    )
    fun removeConnectionsFromGroup(
        @NotNull @Parameter(description = "connection group id", required = true) @Valid @RequestParam(value = "connectionGroupId", required = true) connectionGroupId: kotlin.Long,
        @Parameter(description = "the device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "comma separated list of connection ids") @Valid @RequestParam(value = "connectionIds", required = false) connectionIds: kotlin.String?,
        @Parameter(description = "comma separated list of connection account ids") @Valid @RequestParam(value = "connectionAccountIds", required = false) connectionAccountIds: kotlin.String?,
        @Parameter(description = "the current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Possible Connections",
        operationId = "searchConnections",
        description = """Search for accounts that the user may not have a connection with.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ConnectionListResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/connection/search"
        value = [PATH_SEARCH_CONNECTIONS],
        produces = ["*/*"]
    )
    fun searchConnections(
        @NotNull @Parameter(description = "return all json attributes if true. defualt is true.", required = true) @Valid @RequestParam(value = "returnNulls", required = true) returnNulls: kotlin.Boolean,
        @NotNull @Parameter(description = "start index of the pagination", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "limit of the pagination", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @Parameter(description = "the device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?,
        @Parameter(description = "keyword to search on, optional and this parameter is ignored if empt") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "the current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "gameType", required = false) gameType: kotlin.String?,
        @Parameter(description = "the public application key, if provided only looks for users of that application") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "_i", required = false) i: kotlin.Int?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "_l", required = false) l: kotlin.Int?,
        @Parameter(description = "the field to sort on") @Valid @RequestParam(value = "sortField", required = false) sortField: kotlin.String?,
        @Parameter(description = "whether the search has location or not") @Valid @RequestParam(value = "hasLocation", required = false) hasLocation: kotlin.Boolean?
    ): ResponseEntity<ConnectionListResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_ADD_CONNECTIONS_TO_GROUP: String = "/connection/group/addConnections"
        const val PATH_GROUP_SEARCH: String = "/connection/group/search"
        const val PATH_REMOVE_CONNECTIONS_FROM_GROUP: String = "/connection/group/removeConnections"
        const val PATH_SEARCH_CONNECTIONS: String = "/connection/search"
    }
}
