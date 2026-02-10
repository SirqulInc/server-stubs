package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Account
import org.openapitools.model.Connection
import org.openapitools.model.ConnectionGroup
import org.openapitools.model.Permissions
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
 * @param permissionableType 
 * @param permissionableId 
 * @param connectionGroup 
 * @param friendGroup 
 * @param connection 
 * @param permissions 
 * @param exclude 
 * @param blocked 
 * @param owner 
 */
data class UserPermissions(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("permissionableType") val permissionableType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("permissionableId") val permissionableId: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("connectionGroup") val connectionGroup: ConnectionGroup? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("friendGroup") val friendGroup: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("connection") val connection: Connection? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("permissions") val permissions: Permissions? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("exclude") val exclude: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("blocked") val blocked: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("owner") val owner: Account? = null
) {

}

