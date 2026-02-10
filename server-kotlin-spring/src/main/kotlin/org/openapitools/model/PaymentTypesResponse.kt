package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AccountShortResponse
import org.openapitools.model.NameStringValueResponse
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
 * @param creditCardOnFile 
 * @param creditCardNumber 
 * @param creditCardExpirationMonth 
 * @param creditCardExpirationYear 
 * @param pointsOnFile 
 * @param pointsAmount 
 * @param account 
 * @param firstName 
 * @param lastName 
 * @param address 
 * @param city 
 * @param state 
 * @param postalCode 
 * @param phone 
 * @param provider 
 * @param paymentMethodId 
 * @param validated 
 * @param accountNumber 
 * @param bankName 
 * @param routingNumber 
 * @param isDefaultPaymentMethod 
 * @param accountName 
 * @param paymentMethodNickname 
 * @param taxId 
 * @param returning 
 */
data class PaymentTypesResponse(

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
    @get:JsonProperty("creditCardOnFile") val creditCardOnFile: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("creditCardNumber") val creditCardNumber: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("creditCardExpirationMonth") val creditCardExpirationMonth: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("creditCardExpirationYear") val creditCardExpirationYear: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("pointsOnFile") val pointsOnFile: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("pointsAmount") val pointsAmount: kotlin.Double? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("account") val account: AccountShortResponse? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("firstName") val firstName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("lastName") val lastName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("address") val address: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("city") val city: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("state") val state: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("postalCode") val postalCode: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("phone") val phone: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("provider") val provider: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("paymentMethodId") val paymentMethodId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("validated") val validated: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("accountNumber") val accountNumber: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("bankName") val bankName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("routingNumber") val routingNumber: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("isDefaultPaymentMethod") val isDefaultPaymentMethod: kotlin.Boolean? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("accountName") val accountName: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("paymentMethodNickname") val paymentMethodNickname: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("taxId") val taxId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("returning") val returning: kotlin.String? = null
) {

}

