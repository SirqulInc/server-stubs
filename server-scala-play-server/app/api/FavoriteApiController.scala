package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AccountResponse
import model.BigDecimal
import model.SearchResponse
import model.SirqulResponse
import model.WrappedResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class FavoriteApiController @Inject()(cc: ControllerComponents, api: FavoriteApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/favorite/create?deviceId=[value]&accountId=[value]&favoritableId=[value]&favoritableType=[value]&latitude=[value]&longitude=[value]
    */
  def addFavorite(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): WrappedResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val favoritableId = request.getQueryString("favoritableId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("favoritableId", "query string")
        }
        
      val favoritableType = request.getQueryString("favoritableType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("favoritableType", "query string")
        }
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.addFavorite(version, favoritableId, favoritableType, deviceId, accountId, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/favorite/delete?deviceId=[value]&accountId=[value]&favoriteId=[value]&favoritableId=[value]&favoritableType=[value]
    */
  def deleteFavorite(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val favoriteId = request.getQueryString("favoriteId")
        .map(value => value.toLong)
        
      val favoritableId = request.getQueryString("favoritableId")
        .map(value => value.toLong)
        
      val favoritableType = request.getQueryString("favoritableType")
        
      api.deleteFavorite(version, deviceId, accountId, favoriteId, favoritableId, favoritableType)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/favorite/get?deviceId=[value]&accountId=[value]&favoriteId=[value]&latitude=[value]&longitude=[value]
    */
  def getFavorite(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): WrappedResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val favoriteId = request.getQueryString("favoriteId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("favoriteId", "query string")
        }
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.getFavorite(version, favoriteId, deviceId, accountId, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/favorite/search?deviceId=[value]&accountId=[value]&connectionAccountId=[value]&favoritableType=[value]&secondaryType=[value]&keyword=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&activeOnly=[value]&returnFullResponse=[value]&latitude=[value]&longitude=[value]
    */
  def searchFavorites(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SearchResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val connectionAccountId = request.getQueryString("connectionAccountId")
        .map(value => value.toLong)
        
      val favoritableType = request.getQueryString("favoritableType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("favoritableType", "query string")
        }
        
      val secondaryType = request.getQueryString("secondaryType")
        
      val keyword = request.getQueryString("keyword")
        
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
        
      val returnFullResponse = request.getQueryString("returnFullResponse")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("returnFullResponse", "query string")
        }
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.searchFavorites(version, favoritableType, sortField, descending, start, limit, activeOnly, returnFullResponse, deviceId, accountId, connectionAccountId, secondaryType, keyword, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/favorite/whois?deviceId=[value]&accountId=[value]&latitude=[value]&longitude=[value]&favoritableId=[value]&favoritableType=[value]&keyword=[value]&start=[value]&limit=[value]
    */
  def whoHasFavorited(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[AccountResponse] = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val favoritableId = request.getQueryString("favoritableId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("favoritableId", "query string")
        }
        
      val favoritableType = request.getQueryString("favoritableType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("favoritableType", "query string")
        }
        
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
        
      api.whoHasFavorited(version, favoritableId, favoritableType, start, limit, deviceId, accountId, latitude, longitude, keyword)
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
