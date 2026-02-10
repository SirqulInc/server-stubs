package api

import model.BigDecimal
import model.CreativeResponse
import model.MissionResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[CreativeApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class CreativeApiImpl extends CreativeApi {
  /**
    * @inheritdoc
    */
  override def addPreview(version: BigDecimal, accountId: Long, creativeId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def adsFind(version: BigDecimal, appKey: String, randomize: Boolean, targetedAdsOnly: Boolean, `type`: Option[String], accountId: Option[Long], appVersion: Option[String], latitude: Option[Double], longitude: Option[Double], device: Option[String], deviceIdentifier: Option[Long], deviceVersion: Option[String], start: Option[Int], limit: Option[Int], includeAudiences: Option[Boolean], allocatesTickets: Option[Boolean], missionIds: Option[String]): List[MissionResponse] = {
    // TODO: Implement better logic

    List.empty[MissionResponse]
  }

  /**
    * @inheritdoc
    */
  override def createCreative(version: BigDecimal, accountId: Long, name: String, active: Boolean, waitForAsset: Boolean, description: Option[String], assetImageId: Option[Long], action: Option[String], data: Option[String], suffix: Option[String], `type`: Option[String], balance: Option[Double], referenceId: Option[Long], appVersion: Option[String], missionId: Option[Long], offerId: Option[Long]): CreativeResponse = {
    // TODO: Implement better logic

    CreativeResponse(None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteCreative(version: BigDecimal, accountId: Long, creativeId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getCreative(version: BigDecimal, accountId: Long, creativeId: Long): CreativeResponse = {
    // TODO: Implement better logic

    CreativeResponse(None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getCreativesByApplication(version: BigDecimal, accountId: Long, appKey: String, start: Int, limit: Int, missionId: Option[Long], keyword: Option[String]): List[CreativeResponse] = {
    // TODO: Implement better logic

    List.empty[CreativeResponse]
  }

  /**
    * @inheritdoc
    */
  override def removePreview(version: BigDecimal, accountId: Long, creativeId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateCreative(version: BigDecimal, accountId: Long, creativeId: Long, name: Option[String], description: Option[String], assetImageId: Option[Long], action: Option[String], data: Option[String], suffix: Option[String], `type`: Option[String], balance: Option[Double], active: Option[Boolean], referenceId: Option[Long], appVersion: Option[String], missionId: Option[Long]): CreativeResponse = {
    // TODO: Implement better logic

    CreativeResponse(None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
