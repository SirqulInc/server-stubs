package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.MissionResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class MissionInviteApiController @Inject()(cc: ControllerComponents, api: MissionInviteApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/mission/invite/create?deviceId=[value]&accountId=[value]&missionId=[value]&joinCode=[value]&includeGameData=[value]
    */
  def createMissionInvite(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): MissionResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val missionId = request.getQueryString("missionId")
        .map(value => value.toLong)
        
      val joinCode = request.getQueryString("joinCode")
        
      val includeGameData = request.getQueryString("includeGameData")
        .map(value => value.toBoolean)
        
      api.createMissionInvite(version, deviceId, accountId, missionId, joinCode, includeGameData)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/mission/invite/delete?deviceId=[value]&accountId=[value]&missionId=[value]&missionInviteId=[value]&includeGameData=[value]
    */
  def deleteMissionInvite(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val missionId = request.getQueryString("missionId")
        .map(value => value.toLong)
        
      val missionInviteId = request.getQueryString("missionInviteId")
        .map(value => value.toLong)
        
      val includeGameData = request.getQueryString("includeGameData")
        .map(value => value.toBoolean)
        
      api.deleteMissionInvite(version, deviceId, accountId, missionId, missionInviteId, includeGameData)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/mission/invite/get?deviceId=[value]&accountId=[value]&missionId=[value]&missionInviteId=[value]&includeGameData=[value]&includeScores=[value]
    */
  def getMissionInvite(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): MissionResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val missionId = request.getQueryString("missionId")
        .map(value => value.toLong)
        
      val missionInviteId = request.getQueryString("missionInviteId")
        .map(value => value.toLong)
        
      val includeGameData = request.getQueryString("includeGameData")
        .map(value => value.toBoolean)
        
      val includeScores = request.getQueryString("includeScores")
        
      api.getMissionInvite(version, deviceId, accountId, missionId, missionInviteId, includeGameData, includeScores)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/mission/invite/search?deviceId=[value]&accountId=[value]&appKey=[value]&appVersion=[value]&missionId=[value]&status=[value]&lastUpdated=[value]&start=[value]&limit=[value]&keyword=[value]&missionTypes=[value]&filterByBillable=[value]&includeGameData=[value]
    */
  def searchMissionInvites(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[MissionResponse] = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      val appVersion = request.getQueryString("appVersion")
        
      val missionId = request.getQueryString("missionId")
        .map(value => value.toLong)
        
      val status = request.getQueryString("status")
        
      val lastUpdated = request.getQueryString("lastUpdated")
        .map(value => value.toLong)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val keyword = request.getQueryString("keyword")
        
      val missionTypes = request.getQueryString("missionTypes")
        
      val filterByBillable = request.getQueryString("filterByBillable")
        .map(value => value.toBoolean)
        
      val includeGameData = request.getQueryString("includeGameData")
        .map(value => value.toBoolean)
        
      api.searchMissionInvites(version, deviceId, accountId, appKey, appVersion, missionId, status, lastUpdated, start, limit, keyword, missionTypes, filterByBillable, includeGameData)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/mission/invite/update?deviceId=[value]&accountId=[value]&appKey=[value]&missionId=[value]&missionInviteId=[value]&packId=[value]&gameLevelId=[value]&status=[value]&permissionableType=[value]&permissionableId=[value]&includeGameData=[value]
    */
  def updateMissionInvite(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): MissionResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      val missionId = request.getQueryString("missionId")
        .map(value => value.toLong)
        
      val missionInviteId = request.getQueryString("missionInviteId")
        .map(value => value.toLong)
        
      val packId = request.getQueryString("packId")
        .map(value => value.toLong)
        
      val gameLevelId = request.getQueryString("gameLevelId")
        .map(value => value.toLong)
        
      val status = request.getQueryString("status")
        
      val permissionableType = request.getQueryString("permissionableType")
        
      val permissionableId = request.getQueryString("permissionableId")
        .map(value => value.toLong)
        
      val includeGameData = request.getQueryString("includeGameData")
        .map(value => value.toBoolean)
        
      api.updateMissionInvite(version, deviceId, accountId, appKey, missionId, missionInviteId, packId, gameLevelId, status, permissionableType, permissionableId, includeGameData)
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
