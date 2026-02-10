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
 * @param rebootTimeHour 
 * @param rebootTimeMinute 
 * @param idleTimeoutInSecond 
 * @param serialNumber 
 * @param udid 
 * @param deviceType 
 * @param devicePower 
 * @param deviceInterference 
 * @param lastHeartbeatSent 
 * @param lastDown 
 * @param lastUp 
 * @param lastNotificationSent 
 * @param health 
 */
data class Device(

    @Schema(example = "null", description = "")
    @get:JsonProperty("rebootTimeHour") val rebootTimeHour: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("rebootTimeMinute") val rebootTimeMinute: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("idleTimeoutInSecond") val idleTimeoutInSecond: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("serialNumber") val serialNumber: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("udid") val udid: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("deviceType") val deviceType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("devicePower") val devicePower: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("deviceInterference") val deviceInterference: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("lastHeartbeatSent") val lastHeartbeatSent: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("lastDown") val lastDown: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("lastUp") val lastUp: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("lastNotificationSent") val lastNotificationSent: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("health") val health: Device.Health? = null
) {

    /**
    * 
    * Values: RUNNING,WARNING,DOWN
    */
    enum class Health(@get:JsonValue val value: kotlin.String) {

        RUNNING("RUNNING"),
        WARNING("WARNING"),
        DOWN("DOWN");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Health {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Device'")
            }
        }
    }

}

