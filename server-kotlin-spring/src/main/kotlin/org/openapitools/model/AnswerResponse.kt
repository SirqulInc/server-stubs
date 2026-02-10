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
 * @param answerId 
 * @param answer 
 * @param correct 
 * @param image 
 * @param videoURL 
 */
data class AnswerResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("answerId") val answerId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("answer") val answer: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("correct") val correct: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("image") val image: AssetShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("videoURL") val videoURL: kotlin.String? = null
) {

}

