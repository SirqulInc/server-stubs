package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ContactInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ContactInfo(
  homePhone: Option[String],
  cellPhone: Option[String],
  cellCarrier: Option[CellCarrier],
  businessPhone: Option[String],
  businessPhoneExt: Option[String],
  faxNumber: Option[String],
  timeZone: Option[String],
  utcOffset: Option[String],
  code501c3: Option[String],
  emailAddress: Option[String],
  address: Option[Address],
  web: Option[String]
)

object ContactInfo {
  implicit lazy val contactInfoJsonFormat: Format[ContactInfo] = Json.format[ContactInfo]
}

