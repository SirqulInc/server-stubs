package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TicketOfferResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class TicketOfferResponse(
  id: Option[Long],
  title: Option[String],
  description: Option[String],
  imageURL: Option[String],
  retailer: Option[String]
)

object TicketOfferResponse {
  implicit lazy val ticketOfferResponseJsonFormat: Format[TicketOfferResponse] = Json.format[TicketOfferResponse]
}

