package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.LoadShortResponse
import org.openapitools.model.NodeRequest
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
 * @param geoId 
 * @param latitude 
 * @param longitude 
 * @param startWindow 
 * @param endWindow 
 * @param type 
 * @param eta 
 * @param etd 
 * @param score 
 * @param errorCode 
 * @param error 
 * @param itemId 
 * @param itemSize 
 * @param load 
 * @param floorPlanPath 
 * @param valid 
 */
data class StopResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("geoId") val geoId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("latitude") val latitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("longitude") val longitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startWindow") val startWindow: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endWindow") val endWindow: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("type") val type: StopResponse.Type? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("eta") val eta: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("etd") val etd: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("score") val score: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("errorCode") val errorCode: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("error") val error: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("itemId") val itemId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("itemSize") val itemSize: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("load") val load: LoadShortResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("floorPlanPath") val floorPlanPath: kotlin.collections.List<NodeRequest>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null
) {

    /**
    * 
    * Values: PICKUP,DROPOFF,START,END,ROUTING
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        PICKUP("PICKUP"),
        DROPOFF("DROPOFF"),
        START("START"),
        END("END"),
        ROUTING("ROUTING");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'StopResponse'")
            }
        }
    }

}

