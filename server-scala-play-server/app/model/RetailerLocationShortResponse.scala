package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RetailerLocationShortResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class RetailerLocationShortResponse(
  retailerLocationId: Option[Long],
  name: Option[String],
  contact: Option[ContactInfoResponse],
  latitude: Option[Double],
  longitude: Option[Double],
  active: Option[Boolean],
  favoriteId: Option[Long],
  favorite: Option[Boolean]
)

object RetailerLocationShortResponse {
  implicit lazy val retailerLocationShortResponseJsonFormat: Format[RetailerLocationShortResponse] = Json.format[RetailerLocationShortResponse]
}

