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
 * @param avatarId 
 * @param deviceId 
 * @param rssi 
 * @param filteredRssi 
 * @param time 
 * @param networkName 
 * @param randomizedId 
 * @param deviceSignature 
 * @param alternateId 
 * @param type 
 * @param probeType 
 * @param avgRssi 
 */
data class TrilatCacheSample(

    @Schema(example = "null", description = "")
    @get:JsonProperty("avatarId") val avatarId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("deviceId") val deviceId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("rssi") val rssi: kotlin.collections.List<kotlin.Int>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("filteredRssi") val filteredRssi: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("time") val time: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("networkName") val networkName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("randomizedId") val randomizedId: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("deviceSignature") val deviceSignature: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("alternateId") val alternateId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("type") val type: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("probeType") val probeType: TrilatCacheSample.ProbeType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("avgRssi") val avgRssi: kotlin.Double? = null
) {

    /**
    * 
    * Values: WIFI_PROBE_REQUEST,IBEACON,BLE,UNKNOWN
    */
    enum class ProbeType(@get:JsonValue val value: kotlin.String) {

        WIFI_PROBE_REQUEST("WIFI_PROBE_REQUEST"),
        IBEACON("IBEACON"),
        BLE("BLE"),
        UNKNOWN("UNKNOWN");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ProbeType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'TrilatCacheSample'")
            }
        }
    }

}

