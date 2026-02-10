package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OrsonAiTopicResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class OrsonAiTopicResponse(
  word: Option[String],
  score: Option[Double]
)

object OrsonAiTopicResponse {
  implicit lazy val orsonAiTopicResponseJsonFormat: Format[OrsonAiTopicResponse] = Json.format[OrsonAiTopicResponse]
}

