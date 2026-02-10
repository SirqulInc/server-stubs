package api

import model.BigDecimal
import model.PurchaseItemListResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile
import model.ThemeDescriptorResponse

/**
  * Provides a default implementation for [[ThemeDescriptorApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class ThemeDescriptorApiImpl extends ThemeDescriptorApi {
  /**
    * @inheritdoc
    */
  override def addOrUpdateThemeDescriptor(version: BigDecimal, publicRead: Boolean, publicWrite: Boolean, publicDelete: Boolean, publicAdd: Boolean, visibility: String, includeFriendGroup: Boolean, completeWithDefaultValues: Boolean, deviceId: Option[String], accountId: Option[Long], gameType: Option[String], themeDescriptorId: Option[Long], title: Option[String], description: Option[String], connectionIdsToAdd: Option[String], connectionGroupIdsToAdd: Option[String], appVersion: Option[String], colorValueJson: Option[String], stringReplacerJson: Option[String], customJsonObjects: Option[String], iconImage: Option[TemporaryFile], sceneAtlasImage: Option[TemporaryFile], bgImage: Option[TemporaryFile], bgSound: Option[TemporaryFile], musicSelection: Option[String], locationDescription: Option[String], latitude: Option[Double], longitude: Option[Double]): ThemeDescriptorResponse = {
    // TODO: Implement better logic

    ThemeDescriptorResponse(None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getThemeDescriptor(version: BigDecimal, themeDescriptorId: Long, deviceId: Option[String], accountId: Option[Long], gameType: Option[String], latitude: Option[Double], longitude: Option[Double]): PurchaseItemListResponse = {
    // TODO: Implement better logic

    PurchaseItemListResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getThemeDescriptors(version: BigDecimal, filter: String, sortField: String, descending: Boolean, start: Int, limit: Int, deviceId: Option[String], accountId: Option[Long], gameType: Option[String], contestType: Option[String], ownerId: Option[Long], q: Option[String], keyword: Option[String], i: Option[Int], l: Option[Int], dateCreated: Option[Long], appVersion: Option[String], latitude: Option[Double], longitude: Option[Double]): PurchaseItemListResponse = {
    // TODO: Implement better logic

    PurchaseItemListResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def removeThemeDescriptor(version: BigDecimal, themeDescriptorId: Long, deviceId: Option[String], accountId: Option[Long], gameType: Option[String], latitude: Option[Double], longitude: Option[Double]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }
}
