package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ConnectionGroupResponse
import org.openapitools.model.ConnectionResponse
import org.openapitools.model.NameStringValueResponse
import org.openapitools.model.PermissionResponse
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
 * @param permissions 
 * @param connection 
 * @param connectionGroup 
 * @param exclude 
 * @param blocked 
 * @param friendGroup 
 * @param permissionableId 
 * @param permissionableType 
 * @param returning 
 */
data class UserPermissionsResponse(

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
    @get:JsonProperty("permissions") val permissions: PermissionResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("connection") val connection: ConnectionResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("connectionGroup") val connectionGroup: ConnectionGroupResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("exclude") val exclude: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("blocked") val blocked: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("friendGroup") val friendGroup: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("permissionableId") val permissionableId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("permissionableType") val permissionableType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("returning") val returning: kotlin.String? = null
) {

}

