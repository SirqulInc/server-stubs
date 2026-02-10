package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MessageListResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class MessageListResponse(
  start: Option[Int],
  limit: Option[Int],
  countTotal: Option[Long],
  items: Option[List[MessageResponse]],
  count: Option[Int],
  hasMoreResults: Option[Boolean]
)

object MessageListResponse {
  implicit lazy val messageListResponseJsonFormat: Format[MessageListResponse] = Json.format[MessageListResponse]
}

