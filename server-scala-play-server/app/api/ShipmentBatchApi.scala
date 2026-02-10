package api

import play.api.libs.json._
import model.BigDecimal
import model.ShipmentBatch
import model.ShipmentImportStatus

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait ShipmentBatchApi {
  /**
    * Create Shipment Batch
    * Create a new shipment batch
    */
  def createShipmentBatch(version: BigDecimal, body: Option[ShipmentBatch]): ShipmentBatch

  /**
    * Delete Shipment Batch
    * Search for shipment batches
    * @param batchId the id of the shipment batch to delete
    */
  def deleteShipmentBatch(version: BigDecimal, batchId: Long): Unit

  /**
    * Get Shipment Batch
    * Get an existing shipment batch
    * @param batchId the id of the shipment batch to get
    */
  def getShipmentBatch(version: BigDecimal, batchId: Long): ShipmentBatch

  /**
    * Get Shipment Batch Status
    * Get the import status list of the import shipment batch
    * @param batchId The id of the requested shipment batch
    * @param accountId the id of the logged in user
    * @param sortField The field to sort by
    * @param descending Determines whether the sorted list is in descending or ascending order
    * @param start The start index for pagination
    * @param limit The limit for pagination
    * @param valid Valid import status only or not
    * @param started Started import status only
    * @param completed Completed import status only
    * @param hasShipment Has shipment associate to the status
    * @param hasRoute Has route associate to the status
    * @param keyword The keyword to search for
    */
  def getShipmentBatchStatus(version: BigDecimal, batchId: Long, accountId: Long, sortField: String, descending: Boolean, start: Int, limit: Int, valid: Option[Boolean], started: Option[Boolean], completed: Option[Boolean], hasShipment: Option[Boolean], hasRoute: Option[Boolean], keyword: Option[String]): List[ShipmentImportStatus]

  /**
    * Search Shipment Batch
    * Search for shipment batches
    * @param hubId The associated service hub
    * @param sortField The field to sort by
    * @param descending Determines whether the sorted list is in descending or ascending order
    * @param start The start index for pagination
    * @param limit The limit for pagination
    */
  def searchShipmentBatch(version: BigDecimal, hubId: Long, sortField: String, descending: Boolean, start: Int, limit: Int): List[ShipmentBatch]
}
