package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AssetShortResponse
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
 * @param name 
 * @param description 
 * @param tickets 
 * @param coverAsset 
 * @param promoAsset 
 * @param giftable 
 * @param assetable 
 * @param gameType 
 * @param price 
 * @param purchaseType 
 * @param purchaseCode 
 * @param purchaseLimit 
 * @param quantity 
 * @param serviceAction 
 * @param appName 
 */
data class PurchaseItemResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("tickets") val tickets: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("coverAsset") val coverAsset: AssetShortResponse? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("promoAsset") val promoAsset: AssetShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("giftable") val giftable: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("assetable") val assetable: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("gameType") val gameType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("price") val price: kotlin.Float? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("purchaseType") val purchaseType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("purchaseCode") val purchaseCode: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("purchaseLimit") val purchaseLimit: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("quantity") val quantity: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("serviceAction") val serviceAction: PurchaseItemResponse.ServiceAction? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("appName") val appName: kotlin.String? = null
) {

    /**
    * 
    * Values: DAY_PREMIUM,WEEK_PREMIUM,MONTH_PREMIUM,YEAR_PREMIUM,LIFETIME_PREMIUM,ADD_TICKET,ADD_GIFT,ADD_POINTS
    */
    enum class ServiceAction(@get:JsonValue val value: kotlin.String) {

        DAY_PREMIUM("DAY_PREMIUM"),
        WEEK_PREMIUM("WEEK_PREMIUM"),
        MONTH_PREMIUM("MONTH_PREMIUM"),
        YEAR_PREMIUM("YEAR_PREMIUM"),
        LIFETIME_PREMIUM("LIFETIME_PREMIUM"),
        ADD_TICKET("ADD_TICKET"),
        ADD_GIFT("ADD_GIFT"),
        ADD_POINTS("ADD_POINTS");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ServiceAction {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'PurchaseItemResponse'")
            }
        }
    }

}

