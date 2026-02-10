package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConnectedFriend.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ConnectedFriend(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  display: Option[String],
  avatar: Option[Asset],
  avatarURL: Option[String],
  platform: Option[String],
  platformId: Option[String],
  invited: Option[Boolean],
  locationDescription: Option[String]
)

object ConnectedFriend {
  implicit lazy val connectedFriendJsonFormat: Format[ConnectedFriend] = Json.format[ConnectedFriend]
}

