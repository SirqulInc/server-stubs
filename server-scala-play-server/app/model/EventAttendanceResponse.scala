package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EventAttendanceResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class EventAttendanceResponse(
  event: Option[OfferShortResponse],
  affiliatedCategories: Option[List[CategoryResponse]],
  attendee: Option[AccountShortResponse],
  friend: Option[Boolean]
)

object EventAttendanceResponse {
  implicit lazy val eventAttendanceResponseJsonFormat: Format[EventAttendanceResponse] = Json.format[EventAttendanceResponse]
}

