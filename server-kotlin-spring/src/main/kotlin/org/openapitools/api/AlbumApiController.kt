package org.openapitools.api

import org.openapitools.model.AlbumFullResponse
import org.openapitools.model.AlbumResponse
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
class AlbumApiController() {

    @Operation(
        summary = "Create Album",
        operationId = "addAlbumCollection",
        description = """Create an Album.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SearchResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/album/create"
        value = [PATH_ADD_ALBUM_COLLECTION],
        produces = ["*/*"]
    )
    fun addAlbumCollection(
        @NotNull @Parameter(description = "the title of the album", required = true) @Valid @RequestParam(value = "title", required = true) title: kotlin.String,
        @NotNull @Parameter(description = "determines whether the cover image of the album can be empty, else will use the user's profile picture as the cover image", required = true) @Valid @RequestParam(value = "coverAssetNullable", required = true) coverAssetNullable: kotlin.Boolean,
        @NotNull @Parameter(description = "determines whether the cover image should be added to the album asset list", required = true) @Valid @RequestParam(value = "includeCoverInAssetList", required = true) includeCoverInAssetList: kotlin.Boolean,
        @NotNull @Parameter(description = "determines whether the album's participants has read permissions", required = true) @Valid @RequestParam(value = "publicRead", required = true) publicRead: kotlin.Boolean,
        @NotNull @Parameter(description = "determines whether the album's participants has write permissions", required = true) @Valid @RequestParam(value = "publicWrite", required = true) publicWrite: kotlin.Boolean,
        @NotNull @Parameter(description = "determines whether the album's participants has delete permissions", required = true) @Valid @RequestParam(value = "publicDelete", required = true) publicDelete: kotlin.Boolean,
        @NotNull @Parameter(description = "determines whether the album's participants has add permissions", required = true) @Valid @RequestParam(value = "publicAdd", required = true) publicAdd: kotlin.Boolean,
        @NotNull @Parameter(description = "determines whether the album is posted anonymously", required = true) @Valid @RequestParam(value = "anonymous", required = true) anonymous: kotlin.Boolean,
        @Parameter(description = "a unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "Comma separated list of asset IDs to add to the album's asset list (use \"assetId\" for setting the cover of the album)") @Valid @RequestParam(value = "assetsToAdd", required = false) assetsToAdd: kotlin.String?,
        @Parameter(description = "a MultipartFile containing the cover image of the album (this will only be used if \"assetId\" is empty)") @Valid @RequestParam(value = "media", required = false) media: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "this can be used if the \"media\" is a link (this will only be used if \"assetId\" and media are empty)") @Valid @RequestParam(value = "mediaURL", required = false) mediaURL: kotlin.String?,
        @Parameter(description = "The asset ID to set the album cover image") @Valid @RequestParam(value = "assetId", required = false) assetId: kotlin.Long?,
        @Parameter(description = "a MultipartFile containing an asset that the \"media\" file references. Example to upload a video: the \"media\" file should contain a screen capture of the video, and the \"attachedMedia\" should be the actual video.") @Valid @RequestParam(value = "attachedMedia", required = false) attachedMedia: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "this can be used if the \"attachedMedia\" is a link (i.e. a Youtube video, etc)") @Valid @RequestParam(value = "attachedMediaURL", required = false) attachedMediaURL: kotlin.String?,
        @Parameter(description = "the start date") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "the end date") @Valid @RequestParam(value = "endDate", required = false) endDate: kotlin.Long?,
        @Parameter(description = "the tags") @Valid @RequestParam(value = "tags", required = false) tags: kotlin.String?,
        @Parameter(description = "the description of the album") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "a custom field used for aggregation and searching") @Valid @RequestParam(value = "albumType", required = false) albumType: kotlin.String?,
        @Parameter(description = "a custom indexed number used for aggregation and searching") @Valid @RequestParam(value = "albumTypeId", required = false) albumTypeId: kotlin.Long?,
        @Parameter(description = "a custom string field used for aggregation and searching") @Valid @RequestParam(value = "subType", required = false) subType: kotlin.String?,
        @Parameter(description = "latitude used to update the album's location") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "longitude used to update the album's location") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "the location description") @Valid @RequestParam(value = "locationDescription", required = false) locationDescription: kotlin.String?,
        @Parameter(description = "the determines the album's participants (PUBLIC - includes everyone in the system as a potential participant, PRIVATE - only considers people who have been invited as participants)", schema = Schema(allowableValues = ["PUBLIC", "PRIVATE", "FRIENDS"])) @Valid @RequestParam(value = "visibility", required = false) visibility: kotlin.String?,
        @Parameter(description = "@deprecated, use the appKey") @Valid @RequestParam(value = "gameType", required = false) gameType: kotlin.String?,
        @Parameter(description = "the application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "the cell phone number") @Valid @RequestParam(value = "cellPhone", required = false) cellPhone: kotlin.String?,
        @Parameter(description = "The street address of the location") @Valid @RequestParam(value = "streetAddress", required = false) streetAddress: kotlin.String?,
        @Parameter(description = "Additional address information (such as a suite number, floor number, building name, or PO Box)") @Valid @RequestParam(value = "streetAddress2", required = false) streetAddress2: kotlin.String?,
        @Parameter(description = "The city of the location") @Valid @RequestParam(value = "city", required = false) city: kotlin.String?,
        @Parameter(description = "The state of of the location") @Valid @RequestParam(value = "state", required = false) state: kotlin.String?,
        @Parameter(description = "The postal code of the location") @Valid @RequestParam(value = "postalCode", required = false) postalCode: kotlin.String?,
        @Parameter(description = "The full address of the location which should include the street address, city, state, and postal code") @Valid @RequestParam(value = "fullAddress", required = false) fullAddress: kotlin.String?,
        @Parameter(description = "External custom client defined data") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?,
        @Parameter(description = "comma separated category ids string associated with the Album") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "comma separated filter ids string associated with the Album") @Valid @RequestParam(value = "categoryFilterIds", required = false) categoryFilterIds: kotlin.String?,
        @Parameter(description = "comma separated audience ids string associated with the album") @Valid @RequestParam(value = "audienceIds", required = false) audienceIds: kotlin.String?,
        @Parameter(description = "determines whether to include all app users as members (only admins of the app can do this)") @Valid @RequestParam(value = "includeAllAppUsersAsMembers", required = false) includeAllAppUsersAsMembers: kotlin.Boolean?,
        @Parameter(description = "determines whether to include all users of the audiences as members (only admins of the app can do this)") @Valid @RequestParam(value = "includeAudiencesAsMembers", required = false) includeAudiencesAsMembers: kotlin.Boolean?,
        @Parameter(description = "determines whether to use ands or ors when using the audience list to add users") @Valid @RequestParam(value = "audienceOperator", required = false) audienceOperator: kotlin.String?,
        @Parameter(description = "The approval status to set {PENDING, REJECTED, APPROVED, FEATURED}", schema = Schema(allowableValues = ["PENDING", "REJECTED", "APPROVED", "FEATURED"])) @Valid @RequestParam(value = "approvalStatus", required = false) approvalStatus: kotlin.String?,
        @Parameter(description = "sets a linked object so that it can be returned as part of the album response") @Valid @RequestParam(value = "linkedObjectType", required = false) linkedObjectType: kotlin.String?,
        @Parameter(description = "sets a linked object id so that it can be returned as part of the album response") @Valid @RequestParam(value = "linkedObjectId", required = false) linkedObjectId: kotlin.Long?
    ): ResponseEntity<SearchResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Add Album Users",
        operationId = "addAlbumUsers",
        description = """Add users to an album as participants.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/album/user/add"
        value = [PATH_ADD_ALBUM_USERS],
        produces = ["*/*"]
    )
    fun addAlbumUsers(
        @NotNull @Parameter(description = "the album ID", required = true) @Valid @RequestParam(value = "albumId", required = true) albumId: kotlin.Long,
        @NotNull @Parameter(description = "determines whether to include all friends as participants", required = true) @Valid @RequestParam(value = "includeFriendGroup", required = true) includeFriendGroup: kotlin.Boolean,
        @Parameter(description = "a unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "determines whether the users being added have read permissions") @Valid @RequestParam(value = "read", required = false) read: kotlin.Boolean?,
        @Parameter(description = "determines whether the users being added have write permissions") @Valid @RequestParam(value = "write", required = false) write: kotlin.Boolean?,
        @Parameter(description = "determines whether the users being added have delete permissions") @Valid @RequestParam(value = "delete", required = false) delete: kotlin.Boolean?,
        @Parameter(description = "determines whether the users being added have add permissions") @Valid @RequestParam(value = "add", required = false) add: kotlin.Boolean?,
        @Parameter(description = "comma separated list of connection IDs") @Valid @RequestParam(value = "connections", required = false) connections: kotlin.String?,
        @Parameter(description = "comma separated list of connection group IDs") @Valid @RequestParam(value = "connectionGroups", required = false) connectionGroups: kotlin.String?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Approve Album",
        operationId = "approveAlbum",
        description = """Sets the approval status of an Album.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/album/approve"
        value = [PATH_APPROVE_ALBUM],
        produces = ["*/*"]
    )
    fun approveAlbum(
        @NotNull @Parameter(description = "The ID of the album", required = true) @Valid @RequestParam(value = "albumId", required = true) albumId: kotlin.Long,
        @Parameter(description = "A unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The approval status to set {PENDING, REJECTED, APPROVED, FEATURED}", schema = Schema(allowableValues = ["PENDING", "REJECTED", "APPROVED", "FEATURED"])) @Valid @RequestParam(value = "approvalStatus", required = false) approvalStatus: kotlin.String?,
        @Parameter(description = "Sets whether the album should be marked as \"verified\"") @Valid @RequestParam(value = "verified", required = false) verified: kotlin.Boolean?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = " Get Album",
        operationId = "getAlbumCollection",
        description = """Get an Album.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AlbumFullResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/album/get"
        value = [PATH_GET_ALBUM_COLLECTION],
        produces = ["*/*"]
    )
    fun getAlbumCollection(
        @NotNull @Parameter(description = "This parameter is deprecated.", required = true) @Valid @RequestParam(value = "returnNulls", required = true) returnNulls: kotlin.Boolean,
        @NotNull @Parameter(description = "the album to look up", required = true) @Valid @RequestParam(value = "albumId", required = true) albumId: kotlin.Long,
        @Parameter(description = "a unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "returns the last X likes. To search on and paginate the remaining likes - please use the \"/like/search\"Â endpoint.") @Valid @RequestParam(value = "likePreviewSize", required = false) likePreviewSize: kotlin.Int?,
        @Parameter(description = "returns the first X assets. To search on and paginate the remaining assets - please use the \"/assets/search\"Â endpoint.") @Valid @RequestParam(value = "assetPreviewSize", required = false) assetPreviewSize: kotlin.Int?,
        @Parameter(description = "returns the last X notes. To search on and paginate the remaining notes - please use the \"/note/search\" endpoint.") @Valid @RequestParam(value = "notePreviewSize", required = false) notePreviewSize: kotlin.Int?,
        @Parameter(description = "returns the first X users/connections. To search on and paginate the remaining connections - please use the \"/permissions/search\" endpoint.") @Valid @RequestParam(value = "connectionPreviewSize", required = false) connectionPreviewSize: kotlin.Int?,
        @Parameter(description = "returns the first X audiences. To search on and paginate the remaining audiences - please use the \"/audience/search\" endpoint.") @Valid @RequestParam(value = "audiencePreviewSize", required = false) audiencePreviewSize: kotlin.Int?
    ): ResponseEntity<AlbumFullResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Leave Album",
        operationId = "leaveAlbum",
        description = """ Allows a user to leave an album (they are no longer considered a participant). The album creator cannot leave their own albums.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/album/user/leave"
        value = [PATH_LEAVE_ALBUM],
        produces = ["*/*"]
    )
    fun leaveAlbum(
        @NotNull @Parameter(description = "the album ID", required = true) @Valid @RequestParam(value = "albumId", required = true) albumId: kotlin.Long,
        @Parameter(description = "a unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Album",
        operationId = "removeAlbum",
        description = """Deletes an Album""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/album/delete"
        value = [PATH_REMOVE_ALBUM],
        produces = ["*/*"]
    )
    fun removeAlbum(
        @NotNull @Parameter(description = "the album ID to delete", required = true) @Valid @RequestParam(value = "albumId", required = true) albumId: kotlin.Long,
        @Parameter(description = "a unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Remove Album Users",
        operationId = "removeAlbumUsers",
        description = """Remove participants of an album.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/album/user/delete"
        value = [PATH_REMOVE_ALBUM_USERS],
        produces = ["*/*"]
    )
    fun removeAlbumUsers(
        @NotNull @Parameter(description = "the album ID", required = true) @Valid @RequestParam(value = "albumId", required = true) albumId: kotlin.Long,
        @NotNull @Parameter(description = "remove friend group", required = true) @Valid @RequestParam(value = "removeFriendGroup", required = true) removeFriendGroup: kotlin.Boolean,
        @Parameter(description = "a unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "comma separated list of connection IDs") @Valid @RequestParam(value = "connections", required = false) connections: kotlin.String?,
        @Parameter(description = "comma separated list of connection group IDs") @Valid @RequestParam(value = "connectionGroups", required = false) connectionGroups: kotlin.String?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Albums",
        operationId = "searchAlbums",
        description = """Searches on Albums.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = AlbumFullResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/album/search"
        value = [PATH_SEARCH_ALBUMS],
        produces = ["*/*"]
    )
    fun searchAlbums(
        @NotNull @Parameter(description = "a comma separated list of filters: * MINE - Return albums that the user has created. * SHARED - Return albums that have been shared to the user via addAlbumUsers, or addUsersToPermissionable . * FOLLOWER - Return albums that have been created by the user's followers (the content needs to have been APPROVED or FEATURED). * FOLLOWING - Return albums that have been created by people who the user is following (the content needs to have been APPROVED or FEATURED). * PUBLIC - Return all PUBLIC albums that have been APPROVED or FEATURED. * ALL_PUBLIC - Return all PUBLIC albums regardless of whether they are approved or not (ignores the approval status). * LIKED - Return all albums that the user has liked. * FEATURED - Return all albums that have been featured. * PENDING - Return all pending albums. ", required = true) @Valid @RequestParam(value = "filter", required = true) filter: kotlin.String,
        @NotNull @Parameter(description = "id of custom albumType", required = true) @Valid @RequestParam(value = "albumTypeId", required = true) albumTypeId: kotlin.Long,
        @NotNull @Parameter(description = "filter albums with this album sub type", required = true) @Valid @RequestParam(value = "subType", required = true) subType: kotlin.String,
        @NotNull @Parameter(description = "determines whether to return inactive albums", required = true) @Valid @RequestParam(value = "includeInactive", required = true) includeInactive: kotlin.Boolean,
        @NotNull @Parameter(description = "the field to sort by. See AlbumApiMap", required = true) @Valid @RequestParam(value = "sortField", required = true) sortField: kotlin.String,
        @NotNull @Parameter(description = "determines whether the sorted list is in descending or ascending order", required = true) @Valid @RequestParam(value = "descending", required = true) descending: kotlin.Boolean,
        @NotNull @Parameter(description = "the start index for pagination", required = true) @Valid @RequestParam(value = "start", required = true) start: kotlin.Int,
        @NotNull @Parameter(description = "the limit for pagination (There is a hard limit of 100)", required = true) @Valid @RequestParam(value = "limit", required = true) limit: kotlin.Int,
        @NotNull @Parameter(description = "the maximum range the album can be from the center (used when sortField=ALBUM_DISTANCE)", required = true) @Valid @RequestParam(value = "range", required = true) range: kotlin.Double,
        @NotNull @Parameter(description = "returns whether or not the current logged in user has liked the album", required = true) @Valid @RequestParam(value = "includeLiked", required = true) includeLiked: kotlin.Boolean,
        @NotNull @Parameter(description = "returns whether or not the current logged in user has favorited the album", required = true) @Valid @RequestParam(value = "includeFavorited", required = true) includeFavorited: kotlin.Boolean,
        @NotNull @Parameter(description = "returns permission details on whether they have read/write/delete permissions etc (client app probably doesn't need this)", required = true) @Valid @RequestParam(value = "includePermissions", required = true) includePermissions: kotlin.Boolean,
        @NotNull @Parameter(description = "returns the last X likes", required = true) @Valid @RequestParam(value = "likePreviewSize", required = true) likePreviewSize: kotlin.Int,
        @NotNull @Parameter(description = "returns the first X assets", required = true) @Valid @RequestParam(value = "assetPreviewSize", required = true) assetPreviewSize: kotlin.Int,
        @NotNull @Parameter(description = "returns the last X notes", required = true) @Valid @RequestParam(value = "notePreviewSize", required = true) notePreviewSize: kotlin.Int,
        @NotNull @Parameter(description = "returns the first X users/connections", required = true) @Valid @RequestParam(value = "connectionPreviewSize", required = true) connectionPreviewSize: kotlin.Int,
        @NotNull @Parameter(description = "returns the first X audiences. To search on and paginate the remaining audiences, please use the \"/audience/search\" endpoint.", required = true) @Valid @RequestParam(value = "audiencePreviewSize", required = true) audiencePreviewSize: kotlin.Int,
        @Parameter(description = "a unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the account ID of the user that the results will be based on. This is used to return albums that this account has liked/favorited.") @Valid @RequestParam(value = "connectionAccountId", required = false) connectionAccountId: kotlin.Long?,
        @Parameter(description = "search on albums that have been created by this account (that the user has permissions to)") @Valid @RequestParam(value = "ownerId", required = false) ownerId: kotlin.Long?,
        @Parameter(description = "search on album within a comma separated list of album IDs (this does not work with sortField=ALBUM_DISTANCE, or when stackSearch=true)") @Valid @RequestParam(value = "albumIds", required = false) albumIds: kotlin.String?,
        @Parameter(description = "Only for CLOUDINDEX mode, exclude albums with ids matching this list") @Valid @RequestParam(value = "excludeAlbumIds", required = false) excludeAlbumIds: kotlin.String?,
        @Parameter(description = "search on albums that are in a particular media offering") @Valid @RequestParam(value = "mediaId", required = false) mediaId: kotlin.Long?,
        @Parameter(description = "keyword search string") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "filter albums with this album type") @Valid @RequestParam(value = "albumType", required = false) albumType: kotlin.String?,
        @Parameter(description = "When using multiple album types this sets a per-album-type limit (used with cloud index mode)") @Valid @RequestParam(value = "limitPerAlbumType", required = false) limitPerAlbumType: kotlin.Int?,
        @Parameter(description = "return items that have been created before this date (time-stamp in milliseconds)") @Valid @RequestParam(value = "dateCreated", required = false) dateCreated: kotlin.Long?,
        @Parameter(description = "return items that have been updated since this date (time-stamp in milliseconds)") @Valid @RequestParam(value = "updatedSince", required = false) updatedSince: kotlin.Long?,
        @Parameter(description = "return items that have been updated before this date (time-stamp in milliseconds)") @Valid @RequestParam(value = "updatedBefore", required = false) updatedBefore: kotlin.Long?,
        @Parameter(description = "return items that have been created since this date (time-stamp in milliseconds)") @Valid @RequestParam(value = "createdSince", required = false) createdSince: kotlin.Long?,
        @Parameter(description = "return items that have been created before this date (time-stamp in milliseconds)") @Valid @RequestParam(value = "createdBefore", required = false) createdBefore: kotlin.Long?,
        @Parameter(description = "return items that have been started since this date (time-stamp in milliseconds)") @Valid @RequestParam(value = "startedSince", required = false) startedSince: kotlin.Long?,
        @Parameter(description = "return items that have been started before this date (time-stamp in milliseconds)") @Valid @RequestParam(value = "startedBefore", required = false) startedBefore: kotlin.Long?,
        @Parameter(description = "return items that have been ended since this date (time-stamp in milliseconds)") @Valid @RequestParam(value = "endedSince", required = false) endedSince: kotlin.Long?,
        @Parameter(description = "return items that have been ended before this date (time-stamp in milliseconds)") @Valid @RequestParam(value = "endedBefore", required = false) endedBefore: kotlin.Long?,
        @Parameter(description = "the latitude of where the search is centered on (used when sortField=ALBUM_DISTANCE)") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the longitude of where the search is centered on (used when sortField=ALBUM_DISTANCE)") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "the application key to filter results by application. This is required for consumer searches. Leaving this empty will return albums for the applications that the logged in user owns or has access to.") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "return results with categories matching this list") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "return results with filters matching this list") @Valid @RequestParam(value = "categoryFilterIds", required = false) categoryFilterIds: kotlin.String?,
        @Parameter(description = "return results with audiences matching this list") @Valid @RequestParam(value = "audienceIds", required = false) audienceIds: kotlin.String?,
        @Parameter(description = "exclude audiences with ids matching this list") @Valid @RequestParam(value = "excludeAudienceIds", required = false) excludeAudienceIds: kotlin.String?,
        @Parameter(description = "returns the user's completable object for the album if it exists") @Valid @RequestParam(value = "includeCompletable", required = false) includeCompletable: kotlin.Boolean?,
        @Parameter(description = "returns the user's rating for the album if it exists") @Valid @RequestParam(value = "includeRating", required = false) includeRating: kotlin.Boolean?,
        @Parameter(description = "The search index mode to use (RDS, LUCENE, or CLOUDINDEX). If not provided will use server default.") @Valid @RequestParam(value = "searchMode", required = false) searchMode: kotlin.String?,
        @Parameter(description = "groups similar albums together that have the same albumTypeId, within a time window defined in stackWindowSize") @Valid @RequestParam(value = "stackSearch", required = false) stackSearch: kotlin.Boolean?,
        @Parameter(description = "size of each window for each stack") @Valid @RequestParam(value = "stackWindowSize", required = false) stackWindowSize: kotlin.Int?,
        @Parameter(description = "The minimum number of stacks returned in a response. For example,  first call, minStackPerPage = 20, the API will return at least 20 results") @Valid @RequestParam(value = "minStackPerPage", required = false) minStackPerPage: kotlin.Int?,
        @Parameter(description = "this is used to tell the system where it left off on the previous previous page, since we can't use start/limit for stackSearch") @Valid @RequestParam(value = "stackPaginationIdentifier", required = false) stackPaginationIdentifier: kotlin.String?,
        @Parameter(description = "set this to true when making the call to view the albums in the stack") @Valid @RequestParam(value = "stackDetails", required = false) stackDetails: kotlin.Boolean?,
        @Parameter(description = "Return any results that have a minimum of the specified flag count (even ones that have met the flag threshold)") @Valid @RequestParam(value = "flagCountMinimum", required = false) flagCountMinimum: kotlin.Long?,
        @Parameter(description = "return items that have flagCount >= flagThreshold (controls removal of flagged content)", schema = Schema(defaultValue = "true")) @Valid @RequestParam(value = "removeFlaggedContent", required = false, defaultValue = "true") removeFlaggedContent: kotlin.Boolean,
        @Parameter(description = "setting to true will return only verified albums only, setting to false will return non-verified albums only (leave empty to return both)") @Valid @RequestParam(value = "verifiedFilter", required = false) verifiedFilter: kotlin.Boolean?,
        @Parameter(description = "filter results by the linkedObjectType") @Valid @RequestParam(value = "linkedObjectType", required = false) linkedObjectType: kotlin.String?,
        @Parameter(description = "filter results by the linkedObjectId") @Valid @RequestParam(value = "linkedObjectId", required = false) linkedObjectId: kotlin.Long?,
        @Parameter(description = "determines whether to use the order assigned via the /album/order/_* api (which is tied to an audience)") @Valid @RequestParam(value = "orderAudienceId", required = false) orderAudienceId: kotlin.Long?,
        @Parameter(description = "if true, ignore the application's default app filter when searching") @Valid @RequestParam(value = "ignoreDefaultAppFilter", required = false) ignoreDefaultAppFilter: kotlin.Boolean?,
        @Parameter(description = "Advanced search expression to be used by the server") @Valid @RequestParam(value = "searchExpression", required = false) searchExpression: kotlin.String?,
        @Parameter(description = "If true and results are empty, attempt to generate albums via templates") @Valid @RequestParam(value = "generateAlbums", required = false) generateAlbums: kotlin.Boolean?
    ): ResponseEntity<List<AlbumFullResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Album",
        operationId = "updateAlbumCollection",
        description = """Update an Album.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AlbumResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/album/update"
        value = [PATH_UPDATE_ALBUM_COLLECTION],
        produces = ["*/*"]
    )
    fun updateAlbumCollection(
        @NotNull @Parameter(description = "the ID of the album to update", required = true) @Valid @RequestParam(value = "albumId", required = true) albumId: kotlin.Long,
        @Parameter(description = "a unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "Comma separated list of asset IDs to add to the album's asset list (use \"assetId\" for setting the cover of the album)") @Valid @RequestParam(value = "assetsToAdd", required = false) assetsToAdd: kotlin.String?,
        @Parameter(description = "Comma separated list of asset IDs to remove from the album's asset list") @Valid @RequestParam(value = "assetsToRemove", required = false) assetsToRemove: kotlin.String?,
        @Parameter(description = "the cover asset ID") @Valid @RequestParam(value = "assetId", required = false) assetId: kotlin.Long?,
        @Parameter(description = "a MultipartFile containing the cover image of the album (this will only be used if \"assetId\" is empty)") @Valid @RequestParam(value = "media", required = false) media: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "this can be used if the \"media\" is a link (this will only be used if \"assetId\" and media are empty)") @Valid @RequestParam(value = "mediaURL", required = false) mediaURL: kotlin.String?,
        @Parameter(description = "determines whether the album is active or inactive") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "the title of the album") @Valid @RequestParam(value = "title", required = false) title: kotlin.String?,
        @Parameter(description = "the start date") @Valid @RequestParam(value = "startDate", required = false) startDate: kotlin.Long?,
        @Parameter(description = "the end date") @Valid @RequestParam(value = "endDate", required = false) endDate: kotlin.Long?,
        @Parameter(description = "the tags") @Valid @RequestParam(value = "tags", required = false) tags: kotlin.String?,
        @Parameter(description = "the description of the album") @Valid @RequestParam(value = "description", required = false) description: kotlin.String?,
        @Parameter(description = "a custom field used for aggregation and searching") @Valid @RequestParam(value = "albumType", required = false) albumType: kotlin.String?,
        @Parameter(description = "a custom indexed number used for aggregation and searching") @Valid @RequestParam(value = "albumTypeId", required = false) albumTypeId: kotlin.Long?,
        @Parameter(description = "a custom string field used for aggregation and searching") @Valid @RequestParam(value = "subType", required = false) subType: kotlin.String?,
        @Parameter(description = "determines whether the album's participants have read permissions") @Valid @RequestParam(value = "publicRead", required = false) publicRead: kotlin.Boolean?,
        @Parameter(description = "determines whether the album's participants have write permissions") @Valid @RequestParam(value = "publicWrite", required = false) publicWrite: kotlin.Boolean?,
        @Parameter(description = "determines whether the album's participants have delete permissions") @Valid @RequestParam(value = "publicDelete", required = false) publicDelete: kotlin.Boolean?,
        @Parameter(description = "determines whether the album's participants have add permissions") @Valid @RequestParam(value = "publicAdd", required = false) publicAdd: kotlin.Boolean?,
        @Parameter(description = "latitude used to update the album's location") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "longitude used to update the album's location") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "the location description") @Valid @RequestParam(value = "locationDescription", required = false) locationDescription: kotlin.String?,
        @Parameter(description = "the determines the album's participants (PUBLIC - includes everyone in the system as a potential participant, PRIVATE - only considers people who have been invited as participants)", schema = Schema(allowableValues = ["PUBLIC", "PRIVATE", "FRIENDS"])) @Valid @RequestParam(value = "visibility", required = false) visibility: kotlin.String?,
        @Parameter(description = "the cell phone number") @Valid @RequestParam(value = "cellPhone", required = false) cellPhone: kotlin.String?,
        @Parameter(description = "The street address of the location") @Valid @RequestParam(value = "streetAddress", required = false) streetAddress: kotlin.String?,
        @Parameter(description = "Additional address information (such as a suite number, floor number, building name, or PO Box)") @Valid @RequestParam(value = "streetAddress2", required = false) streetAddress2: kotlin.String?,
        @Parameter(description = "The city of the location") @Valid @RequestParam(value = "city", required = false) city: kotlin.String?,
        @Parameter(description = "The state of of the location") @Valid @RequestParam(value = "state", required = false) state: kotlin.String?,
        @Parameter(description = "The postal code of the location") @Valid @RequestParam(value = "postalCode", required = false) postalCode: kotlin.String?,
        @Parameter(description = "The full address of the location which should include the street address, city, state, and postal code") @Valid @RequestParam(value = "fullAddress", required = false) fullAddress: kotlin.String?,
        @Parameter(description = "determines whether the album is posted anonymously") @Valid @RequestParam(value = "anonymous", required = false) anonymous: kotlin.Boolean?,
        @Parameter(description = "External custom client defined data") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?,
        @Parameter(description = "comma separated category ids string associated with the Album") @Valid @RequestParam(value = "categoryIds", required = false) categoryIds: kotlin.String?,
        @Parameter(description = "comma separated filter ids string associated with the Album") @Valid @RequestParam(value = "categoryFilterIds", required = false) categoryFilterIds: kotlin.String?,
        @Parameter(description = "comma separated audience ids string associated with the album") @Valid @RequestParam(value = "audienceIds", required = false) audienceIds: kotlin.String?,
        @Parameter(description = "comma separated audience ids to add to the album") @Valid @RequestParam(value = "audienceIdsToAdd", required = false) audienceIdsToAdd: kotlin.String?,
        @Parameter(description = "comma separated audience ids to remove from the album (overrides audienceIds and audienceIdsToAdd)") @Valid @RequestParam(value = "audienceIdsToRemove", required = false) audienceIdsToRemove: kotlin.String?,
        @Parameter(description = "determines whether to include all app users as members (only admins of the app can do this)") @Valid @RequestParam(value = "includeAllAppUsersAsMembers", required = false) includeAllAppUsersAsMembers: kotlin.Boolean?,
        @Parameter(description = "determines whether to include all users of the audiences as members (only admins of the app can do this)") @Valid @RequestParam(value = "includeAudiencesAsMembers", required = false) includeAudiencesAsMembers: kotlin.Boolean?,
        @Parameter(description = "determines whether to use ands or ors when using the audience list to add users") @Valid @RequestParam(value = "audienceOperator", required = false) audienceOperator: kotlin.String?,
        @Parameter(description = "sets a linked object so that it can be returned as part of the album response") @Valid @RequestParam(value = "linkedObjectType", required = false) linkedObjectType: kotlin.String?,
        @Parameter(description = "sets a linked object id so that it can be returned as part of the album response") @Valid @RequestParam(value = "linkedObjectId", required = false) linkedObjectId: kotlin.Long?,
        @Parameter(description = "determines whether the album should be indexed immediately") @Valid @RequestParam(value = "indexNow", required = false) indexNow: kotlin.Boolean?
    ): ResponseEntity<AlbumResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_ADD_ALBUM_COLLECTION: String = "/album/create"
        const val PATH_ADD_ALBUM_USERS: String = "/album/user/add"
        const val PATH_APPROVE_ALBUM: String = "/album/approve"
        const val PATH_GET_ALBUM_COLLECTION: String = "/album/get"
        const val PATH_LEAVE_ALBUM: String = "/album/user/leave"
        const val PATH_REMOVE_ALBUM: String = "/album/delete"
        const val PATH_REMOVE_ALBUM_USERS: String = "/album/user/delete"
        const val PATH_SEARCH_ALBUMS: String = "/album/search"
        const val PATH_UPDATE_ALBUM_COLLECTION: String = "/album/update"
    }
}
