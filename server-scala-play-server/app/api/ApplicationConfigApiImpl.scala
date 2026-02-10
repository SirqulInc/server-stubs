package api

import model.ApplicationConfigResponse
import model.BigDecimal
import model.SirqulResponse

/**
  * Provides a default implementation for [[ApplicationConfigApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class ApplicationConfigApiImpl extends ApplicationConfigApi {
  /**
    * @inheritdoc
    */
  override def createApplicationConfig(version: BigDecimal, accountId: Long, appKey: String, configVersion: String, assetId: Long, retailerId: Option[Long], retailerLocationId: Option[Long], udid: Option[String]): ApplicationConfigResponse = {
    // TODO: Implement better logic

    ApplicationConfigResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteApplicationConfig(version: BigDecimal, accountId: Long, configId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getApplicationConfig(version: BigDecimal, accountId: Long, configId: Long): ApplicationConfigResponse = {
    // TODO: Implement better logic

    ApplicationConfigResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getApplicationConfigByConfigVersion(version: BigDecimal, appKey: String, configVersion: String, retailerId: Option[Long], retailerLocationId: Option[Long], udid: Option[String], allowOlderVersions: Option[Boolean]): ApplicationConfigResponse = {
    // TODO: Implement better logic

    ApplicationConfigResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchApplicationConfig(version: BigDecimal, accountId: Long, appKey: Option[String], retailerId: Option[Long], retailerLocationId: Option[Long], udid: Option[String], configVersion: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int]): List[ApplicationConfigResponse] = {
    // TODO: Implement better logic

    List.empty[ApplicationConfigResponse]
  }

  /**
    * @inheritdoc
    */
  override def updateApplicationConfig(version: BigDecimal, accountId: Long, configId: Long, appKey: Option[String], configVersion: Option[String], assetId: Option[Long], retailerId: Option[Long], retailerLocationId: Option[Long], udid: Option[String]): ApplicationConfigResponse = {
    // TODO: Implement better logic

    ApplicationConfigResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
