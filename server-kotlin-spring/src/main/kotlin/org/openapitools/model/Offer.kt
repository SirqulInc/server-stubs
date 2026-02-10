package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Account
import org.openapitools.model.Asset
import org.openapitools.model.BillableEntity
import org.openapitools.model.Category
import org.openapitools.model.Device
import org.openapitools.model.Event
import org.openapitools.model.Filter
import org.openapitools.model.Flag
import org.openapitools.model.FlagThreshold
import org.openapitools.model.Media
import org.openapitools.model.Mission
import org.openapitools.model.Note
import org.openapitools.model.OfferLocation
import org.openapitools.model.Product
import org.openapitools.model.YayOrNay
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
 * @param testField 
 * @param billableEntity 
 * @param offerLocations 
 * @param missions 
 * @param activated 
 * @param expires 
 * @param redeemableStart 
 * @param redeemableEnd 
 * @param title 
 * @param subTitle 
 * @param type 
 * @param specialOfferType 
 * @param details 
 * @param subDetails 
 * @param finePrint 
 * @param getThereNowNotification 
 * @param maxPrints 
 * @param viewLimit 
 * @param featured 
 * @param replaced 
 * @param showRemaining 
 * @param showRedeemed 
 * @param parentOffer 
 * @param artwork 
 * @param offerImage1 
 * @param offerImage2 
 * @param offerImage3 
 * @param offerImage4 
 * @param offerImage5 
 * @param barCode 
 * @param barCodeType 
 * @param barCodeEntry 
 * @param categories 
 * @param filters 
 * @param ticketType 
 * @param allocateTickets 
 * @param ticketPriceType 
 * @param ticketPrice 
 * @param fullPrice 
 * @param discountPrice 
 * @param availableLimit 
 * @param availableLimitPerUser 
 * @param addedLimit 
 * @param usedCount 
 * @param addedCount 
 * @param removedCount 
 * @param viewedCount 
 * @param clickedCount 
 * @param offerVisibility 
 * @param offerProcessorId 
 * @param externalId 
 * @param externalUrl 
 * @param externalUntrackedUrl 
 * @param sqootId 
 * @param sqootUrl 
 * @param sqootCategorySlug 
 * @param sqootCategoryName 
 * @param yipitId 
 * @param redeemAuthOptions 
 * @param publisher 
 * @param product 
 * @param media 
 * @param event 
 * @param device 
 * @param notes 
 * @param noteCount 
 * @param favoriteCount 
 * @param hasRatings 
 * @param likes 
 * @param likeCount 
 * @param dislikeCount 
 * @param availabilitySummary 
 * @param flags 
 * @param flagCount 
 * @param flagThreshold 
 * @param savings 
 * @param clickStream 
 * @param ticketCount 
 * @param display 
 * @param appKey 
 * @param categoryTree 
 * @param filterTree 
 * @param indexable 
 * @param billableId 
 * @param subType 
 * @param contentName 
 * @param defaultThreshold 
 * @param contentAsset 
 * @param owner 
 * @param secondaryType 
 * @param discountPercentage 
 */
data class Offer(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("testField") val testField: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("billableEntity") val billableEntity: BillableEntity? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("offerLocations") val offerLocations: kotlin.collections.List<OfferLocation>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("missions") val missions: kotlin.collections.List<Mission>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("activated") val activated: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("expires") val expires: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("redeemableStart") val redeemableStart: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("redeemableEnd") val redeemableEnd: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("subTitle") val subTitle: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("type") val type: Offer.Type? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("specialOfferType") val specialOfferType: Offer.SpecialOfferType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("details") val details: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("subDetails") val subDetails: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("finePrint") val finePrint: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("getThereNowNotification") val getThereNowNotification: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("maxPrints") val maxPrints: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("viewLimit") val viewLimit: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("featured") val featured: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("replaced") val replaced: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("showRemaining") val showRemaining: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("showRedeemed") val showRedeemed: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("parentOffer") val parentOffer: Offer? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("artwork") val artwork: Asset? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("offerImage1") val offerImage1: Asset? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("offerImage2") val offerImage2: Asset? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("offerImage3") val offerImage3: Asset? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("offerImage4") val offerImage4: Asset? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("offerImage5") val offerImage5: Asset? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("barCode") val barCode: Asset? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("barCodeType") val barCodeType: Offer.BarCodeType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("barCodeEntry") val barCodeEntry: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("categories") val categories: kotlin.collections.List<Category>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("filters") val filters: kotlin.collections.List<Filter>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketType") val ticketType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("allocateTickets") val allocateTickets: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketPriceType") val ticketPriceType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketPrice") val ticketPrice: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("fullPrice") val fullPrice: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("discountPrice") val discountPrice: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("availableLimit") val availableLimit: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("availableLimitPerUser") val availableLimitPerUser: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("addedLimit") val addedLimit: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("usedCount") val usedCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("addedCount") val addedCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("removedCount") val removedCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("viewedCount") val viewedCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("clickedCount") val clickedCount: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("offerVisibility") val offerVisibility: Offer.OfferVisibility? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("offerProcessorId") val offerProcessorId: Offer.OfferProcessorId? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("externalId") val externalId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("externalUrl") val externalUrl: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("externalUntrackedUrl") val externalUntrackedUrl: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("sqootId") val sqootId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("sqootUrl") val sqootUrl: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("sqootCategorySlug") val sqootCategorySlug: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("sqootCategoryName") val sqootCategoryName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("yipitId") val yipitId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("redeemAuthOptions") val redeemAuthOptions: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("publisher") val publisher: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("product") val product: Product? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("media") val media: Media? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("event") val event: Event? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("device") val device: Device? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("notes") val notes: kotlin.collections.List<Note>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("noteCount") val noteCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("favoriteCount") val favoriteCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hasRatings") val hasRatings: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("likes") val likes: kotlin.collections.List<YayOrNay>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("likeCount") val likeCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("dislikeCount") val dislikeCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("availabilitySummary") val availabilitySummary: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("flags") val flags: kotlin.collections.List<Flag>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("flagCount") val flagCount: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("flagThreshold") val flagThreshold: FlagThreshold? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("savings") val savings: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("clickStream") val clickStream: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ticketCount") val ticketCount: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("display") val display: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appKey") val appKey: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("categoryTree") val categoryTree: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("filterTree") val filterTree: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("indexable") val indexable: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("billableId") val billableId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("subType") val subType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("contentName") val contentName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("defaultThreshold") val defaultThreshold: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("contentAsset") val contentAsset: Asset? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("owner") val owner: Account? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("secondaryType") val secondaryType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("discountPercentage") val discountPercentage: kotlin.Double? = null
) {

    /**
    * 
    * Values: VOUCHER,COUPON,PRODUCT,MEDIA,EVENT,DEVICE
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        VOUCHER("VOUCHER"),
        COUPON("COUPON"),
        PRODUCT("PRODUCT"),
        MEDIA("MEDIA"),
        EVENT("EVENT"),
        DEVICE("DEVICE");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Offer'")
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
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Offer'")
            }
        }
    }

    /**
    * 
    * Values: NONE,UPC,CODE_128,QR,CUSTOM_MEDIA
    */
    enum class BarCodeType(@get:JsonValue val value: kotlin.String) {

        NONE("NONE"),
        UPC("UPC"),
        CODE_128("CODE_128"),
        QR("QR"),
        CUSTOM_MEDIA("CUSTOM_MEDIA");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): BarCodeType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Offer'")
            }
        }
    }

    /**
    * 
    * Values: PUBLIC,LISTABLE,REWARDABLE,TRIGGERABLE,PRIVATE
    */
    enum class OfferVisibility(@get:JsonValue val value: kotlin.String) {

        PUBLIC("PUBLIC"),
        LISTABLE("LISTABLE"),
        REWARDABLE("REWARDABLE"),
        TRIGGERABLE("TRIGGERABLE"),
        PRIVATE("PRIVATE");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): OfferVisibility {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Offer'")
            }
        }
    }

    /**
    * 
    * Values: SQOOT,YIPIT,API,CSV
    */
    enum class OfferProcessorId(@get:JsonValue val value: kotlin.String) {

        SQOOT("SQOOT"),
        YIPIT("YIPIT"),
        API("API"),
        CSV("CSV");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): OfferProcessorId {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Offer'")
            }
        }
    }

}

