package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CellCarrier.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class CellCarrier(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  uid: Option[String],
  display: Option[String],
  emailFormat: Option[String],
  apiUrl: Option[String],
  authUrl: Option[String],
  shortCode: Option[String],
  clientId: Option[String],
  clientSecret: Option[String]
)

object CellCarrier {
  implicit lazy val cellCarrierJsonFormat: Format[CellCarrier] = Json.format[CellCarrier]
}

