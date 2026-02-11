package org.openapitools.api

import org.openapitools.model.OfferTransactionResponse
import org.openapitools.model.SirqulResponse
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
class WalletApiController() {

    @Operation(
        summary = "Create Wallet Offers",
        operationId = "createOfferTransaction",
        description = """Adds offers to the wallet""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = OfferTransactionResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/wallet/create"
        value = [PATH_CREATE_OFFER_TRANSACTION],
        produces = ["*/*"]
    )
    fun createOfferTransaction(
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The id of the offer being added (offerId or offeLocationId required)") @Valid @RequestParam(value = "offerId", required = false) offerId: kotlin.Long?,
        @Parameter(description = "The id of the offer location being added (offerId or offeLocationId required)") @Valid @RequestParam(value = "offerLocationId", required = false) offerLocationId: kotlin.Long?,
        @Parameter(description = "A JSON list of offers to purchase. ```json [   {     \"offerId\": 123,     \"offerLocationId\": 234,     \"quantity\": 2   },   {     \"offerId\": 456,     \"offerLocationId\": 567,     \"quantity\": 1   } ] ``` ") @Valid @RequestParam(value = "offerCart", required = false) offerCart: kotlin.String?,
        @Parameter(description = "The promoCode") @Valid @RequestParam(value = "promoCode", required = false) promoCode: kotlin.String?,
        @Parameter(description = "Determines the method of purchasing offer. CASH = use card on file, POINTS = use points, TICKETS = use tickets", schema = Schema(defaultValue = "CASH")) @Valid @RequestParam(value = "currencyType", required = false, defaultValue = "CASH") currencyType: kotlin.String,
        @Parameter(description = "Sets the currencyType to POINTS") @Valid @RequestParam(value = "usePoints", required = false) usePoints: kotlin.Boolean?,
        @Parameter(description = "External custom client defined data") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?,
        @Parameter(description = "The application requesting the purchase, required when currencyType is TICKETS") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "Custom status value to change to (0 or 1 for redeem, 5 or 6 for membership)") @Valid @RequestParam(value = "status", required = false) status: kotlin.Int?
    ): ResponseEntity<List<OfferTransactionResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Wallet Offer",
        operationId = "deleteOfferTransaction",
        description = """Removes the transaction from the wallet by setting the deleted date to the current date/time.  Requires a valid account and transactionId.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/wallet/delete"
        value = [PATH_DELETE_OFFER_TRANSACTION],
        produces = ["*/*"]
    )
    fun deleteOfferTransaction(
        @NotNull @Parameter(description = "The offer transaction id to remove", required = true) @Valid @RequestParam(value = "transactionId", required = true) transactionId: kotlin.Long,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Wallet Offer",
        operationId = "getOfferTransaction",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OfferTransactionResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/wallet/get"
        value = [PATH_GET_OFFER_TRANSACTION],
        produces = ["*/*"]
    )
    fun getOfferTransaction(
        @NotNull @Parameter(description = "The offer transaction id to get details of", required = true) @Valid @RequestParam(value = "transactionId", required = true) transactionId: kotlin.Long,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "If true then include mission data, false to not include", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "includeMission", required = false, defaultValue = "false") includeMission: kotlin.Boolean,
        @Parameter(description = "The latitude location of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The latitude location of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "Determines whether to return a detailed version of the response", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "returnFullResponse", required = false, defaultValue = "true") returnFullResponse: kotlin.Boolean
    ): ResponseEntity<OfferTransactionResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Preview Wallet Offers",
        operationId = "previewOfferTransaction",
        description = """Preview the final cost of a transaction without charging the user""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = OfferTransactionResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/wallet/preview"
        value = [PATH_PREVIEW_OFFER_TRANSACTION],
        produces = ["*/*"]
    )
    fun previewOfferTransaction(
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The id of the offer being added (offerId or offeLocationId required)") @Valid @RequestParam(value = "offerId", required = false) offerId: kotlin.Long?,
        @Parameter(description = "The id of the offer location being added (offerId or offeLocationId required)") @Valid @RequestParam(value = "offerLocationId", required = false) offerLocationId: kotlin.Long?,
        @Parameter(description = "A JSON list of offers to purchase.") @Valid @RequestParam(value = "offerCart", required = false) offerCart: kotlin.String?,
        @Parameter(description = "The promoCode") @Valid @RequestParam(value = "promoCode", required = false) promoCode: kotlin.String?,
        @Parameter(description = "Determines the method of purchasing offer. CASH = use card on file, POINTS = use points, TICKETS = use tickets", schema = Schema(defaultValue = "CASH")) @Valid @RequestParam(value = "currencyType", required = false, defaultValue = "CASH") currencyType: kotlin.String,
        @Parameter(description = "Sets the currencyType to POINTS") @Valid @RequestParam(value = "usePoints", required = false) usePoints: kotlin.Boolean?,
        @Parameter(description = "External custom client defined data") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?,
        @Parameter(description = "The application requesting the purchase, required when currencyType is TICKETS") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?
    ): ResponseEntity<List<OfferTransactionResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Wallet Offers",
        operationId = "searchOfferTransactions",
        description = """Search on active offers currently in the user's wallet, or past offers the user has already redeemed.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = OfferTransactionResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/wallet/search"
        value = [PATH_SEARCH_OFFER_TRANSACTIONS],
        produces = ["*/*"]
    )
    fun searchOfferTransactions(
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The keyword to search for") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "Filter results for this retailer") @Valid @RequestParam(value = "retailerId", required = false) retailerId: kotlin.Long?,
        @Parameter(description = "Filter results for a list of retailers") @Valid @RequestParam(value = "retailerIds", required = false) retailerIds: kotlin.String?,
        @Parameter(description = "Filter results for this retailer location") @Valid @RequestParam(value = "retailerLocationId", required = false) retailerLocationId: kotlin.Long?,
        @Parameter(description = "Filter results for a list of retailer locations") @Valid @RequestParam(value = "retailerLocationIds", required = false) retailerLocationIds: kotlin.String?,
        @Parameter(description = "Filter results to exclude retailer locations") @Valid @RequestParam(value = "excludeRetailerLocationIds", required = false) excludeRetailerLocationIds: kotlin.String?,
        @Parameter(description = "Filter results for this offer") @Valid @RequestParam(value = "offerId", required = false) offerId: kotlin.Long?,
        @Parameter(description = "Filter results for a list of offer") @Valid @RequestParam(value = "offerIds", required = false) offerIds: kotlin.String?,
        @Parameter(description = "Filter results for this offer location") @Valid @RequestParam(value = "offerLocationId", required = false) offerLocationId: kotlin.Long?,
        @Parameter(description = "Filter results for a list of offer locations") @Valid @RequestParam(value = "offerLocationIds", required = false) offerLocationIds: kotlin.String?,
        @Parameter(description = "Filter results to return a specific offer type", schema = Schema(allowableValues = ["VOUCHER", "COUPON", "PRODUCT", "MEDIA", "EVENT", "DEVICE"])) @Valid @RequestParam(value = "offerType", required = false) offerType: kotlin.String?,
        @Parameter(description = "Filter results to return specific offer types") @Valid @RequestParam(value = "offerTypes", required = false) offerTypes: kotlin.String?,
        @Parameter(description = "Filter results to return a specific special offer type") @Valid @RequestParam(value = "specialOfferType", required = false) specialOfferType: kotlin.String?,
        @Parameter(description = "Filter results to return specific special offer types") @Valid @RequestParam(value = "specialOfferTypes", required = false) specialOfferTypes: kotlin.String?,
        @Parameter(description = "Category Ids") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "Filter Ids") @Valid @RequestParam(value = "filterIds", required = false) filterIds: kotlin.String?,
        @Parameter(description = "Offer Audience Ids") @Valid @RequestParam(value = "offerAudienceIds", required = false) offerAudienceIds: kotlin.String?,
        @Parameter(description = "Determines what to sort the results by", schema = Schema(allowableValues = ["ID", "CREATED", "UPDATED", "DELETED", "SEARCH_TAGS", "ACTIVE", "ACTIVATED", "EXPIRES", "TITLE", "SUBTITLE", "DETAILS", "OFFER_TYPE", "SPECIAL_OFFER_TYPE", "OFFER_VISIBILITY", "REDEEMABLE_START", "REDEEMABLE_END", "CUSTOMER_ID", "CUSTOMER_DISPLAY", "RETAILER_ID", "RETAILER_NAME", "RETAILER_LOCATION_ID", "RETAILER_LOCATION_NAME", "BILLABLE_ENTITY_ID", "BILLABLE_ENTITY_NAME", "RESPONSIBLE_DISPLAY"], defaultValue = "CREATED")) @Valid @RequestParam(value = "sortField", required = false, defaultValue = "CREATED") sortField: kotlin.String,
        @Parameter(description = "Determines whether the results are in descending order", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "descending", required = false, defaultValue = "true") descending: kotlin.Boolean,
        @Parameter(description = "The start index for pagination", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "The limit for pagination", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int,
        @Parameter(description = "The latitude location of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The latitude location of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "Filter results by the offer redeemable date") @Valid @RequestParam(value = "redeemableStartDate", required = false) redeemableStartDate: kotlin.Long?,
        @Parameter(description = "Filter results by the offer redeemable date") @Valid @RequestParam(value = "redeemableEndDate", required = false) redeemableEndDate: kotlin.Long?,
        @Parameter(description = "Apply params to offer's parent", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "filterByParentOffer", required = false, defaultValue = "false") filterByParentOffer: kotlin.Boolean,
        @Parameter(description = "Filter results by the offer start date") @Valid @RequestParam(value = "startedSince", required = false) startedSince: kotlin.Long?,
        @Parameter(description = "Filter results by the offer start date") @Valid @RequestParam(value = "startedBefore", required = false) startedBefore: kotlin.Long?,
        @Parameter(description = "Filter results by the offer end date") @Valid @RequestParam(value = "endedSince", required = false) endedSince: kotlin.Long?,
        @Parameter(description = "Filter results by the offer end date") @Valid @RequestParam(value = "endedBefore", required = false) endedBefore: kotlin.Long?,
        @Parameter(description = "If true return redeemed transactions (status 2), otherwise return active transactions (status 0 or 1)", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "redeemed", required = false, defaultValue = "false") redeemed: kotlin.Boolean,
        @Parameter(description = "Custom status value to change to (0 or 1 for redeem, 5 or 6 for membership)") @Valid @RequestParam(value = "statuses", required = false) statuses: kotlin.String?,
        @Parameter(description = "Returns only reservation transactions if true", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "reservationsOnly", required = false, defaultValue = "false") reservationsOnly: kotlin.Boolean,
        @Parameter(description = "Active Only", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "activeOnly", required = false, defaultValue = "false") activeOnly: kotlin.Boolean,
        @Parameter(description = "Determines whether to return a detailed version of the response", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "returnFullResponse", required = false, defaultValue = "false") returnFullResponse: kotlin.Boolean,
        @Parameter(description = "Filter results by the recurring billing start date") @Valid @RequestParam(value = "recurringStartedSince", required = false) recurringStartedSince: kotlin.Long?,
        @Parameter(description = "Filter results by the recurring billing start date") @Valid @RequestParam(value = "recurringStartedBefore", required = false) recurringStartedBefore: kotlin.Long?,
        @Parameter(description = "Filter results by the recurring billing expiration date") @Valid @RequestParam(value = "recurringExpirationSince", required = false) recurringExpirationSince: kotlin.Long?,
        @Parameter(description = "Filter results by the recurring billing expiration date") @Valid @RequestParam(value = "recurringExpirationBefore", required = false) recurringExpirationBefore: kotlin.Long?
    ): ResponseEntity<List<OfferTransactionResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Wallet Offer",
        operationId = "updateOfferTransaction",
        description = """Update offer status. The status values are: 0 - not redeemable, 1 - redeemable.

Not redeemable means the customer has received the offer but has not decided to use (or print) it yet.  Until they choose to do this the merchant cannot redeem the offer (has not been given permission yet). 

Redeemable means the customer has chosen to use the offer and wishes to redeem it.

Redeemed means the merchant has accepted the offer and the given the customer its value, then marked it a used in the system.  This status change is handled by a merchant end point.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OfferTransactionResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/wallet/update"
        value = [PATH_UPDATE_OFFER_TRANSACTION],
        produces = ["*/*"]
    )
    fun updateOfferTransaction(
        @NotNull @Parameter(description = "The offer transaction id to remove", required = true) @Valid @RequestParam(value = "transactionId", required = true) transactionId: kotlin.Long,
        @NotNull @Parameter(description = "The status value to change to (0 or 1)", required = true) @Valid @RequestParam(value = "status", required = true) status: kotlin.Int,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "Offer Location Id") @Valid @RequestParam(value = "offerLocationId", required = false) offerLocationId: kotlin.Long?,
        @Parameter(description = "Currency Type", schema = Schema(defaultValue = "CASH")) @Valid @RequestParam(value = "currencyType", required = false, defaultValue = "CASH") currencyType: kotlin.String,
        @Parameter(description = "Use Points") @Valid @RequestParam(value = "usePoints", required = false) usePoints: kotlin.Boolean?,
        @Parameter(description = "App Key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "The latitude location of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The latitude location of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "External custom client defined data") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?,
        @Parameter(description = "Determines whether to return a detailed version of the response", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "returnFullResponse", required = false, defaultValue = "false") returnFullResponse: kotlin.Boolean,
        @Parameter(description = "Exception Offers, transaction audiences of these offers won't be removed out of the account when up") @Valid @RequestParam(value = "exceptionMembershipOfferIds", required = false) exceptionMembershipOfferIds: kotlin.String?
    ): ResponseEntity<OfferTransactionResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_OFFER_TRANSACTION: String = "/wallet/create"
        const val PATH_DELETE_OFFER_TRANSACTION: String = "/wallet/delete"
        const val PATH_GET_OFFER_TRANSACTION: String = "/wallet/get"
        const val PATH_PREVIEW_OFFER_TRANSACTION: String = "/wallet/preview"
        const val PATH_SEARCH_OFFER_TRANSACTIONS: String = "/wallet/search"
        const val PATH_UPDATE_OFFER_TRANSACTION: String = "/wallet/update"
    }
}
