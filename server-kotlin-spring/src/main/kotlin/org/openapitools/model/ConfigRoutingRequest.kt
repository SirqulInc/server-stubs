package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param debugMode 
 * @param threaded 
 * @param threadType 
 * @param maxRuntime 
 * @param numberOfMatches 
 * @param maxItineraryTime 
 * @param maxStopsPerVehicle 
 * @param averageCityTimePerMile 
 * @param averageFreewayTimePerMile 
 * @param freewayTravelDistance 
 * @param sameStopBuffer 
 * @param orderAlgorithm 
 * @param scoreAlgorithm 
 */
data class ConfigRoutingRequest(

    @Schema(example = "null", description = "")
    @get:JsonProperty("debugMode") val debugMode: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("threaded") val threaded: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("threadType") val threadType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("maxRuntime") val maxRuntime: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("numberOfMatches") val numberOfMatches: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("maxItineraryTime") val maxItineraryTime: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("maxStopsPerVehicle") val maxStopsPerVehicle: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("averageCityTimePerMile") val averageCityTimePerMile: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("averageFreewayTimePerMile") val averageFreewayTimePerMile: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("freewayTravelDistance") val freewayTravelDistance: kotlin.Float? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("sameStopBuffer") val sameStopBuffer: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("orderAlgorithm") val orderAlgorithm: ConfigRoutingRequest.OrderAlgorithm? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("scoreAlgorithm") val scoreAlgorithm: ConfigRoutingRequest.ScoreAlgorithm? = null
) {

    /**
    * 
    * Values: CLOSEST_FIRST,FURTHEST_FIRST,PICKUPS_FIRST
    */
    enum class OrderAlgorithm(@get:JsonValue val value: kotlin.String) {

        CLOSEST_FIRST("CLOSEST_FIRST"),
        FURTHEST_FIRST("FURTHEST_FIRST"),
        PICKUPS_FIRST("PICKUPS_FIRST");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): OrderAlgorithm {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ConfigRoutingRequest'")
            }
        }
    }

    /**
    * 
    * Values: FEWEST_VEHICLES,SHORTEST_PASSENGER_TIME
    */
    enum class ScoreAlgorithm(@get:JsonValue val value: kotlin.String) {

        FEWEST_VEHICLES("FEWEST_VEHICLES"),
        SHORTEST_PASSENGER_TIME("SHORTEST_PASSENGER_TIME");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ScoreAlgorithm {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ConfigRoutingRequest'")
            }
        }
    }

}

