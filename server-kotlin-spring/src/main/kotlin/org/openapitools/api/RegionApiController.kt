package org.openapitools.api

import org.openapitools.model.RegionResponse
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
class RegionApiController() {

    @Operation(
        summary = "Create Region",
        operationId = "createRegion",
        description = """Create a region.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = RegionResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/region/create"
        value = [PATH_CREATE_REGION],
        produces = ["*/*"]
    )
    fun createRegion(
        @NotNull @Parameter(description = "The id of the account sending the request", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "RegionClass of this region", required = true) @Valid @RequestParam(value = "regionClass", required = true) regionClass: kotlin.String,
        @NotNull @Parameter(description = "Short name of the region. This is optimized for search", required = true) @Valid @RequestParam(value = "shortName", required = true) shortName: kotlin.String,
        @Parameter(description = "Full name of the region") @Valid @RequestParam(value = "fullName", required = false) fullName: kotlin.String?,
        @Parameter(description = "Comma separated region ids that are parents of this region") @Valid @RequestParam(value = "parentIds", required = false) parentIds: kotlin.String?,
        @Parameter(description = "Comma separated region ids that are children of this region") @Valid @RequestParam(value = "childrenIds", required = false) childrenIds: kotlin.String?,
        @Parameter(description = "Comma separated postal code ids the region will include") @Valid @RequestParam(value = "postalCodeIds", required = false) postalCodeIds: kotlin.String?,
        @Parameter(description = "Sets of name,lat,long used to create new postal codes assigned to the region") @Valid @RequestParam(value = "locations", required = false) locations: kotlin.String?,
        @Parameter(description = "the id of the retailer location that the region is being created for") @Valid @RequestParam(value = "retailerLocationId", required = false) retailerLocationId: kotlin.Long?,
        @Parameter(description = "The Visibility of the region", schema = Schema(allowableValues = ["PUBLIC", "PRIVATE", "FRIENDS"])) @Valid @RequestParam(value = "visibility", required = false) visibility: kotlin.String?,
        @Parameter(description = "the categories that the region is assigned to") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "the filters that the region is assigned to") @Valid @RequestParam(value = "filterIds", required = false) filterIds: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "start", required = false) start: kotlin.Long?,
        @Parameter(description = "") @Valid @RequestParam(value = "end", required = false) end: kotlin.Long?,
        @Parameter(description = "the polygon generated for the region") @Valid @RequestParam(value = "polygon", required = false) polygon: kotlin.String?,
        @Parameter(description = "the meta data associated with the region") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?,
        @Parameter(description = "the latitude of the region") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the longitude of the region") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "the version code") @Valid @RequestParam(value = "versionCode", required = false) versionCode: kotlin.Int?,
        @Parameter(description = "If this is a root region or not. If true means this region has no parent regions") @Valid @RequestParam(value = "root", required = false) root: kotlin.Boolean?,
        @Parameter(description = "Active or inactive status of the region") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?
    ): ResponseEntity<RegionResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Region",
        operationId = "deleteRegion",
        description = """Delete a region.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = RegionResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/region/delete"
        value = [PATH_DELETE_REGION],
        produces = ["*/*"]
    )
    fun deleteRegion(
        @NotNull @Parameter(description = "the id of the account logged in", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the id of the region", required = true) @Valid @RequestParam(value = "regionId", required = true) regionId: kotlin.Long
    ): ResponseEntity<RegionResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Region",
        operationId = "getRegion",
        description = """Get a region.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = RegionResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/region/get"
        value = [PATH_GET_REGION],
        produces = ["*/*"]
    )
    fun getRegion(
        @NotNull @Parameter(description = "the id of the region to get", required = true) @Valid @RequestParam(value = "regionId", required = true) regionId: kotlin.Long,
        @Parameter(description = "the id of the logged in user") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?
    ): ResponseEntity<RegionResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Regions",
        operationId = "searchRegions",
        description = """Get the list of regions.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = RegionResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/region/search"
        value = [PATH_SEARCH_REGIONS],
        produces = ["*/*"]
    )
    fun searchRegions(
        @Parameter(description = "the owner account id of the region to be created") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "This parameter is deprecated. deprecated - use \"keyword\"") @Valid @RequestParam(value = "query", required = false) query: kotlin.String?,
        @Parameter(description = "the keyword to filter results on") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "the latitude of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the longitude of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "the search radius") @Valid @RequestParam(value = "range", required = false) range: kotlin.Double?,
        @Parameter(description = "", schema = Schema(allowableValues = ["NATIONAL", "STATE", "COUNTY", "METRO_AREA", "CITY", "NEIGHBORHOOD", "TERRITORY", "CUSTOM", "ZONE"])) @Valid @RequestParam(value = "regionClass", required = false) regionClass: kotlin.String?,
        @Parameter(description = "", schema = Schema(allowableValues = ["PUBLIC", "PRIVATE", "FRIENDS"])) @Valid @RequestParam(value = "visibility", required = false) visibility: kotlin.String?,
        @Parameter(description = "the SearchIndexMode: RDS, LUCENE, or CLOUDINDEX. If not provided, will use the default defined in the Sirqul server", schema = Schema(allowableValues = ["RDS", "LUCENE", "CLOUDINDEX"])) @Valid @RequestParam(value = "searchMode", required = false) searchMode: kotlin.String?,
        @Parameter(description = "the field to order results by: ID, UPDATED, NAME, or DISTANCE. If not provided, will use the default which is by ID for text and DISTANCE when lat/long is provided.", schema = Schema(allowableValues = ["ID", "UPDATED", "NAME", "DISTANCE"])) @Valid @RequestParam(value = "sortField", required = false) sortField: kotlin.String?,
        @Parameter(description = "determines if the results get ordered in descending order") @Valid @RequestParam(value = "descending", required = false) descending: kotlin.Boolean?,
        @Parameter(description = "include the parent region or not") @Valid @RequestParam(value = "includeParent", required = false) includeParent: kotlin.Boolean?,
        @Parameter(description = "include the chidren regions or not") @Valid @RequestParam(value = "includeChildren", required = false) includeChildren: kotlin.Boolean?,
        @Parameter(description = "include the postal codes associated with the region or not") @Valid @RequestParam(value = "includePostalCodes", required = false) includePostalCodes: kotlin.Boolean?,
        @Parameter(description = "search on the categories associated with the region") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "search on the filters associated with the region") @Valid @RequestParam(value = "filterIds", required = false) filterIds: kotlin.String?,
        @Parameter(description = "filter by a specific version code") @Valid @RequestParam(value = "versionCode", required = false) versionCode: kotlin.Int?,
        @Parameter(description = "filter to show only active results") @Valid @RequestParam(value = "activeOnly", required = false) activeOnly: kotlin.Boolean?,
        @Parameter(description = "If showDeleted is true and activeOnly is false, will return regions that have been deleted") @Valid @RequestParam(value = "showDeleted", required = false) showDeleted: kotlin.Boolean?,
        @Parameter(description = "only returns records that have last updated since this date \\(UTC timestamp in milliseconds\\)") @Valid @RequestParam(value = "lastUpdatedSince", required = false) lastUpdatedSince: kotlin.Long?,
        @Parameter(description = "the start index for pagination") @Valid @RequestParam(value = "start", required = false) start: kotlin.Int?,
        @Parameter(description = "the limit for pagination") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?
    ): ResponseEntity<List<RegionResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Region",
        operationId = "updateRegion",
        description = """Update a region.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = RegionResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/region/update"
        value = [PATH_UPDATE_REGION],
        produces = ["*/*"]
    )
    fun updateRegion(
        @NotNull @Parameter(description = "The id of the account sending the request", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The id of the region to be updated", required = true) @Valid @RequestParam(value = "regionId", required = true) regionId: kotlin.Long,
        @Parameter(description = "RegionClass of this region") @Valid @RequestParam(value = "regionClass", required = false) regionClass: kotlin.String?,
        @Parameter(description = "Short name of the region. This is optimized for search") @Valid @RequestParam(value = "shortName", required = false) shortName: kotlin.String?,
        @Parameter(description = "Full name of the region") @Valid @RequestParam(value = "fullName", required = false) fullName: kotlin.String?,
        @Parameter(description = "Comma separated region ids that are parents of this region") @Valid @RequestParam(value = "parentIds", required = false) parentIds: kotlin.String?,
        @Parameter(description = "Comma separated region ids that are children of this region") @Valid @RequestParam(value = "childrenIds", required = false) childrenIds: kotlin.String?,
        @Parameter(description = "Comma separated postal code ids the region will include") @Valid @RequestParam(value = "postalCodeIds", required = false) postalCodeIds: kotlin.String?,
        @Parameter(description = "Sets of name,lat,long used to create new postal codes assigned to the region") @Valid @RequestParam(value = "locations", required = false) locations: kotlin.String?,
        @Parameter(description = "the retailer location ID that the region is associated with") @Valid @RequestParam(value = "retailerLocationId", required = false) retailerLocationId: kotlin.Long?,
        @Parameter(description = "The Visibility of the region", schema = Schema(allowableValues = ["PUBLIC", "PRIVATE", "FRIENDS"])) @Valid @RequestParam(value = "visibility", required = false) visibility: kotlin.String?,
        @Parameter(description = "the categories that the region is assigned to") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "the filters that the region is assigned to") @Valid @RequestParam(value = "filterIds", required = false) filterIds: kotlin.String?,
        @Parameter(description = "") @Valid @RequestParam(value = "start", required = false) start: kotlin.Long?,
        @Parameter(description = "") @Valid @RequestParam(value = "end", required = false) end: kotlin.Long?,
        @Parameter(description = "the polygon of the region") @Valid @RequestParam(value = "polygon", required = false) polygon: kotlin.String?,
        @Parameter(description = "the meta data of the region") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?,
        @Parameter(description = "the latitude of the region") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the longitude of the region") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "the version code") @Valid @RequestParam(value = "versionCode", required = false) versionCode: kotlin.Int?,
        @Parameter(description = "If this is a root region or not. If true means this region has no parent regions") @Valid @RequestParam(value = "root", required = false) root: kotlin.Boolean?,
        @Parameter(description = "Active or inactive status of the region") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "If true clear the children and postal code lists before add new ones, otherwise just append.") @Valid @RequestParam(value = "clearLists", required = false) clearLists: kotlin.Boolean?
    ): ResponseEntity<RegionResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_REGION: String = "/region/create"
        const val PATH_DELETE_REGION: String = "/region/delete"
        const val PATH_GET_REGION: String = "/region/get"
        const val PATH_SEARCH_REGIONS: String = "/region/search"
        const val PATH_UPDATE_REGION: String = "/region/update"
    }
}
