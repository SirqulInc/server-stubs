package org.openapitools.api

import org.openapitools.model.ServiceHub
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
class HubApiController() {

    @Operation(
        summary = "Create Service Hub",
        operationId = "createServiceHub",
        description = """Create new service hub""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ServiceHub::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/hub"
        value = [PATH_CREATE_SERVICE_HUB],
        produces = ["*/*"]
    )
    fun createServiceHub(
        @Parameter(description = "") @Valid @RequestBody(required = false) body: ServiceHub?
    ): ResponseEntity<ServiceHub> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Service Hub",
        operationId = "deleteServiceHub",
        description = """Delete an existing service hub""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation") ]
    )
    @RequestMapping(
        method = [RequestMethod.DELETE],
        // "/hub/{id}"
        value = [PATH_DELETE_SERVICE_HUB]
    )
    fun deleteServiceHub(
        @Parameter(description = "the id of the service hub to delete", required = true) @PathVariable("id") id: kotlin.Long
    ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Service Hub",
        operationId = "getServiceHub",
        description = """Get an existing service hub""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = kotlin.Any::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/hub/{id}"
        value = [PATH_GET_SERVICE_HUB],
        produces = ["*/*"]
    )
    fun getServiceHub(
        @Parameter(description = "the id of the service hub to get", required = true) @PathVariable("id") id: kotlin.Long
    ): ResponseEntity<kotlin.Any> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Service Hub",
        operationId = "postServiceHub",
        description = """Update an existing service hub""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ServiceHub::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/hub/{id}"
        value = [PATH_POST_SERVICE_HUB],
        produces = ["*/*"]
    )
    fun postServiceHub(
        @Parameter(description = "the id of the service hub", required = true) @PathVariable("id") id: kotlin.Long,
        @Parameter(description = "") @Valid @RequestBody(required = false) body: ServiceHub?
    ): ResponseEntity<ServiceHub> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Service Hub",
        operationId = "putServiceHub",
        description = """Update an existing service hub""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ServiceHub::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PUT],
        // "/hub/{id}"
        value = [PATH_PUT_SERVICE_HUB],
        produces = ["*/*"]
    )
    fun putServiceHub(
        @Parameter(description = "the id of the service hub", required = true) @PathVariable("id") id: kotlin.Long,
        @Parameter(description = "") @Valid @RequestBody(required = false) body: ServiceHub?
    ): ResponseEntity<ServiceHub> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Service Hubs",
        operationId = "searchServiceHubs",
        description = """Search for service hubs.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = ServiceHub::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/hub"
        value = [PATH_SEARCH_SERVICE_HUBS],
        produces = ["*/*"]
    )
    fun searchServiceHubs(
        @NotNull @Parameter(description = "The field to sort by", required = true) @Valid @RequestParam(value = "sortField", required = true) sortField: kotlin.String,
        @NotNull @Parameter(description = "Determines whether the sorted list is in descending or ascending order", required = true) @Valid @RequestParam(value = "descending", required = true) descending: kotlin.Boolean,
        @NotNull @Parameter(description = "The start index for pagination", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "The limit for pagination", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @NotNull @Parameter(description = "Return only active results", required = true) @Valid @RequestParam(value = "activeOnly", required = true) activeOnly: kotlin.Boolean,
        @Parameter(description = "The keyword to search for") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "The retailer belongs to") @Valid @RequestParam(value = "retailerId", required = false) retailerId: kotlin.Long?
    ): ResponseEntity<List<ServiceHub>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_SERVICE_HUB: String = "/hub"
        const val PATH_DELETE_SERVICE_HUB: String = "/hub/{id}"
        const val PATH_GET_SERVICE_HUB: String = "/hub/{id}"
        const val PATH_POST_SERVICE_HUB: String = "/hub/{id}"
        const val PATH_PUT_SERVICE_HUB: String = "/hub/{id}"
        const val PATH_SEARCH_SERVICE_HUBS: String = "/hub"
    }
}
