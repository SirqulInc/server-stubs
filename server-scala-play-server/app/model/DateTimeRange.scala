package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for DateTimeRange.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class DateTimeRange(
  start: Option[OffsetDateTime],
  end: Option[OffsetDateTime],
  interval: Option[Interval]
)

object DateTimeRange {
  implicit lazy val dateTimeRangeJsonFormat: Format[DateTimeRange] = Json.format[DateTimeRange]
}

