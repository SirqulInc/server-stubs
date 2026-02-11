package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OrsonAiTopicsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class OrsonAiTopicsResponse(
  requestId: Option[String],
  responseCode: Option[Int],
  responseRaw: Option[String],
  topics: Option[List[OrsonAiTopicResponse]]
)

object OrsonAiTopicsResponse {
  implicit lazy val orsonAiTopicsResponseJsonFormat: Format[OrsonAiTopicsResponse] = Json.format[OrsonAiTopicsResponse]
}

