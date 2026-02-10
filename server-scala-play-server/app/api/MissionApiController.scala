package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.MissionFormatResponse
import model.MissionResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class MissionApiController @Inject()(cc: ControllerComponents, api: MissionApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/mission/create?accountId=[value]&title=[value]&description=[value]&subType=[value]&startDate=[value]&endDate=[value]&active=[value]&gameLevelIds=[value]&creativeIds=[value]&audienceIds=[value]&missionTask=[value]&formatType=[value]&offerId=[value]&balance=[value]&advancedReporting=[value]&allocateTickets=[value]&ticketCount=[value]&ticketType=[value]&points=[value]&metaData=[value]&applicationIds=[value]&devices=[value]&deviceIds=[value]&deviceVersions=[value]&locations=[value]&radius=[value]
    */
  def createMission(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): MissionResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val title = request.getQueryString("title")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("title", "query string")
        }
        
      val description = request.getQueryString("description")
        
      val subType = request.getQueryString("subType")
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val gameLevelIds = request.getQueryString("gameLevelIds")
        
      val creativeIds = request.getQueryString("creativeIds")
        
      val audienceIds = request.getQueryString("audienceIds")
        
      val missionTask = request.getQueryString("missionTask")
        
      val formatType = request.getQueryString("formatType")
        
      val offerId = request.getQueryString("offerId")
        .map(value => value.toLong)
        
      val balance = request.getQueryString("balance")
        .map(value => value.toDouble)
        
      val advancedReporting = request.getQueryString("advancedReporting")
        .map(value => value.toBoolean)
        
      val allocateTickets = request.getQueryString("allocateTickets")
        .map(value => value.toBoolean)
        
      val ticketCount = request.getQueryString("ticketCount")
        .map(value => value.toLong)
        
      val ticketType = request.getQueryString("ticketType")
        
      val points = request.getQueryString("points")
        .map(value => value.toLong)
        
      val metaData = request.getQueryString("metaData")
        
      val applicationIds = request.getQueryString("applicationIds")
        
      val devices = request.getQueryString("devices")
        
      val deviceIds = request.getQueryString("deviceIds")
        
      val deviceVersions = request.getQueryString("deviceVersions")
        
      val locations = request.getQueryString("locations")
        
      val radius = request.getQueryString("radius")
        
      api.createMission(version, accountId, title, description, subType, startDate, endDate, active, gameLevelIds, creativeIds, audienceIds, missionTask, formatType, offerId, balance, advancedReporting, allocateTickets, ticketCount, ticketType, points, metaData, applicationIds, devices, deviceIds, deviceVersions, locations, radius)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/mission/delete?accountId=[value]&missionId=[value]
    */
  def deleteMission(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val missionId = request.getQueryString("missionId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("missionId", "query string")
        }
        
      api.deleteMission(version, accountId, missionId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/mission/find?appKey=[value]&suffix=[value]&`type`=[value]&accountId=[value]&appVersion=[value]&latitude=[value]&longitude=[value]&device=[value]&deviceIdentifier=[value]&deviceVersion=[value]&start=[value]&limit=[value]&includeGameData=[value]&includeAudiences=[value]&allocatesTickets=[value]&randomize=[value]&targetedAdsOnly=[value]&missionIds=[value]&audienceOperator=[value]
    */
  def findMissions(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): MissionResponse = {
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val suffix = request.getQueryString("suffix")
        
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
        
      val includeGameData = request.getQueryString("includeGameData")
        .map(value => value.toBoolean)
        
      val includeAudiences = request.getQueryString("includeAudiences")
        .map(value => value.toBoolean)
        
      val allocatesTickets = request.getQueryString("allocatesTickets")
        .map(value => value.toBoolean)
        
      val randomize = request.getQueryString("randomize")
        .map(value => value.toBoolean)
        
      val targetedAdsOnly = request.getQueryString("targetedAdsOnly")
        .map(value => value.toBoolean)
        
      val missionIds = request.getQueryString("missionIds")
        
      val audienceOperator = request.getQueryString("audienceOperator")
        
      api.findMissions(version, appKey, suffix, `type`, accountId, appVersion, latitude, longitude, device, deviceIdentifier, deviceVersion, start, limit, includeGameData, includeAudiences, allocatesTickets, randomize, targetedAdsOnly, missionIds, audienceOperator)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/mission/get?accountId=[value]&missionId=[value]&returnCreative=[value]
    */
  def getMission(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): MissionResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val missionId = request.getQueryString("missionId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("missionId", "query string")
        }
        
      val returnCreative = request.getQueryString("returnCreative")
        .map(value => value.toBoolean)
        
      api.getMission(version, accountId, missionId, returnCreative)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/mission/import?accountId=[value]&latitude=[value]&longitude=[value]&keyword=[value]&start=[value]&limit=[value]&appKey=[value]&adSize=[value]
    */
  def importMission(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("latitude", "query string")
        }
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("longitude", "query string")
        }
        
      val keyword = request.getQueryString("keyword")
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val adSize = request.getQueryString("adSize")
        
      api.importMission(version, accountId, latitude, longitude, appKey, keyword, start, limit, adSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/mission/format/search?start=[value]&limit=[value]&activeOnly=[value]
    */
  def searchMissionFormats(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[MissionFormatResponse] = {
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
        
      api.searchMissionFormats(version, start, limit, activeOnly)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/mission/search?accountId=[value]&keyword=[value]&subType=[value]&start=[value]&limit=[value]&includeGameData=[value]&includeAudiences=[value]&includeInactive=[value]&suffix=[value]&sortField=[value]&descending=[value]
    */
  def searchMissions(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[MissionResponse] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val keyword = request.getQueryString("keyword")
        
      val subType = request.getQueryString("subType")
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val includeGameData = request.getQueryString("includeGameData")
        .map(value => value.toBoolean)
        
      val includeAudiences = request.getQueryString("includeAudiences")
        .map(value => value.toBoolean)
        
      val includeInactive = request.getQueryString("includeInactive")
        .map(value => value.toBoolean)
        
      val suffix = request.getQueryString("suffix")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      api.searchMissions(version, accountId, keyword, subType, start, limit, includeGameData, includeAudiences, includeInactive, suffix, sortField, descending)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/mission/searchByBillableEntity?accountId=[value]&keyword=[value]&start=[value]&limit=[value]&includeGameData=[value]&includeAudiences=[value]&includeInactive=[value]&suffix=[value]&sortField=[value]&descending=[value]
    */
  def searchMissionsByBillableEntity(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[MissionResponse] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val keyword = request.getQueryString("keyword")
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val includeGameData = request.getQueryString("includeGameData")
        .map(value => value.toBoolean)
        
      val includeAudiences = request.getQueryString("includeAudiences")
        .map(value => value.toBoolean)
        
      val includeInactive = request.getQueryString("includeInactive")
        .map(value => value.toBoolean)
        
      val suffix = request.getQueryString("suffix")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      api.searchMissionsByBillableEntity(version, accountId, keyword, start, limit, includeGameData, includeAudiences, includeInactive, suffix, sortField, descending)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/mission/update?accountId=[value]&missionId=[value]&title=[value]&description=[value]&subType=[value]&metaData=[value]&startDate=[value]&endDate=[value]&active=[value]&gameLevelIds=[value]&creativeIds=[value]&audienceIds=[value]&offerId=[value]&balance=[value]&advancedReporting=[value]&allocateTickets=[value]&ticketCount=[value]&ticketType=[value]&points=[value]&applicationIds=[value]&devices=[value]&deviceIds=[value]&deviceVersions=[value]&locations=[value]&radius=[value]
    */
  def updateMission(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): MissionResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val missionId = request.getQueryString("missionId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("missionId", "query string")
        }
        
      val title = request.getQueryString("title")
        
      val description = request.getQueryString("description")
        
      val subType = request.getQueryString("subType")
        
      val metaData = request.getQueryString("metaData")
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val gameLevelIds = request.getQueryString("gameLevelIds")
        
      val creativeIds = request.getQueryString("creativeIds")
        
      val audienceIds = request.getQueryString("audienceIds")
        
      val offerId = request.getQueryString("offerId")
        .map(value => value.toLong)
        
      val balance = request.getQueryString("balance")
        .map(value => value.toDouble)
        
      val advancedReporting = request.getQueryString("advancedReporting")
        .map(value => value.toBoolean)
        
      val allocateTickets = request.getQueryString("allocateTickets")
        .map(value => value.toBoolean)
        
      val ticketCount = request.getQueryString("ticketCount")
        .map(value => value.toLong)
        
      val ticketType = request.getQueryString("ticketType")
        
      val points = request.getQueryString("points")
        .map(value => value.toLong)
        
      val applicationIds = request.getQueryString("applicationIds")
        
      val devices = request.getQueryString("devices")
        
      val deviceIds = request.getQueryString("deviceIds")
        
      val deviceVersions = request.getQueryString("deviceVersions")
        
      val locations = request.getQueryString("locations")
        
      val radius = request.getQueryString("radius")
        
      api.updateMission(version, accountId, missionId, title, description, subType, metaData, startDate, endDate, active, gameLevelIds, creativeIds, audienceIds, offerId, balance, advancedReporting, allocateTickets, ticketCount, ticketType, points, applicationIds, devices, deviceIds, deviceVersions, locations, radius)
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
