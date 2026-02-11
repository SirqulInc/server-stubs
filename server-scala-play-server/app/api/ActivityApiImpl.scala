package api

import model.ActivityResponse
import model.EntityReference

/**
  * Provides a default implementation for [[ActivityApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class ActivityApiImpl extends ActivityApi {
  /**
    * @inheritdoc
    */
  override def createEntityReference(body: EntityReference): ActivityResponse = {
    // TODO: Implement better logic

    ActivityResponse(None, None, None, None, None, None, None, None, None, None)
  }
}
