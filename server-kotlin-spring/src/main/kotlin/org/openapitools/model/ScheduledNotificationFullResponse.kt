package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AccountShortResponse
import org.openapitools.model.ApplicationMiniResponse
import org.openapitools.model.BillableEntityShortResponse
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
 * @param owner 
 * @param billableEntity 
 * @param contentId 
 * @param contentName 
 * @param contentType 
 * @param parentId 
 * @param parentType 
 * @param application 
 * @param targetId 
 * @param targetName 
 * @param targetType 
 * @param targetParams 
 * @param deliverEstimate 
 * @param deliverCount 
 * @param deliverTotal 
 * @param deliverFailed 
 * @param processingTime 
 * @param sendingTime 
 * @param updated 
 * @param created 
 * @param cronExpression 
 * @param endpointURL 
 * @param payload 
 * @param conditionalInput 
 * @param connectionAccountIds 
 * @param templateType 
 * @param groupedTypes 
 */
data class ScheduledNotificationFullResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("scheduledNotificationId") val scheduledNotificationId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: ScheduledNotificationFullResponse.Status? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("type") val type: ScheduledNotificationFullResponse.Type? = null,

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
    @get:JsonProperty("endDate") val endDate: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("owner") val owner: AccountShortResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("billableEntity") val billableEntity: BillableEntityShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contentId") val contentId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contentName") val contentName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contentType") val contentType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("parentId") val parentId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("parentType") val parentType: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("application") val application: ApplicationMiniResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("targetId") val targetId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("targetName") val targetName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("targetType") val targetType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("targetParams") val targetParams: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("deliverEstimate") val deliverEstimate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("deliverCount") val deliverCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("deliverTotal") val deliverTotal: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("deliverFailed") val deliverFailed: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("processingTime") val processingTime: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("sendingTime") val sendingTime: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("updated") val updated: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("created") val created: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("cronExpression") val cronExpression: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endpointURL") val endpointURL: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("payload") val payload: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("conditionalInput") val conditionalInput: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("connectionAccountIds") val connectionAccountIds: kotlin.collections.List<kotlin.Long>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("templateType") val templateType: ScheduledNotificationFullResponse.TemplateType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("groupedTypes") val groupedTypes: kotlin.collections.List<ScheduledNotificationFullResponse.GroupedTypes>? = null
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ScheduledNotificationFullResponse'")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ScheduledNotificationFullResponse'")
            }
        }
    }

    /**
    * 
    * Values: REPORTING,ACHIEVEMENT_OWNER,ACHIEVEMENT_TRIGGER,GEOFENCE_OWNER,GEOFENCE_TARGET,GEOFENCE_TRIGGER,GEOFENCE_HTTP_CALL
    */
    enum class TemplateType(@get:JsonValue val value: kotlin.String) {

        REPORTING("REPORTING"),
        ACHIEVEMENT_OWNER("ACHIEVEMENT_OWNER"),
        ACHIEVEMENT_TRIGGER("ACHIEVEMENT_TRIGGER"),
        GEOFENCE_OWNER("GEOFENCE_OWNER"),
        GEOFENCE_TARGET("GEOFENCE_TARGET"),
        GEOFENCE_TRIGGER("GEOFENCE_TRIGGER"),
        GEOFENCE_HTTP_CALL("GEOFENCE_HTTP_CALL");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): TemplateType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ScheduledNotificationFullResponse'")
            }
        }
    }

    /**
    * 
    * Values: HTTP,SAVE,EMAIL,SMS,APNS,GCM,PUSH,MOBILE_NOTIFICATION
    */
    enum class GroupedTypes(@get:JsonValue val value: kotlin.String) {

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
            fun forValue(value: kotlin.String): GroupedTypes {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ScheduledNotificationFullResponse'")
            }
        }
    }

}

