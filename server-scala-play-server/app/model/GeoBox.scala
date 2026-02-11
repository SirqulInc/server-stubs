package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GeoBox.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class GeoBox(
  north: Option[Double],
  east: Option[Double],
  south: Option[Double],
  west: Option[Double]
)

object GeoBox {
  implicit lazy val geoBoxJsonFormat: Format[GeoBox] = Json.format[GeoBox]
}

