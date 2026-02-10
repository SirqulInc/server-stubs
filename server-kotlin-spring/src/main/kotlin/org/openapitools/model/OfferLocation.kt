package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.Account
import org.openapitools.model.Asset
import org.openapitools.model.Audience
import org.openapitools.model.Note
import org.openapitools.model.Offer
import org.openapitools.model.RetailerLocation
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
 * @param offer 
 * @param location 
 * @param distance 
 * @param altitude 
 * @param customValue 
 * @param locationDetail 
 * @param audiences 
 * @param qrInviteCode 
 * @param notes 
 * @param noteCount 
 * @param searchIndexUpdated 
 * @param inSearchIndex 
 * @param favoriteCount 
 * @param addedCount 
 * @param display 
 * @param appKey 
 * @param devicePower 
 * @param powerLoss 
 * @param udid 
 * @param billableId 
 * @param subType 
 * @param contentName 
 * @param contentAsset 
 * @param owner 
 * @param secondaryType 
 * @param categoryIds 
 * @param filterIds 
 */
data class OfferLocation(

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
    @get:JsonProperty("offer") val offer: Offer? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("location") val location: RetailerLocation? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("distance") val distance: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("altitude") val altitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("customValue") val customValue: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locationDetail") val locationDetail: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("audiences") val audiences: kotlin.collections.List<Audience>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("qrInviteCode") val qrInviteCode: Asset? = null,

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
    @get:JsonProperty("addedCount") val addedCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("display") val display: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appKey") val appKey: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("devicePower") val devicePower: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("powerLoss") val powerLoss: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("udid") val udid: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("billableId") val billableId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("subType") val subType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contentName") val contentName: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("contentAsset") val contentAsset: Asset? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("owner") val owner: Account? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("secondaryType") val secondaryType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("categoryIds") val categoryIds: kotlin.collections.List<kotlin.Long>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("filterIds") val filterIds: kotlin.collections.List<kotlin.Long>? = null
) {

}

