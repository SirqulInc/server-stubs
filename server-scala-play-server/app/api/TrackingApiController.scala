package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AccountMiniResponse
import model.BigDecimal
import model.Leg
import model.LegResponse
import model.PredictedLocationResponse
import model.PreferredLocationResponse
import model.SirqulResponse
import model.StepResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class TrackingApiController @Inject()(cc: ControllerComponents, api: TrackingApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/tracking/batch/create?deviceId=[value]&accountId=[value]&data=[value]&generateAccounts=[value]&updateAccountLocations=[value]&defaultTag=[value]&slaveUID=[value]
    */
  def batchSaveTracking(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[Leg] = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val data = request.getQueryString("data")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("data", "query string")
        }
        
      val generateAccounts = request.getQueryString("generateAccounts")
        .map(value => value.toBoolean)
        
      val updateAccountLocations = request.getQueryString("updateAccountLocations")
        .map(value => value.toBoolean)
        
      val defaultTag = request.getQueryString("defaultTag")
        
      val slaveUID = request.getQueryString("slaveUID")
        
      api.batchSaveTracking(version, data, deviceId, accountId, generateAccounts, updateAccountLocations, defaultTag, slaveUID)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/tracking/predicted/get?accountId=[value]&latitude=[value]&longitude=[value]&dateCheck=[value]&hourCheck=[value]&threshold=[value]&distanceUnit=[value]&searchRange=[value]&sortOrder=[value]
    */
  def getPredictedLocations(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): PredictedLocationResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val dateCheck = request.getQueryString("dateCheck")
        .map(value => value.toLong)
        
      val hourCheck = request.getQueryString("hourCheck")
        
      val threshold = request.getQueryString("threshold")
        .map(value => value.toLong)
        
      val distanceUnit = request.getQueryString("distanceUnit")
        
      val searchRange = request.getQueryString("searchRange")
        .map(value => value.toDouble)
        
      val sortOrder = request.getQueryString("sortOrder")
        
      api.getPredictedLocations(version, accountId, latitude, longitude, dateCheck, hourCheck, threshold, distanceUnit, searchRange, sortOrder)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/tracking/path/get?accountId=[value]&startStepId=[value]&endStepId=[value]
    */
  def getPredictedPath(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[StepResponse] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val startStepId = request.getQueryString("startStepId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("startStepId", "query string")
        }
        
      val endStepId = request.getQueryString("endStepId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("endStepId", "query string")
        }
        
      api.getPredictedPath(version, accountId, startStepId, endStepId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/tracking/preferred/search?accountId=[value]&latitude=[value]&longitude=[value]&dateCheck=[value]&hourCheck=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&searchRange=[value]&distanceUnit=[value]
    */
  def getPreferredLocations(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[PreferredLocationResponse] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val dateCheck = request.getQueryString("dateCheck")
        .map(value => value.toLong)
        
      val hourCheck = request.getQueryString("hourCheck")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val searchRange = request.getQueryString("searchRange")
        .map(value => value.toDouble)
        
      val distanceUnit = request.getQueryString("distanceUnit")
        
      api.getPreferredLocations(version, accountId, latitude, longitude, dateCheck, hourCheck, sortField, descending, start, limit, searchRange, distanceUnit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/tracking/search?deviceId=[value]&accountId=[value]&ownerId=[value]&trackingDeviceId=[value]&startDate=[value]&endDate=[value]&tags=[value]&getLastPoint=[value]
    */
  def getTrackingLegs(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[LegResponse] = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val ownerId = request.getQueryString("ownerId")
        .map(value => value.toLong)
        
      val trackingDeviceId = request.getQueryString("trackingDeviceId")
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        
      val tags = request.getQueryString("tags")
        
      val getLastPoint = request.getQueryString("getLastPoint")
        .map(value => value.toBoolean)
        
      api.getTrackingLegs(version, deviceId, accountId, ownerId, trackingDeviceId, startDate, endDate, tags, getLastPoint)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/tracking/leg/create?deviceId=[value]&accountId=[value]&distance=[value]&duration=[value]&startLat=[value]&startLng=[value]&startDate=[value]&endLat=[value]&endLng=[value]&endDate=[value]&steps=[value]&tags=[value]
    */
  def saveTrackingLeg(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val distance = request.getQueryString("distance")
        .map(value => value.toDouble)
        
      val duration = request.getQueryString("duration")
        .map(value => value.toLong)
        
      val startLat = request.getQueryString("startLat")
        .map(value => value.toDouble)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("startLat", "query string")
        }
        
      val startLng = request.getQueryString("startLng")
        .map(value => value.toDouble)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("startLng", "query string")
        }
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("startDate", "query string")
        }
        
      val endLat = request.getQueryString("endLat")
        .map(value => value.toDouble)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("endLat", "query string")
        }
        
      val endLng = request.getQueryString("endLng")
        .map(value => value.toDouble)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("endLng", "query string")
        }
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("endDate", "query string")
        }
        
      val steps = request.getQueryString("steps")
        
      val tags = request.getQueryString("tags")
        
      api.saveTrackingLeg(version, startLat, startLng, startDate, endLat, endLng, endDate, deviceId, accountId, distance, duration, steps, tags)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/tracking/step/create?deviceId=[value]&accountId=[value]&legId=[value]&distance=[value]&duration=[value]&startLat=[value]&startLng=[value]&startDate=[value]&endLat=[value]&endLng=[value]&endDate=[value]
    */
  def saveTrackingStep(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val legId = request.getQueryString("legId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("legId", "query string")
        }
        
      val distance = request.getQueryString("distance")
        .map(value => value.toDouble)
        
      val duration = request.getQueryString("duration")
        .map(value => value.toLong)
        
      val startLat = request.getQueryString("startLat")
        .map(value => value.toDouble)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("startLat", "query string")
        }
        
      val startLng = request.getQueryString("startLng")
        .map(value => value.toDouble)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("startLng", "query string")
        }
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("startDate", "query string")
        }
        
      val endLat = request.getQueryString("endLat")
        .map(value => value.toDouble)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("endLat", "query string")
        }
        
      val endLng = request.getQueryString("endLng")
        .map(value => value.toDouble)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("endLng", "query string")
        }
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("endDate", "query string")
        }
        
      api.saveTrackingStep(version, legId, startLat, startLng, startDate, endLat, endLng, endDate, deviceId, accountId, distance, duration)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/tracking/list?accountId=[value]&keyword=[value]&startDate=[value]&endDate=[value]&tags=[value]&audienceIds=[value]&latitude=[value]&longitude=[value]&range=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&activeOnly=[value]
    */
  def searchAccountsWithTrackingLegs(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[AccountMiniResponse] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val keyword = request.getQueryString("keyword")
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        
      val tags = request.getQueryString("tags")
        
      val audienceIds = request.getQueryString("audienceIds")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val range = request.getQueryString("range")
        .map(value => value.toDouble)
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        
      api.searchAccountsWithTrackingLegs(version, accountId, keyword, startDate, endDate, tags, audienceIds, latitude, longitude, range, sortField, descending, start, limit, activeOnly)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/tracking/searchByBillable?accountId=[value]&appKey=[value]&trackingDeviceId=[value]&startDate=[value]&endDate=[value]&tags=[value]&start=[value]&limit=[value]
    */
  def searchTrackingLegs(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[LegResponse] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val trackingDeviceId = request.getQueryString("trackingDeviceId")
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        
      val tags = request.getQueryString("tags")
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.searchTrackingLegs(version, accountId, appKey, trackingDeviceId, startDate, endDate, tags, start, limit)
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
