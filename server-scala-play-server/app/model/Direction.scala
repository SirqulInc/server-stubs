package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Direction.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Direction(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  distance: Option[String],
  duration: Option[String],
  endLatitude: Option[Double],
  endLongitude: Option[Double],
  startLatitude: Option[Double],
  startLongitude: Option[Double],
  instruction: Option[String],
  polyline: Option[String],
  progressStatus: Option[Direction.ProgressStatus.Value],
  highlight: Option[Boolean]
)

object Direction {
  implicit lazy val directionJsonFormat: Format[Direction] = Json.format[Direction]

  // noinspection TypeAnnotation
  object ProgressStatus extends Enumeration {
    val PENDING = Value("PENDING")
    val COMPLETE = Value("COMPLETE")
    val INVALID = Value("INVALID")

    type ProgressStatus = Value
    implicit lazy val ProgressStatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

