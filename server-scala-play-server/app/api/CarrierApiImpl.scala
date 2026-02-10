package api

import model.BigDecimal
import model.CellCarrierResponse

/**
  * Provides a default implementation for [[CarrierApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class CarrierApiImpl extends CarrierApi {
  /**
    * @inheritdoc
    */
  override def searchCarriers(version: BigDecimal, keyword: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], activeOnly: Option[Boolean]): List[CellCarrierResponse] = {
    // TODO: Implement better logic

    List.empty[CellCarrierResponse]
  }
}
