package api

import model.BigDecimal
import model.CountResponse
import model.FlagResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[FlagApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class FlagApiImpl extends FlagApi {
  /**
    * @inheritdoc
    */
  override def createFlag(version: BigDecimal, flagableType: String, flagableId: Long, deviceId: Option[String], accountId: Option[Long], flagDescription: Option[String], latitude: Option[Double], longitude: Option[Double]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteFlag(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], itemBeingFlaggedType: Option[String], itemBeingFlaggedId: Option[Long], flagableType: Option[String], flagableId: Option[Long]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getFlag(version: BigDecimal, flagableType: String, flagableId: Long, deviceId: Option[String], accountId: Option[Long], latitude: Option[Double], longitude: Option[Double]): FlagResponse = {
    // TODO: Implement better logic

    FlagResponse(None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getFlagThreshold(version: BigDecimal, itemBeingFlaggedType: String, appKey: String): CountResponse = {
    // TODO: Implement better logic

    CountResponse(None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateFlagThreshold(version: BigDecimal, itemBeingFlaggedType: String, threshold: Long, appKey: String, deviceId: Option[String], accountId: Option[Long]): CountResponse = {
    // TODO: Implement better logic

    CountResponse(None, None, None, None, None, None, None, None, None)
  }
}
