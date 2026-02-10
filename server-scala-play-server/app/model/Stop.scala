package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for Stop.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Stop(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  latitude: Option[Double],
  longitude: Option[Double],
  locationDescription: Option[String],
  name: Option[String],
  owner: Option[Account],
  location: Option[Location],
  notes: Option[List[Note]],
  noteCount: Option[Long],
  stopType: Option[Stop.StopType.Value],
  orderIndex: Option[Long],
  startTime: Option[OffsetDateTime],
  endTime: Option[OffsetDateTime],
  estimatedTime: Option[OffsetDateTime],
  estimatedArrivalTime: Option[OffsetDateTime],
  estimatedDepartureTime: Option[OffsetDateTime],
  actualTime: Option[OffsetDateTime],
  desiredTime: Option[OffsetDateTime],
  timePadding: Option[Int],
  route: Option[Route],
  shipment: Option[Shipment],
  progressStatus: Option[Stop.ProgressStatus.Value],
  compareEstimatedTime: Option[OffsetDateTime],
  compareEstimatedArrivalTime: Option[OffsetDateTime],
  compareEstimiatedDepartureTime: Option[OffsetDateTime],
  polyline: Option[String],
  parent: Option[Stop],
  locationDisplay: Option[String],
  complete: Option[Boolean],
  contentName: Option[String],
  locationAddress: Option[String]
)

object Stop {
  implicit lazy val stopJsonFormat: Format[Stop] = Json.format[Stop]

  // noinspection TypeAnnotation
  object StopType extends Enumeration {
    val PICKUP = Value("PICKUP")
    val DROPOFF = Value("DROPOFF")
    val START = Value("START")
    val END = Value("END")
    val ROUTING = Value("ROUTING")

    type StopType = Value
    implicit lazy val StopTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object ProgressStatus extends Enumeration {
    val PENDING = Value("PENDING")
    val COMPLETE = Value("COMPLETE")
    val INVALID = Value("INVALID")

    type ProgressStatus = Value
    implicit lazy val ProgressStatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

