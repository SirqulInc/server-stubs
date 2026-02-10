package api

import play.api.libs.json._
import model.ActivityResponse
import model.BigDecimal
import model.EntityReference

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait ActivityApi {
  /**
    * Create an entity reference.
    * Creates a reference for an entity for syncing data between servers.
    * @param body The entity reference object
    */
  def createEntityReference(version: BigDecimal, body: EntityReference): ActivityResponse
}
