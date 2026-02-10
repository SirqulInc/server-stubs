package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Account
import org.openapitools.model.Asset
import org.openapitools.model.Assignment
import org.openapitools.model.Building
import org.openapitools.model.Category
import org.openapitools.model.Filter
import org.openapitools.model.Note
import org.openapitools.model.OfferLocation
import org.openapitools.model.Region
import org.openapitools.model.Retailer
import org.openapitools.model.RetailerProfile
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
 * @param latitude 
 * @param longitude 
 * @param locationDescription 
 * @param categories 
 * @param filters 
 * @param offerLocations 
 * @param logo 
 * @param picture1 
 * @param picture2 
 * @param qrCode 
 * @param name 
 * @param locationId 
 * @param code 
 * @param retailer 
 * @param assignments 
 * @param currentAssignment 
 * @param profile 
 * @param regions 
 * @param offerPrintKeyPrefix 
 * @param administrators 
 * @param sqootId 
 * @param yipitId 
 * @param locationToken 
 * @param building 
 * @param notes 
 * @param noteCount 
 * @param searchIndexUpdated 
 * @param inSearchIndex 
 * @param favoriteCount 
 * @param hasRatings 
 * @param googlePlaceId 
 * @param yelpId 
 * @param display 
 * @param appKey 
 * @param categoryTree 
 * @param filterTree 
 * @param addressDisplay 
 * @param mapQuery 
 * @param sortName 
 * @param fullDisplay 
 * @param hasOffers 
 * @param billableId 
 * @param subType 
 * @param contentName 
 * @param owner 
 * @param secondaryType 
 * @param locationAddress 
 * @param validOfferLocationIds 
 */
data class RetailerLocation(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("latitude") val latitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("longitude") val longitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locationDescription") val locationDescription: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("categories") val categories: kotlin.collections.List<Category>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("filters") val filters: kotlin.collections.List<Filter>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("offerLocations") val offerLocations: kotlin.collections.List<OfferLocation>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("logo") val logo: Asset? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("picture1") val picture1: Asset? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("picture2") val picture2: Asset? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("qrCode") val qrCode: Asset? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locationId") val locationId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("code") val code: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("retailer") val retailer: Retailer? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("assignments") val assignments: kotlin.collections.List<Assignment>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("currentAssignment") val currentAssignment: Assignment? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("profile") val profile: RetailerProfile? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("regions") val regions: kotlin.collections.List<Region>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("offerPrintKeyPrefix") val offerPrintKeyPrefix: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("administrators") val administrators: kotlin.collections.List<Account>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("sqootId") val sqootId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("yipitId") val yipitId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locationToken") val locationToken: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("building") val building: Building? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("notes") val notes: kotlin.collections.List<Note>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("noteCount") val noteCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("searchIndexUpdated") val searchIndexUpdated: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("inSearchIndex") val inSearchIndex: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("favoriteCount") val favoriteCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hasRatings") val hasRatings: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("googlePlaceId") val googlePlaceId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("yelpId") val yelpId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("display") val display: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appKey") val appKey: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("categoryTree") val categoryTree: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("filterTree") val filterTree: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("addressDisplay") val addressDisplay: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("mapQuery") val mapQuery: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("sortName") val sortName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("fullDisplay") val fullDisplay: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hasOffers") val hasOffers: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("billableId") val billableId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("subType") val subType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contentName") val contentName: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("owner") val owner: Account? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("secondaryType") val secondaryType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locationAddress") val locationAddress: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("validOfferLocationIds") val validOfferLocationIds: kotlin.collections.List<kotlin.Long>? = null
) {

}

