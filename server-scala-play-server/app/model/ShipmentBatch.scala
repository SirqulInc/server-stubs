package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for ShipmentBatch.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ShipmentBatch(
  id: Option[Long],
  created: Option[OffsetDateTime],
  updated: Option[OffsetDateTime],
  active: Option[Boolean],
  valid: Option[Boolean],
  retailer: Option[Retailer],
  hub: Option[ServiceHub],
  program: Option[Program],
  shipmentImportStatuses: Option[List[ShipmentImportStatus]],
  shipments: Option[List[Shipment]],
  uploaded: Option[OffsetDateTime],
  started: Option[OffsetDateTime],
  optimizationStarted: Option[OffsetDateTime],
  completed: Option[OffsetDateTime],
  optimizationCompleted: Option[OffsetDateTime],
  source: Option[String],
  externalId: Option[String],
  total: Option[Int],
  processedCount: Option[Int],
  successCount: Option[Int],
  failedCount: Option[Int],
  validCount: Option[Int],
  invalidCount: Option[Int],
  averageTravelSpeed: Option[Double],
  maxSeconds: Option[Long],
  importStatus: Option[ShipmentBatch.ImportStatus.Value],
  totalRoutes: Option[Int],
  routesCreated: Option[Int],
  totalLegsRequests: Option[Int],
  legsRequested: Option[Int],
  initScore: Option[Int],
  hardScore: Option[Long],
  mediumScore: Option[Long],
  softScore: Option[Long]
)

object ShipmentBatch {
  implicit lazy val shipmentBatchJsonFormat: Format[ShipmentBatch] = Json.format[ShipmentBatch]

  // noinspection TypeAnnotation
  object ImportStatus extends Enumeration {
    val NEW = Value("NEW")
    val STARTED = Value("STARTED")
    val FETCHINGDISTANCEDATA = Value("FETCHING_DISTANCE_DATA")
    val OPTIMIZING = Value("OPTIMIZING")
    val CREATINGROUTES = Value("CREATING_ROUTES")
    val COMPLETED = Value("COMPLETED")
    val INCOMPLETE = Value("INCOMPLETE")

    type ImportStatus = Value
    implicit lazy val ImportStatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

