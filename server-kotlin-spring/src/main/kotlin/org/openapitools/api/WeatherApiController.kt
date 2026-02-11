package org.openapitools.api

import org.openapitools.model.WeatherResponse
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
class WeatherApiController() {

    @Operation(
        summary = "Search Weather",
        operationId = "searchWeather",
        description = """Search the weather forcast for the next 5 days""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = WeatherResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/weather/search"
        value = [PATH_SEARCH_WEATHER],
        produces = ["*/*"]
    )
    fun searchWeather(
        @Parameter(description = "Region Id") @Valid @RequestParam(value = "regionId", required = false) regionId: kotlin.Long?,
        @Parameter(description = "Latitude") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "Longitude") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "Timezone Offset", schema = Schema(defaultValue = "-6L")) @Valid @RequestParam(value = "timezoneOffset", required = false, defaultValue = "-6L") timezoneOffset: kotlin.Long
    ): ResponseEntity<WeatherResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_SEARCH_WEATHER: String = "/weather/search"
    }
}
