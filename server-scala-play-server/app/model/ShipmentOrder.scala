package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for ShipmentOrder.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ShipmentOrder(
  valid: Option[Boolean],
  batchID: Option[Int],
  batchSize: Option[Int],
  orderTrackingID: Option[Double],
  clientRefNo: Option[String],
  clientRefNo2: Option[String],
  hubCode: Option[String],
  accountNo: Option[String],
  companyName: Option[String],
  vehicleTypeName: Option[String],
  serviceTypeName: Option[String],
  serviceCode: Option[String],
  pieces: Option[Int],
  weight: Option[Double],
  cubicFeet: Option[Double],
  pickupCompany: Option[String],
  pickupContact: Option[String],
  pickupPhone: Option[String],
  pickupStreet: Option[String],
  pickupStreet2: Option[String],
  pickupCity: Option[String],
  pickupState: Option[String],
  pickupZip: Option[String],
  pickupTargetFrom: Option[OffsetDateTime],
  pickupTargetTo: Option[OffsetDateTime],
  deliveryCompany: Option[String],
  deliveryContact: Option[String],
  deliveryPhone: Option[String],
  deliveryStreet: Option[String],
  deliveryStreet2: Option[String],
  deliveryCity: Option[String],
  deliveryState: Option[String],
  deliveryZip: Option[String],
  deliveryTargetFrom: Option[OffsetDateTime],
  deliveryTargetTo: Option[OffsetDateTime],
  orderPackages: Option[List[OrderPackage]],
  routeID: Option[Int],
  driverID: Option[Int],
  pickupSequenceNo: Option[Int],
  deliverySequenceNo: Option[Int],
  pickupETA: Option[String],
  deliveryETA: Option[String]
)

object ShipmentOrder {
  implicit lazy val shipmentOrderJsonFormat: Format[ShipmentOrder] = Json.format[ShipmentOrder]
}

