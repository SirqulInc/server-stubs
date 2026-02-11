package api

import model.AssetFullResponse
import model.AssetResponse
import model.AssetShortResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

/**
  * Provides a default implementation for [[AssetApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class AssetApiImpl extends AssetApi {
  /**
    * @inheritdoc
    */
  override def assetDownload(filename: String): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def assetMorph(offerId: Long, adSize: String, creativeId: Option[Long], width: Option[Int], height: Option[Int], backgroundSize: Option[String], template: Option[String]): AssetShortResponse = {
    // TODO: Implement better logic

    AssetShortResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def createAsset(returnNulls: Option[Boolean], deviceId: Option[String], accountId: Option[Long], albumId: Option[Long], collectionId: Option[Long], addToDefaultAlbum: Option[String], addToMediaLibrary: Option[Boolean], versionCode: Option[Int], versionName: Option[String], metaData: Option[String], caption: Option[String], assetType: Option[String], approvalStatus: Option[String], assignedAccountId: Option[Long], media: Option[TemporaryFile], mediaUrl: Option[String], mediaString: Option[String], mediaStringFileName: Option[String], mediaStringContentType: Option[String], mediaHeight: Option[Int], mediaWidth: Option[Int], attachedMedia: Option[TemporaryFile], attachedMediaUrl: Option[String], attachedMediaString: Option[String], attachedMediaStringFileName: Option[String], attachedMediaStringContentType: Option[String], attachedMediaHeight: Option[Int], attachedMediaWidth: Option[Int], locationDescription: Option[String], app: Option[String], appKey: Option[String], searchTags: Option[String], latitude: Option[Double], longitude: Option[Double]): AssetResponse = {
    // TODO: Implement better logic

    AssetResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteAsset(assetId: String, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getAsset(assetId: Long, deviceId: Option[String], accountId: Option[Long], noteDescending: Option[Boolean]): AssetFullResponse = {
    // TODO: Implement better logic

    AssetFullResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def removeAsset(assetId: String, deviceId: Option[String], accountId: Option[Long], albumId: Option[Long], collectionId: Option[Long], removeFromDefaultAlbums: Option[Boolean], latitude: Option[Double], longitude: Option[Double]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchAssets(deviceId: Option[String], accountId: Option[Long], albumIds: Option[String], assetIds: Option[String], appKey: Option[String], mediaType: Option[String], mimeType: Option[String], keyword: Option[String], versionCode: Option[Int], versionName: Option[String], updatedSince: Option[Long], updatedBefore: Option[Long], sortField: Option[String], descending: Option[Boolean], searchMediaLibrary: Option[Boolean], filterByBillable: Option[Boolean], activeOnly: Option[Boolean], returnApp: Option[Boolean], start: Option[Int], limit: Option[Int], searchMode: Option[String], assetType: Option[String], approvalStatus: Option[String], assignedAccountId: Option[Long]): List[AssetResponse] = {
    // TODO: Implement better logic

    List.empty[AssetResponse]
  }

  /**
    * @inheritdoc
    */
  override def updateAsset(assetId: Long, deviceId: Option[String], accountId: Option[Long], albumId: Option[Long], attachedAssetId: Option[Long], versionCode: Option[Int], versionName: Option[String], metaData: Option[String], caption: Option[String], assetType: Option[String], approvalStatus: Option[String], assignedAccountId: Option[Long], media: Option[TemporaryFile], mediaUrl: Option[String], mediaString: Option[String], mediaStringFileName: Option[String], mediaStringContentType: Option[String], mediaHeight: Option[Int], mediaWidth: Option[Int], attachedMedia: Option[TemporaryFile], attachedMediaUrl: Option[String], attachedMediaString: Option[String], attachedMediaStringFileName: Option[String], attachedMediaStringContentType: Option[String], attachedMediaHeight: Option[Int], attachedMediaWidth: Option[Int], locationDescription: Option[String], searchTags: Option[String], appKey: Option[String], latitude: Option[Double], longitude: Option[Double]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }
}
