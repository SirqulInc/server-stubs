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
 * @param position 
 * @param &#x60;data&#x60; 
 */
data class BiometricImage(

    @Schema(example = "null", description = "")
    @get:JsonProperty("position") val position: BiometricImage.Position? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("data") val `data`: kotlin.String? = null
) {

    /**
    * 
    * Values: UNKNOWN,LEFT_INDEX,LEFT_MIDDLE,LEFT_RING,LEFT_LITTLE,LEFT_THUMB,RIGHT_INDEX,RIGHT_MIDDLE,RIGHT_RING,RIGHT_LITTLE,RIGHT_THUMB,LEFT,RIGHT
    */
    enum class Position(@get:JsonValue val value: kotlin.String) {

        UNKNOWN("UNKNOWN"),
        LEFT_INDEX("LEFT_INDEX"),
        LEFT_MIDDLE("LEFT_MIDDLE"),
        LEFT_RING("LEFT_RING"),
        LEFT_LITTLE("LEFT_LITTLE"),
        LEFT_THUMB("LEFT_THUMB"),
        RIGHT_INDEX("RIGHT_INDEX"),
        RIGHT_MIDDLE("RIGHT_MIDDLE"),
        RIGHT_RING("RIGHT_RING"),
        RIGHT_LITTLE("RIGHT_LITTLE"),
        RIGHT_THUMB("RIGHT_THUMB"),
        LEFT("LEFT"),
        RIGHT("RIGHT");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Position {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'BiometricImage'")
            }
        }
    }

}

