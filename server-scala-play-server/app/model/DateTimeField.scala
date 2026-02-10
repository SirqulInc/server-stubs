package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DateTimeField.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class DateTimeField(
  name: Option[String],
  `type`: Option[DateTimeFieldType],
  supported: Option[Boolean],
  minimumValue: Option[Int],
  maximumValue: Option[Int],
  durationField: Option[DurationField],
  leapDurationField: Option[DurationField],
  rangeDurationField: Option[DurationField],
  lenient: Option[Boolean]
)

object DateTimeField {
  implicit lazy val dateTimeFieldJsonFormat: Format[DateTimeField] = Json.format[DateTimeField]
}

