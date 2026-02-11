package org.openapitools.api

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
class StopApiController() {

    @Operation(
        summary = "Get Stop",
        operationId = "getStop",
        description = """Get an existing stop""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = Stop::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/stop/{id}"
        value = [PATH_GET_STOP],
        produces = ["*/*"]
    )
    fun getStop(
        @Parameter(description = "the id of the stop to get", required = true) @PathVariable("id") id: kotlin.Long
    ): ResponseEntity<Stop> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Stop",
        operationId = "updateStop",
        description = """Update an existing stop""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = Stop::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PUT],
        // "/stop/{id}"
        value = [PATH_UPDATE_STOP],
        produces = ["*/*"]
    )
    fun updateStop(
        @Parameter(description = "the id of the stop to update", required = true) @PathVariable("id") id: kotlin.Long,
        @Parameter(description = "") @Valid @RequestBody(required = false) body: Stop?
    ): ResponseEntity<Stop> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_GET_STOP: String = "/stop/{id}"
        const val PATH_UPDATE_STOP: String = "/stop/{id}"
    }
}
