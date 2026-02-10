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
 * @param flagId 
 * @param flagableId 
 * @param flagableType 
 * @param flagDescription 
 * @param createdDate 
 * @param updatedDate 
 */
data class FlagResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("flagId") val flagId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("flagableId") val flagableId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("flagableType") val flagableType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("flagDescription") val flagDescription: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("createdDate") val createdDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("updatedDate") val updatedDate: kotlin.Long? = null
) {

}

