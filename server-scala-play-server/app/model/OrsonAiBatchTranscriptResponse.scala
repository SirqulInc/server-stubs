package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OrsonAiBatchTranscriptResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class OrsonAiBatchTranscriptResponse(
  requestId: Option[String],
  responseCode: Option[Int],
  responseRaw: Option[String],
  status: Option[String],
  error: Option[String],
  result: Option[String]
)

object OrsonAiBatchTranscriptResponse {
  implicit lazy val orsonAiBatchTranscriptResponseJsonFormat: Format[OrsonAiBatchTranscriptResponse] = Json.format[OrsonAiBatchTranscriptResponse]
}

