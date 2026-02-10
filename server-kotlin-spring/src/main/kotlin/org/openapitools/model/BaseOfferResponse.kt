package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AssetResponse
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
 * @param title 
 * @param details 
 * @param subTitle 
 * @param activated 
 * @param expiration 
 * @param redeemableStart 
 * @param redeemableEnd 
 * @param offerType 
 * @param offerVisibility 
 * @param favorite 
 * @param deleted 
 * @param fullPrice 
 * @param discountPrice 
 * @param image 
 * @param image1 
 * @param image2 
 * @param image3 
 * @param image4 
 * @param image5 
 * @param images 
 * @param barcode 
 * @param externalUrl 
 * @param active 
 * @param subDetails 
 * @param externalRedeemOptions 
 * @param publisher 
 * @param viewedCount 
 * @param clickedCount 
 * @param addedLimit 
 * @param addedCount 
 * @param usedCount 
 * @param removedCount 
 * @param ticketsReward 
 * @param ticketsRewardType 
 * @param specialOfferType 
 * @param likeCount 
 * @param dislikeCount 
 * @param favoriteCount 
 * @param noteCount 
 * @param billableEntityId 
 * @param responsibleAccountId 
 * @param availabilitySummary 
 * @param flagCount 
 * @param flagThreshold 
 * @param externalId 
 * @param parentOffer 
 */
data class BaseOfferResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("details") val details: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("subTitle") val subTitle: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("activated") val activated: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("expiration") val expiration: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("redeemableStart") val redeemableStart: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("redeemableEnd") val redeemableEnd: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("offerType") val offerType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("offerVisibility") val offerVisibility: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("favorite") val favorite: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("deleted") val deleted: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("fullPrice") val fullPrice: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("discountPrice") val discountPrice: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("image") val image: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("image1") val image1: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("image2") val image2: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("image3") val image3: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("image4") val image4: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("image5") val image5: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("images") val images: kotlin.collections.List<AssetResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("barcode") val barcode: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("externalUrl") val externalUrl: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("subDetails") val subDetails: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("externalRedeemOptions") val externalRedeemOptions: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("publisher") val publisher: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("viewedCount") val viewedCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("clickedCount") val clickedCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("addedLimit") val addedLimit: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("addedCount") val addedCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("usedCount") val usedCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("removedCount") val removedCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketsReward") val ticketsReward: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketsRewardType") val ticketsRewardType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("specialOfferType") val specialOfferType: BaseOfferResponse.SpecialOfferType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("likeCount") val likeCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("dislikeCount") val dislikeCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("favoriteCount") val favoriteCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("noteCount") val noteCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("billableEntityId") val billableEntityId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("responsibleAccountId") val responsibleAccountId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("availabilitySummary") val availabilitySummary: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("flagCount") val flagCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("flagThreshold") val flagThreshold: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("externalId") val externalId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("parentOffer") val parentOffer: BaseOfferResponse? = null
) {

    /**
    * 
    * Values: ALL,RESERVABLE,REGULAR_OFFER,ACT_NOW,GET_THERE_NOW,SQOOT,TICKETS,YIPIT
    */
    enum class SpecialOfferType(@get:JsonValue val value: kotlin.String) {

        ALL("ALL"),
        RESERVABLE("RESERVABLE"),
        REGULAR_OFFER("REGULAR_OFFER"),
        ACT_NOW("ACT_NOW"),
        GET_THERE_NOW("GET_THERE_NOW"),
        SQOOT("SQOOT"),
        TICKETS("TICKETS"),
        YIPIT("YIPIT");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): SpecialOfferType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'BaseOfferResponse'")
            }
        }
    }

}

