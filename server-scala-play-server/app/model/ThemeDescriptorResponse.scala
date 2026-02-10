package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ThemeDescriptorResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ThemeDescriptorResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  themeDescriptorId: Option[Long],
  returning: Option[String]
)

object ThemeDescriptorResponse {
  implicit lazy val themeDescriptorResponseJsonFormat: Format[ThemeDescriptorResponse] = Json.format[ThemeDescriptorResponse]
}

