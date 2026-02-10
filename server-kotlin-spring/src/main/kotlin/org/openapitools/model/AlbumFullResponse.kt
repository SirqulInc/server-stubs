package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AccountShortResponse
import org.openapitools.model.AssetResponse
import org.openapitools.model.ConnectionGroupShortResponse
import org.openapitools.model.ConnectionResponse
import org.openapitools.model.LikeResponse
import org.openapitools.model.NameStringValueResponse
import org.openapitools.model.NoteFullResponse
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
 * @param valid 
 * @param message 
 * @param version 
 * @param serializeNulls 
 * @param startTimeLog 
 * @param errorCode 
 * @param request 
 * @param albumId 
 * @param albumType 
 * @param ownerId 
 * @param owner 
 * @param title 
 * @param description 
 * @param coverAsset 
 * @param tags 
 * @param visibility 
 * @param startDate 
 * @param endDate 
 * @param assetCount 
 * @param likeCount 
 * @param dislikeCount 
 * @param commentsCount 
 * @param userCount 
 * @param notifications 
 * @param latitude 
 * @param longitude 
 * @param locationDescription 
 * @param distance 
 * @param dateCreated 
 * @param dateUpdated 
 * @param cellPhone 
 * @param fullAddress 
 * @param approvalStatus 
 * @param favoriteCount 
 * @param liked 
 * @param favorite 
 * @param favoriteId 
 * @param anonymous 
 * @param flagCount 
 * @param viewedCount 
 * @param clickedCount 
 * @param sharedCount 
 * @param assets 
 * @param comments 
 * @param likes 
 * @param connectionGroups 
 * @param connections 
 * @param hasLiked 
 * @param hasDisliked 
 * @param userPermissions 
 * @param publicPermissions 
 * @param returning 
 */
data class AlbumFullResponse(

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
    @get:JsonProperty("albumId") val albumId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("albumType") val albumType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ownerId") val ownerId: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("owner") val owner: AccountShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("coverAsset") val coverAsset: AssetResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("tags") val tags: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("visibility") val visibility: AlbumFullResponse.Visibility? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startDate") val startDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endDate") val endDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("assetCount") val assetCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("likeCount") val likeCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("dislikeCount") val dislikeCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("commentsCount") val commentsCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("userCount") val userCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("notifications") val notifications: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("latitude") val latitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("longitude") val longitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locationDescription") val locationDescription: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("distance") val distance: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("dateCreated") val dateCreated: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("dateUpdated") val dateUpdated: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("cellPhone") val cellPhone: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("fullAddress") val fullAddress: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("approvalStatus") val approvalStatus: AlbumFullResponse.ApprovalStatus? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("favoriteCount") val favoriteCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("liked") val liked: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("favorite") val favorite: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("favoriteId") val favoriteId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("anonymous") val anonymous: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("flagCount") val flagCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("viewedCount") val viewedCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("clickedCount") val clickedCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("sharedCount") val sharedCount: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("assets") val assets: kotlin.collections.List<AssetResponse>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("comments") val comments: kotlin.collections.List<NoteFullResponse>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("likes") val likes: kotlin.collections.List<LikeResponse>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("connectionGroups") val connectionGroups: kotlin.collections.List<ConnectionGroupShortResponse>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("connections") val connections: kotlin.collections.List<ConnectionResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hasLiked") val hasLiked: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hasDisliked") val hasDisliked: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("userPermissions") val userPermissions: Permissions? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("publicPermissions") val publicPermissions: Permissions? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("returning") val returning: kotlin.String? = null
) {

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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AlbumFullResponse'")
            }
        }
    }

    /**
    * 
    * Values: PENDING,REJECTED,APPROVED,FEATURED
    */
    enum class ApprovalStatus(@get:JsonValue val value: kotlin.String) {

        PENDING("PENDING"),
        REJECTED("REJECTED"),
        APPROVED("APPROVED"),
        FEATURED("FEATURED");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ApprovalStatus {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AlbumFullResponse'")
            }
        }
    }

}

