package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.OrsonAiBatchEmotionsResponse
import org.openapitools.model.OrsonAiBatchTopicsResponse
import org.openapitools.model.OrsonAiBatchTranscriptResponse
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
 * @param transcript 
 * @param topics 
 * @param emotions 
 */
data class OrsonAiBatchResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("requestId") val requestId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("responseCode") val responseCode: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("responseRaw") val responseRaw: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("transcript") val transcript: OrsonAiBatchTranscriptResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("topics") val topics: OrsonAiBatchTopicsResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("emotions") val emotions: OrsonAiBatchEmotionsResponse? = null
) {

}

