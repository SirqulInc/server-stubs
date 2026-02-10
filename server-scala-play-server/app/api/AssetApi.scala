package api

import play.api.libs.json._
import model.AssetFullResponse
import model.AssetResponse
import model.AssetShortResponse
import model.BigDecimal
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait AssetApi {
  /**
    * Download Asset
    * Downloads an asset from the server for assets that have been uploaded to the server.
    * @param filename the filename in the following formats: {assetId}-{suffix}.{extension} | {assetId}.{extension} | {assetId}
    */
  def assetDownload(version: BigDecimal, filename: String): SirqulResponse

  /**
    * Convert Offer to Creative
    * Converts an offer image + text into a creative image.
    * @param offerId offer id used for inserting offer text/flavor
    * @param adSize the ad size used for selecting a format for the creative image
    * @param creativeId used for inserting the newly created image into
    * @param width total width of the creative image
    * @param height total height of the creative image
    * @param backgroundSize the size of the background
    * @param template the template to use
    */
  def assetMorph(version: BigDecimal, offerId: Long, adSize: String, creativeId: Option[Long], width: Option[Int], height: Option[Int], backgroundSize: Option[String], template: Option[String]): AssetShortResponse

  /**
    * Create Asset
    * Uploads an asset to server and returns an asset id which can be used to assign to various objects.
    * @param returnNulls to return nulls
    * @param deviceId a unique ID given by the device (deviceId or accountId required)
    * @param accountId the account ID of the user (deviceId or accountId required)
    * @param albumId the album the asset will be added to (optional)
    * @param collectionId Deprecated: use collections via the collection endpoints.
    * @param addToDefaultAlbum Whether to add to a default album
    * @param addToMediaLibrary Whether to add to the media library
    * @param versionCode the version code
    * @param versionName the version name
    * @param metaData External custom client defined data
    * @param caption the caption (optional)
    * @param assetType the asset type
    * @param approvalStatus approval status for the asset
    * @param assignedAccountId account id assigned to the asset
    * @param media a MultipartFile containing the mimetype, etc
    * @param mediaUrl this can be used if the \&quot;media\&quot; is a link (optional)
    * @param mediaString the media content as a string (optional)
    * @param mediaStringFileName file name for mediaString (optional)
    * @param mediaStringContentType content type for mediaString (optional)
    * @param mediaHeight the media height (optional)
    * @param mediaWidth the media width (optional)
    * @param attachedMedia a MultipartFile containing an asset that the \&quot;media\&quot; file references (optional). Example: to upload a video the \&quot;media\&quot; file should contain a screen capture and the \&quot;attachedMedia\&quot; should be the actual video.
    * @param attachedMediaUrl this can be used if the \&quot;attachedMedia\&quot; is a link (i.e. a Youtube video, etc) (optional)
    * @param attachedMediaString attached media content as a string (optional)
    * @param attachedMediaStringFileName file name for attachedMediaString (optional)
    * @param attachedMediaStringContentType content type for attachedMediaString (optional)
    * @param attachedMediaHeight the attached media height (optional)
    * @param attachedMediaWidth the attached media width (optional)
    * @param locationDescription the location description (optional)
    * @param app Deprecated: app parameter
    * @param appKey the application key
    * @param searchTags the search tags
    * @param latitude the latitude (optional)
    * @param longitude the longitude (optional)
    */
  def createAsset(version: BigDecimal, returnNulls: Option[Boolean], deviceId: Option[String], accountId: Option[Long], albumId: Option[Long], collectionId: Option[Long], addToDefaultAlbum: Option[String], addToMediaLibrary: Option[Boolean], versionCode: Option[Int], versionName: Option[String], metaData: Option[String], caption: Option[String], assetType: Option[String], approvalStatus: Option[String], assignedAccountId: Option[Long], media: Option[TemporaryFile], mediaUrl: Option[String], mediaString: Option[String], mediaStringFileName: Option[String], mediaStringContentType: Option[String], mediaHeight: Option[Int], mediaWidth: Option[Int], attachedMedia: Option[TemporaryFile], attachedMediaUrl: Option[String], attachedMediaString: Option[String], attachedMediaStringFileName: Option[String], attachedMediaStringContentType: Option[String], attachedMediaHeight: Option[Int], attachedMediaWidth: Option[Int], locationDescription: Option[String], app: Option[String], appKey: Option[String], searchTags: Option[String], latitude: Option[Double], longitude: Option[Double]): AssetResponse

  /**
    * Delete Asset
    * Delete an asset.
    * @param assetId the id of the asset to delete
    * @param deviceId the device id (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param latitude latitude used to update the user&#39;s current location
    * @param longitude longitude used to update the user&#39;s current location
    */
  def deleteAsset(version: BigDecimal, assetId: String, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double]): SirqulResponse

  /**
    * Get Asset
    * Gets the full asset response including attached likes and notes.
    * @param assetId the asset ID
    * @param deviceId a unique ID given by the device (deviceId or accountId required)
    * @param accountId the account ID of the user (deviceId or accountId required)
    * @param noteDescending determines whether the notes on the asset are in descending order
    */
  def getAsset(version: BigDecimal, assetId: Long, deviceId: Option[String], accountId: Option[Long], noteDescending: Option[Boolean]): AssetFullResponse

  /**
    * Remove Asset from Collection
    * Remove assets from collections
    * @param assetId the id of the asset to remove
    * @param deviceId the device id (deviceId or accountId required)
    * @param accountId the account id of the user (deviceId or accountId required)
    * @param albumId the album id to remove the asset from
    * @param collectionId the collection id to remove the asset from
    * @param removeFromDefaultAlbums remove from the user&#39;s profile album
    * @param latitude latitude used to update the user&#39;s current location
    * @param longitude longitude used to update the user&#39;s current location
    */
  def removeAsset(version: BigDecimal, assetId: String, deviceId: Option[String], accountId: Option[Long], albumId: Option[Long], collectionId: Option[Long], removeFromDefaultAlbums: Option[Boolean], latitude: Option[Double], longitude: Option[Double]): SirqulResponse

  /**
    * Search Assets
    * Searches for assets
    * @param deviceId a unique ID given by the device (deviceId or accountId required)
    * @param accountId the account ID of the user (deviceId or accountId required)
    * @param albumIds comma separated list of album ids to search on
    * @param assetIds comma separated list of asset ids to search on
    * @param appKey the application key to filter results by application.
    * @param mediaType filter results by media type. Possible values include: APPLICATION, IMAGE, AUDIO, VIDEO, MULTIPART, TEXT
    * @param mimeType filter results by mime type
    * @param keyword keyword search string
    * @param versionCode filter results by version code
    * @param versionName filter results by version name
    * @param updatedSince return items that have been updated since this date (time-stamp in milliseconds)
    * @param updatedBefore return items that have been updated before this date (time-stamp in milliseconds)
    * @param sortField the field to sort by. See AssetApiMap
    * @param descending determines whether the sorted list is in descending or ascending order
    * @param searchMediaLibrary determines whether to search on the media library album
    * @param filterByBillable filter results by billable entity
    * @param activeOnly if only searching for active assets
    * @param returnApp determines whether to include the application response as part of the asset response
    * @param start the start index for pagination
    * @param limit the limit for pagination (there is a hard limit of 200)
    * @param searchMode search mode for index (SearchIndexMode)
    * @param assetType filter by asset type
    * @param approvalStatus filter by approval status
    * @param assignedAccountId filter results by an assigned account id
    */
  def searchAssets(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], albumIds: Option[String], assetIds: Option[String], appKey: Option[String], mediaType: Option[String], mimeType: Option[String], keyword: Option[String], versionCode: Option[Int], versionName: Option[String], updatedSince: Option[Long], updatedBefore: Option[Long], sortField: Option[String], descending: Option[Boolean], searchMediaLibrary: Option[Boolean], filterByBillable: Option[Boolean], activeOnly: Option[Boolean], returnApp: Option[Boolean], start: Option[Int], limit: Option[Int], searchMode: Option[String], assetType: Option[String], approvalStatus: Option[String], assignedAccountId: Option[Long]): List[AssetResponse]

  /**
    * Update Asset
    * Updates an asset&#39;s meta data. If an album reference is passed in, the participants with write permissions are allowed to edit the asset. Otherwise, only the asset up-loader has permission to edit the data.
    * @param assetId the ID of the asset to update
    * @param deviceId a unique ID given by the device (deviceId or accountId required)
    * @param accountId the account ID of the user (deviceId or accountId required)
    * @param albumId the ID of the album to check user permissions
    * @param attachedAssetId the ID of the attached asset
    * @param versionCode the version code
    * @param versionName the version name
    * @param metaData External custom client defined data
    * @param caption the caption
    * @param assetType the asset type
    * @param approvalStatus approval status for the asset
    * @param assignedAccountId account id assigned to the asset
    * @param media a MultipartFile containing the mimetype, etc
    * @param mediaUrl this can be used if the \&quot;media\&quot; is a link (optional)
    * @param mediaString the media content as a string (optional)
    * @param mediaStringFileName file name for mediaString (optional)
    * @param mediaStringContentType content type for mediaString (optional)
    * @param mediaHeight the media height (optional)
    * @param mediaWidth the media width (optional)
    * @param attachedMedia a MultipartFile containing an asset that the \&quot;media\&quot; file references (optional). Example: to upload a video the \&quot;media\&quot; file should contain a screen capture and the \&quot;attachedMedia\&quot; should be the actual video.
    * @param attachedMediaUrl this can be used if the \&quot;attachedMedia\&quot; is a link (i.e. a Youtube video, etc) (optional)
    * @param attachedMediaString attached media content as a string (optional)
    * @param attachedMediaStringFileName file name for attachedMediaString (optional)
    * @param attachedMediaStringContentType content type for attachedMediaString (optional)
    * @param attachedMediaHeight the attached media height (optional)
    * @param attachedMediaWidth the attached media width (optional)
    * @param locationDescription the location description
    * @param searchTags search tags
    * @param appKey the application key
    * @param latitude latitude used to update the asset&#39;s location
    * @param longitude longitude used to update the asset&#39;s location
    */
  def updateAsset(version: BigDecimal, assetId: Long, deviceId: Option[String], accountId: Option[Long], albumId: Option[Long], attachedAssetId: Option[Long], versionCode: Option[Int], versionName: Option[String], metaData: Option[String], caption: Option[String], assetType: Option[String], approvalStatus: Option[String], assignedAccountId: Option[Long], media: Option[TemporaryFile], mediaUrl: Option[String], mediaString: Option[String], mediaStringFileName: Option[String], mediaStringContentType: Option[String], mediaHeight: Option[Int], mediaWidth: Option[Int], attachedMedia: Option[TemporaryFile], attachedMediaUrl: Option[String], attachedMediaString: Option[String], attachedMediaStringFileName: Option[String], attachedMediaStringContentType: Option[String], attachedMediaHeight: Option[Int], attachedMediaWidth: Option[Int], locationDescription: Option[String], searchTags: Option[String], appKey: Option[String], latitude: Option[Double], longitude: Option[Double]): SirqulResponse
}
