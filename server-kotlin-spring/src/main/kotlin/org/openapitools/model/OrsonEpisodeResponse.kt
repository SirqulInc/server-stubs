package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.OrsonRenderResponse
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
 * @param status 
 * @param statusDescription 
 * @param responseCode 
 * @param responseRaw 
 * @param renders 
 */
data class OrsonEpisodeResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("statusDescription") val statusDescription: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("responseCode") val responseCode: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("responseRaw") val responseRaw: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("renders") val renders: kotlin.collections.List<OrsonRenderResponse>? = null
) {

}

