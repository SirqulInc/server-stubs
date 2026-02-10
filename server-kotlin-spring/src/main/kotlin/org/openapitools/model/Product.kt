package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.SizeGroup
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
data class Product(

    @Schema(example = "null", description = "")
    @get:JsonProperty("brand") val brand: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("productType") val productType: Product.ProductType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("condition") val condition: Product.Condition? = null,

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
    @get:JsonProperty("unit") val unit: Product.Unit? = null,

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
    @get:JsonProperty("size") val propertySize: SizeGroup? = null
) {

    /**
    * 
    * Values: APPAREL,APPLIANCES,APPS,ARTS_CRAFTS,AUTOMOTIVE,BABY,BEAUTY,BOOKS,CLASSICAL,COLLECTIBLES,DVD,ELECTRONICS,GIFT_CARDS,GOURMET_FOOD,GROCERY,HEALTH_PERSONAL_CARE,HOME_GARDEN,INDUSTRIAL,JEWELRY,KITCHEN,LAWN_GARDEN,MAGAZINES,MISCELLANEOUS,MUSICAL_INSTRUMENTS,OFFICE_PRODUCTS,OTHER,OUTDOOR_LIVING,PC_HARDWARE,PET_SUPPLIES,SHOES,SOFTWARE,SPORTING_GOODS,TOOLS,TOYS,VIDEO_GAMES,WATCHES,WIRELESS,WIRELESS_ACCESSORIES
    */
    enum class ProductType(@get:JsonValue val value: kotlin.String) {

        APPAREL("APPAREL"),
        APPLIANCES("APPLIANCES"),
        APPS("APPS"),
        ARTS_CRAFTS("ARTS_CRAFTS"),
        AUTOMOTIVE("AUTOMOTIVE"),
        BABY("BABY"),
        BEAUTY("BEAUTY"),
        BOOKS("BOOKS"),
        CLASSICAL("CLASSICAL"),
        COLLECTIBLES("COLLECTIBLES"),
        DVD("DVD"),
        ELECTRONICS("ELECTRONICS"),
        GIFT_CARDS("GIFT_CARDS"),
        GOURMET_FOOD("GOURMET_FOOD"),
        GROCERY("GROCERY"),
        HEALTH_PERSONAL_CARE("HEALTH_PERSONAL_CARE"),
        HOME_GARDEN("HOME_GARDEN"),
        INDUSTRIAL("INDUSTRIAL"),
        JEWELRY("JEWELRY"),
        KITCHEN("KITCHEN"),
        LAWN_GARDEN("LAWN_GARDEN"),
        MAGAZINES("MAGAZINES"),
        MISCELLANEOUS("MISCELLANEOUS"),
        MUSICAL_INSTRUMENTS("MUSICAL_INSTRUMENTS"),
        OFFICE_PRODUCTS("OFFICE_PRODUCTS"),
        OTHER("OTHER"),
        OUTDOOR_LIVING("OUTDOOR_LIVING"),
        PC_HARDWARE("PC_HARDWARE"),
        PET_SUPPLIES("PET_SUPPLIES"),
        SHOES("SHOES"),
        SOFTWARE("SOFTWARE"),
        SPORTING_GOODS("SPORTING_GOODS"),
        TOOLS("TOOLS"),
        TOYS("TOYS"),
        VIDEO_GAMES("VIDEO_GAMES"),
        WATCHES("WATCHES"),
        WIRELESS("WIRELESS"),
        WIRELESS_ACCESSORIES("WIRELESS_ACCESSORIES");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ProductType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Product'")
            }
        }
    }

    /**
    * 
    * Values: NEW,USED,REFURBISHED,OTHER
    */
    enum class Condition(@get:JsonValue val value: kotlin.String) {

        NEW("NEW"),
        USED("USED"),
        REFURBISHED("REFURBISHED"),
        OTHER("OTHER");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Condition {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Product'")
            }
        }
    }

    /**
    * 
    * Values: MILIMETER,CENTIMETER,METER,INCH,FOOT,YARD
    */
    enum class Unit(@get:JsonValue val value: kotlin.String) {

        MILIMETER("MILIMETER"),
        CENTIMETER("CENTIMETER"),
        METER("METER"),
        INCH("INCH"),
        FOOT("FOOT"),
        YARD("YARD");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Unit {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Product'")
            }
        }
    }

}

