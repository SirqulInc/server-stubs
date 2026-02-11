package org.openapitools.api

import org.openapitools.model.NoteResponse
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
class NoteApiController() {

    @Operation(
        summary = "Batch Note Operation",
        operationId = "batchOperation",
        description = """Perform a batch operation on notes for a notable object (for example: DELETE_ALL_NOTES_IN_NOTABLE).
""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/note/batch"
        value = [PATH_BATCH_OPERATION],
        produces = ["*/*"]
    )
    fun batchOperation(
        @NotNull @Parameter(description = "The id of the notable object the batch operation will affect", required = true) @Valid @RequestParam(value = "notableId", required = true) notableId: kotlin.Long,
        @NotNull @Parameter(description = "The notable object type (for example ALBUM, ASSET, OFFER, etc.)", required = true) @Valid @RequestParam(value = "notableType", required = true) notableType: kotlin.String,
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The batch operation to perform (e.g., DELETE_ALL_NOTES_IN_NOTABLE). Optional.") @Valid @RequestParam(value = "batchOperation", required = false) batchOperation: kotlin.String?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Note",
        operationId = "createNote",
        description = """This is used to leave a comment (note) on a notable object (i.e. albums, album contests, assets, game levels, offers, offer locations, retailers, retailer locations, and theme descriptors). Leaving a comment on a notable object will be visiable to everyone who has access to view the object.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = NoteResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/note/create"
        value = [PATH_CREATE_NOTE],
        produces = ["*/*"]
    )
    fun createNote(
        @NotNull @Parameter(description = "The message the user wishes to leave a comment on", required = true) @Valid @RequestParam(value = "comment", required = true) comment: kotlin.String,
        @Parameter(description = "The unique device identifier that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The unique accountId that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The notable object type {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, OFFER, OFFER_LOCATION, RETAILER, RETAILER_LOCATION, THEME_DESCRIPTOR}") @Valid @RequestParam(value = "notableType", required = false) notableType: kotlin.String?,
        @Parameter(description = "The id of the notable object") @Valid @RequestParam(value = "notableId", required = false) notableId: kotlin.Long?,
        @Parameter(description = "The custom string defined by the client (used for differentiating various note types)") @Valid @RequestParam(value = "noteType", required = false) noteType: kotlin.String?,
        @Parameter(description = "A comma separated list of asset IDs to add with the note") @Valid @RequestParam(value = "assetIds", required = false) assetIds: kotlin.String?,
        @Parameter(description = "search tags") @Valid @RequestParam(value = "tags", required = false) tags: kotlin.String?,
        @Parameter(description = "This is used for sending out group notifications. For example, when someone adds a note to an asset which is also a part of an album, everyone in the album will receive a notification. This is achieved by passing in the permissionable type (in this case \"album\"), and the permissionable id (the album id). Possible types: {ALBUM, ALBUM_CONTEST, GAME_LEVEL, THEME_DESCRIPTOR}") @Valid @RequestParam(value = "permissionableType", required = false) permissionableType: kotlin.String?,
        @Parameter(description = "The id of the permissionable object (for sending group notifications)") @Valid @RequestParam(value = "permissionableId", required = false) permissionableId: kotlin.Long?,
        @Parameter(description = "The application key used to identify the application") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "The description of the location") @Valid @RequestParam(value = "locationDescription", required = false) locationDescription: kotlin.String?,
        @Parameter(description = "The current location of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The current location of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "External custom client defined data") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?,
        @Parameter(description = "Comma separated list of additional account IDs that will receive the note notifications") @Valid @RequestParam(value = "receiverAccountIds", required = false) receiverAccountIds: kotlin.String?,
        @Parameter(description = "whether to return the full response or not") @Valid @RequestParam(value = "returnFullResponse", required = false) returnFullResponse: kotlin.Boolean?,
        @Parameter(description = "Check true if need to initialize an asset and assign to current note") @Valid @RequestParam(value = "initializeAsset", required = false) initializeAsset: kotlin.Boolean?,
        @Parameter(description = "Return null fields for asset response when creating an asset") @Valid @RequestParam(value = "assetReturnNulls", required = false) assetReturnNulls: kotlin.Boolean?,
        @Parameter(description = "the album the asset will be added to (optional)") @Valid @RequestParam(value = "assetAlbumId", required = false) assetAlbumId: kotlin.Long?,
        @Parameter(description = "the collection ID that the asset is associated with") @Valid @RequestParam(value = "assetCollectionId", required = false) assetCollectionId: kotlin.Long?,
        @Parameter(description = "the default album to add the asset to") @Valid @RequestParam(value = "assetAddToDefaultAlbum", required = false) assetAddToDefaultAlbum: kotlin.String?,
        @Parameter(description = "the media library to add the asset to") @Valid @RequestParam(value = "assetAddToMediaLibrary", required = false) assetAddToMediaLibrary: kotlin.Boolean?,
        @Parameter(description = "the version code of the asset") @Valid @RequestParam(value = "assetVersionCode", required = false) assetVersionCode: kotlin.Int?,
        @Parameter(description = "the version name of the asset") @Valid @RequestParam(value = "assetVersionName", required = false) assetVersionName: kotlin.String?,
        @Parameter(description = "the meta data of the asset") @Valid @RequestParam(value = "assetMetaData", required = false) assetMetaData: kotlin.String?,
        @Parameter(description = "the caption of the asset") @Valid @RequestParam(value = "assetCaption", required = false) assetCaption: kotlin.String?,
        @Parameter(description = "the media of the asset") @Valid @RequestParam(value = "assetMedia", required = false) assetMedia: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "the media URL of the asset") @Valid @RequestParam(value = "assetMediaUrl", required = false) assetMediaUrl: kotlin.String?,
        @Parameter(description = "the media string of the asset") @Valid @RequestParam(value = "assetMediaString", required = false) assetMediaString: kotlin.String?,
        @Parameter(description = "the media string file name of the asset") @Valid @RequestParam(value = "assetMediaStringFileName", required = false) assetMediaStringFileName: kotlin.String?,
        @Parameter(description = "the media string content type of the asset") @Valid @RequestParam(value = "assetMediaStringContentType", required = false) assetMediaStringContentType: kotlin.String?,
        @Parameter(description = "the attached media of the asset") @Valid @RequestParam(value = "assetAttachedMedia", required = false) assetAttachedMedia: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "the attached media URL of the asset") @Valid @RequestParam(value = "assetAttachedMediaUrl", required = false) assetAttachedMediaUrl: kotlin.String?,
        @Parameter(description = "the attached media string of the asset") @Valid @RequestParam(value = "assetAttachedMediaString", required = false) assetAttachedMediaString: kotlin.String?,
        @Parameter(description = "the attached media string file name of the asset") @Valid @RequestParam(value = "assetAttachedMediaStringFileName", required = false) assetAttachedMediaStringFileName: kotlin.String?,
        @Parameter(description = "the attached media string content type of the asset") @Valid @RequestParam(value = "assetAttachedMediaStringContentType", required = false) assetAttachedMediaStringContentType: kotlin.String?,
        @Parameter(description = "the location description for the asset") @Valid @RequestParam(value = "assetLocationDescription", required = false) assetLocationDescription: kotlin.String?,
        @Parameter(description = "the application for the asset") @Valid @RequestParam(value = "assetApp", required = false) assetApp: kotlin.String?,
        @Parameter(description = "the search tags used for the asset") @Valid @RequestParam(value = "assetSearchTags", required = false) assetSearchTags: kotlin.String?,
        @Parameter(description = "the latitude of the asset") @Valid @RequestParam(value = "assetLatitude", required = false) assetLatitude: kotlin.Double?,
        @Parameter(description = "the longitude of the asset") @Valid @RequestParam(value = "assetLongitude", required = false) assetLongitude: java.math.BigDecimal?
    ): ResponseEntity<NoteResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Note",
        operationId = "deleteNote",
        description = """Sets a comment (note) as deleted.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/note/delete"
        value = [PATH_DELETE_NOTE],
        produces = ["*/*"]
    )
    fun deleteNote(
        @NotNull @Parameter(description = "The ID of the note to delete", required = true) @Valid @RequestParam(value = "noteId", required = true) noteId: kotlin.Long,
        @Parameter(description = "The unique device identifier that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The unique accountId that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The current location of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The current location of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "The application key used to identify the application") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Note",
        operationId = "getNote",
        description = """Get for a note based on its Id.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/note/get"
        value = [PATH_GET_NOTE],
        produces = ["*/*"]
    )
    fun getNote(
        @NotNull @Parameter(description = "the id of the note to get", required = true) @Valid @RequestParam(value = "noteId", required = true) noteId: kotlin.Long,
        @Parameter(description = "The unique device identifier that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The unique accountId that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "Determines whether to return the NoteFullResponse for the item") @Valid @RequestParam(value = "returnFullResponse", required = false) returnFullResponse: kotlin.Boolean?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Notes",
        operationId = "searchNotes",
        description = """Search for notes on a notable object.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = NoteResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/note/search"
        value = [PATH_SEARCH_NOTES],
        produces = ["*/*"]
    )
    fun searchNotes(
        @Parameter(description = "The device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The notable object type {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, OFFER, OFFER_LOCATION, RETAILER, RETAILER_LOCATION, THEME_DESCRIPTOR}") @Valid @RequestParam(value = "notableType", required = false) notableType: kotlin.String?,
        @Parameter(description = "The id of the notable object") @Valid @RequestParam(value = "notableId", required = false) notableId: kotlin.Long?,
        @Parameter(description = "Comma separated list of noteType strings to filter results with") @Valid @RequestParam(value = "noteTypes", required = false) noteTypes: kotlin.String?,
        @Parameter(description = "The application key used to identify the application") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "The keyword used to search") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "return items that has flagCount >= flagCountMinimum if this is set, return all items, even ones with flagCount >= flagThreshold") @Valid @RequestParam(value = "flagCountMinimum", required = false) flagCountMinimum: kotlin.Long?,
        @Parameter(description = "return items that has flagCount >= flagThreshold, which are hidden by default") @Valid @RequestParam(value = "flagsExceedThreshold", required = false) flagsExceedThreshold: kotlin.Boolean?,
        @Parameter(description = "include inactive in the result") @Valid @RequestParam(value = "includeInactive", required = false) includeInactive: kotlin.Boolean?,
        @Parameter(description = "The column to sort the search on", schema = Schema(allowableValues = ["ID", "CREATED", "UPDATED", "DELETED", "SEARCH_TAGS", "ACTIVE", "OWNER_DISPLAY", "NOTABLE_TYPE", "NOTE_TAG", "NOTE_COUNT", "LIKES", "DISLIKES"])) @Valid @RequestParam(value = "sortField", required = false) sortField: kotlin.String?,
        @Parameter(description = "The order to return the search results") @Valid @RequestParam(value = "descending", required = false) descending: kotlin.Boolean?,
        @Parameter(description = "Determines whether to return the NoteFullResponse for each search item") @Valid @RequestParam(value = "returnFullResponse", required = false) returnFullResponse: kotlin.Boolean?,
        @Parameter(description = "return items that have been updated since this date (time-stamp in milliseconds)") @Valid @RequestParam(value = "updatedSince", required = false) updatedSince: kotlin.Long?,
        @Parameter(description = "return items that have been updated before this date (time-stamp in milliseconds)") @Valid @RequestParam(value = "updatedBefore", required = false) updatedBefore: kotlin.Long?,
        @Parameter(description = "The record to begin the return set on") @Valid @RequestParam(value = "start", required = false) start: kotlin.Int?,
        @Parameter(description = "The number of records to return") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?
    ): ResponseEntity<List<NoteResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Note",
        operationId = "updateNote",
        description = """Update an existing comment (note). Only the creator of the note have permission to update.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = NoteResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/note/update"
        value = [PATH_UPDATE_NOTE],
        produces = ["*/*"]
    )
    fun updateNote(
        @NotNull @Parameter(description = "The id of the note, used when editing a comment", required = true) @Valid @RequestParam(value = "noteId", required = true) noteId: kotlin.Long,
        @Parameter(description = "The unique device identifier that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "The unique accountId that made the request (either deviceId or accountId must be used)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "The message the user wishes to leave a comment on") @Valid @RequestParam(value = "comment", required = false) comment: kotlin.String?,
        @Parameter(description = "The custom string defined by the client (used for differentiating on various note types)") @Valid @RequestParam(value = "noteType", required = false) noteType: kotlin.String?,
        @Parameter(description = "A comma separated list of asset IDs to add with the note") @Valid @RequestParam(value = "assetIds", required = false) assetIds: kotlin.String?,
        @Parameter(description = "search tags") @Valid @RequestParam(value = "tags", required = false) tags: kotlin.String?,
        @Parameter(description = "This is used for sending out group notifications. For example, when someone adds a note to an asset which is also a part of an album, everyone in the album will receive a notification. This is achieved by passing in the permissionable type (in this case \"album\"), and the permissionable id (the album id). Possible types: {ALBUM, ALBUM_CONTEST, GAME_LEVEL, THEME_DESCRIPTOR}") @Valid @RequestParam(value = "permissionableType", required = false) permissionableType: kotlin.String?,
        @Parameter(description = "The id of the permissionable object (for sending group notifications)") @Valid @RequestParam(value = "permissionableId", required = false) permissionableId: kotlin.Long?,
        @Parameter(description = "The application key used to identify the application") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "The description of the location") @Valid @RequestParam(value = "locationDescription", required = false) locationDescription: kotlin.String?,
        @Parameter(description = "The current location of the user") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "The current location of the user") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?,
        @Parameter(description = "meta data to update with the note") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?,
        @Parameter(description = "whether to return the full response or not") @Valid @RequestParam(value = "returnFullResponse", required = false) returnFullResponse: kotlin.Boolean?,
        @Parameter(description = "Sets the active flag for the note") @Valid @RequestParam(value = "active", required = false) active: kotlin.Boolean?,
        @Parameter(description = "main flag for updating asset in note, must set to true if you want to update the note's asset") @Valid @RequestParam(value = "updateAsset", required = false) updateAsset: kotlin.Boolean?,
        @Parameter(description = "Return null fields for asset response when updating an asset") @Valid @RequestParam(value = "assetReturnNulls", required = false) assetReturnNulls: kotlin.Boolean?,
        @Parameter(description = "the album the asset will be added to (optional)") @Valid @RequestParam(value = "assetAlbumId", required = false) assetAlbumId: kotlin.Long?,
        @Parameter(description = "the collection ID that the asset is associated with") @Valid @RequestParam(value = "assetCollectionId", required = false) assetCollectionId: kotlin.Long?,
        @Parameter(description = "the default album to add the asset to") @Valid @RequestParam(value = "assetAddToDefaultAlbum", required = false) assetAddToDefaultAlbum: kotlin.String?,
        @Parameter(description = "the media library to add the asset to") @Valid @RequestParam(value = "assetAddToMediaLibrary", required = false) assetAddToMediaLibrary: kotlin.Boolean?,
        @Parameter(description = "the version code of the asset") @Valid @RequestParam(value = "assetVersionCode", required = false) assetVersionCode: kotlin.Int?,
        @Parameter(description = "the version name of the asset") @Valid @RequestParam(value = "assetVersionName", required = false) assetVersionName: kotlin.String?,
        @Parameter(description = "the meta data of the asset") @Valid @RequestParam(value = "assetMetaData", required = false) assetMetaData: kotlin.String?,
        @Parameter(description = "the caption of the asset") @Valid @RequestParam(value = "assetCaption", required = false) assetCaption: kotlin.String?,
        @Parameter(description = "the media of the asset") @Valid @RequestParam(value = "assetMedia", required = false) assetMedia: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "the media URL of the asset") @Valid @RequestParam(value = "assetMediaUrl", required = false) assetMediaUrl: kotlin.String?,
        @Parameter(description = "the media string of the asset") @Valid @RequestParam(value = "assetMediaString", required = false) assetMediaString: kotlin.String?,
        @Parameter(description = "the media string file name of the asset") @Valid @RequestParam(value = "assetMediaStringFileName", required = false) assetMediaStringFileName: kotlin.String?,
        @Parameter(description = "the media string content type of the asset") @Valid @RequestParam(value = "assetMediaStringContentType", required = false) assetMediaStringContentType: kotlin.String?,
        @Parameter(description = "the attached media of the asset") @Valid @RequestParam(value = "assetAttachedMedia", required = false) assetAttachedMedia: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "the attached media URL of the asset") @Valid @RequestParam(value = "assetAttachedMediaUrl", required = false) assetAttachedMediaUrl: kotlin.String?,
        @Parameter(description = "the attached media string of the asset") @Valid @RequestParam(value = "assetAttachedMediaString", required = false) assetAttachedMediaString: kotlin.String?,
        @Parameter(description = "the attached media string file name of the asset") @Valid @RequestParam(value = "assetAttachedMediaStringFileName", required = false) assetAttachedMediaStringFileName: kotlin.String?,
        @Parameter(description = "the attached media string content type of the asset") @Valid @RequestParam(value = "assetAttachedMediaStringContentType", required = false) assetAttachedMediaStringContentType: kotlin.String?,
        @Parameter(description = "the location description for the asset") @Valid @RequestParam(value = "assetLocationDescription", required = false) assetLocationDescription: kotlin.String?,
        @Parameter(description = "the application for the asset") @Valid @RequestParam(value = "assetApp", required = false) assetApp: kotlin.String?,
        @Parameter(description = "the search tags used for the asset") @Valid @RequestParam(value = "assetSearchTags", required = false) assetSearchTags: kotlin.String?,
        @Parameter(description = "the latitude of the asset") @Valid @RequestParam(value = "assetLatitude", required = false) assetLatitude: kotlin.Double?,
        @Parameter(description = "the longitude of the asset") @Valid @RequestParam(value = "assetLongitude", required = false) assetLongitude: kotlin.Double?
    ): ResponseEntity<NoteResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_BATCH_OPERATION: String = "/note/batch"
        const val PATH_CREATE_NOTE: String = "/note/create"
        const val PATH_DELETE_NOTE: String = "/note/delete"
        const val PATH_GET_NOTE: String = "/note/get"
        const val PATH_SEARCH_NOTES: String = "/note/search"
        const val PATH_UPDATE_NOTE: String = "/note/update"
    }
}
