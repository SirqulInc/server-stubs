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
 * @param processingType 
 * @param maxSampleSize 
 * @param minRSSI 
 */
data class TrilatAppSettings(

    @Schema(example = "null", description = "")
    @get:JsonProperty("processingType") val processingType: TrilatAppSettings.ProcessingType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("maxSampleSize") val maxSampleSize: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("minRSSI") val minRSSI: kotlin.Double? = null
) {

    /**
    * 
    * Values: DEFAULT,FINGERPRINT,FINGERPRINT_V2
    */
    enum class ProcessingType(@get:JsonValue val value: kotlin.String) {

        DEFAULT("DEFAULT"),
        FINGERPRINT("FINGERPRINT"),
        FINGERPRINT_V2("FINGERPRINT_V2");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ProcessingType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'TrilatAppSettings'")
            }
        }
    }

}

