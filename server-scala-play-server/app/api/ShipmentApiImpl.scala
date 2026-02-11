package api

import model.Shipment

/**
  * Provides a default implementation for [[ShipmentApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class ShipmentApiImpl extends ShipmentApi {
  /**
    * @inheritdoc
    */
  override def cancelShipment(id: Long): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def createShipment(body: Option[Shipment]): Shipment = {
    // TODO: Implement better logic

    Shipment(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteShipment(id: Long): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def getShipment(id: Long): Shipment = {
    // TODO: Implement better logic

    Shipment(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchShipments(sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, ownerId: Option[Long], riderId: Option[Long], routeId: Option[Long]): List[Shipment] = {
    // TODO: Implement better logic

    List.empty[Shipment]
  }

  /**
    * @inheritdoc
    */
  override def updateShipment(id: Long, body: Option[Shipment]): Shipment = {
    // TODO: Implement better logic

    Shipment(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateShipmentStatus(id: Long, body: Option[Map[String, Boolean]]): Unit = {
    // TODO: Implement better logic

    
  }
}
