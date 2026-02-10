package api

import play.api.libs.json._
import model.BigDecimal
import model.Stop

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait StopApi {
  /**
    * Get Stop
    * Get an existing stop
    * @param id the id of the stop to get
    */
  def getStop(version: BigDecimal, id: Long): Stop

  /**
    * Update Stop
    * Update an existing stop
    * @param id the id of the stop to update
    */
  def updateStop(version: BigDecimal, id: Long, body: Option[Stop]): Stop
}
