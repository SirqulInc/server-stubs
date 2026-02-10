package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.CargoType

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class CargoTypeApiController @Inject()(cc: ControllerComponents, api: CargoTypeApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/cargo/type
    */
  def createCargoType(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): CargoType = {
      val body = request.body.asJson.map(_.as[CargoType])
      api.createCargoType(version, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /api/:version/cargo/type/:cargoTypeId
    * @param cargoTypeId the ID of the cargo type
    */
  def deleteCargoType(version: BigDecimal, cargoTypeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.deleteCargoType(version, cargoTypeId)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/cargo/type/:cargoTypeId
    * @param cargoTypeId the cargo type ID
    */
  def getCargoType(version: BigDecimal, cargoTypeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): CargoType = {
      api.getCargoType(version, cargoTypeId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/cargo/type?retailerId=[value]&hubId=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&activeOnly=[value]
    */
  def searchCargoTypes(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[CargoType] = {
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
        
      api.searchCargoTypes(version, sortField, descending, start, limit, activeOnly, retailerId, hubId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PUT /api/:version/cargo/type/:cargoTypeId
    * @param cargoTypeId the ID of the cargo type
    */
  def updateCargoType(version: BigDecimal, cargoTypeId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): CargoType = {
      val body = request.body.asJson.map(_.as[CargoType])
      api.updateCargoType(version, cargoTypeId, body)
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
