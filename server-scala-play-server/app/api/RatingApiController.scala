package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.RatingIndexResponse
import model.RatingResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class RatingApiController @Inject()(cc: ControllerComponents, api: RatingApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/rating/create?deviceId=[value]&accountId=[value]&ratableType=[value]&ratableId=[value]&ratingValue=[value]&categoryId=[value]&display=[value]&description=[value]&locationDescription=[value]&latitude=[value]&longitude=[value]
    */
  def createRating(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): RatingResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val ratableType = request.getQueryString("ratableType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("ratableType", "query string")
        }
        
      val ratableId = request.getQueryString("ratableId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("ratableId", "query string")
        }
        
      val ratingValue = request.getQueryString("ratingValue")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("ratingValue", "query string")
        }
        
      val categoryId = request.getQueryString("categoryId")
        .map(value => value.toLong)
        
      val display = request.getQueryString("display")
        
      val description = request.getQueryString("description")
        
      val locationDescription = request.getQueryString("locationDescription")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.createRating(version, ratableType, ratableId, ratingValue, deviceId, accountId, categoryId, display, description, locationDescription, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/rating/delete?deviceId=[value]&accountId=[value]&ratingId=[value]
    */
  def deleteRating(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val ratingId = request.getQueryString("ratingId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("ratingId", "query string")
        }
        
      api.deleteRating(version, ratingId, deviceId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/location/rating/index/search?categoryIds=[value]&keyword=[value]&locationType=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&searchRange=[value]&latitude=[value]&longitude=[value]&returnOverallRating=[value]&distanceUnit=[value]&returnRetailer=[value]&returnAssets=[value]&returnOffers=[value]&returnCategories=[value]&returnFilters=[value]
    */
  def searchLocationRatingIndexes(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[RatingIndexResponse] = {
      val categoryIds = request.getQueryString("categoryIds")
        
      val keyword = request.getQueryString("keyword")
        
      val locationType = request.getQueryString("locationType")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val searchRange = request.getQueryString("searchRange")
        .map(value => value.toDouble)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val returnOverallRating = request.getQueryString("returnOverallRating")
        .map(value => value.toBoolean)
        
      val distanceUnit = request.getQueryString("distanceUnit")
        
      val returnRetailer = request.getQueryString("returnRetailer")
        .map(value => value.toBoolean)
        
      val returnAssets = request.getQueryString("returnAssets")
        .map(value => value.toBoolean)
        
      val returnOffers = request.getQueryString("returnOffers")
        .map(value => value.toBoolean)
        
      val returnCategories = request.getQueryString("returnCategories")
        .map(value => value.toBoolean)
        
      val returnFilters = request.getQueryString("returnFilters")
        .map(value => value.toBoolean)
        
      api.searchLocationRatingIndexes(version, categoryIds, keyword, locationType, sortField, descending, start, limit, searchRange, latitude, longitude, returnOverallRating, distanceUnit, returnRetailer, returnAssets, returnOffers, returnCategories, returnFilters)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/rating/index/search?ratableType=[value]&ratableIds=[value]&categoryIds=[value]&secondaryType=[value]&keyword=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&latitude=[value]&longitude=[value]&returnRatable=[value]&returnOverallRating=[value]
    */
  def searchRatingIndexes(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[RatingIndexResponse] = {
      val ratableType = request.getQueryString("ratableType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("ratableType", "query string")
        }
        
      val ratableIds = request.getQueryString("ratableIds")
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val secondaryType = request.getQueryString("secondaryType")
        
      val keyword = request.getQueryString("keyword")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val returnRatable = request.getQueryString("returnRatable")
        .map(value => value.toBoolean)
        
      val returnOverallRating = request.getQueryString("returnOverallRating")
        .map(value => value.toBoolean)
        
      api.searchRatingIndexes(version, ratableType, ratableIds, categoryIds, secondaryType, keyword, sortField, descending, start, limit, latitude, longitude, returnRatable, returnOverallRating)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/rating/search?deviceId=[value]&accountId=[value]&filterAccountId=[value]&ratableType=[value]&ratableId=[value]&categoryIds=[value]&keyword=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]
    */
  def searchRatings(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[RatingResponse] = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val filterAccountId = request.getQueryString("filterAccountId")
        .map(value => value.toLong)
        
      val ratableType = request.getQueryString("ratableType")
        
      val ratableId = request.getQueryString("ratableId")
        .map(value => value.toLong)
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val keyword = request.getQueryString("keyword")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.searchRatings(version, deviceId, accountId, filterAccountId, ratableType, ratableId, categoryIds, keyword, sortField, descending, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/rating/update?deviceId=[value]&accountId=[value]&ratingId=[value]&ratingValue=[value]&categoryId=[value]&display=[value]&description=[value]&locationDescription=[value]&latitude=[value]&longitude=[value]
    */
  def updateRating(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): RatingResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val ratingId = request.getQueryString("ratingId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("ratingId", "query string")
        }
        
      val ratingValue = request.getQueryString("ratingValue")
        .map(value => value.toInt)
        
      val categoryId = request.getQueryString("categoryId")
        .map(value => value.toLong)
        
      val display = request.getQueryString("display")
        
      val description = request.getQueryString("description")
        
      val locationDescription = request.getQueryString("locationDescription")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.updateRating(version, ratingId, deviceId, accountId, ratingValue, categoryId, display, description, locationDescription, latitude, longitude)
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
