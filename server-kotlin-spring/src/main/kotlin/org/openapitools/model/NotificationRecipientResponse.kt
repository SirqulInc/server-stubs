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
 * @param accountId 
 * @param locationDisplay 
 * @param display 
 * @param username 
 * @param accountType 
 * @param profileImage 
 * @param gender 
 * @param contactEmail 
 * @param applicationId 
 * @param appName 
 * @param hasApns 
 * @param hasGcm 
 * @param hasEmail 
 * @param hasSms 
 */
data class NotificationRecipientResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("accountId") val accountId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locationDisplay") val locationDisplay: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("display") val display: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("username") val username: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("accountType") val accountType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("profileImage") val profileImage: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("gender") val gender: NotificationRecipientResponse.Gender? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contactEmail") val contactEmail: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("applicationId") val applicationId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appName") val appName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hasApns") val hasApns: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hasGcm") val hasGcm: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hasEmail") val hasEmail: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hasSms") val hasSms: kotlin.Boolean? = null
) {

    /**
    * 
    * Values: MALE,FEMALE,ANY
    */
    enum class Gender(@get:JsonValue val value: kotlin.String) {

        MALE("MALE"),
        FEMALE("FEMALE"),
        ANY("ANY");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Gender {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'NotificationRecipientResponse'")
            }
        }
    }

}

