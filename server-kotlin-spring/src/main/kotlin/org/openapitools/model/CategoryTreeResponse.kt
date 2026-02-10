package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AssetShortResponse
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
 * @param categoryId 
 * @param name 
 * @param display 
 * @param subCategoryCount 
 * @param parentId 
 * @param parentName 
 * @param description 
 * @param active 
 * @param asset 
 * @param favoriteId 
 * @param favorite 
 * @param applicationId 
 * @param type 
 * @param externalId 
 * @param externalType 
 * @param children 
 */
data class CategoryTreeResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("categoryId") val categoryId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("display") val display: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("subCategoryCount") val subCategoryCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("parentId") val parentId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("parentName") val parentName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("asset") val asset: AssetShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("favoriteId") val favoriteId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("favorite") val favorite: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("applicationId") val applicationId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("type") val type: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("externalId") val externalId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("externalType") val externalType: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("children") val children: kotlin.collections.List<CategoryTreeResponse>? = null
) {

}

