package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UserPermissions.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class UserPermissions(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  permissionableType: Option[String],
  permissionableId: Option[Long],
  connectionGroup: Option[ConnectionGroup],
  friendGroup: Option[Boolean],
  connection: Option[Connection],
  permissions: Option[Permissions],
  exclude: Option[Boolean],
  blocked: Option[Boolean],
  owner: Option[Account]
)

object UserPermissions {
  implicit lazy val userPermissionsJsonFormat: Format[UserPermissions] = Json.format[UserPermissions]
}

