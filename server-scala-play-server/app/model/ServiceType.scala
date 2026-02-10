package model

import play.api.libs.json._
import org.joda.time.*

/**
  * Represents the Swagger definition for ServiceType.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ServiceType(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  business: Option[Retailer],
  hub: Option[ServiceHub],
  name: Option[String],
  additionalLoadTime: Option[Long],
  pickupAddressOverride: Option[Address],
  dropoffAddressOverride: Option[Address],
  pickupStartTimeOverride: Option[LocalTime],
  pickupEndTimeOverride: Option[LocalTime],
  dropoffStartTimeOverride: Option[LocalTime],
  dropoffEndTimeOverride: Option[LocalTime],
  dateOverride: Option[ServiceType.DateOverride.Value]
)

object ServiceType {
  implicit lazy val serviceTypeJsonFormat: Format[ServiceType] = Json.format[ServiceType]

  // noinspection TypeAnnotation
  object DateOverride extends Enumeration {
    val NONE = Value("NONE")
    val PICKUPSTART = Value("PICKUP_START")
    val PICKUPEND = Value("PICKUP_END")
    val DROPOFFSTART = Value("DROPOFF_START")
    val DROPOFFEND = Value("DROPOFF_END")

    type DateOverride = Value
    implicit lazy val DateOverrideJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

