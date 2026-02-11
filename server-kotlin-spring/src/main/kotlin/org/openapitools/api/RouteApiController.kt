package org.openapitools.api

import org.openapitools.model.Direction
import org.openapitools.model.Route
import org.openapitools.model.RouteSettings
import org.openapitools.model.Shipment
import org.openapitools.model.Stop
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
class RouteApiController() {

    @Operation(
        summary = "Approve Route",
        operationId = "approveRoute",
        description = """Approve a route""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = Route::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/route/{routeId}/approve"
        value = [PATH_APPROVE_ROUTE],
        produces = ["*/*"]
    )
    fun approveRoute(
        @Parameter(description = "the id of the route to approve", required = true) @PathVariable("routeId") routeId: kotlin.Long
    ): ResponseEntity<Route> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Copy Route",
        operationId = "copyRoute",
        description = """Make an copy of the given route with optional overriding properties""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = Route::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/route/{routeId}/copy"
        value = [PATH_COPY_ROUTE],
        produces = ["*/*"]
    )
    fun copyRoute(
        @Parameter(description = "the id of the route to duplicate", required = true) @PathVariable("routeId") routeId: kotlin.Long,
        @Parameter(description = "") @Valid @RequestBody(required = false) body: Route?
    ): ResponseEntity<Route> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Route",
        operationId = "createRoute",
        description = """Create new route""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = Route::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/route"
        value = [PATH_CREATE_ROUTE],
        produces = ["*/*"]
    )
    fun createRoute(
        @Parameter(description = "") @Valid @RequestBody(required = false) body: Route?
    ): ResponseEntity<Route> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Route Directions",
        operationId = "createRouteDirections",
        description = """Regenerate the directions of a route""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = Direction::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PUT],
        // "/route/{routeId}/directions"
        value = [PATH_CREATE_ROUTE_DIRECTIONS],
        produces = ["*/*"]
    )
    fun createRouteDirections(
        @Parameter(description = "the id of the route to update directions for", required = true) @PathVariable("routeId") routeId: kotlin.Long
    ): ResponseEntity<List<Direction>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Route Polyline",
        operationId = "createRoutePolyline",
        description = """Update the polyline of the requested route""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = Route::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PUT],
        // "/route/{routeId}/polyline"
        value = [PATH_CREATE_ROUTE_POLYLINE],
        produces = ["*/*"]
    )
    fun createRoutePolyline(
        @Parameter(description = "the id of the route to create a polyline for", required = true) @PathVariable("routeId") routeId: kotlin.Long
    ): ResponseEntity<Route> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Route Setting",
        operationId = "createRouteSettings",
        description = """Create a new route setting""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = RouteSettings::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/route/setting"
        value = [PATH_CREATE_ROUTE_SETTINGS],
        produces = ["*/*"]
    )
    fun createRouteSettings(
        @Parameter(description = "") @Valid @RequestBody(required = false) body: RouteSettings?
    ): ResponseEntity<RouteSettings> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Route",
        operationId = "deleteRoute",
        description = """Delete an existing route""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        // "/route/{routeId}"
        value = [PATH_DELETE_ROUTE]
    )
    fun deleteRoute(
        @Parameter(description = "the id of the route", required = true) @PathVariable("routeId") routeId: kotlin.Long
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Route Setting",
        operationId = "deleteRouteSettings",
        description = """Delete an existing route setting""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = kotlin.Any::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        // "/route/setting/{routeSettingsId}"
        value = [PATH_DELETE_ROUTE_SETTINGS],
        produces = ["*/*"]
    )
    fun deleteRouteSettings(
        @Parameter(description = "the id of the route setting to delete", required = true) @PathVariable("routeSettingsId") routeSettingsId: kotlin.Long
    ): ResponseEntity<kotlin.Any> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Disapprove Route",
        operationId = "disapproveRoute",
        description = """Disapprove a route""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = Route::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/route/{routeId}/disapprove"
        value = [PATH_DISAPPROVE_ROUTE],
        produces = ["*/*"]
    )
    fun disapproveRoute(
        @Parameter(description = "the id of the route to reject", required = true) @PathVariable("routeId") routeId: kotlin.Long
    ): ResponseEntity<Route> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Route",
        operationId = "getRoute",
        description = """Get an existing route""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = Route::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/route/{routeId}"
        value = [PATH_GET_ROUTE],
        produces = ["*/*"]
    )
    fun getRoute(
        @Parameter(description = "the id of the route to get", required = true) @PathVariable("routeId") routeId: kotlin.Long,
        @NotNull @Parameter(description = "return inherited properties from parent or not", required = true) @Valid @RequestParam(value = "showInheritedProperties", required = true) showInheritedProperties: kotlin.Boolean
    ): ResponseEntity<Route> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Route Directions",
        operationId = "getRouteDirections",
        description = """Get the directions of a route""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = Direction::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/route/{routeId}/directions"
        value = [PATH_GET_ROUTE_DIRECTIONS],
        produces = ["*/*"]
    )
    fun getRouteDirections(
        @Parameter(description = "the id of the route to get directions for", required = true) @PathVariable("routeId") routeId: kotlin.Long
    ): ResponseEntity<List<Direction>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Route Setting",
        operationId = "getRouteSettings",
        description = """Get an existing route settings""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = RouteSettings::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/route/setting/{routeSettingsId}"
        value = [PATH_GET_ROUTE_SETTINGS],
        produces = ["*/*"]
    )
    fun getRouteSettings(
        @Parameter(description = "the id of the route settings to get", required = true) @PathVariable("routeSettingsId") routeSettingsId: kotlin.Long
    ): ResponseEntity<RouteSettings> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Route Shipments",
        operationId = "getRouteShipments",
        description = """Get the shipments on the requested route""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = Shipment::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/route/{routeId}/shipments"
        value = [PATH_GET_ROUTE_SHIPMENTS],
        produces = ["*/*"]
    )
    fun getRouteShipments(
        @Parameter(description = "the id of the route to get shipments for", required = true) @PathVariable("routeId") routeId: kotlin.Long
    ): ResponseEntity<List<Shipment>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Route Stop",
        operationId = "getRouteStop",
        description = """Get the specific stop on a route""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = Stop::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/route/{routeId}/stop/{stopId}"
        value = [PATH_GET_ROUTE_STOP],
        produces = ["*/*"]
    )
    fun getRouteStop(
        @Parameter(description = "the id of the route to get stops for", required = true) @PathVariable("routeId") routeId: kotlin.Long,
        @Parameter(description = "the id of the specific stop on the route", required = true) @PathVariable("stopId") stopId: kotlin.Long
    ): ResponseEntity<Stop> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Route Stops",
        operationId = "getRouteStops",
        description = """The stops of the route requested""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = Stop::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/route/{routeId}/stops"
        value = [PATH_GET_ROUTE_STOPS],
        produces = ["*/*"]
    )
    fun getRouteStops(
        @Parameter(description = "the id of the route", required = true) @PathVariable("routeId") routeId: kotlin.Long,
        @NotNull @Parameter(description = "only get stops that have been confirmed or not", required = true) @Valid @RequestParam(value = "confirmedOnly", required = true) confirmedOnly: kotlin.Boolean
    ): ResponseEntity<List<Stop>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Shipments At Stop",
        operationId = "getShipmentsAtStop",
        description = """Get the list of shipments on the requested route at a stop""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = Shipment::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/route/{routeId}/stop/{stopId}/shipments"
        value = [PATH_GET_SHIPMENTS_AT_STOP],
        produces = ["*/*"]
    )
    fun getShipmentsAtStop(
        @Parameter(description = "the id of the route", required = true) @PathVariable("routeId") routeId: kotlin.Long,
        @Parameter(description = "the id of the stop to get shipments on", required = true) @PathVariable("stopId") stopId: kotlin.Long
    ): ResponseEntity<List<Shipment>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Optimize Route",
        operationId = "optimizeRoute",
        description = """Optimize a route. The optimization method based on how the server is configured.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/route/{routeId}/optimize"
        value = [PATH_OPTIMIZE_ROUTE]
    )
    fun optimizeRoute(
        @Parameter(description = "the id of the route to optimize", required = true) @PathVariable("routeId") routeId: kotlin.Long
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Stop",
        operationId = "removeStop",
        description = """Delete a stop on a route""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        // "/route/{routeId}/stop/{stopId}"
        value = [PATH_REMOVE_STOP]
    )
    fun removeStop(
        @Parameter(description = "the id of the route", required = true) @PathVariable("routeId") routeId: kotlin.Long,
        @Parameter(description = "the id of the specific stop to delete on the route", required = true) @PathVariable("stopId") stopId: kotlin.Long
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Reorder Route Stops",
        operationId = "reorderRouteStopsPatch",
        description = """Reordering the stops on the route with and update route distance, time, direction, and polyline""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = Stop::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PATCH],
        // "/route/{routeId}/stops/reorder"
        value = [PATH_REORDER_ROUTE_STOPS_PATCH],
        produces = ["*/*"]
    )
    fun reorderRouteStopsPatch(
        @Parameter(description = "the id of the route", required = true) @PathVariable("routeId") routeId: kotlin.Long,
        @Parameter(description = "") @Valid @RequestBody(required = false) body: kotlin.collections.List<Stop>?
    ): ResponseEntity<List<Stop>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Reorder Route Stops",
        operationId = "reorderRouteStopsPost",
        description = """Reordering the stops on the route with and update route distance, time, direction, and polyline""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = Stop::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/route/{routeId}/stops/reorder"
        value = [PATH_REORDER_ROUTE_STOPS_POST],
        produces = ["*/*"]
    )
    fun reorderRouteStopsPost(
        @Parameter(description = "the id of the route", required = true) @PathVariable("routeId") routeId: kotlin.Long,
        @Parameter(description = "") @Valid @RequestBody(required = false) body: kotlin.collections.List<Stop>?
    ): ResponseEntity<List<Stop>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Route Settings",
        operationId = "searchRouteSettings",
        description = """Search for route settings""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = RouteSettings::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/route/setting"
        value = [PATH_SEARCH_ROUTE_SETTINGS],
        produces = ["*/*"]
    )
    fun searchRouteSettings(
        @NotNull @Parameter(description = "The field to sort by", required = true) @Valid @RequestParam(value = "sortField", required = true) sortField: kotlin.String,
        @NotNull @Parameter(description = "Determines whether the sorted list is in descending or ascending order", required = true) @Valid @RequestParam(value = "descending", required = true) descending: kotlin.Boolean,
        @NotNull @Parameter(description = "The start index for pagination", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "The limit for pagination", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @NotNull @Parameter(description = "Return only active results", required = true) @Valid @RequestParam(value = "activeOnly", required = true) activeOnly: kotlin.Boolean,
        @Parameter(description = "The service hub that the route belongs under") @Valid @RequestParam(value = "hubId", required = false) hubId: kotlin.Long?,
        @Parameter(description = "The program that the route belongs under") @Valid @RequestParam(value = "programId", required = false) programId: kotlin.Long?,
        @Parameter(description = "The keyword to search for the route") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?
    ): ResponseEntity<List<RouteSettings>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Routes",
        operationId = "searchRoutes",
        description = """Search for routes.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = Route::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/route"
        value = [PATH_SEARCH_ROUTES],
        produces = ["*/*"]
    )
    fun searchRoutes(
        @NotNull @Parameter(description = "The field to sort by", required = true) @Valid @RequestParam(value = "sortField", required = true) sortField: kotlin.String,
        @NotNull @Parameter(description = "Determines whether the sorted list is in descending or ascending order", required = true) @Valid @RequestParam(value = "descending", required = true) descending: kotlin.Boolean,
        @NotNull @Parameter(description = "The start index for pagination", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "The limit for pagination", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @NotNull @Parameter(description = "Return only active results", required = true) @Valid @RequestParam(value = "activeOnly", required = true) activeOnly: kotlin.Boolean,
        @NotNull @Parameter(description = "Include empty routes or not", required = true) @Valid @RequestParam(value = "includesEmpty", required = true) includesEmpty: kotlin.Boolean,
        @NotNull @Parameter(description = "Only return root instance routes", required = true) @Valid @RequestParam(value = "rootOnly", required = true) rootOnly: kotlin.Boolean,
        @NotNull @Parameter(description = "Display root route properties", required = true) @Valid @RequestParam(value = "showInheritedProperties", required = true) showInheritedProperties: kotlin.Boolean,
        @Parameter(description = "Filter results by service hub") @Valid @RequestParam(value = "hubId", required = false) hubId: kotlin.Long?,
        @Parameter(description = "Filter results by program") @Valid @RequestParam(value = "programId", required = false) programId: kotlin.Long?,
        @Parameter(description = "The start date to filter the results by") @Valid @RequestParam(value = "scheduledStart", required = false) scheduledStart: kotlin.Long?,
        @Parameter(description = "The end date to filter the results by") @Valid @RequestParam(value = "scheduledEnd", required = false) scheduledEnd: kotlin.Long?,
        @Parameter(description = "The lower bound of updated date") @Valid @RequestParam(value = "updatedStart", required = false) updatedStart: kotlin.Long?,
        @Parameter(description = "The upper bound of updated date") @Valid @RequestParam(value = "updatedEnd", required = false) updatedEnd: kotlin.Long?,
        @Parameter(description = "The route is featured or not") @Valid @RequestParam(value = "featured", required = false) featured: kotlin.Boolean?,
        @Parameter(description = "Has at least this many seat available") @Valid @RequestParam(value = "seatCount", required = false) seatCount: kotlin.Int?,
        @Parameter(description = "Has been approved or not") @Valid @RequestParam(value = "approved", required = false) approved: kotlin.Boolean?,
        @Parameter(description = "Has started or not") @Valid @RequestParam(value = "started", required = false) started: kotlin.Boolean?,
        @Parameter(description = "Has completed or not") @Valid @RequestParam(value = "completed", required = false) completed: kotlin.Boolean?,
        @Parameter(description = "Is valid or not") @Valid @RequestParam(value = "valid", required = false) valid: kotlin.Boolean?,
        @Parameter(description = "If it is a recurring route based on the parent route") @Valid @RequestParam(value = "parentId", required = false) parentId: kotlin.Long?
    ): ResponseEntity<List<Route>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Set Driver",
        operationId = "setDriver",
        description = """Update the driver of the route.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/route/{id}/driver/{driverId}"
        value = [PATH_SET_DRIVER]
    )
    fun setDriver(
        @Parameter(description = "the id of the route", required = true) @PathVariable("id") id: kotlin.Long,
        @Parameter(description = "the id of the driver", required = true) @PathVariable("driverId") driverId: kotlin.Long
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Route",
        operationId = "updateRoute",
        description = """Update an existing route""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = Route::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PUT],
        // "/route/{routeId}"
        value = [PATH_UPDATE_ROUTE],
        produces = ["*/*"]
    )
    fun updateRoute(
        @Parameter(description = "the id of the route", required = true) @PathVariable("routeId") routeId: kotlin.Long,
        @Parameter(description = "") @Valid @RequestBody(required = false) body: Route?
    ): ResponseEntity<Route> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Route Setting",
        operationId = "updateRouteSettings",
        description = """Update an existing route setting""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = RouteSettings::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PUT],
        // "/route/setting/{routeSettingsId}"
        value = [PATH_UPDATE_ROUTE_SETTINGS],
        produces = ["*/*"]
    )
    fun updateRouteSettings(
        @Parameter(description = "the id of the route settings to update", required = true) @PathVariable("routeSettingsId") routeSettingsId: kotlin.Long,
        @Parameter(description = "") @Valid @RequestBody(required = false) body: RouteSettings?
    ): ResponseEntity<RouteSettings> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Route Stop",
        operationId = "updateRouteStop",
        description = """Update a stop on a specified route""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.PUT],
        // "/route/{routeId}/stop/{stopId}"
        value = [PATH_UPDATE_ROUTE_STOP]
    )
    fun updateRouteStop(
        @Parameter(description = "the id of the route to update stops for", required = true) @PathVariable("routeId") routeId: kotlin.Long,
        @Parameter(description = "the id of the specific stop to update on the route", required = true) @PathVariable("stopId") stopId: kotlin.Long,
        @Parameter(description = "") @Valid @RequestBody(required = false) body: Stop?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_APPROVE_ROUTE: String = "/route/{routeId}/approve"
        const val PATH_COPY_ROUTE: String = "/route/{routeId}/copy"
        const val PATH_CREATE_ROUTE: String = "/route"
        const val PATH_CREATE_ROUTE_DIRECTIONS: String = "/route/{routeId}/directions"
        const val PATH_CREATE_ROUTE_POLYLINE: String = "/route/{routeId}/polyline"
        const val PATH_CREATE_ROUTE_SETTINGS: String = "/route/setting"
        const val PATH_DELETE_ROUTE: String = "/route/{routeId}"
        const val PATH_DELETE_ROUTE_SETTINGS: String = "/route/setting/{routeSettingsId}"
        const val PATH_DISAPPROVE_ROUTE: String = "/route/{routeId}/disapprove"
        const val PATH_GET_ROUTE: String = "/route/{routeId}"
        const val PATH_GET_ROUTE_DIRECTIONS: String = "/route/{routeId}/directions"
        const val PATH_GET_ROUTE_SETTINGS: String = "/route/setting/{routeSettingsId}"
        const val PATH_GET_ROUTE_SHIPMENTS: String = "/route/{routeId}/shipments"
        const val PATH_GET_ROUTE_STOP: String = "/route/{routeId}/stop/{stopId}"
        const val PATH_GET_ROUTE_STOPS: String = "/route/{routeId}/stops"
        const val PATH_GET_SHIPMENTS_AT_STOP: String = "/route/{routeId}/stop/{stopId}/shipments"
        const val PATH_OPTIMIZE_ROUTE: String = "/route/{routeId}/optimize"
        const val PATH_REMOVE_STOP: String = "/route/{routeId}/stop/{stopId}"
        const val PATH_REORDER_ROUTE_STOPS_PATCH: String = "/route/{routeId}/stops/reorder"
        const val PATH_REORDER_ROUTE_STOPS_POST: String = "/route/{routeId}/stops/reorder"
        const val PATH_SEARCH_ROUTE_SETTINGS: String = "/route/setting"
        const val PATH_SEARCH_ROUTES: String = "/route"
        const val PATH_SET_DRIVER: String = "/route/{id}/driver/{driverId}"
        const val PATH_UPDATE_ROUTE: String = "/route/{routeId}"
        const val PATH_UPDATE_ROUTE_SETTINGS: String = "/route/setting/{routeSettingsId}"
        const val PATH_UPDATE_ROUTE_STOP: String = "/route/{routeId}/stop/{stopId}"
    }
}
