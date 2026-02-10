package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Vehicle.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Vehicle(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  name: Option[String],
  description: Option[String],
  vehicleType: Option[VehicleType],
  vin: Option[String],
  licensePlateNumber: Option[String],
  externalId: Option[String],
  hub: Option[ServiceHub],
  programs: Option[List[Program]],
  seatQuantity: Option[Long],
  picture: Option[Asset],
  markerIcon: Option[Asset],
  trackingColor: Option[String],
  belongsTo: Option[Account],
  zone: Option[Region],
  notes: Option[List[Note]],
  noteCount: Option[Long],
  inUse: Option[Boolean],
  contentName: Option[String]
)

object Vehicle {
  implicit lazy val vehicleJsonFormat: Format[Vehicle] = Json.format[Vehicle]
}

