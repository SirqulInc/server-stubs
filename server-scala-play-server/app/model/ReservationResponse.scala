package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ReservationResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ReservationResponse(
  reservationId: Option[Long],
  reservableId: Option[Long],
  reservableType: Option[String],
  account: Option[AccountShortResponse],
  createdDate: Option[Long],
  updatedDate: Option[Long],
  startDate: Option[Long],
  endDate: Option[Long],
  transaction: Option[OfferShortResponse]
)

object ReservationResponse {
  implicit lazy val reservationResponseJsonFormat: Format[ReservationResponse] = Json.format[ReservationResponse]
}

