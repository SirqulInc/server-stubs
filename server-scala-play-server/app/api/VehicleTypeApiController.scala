package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.VehicleType

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class VehicleTypeApiController @Inject()(cc: ControllerComponents, api: VehicleTypeApi) extends AbstractController(cc) {
  /**
    * POST /api/3.18/vehicle/type?vehicleType=[value]
    */
  def createVehicleType(): Action[AnyContent] = Action { request =>
    def executeApi(): VehicleType = {
      val body = request.body.asJson.map(_.as[VehicleType])
      val vehicleType = request.getQueryString("vehicleType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vehicleType", "query string")
        }
        
      api.createVehicleType(vehicleType, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /api/3.18/vehicle/type/:vehicleTypeId
    * @param vehicleTypeId The id of the requested vehicle type
    */
  def deleteVehicleType(vehicleTypeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.deleteVehicleType(vehicleTypeId)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/3.18/vehicle/type/:vehicleTypeId
    * @param vehicleTypeId The id of the requested vehicle type
    */
  def getVehicleType(vehicleTypeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): VehicleType = {
      api.getVehicleType(vehicleTypeId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/vehicle/type?retailerId=[value]&hubId=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&activeOnly=[value]
    */
  def searchVehicleTypes(): Action[AnyContent] = Action { request =>
    def executeApi(): List[VehicleType] = {
      val retailerId = request.getQueryString("retailerId")
        .map(value => value.toLong)
        
      val hubId = request.getQueryString("hubId")
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
        
      api.searchVehicleTypes(sortField, descending, start, limit, activeOnly, retailerId, hubId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /api/3.18/vehicle/type/:vehicleTypeId?vehicleType=[value]
    * @param vehicleTypeId The id of the vehicle type to update
    */
  def updateVehicleType(vehicleTypeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): VehicleType = {
      val body = request.body.asJson.map(_.as[VehicleType])
      val vehicleType = request.getQueryString("vehicleType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("vehicleType", "query string")
        }
        
      api.updateVehicleType(vehicleTypeId, vehicleType, body)
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
