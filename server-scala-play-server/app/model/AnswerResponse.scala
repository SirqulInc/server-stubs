package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AnswerResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class AnswerResponse(
  answerId: Option[Long],
  answer: Option[String],
  correct: Option[Boolean],
  image: Option[AssetShortResponse],
  videoURL: Option[String]
)

object AnswerResponse {
  implicit lazy val answerResponseJsonFormat: Format[AnswerResponse] = Json.format[AnswerResponse]
}

