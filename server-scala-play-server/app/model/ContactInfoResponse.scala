package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ContactInfoResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ContactInfoResponse(
  homePhone: Option[String],
  cellPhone: Option[String],
  cellPhoneCarrier: Option[String],
  businessPhone: Option[String],
  businessPhoneExt: Option[String],
  faxNumber: Option[String],
  timeZone: Option[String],
  utcOffset: Option[String],
  code501c3: Option[String],
  emailAddress: Option[String],
  address: Option[AddressResponse],
  web: Option[String],
  cellCarrier: Option[CellCarrierResponse]
)

object ContactInfoResponse {
  implicit lazy val contactInfoResponseJsonFormat: Format[ContactInfoResponse] = Json.format[ContactInfoResponse]
}

