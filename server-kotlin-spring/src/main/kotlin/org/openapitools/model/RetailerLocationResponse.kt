package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AssetShortResponse
import org.openapitools.model.BillableEntityResponse
import org.openapitools.model.CategoryResponse
import org.openapitools.model.ContactInfoResponse
import org.openapitools.model.FilterResponse
import org.openapitools.model.ListResponse
import org.openapitools.model.ProfileShortResponse
import org.openapitools.model.RetailerCountResponse
import org.openapitools.model.RetailerShortResponse
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
 * @param retailerLocationId 
 * @param name 
 * @param contact 
 * @param latitude 
 * @param longitude 
 * @param active 
 * @param favoriteId 
 * @param favorite 
 * @param responsible 
 * @param manager 
 * @param categories 
 * @param filters 
 * @param logo 
 * @param picture1 
 * @param picture2 
 * @param billableEntity 
 * @param counts 
 * @param retailer 
 * @param offers 
 * @param internalId 
 * @param detailsHeader 
 * @param detailsBody 
 * @param hours 
 * @param locationToken 
 * @param building 
 * @param qrCodeUrl 
 * @param distance 
 * @param googlePlaceId 
 * @param yelpId 
 */
data class RetailerLocationResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("retailerLocationId") val retailerLocationId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("contact") val contact: ContactInfoResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("latitude") val latitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("longitude") val longitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("favoriteId") val favoriteId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("favorite") val favorite: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("responsible") val responsible: ProfileShortResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("manager") val manager: ProfileShortResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("categories") val categories: kotlin.collections.List<CategoryResponse>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("filters") val filters: kotlin.collections.List<FilterResponse>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("logo") val logo: AssetShortResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("picture1") val picture1: AssetShortResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("picture2") val picture2: AssetShortResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("billableEntity") val billableEntity: BillableEntityResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("counts") val counts: RetailerCountResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("retailer") val retailer: RetailerShortResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("offers") val offers: ListResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("internalId") val internalId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("detailsHeader") val detailsHeader: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("detailsBody") val detailsBody: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hours") val hours: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locationToken") val locationToken: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("building") val building: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("qrCodeUrl") val qrCodeUrl: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("distance") val distance: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("googlePlaceId") val googlePlaceId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("yelpId") val yelpId: kotlin.String? = null
) {

}

