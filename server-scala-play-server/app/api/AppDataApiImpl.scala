package api

import model.AppResponse
import model.BigDecimal
import model.SirqulResponse

/**
  * Provides a default implementation for [[AppDataApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class AppDataApiImpl extends AppDataApi {
  /**
    * @inheritdoc
    */
  override def getAppData(version: BigDecimal, start: Int, limit: Int, deviceId: Option[String], accountId: Option[Long], gameType: Option[String], includeGameData: Option[Boolean], q: Option[String], keyword: Option[String], sortField: Option[String], descending: Option[Boolean], i: Option[Int], l: Option[Int], gameObjectCount: Option[Boolean], filter: Option[String], dateCreated: Option[Long], ownerId: Option[Long], missionIds: Option[String], gameIds: Option[String], packIds: Option[String], gameLevelIds: Option[String], appVersion: Option[String], includeHigherVersionPacks: Option[Boolean], includeHigherVersionLevels: Option[Boolean], responseGroups: Option[String], purchaseType: Option[String]): AppResponse = {
    // TODO: Implement better logic

    AppResponse(None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def postAppData(version: BigDecimal, gameType: String, start: Int, limit: Int, data: String, deviceId: Option[String], accountId: Option[Long], includeGameData: Option[Boolean], q: Option[String], keyword: Option[String], sortField: Option[String], descending: Option[Boolean], i: Option[Int], l: Option[Int], gameObjectCount: Option[Boolean], filter: Option[String], dateCreated: Option[Long], ownerId: Option[Long], missionIds: Option[String], gameIds: Option[String], packIds: Option[String], gameLevelIds: Option[String], appVersion: Option[String], includeHigherVersionPacks: Option[Boolean], includeHigherVersionLevels: Option[Boolean], responseGroups: Option[String], purchaseType: Option[String]): AppResponse = {
    // TODO: Implement better logic

    AppResponse(None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def regenAppData(version: BigDecimal, accountId: Option[Long], appKey: Option[String], buildVersion: Option[String], apiVersion: Option[String]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }
}
