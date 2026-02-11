package org.openapitools.api

import org.openapitools.model.ListCountResponse
import org.openapitools.model.OfferListResponse
import org.openapitools.model.OfferResponse
import org.openapitools.model.OfferShortResponse
import org.openapitools.model.OfferTransactionStatusResponse
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
class OfferApiController() {

    @Operation(
        summary = "Create Offer Status",
        operationId = "createOfferTransactionStatus",
        description = """Create an offer status record""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OfferTransactionStatusResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/offer/status/create"
        value = [PATH_CREATE_OFFER_TRANSACTION_STATUS],
        produces = ["*/*"]
    )
    fun createOfferTransactionStatus(
        @NotNull @Parameter(description = "The name of the status", required = true) @Valid @RequestParam(value = "name", required = true) name: kotlin.String,
        @NotNull @Parameter(description = "The status code, must be unique ", required = true) @Valid @RequestParam(value = "code", required = true) code: kotlin.Int,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "Used to update the user's current location") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "Used to update the user's current location") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "The description of the status") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "The actor that uses the status", schema = Schema(defaultValue = "ANY")) @Valid @RequestParam(value = "role", required = false, defaultValue = "ANY") role: kotlin.String,
        @Parameter(description = "The active status", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "active", required = false, defaultValue = "true") active: kotlin.Boolean,
        @Parameter(description = "The applications to associate the status with, if null then for all.") @Valid @RequestParam(value = "applicationIds", required = false) applicationIds: kotlin.String?
    ): ResponseEntity<OfferTransactionStatusResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Offer Status",
        operationId = "deleteOfferTransactionStatus",
        description = """Mark an offer status record as deleted""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/offer/status/delete"
        value = [PATH_DELETE_OFFER_TRANSACTION_STATUS],
        produces = ["*/*"]
    )
    fun deleteOfferTransactionStatus(
        @NotNull @Parameter(description = "The id of the record to delete", required = true) @Valid @RequestParam(value = "statusId", required = true) statusId: kotlin.Long,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "Used to update the user's current location") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "Used to update the user's current location") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Offer",
        operationId = "getOfferDetails",
        description = """Gets offer or offer location details as a consumer.  Will check if it is a favorite if the deviceId/accountId is provided.  If the offerId is provided it will look up the main offer and ignore the the offerLocationId. If no offerId is provided then an offerLocationId must be specified.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OfferResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/offer/get"
        value = [PATH_GET_OFFER_DETAILS],
        produces = ["*/*"]
    )
    fun getOfferDetails(
        @Parameter(description = "The device id for returning account information (i.e. favorites)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id for returning account information (i.e. favorites)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The offer id (either offeLocationId or offerId must be provided)") @Valid @RequestParam(value = "offerId", required = false) offerId: kotlin.Long?,
        @Parameter(description = "The offer location id (either offeLocationId or offerId must be provided)") @Valid @RequestParam(value = "offerLocationId", required = false) offerLocationId: kotlin.Long?,
        @Parameter(description = "The distance of the offer from the user's current location (this is returned when the offer is searched)") @Valid @RequestParam(value = "distance", required = false) distance: kotlin.Double?,
        @Parameter(description = "The latitude to calculate distance from the offer") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The longitude to calculate distance from the offer") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "Determines whether to return offer locations for the offer", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "includeOfferLocations", required = false, defaultValue = "false") includeOfferLocations: kotlin.Boolean,
        @Parameter(description = "Determines whether to return the retailer location info for each offer location response (includeOfferLocations must also be true for this to work)", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "includeRetailerLocations", required = false, defaultValue = "false") includeRetailerLocations: kotlin.Boolean,
        @Parameter(description = "Determines whether to include child offers in the response", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "includeChildOffers", required = false, defaultValue = "false") includeChildOffers: kotlin.Boolean
    ): ResponseEntity<OfferResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Offers (Counts)",
        operationId = "getOfferListCounts",
        description = """Gets the offer list counts.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ListCountResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/offer/lists/count"
        value = [PATH_GET_OFFER_LIST_COUNTS],
        produces = ["*/*"]
    )
    fun getOfferListCounts(
        @NotNull @Parameter(description = "The latitude of where the search will center at", required = true) @Valid @RequestParam(value = "latitude", required = true) latitude: kotlin.Double,
        @NotNull @Parameter(description = "The longitude of where the search will center at", required = true) @Valid @RequestParam(value = "longitude", required = true) longitude: kotlin.Double,
        @Parameter(description = "The range of the search", schema = Schema(defaultValue = "5")) @Valid @RequestParam(value = "searchRange", required = false, defaultValue = "5") searchRange: java.math.BigDecimal,
        @Parameter(description = "The units to use for distance calculations (e.g. MILES, KILOMETERS)", schema = Schema(allowableValues = ["MILES", "KILOMETERS"], defaultValue = "MILES")) @Valid @RequestParam(value = "distanceUnit", required = false, defaultValue = "MILES") distanceUnit: kotlin.String
    ): ResponseEntity<ListCountResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Offer Location",
        operationId = "getOfferLocation",
        description = """Gets the offer location by offer location id or udid (of a device)""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OfferShortResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/offer/location/get"
        value = [PATH_GET_OFFER_LOCATION],
        produces = ["*/*"]
    )
    fun getOfferLocation(
        @Parameter(description = "the id of the offer location to get") @Valid @RequestParam(value = "offerLocationId", required = false) offerLocationId: kotlin.Long?,
        @Parameter(description = "the UDID of the device") @Valid @RequestParam(value = "udid", required = false) udid: kotlin.String?
    ): ResponseEntity<OfferShortResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Offer Status",
        operationId = "getOfferTransactionStatus",
        description = """Get an offer status record""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OfferTransactionStatusResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/offer/status/get"
        value = [PATH_GET_OFFER_TRANSACTION_STATUS],
        produces = ["*/*"]
    )
    fun getOfferTransactionStatus(
        @NotNull @Parameter(description = "The id of the record to get ", required = true) @Valid @RequestParam(value = "statusId", required = true) statusId: kotlin.Long,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "Used to update the user's current location") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "Used to update the user's current location") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<OfferTransactionStatusResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Offer Status",
        operationId = "searchOfferTransactionStatuses",
        description = """Search for the available offer statuses""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = OfferTransactionStatusResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/offer/status/search"
        value = [PATH_SEARCH_OFFER_TRANSACTION_STATUSES],
        produces = ["*/*"]
    )
    fun searchOfferTransactionStatuses(
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "Used to update the user's current location") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "Used to update the user's current location") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "Search the name and description fields") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "The actors role, possible values are: CUSTOMER, RETAILER, or ANY") @Valid @RequestParam(value = "role", required = false) role: kotlin.String?,
        @Parameter(description = "The application making the request") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "The field to sort on, possible values are: ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DESCRIPTION, CODE, ROLE", schema = Schema(allowableValues = ["ID", "CREATED", "UPDATED", "DELETED", "SEARCH_TAGS", "ACTIVE", "NAME", "DESCRIPTION", "CODE", "ROLE"], defaultValue = "CODE")) @Valid @RequestParam(value = "sortField", required = false, defaultValue = "CODE") sortField: kotlin.String,
        @Parameter(description = "Determines whether the results are in descending order", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "descending", required = false, defaultValue = "true") descending: kotlin.Boolean,
        @Parameter(description = "The start index for pagination", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "The limit for pagination", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int,
        @Parameter(description = "If true include inactive items", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "includeInactive", required = false, defaultValue = "false") includeInactive: kotlin.Boolean
    ): ResponseEntity<List<OfferTransactionStatusResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Offers",
        operationId = "searchOffersForConsumer",
        description = """Searches for offers as a consumer.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OfferListResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/offer/lists"
        value = [PATH_SEARCH_OFFERS_FOR_CONSUMER],
        produces = ["*/*"]
    )
    fun searchOffersForConsumer(
        @NotNull @Parameter(description = "The latitude of where the search will center at", required = true) @Valid @RequestParam(value = "latitude", required = true) latitude: kotlin.Double,
        @NotNull @Parameter(description = "The longitude of where the search will center at", required = true) @Valid @RequestParam(value = "longitude", required = true) longitude: kotlin.Double,
        @NotNull @Parameter(description = "The method to use to gather recommendations: WALLET base relevance on items in users wallets CLICKS base relevance on items users have clicked on BLENDED blend using all methods available", required = true, schema = Schema(allowableValues = ["WALLET", "CLICKS", "BLENDED"])) @Valid @RequestParam(value = "recommendationType", required = true) recommendationType: kotlin.String,
        @NotNull @Parameter(description = "This parameter is deprecated. The location id", required = true) @Valid @RequestParam(value = "locationId", required = true) locationId: kotlin.Long,
        @NotNull @Parameter(description = "The start index for pagination", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "The limit for pagination", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "maxRecommendations", required = true) maxRecommendations: kotlin.Int,
        @NotNull @Parameter(description = "", required = true, schema = Schema(allowableValues = ["MILES", "KILOMETERS"])) @Valid @RequestParam(value = "distanceUnit", required = true) distanceUnit: kotlin.String,
        @Parameter(description = "The application key used to identify the application") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "The device id for returning account information (i.e. offer transactions made by the user)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id for returning account information (i.e. offer transactions made by the user)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The range of the search", schema = Schema(defaultValue = "5.0")) @Valid @RequestParam(value = "searchRange", required = false, defaultValue = "5.0") searchRange: kotlin.Double,
        @Parameter(description = "Does a full-text search on tags") @Valid @RequestParam(value = "tags", required = false) tags: kotlin.String?,
        @Parameter(description = "supported postal codes") @Valid @RequestParam(value = "supportedPostalCodes", required = false) supportedPostalCodes: kotlin.String?,
        @Parameter(description = "The keyword to filter results by") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "Comma separate list of category ids") @Valid @RequestParam(value = "categories", required = false) categories: kotlin.String?,
        @Parameter(description = "Comma separated list of filter ids") @Valid @RequestParam(value = "filters", required = false) filters: kotlin.String?,
        @Parameter(description = "Comma separated list of offer types {COUPON, VOUCHER, PRODUCT, MEDIA, EVENT, DEVICE}", schema = Schema(defaultValue = "COUPON, VOUCHER")) @Valid @RequestParam(value = "offerTypes", required = false, defaultValue = "COUPON, VOUCHER") offerTypes: kotlin.String,
        @Parameter(description = "The special offer type {ALL, RESERVABLE, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW}") @Valid @RequestParam(value = "type", required = false) type: kotlin.String?,
        @Parameter(description = "The field to sort the result set on:DISTANCE Sort the offers nearest to farthest BUSINESS_NAME Sort the offers alphabetically by location name SHUFFLE Sort the nearest offers randomly USERPREFS accountId must accompany this parameter. Gives the first X recommendations where X equals the parameter maxRecommendations") @Valid @RequestParam(value = "sortField", required = false) sortField: kotlin.String?,
        @Parameter(description = "Return recommendations based on these offers IDs") @Valid @RequestParam(value = "recommendOfferIds", required = false) recommendOfferIds: kotlin.String?,
        @Parameter(description = "Only return offer locations for the specific retailer locations.") @Valid @RequestParam(value = "retailerLocationIds", required = false) retailerLocationIds: kotlin.String?,
        @Parameter(description = "Only return offer locations for the specific offer.") @Valid @RequestParam(value = "offerId", required = false) offerId: kotlin.Long?,
        @Parameter(description = "If true include the mission response as part of the offer. Default is false.") @Valid @RequestParam(value = "includeMission", required = false) includeMission: kotlin.Boolean?,
        @Parameter(description = "If true include the category list response as part of the offer. Default is false.") @Valid @RequestParam(value = "includeCategories", required = false) includeCategories: kotlin.Boolean?,
        @Parameter(description = "If true include the filter list response as part of the offer. Default is false.") @Valid @RequestParam(value = "includeFilters", required = false) includeFilters: kotlin.Boolean?,
        @Parameter(description = "If true then ignore the expired dates. Default is false.") @Valid @RequestParam(value = "includeExpired", required = false) includeExpired: kotlin.Boolean?,
        @Parameter(description = "If true then ignore the favorite. Default is false.") @Valid @RequestParam(value = "includeFavorite", required = false) includeFavorite: kotlin.Boolean?,
        @Parameter(description = "This parameter is deprecated. see groupBy. If true then it only returns the offer location for an offer closest to the given lat/lon") @Valid @RequestParam(value = "closestOfferOnly", required = false) closestOfferOnly: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "searchExpression", required = false) searchExpression: kotlin.String?,
        @Parameter(description = "groups the results by a certain field. For example, if you want to return the closest offer location of an offer, then pass in groupBy=OFFER_ID and sortField=DISTANCE (to sort by distance).", schema = Schema(allowableValues = ["ID", "CREATED", "UPDATED", "DELETED", "SEARCH_TAGS", "ACTIVE", "OFFER_ID", "ACTIVATED", "EXPIRES", "TITLE", "SUBTITLE", "DETAILS", "OFFER_TYPE", "SPECIAL_OFFER_TYPE", "OFFER_VISIBILITY", "RETAILER_ID", "RETAILER_LOCATION_ID", "BILLABLE_ENTITY_ID", "BILLABLE_ENTITY_NAME", "RESPONSIBLE_DISPLAY"])) @Valid @RequestParam(value = "groupBy", required = false) groupBy: kotlin.String?
    ): ResponseEntity<OfferListResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Offers (Top)",
        operationId = "topOfferTransactions",
        description = """Gets the top active offers.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OfferListResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/offer/top"
        value = [PATH_TOP_OFFER_TRANSACTIONS],
        produces = ["*/*"]
    )
    fun topOfferTransactions(
        @Parameter(description = "The index into the record set to start with. Default is 0.", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "The total number of record to return. Default id 20.", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int
    ): ResponseEntity<OfferListResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Offer Status",
        operationId = "updateOfferTransactionStatus",
        description = """Update an offer status record""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OfferTransactionStatusResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/offer/status/update"
        value = [PATH_UPDATE_OFFER_TRANSACTION_STATUS],
        produces = ["*/*"]
    )
    fun updateOfferTransactionStatus(
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "Used to update the user's current location") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "Used to update the user's current location") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "The id of the record to update ") @Valid @RequestParam(value = "statusId", required = false) statusId: kotlin.Long?,
        @Parameter(description = "The name of th status") @Valid @RequestParam(value = "name", required = false) name: kotlin.String?,
        @Parameter(description = "The description of the status") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "The status code, must be unique ") @Valid @RequestParam(value = "code", required = false) code: kotlin.Int?,
        @Parameter(description = "The actor that uses the status") @Valid @RequestParam(value = "role", required = false) role: kotlin.String?,
        @Parameter(description = "The active status") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "The applications to associate the status with, if null then for all.") @Valid @RequestParam(value = "applicationIds", required = false) applicationIds: kotlin.String?
    ): ResponseEntity<OfferTransactionStatusResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_OFFER_TRANSACTION_STATUS: String = "/offer/status/create"
        const val PATH_DELETE_OFFER_TRANSACTION_STATUS: String = "/offer/status/delete"
        const val PATH_GET_OFFER_DETAILS: String = "/offer/get"
        const val PATH_GET_OFFER_LIST_COUNTS: String = "/offer/lists/count"
        const val PATH_GET_OFFER_LOCATION: String = "/offer/location/get"
        const val PATH_GET_OFFER_TRANSACTION_STATUS: String = "/offer/status/get"
        const val PATH_SEARCH_OFFER_TRANSACTION_STATUSES: String = "/offer/status/search"
        const val PATH_SEARCH_OFFERS_FOR_CONSUMER: String = "/offer/lists"
        const val PATH_TOP_OFFER_TRANSACTIONS: String = "/offer/top"
        const val PATH_UPDATE_OFFER_TRANSACTION_STATUS: String = "/offer/status/update"
    }
}
