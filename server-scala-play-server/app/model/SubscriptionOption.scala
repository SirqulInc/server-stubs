package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SubscriptionOption.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class SubscriptionOption(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  name: Option[String],
  price: Option[Double],
  quantity: Option[Int],
  threshold: Option[Int],
  visible: Option[Boolean],
  optionType: Option[SubscriptionOption.OptionType.Value],
  offerType: Option[SubscriptionOption.OfferType.Value]
)

object SubscriptionOption {
  implicit lazy val subscriptionOptionJsonFormat: Format[SubscriptionOption] = Json.format[SubscriptionOption]

  // noinspection TypeAnnotation
  object OptionType extends Enumeration {
    val MISSION = Value("MISSION")
    val LOCATION = Value("LOCATION")
    val OFFER = Value("OFFER")
    val NOTIFICATION = Value("NOTIFICATION")
    val REQUEST = Value("REQUEST")
    val STORAGES3 = Value("STORAGE_S3")
    val STORAGEDB = Value("STORAGE_DB")

    type OptionType = Value
    implicit lazy val OptionTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object OfferType extends Enumeration {
    val VOUCHER = Value("VOUCHER")
    val COUPON = Value("COUPON")
    val PRODUCT = Value("PRODUCT")
    val MEDIA = Value("MEDIA")
    val EVENT = Value("EVENT")
    val DEVICE = Value("DEVICE")

    type OfferType = Value
    implicit lazy val OfferTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

