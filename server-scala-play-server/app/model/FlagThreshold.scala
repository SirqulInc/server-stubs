package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for FlagThreshold.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class FlagThreshold(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  threshold: Option[Long],
  flagableObjectType: Option[String],
  application: Option[Application]
)

object FlagThreshold {
  implicit lazy val flagThresholdJsonFormat: Format[FlagThreshold] = Json.format[FlagThreshold]
}

