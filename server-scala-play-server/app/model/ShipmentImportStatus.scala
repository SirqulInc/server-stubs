package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for ShipmentImportStatus.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ShipmentImportStatus(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  name: Option[String],
  batchId: Option[String],
  message: Option[String],
  shipment: Option[Shipment],
  started: Option[OffsetDateTime],
  completed: Option[OffsetDateTime]
)

object ShipmentImportStatus {
  implicit lazy val shipmentImportStatusJsonFormat: Format[ShipmentImportStatus] = Json.format[ShipmentImportStatus]
}

