package org.openapitools.api

import org.openapitools.model.PaymentTypesResponse
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:/api/3.18}")
class BillingApiController() {

    @Operation(
        summary = "Update Payment Method",
        operationId = "addPaymentMethod",
        description = """Update a method of payment. If the paymentMethodId is not passed in then will update their default payment method.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = PaymentTypesResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/billing/update"
        value = [PATH_ADD_PAYMENT_METHOD],
        produces = ["*/*"]
    )
    fun addPaymentMethod(
        @NotNull @Parameter(description = "The account used to perform the the request", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "Payment Method Id") @Valid @RequestParam(value = "paymentMethodId", required = false) paymentMethodId: kotlin.Long?,
        @Parameter(description = "the name of the account") @Valid @RequestParam(value = "accountName", required = false) accountName: kotlin.String?,
        @Parameter(description = "First Name that the account is filed as") @Valid @RequestParam(value = "firstName", required = false) firstName: kotlin.String?,
        @Parameter(description = "Last Name that the account is filed as") @Valid @RequestParam(value = "lastName", required = false) lastName: kotlin.String?,
        @Parameter(description = "Address that the account is filed as") @Valid @RequestParam(value = "address", required = false) address: kotlin.String?,
        @Parameter(description = "City that the account is filed as") @Valid @RequestParam(value = "city", required = false) city: kotlin.String?,
        @Parameter(description = "State that the account is filed as") @Valid @RequestParam(value = "state", required = false) state: kotlin.String?,
        @Parameter(description = "Postal Code that the account is filed as") @Valid @RequestParam(value = "postalCode", required = false) postalCode: kotlin.String?,
        @Parameter(description = "Country that the account is filed as") @Valid @RequestParam(value = "country", required = false) country: kotlin.String?,
        @Parameter(description = "Phone that the account is filed as") @Valid @RequestParam(value = "phone", required = false) phone: kotlin.String?,
        @Parameter(description = "The full credit card number to store on file") @Valid @RequestParam(value = "creditCardNumber", required = false) creditCardNumber: kotlin.String?,
        @Parameter(description = "The credit card expiration date YYYY-MM") @Valid @RequestParam(value = "expirationDate", required = false) expirationDate: kotlin.String?,
        @Parameter(description = "The 3 digit confirmation code") @Valid @RequestParam(value = "ccv", required = false) ccv: kotlin.String?,
        @Parameter(description = "The bank account number") @Valid @RequestParam(value = "accountNumber", required = false) accountNumber: kotlin.String?,
        @Parameter(description = "The bank name") @Valid @RequestParam(value = "bankName", required = false) bankName: kotlin.String?,
        @Parameter(description = "Routing Number") @Valid @RequestParam(value = "routingNumber", required = false) routingNumber: kotlin.String?,
        @Parameter(description = "Default Payment Method") @Valid @RequestParam(value = "defaultPaymentMethod", required = false) defaultPaymentMethod: kotlin.Boolean?,
        @Parameter(description = "Payment Method Nickname") @Valid @RequestParam(value = "paymentMethodNickname", required = false) paymentMethodNickname: kotlin.String?,
        @Parameter(description = "Tax Id") @Valid @RequestParam(value = "taxId", required = false) taxId: kotlin.String?,
        @Parameter(description = "Provider customer profile Id") @Valid @RequestParam(value = "providerCustomerProfileId", required = false) providerCustomerProfileId: kotlin.String?,
        @Parameter(description = "Provider customer payment profile Id") @Valid @RequestParam(value = "providerPaymentProfileId", required = false) providerPaymentProfileId: kotlin.String?,
        @Parameter(description = "Meta Data") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?
    ): ResponseEntity<PaymentTypesResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Payment Method",
        operationId = "createPaymentMethod",
        description = """Add a new method of payment.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = PaymentTypesResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/billing/create"
        value = [PATH_CREATE_PAYMENT_METHOD],
        produces = ["*/*"]
    )
    fun createPaymentMethod(
        @NotNull @Parameter(description = "The account used to perform the the request", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "Account Name of the credit card user") @Valid @RequestParam(value = "accountName", required = false) accountName: kotlin.String?,
        @Parameter(description = "The first name on the credit card") @Valid @RequestParam(value = "firstName", required = false) firstName: kotlin.String?,
        @Parameter(description = "The last name on the credit card") @Valid @RequestParam(value = "lastName", required = false) lastName: kotlin.String?,
        @Parameter(description = "The billing address of the credit card") @Valid @RequestParam(value = "address", required = false) address: kotlin.String?,
        @Parameter(description = "The billing city of the credit card") @Valid @RequestParam(value = "city", required = false) city: kotlin.String?,
        @Parameter(description = "The billing state of the credit card") @Valid @RequestParam(value = "state", required = false) state: kotlin.String?,
        @Parameter(description = "The billing zip code of the credit card") @Valid @RequestParam(value = "postalCode", required = false) postalCode: kotlin.String?,
        @Parameter(description = "Country of the credit card") @Valid @RequestParam(value = "country", required = false) country: kotlin.String?,
        @Parameter(description = "The billing phone of the credit card") @Valid @RequestParam(value = "phone", required = false) phone: kotlin.String?,
        @Parameter(description = "The full credit card number to store on file") @Valid @RequestParam(value = "creditCardNumber", required = false) creditCardNumber: kotlin.String?,
        @Parameter(description = "The credit card expiration date YYYY-MM") @Valid @RequestParam(value = "expirationDate", required = false) expirationDate: kotlin.String?,
        @Parameter(description = "The 3 digit confirmation code") @Valid @RequestParam(value = "ccv", required = false) ccv: kotlin.String?,
        @Parameter(description = "The bank account number") @Valid @RequestParam(value = "accountNumber", required = false) accountNumber: kotlin.String?,
        @Parameter(description = "The bank name") @Valid @RequestParam(value = "bankName", required = false) bankName: kotlin.String?,
        @Parameter(description = "The bank routing number") @Valid @RequestParam(value = "routingNumber", required = false) routingNumber: kotlin.String?,
        @Parameter(description = "The nickname to give the payment method") @Valid @RequestParam(value = "paymentMethodNickname", required = false) paymentMethodNickname: kotlin.String?,
        @Parameter(description = "Tax Id") @Valid @RequestParam(value = "taxId", required = false) taxId: kotlin.String?,
        @Parameter(description = "Whether this should be the default payment method", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "defaultPaymentMethod", required = false, defaultValue = "true") defaultPaymentMethod: kotlin.Boolean,
        @Parameter(description = "An authorization token for providers that provide this (like Amazon Payments)") @Valid @RequestParam(value = "authToken", required = false) authToken: kotlin.String?,
        @Parameter(description = "The payment provider (see PaymentMethodProvider)", schema = Schema(defaultValue = "AUTHORIZE_NET")) @Valid @RequestParam(value = "provider", required = false, defaultValue = "AUTHORIZE_NET") provider: kotlin.String,
        @Parameter(description = "Provider customer profile Id") @Valid @RequestParam(value = "providerCustomerProfileId", required = false) providerCustomerProfileId: kotlin.String?,
        @Parameter(description = "Provider customer payment profile Id") @Valid @RequestParam(value = "providerPaymentProfileId", required = false) providerPaymentProfileId: kotlin.String?,
        @Parameter(description = "Meta Data") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?,
        @Parameter(description = "Application Key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?
    ): ResponseEntity<PaymentTypesResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Smart Contract",
        operationId = "createSmartContract",
        description = """Adds a smart contract.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = PaymentTypesResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/billing/crypto/transfer"
        value = [PATH_CREATE_SMART_CONTRACT],
        produces = ["*/*"]
    )
    fun createSmartContract(
        @NotNull @Parameter(description = "The account used to perform the the request", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The token name", required = true) @Valid @RequestParam(value = "tokenName", required = true) tokenName: kotlin.String,
        @NotNull @Parameter(description = "The token symbol", required = true) @Valid @RequestParam(value = "tokenSymbol", required = true) tokenSymbol: kotlin.String,
        @Parameter(description = "The payment method to return details on. If this is not set, then the user's default payment method will be returned.") @Valid @RequestParam(value = "paymentMethodId", required = false) paymentMethodId: kotlin.Long?
    ): ResponseEntity<PaymentTypesResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Crypto Balances",
        operationId = "getCryptoBalance",
        description = """Get the cypto balance details for a user""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = PaymentTypesResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/billing/crypto/get"
        value = [PATH_GET_CRYPTO_BALANCE],
        produces = ["*/*"]
    )
    fun getCryptoBalance(
        @NotNull @Parameter(description = "The account used to perform the the request", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "The account to retreive balances for") @Valid @RequestParam(value = "ownerAccountId", required = false) ownerAccountId: kotlin.Long?,
        @Parameter(description = "The payment method to return details on. If this is not set, then the user's default payment method will be returned.") @Valid @RequestParam(value = "paymentMethodId", required = false) paymentMethodId: kotlin.Long?
    ): ResponseEntity<PaymentTypesResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Payment Method",
        operationId = "getPaymentMethod",
        description = """Get the details of the user's payment method or their current default method of payment""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = PaymentTypesResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/billing/get"
        value = [PATH_GET_PAYMENT_METHOD],
        produces = ["*/*"]
    )
    fun getPaymentMethod(
        @NotNull @Parameter(description = "The account used to perform the the request", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "The payment method to return details on. If this is not set, then the user's default payment method will be returned.") @Valid @RequestParam(value = "paymentMethodId", required = false) paymentMethodId: kotlin.Long?,
        @Parameter(description = "Determines whether to get the user's current balance for the requested payment method option (not all payment method options support this)") @Valid @RequestParam(value = "getCurrentBalance", required = false) getCurrentBalance: kotlin.Boolean?
    ): ResponseEntity<PaymentTypesResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Payment Methods",
        operationId = "searchPaymentMethod",
        description = """Search the payment methods of an account""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = PaymentTypesResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/billing/search"
        value = [PATH_SEARCH_PAYMENT_METHOD],
        produces = ["*/*"]
    )
    fun searchPaymentMethod(
        @NotNull @Parameter(description = "Account Id to search on", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @Parameter(description = "Provider to search on", schema = Schema(defaultValue = "AUTHORIZE_NET")) @Valid @RequestParam(value = "provider", required = false, defaultValue = "AUTHORIZE_NET") provider: kotlin.String,
        @Parameter(description = "the type to search on") @Valid @RequestParam(value = "type", required = false) type: kotlin.String?,
        @Parameter(description = "the keyword to search on") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "the sort field to use for the search", schema = Schema(defaultValue = "UPDATED")) @Valid @RequestParam(value = "sortField", required = false, defaultValue = "UPDATED") sortField: kotlin.String,
        @Parameter(description = "if the results should be in descending order", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "descending", required = false, defaultValue = "true") descending: kotlin.Boolean,
        @Parameter(description = "the start of the search", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "the limit of the search", schema = Schema(defaultValue = "5")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "5") limit: kotlin.Int
    ): ResponseEntity<PaymentTypesResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_ADD_PAYMENT_METHOD: String = "/billing/update"
        const val PATH_CREATE_PAYMENT_METHOD: String = "/billing/create"
        const val PATH_CREATE_SMART_CONTRACT: String = "/billing/crypto/transfer"
        const val PATH_GET_CRYPTO_BALANCE: String = "/billing/crypto/get"
        const val PATH_GET_PAYMENT_METHOD: String = "/billing/get"
        const val PATH_SEARCH_PAYMENT_METHOD: String = "/billing/search"
    }
}
