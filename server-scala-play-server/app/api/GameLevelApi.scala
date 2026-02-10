package api

import play.api.libs.json._
import model.BigDecimal
import model.GameLevelListResponse
import model.GameLevelResponse
import model.QuestionResponse
import model.SirqulResponse
import model.WordzWordResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait GameLevelApi {
  /**
    * Create Game Level
    * Create a game level. Currently does NOT support game objects.
    * @param accountId The logged in user.
    * @param name The name of the level.
    * @param gameData The game level data: xml, json, or other text based format.
    * @param gameDataSuffix The game level data format type.
    * @param appKey The game application key to save the level for.
    * @param description The description of the level.
    * @param difficulty The difficulty, possible values are: VERY_EASY, EASY, MEDIUM, HARD, VERY_HARD.
    * @param appVersion The version number of the application required to correctly load/play the level.
    * @param assetImageId The asset Id of the level image.
    * @param assetIconId The asset Id of the level icon.
    * @param visibility Is the level visible to others, possible values are: PUBLIC, PRIVATE.
    * @param friendGroup Make the level be readable by all friends.
    * @param connectionIds Make the level be readable by connections in this list.
    * @param connectionGroupIds Make the level be readable by connection groups in this list.
    * @param balance Set the amount of money available to spend, once 0 deactivate level. Set to a negative value for unlimited.
    * @param active If true set the game level as active. Default is false.
    * @param allocateTickets If true then scoring will give tickets. Default is false.
    * @param ticketCount The number of tickets to reward
    * @param ticketType The type of ticket to reward, null means default type
    * @param points The number of points to award for completing a level
    * @param tutorialTitle Title of the tutorial.
    * @param tutorialMessage Message of the tutotrial.
    * @param tutorialAlignment Alignment of the tutorial image. Default to NONE. Possible values are: NONE, IMAGE_ABOVE, IMAGE_BELOW, IMAGE_LEFT, IMAGE_RIGHT, IMAGE_ONLY, TEXT_ONLY
    * @param tutorialImageAssetId Asset id of the tutorial image.
    * @param offerId id of the offer
    * @param metaData external custom client defined data
    */
  def createGameLevel(version: BigDecimal, accountId: Long, name: String, gameData: String, gameDataSuffix: String, appKey: Option[String], description: Option[String], difficulty: Option[String], appVersion: Option[String], assetImageId: Option[Long], assetIconId: Option[Long], visibility: Option[String], friendGroup: Option[Boolean], connectionIds: Option[String], connectionGroupIds: Option[String], balance: Option[Double], active: Option[Boolean], allocateTickets: Option[Boolean], ticketCount: Option[Long], ticketType: Option[String], points: Option[Long], tutorialTitle: Option[String], tutorialMessage: Option[String], tutorialAlignment: Option[String], tutorialImageAssetId: Option[Long], offerId: Option[Long], metaData: Option[String]): GameLevelResponse

  /**
    * Delete Game Level
    * Delete a game level. The level and account must be valid and have the appropirate permissions to view the content.
    * @param accountId The logged in user.
    * @param levelId The id of the level to return.
    */
  def deleteGameLevel(version: BigDecimal, accountId: Long, levelId: Long): SirqulResponse

  /**
    * Get Game Level
    * Get a game level. The level and account must be valid and have the appropirate permissions to view the content.
    * @param accountId The logged in user.
    * @param levelId The id of the level to return.
    * @param includeGameData If true include the game level data, otherwise don&#39;t. default is false.
    */
  def getGameLevel(version: BigDecimal, accountId: Long, levelId: Long, includeGameData: Option[Boolean]): GameLevelResponse

  /**
    * Search Game Levels
    * Get a list of levels for an application, just those the account has permissions to view.
    * @param accountId The logged in user.
    * @param appKey the application key
    * @param keyword Match the keyword to the owner name or level name.
    * @param sortField what field to sort on
    * @param descending whether to return levels in ascending or descending order
    * @param start Start the result set at some index.
    * @param limit Limit the result to some number.
    * @param appVersion The maximum version of the level to return.
    * @param includeGameData If true include the game level data, otherwise don&#39;t. default is false.
    * @param filters 
    */
  def getGameLevelsByApplication(version: BigDecimal, accountId: Long, appKey: String, keyword: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], appVersion: Option[String], includeGameData: Option[Boolean], filters: Option[String]): GameLevelListResponse

  /**
    * Search Game Level by Billable Entity
    * Searches on game levels that the logged in user has access to. A user would have access if the creator of the game level is managed under the same BillableEntity.
    * @param accountId The account id of the user
    * @param appKey the application key
    * @param keyword The keyword used to search
    * @param sortField The column to sort the search on
    * @param descending The order to return the search results
    * @param activeOnly Return only active results
    * @param start The record to begin the return set on
    * @param limit The number of records to return
    */
  def getGameLevelsByBillableEntity(version: BigDecimal, accountId: Long, appKey: Option[String], keyword: Option[String], sortField: Option[String], descending: Option[Boolean], activeOnly: Option[Boolean], start: Option[Long], limit: Option[Long]): GameLevelResponse

  /**
    * Get Level Questions
    * Get questions within a level.
    * @param levelId the id of the level to get questions from
    * @param accountId the id of the logged in user
    */
  def getQuestionsInLevel(version: BigDecimal, levelId: Long, accountId: Long): QuestionResponse

  /**
    * Get Level Words
    * Get words within a level.
    * @param levelId the id of the level to get words for
    * @param accountId the id of the logged in user
    */
  def getWordsInLevel(version: BigDecimal, levelId: Long, accountId: Long): WordzWordResponse

  /**
    * Update Game Level
    * Update a game level. Currently does NOT support game objects.
    * @param accountId The logged in user.
    * @param levelId If update then include the level Id.
    * @param appKey The game application key to save the level for.
    * @param name The name of the level.
    * @param description The description of the level.
    * @param difficulty The difficulty, possible values are: VERY_EASY, EASY, MEDIUM, HARD, VERY_HARD.
    * @param appVersion The version number of the applicatuion required to correctly load/play the level.
    * @param assetImageId The asset Id of the level image.
    * @param assetIconId The asset Id of the level icon.
    * @param gameData The game level data: xml, json, or other texted based format.
    * @param gameDataSuffix The game level data format type.
    * @param visibility Is the level visible to others, possible values are: PUBLIC, PRIVATE.
    * @param friendGroup Make the level be readable by all friends.
    * @param connectionIds Make the level be readable by connections in this list.
    * @param connectionGroupIds Make the level be readable by connection groups in this list.
    * @param balance Set the amount of money available to spend, once 0 deactivate level. Set to a negative value for unlimited.
    * @param active If true set the game level as active.
    * @param allocateTickets If true then scoring will give tickets.
    * @param ticketCount The number of tickets to reward
    * @param ticketType The type of ticket to reward, null means default type
    * @param points The number of points to award for completing a level
    * @param tutorialTitle Title of the tutorial.
    * @param tutorialMessage Message of the tutorial.
    * @param tutorialAlignment Alignment of the tutorial image, possible values are: NONE, IMAGE_ABOVE, IMAGE_BELOW, IMAGE_LEFT, IMAGE_RIGHT, IMAGE_ONLY, TEXT_ONLY
    * @param tutorialImageAssetId Asset id of the tutorial image.
    * @param offerId 
    * @param metaData external custom client defined data
    */
  def updateGameLevel(version: BigDecimal, accountId: Long, levelId: Long, appKey: Option[String], name: Option[String], description: Option[String], difficulty: Option[String], appVersion: Option[String], assetImageId: Option[Long], assetIconId: Option[Long], gameData: Option[String], gameDataSuffix: Option[String], visibility: Option[String], friendGroup: Option[Boolean], connectionIds: Option[String], connectionGroupIds: Option[String], balance: Option[Double], active: Option[Boolean], allocateTickets: Option[Boolean], ticketCount: Option[Long], ticketType: Option[String], points: Option[Long], tutorialTitle: Option[String], tutorialMessage: Option[String], tutorialAlignment: Option[String], tutorialImageAssetId: Option[Long], offerId: Option[Long], metaData: Option[String]): GameLevelResponse

  /**
    * Update Level Questions
    * Updates a level with question game objects.
    * @param levelId the id of the level to update questions on
    * @param accountId the id of the logged in user
    * @param questionIds the IDs of the questions to update
    */
  def updateQuestionsInLevel(version: BigDecimal, levelId: Long, accountId: Long, questionIds: String): SirqulResponse

  /**
    * Update Level Words
    * Updates a level with word game objects.
    * @param levelId the id of the level to update words for
    * @param accountId the id of the logged in user
    * @param wordIds the ids of the words to update for the level
    */
  def updateWordsInLevel(version: BigDecimal, levelId: Long, accountId: Long, wordIds: String): SirqulResponse
}
