package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AccountShortResponse
import org.openapitools.model.AssetShortResponse
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
 */
data class MissionShortResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("action") val action: MissionShortResponse.Action? = null,

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
    @get:JsonProperty("joinCode") val joinCode: kotlin.String? = null
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'MissionShortResponse'")
            }
        }
    }

}

