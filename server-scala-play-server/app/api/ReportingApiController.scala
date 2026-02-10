package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.RegionLegSummary
import model.ReportBatchResponse
import model.ReportRegionLegSummaryBatchResponse
import model.ReportResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class ReportingApiController @Inject()(cc: ControllerComponents, api: ReportingApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/report/batch/create?accountId=[value]&appKey=[value]&status=[value]&endpoint=[value]&parameters=[value]&name=[value]&startDate=[value]&endDate=[value]&description=[value]&previewLimit=[value]&pageUrl=[value]
    */
  def createBatch(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ReportBatchResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        
      val status = request.getQueryString("status")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("status", "query string")
        }
        
      val endpoint = request.getQueryString("endpoint")
        
      val parameters = request.getQueryString("parameters")
        
      val name = request.getQueryString("name")
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        
      val description = request.getQueryString("description")
        
      val previewLimit = request.getQueryString("previewLimit")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("previewLimit", "query string")
        }
        
      val pageUrl = request.getQueryString("pageUrl")
        
      api.createBatch(version, accountId, status, previewLimit, appKey, endpoint, parameters, name, startDate, endDate, description, pageUrl)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/report/region/summary/batch
    */
  def createRegionLegSummaryBatch(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ReportRegionLegSummaryBatchResponse = {
      val body = request.body.asJson.map(_.as[List[RegionLegSummary]])
      api.createRegionLegSummaryBatch(version, body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/report/batch/delete?accountId=[value]&batchId=[value]
    */
  def deleteBatch(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val batchId = request.getQueryString("batchId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("batchId", "query string")
        }
        
      api.deleteBatch(version, accountId, batchId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/report/batch/get?accountId=[value]&batchId=[value]&allResults=[value]
    */
  def getReportBatch(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ReportBatchResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val batchId = request.getQueryString("batchId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("batchId", "query string")
        }
        
      val allResults = request.getQueryString("allResults")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("allResults", "query string")
        }
        
      api.getReportBatch(version, accountId, batchId, allResults)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/report/run?accountId=[value]&query=[value]&parameters=[value]&order=[value]&desc=[value]&start=[value]&limit=[value]&responseFormat=[value]
    */
  def runReport(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ReportResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val query = request.getQueryString("query")
        
      val parameters = request.getQueryString("parameters")
        
      val order = request.getQueryString("order")
        
      val desc = request.getQueryString("desc")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("desc", "query string")
        }
        
      val start = request.getQueryString("start")
        .map(value => value.toLong)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toLong)
        
      val responseFormat = request.getQueryString("responseFormat")
        
      api.runReport(version, desc, accountId, query, parameters, order, start, limit, responseFormat)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/report/batch/search?accountId=[value]&names=[value]&appKey=[value]&status=[value]&globalAppSearch=[value]&startDate=[value]&endDate=[value]&start=[value]&limit=[value]
    */
  def searchBatch(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[ReportBatchResponse] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val names = request.getQueryString("names")
        
      val appKey = request.getQueryString("appKey")
        
      val status = request.getQueryString("status")
        
      val globalAppSearch = request.getQueryString("globalAppSearch")
        .map(value => value.toBoolean)
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        
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
        
      api.searchBatch(version, accountId, start, limit, names, appKey, status, globalAppSearch, startDate, endDate)
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
