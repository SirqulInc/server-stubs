package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AudienceLocation.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class AudienceLocation(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  latitude: Option[Double],
  longitude: Option[Double],
  locationDescription: Option[String],
  radius: Option[Double]
)

object AudienceLocation {
  implicit lazy val audienceLocationJsonFormat: Format[AudienceLocation] = Json.format[AudienceLocation]
}

