package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.JsObject
import model.RankFullResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class RankingApiController @Inject()(cc: ControllerComponents, api: RankingApi) extends AbstractController(cc) {
  /**
    * GET /api/:version/ranking/historical/search?deviceId=[value]&accountId=[value]&appKey=[value]&rankType=[value]&startDate=[value]&endDate=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]
    */
  def getHistoricalRankings(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): RankFullResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val rankType = request.getQueryString("rankType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("rankType", "query string")
        }
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("startDate", "query string")
        }
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("endDate", "query string")
        }
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getHistoricalRankings(version, appKey, rankType, startDate, endDate, deviceId, accountId, sortField, descending, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/ranking/search?deviceId=[value]&accountId=[value]&gameType=[value]&appKey=[value]&q=[value]&keyword=[value]&rankType=[value]&leaderboardMode=[value]&withinAccountIds=[value]&returnUserRank=[value]&albumId=[value]&audienceId=[value]&sortField=[value]&descending=[value]&i=[value]&start=[value]&l=[value]&limit=[value]
    */
  def getRankings(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): RankFullResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val gameType = request.getQueryString("gameType")
        
      val appKey = request.getQueryString("appKey")
        
      val q = request.getQueryString("q")
        
      val keyword = request.getQueryString("keyword")
        
      val rankType = request.getQueryString("rankType")
        
      val leaderboardMode = request.getQueryString("leaderboardMode")
        
      val withinAccountIds = request.getQueryString("withinAccountIds")
        
      val returnUserRank = request.getQueryString("returnUserRank")
        .map(value => value.toBoolean)
        
      val albumId = request.getQueryString("albumId")
        .map(value => value.toLong)
        
      val audienceId = request.getQueryString("audienceId")
        .map(value => value.toLong)
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val i = request.getQueryString("_i")
        .map(value => value.toInt)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val l = request.getQueryString("_l")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getRankings(version, deviceId, accountId, gameType, appKey, q, keyword, rankType, leaderboardMode, withinAccountIds, returnUserRank, albumId, audienceId, sortField, descending, i, start, l, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/ranking/personal/ranks?deviceId=[value]&accountId=[value]&appKey=[value]&rankType=[value]&returnUserRank=[value]&leaderboardMode=[value]&sortField=[value]&keyword=[value]&descending=[value]&start=[value]&limit=[value]
    */
  def getUserRank(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): JsObject = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      val rankType = request.getQueryString("rankType")
        
      val returnUserRank = request.getQueryString("returnUserRank")
        .map(value => value.toBoolean)
        
      val leaderboardMode = request.getQueryString("leaderboardMode")
        
      val sortField = request.getQueryString("sortField")
        
      val keyword = request.getQueryString("keyword")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getUserRank(version, deviceId, accountId, appKey, rankType, returnUserRank, leaderboardMode, sortField, keyword, descending, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/ranking/override?accountId=[value]&ownerAccountId=[value]&appKey=[value]&rankType=[value]&totalScore=[value]&totalCount=[value]&totalTime=[value]&dailyScore=[value]&dailyCount=[value]&dailyTime=[value]&weeklyScore=[value]&weeklyCount=[value]&weeklyTime=[value]&monthlyScore=[value]&monthlyCount=[value]&monthlyTime=[value]&topScore=[value]&lowestScore=[value]&streakCount=[value]&streakBestCount=[value]&startDate=[value]&endDate=[value]
    */
  def overrideUserRank(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val ownerAccountId = request.getQueryString("ownerAccountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("ownerAccountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val rankType = request.getQueryString("rankType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("rankType", "query string")
        }
        
      val totalScore = request.getQueryString("totalScore")
        .map(value => value.toLong)
        
      val totalCount = request.getQueryString("totalCount")
        .map(value => value.toLong)
        
      val totalTime = request.getQueryString("totalTime")
        .map(value => value.toLong)
        
      val dailyScore = request.getQueryString("dailyScore")
        .map(value => value.toLong)
        
      val dailyCount = request.getQueryString("dailyCount")
        .map(value => value.toLong)
        
      val dailyTime = request.getQueryString("dailyTime")
        .map(value => value.toLong)
        
      val weeklyScore = request.getQueryString("weeklyScore")
        .map(value => value.toLong)
        
      val weeklyCount = request.getQueryString("weeklyCount")
        .map(value => value.toLong)
        
      val weeklyTime = request.getQueryString("weeklyTime")
        .map(value => value.toLong)
        
      val monthlyScore = request.getQueryString("monthlyScore")
        .map(value => value.toLong)
        
      val monthlyCount = request.getQueryString("monthlyCount")
        .map(value => value.toLong)
        
      val monthlyTime = request.getQueryString("monthlyTime")
        .map(value => value.toLong)
        
      val topScore = request.getQueryString("topScore")
        .map(value => value.toLong)
        
      val lowestScore = request.getQueryString("lowestScore")
        .map(value => value.toLong)
        
      val streakCount = request.getQueryString("streakCount")
        .map(value => value.toLong)
        
      val streakBestCount = request.getQueryString("streakBestCount")
        .map(value => value.toLong)
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        
      api.overrideUserRank(version, accountId, ownerAccountId, appKey, rankType, totalScore, totalCount, totalTime, dailyScore, dailyCount, dailyTime, weeklyScore, weeklyCount, weeklyTime, monthlyScore, monthlyCount, monthlyTime, topScore, lowestScore, streakCount, streakBestCount, startDate, endDate)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/ranking/update?accountId=[value]&appKey=[value]&rankType=[value]&increment=[value]&timeIncrement=[value]&tag=[value]&startDate=[value]&endDate=[value]&updateGlobal=[value]&createLeaderboard=[value]
    */
  def updateRankings(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val rankType = request.getQueryString("rankType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("rankType", "query string")
        }
        
      val increment = request.getQueryString("increment")
        .map(value => value.toLong)
        
      val timeIncrement = request.getQueryString("timeIncrement")
        .map(value => value.toLong)
        
      val tag = request.getQueryString("tag")
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        
      val updateGlobal = request.getQueryString("updateGlobal")
        .map(value => value.toBoolean)
        
      val createLeaderboard = request.getQueryString("createLeaderboard")
        .map(value => value.toBoolean)
        
      api.updateRankings(version, accountId, appKey, rankType, increment, timeIncrement, tag, startDate, endDate, updateGlobal, createLeaderboard)
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
