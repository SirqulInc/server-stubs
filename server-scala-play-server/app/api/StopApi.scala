package api

import play.api.libs.json._
import model.Stop

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait StopApi {
  /**
    * Get Stop
    * Get an existing stop
    * @param id the id of the stop to get
    */
  def getStop(id: Long): Stop

  /**
    * Update Stop
    * Update an existing stop
    * @param id the id of the stop to update
    */
  def updateStop(id: Long, body: Option[Stop]): Stop
}
