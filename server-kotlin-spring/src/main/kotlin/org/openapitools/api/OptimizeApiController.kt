package org.openapitools.api

import org.openapitools.model.ImportStatuses
import org.openapitools.model.Orders
import org.openapitools.model.ShipmentOrder
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
class OptimizeApiController() {

    @Operation(
        summary = "Get Optimization Result",
        operationId = "getOptimizationResult",
        description = """Get the results of the import batch.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ShipmentOrder::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/optimize/result/{batchID}"
        value = [PATH_GET_OPTIMIZATION_RESULT],
        produces = ["*/*"]
    )
    fun getOptimizationResult(
        @Parameter(description = "The batchID for getting the import status of.", required = true) @PathVariable("batchID") batchID: kotlin.String,
        @NotNull @Parameter(description = "The start index for pagination", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "The limit for pagination", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int
    ): ResponseEntity<Map<String, ShipmentOrder>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Request Optimization",
        operationId = "requestOptimization",
        description = """Request and upload of shipment orders and create ShipmentImportBatch for optimization.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ImportStatuses::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/optimize/request"
        value = [PATH_REQUEST_OPTIMIZATION],
        produces = ["*/*"]
    )
    fun requestOptimization(
        @Parameter(description = "") @Valid @RequestBody(required = false) body: Orders?
    ): ResponseEntity<ImportStatuses> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_GET_OPTIMIZATION_RESULT: String = "/optimize/result/{batchID}"
        const val PATH_REQUEST_OPTIMIZATION: String = "/optimize/request"
    }
}
