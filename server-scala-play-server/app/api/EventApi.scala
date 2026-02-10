package api

import play.api.libs.json._
import model.BigDecimal
import model.EventAttendanceResponse
import model.OfferResponse
import model.OfferShortResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait EventApi {
  /**
    * Attend Event
    *  Specify whether the user is attending an event at a particular location. This can also be used as a \&quot;check-in\&quot; action.
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id (deviceId or accountId required)
    * @param appKey The application of where to send notifications about the attend action
    * @param listingId The scheduled broadcast or marketing experience id
    * @param retailerLocationId The retailer location where the event is being held
    * @param offerLocationId The actual event being held
    * @param transactionId The wallet item to update the status of, if provided then ignore the listingId, retailerLocationId, and the offerLocationId
    * @param status Sets whether the user is: undecided (0), attending (1), attending and checked in (2), or not attending (3)
    * @param latitude The location of the status update
    * @param longitude The location of the status update
    */
  def attendEvent(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], appKey: Option[String], listingId: Option[Long], retailerLocationId: Option[Long], offerLocationId: Option[Long], transactionId: Option[Long], status: Option[Int], latitude: Option[Double], longitude: Option[Double]): OfferResponse

  /**
    * Create Event
    * Create a private event to share with associates.
    * @param accountId The logged in user.
    * @param title The event title
    * @param retailerLocationIds The retailer location to have the event at
    * @param subTitle The event sub title
    * @param details The event details
    * @param categoryIds The categories the associate the event with
    * @param filterIds The filters the associate the event with
    * @param active Is this event active
    * @param imageAssetId The image to show for the event
    * @param redeemableStart The event start date/time
    * @param redeemableEnd The event end date/time
    * @param metaData external custom client defined data
    */
  def createEvent(version: BigDecimal, accountId: Long, title: String, retailerLocationIds: Option[String], subTitle: Option[String], details: Option[String], categoryIds: Option[String], filterIds: Option[String], active: Option[Boolean], imageAssetId: Option[Long], redeemableStart: Option[Long], redeemableEnd: Option[Long], metaData: Option[String]): OfferResponse

  /**
    * Delete Event
    * Delete an event that the user has permissions to.
    * @param accountId the id of the logged in user
    * @param eventId the id of the event to update
    */
  def deleteEvent(version: BigDecimal, accountId: Long, eventId: Long): SirqulResponse

  /**
    * Get Event
    * Get an event.
    * @param accountId the id of the logged in user
    * @param eventId The id of the event to return
    */
  def getEvent(version: BigDecimal, accountId: Long, eventId: Long): OfferResponse

  /**
    * Search Event Attendance
    * Searches on event type transactions. This can be used to see who is attending an event.
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param appKey The application key
    * @param keyword The keyword to search for
    * @param retailerId Filter results for this retailer
    * @param retailerLocationId Filter results for this retailer location
    * @param excludeRetailerLocationId Exclude results from this retailer location
    * @param listingId Filter results for this event listing
    * @param offerId Filter results for this offer
    * @param offerLocationId Filter results for this offer location
    * @param customerAccountIds Filter results by accounts
    * @param affiliatedCategoryIds Comma separated list of category ids to determine whether the attendee is affiliated with the category
    * @param startDate Filter on attendance starting on or after this date (milliseconds since epoch)
    * @param endDate Filter on attendance starting on or before this date (milliseconds since epoch)
    * @param statuses Comma separated list of transaction statuses to filter on
    * @param sortField Determines what to sort the results by {CREATED, UPDATED, SEARCH_TAGS, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, CUSTOMER_ID, CUSTOMER_DISPLAY, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY}
    * @param descending Determines whether the results are in descending order
    * @param start The start index for pagination
    * @param limit The limit for pagination
    */
  def searchEventTransactions(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], appKey: Option[String], keyword: Option[String], retailerId: Option[Long], retailerLocationId: Option[Long], excludeRetailerLocationId: Option[Long], listingId: Option[Long], offerId: Option[Long], offerLocationId: Option[Long], customerAccountIds: Option[String], affiliatedCategoryIds: Option[String], startDate: Option[Long], endDate: Option[Long], statuses: Option[String], sortField: Option[String], descending: Option[Boolean], start: Option[Int], limit: Option[Int]): List[EventAttendanceResponse]

  /**
    * Search Events
    * Searches on events that the account has access to.
    * @param accountId The logged in user.
    * @param keyword The keyword used to search
    * @param activeOnly Return only active results
    * @param categoryIds the IDs of the categories that this event is associated with
    * @param filterIds the IDs of the filters that this event is associated with
    * @param offerAudienceIds Offer audience ids to filter on
    * @param transactionAudienceIds Transaction audience ids to filter on
    * @param sortField The column to sort the search on. Possible values include: ID, CREATED, UPDATED, ACTIVE, ACTIVATED, EXPIRES, TITLE, SUBTITLE, DETAILS, OFFER_TYPE, SPECIAL_OFFER_TYPE, OFFER_VISIBILITY, ESTIMATED_VALUE, VOUCHER_PRICE, RETAILER_ID, RETAILER_NAME, RETAILER_LOCATION_ID, RETAILER_LOCATION_NAME, BILLABLE_ENTITY_ID, BILLABLE_ENTITY_NAME, RESPONSIBLE_DISPLAY
    * @param descending The order to return the search results
    * @param startDate Filter the events to return only those that start on or after the date
    * @param endDate Filter the events to return only those that start on or before the date
    * @param start The record to begin the return set on
    * @param limit The number of records to return
    */
  def searchEvents(version: BigDecimal, accountId: Long, keyword: Option[String], activeOnly: Option[Boolean], categoryIds: Option[String], filterIds: Option[String], offerAudienceIds: Option[String], transactionAudienceIds: Option[String], sortField: Option[String], descending: Option[Boolean], startDate: Option[Long], endDate: Option[Long], start: Option[Int], limit: Option[Int]): List[OfferShortResponse]

  /**
    * Update Event
    * Update a private event to share with associates.
    * @param accountId The logged in user.
    * @param eventId The id of the event to update
    * @param retailerLocationIds The retailer location to have the event at
    * @param title The event title
    * @param subTitle The event sub title
    * @param details The event details
    * @param categoryIds The categories the associate the event with
    * @param filterIds The filters the associate the event with
    * @param active Is this event active
    * @param imageAssetId The image to show for the event
    * @param redeemableStart The event start date/time
    * @param redeemableEnd The event end date/time
    */
  def updateEvent(version: BigDecimal, accountId: Long, eventId: Long, retailerLocationIds: Option[String], title: Option[String], subTitle: Option[String], details: Option[String], categoryIds: Option[String], filterIds: Option[String], active: Option[Boolean], imageAssetId: Option[Long], redeemableStart: Option[Long], redeemableEnd: Option[Long]): OfferResponse
}
