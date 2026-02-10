package api

import model.BigDecimal
import model.RoutingListResponse

/**
  * Provides a default implementation for [[RoutingApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class RoutingApiImpl extends RoutingApi {
  /**
    * @inheritdoc
    */
  override def computeRouting(version: BigDecimal, data: String): RoutingListResponse = {
    // TODO: Implement better logic

    RoutingListResponse(None, None, None, None, None, None, None, None, None, None, None)
  }
}
