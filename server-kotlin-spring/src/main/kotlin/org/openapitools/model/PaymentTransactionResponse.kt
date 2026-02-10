package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AccountShortResponse
import org.openapitools.model.NameStringValueResponse
import org.openapitools.model.OfferTransactionResponse
import org.openapitools.model.PurchaseOrderItemResponse
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
 * @param paymentTransactionId 
 * @param customer 
 * @param promoCode 
 * @param remoteRefId 
 * @param currencyType 
 * @param amount 
 * @param tax 
 * @param offerTransactions 
 * @param orderItems 
 * @param externalPaymentId 
 * @param metadata 
 * @param created 
 * @param updated 
 * @param returning 
 */
data class PaymentTransactionResponse(

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
    @get:JsonProperty("paymentTransactionId") val paymentTransactionId: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("customer") val customer: AccountShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("promoCode") val promoCode: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("remoteRefId") val remoteRefId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("currencyType") val currencyType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("amount") val amount: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("tax") val tax: kotlin.Double? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("offerTransactions") val offerTransactions: kotlin.collections.List<OfferTransactionResponse>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("orderItems") val orderItems: kotlin.collections.List<PurchaseOrderItemResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("externalPaymentId") val externalPaymentId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("metadata") val metadata: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("created") val created: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("updated") val updated: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("returning") val returning: kotlin.String? = null
) {

}

