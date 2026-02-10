package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.PermissionResponse
import org.openapitools.model.UserPermissionsResponse
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
 * @param action 
 * @param visibility 
 * @param publicPermissions 
 * @param userPermissions 
 */
data class UserPermissionsListResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("action") val action: UserPermissionsListResponse.Action? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("visibility") val visibility: UserPermissionsListResponse.Visibility? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("publicPermissions") val publicPermissions: PermissionResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("userPermissions") val userPermissions: kotlin.collections.List<UserPermissionsResponse>? = null
) {

    /**
    * 
    * Values: DATA,SAVE,DELETE,GET
    */
    enum class Action(@get:JsonValue val value: kotlin.String) {

        DATA("DATA"),
        SAVE("SAVE"),
        DELETE("DELETE"),
        GET("GET");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Action {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'UserPermissionsListResponse'")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'UserPermissionsListResponse'")
            }
        }
    }

}

