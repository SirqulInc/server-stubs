package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OrsonAiVisualEmotionResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class OrsonAiVisualEmotionResponse(
  requestId: Option[String],
  responseCode: Option[Int],
  responseRaw: Option[String],
  userIndex: Option[Long],
  emotion: Option[String],
  probability: Option[Double]
)

object OrsonAiVisualEmotionResponse {
  implicit lazy val orsonAiVisualEmotionResponseJsonFormat: Format[OrsonAiVisualEmotionResponse] = Json.format[OrsonAiVisualEmotionResponse]
}

