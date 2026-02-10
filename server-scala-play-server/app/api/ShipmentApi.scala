package api

import play.api.libs.json._
import model.BigDecimal
import model.Shipment

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait ShipmentApi {
  /**
    * Cancel Shipment
    * Remove shipment from route
    * @param id the id of the shipment to cancel
    */
  def cancelShipment(version: BigDecimal, id: Long): Unit

  /**
    * Create Shipment
    * Create new shipment
    */
  def createShipment(version: BigDecimal, body: Option[Shipment]): Shipment

  /**
    * Delete Shipment
    * Delete an existing shipment
    * @param id the id of the shipment to delete
    */
  def deleteShipment(version: BigDecimal, id: Long): Unit

  /**
    * Get Shipment
    * Get an existing shipment
    * @param id the id of the shipment to get
    */
  def getShipment(version: BigDecimal, id: Long): Shipment

  /**
    * Search Shipments
    * Search for shipments
    * @param sortField The field to sort by
    * @param descending Determines whether the sorted list is in descending or ascending order
    * @param start The start index for pagination
    * @param limit The limit for pagination
    * @param activeOnly Return only active results
    * @param ownerId The owner of the shipment
    * @param riderId The rider associate to this shipment
    * @param routeId The route associate to this shipment
    */
  def searchShipments(version: BigDecimal, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, ownerId: Option[Long], riderId: Option[Long], routeId: Option[Long]): List[Shipment]

  /**
    * Update Shipment
    * Update an existing shipment
    * @param id the id of the shipment to update
    */
  def updateShipment(version: BigDecimal, id: Long, body: Option[Shipment]): Shipment

  /**
    * Uupdate Shipment Status
    * Update status of an existing shipment
    * @param id the id of the shipment to update status
    */
  def updateShipmentStatus(version: BigDecimal, id: Long, body: Option[Map[String, Boolean]]): Unit
}
