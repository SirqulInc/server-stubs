package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.CreativeResponse
import model.MissionResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class CreativeApiController @Inject()(cc: ControllerComponents, api: CreativeApi) extends AbstractController(cc) {
  /**
    * POST /api/3.18/creative/addpreview?accountId=[value]&creativeId=[value]
    */
  def addPreview(): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val creativeId = request.getQueryString("creativeId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("creativeId", "query string")
        }
        
      api.addPreview(accountId, creativeId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/ads/find?appKey=[value]&`type`=[value]&accountId=[value]&appVersion=[value]&latitude=[value]&longitude=[value]&device=[value]&deviceIdentifier=[value]&deviceVersion=[value]&start=[value]&limit=[value]&includeAudiences=[value]&allocatesTickets=[value]&randomize=[value]&targetedAdsOnly=[value]&missionIds=[value]
    */
  def adsFind(): Action[AnyContent] = Action { request =>
    def executeApi(): List[MissionResponse] = {
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val `type` = request.getQueryString("type")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appVersion = request.getQueryString("appVersion")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val device = request.getQueryString("device")
        
      val deviceIdentifier = request.getQueryString("deviceIdentifier")
        .map(value => value.toLong)
        
      val deviceVersion = request.getQueryString("deviceVersion")
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val includeAudiences = request.getQueryString("includeAudiences")
        .map(value => value.toBoolean)
        
      val allocatesTickets = request.getQueryString("allocatesTickets")
        .map(value => value.toBoolean)
        
      val randomize = request.getQueryString("randomize")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("randomize", "query string")
        }
        
      val targetedAdsOnly = request.getQueryString("targetedAdsOnly")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("targetedAdsOnly", "query string")
        }
        
      val missionIds = request.getQueryString("missionIds")
        
      api.adsFind(appKey, randomize, targetedAdsOnly, `type`, accountId, appVersion, latitude, longitude, device, deviceIdentifier, deviceVersion, start, limit, includeAudiences, allocatesTickets, missionIds)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/creative/create?accountId=[value]&name=[value]&description=[value]&assetImageId=[value]&action=[value]&data=[value]&suffix=[value]&`type`=[value]&balance=[value]&active=[value]&referenceId=[value]&appVersion=[value]&missionId=[value]&offerId=[value]&waitForAsset=[value]
    */
  def createCreative(): Action[AnyContent] = Action { request =>
    def executeApi(): CreativeResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val name = request.getQueryString("name")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("name", "query string")
        }
        
      val description = request.getQueryString("description")
        
      val assetImageId = request.getQueryString("assetImageId")
        .map(value => value.toLong)
        
      val action = request.getQueryString("action")
        
      val data = request.getQueryString("data")
        
      val suffix = request.getQueryString("suffix")
        
      val `type` = request.getQueryString("type")
        
      val balance = request.getQueryString("balance")
        .map(value => value.toDouble)
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("active", "query string")
        }
        
      val referenceId = request.getQueryString("referenceId")
        .map(value => value.toLong)
        
      val appVersion = request.getQueryString("appVersion")
        
      val missionId = request.getQueryString("missionId")
        .map(value => value.toLong)
        
      val offerId = request.getQueryString("offerId")
        .map(value => value.toLong)
        
      val waitForAsset = request.getQueryString("waitForAsset")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("waitForAsset", "query string")
        }
        
      api.createCreative(accountId, name, active, waitForAsset, description, assetImageId, action, data, suffix, `type`, balance, referenceId, appVersion, missionId, offerId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/creative/delete?accountId=[value]&creativeId=[value]
    */
  def deleteCreative(): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val creativeId = request.getQueryString("creativeId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("creativeId", "query string")
        }
        
      api.deleteCreative(accountId, creativeId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/creative/get?accountId=[value]&creativeId=[value]
    */
  def getCreative(): Action[AnyContent] = Action { request =>
    def executeApi(): CreativeResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val creativeId = request.getQueryString("creativeId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("creativeId", "query string")
        }
        
      api.getCreative(accountId, creativeId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/creative/search?accountId=[value]&appKey=[value]&missionId=[value]&keyword=[value]&start=[value]&limit=[value]
    */
  def getCreativesByApplication(): Action[AnyContent] = Action { request =>
    def executeApi(): List[CreativeResponse] = {
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
        
      api.getCreativesByApplication(accountId, appKey, start, limit, missionId, keyword)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/creative/removepreview?accountId=[value]&creativeId=[value]
    */
  def removePreview(): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val creativeId = request.getQueryString("creativeId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("creativeId", "query string")
        }
        
      api.removePreview(accountId, creativeId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/creative/update?accountId=[value]&creativeId=[value]&name=[value]&description=[value]&assetImageId=[value]&action=[value]&data=[value]&suffix=[value]&`type`=[value]&balance=[value]&active=[value]&referenceId=[value]&appVersion=[value]&missionId=[value]
    */
  def updateCreative(): Action[AnyContent] = Action { request =>
    def executeApi(): CreativeResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val creativeId = request.getQueryString("creativeId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("creativeId", "query string")
        }
        
      val name = request.getQueryString("name")
        
      val description = request.getQueryString("description")
        
      val assetImageId = request.getQueryString("assetImageId")
        .map(value => value.toLong)
        
      val action = request.getQueryString("action")
        
      val data = request.getQueryString("data")
        
      val suffix = request.getQueryString("suffix")
        
      val `type` = request.getQueryString("type")
        
      val balance = request.getQueryString("balance")
        .map(value => value.toDouble)
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val referenceId = request.getQueryString("referenceId")
        .map(value => value.toLong)
        
      val appVersion = request.getQueryString("appVersion")
        
      val missionId = request.getQueryString("missionId")
        .map(value => value.toLong)
        
      api.updateCreative(accountId, creativeId, name, description, assetImageId, action, data, suffix, `type`, balance, active, referenceId, appVersion, missionId)
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
