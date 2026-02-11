package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GeoResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class GeoResponse(
  geoId: Option[String],
  latitude: Option[Double],
  longitude: Option[Double]
)

object GeoResponse {
  implicit lazy val geoResponseJsonFormat: Format[GeoResponse] = Json.format[GeoResponse]
}

