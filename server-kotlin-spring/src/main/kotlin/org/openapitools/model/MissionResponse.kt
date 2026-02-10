package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AccountShortResponse
import org.openapitools.model.AssetShortResponse
import org.openapitools.model.AudienceResponse
import org.openapitools.model.CreativeResponse
import org.openapitools.model.GameListResponse
import org.openapitools.model.MissionInviteResponse
import org.openapitools.model.NameStringValueResponse
import org.openapitools.model.RewardResponse
import org.openapitools.model.ScoreListResponse
import org.openapitools.model.UserPermissionsListResponse
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
 * @param action 
 * @param highestAppVersion 
 * @param missionId 
 * @param ticketsEarned 
 * @param costToPlay 
 * @param costToPlayType 
 * @param owner 
 * @param title 
 * @param description 
 * @param authorOverride 
 * @param icon 
 * @param image 
 * @param sequenceType 
 * @param updatedDate 
 * @param startDate 
 * @param endDate 
 * @param missionType 
 * @param active 
 * @param balance 
 * @param availableLimit 
 * @param inviteCount 
 * @param acceptedCount 
 * @param childCount 
 * @param enableBuyBack 
 * @param minimumToPlay 
 * @param rewarded 
 * @param refunded 
 * @param joinCode 
 * @param rewards 
 * @param games 
 * @param scores 
 * @param userPermissionsList 
 * @param results 
 * @param inviteStatus 
 * @param audiences 
 * @param missionInviteId 
 * @param missionInvite 
 * @param invitee 
 * @param formatType 
 * @param creatives 
 * @param fixedReward 
 * @param allocateTickets 
 * @param ticketType 
 * @param ticketCount 
 * @param points 
 * @param splitReward 
 * @param secondsBetweenLevels 
 * @param secondsBetweenPacks 
 * @param advancedReporting 
 */
data class MissionResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("action") val action: MissionResponse.Action? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("highestAppVersion") val highestAppVersion: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("missionId") val missionId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketsEarned") val ticketsEarned: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("costToPlay") val costToPlay: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("costToPlayType") val costToPlayType: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("owner") val owner: AccountShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("authorOverride") val authorOverride: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("icon") val icon: AssetShortResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("image") val image: AssetShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("sequenceType") val sequenceType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("updatedDate") val updatedDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startDate") val startDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endDate") val endDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("missionType") val missionType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("balance") val balance: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("availableLimit") val availableLimit: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("inviteCount") val inviteCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("acceptedCount") val acceptedCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("childCount") val childCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("enableBuyBack") val enableBuyBack: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("minimumToPlay") val minimumToPlay: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("rewarded") val rewarded: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("refunded") val refunded: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("joinCode") val joinCode: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("rewards") val rewards: kotlin.collections.List<RewardResponse>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("games") val games: GameListResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("scores") val scores: ScoreListResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("userPermissionsList") val userPermissionsList: UserPermissionsListResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("results") val results: kotlin.collections.List<NameStringValueResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("inviteStatus") val inviteStatus: MissionResponse.InviteStatus? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("audiences") val audiences: kotlin.collections.List<AudienceResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("missionInviteId") val missionInviteId: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("missionInvite") val missionInvite: MissionInviteResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("invitee") val invitee: AccountShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("formatType") val formatType: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("creatives") val creatives: kotlin.collections.List<CreativeResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("fixedReward") val fixedReward: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("allocateTickets") val allocateTickets: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketType") val ticketType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketCount") val ticketCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("points") val points: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("splitReward") val splitReward: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("secondsBetweenLevels") val secondsBetweenLevels: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("secondsBetweenPacks") val secondsBetweenPacks: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("advancedReporting") val advancedReporting: kotlin.Boolean? = null
) {

    /**
    * 
    * Values: DATA,SAVE,DELETE,GET
    */
    enum class Action(@get:JsonValue val value: kotlin.String) {

        DATA("DATA"),
        SAVE("SAVE"),
        DELETE("DELETE"),
        GET("GET");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Action {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'MissionResponse'")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'MissionResponse'")
            }
        }
    }

}

