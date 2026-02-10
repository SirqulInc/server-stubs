package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ConnectionGroupResponse
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
 * @param groups 
 * @param followerCount 
 * @param followingCount 
 * @param friendCount 
 * @param privateGroupCount 
 * @param returning 
 */
data class ConnectionInfoResponse(

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
    @get:JsonProperty("groups") val groups: kotlin.collections.List<ConnectionGroupResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("followerCount") val followerCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("followingCount") val followingCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("friendCount") val friendCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("privateGroupCount") val privateGroupCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("returning") val returning: kotlin.String? = null
) {

}

