package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PostalCodeResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class PostalCodeResponse(
  city: Option[String],
  stateCode: Option[String],
  code: Option[String],
  latitude: Option[Double],
  longitude: Option[Double],
  timezone: Option[String],
  utcOffset: Option[Int]
)

object PostalCodeResponse {
  implicit lazy val postalCodeResponseJsonFormat: Format[PostalCodeResponse] = Json.format[PostalCodeResponse]
}

