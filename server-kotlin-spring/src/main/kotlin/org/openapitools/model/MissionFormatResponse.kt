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
 * @param missionFormatId 
 * @param formatType 
 * @param active 
 * @param name 
 * @param description 
 * @param format 
 * @param suffix 
 */
data class MissionFormatResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("missionFormatId") val missionFormatId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("formatType") val formatType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("format") val format: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("suffix") val suffix: kotlin.String? = null
) {

}

