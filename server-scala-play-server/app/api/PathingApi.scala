package api

import play.api.libs.json._
import model.BigDecimal
import model.PathingResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait PathingApi {
  /**
    * Calculate Path
    * Calculates the shortest path from point to point on a grid
    * @param data the data to with start, end point and exclusion points
    * @param units the system of measurement for directions: {METRIC, IMPERIAL}
    * @param reducePath determines whether to reduce the path to go in diagonal lines
    * @param directions determines whether to return text directions
    */
  def computePath(version: BigDecimal, data: String, units: String, reducePath: Boolean, directions: Boolean): PathingResponse
}
