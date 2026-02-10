package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.ShipmentBatch
import model.ShipmentImportStatus

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class ShipmentBatchApiController @Inject()(cc: ControllerComponents, api: ShipmentBatchApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/shipment/batch
    */
  def createShipmentBatch(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ShipmentBatch = {
      val body = request.body.asJson.map(_.as[ShipmentBatch])
      api.createShipmentBatch(version, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /api/:version/shipment/batch/:batchId
    * @param batchId the id of the shipment batch to delete
    */
  def deleteShipmentBatch(version: BigDecimal, batchId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      api.deleteShipmentBatch(version, batchId)
    }

    executeApi()
    Ok
  }

  /**
    * GET /api/:version/shipment/batch/:batchId
    * @param batchId the id of the shipment batch to get
    */
  def getShipmentBatch(version: BigDecimal, batchId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): ShipmentBatch = {
      api.getShipmentBatch(version, batchId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/shipment/batch/:batchId/status?accountId=[value]&valid=[value]&started=[value]&completed=[value]&hasShipment=[value]&hasRoute=[value]&keyword=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]
    * @param batchId The id of the requested shipment batch
    */
  def getShipmentBatchStatus(version: BigDecimal, batchId: Long): Action[AnyContent] = Action { request =>
    def executeApi(): List[ShipmentImportStatus] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val valid = request.getQueryString("valid")
        .map(value => value.toBoolean)
        
      val started = request.getQueryString("started")
        .map(value => value.toBoolean)
        
      val completed = request.getQueryString("completed")
        .map(value => value.toBoolean)
        
      val hasShipment = request.getQueryString("hasShipment")
        .map(value => value.toBoolean)
        
      val hasRoute = request.getQueryString("hasRoute")
        .map(value => value.toBoolean)
        
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
        
      api.getShipmentBatchStatus(version, batchId, accountId, sortField, descending, start, limit, valid, started, completed, hasShipment, hasRoute, keyword)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/shipment/batch?hubId=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]
    */
  def searchShipmentBatch(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[ShipmentBatch] = {
      val hubId = request.getQueryString("hubId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("hubId", "query string")
        }
        
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
        
      api.searchShipmentBatch(version, hubId, sortField, descending, start, limit)
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
