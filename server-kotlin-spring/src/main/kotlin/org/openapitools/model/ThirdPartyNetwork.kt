package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.BillableEntity
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
 * @param id 
 * @param active 
 * @param valid 
 * @param networkUID 
 * @param name 
 * @param description 
 * @param introspectionMethod 
 * @param introspectionURL 
 * @param introspectionParams 
 * @param requiredRootField 
 * @param billableEntity 
 * @param supportedNetwork 
 * @param enableIntrospection 
 */
data class ThirdPartyNetwork(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("networkUID") val networkUID: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("introspectionMethod") val introspectionMethod: ThirdPartyNetwork.IntrospectionMethod? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("introspectionURL") val introspectionURL: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("introspectionParams") val introspectionParams: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("requiredRootField") val requiredRootField: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("billableEntity") val billableEntity: BillableEntity? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("supportedNetwork") val supportedNetwork: ThirdPartyNetwork.SupportedNetwork? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("enableIntrospection") val enableIntrospection: kotlin.Boolean? = null
) {

    /**
    * 
    * Values: GET,HEAD,POST,PUT,PATCH,DELETE,OPTIONS,TRACE
    */
    enum class IntrospectionMethod(@get:JsonValue val value: kotlin.String) {

        GET("GET"),
        HEAD("HEAD"),
        POST("POST"),
        PUT("PUT"),
        PATCH("PATCH"),
        DELETE("DELETE"),
        OPTIONS("OPTIONS"),
        TRACE("TRACE");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): IntrospectionMethod {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ThirdPartyNetwork'")
            }
        }
    }

    /**
    * 
    * Values: FACEBOOK,TWITTER,CLEAR,USERNAME,PHONE,UNKNOWN,CUSTOM
    */
    enum class SupportedNetwork(@get:JsonValue val value: kotlin.String) {

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
            fun forValue(value: kotlin.String): SupportedNetwork {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ThirdPartyNetwork'")
            }
        }
    }

}

