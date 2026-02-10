package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.DirectionResponse
import org.openapitools.model.NodeRequest
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
 * @param start 
 * @param end 
 * @param waypoints 
 * @param exclusions 
 * @param width 
 * @param height 
 * @param southwest 
 * @param northeast 
 * @param metersPerX 
 * @param metersPerY 
 * @param path 
 * @param pathCount 
 * @param directions 
 * @param directionCount 
 * @param swcalibration 
 * @param calibrationBearings 
 * @param necalibration 
 */
data class PathingResponse(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("start") val start: NodeRequest? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("end") val end: NodeRequest? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("waypoints") val waypoints: kotlin.collections.List<NodeRequest>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("exclusions") val exclusions: kotlin.collections.List<NodeRequest>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("width") val width: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("height") val height: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("southwest") val southwest: NodeRequest? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("northeast") val northeast: NodeRequest? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("metersPerX") val metersPerX: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("metersPerY") val metersPerY: kotlin.Double? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("path") val path: kotlin.collections.List<NodeRequest>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("pathCount") val pathCount: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("directions") val directions: kotlin.collections.List<DirectionResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("directionCount") val directionCount: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("swcalibration") val swcalibration: NodeRequest? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("calibrationBearings") val calibrationBearings: kotlin.Double? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("necalibration") val necalibration: NodeRequest? = null
) {

}

