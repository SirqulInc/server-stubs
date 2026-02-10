package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AccountShortResponse
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
 * @param scheduledDate 
 * @param startTime 
 * @param endTime 
 * @param dayOfWeek 
 * @param timeZone 
 * @param reservationCount 
 * @param reservations 
 */
data class TimeSlotResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("scheduledDate") val scheduledDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startTime") val startTime: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endTime") val endTime: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("dayOfWeek") val dayOfWeek: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("timeZone") val timeZone: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("reservationCount") val reservationCount: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("reservations") val reservations: kotlin.collections.List<AccountShortResponse>? = null
) {

}

