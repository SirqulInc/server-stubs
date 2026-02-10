package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CoordsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class CoordsResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  latitude: Option[Double],
  longitude: Option[Double],
  country: Option[String],
  countryCode: Option[String],
  region: Option[String],
  city: Option[String],
  postalCode: Option[String],
  regionCode: Option[String],
  returning: Option[String]
)

object CoordsResponse {
  implicit lazy val coordsResponseJsonFormat: Format[CoordsResponse] = Json.format[CoordsResponse]
}

