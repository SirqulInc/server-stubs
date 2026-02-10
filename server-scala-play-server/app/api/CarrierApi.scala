package api

import play.api.libs.json._
import model.BigDecimal
import model.CellCarrierResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait CarrierApi {
  /**
    * Search Carriers
    * Search on supported mobile telephone carriers that can be used to send SMS notifications via email.
    * @param keyword The keyword to search on
    * @param descending Determines whether the sorted list is in descending or ascending order
    * @param start The start index for pagination
    * @param limit The limit for pagination
    * @param activeOnly Determines whether to return inactive results
    */
  def searchCarriers(version: BigDecimal, keyword: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], activeOnly: Option[Boolean]): List[CellCarrierResponse]
}
