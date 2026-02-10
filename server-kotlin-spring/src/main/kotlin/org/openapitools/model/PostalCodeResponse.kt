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
 * @param city 
 * @param stateCode 
 * @param code 
 * @param latitude 
 * @param longitude 
 * @param timezone 
 * @param utcOffset 
 */
data class PostalCodeResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("city") val city: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("stateCode") val stateCode: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("code") val code: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("latitude") val latitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("longitude") val longitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("timezone") val timezone: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("utcOffset") val utcOffset: kotlin.Int? = null
) {

}

