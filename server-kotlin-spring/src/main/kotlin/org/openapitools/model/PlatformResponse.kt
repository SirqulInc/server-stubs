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
 * @param deviceId 
 * @param active 
 * @param name 
 * @param display 
 * @param minimum 
 * @param maximum 
 * @param downloadUrl 
 * @param description 
 */
data class PlatformResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("deviceId") val deviceId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("display") val display: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("minimum") val minimum: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("maximum") val maximum: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("downloadUrl") val downloadUrl: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null
) {

}

