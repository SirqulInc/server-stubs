package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OrsonAiSTTResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class OrsonAiSTTResponse(
  requestId: Option[String],
  responseCode: Option[Int],
  responseRaw: Option[String],
  text: Option[String]
)

object OrsonAiSTTResponse {
  implicit lazy val orsonAiSTTResponseJsonFormat: Format[OrsonAiSTTResponse] = Json.format[OrsonAiSTTResponse]
}

