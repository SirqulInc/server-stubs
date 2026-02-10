package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Account
import org.openapitools.model.Application
import org.openapitools.model.Asset
import org.openapitools.model.ContactInfo
import org.openapitools.model.Flag
import org.openapitools.model.FlagThreshold
import org.openapitools.model.Note
import org.openapitools.model.Permissions
import org.openapitools.model.UserPermissions
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
 * @param owner 
 * @param title 
 * @param application 
 * @param approvalStatus 
 * @param publicPermissions 
 * @param userPermissions 
 * @param visibility 
 * @param notes 
 * @param noteCount 
 * @param likes 
 * @param likeCount 
 * @param dislikeCount 
 * @param flags 
 * @param flagCount 
 * @param flagThreshold 
 * @param description 
 * @param albumType 
 * @param assets 
 * @param coverAsset 
 * @param tags 
 * @param startDate 
 * @param endDate 
 * @param contactInfo 
 * @param assetCount 
 * @param favoriteCount 
 * @param viewedCount 
 * @param clickedCount 
 * @param sharedCount 
 * @param anonymous 
 * @param ownerUsername 
 * @param display 
 * @param appKey 
 * @param billableId 
 * @param subType 
 * @param contentAsset 
 * @param secondaryType 
 * @param contentName 
 * @param applicationTitle 
 * @param shortTitle 
 * @param defaultThreshold 
 */
data class Album(

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

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("owner") val owner: Account? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("application") val application: Application? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("approvalStatus") val approvalStatus: Album.ApprovalStatus? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("publicPermissions") val publicPermissions: Permissions? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("userPermissions") val userPermissions: kotlin.collections.List<UserPermissions>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("visibility") val visibility: Album.Visibility? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("notes") val notes: kotlin.collections.List<Note>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("noteCount") val noteCount: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("likes") val likes: kotlin.collections.List<YayOrNay>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("likeCount") val likeCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("dislikeCount") val dislikeCount: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("flags") val flags: kotlin.collections.List<Flag>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("flagCount") val flagCount: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("flagThreshold") val flagThreshold: FlagThreshold? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("albumType") val albumType: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("assets") val assets: kotlin.collections.List<Asset>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("coverAsset") val coverAsset: Asset? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("tags") val tags: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startDate") val startDate: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endDate") val endDate: java.time.OffsetDateTime? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("contactInfo") val contactInfo: ContactInfo? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("assetCount") val assetCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("favoriteCount") val favoriteCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("viewedCount") val viewedCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("clickedCount") val clickedCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("sharedCount") val sharedCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("anonymous") val anonymous: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ownerUsername") val ownerUsername: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("display") val display: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appKey") val appKey: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("billableId") val billableId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("subType") val subType: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("contentAsset") val contentAsset: Asset? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("secondaryType") val secondaryType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contentName") val contentName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("applicationTitle") val applicationTitle: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("shortTitle") val shortTitle: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("defaultThreshold") val defaultThreshold: kotlin.Long? = null
) {

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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Album'")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Album'")
            }
        }
    }

}

