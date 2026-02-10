package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConnectionResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ConnectionResponse(
  connectionId: Option[Long],
  connectionAccountId: Option[String],
  connectionPendingId: Option[String],
  display: Option[String],
  locationDisplay: Option[String],
  connectionViewedDate: Option[Long],
  profileImage: Option[String],
  title: Option[String],
  connectionAccountType: Option[String],
  trusted: Option[Boolean],
  following: Option[Boolean],
  friendRequested: Option[Boolean],
  friendRequestPending: Option[Boolean],
  blocked: Option[Boolean],
  friend: Option[Boolean]
)

object ConnectionResponse {
  implicit lazy val connectionResponseJsonFormat: Format[ConnectionResponse] = Json.format[ConnectionResponse]
}

