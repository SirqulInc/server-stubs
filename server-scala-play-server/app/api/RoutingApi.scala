package api

import play.api.libs.json._
import model.BigDecimal
import model.RoutingListResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait RoutingApi {
  /**
    * Compute Route
    * This service finds the most optimal routes for delivering items between locations (reducing transit time/resources). It can take in a list of vehicles and a list of items (to be transported).All load items have pick-up and drop-off locations with time windows for when the item is expected to be picked-up and dropped-off. 
    * @param data Json object containing inputs for generating the routes. See description for more info. Also see RoutingRequest
    */
  def computeRouting(version: BigDecimal, data: String): RoutingListResponse
}
