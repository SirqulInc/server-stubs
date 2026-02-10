package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TimeSlotResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class TimeSlotResponse(
  scheduledDate: Option[Long],
  startTime: Option[Long],
  endTime: Option[Long],
  dayOfWeek: Option[Int],
  timeZone: Option[String],
  reservationCount: Option[Int],
  reservations: Option[List[AccountShortResponse]]
)

object TimeSlotResponse {
  implicit lazy val timeSlotResponseJsonFormat: Format[TimeSlotResponse] = Json.format[TimeSlotResponse]
}

