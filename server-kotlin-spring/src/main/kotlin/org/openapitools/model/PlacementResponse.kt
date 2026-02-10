package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AssetShortResponse
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
 * @param placementId 
 * @param name 
 * @param description 
 * @param propertySize 
 * @param height 
 * @param width 
 * @param refreshInterval 
 * @param appName 
 * @param appKey 
 * @param active 
 * @param defaultImage 
 */
data class PlacementResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("placementId") val placementId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("size") val propertySize: PlacementResponse.PropertySize? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("height") val height: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("width") val width: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("refreshInterval") val refreshInterval: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appName") val appName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appKey") val appKey: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("defaultImage") val defaultImage: AssetShortResponse? = null
) {

    /**
    * 
    * Values: CONFIG,BANNER,LEADERBOARD,SKYSCRAPER,VIDEO,ZIP,INTERSTITIAL,CUSTOM1,CUSTOM2,CUSTOM3,CUSTOM4,CUSTOM5,CUSTOM6,CUSTOM7,CUSTOM8,CUSTOM9,CUSTOM10
    */
    enum class PropertySize(@get:JsonValue val value: kotlin.String) {

        CONFIG("CONFIG"),
        BANNER("BANNER"),
        LEADERBOARD("LEADERBOARD"),
        SKYSCRAPER("SKYSCRAPER"),
        VIDEO("VIDEO"),
        ZIP("ZIP"),
        INTERSTITIAL("INTERSTITIAL"),
        CUSTOM1("CUSTOM1"),
        CUSTOM2("CUSTOM2"),
        CUSTOM3("CUSTOM3"),
        CUSTOM4("CUSTOM4"),
        CUSTOM5("CUSTOM5"),
        CUSTOM6("CUSTOM6"),
        CUSTOM7("CUSTOM7"),
        CUSTOM8("CUSTOM8"),
        CUSTOM9("CUSTOM9"),
        CUSTOM10("CUSTOM10");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): PropertySize {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'PlacementResponse'")
            }
        }
    }

}

