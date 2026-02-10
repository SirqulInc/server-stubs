package api

import play.api.libs.json._
import model.BigDecimal
import model.Direction
import model.Route
import model.Shipment
import model.Stop

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait RouteApi {
  /**
    * Approve Route
    * Approve a route
    * @param routeId the id of the route to approve
    */
  def approveRoute(version: BigDecimal, routeId: Long): Route

  /**
    * Copy Route
    * Make an copy of the given route with optional overriding properties
    * @param routeId the id of the route to duplicate
    */
  def copyRoute(version: BigDecimal, routeId: Long, body: Option[Route]): Route

  /**
    * Create Route
    * Create new route
    */
  def createRoute(version: BigDecimal, body: Option[Route]): Route

  /**
    * Update Route Directions
    * Regenerate the directions of a route
    * @param routeId the id of the route to update directions for
    */
  def createRouteDirections(version: BigDecimal, routeId: Long): List[Direction]

  /**
    * Create Route Polyline
    * Update the polyline of the requested route
    * @param routeId the id of the route to create a polyline for
    */
  def createRoutePolyline(version: BigDecimal, routeId: Long): Route

  /**
    * Delete Route
    * Delete an existing route
    * @param routeId the id of the route
    */
  def deleteRoute(version: BigDecimal, routeId: Long): Unit

  /**
    * Disapprove Route
    * Disapprove a route
    * @param routeId the id of the route to reject
    */
  def disapproveRoute(version: BigDecimal, routeId: Long): Route

  /**
    * Get Route
    * Get an existing route
    * @param routeId the id of the route to get
    * @param showInheritedProperties return inherited properties from parent or not
    */
  def getRoute(version: BigDecimal, routeId: Long, showInheritedProperties: Boolean): Route

  /**
    * Get Route Directions
    * Get the directions of a route
    * @param routeId the id of the route to get directions for
    */
  def getRouteDirections(version: BigDecimal, routeId: Long): List[Direction]

  /**
    * Get Route Shipments
    * Get the shipments on the requested route
    * @param routeId the id of the route to get shipments for
    */
  def getRouteShipments(version: BigDecimal, routeId: Long): List[Shipment]

  /**
    * Get Route Stop
    * Get the specific stop on a route
    * @param routeId the id of the route to get stops for
    * @param stopId the id of the specific stop on the route
    */
  def getRouteStop(version: BigDecimal, routeId: Long, stopId: Long): Stop

  /**
    * Get Route Stops
    * The stops of the route requested
    * @param routeId the id of the route
    * @param confirmedOnly only get stops that have been confirmed or not
    */
  def getRouteStops(version: BigDecimal, routeId: Long, confirmedOnly: Boolean): List[Stop]

  /**
    * Get Shipments At Stop
    * Get the list of shipments on the requested route at a stop
    * @param routeId the id of the route
    * @param stopId the id of the stop to get shipments on
    */
  def getShipmentsAtStop(version: BigDecimal, routeId: Long, stopId: Long): List[Shipment]

  /**
    * Optimize Route
    * Optimize a route. The optimization method based on how the server is configured.
    * @param routeId the id of the route to optimize
    */
  def optimizeRoute(version: BigDecimal, routeId: Long): Unit

  /**
    * Delete Stop
    * Delete a stop on a route
    * @param routeId the id of the route
    * @param stopId the id of the specific stop to delete on the route
    */
  def removeStop(version: BigDecimal, routeId: Long, stopId: Long): Unit

  /**
    * Reorder Route Stops
    * Reordering the stops on the route with and update route distance, time, direction, and polyline
    * @param routeId the id of the route
    */
  def reorderRouteStopsPatch(version: BigDecimal, routeId: Long, body: Option[List[Stop]]): List[Stop]

  /**
    * Reorder Route Stops
    * Reordering the stops on the route with and update route distance, time, direction, and polyline
    * @param routeId the id of the route
    */
  def reorderRouteStopsPost(version: BigDecimal, routeId: Long, body: Option[List[Stop]]): List[Stop]

  /**
    * Search Routes
    * Search for routes.
    * @param sortField The field to sort by
    * @param descending Determines whether the sorted list is in descending or ascending order
    * @param start The start index for pagination
    * @param limit The limit for pagination
    * @param activeOnly Return only active results
    * @param includesEmpty Include empty routes or not
    * @param rootOnly Only return root instance routes
    * @param showInheritedProperties Display root route properties
    * @param hubId Filter results by service hub
    * @param programId Filter results by program
    * @param scheduledStart The start date to filter the results by
    * @param scheduledEnd The end date to filter the results by
    * @param updatedStart The lower bound of updated date
    * @param updatedEnd The upper bound of updated date
    * @param featured The route is featured or not
    * @param seatCount Has at least this many seat available
    * @param approved Has been approved or not
    * @param started Has started or not
    * @param completed Has completed or not
    * @param valid Is valid or not
    * @param parentId If it is a recurring route based on the parent route
    */
  def searchRoutes(version: BigDecimal, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, includesEmpty: Boolean, rootOnly: Boolean, showInheritedProperties: Boolean, hubId: Option[Long], programId: Option[Long], scheduledStart: Option[Long], scheduledEnd: Option[Long], updatedStart: Option[Long], updatedEnd: Option[Long], featured: Option[Boolean], seatCount: Option[Int], approved: Option[Boolean], started: Option[Boolean], completed: Option[Boolean], valid: Option[Boolean], parentId: Option[Long]): List[Route]

  /**
    * Set Driver
    * Update the driver of the route.
    * @param id the id of the route
    * @param driverId the id of the driver
    */
  def setDriver(version: BigDecimal, id: Long, driverId: Long): Unit

  /**
    * Update Route
    * Update an existing route
    * @param routeId the id of the route
    */
  def updateRoute(version: BigDecimal, routeId: Long, body: Option[Route]): Route

  /**
    * Update Route Stop
    * Update a stop on a specified route
    * @param routeId the id of the route to update stops for
    * @param stopId the id of the specific stop to update on the route
    */
  def updateRouteStop(version: BigDecimal, routeId: Long, stopId: Long, body: Option[Stop]): Unit
}
