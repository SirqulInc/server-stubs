package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AvailabilityResponse
import model.ReservationResponse
import model.TimeSlotResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class ReservationApiController @Inject()(cc: ControllerComponents, api: ReservationApi) extends AbstractController(cc) {
  /**
    * POST /api/3.18/reservation/create?deviceId=[value]&accountId=[value]&startDate=[value]&endDate=[value]&offerId=[value]&offerLocationId=[value]&appKey=[value]&metaData=[value]
    */
  def createReservation(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        
      val offerId = request.getQueryString("offerId")
        .map(value => value.toLong)
        
      val offerLocationId = request.getQueryString("offerLocationId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      val metaData = request.getQueryString("metaData")
        
      api.createReservation(deviceId, accountId, startDate, endDate, offerId, offerLocationId, appKey, metaData)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/3.18/reservation/delete?deviceId=[value]&accountId=[value]&reservationId=[value]
    */
  def deleteReservation(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val reservationId = request.getQueryString("reservationId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("reservationId", "query string")
        }
        
      api.deleteReservation(reservationId, deviceId, accountId)
    }

    executeApi()
    Ok
  }

  /**
    * POST /api/3.18/reservable/availability/update?deviceId=[value]&accountId=[value]&reservableId=[value]&reservableType=[value]&availability=[value]&availabilitySummary=[value]
    */
  def reservableAvailability(): Action[AnyContent] = Action { request =>
    def executeApi(): List[AvailabilityResponse] = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val reservableId = request.getQueryString("reservableId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("reservableId", "query string")
        }
        
      val reservableType = request.getQueryString("reservableType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("reservableType", "query string")
        }
        
      val availability = request.getQueryString("availability")
        
      val availabilitySummary = request.getQueryString("availabilitySummary")
        
      api.reservableAvailability(reservableId, reservableType, deviceId, accountId, availability, availabilitySummary)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/reservable/availability/search?deviceId=[value]&accountId=[value]&reservableId=[value]&reservableType=[value]&startDate=[value]&endDate=[value]&start=[value]&limit=[value]
    */
  def searchAvailability(): Action[AnyContent] = Action { request =>
    def executeApi(): List[AvailabilityResponse] = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val reservableId = request.getQueryString("reservableId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("reservableId", "query string")
        }
        
      val reservableType = request.getQueryString("reservableType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("reservableType", "query string")
        }
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.searchAvailability(reservableId, reservableType, deviceId, accountId, startDate, endDate, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/reservation/search?deviceId=[value]&appKey=[value]&accountId=[value]&filterAccountId=[value]&reservableId=[value]&reservableType=[value]&keyword=[value]&startDate=[value]&endDate=[value]&start=[value]&limit=[value]
    */
  def searchReservations(): Action[AnyContent] = Action { request =>
    def executeApi(): List[ReservationResponse] = {
      val deviceId = request.getQueryString("deviceId")
        
      val appKey = request.getQueryString("appKey")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val filterAccountId = request.getQueryString("filterAccountId")
        .map(value => value.toLong)
        
      val reservableId = request.getQueryString("reservableId")
        .map(value => value.toLong)
        
      val reservableType = request.getQueryString("reservableType")
        
      val keyword = request.getQueryString("keyword")
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.searchReservations(deviceId, appKey, accountId, filterAccountId, reservableId, reservableType, keyword, startDate, endDate, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/reservable/schedule/search?deviceId=[value]&accountId=[value]&reservableId=[value]&reservableType=[value]&startDate=[value]&endDate=[value]&timeBucketMins=[value]
    */
  def searchSchedule(): Action[AnyContent] = Action { request =>
    def executeApi(): List[TimeSlotResponse] = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val reservableId = request.getQueryString("reservableId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("reservableId", "query string")
        }
        
      val reservableType = request.getQueryString("reservableType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("reservableType", "query string")
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
        
      val timeBucketMins = request.getQueryString("timeBucketMins")
        .map(value => value.toInt)
        
      api.searchSchedule(reservableId, reservableType, startDate, endDate, deviceId, accountId, timeBucketMins)
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
