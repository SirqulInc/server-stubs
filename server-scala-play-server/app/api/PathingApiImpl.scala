package api

import model.BigDecimal
import model.PathingResponse

/**
  * Provides a default implementation for [[PathingApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class PathingApiImpl extends PathingApi {
  /**
    * @inheritdoc
    */
  override def computePath(version: BigDecimal, data: String, units: String, reducePath: Boolean, directions: Boolean): PathingResponse = {
    // TODO: Implement better logic

    PathingResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
