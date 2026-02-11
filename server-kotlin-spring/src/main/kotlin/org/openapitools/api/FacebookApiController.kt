package org.openapitools.api

import org.openapitools.model.SirqulResponse
import org.openapitools.model.TokenResponse
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
class FacebookApiController() {

    @Operation(
        summary = "Get Facebook Token",
        operationId = "getToken",
        description = """Gets a user's Facebook token.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = TokenResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/facebook/getfbtoken"
        value = [PATH_GET_TOKEN],
        produces = ["*/*"]
    )
    fun getToken(
        @Parameter(description = "a unique id given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "used to update the user's current location") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "used to update the user's current location") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<TokenResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Post to Facebook",
        operationId = "graphInterface",
        description = """Make Facebook posts on behalf of the user.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/facebook/graph"
        value = [PATH_GRAPH_INTERFACE],
        produces = ["*/*"]
    )
    fun graphInterface(
        @NotNull @Parameter(description = "the type of Sirqul event {DOWNLOADED_APP, CHALLENGE, LEVEL_COMPLETED, LEVEL_CREATED}", required = true) @Valid @RequestParam(value = "event", required = true) event: kotlin.String,
        @Parameter(description = "a unique id given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "for posting about information related to an object. Possible types: {ALBUM, ALBUM_CONTEST, GAME_LEVEL, THEME_DESCRIPTOR}") @Valid @RequestParam(value = "permissionableType", required = false) permissionableType: kotlin.String?,
        @Parameter(description = "the object id") @Valid @RequestParam(value = "permissionableId", required = false) permissionableId: kotlin.Long?,
        @Parameter(description = "used to include an asset on a Facebook post") @Valid @RequestParam(value = "assetId", required = false) assetId: kotlin.Long?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "gameType", required = false) gameType: kotlin.String?,
        @Parameter(description = "the application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "used to update the user's current location") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "used to update the user's current location") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_GET_TOKEN: String = "/facebook/getfbtoken"
        const val PATH_GRAPH_INTERFACE: String = "/facebook/graph"
    }
}
