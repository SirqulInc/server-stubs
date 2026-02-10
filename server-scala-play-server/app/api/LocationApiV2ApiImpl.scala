package api

import model.BigDecimal
import model.Location
import model.SirqulResponse

/**
  * Provides a default implementation for [[LocationApiV2Api]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class LocationApiV2ApiImpl extends LocationApiV2Api {
  /**
    * @inheritdoc
    */
  override def createLocationV2(version: BigDecimal, body: Option[Location]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateLocationV2(version: BigDecimal, id: Long, body: Option[Location]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }
}
