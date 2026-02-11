package org.openapitools.api

import org.openapitools.model.Trip
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
class TripApiController() {

    @Operation(
        summary = "Create Trip",
        operationId = "createTrip",
        description = """Create a new trip""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = Trip::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/trip"
        value = [PATH_CREATE_TRIP],
        produces = ["*/*"]
    )
    fun createTrip(
        @Parameter(description = "") @Valid @RequestBody(required = false) body: Trip?
    ): ResponseEntity<Trip> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Trip",
        operationId = "delete",
        description = """Delete an existing trip""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        // "/trip/{id}"
        value = [PATH_DELETE]
    )
    fun delete(
        @Parameter(description = "the id of the trip to delete", required = true) @PathVariable("id") id: kotlin.Long
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Set Trip Preference Driver",
        operationId = "driveTrip",
        description = """Update trip preference to drive, also create a route and assign the trip to the route""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = Trip::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/trip/{id}/drive"
        value = [PATH_DRIVE_TRIP],
        produces = ["*/*"]
    )
    fun driveTrip(
        @Parameter(description = "the id of the trip", required = true) @PathVariable("id") id: kotlin.Long,
        @NotNull @Parameter(description = "the frequency of the trip (e.g. weekly, until 2018-08-09)", required = true) @Valid @RequestParam(value = "recurrence", required = true) recurrence: kotlin.Boolean
    ): ResponseEntity<Trip> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Set Trip Preference Flexible",
        operationId = "flexibleTrip",
        description = """Update trip preference to flexible.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = Trip::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/trip/{id}/flexible"
        value = [PATH_FLEXIBLE_TRIP],
        produces = ["*/*"]
    )
    fun flexibleTrip(
        @Parameter(description = "the id of the trip", required = true) @PathVariable("id") id: kotlin.Long,
        @NotNull @Parameter(description = "the frequency of the trip (e.g. weekly, until 2018-08-09)", required = true) @Valid @RequestParam(value = "recurrence", required = true) recurrence: kotlin.Boolean
    ): ResponseEntity<Trip> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Trip",
        operationId = "getTrip",
        description = """Get an existing trip""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = Trip::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/trip/{id}"
        value = [PATH_GET_TRIP],
        produces = ["*/*"]
    )
    fun getTrip(
        @Parameter(description = "the id of the trip to get", required = true) @PathVariable("id") id: kotlin.Long
    ): ResponseEntity<Trip> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Trip Matches",
        operationId = "getTripMatches",
        description = """Get matching trips of specific trip""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = Trip::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/trip/{id}/match"
        value = [PATH_GET_TRIP_MATCHES],
        produces = ["*/*"]
    )
    fun getTripMatches(
        @Parameter(description = "The id The id of the trip to search for matches for", required = true) @PathVariable("id") id: kotlin.Long,
        @NotNull @Parameter(description = "The field to sort by", required = true) @Valid @RequestParam(value = "sortField", required = true) sortField: kotlin.String,
        @NotNull @Parameter(description = "Determines whether the sorted list is in descending or ascending order", required = true) @Valid @RequestParam(value = "descending", required = true) descending: kotlin.Boolean,
        @NotNull @Parameter(description = "The start index for pagination", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "The limit for pagination", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @NotNull @Parameter(description = "Return only active results", required = true) @Valid @RequestParam(value = "activeOnly", required = true) activeOnly: kotlin.Boolean,
        @Parameter(description = "Only return matchings that already have route assigned") @Valid @RequestParam(value = "matchedHasRoute", required = false) matchedHasRoute: kotlin.Boolean?,
        @Parameter(description = "Only return matchings that already have driver assigned") @Valid @RequestParam(value = "matchedHasDriver", required = false) matchedHasDriver: kotlin.Boolean?
    ): ResponseEntity<List<Trip>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Process Trip Matches",
        operationId = "processTripMatches",
        description = """Process trip matching, assign trips with no route to matched trips with route.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = Trip::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/trip/match/process"
        value = [PATH_PROCESS_TRIP_MATCHES],
        produces = ["*/*"]
    )
    fun processTripMatches(
        @Parameter(description = "The lower bound date to process matchings") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "The upper bound date to process matchings") @Valid @RequestParam(value = "endDate", required = false) endDate: kotlin.Long?,
        @Parameter(description = "the id of the trip to process") @Valid @RequestParam(value = "tripId", required = false) tripId: kotlin.Long?
    ): ResponseEntity<List<Trip>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Set Trip Preference Rider",
        operationId = "ride",
        description = """Update trip preference to ride.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = Trip::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/trip/{id}/ride"
        value = [PATH_RIDE],
        produces = ["*/*"]
    )
    fun ride(
        @Parameter(description = "the id of the trip", required = true) @PathVariable("id") id: kotlin.Long,
        @NotNull @Parameter(description = "the frequency of the trip (e.g. weekly, until 2018-08-09)", required = true) @Valid @RequestParam(value = "recurrence", required = true) recurrence: kotlin.Boolean
    ): ResponseEntity<Trip> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Trips",
        operationId = "search",
        description = """Search for trips""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = Trip::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/trip"
        value = [PATH_SEARCH],
        produces = ["*/*"]
    )
    fun search(
        @NotNull @Parameter(description = "The owner of the trips", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The field to sort by", required = true) @Valid @RequestParam(value = "sortField", required = true) sortField: kotlin.String,
        @NotNull @Parameter(description = "Determines whether the sorted list is in descending or ascending order", required = true) @Valid @RequestParam(value = "descending", required = true) descending: kotlin.Boolean,
        @NotNull @Parameter(description = "The start index for pagination", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "The limit for pagination", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @NotNull @Parameter(description = "Return only active results", required = true) @Valid @RequestParam(value = "activeOnly", required = true) activeOnly: kotlin.Boolean,
        @Parameter(description = "The lower bound limit of time") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "The upper bound limit of time") @Valid @RequestParam(value = "endDate", required = false) endDate: kotlin.Long?,
        @Parameter(description = "whether to search on trips that have notifications or not") @Valid @RequestParam(value = "hasNotifications", required = false) hasNotifications: kotlin.Boolean?
    ): ResponseEntity<List<Trip>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Trips",
        operationId = "searchTrips",
        description = """Search for trips with matching information.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = Trip::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/trip/match"
        value = [PATH_SEARCH_TRIPS],
        produces = ["*/*"]
    )
    fun searchTrips(
        @NotNull @Parameter(description = "The owner of the trips", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The field to sort by", required = true) @Valid @RequestParam(value = "sortField", required = true) sortField: kotlin.String,
        @NotNull @Parameter(description = "Determines whether the sorted list is in descending or ascending order", required = true) @Valid @RequestParam(value = "descending", required = true) descending: kotlin.Boolean,
        @NotNull @Parameter(description = "The start index for pagination", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "The limit for pagination", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @NotNull @Parameter(description = "Return only active results", required = true) @Valid @RequestParam(value = "activeOnly", required = true) activeOnly: kotlin.Boolean,
        @Parameter(description = "The lower bound limit of time") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "The upper bound limit of time") @Valid @RequestParam(value = "endDate", required = false) endDate: kotlin.Long?,
        @Parameter(description = "Only return matchings that already have route assigned") @Valid @RequestParam(value = "matchedHasRoute", required = false) matchedHasRoute: kotlin.Boolean?,
        @Parameter(description = "Only return matchings that already have driver assigned") @Valid @RequestParam(value = "matchedHasDriver", required = false) matchedHasDriver: kotlin.Boolean?
    ): ResponseEntity<List<Trip>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Trip Locations",
        operationId = "updateLocations",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = Trip::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/trip/{id}/locations"
        value = [PATH_UPDATE_LOCATIONS],
        produces = ["*/*"]
    )
    fun updateLocations(
        @Parameter(description = "the id of the trip to update locations for", required = true) @PathVariable("id") id: kotlin.Long,
        @Parameter(description = "") @Valid @RequestBody(required = false) body: Trip?
    ): ResponseEntity<Trip> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Recurrence Locations",
        operationId = "updateRecurrenceLocations",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = Trip::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/trip/{id}/locations/recurrence"
        value = [PATH_UPDATE_RECURRENCE_LOCATIONS],
        produces = ["*/*"]
    )
    fun updateRecurrenceLocations(
        @Parameter(description = "the id of the trip", required = true) @PathVariable("id") id: kotlin.Long,
        @Parameter(description = "") @Valid @RequestBody(required = false) body: Trip?
    ): ResponseEntity<List<Trip>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Recurrence Shipments",
        operationId = "updateRecurrenceShipments",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = Trip::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/trip/{id}/shipments/recurrence"
        value = [PATH_UPDATE_RECURRENCE_SHIPMENTS],
        produces = ["*/*"]
    )
    fun updateRecurrenceShipments(
        @Parameter(description = "the id of the trip", required = true) @PathVariable("id") id: kotlin.Long,
        @Parameter(description = "") @Valid @RequestBody(required = false) body: Trip?
    ): ResponseEntity<List<Trip>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Trip Shipments",
        operationId = "updateShipments",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = Trip::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/trip/{id}/shipments"
        value = [PATH_UPDATE_SHIPMENTS],
        produces = ["*/*"]
    )
    fun updateShipments(
        @Parameter(description = "the id of the trip shipments to update", required = true) @PathVariable("id") id: kotlin.Long,
        @Parameter(description = "") @Valid @RequestBody(required = false) body: Trip?
    ): ResponseEntity<Trip> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Trip",
        operationId = "updateTrip",
        description = """Update an existing trip. Does not support recurring trip update.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = Trip::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PUT],
        // "/trip/{id}"
        value = [PATH_UPDATE_TRIP],
        produces = ["*/*"]
    )
    fun updateTrip(
        @Parameter(description = "the id of the trip to update", required = true) @PathVariable("id") id: kotlin.Long,
        @Parameter(description = "") @Valid @RequestBody(required = false) body: Trip?
    ): ResponseEntity<Trip> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Trip Notifications",
        operationId = "updateTripNotifications",
        description = """Update the trip notifications""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = Trip::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/trip/notifications"
        value = [PATH_UPDATE_TRIP_NOTIFICATIONS],
        produces = ["*/*"]
    )
    fun updateTripNotifications(
        @NotNull @Parameter(description = "the id of the trip", required = true) @Valid @RequestParam(value = "id", required = true) id: kotlin.Long,
        @Parameter(description = "the notifications to update on the trip") @Valid @RequestParam(value = "notifications", required = false) notifications: kotlin.String?
    ): ResponseEntity<Trip> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_TRIP: String = "/trip"
        const val PATH_DELETE: String = "/trip/{id}"
        const val PATH_DRIVE_TRIP: String = "/trip/{id}/drive"
        const val PATH_FLEXIBLE_TRIP: String = "/trip/{id}/flexible"
        const val PATH_GET_TRIP: String = "/trip/{id}"
        const val PATH_GET_TRIP_MATCHES: String = "/trip/{id}/match"
        const val PATH_PROCESS_TRIP_MATCHES: String = "/trip/match/process"
        const val PATH_RIDE: String = "/trip/{id}/ride"
        const val PATH_SEARCH: String = "/trip"
        const val PATH_SEARCH_TRIPS: String = "/trip/match"
        const val PATH_UPDATE_LOCATIONS: String = "/trip/{id}/locations"
        const val PATH_UPDATE_RECURRENCE_LOCATIONS: String = "/trip/{id}/locations/recurrence"
        const val PATH_UPDATE_RECURRENCE_SHIPMENTS: String = "/trip/{id}/shipments/recurrence"
        const val PATH_UPDATE_SHIPMENTS: String = "/trip/{id}/shipments"
        const val PATH_UPDATE_TRIP: String = "/trip/{id}"
        const val PATH_UPDATE_TRIP_NOTIFICATIONS: String = "/trip/notifications"
    }
}
