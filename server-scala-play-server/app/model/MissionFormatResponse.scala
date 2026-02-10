package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MissionFormatResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class MissionFormatResponse(
  missionFormatId: Option[Long],
  formatType: Option[String],
  active: Option[Boolean],
  name: Option[String],
  description: Option[String],
  format: Option[String],
  suffix: Option[String]
)

object MissionFormatResponse {
  implicit lazy val missionFormatResponseJsonFormat: Format[MissionFormatResponse] = Json.format[MissionFormatResponse]
}

