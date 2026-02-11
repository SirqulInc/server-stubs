package org.openapitools.api

import org.openapitools.model.Shipment
import org.openapitools.model.ShipmentBatch
import org.openapitools.model.ShipmentImportStatus
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
class ShipmentApiController() {

    @Operation(
        summary = "Cancel Shipment",
        operationId = "cancelShipment",
        description = """Remove shipment from route""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/shipment/{id}/cancel"
        value = [PATH_CANCEL_SHIPMENT]
    )
    fun cancelShipment(
        @Parameter(description = "the id of the shipment to cancel", required = true) @PathVariable("id") id: kotlin.Long
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Shipment",
        operationId = "createShipment",
        description = """Create new shipment""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = Shipment::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/shipment"
        value = [PATH_CREATE_SHIPMENT],
        produces = ["*/*"]
    )
    fun createShipment(
        @Parameter(description = "") @Valid @RequestBody(required = false) body: Shipment?
    ): ResponseEntity<Shipment> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Shipment Batch",
        operationId = "createShipmentBatch",
        description = """Create a new shipment batch""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ShipmentBatch::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/shipment/batch"
        value = [PATH_CREATE_SHIPMENT_BATCH],
        produces = ["*/*"]
    )
    fun createShipmentBatch(
        @Parameter(description = "") @Valid @RequestBody(required = false) body: ShipmentBatch?
    ): ResponseEntity<ShipmentBatch> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Shipment",
        operationId = "deleteShipment",
        description = """Delete an existing shipment""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        // "/shipment/{id}"
        value = [PATH_DELETE_SHIPMENT]
    )
    fun deleteShipment(
        @Parameter(description = "the id of the shipment to delete", required = true) @PathVariable("id") id: kotlin.Long
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Shipment Batch",
        operationId = "deleteShipmentBatch",
        description = """Search for shipment batches""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        // "/shipment/batch/{batchId}"
        value = [PATH_DELETE_SHIPMENT_BATCH]
    )
    fun deleteShipmentBatch(
        @Parameter(description = "the id of the shipment batch to delete", required = true) @PathVariable("batchId") batchId: kotlin.Long
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Shipment",
        operationId = "getShipment",
        description = """Get an existing shipment""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = Shipment::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/shipment/{id}"
        value = [PATH_GET_SHIPMENT],
        produces = ["*/*"]
    )
    fun getShipment(
        @Parameter(description = "the id of the shipment to get", required = true) @PathVariable("id") id: kotlin.Long
    ): ResponseEntity<Shipment> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Shipment Batch",
        operationId = "getShipmentBatch",
        description = """Get an existing shipment batch""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ShipmentBatch::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/shipment/batch/{batchId}"
        value = [PATH_GET_SHIPMENT_BATCH],
        produces = ["*/*"]
    )
    fun getShipmentBatch(
        @Parameter(description = "the id of the shipment batch to get", required = true) @PathVariable("batchId") batchId: kotlin.Long
    ): ResponseEntity<ShipmentBatch> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Shipment Batch Status",
        operationId = "getShipmentBatchStatus",
        description = """Get the import status list of the import shipment batch""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = ShipmentImportStatus::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/shipment/batch/{batchId}/status"
        value = [PATH_GET_SHIPMENT_BATCH_STATUS],
        produces = ["*/*"]
    )
    fun getShipmentBatchStatus(
        @Parameter(description = "The id of the requested shipment batch", required = true) @PathVariable("batchId") batchId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The field to sort by", required = true) @Valid @RequestParam(value = "sortField", required = true) sortField: kotlin.String,
        @NotNull @Parameter(description = "Determines whether the sorted list is in descending or ascending order", required = true) @Valid @RequestParam(value = "descending", required = true) descending: kotlin.Boolean,
        @NotNull @Parameter(description = "The start index for pagination", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "The limit for pagination", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @Parameter(description = "Valid import status only or not") @Valid @RequestParam(value = "valid", required = false) valid: kotlin.Boolean?,
        @Parameter(description = "Started import status only") @Valid @RequestParam(value = "started", required = false) started: kotlin.Boolean?,
        @Parameter(description = "Completed import status only") @Valid @RequestParam(value = "completed", required = false) completed: kotlin.Boolean?,
        @Parameter(description = "Has shipment associate to the status") @Valid @RequestParam(value = "hasShipment", required = false) hasShipment: kotlin.Boolean?,
        @Parameter(description = "Has route associate to the status") @Valid @RequestParam(value = "hasRoute", required = false) hasRoute: kotlin.Boolean?,
        @Parameter(description = "The keyword to search for") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?
    ): ResponseEntity<List<ShipmentImportStatus>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Shipment Batch",
        operationId = "searchShipmentBatch",
        description = """Search for shipment batches""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = ShipmentBatch::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/shipment/batch"
        value = [PATH_SEARCH_SHIPMENT_BATCH],
        produces = ["*/*"]
    )
    fun searchShipmentBatch(
        @NotNull @Parameter(description = "The associated service hub", required = true) @Valid @RequestParam(value = "hubId", required = true) hubId: kotlin.Long,
        @NotNull @Parameter(description = "The field to sort by", required = true) @Valid @RequestParam(value = "sortField", required = true) sortField: kotlin.String,
        @NotNull @Parameter(description = "Determines whether the sorted list is in descending or ascending order", required = true) @Valid @RequestParam(value = "descending", required = true) descending: kotlin.Boolean,
        @NotNull @Parameter(description = "The start index for pagination", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "The limit for pagination", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int
    ): ResponseEntity<List<ShipmentBatch>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Shipments",
        operationId = "searchShipments",
        description = """Search for shipments""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = Shipment::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/shipment"
        value = [PATH_SEARCH_SHIPMENTS],
        produces = ["*/*"]
    )
    fun searchShipments(
        @NotNull @Parameter(description = "The field to sort by", required = true) @Valid @RequestParam(value = "sortField", required = true) sortField: kotlin.String,
        @NotNull @Parameter(description = "Determines whether the sorted list is in descending or ascending order", required = true) @Valid @RequestParam(value = "descending", required = true) descending: kotlin.Boolean,
        @NotNull @Parameter(description = "The start index for pagination", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "The limit for pagination", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @NotNull @Parameter(description = "Return only active results", required = true) @Valid @RequestParam(value = "activeOnly", required = true) activeOnly: kotlin.Boolean,
        @Parameter(description = "The owner of the shipment") @Valid @RequestParam(value = "ownerId", required = false) ownerId: kotlin.Long?,
        @Parameter(description = "The rider associate to this shipment") @Valid @RequestParam(value = "riderId", required = false) riderId: kotlin.Long?,
        @Parameter(description = "The route associate to this shipment") @Valid @RequestParam(value = "routeId", required = false) routeId: kotlin.Long?
    ): ResponseEntity<List<Shipment>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Shipment",
        operationId = "updateShipment",
        description = """Update an existing shipment""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = Shipment::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PUT],
        // "/shipment/{id}"
        value = [PATH_UPDATE_SHIPMENT],
        produces = ["*/*"]
    )
    fun updateShipment(
        @Parameter(description = "the id of the shipment to update", required = true) @PathVariable("id") id: kotlin.Long,
        @Parameter(description = "") @Valid @RequestBody(required = false) body: Shipment?
    ): ResponseEntity<Shipment> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Uupdate Shipment Status",
        operationId = "updateShipmentStatus",
        description = """Update status of an existing shipment""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/shipment/{id}/status"
        value = [PATH_UPDATE_SHIPMENT_STATUS]
    )
    fun updateShipmentStatus(
        @Parameter(description = "the id of the shipment to update status", required = true) @PathVariable("id") id: kotlin.Long,
        @Parameter(description = "") @Valid @RequestBody(required = false) body: kotlin.collections.Map<kotlin.String, kotlin.Boolean>?
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CANCEL_SHIPMENT: String = "/shipment/{id}/cancel"
        const val PATH_CREATE_SHIPMENT: String = "/shipment"
        const val PATH_CREATE_SHIPMENT_BATCH: String = "/shipment/batch"
        const val PATH_DELETE_SHIPMENT: String = "/shipment/{id}"
        const val PATH_DELETE_SHIPMENT_BATCH: String = "/shipment/batch/{batchId}"
        const val PATH_GET_SHIPMENT: String = "/shipment/{id}"
        const val PATH_GET_SHIPMENT_BATCH: String = "/shipment/batch/{batchId}"
        const val PATH_GET_SHIPMENT_BATCH_STATUS: String = "/shipment/batch/{batchId}/status"
        const val PATH_SEARCH_SHIPMENT_BATCH: String = "/shipment/batch"
        const val PATH_SEARCH_SHIPMENTS: String = "/shipment"
        const val PATH_UPDATE_SHIPMENT: String = "/shipment/{id}"
        const val PATH_UPDATE_SHIPMENT_STATUS: String = "/shipment/{id}/status"
    }
}
