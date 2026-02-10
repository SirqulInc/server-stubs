package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ConnectionResponse
import org.openapitools.model.GroupPermissions
import org.openapitools.model.NameStringValueResponse
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
 * @param connectionGroupId 
 * @param name 
 * @param groupType 
 * @param thumbnailURL 
 * @param subGroups 
 * @param description 
 * @param active 
 * @param connectionCount 
 * @param connections 
 * @param groupPermissions 
 * @param ownerId 
 * @param returning 
 */
data class ConnectionGroupResponse(

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

    @Schema(example = "null", description = "")
    @get:JsonProperty("connectionGroupId") val connectionGroupId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("groupType") val groupType: ConnectionGroupResponse.GroupType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("thumbnailURL") val thumbnailURL: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("subGroups") val subGroups: kotlin.collections.List<ConnectionGroupResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("connectionCount") val connectionCount: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("connections") val connections: kotlin.collections.List<ConnectionResponse>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("groupPermissions") val groupPermissions: GroupPermissions? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ownerId") val ownerId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("returning") val returning: kotlin.String? = null
) {

    /**
    * 
    * Values: PRIVATE,FRIENDS,TRUSTED,BLOCKED,FOLLOWERS,FOLLOWING,PENDING,REQUEST
    */
    enum class GroupType(@get:JsonValue val value: kotlin.String) {

        PRIVATE("PRIVATE"),
        FRIENDS("FRIENDS"),
        TRUSTED("TRUSTED"),
        BLOCKED("BLOCKED"),
        FOLLOWERS("FOLLOWERS"),
        FOLLOWING("FOLLOWING"),
        PENDING("PENDING"),
        REQUEST("REQUEST");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): GroupType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ConnectionGroupResponse'")
            }
        }
    }

}

