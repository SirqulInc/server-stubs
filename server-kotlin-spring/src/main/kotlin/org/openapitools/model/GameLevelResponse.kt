package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AccountShortResponse
import org.openapitools.model.AssetShortResponse
import org.openapitools.model.GameObjectListResponse
import org.openapitools.model.NameStringValueResponse
import org.openapitools.model.NoteResponse
import org.openapitools.model.OfferShortResponse
import org.openapitools.model.ScoreListResponse
import org.openapitools.model.TicketListResponse
import org.openapitools.model.TutorialResponse
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
 * @param gameLevelId 
 * @param gameType 
 * @param active 
 * @param name 
 * @param description 
 * @param difficulty 
 * @param appVersion 
 * @param likesCount 
 * @param dislikesCount 
 * @param commentsCount 
 * @param downloadCount 
 * @param comments 
 * @param locked 
 * @param completed 
 * @param ticketsEarned 
 * @param gameObjects 
 * @param hasLiked 
 * @param image 
 * @param gameData 
 * @param gameDataSuffix 
 * @param scores 
 * @param owner 
 * @param userPermissionsList 
 * @param results 
 * @param randomizeGameObjects 
 * @param tickets 
 * @param assignMission 
 * @param icon 
 * @param authorOverride 
 * @param updatedDate 
 * @param startDate 
 * @param endDate 
 * @param splashTitle 
 * @param splashMessage 
 * @param hasFlagged 
 * @param allocateTickets 
 * @param ticketType 
 * @param ticketCount 
 * @param points 
 * @param winnerMessage 
 * @param tutorial 
 * @param appKey 
 * @param appName 
 * @param scoringType 
 * @param tutorialTitle 
 * @param tutorialMessage 
 * @param tutorialAlignment 
 * @param tutorialImage 
 * @param nextLevelId 
 * @param offer 
 */
data class GameLevelResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("action") val action: GameLevelResponse.Action? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("gameLevelId") val gameLevelId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("gameType") val gameType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("difficulty") val difficulty: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appVersion") val appVersion: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("likesCount") val likesCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("dislikesCount") val dislikesCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("commentsCount") val commentsCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("downloadCount") val downloadCount: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("comments") val comments: kotlin.collections.List<NoteResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locked") val locked: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("completed") val completed: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketsEarned") val ticketsEarned: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("gameObjects") val gameObjects: GameObjectListResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hasLiked") val hasLiked: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("image") val image: AssetShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("gameData") val gameData: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("gameDataSuffix") val gameDataSuffix: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("scores") val scores: ScoreListResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("owner") val owner: AccountShortResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("userPermissionsList") val userPermissionsList: UserPermissionsListResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("results") val results: kotlin.collections.List<NameStringValueResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("randomizeGameObjects") val randomizeGameObjects: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("tickets") val tickets: TicketListResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("assignMission") val assignMission: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("icon") val icon: AssetShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("authorOverride") val authorOverride: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("updatedDate") val updatedDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startDate") val startDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endDate") val endDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("splashTitle") val splashTitle: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("splashMessage") val splashMessage: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hasFlagged") val hasFlagged: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("allocateTickets") val allocateTickets: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketType") val ticketType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketCount") val ticketCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("points") val points: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("winnerMessage") val winnerMessage: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("tutorial") val tutorial: TutorialResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appKey") val appKey: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appName") val appName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("scoringType") val scoringType: GameLevelResponse.ScoringType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("tutorialTitle") val tutorialTitle: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("tutorialMessage") val tutorialMessage: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("tutorialAlignment") val tutorialAlignment: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("tutorialImage") val tutorialImage: AssetShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("nextLevelId") val nextLevelId: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("offer") val offer: OfferShortResponse? = null
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'GameLevelResponse'")
            }
        }
    }

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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'GameLevelResponse'")
            }
        }
    }

}

