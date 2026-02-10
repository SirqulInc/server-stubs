package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Account
import org.openapitools.model.Album
import org.openapitools.model.Application
import org.openapitools.model.Assignment
import org.openapitools.model.Flag
import org.openapitools.model.FlagThreshold
import org.openapitools.model.Note
import org.openapitools.model.YayOrNay
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
 * @param latitude 
 * @param longitude 
 * @param locationDescription 
 * @param premigrationId 
 * @param newOwnerId 
 * @param folderUri 
 * @param fileName 
 * @param mediaType 
 * @param mimeType 
 * @param metaData 
 * @param caption 
 * @param versionCode 
 * @param versionName 
 * @param likeCount 
 * @param dislikeCount 
 * @param noteCount 
 * @param owner 
 * @param notes 
 * @param likes 
 * @param attachedAssetId 
 * @param flags 
 * @param flagCount 
 * @param flagThreshold 
 * @param defaultAlbumType 
 * @param album 
 * @param assignment 
 * @param application 
 * @param display 
 * @param appKey 
 * @param billableId 
 * @param subType 
 * @param contentName 
 * @param urifolder 
 * @param defaultThreshold 
 */
data class Asset(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("latitude") val latitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("longitude") val longitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locationDescription") val locationDescription: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("premigrationId") val premigrationId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("newOwnerId") val newOwnerId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("folderUri") val folderUri: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("fileName") val fileName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("mediaType") val mediaType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("mimeType") val mimeType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("metaData") val metaData: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("caption") val caption: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("versionCode") val versionCode: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("versionName") val versionName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("likeCount") val likeCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("dislikeCount") val dislikeCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("noteCount") val noteCount: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("owner") val owner: Account? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("notes") val notes: kotlin.collections.List<Note>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("likes") val likes: kotlin.collections.List<YayOrNay>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("attachedAssetId") val attachedAssetId: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("flags") val flags: kotlin.collections.List<Flag>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("flagCount") val flagCount: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("flagThreshold") val flagThreshold: FlagThreshold? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("defaultAlbumType") val defaultAlbumType: Asset.DefaultAlbumType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("album") val album: Album? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("assignment") val assignment: Assignment? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("application") val application: Application? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("display") val display: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appKey") val appKey: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("billableId") val billableId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("subType") val subType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contentName") val contentName: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("urifolder") val urifolder: java.net.URI? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("defaultThreshold") val defaultThreshold: kotlin.Long? = null
) {

    /**
    * 
    * Values: PROFILE,DEFAULT_PROFILE_AVATAR,DEFAULT_APP_ICON,DEFAULT_APP_LOGO
    */
    enum class DefaultAlbumType(@get:JsonValue val value: kotlin.String) {

        PROFILE("PROFILE"),
        DEFAULT_PROFILE_AVATAR("DEFAULT_PROFILE_AVATAR"),
        DEFAULT_APP_ICON("DEFAULT_APP_ICON"),
        DEFAULT_APP_LOGO("DEFAULT_APP_LOGO");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): DefaultAlbumType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Asset'")
            }
        }
    }

}

