package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Represents the Swagger definition for Recurrence.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Recurrence(
  frequency: Option[Recurrence.Frequency.Value],
  daysOfWeek: Option[List[Int]],
  start: Option[LocalDate],
  count: Option[Int],
  until: Option[LocalDate]
)

object Recurrence {
  implicit lazy val recurrenceJsonFormat: Format[Recurrence] = Json.format[Recurrence]

  // noinspection TypeAnnotation
  object Frequency extends Enumeration {
    val DAILY = Value("DAILY")
    val WEEKLY = Value("WEEKLY")
    val MONTHLY = Value("MONTHLY")
    val ANNUALLY = Value("ANNUALLY")
    val WEEKDAYONLY = Value("WEEK_DAY_ONLY")

    type Frequency = Value
    implicit lazy val FrequencyJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

