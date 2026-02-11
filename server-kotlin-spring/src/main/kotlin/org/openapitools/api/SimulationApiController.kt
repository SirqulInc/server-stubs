package org.openapitools.api

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
class SimulationApiController() {

    @Operation(
        summary = "Routing Simulation",
        operationId = "simulation",
        description = """Simulates routing requests.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/simulation/routing"
        value = [PATH_SIMULATION],
        produces = ["*/*"]
    )
    fun simulation(
        @NotNull @Parameter(description = "JSON string in the following format: ```json {   \"startDate\": 1474268400000,   \"endDate\": 1474268700000,   \"checkoutStops\": [     {       \"latitude\": 25.060453943481615,       \"longitude\": 121.57487118216957     }   ],   \"requests\": [     {       \"vehicles\": [         {           \"id\": \"customer1\",           \"name\": \"Customer 1\",           \"depot\": {             \"latitude\": 25.060453943481615,             \"longitude\": 121.57487118216957           },           \"startWindow\": 1474268464537         }       ],       \"items\": [         {           \"id\": 152712,           \"name\": \"Appliance Product\",           \"pickup\": {             \"latitude\": 25.060306635544144,             \"longitude\": 121.5750770690688           }         },         {           \"id\": 152711,           \"name\": \"TV product\",           \"pickup\": {             \"latitude\": 25.060126352576326,             \"longitude\": 121.57505023621624           }         }       ]     }   ],   \"featuredItems\": [],   \"floorPlan\": {     \"metersPerX\": 0.81493109028875,     \"metersPerY\": 1.8525267552262,     \"width\": 75,     \"height\": 50,     \"exclusions\": [       { \"x\": 14, \"y\": 49 }     ],     \"southwest\": {       \"x\": 0,       \"y\": 0,       \"latitude\": 25.05961539530497,       \"longitude\": 121.57487591737885     }   } } ``` ", required = true) @Valid @RequestParam(value = "data", required = true) `data`: kotlin.String,
        @NotNull @Parameter(description = "determines whether to run the simulation and return the results in the same request", required = true) @Valid @RequestParam(value = "realTime", required = true) realTime: kotlin.Boolean
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_SIMULATION: String = "/simulation/routing"
    }
}
