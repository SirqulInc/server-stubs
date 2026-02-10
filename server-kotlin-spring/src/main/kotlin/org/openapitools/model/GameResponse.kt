package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AccountShortResponse
import org.openapitools.model.AssetShortResponse
import org.openapitools.model.NameStringValueResponse
import org.openapitools.model.PackListResponse
import org.openapitools.model.RuleListResponse
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
 * @param gameId 
 * @param gameType 
 * @param packs 
 * @param scores 
 * @param owner 
 * @param userPermissionsList 
 * @param rules 
 * @param results 
 * @param ticketsEarned 
 * @param title 
 * @param description 
 * @param authorOverride 
 * @param icon 
 * @param image 
 * @param sequenceType 
 * @param updatedDate 
 * @param startDate 
 * @param endDate 
 * @param appKey 
 */
data class GameResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("action") val action: GameResponse.Action? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("highestAppVersion") val highestAppVersion: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("gameId") val gameId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("gameType") val gameType: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("packs") val packs: PackListResponse? = null,

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
    @get:JsonProperty("rules") val rules: RuleListResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("results") val results: kotlin.collections.List<NameStringValueResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketsEarned") val ticketsEarned: kotlin.Long? = null,

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
    @get:JsonProperty("appKey") val appKey: kotlin.String? = null
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'GameResponse'")
            }
        }
    }

}

