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
 * @param availabilityId 
 * @param startDate 
 * @param endDate 
 * @param dayOfWeek 
 * @param startTime 
 * @param endTime 
 * @param timeZone 
 * @param deleted 
 */
data class AvailabilityResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("availabilityId") val availabilityId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startDate") val startDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endDate") val endDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("dayOfWeek") val dayOfWeek: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startTime") val startTime: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endTime") val endTime: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("timeZone") val timeZone: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("deleted") val deleted: kotlin.Boolean? = null
) {

}

