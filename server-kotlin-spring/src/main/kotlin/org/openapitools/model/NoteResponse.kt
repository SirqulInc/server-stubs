package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AccountShortResponse
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
 * @param noteId 
 * @param comment 
 * @param tags 
 * @param likesCount 
 * @param dislikesCount 
 * @param dateCreated 
 * @param createdDate 
 * @param updatedDate 
 * @param owner 
 * @param latitude 
 * @param longitude 
 * @param locationDescription 
 * @param returning 
 */
data class NoteResponse(

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
    @get:JsonProperty("noteId") val noteId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("comment") val comment: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("tags") val tags: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("likesCount") val likesCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("dislikesCount") val dislikesCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("dateCreated") val dateCreated: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("createdDate") val createdDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("updatedDate") val updatedDate: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("owner") val owner: AccountShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("latitude") val latitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("longitude") val longitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locationDescription") val locationDescription: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("returning") val returning: kotlin.String? = null
) {

}

