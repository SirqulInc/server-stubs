package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.MissionResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class MissionInviteApiController @Inject()(cc: ControllerComponents, api: MissionInviteApi) extends AbstractController(cc) {
  /**
    * POST /api/3.18/mission/invite/create?deviceId=[value]&accountId=[value]&missionId=[value]&joinCode=[value]&includeGameData=[value]
    */
  def createMissionInvite(): Action[AnyContent] = Action { request =>
    def executeApi(): MissionResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val missionId = request.getQueryString("missionId")
        .map(value => value.toLong)
        
      val joinCode = request.getQueryString("joinCode")
        
      val includeGameData = request.getQueryString("includeGameData")
        .map(value => value.toBoolean)
        
      api.createMissionInvite(deviceId, accountId, missionId, joinCode, includeGameData)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/mission/invite/delete?deviceId=[value]&accountId=[value]&missionId=[value]&missionInviteId=[value]&includeGameData=[value]
    */
  def deleteMissionInvite(): Action[AnyContent] = Action { request =>
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
        
      api.deleteMissionInvite(deviceId, accountId, missionId, missionInviteId, includeGameData)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/mission/invite/get?deviceId=[value]&accountId=[value]&missionId=[value]&missionInviteId=[value]&includeGameData=[value]&includeScores=[value]
    */
  def getMissionInvite(): Action[AnyContent] = Action { request =>
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
        
      api.getMissionInvite(deviceId, accountId, missionId, missionInviteId, includeGameData, includeScores)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/mission/invite/search?deviceId=[value]&accountId=[value]&appKey=[value]&appVersion=[value]&missionId=[value]&status=[value]&lastUpdated=[value]&start=[value]&limit=[value]&keyword=[value]&missionTypes=[value]&filterByBillable=[value]&includeGameData=[value]
    */
  def searchMissionInvites(): Action[AnyContent] = Action { request =>
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
        
      api.searchMissionInvites(deviceId, accountId, appKey, appVersion, missionId, status, lastUpdated, start, limit, keyword, missionTypes, filterByBillable, includeGameData)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/mission/invite/update?deviceId=[value]&accountId=[value]&appKey=[value]&missionId=[value]&missionInviteId=[value]&packId=[value]&gameLevelId=[value]&status=[value]&permissionableType=[value]&permissionableId=[value]&includeGameData=[value]
    */
  def updateMissionInvite(): Action[AnyContent] = Action { request =>
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
        
      api.updateMissionInvite(deviceId, accountId, appKey, missionId, missionInviteId, packId, gameLevelId, status, permissionableType, permissionableId, includeGameData)
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
