package api

import play.api.libs.json._
import model.BigDecimal
import model.QuestionResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait QuestionApi {
  /**
    * Create Question
    * Create a question and related answers by the given params.
    * @param accountId the id of the logged in user
    * @param question the text of the question
    * @param answers &#x60;&#x60;&#x60;json [   {     \&quot;text\&quot;: \&quot;1942\&quot;,     \&quot;image\&quot;: 123,     \&quot;videoURL\&quot;: \&quot;http://www.here.com\&quot;,     \&quot;correct\&quot;: true   },   {     \&quot;text\&quot;: \&quot;1943\&quot;,     \&quot;image\&quot;: 124,     \&quot;videoURL\&quot;: \&quot;http://www.there.com\&quot;,     \&quot;correct\&quot;: false   } ] &#x60;&#x60;&#x60; 
    * @param active If true set the question to active. Default to false.
    * @param allocateTickets If true then scoring will give tickets. Default to false.
    * @param ticketCount The number of tickets to reward
    * @param tags The tags of the question for search.
    * @param videoURL The video link for the question.
    * @param assetId The asset id of the question.
    * @param ticketType The type of ticket to reward, null means default type
    * @param points The number of points to award for completing a mission
    */
  def createQuestion(version: BigDecimal, accountId: Long, question: String, answers: String, active: Boolean, allocateTickets: Boolean, ticketCount: Long, tags: Option[String], videoURL: Option[String], assetId: Option[Long], ticketType: Option[String], points: Option[Long]): QuestionResponse

  /**
    * Delete Question
    * Delete a question by the given questionId. The accountId given needs to be the owner or executive to delete.
    * @param questionId the id of the question to delete
    * @param accountId the id of the account that can execute this request
    */
  def deleteQuestion(version: BigDecimal, questionId: Long, accountId: Long): SirqulResponse

  /**
    * Get Question
    * Get a question by the given id.
    * @param questionId the id of the question to get
    * @param accountId the id of the account that can make this request
    */
  def getQuestion(version: BigDecimal, questionId: Long, accountId: Long): QuestionResponse

  /**
    * Search Questions
    * Search for questions by the given params.
    * @param accountId The logged in user.
    * @param sortField The column to sort the search on
    * @param descending The order to return the search results
    * @param activeOnly Return only active results if set to true.
    * @param start The record to begin the return set on.
    * @param limit The number of records to return.
    * @param keyword The keyword for searching questions with matching tags or question text.
    */
  def searchQuestions(version: BigDecimal, accountId: Long, sortField: String, descending: Boolean, activeOnly: Boolean, start: Int, limit: Int, keyword: Option[String]): List[QuestionResponse]

  /**
    * Update Question
    * Update a question and related answers.
    * @param questionId The id of the question to update.
    * @param accountId The logged in user.
    * @param ticketCount The number of tickets to reward
    * @param question The text of the question.
    * @param answers The json representations of answers for the question.
    * @param tags The tags of the question for search.
    * @param videoURL The video link for the question.
    * @param assetId The asset id of the question.
    * @param active If true set the question to active.
    * @param allocateTickets If true then scoring will give tickets.
    * @param ticketType The type of ticket to reward, null means default type
    * @param points The number of points to award for completing a mission
    */
  def updateQuestion(version: BigDecimal, questionId: Long, accountId: Long, ticketCount: Long, question: Option[String], answers: Option[String], tags: Option[String], videoURL: Option[String], assetId: Option[Long], active: Option[Boolean], allocateTickets: Option[Boolean], ticketType: Option[String], points: Option[Long]): QuestionResponse
}
