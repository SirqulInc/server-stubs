package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.ImportStatuses
import model.Orders
import model.ShipmentOrder

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class OptimizeApiController @Inject()(cc: ControllerComponents, api: OptimizeApi) extends AbstractController(cc) {
  /**
    * GET /api/:version/optimize/result/:batchID?start=[value]&limit=[value]
    * @param batchID The batchID for getting the import status of.
    */
  def getOptimizationResult(version: BigDecimal, batchID: String): Action[AnyContent] = Action { request =>
    def executeApi(): Map[String, ShipmentOrder] = {
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
        
      api.getOptimizationResult(version, batchID, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/optimize/request
    */
  def requestOptimization(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ImportStatuses = {
      val body = request.body.asJson.map(_.as[Orders])
      api.requestOptimization(version, body)
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
