package org.openapitools.api

import org.openapitools.model.PurchaseItemFullResponse
import org.openapitools.model.PurchaseItemResponse
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
class PurchaseApiController() {

    @Operation(
        summary = "Create Purchase",
        operationId = "createPurchaseItem",
        description = """Creates a purchase item for in app purchases""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = PurchaseItemFullResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/purchase/create"
        value = [PATH_CREATE_PURCHASE_ITEM],
        produces = ["*/*"]
    )
    fun createPurchaseItem(
        @NotNull @Parameter(description = "The application key that the purchase can be used in", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "The name of the purchase item", required = true) @Valid @RequestParam(value = "name", required = true) name: kotlin.String,
        @NotNull @Parameter(description = "The purchase provider <ul> <li>SIRQUL - the Sirqul store to make purchases using tickets</li> <li>IOS - the iTunes store for iPhone, iPod, iPod Touch</li> <li>GOOGLE - the Google Play store</li> <li>AMAZON - the Amazon Android store</li> <li>MAC - the iTunes store for OSX</li> <li>WP8 - the Windows Phone 8 store</li> <li>FREE - used for purchase items that are free (can be used for development/testing purposes)</li> </ul>", required = true, schema = Schema(allowableValues = ["SIRQUL", "IOS", "GOOGLE", "AMAZON", "MAC", "WP8", "FREE"])) @Valid @RequestParam(value = "purchaseType", required = true) purchaseType: kotlin.String,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The description of the purchase item") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "How much the purchase item is worth in tickets") @Valid @RequestParam(value = "tickets", required = false) tickets: kotlin.Int?,
        @Parameter(description = "How much the purchase item will cost in real money") @Valid @RequestParam(value = "price", required = false) price: kotlin.Float?,
        @Parameter(description = "The unique identifier used by purchase providers to identify in-app-purchases") @Valid @RequestParam(value = "purchaseCode", required = false) purchaseCode: kotlin.String?,
        @Parameter(description = "A secret key from purchase providers that would be used for validation") @Valid @RequestParam(value = "secretKey", required = false) secretKey: kotlin.String?,
        @Parameter(description = "How many times a user acquire the same purchase item", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "purchaseLimit", required = false, defaultValue = "0") purchaseLimit: kotlin.Int,
        @Parameter(description = "Determines whether the purchase item will enable certain features <ul> <li>DAY_PREMIUM - subscribes a user for a day of membership</li> <li>WEEK_PREMIUM - subscribes a user for a week of membership</li> <li>MONTH_PREMIUM - subscribes a user for a month of membership</li> <li>ADD_TICKET - allows a user to add more tickets to their account</li> <li>ADD_GIFT - allows a user to send/recieve the purchase item as a gift</li> </ul>", schema = Schema(allowableValues = ["DAY_PREMIUM", "WEEK_PREMIUM", "MONTH_PREMIUM", "YEAR_PREMIUM", "LIFETIME_PREMIUM", "ADD_TICKET", "ADD_GIFT", "ADD_POINTS"])) @Valid @RequestParam(value = "serviceAction", required = false) serviceAction: kotlin.String?,
        @Parameter(description = "The cover image of the purchase item") @Valid @RequestParam(value = "coverAssetId", required = false) coverAssetId: kotlin.Long?,
        @Parameter(description = "An application specific asset that can be used to store/provide additional data") @Valid @RequestParam(value = "promoAssetId", required = false) promoAssetId: kotlin.Long?,
        @Parameter(description = "Determines whether the purchase item can be gifted to other users") @Valid @RequestParam(value = "giftable", required = false) giftable: kotlin.Boolean?,
        @Parameter(description = "Determines whether users can attach their own media/asset to the purchase item") @Valid @RequestParam(value = "assetable", required = false) assetable: kotlin.Boolean?,
        @Parameter(description = "Flag to indicate owner should receive tickets for completed missions", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "allocateTickets", required = false, defaultValue = "false") allocateTickets: kotlin.Boolean,
        @Parameter(description = "The type of ticket to reward, null means default type") @Valid @RequestParam(value = "ticketType", required = false) ticketType: kotlin.String?,
        @Parameter(description = "The number of points to award for completing a mission") @Valid @RequestParam(value = "points", required = false) points: kotlin.Long?,
        @Parameter(description = "The offer location that will get added to the user's wallet after purchase.") @Valid @RequestParam(value = "offerLocationId", required = false) offerLocationId: kotlin.Long?
    ): ResponseEntity<PurchaseItemFullResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Purchase",
        operationId = "deletePurchaseItem",
        description = """Marks the purchase item as deleted""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/purchase/delete"
        value = [PATH_DELETE_PURCHASE_ITEM],
        produces = ["*/*"]
    )
    fun deletePurchaseItem(
        @NotNull @Parameter(description = "The purchase item id", required = true) @Valid @RequestParam(value = "purchaseItemId", required = true) purchaseItemId: kotlin.Long,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Purchase",
        operationId = "getPurchaseItem",
        description = """Get detailed information about a purchase item""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = PurchaseItemFullResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/purchase/get"
        value = [PATH_GET_PURCHASE_ITEM],
        produces = ["*/*"]
    )
    fun getPurchaseItem(
        @NotNull @Parameter(description = "The purchase item id", required = true) @Valid @RequestParam(value = "purchaseItemId", required = true) purchaseItemId: kotlin.Long,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?
    ): ResponseEntity<PurchaseItemFullResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Gift Tickets",
        operationId = "giftPurchase",
        description = """Gift tickets to another user.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/purchase/gift"
        value = [PATH_GIFT_PURCHASE],
        produces = ["*/*"]
    )
    fun giftPurchase(
        @NotNull @Parameter(description = "the id of the account receiving the tickets", required = true) @Valid @RequestParam(value = "receiverAccountId", required = true) receiverAccountId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the tickets", required = true) @Valid @RequestParam(value = "ticketId", required = true) ticketId: kotlin.Long,
        @Parameter(description = "the id of the device") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the id of the gift owner") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the id of the asset") @Valid @RequestParam(value = "assetId", required = false) assetId: kotlin.Long?,
        @Parameter(description = "a message that can be written to go along with the gift") @Valid @RequestParam(value = "customMessage", required = false) customMessage: kotlin.String?,
        @Parameter(description = "the type of game associated with the tickets") @Valid @RequestParam(value = "gameType", required = false) gameType: kotlin.String?,
        @Parameter(description = "the application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Purchases",
        operationId = "searchPurchaseItems",
        description = """Search for purchasable items from the system""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = PurchaseItemResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/purchase/search"
        value = [PATH_SEARCH_PURCHASE_ITEMS],
        produces = ["*/*"]
    )
    fun searchPurchaseItems(
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The application key to filter results by application") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "Determines whether to filter results by the user's billable entity", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "filterByBillable", required = false, defaultValue = "false") filterByBillable: kotlin.Boolean,
        @Parameter(description = "A comma separated list of purchase providers to filter by. Possible values include: <ul> <li>SIRQUL - purchases from the Sirqul store using tickets</li> <li>IOS - purchases from the iTunes store for iPhone, iPod, iPod Touch</li> <li>GOOGLE - purchases from the Google Play store</li> <li>AMAZON - purchases from the Amazon Android store</li> <li>MAC - purchases from the iTunes store for OSX</li> <li>WP8 - purchases from the Windows Phone 8 store</li> <li>FREE - purchases that are free (can be used for development/testing purposes)</li> </ul>") @Valid @RequestParam(value = "purchaseType", required = false) purchaseType: kotlin.String?,
        @Parameter(description = "A comma separated list of service actions to filter results by. Possible values include: <ul> <li>DAY_PREMIUM - purchases that subscribes a user for a day of membership</li> <li>WEEK_PREMIUM - purchases that subscribes a user for a week of membership</li> <li>MONTH_PREMIUM - purchases that subscribes a user for a month of membership</li> <li>ADD_TICKET - purchases that allow users to add more tickets</li> <li>ADD_GIFT - purchases that allow users to recieve gifts</li> </ul>") @Valid @RequestParam(value = "serviceAction", required = false) serviceAction: kotlin.String?,
        @Parameter(description = "The keyword used to search") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY", schema = Schema(allowableValues = ["ID", "CREATED", "UPDATED", "DELETED", "SEARCH_TAGS", "ACTIVE", "NAME", "DESCRIPTION", "TICKETS", "PRICE", "PURCHASE_TYPE", "PURCHASE_CODE", "PURCHASE_LIMIT", "SERIVCE_ACTION", "GIFTABLE", "ASSETABLE", "APPLICATION_ID", "APPLICATION_NAME"], defaultValue = "NAME")) @Valid @RequestParam(value = "sortField", required = false, defaultValue = "NAME") sortField: kotlin.String,
        @Parameter(description = "The order to return the search results", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "descending", required = false, defaultValue = "false") descending: kotlin.Boolean,
        @Parameter(description = "The record to begin the return set on", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "The number of records to return", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int,
        @Parameter(description = "Return only active results", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "activeOnly", required = false, defaultValue = "false") activeOnly: kotlin.Boolean
    ): ResponseEntity<List<PurchaseItemResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Purchase",
        operationId = "updatePurchaseItem",
        description = """Updates a purchase item for in app purchases""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = PurchaseItemFullResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/purchase/update"
        value = [PATH_UPDATE_PURCHASE_ITEM],
        produces = ["*/*"]
    )
    fun updatePurchaseItem(
        @NotNull @Parameter(description = "The purchase item id", required = true) @Valid @RequestParam(value = "purchaseItemId", required = true) purchaseItemId: kotlin.Long,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The name of the purchase item") @Valid @RequestParam(value = "name", required = false) name: kotlin.String?,
        @Parameter(description = "The description of the purchase item") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "How much the purchase item is worth in tickets") @Valid @RequestParam(value = "tickets", required = false) tickets: kotlin.Int?,
        @Parameter(description = "How much the purchase item will cost in real money") @Valid @RequestParam(value = "price", required = false) price: kotlin.Float?,
        @Parameter(description = "The purchase provider <ul> <li>SIRQUL - the Sirqul store to make purchases using tickets</li> <li>IOS - the iTunes store for iPhone, iPod, iPod Touch</li> <li>GOOGLE - the Google Play store</li> <li>AMAZON - the Amazon Android store</li> <li>MAC - the iTunes store for OSX</li> <li>WP8 - the Windows Phone 8 store</li> <li>FREE - used for purchase items that are free (can be used for development/testing purposes)</li> </ul>", schema = Schema(allowableValues = ["SIRQUL", "IOS", "GOOGLE", "AMAZON", "MAC", "WP8", "FREE"])) @Valid @RequestParam(value = "purchaseType", required = false) purchaseType: kotlin.String?,
        @Parameter(description = "The unique identifier used by purchase providers to identify in-app-purchases") @Valid @RequestParam(value = "purchaseCode", required = false) purchaseCode: kotlin.String?,
        @Parameter(description = "A secret key from purchase providers that would be used for validation") @Valid @RequestParam(value = "secretKey", required = false) secretKey: kotlin.String?,
        @Parameter(description = "How many times a user acquire the same purchase item") @Valid @RequestParam(value = "purchaseLimit", required = false) purchaseLimit: kotlin.Int?,
        @Parameter(description = "Determines whether the purchase item will enable certain features <ul> <li>DAY_PREMIUM - subscribes a user for a day of membership</li> <li>WEEK_PREMIUM - subscribes a user for a week of membership</li> <li>MONTH_PREMIUM - subscribes a user for a month of membership</li> <li>ADD_TICKET - allows a user to add more tickets to their account</li> <li>ADD_GIFT - allows a user to send/recieve the purchase item as a gift</li> </ul>", schema = Schema(allowableValues = ["DAY_PREMIUM", "WEEK_PREMIUM", "MONTH_PREMIUM", "YEAR_PREMIUM", "LIFETIME_PREMIUM", "ADD_TICKET", "ADD_GIFT", "ADD_POINTS"])) @Valid @RequestParam(value = "serviceAction", required = false) serviceAction: kotlin.String?,
        @Parameter(description = "The cover image of the purchase item") @Valid @RequestParam(value = "coverAssetId", required = false) coverAssetId: kotlin.Long?,
        @Parameter(description = "An application specific asset that can be used to store/provide additional data") @Valid @RequestParam(value = "promoAssetId", required = false) promoAssetId: kotlin.Long?,
        @Parameter(description = "Determines whether the purchase item can be gifted to other users") @Valid @RequestParam(value = "giftable", required = false) giftable: kotlin.Boolean?,
        @Parameter(description = "Determines whether users can attach their own media/asset to the purchase item") @Valid @RequestParam(value = "assetable", required = false) assetable: kotlin.Boolean?,
        @Parameter(description = "Sets whether the purchase item is active or inactive (hidden from consumers)") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "Flag to indicate owner should receive tickets for completed missions", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "allocateTickets", required = false, defaultValue = "false") allocateTickets: kotlin.Boolean,
        @Parameter(description = "The type of ticket to reward, null means default type") @Valid @RequestParam(value = "ticketType", required = false) ticketType: kotlin.String?,
        @Parameter(description = "The number of points to award for completing a mission") @Valid @RequestParam(value = "points", required = false) points: kotlin.Long?,
        @Parameter(description = "The offer location that will get added to the user's wallet after purchase.") @Valid @RequestParam(value = "offerLocationId", required = false) offerLocationId: kotlin.Long?
    ): ResponseEntity<PurchaseItemFullResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_PURCHASE_ITEM: String = "/purchase/create"
        const val PATH_DELETE_PURCHASE_ITEM: String = "/purchase/delete"
        const val PATH_GET_PURCHASE_ITEM: String = "/purchase/get"
        const val PATH_GIFT_PURCHASE: String = "/purchase/gift"
        const val PATH_SEARCH_PURCHASE_ITEMS: String = "/purchase/search"
        const val PATH_UPDATE_PURCHASE_ITEM: String = "/purchase/update"
    }
}
