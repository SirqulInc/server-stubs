package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Account
import org.openapitools.model.Application
import org.openapitools.model.Asset
import org.openapitools.model.Audience
import org.openapitools.model.BillableEntity
import org.openapitools.model.ConnectionGroup
import org.openapitools.model.Permissions
import org.openapitools.model.ReportDefinition
import org.openapitools.model.UserPermissions
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
 * @param owner 
 * @param billableEntity 
 * @param type 
 * @param status 
 * @param templateType 
 * @param name 
 * @param errorMessage 
 * @param message 
 * @param payload 
 * @param contentName 
 * @param contentId 
 * @param contentType 
 * @param parentId 
 * @param parentType 
 * @param application 
 * @param connectionGroups 
 * @param accountIds 
 * @param audiences 
 * @param report 
 * @param reportParams 
 * @param endpointURL 
 * @param lastActionDate 
 * @param scheduledDate 
 * @param startDate 
 * @param endDate 
 * @param cronExpression 
 * @param deliverEstimate 
 * @param deliverCount 
 * @param deliverFailed 
 * @param deliverTotal 
 * @param deliverStart 
 * @param deliverLimit 
 * @param processingTime 
 * @param sendingTime 
 * @param groupingId 
 * @param conditionalInput 
 * @param conditionalCode 
 * @param publicPermissions 
 * @param userPermissions 
 * @param visibility 
 * @param approvalStatus 
 * @param contentAsset 
 */
data class ScheduledNotification(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("owner") val owner: Account? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("billableEntity") val billableEntity: BillableEntity? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("type") val type: ScheduledNotification.Type? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: ScheduledNotification.Status? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("templateType") val templateType: ScheduledNotification.TemplateType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("errorMessage") val errorMessage: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("message") val message: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("payload") val payload: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contentName") val contentName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contentId") val contentId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contentType") val contentType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("parentId") val parentId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("parentType") val parentType: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("application") val application: Application? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("connectionGroups") val connectionGroups: kotlin.collections.List<ConnectionGroup>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("accountIds") val accountIds: kotlin.collections.Set<kotlin.Long>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("audiences") val audiences: kotlin.collections.List<Audience>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("report") val report: ReportDefinition? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("reportParams") val reportParams: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endpointURL") val endpointURL: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("lastActionDate") val lastActionDate: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("scheduledDate") val scheduledDate: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startDate") val startDate: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endDate") val endDate: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("cronExpression") val cronExpression: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("deliverEstimate") val deliverEstimate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("deliverCount") val deliverCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("deliverFailed") val deliverFailed: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("deliverTotal") val deliverTotal: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("deliverStart") val deliverStart: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("deliverLimit") val deliverLimit: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("processingTime") val processingTime: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("sendingTime") val sendingTime: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("groupingId") val groupingId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("conditionalInput") val conditionalInput: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("conditionalCode") val conditionalCode: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("publicPermissions") val publicPermissions: Permissions? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("userPermissions") val userPermissions: kotlin.collections.List<UserPermissions>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("visibility") val visibility: ScheduledNotification.Visibility? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("approvalStatus") val approvalStatus: ScheduledNotification.ApprovalStatus? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("contentAsset") val contentAsset: Asset? = null
) {

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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ScheduledNotification'")
            }
        }
    }

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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ScheduledNotification'")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ScheduledNotification'")
            }
        }
    }

    /**
    * 
    * Values: PUBLIC,PRIVATE,FRIENDS
    */
    enum class Visibility(@get:JsonValue val value: kotlin.String) {

        PUBLIC("PUBLIC"),
        PRIVATE("PRIVATE"),
        FRIENDS("FRIENDS");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Visibility {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ScheduledNotification'")
            }
        }
    }

    /**
    * 
    * Values: PENDING,REJECTED,APPROVED,FEATURED
    */
    enum class ApprovalStatus(@get:JsonValue val value: kotlin.String) {

        PENDING("PENDING"),
        REJECTED("REJECTED"),
        APPROVED("APPROVED"),
        FEATURED("FEATURED");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ApprovalStatus {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ScheduledNotification'")
            }
        }
    }

}

