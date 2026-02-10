package api

import model.BigDecimal
import model.Stop

/**
  * Provides a default implementation for [[StopApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class StopApiImpl extends StopApi {
  /**
    * @inheritdoc
    */
  override def getStop(version: BigDecimal, id: Long): Stop = {
    // TODO: Implement better logic

    Stop(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateStop(version: BigDecimal, id: Long, body: Option[Stop]): Stop = {
    // TODO: Implement better logic

    Stop(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
