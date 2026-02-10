package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DirectionResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class DirectionResponse(
  action: Option[String],
  bearing: Option[Double],
  bearingDifference: Option[Double],
  heading: Option[String],
  distance: Option[Double],
  distanceUnits: Option[String],
  distanceString: Option[String],
  startLatitude: Option[Double],
  startLongitude: Option[Double],
  endLatitude: Option[Double],
  endLongitude: Option[Double],
  instruction: Option[String],
  progressStatus: Option[String]
)

object DirectionResponse {
  implicit lazy val directionResponseJsonFormat: Format[DirectionResponse] = Json.format[DirectionResponse]
}

