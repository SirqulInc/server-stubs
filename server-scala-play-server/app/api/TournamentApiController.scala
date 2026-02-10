package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.MissionShortResponse
import model.SirqulResponse
import model.TournamentResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class TournamentApiController @Inject()(cc: ControllerComponents, api: TournamentApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/tournament/create?accountId=[value]&appKey=[value]&title=[value]&subType=[value]&imageAssetId=[value]&secondsBetweenLevels=[value]&secondsForTieBreaker=[value]&secondsBetweenPacks=[value]&maximumLevelLength=[value]&costToPlay=[value]&costToPlayType=[value]&minimumToPlay=[value]&startingLimit=[value]&availableLimit=[value]&description=[value]&metaData=[value]&startDate=[value]&audienceIds=[value]&active=[value]&enableBuyBack=[value]&offerIds=[value]&offerAssetId=[value]&fixedReward=[value]&splitReward=[value]&allocateTickets=[value]&tournamentData=[value]&missionType=[value]&visibility=[value]&preliminaryGroups=[value]&preliminaryGroupAdvancements=[value]&enableMultipleEntries=[value]&enableMultipleVotes=[value]&featured=[value]&winnerTag=[value]&tieTag=[value]
    */
  def createTournament(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): TournamentResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val title = request.getQueryString("title")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("title", "query string")
        }
        
      val subType = request.getQueryString("subType")
        
      val imageAssetId = request.getQueryString("imageAssetId")
        .map(value => value.toLong)
        
      val secondsBetweenLevels = request.getQueryString("secondsBetweenLevels")
        .map(value => value.toInt)
        
      val secondsForTieBreaker = request.getQueryString("secondsForTieBreaker")
        .map(value => value.toInt)
        
      val secondsBetweenPacks = request.getQueryString("secondsBetweenPacks")
        .map(value => value.toInt)
        
      val maximumLevelLength = request.getQueryString("maximumLevelLength")
        .map(value => value.toInt)
        
      val costToPlay = request.getQueryString("costToPlay")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("costToPlay", "query string")
        }
        
      val costToPlayType = request.getQueryString("costToPlayType")
        
      val minimumToPlay = request.getQueryString("minimumToPlay")
        .map(value => value.toInt)
        
      val startingLimit = request.getQueryString("startingLimit")
        .map(value => value.toInt)
        
      val availableLimit = request.getQueryString("availableLimit")
        .map(value => value.toInt)
        
      val description = request.getQueryString("description")
        
      val metaData = request.getQueryString("metaData")
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("startDate", "query string")
        }
        
      val audienceIds = request.getQueryString("audienceIds")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val enableBuyBack = request.getQueryString("enableBuyBack")
        .map(value => value.toBoolean)
        
      val offerIds = request.getQueryString("offerIds")
        
      val offerAssetId = request.getQueryString("offerAssetId")
        .map(value => value.toLong)
        
      val fixedReward = request.getQueryString("fixedReward")
        .map(value => value.toBoolean)
        
      val splitReward = request.getQueryString("splitReward")
        
      val allocateTickets = request.getQueryString("allocateTickets")
        .map(value => value.toBoolean)
        
      val tournamentData = request.getQueryString("tournamentData")
        
      val missionType = request.getQueryString("missionType")
        
      val visibility = request.getQueryString("visibility")
        
      val preliminaryGroups = request.getQueryString("preliminaryGroups")
        .map(value => value.toInt)
        
      val preliminaryGroupAdvancements = request.getQueryString("preliminaryGroupAdvancements")
        
      val enableMultipleEntries = request.getQueryString("enableMultipleEntries")
        .map(value => value.toBoolean)
        
      val enableMultipleVotes = request.getQueryString("enableMultipleVotes")
        .map(value => value.toBoolean)
        
      val featured = request.getQueryString("featured")
        .map(value => value.toBoolean)
        
      val winnerTag = request.getQueryString("winnerTag")
        
      val tieTag = request.getQueryString("tieTag")
        
      api.createTournament(version, accountId, appKey, title, costToPlay, startDate, subType, imageAssetId, secondsBetweenLevels, secondsForTieBreaker, secondsBetweenPacks, maximumLevelLength, costToPlayType, minimumToPlay, startingLimit, availableLimit, description, metaData, audienceIds, active, enableBuyBack, offerIds, offerAssetId, fixedReward, splitReward, allocateTickets, tournamentData, missionType, visibility, preliminaryGroups, preliminaryGroupAdvancements, enableMultipleEntries, enableMultipleVotes, featured, winnerTag, tieTag)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/tournament/delete?accountId=[value]&missionId=[value]
    */
  def deleteTournament(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      api.deleteTournament(version, accountId, missionId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/tournament/get?accountId=[value]&missionId=[value]&joinCode=[value]&includeScores=[value]&objectPreviewSize=[value]
    */
  def getTournament(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): TournamentResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val missionId = request.getQueryString("missionId")
        .map(value => value.toLong)
        
      val joinCode = request.getQueryString("joinCode")
        
      val includeScores = request.getQueryString("includeScores")
        
      val objectPreviewSize = request.getQueryString("objectPreviewSize")
        .map(value => value.toInt)
        
      api.getTournament(version, accountId, missionId, joinCode, includeScores, objectPreviewSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/tournament/object/search?accountId=[value]&gameLevelId=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]
    */
  def searchObjects(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val gameLevelId = request.getQueryString("gameLevelId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("gameLevelId", "query string")
        }
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.searchObjects(version, accountId, gameLevelId, sortField, descending, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/tournament/round/search?accountId=[value]&appKey=[value]&status=[value]&missionType=[value]&currentOnly=[value]&visibilities=[value]&start=[value]&limit=[value]
    */
  def searchRounds(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      val status = request.getQueryString("status")
        
      val missionType = request.getQueryString("missionType")
        
      val currentOnly = request.getQueryString("currentOnly")
        .map(value => value.toBoolean)
        
      val visibilities = request.getQueryString("visibilities")
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.searchRounds(version, accountId, appKey, status, missionType, currentOnly, visibilities, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/tournament/search?accountId=[value]&appKey=[value]&keyword=[value]&subType=[value]&includeInactive=[value]&missionTypes=[value]&filter=[value]&sortField=[value]&descending=[value]&visibility=[value]&start=[value]&limit=[value]
    */
  def searchTournaments(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): MissionShortResponse = {
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
        
      val subType = request.getQueryString("subType")
        
      val includeInactive = request.getQueryString("includeInactive")
        .map(value => value.toBoolean)
        
      val missionTypes = request.getQueryString("missionTypes")
        
      val filter = request.getQueryString("filter")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val visibility = request.getQueryString("visibility")
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.searchTournaments(version, accountId, appKey, keyword, subType, includeInactive, missionTypes, filter, sortField, descending, visibility, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/tournament/score?accountId=[value]&appKey=[value]&missionId=[value]&gameId=[value]&packId=[value]&gameLevelId=[value]&scores=[value]
    */
  def submitTournamentScore(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      val missionId = request.getQueryString("missionId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("missionId", "query string")
        }
        
      val gameId = request.getQueryString("gameId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("gameId", "query string")
        }
        
      val packId = request.getQueryString("packId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("packId", "query string")
        }
        
      val gameLevelId = request.getQueryString("gameLevelId")
        .map(value => value.toLong)
        
      val scores = request.getQueryString("scores")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("scores", "query string")
        }
        
      api.submitTournamentScore(version, accountId, appKey, missionId, gameId, packId, scores, gameLevelId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/tournament/vote?deviceId=[value]&accountId=[value]&appKey=[value]&missionId=[value]&gameObjectId=[value]&checkIfDeviceAlreadyVoted=[value]
    */
  def submitTournamentVote(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
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
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("missionId", "query string")
        }
        
      val gameObjectId = request.getQueryString("gameObjectId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("gameObjectId", "query string")
        }
        
      val checkIfDeviceAlreadyVoted = request.getQueryString("checkIfDeviceAlreadyVoted")
        .map(value => value.toBoolean)
        
      api.submitTournamentVote(version, accountId, appKey, missionId, gameObjectId, deviceId, checkIfDeviceAlreadyVoted)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/tournament/substitute?accountId=[value]&missionId=[value]&packId=[value]&gameLevelId=[value]
    */
  def substituteTournamentPlayer(version: BigDecimal): Action[AnyContent] = Action { request =>
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
        
      val packId = request.getQueryString("packId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("packId", "query string")
        }
        
      val gameLevelId = request.getQueryString("gameLevelId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("gameLevelId", "query string")
        }
        
      api.substituteTournamentPlayer(version, accountId, missionId, packId, gameLevelId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/tournament/update?accountId=[value]&missionId=[value]&title=[value]&subType=[value]&imageAssetId=[value]&secondsBetweenLevels=[value]&secondsForTieBreaker=[value]&secondsBetweenPacks=[value]&maximumLevelLength=[value]&costToPlay=[value]&costToPlayType=[value]&minimumToPlay=[value]&startingLimit=[value]&availableLimit=[value]&description=[value]&metaData=[value]&startDate=[value]&audienceIds=[value]&active=[value]&enableBuyBack=[value]&offerIds=[value]&offerAssetId=[value]&fixedReward=[value]&splitReward=[value]&allocateTickets=[value]&tournamentData=[value]&visibility=[value]&preliminaryGroups=[value]&preliminaryGroupAdvancements=[value]&enableMultipleEntries=[value]&enableMultipleVotes=[value]&featured=[value]&winnerTag=[value]&tieTag=[value]
    */
  def updateTournament(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): TournamentResponse = {
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
        
      val subType = request.getQueryString("subType")
        
      val imageAssetId = request.getQueryString("imageAssetId")
        .map(value => value.toLong)
        
      val secondsBetweenLevels = request.getQueryString("secondsBetweenLevels")
        .map(value => value.toInt)
        
      val secondsForTieBreaker = request.getQueryString("secondsForTieBreaker")
        .map(value => value.toInt)
        
      val secondsBetweenPacks = request.getQueryString("secondsBetweenPacks")
        .map(value => value.toInt)
        
      val maximumLevelLength = request.getQueryString("maximumLevelLength")
        .map(value => value.toInt)
        
      val costToPlay = request.getQueryString("costToPlay")
        .map(value => value.toInt)
        
      val costToPlayType = request.getQueryString("costToPlayType")
        
      val minimumToPlay = request.getQueryString("minimumToPlay")
        .map(value => value.toInt)
        
      val startingLimit = request.getQueryString("startingLimit")
        .map(value => value.toInt)
        
      val availableLimit = request.getQueryString("availableLimit")
        .map(value => value.toInt)
        
      val description = request.getQueryString("description")
        
      val metaData = request.getQueryString("metaData")
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val audienceIds = request.getQueryString("audienceIds")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val enableBuyBack = request.getQueryString("enableBuyBack")
        .map(value => value.toBoolean)
        
      val offerIds = request.getQueryString("offerIds")
        
      val offerAssetId = request.getQueryString("offerAssetId")
        .map(value => value.toLong)
        
      val fixedReward = request.getQueryString("fixedReward")
        .map(value => value.toBoolean)
        
      val splitReward = request.getQueryString("splitReward")
        
      val allocateTickets = request.getQueryString("allocateTickets")
        .map(value => value.toBoolean)
        
      val tournamentData = request.getQueryString("tournamentData")
        
      val visibility = request.getQueryString("visibility")
        
      val preliminaryGroups = request.getQueryString("preliminaryGroups")
        .map(value => value.toInt)
        
      val preliminaryGroupAdvancements = request.getQueryString("preliminaryGroupAdvancements")
        
      val enableMultipleEntries = request.getQueryString("enableMultipleEntries")
        .map(value => value.toBoolean)
        
      val enableMultipleVotes = request.getQueryString("enableMultipleVotes")
        .map(value => value.toBoolean)
        
      val featured = request.getQueryString("featured")
        .map(value => value.toBoolean)
        
      val winnerTag = request.getQueryString("winnerTag")
        
      val tieTag = request.getQueryString("tieTag")
        
      api.updateTournament(version, accountId, missionId, title, subType, imageAssetId, secondsBetweenLevels, secondsForTieBreaker, secondsBetweenPacks, maximumLevelLength, costToPlay, costToPlayType, minimumToPlay, startingLimit, availableLimit, description, metaData, startDate, audienceIds, active, enableBuyBack, offerIds, offerAssetId, fixedReward, splitReward, allocateTickets, tournamentData, visibility, preliminaryGroups, preliminaryGroupAdvancements, enableMultipleEntries, enableMultipleVotes, featured, winnerTag, tieTag)
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
