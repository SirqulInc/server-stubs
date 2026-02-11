package org.openapitools.api

import org.openapitools.model.RoutingListResponse
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
class RoutingApiController() {

    @Operation(
        summary = "Compute Route",
        operationId = "computeRouting",
        description = """This service finds the most optimal routes for delivering items between locations (reducing transit time/resources). It can take in a list of vehicles and a list of items (to be transported).All load items have pick-up and drop-off locations with time windows for when the item is expected to be picked-up and dropped-off. """,
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = RoutingListResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/routing/compute"
        value = [PATH_COMPUTE_ROUTING],
        produces = ["*/*"]
    )
    fun computeRouting(
        @NotNull @Parameter(description = "Json object containing inputs for generating the routes. See description for more info. Also see RoutingRequest", required = true) @Valid @RequestParam(value = "data", required = true) `data`: kotlin.String
    ): ResponseEntity<RoutingListResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_COMPUTE_ROUTING: String = "/routing/compute"
    }
}
