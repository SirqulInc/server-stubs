package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.SirqulResponse
import model.TerritoryResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class TerritoryApiController @Inject()(cc: ControllerComponents, api: TerritoryApi) extends AbstractController(cc) {
  /**
    * POST /api/3.18/territory/create?accountId=[value]&name=[value]&active=[value]
    */
  def createTerritory(): Action[AnyContent] = Action { request =>
    def executeApi(): TerritoryResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val name = request.getQueryString("name")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("name", "query string")
        }
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      api.createTerritory(accountId, name, active)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/territory/delete?accountId=[value]&territoryId=[value]
    */
  def deleteTerritory(): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val territoryId = request.getQueryString("territoryId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("territoryId", "query string")
        }
        
      api.deleteTerritory(accountId, territoryId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/territory/get?territoryId=[value]
    */
  def getTerritory(): Action[AnyContent] = Action { request =>
    def executeApi(): TerritoryResponse = {
      val territoryId = request.getQueryString("territoryId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("territoryId", "query string")
        }
        
      api.getTerritory(territoryId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/territory/search?keyword=[value]&start=[value]&limit=[value]&sortField=[value]&descending=[value]
    */
  def searchTerritories(): Action[AnyContent] = Action { request =>
    def executeApi(): List[TerritoryResponse] = {
      val keyword = request.getQueryString("keyword")
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val sortField = request.getQueryString("sortField")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("sortField", "query string")
        }
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("descending", "query string")
        }
        
      api.searchTerritories(sortField, descending, keyword, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/territory/update?accountId=[value]&territoryId=[value]&name=[value]&active=[value]
    */
  def updateTerritory(): Action[AnyContent] = Action { request =>
    def executeApi(): TerritoryResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val territoryId = request.getQueryString("territoryId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("territoryId", "query string")
        }
        
      val name = request.getQueryString("name")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      api.updateTerritory(accountId, territoryId, name, active)
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
