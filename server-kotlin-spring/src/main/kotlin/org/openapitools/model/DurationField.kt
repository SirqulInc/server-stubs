package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.DurationFieldType
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
 * @param name 
 * @param type 
 * @param supported 
 * @param precise 
 * @param unitMillis 
 */
data class DurationField(

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("type") val type: DurationFieldType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("supported") val supported: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("precise") val precise: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("unitMillis") val unitMillis: kotlin.Long? = null
) {

}

