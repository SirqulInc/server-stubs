package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for Trip.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Trip(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  owner: Option[Account],
  pickupLocation: Option[Location],
  pickupTime: Option[OffsetDateTime],
  dropOffLocation: Option[Location],
  dropOffTime: Option[OffsetDateTime],
  shipments: Option[List[Shipment]],
  recurrence: Option[Recurrence],
  timeZone: Option[String],
  route: Option[Route],
  preference: Option[Trip.Preference.Value],
  notifications: Option[String],
  matches: Option[List[Trip]],
  ownerConnection: Option[Connection],
  originalId: Option[Long]
)

object Trip {
  implicit lazy val tripJsonFormat: Format[Trip] = Json.format[Trip]

  // noinspection TypeAnnotation
  object Preference extends Enumeration {
    val DRIVE = Value("DRIVE")
    val FLEXIBLE = Value("FLEXIBLE")
    val RIDE = Value("RIDE")

    type Preference = Value
    implicit lazy val PreferenceJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

