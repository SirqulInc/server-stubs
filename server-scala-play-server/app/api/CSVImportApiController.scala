package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.CsvImportResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class CSVImportApiController @Inject()(cc: ControllerComponents, api: CSVImportApi) extends AbstractController(cc) {
  /**
    * GET /api/3.18/csvimport/batch/status/details?accountId=[value]&batchId=[value]&responseGroup=[value]&start=[value]&limit=[value]
    */
  def getStatusCSV(): Action[AnyContent] = Action { request =>
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
        
      val responseGroup = request.getQueryString("responseGroup")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("responseGroup", "query string")
        }
        
      val start = request.getQueryString("start")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("start", "query string")
        }
        
      val limit = request.getQueryString("limit")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("limit", "query string")
        }
        
      api.getStatusCSV(accountId, batchId, responseGroup, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/csvimport/batch/list?accountId=[value]&start=[value]&limit=[value]
    */
  def listStatusCSV(): Action[AnyContent] = Action { request =>
    def executeApi(): CsvImportResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
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
        
      api.listStatusCSV(accountId, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/csvimport/batch/status?accountId=[value]&batchId=[value]
    */
  def statusCSV(): Action[AnyContent] = Action { request =>
    def executeApi(): CsvImportResponse = {
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
        
      api.statusCSV(accountId, batchId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/csvimport/upload?accountId=[value]&uploadType=[value]&importFile=[value]&appKey=[value]&fileFormat=[value]
    */
  def uploadCSV(): Action[AnyContent] = Action { request =>
    def executeApi(): CsvImportResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val uploadType = request.getQueryString("uploadType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("uploadType", "query string")
        }
        
      val importFile = request.getQueryString("importFile")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("importFile", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        
      val fileFormat = request.getQueryString("fileFormat")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("fileFormat", "query string")
        }
        
      api.uploadCSV(accountId, uploadType, importFile, fileFormat, appKey)
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
