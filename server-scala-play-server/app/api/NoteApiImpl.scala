package api

import model.BigDecimal
import model.NoteResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

/**
  * Provides a default implementation for [[NoteApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class NoteApiImpl extends NoteApi {
  /**
    * @inheritdoc
    */
  override def batchOperation(version: BigDecimal, notableId: Long, notableType: String, deviceId: Option[String], accountId: Option[Long], batchOperation: Option[String]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def createNote(version: BigDecimal, comment: String, deviceId: Option[String], accountId: Option[Long], notableType: Option[String], notableId: Option[Long], noteType: Option[String], assetIds: Option[String], tags: Option[String], permissionableType: Option[String], permissionableId: Option[Long], appKey: Option[String], locationDescription: Option[String], latitude: Option[Double], longitude: Option[Double], metaData: Option[String], receiverAccountIds: Option[String], returnFullResponse: Option[Boolean], initializeAsset: Option[Boolean], assetReturnNulls: Option[Boolean], assetAlbumId: Option[Long], assetCollectionId: Option[Long], assetAddToDefaultAlbum: Option[String], assetAddToMediaLibrary: Option[Boolean], assetVersionCode: Option[Int], assetVersionName: Option[String], assetMetaData: Option[String], assetCaption: Option[String], assetMedia: Option[TemporaryFile], assetMediaUrl: Option[String], assetMediaString: Option[String], assetMediaStringFileName: Option[String], assetMediaStringContentType: Option[String], assetAttachedMedia: Option[TemporaryFile], assetAttachedMediaUrl: Option[String], assetAttachedMediaString: Option[String], assetAttachedMediaStringFileName: Option[String], assetAttachedMediaStringContentType: Option[String], assetLocationDescription: Option[String], assetApp: Option[String], assetSearchTags: Option[String], assetLatitude: Option[Double], assetLongitude: Option[BigDecimal]): NoteResponse = {
    // TODO: Implement better logic

    NoteResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteNote(version: BigDecimal, noteId: Long, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double], appKey: Option[String]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getNote(version: BigDecimal, noteId: Long, deviceId: Option[String], accountId: Option[Long], returnFullResponse: Option[Boolean]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchNotes(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], notableType: Option[String], notableId: Option[Long], noteTypes: Option[String], appKey: Option[String], keyword: Option[String], flagCountMinimum: Option[Long], flagsExceedThreshold: Option[Boolean], includeInactive: Option[Boolean], sortField: Option[String], descending: Option[Boolean], returnFullResponse: Option[Boolean], updatedSince: Option[Long], updatedBefore: Option[Long], start: Option[Int], limit: Option[Int]): List[NoteResponse] = {
    // TODO: Implement better logic

    List.empty[NoteResponse]
  }

  /**
    * @inheritdoc
    */
  override def updateNote(version: BigDecimal, noteId: Long, deviceId: Option[String], accountId: Option[Long], comment: Option[String], noteType: Option[String], assetIds: Option[String], tags: Option[String], permissionableType: Option[String], permissionableId: Option[Long], appKey: Option[String], locationDescription: Option[String], latitude: Option[Double], longitude: Option[Double], metaData: Option[String], returnFullResponse: Option[Boolean], active: Option[Boolean], updateAsset: Option[Boolean], assetReturnNulls: Option[Boolean], assetAlbumId: Option[Long], assetCollectionId: Option[Long], assetAddToDefaultAlbum: Option[String], assetAddToMediaLibrary: Option[Boolean], assetVersionCode: Option[Int], assetVersionName: Option[String], assetMetaData: Option[String], assetCaption: Option[String], assetMedia: Option[TemporaryFile], assetMediaUrl: Option[String], assetMediaString: Option[String], assetMediaStringFileName: Option[String], assetMediaStringContentType: Option[String], assetAttachedMedia: Option[TemporaryFile], assetAttachedMediaUrl: Option[String], assetAttachedMediaString: Option[String], assetAttachedMediaStringFileName: Option[String], assetAttachedMediaStringContentType: Option[String], assetLocationDescription: Option[String], assetApp: Option[String], assetSearchTags: Option[String], assetLatitude: Option[Double], assetLongitude: Option[Double]): NoteResponse = {
    // TODO: Implement better logic

    NoteResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
