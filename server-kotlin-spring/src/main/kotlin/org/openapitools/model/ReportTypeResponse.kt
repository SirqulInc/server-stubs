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
 * @param type 
 * @param javaType 
 * @param label 
 * @param number 
 * @param majorAxis 
 */
data class ReportTypeResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("type") val type: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("javaType") val javaType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("label") val label: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("number") val number: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("majorAxis") val majorAxis: kotlin.Boolean? = null
) {

}

