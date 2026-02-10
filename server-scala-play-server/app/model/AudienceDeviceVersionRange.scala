package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AudienceDeviceVersionRange.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class AudienceDeviceVersionRange(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  device: Option[AudienceDevice],
  minimum: Option[Long],
  maximum: Option[Long]
)

object AudienceDeviceVersionRange {
  implicit lazy val audienceDeviceVersionRangeJsonFormat: Format[AudienceDeviceVersionRange] = Json.format[AudienceDeviceVersionRange]
}

