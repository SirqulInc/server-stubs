package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.GameResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class GameApiController @Inject()(cc: ControllerComponents, api: GameApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/game/create?accountId=[value]&appKey=[value]&title=[value]&description=[value]&metaData=[value]&packIds=[value]&includeGameData=[value]
    */
  def createGame(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): GameResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      val title = request.getQueryString("title")
        
      val description = request.getQueryString("description")
        
      val metaData = request.getQueryString("metaData")
        
      val packIds = request.getQueryString("packIds")
        
      val includeGameData = request.getQueryString("includeGameData")
        .map(value => value.toBoolean)
        
      api.createGame(version, accountId, appKey, title, description, metaData, packIds, includeGameData)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/game/delete?accountId=[value]&gameId=[value]
    */
  def deleteGame(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val gameId = request.getQueryString("gameId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("gameId", "query string")
        }
        
      api.deleteGame(version, accountId, gameId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/game/get?accountId=[value]&gameId=[value]&includeGameData=[value]
    */
  def getGame(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): GameResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val gameId = request.getQueryString("gameId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("gameId", "query string")
        }
        
      val includeGameData = request.getQueryString("includeGameData")
        .map(value => value.toBoolean)
        
      api.getGame(version, accountId, gameId, includeGameData)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/game/search?accountId=[value]&appKey=[value]&keyword=[value]&start=[value]&limit=[value]&appVersion=[value]&includeGameData=[value]&includeInactive=[value]
    */
  def searchGames(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): GameResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val keyword = request.getQueryString("keyword")
        
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
        
      val appVersion = request.getQueryString("appVersion")
        
      val includeGameData = request.getQueryString("includeGameData")
        .map(value => value.toBoolean)
        
      val includeInactive = request.getQueryString("includeInactive")
        .map(value => value.toBoolean)
        
      api.searchGames(version, accountId, appKey, start, limit, keyword, appVersion, includeGameData, includeInactive)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/game/update?accountId=[value]&gameId=[value]&appKey=[value]&title=[value]&description=[value]&metaData=[value]&packIds=[value]&includeGameData=[value]
    */
  def updateGame(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): GameResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val gameId = request.getQueryString("gameId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      val title = request.getQueryString("title")
        
      val description = request.getQueryString("description")
        
      val metaData = request.getQueryString("metaData")
        
      val packIds = request.getQueryString("packIds")
        
      val includeGameData = request.getQueryString("includeGameData")
        .map(value => value.toBoolean)
        
      api.updateGame(version, accountId, gameId, appKey, title, description, metaData, packIds, includeGameData)
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
