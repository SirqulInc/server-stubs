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
 * @param locations 
 * @param transactions 
 * @param offers 
 */
data class RetailerCountResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("locations") val locations: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("transactions") val transactions: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("offers") val offers: kotlin.Int? = null
) {

}

