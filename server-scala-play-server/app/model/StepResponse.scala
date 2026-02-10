package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for StepResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class StepResponse(
  leg: Option[LegResponse],
  distance: Option[Double],
  duration: Option[Long],
  startLat: Option[Double],
  startLng: Option[Double],
  startAlt: Option[Double],
  startDate: Option[Long],
  endLat: Option[Double],
  endLng: Option[Double],
  endAlt: Option[Double],
  endDate: Option[Long],
  accuracy: Option[Int]
)

object StepResponse {
  implicit lazy val stepResponseJsonFormat: Format[StepResponse] = Json.format[StepResponse]
}

