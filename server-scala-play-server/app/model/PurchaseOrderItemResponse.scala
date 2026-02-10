package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PurchaseOrderItemResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class PurchaseOrderItemResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  purchaseOrderItemId: Option[Long],
  created: Option[Long],
  updated: Option[Long],
  customer: Option[AccountShortResponse],
  orderItemType: Option[String],
  orderItemId: Option[Long],
  orderCustomType: Option[String],
  orderCustomId: Option[String],
  retailerLocationId: Option[Long],
  amount: Option[Double],
  tax: Option[Double],
  comment: Option[String],
  returning: Option[String]
)

object PurchaseOrderItemResponse {
  implicit lazy val purchaseOrderItemResponseJsonFormat: Format[PurchaseOrderItemResponse] = Json.format[PurchaseOrderItemResponse]
}

