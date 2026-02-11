package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Direction
import model.Route
import model.Shipment
import model.Stop

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class RouteApiController @Inject()(cc: ControllerComponents, api: RouteApi) extends AbstractController(cc) {
  /**
    * POST /api/3.18/route/:routeId/approve
    * @param routeId the id of the route to approve
    */
  def approveRoute(routeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Route = {
      api.approveRoute(routeId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/route/:routeId/copy
    * @param routeId the id of the route to duplicate
    */
  def copyRoute(routeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Route = {
      val body = request.body.asJson.map(_.as[Route])
      api.copyRoute(routeId, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/route
    */
  def createRoute(): Action[AnyContent] = Action { request =>
    def executeApi(): Route = {
      val body = request.body.asJson.map(_.as[Route])
      api.createRoute(body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /api/3.18/route/:routeId/directions
    * @param routeId the id of the route to update directions for
    */
  def createRouteDirections(routeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): List[Direction] = {
      api.createRouteDirections(routeId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /api/3.18/route/:routeId/polyline
    * @param routeId the id of the route to create a polyline for
    */
  def createRoutePolyline(routeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Route = {
      api.createRoutePolyline(routeId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /api/3.18/route/:routeId
    * @param routeId the id of the route
    */
  def deleteRoute(routeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.deleteRoute(routeId)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/3.18/route/:routeId/disapprove
    * @param routeId the id of the route to reject
    */
  def disapproveRoute(routeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Route = {
      api.disapproveRoute(routeId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/route/:routeId?showInheritedProperties=[value]
    * @param routeId the id of the route to get
    */
  def getRoute(routeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Route = {
      val showInheritedProperties = request.getQueryString("showInheritedProperties")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("showInheritedProperties", "query string")
        }
        
      api.getRoute(routeId, showInheritedProperties)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/route/:routeId/directions
    * @param routeId the id of the route to get directions for
    */
  def getRouteDirections(routeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): List[Direction] = {
      api.getRouteDirections(routeId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/route/:routeId/shipments
    * @param routeId the id of the route to get shipments for
    */
  def getRouteShipments(routeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): List[Shipment] = {
      api.getRouteShipments(routeId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/route/:routeId/stop/:stopId
    * @param routeId the id of the route to get stops for
    * @param stopId the id of the specific stop on the route
    */
  def getRouteStop(routeId: Long, stopId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Stop = {
      api.getRouteStop(routeId, stopId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/route/:routeId/stops?confirmedOnly=[value]
    * @param routeId the id of the route
    */
  def getRouteStops(routeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): List[Stop] = {
      val confirmedOnly = request.getQueryString("confirmedOnly")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("confirmedOnly", "query string")
        }
        
      api.getRouteStops(routeId, confirmedOnly)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/route/:routeId/stop/:stopId/shipments
    * @param routeId the id of the route
    * @param stopId the id of the stop to get shipments on
    */
  def getShipmentsAtStop(routeId: Long, stopId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): List[Shipment] = {
      api.getShipmentsAtStop(routeId, stopId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/route/:routeId/optimize
    * @param routeId the id of the route to optimize
    */
  def optimizeRoute(routeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.optimizeRoute(routeId)
    }

    executeApi()
    Ok
  }

  /**
    * DELETE /api/3.18/route/:routeId/stop/:stopId
    * @param routeId the id of the route
    * @param stopId the id of the specific stop to delete on the route
    */
  def removeStop(routeId: Long, stopId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.removeStop(routeId, stopId)
    }

    executeApi()
    Ok
  }

  /**
    * PATCH /api/3.18/route/:routeId/stops/reorder
    * @param routeId the id of the route
    */
  def reorderRouteStopsPatch(routeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): List[Stop] = {
      val body = request.body.asJson.map(_.as[List[Stop]])
      api.reorderRouteStopsPatch(routeId, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/route/:routeId/stops/reorder
    * @param routeId the id of the route
    */
  def reorderRouteStopsPost(routeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): List[Stop] = {
      val body = request.body.asJson.map(_.as[List[Stop]])
      api.reorderRouteStopsPost(routeId, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/route?hubId=[value]&programId=[value]&scheduledStart=[value]&scheduledEnd=[value]&updatedStart=[value]&updatedEnd=[value]&featured=[value]&seatCount=[value]&approved=[value]&started=[value]&completed=[value]&valid=[value]&parentId=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&activeOnly=[value]&includesEmpty=[value]&rootOnly=[value]&showInheritedProperties=[value]
    */
  def searchRoutes(): Action[AnyContent] = Action { request =>
    def executeApi(): List[Route] = {
      val hubId = request.getQueryString("hubId")
        .map(value => value.toLong)
        
      val programId = request.getQueryString("programId")
        .map(value => value.toLong)
        
      val scheduledStart = request.getQueryString("scheduledStart")
        .map(value => value.toLong)
        
      val scheduledEnd = request.getQueryString("scheduledEnd")
        .map(value => value.toLong)
        
      val updatedStart = request.getQueryString("updatedStart")
        .map(value => value.toLong)
        
      val updatedEnd = request.getQueryString("updatedEnd")
        .map(value => value.toLong)
        
      val featured = request.getQueryString("featured")
        .map(value => value.toBoolean)
        
      val seatCount = request.getQueryString("seatCount")
        .map(value => value.toInt)
        
      val approved = request.getQueryString("approved")
        .map(value => value.toBoolean)
        
      val started = request.getQueryString("started")
        .map(value => value.toBoolean)
        
      val completed = request.getQueryString("completed")
        .map(value => value.toBoolean)
        
      val valid = request.getQueryString("valid")
        .map(value => value.toBoolean)
        
      val parentId = request.getQueryString("parentId")
        .map(value => value.toLong)
        
      val sortField = request.getQueryString("sortField")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("sortField", "query string")
        }
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("descending", "query string")
        }
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("start", "query string")
        }
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("limit", "query string")
        }
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("activeOnly", "query string")
        }
        
      val includesEmpty = request.getQueryString("includesEmpty")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("includesEmpty", "query string")
        }
        
      val rootOnly = request.getQueryString("rootOnly")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("rootOnly", "query string")
        }
        
      val showInheritedProperties = request.getQueryString("showInheritedProperties")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("showInheritedProperties", "query string")
        }
        
      api.searchRoutes(sortField, descending, start, limit, activeOnly, includesEmpty, rootOnly, showInheritedProperties, hubId, programId, scheduledStart, scheduledEnd, updatedStart, updatedEnd, featured, seatCount, approved, started, completed, valid, parentId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/route/:id/driver/:driverId
    * @param id the id of the route
    * @param driverId the id of the driver
    */
  def setDriver(id: Long, driverId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.setDriver(id, driverId)
    }

    executeApi()
    Ok
  }

  /**
    * PUT /api/3.18/route/:routeId
    * @param routeId the id of the route
    */
  def updateRoute(routeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Route = {
      val body = request.body.asJson.map(_.as[Route])
      api.updateRoute(routeId, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /api/3.18/route/:routeId/stop/:stopId
    * @param routeId the id of the route to update stops for
    * @param stopId the id of the specific stop to update on the route
    */
  def updateRouteStop(routeId: Long, stopId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val body = request.body.asJson.map(_.as[Stop])
      api.updateRouteStop(routeId, stopId, body)
    }

    executeApi()
    Ok
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
