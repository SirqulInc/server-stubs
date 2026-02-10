package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for VehicleType.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class VehicleType(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  business: Option[Retailer],
  hub: Option[ServiceHub],
  name: Option[String],
  width: Option[Double],
  height: Option[Double],
  depth: Option[Double],
  volume: Option[Double],
  maxWeight: Option[Double],
  vehicleCargoSettings: Option[List[VehicleCargoSetting]]
)

object VehicleType {
  implicit lazy val vehicleTypeJsonFormat: Format[VehicleType] = Json.format[VehicleType]
}

