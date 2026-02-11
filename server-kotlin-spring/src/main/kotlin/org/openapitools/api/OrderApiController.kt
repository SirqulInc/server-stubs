package org.openapitools.api

import org.openapitools.model.OrderResponse
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
class OrderApiController() {

    @Operation(
        summary = "Create Order",
        operationId = "createOrder",
        description = """Creates a new purchase with some number of items associated with it. The purchase is added to the order that was created""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OrderResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/order/create"
        value = [PATH_CREATE_ORDER],
        produces = ["*/*"]
    )
    fun createOrder(
        @NotNull @Parameter(description = "The application requesting the purchase", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "```json [   { \"orderItemType\": \"OFFER\", \"orderItemId\": 234, \"orderCustomType\": \"OfferLocation\", \"orderCustomId\": 123, \"retailerLocationId\": 1234, \"quantity\": 2 },   { \"orderItemType\": \"OFFER\", \"orderItemId\": 235, \"quantity\": 2 },   { \"orderItemType\": \"CUSTOM\", \"amount\": 10.50, \"orderCustomType\": \"ServiceFee\" },   { \"orderItemType\": \"CUSTOM\", \"amount\": 25.10, \"quantity\": 2, \"orderCustomType\": \"Hat\", \"orderCustomId\": 123 } ] ``` ", required = true) @Valid @RequestParam(value = "cart", required = true) cart: kotlin.String,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "A description of the purchase") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "Determines the method of purchasing offer.  * VOID: used for when there is no payment involved (ie. for updating the status of a purchase order)  * CASH: use card on file  * POINTS: use account balance  * TICKETS: use tickets  * REFUND: not allowed for a create, requires a paymentTransactionId.  * CREDIT: add to the account balance  * RELOAD: charge a credit card then add to the account balance  ", schema = Schema(allowableValues = ["VOID", "CASH", "POINTS", "TICKETS", "REFUND", "CREDIT", "RELOAD"], defaultValue = "CASH")) @Valid @RequestParam(value = "currencyType", required = false, defaultValue = "CASH") currencyType: kotlin.String,
        @Parameter(description = "Use a specific payment method (CASH), if not provided use default") @Valid @RequestParam(value = "paymentMethodId", required = false) paymentMethodId: kotlin.Long?,
        @Parameter(description = "Store identifier from external system") @Valid @RequestParam(value = "externalOrderId", required = false) externalOrderId: kotlin.String?,
        @Parameter(description = "Store identifier from external system") @Valid @RequestParam(value = "externalPaymentId", required = false) externalPaymentId: kotlin.String?,
        @Parameter(description = "Remote Reference type") @Valid @RequestParam(value = "remoteRefType", required = false) remoteRefType: kotlin.String?,
        @Parameter(description = "External Date") @Valid @RequestParam(value = "externalDate", required = false) externalDate: kotlin.Long?,
        @Parameter(description = "The Promo Code") @Valid @RequestParam(value = "promoCode", required = false) promoCode: kotlin.String?
    ): ResponseEntity<OrderResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Order",
        operationId = "deleteOrder",
        description = """Removes the transaction from the wallet by setting the deleted date to the current date/time.  Requires a valid account and transactionId.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/order/delete"
        value = [PATH_DELETE_ORDER],
        produces = ["*/*"]
    )
    fun deleteOrder(
        @NotNull @Parameter(description = "Order Id", required = true) @Valid @RequestParam(value = "orderId", required = true) orderId: kotlin.Long,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Order",
        operationId = "getOrder",
        description = """Get an order record""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OrderResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/order/get"
        value = [PATH_GET_ORDER],
        produces = ["*/*"]
    )
    fun getOrder(
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The order id to get details of, either orderId or externalOrderId must be provided") @Valid @RequestParam(value = "orderId", required = false) orderId: kotlin.Long?,
        @Parameter(description = "The external order id to get details of, either orderId or externalOrderId must be provided") @Valid @RequestParam(value = "externalOrderId", required = false) externalOrderId: kotlin.String?
    ): ResponseEntity<OrderResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Preview Order",
        operationId = "previewOrder",
        description = """Previews a purchase to see the total cost before making it.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OrderResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/order/preview"
        value = [PATH_PREVIEW_ORDER],
        produces = ["*/*"]
    )
    fun previewOrder(
        @NotNull @Parameter(description = "The application requesting the purchase", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "A JSON list of items to purchase", required = true) @Valid @RequestParam(value = "cart", required = true) cart: kotlin.String,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "A description of the purchase") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "Determines the method of purchasing offer. ```json {   \"VOID\": \"used for when there is no payment involved (ie. for updating the status of a purchase order)\",   \"CASH\": \"use card on file\",   \"POINTS\": \"use account balance\",   \"TICKETS\": \"use tickets\",   \"REFUND\": \"not allowed for a create, requires a paymentTransactionId\",   \"CREDIT\": \"add to the account balance\",   \"RELOAD\": \"charge a credit card then add to the account balance\" } ``` ", schema = Schema(allowableValues = ["VOID", "CASH", "POINTS", "TICKETS", "REFUND", "CREDIT", "RELOAD"], defaultValue = "CASH")) @Valid @RequestParam(value = "currencyType", required = false, defaultValue = "CASH") currencyType: kotlin.String,
        @Parameter(description = "Use a specific payment method (CASH), if not provided use default") @Valid @RequestParam(value = "paymentMethodId", required = false) paymentMethodId: kotlin.Long?,
        @Parameter(description = "Store identifier from external system") @Valid @RequestParam(value = "externalOrderId", required = false) externalOrderId: kotlin.String?,
        @Parameter(description = "Store identifier from external system") @Valid @RequestParam(value = "externalPaymentId", required = false) externalPaymentId: kotlin.String?,
        @Parameter(description = "Remote Reference type") @Valid @RequestParam(value = "remoteRefType", required = false) remoteRefType: kotlin.String?,
        @Parameter(description = "External Date") @Valid @RequestParam(value = "externalDate", required = false) externalDate: kotlin.Long?,
        @Parameter(description = "The Promo Code") @Valid @RequestParam(value = "promoCode", required = false) promoCode: kotlin.String?
    ): ResponseEntity<OrderResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Orders",
        operationId = "searchOrders",
        description = """Search on active orders by customer""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = OrderResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/order/search"
        value = [PATH_SEARCH_ORDERS],
        produces = ["*/*"]
    )
    fun searchOrders(
        @NotNull @Parameter(description = "The application requesting the purchase", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The start index for pagination", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "The limit for pagination", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int,
        @Parameter(description = "Determines whether to return the resulting list in descending or ascending order", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "descending", required = false, defaultValue = "true") descending: kotlin.Boolean,
        @Parameter(description = "Only return active orders", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "activeOnly", required = false, defaultValue = "false") activeOnly: kotlin.Boolean,
        @Parameter(description = "Determines whether to ignore the customer filter (requires an Admin/Exec account)", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "ignoreCustomerFilter", required = false, defaultValue = "false") ignoreCustomerFilter: kotlin.Boolean,
        @Parameter(description = "Filter results by orderItemTypes") @Valid @RequestParam(value = "orderItemTypes", required = false) orderItemTypes: kotlin.String?,
        @Parameter(description = "Filter results by orderItemIds") @Valid @RequestParam(value = "orderItemIds", required = false) orderItemIds: kotlin.String?,
        @Parameter(description = "Filter results by orderCustomTypes") @Valid @RequestParam(value = "orderCustomTypes", required = false) orderCustomTypes: kotlin.String?,
        @Parameter(description = "Filter results by orderCustomIds") @Valid @RequestParam(value = "orderCustomIds", required = false) orderCustomIds: kotlin.String?,
        @Parameter(description = "Determines what to sort the results by", schema = Schema(defaultValue = "ID")) @Valid @RequestParam(value = "sortField", required = false, defaultValue = "ID") sortField: kotlin.String,
        @Parameter(description = "Filter results by offer type") @Valid @RequestParam(value = "offerTypes", required = false) offerTypes: kotlin.String?,
        @Parameter(description = "Filter results by special offer type") @Valid @RequestParam(value = "specialOfferTypes", required = false) specialOfferTypes: kotlin.String?,
        @Parameter(description = "Filter results by category Ids") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "Filter results by filter Ids") @Valid @RequestParam(value = "filterIds", required = false) filterIds: kotlin.String?,
        @Parameter(description = "Filter results by offer audience Ids") @Valid @RequestParam(value = "offerAudienceIds", required = false) offerAudienceIds: kotlin.String?,
        @Parameter(description = "Filter results by transaction audience Ids") @Valid @RequestParam(value = "transactionAudienceIds", required = false) transactionAudienceIds: kotlin.String?,
        @Parameter(description = "Filter results by offer Ids") @Valid @RequestParam(value = "offerIds", required = false) offerIds: kotlin.String?,
        @Parameter(description = "Filter results by offer location Ids") @Valid @RequestParam(value = "offerLocationIds", required = false) offerLocationIds: kotlin.String?,
        @Parameter(description = "Filter results by retailer Ids") @Valid @RequestParam(value = "retailerIds", required = false) retailerIds: kotlin.String?,
        @Parameter(description = "Filter results by retailer location Ids") @Valid @RequestParam(value = "retailerLocationIds", required = false) retailerLocationIds: kotlin.String?,
        @Parameter(description = "Filter results by offer transaction status (0: non-redeemable, 1: redeemable, 2: redeemed, 3: user deleted, 4: unclaimed/rewarded, 5: membership active, 6: membership cancelled)") @Valid @RequestParam(value = "statuses", required = false) statuses: kotlin.String?,
        @Parameter(description = "The keyword to search for") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "Filter results by the offer redeemable date") @Valid @RequestParam(value = "redeemableStartDate", required = false) redeemableStartDate: kotlin.Long?,
        @Parameter(description = "Filter results by the offer redeemable date") @Valid @RequestParam(value = "redeemableEndDate", required = false) redeemableEndDate: kotlin.Long?,
        @Parameter(description = "Filter results by the offer start date") @Valid @RequestParam(value = "startedSince", required = false) startedSince: kotlin.Long?,
        @Parameter(description = "Filter results by the offer start date") @Valid @RequestParam(value = "startedBefore", required = false) startedBefore: kotlin.Long?,
        @Parameter(description = "Filter results by the offer end date") @Valid @RequestParam(value = "endedSince", required = false) endedSince: kotlin.Long?,
        @Parameter(description = "Filter results by the offer end date") @Valid @RequestParam(value = "endedBefore", required = false) endedBefore: kotlin.Long?
    ): ResponseEntity<List<OrderResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Order",
        operationId = "updateOrder",
        description = """Updates new purchase with some number of items associated with it. The orderId provided is used to retrieve the record and the payment is added to it.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OrderResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/order/update"
        value = [PATH_UPDATE_ORDER],
        produces = ["*/*"]
    )
    fun updateOrder(
        @NotNull @Parameter(description = "The order to add the purchase to, leave null for new order.", required = true) @Valid @RequestParam(value = "orderId", required = true) orderId: kotlin.Long,
        @NotNull @Parameter(description = "The application requesting the purchase", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "```json [   { \"orderItemType\": \"OFFER\", \"orderItemId\": 234, \"orderCustomType\": \"OfferLocation\", \"orderCustomId\": 123, \"retailerLocationId\": 1234, \"quantity\": 2 },   { \"orderItemType\": \"OFFER\", \"orderItemId\": 235, \"quantity\": 2 },   { \"orderItemType\": \"CUSTOM\", \"amount\": 10.50, \"orderCustomType\": \"ServiceFee\" },   { \"orderItemType\": \"CUSTOM\", \"amount\": 25.10, \"quantity\": 2, \"orderCustomType\": \"Hat\", \"orderCustomId\": 123 } ] ``` ", required = true) @Valid @RequestParam(value = "cart", required = true) cart: kotlin.String,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The payment transaction to apply the refund to") @Valid @RequestParam(value = "paymentTransactionId", required = false) paymentTransactionId: kotlin.Long?,
        @Parameter(description = "A description of the purchase") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "Determines the method of purchasing offer.  * VOID: used for when there is no payment involved (ie. for updating the status of a purchase order)  * CASH: use card on file  * POINTS: use account balance  * TICKETS: use tickets  * REFUND: not allowed for a create, requires a paymentTransactionId.  * CREDIT: add to the account balance  * RELOAD: charge a credit card then add to the account balance  ", schema = Schema(allowableValues = ["VOID", "CASH", "POINTS", "TICKETS", "REFUND", "CREDIT", "RELOAD"], defaultValue = "CASH")) @Valid @RequestParam(value = "currencyType", required = false, defaultValue = "CASH") currencyType: kotlin.String,
        @Parameter(description = "Use a specific payment method (CASH), if not provided use default") @Valid @RequestParam(value = "paymentMethodId", required = false) paymentMethodId: kotlin.Long?,
        @Parameter(description = "Store identifier from external system") @Valid @RequestParam(value = "externalPaymentId", required = false) externalPaymentId: kotlin.String?,
        @Parameter(description = "External Date") @Valid @RequestParam(value = "externalDate", required = false) externalDate: kotlin.Long?
    ): ResponseEntity<OrderResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_ORDER: String = "/order/create"
        const val PATH_DELETE_ORDER: String = "/order/delete"
        const val PATH_GET_ORDER: String = "/order/get"
        const val PATH_PREVIEW_ORDER: String = "/order/preview"
        const val PATH_SEARCH_ORDERS: String = "/order/search"
        const val PATH_UPDATE_ORDER: String = "/order/update"
    }
}
