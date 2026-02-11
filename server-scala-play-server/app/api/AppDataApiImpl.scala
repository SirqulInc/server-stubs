package api

import model.AppResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[AppDataApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class AppDataApiImpl extends AppDataApi {
  /**
    * @inheritdoc
    */
  override def getAppData(start: Int, limit: Int, deviceId: Option[String], accountId: Option[Long], gameType: Option[String], includeGameData: Option[Boolean], q: Option[String], keyword: Option[String], sortField: Option[String], descending: Option[Boolean], i: Option[Int], l: Option[Int], gameObjectCount: Option[Boolean], filter: Option[String], dateCreated: Option[Long], ownerId: Option[Long], missionIds: Option[String], gameIds: Option[String], packIds: Option[String], gameLevelIds: Option[String], appVersion: Option[String], includeHigherVersionPacks: Option[Boolean], includeHigherVersionLevels: Option[Boolean], responseGroups: Option[String], purchaseType: Option[String]): AppResponse = {
    // TODO: Implement better logic

    AppResponse(None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def postAppData(gameType: String, start: Int, limit: Int, data: String, deviceId: Option[String], accountId: Option[Long], includeGameData: Option[Boolean], q: Option[String], keyword: Option[String], sortField: Option[String], descending: Option[Boolean], i: Option[Int], l: Option[Int], gameObjectCount: Option[Boolean], filter: Option[String], dateCreated: Option[Long], ownerId: Option[Long], missionIds: Option[String], gameIds: Option[String], packIds: Option[String], gameLevelIds: Option[String], appVersion: Option[String], includeHigherVersionPacks: Option[Boolean], includeHigherVersionLevels: Option[Boolean], responseGroups: Option[String], purchaseType: Option[String]): AppResponse = {
    // TODO: Implement better logic

    AppResponse(None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def regenAppData(accountId: Option[Long], appKey: Option[String], buildVersion: Option[String], apiVersion: Option[String]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }
}
