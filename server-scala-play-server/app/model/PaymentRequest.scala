package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PaymentRequest.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class PaymentRequest(
  appKey: Option[String],
  clientPaymentId: Option[String],
  minAgeYears: Option[Int],
  invoice: Option[Invoice],
  biometrics: Option[BiometricRequest],
  orderItems: Option[List[OrderItemRequest]],
  acceptedBilling: Option[Boolean]
)

object PaymentRequest {
  implicit lazy val paymentRequestJsonFormat: Format[PaymentRequest] = Json.format[PaymentRequest]
}

