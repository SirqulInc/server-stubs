package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for FingerprintBiometricImage.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class FingerprintBiometricImage(
  position: Option[FingerprintBiometricImage.Position.Value],
  data: Option[String],
  imageFormat: Option[String]
)

object FingerprintBiometricImage {
  implicit lazy val fingerprintBiometricImageJsonFormat: Format[FingerprintBiometricImage] = Json.format[FingerprintBiometricImage]

  // noinspection TypeAnnotation
  object Position extends Enumeration {
    val UNKNOWN = Value("UNKNOWN")
    val LEFTINDEX = Value("LEFT_INDEX")
    val LEFTMIDDLE = Value("LEFT_MIDDLE")
    val LEFTRING = Value("LEFT_RING")
    val LEFTLITTLE = Value("LEFT_LITTLE")
    val LEFTTHUMB = Value("LEFT_THUMB")
    val RIGHTINDEX = Value("RIGHT_INDEX")
    val RIGHTMIDDLE = Value("RIGHT_MIDDLE")
    val RIGHTRING = Value("RIGHT_RING")
    val RIGHTLITTLE = Value("RIGHT_LITTLE")
    val RIGHTTHUMB = Value("RIGHT_THUMB")
    val LEFT = Value("LEFT")
    val RIGHT = Value("RIGHT")

    type Position = Value
    implicit lazy val PositionJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

