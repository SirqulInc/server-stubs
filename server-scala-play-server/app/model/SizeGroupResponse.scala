package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SizeGroupResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class SizeGroupResponse(
  id: Option[Long],
  name: Option[String],
  description: Option[String]
)

object SizeGroupResponse {
  implicit lazy val sizeGroupResponseJsonFormat: Format[SizeGroupResponse] = Json.format[SizeGroupResponse]
}

