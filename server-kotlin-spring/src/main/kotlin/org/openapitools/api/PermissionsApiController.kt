package org.openapitools.api

import org.openapitools.model.UserPermissionsResponse
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
class PermissionsApiController() {

    @Operation(
        summary = "Search Permissionables",
        operationId = "searchPermissionables",
        description = """Search on UserPermissions""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = UserPermissionsResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/permissions/search"
        value = [PATH_SEARCH_PERMISSIONABLES],
        produces = ["*/*"]
    )
    fun searchPermissionables(
        @Parameter(description = "A unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "Filter results for a specific user account") @Valid @RequestParam(value = "connectionAccountId", required = false) connectionAccountId: kotlin.Long?,
        @Parameter(description = "Comma separated list of account IDs to filter results with") @Valid @RequestParam(value = "connectionAccountIds", required = false) connectionAccountIds: kotlin.String?,
        @Parameter(description = "Filter user permissions by the permissionable object type", schema = Schema(allowableValues = ["ACCOUNT", "GAMELEVEL", "ALBUM_CONTEST", "THEME_DESCRIPTOR", "SCHEDULED_NOTIFICATION", "TASK", "TRIGGER"])) @Valid @RequestParam(value = "permissionableType", required = false) permissionableType: kotlin.String?,
        @Parameter(description = "The id of the permissionable object to filter by") @Valid @RequestParam(value = "permissionableId", required = false) permissionableId: kotlin.Long?,
        @Parameter(description = "Keyword to search within permissionable records") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "Field to sort results on") @Valid @RequestParam(value = "sortField", required = false) sortField: kotlin.String?,
        @Parameter(description = "Sort descending when true") @Valid @RequestParam(value = "descending", required = false) descending: kotlin.Boolean?,
        @Parameter(description = "Return user permissions that are pending") @Valid @RequestParam(value = "pending", required = false) pending: kotlin.Boolean?,
        @Parameter(description = "Return user permissions that are admins") @Valid @RequestParam(value = "admin", required = false) admin: kotlin.Boolean?,
        @Parameter(description = "the start index for pagination", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "the limit for pagination", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int
    ): ResponseEntity<List<UserPermissionsResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Permissionables by Distnace",
        operationId = "searchPermissionablesFollowingDistance",
        description = """Search on UserPermissions by distance""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = UserPermissionsResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/permissions/distancesearch"
        value = [PATH_SEARCH_PERMISSIONABLES_FOLLOWING_DISTANCE],
        produces = ["*/*"]
    )
    fun searchPermissionablesFollowingDistance(
        @NotNull @Parameter(description = "The latitude of the current account", required = true) @Valid @RequestParam(value = "latitude", required = true) latitude: kotlin.Double,
        @NotNull @Parameter(description = "The longitude of the current account", required = true) @Valid @RequestParam(value = "longitude", required = true) longitude: kotlin.Double,
        @Parameter(description = "A unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "Filter results for a specific user account") @Valid @RequestParam(value = "connectionAccountId", required = false) connectionAccountId: kotlin.Long?,
        @Parameter(description = "Comma separated list of account IDs to filter results with") @Valid @RequestParam(value = "connectionAccountIds", required = false) connectionAccountIds: kotlin.String?,
        @Parameter(description = "Filter user permissions by the permissionable object type", schema = Schema(allowableValues = ["ACCOUNT", "GAMELEVEL", "ALBUM_CONTEST", "THEME_DESCRIPTOR", "SCHEDULED_NOTIFICATION", "TASK", "TRIGGER"])) @Valid @RequestParam(value = "permissionableType", required = false) permissionableType: kotlin.String?,
        @Parameter(description = "The id of the permissionable object to filter by") @Valid @RequestParam(value = "permissionableId", required = false) permissionableId: kotlin.Long?,
        @Parameter(description = "The search range in miles", schema = Schema(defaultValue = "5.0")) @Valid @RequestParam(value = "searchRange", required = false, defaultValue = "5.0") searchRange: kotlin.Double,
        @Parameter(description = "Keyword to search within permissionable records") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "Return user permissions that are pending") @Valid @RequestParam(value = "pending", required = false) pending: kotlin.Boolean?,
        @Parameter(description = "Return user permissions that are admins") @Valid @RequestParam(value = "admin", required = false) admin: kotlin.Boolean?,
        @Parameter(description = "The start index for pagination", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "The limit for pagination", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int
    ): ResponseEntity<List<UserPermissionsResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_SEARCH_PERMISSIONABLES: String = "/permissions/search"
        const val PATH_SEARCH_PERMISSIONABLES_FOLLOWING_DISTANCE: String = "/permissions/distancesearch"
    }
}
