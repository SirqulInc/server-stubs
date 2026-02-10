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
 * @param width 
 * @param height 
 * @param depth 
 * @param volume 
 */
data class Dimensions(

    @Schema(example = "null", description = "")
    @get:JsonProperty("width") val width: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("height") val height: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("depth") val depth: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("volume") val volume: kotlin.Double? = null
) {

}

