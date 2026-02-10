package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.NameStringValueResponse
import org.openapitools.model.UserLocationResponse
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
 * @param valid 
 * @param message 
 * @param version 
 * @param serializeNulls 
 * @param startTimeLog 
 * @param errorCode 
 * @param request 
 * @param items 
 * @param userLocationType 
 * @param latitude 
 * @param longitude 
 * @param postalCode 
 * @param count 
 * @param returning 
 */
data class UserLocationListResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("message") val message: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("version") val version: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("serializeNulls") val serializeNulls: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startTimeLog") val startTimeLog: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("errorCode") val errorCode: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("request") val request: kotlin.collections.List<NameStringValueResponse>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("items") val items: kotlin.collections.List<UserLocationResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("userLocationType") val userLocationType: UserLocationListResponse.UserLocationType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("latitude") val latitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("longitude") val longitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("postalCode") val postalCode: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("count") val count: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("returning") val returning: kotlin.String? = null
) {

    /**
    * 
    * Values: POSTALCODE,EXACT
    */
    enum class UserLocationType(@get:JsonValue val value: kotlin.String) {

        POSTALCODE("POSTALCODE"),
        EXACT("EXACT");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): UserLocationType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'UserLocationListResponse'")
            }
        }
    }

}

