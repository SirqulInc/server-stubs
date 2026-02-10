package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OrsonAiEmotionsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class OrsonAiEmotionsResponse(
  requestId: Option[String],
  responseCode: Option[Int],
  responseRaw: Option[String],
  status: Option[String],
  error: Option[String],
  audioEmotions: Option[List[String]],
  visualEmotions: Option[List[OrsonAiVisualEmotionResponse]]
)

object OrsonAiEmotionsResponse {
  implicit lazy val orsonAiEmotionsResponseJsonFormat: Format[OrsonAiEmotionsResponse] = Json.format[OrsonAiEmotionsResponse]
}

