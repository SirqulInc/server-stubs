package api

import model.FilterResponse
import model.FilterTreeResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[FilterApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class FilterApiImpl extends FilterApi {
  /**
    * @inheritdoc
    */
  override def createFilter(accountId: Long, name: String, appKey: Option[String], parentFilterId: Option[Long], description: Option[String], externalId: Option[String], externalType: Option[String], active: Option[Boolean], metaData: Option[String]): FilterTreeResponse = {
    // TODO: Implement better logic

    FilterTreeResponse(None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteFilter(accountId: Long, filterId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getFilter(filterId: Long): FilterTreeResponse = {
    // TODO: Implement better logic

    FilterTreeResponse(None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchFilters(accountId: Option[Long], keyword: Option[String], appKey: Option[String], responseGroup: Option[String], rootOnly: Option[Boolean], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], activeOnly: Option[Boolean]): List[FilterResponse] = {
    // TODO: Implement better logic

    List.empty[FilterResponse]
  }

  /**
    * @inheritdoc
    */
  override def updateFilter(accountId: Long, filterId: Long, parentFilterId: Option[Long], name: Option[String], description: Option[String], externalId: Option[String], externalType: Option[String], active: Option[Boolean], metaData: Option[String]): FilterTreeResponse = {
    // TODO: Implement better logic

    FilterTreeResponse(None, None, None, None, None, None, None, None, None, None)
  }
}
