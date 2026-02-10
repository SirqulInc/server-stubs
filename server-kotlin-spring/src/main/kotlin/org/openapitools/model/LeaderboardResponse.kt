package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ApplicationMiniResponse
import org.openapitools.model.AssetResponse
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
 * @param leaderboardId 
 * @param rankType 
 * @param rankMode 
 * @param sortType 
 * @param limitation 
 * @param title 
 * @param description 
 * @param metaData 
 * @param iconAsset 
 * @param bannerAsset 
 * @param active 
 * @param application 
 */
data class LeaderboardResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("leaderboardId") val leaderboardId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("rankType") val rankType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("rankMode") val rankMode: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("sortType") val sortType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("limitation") val limitation: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("metaData") val metaData: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("iconAsset") val iconAsset: AssetResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("bannerAsset") val bannerAsset: AssetResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("application") val application: ApplicationMiniResponse? = null
) {

}

