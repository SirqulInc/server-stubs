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
 * @param mediaType 
 * @param duration 
 * @param author 
 * @param releaseDate 
 */
data class MediaResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("mediaType") val mediaType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("duration") val duration: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("author") val author: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("releaseDate") val releaseDate: kotlin.Long? = null
) {

}

