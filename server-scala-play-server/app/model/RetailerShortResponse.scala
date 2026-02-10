package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RetailerShortResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class RetailerShortResponse(
  retailerId: Option[Long],
  name: Option[String],
  facebookUrl: Option[String],
  twitterUrl: Option[String],
  active: Option[Boolean],
  contact: Option[ContactInfoResponse],
  logo: Option[AssetShortResponse],
  picture1: Option[AssetShortResponse],
  picture2: Option[AssetShortResponse],
  latitude: Option[Double],
  longitude: Option[Double],
  visibility: Option[String]
)

object RetailerShortResponse {
  implicit lazy val retailerShortResponseJsonFormat: Format[RetailerShortResponse] = Json.format[RetailerShortResponse]
}

