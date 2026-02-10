package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.LeaderboardResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class LeaderboardApiController @Inject()(cc: ControllerComponents, api: LeaderboardApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/leaderboard/create?accountId=[value]&appKey=[value]&rankType=[value]&leaderboardMode=[value]&iconMedia=[value]&iconAssetId=[value]&bannerMedia=[value]&bannerAssetId=[value]&limitation=[value]&sortField=[value]&title=[value]&description=[value]&metaData=[value]
    */
  def createLeaderboard(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): LeaderboardResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      val rankType = request.getQueryString("rankType")
        
      val leaderboardMode = request.getQueryString("leaderboardMode")
        
      val iconMedia = request.getQueryString("iconMedia")
        
      val iconAssetId = request.getQueryString("iconAssetId")
        .map(value => value.toLong)
        
      val bannerMedia = request.getQueryString("bannerMedia")
        
      val bannerAssetId = request.getQueryString("bannerAssetId")
        .map(value => value.toLong)
        
      val limitation = request.getQueryString("limitation")
        .map(value => value.toInt)
        
      val sortField = request.getQueryString("sortField")
        
      val title = request.getQueryString("title")
        
      val description = request.getQueryString("description")
        
      val metaData = request.getQueryString("metaData")
        
      api.createLeaderboard(version, accountId, appKey, rankType, leaderboardMode, iconMedia, iconAssetId, bannerMedia, bannerAssetId, limitation, sortField, title, description, metaData)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/leaderboard/delete?accountId=[value]&leaderboardId=[value]
    */
  def deleteLeaderboard(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val leaderboardId = request.getQueryString("leaderboardId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("leaderboardId", "query string")
        }
        
      api.deleteLeaderboard(version, leaderboardId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/leaderboard/get?accountId=[value]&leaderboardId=[value]&includeFullRankingList=[value]
    */
  def getLeaderboard(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): LeaderboardResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val leaderboardId = request.getQueryString("leaderboardId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("leaderboardId", "query string")
        }
        
      val includeFullRankingList = request.getQueryString("includeFullRankingList")
        .map(value => value.toBoolean)
        
      api.getLeaderboard(version, leaderboardId, accountId, includeFullRankingList)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/leaderboard/search?accountId=[value]&appKey=[value]&globalOnly=[value]&keyword=[value]&leaderboardIds=[value]&rankTypes=[value]&sortField=[value]&descending=[value]&includeInactive=[value]&includeAppResponse=[value]&start=[value]&limit=[value]
    */
  def searchLeaderboards(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): LeaderboardResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      val globalOnly = request.getQueryString("globalOnly")
        .map(value => value.toBoolean)
        
      val keyword = request.getQueryString("keyword")
        
      val leaderboardIds = request.getQueryString("leaderboardIds")
        
      val rankTypes = request.getQueryString("rankTypes")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val includeInactive = request.getQueryString("includeInactive")
        .map(value => value.toBoolean)
        
      val includeAppResponse = request.getQueryString("includeAppResponse")
        .map(value => value.toBoolean)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.searchLeaderboards(version, accountId, appKey, globalOnly, keyword, leaderboardIds, rankTypes, sortField, descending, includeInactive, includeAppResponse, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/leaderboard/update?accountId=[value]&appKey=[value]&leaderboardId=[value]&rankType=[value]&leaderboardMode=[value]&sortField=[value]&iconMedia=[value]&iconAssetId=[value]&bannerMedia=[value]&bannerAssetId=[value]&limitation=[value]&active=[value]&title=[value]&description=[value]&metaData=[value]
    */
  def updateLeaderboard(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): LeaderboardResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      val leaderboardId = request.getQueryString("leaderboardId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("leaderboardId", "query string")
        }
        
      val rankType = request.getQueryString("rankType")
        
      val leaderboardMode = request.getQueryString("leaderboardMode")
        
      val sortField = request.getQueryString("sortField")
        
      val iconMedia = request.getQueryString("iconMedia")
        
      val iconAssetId = request.getQueryString("iconAssetId")
        .map(value => value.toLong)
        
      val bannerMedia = request.getQueryString("bannerMedia")
        
      val bannerAssetId = request.getQueryString("bannerAssetId")
        .map(value => value.toLong)
        
      val limitation = request.getQueryString("limitation")
        .map(value => value.toInt)
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val title = request.getQueryString("title")
        
      val description = request.getQueryString("description")
        
      val metaData = request.getQueryString("metaData")
        
      api.updateLeaderboard(version, leaderboardId, accountId, appKey, rankType, leaderboardMode, sortField, iconMedia, iconAssetId, bannerMedia, bannerAssetId, limitation, active, title, description, metaData)
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
