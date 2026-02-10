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
 * @param requestId 
 * @param responseCode 
 * @param responseRaw 
 * @param people 
 * @param wasCutoff 
 * @param frames 
 * @param framesWithoutAFace 
 * @param framesWithFaceOffscreen 
 * @param framesWithWrongNumberOfPeople 
 * @param height 
 * @param width 
 * @param fps 
 */
data class OrsonAiTechTuneResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("requestId") val requestId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("responseCode") val responseCode: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("responseRaw") val responseRaw: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("people") val people: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("wasCutoff") val wasCutoff: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("frames") val frames: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("framesWithoutAFace") val framesWithoutAFace: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("framesWithFaceOffscreen") val framesWithFaceOffscreen: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("framesWithWrongNumberOfPeople") val framesWithWrongNumberOfPeople: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("height") val height: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("width") val width: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("fps") val fps: kotlin.Int? = null
) {

}

