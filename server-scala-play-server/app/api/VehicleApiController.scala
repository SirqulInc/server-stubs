package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.Vehicle

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class VehicleApiController @Inject()(cc: ControllerComponents, api: VehicleApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/vehicle?vehicle=[value]
    */
  def createVehicle(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): Vehicle = {
      val body = request.body.asJson.map(_.as[Vehicle])
      val vehicle = request.getQueryString("vehicle")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vehicle", "query string")
        }
        
      api.createVehicle(version, vehicle, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /api/:version/vehicle/:id
    * @param id The id of the vehicle to delete
    */
  def deleteVehicle(version: BigDecimal, id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.deleteVehicle(version, id)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/vehicle/:id
    * @param id The id of the vehicle requested
    */
  def getVehicle(version: BigDecimal, id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Vehicle = {
      api.getVehicle(version, id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/vehicle?hubId=[value]&keyword=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&activeOnly=[value]
    */
  def searchVehicle(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[Vehicle] = {
      val hubId = request.getQueryString("hubId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("hubId", "query string")
        }
        
      val keyword = request.getQueryString("keyword")
        
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
        
      api.searchVehicle(version, hubId, sortField, descending, start, limit, activeOnly, keyword)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /api/:version/vehicle/:id?vehicle=[value]
    * @param id The id of the vehicle to update
    */
  def updateVehicle(version: BigDecimal, id: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Vehicle = {
      val body = request.body.asJson.map(_.as[Vehicle])
      val vehicle = request.getQueryString("vehicle")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vehicle", "query string")
        }
        
      api.updateVehicle(version, id, vehicle, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
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
