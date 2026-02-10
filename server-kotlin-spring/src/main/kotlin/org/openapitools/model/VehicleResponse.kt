package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.GeoResponse
import org.openapitools.model.StopResponse
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
 * @param id 
 * @param name 
 * @param capacity 
 * @param depot 
 * @param startWindow 
 * @param endWindow 
 * @param current 
 * @param depotAsStop 
 */
data class VehicleResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("capacity") val capacity: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("depot") val depot: GeoResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startWindow") val startWindow: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("endWindow") val endWindow: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("current") val current: GeoResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("depotAsStop") val depotAsStop: StopResponse? = null
) {

}

