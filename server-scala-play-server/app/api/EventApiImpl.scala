package api

import model.BigDecimal
import model.EventAttendanceResponse
import model.OfferResponse
import model.OfferShortResponse
import model.SirqulResponse

/**
  * Provides a default implementation for [[EventApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class EventApiImpl extends EventApi {
  /**
    * @inheritdoc
    */
  override def attendEvent(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], appKey: Option[String], listingId: Option[Long], retailerLocationId: Option[Long], offerLocationId: Option[Long], transactionId: Option[Long], status: Option[Int], latitude: Option[Double], longitude: Option[Double]): OfferResponse = {
    // TODO: Implement better logic

    OfferResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def createEvent(version: BigDecimal, accountId: Long, title: String, retailerLocationIds: Option[String], subTitle: Option[String], details: Option[String], categoryIds: Option[String], filterIds: Option[String], active: Option[Boolean], imageAssetId: Option[Long], redeemableStart: Option[Long], redeemableEnd: Option[Long], metaData: Option[String]): OfferResponse = {
    // TODO: Implement better logic

    OfferResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteEvent(version: BigDecimal, accountId: Long, eventId: Long): SirqulResponse = {
    // TODO: Implement better logic

    SirqulResponse(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getEvent(version: BigDecimal, accountId: Long, eventId: Long): OfferResponse = {
    // TODO: Implement better logic

    OfferResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def searchEventTransactions(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], appKey: Option[String], keyword: Option[String], retailerId: Option[Long], retailerLocationId: Option[Long], excludeRetailerLocationId: Option[Long], listingId: Option[Long], offerId: Option[Long], offerLocationId: Option[Long], customerAccountIds: Option[String], affiliatedCategoryIds: Option[String], startDate: Option[Long], endDate: Option[Long], statuses: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int]): List[EventAttendanceResponse] = {
    // TODO: Implement better logic

    List.empty[EventAttendanceResponse]
  }

  /**
    * @inheritdoc
    */
  override def searchEvents(version: BigDecimal, accountId: Long, keyword: Option[String], activeOnly: Option[Boolean], categoryIds: Option[String], filterIds: Option[String], offerAudienceIds: Option[String], transactionAudienceIds: Option[String], sortField: Option[String], descending: Option[Boolean], startDate: Option[Long], endDate: Option[Long], start: Option[Int], limit: Option[Int]): List[OfferShortResponse] = {
    // TODO: Implement better logic

    List.empty[OfferShortResponse]
  }

  /**
    * @inheritdoc
    */
  override def updateEvent(version: BigDecimal, accountId: Long, eventId: Long, retailerLocationIds: Option[String], title: Option[String], subTitle: Option[String], details: Option[String], categoryIds: Option[String], filterIds: Option[String], active: Option[Boolean], imageAssetId: Option[Long], redeemableStart: Option[Long], redeemableEnd: Option[Long]): OfferResponse = {
    // TODO: Implement better logic

    OfferResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
