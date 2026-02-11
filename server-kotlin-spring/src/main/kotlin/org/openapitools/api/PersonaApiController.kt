package org.openapitools.api

import org.openapitools.model.PreviewPersonaResponse
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
class PersonaApiController() {

    @Operation(
        summary = "Create Persona",
        operationId = "createPersona",
        description = """Creates a new persona. If the given params are null those attributes will be override by null.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = PreviewPersonaResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/persona/create"
        value = [PATH_CREATE_PERSONA],
        produces = ["*/*"]
    )
    fun createPersona(
        @NotNull @Parameter(description = "the account ID of the user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the title of the persona", required = true) @Valid @RequestParam(value = "title", required = true) title: kotlin.String,
        @Parameter(description = "the accounts that are able to preview from this persona") @Valid @RequestParam(value = "previewAccounts", required = false) previewAccounts: kotlin.String?,
        @Parameter(description = "the sepcified date that this persona is viewing the app") @Valid @RequestParam(value = "date", required = false) date: kotlin.Long?,
        @Parameter(description = "the specified age of this persona") @Valid @RequestParam(value = "age", required = false) age: kotlin.Int?,
        @Parameter(description = "the specified gender of this persona") @Valid @RequestParam(value = "gender", required = false) gender: kotlin.String?,
        @Parameter(description = "the specified experience level of the persona") @Valid @RequestParam(value = "gameExperienceLevel", required = false) gameExperienceLevel: kotlin.String?,
        @Parameter(description = "the specified latitude of the persona") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the specified longitude of the persona") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<PreviewPersonaResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Persona",
        operationId = "deletePersona",
        description = """Mark the persona for deletion.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/persona/delete"
        value = [PATH_DELETE_PERSONA],
        produces = ["*/*"]
    )
    fun deletePersona(
        @NotNull @Parameter(description = "the account id of the user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the persona to delete", required = true) @Valid @RequestParam(value = "personaId", required = true) personaId: kotlin.Long
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Persona",
        operationId = "getPersonaList",
        description = """Get the persona by the given persona ID. If the persona cannot be found, a invalid response is returned.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = PreviewPersonaResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/persona/get"
        value = [PATH_GET_PERSONA_LIST],
        produces = ["*/*"]
    )
    fun getPersonaList(
        @NotNull @Parameter(description = "the account ID of the user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the persona ID of the persona", required = true) @Valid @RequestParam(value = "personaId", required = true) personaId: kotlin.Long
    ): ResponseEntity<PreviewPersonaResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Personas",
        operationId = "searchPersona",
        description = """Search for persona that the account owns by the given account ID.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = PreviewPersonaResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/persona/search"
        value = [PATH_SEARCH_PERSONA],
        produces = ["*/*"]
    )
    fun searchPersona(
        @NotNull @Parameter(description = "the account ID of the user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the start index for pagination", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "the limit for pagination (There is a hard limit of 100)", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int
    ): ResponseEntity<PreviewPersonaResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Persona",
        operationId = "updatePersona",
        description = """Update the persona by the given personaId. If the given params are null those attributes will be override by null. If active is assigned, all other params will be ignored.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = PreviewPersonaResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/persona/update"
        value = [PATH_UPDATE_PERSONA],
        produces = ["*/*"]
    )
    fun updatePersona(
        @NotNull @Parameter(description = "the account ID of the user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the persona ID of the persona to update", required = true) @Valid @RequestParam(value = "personaId", required = true) personaId: kotlin.Long,
        @Parameter(description = "the title of the persona") @Valid @RequestParam(value = "title", required = false) title: kotlin.String?,
        @Parameter(description = "the accounts that are able to preview from this persona") @Valid @RequestParam(value = "previewAccounts", required = false) previewAccounts: kotlin.String?,
        @Parameter(description = "the status of the persona, there can only be one active persona per account") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "the sepcified date that this persona is viewing the app") @Valid @RequestParam(value = "date", required = false) date: kotlin.Long?,
        @Parameter(description = "the specified age of this persona") @Valid @RequestParam(value = "age", required = false) age: kotlin.Int?,
        @Parameter(description = "the specified gender of this persona") @Valid @RequestParam(value = "gender", required = false) gender: kotlin.String?,
        @Parameter(description = "the specified experience level of the persona") @Valid @RequestParam(value = "gameExperienceLevel", required = false) gameExperienceLevel: kotlin.String?,
        @Parameter(description = "the specified latitude of the persona") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the specified longitude of the persona") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<PreviewPersonaResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_PERSONA: String = "/persona/create"
        const val PATH_DELETE_PERSONA: String = "/persona/delete"
        const val PATH_GET_PERSONA_LIST: String = "/persona/get"
        const val PATH_SEARCH_PERSONA: String = "/persona/search"
        const val PATH_UPDATE_PERSONA: String = "/persona/update"
    }
}
