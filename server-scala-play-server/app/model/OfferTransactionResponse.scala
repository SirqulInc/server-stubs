package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for OfferTransactionResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class OfferTransactionResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  offerLocationId: Option[Long],
  offerId: Option[Long],
  retailerId: Option[Long],
  transactionId: Option[Long],
  favoriteId: Option[Long],
  offerName: Option[String],
  subTitle: Option[String],
  locationName: Option[String],
  starts: Option[OffsetDateTime],
  expires: Option[OffsetDateTime],
  activated: Option[Long],
  expiration: Option[Long],
  redeemableStart: Option[Long],
  redeemableEnd: Option[Long],
  distance: Option[Double],
  offerType: Option[String],
  longitude: Option[Double],
  latitude: Option[Double],
  favorite: Option[Boolean],
  fullPrice: Option[Double],
  discountPrice: Option[Double],
  estimatedValue: Option[Double],
  voucherDiscountPrice: Option[Double],
  missionListResponse: Option[MissionListResponse],
  image: Option[String],
  image1: Option[String],
  image2: Option[String],
  image3: Option[String],
  image4: Option[String],
  image5: Option[String],
  images: Option[List[AssetResponse]],
  barcode: Option[String],
  externalUrl: Option[String],
  sqootUrl: Option[String],
  active: Option[Boolean],
  location: Option[RetailerLocationResponse],
  subDetails: Option[String],
  externalRedeemAuth: Option[Int],
  externalRedeemOptions: Option[String],
  publisher: Option[String],
  product: Option[ProductResponse],
  event: Option[EventResponse],
  media: Option[MediaResponse],
  viewedCount: Option[Int],
  clickedCount: Option[Int],
  addedLimit: Option[Int],
  addedCount: Option[Int],
  usedCount: Option[Int],
  removedCount: Option[Int],
  locationAddedCount: Option[Int],
  barcodeEntry: Option[String],
  barcodeType: Option[OfferTransactionResponse.BarcodeType.Value],
  ticketsReward: Option[Long],
  ticketsRewardType: Option[String],
  specialOfferType: Option[OfferTransactionResponse.SpecialOfferType.Value],
  likeCount: Option[Long],
  dislikeCount: Option[Long],
  favoriteCount: Option[Long],
  noteCount: Option[Long],
  logId: Option[Long],
  billableEntityId: Option[Long],
  responsibleAccountId: Option[Long],
  availabilitySummary: Option[String],
  externalId: Option[String],
  parentOffer: Option[OfferShortResponse],
  address: Option[String],
  details: Option[String],
  finePrint: Option[String],
  retailerPhoneNumber: Option[String],
  ticketPriceType: Option[String],
  ticketPrice: Option[Long],
  discountPercentage: Option[Double],
  paymentFees: Option[Double],
  voucherPrice: Option[Double],
  purchasesRemaining: Option[Int],
  redemptionsRemaining: Option[Int],
  redemptionStatus: Option[Int],
  redemptionCode: Option[String],
  audiences: Option[List[AudienceResponse]],
  audienceCount: Option[Int],
  walletCount: Option[Int],
  qrCodeUrl: Option[String],
  showRemaining: Option[Boolean],
  showRedeemed: Option[Boolean],
  purchaseLimit: Option[Int],
  purchaseLimitPerUser: Option[Int],
  redemptionLimit: Option[Int],
  userRedemptionLimit: Option[Int],
  categories: Option[List[CategoryResponse]],
  filters: Option[List[FilterResponse]],
  customer: Option[AccountShortResponse],
  purchasedDate: Option[Long],
  usedDate: Option[Long],
  transactionCreated: Option[Long],
  transactionUpdated: Option[Long],
  returning: Option[String]
)

object OfferTransactionResponse {
  implicit lazy val offerTransactionResponseJsonFormat: Format[OfferTransactionResponse] = Json.format[OfferTransactionResponse]

  // noinspection TypeAnnotation
  object BarcodeType extends Enumeration {
    val NONE = Value("NONE")
    val UPC = Value("UPC")
    val CODE128 = Value("CODE_128")
    val QR = Value("QR")
    val CUSTOMMEDIA = Value("CUSTOM_MEDIA")

    type BarcodeType = Value
    implicit lazy val BarcodeTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
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
}

