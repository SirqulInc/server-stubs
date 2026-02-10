package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.StopResponse
import org.openapitools.model.VehicleResponse
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
 * @param itineraryId 
 * @param waypointCount 
 * @param score 
 * @param errorCode 
 * @param error 
 * @param itemCount 
 * @param vehicle 
 * @param stops 
 * @param estimatedStartTime 
 * @param estimatedEndTime 
 * @param estimatedDuration 
 * @param estimatedDistance 
 * @param waitTime 
 * @param generated 
 * @param valid 
 */
data class ItineraryResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("itineraryId") val itineraryId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("waypointCount") val waypointCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("score") val score: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("errorCode") val errorCode: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("error") val error: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("itemCount") val itemCount: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("vehicle") val vehicle: VehicleResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("stops") val stops: kotlin.collections.List<StopResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("estimatedStartTime") val estimatedStartTime: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("estimatedEndTime") val estimatedEndTime: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("estimatedDuration") val estimatedDuration: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("estimatedDistance") val estimatedDistance: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("waitTime") val waitTime: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("generated") val generated: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null
) {

}

