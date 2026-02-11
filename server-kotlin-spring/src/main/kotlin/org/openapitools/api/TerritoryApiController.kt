package org.openapitools.api

import org.openapitools.model.SirqulResponse
import org.openapitools.model.TerritoryResponse
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
class TerritoryApiController() {

    @Operation(
        summary = "Create Territory",
        operationId = "createTerritory",
        description = """Creates a territory.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = TerritoryResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/territory/create"
        value = [PATH_CREATE_TERRITORY],
        produces = ["*/*"]
    )
    fun createTerritory(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The name of the territory", required = true) @Valid @RequestParam(value = "name", required = true) name: kotlin.String,
        @Parameter(description = "If true set the game level as active. Default is true.") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?
    ): ResponseEntity<TerritoryResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Territory",
        operationId = "deleteTerritory",
        description = """Deletes a territory.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/territory/delete"
        value = [PATH_DELETE_TERRITORY],
        produces = ["*/*"]
    )
    fun deleteTerritory(
        @NotNull @Parameter(description = "the id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the territory to delete", required = true) @Valid @RequestParam(value = "territoryId", required = true) territoryId: kotlin.Long
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Territory",
        operationId = "getTerritory",
        description = """Get a territory.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = TerritoryResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/territory/get"
        value = [PATH_GET_TERRITORY],
        produces = ["*/*"]
    )
    fun getTerritory(
        @NotNull @Parameter(description = "the id of the territory to get", required = true) @Valid @RequestParam(value = "territoryId", required = true) territoryId: kotlin.Long
    ): ResponseEntity<TerritoryResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Territories",
        operationId = "searchTerritories",
        description = """Searches on territories.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = TerritoryResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/territory/search"
        value = [PATH_SEARCH_TERRITORIES],
        produces = ["*/*"]
    )
    fun searchTerritories(
        @NotNull @Parameter(description = "the field to sort by. Supported values include: ID, CREATED, UPDATED, NAME", required = true, schema = Schema(allowableValues = ["ID", "UPDATED", "CREATED", "NAME"])) @Valid @RequestParam(value = "sortField", required = true) sortField: kotlin.String,
        @NotNull @Parameter(description = "determines whether the sorted list is in descending or ascending order", required = true) @Valid @RequestParam(value = "descending", required = true) descending: kotlin.Boolean,
        @Parameter(description = "Return results that match this keyword.") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "The start index for pagination") @Valid @RequestParam(value = "start", required = false) start: kotlin.Int?,
        @Parameter(description = "The limit for pagination") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?
    ): ResponseEntity<List<TerritoryResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Territory",
        operationId = "updateTerritory",
        description = """Updates a territory.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = TerritoryResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/territory/update"
        value = [PATH_UPDATE_TERRITORY],
        produces = ["*/*"]
    )
    fun updateTerritory(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the territory to update", required = true) @Valid @RequestParam(value = "territoryId", required = true) territoryId: kotlin.Long,
        @Parameter(description = "The name of the territory") @Valid @RequestParam(value = "name", required = false) name: kotlin.String?,
        @Parameter(description = "If true set the game level as active.") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?
    ): ResponseEntity<TerritoryResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_TERRITORY: String = "/territory/create"
        const val PATH_DELETE_TERRITORY: String = "/territory/delete"
        const val PATH_GET_TERRITORY: String = "/territory/get"
        const val PATH_SEARCH_TERRITORIES: String = "/territory/search"
        const val PATH_UPDATE_TERRITORY: String = "/territory/update"
    }
}
