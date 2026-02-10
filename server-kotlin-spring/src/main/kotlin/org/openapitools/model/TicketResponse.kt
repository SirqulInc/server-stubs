package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AccountShortResponse
import org.openapitools.model.ApplicationShortResponse
import org.openapitools.model.AssetShortResponse
import org.openapitools.model.PurchaseItemShortResponse
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
 * @param id 
 * @param accountId 
 * @param objectId 
 * @param type 
 * @param actionType 
 * @param used 
 * @param count 
 * @param purchaseItem 
 * @param customMessage 
 * @param sender 
 * @param &#x60;receiver&#x60; 
 * @param customAsset 
 * @param receiptToken 
 * @param ticketType 
 * @param application 
 */
data class TicketResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("action") val action: TicketResponse.Action? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("accountId") val accountId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("objectId") val objectId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("type") val type: TicketResponse.Type? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("actionType") val actionType: TicketResponse.ActionType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("used") val used: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("count") val count: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("purchaseItem") val purchaseItem: PurchaseItemShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("customMessage") val customMessage: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("sender") val sender: AccountShortResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("receiver") val `receiver`: kotlin.collections.List<AccountShortResponse>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("customAsset") val customAsset: AssetShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("receiptToken") val receiptToken: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketType") val ticketType: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("application") val application: ApplicationShortResponse? = null
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'TicketResponse'")
            }
        }
    }

    /**
    * 
    * Values: GAME_OBJECT,GAME_LEVEL,PACK,GAME,MISSION,PROFILE,APPLICATION,TICKETS,ASSET,CUSTOM
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        GAME_OBJECT("GAME_OBJECT"),
        GAME_LEVEL("GAME_LEVEL"),
        PACK("PACK"),
        GAME("GAME"),
        MISSION("MISSION"),
        PROFILE("PROFILE"),
        APPLICATION("APPLICATION"),
        TICKETS("TICKETS"),
        ASSET("ASSET"),
        CUSTOM("CUSTOM");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'TicketResponse'")
            }
        }
    }

    /**
    * 
    * Values: COMPLETED,REDEEMED,USERS_PLAYED,TOURNAMENT_OWNER,PURCHASED,SUMATION,GIFTED,REFUNDED
    */
    enum class ActionType(@get:JsonValue val value: kotlin.String) {

        COMPLETED("COMPLETED"),
        REDEEMED("REDEEMED"),
        USERS_PLAYED("USERS_PLAYED"),
        TOURNAMENT_OWNER("TOURNAMENT_OWNER"),
        PURCHASED("PURCHASED"),
        SUMATION("SUMATION"),
        GIFTED("GIFTED"),
        REFUNDED("REFUNDED");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ActionType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'TicketResponse'")
            }
        }
    }

}

