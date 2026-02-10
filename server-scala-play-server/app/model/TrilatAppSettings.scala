package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TrilatAppSettings.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class TrilatAppSettings(
  processingType: Option[TrilatAppSettings.ProcessingType.Value],
  maxSampleSize: Option[Int],
  minRSSI: Option[Double]
)

object TrilatAppSettings {
  implicit lazy val trilatAppSettingsJsonFormat: Format[TrilatAppSettings] = Json.format[TrilatAppSettings]

  // noinspection TypeAnnotation
  object ProcessingType extends Enumeration {
    val DEFAULT = Value("DEFAULT")
    val FINGERPRINT = Value("FINGERPRINT")
    val FINGERPRINTV2 = Value("FINGERPRINT_V2")

    type ProcessingType = Value
    implicit lazy val ProcessingTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

