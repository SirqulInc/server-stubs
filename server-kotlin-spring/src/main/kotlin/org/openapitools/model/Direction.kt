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
 * @param id 
 * @param active 
 * @param valid 
 * @param distance 
 * @param duration 
 * @param endLatitude 
 * @param endLongitude 
 * @param startLatitude 
 * @param startLongitude 
 * @param instruction 
 * @param polyline 
 * @param progressStatus 
 * @param highlight 
 */
data class Direction(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("distance") val distance: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("duration") val duration: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endLatitude") val endLatitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endLongitude") val endLongitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startLatitude") val startLatitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startLongitude") val startLongitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("instruction") val instruction: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("polyline") val polyline: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("progressStatus") val progressStatus: Direction.ProgressStatus? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("highlight") val highlight: kotlin.Boolean? = null
) {

    /**
    * 
    * Values: PENDING,COMPLETE,INVALID
    */
    enum class ProgressStatus(@get:JsonValue val value: kotlin.String) {

        PENDING("PENDING"),
        COMPLETE("COMPLETE"),
        INVALID("INVALID");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ProgressStatus {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Direction'")
            }
        }
    }

}

