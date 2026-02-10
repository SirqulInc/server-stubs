package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AccountShortResponse
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
 * @param owner 
 * @param rank 
 * @param scoreValue 
 * @param timeValue 
 * @param countValue 
 * @param updated 
 */
data class RankResponse(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("owner") val owner: AccountShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("rank") val rank: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("scoreValue") val scoreValue: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("timeValue") val timeValue: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("countValue") val countValue: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("updated") val updated: kotlin.Long? = null
) {

}

