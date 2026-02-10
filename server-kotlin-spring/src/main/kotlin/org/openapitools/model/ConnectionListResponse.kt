package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ConnectionResponse
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
 * @param connections 
 * @param friendCount 
 * @param followingCount 
 * @param itemCount 
 * @param hasMoreResults 
 * @param returning 
 */
data class ConnectionListResponse(

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
    @get:JsonProperty("connections") val connections: kotlin.collections.List<ConnectionResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("friendCount") val friendCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("followingCount") val followingCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("itemCount") val itemCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hasMoreResults") val hasMoreResults: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("returning") val returning: kotlin.String? = null
) {

}

