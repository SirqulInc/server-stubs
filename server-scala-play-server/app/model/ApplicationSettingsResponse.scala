package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ApplicationSettingsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ApplicationSettingsResponse(
  application: Option[ApplicationMiniResponse],
  termsAcceptedDate: Option[Long],
  updated: Option[Long],
  created: Option[Long]
)

object ApplicationSettingsResponse {
  implicit lazy val applicationSettingsResponseJsonFormat: Format[ApplicationSettingsResponse] = Json.format[ApplicationSettingsResponse]
}

