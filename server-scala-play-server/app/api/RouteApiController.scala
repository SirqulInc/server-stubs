package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.Direction
import model.Route
import model.Shipment
import model.Stop

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class RouteApiController @Inject()(cc: ControllerComponents, api: RouteApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/route/:routeId/approve
    * @param routeId the id of the route to approve
    */
  def approveRoute(version: BigDecimal, routeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Route = {
      api.approveRoute(version, routeId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/route/:routeId/copy
    * @param routeId the id of the route to duplicate
    */
  def copyRoute(version: BigDecimal, routeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Route = {
      val body = request.body.asJson.map(_.as[Route])
      api.copyRoute(version, routeId, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/route
    */
  def createRoute(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): Route = {
      val body = request.body.asJson.map(_.as[Route])
      api.createRoute(version, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /api/:version/route/:routeId/directions
    * @param routeId the id of the route to update directions for
    */
  def createRouteDirections(version: BigDecimal, routeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): List[Direction] = {
      api.createRouteDirections(version, routeId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /api/:version/route/:routeId/polyline
    * @param routeId the id of the route to create a polyline for
    */
  def createRoutePolyline(version: BigDecimal, routeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Route = {
      api.createRoutePolyline(version, routeId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /api/:version/route/:routeId
    * @param routeId the id of the route
    */
  def deleteRoute(version: BigDecimal, routeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.deleteRoute(version, routeId)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/:version/route/:routeId/disapprove
    * @param routeId the id of the route to reject
    */
  def disapproveRoute(version: BigDecimal, routeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Route = {
      api.disapproveRoute(version, routeId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/route/:routeId?showInheritedProperties=[value]
    * @param routeId the id of the route to get
    */
  def getRoute(version: BigDecimal, routeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Route = {
      val showInheritedProperties = request.getQueryString("showInheritedProperties")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("showInheritedProperties", "query string")
        }
        
      api.getRoute(version, routeId, showInheritedProperties)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/route/:routeId/directions
    * @param routeId the id of the route to get directions for
    */
  def getRouteDirections(version: BigDecimal, routeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): List[Direction] = {
      api.getRouteDirections(version, routeId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/route/:routeId/shipments
    * @param routeId the id of the route to get shipments for
    */
  def getRouteShipments(version: BigDecimal, routeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): List[Shipment] = {
      api.getRouteShipments(version, routeId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/route/:routeId/stop/:stopId
    * @param routeId the id of the route to get stops for
    * @param stopId the id of the specific stop on the route
    */
  def getRouteStop(version: BigDecimal, routeId: Long, stopId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Stop = {
      api.getRouteStop(version, routeId, stopId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/route/:routeId/stops?confirmedOnly=[value]
    * @param routeId the id of the route
    */
  def getRouteStops(version: BigDecimal, routeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): List[Stop] = {
      val confirmedOnly = request.getQueryString("confirmedOnly")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("confirmedOnly", "query string")
        }
        
      api.getRouteStops(version, routeId, confirmedOnly)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/route/:routeId/stop/:stopId/shipments
    * @param routeId the id of the route
    * @param stopId the id of the stop to get shipments on
    */
  def getShipmentsAtStop(version: BigDecimal, routeId: Long, stopId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): List[Shipment] = {
      api.getShipmentsAtStop(version, routeId, stopId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/route/:routeId/optimize
    * @param routeId the id of the route to optimize
    */
  def optimizeRoute(version: BigDecimal, routeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.optimizeRoute(version, routeId)
    }

    executeApi()
    Ok
  }

  /**
    * DELETE /api/:version/route/:routeId/stop/:stopId
    * @param routeId the id of the route
    * @param stopId the id of the specific stop to delete on the route
    */
  def removeStop(version: BigDecimal, routeId: Long, stopId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.removeStop(version, routeId, stopId)
    }

    executeApi()
    Ok
  }

  /**
    * PATCH /api/:version/route/:routeId/stops/reorder
    * @param routeId the id of the route
    */
  def reorderRouteStopsPatch(version: BigDecimal, routeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): List[Stop] = {
      val body = request.body.asJson.map(_.as[List[Stop]])
      api.reorderRouteStopsPatch(version, routeId, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/route/:routeId/stops/reorder
    * @param routeId the id of the route
    */
  def reorderRouteStopsPost(version: BigDecimal, routeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): List[Stop] = {
      val body = request.body.asJson.map(_.as[List[Stop]])
      api.reorderRouteStopsPost(version, routeId, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/route?hubId=[value]&programId=[value]&scheduledStart=[value]&scheduledEnd=[value]&updatedStart=[value]&updatedEnd=[value]&featured=[value]&seatCount=[value]&approved=[value]&started=[value]&completed=[value]&valid=[value]&parentId=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&activeOnly=[value]&includesEmpty=[value]&rootOnly=[value]&showInheritedProperties=[value]
    */
  def searchRoutes(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.searchRoutes(version, sortField, descending, start, limit, activeOnly, includesEmpty, rootOnly, showInheritedProperties, hubId, programId, scheduledStart, scheduledEnd, updatedStart, updatedEnd, featured, seatCount, approved, started, completed, valid, parentId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/route/:id/driver/:driverId
    * @param id the id of the route
    * @param driverId the id of the driver
    */
  def setDriver(version: BigDecimal, id: Long, driverId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.setDriver(version, id, driverId)
    }

    executeApi()
    Ok
  }

  /**
    * PUT /api/:version/route/:routeId
    * @param routeId the id of the route
    */
  def updateRoute(version: BigDecimal, routeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Route = {
      val body = request.body.asJson.map(_.as[Route])
      api.updateRoute(version, routeId, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /api/:version/route/:routeId/stop/:stopId
    * @param routeId the id of the route to update stops for
    * @param stopId the id of the specific stop to update on the route
    */
  def updateRouteStop(version: BigDecimal, routeId: Long, stopId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val body = request.body.asJson.map(_.as[Stop])
      api.updateRouteStop(version, routeId, stopId, body)
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
