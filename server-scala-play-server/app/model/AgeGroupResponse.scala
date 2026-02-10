package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AgeGroupResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class AgeGroupResponse(
  key: Option[String],
  toString: Option[String]
)

object AgeGroupResponse {
  implicit lazy val ageGroupResponseJsonFormat: Format[AgeGroupResponse] = Json.format[AgeGroupResponse]
}

