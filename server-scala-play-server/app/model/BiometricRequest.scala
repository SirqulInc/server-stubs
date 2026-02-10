package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BiometricRequest.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class BiometricRequest(
  face: Option[BiometricImage],
  fingerprints: Option[List[FingerprintBiometricImage]]
)

object BiometricRequest {
  implicit lazy val biometricRequestJsonFormat: Format[BiometricRequest] = Json.format[BiometricRequest]
}

