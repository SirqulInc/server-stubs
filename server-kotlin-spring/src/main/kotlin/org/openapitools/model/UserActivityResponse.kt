package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param created 
 * @param latitude 
 * @param longitude 
 * @param tag 
 * @param customId 
 * @param customType 
 * @param userId 
 * @param username 
 * @param appTitle 
 * @param appId 
 * @param appUrl 
 * @param appDescription 
 * @param imageURL 
 * @param profileImage 
 * @param fields 
 * @param id 
 * @param customText 
 * @param customValue 
 * @param customMessage 
 * @param returning 
 */
data class UserActivityResponse(

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
    @get:JsonProperty("created") val created: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("latitude") val latitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("longitude") val longitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("tag") val tag: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("customId") val customId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("customType") val customType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("userId") val userId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("username") val username: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appTitle") val appTitle: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appId") val appId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appUrl") val appUrl: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appDescription") val appDescription: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("imageURL") val imageURL: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("profileImage") val profileImage: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("fields") val fields: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("customText") val customText: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("customValue") val customValue: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("customMessage") val customMessage: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("returning") val returning: kotlin.String? = null
) {

}

