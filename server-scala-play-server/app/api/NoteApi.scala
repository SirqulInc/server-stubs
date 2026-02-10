package api

import play.api.libs.json._
import model.BigDecimal
import model.NoteResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait NoteApi {
  /**
    * Batch Note Operation
    * Perform a batch operation on notes for a notable object (for example: DELETE_ALL_NOTES_IN_NOTABLE). 
    * @param notableId The id of the notable object the batch operation will affect
    * @param notableType The notable object type (for example ALBUM, ASSET, OFFER, etc.)
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param batchOperation The batch operation to perform (e.g., DELETE_ALL_NOTES_IN_NOTABLE). Optional.
    */
  def batchOperation(version: BigDecimal, notableId: Long, notableType: String, deviceId: Option[String], accountId: Option[Long], batchOperation: Option[String]): SirqulResponse

  /**
    * Create Note
    * This is used to leave a comment (note) on a notable object (i.e. albums, album contests, assets, game levels, offers, offer locations, retailers, retailer locations, and theme descriptors). Leaving a comment on a notable object will be visiable to everyone who has access to view the object.
    * @param comment The message the user wishes to leave a comment on
    * @param deviceId The unique device identifier that made the request (either deviceId or accountId must be used)
    * @param accountId The unique accountId that made the request (either deviceId or accountId must be used)
    * @param notableType The notable object type {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, OFFER, OFFER_LOCATION, RETAILER, RETAILER_LOCATION, THEME_DESCRIPTOR}
    * @param notableId The id of the notable object
    * @param noteType The custom string defined by the client (used for differentiating various note types)
    * @param assetIds A comma separated list of asset IDs to add with the note
    * @param tags search tags
    * @param permissionableType This is used for sending out group notifications. For example, when someone adds a note to an asset which is also a part of an album, everyone in the album will receive a notification. This is achieved by passing in the permissionable type (in this case \&quot;album\&quot;), and the permissionable id (the album id). Possible types: {ALBUM, ALBUM_CONTEST, GAME_LEVEL, THEME_DESCRIPTOR}
    * @param permissionableId The id of the permissionable object (for sending group notifications)
    * @param appKey The application key used to identify the application
    * @param locationDescription The description of the location
    * @param latitude The current location of the user
    * @param longitude The current location of the user
    * @param metaData External custom client defined data
    * @param receiverAccountIds Comma separated list of additional account IDs that will receive the note notifications
    * @param returnFullResponse whether to return the full response or not
    * @param initializeAsset Check true if need to initialize an asset and assign to current note
    * @param assetReturnNulls Return null fields for asset response when creating an asset
    * @param assetAlbumId the album the asset will be added to (optional)
    * @param assetCollectionId the collection ID that the asset is associated with
    * @param assetAddToDefaultAlbum the default album to add the asset to
    * @param assetAddToMediaLibrary the media library to add the asset to
    * @param assetVersionCode the version code of the asset
    * @param assetVersionName the version name of the asset
    * @param assetMetaData the meta data of the asset
    * @param assetCaption the caption of the asset
    * @param assetMedia the media of the asset
    * @param assetMediaUrl the media URL of the asset
    * @param assetMediaString the media string of the asset
    * @param assetMediaStringFileName the media string file name of the asset
    * @param assetMediaStringContentType the media string content type of the asset
    * @param assetAttachedMedia the attached media of the asset
    * @param assetAttachedMediaUrl the attached media URL of the asset
    * @param assetAttachedMediaString the attached media string of the asset
    * @param assetAttachedMediaStringFileName the attached media string file name of the asset
    * @param assetAttachedMediaStringContentType the attached media string content type of the asset
    * @param assetLocationDescription the location description for the asset
    * @param assetApp the application for the asset
    * @param assetSearchTags the search tags used for the asset
    * @param assetLatitude the latitude of the asset
    * @param assetLongitude the longitude of the asset
    */
  def createNote(version: BigDecimal, comment: String, deviceId: Option[String], accountId: Option[Long], notableType: Option[String], notableId: Option[Long], noteType: Option[String], assetIds: Option[String], tags: Option[String], permissionableType: Option[String], permissionableId: Option[Long], appKey: Option[String], locationDescription: Option[String], latitude: Option[Double], longitude: Option[Double], metaData: Option[String], receiverAccountIds: Option[String], returnFullResponse: Option[Boolean], initializeAsset: Option[Boolean], assetReturnNulls: Option[Boolean], assetAlbumId: Option[Long], assetCollectionId: Option[Long], assetAddToDefaultAlbum: Option[String], assetAddToMediaLibrary: Option[Boolean], assetVersionCode: Option[Int], assetVersionName: Option[String], assetMetaData: Option[String], assetCaption: Option[String], assetMedia: Option[TemporaryFile], assetMediaUrl: Option[String], assetMediaString: Option[String], assetMediaStringFileName: Option[String], assetMediaStringContentType: Option[String], assetAttachedMedia: Option[TemporaryFile], assetAttachedMediaUrl: Option[String], assetAttachedMediaString: Option[String], assetAttachedMediaStringFileName: Option[String], assetAttachedMediaStringContentType: Option[String], assetLocationDescription: Option[String], assetApp: Option[String], assetSearchTags: Option[String], assetLatitude: Option[Double], assetLongitude: Option[BigDecimal]): NoteResponse

  /**
    * Delete Note
    * Sets a comment (note) as deleted.
    * @param noteId The ID of the note to delete
    * @param deviceId The unique device identifier that made the request (either deviceId or accountId must be used)
    * @param accountId The unique accountId that made the request (either deviceId or accountId must be used)
    * @param latitude The current location of the user
    * @param longitude The current location of the user
    * @param appKey The application key used to identify the application
    */
  def deleteNote(version: BigDecimal, noteId: Long, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double], appKey: Option[String]): SirqulResponse

  /**
    * Get Note
    * Get for a note based on its Id.
    * @param noteId the id of the note to get
    * @param deviceId The unique device identifier that made the request (either deviceId or accountId must be used)
    * @param accountId The unique accountId that made the request (either deviceId or accountId must be used)
    * @param returnFullResponse Determines whether to return the NoteFullResponse for the item
    */
  def getNote(version: BigDecimal, noteId: Long, deviceId: Option[String], accountId: Option[Long], returnFullResponse: Option[Boolean]): SirqulResponse

  /**
    * Search Notes
    * Search for notes on a notable object.
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param notableType The notable object type {ALBUM, ALBUM_CONTEST, ASSET, GAME_LEVEL, OFFER, OFFER_LOCATION, RETAILER, RETAILER_LOCATION, THEME_DESCRIPTOR}
    * @param notableId The id of the notable object
    * @param noteTypes Comma separated list of noteType strings to filter results with
    * @param appKey The application key used to identify the application
    * @param keyword The keyword used to search
    * @param flagCountMinimum return items that has flagCount &gt;&#x3D; flagCountMinimum if this is set, return all items, even ones with flagCount &gt;&#x3D; flagThreshold
    * @param flagsExceedThreshold return items that has flagCount &gt;&#x3D; flagThreshold, which are hidden by default
    * @param includeInactive include inactive in the result
    * @param sortField The column to sort the search on
    * @param descending The order to return the search results
    * @param returnFullResponse Determines whether to return the NoteFullResponse for each search item
    * @param updatedSince return items that have been updated since this date (time-stamp in milliseconds)
    * @param updatedBefore return items that have been updated before this date (time-stamp in milliseconds)
    * @param start The record to begin the return set on
    * @param limit The number of records to return
    */
  def searchNotes(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], notableType: Option[String], notableId: Option[Long], noteTypes: Option[String], appKey: Option[String], keyword: Option[String], flagCountMinimum: Option[Long], flagsExceedThreshold: Option[Boolean], includeInactive: Option[Boolean], sortField: Option[String], descending: Option[Boolean], returnFullResponse: Option[Boolean], updatedSince: Option[Long], updatedBefore: Option[Long], start: Option[Int], limit: Option[Int]): List[NoteResponse]

  /**
    * Update Note
    * Update an existing comment (note). Only the creator of the note have permission to update.
    * @param noteId The id of the note, used when editing a comment
    * @param deviceId The unique device identifier that made the request (either deviceId or accountId must be used)
    * @param accountId The unique accountId that made the request (either deviceId or accountId must be used)
    * @param comment The message the user wishes to leave a comment on
    * @param noteType The custom string defined by the client (used for differentiating on various note types)
    * @param assetIds A comma separated list of asset IDs to add with the note
    * @param tags search tags
    * @param permissionableType This is used for sending out group notifications. For example, when someone adds a note to an asset which is also a part of an album, everyone in the album will receive a notification. This is achieved by passing in the permissionable type (in this case \&quot;album\&quot;), and the permissionable id (the album id). Possible types: {ALBUM, ALBUM_CONTEST, GAME_LEVEL, THEME_DESCRIPTOR}
    * @param permissionableId The id of the permissionable object (for sending group notifications)
    * @param appKey The application key used to identify the application
    * @param locationDescription The description of the location
    * @param latitude The current location of the user
    * @param longitude The current location of the user
    * @param metaData meta data to update with the note
    * @param returnFullResponse whether to return the full response or not
    * @param active Sets the active flag for the note
    * @param updateAsset main flag for updating asset in note, must set to true if you want to update the note&#39;s asset
    * @param assetReturnNulls Return null fields for asset response when updating an asset
    * @param assetAlbumId the album the asset will be added to (optional)
    * @param assetCollectionId the collection ID that the asset is associated with
    * @param assetAddToDefaultAlbum the default album to add the asset to
    * @param assetAddToMediaLibrary the media library to add the asset to
    * @param assetVersionCode the version code of the asset
    * @param assetVersionName the version name of the asset
    * @param assetMetaData the meta data of the asset
    * @param assetCaption the caption of the asset
    * @param assetMedia the media of the asset
    * @param assetMediaUrl the media URL of the asset
    * @param assetMediaString the media string of the asset
    * @param assetMediaStringFileName the media string file name of the asset
    * @param assetMediaStringContentType the media string content type of the asset
    * @param assetAttachedMedia the attached media of the asset
    * @param assetAttachedMediaUrl the attached media URL of the asset
    * @param assetAttachedMediaString the attached media string of the asset
    * @param assetAttachedMediaStringFileName the attached media string file name of the asset
    * @param assetAttachedMediaStringContentType the attached media string content type of the asset
    * @param assetLocationDescription the location description for the asset
    * @param assetApp the application for the asset
    * @param assetSearchTags the search tags used for the asset
    * @param assetLatitude the latitude of the asset
    * @param assetLongitude the longitude of the asset
    */
  def updateNote(version: BigDecimal, noteId: Long, deviceId: Option[String], accountId: Option[Long], comment: Option[String], noteType: Option[String], assetIds: Option[String], tags: Option[String], permissionableType: Option[String], permissionableId: Option[Long], appKey: Option[String], locationDescription: Option[String], latitude: Option[Double], longitude: Option[Double], metaData: Option[String], returnFullResponse: Option[Boolean], active: Option[Boolean], updateAsset: Option[Boolean], assetReturnNulls: Option[Boolean], assetAlbumId: Option[Long], assetCollectionId: Option[Long], assetAddToDefaultAlbum: Option[String], assetAddToMediaLibrary: Option[Boolean], assetVersionCode: Option[Int], assetVersionName: Option[String], assetMetaData: Option[String], assetCaption: Option[String], assetMedia: Option[TemporaryFile], assetMediaUrl: Option[String], assetMediaString: Option[String], assetMediaStringFileName: Option[String], assetMediaStringContentType: Option[String], assetAttachedMedia: Option[TemporaryFile], assetAttachedMediaUrl: Option[String], assetAttachedMediaString: Option[String], assetAttachedMediaStringFileName: Option[String], assetAttachedMediaStringContentType: Option[String], assetLocationDescription: Option[String], assetApp: Option[String], assetSearchTags: Option[String], assetLatitude: Option[Double], assetLongitude: Option[Double]): NoteResponse
}
