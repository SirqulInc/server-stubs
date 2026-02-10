package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AssetShortResponse
import org.openapitools.model.ScoreListResponse
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
 * @param word 
 * @param definition 
 * @param scores 
 * @param icon 
 * @param image 
 * @param authorOverride 
 * @param updatedDate 
 * @param startDate 
 * @param endDate 
 * @param createdDate 
 * @param active 
 * @param allocateTickets 
 * @param ticketType 
 * @param ticketCount 
 * @param points 
 */
data class WordzWordResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("word") val word: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("definition") val definition: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("scores") val scores: ScoreListResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("icon") val icon: AssetShortResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("image") val image: AssetShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("authorOverride") val authorOverride: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("updatedDate") val updatedDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startDate") val startDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endDate") val endDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("createdDate") val createdDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("allocateTickets") val allocateTickets: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketType") val ticketType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketCount") val ticketCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("points") val points: kotlin.Long? = null
) {

}

