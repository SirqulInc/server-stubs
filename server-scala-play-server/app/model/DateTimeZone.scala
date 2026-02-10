package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DateTimeZone.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class DateTimeZone(
  id: Option[String],
  fixed: Option[Boolean]
)

object DateTimeZone {
  implicit lazy val dateTimeZoneJsonFormat: Format[DateTimeZone] = Json.format[DateTimeZone]
}

