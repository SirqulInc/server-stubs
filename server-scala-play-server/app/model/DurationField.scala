package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DurationField.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class DurationField(
  name: Option[String],
  `type`: Option[DurationFieldType],
  supported: Option[Boolean],
  precise: Option[Boolean],
  unitMillis: Option[Long]
)

object DurationField {
  implicit lazy val durationFieldJsonFormat: Format[DurationField] = Json.format[DurationField]
}

