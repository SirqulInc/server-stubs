package api

import play.api.libs.json._
import model.BigDecimal
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait RetailerV2Api {
  /**
    * Get Retailer
    * Gets a retailer. Only the owner and the employees of a retailer have access to view its information.
    * @param retailerId the id of the retailer
    * @param activeOnly whether to return results that are active only or all
    * @param keyword the keyword to search on to get retailer
    * @param sortField the field to sort on
    * @param start the start of the index and/or pagination
    * @param limit the limit of the index and/or pagination
    */
  def getRetaokiler(version: BigDecimal, retailerId: Long, activeOnly: Boolean, keyword: Option[String], sortField: Option[String], start: Option[Long], limit: Option[Long]): SirqulResponse
}
