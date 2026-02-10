package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ApplicationConfigResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ApplicationConfigResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  configId: Option[Long],
  created: Option[Long],
  updated: Option[Long],
  configVersion: Option[String],
  configJson: Option[String],
  configJsonURL: Option[String],
  assetId: Option[Long],
  returning: Option[String]
)

object ApplicationConfigResponse {
  implicit lazy val applicationConfigResponseJsonFormat: Format[ApplicationConfigResponse] = Json.format[ApplicationConfigResponse]
}

