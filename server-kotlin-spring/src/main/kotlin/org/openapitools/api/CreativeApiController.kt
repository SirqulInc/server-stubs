package org.openapitools.api

import org.openapitools.model.CreativeResponse
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
class CreativeApiController() {

    @Operation(
        summary = "Add Preview",
        operationId = "addPreview",
        description = """Enable this ad for preview for this account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/creative/addpreview"
        value = [PATH_ADD_PREVIEW],
        produces = ["*/*"]
    )
    fun addPreview(
        @NotNull @Parameter(description = "the id of the account", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The id of the creative that want to enable preview. The type of the creative should be CONFIG, otherwise no action will be applied.", required = true) @Valid @RequestParam(value = "creativeId", required = true) creativeId: kotlin.Long
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Creative",
        operationId = "createCreative",
        description = """Create a creative""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = CreativeResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/creative/create"
        value = [PATH_CREATE_CREATIVE],
        produces = ["*/*"]
    )
    fun createCreative(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The name of the level.", required = true) @Valid @RequestParam(value = "name", required = true) name: kotlin.String,
        @NotNull @Parameter(description = "If true set the game level as active. Default is false.", required = true) @Valid @RequestParam(value = "active", required = true) active: kotlin.Boolean,
        @NotNull @Parameter(description = "determines whether the response will wait until the asset gets created", required = true) @Valid @RequestParam(value = "waitForAsset", required = true) waitForAsset: kotlin.Boolean,
        @Parameter(description = "The description of the level.") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "The asset Id of the level image.") @Valid @RequestParam(value = "assetImageId", required = false) assetImageId: kotlin.Long?,
        @Parameter(description = "This parameter is deprecated. deprecated use data field") @Valid @RequestParam(value = "action", required = false) action: kotlin.String?,
        @Parameter(description = "The creative data, json based format depending on type. If not using action then data is required.") @Valid @RequestParam(value = "data", required = false) `data`: kotlin.String?,
        @Parameter(description = "This parameter is deprecated. deprecated use type field") @Valid @RequestParam(value = "suffix", required = false) suffix: kotlin.String?,
        @Parameter(description = "The type of creative. If not using suffix then type is required.") @Valid @RequestParam(value = "type", required = false) type: kotlin.String?,
        @Parameter(description = "Set the amount of money available to spend, once 0 deactivate level. Set to a negative value for unlimited.") @Valid @RequestParam(value = "balance", required = false) balance: kotlin.Double?,
        @Parameter(description = "if creative related so some other content provided the id") @Valid @RequestParam(value = "referenceId", required = false) referenceId: kotlin.Long?,
        @Parameter(description = "The version of the application, will not return creatives newer than the appVersion. Only used when requesting application configuration creatives.") @Valid @RequestParam(value = "appVersion", required = false) appVersion: kotlin.String?,
        @Parameter(description = "Assign the creative to a campaign for timing and audience matching.") @Valid @RequestParam(value = "missionId", required = false) missionId: kotlin.Long?,
        @Parameter(description = "the id of the offer") @Valid @RequestParam(value = "offerId", required = false) offerId: kotlin.Long?
    ): ResponseEntity<CreativeResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Creative",
        operationId = "deleteCreative",
        description = """Delete a creative""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/creative/delete"
        value = [PATH_DELETE_CREATIVE],
        produces = ["*/*"]
    )
    fun deleteCreative(
        @NotNull @Parameter(description = "the id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the creative to delete", required = true) @Valid @RequestParam(value = "creativeId", required = true) creativeId: kotlin.Long
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Creative",
        operationId = "getCreative",
        description = """Get a creative""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = CreativeResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/creative/get"
        value = [PATH_GET_CREATIVE],
        produces = ["*/*"]
    )
    fun getCreative(
        @NotNull @Parameter(description = "the id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the ID of the creative to get", required = true) @Valid @RequestParam(value = "creativeId", required = true) creativeId: kotlin.Long
    ): ResponseEntity<CreativeResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Creatives",
        operationId = "getCreativesByApplication",
        description = """Get a list of levels for an application, just those the account has permissions to view.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = CreativeResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/creative/search"
        value = [PATH_GET_CREATIVES_BY_APPLICATION],
        produces = ["*/*"]
    )
    fun getCreativesByApplication(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the application key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "Start the result set at some index.", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "Limit the result to some number.", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @Parameter(description = "Creatives contained in the provided mission.") @Valid @RequestParam(value = "missionId", required = false) missionId: kotlin.Long?,
        @Parameter(description = "Match the keyword to the owner name or level name.") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?
    ): ResponseEntity<List<CreativeResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Remove Preview",
        operationId = "removePreview",
        description = """Remove this ad for preview for this account.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/creative/removepreview"
        value = [PATH_REMOVE_PREVIEW],
        produces = ["*/*"]
    )
    fun removePreview(
        @NotNull @Parameter(description = "the ID of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the ID of the creative to remove preview", required = true) @Valid @RequestParam(value = "creativeId", required = true) creativeId: kotlin.Long
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Creative",
        operationId = "updateCreative",
        description = """Update a creative""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = CreativeResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/creative/update"
        value = [PATH_UPDATE_CREATIVE],
        produces = ["*/*"]
    )
    fun updateCreative(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the creative Id to upate.", required = true) @Valid @RequestParam(value = "creativeId", required = true) creativeId: kotlin.Long,
        @Parameter(description = "The name of the level.") @Valid @RequestParam(value = "name", required = false) name: kotlin.String?,
        @Parameter(description = "The description of the level.") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "The asset Id of the level image.") @Valid @RequestParam(value = "assetImageId", required = false) assetImageId: kotlin.Long?,
        @Parameter(description = "This parameter is deprecated. deprecated use data field") @Valid @RequestParam(value = "action", required = false) action: kotlin.String?,
        @Parameter(description = "The creative data, json based format depending on type") @Valid @RequestParam(value = "data", required = false) `data`: kotlin.String?,
        @Parameter(description = "This parameter is deprecated. deprecated use type field") @Valid @RequestParam(value = "suffix", required = false) suffix: kotlin.String?,
        @Parameter(description = "The type of creative.") @Valid @RequestParam(value = "type", required = false) type: kotlin.String?,
        @Parameter(description = "Set the amount of money available to spend, once 0 deactivate level. Set to a negative value for unlimited.") @Valid @RequestParam(value = "balance", required = false) balance: kotlin.Double?,
        @Parameter(description = "If true set the game level as active. Default is false.") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "if creative related so some other content provided the id") @Valid @RequestParam(value = "referenceId", required = false) referenceId: kotlin.Long?,
        @Parameter(description = "The version of the application, will not return creatives newer than the appVersion. Only used when requesting application configuration creatives.") @Valid @RequestParam(value = "appVersion", required = false) appVersion: kotlin.String?,
        @Parameter(description = "Assign the creative to a campaign for timing and audience matching.") @Valid @RequestParam(value = "missionId", required = false) missionId: kotlin.Long?
    ): ResponseEntity<CreativeResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_ADD_PREVIEW: String = "/creative/addpreview"
        const val PATH_CREATE_CREATIVE: String = "/creative/create"
        const val PATH_DELETE_CREATIVE: String = "/creative/delete"
        const val PATH_GET_CREATIVE: String = "/creative/get"
        const val PATH_GET_CREATIVES_BY_APPLICATION: String = "/creative/search"
        const val PATH_REMOVE_PREVIEW: String = "/creative/removepreview"
        const val PATH_UPDATE_CREATIVE: String = "/creative/update"
    }
}
