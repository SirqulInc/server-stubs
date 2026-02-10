package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for OfferLocation.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class OfferLocation(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  latitude: Option[Double],
  longitude: Option[Double],
  locationDescription: Option[String],
  offer: Option[Offer],
  location: Option[RetailerLocation],
  distance: Option[Double],
  altitude: Option[Double],
  customValue: Option[Double],
  locationDetail: Option[String],
  audiences: Option[List[Audience]],
  qrInviteCode: Option[Asset],
  notes: Option[List[Note]],
  noteCount: Option[Long],
  searchIndexUpdated: Option[OffsetDateTime],
  inSearchIndex: Option[Boolean],
  favoriteCount: Option[Long],
  addedCount: Option[Int],
  display: Option[String],
  appKey: Option[String],
  devicePower: Option[Double],
  powerLoss: Option[Double],
  udid: Option[String],
  billableId: Option[Long],
  subType: Option[String],
  contentName: Option[String],
  contentAsset: Option[Asset],
  owner: Option[Account],
  secondaryType: Option[String],
  categoryIds: Option[List[Long]],
  filterIds: Option[List[Long]]
)

object OfferLocation {
  implicit lazy val offerLocationJsonFormat: Format[OfferLocation] = Json.format[OfferLocation]
}

