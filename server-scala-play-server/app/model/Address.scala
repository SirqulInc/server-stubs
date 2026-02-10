package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Address.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Address(
  streetAddress: Option[String],
  streetAddress2: Option[String],
  city: Option[String],
  stateCode: Option[String],
  state: Option[String],
  postalCode: Option[String],
  countryCode: Option[String],
  country: Option[String],
  display: Option[String]
)

object Address {
  implicit lazy val addressJsonFormat: Format[Address] = Json.format[Address]
}

