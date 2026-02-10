package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.WeatherForecastResponse
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param id 
 * @param cloudcover 
 * @param humidity 
 * @param observationTime 
 * @param precipMM 
 * @param pressure 
 * @param tempC 
 * @param tempF 
 * @param visibility 
 * @param weatherCode 
 * @param weatherDesc 
 * @param weatherIconUrl 
 * @param winddir16Point 
 * @param winddirDegree 
 * @param windspeedKmph 
 * @param windspeedMiles 
 * @param forecasts 
 */
data class WeatherResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("cloudcover") val cloudcover: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("humidity") val humidity: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("observationTime") val observationTime: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("precipMM") val precipMM: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("pressure") val pressure: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("temp_C") val tempC: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("temp_F") val tempF: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("visibility") val visibility: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("weatherCode") val weatherCode: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("weatherDesc") val weatherDesc: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("weatherIconUrl") val weatherIconUrl: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("winddir16Point") val winddir16Point: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("winddirDegree") val winddirDegree: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("windspeedKmph") val windspeedKmph: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("windspeedMiles") val windspeedMiles: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("forecasts") val forecasts: kotlin.collections.List<WeatherForecastResponse>? = null
) {

}

