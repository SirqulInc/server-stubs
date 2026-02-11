package api

import model.Direction
import model.Route
import model.Shipment
import model.Stop

/**
  * Provides a default implementation for [[RouteApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class RouteApiImpl extends RouteApi {
  /**
    * @inheritdoc
    */
  override def approveRoute(routeId: Long): Route = {
    // TODO: Implement better logic

    Route(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def copyRoute(routeId: Long, body: Option[Route]): Route = {
    // TODO: Implement better logic

    Route(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def createRoute(body: Option[Route]): Route = {
    // TODO: Implement better logic

    Route(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def createRouteDirections(routeId: Long): List[Direction] = {
    // TODO: Implement better logic

    List.empty[Direction]
  }

  /**
    * @inheritdoc
    */
  override def createRoutePolyline(routeId: Long): Route = {
    // TODO: Implement better logic

    Route(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def deleteRoute(routeId: Long): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def disapproveRoute(routeId: Long): Route = {
    // TODO: Implement better logic

    Route(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getRoute(routeId: Long, showInheritedProperties: Boolean): Route = {
    // TODO: Implement better logic

    Route(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getRouteDirections(routeId: Long): List[Direction] = {
    // TODO: Implement better logic

    List.empty[Direction]
  }

  /**
    * @inheritdoc
    */
  override def getRouteShipments(routeId: Long): List[Shipment] = {
    // TODO: Implement better logic

    List.empty[Shipment]
  }

  /**
    * @inheritdoc
    */
  override def getRouteStop(routeId: Long, stopId: Long): Stop = {
    // TODO: Implement better logic

    Stop(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getRouteStops(routeId: Long, confirmedOnly: Boolean): List[Stop] = {
    // TODO: Implement better logic

    List.empty[Stop]
  }

  /**
    * @inheritdoc
    */
  override def getShipmentsAtStop(routeId: Long, stopId: Long): List[Shipment] = {
    // TODO: Implement better logic

    List.empty[Shipment]
  }

  /**
    * @inheritdoc
    */
  override def optimizeRoute(routeId: Long): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def removeStop(routeId: Long, stopId: Long): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def reorderRouteStopsPatch(routeId: Long, body: Option[List[Stop]]): List[Stop] = {
    // TODO: Implement better logic

    List.empty[Stop]
  }

  /**
    * @inheritdoc
    */
  override def reorderRouteStopsPost(routeId: Long, body: Option[List[Stop]]): List[Stop] = {
    // TODO: Implement better logic

    List.empty[Stop]
  }

  /**
    * @inheritdoc
    */
  override def searchRoutes(sortField: String, descending: Boolean, start: Int, limit: Int, activeOnly: Boolean, includesEmpty: Boolean, rootOnly: Boolean, showInheritedProperties: Boolean, hubId: Option[Long], programId: Option[Long], scheduledStart: Option[Long], scheduledEnd: Option[Long], updatedStart: Option[Long], updatedEnd: Option[Long], featured: Option[Boolean], seatCount: Option[Int], approved: Option[Boolean], started: Option[Boolean], completed: Option[Boolean], valid: Option[Boolean], parentId: Option[Long]): List[Route] = {
    // TODO: Implement better logic

    List.empty[Route]
  }

  /**
    * @inheritdoc
    */
  override def setDriver(id: Long, driverId: Long): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def updateRoute(routeId: Long, body: Option[Route]): Route = {
    // TODO: Implement better logic

    Route(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def updateRouteStop(routeId: Long, stopId: Long, body: Option[Stop]): Unit = {
    // TODO: Implement better logic

    
  }
}
