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
 * @param action 
 * @param bearing 
 * @param bearingDifference 
 * @param heading 
 * @param distance 
 * @param distanceUnits 
 * @param distanceString 
 * @param startLatitude 
 * @param startLongitude 
 * @param endLatitude 
 * @param endLongitude 
 * @param instruction 
 * @param progressStatus 
 */
data class DirectionResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("action") val action: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("bearing") val bearing: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("bearingDifference") val bearingDifference: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("heading") val heading: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("distance") val distance: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("distanceUnits") val distanceUnits: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("distanceString") val distanceString: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startLatitude") val startLatitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startLongitude") val startLongitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endLatitude") val endLatitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endLongitude") val endLongitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("instruction") val instruction: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("progressStatus") val progressStatus: kotlin.String? = null
) {

}

