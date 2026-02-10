package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CategoryResponse
import org.openapitools.model.ListingResponse
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
 * @param category 
 * @param listings 
 */
data class ListingGroupResponse(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("category") val category: CategoryResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("listings") val listings: kotlin.collections.List<ListingResponse>? = null
) {

}

