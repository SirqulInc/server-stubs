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
 * @param updated 
 * @param created 
 * @param active 
 * @param name 
 * @param description 
 * @param networkUID 
 * @param network 
 */
data class ThirdPartyNetworkShortResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("updated") val updated: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("created") val created: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("networkUID") val networkUID: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("network") val network: ThirdPartyNetworkShortResponse.Network? = null
) {

    /**
    * 
    * Values: FACEBOOK,TWITTER,CLEAR,USERNAME,PHONE,UNKNOWN,CUSTOM
    */
    enum class Network(@get:JsonValue val value: kotlin.String) {

        FACEBOOK("FACEBOOK"),
        TWITTER("TWITTER"),
        CLEAR("CLEAR"),
        USERNAME("USERNAME"),
        PHONE("PHONE"),
        UNKNOWN("UNKNOWN"),
        CUSTOM("CUSTOM");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Network {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ThirdPartyNetworkShortResponse'")
            }
        }
    }

}

