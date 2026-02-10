package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BlockedNotificationResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class BlockedNotificationResponse(
  blockedNotificationId: Option[Long],
  created: Option[Long],
  event: Option[String],
  conduit: Option[String],
  customType: Option[String],
  contentType: Option[String],
  contentId: Option[Long],
  searchTags: Option[String],
  blocked: Option[Boolean],
  deleted: Option[Boolean]
)

object BlockedNotificationResponse {
  implicit lazy val blockedNotificationResponseJsonFormat: Format[BlockedNotificationResponse] = Json.format[BlockedNotificationResponse]
}

