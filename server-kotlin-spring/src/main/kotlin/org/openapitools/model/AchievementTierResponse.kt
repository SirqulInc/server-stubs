package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param achievementTierId 
 * @param title 
 * @param description 
 * @param goalCount 
 * @param icon 
 * @param missionId 
 * @param gameId 
 * @param packId 
 * @param gameLevelId 
 * @param gameObjectId 
 */
data class AchievementTierResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("achievementTierId") val achievementTierId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("goalCount") val goalCount: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("icon") val icon: AssetShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("missionId") val missionId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("gameId") val gameId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("packId") val packId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("gameLevelId") val gameLevelId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("gameObjectId") val gameObjectId: kotlin.Long? = null
) {

}

