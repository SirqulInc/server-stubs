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
 * @param streetAddress 
 * @param streetAddress2 
 * @param city 
 * @param stateCode 
 * @param state 
 * @param postalCode 
 * @param countryCode 
 * @param country 
 * @param display 
 */
data class Address(

    @Schema(example = "null", description = "")
    @get:JsonProperty("streetAddress") val streetAddress: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("streetAddress2") val streetAddress2: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("city") val city: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("stateCode") val stateCode: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("state") val state: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("postalCode") val postalCode: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("countryCode") val countryCode: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("country") val country: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("display") val display: kotlin.String? = null
) {

}

