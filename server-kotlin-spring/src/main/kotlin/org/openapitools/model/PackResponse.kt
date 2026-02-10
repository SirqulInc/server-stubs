package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AccountShortResponse
import org.openapitools.model.ApplicationShortResponse
import org.openapitools.model.AssetShortResponse
import org.openapitools.model.GameLevelListResponse
import org.openapitools.model.NameStringValueResponse
import org.openapitools.model.ScoreListResponse
import org.openapitools.model.TicketListResponse
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
 * @param gameType 
 * @param packId 
 * @param name 
 * @param description 
 * @param active 
 * @param downloaded 
 * @param completed 
 * @param icon 
 * @param background 
 * @param ticketsEarned 
 * @param levels 
 * @param sequenceType 
 * @param scores 
 * @param owner 
 * @param costToRedeem 
 * @param price 
 * @param priceType 
 * @param userPermissionsList 
 * @param results 
 * @param tickets 
 * @param authorOverride 
 * @param updatedDate 
 * @param startDate 
 * @param endDate 
 * @param packType 
 * @param packOrder 
 * @param appKey 
 * @param application 
 * @param inGame 
 * @param highest 
 * @param allocateTickets 
 * @param ticketType 
 * @param ticketCount 
 * @param points 
 */
data class PackResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("action") val action: PackResponse.Action? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("highestAppVersion") val highestAppVersion: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("gameType") val gameType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("packId") val packId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("downloaded") val downloaded: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("completed") val completed: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("icon") val icon: AssetShortResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("background") val background: AssetShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketsEarned") val ticketsEarned: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("levels") val levels: GameLevelListResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("sequenceType") val sequenceType: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("scores") val scores: ScoreListResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("owner") val owner: AccountShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("costToRedeem") val costToRedeem: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("price") val price: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("priceType") val priceType: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("userPermissionsList") val userPermissionsList: UserPermissionsListResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("results") val results: kotlin.collections.List<NameStringValueResponse>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("tickets") val tickets: TicketListResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("authorOverride") val authorOverride: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("updatedDate") val updatedDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startDate") val startDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endDate") val endDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("packType") val packType: PackResponse.PackType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("packOrder") val packOrder: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appKey") val appKey: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("application") val application: ApplicationShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("inGame") val inGame: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("highest") val highest: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("allocateTickets") val allocateTickets: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketType") val ticketType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketCount") val ticketCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("points") val points: kotlin.Long? = null
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'PackResponse'")
            }
        }
    }

    /**
    * 
    * Values: TUTORIAL,BUILTIN,DOWNLOAD,THRESHOLD,THEME,TOURNAMENT
    */
    enum class PackType(@get:JsonValue val value: kotlin.String) {

        TUTORIAL("TUTORIAL"),
        BUILTIN("BUILTIN"),
        DOWNLOAD("DOWNLOAD"),
        THRESHOLD("THRESHOLD"),
        THEME("THEME"),
        TOURNAMENT("TOURNAMENT");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): PackType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'PackResponse'")
            }
        }
    }

}

