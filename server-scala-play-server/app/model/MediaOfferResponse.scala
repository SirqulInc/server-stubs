package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MediaOfferResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class MediaOfferResponse(
  title: Option[String],
  details: Option[String],
  subTitle: Option[String],
  activated: Option[Long],
  expiration: Option[Long],
  redeemableStart: Option[Long],
  redeemableEnd: Option[Long],
  offerType: Option[String],
  offerVisibility: Option[String],
  favorite: Option[Boolean],
  deleted: Option[Long],
  fullPrice: Option[Double],
  discountPrice: Option[Double],
  image: Option[String],
  image1: Option[String],
  image2: Option[String],
  image3: Option[String],
  image4: Option[String],
  image5: Option[String],
  images: Option[List[AssetResponse]],
  barcode: Option[String],
  externalUrl: Option[String],
  active: Option[Boolean],
  subDetails: Option[String],
  externalRedeemOptions: Option[String],
  publisher: Option[String],
  viewedCount: Option[Int],
  clickedCount: Option[Int],
  addedLimit: Option[Int],
  addedCount: Option[Int],
  usedCount: Option[Int],
  removedCount: Option[Int],
  ticketsReward: Option[Long],
  ticketsRewardType: Option[String],
  specialOfferType: Option[MediaOfferResponse.SpecialOfferType.Value],
  likeCount: Option[Long],
  dislikeCount: Option[Long],
  favoriteCount: Option[Long],
  noteCount: Option[Long],
  billableEntityId: Option[Long],
  responsibleAccountId: Option[Long],
  availabilitySummary: Option[String],
  flagCount: Option[Long],
  flagThreshold: Option[Long],
  externalId: Option[String],
  parentOffer: Option[BaseOfferResponse],
  categories: Option[List[CategoryResponse]],
  filters: Option[List[FilterResponse]]
)

object MediaOfferResponse {
  implicit lazy val mediaOfferResponseJsonFormat: Format[MediaOfferResponse] = Json.format[MediaOfferResponse]

  // noinspection TypeAnnotation
  object SpecialOfferType extends Enumeration {
    val ALL = Value("ALL")
    val RESERVABLE = Value("RESERVABLE")
    val REGULAROFFER = Value("REGULAR_OFFER")
    val ACTNOW = Value("ACT_NOW")
    val GETTHERENOW = Value("GET_THERE_NOW")
    val SQOOT = Value("SQOOT")
    val TICKETS = Value("TICKETS")
    val YIPIT = Value("YIPIT")

    type SpecialOfferType = Value
    implicit lazy val SpecialOfferTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

