package org.openapitools.api

import org.openapitools.model.AgeGroupResponse
import org.openapitools.model.AudienceDeviceResponse
import org.openapitools.model.AudienceResponse
import org.openapitools.model.OfferListResponse
import org.openapitools.model.SearchResponse
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
class AudienceApiController() {

    @Operation(
        summary = "Create Audience",
        operationId = "createAudience",
        description = """Create a user defined audience.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AudienceResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/audience/create"
        value = [PATH_CREATE_AUDIENCE],
        produces = ["*/*"]
    )
    fun createAudience(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The name of the audience", required = true) @Valid @RequestParam(value = "name", required = true) name: kotlin.String,
        @Parameter(description = "The description of the audience") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "The search tags") @Valid @RequestParam(value = "searchTags", required = false) searchTags: kotlin.String?,
        @Parameter(description = "The gender; possible values are: MALE, FEMALE, ANY") @Valid @RequestParam(value = "gender", required = false) gender: kotlin.String?,
        @Parameter(description = "The list of age groups, comma separated; possible values are AGE_0_13, AGE_14_17, AGE_18_22, AGE_23_30, AGE_31_54, AGE_55_PLUS, AGE_ANY (to reset to none)") @Valid @RequestParam(value = "ageGroups", required = false) ageGroups: kotlin.String?,
        @Parameter(description = "The list of category ids, comma separated; possible values are retrieved via /api/{version}/category/search (pass in id values)") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "The list of application ids, comma separated; possible values are retrieved via /api/{version}/application/list (pass in id values)") @Valid @RequestParam(value = "applicationIds", required = false) applicationIds: kotlin.String?,
        @Parameter(description = "The experience level of the player; possible values are: ANY, NEW, BEGINNER, INTERMEDIATE, EXPERT") @Valid @RequestParam(value = "gameExperienceLevel", required = false) gameExperienceLevel: kotlin.String?,
        @Parameter(description = "(Deprecated) Use deviceIds. The list of targeted device names, comma separated; possible values are retrieved via /api/{version}/audience/devices (pass in name values)") @Valid @RequestParam(value = "devices", required = false) devices: kotlin.String?,
        @Parameter(description = "The list of targeted device ids, comma separated; possible values are retrieved via /api/{version}/audience/devices (pass in id values)") @Valid @RequestParam(value = "deviceIds", required = false) deviceIds: kotlin.String?,
        @Parameter(description = "The list of targeted device version ranges that are aligned with the provided devices list, comma separated (examples: 2.3-X, 0-5.1.4, 4.3.1-6.1.4)") @Valid @RequestParam(value = "deviceVersions", required = false) deviceVersions: kotlin.String?,
        @Parameter(description = "The list of locations to build the center around; comma separated list of latitude/longitude pairs (example: lat1,long1,lat2,long2)") @Valid @RequestParam(value = "locations", required = false) locations: kotlin.String?,
        @Parameter(description = "The list of radius of influence for the audience, in miles; comma separated list. Either provide 1 to be applied to all location pairs or a matching list to each lat/long pair.") @Valid @RequestParam(value = "radius", required = false) radius: kotlin.String?,
        @Parameter(description = "Seconds from the start time of an event") @Valid @RequestParam(value = "startTimeOffset", required = false) startTimeOffset: kotlin.Int?,
        @Parameter(description = "Seconds from the end time of an event") @Valid @RequestParam(value = "endTimeOffset", required = false) endTimeOffset: kotlin.Int?,
        @Parameter(description = "If true, then notify matching users when they are inside the radius", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "sendSuggestion", required = false, defaultValue = "true") sendSuggestion: kotlin.Boolean,
        @Parameter(description = "The description of the associated object") @Valid @RequestParam(value = "associateDescription", required = false) associateDescription: kotlin.String?,
        @Parameter(description = "The type of the object to center the audience geofence") @Valid @RequestParam(value = "associateType", required = false) associateType: kotlin.String?,
        @Parameter(description = "The ID of the object to center the audience geofence") @Valid @RequestParam(value = "associateId", required = false) associateId: kotlin.Long?,
        @Parameter(description = "Optional grouping id for the audience") @Valid @RequestParam(value = "groupingId", required = false) groupingId: kotlin.String?,
        @Parameter(description = "External custom client defined data") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?,
        @Parameter(description = "Visibility of the audience") @Valid @RequestParam(value = "visibility", required = false) visibility: kotlin.String?,
        @Parameter(description = "Type of audience") @Valid @RequestParam(value = "audienceType", required = false) audienceType: kotlin.String?,
        @Parameter(description = "Use order for cohort") @Valid @RequestParam(value = "useOrder", required = false) useOrder: kotlin.Boolean?,
        @Parameter(description = "Cohort data for \"cohort\" audience type") @Valid @RequestParam(value = "cohortRegionsData", required = false) cohortRegionsData: kotlin.String?,
        @Parameter(description = "Filter results by application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "Trilateration types") @Valid @RequestParam(value = "trilaterationTypes", required = false) trilaterationTypes: kotlin.String?,
        @Parameter(description = "If true, makes sure the audience name is unique") @Valid @RequestParam(value = "uniqueName", required = false) uniqueName: kotlin.Boolean?
    ): ResponseEntity<AudienceResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Audience",
        operationId = "deleteAudience",
        description = """Delete an audience. The audience and account must be valid and have the appropirate permissions to view the content.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/audience/delete"
        value = [PATH_DELETE_AUDIENCE],
        produces = ["*/*"]
    )
    fun deleteAudience(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The id of the audience to delete.", required = true) @Valid @RequestParam(value = "audienceId", required = true) audienceId: kotlin.Long
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Age Groups",
        operationId = "getAgeGroups",
        description = """Gets the list of available age groups that can be selected by consumers and retailers targeting offers.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = AgeGroupResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/audience/ageGroups"
        value = [PATH_GET_AGE_GROUPS],
        produces = ["*/*"]
    )
    fun getAgeGroups(): ResponseEntity<List<AgeGroupResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Audience",
        operationId = "getAudience",
        description = """Get an audience. The audience and account must be valid and have the appropriate permissions to view the content.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AudienceResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/audience/get"
        value = [PATH_GET_AUDIENCE],
        produces = ["*/*"]
    )
    fun getAudience(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The id of the audience to return.", required = true) @Valid @RequestParam(value = "audienceId", required = true) audienceId: kotlin.Long,
        @Parameter(description = "The application key (optional). If provided, results may be scoped to this application.") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "(boolean) set to true to include the accountCount associated with current audience of the current app", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "returnAccountCount", required = false, defaultValue = "false") returnAccountCount: kotlin.Boolean,
        @Parameter(description = "(boolean) set to true to include the albumCount associated with current audience of the current app", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "returnAlbumCount", required = false, defaultValue = "false") returnAlbumCount: kotlin.Boolean,
        @Parameter(description = "(String) comma separated list, return an array with each item is the count of each album type. If not provided, \"all_types\" count is returned.") @Valid @RequestParam(value = "albumTypesForCount", required = false) albumTypesForCount: kotlin.String?
    ): ResponseEntity<AudienceResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Audiences",
        operationId = "getAudienceList",
        description = """Get the list audiences owned by the account""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = SearchResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/audience/search"
        value = [PATH_GET_AUDIENCE_LIST],
        produces = ["*/*"]
    )
    fun getAudienceList(
        @Parameter(description = "The logged in user.") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "Comma separated list of album IDs to filter results with") @Valid @RequestParam(value = "albumIds", required = false) albumIds: kotlin.String?,
        @Parameter(description = "The keyword used to search") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "Comma separated list of fields that the keywords will match against. Possible values include: SEARCH_TAGS, NAME, DESCRIPTION, OWNER_DISPLAY", schema = Schema(defaultValue = "SEARCH_TAGS,NAME,DESCRIPTION")) @Valid @RequestParam(value = "keywordFields", required = false, defaultValue = "SEARCH_TAGS,NAME,DESCRIPTION") keywordFields: kotlin.String,
        @Parameter(description = "The field to sort by, possible values include: {ID, CREATED, UPDATED, DELETED, SEARCH_TAGS, ACTIVE, NAME, DESCRIPTION, OWNER_ID, OWNER_DISPLAY, GENDER}", schema = Schema(allowableValues = ["ID", "CREATED", "UPDATED", "DELETED", "SEARCH_TAGS", "ACTIVE", "NAME", "DESCRIPTION", "SEND_SUGGESTION", "OWNER_ID", "OWNER_DISPLAY", "GENDER"], defaultValue = "NAME")) @Valid @RequestParam(value = "sortField", required = false, defaultValue = "NAME") sortField: kotlin.String,
        @Parameter(description = "The order to return the results. Default is false, which will return the results in ascending order.", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "descending", required = false, defaultValue = "false") descending: kotlin.Boolean,
        @Parameter(description = "The index into the record set to start with.", schema = Schema(defaultValue = "0")) @Valid @RequestParam(value = "start", required = false, defaultValue = "0") start: kotlin.Int,
        @Parameter(description = "The total number of record to return (there is a hard limit of 100).", schema = Schema(defaultValue = "20")) @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") limit: kotlin.Int,
        @Parameter(description = "Filter results based on whether or not the audience is set to send suggestions") @Valid @RequestParam(value = "sendSuggestion", required = false) sendSuggestion: kotlin.Boolean?,
        @Parameter(description = "Determines whether to return only active results. Default is false.") @Valid @RequestParam(value = "activeOnly", required = false) activeOnly: kotlin.Boolean?,
        @Parameter(description = "Groups results by the audience groupingId (this does not work in conjunction with the following parameters: albumIds, audienceType, appKey, returnGlobal)") @Valid @RequestParam(value = "groupByGroupingId", required = false) groupByGroupingId: kotlin.Boolean?,
        @Parameter(description = "Filter results by application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "If filtering by appKey, determines whether or not audiences that do not have an application set will also be returned as well") @Valid @RequestParam(value = "returnGlobal", required = false) returnGlobal: kotlin.Boolean?,
        @Parameter(description = "If true, match keyword exactly") @Valid @RequestParam(value = "exactKeyword", required = false) exactKeyword: kotlin.Boolean?,
        @Parameter(description = "(Deprecated) Filter results by audience type") @Valid @RequestParam(value = "audienceType", required = false) audienceType: kotlin.String?,
        @Parameter(description = "comma separated string with the different audience types you want to filter for") @Valid @RequestParam(value = "audienceTypes", required = false) audienceTypes: kotlin.String?,
        @Parameter(description = "(boolean) set to true to include the accountCount associated with current audience of the current app", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "returnAccountCount", required = false, defaultValue = "false") returnAccountCount: kotlin.Boolean,
        @Parameter(description = "(boolean) set to true to include the albumCount associated with current audience of the current app", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "returnAlbumCount", required = false, defaultValue = "false") returnAlbumCount: kotlin.Boolean,
        @Parameter(description = "(String) comma separated list, return an array with each item is the count of each album type. If not provided, \"all_types\" count is returned.") @Valid @RequestParam(value = "albumTypesForCount", required = false) albumTypesForCount: kotlin.String?
    ): ResponseEntity<List<SearchResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Devices",
        operationId = "getDevices",
        description = """Gets the list of available devices that can be selected by consumers and retailers.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = AudienceDeviceResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/audience/devices"
        value = [PATH_GET_DEVICES],
        produces = ["*/*"]
    )
    fun getDevices(
        @NotNull @Parameter(description = "If true return inactive record as well. default is false.", required = true) @Valid @RequestParam(value = "includeInactive", required = true) includeInactive: kotlin.Boolean
    ): ResponseEntity<List<AudienceDeviceResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Experiences",
        operationId = "getExperiences",
        description = """Gets the list of available experiences that can be selected by consumers and retailers.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/audience/experiences"
        value = [PATH_GET_EXPERIENCES],
        produces = ["*/*"]
    )
    fun getExperiences(): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get GroupedAudiences",
        operationId = "getGroupedAudiences",
        description = """Get a group of audiences. The audience and account must be valid and have the appropriate permissions to view the content.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AudienceResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/audience/grouped/get"
        value = [PATH_GET_GROUPED_AUDIENCES],
        produces = ["*/*"]
    )
    fun getGroupedAudiences(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The audience grouping id to return.", required = true) @Valid @RequestParam(value = "audienceGroupingId", required = true) audienceGroupingId: kotlin.String
    ): ResponseEntity<AudienceResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List Suggestions by Audience",
        operationId = "listByAccount",
        description = """List either Missions or Offers that the user matches the assigned audience.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OfferListResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/audience/suggestion/list"
        value = [PATH_LIST_BY_ACCOUNT],
        produces = ["*/*"]
    )
    fun listByAccount(
        @NotNull @Parameter(description = "The account to match offers for.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the limit of the index", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @NotNull @Parameter(description = "the type of suggestion", required = true) @Valid @RequestParam(value = "suggestionType", required = true) suggestionType: kotlin.String
    ): ResponseEntity<OfferListResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List Offers by Audience",
        operationId = "listByAudience",
        description = """Get a list of offer locations based on audience information provided.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OfferListResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/audience/suggestion/offersByAudience"
        value = [PATH_LIST_BY_AUDIENCE],
        produces = ["*/*"]
    )
    fun listByAudience(
        @NotNull @Parameter(description = "this is the limit of the index", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @Parameter(description = "this is the gender to list offers by") @Valid @RequestParam(value = "gender", required = false) gender: kotlin.String?,
        @Parameter(description = "this is the age to list offers by") @Valid @RequestParam(value = "age", required = false) age: kotlin.Int?,
        @Parameter(description = "this is the category IDs to list offers by") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "this is the latitude to list offers by") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "this is the longitude to list offers by") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<OfferListResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "List Sent Suggestions ",
        operationId = "listLastestByAccount",
        description = """Return list of recent trigger suggestions that have been sent to the user.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = OfferListResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/audience/suggestion/latest"
        value = [PATH_LIST_LASTEST_BY_ACCOUNT],
        produces = ["*/*"]
    )
    fun listLastestByAccount(
        @NotNull @Parameter(description = "The account to match offers for.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The timeframe in seconds of the latest suggestions", required = true) @Valid @RequestParam(value = "timeframe", required = true) timeframe: kotlin.Int,
        @NotNull @Parameter(description = "The type of trigger suggestions to return", required = true) @Valid @RequestParam(value = "suggestionType", required = true) suggestionType: kotlin.String
    ): ResponseEntity<OfferListResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Send Suggestions",
        operationId = "sendByAccount",
        description = """Use the accountId to determine the associated BillableEntity. From there get a list of all triggers associated with the BillableEntity.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/audience/suggestion/send"
        value = [PATH_SEND_BY_ACCOUNT],
        produces = ["*/*"]
    )
    fun sendByAccount(
        @NotNull @Parameter(description = "The account to match offers for.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "the latitude", required = true) @Valid @RequestParam(value = "latitude", required = true) latitude: kotlin.Double,
        @NotNull @Parameter(description = "the longitude", required = true) @Valid @RequestParam(value = "longitude", required = true) longitude: kotlin.Double
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Audience",
        operationId = "updateAudience",
        description = """Update a user defined audience.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AudienceResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/audience/update"
        value = [PATH_UPDATE_AUDIENCE],
        produces = ["*/*"]
    )
    fun updateAudience(
        @NotNull @Parameter(description = "The logged in user.", required = true) @Valid @RequestParam(value = "accountId", required = true) accountId: kotlin.Long,
        @NotNull @Parameter(description = "The id of the audience to update.", required = true) @Valid @RequestParam(value = "audienceId", required = true) audienceId: kotlin.Long,
        @Parameter(description = "The name of the audience") @Valid @RequestParam(value = "name", required = false) name: kotlin.String?,
        @Parameter(description = "The description of the audience") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "The search tags") @Valid @RequestParam(value = "searchTags", required = false) searchTags: kotlin.String?,
        @Parameter(description = "The gender; possible values are: MALE, FEMALE, ANY") @Valid @RequestParam(value = "gender", required = false) gender: kotlin.String?,
        @Parameter(description = "The list of age groups, comma separated; possible values are AGE_0_13, AGE_14_17, AGE_18_22, AGE_23_30, AGE_31_54, AGE_55_PLUS, AGE_ANY (to reset to none)") @Valid @RequestParam(value = "ageGroups", required = false) ageGroups: kotlin.String?,
        @Parameter(description = "The list of category ids, comma separated; possible values are retrieved via /api/{version}/category/search (pass in id values)") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "The list of application ids, comma separated; possible values are retrieved via /api/{version}/application/list (pass in id values)") @Valid @RequestParam(value = "applicationIds", required = false) applicationIds: kotlin.String?,
        @Parameter(description = "The experience level of the player; possible values are: ANY, NEW, BEGINNER, INTERMEDIATE, EXPERT") @Valid @RequestParam(value = "gameExperienceLevel", required = false) gameExperienceLevel: kotlin.String?,
        @Parameter(description = "(Deprecated) Use deviceIds. The list of targeted device names, comma separated; possible values are retrieved via /api/{version}/audience/devices (pass in name values)") @Valid @RequestParam(value = "devices", required = false) devices: kotlin.String?,
        @Parameter(description = "The list of targeted device ids, comma separated; possible values are retrieved via /api/{version}/audience/devices (pass in id values)") @Valid @RequestParam(value = "deviceIds", required = false) deviceIds: kotlin.String?,
        @Parameter(description = "The list of targeted device version ranges that are aligned with the provided devices list, comma separated (examples: 2.3-X, 0-5.1.4, 4.3.1-6.1.4)") @Valid @RequestParam(value = "deviceVersions", required = false) deviceVersions: kotlin.String?,
        @Parameter(description = "The list of locations to build the center around; comma separated list of latitude/longitude pairs (example: lat1,long1,lat2,long2)") @Valid @RequestParam(value = "locations", required = false) locations: kotlin.String?,
        @Parameter(description = "The list of radius of influence for the audience, in miles; comma separated list. Either provide 1 to be applied to all location pairs or a matching list to each lat/long pair.") @Valid @RequestParam(value = "radius", required = false) radius: kotlin.String?,
        @Parameter(description = "if audience is active") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "If true, then notify matching users when they are inside the radius") @Valid @RequestParam(value = "sendSuggestion", required = false) sendSuggestion: kotlin.Boolean?,
        @Parameter(description = "Seconds from the start time of an event") @Valid @RequestParam(value = "startTimeOffset", required = false) startTimeOffset: kotlin.Int?,
        @Parameter(description = "Seconds from the end time of an event") @Valid @RequestParam(value = "endTimeOffset", required = false) endTimeOffset: kotlin.Int?,
        @Parameter(description = "the associate description") @Valid @RequestParam(value = "associateDescription", required = false) associateDescription: kotlin.String?,
        @Parameter(description = "The type of the object to center the audience geofence") @Valid @RequestParam(value = "associateType", required = false) associateType: kotlin.String?,
        @Parameter(description = "The ID of the object to center the audience geofence") @Valid @RequestParam(value = "associateId", required = false) associateId: kotlin.Long?,
        @Parameter(description = "Optional grouping id for the audience") @Valid @RequestParam(value = "groupingId", required = false) groupingId: kotlin.String?,
        @Parameter(description = "External custom client defined data") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?,
        @Parameter(description = "Visibility of the audience") @Valid @RequestParam(value = "visibility", required = false) visibility: kotlin.String?,
        @Parameter(description = "Type of audience") @Valid @RequestParam(value = "audienceType", required = false) audienceType: kotlin.String?,
        @Parameter(description = "Use order for cohort") @Valid @RequestParam(value = "useOrder", required = false) useOrder: kotlin.Boolean?,
        @Parameter(description = "Cohort data for \"cohort\" audience type") @Valid @RequestParam(value = "cohortRegionsData", required = false) cohortRegionsData: kotlin.String?,
        @Parameter(description = "Filter results by application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "Trilateration types") @Valid @RequestParam(value = "trilaterationTypes", required = false) trilaterationTypes: kotlin.String?,
        @Parameter(description = "If true, makes sure the audience name is unique") @Valid @RequestParam(value = "uniqueName", required = false) uniqueName: kotlin.Boolean?
    ): ResponseEntity<AudienceResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_CREATE_AUDIENCE: String = "/audience/create"
        const val PATH_DELETE_AUDIENCE: String = "/audience/delete"
        const val PATH_GET_AGE_GROUPS: String = "/audience/ageGroups"
        const val PATH_GET_AUDIENCE: String = "/audience/get"
        const val PATH_GET_AUDIENCE_LIST: String = "/audience/search"
        const val PATH_GET_DEVICES: String = "/audience/devices"
        const val PATH_GET_EXPERIENCES: String = "/audience/experiences"
        const val PATH_GET_GROUPED_AUDIENCES: String = "/audience/grouped/get"
        const val PATH_LIST_BY_ACCOUNT: String = "/audience/suggestion/list"
        const val PATH_LIST_BY_AUDIENCE: String = "/audience/suggestion/offersByAudience"
        const val PATH_LIST_LASTEST_BY_ACCOUNT: String = "/audience/suggestion/latest"
        const val PATH_SEND_BY_ACCOUNT: String = "/audience/suggestion/send"
        const val PATH_UPDATE_AUDIENCE: String = "/audience/update"
    }
}
