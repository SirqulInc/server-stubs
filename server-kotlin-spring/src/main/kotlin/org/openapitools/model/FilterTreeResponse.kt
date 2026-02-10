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
 * @param filterId 
 * @param name 
 * @param display 
 * @param subFilterCount 
 * @param parentId 
 * @param description 
 * @param active 
 * @param externalId 
 * @param externalType 
 * @param children 
 */
data class FilterTreeResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("filterId") val filterId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("display") val display: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("subFilterCount") val subFilterCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("parentId") val parentId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("externalId") val externalId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("externalType") val externalType: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("children") val children: kotlin.collections.List<FilterTreeResponse>? = null
) {

}

