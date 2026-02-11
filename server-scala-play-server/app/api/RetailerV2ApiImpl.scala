package api

import model.SirqulResponse

/**
  * Provides a default implementation for [[RetailerV2Api]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class RetailerV2ApiImpl extends RetailerV2Api {
  /**
    * @inheritdoc
    */
  override def getRetaokiler(retailerId: Long, activeOnly: Boolean, keyword: Option[String], sortField: Option[String], start: Option[Long], limit: Option[Long]): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }
}
