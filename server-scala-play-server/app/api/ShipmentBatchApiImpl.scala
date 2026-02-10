package api

import model.BigDecimal
import model.ShipmentBatch
import model.ShipmentImportStatus

/**
  * Provides a default implementation for [[ShipmentBatchApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class ShipmentBatchApiImpl extends ShipmentBatchApi {
  /**
    * @inheritdoc
    */
  override def createShipmentBatch(version: BigDecimal, body: Option[ShipmentBatch]): ShipmentBatch = {
    // TODO: Implement better logic

    ShipmentBatch(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteShipmentBatch(version: BigDecimal, batchId: Long): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def getShipmentBatch(version: BigDecimal, batchId: Long): ShipmentBatch = {
    // TODO: Implement better logic

    ShipmentBatch(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getShipmentBatchStatus(version: BigDecimal, batchId: Long, accountId: Long, sortField: String, descending: Boolean, start: Int, limit: Int, valid: Option[Boolean], started: Option[Boolean], completed: Option[Boolean], hasShipment: Option[Boolean], hasRoute: Option[Boolean], keyword: Option[String]): List[ShipmentImportStatus] = {
    // TODO: Implement better logic

    List.empty[ShipmentImportStatus]
  }

  /**
    * @inheritdoc
    */
  override def searchShipmentBatch(version: BigDecimal, hubId: Long, sortField: String, descending: Boolean, start: Int, limit: Int): List[ShipmentBatch] = {
    // TODO: Implement better logic

    List.empty[ShipmentBatch]
  }
}
