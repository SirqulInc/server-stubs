package api

import model.SirqulResponse

/**
  * Provides a default implementation for [[SimulationApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class SimulationApiImpl extends SimulationApi {
  /**
    * @inheritdoc
    */
  override def simulation(data: String, realTime: Boolean): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }
}
