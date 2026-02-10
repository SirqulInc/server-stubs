package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Contact.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Contact(
  firstName: Option[String],
  middleName: Option[String],
  lastName: Option[String],
  prefix: Option[String],
  suffix: Option[String],
  title: Option[String],
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
  web: Option[String],
  display: Option[String]
)

object Contact {
  implicit lazy val contactJsonFormat: Format[Contact] = Json.format[Contact]
}

