package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PathingResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class PathingResponse(
  start: Option[NodeRequest],
  end: Option[NodeRequest],
  waypoints: Option[List[NodeRequest]],
  exclusions: Option[List[NodeRequest]],
  width: Option[Int],
  height: Option[Int],
  southwest: Option[NodeRequest],
  northeast: Option[NodeRequest],
  metersPerX: Option[Double],
  metersPerY: Option[Double],
  path: Option[List[NodeRequest]],
  pathCount: Option[Int],
  directions: Option[List[DirectionResponse]],
  directionCount: Option[Int],
  swcalibration: Option[NodeRequest],
  calibrationBearings: Option[Double],
  necalibration: Option[NodeRequest]
)

object PathingResponse {
  implicit lazy val pathingResponseJsonFormat: Format[PathingResponse] = Json.format[PathingResponse]
}

