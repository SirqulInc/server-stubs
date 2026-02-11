package org.openapitools.api

import org.openapitools.model.AssetFullResponse
import org.openapitools.model.AssetResponse
import org.openapitools.model.AssetShortResponse
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
class AssetApiController() {

    @Operation(
        summary = "Download Asset",
        operationId = "assetDownload",
        description = """Downloads an asset from the server for assets that have been uploaded to the server.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/asset/download/{filename}"
        value = [PATH_ASSET_DOWNLOAD],
        produces = ["*/*"]
    )
    fun assetDownload(
        @Pattern(regexp=".+") @Parameter(description = "the filename in the following formats: {assetId}-{suffix}.{extension} | {assetId}.{extension} | {assetId}", required = true) @PathVariable("filename") filename: kotlin.String
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Convert Offer to Creative",
        operationId = "assetMorph",
        description = """Converts an offer image + text into a creative image.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AssetShortResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/asset/morph"
        value = [PATH_ASSET_MORPH],
        produces = ["*/*"]
    )
    fun assetMorph(
        @NotNull @Parameter(description = "offer id used for inserting offer text/flavor", required = true) @Valid @RequestParam(value = "offerId", required = true) offerId: kotlin.Long,
        @NotNull @Parameter(description = "the ad size used for selecting a format for the creative image", required = true, schema = Schema(allowableValues = ["CONFIG", "BANNER", "LEADERBOARD", "SKYSCRAPER", "VIDEO", "ZIP", "INTERSTITIAL", "CUSTOM1", "CUSTOM2", "CUSTOM3", "CUSTOM4", "CUSTOM5", "CUSTOM6", "CUSTOM7", "CUSTOM8", "CUSTOM9", "CUSTOM10"])) @Valid @RequestParam(value = "adSize", required = true) adSize: kotlin.String,
        @Parameter(description = "used for inserting the newly created image into") @Valid @RequestParam(value = "creativeId", required = false) creativeId: kotlin.Long?,
        @Parameter(description = "total width of the creative image") @Valid @RequestParam(value = "width", required = false) width: kotlin.Int?,
        @Parameter(description = "total height of the creative image") @Valid @RequestParam(value = "height", required = false) height: kotlin.Int?,
        @Parameter(description = "the size of the background") @Valid @RequestParam(value = "backgroundSize", required = false) backgroundSize: kotlin.String?,
        @Parameter(description = "the template to use") @Valid @RequestParam(value = "template", required = false) template: kotlin.String?
    ): ResponseEntity<AssetShortResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Create Asset",
        operationId = "createAsset",
        description = """Uploads an asset to server and returns an asset id which can be used to assign to various objects.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AssetResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/asset/create"
        value = [PATH_CREATE_ASSET],
        produces = ["*/*"]
    )
    fun createAsset(
        @Parameter(description = "to return nulls") @Valid @RequestParam(value = "returnNulls", required = false) returnNulls: kotlin.Boolean?,
        @Parameter(description = "a unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the album the asset will be added to (optional)") @Valid @RequestParam(value = "albumId", required = false) albumId: kotlin.Long?,
        @Parameter(description = "Deprecated: use collections via the collection endpoints.") @Valid @RequestParam(value = "collectionId", required = false) collectionId: kotlin.Long?,
        @Parameter(description = "Whether to add to a default album") @Valid @RequestParam(value = "addToDefaultAlbum", required = false) addToDefaultAlbum: kotlin.String?,
        @Parameter(description = "Whether to add to the media library") @Valid @RequestParam(value = "addToMediaLibrary", required = false) addToMediaLibrary: kotlin.Boolean?,
        @Parameter(description = "the version code") @Valid @RequestParam(value = "versionCode", required = false) versionCode: kotlin.Int?,
        @Parameter(description = "the version name") @Valid @RequestParam(value = "versionName", required = false) versionName: kotlin.String?,
        @Parameter(description = "External custom client defined data") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?,
        @Parameter(description = "the caption (optional)") @Valid @RequestParam(value = "caption", required = false) caption: kotlin.String?,
        @Parameter(description = "the asset type") @Valid @RequestParam(value = "assetType", required = false) assetType: kotlin.String?,
        @Parameter(description = "approval status for the asset") @Valid @RequestParam(value = "approvalStatus", required = false) approvalStatus: kotlin.String?,
        @Parameter(description = "account id assigned to the asset") @Valid @RequestParam(value = "assignedAccountId", required = false) assignedAccountId: kotlin.Long?,
        @Parameter(description = "a MultipartFile containing the mimetype, etc") @Valid @RequestParam(value = "media", required = false) media: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "this can be used if the \"media\" is a link (optional)") @Valid @RequestParam(value = "mediaUrl", required = false) mediaUrl: kotlin.String?,
        @Parameter(description = "the media content as a string (optional)") @Valid @RequestParam(value = "mediaString", required = false) mediaString: kotlin.String?,
        @Parameter(description = "file name for mediaString (optional)") @Valid @RequestParam(value = "mediaStringFileName", required = false) mediaStringFileName: kotlin.String?,
        @Parameter(description = "content type for mediaString (optional)") @Valid @RequestParam(value = "mediaStringContentType", required = false) mediaStringContentType: kotlin.String?,
        @Parameter(description = "the media height (optional)") @Valid @RequestParam(value = "mediaHeight", required = false) mediaHeight: kotlin.Int?,
        @Parameter(description = "the media width (optional)") @Valid @RequestParam(value = "mediaWidth", required = false) mediaWidth: kotlin.Int?,
        @Parameter(description = "a MultipartFile containing an asset that the \"media\" file references (optional). Example: to upload a video the \"media\" file should contain a screen capture and the \"attachedMedia\" should be the actual video.") @Valid @RequestParam(value = "attachedMedia", required = false) attachedMedia: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "this can be used if the \"attachedMedia\" is a link (i.e. a Youtube video, etc) (optional)") @Valid @RequestParam(value = "attachedMediaUrl", required = false) attachedMediaUrl: kotlin.String?,
        @Parameter(description = "attached media content as a string (optional)") @Valid @RequestParam(value = "attachedMediaString", required = false) attachedMediaString: kotlin.String?,
        @Parameter(description = "file name for attachedMediaString (optional)") @Valid @RequestParam(value = "attachedMediaStringFileName", required = false) attachedMediaStringFileName: kotlin.String?,
        @Parameter(description = "content type for attachedMediaString (optional)") @Valid @RequestParam(value = "attachedMediaStringContentType", required = false) attachedMediaStringContentType: kotlin.String?,
        @Parameter(description = "the attached media height (optional)") @Valid @RequestParam(value = "attachedMediaHeight", required = false) attachedMediaHeight: kotlin.Int?,
        @Parameter(description = "the attached media width (optional)") @Valid @RequestParam(value = "attachedMediaWidth", required = false) attachedMediaWidth: kotlin.Int?,
        @Parameter(description = "the location description (optional)") @Valid @RequestParam(value = "locationDescription", required = false) locationDescription: kotlin.String?,
        @Parameter(description = "Deprecated: app parameter") @Valid @RequestParam(value = "app", required = false) app: kotlin.String?,
        @Parameter(description = "the application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "the search tags") @Valid @RequestParam(value = "searchTags", required = false) searchTags: kotlin.String?,
        @Parameter(description = "the latitude (optional)") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "the longitude (optional)") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<AssetResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Delete Asset",
        operationId = "deleteAsset",
        description = """Delete an asset.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/asset/delete"
        value = [PATH_DELETE_ASSET],
        produces = ["*/*"]
    )
    fun deleteAsset(
        @NotNull @Parameter(description = "the id of the asset to delete", required = true) @Valid @RequestParam(value = "assetId", required = true) assetId: kotlin.String,
        @Parameter(description = "the device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "latitude used to update the user's current location") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "longitude used to update the user's current location") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Get Asset",
        operationId = "getAsset",
        description = """Gets the full asset response including attached likes and notes.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = AssetFullResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/asset/get"
        value = [PATH_GET_ASSET],
        produces = ["*/*"]
    )
    fun getAsset(
        @NotNull @Parameter(description = "the asset ID", required = true) @Valid @RequestParam(value = "assetId", required = true) assetId: kotlin.Long,
        @Parameter(description = "a unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "determines whether the notes on the asset are in descending order", schema = Schema(defaultValue = "false")) @Valid @RequestParam(value = "noteDescending", required = false, defaultValue = "false") noteDescending: kotlin.Boolean
    ): ResponseEntity<AssetFullResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Remove Asset from Collection",
        operationId = "removeAsset",
        description = """Remove assets from collections""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/asset/remove"
        value = [PATH_REMOVE_ASSET],
        produces = ["*/*"]
    )
    fun removeAsset(
        @NotNull @Parameter(description = "the id of the asset to remove", required = true) @Valid @RequestParam(value = "assetId", required = true) assetId: kotlin.String,
        @Parameter(description = "the device id (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account id of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the album id to remove the asset from") @Valid @RequestParam(value = "albumId", required = false) albumId: kotlin.Long?,
        @Parameter(description = "the collection id to remove the asset from") @Valid @RequestParam(value = "collectionId", required = false) collectionId: kotlin.Long?,
        @Parameter(description = "remove from the user's profile album") @Valid @RequestParam(value = "removeFromDefaultAlbums", required = false) removeFromDefaultAlbums: kotlin.Boolean?,
        @Parameter(description = "latitude used to update the user's current location") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "longitude used to update the user's current location") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Search Assets",
        operationId = "searchAssets",
        description = """Searches for assets""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(array = ArraySchema(schema = Schema(implementation = AssetResponse::class)))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        // "/asset/search"
        value = [PATH_SEARCH_ASSETS],
        produces = ["*/*"]
    )
    fun searchAssets(
        @Parameter(description = "a unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "comma separated list of album ids to search on") @Valid @RequestParam(value = "albumIds", required = false) albumIds: kotlin.String?,
        @Parameter(description = "comma separated list of asset ids to search on") @Valid @RequestParam(value = "assetIds", required = false) assetIds: kotlin.String?,
        @Parameter(description = "the application key to filter results by application.") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "filter results by media type. Possible values include: APPLICATION, IMAGE, AUDIO, VIDEO, MULTIPART, TEXT") @Valid @RequestParam(value = "mediaType", required = false) mediaType: kotlin.String?,
        @Parameter(description = "filter results by mime type") @Valid @RequestParam(value = "mimeType", required = false) mimeType: kotlin.String?,
        @Parameter(description = "keyword search string") @Valid @RequestParam(value = "keyword", required = false) keyword: kotlin.String?,
        @Parameter(description = "filter results by version code") @Valid @RequestParam(value = "versionCode", required = false) versionCode: kotlin.Int?,
        @Parameter(description = "filter results by version name") @Valid @RequestParam(value = "versionName", required = false) versionName: kotlin.String?,
        @Parameter(description = "return items that have been updated since this date (time-stamp in milliseconds)") @Valid @RequestParam(value = "updatedSince", required = false) updatedSince: kotlin.Long?,
        @Parameter(description = "return items that have been updated before this date (time-stamp in milliseconds)") @Valid @RequestParam(value = "updatedBefore", required = false) updatedBefore: kotlin.Long?,
        @Parameter(description = "the field to sort by. See AssetApiMap") @Valid @RequestParam(value = "sortField", required = false) sortField: kotlin.String?,
        @Parameter(description = "determines whether the sorted list is in descending or ascending order") @Valid @RequestParam(value = "descending", required = false) descending: kotlin.Boolean?,
        @Parameter(description = "determines whether to search on the media library album") @Valid @RequestParam(value = "searchMediaLibrary", required = false) searchMediaLibrary: kotlin.Boolean?,
        @Parameter(description = "filter results by billable entity") @Valid @RequestParam(value = "filterByBillable", required = false) filterByBillable: kotlin.Boolean?,
        @Parameter(description = "if only searching for active assets") @Valid @RequestParam(value = "activeOnly", required = false) activeOnly: kotlin.Boolean?,
        @Parameter(description = "determines whether to include the application response as part of the asset response") @Valid @RequestParam(value = "returnApp", required = false) returnApp: kotlin.Boolean?,
        @Parameter(description = "the start index for pagination") @Valid @RequestParam(value = "start", required = false) start: kotlin.Int?,
        @Parameter(description = "the limit for pagination (there is a hard limit of 200)") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,
        @Parameter(description = "search mode for index (SearchIndexMode)") @Valid @RequestParam(value = "searchMode", required = false) searchMode: kotlin.String?,
        @Parameter(description = "filter by asset type") @Valid @RequestParam(value = "assetType", required = false) assetType: kotlin.String?,
        @Parameter(description = "filter by approval status") @Valid @RequestParam(value = "approvalStatus", required = false) approvalStatus: kotlin.String?,
        @Parameter(description = "filter results by an assigned account id") @Valid @RequestParam(value = "assignedAccountId", required = false) assignedAccountId: kotlin.Long?
    ): ResponseEntity<List<AssetResponse>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Update Asset",
        operationId = "updateAsset",
        description = """Updates an asset's meta data. If an album reference is passed in, the participants with write permissions are allowed to edit the asset. Otherwise, only the asset up-loader has permission to edit the data.""",
        responses = [
            ApiResponse(responseCode = "200", description = "successful operation", content = [Content(schema = Schema(implementation = SirqulResponse::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        // "/asset/update"
        value = [PATH_UPDATE_ASSET],
        produces = ["*/*"]
    )
    fun updateAsset(
        @NotNull @Parameter(description = "the ID of the asset to update", required = true) @Valid @RequestParam(value = "assetId", required = true) assetId: kotlin.Long,
        @Parameter(description = "a unique ID given by the device (deviceId or accountId required)") @Valid @RequestParam(value = "deviceId", required = false) deviceId: kotlin.String?,
        @Parameter(description = "the account ID of the user (deviceId or accountId required)") @Valid @RequestParam(value = "accountId", required = false) accountId: kotlin.Long?,
        @Parameter(description = "the ID of the album to check user permissions") @Valid @RequestParam(value = "albumId", required = false) albumId: kotlin.Long?,
        @Parameter(description = "the ID of the attached asset") @Valid @RequestParam(value = "attachedAssetId", required = false) attachedAssetId: kotlin.Long?,
        @Parameter(description = "the version code") @Valid @RequestParam(value = "versionCode", required = false) versionCode: kotlin.Int?,
        @Parameter(description = "the version name") @Valid @RequestParam(value = "versionName", required = false) versionName: kotlin.String?,
        @Parameter(description = "External custom client defined data") @Valid @RequestParam(value = "metaData", required = false) metaData: kotlin.String?,
        @Parameter(description = "the caption") @Valid @RequestParam(value = "caption", required = false) caption: kotlin.String?,
        @Parameter(description = "the asset type") @Valid @RequestParam(value = "assetType", required = false) assetType: kotlin.String?,
        @Parameter(description = "approval status for the asset") @Valid @RequestParam(value = "approvalStatus", required = false) approvalStatus: kotlin.String?,
        @Parameter(description = "account id assigned to the asset") @Valid @RequestParam(value = "assignedAccountId", required = false) assignedAccountId: kotlin.Long?,
        @Parameter(description = "a MultipartFile containing the mimetype, etc") @Valid @RequestParam(value = "media", required = false) media: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "this can be used if the \"media\" is a link (optional)") @Valid @RequestParam(value = "mediaUrl", required = false) mediaUrl: kotlin.String?,
        @Parameter(description = "the media content as a string (optional)") @Valid @RequestParam(value = "mediaString", required = false) mediaString: kotlin.String?,
        @Parameter(description = "file name for mediaString (optional)") @Valid @RequestParam(value = "mediaStringFileName", required = false) mediaStringFileName: kotlin.String?,
        @Parameter(description = "content type for mediaString (optional)") @Valid @RequestParam(value = "mediaStringContentType", required = false) mediaStringContentType: kotlin.String?,
        @Parameter(description = "the media height (optional)") @Valid @RequestParam(value = "mediaHeight", required = false) mediaHeight: kotlin.Int?,
        @Parameter(description = "the media width (optional)") @Valid @RequestParam(value = "mediaWidth", required = false) mediaWidth: kotlin.Int?,
        @Parameter(description = "a MultipartFile containing an asset that the \"media\" file references (optional). Example: to upload a video the \"media\" file should contain a screen capture and the \"attachedMedia\" should be the actual video.") @Valid @RequestParam(value = "attachedMedia", required = false) attachedMedia: org.springframework.web.multipart.MultipartFile,
        @Parameter(description = "this can be used if the \"attachedMedia\" is a link (i.e. a Youtube video, etc) (optional)") @Valid @RequestParam(value = "attachedMediaUrl", required = false) attachedMediaUrl: kotlin.String?,
        @Parameter(description = "attached media content as a string (optional)") @Valid @RequestParam(value = "attachedMediaString", required = false) attachedMediaString: kotlin.String?,
        @Parameter(description = "file name for attachedMediaString (optional)") @Valid @RequestParam(value = "attachedMediaStringFileName", required = false) attachedMediaStringFileName: kotlin.String?,
        @Parameter(description = "content type for attachedMediaString (optional)") @Valid @RequestParam(value = "attachedMediaStringContentType", required = false) attachedMediaStringContentType: kotlin.String?,
        @Parameter(description = "the attached media height (optional)") @Valid @RequestParam(value = "attachedMediaHeight", required = false) attachedMediaHeight: kotlin.Int?,
        @Parameter(description = "the attached media width (optional)") @Valid @RequestParam(value = "attachedMediaWidth", required = false) attachedMediaWidth: kotlin.Int?,
        @Parameter(description = "the location description") @Valid @RequestParam(value = "locationDescription", required = false) locationDescription: kotlin.String?,
        @Parameter(description = "search tags") @Valid @RequestParam(value = "searchTags", required = false) searchTags: kotlin.String?,
        @Parameter(description = "the application key") @Valid @RequestParam(value = "appKey", required = false) appKey: kotlin.String?,
        @Parameter(description = "latitude used to update the asset's location") @Valid @RequestParam(value = "latitude", required = false) latitude: kotlin.Double?,
        @Parameter(description = "longitude used to update the asset's location") @Valid @RequestParam(value = "longitude", required = false) longitude: kotlin.Double?
    ): ResponseEntity<SirqulResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/api/3.18"
        const val PATH_ASSET_DOWNLOAD: String = "/asset/download/{filename}"
        const val PATH_ASSET_MORPH: String = "/asset/morph"
        const val PATH_CREATE_ASSET: String = "/asset/create"
        const val PATH_DELETE_ASSET: String = "/asset/delete"
        const val PATH_GET_ASSET: String = "/asset/get"
        const val PATH_REMOVE_ASSET: String = "/asset/remove"
        const val PATH_SEARCH_ASSETS: String = "/asset/search"
        const val PATH_UPDATE_ASSET: String = "/asset/update"
    }
}
