package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param word 
 * @param score 
 */
data class OrsonAiTopicResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("word") val word: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("score") val score: kotlin.Double? = null
) {

}

