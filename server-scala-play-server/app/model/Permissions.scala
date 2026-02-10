package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Permissions.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Permissions(
  read: Option[Boolean],
  write: Option[Boolean],
  delete: Option[Boolean],
  add: Option[Boolean]
)

object Permissions {
  implicit lazy val permissionsJsonFormat: Format[Permissions] = Json.format[Permissions]
}

