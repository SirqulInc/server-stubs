package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Retailer
import org.openapitools.model.ServiceHub
import org.openapitools.model.VehicleCargoSetting
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
 * @param active 
 * @param valid 
 * @param business 
 * @param hub 
 * @param name 
 * @param width 
 * @param height 
 * @param depth 
 * @param volume 
 * @param maxWeight 
 * @param vehicleCargoSettings 
 */
data class VehicleType(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("business") val business: Retailer? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("hub") val hub: ServiceHub? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("width") val width: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("height") val height: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("depth") val depth: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("volume") val volume: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("maxWeight") val maxWeight: kotlin.Double? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("vehicleCargoSettings") val vehicleCargoSettings: kotlin.collections.List<VehicleCargoSetting>? = null
) {

}

