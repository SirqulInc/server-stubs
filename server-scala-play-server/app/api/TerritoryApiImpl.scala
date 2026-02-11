package api

import model.SirqulResponse
import model.TerritoryResponse

/**
  * Provides a default implementation for [[TerritoryApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class TerritoryApiImpl extends TerritoryApi {
  /**
    * @inheritdoc
    */
  override def createTerritory(accountId: Long, name: String, active: Option[Boolean]): TerritoryResponse = {
    // TODO: Implement better logic

    TerritoryResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteTerritory(accountId: Long, territoryId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getTerritory(territoryId: Long): TerritoryResponse = {
    // TODO: Implement better logic

    TerritoryResponse(None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchTerritories(sortField: String, descending: Boolean, keyword: Option[String], start: Option[Int], limit: Option[Int]): List[TerritoryResponse] = {
    // TODO: Implement better logic

    List.empty[TerritoryResponse]
  }

  /**
    * @inheritdoc
    */
  override def updateTerritory(accountId: Long, territoryId: Long, name: Option[String], active: Option[Boolean]): TerritoryResponse = {
    // TODO: Implement better logic

    TerritoryResponse(None, None)
  }
}
