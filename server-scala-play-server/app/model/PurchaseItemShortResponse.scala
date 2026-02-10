package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PurchaseItemShortResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class PurchaseItemShortResponse(
  id: Option[Long],
  name: Option[String],
  description: Option[String],
  tickets: Option[Int],
  coverAsset: Option[AssetShortResponse],
  promoAsset: Option[AssetShortResponse],
  giftable: Option[Boolean],
  assetable: Option[Boolean]
)

object PurchaseItemShortResponse {
  implicit lazy val purchaseItemShortResponseJsonFormat: Format[PurchaseItemShortResponse] = Json.format[PurchaseItemShortResponse]
}

