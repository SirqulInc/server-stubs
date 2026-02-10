package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.NameStringValueResponse
import org.openapitools.model.ScoreListResponse
import org.openapitools.model.TicketListResponse
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
 * @param gameObjectId 
 * @param gameType 
 * @param ticketsEarned 
 * @param scores 
 * @param tickets 
 * @param items 
 * @param allocateTickets 
 */
data class GameObjectResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("action") val action: GameObjectResponse.Action? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("gameObjectId") val gameObjectId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("gameType") val gameType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketsEarned") val ticketsEarned: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("scores") val scores: ScoreListResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("tickets") val tickets: TicketListResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("items") val items: kotlin.collections.List<NameStringValueResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("allocateTickets") val allocateTickets: kotlin.Boolean? = null
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'GameObjectResponse'")
            }
        }
    }

}

