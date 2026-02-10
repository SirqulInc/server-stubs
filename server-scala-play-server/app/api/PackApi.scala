package api

import play.api.libs.json._
import model.BigDecimal
import model.PackResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait PackApi {
  /**
    * Create Pack
    * Create a pack.
    * @param accountId The logged in user.
    * @param title The title of the pack
    * @param packOrder The order of the pack
    * @param price The price in tickets to purchase this pack
    * @param highest The scoring is highest is best
    * @param allocateTickets Flag to indicate owner should receive tickets for completed packs
    * @param ticketCount The number of tickets to reward
    * @param description The description of the pack
    * @param searchTags The tags for searching the pack, comma separated
    * @param active Activate/deactivate the pack
    * @param gameType This parameter is deprecated.
    * @param appKey The application key used to identify the application
    * @param packType The type of the pack
    * @param sequenceType The type of game sequence of the pack
    * @param backgroundId The background asset id of the pack
    * @param imageId The image asset id of the pack
    * @param startDate The date/time to start the pack, send 0 to unset
    * @param endDate The date/time to end the pack, send 0 to unset
    * @param authorOverride 
    * @param priceType the type of ticket required to purchase this pack
    * @param gameLevelIds the game level ids to include in the pack, comma separated
    * @param inGame 
    * @param ticketType The type of ticket to reward, null means default type
    * @param points The number of points to award for completing a pack
    */
  def createPack(version: BigDecimal, accountId: Long, title: String, packOrder: Long, price: Int, highest: Boolean, allocateTickets: Boolean, ticketCount: Long, description: Option[String], searchTags: Option[String], active: Option[Boolean], gameType: Option[String], appKey: Option[String], packType: Option[String], sequenceType: Option[String], backgroundId: Option[Long], imageId: Option[Long], startDate: Option[Long], endDate: Option[Long], authorOverride: Option[String], priceType: Option[String], gameLevelIds: Option[String], inGame: Option[Boolean], ticketType: Option[String], points: Option[Long]): PackResponse

  /**
    * Delete Pack
    * Delete a pack.
    * @param accountId the id of the logged in user
    * @param packId the id of the pack to delete
    */
  def deletePack(version: BigDecimal, accountId: Long, packId: Long): SirqulResponse

  /**
    * Get Pack
    * Get a pack.
    * @param accountId The logged in user.
    * @param packId The id of the pack to return.
    * @param includeGameData If true include the game level data, otherwise don&#39;t. default is false.
    */
  def getPack(version: BigDecimal, accountId: Long, packId: Long, includeGameData: Boolean): PackResponse

  /**
    * Search Packs
    * Search on packs.
    * @param accountId The logged in user.
    * @param sortField The field to sort by. Possible values include: TITLE, DESCRIPTION, CREATED, UPDATED
    * @param descending Determines whether the sorted list is in descending or ascending order
    * @param keyword Keyword search on the pack name
    * @param packType Filters results on pack type
    * @param start Start the result set at some index.
    * @param limit Limit the result to some number.
    * @param includeGameData Determines whether to include game data in the results
    * @param includeInactive Determines whether to include inactive results
    * @param appKey The application to filter results on
    */
  def searchPacks(version: BigDecimal, accountId: Long, sortField: String, descending: Boolean, keyword: Option[String], packType: Option[String], start: Option[Int], limit: Option[Int], includeGameData: Option[Boolean], includeInactive: Option[Boolean], appKey: Option[String]): List[PackResponse]

  /**
    * Update Pack
    * Update a pack.
    * @param accountId The logged in user.
    * @param packId The id of the pack to update.
    * @param allocateTickets Flag to indicate owner should receive tickets for completed packs
    * @param ticketCount The number of tickets to reward
    * @param title The title of the pack
    * @param description The description of the pack
    * @param searchTags The tags for searching the pack, comma separated
    * @param active Activate/deactivate the pack
    * @param gameType This parameter is deprecated.
    * @param appKey The application key used to identify the application
    * @param packType The type of the pack
    * @param packOrder The order of the pack
    * @param sequenceType The type of game sequence of the pack
    * @param backgroundId The background asset id of the pack
    * @param imageId The image asset id of the pack
    * @param startDate The date/time to start the pack, send 0 to unset
    * @param endDate The date/time to end the pack, send 0 to unset
    * @param authorOverride 
    * @param price The price in tickets to purchase this pack
    * @param priceType the type of ticket required to purchase this pack
    * @param gameLevelIds the game level ids to include in the pack, comma separated
    * @param inGame 
    * @param highest The scoring is highest is best
    * @param ticketType The type of ticket to reward, null means default type
    * @param points The number of points to award for completing a pack
    */
  def updatePack(version: BigDecimal, accountId: Long, packId: Long, allocateTickets: Boolean, ticketCount: Long, title: Option[String], description: Option[String], searchTags: Option[String], active: Option[Boolean], gameType: Option[String], appKey: Option[String], packType: Option[String], packOrder: Option[Long], sequenceType: Option[String], backgroundId: Option[Long], imageId: Option[Long], startDate: Option[Long], endDate: Option[Long], authorOverride: Option[String], price: Option[Int], priceType: Option[String], gameLevelIds: Option[String], inGame: Option[Boolean], highest: Option[Boolean], ticketType: Option[String], points: Option[Long]): PackResponse
}
