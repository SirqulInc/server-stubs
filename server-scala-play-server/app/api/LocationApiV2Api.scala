package api

import play.api.libs.json._
import model.BigDecimal
import model.Location
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait LocationApiV2Api {
  /**
    * Create new location
    * Create a new location from a real object location.
    */
  def createLocationV2(version: BigDecimal, body: Option[Location]): SirqulResponse

  /**
    * Update an existing location
    * Update an existing location
    * @param id the id of the location to update
    */
  def updateLocationV2(version: BigDecimal, id: Long, body: Option[Location]): SirqulResponse
}
