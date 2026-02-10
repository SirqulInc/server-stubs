package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.CountResponse
import model.ProfileResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile
import model.TicketListResponse
import model.TicketOfferResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class TicketApiController @Inject()(cc: ControllerComponents, api: TicketApi) extends AbstractController(cc) {
  /**
    * GET /api/:version/ticket/count?deviceId=[value]&accountId=[value]&gameType=[value]&appKey=[value]&ticketType=[value]
    */
  def getTicketCount(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): CountResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val gameType = request.getQueryString("gameType")
        
      val appKey = request.getQueryString("appKey")
        
      val ticketType = request.getQueryString("ticketType")
        
      api.getTicketCount(version, deviceId, accountId, gameType, appKey, ticketType)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/ticket/getList?deviceId=[value]&accountId=[value]&ticketObjectType=[value]&actionType=[value]&ticketIds=[value]&objectIds=[value]&receiptTokens=[value]&gameType=[value]&appKey=[value]
    */
  def getTicketList(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): TicketListResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val ticketObjectType = request.getQueryString("ticketObjectType")
        
      val actionType = request.getQueryString("actionType")
        
      val ticketIds = request.getQueryString("ticketIds")
        
      val objectIds = request.getQueryString("objectIds")
        
      val receiptTokens = request.getQueryString("receiptTokens")
        
      val gameType = request.getQueryString("gameType")
        
      val appKey = request.getQueryString("appKey")
        
      api.getTicketList(version, deviceId, accountId, ticketObjectType, actionType, ticketIds, objectIds, receiptTokens, gameType, appKey)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/purchase/gift?deviceId=[value]&accountId=[value]&receiverAccountId=[value]&ticketId=[value]&assetId=[value]&customMessage=[value]&gameType=[value]&appKey=[value]
    */
  def giftPurchase(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val receiverAccountId = request.getQueryString("receiverAccountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("receiverAccountId", "query string")
        }
        
      val ticketId = request.getQueryString("ticketId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("ticketId", "query string")
        }
        
      val assetId = request.getQueryString("assetId")
        .map(value => value.toLong)
        
      val customMessage = request.getQueryString("customMessage")
        
      val gameType = request.getQueryString("gameType")
        
      val appKey = request.getQueryString("appKey")
        
      api.giftPurchase(version, receiverAccountId, ticketId, deviceId, accountId, assetId, customMessage, gameType, appKey)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/ticket/save?returnNulls=[value]&deviceId=[value]&accountId=[value]&gameType=[value]&appKey=[value]&actionType=[value]&ticketObjectType=[value]&objectId=[value]&purchaseCode=[value]&receiptToken=[value]&receiptData=[value]&count=[value]&ticketType=[value]&purchaseProvider=[value]&purchaseType=[value]&returnProfileResponse=[value]&includeProfileResponse=[value]&appVersion=[value]
    */
  def saveTicket(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ProfileResponse = {
      val returnNulls = request.getQueryString("returnNulls")
        .map(value => value.toBoolean)
        
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val gameType = request.getQueryString("gameType")
        
      val appKey = request.getQueryString("appKey")
        
      val actionType = request.getQueryString("actionType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("actionType", "query string")
        }
        
      val ticketObjectType = request.getQueryString("ticketObjectType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("ticketObjectType", "query string")
        }
        
      val objectId = request.getQueryString("objectId")
        .map(value => value.toLong)
        
      val purchaseCode = request.getQueryString("purchaseCode")
        
      val receiptToken = request.getQueryString("receiptToken")
        
      val receiptData = request.getQueryString("receiptData")
        
      val count = request.getQueryString("count")
        .map(value => value.toLong)
        
      val ticketType = request.getQueryString("ticketType")
        
      val purchaseProvider = request.getQueryString("purchaseProvider")
        
      val purchaseType = request.getQueryString("purchaseType")
        
      val returnProfileResponse = request.getQueryString("returnProfileResponse")
        .map(value => value.toBoolean)
        
      val includeProfileResponse = request.getQueryString("includeProfileResponse")
        .map(value => value.toBoolean)
        
      val appVersion = request.getQueryString("appVersion")
        
      api.saveTicket(version, actionType, ticketObjectType, returnNulls, deviceId, accountId, gameType, appKey, objectId, purchaseCode, receiptToken, receiptData, count, ticketType, purchaseProvider, purchaseType, returnProfileResponse, includeProfileResponse, appVersion)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/ticket/save/fileUpload?returnNulls=[value]&deviceId=[value]&accountId=[value]&gameType=[value]&appKey=[value]&actionType=[value]&ticketObjectType=[value]&objectId=[value]&purchaseCode=[value]&receiptToken=[value]&receiptData=[value]&count=[value]&ticketType=[value]&purchaseProvider=[value]&purchaseType=[value]&returnProfileResponse=[value]&includeProfileResponse=[value]&appVersion=[value]
    */
  def saveTicketViaFileUpload(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ProfileResponse = {
      val returnNulls = request.getQueryString("returnNulls")
        .map(value => value.toBoolean)
        
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val gameType = request.getQueryString("gameType")
        
      val appKey = request.getQueryString("appKey")
        
      val actionType = request.getQueryString("actionType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("actionType", "query string")
        }
        
      val ticketObjectType = request.getQueryString("ticketObjectType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("ticketObjectType", "query string")
        }
        
      val objectId = request.getQueryString("objectId")
        .map(value => value.toLong)
        
      val purchaseCode = request.getQueryString("purchaseCode")
        
      val receiptToken = request.getQueryString("receiptToken")
        
      val receiptData = request.getQueryString("receiptData")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("receiptData", "query string")
        }
        
      val count = request.getQueryString("count")
        .map(value => value.toLong)
        
      val ticketType = request.getQueryString("ticketType")
        
      val purchaseProvider = request.getQueryString("purchaseProvider")
        
      val purchaseType = request.getQueryString("purchaseType")
        
      val returnProfileResponse = request.getQueryString("returnProfileResponse")
        .map(value => value.toBoolean)
        
      val includeProfileResponse = request.getQueryString("includeProfileResponse")
        .map(value => value.toBoolean)
        
      val appVersion = request.getQueryString("appVersion")
        
      api.saveTicketViaFileUpload(version, actionType, ticketObjectType, receiptData, returnNulls, deviceId, accountId, gameType, appKey, objectId, purchaseCode, receiptToken, count, ticketType, purchaseProvider, purchaseType, returnProfileResponse, includeProfileResponse, appVersion)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/ticket/ticketoffers
    */
  def ticketOffers(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): TicketOfferResponse = {
      api.ticketOffers(version)
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
