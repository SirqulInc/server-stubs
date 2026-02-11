package api

import model.ShipmentBatch
import model.ShipmentImportStatus

/**
  * Provides a default implementation for [[ShipmentBatchApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class ShipmentBatchApiImpl extends ShipmentBatchApi {
  /**
    * @inheritdoc
    */
  override def createShipmentBatch(body: Option[ShipmentBatch]): ShipmentBatch = {
    // TODO: Implement better logic

    ShipmentBatch(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteShipmentBatch(batchId: Long): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def getShipmentBatch(batchId: Long): ShipmentBatch = {
    // TODO: Implement better logic

    ShipmentBatch(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getShipmentBatchStatus(batchId: Long, accountId: Long, sortField: String, descending: Boolean, start: Int, limit: Int, valid: Option[Boolean], started: Option[Boolean], completed: Option[Boolean], hasShipment: Option[Boolean], hasRoute: Option[Boolean], keyword: Option[String]): List[ShipmentImportStatus] = {
    // TODO: Implement better logic

    List.empty[ShipmentImportStatus]
  }

  /**
    * @inheritdoc
    */
  override def searchShipmentBatch(hubId: Long, sortField: String, descending: Boolean, start: Int, limit: Int): List[ShipmentBatch] = {
    // TODO: Implement better logic

    List.empty[ShipmentBatch]
  }
}
