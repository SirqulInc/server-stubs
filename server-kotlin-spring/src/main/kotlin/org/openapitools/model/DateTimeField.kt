package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.DateTimeFieldType
import org.openapitools.model.DurationField
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
 * @param name 
 * @param type 
 * @param supported 
 * @param minimumValue 
 * @param maximumValue 
 * @param durationField 
 * @param leapDurationField 
 * @param rangeDurationField 
 * @param lenient 
 */
data class DateTimeField(

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("type") val type: DateTimeFieldType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("supported") val supported: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("minimumValue") val minimumValue: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("maximumValue") val maximumValue: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("durationField") val durationField: DurationField? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("leapDurationField") val leapDurationField: DurationField? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("rangeDurationField") val rangeDurationField: DurationField? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("lenient") val lenient: kotlin.Boolean? = null
) {

}

