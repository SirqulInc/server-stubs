package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItineraryResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ItineraryResponse(
  itineraryId: Option[String],
  waypointCount: Option[Long],
  score: Option[Long],
  errorCode: Option[String],
  error: Option[String],
  itemCount: Option[Int],
  vehicle: Option[VehicleResponse],
  stops: Option[List[StopResponse]],
  estimatedStartTime: Option[Long],
  estimatedEndTime: Option[Long],
  estimatedDuration: Option[Long],
  estimatedDistance: Option[Double],
  waitTime: Option[Long],
  generated: Option[Boolean],
  valid: Option[Boolean]
)

object ItineraryResponse {
  implicit lazy val itineraryResponseJsonFormat: Format[ItineraryResponse] = Json.format[ItineraryResponse]
}

