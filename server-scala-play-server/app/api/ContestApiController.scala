package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AlbumContestListResponse
import model.AlbumContestResponse
import model.BigDecimal
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class ContestApiController @Inject()(cc: ControllerComponents, api: ContestApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/consumer/album/contest?deviceId=[value]&accountId=[value]&gameType=[value]&appKey=[value]&contestType=[value]&albumContestId=[value]&title=[value]&description=[value]&albumId1=[value]&removeAlbum1=[value]&albumId2=[value]&removeAlbum2=[value]&startDate=[value]&endDate=[value]&publicRead=[value]&publicWrite=[value]&publicDelete=[value]&publicAdd=[value]&locationDescription=[value]&visibility=[value]&connectionIdsToAdd=[value]&connectionGroupIdsToAdd=[value]&includeFriendGroup=[value]&latitude=[value]&longitude=[value]
    */
  def addOrUpdateAlbumContest(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): AlbumContestResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val gameType = request.getQueryString("gameType")
        
      val appKey = request.getQueryString("appKey")
        
      val contestType = request.getQueryString("contestType")
        
      val albumContestId = request.getQueryString("albumContestId")
        .map(value => value.toLong)
        
      val title = request.getQueryString("title")
        
      val description = request.getQueryString("description")
        
      val albumId1 = request.getQueryString("albumId1")
        .map(value => value.toLong)
        
      val removeAlbum1 = request.getQueryString("removeAlbum1")
        .map(value => value.toBoolean)
        
      val albumId2 = request.getQueryString("albumId2")
        .map(value => value.toLong)
        
      val removeAlbum2 = request.getQueryString("removeAlbum2")
        .map(value => value.toBoolean)
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        
      val publicRead = request.getQueryString("publicRead")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("publicRead", "query string")
        }
        
      val publicWrite = request.getQueryString("publicWrite")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("publicWrite", "query string")
        }
        
      val publicDelete = request.getQueryString("publicDelete")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("publicDelete", "query string")
        }
        
      val publicAdd = request.getQueryString("publicAdd")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("publicAdd", "query string")
        }
        
      val locationDescription = request.getQueryString("locationDescription")
        
      val visibility = request.getQueryString("visibility")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("visibility", "query string")
        }
        
      val connectionIdsToAdd = request.getQueryString("connectionIdsToAdd")
        
      val connectionGroupIdsToAdd = request.getQueryString("connectionGroupIdsToAdd")
        
      val includeFriendGroup = request.getQueryString("includeFriendGroup")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("includeFriendGroup", "query string")
        }
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.addOrUpdateAlbumContest(version, publicRead, publicWrite, publicDelete, publicAdd, visibility, includeFriendGroup, deviceId, accountId, gameType, appKey, contestType, albumContestId, title, description, albumId1, removeAlbum1, albumId2, removeAlbum2, startDate, endDate, locationDescription, connectionIdsToAdd, connectionGroupIdsToAdd, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/consumer/album/contest/approve?deviceId=[value]&accountId=[value]&albumContestId=[value]&approvalStatus=[value]
    */
  def approveAlbumContest(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val albumContestId = request.getQueryString("albumContestId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("albumContestId", "query string")
        }
        
      val approvalStatus = request.getQueryString("approvalStatus")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("approvalStatus", "query string")
        }
        
      api.approveAlbumContest(version, albumContestId, approvalStatus, deviceId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/consumer/album/contest/remove?deviceId=[value]&accountId=[value]&albumContestId=[value]&latitude=[value]&longitude=[value]
    */
  def deleteContest(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val albumContestId = request.getQueryString("albumContestId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("albumContestId", "query string")
        }
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.deleteContest(version, albumContestId, deviceId, accountId, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/consumer/album/contest/get?deviceId=[value]&accountId=[value]&albumContestId=[value]&latitude=[value]&longitude=[value]
    */
  def getAlbumContest(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): AlbumContestResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val albumContestId = request.getQueryString("albumContestId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("albumContestId", "query string")
        }
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.getAlbumContest(version, albumContestId, deviceId, accountId, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/consumer/album/contest/search?deviceId=[value]&accountId=[value]&gameType=[value]&appKey=[value]&appType=[value]&contestType=[value]&ownerId=[value]&q=[value]&keyword=[value]&filter=[value]&sortField=[value]&descending=[value]&i=[value]&start=[value]&l=[value]&limit=[value]&dateCreated=[value]&latitude=[value]&longitude=[value]
    */
  def getAlbumContests(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): AlbumContestListResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val gameType = request.getQueryString("gameType")
        
      val appKey = request.getQueryString("appKey")
        
      val appType = request.getQueryString("appType")
        
      val contestType = request.getQueryString("contestType")
        
      val ownerId = request.getQueryString("ownerId")
        .map(value => value.toLong)
        
      val q = request.getQueryString("q")
        
      val keyword = request.getQueryString("keyword")
        
      val filter = request.getQueryString("filter")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("filter", "query string")
        }
        
      val sortField = request.getQueryString("sortField")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("sortField", "query string")
        }
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("descending", "query string")
        }
        
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
        
      val dateCreated = request.getQueryString("dateCreated")
        .map(value => value.toLong)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.getAlbumContests(version, filter, sortField, descending, start, limit, deviceId, accountId, gameType, appKey, appType, contestType, ownerId, q, keyword, i, l, dateCreated, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/consumer/album/contest/vote?deviceId=[value]&accountId=[value]&albumContestId=[value]&albumId=[value]&contestType=[value]&latitude=[value]&longitude=[value]
    */
  def voteOnAlbumContest(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): AlbumContestResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val albumContestId = request.getQueryString("albumContestId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("albumContestId", "query string")
        }
        
      val albumId = request.getQueryString("albumId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("albumId", "query string")
        }
        
      val contestType = request.getQueryString("contestType")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.voteOnAlbumContest(version, albumContestId, albumId, deviceId, accountId, contestType, latitude, longitude)
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
