package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for NotificationRecipientResponseListResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class NotificationRecipientResponseListResponse(
  items: Option[List[JsObject]],
  count: Option[Int],
  startIndexAudiences: Option[Int],
  startIndexGroups: Option[Int],
  total: Option[Long],
  countAudiences: Option[Long],
  countGroups: Option[Long],
  hasMoreResults: Option[Boolean]
)

object NotificationRecipientResponseListResponse {
  implicit lazy val notificationRecipientResponseListResponseJsonFormat: Format[NotificationRecipientResponseListResponse] = Json.format[NotificationRecipientResponseListResponse]
}

