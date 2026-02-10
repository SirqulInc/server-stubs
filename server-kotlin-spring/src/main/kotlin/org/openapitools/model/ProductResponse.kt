package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.SizeGroupResponse
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
 * @param brand 
 * @param productType 
 * @param condition 
 * @param isbn 
 * @param asin 
 * @param catalogNumbers 
 * @param department 
 * @param features 
 * @param minimumPrice 
 * @param width 
 * @param height 
 * @param depth 
 * @param weight 
 * @param unit 
 * @param studio 
 * @param parentalRating 
 * @param publishDate 
 * @param availabilityDate 
 * @param propertySize 
 */
data class ProductResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("brand") val brand: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("productType") val productType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("condition") val condition: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("isbn") val isbn: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("asin") val asin: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("catalogNumbers") val catalogNumbers: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("department") val department: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("features") val features: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("minimumPrice") val minimumPrice: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("width") val width: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("height") val height: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("depth") val depth: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("weight") val weight: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("unit") val unit: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("studio") val studio: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("parentalRating") val parentalRating: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("publishDate") val publishDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("availabilityDate") val availabilityDate: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("size") val propertySize: SizeGroupResponse? = null
) {

}

