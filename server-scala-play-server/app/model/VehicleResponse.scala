package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for VehicleResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class VehicleResponse(
  id: Option[String],
  name: Option[String],
  capacity: Option[Long],
  depot: Option[GeoResponse],
  startWindow: Option[Long],
  endWindow: Option[Long],
  current: Option[GeoResponse],
  depotAsStop: Option[StopResponse]
)

object VehicleResponse {
  implicit lazy val vehicleResponseJsonFormat: Format[VehicleResponse] = Json.format[VehicleResponse]
}

