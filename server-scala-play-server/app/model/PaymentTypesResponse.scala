package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PaymentTypesResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class PaymentTypesResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  creditCardOnFile: Option[Boolean],
  creditCardNumber: Option[String],
  creditCardExpirationMonth: Option[String],
  creditCardExpirationYear: Option[String],
  pointsOnFile: Option[Boolean],
  pointsAmount: Option[Double],
  account: Option[AccountShortResponse],
  firstName: Option[String],
  lastName: Option[String],
  address: Option[String],
  city: Option[String],
  state: Option[String],
  postalCode: Option[String],
  phone: Option[String],
  provider: Option[String],
  paymentMethodId: Option[Long],
  validated: Option[Boolean],
  accountNumber: Option[String],
  bankName: Option[String],
  routingNumber: Option[String],
  isDefaultPaymentMethod: Option[Boolean],
  accountName: Option[String],
  paymentMethodNickname: Option[String],
  taxId: Option[String],
  returning: Option[String]
)

object PaymentTypesResponse {
  implicit lazy val paymentTypesResponseJsonFormat: Format[PaymentTypesResponse] = Json.format[PaymentTypesResponse]
}

