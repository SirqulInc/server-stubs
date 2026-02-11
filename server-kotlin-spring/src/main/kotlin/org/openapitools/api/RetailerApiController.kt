package org.openapitools.api

import org.openapitools.model.AccountLoginResponse
import org.openapitools.model.OfferResponse
import org.openapitools.model.OfferShortResponse
import org.openapitools.model.OfferTransactionResponse
import org.openapitools.model.RetailerFullResponse
import org.openapitools.model.RetailerLocationResponse
import org.openapitools.model.RetailerOfferResponse
import org.openapitools.model.RetailerResponse
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
class RetailerApiController() {

    @Operation(
        summary = "Update Offer Locations",
        operationId = "batchUpdateOfferLocations",
        description = """Batch update offer locations.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/retailer/offer/location/batchUpdate"
        value = [PATH_BATCH_UPDATE_OFFER_LOCATIONS],
        produces = ["*/*"]
    )
    fun batchUpdateOfferLocations(
        @NotNull @Parameter(description = "JSON string in the following format: ```json [{   \"offerLocationId\": 1705,   \"latitude\": 54.0,   \"longitude\": -122.0,   \"altitude\": 1.0,   \"locationDetail\": \"floor 1\",   \"locationDescription\": \"behind the Coke sign\" }, {   \"offerLocationId\": 1704,   \"latitude\": 54.1,   \"longitude\": -122.1 }] ``` ", required = true) @Valid @RequestParam(value = "data", required = true) `data`: kotlin.String,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Offer",
        operationId = "createOffer",
        description = """Create an offer and assign it to the provided retailer locations.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = RetailerOfferResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/retailer/offer/create"
        value = [PATH_CREATE_OFFER],
        produces = ["*/*"]
    )
    fun createOffer(
        @NotNull @Parameter(description = "If true return all the offer locations associated with the offer", required = true) @Valid @RequestParam(value = "includeOfferLocations", required = true) includeOfferLocations: kotlin.Boolean,
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
        @NotNull @Parameter(description = "The offer type {VOUCHER, COUPON, PRODUCT, EVENT, MEDIA, DEVICE}", required = true, schema = Schema(allowableValues = ["VOUCHER", "COUPON", "PRODUCT", "MEDIA", "EVENT", "DEVICE"])) @Valid @RequestParam(value = "offerType", required = true) offerType: kotlin.String,
        @NotNull @Parameter(description = "The special offer type {ALL, REGULAR_OFFER, ACT_NOW, GET_THERE_NOW}", required = true, schema = Schema(allowableValues = ["ALL", "RESERVABLE", "REGULAR_OFFER", "ACT_NOW", "GET_THERE_NOW", "SQOOT", "TICKETS", "YIPIT"])) @Valid @RequestParam(value = "specialOfferType", required = true) specialOfferType: kotlin.String,
        @NotNull @Parameter(description = "The offer visibility {PUBLIC, REWARDABLE, TRIGGERABLE}", required = true, schema = Schema(allowableValues = ["PUBLIC", "LISTABLE", "REWARDABLE", "TRIGGERABLE", "PRIVATE"])) @Valid @RequestParam(value = "offerVisibility", required = true) offerVisibility: kotlin.String,
        @NotNull @Parameter(description = "Sets the active flag", required = true) @Valid @RequestParam(value = "active", required = true) active: kotlin.Boolean,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "Custom string field for doing full-text searches") @Valid @RequestParam(value = "tags", required = false) tags: kotlin.String?,
        @Parameter(description = "the parent offer id") @Valid @RequestParam(value = "parentOfferId", required = false) parentOfferId: kotlin.Long?,
        @Parameter(description = "Comma separated list of retailer location ids. This will assign the offer to these retailer locations.") @Valid @RequestParam(value = "retailerLocationIds", required = false) retailerLocationIds: kotlin.String?,
        @Parameter(description = "A list of json data that has offer location specific values.") @Valid @RequestParam(value = "offerLocations", required = false) offerLocations: kotlin.String?,
        @Parameter(description = "The sub title (255 char limit)") @Valid @RequestParam(value = "subTitle", required = false) subTitle: kotlin.String?,
        @Parameter(description = "The details") @Valid @RequestParam(value = "details", required = false) details: kotlin.String?,
        @Parameter(description = "A string for custom details (255 char limit)") @Valid @RequestParam(value = "subDetails", required = false) subDetails: kotlin.String?,
        @Parameter(description = "The fine print") @Valid @RequestParam(value = "finePrint", required = false) finePrint: kotlin.String?,
        @Parameter(description = "The bar code entry string") @Valid @RequestParam(value = "barcodeEntry", required = false) barcodeEntry: kotlin.String?,
        @Parameter(description = "An external identifier. What the identifier will be used for and how it is formatted is up to the frontend developer") @Valid @RequestParam(value = "externalRedeemOptions", required = false) externalRedeemOptions: kotlin.String?,
        @Parameter(description = "The clickUrl of the offer") @Valid @RequestParam(value = "externalUrl", required = false) externalUrl: kotlin.String?,
        @Parameter(description = "an external identifier. What the identifier will be used for and how it is formatted is up to the frontend developer") @Valid @RequestParam(value = "externalId", required = false) externalId: kotlin.String?,
        @Parameter(description = "The type of ticket to reward, null means default type") @Valid @RequestParam(value = "ticketsRewardType", required = false) ticketsRewardType: kotlin.String?,
        @Parameter(description = "Determines how many tickets are awarded") @Valid @RequestParam(value = "ticketsReward", required = false) ticketsReward: kotlin.Long?,
        @Parameter(description = "The date of when the offer will be visible to consumers") @Valid @RequestParam(value = "activated", required = false) activated: kotlin.Long?,
        @Parameter(description = "The date of when the offer expires") @Valid @RequestParam(value = "expires", required = false) expires: kotlin.Long?,
        @Parameter(description = "the type of ticket needed to buy offer") @Valid @RequestParam(value = "ticketPriceType", required = false) ticketPriceType: kotlin.String?,
        @Parameter(description = "show remaining offers available") @Valid @RequestParam(value = "showRemaining", required = false) showRemaining: kotlin.Boolean?,
        @Parameter(description = "show how many offers have been redeemed") @Valid @RequestParam(value = "showRedeemed", required = false) showRedeemed: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "replaced", required = false) replaced: kotlin.Boolean?,
        @Parameter(description = "flag if offer is featured or not") @Valid @RequestParam(value = "featured", required = false) featured: kotlin.Boolean?,
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
        @Parameter(description = "The brand. OfferType PRODUCT only.") @Valid @RequestParam(value = "brand", required = false) brand: kotlin.String?,
        @Parameter(description = "The product type. OfferType PRODUCT only.", schema = Schema(allowableValues = ["APPAREL", "APPLIANCES", "APPS", "ARTS_CRAFTS", "AUTOMOTIVE", "BABY", "BEAUTY", "BOOKS", "CLASSICAL", "COLLECTIBLES", "DVD", "ELECTRONICS", "GIFT_CARDS", "GOURMET_FOOD", "GROCERY", "HEALTH_PERSONAL_CARE", "HOME_GARDEN", "INDUSTRIAL", "JEWELRY", "KITCHEN", "LAWN_GARDEN", "MAGAZINES", "MISCELLANEOUS", "MUSICAL_INSTRUMENTS", "OFFICE_PRODUCTS", "OTHER", "OUTDOOR_LIVING", "PC_HARDWARE", "PET_SUPPLIES", "SHOES", "SOFTWARE", "SPORTING_GOODS", "TOOLS", "TOYS", "VIDEO_GAMES", "WATCHES", "WIRELESS", "WIRELESS_ACCESSORIES"])) @Valid @RequestParam(value = "productType", required = false) productType: kotlin.String?,
        @Parameter(description = "The condition. OfferType PRODUCT only.", schema = Schema(allowableValues = ["NEW", "USED", "REFURBISHED", "OTHER"])) @Valid @RequestParam(value = "conditionType", required = false) conditionType: kotlin.String?,
        @Parameter(description = "The ISBN id. OfferType PRODUCT only.") @Valid @RequestParam(value = "isbn", required = false) isbn: kotlin.String?,
        @Parameter(description = "The ASIN id. OfferType PRODUCT only.") @Valid @RequestParam(value = "asin", required = false) asin: kotlin.String?,
        @Parameter(description = "The list of catelog numbers, comma seperated. OfferType PRODUCT only.") @Valid @RequestParam(value = "catalogNumbers", required = false) catalogNumbers: kotlin.String?,
        @Parameter(description = "The department name. The OfferType PRODUCT only.") @Valid @RequestParam(value = "department", required = false) department: kotlin.String?,
        @Parameter(description = "The list of features, comma seperated. OfferType PRODUCT only.") @Valid @RequestParam(value = "features", required = false) features: kotlin.String?,
        @Parameter(description = "The MAP price. OfferType PRODUCT only.") @Valid @RequestParam(value = "minimumPrice", required = false) minimumPrice: kotlin.Double?,
        @Parameter(description = "The width of the item. OfferType PRODUCT only.") @Valid @RequestParam(value = "width", required = false) width: kotlin.Double?,
        @Parameter(description = "The height of the item. OfferType PRODUCT only.") @Valid @RequestParam(value = "height", required = false) height: kotlin.Double?,
        @Parameter(description = "The depth of the item. OfferType PRODUCT only.") @Valid @RequestParam(value = "depth", required = false) depth: kotlin.Double?,
        @Parameter(description = "The weight of the item. OfferType PRODUCT only.") @Valid @RequestParam(value = "weight", required = false) weight: kotlin.Double?,
        @Parameter(description = "The unit of measurement. OfferType PRODUCT only.", schema = Schema(allowableValues = ["MILIMETER", "CENTIMETER", "METER", "INCH", "FOOT", "YARD"])) @Valid @RequestParam(value = "unit", required = false) unit: kotlin.String?,
        @Parameter(description = "The studio name. OfferType PRODUCT only.") @Valid @RequestParam(value = "studio", required = false) studio: kotlin.String?,
        @Parameter(description = "The parental control rating. OfferType PRODUCT only.") @Valid @RequestParam(value = "parentalRating", required = false) parentalRating: kotlin.String?,
        @Parameter(description = "The date published. OfferType PRODUCT only.") @Valid @RequestParam(value = "publishDate", required = false) publishDate: kotlin.Long?,
        @Parameter(description = "The date available. OfferType PRODUCT only.") @Valid @RequestParam(value = "availabilityDate", required = false) availabilityDate: kotlin.Long?,
        @Parameter(description = "") @Valid @RequestParam(value = "sizeId", required = false) sizeId: kotlin.Long?,
        @Parameter(description = "The ID of the event listing") @Valid @RequestParam(value = "listingId", required = false) listingId: kotlin.Long?,
        @Parameter(description = "the media type of the offer", schema = Schema(allowableValues = ["APK", "APPLICATION", "IMAGE", "AUDIO", "VIDEO", "MULTIPART", "BAR_CODE", "TEXT", "OTHER"])) @Valid @RequestParam(value = "mediaType", required = false) mediaType: kotlin.String?,
        @Parameter(description = "The total playing time of the media item. OfferType MEDIA only.") @Valid @RequestParam(value = "duration", required = false) duration: kotlin.Int?,
        @Parameter(description = "The created/author of the media item. OfferType MEDIA only.") @Valid @RequestParam(value = "author", required = false) author: kotlin.String?,
        @Parameter(description = "The date/time of when the media item was originally released. OfferType MEDIA only.") @Valid @RequestParam(value = "releaseDate", required = false) releaseDate: kotlin.Long?,
        @Parameter(description = "") @Valid @RequestParam(value = "collectionIds", required = false) collectionIds: kotlin.String?,
        @Parameter(description = "The reboot hour time ranging from 0 to 23") @Valid @RequestParam(value = "rebootTimeHour", required = false) rebootTimeHour: kotlin.Int?,
        @Parameter(description = "The reboot minute time ranging from 0 to 59") @Valid @RequestParam(value = "rebootTimeMinute", required = false) rebootTimeMinute: kotlin.Int?,
        @Parameter(description = "If the device is idle for idleTimeoutInSecond then the device should timeout") @Valid @RequestParam(value = "idleTimeoutInSecond", required = false) idleTimeoutInSecond: kotlin.Int?,
        @Parameter(description = "The serial number on the device") @Valid @RequestParam(value = "serialNumber", required = false) serialNumber: kotlin.String?,
        @Parameter(description = "The unique device id for the device") @Valid @RequestParam(value = "udid", required = false) udid: kotlin.String?,
        @Parameter(description = "The type of the device, for example: \"Kiosk\", \"Beacon\".") @Valid @RequestParam(value = "deviceType", required = false) deviceType: kotlin.String?,
        @Parameter(description = "Edysen device power level setting") @Valid @RequestParam(value = "devicePower", required = false) devicePower: kotlin.Double?,
        @Parameter(description = "Edysen device inteference setting") @Valid @RequestParam(value = "deviceInterference", required = false) deviceInterference: kotlin.Double?,
        @Parameter(description = "") @Valid @RequestParam(value = "availability", required = false) availability: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "availabilitySummary", required = false) availabilitySummary: kotlin.String?
    ): ResponseEntity<RetailerOfferResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Retailer",
        operationId = "createRetailer",
        description = """Create a retailer record. A billable entity must be created first before a retailer record can be made.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = RetailerFullResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/retailer/create"
        value = [PATH_CREATE_RETAILER],
        produces = ["*/*"]
    )
    fun createRetailer(
        @NotNull @Parameter(description = "The name of the retailer", required = true) @Valid @RequestParam(value = "name", required = true) name: kotlin.String,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The street address of the retailer") @Valid @RequestParam(value = "streetAddress", required = false) streetAddress: kotlin.String?,
        @Parameter(description = "Additional address information (such as a suite number, floor number, building name, or PO Box)") @Valid @RequestParam(value = "streetAddress2", required = false) streetAddress2: kotlin.String?,
        @Parameter(description = "The city of the retailer") @Valid @RequestParam(value = "city", required = false) city: kotlin.String?,
        @Parameter(description = "The state of the retailer") @Valid @RequestParam(value = "state", required = false) state: kotlin.String?,
        @Parameter(description = "The postal code of the retailer") @Valid @RequestParam(value = "postalCode", required = false) postalCode: kotlin.String?,
        @Parameter(description = "the country of the retailer") @Valid @RequestParam(value = "country", required = false) country: kotlin.String?,
        @Parameter(description = "The business phone number of the retailer") @Valid @RequestParam(value = "businessPhone", required = false) businessPhone: kotlin.String?,
        @Parameter(description = "The business phone extension of the retailer") @Valid @RequestParam(value = "businessPhoneExt", required = false) businessPhoneExt: kotlin.String?,
        @Parameter(description = "The website of the retailer") @Valid @RequestParam(value = "website", required = false) website: kotlin.String?,
        @Parameter(description = "The email of the retailer") @Valid @RequestParam(value = "email", required = false) email: kotlin.String?,
        @Parameter(description = "The facebook URL of the retailer") @Valid @RequestParam(value = "facebookUrl", required = false) facebookUrl: kotlin.String?,
        @Parameter(description = "The twitter URL of the retailer") @Valid @RequestParam(value = "twitterUrl", required = false) twitterUrl: kotlin.String?,
        @Parameter(description = "The retailer logo sent as a multipart binary file (you can optionally use logoAssetId if the asset has already been uploaded before)") @Valid @RequestParam(value = "logo", required = false) logo: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "The retailer logo asset id") @Valid @RequestParam(value = "logoAssetId", required = false) logoAssetId: kotlin.Long?,
        @Parameter(description = "Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture1AssetId if the asset has already been uploaded before)") @Valid @RequestParam(value = "picture1", required = false) picture1: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "An asset id") @Valid @RequestParam(value = "picture1AssetId", required = false) picture1AssetId: kotlin.Long?,
        @Parameter(description = "Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture2AssetId if the asset has already been uploaded before)") @Valid @RequestParam(value = "picture2", required = false) picture2: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "An asset id") @Valid @RequestParam(value = "picture2AssetId", required = false) picture2AssetId: kotlin.Long?,
        @Parameter(description = "Comma separated list of category IDs used to filter retailers by categories") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "Comma separated list of category IDs to add to the retailer") @Valid @RequestParam(value = "categoryIdsToAdd", required = false) categoryIdsToAdd: kotlin.String?,
        @Parameter(description = "Comma separated list of category IDs to remove from the retailer") @Valid @RequestParam(value = "categoryIdsToRemove", required = false) categoryIdsToRemove: kotlin.String?,
        @Parameter(description = "Comma separated list of filter IDs used to filter retailers") @Valid @RequestParam(value = "filterIds", required = false) filterIds: kotlin.String?,
        @Parameter(description = "the latitude of the retailer") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the longitude of the retailer") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "External custom client defined data") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?,
        @Parameter(description = "External custom search keywords") @Valid @RequestParam(value = "searchTags", required = false) searchTags: kotlin.String?,
        @Parameter(description = "External custom type identifier") @Valid @RequestParam(value = "retailerType", required = false) retailerType: kotlin.String?,
        @Parameter(description = "", schema = Schema(allowableValues = ["PUBLIC", "PRIVATE", "FRIENDS"])) @Valid @RequestParam(value = "visibility", required = false) visibility: kotlin.String?,
        @Parameter(description = "Determines whether to create a default location using the retailer information") @Valid @RequestParam(value = "createDefaultLocation", required = false) createDefaultLocation: kotlin.Boolean?,
        @Parameter(description = "The format of the returned response {JSON // default , HTML // for Dojo support when uploading assets}", schema = Schema(allowableValues = ["HTML", "XML", "JSON", "CSV"])) @Valid @RequestParam(value = "responseFormat", required = false) responseFormat: kotlin.String?
    ): ResponseEntity<RetailerFullResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Retailer Location",
        operationId = "createRetailerLocations",
        description = """Creates a location record for a retailer. Only the owner and the employees of the retailer have access to do this.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = RetailerLocationResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/retailer/location/create"
        value = [PATH_CREATE_RETAILER_LOCATIONS],
        produces = ["*/*"]
    )
    fun createRetailerLocations(
        @NotNull @Parameter(description = "The ID of the retailer", required = true) @Valid @RequestParam(value = "retailerId", required = true) retailerId: kotlin.Long,
        @NotNull @Parameter(description = "The name of the retailer location", required = true) @Valid @RequestParam(value = "name", required = true) name: kotlin.String,
        @NotNull @Parameter(description = "The street address of the retailer location", required = true) @Valid @RequestParam(value = "streetAddress", required = true) streetAddress: kotlin.String,
        @NotNull @Parameter(description = "The city of the retailer location", required = true) @Valid @RequestParam(value = "city", required = true) city: kotlin.String,
        @NotNull @Parameter(description = "The state of the retailer location", required = true) @Valid @RequestParam(value = "state", required = true) state: kotlin.String,
        @NotNull @Parameter(description = "The postal code of the retailer location", required = true) @Valid @RequestParam(value = "postalCode", required = true) postalCode: kotlin.String,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "Additional address information (such as a suite number, floor number, building name, or PO Box)") @Valid @RequestParam(value = "streetAddress2", required = false) streetAddress2: kotlin.String?,
        @Parameter(description = "the country of the retailer location") @Valid @RequestParam(value = "country", required = false) country: kotlin.String?,
        @Parameter(description = "The business phone number of the retailer location") @Valid @RequestParam(value = "businessPhone", required = false) businessPhone: kotlin.String?,
        @Parameter(description = "The business phone extension") @Valid @RequestParam(value = "businessPhoneExt", required = false) businessPhoneExt: kotlin.String?,
        @Parameter(description = "The website of the retailer location") @Valid @RequestParam(value = "website", required = false) website: kotlin.String?,
        @Parameter(description = "The email of the retailer location") @Valid @RequestParam(value = "email", required = false) email: kotlin.String?,
        @Parameter(description = "An internal identifier used by the retailer") @Valid @RequestParam(value = "internalId", required = false) internalId: kotlin.String?,
        @Parameter(description = "A brief description about the retailer location (255 character limit)") @Valid @RequestParam(value = "detailsHeader", required = false) detailsHeader: kotlin.String?,
        @Parameter(description = "A detailed description about the retailer location") @Valid @RequestParam(value = "detailsBody", required = false) detailsBody: kotlin.String?,
        @Parameter(description = "The hours of operation") @Valid @RequestParam(value = "hours", required = false) hours: kotlin.String?,
        @Parameter(description = "The retailer location logo sent as a multipart binary file (you can optionally use logoAssetId if the asset has already been uploaded before)") @Valid @RequestParam(value = "logo", required = false) logo: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "The retailer location logo asset id") @Valid @RequestParam(value = "logoAssetId", required = false) logoAssetId: kotlin.Long?,
        @Parameter(description = "Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture1AssetId if the asset has already been uploaded before)") @Valid @RequestParam(value = "picture1", required = false) picture1: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "An asset id") @Valid @RequestParam(value = "picture1AssetId", required = false) picture1AssetId: kotlin.Long?,
        @Parameter(description = "Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture2AssetId if the asset has already been uploaded before)") @Valid @RequestParam(value = "picture2", required = false) picture2: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "An asset id") @Valid @RequestParam(value = "picture2AssetId", required = false) picture2AssetId: kotlin.Long?,
        @Parameter(description = "Comma separated list of category IDs used to filter retailer locations by categories") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "Comma separated list of filter IDs used to filter retailer locations") @Valid @RequestParam(value = "filterIds", required = false) filterIds: kotlin.String?,
        @Parameter(description = "the latitude of the retailer location") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the longitude of the retailer location") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "") @Valid @RequestParam(value = "building", required = false) building: kotlin.String?,
        @Parameter(description = "the ID of the Google Place that this retailer location is assigned to") @Valid @RequestParam(value = "googlePlaceId", required = false) googlePlaceId: kotlin.String?,
        @Parameter(description = "the Yelp ID that this retailer location is assigned to") @Valid @RequestParam(value = "yelpId", required = false) yelpId: kotlin.String?,
        @Parameter(description = "whether the retailer location should be active or inactive") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "Sets whether the location is public or not") @Valid @RequestParam(value = "publicLocation", required = false) publicLocation: kotlin.Boolean?,
        @Parameter(description = "External custom type identifier") @Valid @RequestParam(value = "locationType", required = false) locationType: kotlin.String?,
        @Parameter(description = "Comma separated list of audience IDs used to assign audiences to the retailer location") @Valid @RequestParam(value = "audienceIds", required = false) audienceIds: kotlin.String?,
        @Parameter(description = "Comma separated list of audience IDs to add to the retailer location") @Valid @RequestParam(value = "audienceIdsToAdd", required = false) audienceIdsToAdd: kotlin.String?,
        @Parameter(description = "Comma separated list of audience IDs to remove from the retailer location") @Valid @RequestParam(value = "audienceIdsToRemove", required = false) audienceIdsToRemove: kotlin.String?,
        @Parameter(description = "The format of the returned response {JSON // default , HTML // for Dojo support when uploading assets}", schema = Schema(allowableValues = ["HTML", "XML", "JSON", "CSV"])) @Valid @RequestParam(value = "responseFormat", required = false) responseFormat: kotlin.String?,
        @Parameter(description = "Comma separated list of response includes (e.g. RETAILER,ASSETS,OFFERS,CATEGORIES,FILTERS,AUDIENCES,QRCODE)") @Valid @RequestParam(value = "responseIncludes", required = false) responseIncludes: kotlin.String?
    ): ResponseEntity<RetailerLocationResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Offer",
        operationId = "deleteOffer",
        description = """Set the deleted timestamp to current time. This effectively deletes the offer since all queries should ignore any records with a deleted time stamp.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/retailer/offer/delete"
        value = [PATH_DELETE_OFFER],
        produces = ["*/*"]
    )
    fun deleteOffer(
        @NotNull @Parameter(description = "The ID of the offer to be deleted", required = true) @Valid @RequestParam(value = "offerId", required = true) offerId: kotlin.Long,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account used to perform the delete, must have rights to edit the offer.") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Offer Location",
        operationId = "deleteOfferLocation",
        description = """Set the deleted timestamp to current time. This effectively deletes the offer location since all queries should ignore any records with a deleted time stamp.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/retailer/offer/location/delete"
        value = [PATH_DELETE_OFFER_LOCATION],
        produces = ["*/*"]
    )
    fun deleteOfferLocation(
        @NotNull @Parameter(description = "The ID of the offer location to be deleted", required = true) @Valid @RequestParam(value = "offerLocationId", required = true) offerLocationId: kotlin.Long,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account used to perform the delete, must have rights to edit the offer location.") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Retailer",
        operationId = "deleteRetailer",
        description = """Set the deleted timestamp to current time.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/retailer/delete"
        value = [PATH_DELETE_RETAILER],
        produces = ["*/*"]
    )
    fun deleteRetailer(
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account used to perform the delete, must have rights to edit the retailer.") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The ID of the retailer to be deleted") @Valid @RequestParam(value = "retailerId", required = false) retailerId: kotlin.Long?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Retailer Location",
        operationId = "deleteRetailerLocation",
        description = """Set the deleted timestamp to current time. This effectively deletes the retailer location since all queries should ignore any records with a deleted time stamp.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/retailer/location/delete"
        value = [PATH_DELETE_RETAILER_LOCATION],
        produces = ["*/*"]
    )
    fun deleteRetailerLocation(
        @Parameter(description = "the device id") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the id of the logged in user") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the id of the retailer location to delete") @Valid @RequestParam(value = "retailerLocationId", required = false) retailerLocationId: kotlin.Long?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Offer",
        operationId = "getOffer",
        description = """Gets the details of an offer that the user has access to.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = RetailerOfferResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/retailer/offer/get"
        value = [PATH_GET_OFFER],
        produces = ["*/*"]
    )
    fun getOffer(
        @NotNull @Parameter(description = "The id of the offer", required = true) @Valid @RequestParam(value = "offerId", required = true) offerId: kotlin.Long,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "includeOfferLocations", required = true) includeOfferLocations: kotlin.Boolean,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?
    ): ResponseEntity<RetailerOfferResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Offer Locations",
        operationId = "getOfferLocationsForRetailers",
        description = """Searches on offer locations, which are records that represent an offer that has been assigned to a retailer location. If an offer does not have any locations assigned, then it will NOT be returned.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = OfferShortResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/retailer/offer/location/search"
        value = [PATH_GET_OFFER_LOCATIONS_FOR_RETAILERS],
        produces = ["*/*"]
    )
    fun getOfferLocationsForRetailers(
        @NotNull @Parameter(description = "The column to sort the results on. Default is \"TITLE\", which will sort the results by the offer title. Possible input values: {CREATED, UPDATED, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, RETAILER_ID,RETAILER_LOCATION_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY}", required = true, schema = Schema(allowableValues = ["ID", "CREATED", "UPDATED", "DELETED", "SEARCH_TAGS", "ACTIVE", "OFFER_ID", "ACTIVATED", "EXPIRES", "TITLE", "SUBTITLE", "DETAILS", "OFFER_TYPE", "SPECIAL_OFFER_TYPE", "OFFER_VISIBILITY", "RETAILER_ID", "RETAILER_LOCATION_ID", "BILLABLE_ENTITY_ID", "BILLABLE_ENTITY_NAME", "RESPONSIBLE_DISPLAY"])) @Valid @RequestParam(value = "sortField", required = true) sortField: kotlin.String,
        @NotNull @Parameter(description = "The order to return the results. Default is false, which will return the results in ascending order.", required = true) @Valid @RequestParam(value = "descending", required = true) descending: kotlin.Boolean,
        @NotNull @Parameter(description = "The index into the record set to start with. Default is 0.", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "The total number of records to return. Default is 20.", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @NotNull @Parameter(description = "Determines whether to return only active results. Default is false.", required = true) @Valid @RequestParam(value = "activeOnly", required = true) activeOnly: kotlin.Boolean,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "includeRetailerLocation", required = true) includeRetailerLocation: kotlin.Boolean,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The keyword used to search") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "Filter results for a specific retailer") @Valid @RequestParam(value = "retailerId", required = false) retailerId: kotlin.Long?,
        @Parameter(description = "Filter results for a specific retailer location") @Valid @RequestParam(value = "retailerLocationId", required = false) retailerLocationId: kotlin.Long?,
        @Parameter(description = "Filter results to only return COUPON, VOUCHER, PRODUCT, MEDIA, or EVENT offers", schema = Schema(allowableValues = ["VOUCHER", "COUPON", "PRODUCT", "MEDIA", "EVENT", "DEVICE"])) @Valid @RequestParam(value = "offerType", required = false) offerType: kotlin.String?,
        @Parameter(description = "Filter results to only return REGULAR_OFFER, ACT_NOW, GET_THERE_NOW offer specials", schema = Schema(allowableValues = ["ALL", "RESERVABLE", "REGULAR_OFFER", "ACT_NOW", "GET_THERE_NOW", "SQOOT", "TICKETS", "YIPIT"])) @Valid @RequestParam(value = "specialOfferType", required = false) specialOfferType: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "barcodeType", required = false) barcodeType: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "barcodeEntry", required = false) barcodeEntry: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "isbn", required = false) isbn: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "asin", required = false) asin: kotlin.String?,
        @Parameter(description = "Edysen device status, running, warning, or down", schema = Schema(allowableValues = ["RUNNING", "WARNING", "DOWN"])) @Valid @RequestParam(value = "deviceStatus", required = false) deviceStatus: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "needsNotificationSent", required = false) needsNotificationSent: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "lastNotificationSent", required = false) lastNotificationSent: kotlin.Long?
    ): ResponseEntity<List<OfferShortResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Offers",
        operationId = "getOffersForRetailers",
        description = """Searches on offers that the account has access to.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = OfferResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/retailer/offer/search"
        value = [PATH_GET_OFFERS_FOR_RETAILERS],
        produces = ["*/*"]
    )
    fun getOffersForRetailers(
        @NotNull @Parameter(description = "", required = true, schema = Schema(allowableValues = ["PUBLIC", "LISTABLE", "REWARDABLE", "TRIGGERABLE", "PRIVATE"])) @Valid @RequestParam(value = "offerVisibility", required = true) offerVisibility: kotlin.String,
        @NotNull @Parameter(description = "The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY", required = true, schema = Schema(allowableValues = ["ID", "CREATED", "UPDATED", "DELETED", "SEARCH_TAGS", "ACTIVE", "ACTIVATED", "EXPIRES", "REDEEMABLE_START", "REDEEMABLE_END", "TITLE", "SUBTITLE", "DETAILS", "OFFER_TYPE", "SPECIAL_OFFER_TYPE", "OFFER_VISIBILITY", "ESTIMATED_VALUE", "VOUCHER_PRICE", "VOUCHER_DISCOUNT_PRICE", "FULL_PRICE", "DICOUNT_PRICE", "TICKETS_REWARD", "AVAILABILITY_DATE", "RELEASE_DATE", "RETAILER_ID", "RETAILER_NAME", "RETAILER_LOCATION_ID", "RETAILER_LOCATION_NAME", "BILLABLE_ENTITY_ID", "BILLABLE_ENTITY_NAME", "RESPONSIBLE_DISPLAY"])) @Valid @RequestParam(value = "sortField", required = true) sortField: kotlin.String,
        @NotNull @Parameter(description = "The order to return the search results", required = true) @Valid @RequestParam(value = "descending", required = true) descending: kotlin.Boolean,
        @NotNull @Parameter(description = "The record to begin the return set on", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "The number of records to return", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @NotNull @Parameter(description = "Return only results that are currently being promoted (is activated and not expired)", required = true) @Valid @RequestParam(value = "availableOnly", required = true) availableOnly: kotlin.Boolean,
        @NotNull @Parameter(description = "Return only active results", required = true) @Valid @RequestParam(value = "activeOnly", required = true) activeOnly: kotlin.Boolean,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "includeCategories", required = true) includeCategories: kotlin.Boolean,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "includeFilters", required = true) includeFilters: kotlin.Boolean,
        @NotNull @Parameter(description = "", required = true) @Valid @RequestParam(value = "includeOfferLocations", required = true) includeOfferLocations: kotlin.Boolean,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "filterIds", required = false) filterIds: kotlin.String?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?,
        @Parameter(description = "The keyword used to search") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "the id of the retailer") @Valid @RequestParam(value = "retailerId", required = false) retailerId: kotlin.Long?,
        @Parameter(description = "the id of the retailer location") @Valid @RequestParam(value = "retailerLocationId", required = false) retailerLocationId: kotlin.Long?,
        @Parameter(description = "This parameter is deprecated.", schema = Schema(allowableValues = ["VOUCHER", "COUPON", "PRODUCT", "MEDIA", "EVENT", "DEVICE"])) @Valid @RequestParam(value = "couponType", required = false) couponType: kotlin.String?,
        @Parameter(description = "This parameter is deprecated. Use offer types. Filter results to only return COUPON, VOUCHER, PRODUCT, MEDIA, or EVENT offers", schema = Schema(allowableValues = ["VOUCHER", "COUPON", "PRODUCT", "MEDIA", "EVENT", "DEVICE"])) @Valid @RequestParam(value = "offerType", required = false) offerType: kotlin.String?,
        @Parameter(description = "Comma separated list of offer types {COUPON, VOUCHER, PRODUCT, MEDIA, EVENT, DEVICE}") @Valid @RequestParam(value = "offerTypes", required = false) offerTypes: kotlin.String?,
        @Parameter(description = "Filter results to only return REGULAR_OFFER, ACT_NOW, GET_THERE_NOW offer specials", schema = Schema(allowableValues = ["ALL", "RESERVABLE", "REGULAR_OFFER", "ACT_NOW", "GET_THERE_NOW", "SQOOT", "TICKETS", "YIPIT"])) @Valid @RequestParam(value = "specialOfferType", required = false) specialOfferType: kotlin.String?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "_i", required = false) i: kotlin.Int?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "_l", required = false) l: kotlin.Int?,
        @Parameter(description = "") @Valid @RequestParam(value = "barcodeType", required = false) barcodeType: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "barcodeEntry", required = false) barcodeEntry: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "isbn", required = false) isbn: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "asin", required = false) asin: kotlin.String?,
        @Parameter(description = "Edysen device status", schema = Schema(allowableValues = ["RUNNING", "WARNING", "DOWN"])) @Valid @RequestParam(value = "deviceStatus", required = false) deviceStatus: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "needsNotificationSent", required = false) needsNotificationSent: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "lastNotificationSent", required = false) lastNotificationSent: kotlin.Long?
    ): ResponseEntity<List<OfferResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Retailer",
        operationId = "getRetailer",
        description = """Gets a retailer. Only the owner and the employees of a retailer have access to view its information.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = RetailerFullResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/retailer/get"
        value = [PATH_GET_RETAILER],
        produces = ["*/*"]
    )
    fun getRetailer(
        @NotNull @Parameter(description = "the ID of the retailer", required = true) @Valid @RequestParam(value = "retailerId", required = true) retailerId: kotlin.Long,
        @Parameter(description = "the device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "Determines whether to include counts in the response (default true)") @Valid @RequestParam(value = "includeCounts", required = false) includeCounts: kotlin.Boolean?
    ): ResponseEntity<RetailerFullResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Retailer Location",
        operationId = "getRetailerLocation",
        description = """Gets a retailer location. Only the owner and the employees of the retailer have access to view its information.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = RetailerLocationResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/retailer/location/get"
        value = [PATH_GET_RETAILER_LOCATION],
        produces = ["*/*"]
    )
    fun getRetailerLocation(
        @NotNull @Parameter(description = "The ID of the retailer location", required = true) @Valid @RequestParam(value = "retailerLocationId", required = true) retailerLocationId: kotlin.Long,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the unique token of the retailer location") @Valid @RequestParam(value = "retailerLocationToken", required = false) retailerLocationToken: kotlin.String?
    ): ResponseEntity<RetailerLocationResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Retailers",
        operationId = "getRetailers",
        description = """earches on retailers that the account has access to.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = RetailerResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/retailer/search"
        value = [PATH_GET_RETAILERS],
        produces = ["*/*"]
    )
    fun getRetailers(
        @NotNull @Parameter(description = "", required = true, schema = Schema(allowableValues = ["PUBLIC", "PRIVATE", "FRIENDS"])) @Valid @RequestParam(value = "visibility", required = true) visibility: kotlin.String,
        @NotNull @Parameter(description = "The column to sort the search on", required = true, schema = Schema(allowableValues = ["ID", "CREATED", "UPDATED", "DELETED", "SEARCH_TAGS", "ACTIVE", "BILLABLE_ENTITY_ID", "BILLABLE_ENTITY_NAME", "RESPONSIBLE_DISPLAY", "ADDRESS_STREET", "ADDRESS_CITY", "ADDRESS_STATE", "ADDRESS_POSTAL_CODE", "ADDRESS_COUNTRY", "FILTERS", "CATEGORIES", "VISIBILITY", "NAME"])) @Valid @RequestParam(value = "sortField", required = true) sortField: kotlin.String,
        @NotNull @Parameter(description = "The order to return the search results", required = true) @Valid @RequestParam(value = "descending", required = true) descending: kotlin.Boolean,
        @NotNull @Parameter(description = "The record to begin the return set on", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "The number of records to return", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @NotNull @Parameter(description = "Return only active results", required = true) @Valid @RequestParam(value = "activeOnly", required = true) activeOnly: kotlin.Boolean,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?,
        @Parameter(description = "The keyword used to search") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "the categories that the retailer is associated with") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "the filters that the retailer is associated with") @Valid @RequestParam(value = "filterIds", required = false) filterIds: kotlin.String?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "_i", required = false) i: kotlin.Int?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "_l", required = false) l: kotlin.Int?
    ): ResponseEntity<List<RetailerResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Retailer",
        operationId = "getRetaokiler",
        description = """Gets a retailer. Only the owner and the employees of a retailer have access to view its information.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/retailer"
        value = [PATH_GET_RETAOKILER],
        produces = ["*/*"]
    )
    fun getRetaokiler(
        @NotNull @Parameter(description = "the id of the retailer", required = true) @Valid @RequestParam(value = "retailerId", required = true) retailerId: kotlin.Long,
        @NotNull @Parameter(description = "whether to return results that are active only or all", required = true, schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "activeOnly", required = true, defaultValue = "true") activeOnly: kotlin.Boolean,
        @Parameter(description = "the keyword to search on to get retailer") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "the field to sort on", schema = Schema(defaultValue = "id")) @Valid @RequestParam(value = "sortField", required = false, defaultValue = "id") sortField: kotlin.String,
        @Parameter(description = "the start of the index and/or pagination", schema = Schema(defaultValue = "0L")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0L") start: kotlin.Long,
        @Parameter(description = "the limit of the index and/or pagination", schema = Schema(defaultValue = "20L")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20L") limit: kotlin.Long
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Distance Search Retailer Locations (Indexed)",
        operationId = "indexedRetailerLocationDistanceSearch",
        description = """Retailer location indexed search by distance. This searches on any retailer location with location data and returns the results sorted by distance.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = RetailerLocationResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/retailer/location/idistancesearch"
        value = [PATH_INDEXED_RETAILER_LOCATION_DISTANCE_SEARCH],
        produces = ["*/*"]
    )
    fun indexedRetailerLocationDistanceSearch(
        @NotNull @Parameter(description = "The latitude to center the search on", required = true) @Valid @RequestParam(value = "latitude", required = true) latitude: kotlin.Double,
        @NotNull @Parameter(description = "The longitude to center the search on", required = true) @Valid @RequestParam(value = "longitude", required = true) longitude: kotlin.Double,
        @NotNull @Parameter(description = "The search range in the distanceUnit specified; default is MILES.", required = true) @Valid @RequestParam(value = "searchRange", required = true) searchRange: kotlin.Double,
        @NotNull @Parameter(description = "The start index for pagination", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "The limit for pagination", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @Parameter(description = "The account id of the user") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "Used to return results using this address as the center") @Valid @RequestParam(value = "address", required = false) address: kotlin.String?,
        @Parameter(description = "boolean to indicate whether to include retailer locations that have no offers") @Valid @RequestParam(value = "hasOffers", required = false) hasOffers: kotlin.Boolean?,
        @Parameter(description = "Comma separate list of category ids") @Valid @RequestParam(value = "categories", required = false) categories: kotlin.String?,
        @Parameter(description = "Comma separated list of filter ids") @Valid @RequestParam(value = "filters", required = false) filters: kotlin.String?,
        @Parameter(description = "Comma separated list of audience ids") @Valid @RequestParam(value = "audiences", required = false) audiences: kotlin.String?,
        @Parameter(description = "Comma separated list of retailer ids") @Valid @RequestParam(value = "retailerIds", required = false) retailerIds: kotlin.String?,
        @Parameter(description = "Comma separated list of retailer location ids") @Valid @RequestParam(value = "retailerLocationIds", required = false) retailerLocationIds: kotlin.String?,
        @Parameter(description = "Does a full-text search on tags") @Valid @RequestParam(value = "tags", required = false) tags: kotlin.String?,
        @Parameter(description = "Location type filter") @Valid @RequestParam(value = "locationType", required = false) locationType: kotlin.String?,
        @Parameter(description = "The field to sort the result set on. Possible values include: DISTANCE, RETAILER_NAME, RETAILER_LOCATION_NAME") @Valid @RequestParam(value = "sortField", required = false) sortField: kotlin.String?,
        @Parameter(description = "Determines whether the sorted list is in descending or ascending order") @Valid @RequestParam(value = "descending", required = false) descending: kotlin.Boolean?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?,
        @Parameter(description = "Search by keyword") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "Determines the operator used when there are multiple words in the 'keyword' parameter") @Valid @RequestParam(value = "keywordOperator", required = false) keywordOperator: kotlin.String?,
        @Parameter(description = "Search expression to further refine results") @Valid @RequestParam(value = "searchExpression", required = false) searchExpression: kotlin.String?,
        @Parameter(description = "Unit of distance", schema = Schema(allowableValues = ["MILES", "KILOMETERS"])) @Valid @RequestParam(value = "distanceUnit", required = false) distanceUnit: kotlin.String?,
        @Parameter(description = "(deprecated) return favorited flag") @Valid @RequestParam(value = "returnFavorited", required = false) returnFavorited: kotlin.Boolean?,
        @Parameter(description = "Return retailer info") @Valid @RequestParam(value = "returnRetailer", required = false) returnRetailer: kotlin.Boolean?,
        @Parameter(description = "Return assets") @Valid @RequestParam(value = "returnAssets", required = false) returnAssets: kotlin.Boolean?,
        @Parameter(description = "Return offers") @Valid @RequestParam(value = "returnOffers", required = false) returnOffers: kotlin.Boolean?,
        @Parameter(description = "Return categories") @Valid @RequestParam(value = "returnCategories", required = false) returnCategories: kotlin.Boolean?,
        @Parameter(description = "Return filters") @Valid @RequestParam(value = "returnFilters", required = false) returnFilters: kotlin.Boolean?,
        @Parameter(description = "Return audiences") @Valid @RequestParam(value = "returnAudiences", required = false) returnAudiences: kotlin.Boolean?,
        @Parameter(description = "Return QR code info") @Valid @RequestParam(value = "returnQrCode", required = false) returnQrCode: kotlin.Boolean?,
        @Parameter(description = "Return external category data") @Valid @RequestParam(value = "returnExternalCategoryData", required = false) returnExternalCategoryData: kotlin.Boolean?,
        @Parameter(description = "Include favorites in response") @Valid @RequestParam(value = "includeFavorite", required = false) includeFavorite: kotlin.Boolean?,
        @Parameter(description = "Include liked flag in response") @Valid @RequestParam(value = "includeLiked", required = false) includeLiked: kotlin.Boolean?,
        @Parameter(description = "Include rating info in response") @Valid @RequestParam(value = "includeRating", required = false) includeRating: kotlin.Boolean?
    ): ResponseEntity<List<RetailerLocationResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Keyword Search Retailer Locations (Indexed)",
        operationId = "indexedRetailerLocationSearch",
        description = """Retailer location (faster) indexed search. This searches all retailer locations.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = RetailerLocationResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/retailer/location/isearch"
        value = [PATH_INDEXED_RETAILER_LOCATION_SEARCH],
        produces = ["*/*"]
    )
    fun indexedRetailerLocationSearch(
        @Parameter(description = "The account id of the user") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The start index for pagination") @Valid @RequestParam(value = "start", required = false) start: kotlin.Int?,
        @Parameter(description = "The limit for pagination") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "boolean to indicate whether to include retailer locations that have no offers") @Valid @RequestParam(value = "hasOffers", required = false) hasOffers: kotlin.Boolean?,
        @Parameter(description = "Comma separate list of category ids") @Valid @RequestParam(value = "categories", required = false) categories: kotlin.String?,
        @Parameter(description = "Comma separated list of filter ids") @Valid @RequestParam(value = "filters", required = false) filters: kotlin.String?,
        @Parameter(description = "Comma separated list of audience ids") @Valid @RequestParam(value = "audiences", required = false) audiences: kotlin.String?,
        @Parameter(description = "Comma separated list of retailer ids") @Valid @RequestParam(value = "retailerIds", required = false) retailerIds: kotlin.String?,
        @Parameter(description = "Comma separated list of retailer location ids") @Valid @RequestParam(value = "retailerLocationIds", required = false) retailerLocationIds: kotlin.String?,
        @Parameter(description = "Does a full-text search on tags") @Valid @RequestParam(value = "tags", required = false) tags: kotlin.String?,
        @Parameter(description = "Location type filter") @Valid @RequestParam(value = "locationType", required = false) locationType: kotlin.String?,
        @Parameter(description = "The field to sort the result set on. Possible values include: RETAILER_NAME, RETAILER_LOCATION_NAME") @Valid @RequestParam(value = "sortField", required = false) sortField: kotlin.String?,
        @Parameter(description = "Determines whether the sorted list is in descending or ascending order") @Valid @RequestParam(value = "descending", required = false) descending: kotlin.Boolean?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?,
        @Parameter(description = "Search by keyword") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "Determines the operator used when there are multiple words in the 'keyword' parameter") @Valid @RequestParam(value = "keywordOperator", required = false) keywordOperator: kotlin.String?,
        @Parameter(description = "Search expression to further refine results") @Valid @RequestParam(value = "searchExpression", required = false) searchExpression: kotlin.String?,
        @Parameter(description = "Return retailer info") @Valid @RequestParam(value = "returnRetailer", required = false) returnRetailer: kotlin.Boolean?,
        @Parameter(description = "Return assets") @Valid @RequestParam(value = "returnAssets", required = false) returnAssets: kotlin.Boolean?,
        @Parameter(description = "Return offers") @Valid @RequestParam(value = "returnOffers", required = false) returnOffers: kotlin.Boolean?,
        @Parameter(description = "Return categories") @Valid @RequestParam(value = "returnCategories", required = false) returnCategories: kotlin.Boolean?,
        @Parameter(description = "Return filters") @Valid @RequestParam(value = "returnFilters", required = false) returnFilters: kotlin.Boolean?,
        @Parameter(description = "Return audiences") @Valid @RequestParam(value = "returnAudiences", required = false) returnAudiences: kotlin.Boolean?,
        @Parameter(description = "Return QR code info") @Valid @RequestParam(value = "returnQrCode", required = false) returnQrCode: kotlin.Boolean?,
        @Parameter(description = "Return external category data") @Valid @RequestParam(value = "returnExternalCategoryData", required = false) returnExternalCategoryData: kotlin.Boolean?,
        @Parameter(description = "Include favorites in response") @Valid @RequestParam(value = "includeFavorite", required = false) includeFavorite: kotlin.Boolean?,
        @Parameter(description = "Include liked flag in response") @Valid @RequestParam(value = "includeLiked", required = false) includeLiked: kotlin.Boolean?,
        @Parameter(description = "Include rating info in response") @Valid @RequestParam(value = "includeRating", required = false) includeRating: kotlin.Boolean?
    ): ResponseEntity<List<RetailerLocationResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Offer Transaction",
        operationId = "redeemOfferTransaction",
        description = """Redeems an offer.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/retailer/offer/transaction/update"
        value = [PATH_REDEEM_OFFER_TRANSACTION],
        produces = ["*/*"]
    )
    fun redeemOfferTransaction(
        @NotNull @Parameter(description = "the OfferTransaction ID of the transaction being redeemed", required = true) @Valid @RequestParam(value = "offerTransactionId", required = true) offerTransactionId: kotlin.Long,
        @NotNull @Parameter(description = "the status to set the offer transaction to - 1 sets it to redeemable and 2 sets it to redeemed", required = true) @Valid @RequestParam(value = "status", required = true) status: kotlin.Int,
        @Parameter(description = "the device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the OfferLocation ID where the offer is being redeemed") @Valid @RequestParam(value = "offerLocationId", required = false) offerLocationId: kotlin.Long?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Login Retailer",
        operationId = "retailerLoginCheck",
        description = """Retailer login check.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AccountLoginResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/retailer/login"
        value = [PATH_RETAILER_LOGIN_CHECK],
        produces = ["*/*"]
    )
    fun retailerLoginCheck(
        @NotNull @Parameter(description = "the user's email address they used to sign-up", required = true) @Valid @RequestParam(value = "username", required = true) username: kotlin.String,
        @NotNull @Parameter(description = "the password", required = true) @Valid @RequestParam(value = "password", required = true) password: kotlin.String,
        @Parameter(description = "the device id (optional)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the current latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the current longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "the application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?
    ): ResponseEntity<AccountLoginResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Offer Transactions",
        operationId = "searchOfferTransactionsForRetailers",
        description = """Searches on offer transactions for offers that the account has access to.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = OfferTransactionResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/retailer/offer/transaction/search"
        value = [PATH_SEARCH_OFFER_TRANSACTIONS_FOR_RETAILERS],
        produces = ["*/*"]
    )
    fun searchOfferTransactionsForRetailers(
        @NotNull @Parameter(description = "Determines what to sort the results by {CREATED, UPDATED, SEARCH_TAGS, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, CUSTOMER_ID, CUSTOMER_DISPLAY, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY}", required = true, schema = Schema(allowableValues = ["ID", "CREATED", "UPDATED", "DELETED", "SEARCH_TAGS", "ACTIVE", "ACTIVATED", "EXPIRES", "TITLE", "SUBTITLE", "DETAILS", "OFFER_TYPE", "SPECIAL_OFFER_TYPE", "OFFER_VISIBILITY", "REDEEMABLE_START", "REDEEMABLE_END", "CUSTOMER_ID", "CUSTOMER_DISPLAY", "RETAILER_ID", "RETAILER_NAME", "RETAILER_LOCATION_ID", "RETAILER_LOCATION_NAME", "BILLABLE_ENTITY_ID", "BILLABLE_ENTITY_NAME", "RESPONSIBLE_DISPLAY"])) @Valid @RequestParam(value = "sortField", required = true) sortField: kotlin.String,
        @NotNull @Parameter(description = "Determines whether the results are in descending order", required = true) @Valid @RequestParam(value = "descending", required = true) descending: kotlin.Boolean,
        @NotNull @Parameter(description = "The start index for pagination", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "The limit for pagination", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @NotNull @Parameter(description = "Determines whether to only return active offer transactions", required = true) @Valid @RequestParam(value = "activeOnly", required = true) activeOnly: kotlin.Boolean,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?,
        @Parameter(description = "The keyword to search for") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "Filter results for this retailer") @Valid @RequestParam(value = "retailerId", required = false) retailerId: kotlin.Long?,
        @Parameter(description = "Filter results for this retailer location") @Valid @RequestParam(value = "retailerLocationId", required = false) retailerLocationId: kotlin.Long?,
        @Parameter(description = "Filter results for this offer") @Valid @RequestParam(value = "offerId", required = false) offerId: kotlin.Long?,
        @Parameter(description = "Filter results for this offer location") @Valid @RequestParam(value = "offerLocationId", required = false) offerLocationId: kotlin.Long?,
        @Parameter(description = "if true return redeemed transactions (status 2), if false return active transactions (status 0 or 1)") @Valid @RequestParam(value = "redeemed", required = false) redeemed: kotlin.Boolean?,
        @Parameter(description = "returns only reservation transactions if true") @Valid @RequestParam(value = "reservationsOnly", required = false) reservationsOnly: kotlin.Boolean?,
        @Parameter(description = "This parameter is deprecated.", schema = Schema(allowableValues = ["VOUCHER", "COUPON", "PRODUCT", "MEDIA", "EVENT", "DEVICE"])) @Valid @RequestParam(value = "couponType", required = false) couponType: kotlin.String?,
        @Parameter(description = "Filter results to only return COUPON, VOUCHER, PRODUCT, MEDIA, or EVENT offers", schema = Schema(allowableValues = ["VOUCHER", "COUPON", "PRODUCT", "MEDIA", "EVENT", "DEVICE"])) @Valid @RequestParam(value = "offerType", required = false) offerType: kotlin.String?,
        @Parameter(description = "Filter results to only return REGULAR_OFFER, ACT_NOW, GET_THERE_NOW offer specials", schema = Schema(allowableValues = ["ALL", "RESERVABLE", "REGULAR_OFFER", "ACT_NOW", "GET_THERE_NOW", "SQOOT", "TICKETS", "YIPIT"])) @Valid @RequestParam(value = "specialOfferType", required = false) specialOfferType: kotlin.String?,
        @Parameter(description = "Filter results by accounts") @Valid @RequestParam(value = "customerAccountIds", required = false) customerAccountIds: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "redeemableStartDate", required = false) redeemableStartDate: kotlin.Long?,
        @Parameter(description = "") @Valid @RequestParam(value = "redeemableEndDate", required = false) redeemableEndDate: kotlin.Long?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "_i", required = false) i: kotlin.Int?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "_l", required = false) l: kotlin.Int?
    ): ResponseEntity<List<OfferTransactionResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Retailer Locations (Owned)",
        operationId = "searchRetailerLocations",
        description = """Searches on retailer locations that the account has access to.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = RetailerLocationResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/retailer/location/search"
        value = [PATH_SEARCH_RETAILER_LOCATIONS],
        produces = ["*/*"]
    )
    fun searchRetailerLocations(
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "q", required = false) q: kotlin.String?,
        @Parameter(description = "The keyword used to search") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "Comma separated list of retailer IDs which when passed in will filter the results to only return these retailers.") @Valid @RequestParam(value = "retailerIds", required = false) retailerIds: kotlin.String?,
        @Parameter(description = "Comma separated list of retailer location IDs") @Valid @RequestParam(value = "retailerLocationIds", required = false) retailerLocationIds: kotlin.String?,
        @Parameter(description = "Location type filter") @Valid @RequestParam(value = "locationType", required = false) locationType: kotlin.String?,
        @Parameter(description = "The column to sort the search on", schema = Schema(allowableValues = ["ID", "CREATED", "UPDATED", "DELETED", "SEARCH_TAGS", "ACTIVE", "RETAILER_ID", "BILLABLE_ENTITY_ID", "BILLABLE_ENTITY_NAME", "RESPONSIBLE_DISPLAY", "ADDRESS_STREET", "ADDRESS_CITY", "ADDRESS_STATE", "ADDRESS_POSTAL_CODE", "ADDRESS_COUNTRY", "NAME", "CODE"])) @Valid @RequestParam(value = "sortField", required = false) sortField: kotlin.String?,
        @Parameter(description = "The order to return the search results") @Valid @RequestParam(value = "descending", required = false) descending: kotlin.Boolean?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "_i", required = false) i: kotlin.Int?,
        @Parameter(description = "The record to begin the return set on") @Valid @RequestParam(value = "start", required = false) start: kotlin.Int?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "_l", required = false) l: kotlin.Int?,
        @Parameter(description = "The number of records to return") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "Whether to include public locations in the results") @Valid @RequestParam(value = "showPublicLocations", required = false) showPublicLocations: kotlin.Boolean?,
        @Parameter(description = "Return only active results") @Valid @RequestParam(value = "activeOnly", required = false) activeOnly: kotlin.Boolean?,
        @Parameter(description = "Return retailer info") @Valid @RequestParam(value = "returnRetailer", required = false) returnRetailer: kotlin.Boolean?,
        @Parameter(description = "Return assets") @Valid @RequestParam(value = "returnAssets", required = false) returnAssets: kotlin.Boolean?,
        @Parameter(description = "Return offers") @Valid @RequestParam(value = "returnOffers", required = false) returnOffers: kotlin.Boolean?,
        @Parameter(description = "Return categories") @Valid @RequestParam(value = "returnCategories", required = false) returnCategories: kotlin.Boolean?,
        @Parameter(description = "Return filters") @Valid @RequestParam(value = "returnFilters", required = false) returnFilters: kotlin.Boolean?,
        @Parameter(description = "Return audiences") @Valid @RequestParam(value = "returnAudiences", required = false) returnAudiences: kotlin.Boolean?,
        @Parameter(description = "Return QR code info") @Valid @RequestParam(value = "returnQrCode", required = false) returnQrCode: kotlin.Boolean?,
        @Parameter(description = "Include favorites in response") @Valid @RequestParam(value = "includeFavorite", required = false) includeFavorite: kotlin.Boolean?,
        @Parameter(description = "Include liked flag in response") @Valid @RequestParam(value = "includeLiked", required = false) includeLiked: kotlin.Boolean?,
        @Parameter(description = "Include rating info in response") @Valid @RequestParam(value = "includeRating", required = false) includeRating: kotlin.Boolean?
    ): ResponseEntity<List<RetailerLocationResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Offer",
        operationId = "updateOffer",
        description = """Update an offer, must provide a current list of retailer locations or the current offer locations will be marked as deleted.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = RetailerOfferResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/retailer/offer/update"
        value = [PATH_UPDATE_OFFER],
        produces = ["*/*"]
    )
    fun updateOffer(
        @NotNull @Parameter(description = "The offer to update", required = true) @Valid @RequestParam(value = "offerId", required = true) offerId: kotlin.Long,
        @NotNull @Parameter(description = "If true return all the offer locations associated with the offer", required = true) @Valid @RequestParam(value = "includeOfferLocations", required = true) includeOfferLocations: kotlin.Boolean,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account used to perform the update, must have rights to edit the offer (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "") @Valid @RequestParam(value = "parentOfferId", required = false) parentOfferId: kotlin.Long?,
        @Parameter(description = "Comma separated list of retailer location ids. This will assign the offer to these retailer locations.") @Valid @RequestParam(value = "retailerLocationIds", required = false) retailerLocationIds: kotlin.String?,
        @Parameter(description = "A list of json data that has offer location specific values.") @Valid @RequestParam(value = "offerLocations", required = false) offerLocations: kotlin.String?,
        @Parameter(description = "Custom string field for doing full-text searches") @Valid @RequestParam(value = "tags", required = false) tags: kotlin.String?,
        @Parameter(description = "The title (255 char limit)") @Valid @RequestParam(value = "title", required = false) title: kotlin.String?,
        @Parameter(description = "The sub title (255 char limit)") @Valid @RequestParam(value = "subTitle", required = false) subTitle: kotlin.String?,
        @Parameter(description = "The details") @Valid @RequestParam(value = "details", required = false) details: kotlin.String?,
        @Parameter(description = "A string for custom details (255 char limit)") @Valid @RequestParam(value = "subDetails", required = false) subDetails: kotlin.String?,
        @Parameter(description = "The fine print") @Valid @RequestParam(value = "finePrint", required = false) finePrint: kotlin.String?,
        @Parameter(description = "The bar code type {NONE, UPC, CODE_128, QR, CUSTOM_MEDIA}", schema = Schema(allowableValues = ["NONE", "UPC", "CODE_128", "QR", "CUSTOM_MEDIA"])) @Valid @RequestParam(value = "barcodeType", required = false) barcodeType: kotlin.String?,
        @Parameter(description = "The bar code entry string") @Valid @RequestParam(value = "barcodeEntry", required = false) barcodeEntry: kotlin.String?,
        @Parameter(description = "An external identifier. What the identifier will be used for and how it is formatted is up to the frontend developer.") @Valid @RequestParam(value = "externalRedeemOptions", required = false) externalRedeemOptions: kotlin.String?,
        @Parameter(description = "The clickUrl of the offer") @Valid @RequestParam(value = "externalUrl", required = false) externalUrl: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "externalId", required = false) externalId: kotlin.String?,
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
        @Parameter(description = "show remaining offers available") @Valid @RequestParam(value = "showRemaining", required = false) showRemaining: kotlin.Boolean?,
        @Parameter(description = "show how many offers have been redeemed") @Valid @RequestParam(value = "showRedeemed", required = false) showRedeemed: kotlin.Boolean?,
        @Parameter(description = "") @Valid @RequestParam(value = "replaced", required = false) replaced: kotlin.Boolean?,
        @Parameter(description = "whether the offer is featured or not") @Valid @RequestParam(value = "featured", required = false) featured: kotlin.Boolean?,
        @Parameter(description = "The offer type {VOUCHER, COUPON, PRODUCT, MEDIA, EVENT}", schema = Schema(allowableValues = ["VOUCHER", "COUPON", "PRODUCT", "MEDIA", "EVENT", "DEVICE"])) @Valid @RequestParam(value = "offerType", required = false) offerType: kotlin.String?,
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
        @Parameter(description = "The brand. OfferType PRODUCT only.") @Valid @RequestParam(value = "brand", required = false) brand: kotlin.String?,
        @Parameter(description = "The product type. OfferType PRODUCT only.", schema = Schema(allowableValues = ["APPAREL", "APPLIANCES", "APPS", "ARTS_CRAFTS", "AUTOMOTIVE", "BABY", "BEAUTY", "BOOKS", "CLASSICAL", "COLLECTIBLES", "DVD", "ELECTRONICS", "GIFT_CARDS", "GOURMET_FOOD", "GROCERY", "HEALTH_PERSONAL_CARE", "HOME_GARDEN", "INDUSTRIAL", "JEWELRY", "KITCHEN", "LAWN_GARDEN", "MAGAZINES", "MISCELLANEOUS", "MUSICAL_INSTRUMENTS", "OFFICE_PRODUCTS", "OTHER", "OUTDOOR_LIVING", "PC_HARDWARE", "PET_SUPPLIES", "SHOES", "SOFTWARE", "SPORTING_GOODS", "TOOLS", "TOYS", "VIDEO_GAMES", "WATCHES", "WIRELESS", "WIRELESS_ACCESSORIES"])) @Valid @RequestParam(value = "productType", required = false) productType: kotlin.String?,
        @Parameter(description = "The condition. OfferType PRODUCT only.", schema = Schema(allowableValues = ["NEW", "USED", "REFURBISHED", "OTHER"])) @Valid @RequestParam(value = "conditionType", required = false) conditionType: kotlin.String?,
        @Parameter(description = "The ISBN id. OfferType PRODUCT only.") @Valid @RequestParam(value = "isbn", required = false) isbn: kotlin.String?,
        @Parameter(description = "The ASIN id. OfferType PRODUCT only.") @Valid @RequestParam(value = "asin", required = false) asin: kotlin.String?,
        @Parameter(description = "The list of catelog numbers, comma seperated. OfferType PRODUCT only.") @Valid @RequestParam(value = "catalogNumbers", required = false) catalogNumbers: kotlin.String?,
        @Parameter(description = "The department name. The OfferType PRODUCT only.") @Valid @RequestParam(value = "department", required = false) department: kotlin.String?,
        @Parameter(description = "The list of features, comma seperated. OfferType PRODUCT only.") @Valid @RequestParam(value = "features", required = false) features: kotlin.String?,
        @Parameter(description = "The MAP price. OfferType PRODUCT only.") @Valid @RequestParam(value = "minimumPrice", required = false) minimumPrice: kotlin.Double?,
        @Parameter(description = "The width of the item. OfferType PRODUCT only.") @Valid @RequestParam(value = "width", required = false) width: kotlin.Double?,
        @Parameter(description = "The height of the item. OfferType PRODUCT only.") @Valid @RequestParam(value = "height", required = false) height: kotlin.Double?,
        @Parameter(description = "The depth of the item. OfferType PRODUCT only.") @Valid @RequestParam(value = "depth", required = false) depth: kotlin.Double?,
        @Parameter(description = "The weight of the item. OfferType PRODUCT only.") @Valid @RequestParam(value = "weight", required = false) weight: kotlin.Double?,
        @Parameter(description = "The unit of measurement. OfferType PRODUCT only.", schema = Schema(allowableValues = ["MILIMETER", "CENTIMETER", "METER", "INCH", "FOOT", "YARD"])) @Valid @RequestParam(value = "unit", required = false) unit: kotlin.String?,
        @Parameter(description = "The studio name. OfferType PRODUCT only.") @Valid @RequestParam(value = "studio", required = false) studio: kotlin.String?,
        @Parameter(description = "The parental control rating. OfferType PRODUCT only.") @Valid @RequestParam(value = "parentalRating", required = false) parentalRating: kotlin.String?,
        @Parameter(description = "The date published. OfferType PRODUCT only.") @Valid @RequestParam(value = "publishDate", required = false) publishDate: kotlin.Long?,
        @Parameter(description = "The date available. OfferType PRODUCT only.") @Valid @RequestParam(value = "availabilityDate", required = false) availabilityDate: kotlin.Long?,
        @Parameter(description = "The size Id. OfferType PRODUCT only.") @Valid @RequestParam(value = "sizeId", required = false) sizeId: kotlin.Long?,
        @Parameter(description = "The ID of the event listing") @Valid @RequestParam(value = "listingId", required = false) listingId: kotlin.Long?,
        @Parameter(description = "", schema = Schema(allowableValues = ["APK", "APPLICATION", "IMAGE", "AUDIO", "VIDEO", "MULTIPART", "BAR_CODE", "TEXT", "OTHER"])) @Valid @RequestParam(value = "mediaType", required = false) mediaType: kotlin.String?,
        @Parameter(description = "The total playing time of the media item. OfferType MEDIA only.") @Valid @RequestParam(value = "duration", required = false) duration: kotlin.Int?,
        @Parameter(description = "The created/author of the media item. OfferType MEDIA only.") @Valid @RequestParam(value = "author", required = false) author: kotlin.String?,
        @Parameter(description = "The date/time of when the media item was originally released. OfferType MEDIA only.") @Valid @RequestParam(value = "releaseDate", required = false) releaseDate: kotlin.Long?,
        @Parameter(description = "") @Valid @RequestParam(value = "collectionIds", required = false) collectionIds: kotlin.String?,
        @Parameter(description = "The reboot hour time ranging from 0 to 23") @Valid @RequestParam(value = "rebootTimeHour", required = false) rebootTimeHour: kotlin.Int?,
        @Parameter(description = "The reboot minute time ranging from 0 to 59") @Valid @RequestParam(value = "rebootTimeMinute", required = false) rebootTimeMinute: kotlin.Int?,
        @Parameter(description = "If the device is idle for idleTimeoutInSecond then the device should timeout") @Valid @RequestParam(value = "idleTimeoutInSecond", required = false) idleTimeoutInSecond: kotlin.Int?,
        @Parameter(description = "The serial number on the device") @Valid @RequestParam(value = "serialNumber", required = false) serialNumber: kotlin.String?,
        @Parameter(description = "The unique device id for the device") @Valid @RequestParam(value = "udid", required = false) udid: kotlin.String?,
        @Parameter(description = "The type of the device, for example: \"Kiosk\", \"Beacon\".") @Valid @RequestParam(value = "deviceType", required = false) deviceType: kotlin.String?,
        @Parameter(description = "RSSI reading at 1 meter from device (-10 to -140)") @Valid @RequestParam(value = "devicePower", required = false) devicePower: kotlin.Double?,
        @Parameter(description = "") @Valid @RequestParam(value = "deviceInterference", required = false) deviceInterference: kotlin.Double?,
        @Parameter(description = "") @Valid @RequestParam(value = "availability", required = false) availability: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "availabilitySummary", required = false) availabilitySummary: kotlin.String?
    ): ResponseEntity<RetailerOfferResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Activate Offer",
        operationId = "updateOfferStatus",
        description = """Sets the activated date on offers. This will make offers visible for consumers.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/retailer/offer/status"
        value = [PATH_UPDATE_OFFER_STATUS],
        produces = ["*/*"]
    )
    fun updateOfferStatus(
        @NotNull @Parameter(description = "Comma separated list of offer ids", required = true) @Valid @RequestParam(value = "offerIds", required = true) offerIds: kotlin.String,
        @NotNull @Parameter(description = "Determines whether to make the offer active as well", required = true) @Valid @RequestParam(value = "active", required = true) active: kotlin.Boolean,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account used to perform the activation, must have rights to edit the offer.") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Retailer",
        operationId = "updateRetailer",
        description = """Update a retailer record. Only the owner and the employees of the retailer have access to update its information.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = RetailerFullResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/retailer/update"
        value = [PATH_UPDATE_RETAILER],
        produces = ["*/*"]
    )
    fun updateRetailer(
        @NotNull @Parameter(description = "The ID of the retailer to update", required = true) @Valid @RequestParam(value = "retailerId", required = true) retailerId: kotlin.Long,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The name of the retailer") @Valid @RequestParam(value = "name", required = false) name: kotlin.String?,
        @Parameter(description = "The street address of the retailer") @Valid @RequestParam(value = "streetAddress", required = false) streetAddress: kotlin.String?,
        @Parameter(description = "Additional address information (such as a suite number, floor number, building name, or PO Box)") @Valid @RequestParam(value = "streetAddress2", required = false) streetAddress2: kotlin.String?,
        @Parameter(description = "The city of the retailer") @Valid @RequestParam(value = "city", required = false) city: kotlin.String?,
        @Parameter(description = "The state of the retailer") @Valid @RequestParam(value = "state", required = false) state: kotlin.String?,
        @Parameter(description = "The postal code of the retailer") @Valid @RequestParam(value = "postalCode", required = false) postalCode: kotlin.String?,
        @Parameter(description = "the country of the retailer") @Valid @RequestParam(value = "country", required = false) country: kotlin.String?,
        @Parameter(description = "The business phone of the retailer") @Valid @RequestParam(value = "businessPhone", required = false) businessPhone: kotlin.String?,
        @Parameter(description = "The business phone extension of the retailer") @Valid @RequestParam(value = "businessPhoneExt", required = false) businessPhoneExt: kotlin.String?,
        @Parameter(description = "The website of the retailer") @Valid @RequestParam(value = "website", required = false) website: kotlin.String?,
        @Parameter(description = "The email of the retailer") @Valid @RequestParam(value = "email", required = false) email: kotlin.String?,
        @Parameter(description = "The facebook URL of the retailer") @Valid @RequestParam(value = "facebookUrl", required = false) facebookUrl: kotlin.String?,
        @Parameter(description = "The twitter URL of the retailer") @Valid @RequestParam(value = "twitterUrl", required = false) twitterUrl: kotlin.String?,
        @Parameter(description = "The retailer logo sent as a multipart binary file (you can optionally use logoAssetId if the asset has already been uploaded before)") @Valid @RequestParam(value = "logo", required = false) logo: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "The retailer logo asset id") @Valid @RequestParam(value = "logoAssetId", required = false) logoAssetId: kotlin.Long?,
        @Parameter(description = "Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture1AssetId if the asset has already been uploaded before)") @Valid @RequestParam(value = "picture1", required = false) picture1: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "An asset id") @Valid @RequestParam(value = "picture1AssetId", required = false) picture1AssetId: kotlin.Long?,
        @Parameter(description = "Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture2AssetId if the asset has already been uploaded before)") @Valid @RequestParam(value = "picture2", required = false) picture2: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "An asset id") @Valid @RequestParam(value = "picture2AssetId", required = false) picture2AssetId: kotlin.Long?,
        @Parameter(description = "Comma separated list of category IDs used to filter retailers by categories") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "Comma separated list of filter IDs used to filter retailers") @Valid @RequestParam(value = "filterIds", required = false) filterIds: kotlin.String?,
        @Parameter(description = "the latitude of the retailer") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the longitude of the retailer") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "External custom client defined data") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?,
        @Parameter(description = "External custom search keywords") @Valid @RequestParam(value = "searchTags", required = false) searchTags: kotlin.String?,
        @Parameter(description = "External custom type identifier") @Valid @RequestParam(value = "retailerType", required = false) retailerType: kotlin.String?,
        @Parameter(description = "", schema = Schema(allowableValues = ["PUBLIC", "PRIVATE", "FRIENDS"])) @Valid @RequestParam(value = "visibility", required = false) visibility: kotlin.String?,
        @Parameter(description = "Sets whether the retailer is active or inactive (hidden from consumers)") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "The format of the returned response {JSON // default , HTML // for Dojo support when uploading assets}", schema = Schema(allowableValues = ["HTML", "XML", "JSON", "CSV"])) @Valid @RequestParam(value = "responseFormat", required = false) responseFormat: kotlin.String?
    ): ResponseEntity<RetailerFullResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Retailer Location",
        operationId = "updateRetailerLocations",
        description = """Updates a location record for a retailer. Only the owner and the employees of the retailer have access to do this.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = RetailerLocationResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/retailer/location/update"
        value = [PATH_UPDATE_RETAILER_LOCATIONS],
        produces = ["*/*"]
    )
    fun updateRetailerLocations(
        @NotNull @Parameter(description = "The ID of the retailer location", required = true) @Valid @RequestParam(value = "retailerLocationId", required = true) retailerLocationId: kotlin.Long,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The name of the retailer location") @Valid @RequestParam(value = "name", required = false) name: kotlin.String?,
        @Parameter(description = "The street address of the retailer location") @Valid @RequestParam(value = "streetAddress", required = false) streetAddress: kotlin.String?,
        @Parameter(description = "Additional address information (such as a suite number, floor number, building name, or PO Box)") @Valid @RequestParam(value = "streetAddress2", required = false) streetAddress2: kotlin.String?,
        @Parameter(description = "The city of the retailer location") @Valid @RequestParam(value = "city", required = false) city: kotlin.String?,
        @Parameter(description = "The state of the retailer location") @Valid @RequestParam(value = "state", required = false) state: kotlin.String?,
        @Parameter(description = "The postal code of the retailer location") @Valid @RequestParam(value = "postalCode", required = false) postalCode: kotlin.String?,
        @Parameter(description = "the country of the retailer location") @Valid @RequestParam(value = "country", required = false) country: kotlin.String?,
        @Parameter(description = "The business phone number of the retailer location") @Valid @RequestParam(value = "businessPhone", required = false) businessPhone: kotlin.String?,
        @Parameter(description = "The business phone extension of the retailer location") @Valid @RequestParam(value = "businessPhoneExt", required = false) businessPhoneExt: kotlin.String?,
        @Parameter(description = "The website of the retailer location") @Valid @RequestParam(value = "website", required = false) website: kotlin.String?,
        @Parameter(description = "The email of the retailer location") @Valid @RequestParam(value = "email", required = false) email: kotlin.String?,
        @Parameter(description = "An internal identifier used by the retailer") @Valid @RequestParam(value = "internalId", required = false) internalId: kotlin.String?,
        @Parameter(description = "A brief description about the retailer location (255 character limit)") @Valid @RequestParam(value = "detailsHeader", required = false) detailsHeader: kotlin.String?,
        @Parameter(description = "A detailed description about the retailer location") @Valid @RequestParam(value = "detailsBody", required = false) detailsBody: kotlin.String?,
        @Parameter(description = "The hours of operation") @Valid @RequestParam(value = "hours", required = false) hours: kotlin.String?,
        @Parameter(description = "The retailer location logo sent as a multipart binary file (you can optionally use logoAssetId if the asset has already been uploaded before)") @Valid @RequestParam(value = "logo", required = false) logo: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "The retailer location logo asset id") @Valid @RequestParam(value = "logoAssetId", required = false) logoAssetId: kotlin.Long?,
        @Parameter(description = "Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture1AssetId if the asset has already been uploaded before)") @Valid @RequestParam(value = "picture1", required = false) picture1: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "An asset id") @Valid @RequestParam(value = "picture1AssetId", required = false) picture1AssetId: kotlin.Long?,
        @Parameter(description = "Optional store-front pictures or product pictures or etc. A multipart binary file (you can optionally use picture2AssetId if the asset has already been uploaded before)") @Valid @RequestParam(value = "picture2", required = false) picture2: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "An asset id") @Valid @RequestParam(value = "picture2AssetId", required = false) picture2AssetId: kotlin.Long?,
        @Parameter(description = "Comma separated list of category IDs used to filter retailer locations by categories") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "Comma separated list of filter IDs used to filter retailer locations") @Valid @RequestParam(value = "filterIds", required = false) filterIds: kotlin.String?,
        @Parameter(description = "the latituede of the retailer location") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the longitude of the retailer location") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "") @Valid @RequestParam(value = "building", required = false) building: kotlin.String?,
        @Parameter(description = "the Google Place ID that the retailer location is associated with") @Valid @RequestParam(value = "googlePlaceId", required = false) googlePlaceId: kotlin.String?,
        @Parameter(description = "the Yelp ID that the retailer location is associated with") @Valid @RequestParam(value = "yelpId", required = false) yelpId: kotlin.String?,
        @Parameter(description = "External custom client defined data") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?,
        @Parameter(description = "Specifies which payment provider Sirqul will use when making payments") @Valid @RequestParam(value = "paymentProvider", required = false) paymentProvider: kotlin.String?,
        @Parameter(description = "Sets whether the retailer is active or inactive (hidden from consumers)") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "Sets whether the location is public or not") @Valid @RequestParam(value = "publicLocation", required = false) publicLocation: kotlin.Boolean?,
        @Parameter(description = "External custom type identifier") @Valid @RequestParam(value = "locationType", required = false) locationType: kotlin.String?,
        @Parameter(description = "Comma separated list of audience IDs used to assign audiences to the retailer location") @Valid @RequestParam(value = "audienceIds", required = false) audienceIds: kotlin.String?,
        @Parameter(description = "Comma separated list of audience IDs to add to the retailer location") @Valid @RequestParam(value = "audienceIdsToAdd", required = false) audienceIdsToAdd: kotlin.String?,
        @Parameter(description = "Comma separated list of audience IDs to remove from the retailer location") @Valid @RequestParam(value = "audienceIdsToRemove", required = false) audienceIdsToRemove: kotlin.String?,
        @Parameter(description = "The format of the returned response {JSON // default , HTML // for Dojo support when uploading assets}", schema = Schema(allowableValues = ["HTML", "XML", "JSON", "CSV"])) @Valid @RequestParam(value = "responseFormat", required = false) responseFormat: kotlin.String?,
        @Parameter(description = "Custom string field for doing full-text searches") @Valid @RequestParam(value = "tags", required = false) tags: kotlin.String?
    ): ResponseEntity<RetailerLocationResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_BATCH_UPDATE_OFFER_LOCATIONS: String = "/retailer/offer/location/batchUpdate"
        const val PATH_CREATE_OFFER: String = "/retailer/offer/create"
        const val PATH_CREATE_RETAILER: String = "/retailer/create"
        const val PATH_CREATE_RETAILER_LOCATIONS: String = "/retailer/location/create"
        const val PATH_DELETE_OFFER: String = "/retailer/offer/delete"
        const val PATH_DELETE_OFFER_LOCATION: String = "/retailer/offer/location/delete"
        const val PATH_DELETE_RETAILER: String = "/retailer/delete"
        const val PATH_DELETE_RETAILER_LOCATION: String = "/retailer/location/delete"
        const val PATH_GET_OFFER: String = "/retailer/offer/get"
        const val PATH_GET_OFFER_LOCATIONS_FOR_RETAILERS: String = "/retailer/offer/location/search"
        const val PATH_GET_OFFERS_FOR_RETAILERS: String = "/retailer/offer/search"
        const val PATH_GET_RETAILER: String = "/retailer/get"
        const val PATH_GET_RETAILER_LOCATION: String = "/retailer/location/get"
        const val PATH_GET_RETAILERS: String = "/retailer/search"
        const val PATH_GET_RETAOKILER: String = "/retailer"
        const val PATH_INDEXED_RETAILER_LOCATION_DISTANCE_SEARCH: String = "/retailer/location/idistancesearch"
        const val PATH_INDEXED_RETAILER_LOCATION_SEARCH: String = "/retailer/location/isearch"
        const val PATH_REDEEM_OFFER_TRANSACTION: String = "/retailer/offer/transaction/update"
        const val PATH_RETAILER_LOGIN_CHECK: String = "/retailer/login"
        const val PATH_SEARCH_OFFER_TRANSACTIONS_FOR_RETAILERS: String = "/retailer/offer/transaction/search"
        const val PATH_SEARCH_RETAILER_LOCATIONS: String = "/retailer/location/search"
        const val PATH_UPDATE_OFFER: String = "/retailer/offer/update"
        const val PATH_UPDATE_OFFER_STATUS: String = "/retailer/offer/status"
        const val PATH_UPDATE_RETAILER: String = "/retailer/update"
        const val PATH_UPDATE_RETAILER_LOCATIONS: String = "/retailer/location/update"
    }
}
