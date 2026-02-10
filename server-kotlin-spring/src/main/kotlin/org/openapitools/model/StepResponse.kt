package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.LegResponse
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
 * @param leg 
 * @param distance 
 * @param duration 
 * @param startLat 
 * @param startLng 
 * @param startAlt 
 * @param startDate 
 * @param endLat 
 * @param endLng 
 * @param endAlt 
 * @param endDate 
 * @param accuracy 
 */
data class StepResponse(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("leg") val leg: LegResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("distance") val distance: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("duration") val duration: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startLat") val startLat: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startLng") val startLng: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startAlt") val startAlt: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startDate") val startDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endLat") val endLat: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endLng") val endLng: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endAlt") val endAlt: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endDate") val endDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("accuracy") val accuracy: kotlin.Int? = null
) {

}

