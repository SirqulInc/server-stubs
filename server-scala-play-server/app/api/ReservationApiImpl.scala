package api

import model.AvailabilityResponse
import model.ReservationResponse
import model.TimeSlotResponse

/**
  * Provides a default implementation for [[ReservationApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class ReservationApiImpl extends ReservationApi {
  /**
    * @inheritdoc
    */
  override def createReservation(deviceId: Option[String], accountId: Option[Long], startDate: Option[Long], endDate: Option[Long], offerId: Option[Long], offerLocationId: Option[Long], appKey: Option[String], metaData: Option[String]): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def deleteReservation(reservationId: Long, deviceId: Option[String], accountId: Option[Long]): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def reservableAvailability(reservableId: Long, reservableType: String, deviceId: Option[String], accountId: Option[Long], availability: Option[String], availabilitySummary: Option[String]): List[AvailabilityResponse] = {
    // TODO: Implement better logic

    List.empty[AvailabilityResponse]
  }

  /**
    * @inheritdoc
    */
  override def searchAvailability(reservableId: Long, reservableType: String, deviceId: Option[String], accountId: Option[Long], startDate: Option[Long], endDate: Option[Long], start: Option[Int], limit: Option[Int]): List[AvailabilityResponse] = {
    // TODO: Implement better logic

    List.empty[AvailabilityResponse]
  }

  /**
    * @inheritdoc
    */
  override def searchReservations(deviceId: Option[String], appKey: Option[String], accountId: Option[Long], filterAccountId: Option[Long], reservableId: Option[Long], reservableType: Option[String], keyword: Option[String], startDate: Option[Long], endDate: Option[Long], start: Option[Int], limit: Option[Int]): List[ReservationResponse] = {
    // TODO: Implement better logic

    List.empty[ReservationResponse]
  }

  /**
    * @inheritdoc
    */
  override def searchSchedule(reservableId: Long, reservableType: String, startDate: Long, endDate: Long, deviceId: Option[String], accountId: Option[Long], timeBucketMins: Option[Int]): List[TimeSlotResponse] = {
    // TODO: Implement better logic

    List.empty[TimeSlotResponse]
  }
}
