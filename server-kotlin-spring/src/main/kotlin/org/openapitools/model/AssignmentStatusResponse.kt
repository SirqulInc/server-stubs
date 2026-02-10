package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ScheduledNotificationShortResponse
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
 * @param assignmentStatusId 
 * @param active 
 * @param toDo 
 * @param connection 
 * @param method 
 * @param status 
 * @param closure 
 * @param message 
 * @param followUp 
 * @param created 
 * @param updated 
 * @param notification 
 */
data class AssignmentStatusResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("assignmentStatusId") val assignmentStatusId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("toDo") val toDo: AssignmentStatusResponse.ToDo? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("connection") val connection: AssignmentStatusResponse.Connection? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("method") val method: AssignmentStatusResponse.Method? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: AssignmentStatusResponse.Status? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("closure") val closure: AssignmentStatusResponse.Closure? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("message") val message: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("followUp") val followUp: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("created") val created: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("updated") val updated: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("notification") val notification: ScheduledNotificationShortResponse? = null
) {

    /**
    * 
    * Values: SITE_VISIT,PHONE,RECONTACT,RENEWAL,CREDIT
    */
    enum class ToDo(@get:JsonValue val value: kotlin.String) {

        SITE_VISIT("SITE_VISIT"),
        PHONE("PHONE"),
        RECONTACT("RECONTACT"),
        RENEWAL("RENEWAL"),
        CREDIT("CREDIT");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ToDo {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AssignmentStatusResponse'")
            }
        }
    }

    /**
    * 
    * Values: INITIAL,FOLLOW_UP,DECLINED
    */
    enum class Connection(@get:JsonValue val value: kotlin.String) {

        INITIAL("INITIAL"),
        FOLLOW_UP("FOLLOW_UP"),
        DECLINED("DECLINED");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Connection {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AssignmentStatusResponse'")
            }
        }
    }

    /**
    * 
    * Values: PHONE,SITE_VISIT,EMAIL
    */
    enum class Method(@get:JsonValue val value: kotlin.String) {

        PHONE("PHONE"),
        SITE_VISIT("SITE_VISIT"),
        EMAIL("EMAIL");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Method {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AssignmentStatusResponse'")
            }
        }
    }

    /**
    * 
    * Values: ARCHIVED,SUBSCRIBED,UNSUBSCRIBED,CONTACTED,DECLINED,NOT_CONTACTED
    */
    enum class Status(@get:JsonValue val value: kotlin.String) {

        ARCHIVED("ARCHIVED"),
        SUBSCRIBED("SUBSCRIBED"),
        UNSUBSCRIBED("UNSUBSCRIBED"),
        CONTACTED("CONTACTED"),
        DECLINED("DECLINED"),
        NOT_CONTACTED("NOT_CONTACTED");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Status {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AssignmentStatusResponse'")
            }
        }
    }

    /**
    * 
    * Values: PHONE,SITE_VISIT,PHONE_SITE,WEB
    */
    enum class Closure(@get:JsonValue val value: kotlin.String) {

        PHONE("PHONE"),
        SITE_VISIT("SITE_VISIT"),
        PHONE_SITE("PHONE_SITE"),
        WEB("WEB");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Closure {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AssignmentStatusResponse'")
            }
        }
    }

}

