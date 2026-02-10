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
 * @param achievementId 
 * @param achievementTierId 
 * @param title 
 * @param description 
 * @param icon 
 * @param completed 
 * @param progressCount 
 * @param goalCount 
 * @param dateUpdated 
 */
data class AchievementProgressResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("achievementId") val achievementId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("achievementTierId") val achievementTierId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("icon") val icon: AssetShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("completed") val completed: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("progressCount") val progressCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("goalCount") val goalCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("dateUpdated") val dateUpdated: kotlin.Long? = null
) {

}

