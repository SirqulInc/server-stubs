package api

import play.api.libs.json._
import model.AvailabilityResponse
import model.BigDecimal
import model.ReservationResponse
import model.TimeSlotResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait ReservationApi {
  /**
    * Create Reservation
    * Creates a reservation on an offer object
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    * @param startDate The start date
    * @param endDate The end date
    * @param offerId The id of the offer being added (offerId or offeLocationId required)
    * @param offerLocationId The id of the offer location being added (offerId or offeLocationId required)
    * @param appKey The application requesting the reservation
    * @param metaData External custom client defined data
    */
  def createReservation(version: BigDecimal, deviceId: Option[String], accountId: Option[Long], startDate: Option[Long], endDate: Option[Long], offerId: Option[Long], offerLocationId: Option[Long], appKey: Option[String], metaData: Option[String]): Unit

  /**
    * Delete Reservation
    * Deleted a reservation on a reservation object
    * @param reservationId The reservation id
    * @param deviceId The device id (deviceId or accountId required)
    * @param accountId The account id of the user (deviceId or accountId required)
    */
  def deleteReservation(version: BigDecimal, reservationId: Long, deviceId: Option[String], accountId: Option[Long]): Unit

  /**
    * Update Availability
    * @param reservableId the id of the reservation
    * @param reservableType the type of reservation
    * @param deviceId the device id of the reservation
    * @param accountId the id of the logged in user
    * @param availability Availability
    * @param availabilitySummary Availability Summary
    */
  def reservableAvailability(version: BigDecimal, reservableId: Long, reservableType: String, deviceId: Option[String], accountId: Option[Long], availability: Option[String], availabilitySummary: Option[String]): List[AvailabilityResponse]

  /**
    * Search Availability
    * @param reservableId the id of the reservation
    * @param reservableType the reservable type
    * @param deviceId the device ID that the reservation is on
    * @param accountId the id of the logged in user
    * @param startDate the start date of the reservation
    * @param endDate the end date of the reservation
    * @param start the start of the index and/or pagination
    * @param limit the limit of the index and/or pagination
    */
  def searchAvailability(version: BigDecimal, reservableId: Long, reservableType: String, deviceId: Option[String], accountId: Option[Long], startDate: Option[Long], endDate: Option[Long], start: Option[Int], limit: Option[Int]): List[AvailabilityResponse]

  /**
    * Search Reservations
    * @param deviceId Device Id
    * @param appKey Appilcation Key
    * @param accountId the id of the logged in user
    * @param filterAccountId filter reservations by account ID
    * @param reservableId the reservation ID
    * @param reservableType the type of reservation
    * @param keyword the keyword to search the reservation on
    * @param startDate the start date of the reservation search
    * @param endDate the end date of the reservation search
    * @param start the start of the index and/or pagination
    * @param limit the limit of the index and/or pagination
    */
  def searchReservations(version: BigDecimal, deviceId: Option[String], appKey: Option[String], accountId: Option[Long], filterAccountId: Option[Long], reservableId: Option[Long], reservableType: Option[String], keyword: Option[String], startDate: Option[Long], endDate: Option[Long], start: Option[Int], limit: Option[Int]): List[ReservationResponse]

  /**
    * Search Schedule
    * @param reservableId the id of the reservation
    * @param reservableType the reservation type
    * @param startDate the start date of the reservation
    * @param endDate the end date of the reservation
    * @param deviceId the id of the device that the reservation is on
    * @param accountId the id of the logged in user
    * @param timeBucketMins the length of time in minutes to search on for reservation
    */
  def searchSchedule(version: BigDecimal, reservableId: Long, reservableType: String, startDate: Long, endDate: Long, deviceId: Option[String], accountId: Option[Long], timeBucketMins: Option[Int]): List[TimeSlotResponse]
}
