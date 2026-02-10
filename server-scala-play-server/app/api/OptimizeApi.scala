package api

import play.api.libs.json._
import model.BigDecimal
import model.ImportStatuses
import model.Orders
import model.ShipmentOrder

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait OptimizeApi {
  /**
    * Get Optimization Result
    * Get the results of the import batch.
    * @param batchID The batchID for getting the import status of.
    * @param start The start index for pagination
    * @param limit The limit for pagination
    */
  def getOptimizationResult(version: BigDecimal, batchID: String, start: Int, limit: Int): Map[String, ShipmentOrder]

  /**
    * Request Optimization
    * Request and upload of shipment orders and create ShipmentImportBatch for optimization.
    */
  def requestOptimization(version: BigDecimal, body: Option[Orders]): ImportStatuses
}
