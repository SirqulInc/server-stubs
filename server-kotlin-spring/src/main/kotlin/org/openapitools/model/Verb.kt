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
 * @param tag 
 * @param body 
 * @param attributes 
 * @param children 
 */
data class Verb(

    @Schema(example = "null", description = "")
    @get:JsonProperty("tag") val tag: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("body") val body: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("attributes") val attributes: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("children") val children: kotlin.collections.List<Verb>? = null
) {

}

