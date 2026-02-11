package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GeoPointResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class GeoPointResponse(
  objectId: Option[String],
  latitude: Option[Double],
  longitude: Option[Double],
  altitude: Option[Double],
  locationDescription: Option[String],
  locatableId: Option[Long],
  locatableObjectId: Option[String],
  locatableObjectName: Option[String],
  locatableDisplay: Option[String],
  asset: Option[AssetShortResponse],
  distance: Option[Double]
)

object GeoPointResponse {
  implicit lazy val geoPointResponseJsonFormat: Format[GeoPointResponse] = Json.format[GeoPointResponse]
}

