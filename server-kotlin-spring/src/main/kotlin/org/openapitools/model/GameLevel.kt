package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Account
import org.openapitools.model.AppVersion
import org.openapitools.model.Application
import org.openapitools.model.Asset
import org.openapitools.model.Flag
import org.openapitools.model.FlagThreshold
import org.openapitools.model.Note
import org.openapitools.model.Offer
import org.openapitools.model.Permissions
import org.openapitools.model.Tutorial
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
 * @param newOwnerId 
 * @param gameDifficulty 
 * @param name 
 * @param image 
 * @param icon 
 * @param description 
 * @param startDate 
 * @param endDate 
 * @param randomizeGameObjects 
 * @param owner 
 * @param version 
 * @param notes 
 * @param noteCount 
 * @param likes 
 * @param likeCount 
 * @param dislikeCount 
 * @param playCount 
 * @param downloadCount 
 * @param gameObjectCount 
 * @param publicPermissions 
 * @param visibility 
 * @param userPermissions 
 * @param flags 
 * @param flagCount 
 * @param flagThreshold 
 * @param application 
 * @param assignMission 
 * @param authorOverride 
 * @param splashTitle 
 * @param splashMessage 
 * @param winnerMessage 
 * @param tutorial 
 * @param approvalStatus 
 * @param nextLevel 
 * @param offer 
 * @param balance 
 * @param levelNumber 
 * @param points 
 * @param ticketType 
 * @param ticketCount 
 * @param allocateTickets 
 * @param applicationTitle 
 * @param ownerUsername 
 * @param likableNotificationModels 
 * @param notableNotificationModels 
 * @param published 
 * @param contentName 
 * @param defaultThreshold 
 * @param contentAsset 
 * @param contentType 
 */
data class GameLevel(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("newOwnerId") val newOwnerId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("gameDifficulty") val gameDifficulty: GameLevel.GameDifficulty? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("image") val image: Asset? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("icon") val icon: Asset? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startDate") val startDate: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endDate") val endDate: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("randomizeGameObjects") val randomizeGameObjects: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("owner") val owner: Account? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("version") val version: AppVersion? = null,

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

    @Schema(example = "null", description = "")
    @get:JsonProperty("playCount") val playCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("downloadCount") val downloadCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("gameObjectCount") val gameObjectCount: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("publicPermissions") val publicPermissions: Permissions? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("visibility") val visibility: GameLevel.Visibility? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("userPermissions") val userPermissions: kotlin.collections.List<UserPermissions>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("flags") val flags: kotlin.collections.List<Flag>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("flagCount") val flagCount: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("flagThreshold") val flagThreshold: FlagThreshold? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("application") val application: Application? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("assignMission") val assignMission: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("authorOverride") val authorOverride: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("splashTitle") val splashTitle: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("splashMessage") val splashMessage: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("winnerMessage") val winnerMessage: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("tutorial") val tutorial: Tutorial? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("approvalStatus") val approvalStatus: GameLevel.ApprovalStatus? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("nextLevel") val nextLevel: GameLevel? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("offer") val offer: Offer? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("balance") val balance: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("levelNumber") val levelNumber: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("points") val points: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketType") val ticketType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketCount") val ticketCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("allocateTickets") val allocateTickets: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("applicationTitle") val applicationTitle: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ownerUsername") val ownerUsername: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("likableNotificationModels") val likableNotificationModels: kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("notableNotificationModels") val notableNotificationModels: kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("published") val published: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contentName") val contentName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("defaultThreshold") val defaultThreshold: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("contentAsset") val contentAsset: Asset? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contentType") val contentType: kotlin.String? = null
) {

    /**
    * 
    * Values: VERY_EASY,EASY,MEDIUM,HARD,VERY_HARD
    */
    enum class GameDifficulty(@get:JsonValue val value: kotlin.String) {

        VERY_EASY("VERY_EASY"),
        EASY("EASY"),
        MEDIUM("MEDIUM"),
        HARD("HARD"),
        VERY_HARD("VERY_HARD");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): GameDifficulty {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'GameLevel'")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'GameLevel'")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'GameLevel'")
            }
        }
    }

}

