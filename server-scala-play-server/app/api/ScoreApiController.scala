package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.ScoreResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class ScoreApiController @Inject()(cc: ControllerComponents, api: ScoreApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/score/create?accountId=[value]&appKey=[value]&missionId=[value]&gameId=[value]&packId=[value]&gameLevelId=[value]&gameObjectId=[value]&points=[value]&timeTaken=[value]&highest=[value]
    */
  def createScore(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ScoreResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val missionId = request.getQueryString("missionId")
        .map(value => value.toLong)
        
      val gameId = request.getQueryString("gameId")
        .map(value => value.toLong)
        
      val packId = request.getQueryString("packId")
        .map(value => value.toLong)
        
      val gameLevelId = request.getQueryString("gameLevelId")
        .map(value => value.toLong)
        
      val gameObjectId = request.getQueryString("gameObjectId")
        .map(value => value.toLong)
        
      val points = request.getQueryString("points")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("points", "query string")
        }
        
      val timeTaken = request.getQueryString("timeTaken")
        .map(value => value.toInt)
        
      val highest = request.getQueryString("highest")
        .map(value => value.toBoolean)
        
      api.createScore(version, accountId, appKey, points, missionId, gameId, packId, gameLevelId, gameObjectId, timeTaken, highest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/score/get?accountId=[value]&appKey=[value]&missionId=[value]&gameId=[value]&packId=[value]&gameLevelId=[value]&gameObjectId=[value]&scoreObjectType=[value]&scoreStatus=[value]
    */
  def getScore(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ScoreResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val missionId = request.getQueryString("missionId")
        .map(value => value.toLong)
        
      val gameId = request.getQueryString("gameId")
        .map(value => value.toLong)
        
      val packId = request.getQueryString("packId")
        .map(value => value.toLong)
        
      val gameLevelId = request.getQueryString("gameLevelId")
        .map(value => value.toLong)
        
      val gameObjectId = request.getQueryString("gameObjectId")
        .map(value => value.toLong)
        
      val scoreObjectType = request.getQueryString("scoreObjectType")
        
      val scoreStatus = request.getQueryString("scoreStatus")
        
      api.getScore(version, accountId, appKey, missionId, gameId, packId, gameLevelId, gameObjectId, scoreObjectType, scoreStatus)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/score/search?accountId=[value]&appKey=[value]&missionId=[value]&gameId=[value]&packId=[value]&gameLevelId=[value]&gameObjectId=[value]
    */
  def searchScores(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[ScoreResponse] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val missionId = request.getQueryString("missionId")
        .map(value => value.toLong)
        
      val gameId = request.getQueryString("gameId")
        .map(value => value.toLong)
        
      val packId = request.getQueryString("packId")
        .map(value => value.toLong)
        
      val gameLevelId = request.getQueryString("gameLevelId")
        .map(value => value.toLong)
        
      val gameObjectId = request.getQueryString("gameObjectId")
        .map(value => value.toLong)
        
      api.searchScores(version, accountId, appKey, missionId, gameId, packId, gameLevelId, gameObjectId)
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
