package api

import play.api.libs.json._
import model.ImportStatuses
import model.Orders
import model.ShipmentOrder

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait OptimizeApi {
  /**
    * Get Optimization Result
    * Get the results of the import batch.
    * @param batchID The batchID for getting the import status of.
    * @param start The start index for pagination
    * @param limit The limit for pagination
    */
  def getOptimizationResult(batchID: String, start: Int, limit: Int): Map[String, ShipmentOrder]

  /**
    * Request Optimization
    * Request and upload of shipment orders and create ShipmentImportBatch for optimization.
    */
  def requestOptimization(body: Option[Orders]): ImportStatuses
}
