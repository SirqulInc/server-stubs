package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Building.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Building(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  name: Option[String],
  buildingType: Option[String]
)

object Building {
  implicit lazy val buildingJsonFormat: Format[Building] = Json.format[Building]
}

