package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Shipment

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class ShipmentApiController @Inject()(cc: ControllerComponents, api: ShipmentApi) extends AbstractController(cc) {
  /**
    * POST /api/3.18/shipment/:id/cancel
    * @param id the id of the shipment to cancel
    */
  def cancelShipment(id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.cancelShipment(id)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/3.18/shipment
    */
  def createShipment(): Action[AnyContent] = Action { request =>
    def executeApi(): Shipment = {
      val body = request.body.asJson.map(_.as[Shipment])
      api.createShipment(body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /api/3.18/shipment/:id
    * @param id the id of the shipment to delete
    */
  def deleteShipment(id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.deleteShipment(id)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/shipment/:id
    * @param id the id of the shipment to get
    */
  def getShipment(id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Shipment = {
      api.getShipment(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/shipment?ownerId=[value]&riderId=[value]&routeId=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&activeOnly=[value]
    */
  def searchShipments(): Action[AnyContent] = Action { request =>
    def executeApi(): List[Shipment] = {
      val ownerId = request.getQueryString("ownerId")
        .map(value => value.toLong)
        
      val riderId = request.getQueryString("riderId")
        .map(value => value.toLong)
        
      val routeId = request.getQueryString("routeId")
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
        
      api.searchShipments(sortField, descending, start, limit, activeOnly, ownerId, riderId, routeId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /api/3.18/shipment/:id
    * @param id the id of the shipment to update
    */
  def updateShipment(id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Shipment = {
      val body = request.body.asJson.map(_.as[Shipment])
      api.updateShipment(id, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/shipment/:id/status
    * @param id the id of the shipment to update status
    */
  def updateShipmentStatus(id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val body = request.body.asJson.map(_.as[Map[String, Boolean]])
      api.updateShipmentStatus(id, body)
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
