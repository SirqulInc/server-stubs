package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param propertySize 
 * @param loadingTime 
 * @param separatePayloads 
 * @param pickup 
 * @param dropoff 
 */
data class LoadShortResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("size") val propertySize: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("loadingTime") val loadingTime: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("separatePayloads") val separatePayloads: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("pickup") val pickup: StopResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("dropoff") val dropoff: StopResponse? = null
) {

}

