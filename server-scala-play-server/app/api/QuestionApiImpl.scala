package api

import model.BigDecimal
import model.QuestionResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[QuestionApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class QuestionApiImpl extends QuestionApi {
  /**
    * @inheritdoc
    */
  override def createQuestion(version: BigDecimal, accountId: Long, question: String, answers: String, active: Boolean, allocateTickets: Boolean, ticketCount: Long, tags: Option[String], videoURL: Option[String], assetId: Option[Long], ticketType: Option[String], points: Option[Long]): QuestionResponse = {
    // TODO: Implement better logic

    QuestionResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteQuestion(version: BigDecimal, questionId: Long, accountId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getQuestion(version: BigDecimal, questionId: Long, accountId: Long): QuestionResponse = {
    // TODO: Implement better logic

    QuestionResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchQuestions(version: BigDecimal, accountId: Long, sortField: String, descending: Boolean, activeOnly: Boolean, start: Int, limit: Int, keyword: Option[String]): List[QuestionResponse] = {
    // TODO: Implement better logic

    List.empty[QuestionResponse]
  }

  /**
    * @inheritdoc
    */
  override def updateQuestion(version: BigDecimal, questionId: Long, accountId: Long, ticketCount: Long, question: Option[String], answers: Option[String], tags: Option[String], videoURL: Option[String], assetId: Option[Long], active: Option[Boolean], allocateTickets: Option[Boolean], ticketType: Option[String], points: Option[Long]): QuestionResponse = {
    // TODO: Implement better logic

    QuestionResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
