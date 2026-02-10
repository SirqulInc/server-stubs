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
 * @param valid 
 * @param packageTypeName 
 * @param packageCount 
 * @param cubicFeet 
 */
data class OrderPackage(

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("PackageTypeName") val packageTypeName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("PackageCount") val packageCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("CubicFeet") val cubicFeet: kotlin.Double? = null
) {

}

