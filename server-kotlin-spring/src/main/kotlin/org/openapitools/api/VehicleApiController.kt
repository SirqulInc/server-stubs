package org.openapitools.api

import org.openapitools.model.Vehicle
import org.openapitools.model.VehicleType
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
class VehicleApiController() {

    @Operation(
        summary = "Create Vehicle",
        operationId = "createVehicle",
        description = """Create new vehicle""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = Vehicle::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/vehicle"
        value = [PATH_CREATE_VEHICLE],
        produces = ["*/*"]
    )
    fun createVehicle(
        @NotNull @Parameter(description = "A JSON representation of cargo type. ```json {   \"name\": \"Truck\",   \"vehicleType\": { \"id\": 1 },   \"hub\": { \"id\": 1 } } ``` ", required = true) @Valid @RequestParam(value = "vehicle", required = true) vehicle: kotlin.String,
        @Parameter(description = "") @Valid @RequestBody(required = false) body: Vehicle?
    ): ResponseEntity<Vehicle> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Vehicle Type",
        operationId = "createVehicleType",
        description = """Create a new vehicle type""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = VehicleType::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/vehicle/type"
        value = [PATH_CREATE_VEHICLE_TYPE],
        produces = ["*/*"]
    )
    fun createVehicleType(
        @NotNull @Parameter(description = "A JSON representation of cargo type. ```json {   \"name\": \"Truck\",   \"width\": 100,   \"height\": 200,   \"depth\": 200,   \"maxWeight\": 5000,   \"hub\": { \"id\": 1 } } ``` ", required = true) @Valid @RequestParam(value = "vehicleType", required = true) vehicleType: kotlin.String,
        @Parameter(description = "") @Valid @RequestBody(required = false) body: VehicleType?
    ): ResponseEntity<VehicleType> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Vehicle",
        operationId = "deleteVehicle",
        description = """Delete an existing vehicle""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        // "/vehicle/{id}"
        value = [PATH_DELETE_VEHICLE]
    )
    fun deleteVehicle(
        @Parameter(description = "The id of the vehicle to delete", required = true) @PathVariable("id") id: kotlin.Long
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Vehicle Type",
        operationId = "deleteVehicleType",
        description = """Delete a vehicle type""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        // "/vehicle/type/{vehicleTypeId}"
        value = [PATH_DELETE_VEHICLE_TYPE]
    )
    fun deleteVehicleType(
        @Parameter(description = "The id of the requested vehicle type", required = true) @PathVariable("vehicleTypeId") vehicleTypeId: kotlin.Long
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Vehicle",
        operationId = "getVehicle",
        description = """Get an existing vehicle""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = Vehicle::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vehicle/{id}"
        value = [PATH_GET_VEHICLE],
        produces = ["*/*"]
    )
    fun getVehicle(
        @Parameter(description = "The id of the vehicle requested", required = true) @PathVariable("id") id: kotlin.Long
    ): ResponseEntity<Vehicle> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Vehicle Type",
        operationId = "getVehicleType",
        description = """Get a vehicle type""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = VehicleType::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vehicle/type/{vehicleTypeId}"
        value = [PATH_GET_VEHICLE_TYPE],
        produces = ["*/*"]
    )
    fun getVehicleType(
        @Parameter(description = "The id of the requested vehicle type", required = true) @PathVariable("vehicleTypeId") vehicleTypeId: kotlin.Long
    ): ResponseEntity<VehicleType> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Vehicle",
        operationId = "searchVehicle",
        description = """Search for vehicles""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = Vehicle::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vehicle"
        value = [PATH_SEARCH_VEHICLE],
        produces = ["*/*"]
    )
    fun searchVehicle(
        @NotNull @Parameter(description = "Filter by service hub", required = true) @Valid @RequestParam(value = "hubId", required = true) hubId: kotlin.Long,
        @NotNull @Parameter(description = "The field to sort by", required = true, schema = Schema(defaultValue = "id")) @Valid @RequestParam(value = "sortField", required = true, defaultValue = "id") sortField: kotlin.String,
        @NotNull @Parameter(description = "Determines whether the sorted list is in descending or ascending order", required = true, schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "descending", required = true, defaultValue = "false") descending: kotlin.Boolean,
        @NotNull @Parameter(description = "The start index for pagination", required = true, schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = true, defaultValue = "0") start: kotlin.Int,
        @NotNull @Parameter(description = "The limit for pagination", required = true, schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = true, defaultValue = "20") limit: kotlin.Int,
        @NotNull @Parameter(description = "Return only active results", required = true, schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "activeOnly", required = true, defaultValue = "true") activeOnly: kotlin.Boolean,
        @Parameter(description = "The keyword to search for") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?
    ): ResponseEntity<List<Vehicle>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Vehicle Type",
        operationId = "searchVehicleTypes",
        description = """Search for types of vehicles""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = VehicleType::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/vehicle/type"
        value = [PATH_SEARCH_VEHICLE_TYPES],
        produces = ["*/*"]
    )
    fun searchVehicleTypes(
        @NotNull @Parameter(description = "The field to sort by", required = true, schema = Schema(defaultValue = "id")) @Valid @RequestParam(value = "sortField", required = true, defaultValue = "id") sortField: kotlin.String,
        @NotNull @Parameter(description = "Determines whether the sorted list is in descending or ascending order", required = true, schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "descending", required = true, defaultValue = "false") descending: kotlin.Boolean,
        @NotNull @Parameter(description = "The start index for pagination", required = true, schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = true, defaultValue = "0") start: kotlin.Int,
        @NotNull @Parameter(description = "The limit for pagination", required = true, schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = true, defaultValue = "20") limit: kotlin.Int,
        @NotNull @Parameter(description = "Return only active results", required = true, schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "activeOnly", required = true, defaultValue = "true") activeOnly: kotlin.Boolean,
        @Parameter(description = "Filter by retailer") @Valid @RequestParam(value = "retailerId", required = false) retailerId: kotlin.Long?,
        @Parameter(description = "Filter by service hub") @Valid @RequestParam(value = "hubId", required = false) hubId: kotlin.Long?
    ): ResponseEntity<List<VehicleType>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Vehicle",
        operationId = "updateVehicle",
        description = """Update an existing vehicle""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = Vehicle::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PUT],
        // "/vehicle/{id}"
        value = [PATH_UPDATE_VEHICLE],
        produces = ["*/*"]
    )
    fun updateVehicle(
        @Parameter(description = "The id of the vehicle to update", required = true) @PathVariable("id") id: kotlin.Long,
        @NotNull @Parameter(description = "A JSON representation of cargo type, for example: ```json {   \"name\": \"Truck\",   \"vehicleType\": { \"id\": 1 },   \"hub\": { \"id\": 1 } } ``` ", required = true) @Valid @RequestParam(value = "vehicle", required = true) vehicle: kotlin.String,
        @Parameter(description = "") @Valid @RequestBody(required = false) body: Vehicle?
    ): ResponseEntity<Vehicle> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Vehicle Type",
        operationId = "updateVehicleType",
        description = """Update a vehicle type""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = VehicleType::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PUT],
        // "/vehicle/type/{vehicleTypeId}"
        value = [PATH_UPDATE_VEHICLE_TYPE],
        produces = ["*/*"]
    )
    fun updateVehicleType(
        @Parameter(description = "The id of the vehicle type to update", required = true) @PathVariable("vehicleTypeId") vehicleTypeId: kotlin.Long,
        @NotNull @Parameter(description = "The new data for the vehicle type to update to. A JSON representation of cargo type, for example: ```json {   \"name\": \"Truck\",   \"width\": 100,   \"height\": 200,   \"depth\": 200,   \"maxWeight\": 5000,   \"hub\": { \"id\": 1 } } ``` ", required = true) @Valid @RequestParam(value = "vehicleType", required = true) vehicleType: kotlin.String,
        @Parameter(description = "") @Valid @RequestBody(required = false) body: VehicleType?
    ): ResponseEntity<VehicleType> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_VEHICLE: String = "/vehicle"
        const val PATH_CREATE_VEHICLE_TYPE: String = "/vehicle/type"
        const val PATH_DELETE_VEHICLE: String = "/vehicle/{id}"
        const val PATH_DELETE_VEHICLE_TYPE: String = "/vehicle/type/{vehicleTypeId}"
        const val PATH_GET_VEHICLE: String = "/vehicle/{id}"
        const val PATH_GET_VEHICLE_TYPE: String = "/vehicle/type/{vehicleTypeId}"
        const val PATH_SEARCH_VEHICLE: String = "/vehicle"
        const val PATH_SEARCH_VEHICLE_TYPES: String = "/vehicle/type"
        const val PATH_UPDATE_VEHICLE: String = "/vehicle/{id}"
        const val PATH_UPDATE_VEHICLE_TYPE: String = "/vehicle/type/{vehicleTypeId}"
    }
}
