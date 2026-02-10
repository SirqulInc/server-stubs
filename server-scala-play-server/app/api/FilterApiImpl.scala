package api

import model.BigDecimal
import model.FilterResponse
import model.FilterTreeResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[FilterApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class FilterApiImpl extends FilterApi {
  /**
    * @inheritdoc
    */
  override def createFilter(version: BigDecimal, accountId: Long, name: String, appKey: Option[String], parentFilterId: Option[Long], description: Option[String], externalId: Option[String], externalType: Option[String], active: Option[Boolean], metaData: Option[String]): FilterTreeResponse = {
    // TODO: Implement better logic

    FilterTreeResponse(None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteFilter(version: BigDecimal, accountId: Long, filterId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getFilter(version: BigDecimal, filterId: Long): FilterTreeResponse = {
    // TODO: Implement better logic

    FilterTreeResponse(None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchFilters(version: BigDecimal, accountId: Option[Long], keyword: Option[String], appKey: Option[String], responseGroup: Option[String], rootOnly: Option[Boolean], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int], activeOnly: Option[Boolean]): List[FilterResponse] = {
    // TODO: Implement better logic

    List.empty[FilterResponse]
  }

  /**
    * @inheritdoc
    */
  override def updateFilter(version: BigDecimal, accountId: Long, filterId: Long, parentFilterId: Option[Long], name: Option[String], description: Option[String], externalId: Option[String], externalType: Option[String], active: Option[Boolean], metaData: Option[String]): FilterTreeResponse = {
    // TODO: Implement better logic

    FilterTreeResponse(None, None, None, None, None, None, None, None, None, None)
  }
}
