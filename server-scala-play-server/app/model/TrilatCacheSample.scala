package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TrilatCacheSample.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class TrilatCacheSample(
  avatarId: Option[String],
  deviceId: Option[String],
  rssi: Option[List[Int]],
  filteredRssi: Option[Double],
  time: Option[Long],
  networkName: Option[String],
  randomizedId: Option[Boolean],
  deviceSignature: Option[String],
  alternateId: Option[String],
  `type`: Option[String],
  probeType: Option[TrilatCacheSample.ProbeType.Value],
  avgRssi: Option[Double]
)

object TrilatCacheSample {
  implicit lazy val trilatCacheSampleJsonFormat: Format[TrilatCacheSample] = Json.format[TrilatCacheSample]

  // noinspection TypeAnnotation
  object ProbeType extends Enumeration {
    val WIFIPROBEREQUEST = Value("WIFI_PROBE_REQUEST")
    val IBEACON = Value("IBEACON")
    val BLE = Value("BLE")
    val UNKNOWN = Value("UNKNOWN")

    type ProbeType = Value
    implicit lazy val ProbeTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

