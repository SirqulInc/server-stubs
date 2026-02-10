package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConnectionGroup.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ConnectionGroup(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  owner: Option[Account],
  name: Option[String],
  description: Option[String],
  connections: Option[List[Connection]],
  permissions: Option[GroupPermissions],
  image: Option[Asset],
  subGroups: Option[List[ConnectionGroup]]
)

object ConnectionGroup {
  implicit lazy val connectionGroupJsonFormat: Format[ConnectionGroup] = Json.format[ConnectionGroup]
}

