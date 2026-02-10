package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Account
import org.openapitools.model.Asset
import org.openapitools.model.Audience
import org.openapitools.model.BillableEntity
import org.openapitools.model.Game
import org.openapitools.model.GameLevel
import org.openapitools.model.MissionTask
import org.openapitools.model.Offer
import org.openapitools.model.Pack
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
 * @param owner 
 * @param missionType 
 * @param title 
 * @param description 
 * @param costToPlay 
 * @param costToPlayType 
 * @param games 
 * @param audiences 
 * @param startDate 
 * @param endDate 
 * @param sequenceType 
 * @param authorOverride 
 * @param icon 
 * @param image 
 * @param offers 
 * @param visibility 
 * @param task 
 * @param points 
 * @param ticketType 
 * @param ticketCount 
 * @param allocateTickets 
 * @param billableEntity 
 * @param balance 
 * @param startingLimit 
 * @param availableLimit 
 * @param inviteCount 
 * @param acceptedCount 
 * @param inviteStatus 
 * @param childCount 
 * @param secondsBetweenLevels 
 * @param secondsBetweenPacks 
 * @param maximumLevelLength 
 * @param enableBuyBack 
 * @param activePack 
 * @param minimumToPlay 
 * @param fixedReward 
 * @param refunded 
 * @param notificationsCreated 
 * @param rewarded 
 * @param externalId 
 * @param advancedReporting 
 * @param splitReward 
 * @param joinCode 
 * @param firstPack 
 * @param allGameLevels 
 * @param allPacks 
 */
data class Mission(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("owner") val owner: Account? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("missionType") val missionType: Mission.MissionType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("costToPlay") val costToPlay: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("costToPlayType") val costToPlayType: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("games") val games: kotlin.collections.List<Game>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("audiences") val audiences: kotlin.collections.List<Audience>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startDate") val startDate: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endDate") val endDate: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("sequenceType") val sequenceType: Mission.SequenceType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("authorOverride") val authorOverride: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("icon") val icon: Asset? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("image") val image: Asset? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("offers") val offers: kotlin.collections.List<Offer>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("visibility") val visibility: Mission.Visibility? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("task") val task: MissionTask? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("points") val points: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketType") val ticketType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketCount") val ticketCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("allocateTickets") val allocateTickets: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("billableEntity") val billableEntity: BillableEntity? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("balance") val balance: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startingLimit") val startingLimit: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("availableLimit") val availableLimit: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("inviteCount") val inviteCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("acceptedCount") val acceptedCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("inviteStatus") val inviteStatus: Mission.InviteStatus? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("childCount") val childCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("secondsBetweenLevels") val secondsBetweenLevels: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("secondsBetweenPacks") val secondsBetweenPacks: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("maximumLevelLength") val maximumLevelLength: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("enableBuyBack") val enableBuyBack: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("activePack") val activePack: Pack? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("minimumToPlay") val minimumToPlay: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("fixedReward") val fixedReward: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("refunded") val refunded: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("notificationsCreated") val notificationsCreated: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("rewarded") val rewarded: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("externalId") val externalId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("advancedReporting") val advancedReporting: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("splitReward") val splitReward: Mission.SplitReward? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("joinCode") val joinCode: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("firstPack") val firstPack: Pack? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("allGameLevels") val allGameLevels: kotlin.collections.List<GameLevel>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("allPacks") val allPacks: kotlin.collections.List<Pack>? = null
) {

    /**
    * 
    * Values: PUBLIC,SHARED,TOURNAMENT,POOLPLAY
    */
    enum class MissionType(@get:JsonValue val value: kotlin.String) {

        PUBLIC("PUBLIC"),
        SHARED("SHARED"),
        TOURNAMENT("TOURNAMENT"),
        POOLPLAY("POOLPLAY");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): MissionType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Mission'")
            }
        }
    }

    /**
    * 
    * Values: FIRST_AVAILABLE,ALL_AVAILABLE
    */
    enum class SequenceType(@get:JsonValue val value: kotlin.String) {

        FIRST_AVAILABLE("FIRST_AVAILABLE"),
        ALL_AVAILABLE("ALL_AVAILABLE");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): SequenceType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Mission'")
            }
        }
    }

    /**
    * 
    * Values: PUBLIC,LISTABLE,REWARDABLE,TRIGGERABLE,PRIVATE
    */
    enum class Visibility(@get:JsonValue val value: kotlin.String) {

        PUBLIC("PUBLIC"),
        LISTABLE("LISTABLE"),
        REWARDABLE("REWARDABLE"),
        TRIGGERABLE("TRIGGERABLE"),
        PRIVATE("PRIVATE");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Visibility {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Mission'")
            }
        }
    }

    /**
    * 
    * Values: AVAILABLE,PENDING,UPDATED,ACCEPTED,ACTIVE,BUY_BACK,FAILED,QUIT,COMPLETED,PENDING_REVIEW,REJECTED
    */
    enum class InviteStatus(@get:JsonValue val value: kotlin.String) {

        AVAILABLE("AVAILABLE"),
        PENDING("PENDING"),
        UPDATED("UPDATED"),
        ACCEPTED("ACCEPTED"),
        ACTIVE("ACTIVE"),
        BUY_BACK("BUY_BACK"),
        FAILED("FAILED"),
        QUIT("QUIT"),
        COMPLETED("COMPLETED"),
        PENDING_REVIEW("PENDING_REVIEW"),
        REJECTED("REJECTED");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): InviteStatus {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Mission'")
            }
        }
    }

    /**
    * 
    * Values: EVEN,ALL,FIRST,RANDOM
    */
    enum class SplitReward(@get:JsonValue val value: kotlin.String) {

        EVEN("EVEN"),
        ALL("ALL"),
        FIRST("FIRST"),
        RANDOM("RANDOM");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): SplitReward {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Mission'")
            }
        }
    }

}

