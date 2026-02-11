package api

import model.Location
import model.SirqulResponse

/**
  * Provides a default implementation for [[LocationApiV2Api]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class LocationApiV2ApiImpl extends LocationApiV2Api {
  /**
    * @inheritdoc
    */
  override def createLocationV2(body: Option[Location]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateLocationV2(id: Long, body: Option[Location]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }
}
