package org.openapitools.api

import org.openapitools.model.AccountResponse
import org.openapitools.model.SearchResponse
import org.openapitools.model.SirqulResponse
import org.openapitools.model.WrappedResponse
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
class FavoriteApiController() {

    @Operation(
        summary = "Create Favorite",
        operationId = "addFavorite",
        description = """Adds an offer, offer location, retailer location, or category to your favorites.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = WrappedResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/favorite/create"
        value = [PATH_ADD_FAVORITE],
        produces = ["*/*"]
    )
    fun addFavorite(
        @NotNull @Parameter(description = "The ID of the object to favorite {offerId, offerLocationId, retailerLocationId, categoryId}", required = true) @Valid @RequestParam(value = "favoritableId", required = true) favoritableId: kotlin.Long,
        @NotNull @Parameter(description = "The type of the object to favorite {OFFER, OFFER_LOCATION, RETAILER_LOCATION, CATEGORY, ALBUM}", required = true) @Valid @RequestParam(value = "favoritableType", required = true) favoritableType: kotlin.String,
        @Parameter(description = "The unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<WrappedResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Favorite",
        operationId = "deleteFavorite",
        description = """Removes a favorited item from the user's favorites list.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/favorite/delete"
        value = [PATH_DELETE_FAVORITE],
        produces = ["*/*"]
    )
    fun deleteFavorite(
        @Parameter(description = "The unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The ID of the favorite reference record (only optional if favoritableId & favoritableType is pass in instead)") @Valid @RequestParam(value = "favoriteId", required = false) favoriteId: kotlin.Long?,
        @Parameter(description = "The ID of the object to un-favorite {offerId, offerLocationId, retailerLocationId, categoryId} (this is required if favoriteId is NOT passed in)") @Valid @RequestParam(value = "favoritableId", required = false) favoritableId: kotlin.Long?,
        @Parameter(description = "The type of the object to un-favorite {OFFER, OFFER_LOCATION, RETAILER_LOCATION, CATEGORY} (this is required if favoriteId is NOT passed in)") @Valid @RequestParam(value = "favoritableType", required = false) favoritableType: kotlin.String?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Favorite",
        operationId = "getFavorite",
        description = """Retrieves a single favorited item.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = WrappedResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/favorite/get"
        value = [PATH_GET_FAVORITE],
        produces = ["*/*"]
    )
    fun getFavorite(
        @NotNull @Parameter(description = "The ID of the favorite reference record", required = true) @Valid @RequestParam(value = "favoriteId", required = true) favoriteId: kotlin.Long,
        @Parameter(description = "The unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<WrappedResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Favorites",
        operationId = "searchFavorites",
        description = """Searches on the user's favorites.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SearchResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/favorite/search"
        value = [PATH_SEARCH_FAVORITES],
        produces = ["*/*"]
    )
    fun searchFavorites(
        @NotNull @Parameter(description = "The type of the object to favorite {OFFER, OFFER_LOCATION, RETAILER_LOCATION, CATEGORY}", required = true) @Valid @RequestParam(value = "favoritableType", required = true) favoritableType: kotlin.String,
        @NotNull @Parameter(description = "Determines what to sort the results by {CREATED, UPDATED, DISPLAY}", required = true, schema = Schema(allowableValues = ["ID", "CREATED", "UPDATED", "DELETED", "SEARCH_TAGS", "ACTIVE", "DISPLAY"])) @Valid @RequestParam(value = "sortField", required = true) sortField: kotlin.String,
        @NotNull @Parameter(description = "Determines whether the results are in descending order", required = true) @Valid @RequestParam(value = "descending", required = true) descending: kotlin.Boolean,
        @NotNull @Parameter(description = "The start index for pagination", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "The limit for pagination (there is a hard limit of 1000)", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @NotNull @Parameter(description = "Determines whether to only return active favorites", required = true) @Valid @RequestParam(value = "activeOnly", required = true) activeOnly: kotlin.Boolean,
        @NotNull @Parameter(description = "Determines whether to return a detailed version of the response list", required = true) @Valid @RequestParam(value = "returnFullResponse", required = true) returnFullResponse: kotlin.Boolean,
        @Parameter(description = "The unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The ID of an account the user would like to view favorites for") @Valid @RequestParam(value = "connectionAccountId", required = false) connectionAccountId: kotlin.Long?,
        @Parameter(description = "") @Valid @RequestParam(value = "secondaryType", required = false) secondaryType: kotlin.String?,
        @Parameter(description = "The keyword to search for") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "The current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<SearchResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Who has Favorited",
        operationId = "whoHasFavorited",
        description = """Searches for everyone that has favorited an item""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = AccountResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/favorite/whois"
        value = [PATH_WHO_HAS_FAVORITED],
        produces = ["*/*"]
    )
    fun whoHasFavorited(
        @NotNull @Parameter(description = "The ID of the favoritableType to search on", required = true) @Valid @RequestParam(value = "favoritableId", required = true) favoritableId: kotlin.Long,
        @NotNull @Parameter(description = "The type of the object to favorite {OFFER, OFFER_LOCATION, RETAILER_LOCATION, CATEGORY}", required = true) @Valid @RequestParam(value = "favoritableType", required = true) favoritableType: kotlin.String,
        @NotNull @Parameter(description = "The start index for pagination", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "The limit for pagination", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @Parameter(description = "The unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "The keyword to limit that account list") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?
    ): ResponseEntity<List<AccountResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_ADD_FAVORITE: String = "/favorite/create"
        const val PATH_DELETE_FAVORITE: String = "/favorite/delete"
        const val PATH_GET_FAVORITE: String = "/favorite/get"
        const val PATH_SEARCH_FAVORITES: String = "/favorite/search"
        const val PATH_WHO_HAS_FAVORITED: String = "/favorite/whois"
    }
}
