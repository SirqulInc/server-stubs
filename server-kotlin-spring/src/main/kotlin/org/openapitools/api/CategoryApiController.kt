package org.openapitools.api

import org.openapitools.model.CategoryResponse
import org.openapitools.model.CategoryTreeResponse
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
class CategoryApiController() {

    @Operation(
        summary = "Search Categories by Distance",
        operationId = "categoryDistanceSearch",
        description = """Search for categories by distance.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = CategoryResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/category/distancesearch"
        value = [PATH_CATEGORY_DISTANCE_SEARCH],
        produces = ["*/*"]
    )
    fun categoryDistanceSearch(
        @Parameter(description = "The account id of the user") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The keyword string to search on") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "the appKey of the application to retrieve categories for, if not specified then search on the global application.") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "Restrict the search by specific categories") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "Restrict the search by specific parent categories so that only its sub children are searched.") @Valid @RequestParam(value = "parentCategoryIds", required = false) parentCategoryIds: kotlin.String?,
        @Parameter(description = "Restrict the search to only those categories with no parent category assigned.") @Valid @RequestParam(value = "rootOnly", required = false) rootOnly: kotlin.Boolean?,
        @Parameter(description = "The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, NAME, DISPLAY", schema = Schema(allowableValues = ["ID", "CREATED", "UPDATED", "DELETED", "SEARCH_TAGS", "ACTIVE", "NAME", "DISPLAY"], defaultValue = "DISPLAY")) @Valid @RequestParam(value = "sortField", required = false, defaultValue = "DISPLAY") sortField: kotlin.String,
        @Parameter(description = "The group of categories to return: ALL, GLOBAL or MINE. ALL returns both global and application specific matches, GLOBAL only returns global matches, and MINE only returns the application specific matches. If not provided search on the application provided.", schema = Schema(allowableValues = ["ALL", "GLOBAL", "MINE"])) @Valid @RequestParam(value = "responseGroup", required = false) responseGroup: kotlin.String?,
        @Parameter(description = "The order to return the search results", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "descending", required = false, defaultValue = "false") descending: kotlin.Boolean,
        @Parameter(description = "The record to begin the return set on", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "The number of records to return", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int,
        @Parameter(description = "Determines whether to return only active categories", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "activeOnly", required = false, defaultValue = "true") activeOnly: kotlin.Boolean,
        @Parameter(description = "Determines whether to return extra info about the category's \"Participant\" reference") @Valid @RequestParam(value = "returnExternal", required = false) returnExternal: kotlin.Boolean?,
        @Parameter(description = "If true search categories using the exact keyword, if false then do a partial match (like) search.") @Valid @RequestParam(value = "exactMatch", required = false) exactMatch: kotlin.Boolean?,
        @Parameter(description = "Filters results by the Category's type") @Valid @RequestParam(value = "type", required = false) type: kotlin.String?,
        @Parameter(description = "Filters results by externalType") @Valid @RequestParam(value = "externalType", required = false) externalType: kotlin.String?,
        @Parameter(description = "Filters results to only return Categories that have been referenced by a minimum number of Offers") @Valid @RequestParam(value = "minOfferCount", required = false) minOfferCount: kotlin.Int?,
        @Parameter(description = "the latitude of where the search is centered on") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the longitude of where the search is centered on") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "the maximum range the category can be from the center") @Valid @RequestParam(value = "range", required = false) range: kotlin.Double?
    ): ResponseEntity<List<CategoryResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Category",
        operationId = "createCategory",
        description = """Create a new category.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = CategoryTreeResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/category/create"
        value = [PATH_CREATE_CATEGORY],
        produces = ["*/*"]
    )
    fun createCategory(
        @NotNull @Parameter(description = "The account id of the user (must have permissions to the target application)", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The name of the category", required = true) @Valid @RequestParam(value = "name", required = true) name: kotlin.String,
        @Parameter(description = "The appKey of the application to assign the category to, if not provided then the category will be applied to the global application (if the account has permissions)") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "The ID of the parent category, if not provided then the parent category will be null") @Valid @RequestParam(value = "parentCategoryId", required = false) parentCategoryId: kotlin.Long?,
        @Parameter(description = "The description of the category") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "The type of the category") @Valid @RequestParam(value = "type", required = false) type: kotlin.String?,
        @Parameter(description = "The ID of the image asset previously uploaded using the media service") @Valid @RequestParam(value = "assetId", required = false) assetId: kotlin.Long?,
        @Parameter(description = "A string identifier used by client applications to store external information") @Valid @RequestParam(value = "externalId", required = false) externalId: kotlin.String?,
        @Parameter(description = "A string type used by client applications to store external information") @Valid @RequestParam(value = "externalType", required = false) externalType: kotlin.String?,
        @Parameter(description = "external category slug") @Valid @RequestParam(value = "externalCategorySlug", required = false) externalCategorySlug: kotlin.String?,
        @Parameter(description = "sqoot slug") @Valid @RequestParam(value = "sqootSlug", required = false) sqootSlug: kotlin.String?,
        @Parameter(description = "Sets whether the category is active or inactive (hidden from consumers)") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "external custom client defined data") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?,
        @Parameter(description = "user defined strings for searching") @Valid @RequestParam(value = "searchTags", required = false) searchTags: kotlin.String?
    ): ResponseEntity<CategoryTreeResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Category",
        operationId = "deleteCategory",
        description = """Delete a category.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/category/delete"
        value = [PATH_DELETE_CATEGORY],
        produces = ["*/*"]
    )
    fun deleteCategory(
        @NotNull @Parameter(description = "the ID of the account", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the ID of the category", required = true) @Valid @RequestParam(value = "categoryId", required = true) categoryId: kotlin.Long
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Duplicate Category",
        operationId = "duplicateCategory",
        description = """Duplicate a category, including all its children.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = CategoryTreeResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/category/duplicate"
        value = [PATH_DUPLICATE_CATEGORY],
        produces = ["*/*"]
    )
    fun duplicateCategory(
        @NotNull @Parameter(description = "The account id of the user (must have permissions to the target application)", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The category ID to duplicate (includes all children)", required = true) @Valid @RequestParam(value = "categoryId", required = true) categoryId: kotlin.Long,
        @Parameter(description = "The application to assign the new category to, may be different then the application the source category is assigned to") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "The parent category ID to add the target category to.") @Valid @RequestParam(value = "parentCategoryId", required = false) parentCategoryId: kotlin.Long?
    ): ResponseEntity<CategoryTreeResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Category",
        operationId = "getCategory",
        description = """Get the details of a specific category. Recursively include all child categories and their children.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = CategoryTreeResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/category/get"
        value = [PATH_GET_CATEGORY],
        produces = ["*/*"]
    )
    fun getCategory(
        @NotNull @Parameter(description = "the ID of the category", required = true) @Valid @RequestParam(value = "categoryId", required = true) categoryId: kotlin.Long,
        @Parameter(description = "Determines whether to return extra info about the category's \"Participant\" reference", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "returnExternal", required = false, defaultValue = "true") returnExternal: kotlin.Boolean
    ): ResponseEntity<CategoryTreeResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Categories",
        operationId = "searchCategories",
        description = """Search for categories.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = CategoryResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/category/search"
        value = [PATH_SEARCH_CATEGORIES],
        produces = ["*/*"]
    )
    fun searchCategories(
        @Parameter(description = "The account id of the user") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The string to search on") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "the appKey of the application to retrieve categories for, if not specified then search on the global application.") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "@Deprecated, use parentCategoryIds instead") @Valid @RequestParam(value = "categoryId", required = false) categoryId: kotlin.String?,
        @Parameter(description = "Restrict the search by specific categories") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "Restrict the search by specific parent categories so that only its sub children are searched.") @Valid @RequestParam(value = "parentCategoryIds", required = false) parentCategoryIds: kotlin.String?,
        @Parameter(description = "Restrict the search to only those categories with no parent category assigned.") @Valid @RequestParam(value = "rootOnly", required = false) rootOnly: kotlin.Boolean?,
        @Parameter(description = "The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, NAME, DISPLAY", schema = Schema(allowableValues = ["ID", "CREATED", "UPDATED", "DELETED", "SEARCH_TAGS", "ACTIVE", "NAME", "DISPLAY"], defaultValue = "DISPLAY")) @Valid @RequestParam(value = "sortField", required = false, defaultValue = "DISPLAY") sortField: kotlin.String,
        @Parameter(description = "The group of categories to return: ALL, GLOBAL or MINE. ALL returns both global and application specific matches, GLOBAL only returns global matches, and MINE only returns the application specific matches. If not provided search on the application provided.", schema = Schema(allowableValues = ["ALL", "GLOBAL", "MINE"])) @Valid @RequestParam(value = "responseGroup", required = false) responseGroup: kotlin.String?,
        @Parameter(description = "The order to return the search results", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "descending", required = false, defaultValue = "false") descending: kotlin.Boolean,
        @Parameter(description = "The record to begin the return set on", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "The number of records to return", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int,
        @Parameter(description = "Determines whether to return only active categories", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "activeOnly", required = false, defaultValue = "true") activeOnly: kotlin.Boolean,
        @Parameter(description = "Determines whether to return extra info about the category's \"Participant\" reference", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "returnExternal", required = false, defaultValue = "true") returnExternal: kotlin.Boolean,
        @Parameter(description = "If true search categories using the exact keyword, if false then do a partial match (like) search. Default is false.", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "exactMatch", required = false, defaultValue = "false") exactMatch: kotlin.Boolean,
        @Parameter(description = "Filters results by the Category's type") @Valid @RequestParam(value = "type", required = false) type: kotlin.String?,
        @Parameter(description = "Filters results by externalType") @Valid @RequestParam(value = "externalType", required = false) externalType: kotlin.String?,
        @Parameter(description = "Determines whether the \"externalType\" param is excluded from the search results") @Valid @RequestParam(value = "excludeExternalType", required = false) excludeExternalType: kotlin.Boolean?,
        @Parameter(description = "Filters results to only return Categories that have been referenced by a minimum number of Offers") @Valid @RequestParam(value = "minOfferCount", required = false) minOfferCount: kotlin.Int?,
        @Parameter(description = "When searching by a specific parent category (to return sub children), this determines the number of child layers to search in. The minimum is 1, the maximum is 4.", schema = Schema(defaultValue = "4")) @Valid @RequestParam(value = "searchDepth", required = false, defaultValue = "4") searchDepth: kotlin.Int,
        @Parameter(description = "The search index mode to use (e.g. OPENSEARCH or RDS)") @Valid @RequestParam(value = "searchMode", required = false) searchMode: kotlin.String?
    ): ResponseEntity<List<CategoryResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Category",
        operationId = "updateCategory",
        description = """Update a category.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = CategoryTreeResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/category/update"
        value = [PATH_UPDATE_CATEGORY],
        produces = ["*/*"]
    )
    fun updateCategory(
        @NotNull @Parameter(description = "The account id of the user", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The ID of the category to edit", required = true) @Valid @RequestParam(value = "categoryId", required = true) categoryId: kotlin.Long,
        @Parameter(description = "The ID of the parent category, if not provided then the parent category will be null") @Valid @RequestParam(value = "parentCategoryId", required = false) parentCategoryId: kotlin.Long?,
        @Parameter(description = "The name of the category") @Valid @RequestParam(value = "name", required = false) name: kotlin.String?,
        @Parameter(description = "The description of the category") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "The type of the category") @Valid @RequestParam(value = "type", required = false) type: kotlin.String?,
        @Parameter(description = "The ID of the image asset previously uploaded using the media service") @Valid @RequestParam(value = "assetId", required = false) assetId: kotlin.Long?,
        @Parameter(description = "A string identifier used by client applications to store external information") @Valid @RequestParam(value = "externalId", required = false) externalId: kotlin.String?,
        @Parameter(description = "A string type used by client applications to store external information") @Valid @RequestParam(value = "externalType", required = false) externalType: kotlin.String?,
        @Parameter(description = "external category slug") @Valid @RequestParam(value = "externalCategorySlug", required = false) externalCategorySlug: kotlin.String?,
        @Parameter(description = "sqoot slug") @Valid @RequestParam(value = "sqootSlug", required = false) sqootSlug: kotlin.String?,
        @Parameter(description = "Sets whether the category is active or inactive (hidden from consumers)") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "external custom client defined data") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?,
        @Parameter(description = "user defined strings for searching") @Valid @RequestParam(value = "searchTags", required = false) searchTags: kotlin.String?
    ): ResponseEntity<CategoryTreeResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CATEGORY_DISTANCE_SEARCH: String = "/category/distancesearch"
        const val PATH_CREATE_CATEGORY: String = "/category/create"
        const val PATH_DELETE_CATEGORY: String = "/category/delete"
        const val PATH_DUPLICATE_CATEGORY: String = "/category/duplicate"
        const val PATH_GET_CATEGORY: String = "/category/get"
        const val PATH_SEARCH_CATEGORIES: String = "/category/search"
        const val PATH_UPDATE_CATEGORY: String = "/category/update"
    }
}
