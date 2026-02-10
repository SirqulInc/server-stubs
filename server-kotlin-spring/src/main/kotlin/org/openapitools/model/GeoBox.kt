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
 * @param north 
 * @param east 
 * @param south 
 * @param west 
 */
data class GeoBox(

    @Schema(example = "null", description = "")
    @get:JsonProperty("north") val north: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("east") val east: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("south") val south: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("west") val west: kotlin.Double? = null
) {

}

