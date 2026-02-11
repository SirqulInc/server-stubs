package org.openapitools.api

import org.openapitools.model.RatingIndexResponse
import org.openapitools.model.RatingResponse
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
class RatingApiController() {

    @Operation(
        summary = "Create Rating",
        operationId = "createRating",
        description = """This is used to leave rating on a ratable object (i.e. retailer locations). Each user can only rate on a ratable object once per category. If a user rates on the same object and category, the previous rating will be overwritten. Leaving a rating on a ratable object will be visible to everyone who has access to view the object.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = RatingResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/rating/create"
        value = [PATH_CREATE_RATING],
        produces = ["*/*"]
    )
    fun createRating(
        @NotNull @Parameter(description = "The ratable object type {RETAILER_LOCATION}", required = true) @Valid @RequestParam(value = "ratableType", required = true) ratableType: kotlin.String,
        @NotNull @Parameter(description = "The id of the ratable object", required = true) @Valid @RequestParam(value = "ratableId", required = true) ratableId: kotlin.Long,
        @NotNull @Parameter(description = "The integer value of 0-100", required = true) @Valid @RequestParam(value = "ratingValue", required = true) ratingValue: kotlin.Int,
        @Parameter(description = "The unique device identifier that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The unique accountId that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "") @Valid @RequestParam(value = "categoryId", required = false) categoryId: kotlin.Long?,
        @Parameter(description = "A subject title for the user rating (limited to 255 characters)") @Valid @RequestParam(value = "display", required = false) display: kotlin.String?,
        @Parameter(description = "The description of the rating") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "The description of the location") @Valid @RequestParam(value = "locationDescription", required = false) locationDescription: kotlin.String?,
        @Parameter(description = "The current location of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The current location of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<RatingResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Rating",
        operationId = "deleteRating",
        description = """Sets a rating as deleted.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/rating/delete"
        value = [PATH_DELETE_RATING],
        produces = ["*/*"]
    )
    fun deleteRating(
        @NotNull @Parameter(description = "The ID of the rating to delete", required = true) @Valid @RequestParam(value = "ratingId", required = true) ratingId: kotlin.Long,
        @Parameter(description = "The unique device identifier that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The unique accountId that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Rating Indexes",
        operationId = "searchRatingIndexes",
        description = """Search for ratable items by averages.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = RatingIndexResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/rating/index/search"
        value = [PATH_SEARCH_RATING_INDEXES],
        produces = ["*/*"]
    )
    fun searchRatingIndexes(
        @NotNull @Parameter(description = "Filter results by a ratable type {RETAILER_LOCATION}", required = true, schema = Schema(allowableValues = ["LOCATABLE", "RESERVABLE", "PERMISSIONABLE", "NOTABLE", "ASSETABLE", "LIKABLE", "FLAGABLE", "FAVORITABLE", "RATABLE", "ALBUM", "COLLECTION", "APPLICATION", "APPLICATION_SETTING", "APPLICATION_CERT", "APPLICATION_PLACEMENT", "ACCOUNT", "ACCOUNT_SETTING", "GAME_LEVEL", "PACK", "MISSION", "TOURNAMENT", "ASSET", "ALBUM_CONTEST", "THEME_DESCRIPTOR", "OFFER", "OFFER_LOCATION", "EVENT", "RETAILER", "RETAILER_LOCATION", "NOTE", "CREATIVE", "FAVORITE", "LIKE", "RATING", "ANALYTIC", "THIRD_PARTY_CREDENTIAL", "THIRD_PARTY_NETWORK", "REGION"])) @Valid @RequestParam(value = "ratableType", required = true) ratableType: kotlin.String,
        @Parameter(description = "Comma separated list of ratable ids to filter the resuts by") @Valid @RequestParam(value = "ratableIds", required = false) ratableIds: kotlin.String?,
        @Parameter(description = "Comma separated list of category ids to filter the results by") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "secondaryType", required = false) secondaryType: kotlin.String?,
        @Parameter(description = "The keyword used to search") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "The column to sort the search on {ID, CREATED, UPDATED, ACTIVE, RATABLE_TYPE, RATABLE_ID, RATABLE_DISPLAY, CATEGORY_ID, CATEGORY_NAME, CATEGORY_SHORT_NAME, CATEGORY_DISPLAY, COUNT, SUMMATION, AVERAGE, VALUE}", schema = Schema(allowableValues = ["ID", "CREATED", "UPDATED", "DELETED", "SEARCH_TAGS", "ACTIVE", "RATABLE_TYPE", "RATABLE_ID", "RATABLE_DISPLAY", "CATEGORY_ID", "CATEGORY_NAME", "CATEGORY_SHORT_NAME", "CATEGORY_DISPLAY", "COUNT", "SUMMATION", "AVERAGE", "VALUE"])) @Valid @RequestParam(value = "sortField", required = false) sortField: kotlin.String?,
        @Parameter(description = "The order to return the search results") @Valid @RequestParam(value = "descending", required = false) descending: kotlin.Boolean?,
        @Parameter(description = "The record to begin the return set on") @Valid @RequestParam(value = "start", required = false) start: kotlin.Int?,
        @Parameter(description = "The number of records to return") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "Determines whether to return the ratable object in the response") @Valid @RequestParam(value = "returnRatable", required = false) returnRatable: kotlin.Boolean?,
        @Parameter(description = "Determines whether to return the overall rating record instead") @Valid @RequestParam(value = "returnOverallRating", required = false) returnOverallRating: kotlin.Boolean?
    ): ResponseEntity<List<RatingIndexResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Ratings",
        operationId = "searchRatings",
        description = """Search for ratings on a ratable object.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = RatingResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/rating/search"
        value = [PATH_SEARCH_RATINGS],
        produces = ["*/*"]
    )
    fun searchRatings(
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "Filter results for a particular account") @Valid @RequestParam(value = "filterAccountId", required = false) filterAccountId: kotlin.Long?,
        @Parameter(description = "The ratable object type {RETAILER_LOCATION}") @Valid @RequestParam(value = "ratableType", required = false) ratableType: kotlin.String?,
        @Parameter(description = "The id of the ratable object") @Valid @RequestParam(value = "ratableId", required = false) ratableId: kotlin.Long?,
        @Parameter(description = "Comma separated list of category ids to filter the results by") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "The keyword used to search") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "The column to sort the search on {ID, CREATED, UPDATED, ACTIVE, OWNER_DISPLAY, RATABLE_TYPE, RATABLE_ID, RATABLE_DISPLAY, CATEGORY_ID, CATEGORY_NAME, CATEGORY_SHORT_NAME, CATEGORY_DISPLAY, VALUE}", schema = Schema(allowableValues = ["ID", "CREATED", "UPDATED", "DELETED", "SEARCH_TAGS", "ACTIVE", "OWNER_DISPLAY", "RATABLE_TYPE", "RATABLE_ID", "RATABLE_DISPLAY", "CATEGORY_ID", "CATEGORY_NAME", "CATEGORY_SHORT_NAME", "CATEGORY_DISPLAY", "VALUE"])) @Valid @RequestParam(value = "sortField", required = false) sortField: kotlin.String?,
        @Parameter(description = "The order to return the search results") @Valid @RequestParam(value = "descending", required = false) descending: kotlin.Boolean?,
        @Parameter(description = "The record to begin the return set on") @Valid @RequestParam(value = "start", required = false) start: kotlin.Int?,
        @Parameter(description = "The number of records to return") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?
    ): ResponseEntity<List<RatingResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Rating",
        operationId = "updateRating",
        description = """Update an existing rating. Only the creator of the rating have permission to update.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = RatingResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/rating/update"
        value = [PATH_UPDATE_RATING],
        produces = ["*/*"]
    )
    fun updateRating(
        @NotNull @Parameter(description = "The id of the rating (Note: this is not the ratable object id)", required = true) @Valid @RequestParam(value = "ratingId", required = true) ratingId: kotlin.Long,
        @Parameter(description = "The unique device identifier that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The unique accountId that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The rating value to update") @Valid @RequestParam(value = "ratingValue", required = false) ratingValue: kotlin.Int?,
        @Parameter(description = "") @Valid @RequestParam(value = "categoryId", required = false) categoryId: kotlin.Long?,
        @Parameter(description = "A subject title for the user rating (limited to 255 characters)") @Valid @RequestParam(value = "display", required = false) display: kotlin.String?,
        @Parameter(description = "The description of the rating") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "The description of the location") @Valid @RequestParam(value = "locationDescription", required = false) locationDescription: kotlin.String?,
        @Parameter(description = "The current location of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The current location of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<RatingResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_RATING: String = "/rating/create"
        const val PATH_DELETE_RATING: String = "/rating/delete"
        const val PATH_SEARCH_RATING_INDEXES: String = "/rating/index/search"
        const val PATH_SEARCH_RATINGS: String = "/rating/search"
        const val PATH_UPDATE_RATING: String = "/rating/update"
    }
}
