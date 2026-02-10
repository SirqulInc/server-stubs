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
 * @param scheduledNotificationId 
 * @param active 
 * @param status 
 * @param type 
 * @param name 
 * @param message 
 * @param groupingId 
 * @param scheduledDate 
 * @param startDate 
 * @param endDate 
 */
data class ScheduledNotificationShortResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("scheduledNotificationId") val scheduledNotificationId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: ScheduledNotificationShortResponse.Status? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("type") val type: ScheduledNotificationShortResponse.Type? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("message") val message: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("groupingId") val groupingId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("scheduledDate") val scheduledDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startDate") val startDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endDate") val endDate: kotlin.Long? = null
) {

    /**
    * 
    * Values: NEW,ERROR,COMPLETE,PROCESSING,TEMPLATE
    */
    enum class Status(@get:JsonValue val value: kotlin.String) {

        NEW("NEW"),
        ERROR("ERROR"),
        COMPLETE("COMPLETE"),
        PROCESSING("PROCESSING"),
        TEMPLATE("TEMPLATE");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Status {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ScheduledNotificationShortResponse'")
            }
        }
    }

    /**
    * 
    * Values: HTTP,SAVE,EMAIL,SMS,APNS,GCM,PUSH,MOBILE_NOTIFICATION
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        HTTP("HTTP"),
        SAVE("SAVE"),
        EMAIL("EMAIL"),
        SMS("SMS"),
        APNS("APNS"),
        GCM("GCM"),
        PUSH("PUSH"),
        MOBILE_NOTIFICATION("MOBILE_NOTIFICATION");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ScheduledNotificationShortResponse'")
            }
        }
    }

}

