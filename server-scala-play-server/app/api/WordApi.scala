package api

import play.api.libs.json._
import model.BigDecimal
import model.SirqulResponse
import model.WordzWordResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait WordApi {
  /**
    * Create Word
    * Create a word by the given params.
    * @param accountId The logged in user.
    * @param word The text of the word.
    * @param definition The definition of the word.
    * @param active If true set the word to active. Default to false.
    * @param allocateTickets If true then scoring will give tickets. Default to false.
    * @param ticketCount The number of tickets to reward
    * @param assetId The asset id of the word.
    * @param ticketType The type of ticket to reward, null means default type
    * @param points The number of points to award for completing a mission
    */
  def createWord(version: BigDecimal, accountId: Long, word: String, definition: String, active: Boolean, allocateTickets: Boolean, ticketCount: Long, assetId: Option[Long], ticketType: Option[String], points: Option[Long]): WordzWordResponse

  /**
    * Delete Word
    * Delete a word by the given id. The accountId given needs to be the owner or executive to delete.
    * @param wordId The id of the word to delete.
    * @param accountId The account vor validating permission
    */
  def deleteWord(version: BigDecimal, wordId: Long, accountId: Long): SirqulResponse

  /**
    * Get Word
    * Get a word by the given id.
    * @param wordId The id of the word to get.
    * @param accountId The logged in user.
    */
  def getWord(version: BigDecimal, wordId: Long, accountId: Long): WordzWordResponse

  /**
    * Search Words
    * Search for words by the given params.
    * @param accountId The logged in user.
    * @param sortField The column to sort the search on
    * @param descending The order to return the search results
    * @param activeOnly Return only active results if set to true.
    * @param start The record to begin the return set on.
    * @param limit The number of records to return.
    * @param keyword The keyword for searching words with matching definition or word text.
    */
  def getWords(version: BigDecimal, accountId: Long, sortField: String, descending: Boolean, activeOnly: Boolean, start: Int, limit: Int, keyword: Option[String]): List[WordzWordResponse]

  /**
    * Update Word
    * Update a word by the given params.
    * @param wordId The id of the word to update.
    * @param accountId The logged in user.
    * @param ticketCount The number of tickets to reward
    * @param wordText The text for the word
    * @param definition The definition of the word.
    * @param assetId The asset id of the word.
    * @param active If true set the word to active.
    * @param allocateTickets If true then scoring will give tickets.
    * @param ticketType The type of ticket to reward, null means default type
    * @param points The number of points to award for completing a mission
    */
  def updateWord(version: BigDecimal, wordId: Long, accountId: Long, ticketCount: Long, wordText: Option[String], definition: Option[String], assetId: Option[Long], active: Option[Boolean], allocateTickets: Option[Boolean], ticketType: Option[String], points: Option[Long]): WordzWordResponse
}
