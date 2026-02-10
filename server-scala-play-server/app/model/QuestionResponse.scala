package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for QuestionResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class QuestionResponse(
  id: Option[Long],
  question: Option[String],
  image: Option[AssetShortResponse],
  videoURL: Option[String],
  active: Option[Boolean],
  answers: Option[List[AnswerResponse]],
  scores: Option[ScoreListResponse],
  tickets: Option[TicketListResponse],
  owner: Option[AccountShortResponse],
  icon: Option[AssetShortResponse],
  authorOverride: Option[String],
  updatedDate: Option[Long],
  startDate: Option[Long],
  endDate: Option[Long],
  createdDate: Option[Long],
  tags: Option[String],
  allocateTickets: Option[Boolean],
  ticketType: Option[String],
  ticketCount: Option[Long],
  points: Option[Long]
)

object QuestionResponse {
  implicit lazy val questionResponseJsonFormat: Format[QuestionResponse] = Json.format[QuestionResponse]
}

