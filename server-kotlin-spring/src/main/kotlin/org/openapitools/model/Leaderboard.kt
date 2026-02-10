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
 * @param id 
 * @param rankType 
 * @param rankMode One of GLOBAL, FRIENDS, LOCAL, SEARCH, CUSTOM
 * @param sortType 
 * @param limitation 
 * @param title 
 * @param description 
 * @param iconAsset 
 * @param bannerAsset 
 * @param application 
 * @param metaData 
 * @param active 
 */
data class Leaderboard(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("rankType") val rankType: kotlin.String? = null,

    @Schema(example = "null", description = "One of GLOBAL, FRIENDS, LOCAL, SEARCH, CUSTOM")
    @get:JsonProperty("rankMode") val rankMode: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("sortType") val sortType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("limitation") val limitation: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("iconAsset") val iconAsset: AssetResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("bannerAsset") val bannerAsset: AssetResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("application") val application: ApplicationMiniResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("metaData") val metaData: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null
) {

}

