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
 * @param id 
 * @param name 
 * @param price 
 * @param quantity 
 * @param threshold 
 * @param visible 
 * @param optionType 
 */
data class SubscriptionOptionResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("price") val price: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("quantity") val quantity: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("threshold") val threshold: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("visible") val visible: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("optionType") val optionType: kotlin.String? = null
) {

}

