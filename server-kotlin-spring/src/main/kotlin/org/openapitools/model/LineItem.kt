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
 * @param description 
 * @param item 
 * @param pricePerItem 
 * @param total 
 * @param tax 
 * @param quantity 
 */
data class LineItem(

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("item") val item: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("pricePerItem") val pricePerItem: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("total") val total: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("tax") val tax: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("quantity") val quantity: kotlin.Int? = null
) {

}

