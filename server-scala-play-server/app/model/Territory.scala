package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Territory.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Territory(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  name: Option[String]
)

object Territory {
  implicit lazy val territoryJsonFormat: Format[Territory] = Json.format[Territory]
}

