package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param scoreId 
 * @param status 
 * @param points 
 * @param timeTaken 
 * @param ticketsEarned 
 * @param gameType 
 * @param accountId 
 * @param accountDisplay 
 */
data class ScoreResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("action") val action: ScoreResponse.Action? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("scoreId") val scoreId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: ScoreResponse.Status? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("points") val points: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("timeTaken") val timeTaken: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketsEarned") val ticketsEarned: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("gameType") val gameType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("accountId") val accountId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("accountDisplay") val accountDisplay: kotlin.String? = null
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ScoreResponse'")
            }
        }
    }

    /**
    * 
    * Values: COMPLETED,OWNER_CREDIT,SUMMATION,TOURNAMENT
    */
    enum class Status(@get:JsonValue val value: kotlin.String) {

        COMPLETED("COMPLETED"),
        OWNER_CREDIT("OWNER_CREDIT"),
        SUMMATION("SUMMATION"),
        TOURNAMENT("TOURNAMENT");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Status {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ScoreResponse'")
            }
        }
    }

}

