package api

import model.Trip

/**
  * Provides a default implementation for [[TripApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class TripApiImpl extends TripApi {
  /**
    * @inheritdoc
    */
  override def createTrip(body: Option[Trip]): Trip = {
    // TODO: Implement better logic

    Trip(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def delete(id: Long): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def driveTrip(id: Long, recurrence: Boolean): Trip = {
    // TODO: Implement better logic

    Trip(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def flexibleTrip(id: Long, recurrence: Boolean): Trip = {
    // TODO: Implement better logic

    Trip(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getTrip(id: Long): Trip = {
    // TODO: Implement better logic

    Trip(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getTripMatches(id: Long, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, matchedHasRoute: Option[Boolean], matchedHasDriver: Option[Boolean]): List[Trip] = {
    // TODO: Implement better logic

    List.empty[Trip]
  }

  /**
    * @inheritdoc
    */
  override def processTripMatches(startDate: Option[Long], endDate: Option[Long], tripId: Option[Long]): List[Trip] = {
    // TODO: Implement better logic

    List.empty[Trip]
  }

  /**
    * @inheritdoc
    */
  override def ride(id: Long, recurrence: Boolean): Trip = {
    // TODO: Implement better logic

    Trip(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def search(accountId: Long, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, startDate: Option[Long], endDate: Option[Long], hasNotifications: Option[Boolean]): List[Trip] = {
    // TODO: Implement better logic

    List.empty[Trip]
  }

  /**
    * @inheritdoc
    */
  override def searchTrips(accountId: Long, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, startDate: Option[Long], endDate: Option[Long], matchedHasRoute: Option[Boolean], matchedHasDriver: Option[Boolean]): List[Trip] = {
    // TODO: Implement better logic

    List.empty[Trip]
  }

  /**
    * @inheritdoc
    */
  override def updateLocations(id: Long, body: Option[Trip]): Trip = {
    // TODO: Implement better logic

    Trip(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateRecurrenceLocations(id: Long, body: Option[Trip]): List[Trip] = {
    // TODO: Implement better logic

    List.empty[Trip]
  }

  /**
    * @inheritdoc
    */
  override def updateRecurrenceShipments(id: Long, body: Option[Trip]): List[Trip] = {
    // TODO: Implement better logic

    List.empty[Trip]
  }

  /**
    * @inheritdoc
    */
  override def updateShipments(id: Long, body: Option[Trip]): Trip = {
    // TODO: Implement better logic

    Trip(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateTrip(id: Long, body: Option[Trip]): Trip = {
    // TODO: Implement better logic

    Trip(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateTripNotifications(id: Long, notifications: Option[String]): Trip = {
    // TODO: Implement better logic

    Trip(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
