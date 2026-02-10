package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for Offer.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Offer(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  testField: Option[String],
  billableEntity: Option[BillableEntity],
  offerLocations: Option[List[OfferLocation]],
  missions: Option[List[Mission]],
  activated: Option[OffsetDateTime],
  expires: Option[OffsetDateTime],
  redeemableStart: Option[OffsetDateTime],
  redeemableEnd: Option[OffsetDateTime],
  title: Option[String],
  subTitle: Option[String],
  `type`: Option[Offer.Type.Value],
  specialOfferType: Option[Offer.SpecialOfferType.Value],
  details: Option[String],
  subDetails: Option[String],
  finePrint: Option[String],
  getThereNowNotification: Option[String],
  maxPrints: Option[Int],
  viewLimit: Option[Int],
  featured: Option[Boolean],
  replaced: Option[Boolean],
  showRemaining: Option[Boolean],
  showRedeemed: Option[Boolean],
  parentOffer: Option[Offer],
  artwork: Option[Asset],
  offerImage1: Option[Asset],
  offerImage2: Option[Asset],
  offerImage3: Option[Asset],
  offerImage4: Option[Asset],
  offerImage5: Option[Asset],
  barCode: Option[Asset],
  barCodeType: Option[Offer.BarCodeType.Value],
  barCodeEntry: Option[String],
  categories: Option[List[Category]],
  filters: Option[List[Filter]],
  ticketType: Option[String],
  allocateTickets: Option[Boolean],
  ticketPriceType: Option[String],
  ticketPrice: Option[Long],
  fullPrice: Option[Double],
  discountPrice: Option[Double],
  availableLimit: Option[Int],
  availableLimitPerUser: Option[Int],
  addedLimit: Option[Int],
  usedCount: Option[Int],
  addedCount: Option[Int],
  removedCount: Option[Int],
  viewedCount: Option[Int],
  clickedCount: Option[Int],
  offerVisibility: Option[Offer.OfferVisibility.Value],
  offerProcessorId: Option[Offer.OfferProcessorId.Value],
  externalId: Option[String],
  externalUrl: Option[String],
  externalUntrackedUrl: Option[String],
  sqootId: Option[Long],
  sqootUrl: Option[String],
  sqootCategorySlug: Option[String],
  sqootCategoryName: Option[String],
  yipitId: Option[Long],
  redeemAuthOptions: Option[String],
  publisher: Option[String],
  product: Option[Product],
  media: Option[Media],
  event: Option[Event],
  device: Option[Device],
  notes: Option[List[Note]],
  noteCount: Option[Long],
  favoriteCount: Option[Long],
  hasRatings: Option[Boolean],
  likes: Option[List[YayOrNay]],
  likeCount: Option[Long],
  dislikeCount: Option[Long],
  availabilitySummary: Option[String],
  flags: Option[List[Flag]],
  flagCount: Option[Long],
  flagThreshold: Option[FlagThreshold],
  savings: Option[Double],
  clickStream: Option[Double],
  ticketCount: Option[Long],
  display: Option[String],
  appKey: Option[String],
  categoryTree: Option[String],
  filterTree: Option[String],
  indexable: Option[Boolean],
  billableId: Option[Long],
  subType: Option[String],
  contentName: Option[String],
  defaultThreshold: Option[Long],
  contentAsset: Option[Asset],
  owner: Option[Account],
  secondaryType: Option[String],
  discountPercentage: Option[Double]
)

object Offer {
  implicit lazy val offerJsonFormat: Format[Offer] = Json.format[Offer]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val VOUCHER = Value("VOUCHER")
    val COUPON = Value("COUPON")
    val PRODUCT = Value("PRODUCT")
    val MEDIA = Value("MEDIA")
    val EVENT = Value("EVENT")
    val DEVICE = Value("DEVICE")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

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

  // noinspection TypeAnnotation
  object BarCodeType extends Enumeration {
    val NONE = Value("NONE")
    val UPC = Value("UPC")
    val CODE128 = Value("CODE_128")
    val QR = Value("QR")
    val CUSTOMMEDIA = Value("CUSTOM_MEDIA")

    type BarCodeType = Value
    implicit lazy val BarCodeTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object OfferVisibility extends Enumeration {
    val PUBLIC = Value("PUBLIC")
    val LISTABLE = Value("LISTABLE")
    val REWARDABLE = Value("REWARDABLE")
    val TRIGGERABLE = Value("TRIGGERABLE")
    val PRIVATE = Value("PRIVATE")

    type OfferVisibility = Value
    implicit lazy val OfferVisibilityJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object OfferProcessorId extends Enumeration {
    val SQOOT = Value("SQOOT")
    val YIPIT = Value("YIPIT")
    val API = Value("API")
    val CSV = Value("CSV")

    type OfferProcessorId = Value
    implicit lazy val OfferProcessorIdJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

