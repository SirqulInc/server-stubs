package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.OrsonAiVisualEmotionResponse
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
 * @param requestId 
 * @param responseCode 
 * @param responseRaw 
 * @param status 
 * @param error 
 * @param audioEmotions 
 * @param visualEmotions 
 */
data class OrsonAiEmotionsResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("requestId") val requestId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("responseCode") val responseCode: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("responseRaw") val responseRaw: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("error") val error: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("audioEmotions") val audioEmotions: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("visualEmotions") val visualEmotions: kotlin.collections.List<OrsonAiVisualEmotionResponse>? = null
) {

}

