package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Application
import org.openapitools.model.Asset
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
 * @param name 
 * @param shortName 
 * @param description 
 * @param type 
 * @param application 
 * @param parent 
 * @param children 
 * @param childrenCount 
 * @param display 
 * @param sqootSlug 
 * @param asset 
 * @param externalId 
 * @param externalType 
 * @param favoriteCount 
 * @param root 
 * @param tree 
 * @param parentName 
 * @param parentId 
 * @param applicationId 
 * @param secondaryType 
 */
data class Category(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("shortName") val shortName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("type") val type: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("application") val application: Application? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("parent") val parent: Category? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("children") val children: kotlin.collections.List<Category>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("childrenCount") val childrenCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("display") val display: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("sqootSlug") val sqootSlug: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("asset") val asset: Asset? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("externalId") val externalId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("externalType") val externalType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("favoriteCount") val favoriteCount: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("root") val root: Category? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("tree") val tree: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("parentName") val parentName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("parentId") val parentId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("applicationId") val applicationId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("secondaryType") val secondaryType: kotlin.String? = null
) {

}

