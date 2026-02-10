package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for VehicleCargoSetting.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class VehicleCargoSetting(
  valid: Option[Boolean],
  cargoType: Option[CargoType],
  maxUnit: Option[Int]
)

object VehicleCargoSetting {
  implicit lazy val vehicleCargoSettingJsonFormat: Format[VehicleCargoSetting] = Json.format[VehicleCargoSetting]
}

