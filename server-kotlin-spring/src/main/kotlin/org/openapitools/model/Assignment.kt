package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Account
import org.openapitools.model.Application
import org.openapitools.model.Asset
import org.openapitools.model.AssignmentStatus
import org.openapitools.model.Note
import org.openapitools.model.Permissions
import org.openapitools.model.RetailerLocation
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
 * @param name 
 * @param description 
 * @param assignee 
 * @param retailerLocation 
 * @param creator 
 * @param lastUpdatedBy 
 * @param currentStatus 
 * @param currentStatusType 
 * @param assets 
 * @param notes 
 * @param publicPermissions 
 * @param userPermissions 
 * @param visibility 
 * @param statuses 
 * @param application 
 * @param approvalStatus 
 * @param contentName 
 * @param contentAsset 
 * @param owner 
 * @param noteCount 
 */
data class Assignment(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("assignee") val assignee: Account? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("retailerLocation") val retailerLocation: RetailerLocation? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("creator") val creator: Account? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("lastUpdatedBy") val lastUpdatedBy: Account? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("currentStatus") val currentStatus: AssignmentStatus? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("currentStatusType") val currentStatusType: Assignment.CurrentStatusType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("assets") val assets: kotlin.collections.List<Asset>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("notes") val notes: kotlin.collections.List<Note>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("publicPermissions") val publicPermissions: Permissions? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("userPermissions") val userPermissions: kotlin.collections.List<UserPermissions>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("visibility") val visibility: Assignment.Visibility? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("statuses") val statuses: kotlin.collections.List<AssignmentStatus>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("application") val application: Application? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("approvalStatus") val approvalStatus: Assignment.ApprovalStatus? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contentName") val contentName: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("contentAsset") val contentAsset: Asset? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("owner") val owner: Account? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("noteCount") val noteCount: kotlin.Long? = null
) {

    /**
    * 
    * Values: NEW,IN_PROGRESS,SUBSCRIBED,ARCHIVED
    */
    enum class CurrentStatusType(@get:JsonValue val value: kotlin.String) {

        NEW("NEW"),
        IN_PROGRESS("IN_PROGRESS"),
        SUBSCRIBED("SUBSCRIBED"),
        ARCHIVED("ARCHIVED");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): CurrentStatusType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Assignment'")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Assignment'")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Assignment'")
            }
        }
    }

}

