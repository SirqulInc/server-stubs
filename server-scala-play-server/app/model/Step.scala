package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for Step.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Step(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  owner: Option[Account],
  deviceId: Option[String],
  leg: Option[Leg],
  distance: Option[Double],
  duration: Option[Long],
  startLatitude: Option[Double],
  startLongitude: Option[Double],
  startAltitude: Option[Double],
  startDate: Option[OffsetDateTime],
  endLatitude: Option[Double],
  endLongitude: Option[Double],
  endAltitude: Option[Double],
  endDate: Option[OffsetDateTime]
)

object Step {
  implicit lazy val stepJsonFormat: Format[Step] = Json.format[Step]
}

