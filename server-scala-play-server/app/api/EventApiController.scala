package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.EventAttendanceResponse
import model.OfferResponse
import model.OfferShortResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class EventApiController @Inject()(cc: ControllerComponents, api: EventApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/event/attend?deviceId=[value]&accountId=[value]&appKey=[value]&listingId=[value]&retailerLocationId=[value]&offerLocationId=[value]&transactionId=[value]&status=[value]&latitude=[value]&longitude=[value]
    */
  def attendEvent(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OfferResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      val listingId = request.getQueryString("listingId")
        .map(value => value.toLong)
        
      val retailerLocationId = request.getQueryString("retailerLocationId")
        .map(value => value.toLong)
        
      val offerLocationId = request.getQueryString("offerLocationId")
        .map(value => value.toLong)
        
      val transactionId = request.getQueryString("transactionId")
        .map(value => value.toLong)
        
      val status = request.getQueryString("status")
        .map(value => value.toInt)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.attendEvent(version, deviceId, accountId, appKey, listingId, retailerLocationId, offerLocationId, transactionId, status, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/event/create?accountId=[value]&retailerLocationIds=[value]&title=[value]&subTitle=[value]&details=[value]&categoryIds=[value]&filterIds=[value]&active=[value]&imageAssetId=[value]&redeemableStart=[value]&redeemableEnd=[value]&metaData=[value]
    */
  def createEvent(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OfferResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val retailerLocationIds = request.getQueryString("retailerLocationIds")
        
      val title = request.getQueryString("title")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("title", "query string")
        }
        
      val subTitle = request.getQueryString("subTitle")
        
      val details = request.getQueryString("details")
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val filterIds = request.getQueryString("filterIds")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val imageAssetId = request.getQueryString("imageAssetId")
        .map(value => value.toLong)
        
      val redeemableStart = request.getQueryString("redeemableStart")
        .map(value => value.toLong)
        
      val redeemableEnd = request.getQueryString("redeemableEnd")
        .map(value => value.toLong)
        
      val metaData = request.getQueryString("metaData")
        
      api.createEvent(version, accountId, title, retailerLocationIds, subTitle, details, categoryIds, filterIds, active, imageAssetId, redeemableStart, redeemableEnd, metaData)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/event/delete?accountId=[value]&eventId=[value]
    */
  def deleteEvent(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val eventId = request.getQueryString("eventId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("eventId", "query string")
        }
        
      api.deleteEvent(version, accountId, eventId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/event/get?accountId=[value]&eventId=[value]
    */
  def getEvent(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OfferResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val eventId = request.getQueryString("eventId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("eventId", "query string")
        }
        
      api.getEvent(version, accountId, eventId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/event/attendance/search?deviceId=[value]&accountId=[value]&appKey=[value]&keyword=[value]&retailerId=[value]&retailerLocationId=[value]&excludeRetailerLocationId=[value]&listingId=[value]&offerId=[value]&offerLocationId=[value]&customerAccountIds=[value]&affiliatedCategoryIds=[value]&startDate=[value]&endDate=[value]&statuses=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]
    */
  def searchEventTransactions(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[EventAttendanceResponse] = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      val keyword = request.getQueryString("keyword")
        
      val retailerId = request.getQueryString("retailerId")
        .map(value => value.toLong)
        
      val retailerLocationId = request.getQueryString("retailerLocationId")
        .map(value => value.toLong)
        
      val excludeRetailerLocationId = request.getQueryString("excludeRetailerLocationId")
        .map(value => value.toLong)
        
      val listingId = request.getQueryString("listingId")
        .map(value => value.toLong)
        
      val offerId = request.getQueryString("offerId")
        .map(value => value.toLong)
        
      val offerLocationId = request.getQueryString("offerLocationId")
        .map(value => value.toLong)
        
      val customerAccountIds = request.getQueryString("customerAccountIds")
        
      val affiliatedCategoryIds = request.getQueryString("affiliatedCategoryIds")
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        
      val statuses = request.getQueryString("statuses")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.searchEventTransactions(version, deviceId, accountId, appKey, keyword, retailerId, retailerLocationId, excludeRetailerLocationId, listingId, offerId, offerLocationId, customerAccountIds, affiliatedCategoryIds, startDate, endDate, statuses, sortField, descending, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/event/search?accountId=[value]&keyword=[value]&activeOnly=[value]&categoryIds=[value]&filterIds=[value]&offerAudienceIds=[value]&transactionAudienceIds=[value]&sortField=[value]&descending=[value]&startDate=[value]&endDate=[value]&start=[value]&limit=[value]
    */
  def searchEvents(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[OfferShortResponse] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val keyword = request.getQueryString("keyword")
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val filterIds = request.getQueryString("filterIds")
        
      val offerAudienceIds = request.getQueryString("offerAudienceIds")
        
      val transactionAudienceIds = request.getQueryString("transactionAudienceIds")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val startDate = request.getQueryString("startDate")
        .map(value => value.toLong)
        
      val endDate = request.getQueryString("endDate")
        .map(value => value.toLong)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.searchEvents(version, accountId, keyword, activeOnly, categoryIds, filterIds, offerAudienceIds, transactionAudienceIds, sortField, descending, startDate, endDate, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/event/update?accountId=[value]&eventId=[value]&retailerLocationIds=[value]&title=[value]&subTitle=[value]&details=[value]&categoryIds=[value]&filterIds=[value]&active=[value]&imageAssetId=[value]&redeemableStart=[value]&redeemableEnd=[value]
    */
  def updateEvent(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OfferResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val eventId = request.getQueryString("eventId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("eventId", "query string")
        }
        
      val retailerLocationIds = request.getQueryString("retailerLocationIds")
        
      val title = request.getQueryString("title")
        
      val subTitle = request.getQueryString("subTitle")
        
      val details = request.getQueryString("details")
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val filterIds = request.getQueryString("filterIds")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val imageAssetId = request.getQueryString("imageAssetId")
        .map(value => value.toLong)
        
      val redeemableStart = request.getQueryString("redeemableStart")
        .map(value => value.toLong)
        
      val redeemableEnd = request.getQueryString("redeemableEnd")
        .map(value => value.toLong)
        
      api.updateEvent(version, accountId, eventId, retailerLocationIds, title, subTitle, details, categoryIds, filterIds, active, imageAssetId, redeemableStart, redeemableEnd)
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
