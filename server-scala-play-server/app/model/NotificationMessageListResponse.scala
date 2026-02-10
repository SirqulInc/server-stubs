package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for NotificationMessageListResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class NotificationMessageListResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  items: Option[List[NotificationMessageResponse]],
  count: Option[Int],
  hasMoreResults: Option[Boolean],
  returning: Option[String]
)

object NotificationMessageListResponse {
  implicit lazy val notificationMessageListResponseJsonFormat: Format[NotificationMessageListResponse] = Json.format[NotificationMessageListResponse]
}

