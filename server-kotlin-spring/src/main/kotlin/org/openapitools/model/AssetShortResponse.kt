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
 * @param assetId 
 * @param fileName 
 * @param caption 
 * @param mediaType 
 * @param thumbnailURL 
 * @param coverURL 
 * @param fullURL 
 * @param assetVersion 
 * @param versionName 
 * @param versionCode 
 * @param returning 
 */
data class AssetShortResponse(

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
    @get:JsonProperty("assetId") val assetId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("fileName") val fileName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("caption") val caption: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("mediaType") val mediaType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("thumbnailURL") val thumbnailURL: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("coverURL") val coverURL: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("fullURL") val fullURL: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("assetVersion") val assetVersion: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("versionName") val versionName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("versionCode") val versionCode: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("returning") val returning: kotlin.String? = null
) {

}

