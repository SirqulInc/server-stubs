package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param price 
 * @param quantity 
 * @param threshold 
 * @param visible 
 * @param optionType 
 * @param offerType 
 */
data class SubscriptionOption(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("valid") val valid: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("price") val price: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("quantity") val quantity: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("threshold") val threshold: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("visible") val visible: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("optionType") val optionType: SubscriptionOption.OptionType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("offerType") val offerType: SubscriptionOption.OfferType? = null
) {

    /**
    * 
    * Values: MISSION,LOCATION,OFFER,NOTIFICATION,REQUEST,STORAGE_S3,STORAGE_DB
    */
    enum class OptionType(@get:JsonValue val value: kotlin.String) {

        MISSION("MISSION"),
        LOCATION("LOCATION"),
        OFFER("OFFER"),
        NOTIFICATION("NOTIFICATION"),
        REQUEST("REQUEST"),
        STORAGE_S3("STORAGE_S3"),
        STORAGE_DB("STORAGE_DB");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): OptionType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'SubscriptionOption'")
            }
        }
    }

    /**
    * 
    * Values: VOUCHER,COUPON,PRODUCT,MEDIA,EVENT,DEVICE
    */
    enum class OfferType(@get:JsonValue val value: kotlin.String) {

        VOUCHER("VOUCHER"),
        COUPON("COUPON"),
        PRODUCT("PRODUCT"),
        MEDIA("MEDIA"),
        EVENT("EVENT"),
        DEVICE("DEVICE");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): OfferType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'SubscriptionOption'")
            }
        }
    }

}

