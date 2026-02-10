package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AudienceDeviceResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class AudienceDeviceResponse(
  deviceId: Option[Long],
  active: Option[Boolean],
  name: Option[String],
  display: Option[String],
  minimum: Option[Long],
  maximum: Option[Long]
)

object AudienceDeviceResponse {
  implicit lazy val audienceDeviceResponseJsonFormat: Format[AudienceDeviceResponse] = Json.format[AudienceDeviceResponse]
}

