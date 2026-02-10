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
 * @param orderItemType 
 * @param orderItemId 
 * @param offerName 
 * @param orderCustomType 
 * @param orderCustomId 
 * @param retailerLocationId 
 * @param quantity 
 * @param amount 
 * @param tax 
 * @param reserveStartDate 
 * @param reserveEndDate 
 * @param message 
 */
data class OrderItemRequest(

    @Schema(example = "null", description = "")
    @get:JsonProperty("orderItemType") val orderItemType: OrderItemRequest.OrderItemType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("orderItemId") val orderItemId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("offerName") val offerName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("orderCustomType") val orderCustomType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("orderCustomId") val orderCustomId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("retailerLocationId") val retailerLocationId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("quantity") val quantity: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("amount") val amount: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("tax") val tax: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("reserveStartDate") val reserveStartDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("reserveEndDate") val reserveEndDate: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("message") val message: kotlin.String? = null
) {

    /**
    * 
    * Values: OFFER,CUSTOM
    */
    enum class OrderItemType(@get:JsonValue val value: kotlin.String) {

        OFFER("OFFER"),
        CUSTOM("CUSTOM");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): OrderItemType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OrderItemRequest'")
            }
        }
    }

}

