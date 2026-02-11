package org.openapitools.api

import org.openapitools.model.CountResponse
import org.openapitools.model.ProfileResponse
import org.openapitools.model.TicketListResponse
import org.openapitools.model.TicketOfferResponse
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
class TicketApiController() {

    @Operation(
        summary = "Get Ticket Count",
        operationId = "getTicketCount",
        description = """Gets the ticket count.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = CountResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ticket/count"
        value = [PATH_GET_TICKET_COUNT],
        produces = ["*/*"]
    )
    fun getTicketCount(
        @Parameter(description = "the id of the device that owns the tickets") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the id of the account that owns the tickets") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "this is deprecated.") @Valid @RequestParam(value = "gameType", required = false) gameType: kotlin.String?,
        @Parameter(description = "the applicationkey") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "the type of ticket") @Valid @RequestParam(value = "ticketType", required = false) ticketType: kotlin.String?
    ): ResponseEntity<CountResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Ticket List",
        operationId = "getTicketList",
        description = """Gets the list of tickets.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = TicketListResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ticket/getList"
        value = [PATH_GET_TICKET_LIST],
        produces = ["*/*"]
    )
    fun getTicketList(
        @Parameter(description = "the id of the device that owns the tickets") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the id of the account that owns the tickets") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "comma separated list of TicketObjectType") @Valid @RequestParam(value = "ticketObjectType", required = false) ticketObjectType: kotlin.String?,
        @Parameter(description = "comma separated list of TicketActionType") @Valid @RequestParam(value = "actionType", required = false) actionType: kotlin.String?,
        @Parameter(description = "the ids of the tickets to get") @Valid @RequestParam(value = "ticketIds", required = false) ticketIds: kotlin.String?,
        @Parameter(description = "the ids of the objects to get") @Valid @RequestParam(value = "objectIds", required = false) objectIds: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "receiptTokens", required = false) receiptTokens: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "gameType", required = false) gameType: kotlin.String?,
        @Parameter(description = "the application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?
    ): ResponseEntity<TicketListResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Save Ticket",
        operationId = "saveTicket",
        description = """Allow user to acquire a purchase item and generate a ticket record. Used to redeem tickets or add tickets to the system.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ProfileResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ticket/save"
        value = [PATH_SAVE_TICKET],
        produces = ["*/*"]
    )
    fun saveTicket(
        @NotNull @Parameter(description = "the action being performed, values: COMPLETED, // ADD TICKETS FOR COMPLETING A MISSION, CHALLENGE, GAME, PACK, LEVEL, LEVEL OBJECT REDEEMED, // REMOVE TICKETS FOR BUYING PACKS, HINTS, AND PEN TOOLS OPTIONS, ETC USERS_PLAYED, // ADD TICKETS FOR LEVELS PLAYED BY OTHER USERS TOURNAMENT_OWNER, // ADD TICKETS FOR TOURNAMENTS BY OTHER USERS PURCHASED, // ADD TICKET VIA IN APP PURCHASING SUMATION, // SUMATION OF TICKETS EARNED FROM CHILDREN GIFTED, // TRANSFERING OF PURCHASE ITEMS TO OTHER PEOPLE REFUNDED // FOR REFUNDING TICKETS BACK TO THE USER", required = true) @Valid @RequestParam(value = "actionType", required = true) actionType: kotlin.String,
        @NotNull @Parameter(description = "the type of object being purchased, values: GAME_OBJECT, GAME_LEVEL, PACK, GAME, MISSION, PROFILE, APPLICATION, TICKETS, ASSET, CUSTOM", required = true) @Valid @RequestParam(value = "ticketObjectType", required = true) ticketObjectType: kotlin.String,
        @Parameter(description = "whether to return nulls or not") @Valid @RequestParam(value = "returnNulls", required = false) returnNulls: kotlin.Boolean?,
        @Parameter(description = "the device id that owns the tickets") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id that owns the tickets") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "This parameter is deprecated. deprecated, use the appKey") @Valid @RequestParam(value = "gameType", required = false) gameType: kotlin.String?,
        @Parameter(description = "the application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "the ID of the item being purchased") @Valid @RequestParam(value = "objectId", required = false) objectId: kotlin.Long?,
        @Parameter(description = "a unique string identifier defined by the application owner or Executive") @Valid @RequestParam(value = "purchaseCode", required = false) purchaseCode: kotlin.String?,
        @Parameter(description = "a unique transaction identifier from the purchase provider (i.e. the transaction ID from iTunes, Google Play, etc)") @Valid @RequestParam(value = "receiptToken", required = false) receiptToken: kotlin.String?,
        @Parameter(description = "the receipt/transaction data for validating a purchase via iTunes/Gooogle/etc. This should be in string format.") @Valid @RequestParam(value = "receiptData", required = false) receiptData: kotlin.String?,
        @Parameter(description = "the count of tickets") @Valid @RequestParam(value = "count", required = false) count: kotlin.Long?,
        @Parameter(description = "the ticket type") @Valid @RequestParam(value = "ticketType", required = false) ticketType: kotlin.String?,
        @Parameter(description = "the provider for making the purchase {ITUNES, ITUNES_SANDBOX, GOOGLE}") @Valid @RequestParam(value = "purchaseProvider", required = false) purchaseProvider: kotlin.String?,
        @Parameter(description = "a comma separated list of purchase types { SIRQUL, // purchasing from the sirqul store using tickets IOS, // purchasing from the itunes store for iPhone, iPod, iPod Touch GOOGLE, // purchasing from the google android store AMAZON, // purchasing from the amazon android store MAC, // purchasing from the itunes store for OSX WP8, // purhasing from the windows phone 8 store FREE }") @Valid @RequestParam(value = "purchaseType", required = false) purchaseType: kotlin.String?,
        @Parameter(description = "returns a ProfileResponse if true, otherwise will return an AppResponse") @Valid @RequestParam(value = "returnProfileResponse", required = false) returnProfileResponse: kotlin.Boolean?,
        @Parameter(description = "if returnProfileResponse is false, will return an AppResponse with profile data if true") @Valid @RequestParam(value = "includeProfileResponse", required = false) includeProfileResponse: kotlin.Boolean?,
        @Parameter(description = "the application version") @Valid @RequestParam(value = "appVersion", required = false) appVersion: kotlin.String?
    ): ResponseEntity<ProfileResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Save Ticket with Reciept",
        operationId = "saveTicketViaFileUpload",
        description = """Similar to the Save Ticket endpoint but allows the receiptData to be in binary format. This must be a multi-part post""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = ProfileResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/ticket/save/fileUpload"
        value = [PATH_SAVE_TICKET_VIA_FILE_UPLOAD],
        produces = ["*/*"]
    )
    fun saveTicketViaFileUpload(
        @NotNull @Parameter(description = "the action being performed { COMPLETED, // ADD TICKETS FOR COMPLETING A MISSION, CHALLENGE, GAME, PACK, LEVEL, LEVEL OBJECT REDEEMED, // REMOVE TICKETS FOR BUYING PACKS, HINTS, AND PEN TOOLS OPTIONS, ETC USERS_PLAYED, // ADD TICKETS FOR LEVELS PLAYED BY OTHER USERS TOURNAMENT_OWNER, // ADD TICKETS FOR TOURNAMENTS BY OTHER USERS PURCHASED, // ADD TICKET VIA IN APP PURCHASING SUMATION, // SUMATION OF TICKETS EARNED FROM CHILDREN GIFTED, // TRANSFERING OF PURCHASE ITEMS TO OTHER PEOPLE REFUNDED // FOR REFUNDING TICKETS BACK TO THE USER }", required = true) @Valid @RequestParam(value = "actionType", required = true) actionType: kotlin.String,
        @NotNull @Parameter(description = "the type of object being purchased {GAME_OBJECT, GAME_LEVEL, PACK, GAME, MISSION, PROFILE, APPLICATION, TICKETS, ASSET, CUSTOM}", required = true) @Valid @RequestParam(value = "ticketObjectType", required = true) ticketObjectType: kotlin.String,
        @NotNull @Parameter(description = "the receipt/transaction data for validating a purchase via iTunes/Gooogle/etc. This should be in binary format.", required = true) @Valid @RequestParam(value = "receiptData", required = true) receiptData: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "whether to return nulls or not") @Valid @RequestParam(value = "returnNulls", required = false) returnNulls: kotlin.Boolean?,
        @Parameter(description = "the device id") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "This parameter is deprecated. deprecated, use the appKey") @Valid @RequestParam(value = "gameType", required = false) gameType: kotlin.String?,
        @Parameter(description = "the application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "the ID of the item being purchased") @Valid @RequestParam(value = "objectId", required = false) objectId: kotlin.Long?,
        @Parameter(description = "a unique string identifier defined by the application owner or Executive") @Valid @RequestParam(value = "purchaseCode", required = false) purchaseCode: kotlin.String?,
        @Parameter(description = "a unique transaction identifier from the purchase provider (i.e. the transaction ID from iTunes, Google Play, etc)") @Valid @RequestParam(value = "receiptToken", required = false) receiptToken: kotlin.String?,
        @Parameter(description = "the count of tickets") @Valid @RequestParam(value = "count", required = false) count: kotlin.Long?,
        @Parameter(description = "the ticket type") @Valid @RequestParam(value = "ticketType", required = false) ticketType: kotlin.String?,
        @Parameter(description = "the provider for making the purchase {ITUNES, ITUNES_SANDBOX, GOOGLE}") @Valid @RequestParam(value = "purchaseProvider", required = false) purchaseProvider: kotlin.String?,
        @Parameter(description = "a comma separated list of purchase types { SIRQUL, // purchasing from the sirqul store using tickets IOS, // purchasing from the itunes store for iPhone, iPod, iPod Touch GOOGLE, // purchasing from the google android store AMAZON, // purchasing from the amazon android store MAC, // purchasing from the itunes store for OSX WP8, // purhasing from the windows phone 8 store FREE }") @Valid @RequestParam(value = "purchaseType", required = false) purchaseType: kotlin.String?,
        @Parameter(description = "returns a ProfileResponse if true, otherwise will return an AppResponse") @Valid @RequestParam(value = "returnProfileResponse", required = false) returnProfileResponse: kotlin.Boolean?,
        @Parameter(description = "if returnProfileResponse is false, will return an AppResponse with profile data if true") @Valid @RequestParam(value = "includeProfileResponse", required = false) includeProfileResponse: kotlin.Boolean?,
        @Parameter(description = "the application version") @Valid @RequestParam(value = "appVersion", required = false) appVersion: kotlin.String?
    ): ResponseEntity<ProfileResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Ticket Offers",
        operationId = "ticketOffers",
        description = """Get a list offers for tickets owned by sirqul.  Purchasing these will add the number of tickets to the account specified by the offer.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = TicketOfferResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/ticket/ticketoffers"
        value = [PATH_TICKET_OFFERS],
        produces = ["*/*"]
    )
    fun ticketOffers(): ResponseEntity<TicketOfferResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_GET_TICKET_COUNT: String = "/ticket/count"
        const val PATH_GET_TICKET_LIST: String = "/ticket/getList"
        const val PATH_SAVE_TICKET: String = "/ticket/save"
        const val PATH_SAVE_TICKET_VIA_FILE_UPLOAD: String = "/ticket/save/fileUpload"
        const val PATH_TICKET_OFFERS: String = "/ticket/ticketoffers"
    }
}
