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
 * @param x 
 * @param y 
 * @param z 
 */
data class Node(

    @Schema(example = "null", description = "")
    @get:JsonProperty("x") val x: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("y") val y: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("z") val z: kotlin.Int? = null
) {

}

