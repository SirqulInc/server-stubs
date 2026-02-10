package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BiometricRequest
import org.openapitools.model.Invoice
import org.openapitools.model.OrderItemRequest
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
 * @param appKey 
 * @param clientPaymentId 
 * @param minAgeYears 
 * @param invoice 
 * @param biometrics 
 * @param orderItems 
 * @param acceptedBilling 
 */
data class PaymentRequest(

    @Schema(example = "null", description = "")
    @get:JsonProperty("appKey") val appKey: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("clientPaymentId") val clientPaymentId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("minAgeYears") val minAgeYears: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("invoice") val invoice: Invoice? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("biometrics") val biometrics: BiometricRequest? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("orderItems") val orderItems: kotlin.collections.List<OrderItemRequest>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("acceptedBilling") val acceptedBilling: kotlin.Boolean? = null
) {

}

