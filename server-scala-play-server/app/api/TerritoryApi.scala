package api

import play.api.libs.json._
import model.BigDecimal
import model.SirqulResponse
import model.TerritoryResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait TerritoryApi {
  /**
    * Create Territory
    * Creates a territory.
    * @param accountId The logged in user.
    * @param name The name of the territory
    * @param active If true set the game level as active. Default is true.
    */
  def createTerritory(version: BigDecimal, accountId: Long, name: String, active: Option[Boolean]): TerritoryResponse

  /**
    * Delete Territory
    * Deletes a territory.
    * @param accountId the id of the logged in user
    * @param territoryId the id of the territory to delete
    */
  def deleteTerritory(version: BigDecimal, accountId: Long, territoryId: Long): SirqulResponse

  /**
    * Get Territory
    * Get a territory.
    * @param territoryId the id of the territory to get
    */
  def getTerritory(version: BigDecimal, territoryId: Long): TerritoryResponse

  /**
    * Search Territories
    * Searches on territories.
    * @param sortField the field to sort by. Supported values include: ID, CREATED, UPDATED, NAME
    * @param descending determines whether the sorted list is in descending or ascending order
    * @param keyword Return results that match this keyword.
    * @param start The start index for pagination
    * @param limit The limit for pagination
    */
  def searchTerritories(version: BigDecimal, sortField: String, descending: Boolean, keyword: Option[String], start: Option[Int], limit: Option[Int]): List[TerritoryResponse]

  /**
    * Update Territory
    * Updates a territory.
    * @param accountId The logged in user.
    * @param territoryId the id of the territory to update
    * @param name The name of the territory
    * @param active If true set the game level as active.
    */
  def updateTerritory(version: BigDecimal, accountId: Long, territoryId: Long, name: Option[String], active: Option[Boolean]): TerritoryResponse
}
