package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Chronology
import org.openapitools.model.DateTimeField
import org.openapitools.model.DateTimeFieldType
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
 * @param chronology 
 * @param hourOfDay 
 * @param minuteOfHour 
 * @param secondOfMinute 
 * @param millisOfSecond 
 * @param millisOfDay 
 * @param fields 
 * @param propertyValues 
 * @param fieldTypes 
 */
data class java.time.LocalTime(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("chronology") val chronology: Chronology? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hourOfDay") val hourOfDay: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("minuteOfHour") val minuteOfHour: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("secondOfMinute") val secondOfMinute: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("millisOfSecond") val millisOfSecond: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("millisOfDay") val millisOfDay: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("fields") val fields: kotlin.collections.List<DateTimeField>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("values") val propertyValues: kotlin.collections.List<kotlin.Int>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("fieldTypes") val fieldTypes: kotlin.collections.List<DateTimeFieldType>? = null
) {

}

