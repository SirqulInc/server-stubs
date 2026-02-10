package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GroupPermissions.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class GroupPermissions(
  canViewProfileInfo: Option[Boolean],
  canViewGameInfo: Option[Boolean],
  canViewFriendInfo: Option[Boolean]
)

object GroupPermissions {
  implicit lazy val groupPermissionsJsonFormat: Format[GroupPermissions] = Json.format[GroupPermissions]
}

