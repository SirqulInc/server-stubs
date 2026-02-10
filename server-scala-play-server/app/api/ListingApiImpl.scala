package api

import model.BigDecimal
import model.ListingFullResponse
import model.ListingGroupResponse
import model.ListingResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[ListingApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class ListingApiImpl extends ListingApi {
  /**
    * @inheritdoc
    */
  override def createListing(version: BigDecimal, accountId: Long, name: String, filterIds: Option[String], description: Option[String], start: Option[Long], end: Option[Long], locationName: Option[String], locationDescription: Option[String], isPrivate: Option[Boolean], externalId: Option[String], externalId2: Option[String], externalGroupId: Option[String], active: Option[Boolean], metaData: Option[String]): ListingFullResponse = {
    // TODO: Implement better logic

    ListingFullResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteListing(version: BigDecimal, accountId: Long, listingId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getListing(version: BigDecimal, listingId: Long): ListingFullResponse = {
    // TODO: Implement better logic

    ListingFullResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchListing(version: BigDecimal, accountId: Option[Long], keyword: Option[String], start: Option[Int], limit: Option[Int], activeOnly: Option[Boolean], latitude: Option[Double], longitude: Option[Double], startDate: Option[Long], endDate: Option[Long], categoryIds: Option[String], filterIds: Option[String], useListingOrderIds: Option[Boolean], externalId: Option[String], externalId2: Option[String], externalGroupId: Option[String]): List[ListingResponse] = {
    // TODO: Implement better logic

    List.empty[ListingResponse]
  }

  /**
    * @inheritdoc
    */
  override def summaryListing(version: BigDecimal, accountId: Option[Long], startDate: Option[Long], categoryIds: Option[String], daysToInclude: Option[Int], useListingOrderIds: Option[Boolean]): List[ListingGroupResponse] = {
    // TODO: Implement better logic

    List.empty[ListingGroupResponse]
  }

  /**
    * @inheritdoc
    */
  override def updateListing(version: BigDecimal, accountId: Long, listingId: Long, filterIds: Option[String], name: Option[String], description: Option[String], start: Option[Long], end: Option[Long], locationName: Option[String], locationDescription: Option[String], isPrivate: Option[Boolean], externalId: Option[String], externalId2: Option[String], externalGroupId: Option[String], active: Option[Boolean], metaData: Option[String]): ListingFullResponse = {
    // TODO: Implement better logic

    ListingFullResponse(None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
