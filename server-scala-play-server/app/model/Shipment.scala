package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for Shipment.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Shipment(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  name: Option[String],
  owner: Option[Account],
  rider: Option[Account],
  pickupStop: Option[Stop],
  dropOffStop: Option[Stop],
  notes: Option[List[Note]],
  noteCount: Option[Long],
  batchId: Option[String],
  reserved: Option[OffsetDateTime],
  canceled: Option[OffsetDateTime],
  confirmed: Option[OffsetDateTime],
  route: Option[Route],
  polyline: Option[String],
  replacePassenger: Option[Shipment],
  refunded: Option[Boolean],
  promoCode: Option[PromoCode],
  quantity: Option[Int],
  pickupTimeWindow: Option[DateTimeRange],
  dropOffTimeWindow: Option[DateTimeRange],
  cargoType: Option[CargoType],
  serviceType: Option[ServiceType],
  routeId: Option[Long],
  totalVolume: Option[Double],
  complete: Option[Boolean],
  contentName: Option[String],
  riderName: Option[String]
)

object Shipment {
  implicit lazy val shipmentJsonFormat: Format[Shipment] = Json.format[Shipment]
}

