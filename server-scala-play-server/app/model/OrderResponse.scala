package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OrderResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class OrderResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  orderId: Option[Long],
  application: Option[ApplicationMiniResponse],
  customer: Option[AccountShortResponse],
  amount: Option[Double],
  purchases: Option[Double],
  credits: Option[Double],
  payments: Option[List[PaymentTransactionResponse]],
  externalOrderId: Option[String],
  created: Option[Long],
  updated: Option[Long],
  externalDate: Option[Long],
  description: Option[String],
  returning: Option[String]
)

object OrderResponse {
  implicit lazy val orderResponseJsonFormat: Format[OrderResponse] = Json.format[OrderResponse]
}

