package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RankResponse
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
 * @param items 
 * @param userRank 
 * @param hasMoreResults 
 * @param count 
 * @param rankType 
 * @param app 
 * @param sortField 
 * @param leaderboardMode 
 * @param start 
 * @param limit 
 */
data class RankListResponse(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("items") val items: kotlin.collections.List<RankResponse>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("userRank") val userRank: RankResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hasMoreResults") val hasMoreResults: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("count") val count: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("rankType") val rankType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("app") val app: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("sortField") val sortField: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("leaderboardMode") val leaderboardMode: RankListResponse.LeaderboardMode? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("start") val start: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("limit") val limit: kotlin.Long? = null
) {

    /**
    * 
    * Values: GLOBAL,FRIENDS,LOCAL,SEARCH,CUSTOM
    */
    enum class LeaderboardMode(@get:JsonValue val value: kotlin.String) {

        GLOBAL("GLOBAL"),
        FRIENDS("FRIENDS"),
        LOCAL("LOCAL"),
        SEARCH("SEARCH"),
        CUSTOM("CUSTOM");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): LeaderboardMode {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RankListResponse'")
            }
        }
    }

}

