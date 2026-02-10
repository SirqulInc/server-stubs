package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for Interval.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Interval(
  end: Option[OffsetDateTime],
  start: Option[OffsetDateTime],
  chronology: Option[Chronology],
  startMillis: Option[Long],
  endMillis: Option[Long],
  beforeNow: Option[Boolean],
  afterNow: Option[Boolean]
)

object Interval {
  implicit lazy val intervalJsonFormat: Format[Interval] = Json.format[Interval]
}

