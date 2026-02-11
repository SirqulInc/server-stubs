package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.GameLevelListResponse
import model.GameLevelResponse
import model.QuestionResponse
import model.SirqulResponse
import model.WordzWordResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class GameLevelApiController @Inject()(cc: ControllerComponents, api: GameLevelApi) extends AbstractController(cc) {
  /**
    * POST /api/3.18/level/create?accountId=[value]&appKey=[value]&name=[value]&description=[value]&difficulty=[value]&appVersion=[value]&assetImageId=[value]&assetIconId=[value]&gameData=[value]&gameDataSuffix=[value]&visibility=[value]&friendGroup=[value]&connectionIds=[value]&connectionGroupIds=[value]&balance=[value]&active=[value]&allocateTickets=[value]&ticketCount=[value]&ticketType=[value]&points=[value]&tutorialTitle=[value]&tutorialMessage=[value]&tutorialAlignment=[value]&tutorialImageAssetId=[value]&offerId=[value]&metaData=[value]
    */
  def createGameLevel(): Action[AnyContent] = Action { request =>
    def executeApi(): GameLevelResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        
      val name = request.getQueryString("name")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("name", "query string")
        }
        
      val description = request.getQueryString("description")
        
      val difficulty = request.getQueryString("difficulty")
        
      val appVersion = request.getQueryString("appVersion")
        
      val assetImageId = request.getQueryString("assetImageId")
        .map(value => value.toLong)
        
      val assetIconId = request.getQueryString("assetIconId")
        .map(value => value.toLong)
        
      val gameData = request.getQueryString("gameData")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("gameData", "query string")
        }
        
      val gameDataSuffix = request.getQueryString("gameDataSuffix")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("gameDataSuffix", "query string")
        }
        
      val visibility = request.getQueryString("visibility")
        
      val friendGroup = request.getQueryString("friendGroup")
        .map(value => value.toBoolean)
        
      val connectionIds = request.getQueryString("connectionIds")
        
      val connectionGroupIds = request.getQueryString("connectionGroupIds")
        
      val balance = request.getQueryString("balance")
        .map(value => value.toDouble)
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val allocateTickets = request.getQueryString("allocateTickets")
        .map(value => value.toBoolean)
        
      val ticketCount = request.getQueryString("ticketCount")
        .map(value => value.toLong)
        
      val ticketType = request.getQueryString("ticketType")
        
      val points = request.getQueryString("points")
        .map(value => value.toLong)
        
      val tutorialTitle = request.getQueryString("tutorialTitle")
        
      val tutorialMessage = request.getQueryString("tutorialMessage")
        
      val tutorialAlignment = request.getQueryString("tutorialAlignment")
        
      val tutorialImageAssetId = request.getQueryString("tutorialImageAssetId")
        .map(value => value.toLong)
        
      val offerId = request.getQueryString("offerId")
        .map(value => value.toLong)
        
      val metaData = request.getQueryString("metaData")
        
      api.createGameLevel(accountId, name, gameData, gameDataSuffix, appKey, description, difficulty, appVersion, assetImageId, assetIconId, visibility, friendGroup, connectionIds, connectionGroupIds, balance, active, allocateTickets, ticketCount, ticketType, points, tutorialTitle, tutorialMessage, tutorialAlignment, tutorialImageAssetId, offerId, metaData)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/level/delete?accountId=[value]&levelId=[value]
    */
  def deleteGameLevel(): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val levelId = request.getQueryString("levelId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("levelId", "query string")
        }
        
      api.deleteGameLevel(accountId, levelId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/level/get?accountId=[value]&levelId=[value]&includeGameData=[value]
    */
  def getGameLevel(): Action[AnyContent] = Action { request =>
    def executeApi(): GameLevelResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val levelId = request.getQueryString("levelId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("levelId", "query string")
        }
        
      val includeGameData = request.getQueryString("includeGameData")
        .map(value => value.toBoolean)
        
      api.getGameLevel(accountId, levelId, includeGameData)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/level/search?accountId=[value]&appKey=[value]&keyword=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&appVersion=[value]&includeGameData=[value]&filters=[value]
    */
  def getGameLevelsByApplication(): Action[AnyContent] = Action { request =>
    def executeApi(): GameLevelListResponse = {
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
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val appVersion = request.getQueryString("appVersion")
        
      val includeGameData = request.getQueryString("includeGameData")
        .map(value => value.toBoolean)
        
      val filters = request.getQueryString("filters")
        
      api.getGameLevelsByApplication(accountId, appKey, keyword, sortField, descending, start, limit, appVersion, includeGameData, filters)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/level/searchByBillableEntity?accountId=[value]&appKey=[value]&keyword=[value]&sortField=[value]&descending=[value]&activeOnly=[value]&start=[value]&limit=[value]
    */
  def getGameLevelsByBillableEntity(): Action[AnyContent] = Action { request =>
    def executeApi(): GameLevelResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        
      val keyword = request.getQueryString("keyword")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        
      val start = request.getQueryString("start")
        .map(value => value.toLong)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toLong)
        
      api.getGameLevelsByBillableEntity(accountId, appKey, keyword, sortField, descending, activeOnly, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/level/questions/get?levelId=[value]&accountId=[value]
    */
  def getQuestionsInLevel(): Action[AnyContent] = Action { request =>
    def executeApi(): QuestionResponse = {
      val levelId = request.getQueryString("levelId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("levelId", "query string")
        }
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      api.getQuestionsInLevel(levelId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/level/words/get?levelId=[value]&accountId=[value]
    */
  def getWordsInLevel(): Action[AnyContent] = Action { request =>
    def executeApi(): WordzWordResponse = {
      val levelId = request.getQueryString("levelId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("levelId", "query string")
        }
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      api.getWordsInLevel(levelId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/level/update?accountId=[value]&appKey=[value]&levelId=[value]&name=[value]&description=[value]&difficulty=[value]&appVersion=[value]&assetImageId=[value]&assetIconId=[value]&gameData=[value]&gameDataSuffix=[value]&visibility=[value]&friendGroup=[value]&connectionIds=[value]&connectionGroupIds=[value]&balance=[value]&active=[value]&allocateTickets=[value]&ticketCount=[value]&ticketType=[value]&points=[value]&tutorialTitle=[value]&tutorialMessage=[value]&tutorialAlignment=[value]&tutorialImageAssetId=[value]&offerId=[value]&metaData=[value]
    */
  def updateGameLevel(): Action[AnyContent] = Action { request =>
    def executeApi(): GameLevelResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        
      val levelId = request.getQueryString("levelId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("levelId", "query string")
        }
        
      val name = request.getQueryString("name")
        
      val description = request.getQueryString("description")
        
      val difficulty = request.getQueryString("difficulty")
        
      val appVersion = request.getQueryString("appVersion")
        
      val assetImageId = request.getQueryString("assetImageId")
        .map(value => value.toLong)
        
      val assetIconId = request.getQueryString("assetIconId")
        .map(value => value.toLong)
        
      val gameData = request.getQueryString("gameData")
        
      val gameDataSuffix = request.getQueryString("gameDataSuffix")
        
      val visibility = request.getQueryString("visibility")
        
      val friendGroup = request.getQueryString("friendGroup")
        .map(value => value.toBoolean)
        
      val connectionIds = request.getQueryString("connectionIds")
        
      val connectionGroupIds = request.getQueryString("connectionGroupIds")
        
      val balance = request.getQueryString("balance")
        .map(value => value.toDouble)
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val allocateTickets = request.getQueryString("allocateTickets")
        .map(value => value.toBoolean)
        
      val ticketCount = request.getQueryString("ticketCount")
        .map(value => value.toLong)
        
      val ticketType = request.getQueryString("ticketType")
        
      val points = request.getQueryString("points")
        .map(value => value.toLong)
        
      val tutorialTitle = request.getQueryString("tutorialTitle")
        
      val tutorialMessage = request.getQueryString("tutorialMessage")
        
      val tutorialAlignment = request.getQueryString("tutorialAlignment")
        
      val tutorialImageAssetId = request.getQueryString("tutorialImageAssetId")
        .map(value => value.toLong)
        
      val offerId = request.getQueryString("offerId")
        .map(value => value.toLong)
        
      val metaData = request.getQueryString("metaData")
        
      api.updateGameLevel(accountId, levelId, appKey, name, description, difficulty, appVersion, assetImageId, assetIconId, gameData, gameDataSuffix, visibility, friendGroup, connectionIds, connectionGroupIds, balance, active, allocateTickets, ticketCount, ticketType, points, tutorialTitle, tutorialMessage, tutorialAlignment, tutorialImageAssetId, offerId, metaData)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/level/questions/update?levelId=[value]&accountId=[value]&questionIds=[value]
    */
  def updateQuestionsInLevel(): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val levelId = request.getQueryString("levelId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("levelId", "query string")
        }
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val questionIds = request.getQueryString("questionIds")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("questionIds", "query string")
        }
        
      api.updateQuestionsInLevel(levelId, accountId, questionIds)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/level/words/update?levelId=[value]&accountId=[value]&wordIds=[value]
    */
  def updateWordsInLevel(): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val levelId = request.getQueryString("levelId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("levelId", "query string")
        }
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val wordIds = request.getQueryString("wordIds")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("wordIds", "query string")
        }
        
      api.updateWordsInLevel(levelId, accountId, wordIds)
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
