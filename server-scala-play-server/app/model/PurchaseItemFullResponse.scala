package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PurchaseItemFullResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class PurchaseItemFullResponse(
  id: Option[Long],
  name: Option[String],
  description: Option[String],
  tickets: Option[Int],
  coverAsset: Option[AssetShortResponse],
  promoAsset: Option[AssetShortResponse],
  giftable: Option[Boolean],
  assetable: Option[Boolean],
  gameType: Option[String],
  price: Option[Float],
  purchaseType: Option[String],
  purchaseCode: Option[String],
  purchaseLimit: Option[Int],
  quantity: Option[Int],
  serviceAction: Option[PurchaseItemFullResponse.ServiceAction.Value],
  appName: Option[String],
  secretKey: Option[String],
  appKey: Option[String],
  allocateTickets: Option[Boolean],
  ticketType: Option[String],
  ticketCount: Option[Long],
  points: Option[Long]
)

object PurchaseItemFullResponse {
  implicit lazy val purchaseItemFullResponseJsonFormat: Format[PurchaseItemFullResponse] = Json.format[PurchaseItemFullResponse]

  // noinspection TypeAnnotation
  object ServiceAction extends Enumeration {
    val DAYPREMIUM = Value("DAY_PREMIUM")
    val WEEKPREMIUM = Value("WEEK_PREMIUM")
    val MONTHPREMIUM = Value("MONTH_PREMIUM")
    val YEARPREMIUM = Value("YEAR_PREMIUM")
    val LIFETIMEPREMIUM = Value("LIFETIME_PREMIUM")
    val ADDTICKET = Value("ADD_TICKET")
    val ADDGIFT = Value("ADD_GIFT")
    val ADDPOINTS = Value("ADD_POINTS")

    type ServiceAction = Value
    implicit lazy val ServiceActionJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

