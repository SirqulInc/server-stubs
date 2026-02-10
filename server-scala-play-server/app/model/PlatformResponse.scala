package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PlatformResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class PlatformResponse(
  deviceId: Option[Long],
  active: Option[Boolean],
  name: Option[String],
  display: Option[String],
  minimum: Option[Long],
  maximum: Option[Long],
  downloadUrl: Option[String],
  description: Option[String]
)

object PlatformResponse {
  implicit lazy val platformResponseJsonFormat: Format[PlatformResponse] = Json.format[PlatformResponse]
}

