package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AppResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class AppDataApiController @Inject()(cc: ControllerComponents, api: AppDataApi) extends AbstractController(cc) {
  /**
    * GET /api/3.18/app/get?deviceId=[value]&accountId=[value]&gameType=[value]&includeGameData=[value]&q=[value]&keyword=[value]&sortField=[value]&descending=[value]&i=[value]&start=[value]&l=[value]&limit=[value]&gameObjectCount=[value]&filter=[value]&dateCreated=[value]&ownerId=[value]&missionIds=[value]&gameIds=[value]&packIds=[value]&gameLevelIds=[value]&appVersion=[value]&includeHigherVersionPacks=[value]&includeHigherVersionLevels=[value]&responseGroups=[value]&purchaseType=[value]
    */
  def getAppData(): Action[AnyContent] = Action { request =>
    def executeApi(): AppResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val gameType = request.getQueryString("gameType")
        
      val includeGameData = request.getQueryString("includeGameData")
        .map(value => value.toBoolean)
        
      val q = request.getQueryString("q")
        
      val keyword = request.getQueryString("keyword")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val i = request.getQueryString("_i")
        .map(value => value.toInt)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("start", "query string")
        }
        
      val l = request.getQueryString("_l")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("limit", "query string")
        }
        
      val gameObjectCount = request.getQueryString("gameObjectCount")
        .map(value => value.toBoolean)
        
      val filter = request.getQueryString("filter")
        
      val dateCreated = request.getQueryString("dateCreated")
        .map(value => value.toLong)
        
      val ownerId = request.getQueryString("ownerId")
        .map(value => value.toLong)
        
      val missionIds = request.getQueryString("missionIds")
        
      val gameIds = request.getQueryString("gameIds")
        
      val packIds = request.getQueryString("packIds")
        
      val gameLevelIds = request.getQueryString("gameLevelIds")
        
      val appVersion = request.getQueryString("appVersion")
        
      val includeHigherVersionPacks = request.getQueryString("includeHigherVersionPacks")
        .map(value => value.toBoolean)
        
      val includeHigherVersionLevels = request.getQueryString("includeHigherVersionLevels")
        .map(value => value.toBoolean)
        
      val responseGroups = request.getQueryString("responseGroups")
        
      val purchaseType = request.getQueryString("purchaseType")
        
      api.getAppData(start, limit, deviceId, accountId, gameType, includeGameData, q, keyword, sortField, descending, i, l, gameObjectCount, filter, dateCreated, ownerId, missionIds, gameIds, packIds, gameLevelIds, appVersion, includeHigherVersionPacks, includeHigherVersionLevels, responseGroups, purchaseType)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/app/post?deviceId=[value]&accountId=[value]&gameType=[value]&includeGameData=[value]&q=[value]&keyword=[value]&sortField=[value]&descending=[value]&i=[value]&start=[value]&l=[value]&limit=[value]&gameObjectCount=[value]&filter=[value]&dateCreated=[value]&ownerId=[value]&missionIds=[value]&gameIds=[value]&packIds=[value]&gameLevelIds=[value]&appVersion=[value]&includeHigherVersionPacks=[value]&includeHigherVersionLevels=[value]&responseGroups=[value]&purchaseType=[value]&data=[value]
    */
  def postAppData(): Action[AnyContent] = Action { request =>
    def executeApi(): AppResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val gameType = request.getQueryString("gameType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("gameType", "query string")
        }
        
      val includeGameData = request.getQueryString("includeGameData")
        .map(value => value.toBoolean)
        
      val q = request.getQueryString("q")
        
      val keyword = request.getQueryString("keyword")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val i = request.getQueryString("_i")
        .map(value => value.toInt)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("start", "query string")
        }
        
      val l = request.getQueryString("_l")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("limit", "query string")
        }
        
      val gameObjectCount = request.getQueryString("gameObjectCount")
        .map(value => value.toBoolean)
        
      val filter = request.getQueryString("filter")
        
      val dateCreated = request.getQueryString("dateCreated")
        .map(value => value.toLong)
        
      val ownerId = request.getQueryString("ownerId")
        .map(value => value.toLong)
        
      val missionIds = request.getQueryString("missionIds")
        
      val gameIds = request.getQueryString("gameIds")
        
      val packIds = request.getQueryString("packIds")
        
      val gameLevelIds = request.getQueryString("gameLevelIds")
        
      val appVersion = request.getQueryString("appVersion")
        
      val includeHigherVersionPacks = request.getQueryString("includeHigherVersionPacks")
        .map(value => value.toBoolean)
        
      val includeHigherVersionLevels = request.getQueryString("includeHigherVersionLevels")
        .map(value => value.toBoolean)
        
      val responseGroups = request.getQueryString("responseGroups")
        
      val purchaseType = request.getQueryString("purchaseType")
        
      val data = request.getQueryString("data")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("data", "query string")
        }
        
      api.postAppData(gameType, start, limit, data, deviceId, accountId, includeGameData, q, keyword, sortField, descending, i, l, gameObjectCount, filter, dateCreated, ownerId, missionIds, gameIds, packIds, gameLevelIds, appVersion, includeHigherVersionPacks, includeHigherVersionLevels, responseGroups, purchaseType)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/app/regen?accountId=[value]&appKey=[value]&buildVersion=[value]&apiVersion=[value]
    */
  def regenAppData(): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      val buildVersion = request.getQueryString("buildVersion")
        
      val apiVersion = request.getQueryString("apiVersion")
        
      api.regenAppData(accountId, appKey, buildVersion, apiVersion)
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
