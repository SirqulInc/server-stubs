package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RegionResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class RegionResponse(
  id: Option[Long],
  shortName: Option[String],
  fullName: Option[String],
  parent: Option[RegionResponse],
  children: Option[List[RegionResponse]],
  postalCodes: Option[List[PostalCodeResponse]],
  latitude: Option[Double],
  longitude: Option[Double],
  active: Option[Boolean],
  root: Option[Boolean],
  regionClass: Option[String],
  start: Option[Long],
  end: Option[Long],
  polygon: Option[String],
  metaData: Option[String],
  distance: Option[Double],
  versionCode: Option[Int]
)

object RegionResponse {
  implicit lazy val regionResponseJsonFormat: Format[RegionResponse] = Json.format[RegionResponse]
}

