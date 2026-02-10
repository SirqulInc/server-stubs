package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DateTimeFieldType.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class DateTimeFieldType(
  name: Option[String],
  rangeDurationType: Option[DurationFieldType],
  durationType: Option[DurationFieldType]
)

object DateTimeFieldType {
  implicit lazy val dateTimeFieldTypeJsonFormat: Format[DateTimeFieldType] = Json.format[DateTimeFieldType]
}

