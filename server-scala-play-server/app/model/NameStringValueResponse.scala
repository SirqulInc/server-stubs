package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for NameStringValueResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class NameStringValueResponse(
  name: Option[String],
  valueString: Option[String]
)

object NameStringValueResponse {
  implicit lazy val nameStringValueResponseJsonFormat: Format[NameStringValueResponse] = Json.format[NameStringValueResponse]
}

