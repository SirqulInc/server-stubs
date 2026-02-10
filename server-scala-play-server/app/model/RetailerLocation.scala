package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for RetailerLocation.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class RetailerLocation(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  latitude: Option[Double],
  longitude: Option[Double],
  locationDescription: Option[String],
  categories: Option[List[Category]],
  filters: Option[List[Filter]],
  offerLocations: Option[List[OfferLocation]],
  logo: Option[Asset],
  picture1: Option[Asset],
  picture2: Option[Asset],
  qrCode: Option[Asset],
  name: Option[String],
  locationId: Option[String],
  code: Option[String],
  retailer: Option[Retailer],
  assignments: Option[List[Assignment]],
  currentAssignment: Option[Assignment],
  profile: Option[RetailerProfile],
  regions: Option[List[Region]],
  offerPrintKeyPrefix: Option[String],
  administrators: Option[List[Account]],
  sqootId: Option[Long],
  yipitId: Option[Long],
  locationToken: Option[String],
  building: Option[Building],
  notes: Option[List[Note]],
  noteCount: Option[Long],
  searchIndexUpdated: Option[OffsetDateTime],
  inSearchIndex: Option[Boolean],
  favoriteCount: Option[Long],
  hasRatings: Option[Boolean],
  googlePlaceId: Option[String],
  yelpId: Option[String],
  display: Option[String],
  appKey: Option[String],
  categoryTree: Option[String],
  filterTree: Option[String],
  addressDisplay: Option[String],
  mapQuery: Option[String],
  sortName: Option[String],
  fullDisplay: Option[String],
  hasOffers: Option[Boolean],
  billableId: Option[Long],
  subType: Option[String],
  contentName: Option[String],
  owner: Option[Account],
  secondaryType: Option[String],
  locationAddress: Option[String],
  validOfferLocationIds: Option[List[Long]]
)

object RetailerLocation {
  implicit lazy val retailerLocationJsonFormat: Format[RetailerLocation] = Json.format[RetailerLocation]
}

