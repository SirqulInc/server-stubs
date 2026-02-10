package api

import model.BigDecimal
import model.Direction
import model.Route
import model.Shipment
import model.Stop

/**
  * Provides a default implementation for [[RouteApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class RouteApiImpl extends RouteApi {
  /**
    * @inheritdoc
    */
  override def approveRoute(version: BigDecimal, routeId: Long): Route = {
    // TODO: Implement better logic

    Route(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def copyRoute(version: BigDecimal, routeId: Long, body: Option[Route]): Route = {
    // TODO: Implement better logic

    Route(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def createRoute(version: BigDecimal, body: Option[Route]): Route = {
    // TODO: Implement better logic

    Route(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def createRouteDirections(version: BigDecimal, routeId: Long): List[Direction] = {
    // TODO: Implement better logic

    List.empty[Direction]
  }

  /**
    * @inheritdoc
    */
  override def createRoutePolyline(version: BigDecimal, routeId: Long): Route = {
    // TODO: Implement better logic

    Route(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteRoute(version: BigDecimal, routeId: Long): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def disapproveRoute(version: BigDecimal, routeId: Long): Route = {
    // TODO: Implement better logic

    Route(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getRoute(version: BigDecimal, routeId: Long, showInheritedProperties: Boolean): Route = {
    // TODO: Implement better logic

    Route(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getRouteDirections(version: BigDecimal, routeId: Long): List[Direction] = {
    // TODO: Implement better logic

    List.empty[Direction]
  }

  /**
    * @inheritdoc
    */
  override def getRouteShipments(version: BigDecimal, routeId: Long): List[Shipment] = {
    // TODO: Implement better logic

    List.empty[Shipment]
  }

  /**
    * @inheritdoc
    */
  override def getRouteStop(version: BigDecimal, routeId: Long, stopId: Long): Stop = {
    // TODO: Implement better logic

    Stop(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getRouteStops(version: BigDecimal, routeId: Long, confirmedOnly: Boolean): List[Stop] = {
    // TODO: Implement better logic

    List.empty[Stop]
  }

  /**
    * @inheritdoc
    */
  override def getShipmentsAtStop(version: BigDecimal, routeId: Long, stopId: Long): List[Shipment] = {
    // TODO: Implement better logic

    List.empty[Shipment]
  }

  /**
    * @inheritdoc
    */
  override def optimizeRoute(version: BigDecimal, routeId: Long): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def removeStop(version: BigDecimal, routeId: Long, stopId: Long): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def reorderRouteStopsPatch(version: BigDecimal, routeId: Long, body: Option[List[Stop]]): List[Stop] = {
    // TODO: Implement better logic

    List.empty[Stop]
  }

  /**
    * @inheritdoc
    */
  override def reorderRouteStopsPost(version: BigDecimal, routeId: Long, body: Option[List[Stop]]): List[Stop] = {
    // TODO: Implement better logic

    List.empty[Stop]
  }

  /**
    * @inheritdoc
    */
  override def searchRoutes(version: BigDecimal, sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, includesEmpty: Boolean, rootOnly: Boolean, showInheritedProperties: Boolean, hubId: Option[Long], programId: Option[Long], scheduledStart: Option[Long], scheduledEnd: Option[Long], updatedStart: Option[Long], updatedEnd: Option[Long], featured: Option[Boolean], seatCount: Option[Int], approved: Option[Boolean], started: Option[Boolean], completed: Option[Boolean], valid: Option[Boolean], parentId: Option[Long]): List[Route] = {
    // TODO: Implement better logic

    List.empty[Route]
  }

  /**
    * @inheritdoc
    */
  override def setDriver(version: BigDecimal, id: Long, driverId: Long): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def updateRoute(version: BigDecimal, routeId: Long, body: Option[Route]): Route = {
    // TODO: Implement better logic

    Route(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateRouteStop(version: BigDecimal, routeId: Long, stopId: Long, body: Option[Stop]): Unit = {
    // TODO: Implement better logic

    
  }
}
