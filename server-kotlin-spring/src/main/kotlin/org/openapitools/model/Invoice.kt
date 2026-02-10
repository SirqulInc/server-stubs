package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.LineItem
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
 * @param location 
 * @param tax 
 * @param total 
 * @param lineItems 
 */
data class Invoice(

    @Schema(example = "null", description = "")
    @get:JsonProperty("location") val location: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("tax") val tax: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("total") val total: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("lineItems") val lineItems: kotlin.collections.List<LineItem>? = null
) {

}

