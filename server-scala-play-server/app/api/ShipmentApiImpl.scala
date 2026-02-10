package api

import model.BigDecimal
import model.Shipment

/**
  * Provides a default implementation for [[ShipmentApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class ShipmentApiImpl extends ShipmentApi {
  /**
    * @inheritdoc
    */
  override def cancelShipment(version: BigDecimal, id: Long): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def createShipment(version: BigDecimal, body: Option[Shipment]): Shipment = {
    // TODO: Implement better logic

    Shipment(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteShipment(version: BigDecimal, id: Long): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def getShipment(version: BigDecimal, id: Long): Shipment = {
    // TODO: Implement better logic

    Shipment(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchShipments(version: BigDecimal, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, ownerId: Option[Long], riderId: Option[Long], routeId: Option[Long]): List[Shipment] = {
    // TODO: Implement better logic

    List.empty[Shipment]
  }

  /**
    * @inheritdoc
    */
  override def updateShipment(version: BigDecimal, id: Long, body: Option[Shipment]): Shipment = {
    // TODO: Implement better logic

    Shipment(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateShipmentStatus(version: BigDecimal, id: Long, body: Option[Map[String, Boolean]]): Unit = {
    // TODO: Implement better logic

    
  }
}
