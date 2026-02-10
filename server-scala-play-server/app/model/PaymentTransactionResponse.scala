package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PaymentTransactionResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class PaymentTransactionResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  paymentTransactionId: Option[Long],
  customer: Option[AccountShortResponse],
  promoCode: Option[String],
  remoteRefId: Option[String],
  currencyType: Option[String],
  amount: Option[Double],
  tax: Option[Double],
  offerTransactions: Option[List[OfferTransactionResponse]],
  orderItems: Option[List[PurchaseOrderItemResponse]],
  externalPaymentId: Option[String],
  metadata: Option[String],
  created: Option[Long],
  updated: Option[Long],
  returning: Option[String]
)

object PaymentTransactionResponse {
  implicit lazy val paymentTransactionResponseJsonFormat: Format[PaymentTransactionResponse] = Json.format[PaymentTransactionResponse]
}

