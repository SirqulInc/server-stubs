package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for Device.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Device(
  rebootTimeHour: Option[Int],
  rebootTimeMinute: Option[Int],
  idleTimeoutInSecond: Option[Int],
  serialNumber: Option[String],
  udid: Option[String],
  deviceType: Option[String],
  devicePower: Option[Double],
  deviceInterference: Option[Double],
  lastHeartbeatSent: Option[OffsetDateTime],
  lastDown: Option[OffsetDateTime],
  lastUp: Option[OffsetDateTime],
  lastNotificationSent: Option[OffsetDateTime],
  health: Option[Device.Health.Value]
)

object Device {
  implicit lazy val deviceJsonFormat: Format[Device] = Json.format[Device]

  // noinspection TypeAnnotation
  object Health extends Enumeration {
    val RUNNING = Value("RUNNING")
    val WARNING = Value("WARNING")
    val DOWN = Value("DOWN")

    type Health = Value
    implicit lazy val HealthJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

