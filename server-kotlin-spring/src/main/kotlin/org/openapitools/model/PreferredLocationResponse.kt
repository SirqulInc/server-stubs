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
 * @param ownerId 
 * @param onDate 
 * @param onDateMilli 
 * @param hour 
 * @param latitude 
 * @param longitude 
 * @param distance 
 * @param duration 
 * @param startStepId 
 * @param endStepId 
 */
data class PreferredLocationResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("ownerId") val ownerId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("onDate") val onDate: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("onDateMilli") val onDateMilli: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hour") val hour: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("latitude") val latitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("longitude") val longitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("distance") val distance: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("duration") val duration: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startStepId") val startStepId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endStepId") val endStepId: kotlin.Long? = null
) {

}

