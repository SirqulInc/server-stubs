package api

import model.BigDecimal
import model.ImportStatuses
import model.Orders
import model.ShipmentOrder

/**
  * Provides a default implementation for [[OptimizeApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class OptimizeApiImpl extends OptimizeApi {
  /**
    * @inheritdoc
    */
  override def getOptimizationResult(version: BigDecimal, batchID: String, start: Int, limit: Int): Map[String, ShipmentOrder] = {
    // TODO: Implement better logic

    Map.empty[String, ShipmentOrder]
  }

  /**
    * @inheritdoc
    */
  override def requestOptimization(version: BigDecimal, body: Option[Orders]): ImportStatuses = {
    // TODO: Implement better logic

    ImportStatuses(None)
  }
}
