package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Node
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
 * @param latitude 
 * @param longitude 
 * @param altitude 
 * @param date 
 * @param isWaypoint 
 * @param accountId 
 * @param node 
 */
data class NodeRequest(

    @Schema(example = "null", description = "")
    @get:JsonProperty("x") val x: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("y") val y: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("z") val z: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("latitude") val latitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("longitude") val longitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("altitude") val altitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("date") val date: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("isWaypoint") val isWaypoint: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("accountId") val accountId: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("node") val node: Node? = null
) {

}

