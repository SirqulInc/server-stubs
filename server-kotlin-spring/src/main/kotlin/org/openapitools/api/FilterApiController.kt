package org.openapitools.api

import org.openapitools.model.FilterResponse
import org.openapitools.model.FilterTreeResponse
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
class FilterApiController() {

    @Operation(
        summary = "Create Filter",
        operationId = "createFilter",
        description = """Create a filter""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = FilterTreeResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/filter/create"
        value = [PATH_CREATE_FILTER],
        produces = ["*/*"]
    )
    fun createFilter(
        @NotNull @Parameter(description = "The account id of the user (must have permissions to the target application)", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The name of the filter", required = true) @Valid @RequestParam(value = "name", required = true) name: kotlin.String,
        @Parameter(description = "The appKey of the application to assign the filter to, if not provided then the filter will be applied to the global application (if the account has permissions)") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "The ID of the parent filter, if not provided then the parent filter will be null") @Valid @RequestParam(value = "parentFilterId", required = false) parentFilterId: kotlin.Long?,
        @Parameter(description = "The description of the filter") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "A string identifier used by client applications to store external information") @Valid @RequestParam(value = "externalId", required = false) externalId: kotlin.String?,
        @Parameter(description = "A string type used by client applications to store external information") @Valid @RequestParam(value = "externalType", required = false) externalType: kotlin.String?,
        @Parameter(description = "Sets whether the filter is active or inactive (hidden from consumers)") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "external custom client defined data") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?
    ): ResponseEntity<FilterTreeResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Filter",
        operationId = "deleteFilter",
        description = """Delete a filter.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/filter/delete"
        value = [PATH_DELETE_FILTER],
        produces = ["*/*"]
    )
    fun deleteFilter(
        @NotNull @Parameter(description = "The account id of the user (must have permissions to the filter's assigned application)", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The ID of the filter to delete", required = true) @Valid @RequestParam(value = "filterId", required = true) filterId: kotlin.Long
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Filter",
        operationId = "getFilter",
        description = """Get the details of a specific filter. Recursively include all child filters and their children.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = FilterTreeResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/filter/get"
        value = [PATH_GET_FILTER],
        produces = ["*/*"]
    )
    fun getFilter(
        @NotNull @Parameter(description = "the id of the filter to get", required = true) @Valid @RequestParam(value = "filterId", required = true) filterId: kotlin.Long
    ): ResponseEntity<FilterTreeResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Filters",
        operationId = "searchFilters",
        description = """Search for filters.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = FilterResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/filter/search"
        value = [PATH_SEARCH_FILTERS],
        produces = ["*/*"]
    )
    fun searchFilters(
        @Parameter(description = "The account id of the user") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The string to search on") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "the appKey of the application to retrieve filters for") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "The group of filters to return: ALL, GLOBAL or MINE. ALL returns both global and application specific matches, GLOBAL only returns global matches, and MINE only returns the application specific matches. If not provided search on the application provided.", schema = Schema(allowableValues = ["ALL", "GLOBAL", "MINE"])) @Valid @RequestParam(value = "responseGroup", required = false) responseGroup: kotlin.String?,
        @Parameter(description = "Restrict the search to only those filters with no parent filter assigned.") @Valid @RequestParam(value = "rootOnly", required = false) rootOnly: kotlin.Boolean?,
        @Parameter(description = "The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, NAME, DISPLAY", schema = Schema(allowableValues = ["ID", "CREATED", "UPDATED", "DELETED", "SEARCH_TAGS", "ACTIVE", "NAME", "DISPLAY"], defaultValue = "DISPLAY")) @Valid @RequestParam(value = "sortField", required = false, defaultValue = "DISPLAY") sortField: kotlin.String,
        @Parameter(description = "The order to return the search results", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "descending", required = false, defaultValue = "false") descending: kotlin.Boolean,
        @Parameter(description = "The record to begin the return set on", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "The number of records to return", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int,
        @Parameter(description = "Determines whether to return only active categories", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "activeOnly", required = false, defaultValue = "true") activeOnly: kotlin.Boolean
    ): ResponseEntity<List<FilterResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Filter",
        operationId = "updateFilter",
        description = """Update a filter.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = FilterTreeResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/filter/update"
        value = [PATH_UPDATE_FILTER],
        produces = ["*/*"]
    )
    fun updateFilter(
        @NotNull @Parameter(description = "The account id of the user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The ID of the filter to edit", required = true) @Valid @RequestParam(value = "filterId", required = true) filterId: kotlin.Long,
        @Parameter(description = "The ID of the parent filter, if not provided then the parent filter will be null") @Valid @RequestParam(value = "parentFilterId", required = false) parentFilterId: kotlin.Long?,
        @Parameter(description = "The name of the filter") @Valid @RequestParam(value = "name", required = false) name: kotlin.String?,
        @Parameter(description = "The description of the filter") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "A string identifier used by client applications to store external information") @Valid @RequestParam(value = "externalId", required = false) externalId: kotlin.String?,
        @Parameter(description = "A string type used by client applications to store external information") @Valid @RequestParam(value = "externalType", required = false) externalType: kotlin.String?,
        @Parameter(description = "Sets whether the filter is active or inactive (hidden from consumers)") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "external custom client defined data") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?
    ): ResponseEntity<FilterTreeResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_FILTER: String = "/filter/create"
        const val PATH_DELETE_FILTER: String = "/filter/delete"
        const val PATH_GET_FILTER: String = "/filter/get"
        const val PATH_SEARCH_FILTERS: String = "/filter/search"
        const val PATH_UPDATE_FILTER: String = "/filter/update"
    }
}
