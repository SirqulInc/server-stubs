package api

import model.QuestionResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[QuestionApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class QuestionApiImpl extends QuestionApi {
  /**
    * @inheritdoc
    */
  override def createQuestion(accountId: Long, question: String, answers: String, active: Boolean, allocateTickets: Boolean, ticketCount: Long, tags: Option[String], videoURL: Option[String], assetId: Option[Long], ticketType: Option[String], points: Option[Long]): QuestionResponse = {
    // TODO: Implement better logic

    QuestionResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteQuestion(questionId: Long, accountId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getQuestion(questionId: Long, accountId: Long): QuestionResponse = {
    // TODO: Implement better logic

    QuestionResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchQuestions(accountId: Long, sortField: String, descending: Boolean, activeOnly: Boolean, start: Int, limit: Int, keyword: Option[String]): List[QuestionResponse] = {
    // TODO: Implement better logic

    List.empty[QuestionResponse]
  }

  /**
    * @inheritdoc
    */
  override def updateQuestion(questionId: Long, accountId: Long, ticketCount: Long, question: Option[String], answers: Option[String], tags: Option[String], videoURL: Option[String], assetId: Option[Long], active: Option[Boolean], allocateTickets: Option[Boolean], ticketType: Option[String], points: Option[Long]): QuestionResponse = {
    // TODO: Implement better logic

    QuestionResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
