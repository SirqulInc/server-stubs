package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AchievementProgressResponse
import org.openapitools.model.PurchaseItemListResponse
import org.openapitools.model.TicketCountResponse
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
 * @param points 
 * @param ticketsAvailable 
 * @param ticketsEarned 
 * @param ticketsPurchased 
 * @param ticketsUsed 
 * @param rank 
 * @param maxPoints 
 * @param maxTickets 
 * @param pointToTicketModifier 
 * @param scoringType 
 * @param purchaseItemListResponse 
 * @param termsAcceptedDate 
 * @param requiresTermsAcceptance 
 * @param completedAchievements 
 * @param wipAchievements 
 * @param appBlob 
 * @param enablePush 
 * @param enableSMS 
 * @param enableEmail 
 * @param ticketCounts 
 */
data class AppInfoResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("points") val points: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketsAvailable") val ticketsAvailable: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketsEarned") val ticketsEarned: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketsPurchased") val ticketsPurchased: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketsUsed") val ticketsUsed: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("rank") val rank: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("maxPoints") val maxPoints: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("maxTickets") val maxTickets: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("pointToTicketModifier") val pointToTicketModifier: kotlin.Float? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("scoringType") val scoringType: AppInfoResponse.ScoringType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("purchaseItemListResponse") val purchaseItemListResponse: PurchaseItemListResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("termsAcceptedDate") val termsAcceptedDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("requiresTermsAcceptance") val requiresTermsAcceptance: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("completedAchievements") val completedAchievements: kotlin.collections.List<AchievementProgressResponse>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("wipAchievements") val wipAchievements: kotlin.collections.List<AchievementProgressResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appBlob") val appBlob: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("enablePush") val enablePush: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("enableSMS") val enableSMS: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("enableEmail") val enableEmail: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketCounts") val ticketCounts: kotlin.collections.List<TicketCountResponse>? = null
) {

    /**
    * 
    * Values: GAME_LEVEL,GAME_OBJECT
    */
    enum class ScoringType(@get:JsonValue val value: kotlin.String) {

        GAME_LEVEL("GAME_LEVEL"),
        GAME_OBJECT("GAME_OBJECT");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ScoringType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AppInfoResponse'")
            }
        }
    }

}

