package api

import play.api.libs.json._
import model.BigDecimal
import model.GameResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait GameApi {
  /**
    * Create a Game
    * Create a Game.
    * @param accountId The logged in user.
    * @param appKey The game application key to save the level for.
    * @param title Title of the game.
    * @param description Description of the game.
    * @param metaData metaData of the Game.
    * @param packIds comma separated String of pack Ids that will associate with the game.
    * @param includeGameData Show more details in response.
    */
  def createGame(version: BigDecimal, accountId: Option[Long], appKey: Option[String], title: Option[String], description: Option[String], metaData: Option[String], packIds: Option[String], includeGameData: Option[Boolean]): GameResponse

  /**
    * Delete a Game
    * Delete a game.
    * @param accountId The logged in user.
    * @param gameId the updating game&#39;s id.
    */
  def deleteGame(version: BigDecimal, accountId: Long, gameId: Long): SirqulResponse

  /**
    * Get a Game by id
    * Get a Game by id.
    * @param accountId The logged in user.
    * @param gameId the updating game&#39;s id.
    * @param includeGameData If true include the game level data, otherwise don&#39;t. default is false.
    */
  def getGame(version: BigDecimal, accountId: Long, gameId: Long, includeGameData: Option[Boolean]): GameResponse

  /**
    * Search a Game
    * Get a list of games for an application, just those the account has permissions to view.
    * @param accountId The logged in user.
    * @param appKey the application key
    * @param start Start the result set at some index.
    * @param limit Limit the result to some number.
    * @param keyword Match the keyword to the owner name or level name.
    * @param appVersion The maximum version of the level to return.
    * @param includeGameData more details in response
    * @param includeInactive more details in response
    */
  def searchGames(version: BigDecimal, accountId: Long, appKey: String, start: Int, limit: Int, keyword: Option[String], appVersion: Option[String], includeGameData: Option[Boolean], includeInactive: Option[Boolean]): GameResponse

  /**
    * Update a Game
    * Update a Game
    * @param accountId The logged in user.
    * @param gameId the updating game&#39;s id
    * @param appKey The game application key to save the level for.
    * @param title Title of the Game.
    * @param description Description of the Game.
    * @param metaData metaData of the Game.
    * @param packIds comma separated String of pack Ids that will associate with the game.
    * @param includeGameData show more details in response.
    */
  def updateGame(version: BigDecimal, accountId: Option[Long], gameId: Option[Long], appKey: Option[String], title: Option[String], description: Option[String], metaData: Option[String], packIds: Option[String], includeGameData: Option[Boolean]): GameResponse
}
