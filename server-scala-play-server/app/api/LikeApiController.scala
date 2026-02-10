package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.LikableResponse
import model.SearchResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class LikeApiController @Inject()(cc: ControllerComponents, api: LikeApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/like?deviceId=[value]&accountId=[value]&likableType=[value]&likableId=[value]&permissionableType=[value]&permissionableId=[value]&like=[value]&app=[value]&gameType=[value]&appKey=[value]&latitude=[value]&longitude=[value]
    */
  def registerLike(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): LikableResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val likableType = request.getQueryString("likableType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("likableType", "query string")
        }
        
      val likableId = request.getQueryString("likableId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("likableId", "query string")
        }
        
      val permissionableType = request.getQueryString("permissionableType")
        
      val permissionableId = request.getQueryString("permissionableId")
        .map(value => value.toLong)
        
      val like = request.getQueryString("like")
        .map(value => value.toBoolean)
        
      val app = request.getQueryString("app")
        
      val gameType = request.getQueryString("gameType")
        
      val appKey = request.getQueryString("appKey")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.registerLike(version, likableType, likableId, deviceId, accountId, permissionableType, permissionableId, like, app, gameType, appKey, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/like/delete?deviceId=[value]&accountId=[value]&likableType=[value]&likableId=[value]&latitude=[value]&longitude=[value]
    */
  def removeLike(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): LikableResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val likableType = request.getQueryString("likableType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("likableType", "query string")
        }
        
      val likableId = request.getQueryString("likableId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("likableId", "query string")
        }
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.removeLike(version, likableType, likableId, deviceId, accountId, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/like/search?deviceId=[value]&accountId=[value]&connectionAccountIds=[value]&likableType=[value]&likableId=[value]&sortField=[value]&descending=[value]&updatedSince=[value]&updatedBefore=[value]&start=[value]&limit=[value]
    */
  def searchLikes(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SearchResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val connectionAccountIds = request.getQueryString("connectionAccountIds")
        
      val likableType = request.getQueryString("likableType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("likableType", "query string")
        }
        
      val likableId = request.getQueryString("likableId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("likableId", "query string")
        }
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val updatedSince = request.getQueryString("updatedSince")
        .map(value => value.toLong)
        
      val updatedBefore = request.getQueryString("updatedBefore")
        .map(value => value.toLong)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.searchLikes(version, likableType, likableId, deviceId, accountId, connectionAccountIds, sortField, descending, updatedSince, updatedBefore, start, limit)
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
