package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for RoutingResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class RoutingResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  items: Option[List[LoadResponse]],
  vehicles: Option[List[VehicleResponse]],
  drivers: Option[List[DriverResponse]],
  config: Option[ConfigRoutingRequest],
  error: Option[String],
  debug: Option[List[String]],
  startTime: Option[OffsetDateTime],
  endTime: Option[OffsetDateTime],
  responses: Option[List[RoutingResponse]],
  orignalRequest: Option[String],
  generated: Option[Boolean],
  itineraries: Option[List[ItineraryResponse]],
  score: Option[Long],
  loadSize: Option[Int],
  runtime: Option[Long],
  earliestPickupWindow: Option[Long],
  latestPickupWindow: Option[Long],
  returning: Option[String]
)

object RoutingResponse {
  implicit lazy val routingResponseJsonFormat: Format[RoutingResponse] = Json.format[RoutingResponse]
}

