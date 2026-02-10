package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param forecastDate 
 * @param precipMM 
 * @param tempMaxC 
 * @param tempMaxF 
 * @param tempMinC 
 * @param tempMinF 
 * @param weatherCode 
 * @param weatherDesc 
 * @param weatherIconUrl 
 * @param winddir16Point 
 * @param winddirDegree 
 * @param winddirection 
 * @param windspeedKmph 
 * @param windspeedMiles 
 */
data class WeatherForecastResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("forecastDate") val forecastDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("precipMM") val precipMM: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("tempMaxC") val tempMaxC: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("tempMaxF") val tempMaxF: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("tempMinC") val tempMinC: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("tempMinF") val tempMinF: kotlin.Int? = null,

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
    @get:JsonProperty("winddirection") val winddirection: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("windspeedKmph") val windspeedKmph: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("windspeedMiles") val windspeedMiles: kotlin.Int? = null
) {

}

