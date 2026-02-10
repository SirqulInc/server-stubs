package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for NotificationMessageResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class NotificationMessageResponse(
  sender: Option[AccountShortResponse],
  event: Option[String],
  notificationMessage: Option[String],
  created: Option[Long],
  hasRead: Option[Boolean],
  contentId: Option[Long],
  contentType: Option[String],
  contentName: Option[String],
  parentId: Option[Long],
  parentType: Option[String],
  actionCategory: Option[String],
  thumbnailURL: Option[String],
  coverURL: Option[String]
)

object NotificationMessageResponse {
  implicit lazy val notificationMessageResponseJsonFormat: Format[NotificationMessageResponse] = Json.format[NotificationMessageResponse]
}

