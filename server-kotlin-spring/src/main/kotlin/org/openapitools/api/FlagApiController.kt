package org.openapitools.api

import org.openapitools.model.CountResponse
import org.openapitools.model.FlagResponse
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
class FlagApiController() {

    @Operation(
        summary = "Create Flag",
        operationId = "createFlag",
        description = """Allows a user to flag an object that the user deems inappropriate or offensive. Flagable objects include accounts, albums, album contests, assets, game levels, and theme descriptors""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/flag/create"
        value = [PATH_CREATE_FLAG],
        produces = ["*/*"]
    )
    fun createFlag(
        @NotNull @Parameter(description = "The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, NOTE, OFFER}", required = true) @Valid @RequestParam(value = "flagableType", required = true) flagableType: kotlin.String,
        @NotNull @Parameter(description = "The flagable object id", required = true) @Valid @RequestParam(value = "flagableId", required = true) flagableId: kotlin.Long,
        @Parameter(description = "The unique device identifier that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The unique accountId that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "An optional description of why is it being flagged") @Valid @RequestParam(value = "flagDescription", required = false) flagDescription: kotlin.String?,
        @Parameter(description = "The current location of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The current location of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Flag",
        operationId = "deleteFlag",
        description = """Deletes a flag.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/flag/delete"
        value = [PATH_DELETE_FLAG],
        produces = ["*/*"]
    )
    fun deleteFlag(
        @Parameter(description = "The unique device identifier that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The unique accountId that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "itemBeingFlaggedType", required = false) itemBeingFlaggedType: kotlin.String?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "itemBeingFlaggedId", required = false) itemBeingFlaggedId: kotlin.Long?,
        @Parameter(description = "The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, OFFER, NOTE}") @Valid @RequestParam(value = "flagableType", required = false) flagableType: kotlin.String?,
        @Parameter(description = "The flagable object id") @Valid @RequestParam(value = "flagableId", required = false) flagableId: kotlin.Long?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Flag",
        operationId = "getFlag",
        description = """Gets the details on whether the user has flagged a particular flagable object.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = FlagResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/flag/get"
        value = [PATH_GET_FLAG],
        produces = ["*/*"]
    )
    fun getFlag(
        @NotNull @Parameter(description = "The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, NOTE, OFFER}", required = true) @Valid @RequestParam(value = "flagableType", required = true) flagableType: kotlin.String,
        @NotNull @Parameter(description = "The flagable object id", required = true) @Valid @RequestParam(value = "flagableId", required = true) flagableId: kotlin.Long,
        @Parameter(description = "The unique device identifier that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The unique accountId that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The current location of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The current location of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<FlagResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Flag Threshold",
        operationId = "getFlagThreshold",
        description = """Get the flag threshold value on an object type for a particular application.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = CountResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/flag/threshold/get"
        value = [PATH_GET_FLAG_THRESHOLD],
        produces = ["*/*"]
    )
    fun getFlagThreshold(
        @NotNull @Parameter(description = "The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, OFFER, NOTE}", required = true) @Valid @RequestParam(value = "itemBeingFlaggedType", required = true) itemBeingFlaggedType: kotlin.String,
        @NotNull @Parameter(description = "The application key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String
    ): ResponseEntity<CountResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Flag Threshold",
        operationId = "updateFlagThreshold",
        description = """Update the flag threshold on an object type for a particular application.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = CountResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/flag/threshold/update"
        value = [PATH_UPDATE_FLAG_THRESHOLD],
        produces = ["*/*"]
    )
    fun updateFlagThreshold(
        @NotNull @Parameter(description = "The flagable object type {ACCOUNT, ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, THEME_DESCRIPTOR, OFFER, NOTE}", required = true) @Valid @RequestParam(value = "itemBeingFlaggedType", required = true) itemBeingFlaggedType: kotlin.String,
        @NotNull @Parameter(description = "The threshold value", required = true) @Valid @RequestParam(value = "threshold", required = true) threshold: kotlin.Long,
        @NotNull @Parameter(description = "The application key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "The unique device identifier that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The unique accountId that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?
    ): ResponseEntity<CountResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_FLAG: String = "/flag/create"
        const val PATH_DELETE_FLAG: String = "/flag/delete"
        const val PATH_GET_FLAG: String = "/flag/get"
        const val PATH_GET_FLAG_THRESHOLD: String = "/flag/threshold/get"
        const val PATH_UPDATE_FLAG_THRESHOLD: String = "/flag/threshold/update"
    }
}
