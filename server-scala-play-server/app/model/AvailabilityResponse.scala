package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AvailabilityResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class AvailabilityResponse(
  availabilityId: Option[Long],
  startDate: Option[Long],
  endDate: Option[Long],
  dayOfWeek: Option[Int],
  startTime: Option[Long],
  endTime: Option[Long],
  timeZone: Option[String],
  deleted: Option[Boolean]
)

object AvailabilityResponse {
  implicit lazy val availabilityResponseJsonFormat: Format[AvailabilityResponse] = Json.format[AvailabilityResponse]
}

