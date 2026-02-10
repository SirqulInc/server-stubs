package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RetailerLocationResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class RetailerLocationResponse(
  retailerLocationId: Option[Long],
  name: Option[String],
  contact: Option[ContactInfoResponse],
  latitude: Option[Double],
  longitude: Option[Double],
  active: Option[Boolean],
  favoriteId: Option[Long],
  favorite: Option[Boolean],
  responsible: Option[ProfileShortResponse],
  manager: Option[ProfileShortResponse],
  categories: Option[List[CategoryResponse]],
  filters: Option[List[FilterResponse]],
  logo: Option[AssetShortResponse],
  picture1: Option[AssetShortResponse],
  picture2: Option[AssetShortResponse],
  billableEntity: Option[BillableEntityResponse],
  counts: Option[RetailerCountResponse],
  retailer: Option[RetailerShortResponse],
  offers: Option[ListResponse],
  internalId: Option[String],
  detailsHeader: Option[String],
  detailsBody: Option[String],
  hours: Option[String],
  locationToken: Option[String],
  building: Option[String],
  qrCodeUrl: Option[String],
  distance: Option[Double],
  googlePlaceId: Option[String],
  yelpId: Option[String]
)

object RetailerLocationResponse {
  implicit lazy val retailerLocationResponseJsonFormat: Format[RetailerLocationResponse] = Json.format[RetailerLocationResponse]
}

