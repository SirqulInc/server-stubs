package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AccountShortResponse
import org.openapitools.model.AssetResponse
import org.openapitools.model.AudienceResponse
import org.openapitools.model.CategoryResponse
import org.openapitools.model.EventResponse
import org.openapitools.model.FilterResponse
import org.openapitools.model.MediaResponse
import org.openapitools.model.MissionListResponse
import org.openapitools.model.NameStringValueResponse
import org.openapitools.model.OfferShortResponse
import org.openapitools.model.ProductResponse
import org.openapitools.model.RetailerLocationResponse
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
 * @param valid 
 * @param message 
 * @param version 
 * @param serializeNulls 
 * @param startTimeLog 
 * @param errorCode 
 * @param request 
 * @param offerLocationId 
 * @param offerId 
 * @param retailerId 
 * @param transactionId 
 * @param favoriteId 
 * @param offerName 
 * @param subTitle 
 * @param locationName 
 * @param starts 
 * @param expires 
 * @param activated 
 * @param expiration 
 * @param redeemableStart 
 * @param redeemableEnd 
 * @param distance 
 * @param offerType 
 * @param longitude 
 * @param latitude 
 * @param favorite 
 * @param fullPrice 
 * @param discountPrice 
 * @param estimatedValue 
 * @param voucherDiscountPrice 
 * @param missionListResponse 
 * @param image 
 * @param image1 
 * @param image2 
 * @param image3 
 * @param image4 
 * @param image5 
 * @param images 
 * @param barcode 
 * @param externalUrl 
 * @param sqootUrl 
 * @param active 
 * @param location 
 * @param subDetails 
 * @param externalRedeemAuth 
 * @param externalRedeemOptions 
 * @param publisher 
 * @param product 
 * @param event 
 * @param media 
 * @param viewedCount 
 * @param clickedCount 
 * @param addedLimit 
 * @param addedCount 
 * @param usedCount 
 * @param removedCount 
 * @param locationAddedCount 
 * @param barcodeEntry 
 * @param barcodeType 
 * @param ticketsReward 
 * @param ticketsRewardType 
 * @param specialOfferType 
 * @param likeCount 
 * @param dislikeCount 
 * @param favoriteCount 
 * @param noteCount 
 * @param logId 
 * @param billableEntityId 
 * @param responsibleAccountId 
 * @param availabilitySummary 
 * @param externalId 
 * @param parentOffer 
 * @param address 
 * @param details 
 * @param finePrint 
 * @param retailerPhoneNumber 
 * @param ticketPriceType 
 * @param ticketPrice 
 * @param discountPercentage 
 * @param paymentFees 
 * @param voucherPrice 
 * @param purchasesRemaining 
 * @param redemptionsRemaining 
 * @param redemptionStatus 
 * @param redemptionCode 
 * @param audiences 
 * @param audienceCount 
 * @param walletCount 
 * @param qrCodeUrl 
 * @param showRemaining 
 * @param showRedeemed 
 * @param purchaseLimit 
 * @param purchaseLimitPerUser 
 * @param redemptionLimit 
 * @param userRedemptionLimit 
 * @param categories 
 * @param filters 
 * @param customer 
 * @param purchasedDate 
 * @param usedDate 
 * @param transactionCreated 
 * @param transactionUpdated 
 * @param returning 
 */
data class OfferTransactionResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("message") val message: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("version") val version: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("serializeNulls") val serializeNulls: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("startTimeLog") val startTimeLog: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("errorCode") val errorCode: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("request") val request: kotlin.collections.List<NameStringValueResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("offerLocationId") val offerLocationId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("offerId") val offerId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("retailerId") val retailerId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("transactionId") val transactionId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("favoriteId") val favoriteId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("offerName") val offerName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("subTitle") val subTitle: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("locationName") val locationName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("starts") val starts: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("expires") val expires: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("activated") val activated: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("expiration") val expiration: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("redeemableStart") val redeemableStart: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("redeemableEnd") val redeemableEnd: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("distance") val distance: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("offerType") val offerType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("longitude") val longitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("latitude") val latitude: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("favorite") val favorite: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("fullPrice") val fullPrice: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("discountPrice") val discountPrice: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("estimatedValue") val estimatedValue: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("voucherDiscountPrice") val voucherDiscountPrice: kotlin.Double? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("missionListResponse") val missionListResponse: MissionListResponse? = null,

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
    @get:JsonProperty("sqootUrl") val sqootUrl: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("location") val location: RetailerLocationResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("subDetails") val subDetails: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("externalRedeemAuth") val externalRedeemAuth: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("externalRedeemOptions") val externalRedeemOptions: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("publisher") val publisher: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("product") val product: ProductResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("event") val event: EventResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("media") val media: MediaResponse? = null,

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
    @get:JsonProperty("locationAddedCount") val locationAddedCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("barcodeEntry") val barcodeEntry: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("barcodeType") val barcodeType: OfferTransactionResponse.BarcodeType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketsReward") val ticketsReward: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketsRewardType") val ticketsRewardType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("specialOfferType") val specialOfferType: OfferTransactionResponse.SpecialOfferType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("likeCount") val likeCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("dislikeCount") val dislikeCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("favoriteCount") val favoriteCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("noteCount") val noteCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("logId") val logId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("billableEntityId") val billableEntityId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("responsibleAccountId") val responsibleAccountId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("availabilitySummary") val availabilitySummary: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("externalId") val externalId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("parentOffer") val parentOffer: OfferShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("address") val address: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("details") val details: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("finePrint") val finePrint: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("retailerPhoneNumber") val retailerPhoneNumber: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketPriceType") val ticketPriceType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketPrice") val ticketPrice: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("discountPercentage") val discountPercentage: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("paymentFees") val paymentFees: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("voucherPrice") val voucherPrice: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("purchasesRemaining") val purchasesRemaining: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("redemptionsRemaining") val redemptionsRemaining: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("redemptionStatus") val redemptionStatus: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("redemptionCode") val redemptionCode: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("audiences") val audiences: kotlin.collections.List<AudienceResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("audienceCount") val audienceCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("walletCount") val walletCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("qrCodeUrl") val qrCodeUrl: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("showRemaining") val showRemaining: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("showRedeemed") val showRedeemed: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("purchaseLimit") val purchaseLimit: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("purchaseLimitPerUser") val purchaseLimitPerUser: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("redemptionLimit") val redemptionLimit: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("userRedemptionLimit") val userRedemptionLimit: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("categories") val categories: kotlin.collections.List<CategoryResponse>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("filters") val filters: kotlin.collections.List<FilterResponse>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("customer") val customer: AccountShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("purchasedDate") val purchasedDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("usedDate") val usedDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("transactionCreated") val transactionCreated: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("transactionUpdated") val transactionUpdated: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("returning") val returning: kotlin.String? = null
) {

    /**
    * 
    * Values: NONE,UPC,CODE_128,QR,CUSTOM_MEDIA
    */
    enum class BarcodeType(@get:JsonValue val value: kotlin.String) {

        NONE("NONE"),
        UPC("UPC"),
        CODE_128("CODE_128"),
        QR("QR"),
        CUSTOM_MEDIA("CUSTOM_MEDIA");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): BarcodeType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OfferTransactionResponse'")
            }
        }
    }

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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OfferTransactionResponse'")
            }
        }
    }

}

