package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LocationResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class LocationResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  id: Option[Long],
  getDistanceMiles: Option[String],
  zip: Option[String],
  name: Option[String],
  latitude: Option[String],
  longitude: Option[String],
  getSource: Option[String],
  `type`: Option[String],
  returning: Option[String]
)

object LocationResponse {
  implicit lazy val locationResponseJsonFormat: Format[LocationResponse] = Json.format[LocationResponse]
}

