package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Chronology
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
 * @param end 
 * @param start 
 * @param chronology 
 * @param startMillis 
 * @param endMillis 
 * @param beforeNow 
 * @param afterNow 
 */
data class Interval(

    @Schema(example = "null", description = "")
    @get:JsonProperty("end") val end: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("start") val start: java.time.OffsetDateTime? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("chronology") val chronology: Chronology? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startMillis") val startMillis: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endMillis") val endMillis: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("beforeNow") val beforeNow: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("afterNow") val afterNow: kotlin.Boolean? = null
) {

}

