package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AchievementProgressResponse
import model.AchievementResponse
import model.AchievementShortResponse
import model.AchievementTierResponse
import model.BigDecimal
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class AchievementApiController @Inject()(cc: ControllerComponents, api: AchievementApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/achievement/tier/search?deviceId=[value]&accountId=[value]&appKey=[value]&keyword=[value]&achievementType=[value]&rankType=[value]&sortField=[value]&descending=[value]&descendingGoal=[value]&start=[value]&limit=[value]
    */
  def apiVersionAchievementTierSearchPost(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): AchievementTierResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      val keyword = request.getQueryString("keyword")
        
      val achievementType = request.getQueryString("achievementType")
        .map(value => value.toLong)
        
      val rankType = request.getQueryString("rankType")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val descendingGoal = request.getQueryString("descendingGoal")
        .map(value => value.toBoolean)
        
      val start = request.getQueryString("start")
        .map(value => value.toLong)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toLong)
        
      api.apiVersionAchievementTierSearchPost(version, deviceId, accountId, appKey, keyword, achievementType, rankType, sortField, descending, descendingGoal, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/achievement/create?deviceId=[value]&accountId=[value]&appKey=[value]&analyticsTag=[value]&title=[value]&description=[value]&rankType=[value]&rankIncrement=[value]&minIncrement=[value]&maxIncrement=[value]&validate=[value]&active=[value]&triggerDefinition=[value]
    */
  def createAchievement(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): AchievementResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val analyticsTag = request.getQueryString("analyticsTag")
        
      val title = request.getQueryString("title")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("title", "query string")
        }
        
      val description = request.getQueryString("description")
        
      val rankType = request.getQueryString("rankType")
        
      val rankIncrement = request.getQueryString("rankIncrement")
        .map(value => value.toInt)
        
      val minIncrement = request.getQueryString("minIncrement")
        .map(value => value.toInt)
        
      val maxIncrement = request.getQueryString("maxIncrement")
        .map(value => value.toInt)
        
      val validate = request.getQueryString("validate")
        .map(value => value.toBoolean)
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val triggerDefinition = request.getQueryString("triggerDefinition")
        
      api.createAchievement(version, appKey, title, deviceId, accountId, analyticsTag, description, rankType, rankIncrement, minIncrement, maxIncrement, validate, active, triggerDefinition)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/achievement/tier/create?deviceId=[value]&accountId=[value]&achievementId=[value]&icon=[value]&iconAssetId=[value]&title=[value]&description=[value]&goalCount=[value]&missionId=[value]&gameId=[value]&packId=[value]&gameLevelId=[value]&gameObjectId=[value]&scoreAllInstances=[value]
    */
  def createAchievementTier(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): AchievementTierResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val achievementId = request.getQueryString("achievementId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("achievementId", "query string")
        }
        
      val icon = request.getQueryString("icon")
        
      val iconAssetId = request.getQueryString("iconAssetId")
        .map(value => value.toLong)
        
      val title = request.getQueryString("title")
        
      val description = request.getQueryString("description")
        
      val goalCount = request.getQueryString("goalCount")
        .map(value => value.toLong)
        
      val missionId = request.getQueryString("missionId")
        .map(value => value.toLong)
        
      val gameId = request.getQueryString("gameId")
        .map(value => value.toLong)
        
      val packId = request.getQueryString("packId")
        .map(value => value.toLong)
        
      val gameLevelId = request.getQueryString("gameLevelId")
        .map(value => value.toLong)
        
      val gameObjectId = request.getQueryString("gameObjectId")
        .map(value => value.toInt)
        
      val scoreAllInstances = request.getQueryString("scoreAllInstances")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("scoreAllInstances", "query string")
        }
        
      api.createAchievementTier(version, achievementId, scoreAllInstances, deviceId, accountId, icon, iconAssetId, title, description, goalCount, missionId, gameId, packId, gameLevelId, gameObjectId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/achievement/delete?accountId=[value]&achievementId=[value]
    */
  def deleteAchievement(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val achievementId = request.getQueryString("achievementId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("achievementId", "query string")
        }
        
      api.deleteAchievement(version, achievementId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/achievement/tier/delete?accountId=[value]&achievementTierId=[value]
    */
  def deleteAchievementTier(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val achievementTierId = request.getQueryString("achievementTierId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("achievementTierId", "query string")
        }
        
      api.deleteAchievementTier(version, achievementTierId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/achievement/get?deviceId=[value]&accountId=[value]&achievementId=[value]&achievementType=[value]
    */
  def getAchievement(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): AchievementTierResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val achievementId = request.getQueryString("achievementId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("achievementId", "query string")
        }
        
      val achievementType = request.getQueryString("achievementType")
        
      api.getAchievement(version, achievementId, deviceId, accountId, achievementType)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/achievement/tier/get?accountId=[value]&achievementTierId=[value]
    */
  def getAchievementTier(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): AchievementTierResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val achievementTierId = request.getQueryString("achievementTierId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("achievementTierId", "query string")
        }
        
      api.getAchievementTier(version, accountId, achievementTierId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/achievement/progress/get?returnNulls=[value]&deviceId=[value]&accountId=[value]&connectionAccountEmail=[value]&connectionAccountId=[value]&appKey=[value]&rankType=[value]&achievementType=[value]&includeUndiscovered=[value]&latitude=[value]&longitude=[value]
    */
  def getUserAchievements(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[AchievementProgressResponse] = {
      val returnNulls = request.getQueryString("returnNulls")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("returnNulls", "query string")
        }
        
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val connectionAccountEmail = request.getQueryString("connectionAccountEmail")
        
      val connectionAccountId = request.getQueryString("connectionAccountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val rankType = request.getQueryString("rankType")
        
      val achievementType = request.getQueryString("achievementType")
        
      val includeUndiscovered = request.getQueryString("includeUndiscovered")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("includeUndiscovered", "query string")
        }
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.getUserAchievements(version, returnNulls, appKey, includeUndiscovered, deviceId, accountId, connectionAccountEmail, connectionAccountId, rankType, achievementType, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/achievement/tag/list?appKey=[value]
    */
  def listAchievementTags(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val appKey = request.getQueryString("appKey")
        
      api.listAchievementTags(version, appKey)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/achievement/list?deviceId=[value]&accountId=[value]&appKey=[value]&keyword=[value]&achievementType=[value]&rankType=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&activeOnly=[value]
    */
  def listAchievements(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[AchievementShortResponse] = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      val keyword = request.getQueryString("keyword")
        
      val achievementType = request.getQueryString("achievementType")
        
      val rankType = request.getQueryString("rankType")
        
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
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("activeOnly", "query string")
        }
        
      api.listAchievements(version, sortField, descending, start, limit, activeOnly, deviceId, accountId, appKey, keyword, achievementType, rankType)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/achievement/search?deviceId=[value]&accountId=[value]&appKey=[value]&keyword=[value]&achievementType=[value]&rankType=[value]&sortField=[value]&descending=[value]&includeTiers=[value]&includeInactiveTiers=[value]&start=[value]&limit=[value]
    */
  def searchAchievements(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[AchievementShortResponse] = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val keyword = request.getQueryString("keyword")
        
      val achievementType = request.getQueryString("achievementType")
        
      val rankType = request.getQueryString("rankType")
        
      val sortField = request.getQueryString("sortField")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("sortField", "query string")
        }
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("descending", "query string")
        }
        
      val includeTiers = request.getQueryString("includeTiers")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("includeTiers", "query string")
        }
        
      val includeInactiveTiers = request.getQueryString("includeInactiveTiers")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("includeInactiveTiers", "query string")
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
        
      api.searchAchievements(version, appKey, sortField, descending, includeTiers, includeInactiveTiers, start, limit, deviceId, accountId, keyword, achievementType, rankType)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/achievement/update?deviceId=[value]&accountId=[value]&achievementId=[value]&analyticsTag=[value]&title=[value]&description=[value]&rankType=[value]&rankIncrement=[value]&minIncrement=[value]&nullMinIncrement=[value]&maxIncrement=[value]&nullMaxIncrement=[value]&validate=[value]&active=[value]&triggerDefinition=[value]
    */
  def updateAchievement(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): AchievementResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val achievementId = request.getQueryString("achievementId")
        .map(value => value.toLong)
        
      val analyticsTag = request.getQueryString("analyticsTag")
        
      val title = request.getQueryString("title")
        
      val description = request.getQueryString("description")
        
      val rankType = request.getQueryString("rankType")
        
      val rankIncrement = request.getQueryString("rankIncrement")
        .map(value => value.toInt)
        
      val minIncrement = request.getQueryString("minIncrement")
        .map(value => value.toInt)
        
      val nullMinIncrement = request.getQueryString("nullMinIncrement")
        .map(value => value.toBoolean)
        
      val maxIncrement = request.getQueryString("maxIncrement")
        .map(value => value.toInt)
        
      val nullMaxIncrement = request.getQueryString("nullMaxIncrement")
        .map(value => value.toBoolean)
        
      val validate = request.getQueryString("validate")
        .map(value => value.toBoolean)
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val triggerDefinition = request.getQueryString("triggerDefinition")
        
      api.updateAchievement(version, deviceId, accountId, achievementId, analyticsTag, title, description, rankType, rankIncrement, minIncrement, nullMinIncrement, maxIncrement, nullMaxIncrement, validate, active, triggerDefinition)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/achievement/tier/update?deviceId=[value]&accountId=[value]&achievementTierId=[value]&icon=[value]&iconAssetId=[value]&title=[value]&description=[value]&goalCount=[value]&missionId=[value]&gameId=[value]&packId=[value]&gameLevelId=[value]&gameObjectId=[value]&scoreAllInstances=[value]
    */
  def updateAchievementTier(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): AchievementTierResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val achievementTierId = request.getQueryString("achievementTierId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("achievementTierId", "query string")
        }
        
      val icon = request.getQueryString("icon")
        
      val iconAssetId = request.getQueryString("iconAssetId")
        .map(value => value.toLong)
        
      val title = request.getQueryString("title")
        
      val description = request.getQueryString("description")
        
      val goalCount = request.getQueryString("goalCount")
        .map(value => value.toLong)
        
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
        
      val scoreAllInstances = request.getQueryString("scoreAllInstances")
        .map(value => value.toBoolean)
        
      api.updateAchievementTier(version, achievementTierId, deviceId, accountId, icon, iconAssetId, title, description, goalCount, missionId, gameId, packId, gameLevelId, gameObjectId, scoreAllInstances)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/achievement/progress/update?accountId=[value]&achievementId=[value]&tag=[value]&customId=[value]&increment=[value]&startDate=[value]&endDate=[value]&returnProgress=[value]
    */
  def updateUserAchievement(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val achievementId = request.getQueryString("achievementId")
        .map(value => value.toLong)
        
      val tag = request.getQueryString("tag")
        
      val customId = request.getQueryString("customId")
        .map(value => value.toLong)
        
      val increment = request.getQueryString("increment")
        .map(value => value.toLong)
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        
      val returnProgress = request.getQueryString("returnProgress")
        .map(value => value.toBoolean)
        
      api.updateUserAchievement(version, accountId, achievementId, tag, customId, increment, startDate, endDate, returnProgress)
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
