package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.FilterResponse
import model.FilterTreeResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class FilterApiController @Inject()(cc: ControllerComponents, api: FilterApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/filter/create?accountId=[value]&appKey=[value]&parentFilterId=[value]&name=[value]&description=[value]&externalId=[value]&externalType=[value]&active=[value]&metaData=[value]
    */
  def createFilter(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): FilterTreeResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        
      val parentFilterId = request.getQueryString("parentFilterId")
        .map(value => value.toLong)
        
      val name = request.getQueryString("name")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("name", "query string")
        }
        
      val description = request.getQueryString("description")
        
      val externalId = request.getQueryString("externalId")
        
      val externalType = request.getQueryString("externalType")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val metaData = request.getQueryString("metaData")
        
      api.createFilter(version, accountId, name, appKey, parentFilterId, description, externalId, externalType, active, metaData)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/filter/delete?accountId=[value]&filterId=[value]
    */
  def deleteFilter(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val filterId = request.getQueryString("filterId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("filterId", "query string")
        }
        
      api.deleteFilter(version, accountId, filterId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/filter/get?filterId=[value]
    */
  def getFilter(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): FilterTreeResponse = {
      val filterId = request.getQueryString("filterId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("filterId", "query string")
        }
        
      api.getFilter(version, filterId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/filter/search?accountId=[value]&keyword=[value]&appKey=[value]&responseGroup=[value]&rootOnly=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&activeOnly=[value]
    */
  def searchFilters(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[FilterResponse] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val keyword = request.getQueryString("keyword")
        
      val appKey = request.getQueryString("appKey")
        
      val responseGroup = request.getQueryString("responseGroup")
        
      val rootOnly = request.getQueryString("rootOnly")
        .map(value => value.toBoolean)
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        
      api.searchFilters(version, accountId, keyword, appKey, responseGroup, rootOnly, sortField, descending, start, limit, activeOnly)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/filter/update?accountId=[value]&filterId=[value]&parentFilterId=[value]&name=[value]&description=[value]&externalId=[value]&externalType=[value]&active=[value]&metaData=[value]
    */
  def updateFilter(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): FilterTreeResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val filterId = request.getQueryString("filterId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("filterId", "query string")
        }
        
      val parentFilterId = request.getQueryString("parentFilterId")
        .map(value => value.toLong)
        
      val name = request.getQueryString("name")
        
      val description = request.getQueryString("description")
        
      val externalId = request.getQueryString("externalId")
        
      val externalType = request.getQueryString("externalType")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val metaData = request.getQueryString("metaData")
        
      api.updateFilter(version, accountId, filterId, parentFilterId, name, description, externalId, externalType, active, metaData)
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
