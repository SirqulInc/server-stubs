package api

import model.BigDecimal
import model.Trip

/**
  * Provides a default implementation for [[TripApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class TripApiImpl extends TripApi {
  /**
    * @inheritdoc
    */
  override def createTrip(version: BigDecimal, body: Option[Trip]): Trip = {
    // TODO: Implement better logic

    Trip(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def delete(version: BigDecimal, id: Long): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def driveTrip(version: BigDecimal, id: Long, recurrence: Boolean): Trip = {
    // TODO: Implement better logic

    Trip(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def flexibleTrip(version: BigDecimal, id: Long, recurrence: Boolean): Trip = {
    // TODO: Implement better logic

    Trip(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getTrip(version: BigDecimal, id: Long): Trip = {
    // TODO: Implement better logic

    Trip(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getTripMatches(version: BigDecimal, id: Long, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, matchedHasRoute: Option[Boolean], matchedHasDriver: Option[Boolean]): List[Trip] = {
    // TODO: Implement better logic

    List.empty[Trip]
  }

  /**
    * @inheritdoc
    */
  override def processTripMatches(version: BigDecimal, startDate: Option[Long], endDate: Option[Long], tripId: Option[Long]): List[Trip] = {
    // TODO: Implement better logic

    List.empty[Trip]
  }

  /**
    * @inheritdoc
    */
  override def ride(version: BigDecimal, id: Long, recurrence: Boolean): Trip = {
    // TODO: Implement better logic

    Trip(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def search(version: BigDecimal, accountId: Long, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, startDate: Option[Long], endDate: Option[Long], hasNotifications: Option[Boolean]): List[Trip] = {
    // TODO: Implement better logic

    List.empty[Trip]
  }

  /**
    * @inheritdoc
    */
  override def searchTrips(version: BigDecimal, accountId: Long, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, startDate: Option[Long], endDate: Option[Long], matchedHasRoute: Option[Boolean], matchedHasDriver: Option[Boolean]): List[Trip] = {
    // TODO: Implement better logic

    List.empty[Trip]
  }

  /**
    * @inheritdoc
    */
  override def updateLocations(version: BigDecimal, id: Long, body: Option[Trip]): Trip = {
    // TODO: Implement better logic

    Trip(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateRecurrenceLocations(version: BigDecimal, id: Long, body: Option[Trip]): List[Trip] = {
    // TODO: Implement better logic

    List.empty[Trip]
  }

  /**
    * @inheritdoc
    */
  override def updateRecurrenceShipments(version: BigDecimal, id: Long, body: Option[Trip]): List[Trip] = {
    // TODO: Implement better logic

    List.empty[Trip]
  }

  /**
    * @inheritdoc
    */
  override def updateShipments(version: BigDecimal, id: Long, body: Option[Trip]): Trip = {
    // TODO: Implement better logic

    Trip(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateTrip(version: BigDecimal, id: Long, body: Option[Trip]): Trip = {
    // TODO: Implement better logic

    Trip(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateTripNotifications(version: BigDecimal, id: Long, notifications: Option[String]): Trip = {
    // TODO: Implement better logic

    Trip(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
