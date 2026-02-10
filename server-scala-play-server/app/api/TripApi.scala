package api

import play.api.libs.json._
import model.BigDecimal
import model.Trip

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait TripApi {
  /**
    * Create Trip
    * Create a new trip
    */
  def createTrip(version: BigDecimal, body: Option[Trip]): Trip

  /**
    * Delete Trip
    * Delete an existing trip
    * @param id the id of the trip to delete
    */
  def delete(version: BigDecimal, id: Long): Unit

  /**
    * Set Trip Preference Driver
    * Update trip preference to drive, also create a route and assign the trip to the route
    * @param id the id of the trip
    * @param recurrence the frequency of the trip (e.g. weekly, until 2018-08-09)
    */
  def driveTrip(version: BigDecimal, id: Long, recurrence: Boolean): Trip

  /**
    * Set Trip Preference Flexible
    * Update trip preference to flexible.
    * @param id the id of the trip
    * @param recurrence the frequency of the trip (e.g. weekly, until 2018-08-09)
    */
  def flexibleTrip(version: BigDecimal, id: Long, recurrence: Boolean): Trip

  /**
    * Get Trip
    * Get an existing trip
    * @param id the id of the trip to get
    */
  def getTrip(version: BigDecimal, id: Long): Trip

  /**
    * Get Trip Matches
    * Get matching trips of specific trip
    * @param id The id The id of the trip to search for matches for
    * @param sortField The field to sort by
    * @param descending Determines whether the sorted list is in descending or ascending order
    * @param start The start index for pagination
    * @param limit The limit for pagination
    * @param activeOnly Return only active results
    * @param matchedHasRoute Only return matchings that already have route assigned
    * @param matchedHasDriver Only return matchings that already have driver assigned
    */
  def getTripMatches(version: BigDecimal, id: Long, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, matchedHasRoute: Option[Boolean], matchedHasDriver: Option[Boolean]): List[Trip]

  /**
    * Process Trip Matches
    * Process trip matching, assign trips with no route to matched trips with route.
    * @param startDate The lower bound date to process matchings
    * @param endDate The upper bound date to process matchings
    * @param tripId the id of the trip to process
    */
  def processTripMatches(version: BigDecimal, startDate: Option[Long], endDate: Option[Long], tripId: Option[Long]): List[Trip]

  /**
    * Set Trip Preference Rider
    * Update trip preference to ride.
    * @param id the id of the trip
    * @param recurrence the frequency of the trip (e.g. weekly, until 2018-08-09)
    */
  def ride(version: BigDecimal, id: Long, recurrence: Boolean): Trip

  /**
    * Search Trips
    * Search for trips
    * @param accountId The owner of the trips
    * @param sortField The field to sort by
    * @param descending Determines whether the sorted list is in descending or ascending order
    * @param start The start index for pagination
    * @param limit The limit for pagination
    * @param activeOnly Return only active results
    * @param startDate The lower bound limit of time
    * @param endDate The upper bound limit of time
    * @param hasNotifications whether to search on trips that have notifications or not
    */
  def search(version: BigDecimal, accountId: Long, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, startDate: Option[Long], endDate: Option[Long], hasNotifications: Option[Boolean]): List[Trip]

  /**
    * Search Trips
    * Search for trips with matching information.
    * @param accountId The owner of the trips
    * @param sortField The field to sort by
    * @param descending Determines whether the sorted list is in descending or ascending order
    * @param start The start index for pagination
    * @param limit The limit for pagination
    * @param activeOnly Return only active results
    * @param startDate The lower bound limit of time
    * @param endDate The upper bound limit of time
    * @param matchedHasRoute Only return matchings that already have route assigned
    * @param matchedHasDriver Only return matchings that already have driver assigned
    */
  def searchTrips(version: BigDecimal, accountId: Long, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, startDate: Option[Long], endDate: Option[Long], matchedHasRoute: Option[Boolean], matchedHasDriver: Option[Boolean]): List[Trip]

  /**
    * Update Trip Locations
    * @param id the id of the trip to update locations for
    */
  def updateLocations(version: BigDecimal, id: Long, body: Option[Trip]): Trip

  /**
    * Update Recurrence Locations
    * @param id the id of the trip
    */
  def updateRecurrenceLocations(version: BigDecimal, id: Long, body: Option[Trip]): List[Trip]

  /**
    * Update Recurrence Shipments
    * @param id the id of the trip
    */
  def updateRecurrenceShipments(version: BigDecimal, id: Long, body: Option[Trip]): List[Trip]

  /**
    * Update Trip Shipments
    * @param id the id of the trip shipments to update
    */
  def updateShipments(version: BigDecimal, id: Long, body: Option[Trip]): Trip

  /**
    * Update Trip
    * Update an existing trip. Does not support recurring trip update.
    * @param id the id of the trip to update
    */
  def updateTrip(version: BigDecimal, id: Long, body: Option[Trip]): Trip

  /**
    * Trip Notifications
    * Update the trip notifications
    * @param id the id of the trip
    * @param notifications the notifications to update on the trip
    */
  def updateTripNotifications(version: BigDecimal, id: Long, notifications: Option[String]): Trip
}
