package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ReportTypeResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ReportTypeResponse(
  `type`: Option[String],
  javaType: Option[String],
  label: Option[String],
  number: Option[Boolean],
  majorAxis: Option[Boolean]
)

object ReportTypeResponse {
  implicit lazy val reportTypeResponseJsonFormat: Format[ReportTypeResponse] = Json.format[ReportTypeResponse]
}

