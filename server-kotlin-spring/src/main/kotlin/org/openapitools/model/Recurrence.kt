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
 * @param frequency 
 * @param daysOfWeek 
 * @param start 
 * @param count 
 * @param until 
 */
data class Recurrence(

    @Schema(example = "null", description = "")
    @get:JsonProperty("frequency") val frequency: Recurrence.Frequency? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("daysOfWeek") val daysOfWeek: kotlin.collections.List<kotlin.Int>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("start") val start: java.time.LocalDate? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("count") val count: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("until") val until: java.time.LocalDate? = null
) {

    /**
    * 
    * Values: DAILY,WEEKLY,MONTHLY,ANNUALLY,WEEK_DAY_ONLY
    */
    enum class Frequency(@get:JsonValue val value: kotlin.String) {

        DAILY("DAILY"),
        WEEKLY("WEEKLY"),
        MONTHLY("MONTHLY"),
        ANNUALLY("ANNUALLY"),
        WEEK_DAY_ONLY("WEEK_DAY_ONLY");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Frequency {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Recurrence'")
            }
        }
    }

}

