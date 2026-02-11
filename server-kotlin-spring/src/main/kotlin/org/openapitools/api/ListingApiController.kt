package org.openapitools.api

import org.openapitools.model.ListingFullResponse
import org.openapitools.model.ListingGroupResponse
import org.openapitools.model.ListingResponse
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
class ListingApiController() {

    @Operation(
        summary = "Create Listing",
        operationId = "createListing",
        description = """Creates a listing.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ListingFullResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/listing/create"
        value = [PATH_CREATE_LISTING],
        produces = ["*/*"]
    )
    fun createListing(
        @NotNull @Parameter(description = "the user's account ID", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the name of the listing", required = true) @Valid @RequestParam(value = "name", required = true) name: kotlin.String,
        @Parameter(description = "comma separated list of filter IDs") @Valid @RequestParam(value = "filterIds", required = false) filterIds: kotlin.String?,
        @Parameter(description = "the description of the listing") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "the start date of the listing") @Valid @RequestParam(value = "start", required = false) start: kotlin.Long?,
        @Parameter(description = "the end date of the listing") @Valid @RequestParam(value = "end", required = false) end: kotlin.Long?,
        @Parameter(description = "the name of the location the listing will be held at") @Valid @RequestParam(value = "locationName", required = false) locationName: kotlin.String?,
        @Parameter(description = "the description of the location the listing will be held at") @Valid @RequestParam(value = "locationDescription", required = false) locationDescription: kotlin.String?,
        @Parameter(description = "determines whether the listing is public or private", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "isPrivate", required = false, defaultValue = "false") isPrivate: kotlin.Boolean,
        @Parameter(description = "external identifier used by a third party") @Valid @RequestParam(value = "externalId", required = false) externalId: kotlin.String?,
        @Parameter(description = "secondary external identifier used by a third party") @Valid @RequestParam(value = "externalId2", required = false) externalId2: kotlin.String?,
        @Parameter(description = "external group identifier used by a third party") @Valid @RequestParam(value = "externalGroupId", required = false) externalGroupId: kotlin.String?,
        @Parameter(description = "Sets the active flag") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "external custom client defined data") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?
    ): ResponseEntity<ListingFullResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Listing",
        operationId = "deleteListing",
        description = """Delete a listing.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/listing/delete"
        value = [PATH_DELETE_LISTING],
        produces = ["*/*"]
    )
    fun deleteListing(
        @NotNull @Parameter(description = "the id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the listing to delete", required = true) @Valid @RequestParam(value = "listingId", required = true) listingId: kotlin.Long
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Listing",
        operationId = "getListing",
        description = """Get a listing by id.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ListingFullResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/listing/get"
        value = [PATH_GET_LISTING],
        produces = ["*/*"]
    )
    fun getListing(
        @NotNull @Parameter(description = "the id of the listing to get", required = true) @Valid @RequestParam(value = "listingId", required = true) listingId: kotlin.Long
    ): ResponseEntity<ListingFullResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Listings",
        operationId = "searchListing",
        description = """Search for event listings from the start time to end time""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = ListingResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/listing/search"
        value = [PATH_SEARCH_LISTING],
        produces = ["*/*"]
    )
    fun searchListing(
        @Parameter(description = "the account id of the user") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "search the event name and description for this keyword") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "the record to begin the return set on", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "the number of records to return", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int,
        @Parameter(description = "whether to search on active listings only", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "activeOnly", required = false, defaultValue = "false") activeOnly: kotlin.Boolean,
        @Parameter(description = "the current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "the start date to search from") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "the end date to search to") @Valid @RequestParam(value = "endDate", required = false) endDate: kotlin.Long?,
        @Parameter(description = "only return items of these categories") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "filterIds", required = false) filterIds: kotlin.String?,
        @Parameter(description = "determines whether to use configured listing order ids", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "useListingOrderIds", required = false, defaultValue = "true") useListingOrderIds: kotlin.Boolean,
        @Parameter(description = "external identifier used by a third party") @Valid @RequestParam(value = "externalId", required = false) externalId: kotlin.String?,
        @Parameter(description = "secondary external identifier used by a third party") @Valid @RequestParam(value = "externalId2", required = false) externalId2: kotlin.String?,
        @Parameter(description = "external group identifier used by a third party") @Valid @RequestParam(value = "externalGroupId", required = false) externalGroupId: kotlin.String?
    ): ResponseEntity<List<ListingResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Summary Listing",
        operationId = "summaryListing",
        description = """Search for a list of summary listings from the start time up to 8 days out.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = ListingGroupResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/listing/summary"
        value = [PATH_SUMMARY_LISTING],
        produces = ["*/*"]
    )
    fun summaryListing(
        @Parameter(description = "the account id of the user") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the start date to search from") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "the list of categories to search on") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "how far out to search, in days", schema = Schema(defaultValue = "15")) @Valid @RequestParam(value = "daysToInclude", required = false, defaultValue = "15") daysToInclude: kotlin.Int,
        @Parameter(description = "determines whether to use configured listing order ids", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "useListingOrderIds", required = false, defaultValue = "true") useListingOrderIds: kotlin.Boolean
    ): ResponseEntity<List<ListingGroupResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Listing",
        operationId = "updateListing",
        description = """Updates a listing.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ListingFullResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/listing/update"
        value = [PATH_UPDATE_LISTING],
        produces = ["*/*"]
    )
    fun updateListing(
        @NotNull @Parameter(description = "the user's account ID", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the listing to update", required = true) @Valid @RequestParam(value = "listingId", required = true) listingId: kotlin.Long,
        @Parameter(description = "comma separated list of filter IDs") @Valid @RequestParam(value = "filterIds", required = false) filterIds: kotlin.String?,
        @Parameter(description = "the name of the listing") @Valid @RequestParam(value = "name", required = false) name: kotlin.String?,
        @Parameter(description = "the description of the listing") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "the start date of the listing") @Valid @RequestParam(value = "start", required = false) start: kotlin.Long?,
        @Parameter(description = "the end date of the listing") @Valid @RequestParam(value = "end", required = false) end: kotlin.Long?,
        @Parameter(description = "the name of the location the listing will be held at") @Valid @RequestParam(value = "locationName", required = false) locationName: kotlin.String?,
        @Parameter(description = "the description of the location the listing will be held at") @Valid @RequestParam(value = "locationDescription", required = false) locationDescription: kotlin.String?,
        @Parameter(description = "determines whether the listing is public or private") @Valid @RequestParam(value = "isPrivate", required = false) isPrivate: kotlin.Boolean?,
        @Parameter(description = "external identifier used by a third party") @Valid @RequestParam(value = "externalId", required = false) externalId: kotlin.String?,
        @Parameter(description = "secondary external identifier used by a third party") @Valid @RequestParam(value = "externalId2", required = false) externalId2: kotlin.String?,
        @Parameter(description = "external group identifier used by a third party") @Valid @RequestParam(value = "externalGroupId", required = false) externalGroupId: kotlin.String?,
        @Parameter(description = "Sets the active flag") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "external custom client defined data") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?
    ): ResponseEntity<ListingFullResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_LISTING: String = "/listing/create"
        const val PATH_DELETE_LISTING: String = "/listing/delete"
        const val PATH_GET_LISTING: String = "/listing/get"
        const val PATH_SEARCH_LISTING: String = "/listing/search"
        const val PATH_SUMMARY_LISTING: String = "/listing/summary"
        const val PATH_UPDATE_LISTING: String = "/listing/update"
    }
}
