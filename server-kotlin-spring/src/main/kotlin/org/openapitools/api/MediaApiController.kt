package org.openapitools.api

import org.openapitools.model.MediaOfferResponse
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
class MediaApiController() {

    @Operation(
        summary = "Create Media",
        operationId = "createMedia",
        description = """Create a media offering.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = MediaOfferResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/media/create"
        value = [PATH_CREATE_MEDIA],
        produces = ["*/*"]
    )
    fun createMedia(
        @NotNull @Parameter(description = "The account id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The title (255 char limit)", required = true) @Valid @RequestParam(value = "title", required = true) title: kotlin.String,
        @NotNull @Parameter(description = "The bar code type {NONE, UPC, CODE_128, QR, CUSTOM_MEDIA}", required = true, schema = Schema(allowableValues = ["NONE", "UPC", "CODE_128", "QR", "CUSTOM_MEDIA"])) @Valid @RequestParam(value = "barcodeType", required = true) barcodeType: kotlin.String,
        @NotNull @Parameter(description = "Overrides the expiration date so that the offer does not expire", required = true) @Valid @RequestParam(value = "noExpiration", required = true) noExpiration: kotlin.Boolean,
        @NotNull @Parameter(description = "The limit of how many times the offer can be used by consumers", required = true) @Valid @RequestParam(value = "availableLimit", required = true) availableLimit: kotlin.Int,
        @NotNull @Parameter(description = "The limit of how many times a user can used the same offer", required = true) @Valid @RequestParam(value = "availableLimitPerUser", required = true) availableLimitPerUser: kotlin.Int,
        @NotNull @Parameter(description = "The limit of how many times the offer can be added to consumer wallets", required = true) @Valid @RequestParam(value = "addedLimit", required = true) addedLimit: kotlin.Int,
        @NotNull @Parameter(description = "The limit of how many times the offer can be viewed", required = true) @Valid @RequestParam(value = "viewLimit", required = true) viewLimit: kotlin.Int,
        @NotNull @Parameter(description = "The maximum number of times the offer can be printed", required = true) @Valid @RequestParam(value = "maxPrints", required = true) maxPrints: kotlin.Int,
        @NotNull @Parameter(description = "The cost of the offer in tickets", required = true) @Valid @RequestParam(value = "ticketPrice", required = true) ticketPrice: kotlin.Long,
        @NotNull @Parameter(description = "The retail/full price cost of the offer in real currency", required = true) @Valid @RequestParam(value = "fullPrice", required = true) fullPrice: kotlin.Double,
        @NotNull @Parameter(description = "The cost of the offer at a discounted price (what the consumer pays)", required = true) @Valid @RequestParam(value = "discountPrice", required = true) discountPrice: kotlin.Double,
        @NotNull @Parameter(description = "The special offer type {ALL, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW}", required = true, schema = Schema(allowableValues = ["ALL", "RESERVABLE", "REGULAR_OFFER", "ACT_NOW", "GET_THERE_NOW", "SQOOT", "TICKETS", "YIPIT"])) @Valid @RequestParam(value = "specialOfferType", required = true) specialOfferType: kotlin.String,
        @NotNull @Parameter(description = "The offer visibility {PUBLIC, REWARDABLE, TRIGGERABLE}", required = true, schema = Schema(allowableValues = ["PUBLIC", "LISTABLE", "REWARDABLE", "TRIGGERABLE", "PRIVATE"])) @Valid @RequestParam(value = "offerVisibility", required = true) offerVisibility: kotlin.String,
        @NotNull @Parameter(description = "Sets the active flag", required = true) @Valid @RequestParam(value = "active", required = true) active: kotlin.Boolean,
        @Parameter(description = "Comma separated list of retailer location ids. This will assign the offer to these retailer locations.") @Valid @RequestParam(value = "retailerLocationIds", required = false) retailerLocationIds: kotlin.String?,
        @Parameter(description = "The sub title (255 char limit)") @Valid @RequestParam(value = "subTitle", required = false) subTitle: kotlin.String?,
        @Parameter(description = "The details of the media") @Valid @RequestParam(value = "details", required = false) details: kotlin.String?,
        @Parameter(description = "A string for custom details (255 char limit)") @Valid @RequestParam(value = "subDetails", required = false) subDetails: kotlin.String?,
        @Parameter(description = "The fine print of the media") @Valid @RequestParam(value = "finePrint", required = false) finePrint: kotlin.String?,
        @Parameter(description = "The bar code entry string") @Valid @RequestParam(value = "barcodeEntry", required = false) barcodeEntry: kotlin.String?,
        @Parameter(description = "An external identifier. What the identifier will be used for and how it is formatted is up to the frontend developer") @Valid @RequestParam(value = "externalRedeemOptions", required = false) externalRedeemOptions: kotlin.String?,
        @Parameter(description = "The clickUrl of the offer") @Valid @RequestParam(value = "externalUrl", required = false) externalUrl: kotlin.String?,
        @Parameter(description = "The type of ticket to reward, null means default type") @Valid @RequestParam(value = "ticketsRewardType", required = false) ticketsRewardType: kotlin.String?,
        @Parameter(description = "Determines how many tickets are awarded") @Valid @RequestParam(value = "ticketsReward", required = false) ticketsReward: kotlin.Long?,
        @Parameter(description = "The date of when the offer will be visible to consumers") @Valid @RequestParam(value = "activated", required = false) activated: kotlin.Long?,
        @Parameter(description = "The date of when the offer expires") @Valid @RequestParam(value = "expires", required = false) expires: kotlin.Long?,
        @Parameter(description = "the type of ticket needed to buy offer") @Valid @RequestParam(value = "ticketPriceType", required = false) ticketPriceType: kotlin.String?,
        @Parameter(description = "show how many of the media is remaining (if there is a limit)") @Valid @RequestParam(value = "showRemaining", required = false) showRemaining: kotlin.Boolean?,
        @Parameter(description = "show how many of the media has been redeemed") @Valid @RequestParam(value = "showRedeemed", required = false) showRedeemed: kotlin.Boolean?,
        @Parameter(description = "if the media has been replaced") @Valid @RequestParam(value = "replaced", required = false) replaced: kotlin.Boolean?,
        @Parameter(description = "if the media should be featured or not") @Valid @RequestParam(value = "featured", required = false) featured: kotlin.Boolean?,
        @Parameter(description = "Comma separated list of category ids") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "Comma separated list of filter ids") @Valid @RequestParam(value = "filterIds", required = false) filterIds: kotlin.String?,
        @Parameter(description = "The id of the barcode asset") @Valid @RequestParam(value = "barcodeAssetId", required = false) barcodeAssetId: kotlin.Long?,
        @Parameter(description = "The id of the an offer asset") @Valid @RequestParam(value = "imageAssetId", required = false) imageAssetId: kotlin.Long?,
        @Parameter(description = "The id of the an offer asset") @Valid @RequestParam(value = "imageAssetId1", required = false) imageAssetId1: kotlin.Long?,
        @Parameter(description = "The id of the an offer asset") @Valid @RequestParam(value = "imageAssetId2", required = false) imageAssetId2: kotlin.Long?,
        @Parameter(description = "The id of the an offer asset") @Valid @RequestParam(value = "imageAssetId3", required = false) imageAssetId3: kotlin.Long?,
        @Parameter(description = "The id of the an offer asset") @Valid @RequestParam(value = "imageAssetId4", required = false) imageAssetId4: kotlin.Long?,
        @Parameter(description = "The id of the an offer asset") @Valid @RequestParam(value = "imageAssetId5", required = false) imageAssetId5: kotlin.Long?,
        @Parameter(description = "The maker of the item.") @Valid @RequestParam(value = "publisher", required = false) publisher: kotlin.String?,
        @Parameter(description = "The redeemable start date/time of the offer.") @Valid @RequestParam(value = "redeemableStart", required = false) redeemableStart: kotlin.Long?,
        @Parameter(description = "The redeemable start date/time of the offer.") @Valid @RequestParam(value = "redeemableEnd", required = false) redeemableEnd: kotlin.Long?,
        @Parameter(description = "The condition type of the media", schema = Schema(allowableValues = ["NEW", "USED", "REFURBISHED", "OTHER"])) @Valid @RequestParam(value = "conditionType", required = false) conditionType: kotlin.String?,
        @Parameter(description = "The ISBN id") @Valid @RequestParam(value = "isbn", required = false) isbn: kotlin.String?,
        @Parameter(description = "The ASIN id") @Valid @RequestParam(value = "asin", required = false) asin: kotlin.String?,
        @Parameter(description = "The list of catelog numbers, comma seperated") @Valid @RequestParam(value = "catalogNumbers", required = false) catalogNumbers: kotlin.String?,
        @Parameter(description = "The parental control rating") @Valid @RequestParam(value = "parentalRating", required = false) parentalRating: kotlin.String?,
        @Parameter(description = "The date the media is available to use") @Valid @RequestParam(value = "availabilityDate", required = false) availabilityDate: kotlin.Long?,
        @Parameter(description = "the media type", schema = Schema(allowableValues = ["APK", "APPLICATION", "IMAGE", "AUDIO", "VIDEO", "MULTIPART", "BAR_CODE", "TEXT", "OTHER"])) @Valid @RequestParam(value = "mediaType", required = false) mediaType: kotlin.String?,
        @Parameter(description = "The total playing time of the media item") @Valid @RequestParam(value = "duration", required = false) duration: kotlin.Int?,
        @Parameter(description = "The created/author of the media item") @Valid @RequestParam(value = "author", required = false) author: kotlin.String?,
        @Parameter(description = "The date/time of when the media item was originally released") @Valid @RequestParam(value = "releaseDate", required = false) releaseDate: kotlin.Long?,
        @Parameter(description = "the IDs of the collections this media should be assigned to") @Valid @RequestParam(value = "collectionIds", required = false) collectionIds: kotlin.String?,
        @Parameter(description = "ability to assign if this media should active or not") @Valid @RequestParam(value = "availability", required = false) availability: kotlin.String?,
        @Parameter(description = "ability to assign when the media expires") @Valid @RequestParam(value = "availabilitySummary", required = false) availabilitySummary: kotlin.String?
    ): ResponseEntity<MediaOfferResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Media",
        operationId = "deleteMedia",
        description = """Delete a media offering that the user has permissions to.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/media/delete"
        value = [PATH_DELETE_MEDIA],
        produces = ["*/*"]
    )
    fun deleteMedia(
        @NotNull @Parameter(description = "the id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the ID of the media to delete", required = true) @Valid @RequestParam(value = "mediaId", required = true) mediaId: kotlin.Long
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Media Get",
        operationId = "getMedia",
        description = """Get a media offering.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = MediaOfferResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/media/get"
        value = [PATH_GET_MEDIA],
        produces = ["*/*"]
    )
    fun getMedia(
        @NotNull @Parameter(description = "the id of the logged in user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the media to get", required = true) @Valid @RequestParam(value = "mediaId", required = true) mediaId: kotlin.Long
    ): ResponseEntity<MediaOfferResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Media",
        operationId = "searchMedia",
        description = """Searches on events that the account has access to.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = MediaOfferResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/media/search"
        value = [PATH_SEARCH_MEDIA],
        produces = ["*/*"]
    )
    fun searchMedia(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "Return only active results", required = true) @Valid @RequestParam(value = "activeOnly", required = true) activeOnly: kotlin.Boolean,
        @NotNull @Parameter(description = "The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY, AVAILABILITY_DATE, RELEASE_DATE", required = true, schema = Schema(allowableValues = ["ID", "CREATED", "UPDATED", "DELETED", "SEARCH_TAGS", "ACTIVE", "ACTIVATED", "EXPIRES", "REDEEMABLE_START", "REDEEMABLE_END", "TITLE", "SUBTITLE", "DETAILS", "OFFER_TYPE", "SPECIAL_OFFER_TYPE", "OFFER_VISIBILITY", "ESTIMATED_VALUE", "VOUCHER_PRICE", "VOUCHER_DISCOUNT_PRICE", "FULL_PRICE", "DICOUNT_PRICE", "TICKETS_REWARD", "AVAILABILITY_DATE", "RELEASE_DATE", "RETAILER_ID", "RETAILER_NAME", "RETAILER_LOCATION_ID", "RETAILER_LOCATION_NAME", "BILLABLE_ENTITY_ID", "BILLABLE_ENTITY_NAME", "RESPONSIBLE_DISPLAY"])) @Valid @RequestParam(value = "sortField", required = true) sortField: kotlin.String,
        @NotNull @Parameter(description = "The order to return the search results", required = true) @Valid @RequestParam(value = "descending", required = true) descending: kotlin.Boolean,
        @Parameter(description = "The keyword used to search") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "filterIds", required = false) filterIds: kotlin.String?,
        @Parameter(description = "The record to begin the return set on") @Valid @RequestParam(value = "start", required = false) start: kotlin.Int?,
        @Parameter(description = "The number of records to return") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?
    ): ResponseEntity<List<MediaOfferResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Media",
        operationId = "updateMedia",
        description = """Update a media offering.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = MediaOfferResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/media/update"
        value = [PATH_UPDATE_MEDIA],
        produces = ["*/*"]
    )
    fun updateMedia(
        @NotNull @Parameter(description = "The account used to perform the update, must have rights to edit the offer (deviceId or accountId required)", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "mediaId", required = true) mediaId: kotlin.Long,
        @Parameter(description = "Comma separated list of retailer location ids. This will assign the offer to these retailer locations.") @Valid @RequestParam(value = "retailerLocationIds", required = false) retailerLocationIds: kotlin.String?,
        @Parameter(description = "A list of json data that has offer location specific values.") @Valid @RequestParam(value = "offerLocations", required = false) offerLocations: kotlin.String?,
        @Parameter(description = "The title (255 char limit)") @Valid @RequestParam(value = "title", required = false) title: kotlin.String?,
        @Parameter(description = "The sub title (255 char limit)") @Valid @RequestParam(value = "subTitle", required = false) subTitle: kotlin.String?,
        @Parameter(description = "The details") @Valid @RequestParam(value = "details", required = false) details: kotlin.String?,
        @Parameter(description = "A string for custom details (255 char limit)") @Valid @RequestParam(value = "subDetails", required = false) subDetails: kotlin.String?,
        @Parameter(description = "The fine print") @Valid @RequestParam(value = "finePrint", required = false) finePrint: kotlin.String?,
        @Parameter(description = "The bar code type {NONE, UPC, CODE_128, QR, CUSTOM_MEDIA}", schema = Schema(allowableValues = ["NONE", "UPC", "CODE_128", "QR", "CUSTOM_MEDIA"])) @Valid @RequestParam(value = "barcodeType", required = false) barcodeType: kotlin.String?,
        @Parameter(description = "The bar code entry string") @Valid @RequestParam(value = "barcodeEntry", required = false) barcodeEntry: kotlin.String?,
        @Parameter(description = "An external identifier. What the identifier will be used for and how it is formatted is up to the frontend developer.") @Valid @RequestParam(value = "externalRedeemOptions", required = false) externalRedeemOptions: kotlin.String?,
        @Parameter(description = "The clickUrl of the offer") @Valid @RequestParam(value = "externalUrl", required = false) externalUrl: kotlin.String?,
        @Parameter(description = "The type of ticket to reward, null means default type") @Valid @RequestParam(value = "ticketsRewardType", required = false) ticketsRewardType: kotlin.String?,
        @Parameter(description = "Determines how many tickets are awarded") @Valid @RequestParam(value = "ticketsReward", required = false) ticketsReward: kotlin.Long?,
        @Parameter(description = "The date of when the offer will be visible to consumers") @Valid @RequestParam(value = "activated", required = false) activated: kotlin.Long?,
        @Parameter(description = "The date of when the offer expires") @Valid @RequestParam(value = "expires", required = false) expires: kotlin.Long?,
        @Parameter(description = "Overrides the expiration date so that the offer does not expire") @Valid @RequestParam(value = "noExpiration", required = false) noExpiration: kotlin.Boolean?,
        @Parameter(description = "The limit of how many times the offer can be used by consumers") @Valid @RequestParam(value = "availableLimit", required = false) availableLimit: kotlin.Int?,
        @Parameter(description = "The limit of how many times a user can used the same offer") @Valid @RequestParam(value = "availableLimitPerUser", required = false) availableLimitPerUser: kotlin.Int?,
        @Parameter(description = "The limit of how many times the offer can be added to consumer wallets") @Valid @RequestParam(value = "addedLimit", required = false) addedLimit: kotlin.Int?,
        @Parameter(description = "") @Valid @RequestParam(value = "viewLimit", required = false) viewLimit: kotlin.Int?,
        @Parameter(description = "The maximum number of times the offer can be printed") @Valid @RequestParam(value = "maxPrints", required = false) maxPrints: kotlin.Int?,
        @Parameter(description = "the type of ticket needed to buy the offer") @Valid @RequestParam(value = "ticketPriceType", required = false) ticketPriceType: kotlin.String?,
        @Parameter(description = "The cost of the offer in tickets") @Valid @RequestParam(value = "ticketPrice", required = false) ticketPrice: kotlin.Long?,
        @Parameter(description = "The retail/full price cost of the offer in real currency") @Valid @RequestParam(value = "fullPrice", required = false) fullPrice: kotlin.Double?,
        @Parameter(description = "The cost of the offer at a discounted price (what the consumer pays)") @Valid @RequestParam(value = "discountPrice", required = false) discountPrice: kotlin.Double?,
        @Parameter(description = "The show remaining") @Valid @RequestParam(value = "showRemaining", required = false) showRemaining: kotlin.Boolean?,
        @Parameter(description = "The show redeemed") @Valid @RequestParam(value = "showRedeemed", required = false) showRedeemed: kotlin.Boolean?,
        @Parameter(description = "The replaced") @Valid @RequestParam(value = "replaced", required = false) replaced: kotlin.Boolean?,
        @Parameter(description = "The featured") @Valid @RequestParam(value = "featured", required = false) featured: kotlin.Boolean?,
        @Parameter(description = "The special offer type {ALL, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW}", schema = Schema(allowableValues = ["ALL", "RESERVABLE", "REGULAR_OFFER", "ACT_NOW", "GET_THERE_NOW", "SQOOT", "TICKETS", "YIPIT"])) @Valid @RequestParam(value = "specialOfferType", required = false) specialOfferType: kotlin.String?,
        @Parameter(description = "The offer visibility {PUBLIC, REWARDABLE, TRIGGERABLE}", schema = Schema(allowableValues = ["PUBLIC", "LISTABLE", "REWARDABLE", "TRIGGERABLE", "PRIVATE"])) @Valid @RequestParam(value = "offerVisibility", required = false) offerVisibility: kotlin.String?,
        @Parameter(description = "Comma separated list of category ids") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "Comma separated list of filter ids") @Valid @RequestParam(value = "filterIds", required = false) filterIds: kotlin.String?,
        @Parameter(description = "Sets the active flag") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "The id of the barcode asset") @Valid @RequestParam(value = "barcodeAssetId", required = false) barcodeAssetId: kotlin.Long?,
        @Parameter(description = "The id of the an offer asset") @Valid @RequestParam(value = "imageAssetId", required = false) imageAssetId: kotlin.Long?,
        @Parameter(description = "The id of the an offer asset") @Valid @RequestParam(value = "imageAssetId1", required = false) imageAssetId1: kotlin.Long?,
        @Parameter(description = "The id of the an offer asset") @Valid @RequestParam(value = "imageAssetId2", required = false) imageAssetId2: kotlin.Long?,
        @Parameter(description = "The id of the an offer asset") @Valid @RequestParam(value = "imageAssetId3", required = false) imageAssetId3: kotlin.Long?,
        @Parameter(description = "The id of the an offer asset") @Valid @RequestParam(value = "imageAssetId4", required = false) imageAssetId4: kotlin.Long?,
        @Parameter(description = "The id of the an offer asset") @Valid @RequestParam(value = "imageAssetId5", required = false) imageAssetId5: kotlin.Long?,
        @Parameter(description = "The maker of the item.") @Valid @RequestParam(value = "publisher", required = false) publisher: kotlin.String?,
        @Parameter(description = "The redeemable start date/time of the offer.") @Valid @RequestParam(value = "redeemableStart", required = false) redeemableStart: kotlin.Long?,
        @Parameter(description = "The redeemable start date/time of the offer.") @Valid @RequestParam(value = "redeemableEnd", required = false) redeemableEnd: kotlin.Long?,
        @Parameter(description = "The condition. OfferType PRODUCT only.", schema = Schema(allowableValues = ["NEW", "USED", "REFURBISHED", "OTHER"])) @Valid @RequestParam(value = "conditionType", required = false) conditionType: kotlin.String?,
        @Parameter(description = "The ISBN id. OfferType PRODUCT only.") @Valid @RequestParam(value = "isbn", required = false) isbn: kotlin.String?,
        @Parameter(description = "The ASIN id. OfferType PRODUCT only.") @Valid @RequestParam(value = "asin", required = false) asin: kotlin.String?,
        @Parameter(description = "The list of catelog numbers, comma seperated. OfferType PRODUCT only.") @Valid @RequestParam(value = "catalogNumbers", required = false) catalogNumbers: kotlin.String?,
        @Parameter(description = "The date available. OfferType PRODUCT only.") @Valid @RequestParam(value = "availabilityDate", required = false) availabilityDate: kotlin.Long?,
        @Parameter(description = "The parental control rating. OfferType PRODUCT only.") @Valid @RequestParam(value = "parentalRating", required = false) parentalRating: kotlin.String?,
        @Parameter(description = "", schema = Schema(allowableValues = ["APK", "APPLICATION", "IMAGE", "AUDIO", "VIDEO", "MULTIPART", "BAR_CODE", "TEXT", "OTHER"])) @Valid @RequestParam(value = "mediaType", required = false) mediaType: kotlin.String?,
        @Parameter(description = "The total playing time of the media item. OfferType MEDIA only.") @Valid @RequestParam(value = "duration", required = false) duration: kotlin.Int?,
        @Parameter(description = "The created/author of the media item. OfferType MEDIA only.") @Valid @RequestParam(value = "author", required = false) author: kotlin.String?,
        @Parameter(description = "The date/time of when the media item was originally released. OfferType MEDIA only.") @Valid @RequestParam(value = "releaseDate", required = false) releaseDate: kotlin.Long?,
        @Parameter(description = "") @Valid @RequestParam(value = "collectionIds", required = false) collectionIds: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "availability", required = false) availability: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "availabilitySummary", required = false) availabilitySummary: kotlin.String?
    ): ResponseEntity<MediaOfferResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_MEDIA: String = "/media/create"
        const val PATH_DELETE_MEDIA: String = "/media/delete"
        const val PATH_GET_MEDIA: String = "/media/get"
        const val PATH_SEARCH_MEDIA: String = "/media/search"
        const val PATH_UPDATE_MEDIA: String = "/media/update"
    }
}
