package org.openapitools.api

import org.openapitools.model.CoordsResponse
import org.openapitools.model.Location
import org.openapitools.model.LocationSearchResponse
import org.openapitools.model.RatingIndexResponse
import org.openapitools.model.RetailerLocationResponse
import org.openapitools.model.SirqulResponse
import org.openapitools.model.TrilatCacheRequest
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
class LocationApiController() {

    @Operation(
        summary = "Create Trilateration Data with File",
        operationId = "cacheTrilaterationData",
        description = """Creates trilateration samples for a source device (i.e. a router).""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/location/trilaterate/cache"
        value = [PATH_CACHE_TRILATERATION_DATA],
        produces = ["*/*"]
    )
    fun cacheTrilaterationData(
        @NotNull @Parameter(description = "The unique identifier of the source device", required = true) @Valid @RequestParam(value = "udid", required = true) udid: kotlin.String,
        @Parameter(description = "The current timestamp of the source device") @Valid @RequestParam(value = "sourceTime", required = false) sourceTime: kotlin.Long?,
        @Parameter(description = "the minimum number of Edysen devices that must be used to be able to trilaterate a device") @Valid @RequestParam(value = "minimumSampleSize", required = false) minimumSampleSize: kotlin.Int?,
        @Parameter(description = "The json formated sample data:  ```json {    \"count\": 2,   \"timespan\": 10,    \"samples\": [     {       \"deviceId\": \"device1\",       \"randomizedId\": true,        \"deviceSignature\": \"probe:xyz...\",        \"alternativeId\":\"adc123\",        \"rssi\": [-63, -75]     },      {       \"deviceId\": \"device2\",       \"randomizedId\": true,        \"deviceSignature\": \"probe:xyz...\",        \"alternativeId\": \"adc123\",        \"rssi\": [-83, -79]     }   ] } ``` ") @Valid @RequestParam(value = "data", required = false) `data`: kotlin.String?,
        @Parameter(description = "Binary file containing data (multipart upload)") @Valid @RequestParam(value = "dataFile", required = false) dataFile: org.springframework.web.multipart.MultipartFile
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Trilateration Data with Rest",
        operationId = "cacheTrilaterationDataGzip",
        description = """Creates trilateration samples for a source device (i.e. a router).""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/location/trilaterate/cache/submit"
        value = [PATH_CACHE_TRILATERATION_DATA_GZIP],
        produces = ["*/*"]
    )
    fun cacheTrilaterationDataGzip(
        @Parameter(description = "") @Valid @RequestBody(required = false) body: TrilatCacheRequest?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create new location",
        operationId = "createLocationV2",
        description = """Create a new location from a real object location.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/location"
        value = [PATH_CREATE_LOCATION_V2],
        produces = ["*/*"]
    )
    fun createLocationV2(
        @Parameter(description = "") @Valid @RequestBody(required = false) body: Location?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Retailer Location (Consumer)",
        operationId = "createRetailerLocationConsumer",
        description = """Creates a location record for an application that can support crowd sourced locations.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = RetailerLocationResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/location/create"
        value = [PATH_CREATE_RETAILER_LOCATION_CONSUMER],
        produces = ["*/*"]
    )
    fun createRetailerLocationConsumer(
        @NotNull @Parameter(description = "the application key", required = true) @Valid @RequestParam(value = "appKey", required = true) appKey: kotlin.String,
        @NotNull @Parameter(description = "The name of the retailer location", required = true) @Valid @RequestParam(value = "name", required = true) name: kotlin.String,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The street address of the retailer location") @Valid @RequestParam(value = "streetAddress", required = false) streetAddress: kotlin.String?,
        @Parameter(description = "Additional address information (such as a suite number, floor number, building name, or PO Box)") @Valid @RequestParam(value = "streetAddress2", required = false) streetAddress2: kotlin.String?,
        @Parameter(description = "The city of the retailer location") @Valid @RequestParam(value = "city", required = false) city: kotlin.String?,
        @Parameter(description = "The state of the retailer location") @Valid @RequestParam(value = "state", required = false) state: kotlin.String?,
        @Parameter(description = "The postal code of the retailer location") @Valid @RequestParam(value = "postalCode", required = false) postalCode: kotlin.String?,
        @Parameter(description = "the country of the retailer location") @Valid @RequestParam(value = "country", required = false) country: kotlin.String?,
        @Parameter(description = "The business phone") @Valid @RequestParam(value = "businessPhone", required = false) businessPhone: kotlin.String?,
        @Parameter(description = "The business phone extension") @Valid @RequestParam(value = "businessPhoneExt", required = false) businessPhoneExt: kotlin.String?,
        @Parameter(description = "The website of the retailer location") @Valid @RequestParam(value = "website", required = false) website: kotlin.String?,
        @Parameter(description = "The email of the retailer location") @Valid @RequestParam(value = "email", required = false) email: kotlin.String?,
        @Parameter(description = "A brief description about the retailer location (255 character limit)") @Valid @RequestParam(value = "detailsHeader", required = false) detailsHeader: kotlin.String?,
        @Parameter(description = "A detailed description about the retailer location") @Valid @RequestParam(value = "detailsBody", required = false) detailsBody: kotlin.String?,
        @Parameter(description = "The hours of operation") @Valid @RequestParam(value = "hours", required = false) hours: kotlin.String?,
        @Parameter(description = "Custom string field for doing full-text searches") @Valid @RequestParam(value = "tags", required = false) tags: kotlin.String?,
        @Parameter(description = "The retailer location logo asset id") @Valid @RequestParam(value = "logoAssetId", required = false) logoAssetId: kotlin.Long?,
        @Parameter(description = "An asset id") @Valid @RequestParam(value = "picture1AssetId", required = false) picture1AssetId: kotlin.Long?,
        @Parameter(description = "An asset id") @Valid @RequestParam(value = "picture2AssetId", required = false) picture2AssetId: kotlin.Long?,
        @Parameter(description = "Comma separated list of category IDs used to filter retailer locations by categories") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "Comma separated list of filter IDs used to filter retailer locations") @Valid @RequestParam(value = "filterIds", required = false) filterIds: kotlin.String?,
        @Parameter(description = "External custom client defined data") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?,
        @Parameter(description = "Whether the location is public") @Valid @RequestParam(value = "publicLocation", required = false) publicLocation: kotlin.Boolean?,
        @Parameter(description = "whether the retailer location created should be active or not") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "External custom type identifier") @Valid @RequestParam(value = "locationType", required = false) locationType: kotlin.String?,
        @Parameter(description = "The latitude to center the search on") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The longitude to center the search on") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<RetailerLocationResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Location by IP",
        operationId = "getLocationByIp",
        description = """Get location information based on an IP address.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = CoordsResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/location/ip"
        value = [PATH_GET_LOCATION_BY_IP],
        produces = ["*/*"]
    )
    fun getLocationByIp(
        @Parameter(description = "the ip address of the client device") @Valid @RequestParam(value = "ip", required = false) ip: kotlin.String?
    ): ResponseEntity<CoordsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Regions or Postal Codes",
        operationId = "getLocations",
        description = """Searches geographic locations by proximity via address or keyword.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = LocationSearchResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/location/search"
        value = [PATH_GET_LOCATIONS],
        produces = ["*/*"]
    )
    fun getLocations(
        @Parameter(description = "the device id") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "currentlatitude", required = false) currentlatitude: kotlin.Double?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "currentlongitude", required = false) currentlongitude: kotlin.Double?,
        @Parameter(description = "the current latitude of the user") @Valid @RequestParam(value = "currentLatitude", required = false) currentLatitude: kotlin.Double?,
        @Parameter(description = "the current longitude of the user") @Valid @RequestParam(value = "currentLongitude", required = false) currentLongitude: kotlin.Double?,
        @Parameter(description = "the query results by keyword or address") @Valid @RequestParam(value = "query", required = false) query: kotlin.String?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "zipcode", required = false) zipcode: kotlin.String?,
        @Parameter(description = "the zip code to filter results") @Valid @RequestParam(value = "zipCode", required = false) zipCode: kotlin.String?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "selectedMaplatitude", required = false) selectedMaplatitude: kotlin.Double?,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "selectedMaplongitude", required = false) selectedMaplongitude: kotlin.Double?,
        @Parameter(description = "the latitude of where the search should originate from") @Valid @RequestParam(value = "selectedMapLatitude", required = false) selectedMapLatitude: kotlin.Double?,
        @Parameter(description = "the longitude of where the search should originate from") @Valid @RequestParam(value = "selectedMapLongitude", required = false) selectedMapLongitude: kotlin.Double?,
        @Parameter(description = "the search range of the search in miles", schema = Schema(defaultValue = "5.0")) @Valid @RequestParam(value = "searchRange", required = false, defaultValue = "5.0") searchRange: kotlin.Double,
        @Parameter(description = "determines whether to allow searches via address", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "useGeocode", required = false, defaultValue = "false") useGeocode: kotlin.Boolean,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "_i", required = false) i: kotlin.Int?,
        @Parameter(description = "the start index for pagination", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "This parameter is deprecated.") @Valid @RequestParam(value = "_l", required = false) l: kotlin.Int?,
        @Parameter(description = "the limit for pagination", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int
    ): ResponseEntity<LocationSearchResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Retailer Location (Consumer)",
        operationId = "getRetailerLocationConsumer",
        description = """Gets the details of a retailer location as a consumer.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = RetailerLocationResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/location/get"
        value = [PATH_GET_RETAILER_LOCATION_CONSUMER],
        produces = ["*/*"]
    )
    fun getRetailerLocationConsumer(
        @NotNull @Parameter(description = "The retailer location id", required = true) @Valid @RequestParam(value = "retailerLocationId", required = true) retailerLocationId: kotlin.Long,
        @Parameter(description = "The device id for returning account information (i.e. favorites)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id for returning account information (i.e. favorites)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?
    ): ResponseEntity<RetailerLocationResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Location Rating Indexes",
        operationId = "searchLocationRatingIndexes",
        description = """Search for retailer locations by averages near you.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = RatingIndexResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/location/rating/index/search"
        value = [PATH_SEARCH_LOCATION_RATING_INDEXES],
        produces = ["*/*"]
    )
    fun searchLocationRatingIndexes(
        @Parameter(description = "Comma separated list of category ids to filter the results by") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "The keyword used to search") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "The type of location to filter the results by") @Valid @RequestParam(value = "locationType", required = false) locationType: kotlin.String?,
        @Parameter(description = "The column to sort the search on {ID, CREATED, UPDATED, ACTIVE, RATABLE_TYPE, RATABLE_ID, RATABLE_DISPLAY, CATEGORY_ID, CATEGORY_NAME, CATEGORY_SHORT_NAME, CATEGORY_DISPLAY, COUNT, SUMMATION, AVERAGE, VALUE}", schema = Schema(allowableValues = ["ID", "CREATED", "UPDATED", "DELETED", "SEARCH_TAGS", "ACTIVE", "RATABLE_TYPE", "RATABLE_ID", "RATABLE_DISPLAY", "CATEGORY_ID", "CATEGORY_NAME", "CATEGORY_SHORT_NAME", "CATEGORY_DISPLAY", "COUNT", "SUMMATION", "AVERAGE", "VALUE"])) @Valid @RequestParam(value = "sortField", required = false) sortField: kotlin.String?,
        @Parameter(description = "The order to return the search results") @Valid @RequestParam(value = "descending", required = false) descending: kotlin.Boolean?,
        @Parameter(description = "The record to begin the return set on") @Valid @RequestParam(value = "start", required = false) start: kotlin.Int?,
        @Parameter(description = "The number of records to return") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "The search radius in kilometers to filter results") @Valid @RequestParam(value = "searchRange", required = false) searchRange: kotlin.Double?,
        @Parameter(description = "The current location of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The current location of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "Determines whether to return the overall rating record instead") @Valid @RequestParam(value = "returnOverallRating", required = false) returnOverallRating: kotlin.Boolean?,
        @Parameter(description = "", schema = Schema(allowableValues = ["MILES", "KILOMETERS"])) @Valid @RequestParam(value = "distanceUnit", required = false) distanceUnit: kotlin.String?,
        @Parameter(description = "whether to return the retailer or not") @Valid @RequestParam(value = "returnRetailer", required = false) returnRetailer: kotlin.Boolean?,
        @Parameter(description = "whether to return the assets or not") @Valid @RequestParam(value = "returnAssets", required = false) returnAssets: kotlin.Boolean?,
        @Parameter(description = "whether to return the offers or not") @Valid @RequestParam(value = "returnOffers", required = false) returnOffers: kotlin.Boolean?,
        @Parameter(description = "whether to return the categories or not") @Valid @RequestParam(value = "returnCategories", required = false) returnCategories: kotlin.Boolean?,
        @Parameter(description = "whether to return the filters or not") @Valid @RequestParam(value = "returnFilters", required = false) returnFilters: kotlin.Boolean?
    ): ResponseEntity<List<RatingIndexResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update an existing location",
        operationId = "updateLocationV2",
        description = """Update an existing location""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/location/{id}"
        value = [PATH_UPDATE_LOCATION_V2],
        produces = ["*/*"]
    )
    fun updateLocationV2(
        @Parameter(description = "the id of the location to update", required = true) @PathVariable("id") id: kotlin.Long,
        @Parameter(description = "") @Valid @RequestBody(required = false) body: Location?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CACHE_TRILATERATION_DATA: String = "/location/trilaterate/cache"
        const val PATH_CACHE_TRILATERATION_DATA_GZIP: String = "/location/trilaterate/cache/submit"
        const val PATH_CREATE_LOCATION_V2: String = "/location"
        const val PATH_CREATE_RETAILER_LOCATION_CONSUMER: String = "/location/create"
        const val PATH_GET_LOCATION_BY_IP: String = "/location/ip"
        const val PATH_GET_LOCATIONS: String = "/location/search"
        const val PATH_GET_RETAILER_LOCATION_CONSUMER: String = "/location/get"
        const val PATH_SEARCH_LOCATION_RATING_INDEXES: String = "/location/rating/index/search"
        const val PATH_UPDATE_LOCATION_V2: String = "/location/{id}"
    }
}
