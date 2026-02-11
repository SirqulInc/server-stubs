package org.openapitools.api

import org.openapitools.model.EventAttendanceResponse
import org.openapitools.model.OfferResponse
import org.openapitools.model.OfferShortResponse
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
class EventApiController() {

    @Operation(
        summary = "Attend Event",
        operationId = "attendEvent",
        description = """ Specify whether the user is attending an event at a particular location. This can also be used as a "check-in" action.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OfferResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/event/attend"
        value = [PATH_ATTEND_EVENT],
        produces = ["*/*"]
    )
    fun attendEvent(
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The application of where to send notifications about the attend action") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "The scheduled broadcast or marketing experience id") @Valid @RequestParam(value = "listingId", required = false) listingId: kotlin.Long?,
        @Parameter(description = "The retailer location where the event is being held") @Valid @RequestParam(value = "retailerLocationId", required = false) retailerLocationId: kotlin.Long?,
        @Parameter(description = "The actual event being held") @Valid @RequestParam(value = "offerLocationId", required = false) offerLocationId: kotlin.Long?,
        @Parameter(description = "The wallet item to update the status of, if provided then ignore the listingId, retailerLocationId, and the offerLocationId") @Valid @RequestParam(value = "transactionId", required = false) transactionId: kotlin.Long?,
        @Parameter(description = "Sets whether the user is: undecided (0), attending (1), attending and checked in (2), or not attending (3)") @Valid @RequestParam(value = "status", required = false) status: kotlin.Int?,
        @Parameter(description = "The location of the status update") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The location of the status update") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<OfferResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Event",
        operationId = "createEvent",
        description = """Create a private event to share with associates.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OfferResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/event/create"
        value = [PATH_CREATE_EVENT],
        produces = ["*/*"]
    )
    fun createEvent(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The event title", required = true) @Valid @RequestParam(value = "title", required = true) title: kotlin.String,
        @Parameter(description = "The retailer location to have the event at") @Valid @RequestParam(value = "retailerLocationIds", required = false) retailerLocationIds: kotlin.String?,
        @Parameter(description = "The event sub title") @Valid @RequestParam(value = "subTitle", required = false) subTitle: kotlin.String?,
        @Parameter(description = "The event details") @Valid @RequestParam(value = "details", required = false) details: kotlin.String?,
        @Parameter(description = "The categories the associate the event with") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "The filters the associate the event with") @Valid @RequestParam(value = "filterIds", required = false) filterIds: kotlin.String?,
        @Parameter(description = "Is this event active") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "The image to show for the event") @Valid @RequestParam(value = "imageAssetId", required = false) imageAssetId: kotlin.Long?,
        @Parameter(description = "The event start date/time") @Valid @RequestParam(value = "redeemableStart", required = false) redeemableStart: kotlin.Long?,
        @Parameter(description = "The event end date/time") @Valid @RequestParam(value = "redeemableEnd", required = false) redeemableEnd: kotlin.Long?,
        @Parameter(description = "external custom client defined data") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?
    ): ResponseEntity<OfferResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Event",
        operationId = "deleteEvent",
        description = """Delete an event that the user has permissions to.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/event/delete"
        value = [PATH_DELETE_EVENT],
        produces = ["*/*"]
    )
    fun deleteEvent(
        @NotNull @Parameter(description = "the id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the event to update", required = true) @Valid @RequestParam(value = "eventId", required = true) eventId: kotlin.Long
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Event",
        operationId = "getEvent",
        description = """Get an event.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OfferResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/event/get"
        value = [PATH_GET_EVENT],
        produces = ["*/*"]
    )
    fun getEvent(
        @NotNull @Parameter(description = "the id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The id of the event to return", required = true) @Valid @RequestParam(value = "eventId", required = true) eventId: kotlin.Long
    ): ResponseEntity<OfferResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Event Attendance",
        operationId = "searchEventTransactions",
        description = """Searches on event type transactions. This can be used to see who is attending an event.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = EventAttendanceResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/event/attendance/search"
        value = [PATH_SEARCH_EVENT_TRANSACTIONS],
        produces = ["*/*"]
    )
    fun searchEventTransactions(
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "The keyword to search for") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "Filter results for this retailer") @Valid @RequestParam(value = "retailerId", required = false) retailerId: kotlin.Long?,
        @Parameter(description = "Filter results for this retailer location") @Valid @RequestParam(value = "retailerLocationId", required = false) retailerLocationId: kotlin.Long?,
        @Parameter(description = "Exclude results from this retailer location") @Valid @RequestParam(value = "excludeRetailerLocationId", required = false) excludeRetailerLocationId: kotlin.Long?,
        @Parameter(description = "Filter results for this event listing") @Valid @RequestParam(value = "listingId", required = false) listingId: kotlin.Long?,
        @Parameter(description = "Filter results for this offer") @Valid @RequestParam(value = "offerId", required = false) offerId: kotlin.Long?,
        @Parameter(description = "Filter results for this offer location") @Valid @RequestParam(value = "offerLocationId", required = false) offerLocationId: kotlin.Long?,
        @Parameter(description = "Filter results by accounts") @Valid @RequestParam(value = "customerAccountIds", required = false) customerAccountIds: kotlin.String?,
        @Parameter(description = "Comma separated list of category ids to determine whether the attendee is affiliated with the category") @Valid @RequestParam(value = "affiliatedCategoryIds", required = false) affiliatedCategoryIds: kotlin.String?,
        @Parameter(description = "Filter on attendance starting on or after this date (milliseconds since epoch)") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "Filter on attendance starting on or before this date (milliseconds since epoch)") @Valid @RequestParam(value = "endDate", required = false) endDate: kotlin.Long?,
        @Parameter(description = "Comma separated list of transaction statuses to filter on") @Valid @RequestParam(value = "statuses", required = false) statuses: kotlin.String?,
        @Parameter(description = "Determines what to sort the results by {CREATED, UPDATED, SEARCH_TAGS, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, CUSTOMER_ID, CUSTOMER_DISPLAY, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY}", schema = Schema(allowableValues = ["ID", "CREATED", "UPDATED", "DELETED", "SEARCH_TAGS", "ACTIVE", "ACTIVATED", "EXPIRES", "TITLE", "SUBTITLE", "DETAILS", "OFFER_TYPE", "SPECIAL_OFFER_TYPE", "OFFER_VISIBILITY", "REDEEMABLE_START", "REDEEMABLE_END", "CUSTOMER_ID", "CUSTOMER_DISPLAY", "RETAILER_ID", "RETAILER_NAME", "RETAILER_LOCATION_ID", "RETAILER_LOCATION_NAME", "BILLABLE_ENTITY_ID", "BILLABLE_ENTITY_NAME", "RESPONSIBLE_DISPLAY"])) @Valid @RequestParam(value = "sortField", required = false) sortField: kotlin.String?,
        @Parameter(description = "Determines whether the results are in descending order") @Valid @RequestParam(value = "descending", required = false) descending: kotlin.Boolean?,
        @Parameter(description = "The start index for pagination") @Valid @RequestParam(value = "start", required = false) start: kotlin.Int?,
        @Parameter(description = "The limit for pagination") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?
    ): ResponseEntity<List<EventAttendanceResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Events",
        operationId = "searchEvents",
        description = """Searches on events that the account has access to.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = OfferShortResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/event/search"
        value = [PATH_SEARCH_EVENTS],
        produces = ["*/*"]
    )
    fun searchEvents(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "The keyword used to search") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "Return only active results") @Valid @RequestParam(value = "activeOnly", required = false) activeOnly: kotlin.Boolean?,
        @Parameter(description = "the IDs of the categories that this event is associated with") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "the IDs of the filters that this event is associated with") @Valid @RequestParam(value = "filterIds", required = false) filterIds: kotlin.String?,
        @Parameter(description = "Offer audience ids to filter on") @Valid @RequestParam(value = "offerAudienceIds", required = false) offerAudienceIds: kotlin.String?,
        @Parameter(description = "Transaction audience ids to filter on") @Valid @RequestParam(value = "transactionAudienceIds", required = false) transactionAudienceIds: kotlin.String?,
        @Parameter(description = "The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY", schema = Schema(allowableValues = ["ID", "CREATED", "UPDATED", "DELETED", "SEARCH_TAGS", "ACTIVE", "ACTIVATED", "EXPIRES", "REDEEMABLE_START", "REDEEMABLE_END", "TITLE", "SUBTITLE", "DETAILS", "OFFER_TYPE", "SPECIAL_OFFER_TYPE", "OFFER_VISIBILITY", "ESTIMATED_VALUE", "VOUCHER_PRICE", "VOUCHER_DISCOUNT_PRICE", "FULL_PRICE", "DICOUNT_PRICE", "TICKETS_REWARD", "AVAILABILITY_DATE", "RELEASE_DATE", "RETAILER_ID", "RETAILER_NAME", "RETAILER_LOCATION_ID", "RETAILER_LOCATION_NAME", "BILLABLE_ENTITY_ID", "BILLABLE_ENTITY_NAME", "RESPONSIBLE_DISPLAY"])) @Valid @RequestParam(value = "sortField", required = false) sortField: kotlin.String?,
        @Parameter(description = "The order to return the search results") @Valid @RequestParam(value = "descending", required = false) descending: kotlin.Boolean?,
        @Parameter(description = "Filter the events to return only those that start on or after the date") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "Filter the events to return only those that start on or before the date") @Valid @RequestParam(value = "endDate", required = false) endDate: kotlin.Long?,
        @Parameter(description = "The record to begin the return set on") @Valid @RequestParam(value = "start", required = false) start: kotlin.Int?,
        @Parameter(description = "The number of records to return") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?
    ): ResponseEntity<List<OfferShortResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Event",
        operationId = "updateEvent",
        description = """Update a private event to share with associates.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OfferResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/event/update"
        value = [PATH_UPDATE_EVENT],
        produces = ["*/*"]
    )
    fun updateEvent(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The id of the event to update", required = true) @Valid @RequestParam(value = "eventId", required = true) eventId: kotlin.Long,
        @Parameter(description = "The retailer location to have the event at") @Valid @RequestParam(value = "retailerLocationIds", required = false) retailerLocationIds: kotlin.String?,
        @Parameter(description = "The event title") @Valid @RequestParam(value = "title", required = false) title: kotlin.String?,
        @Parameter(description = "The event sub title") @Valid @RequestParam(value = "subTitle", required = false) subTitle: kotlin.String?,
        @Parameter(description = "The event details") @Valid @RequestParam(value = "details", required = false) details: kotlin.String?,
        @Parameter(description = "The categories the associate the event with") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "The filters the associate the event with") @Valid @RequestParam(value = "filterIds", required = false) filterIds: kotlin.String?,
        @Parameter(description = "Is this event active") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "The image to show for the event") @Valid @RequestParam(value = "imageAssetId", required = false) imageAssetId: kotlin.Long?,
        @Parameter(description = "The event start date/time") @Valid @RequestParam(value = "redeemableStart", required = false) redeemableStart: kotlin.Long?,
        @Parameter(description = "The event end date/time") @Valid @RequestParam(value = "redeemableEnd", required = false) redeemableEnd: kotlin.Long?
    ): ResponseEntity<OfferResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_ATTEND_EVENT: String = "/event/attend"
        const val PATH_CREATE_EVENT: String = "/event/create"
        const val PATH_DELETE_EVENT: String = "/event/delete"
        const val PATH_GET_EVENT: String = "/event/get"
        const val PATH_SEARCH_EVENT_TRANSACTIONS: String = "/event/attendance/search"
        const val PATH_SEARCH_EVENTS: String = "/event/search"
        const val PATH_UPDATE_EVENT: String = "/event/update"
    }
}
