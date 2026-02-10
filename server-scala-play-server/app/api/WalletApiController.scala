package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.OfferTransactionResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class WalletApiController @Inject()(cc: ControllerComponents, api: WalletApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/wallet/create?deviceId=[value]&accountId=[value]&offerId=[value]&offerLocationId=[value]&offerCart=[value]&promoCode=[value]&currencyType=[value]&usePoints=[value]&metaData=[value]&appKey=[value]&status=[value]
    */
  def createOfferTransaction(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[OfferTransactionResponse] = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val offerId = request.getQueryString("offerId")
        .map(value => value.toLong)
        
      val offerLocationId = request.getQueryString("offerLocationId")
        .map(value => value.toLong)
        
      val offerCart = request.getQueryString("offerCart")
        
      val promoCode = request.getQueryString("promoCode")
        
      val currencyType = request.getQueryString("currencyType")
        
      val usePoints = request.getQueryString("usePoints")
        .map(value => value.toBoolean)
        
      val metaData = request.getQueryString("metaData")
        
      val appKey = request.getQueryString("appKey")
        
      val status = request.getQueryString("status")
        .map(value => value.toInt)
        
      api.createOfferTransaction(version, deviceId, accountId, offerId, offerLocationId, offerCart, promoCode, currencyType, usePoints, metaData, appKey, status)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/wallet/delete?deviceId=[value]&accountId=[value]&transactionId=[value]
    */
  def deleteOfferTransaction(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val transactionId = request.getQueryString("transactionId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("transactionId", "query string")
        }
        
      api.deleteOfferTransaction(version, transactionId, deviceId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/wallet/get?deviceId=[value]&accountId=[value]&transactionId=[value]&includeMission=[value]&latitude=[value]&longitude=[value]&returnFullResponse=[value]
    */
  def getOfferTransaction(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OfferTransactionResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val transactionId = request.getQueryString("transactionId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("transactionId", "query string")
        }
        
      val includeMission = request.getQueryString("includeMission")
        .map(value => value.toBoolean)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val returnFullResponse = request.getQueryString("returnFullResponse")
        .map(value => value.toBoolean)
        
      api.getOfferTransaction(version, transactionId, deviceId, accountId, includeMission, latitude, longitude, returnFullResponse)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/wallet/preview?deviceId=[value]&accountId=[value]&offerId=[value]&offerLocationId=[value]&offerCart=[value]&promoCode=[value]&currencyType=[value]&usePoints=[value]&metaData=[value]&appKey=[value]
    */
  def previewOfferTransaction(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[OfferTransactionResponse] = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val offerId = request.getQueryString("offerId")
        .map(value => value.toLong)
        
      val offerLocationId = request.getQueryString("offerLocationId")
        .map(value => value.toLong)
        
      val offerCart = request.getQueryString("offerCart")
        
      val promoCode = request.getQueryString("promoCode")
        
      val currencyType = request.getQueryString("currencyType")
        
      val usePoints = request.getQueryString("usePoints")
        .map(value => value.toBoolean)
        
      val metaData = request.getQueryString("metaData")
        
      val appKey = request.getQueryString("appKey")
        
      api.previewOfferTransaction(version, deviceId, accountId, offerId, offerLocationId, offerCart, promoCode, currencyType, usePoints, metaData, appKey)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/wallet/search?deviceId=[value]&accountId=[value]&keyword=[value]&retailerId=[value]&retailerIds=[value]&retailerLocationId=[value]&retailerLocationIds=[value]&excludeRetailerLocationIds=[value]&offerId=[value]&offerIds=[value]&offerLocationId=[value]&offerLocationIds=[value]&offerType=[value]&offerTypes=[value]&specialOfferType=[value]&specialOfferTypes=[value]&categoryIds=[value]&filterIds=[value]&offerAudienceIds=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&latitude=[value]&longitude=[value]&redeemableStartDate=[value]&redeemableEndDate=[value]&filterByParentOffer=[value]&startedSince=[value]&startedBefore=[value]&endedSince=[value]&endedBefore=[value]&redeemed=[value]&statuses=[value]&reservationsOnly=[value]&activeOnly=[value]&returnFullResponse=[value]&recurringStartedSince=[value]&recurringStartedBefore=[value]&recurringExpirationSince=[value]&recurringExpirationBefore=[value]
    */
  def searchOfferTransactions(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[OfferTransactionResponse] = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val keyword = request.getQueryString("keyword")
        
      val retailerId = request.getQueryString("retailerId")
        .map(value => value.toLong)
        
      val retailerIds = request.getQueryString("retailerIds")
        
      val retailerLocationId = request.getQueryString("retailerLocationId")
        .map(value => value.toLong)
        
      val retailerLocationIds = request.getQueryString("retailerLocationIds")
        
      val excludeRetailerLocationIds = request.getQueryString("excludeRetailerLocationIds")
        
      val offerId = request.getQueryString("offerId")
        .map(value => value.toLong)
        
      val offerIds = request.getQueryString("offerIds")
        
      val offerLocationId = request.getQueryString("offerLocationId")
        .map(value => value.toLong)
        
      val offerLocationIds = request.getQueryString("offerLocationIds")
        
      val offerType = request.getQueryString("offerType")
        
      val offerTypes = request.getQueryString("offerTypes")
        
      val specialOfferType = request.getQueryString("specialOfferType")
        
      val specialOfferTypes = request.getQueryString("specialOfferTypes")
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val filterIds = request.getQueryString("filterIds")
        
      val offerAudienceIds = request.getQueryString("offerAudienceIds")
        
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
        
      val redeemableStartDate = request.getQueryString("redeemableStartDate")
        .map(value => value.toLong)
        
      val redeemableEndDate = request.getQueryString("redeemableEndDate")
        .map(value => value.toLong)
        
      val filterByParentOffer = request.getQueryString("filterByParentOffer")
        .map(value => value.toBoolean)
        
      val startedSince = request.getQueryString("startedSince")
        .map(value => value.toLong)
        
      val startedBefore = request.getQueryString("startedBefore")
        .map(value => value.toLong)
        
      val endedSince = request.getQueryString("endedSince")
        .map(value => value.toLong)
        
      val endedBefore = request.getQueryString("endedBefore")
        .map(value => value.toLong)
        
      val redeemed = request.getQueryString("redeemed")
        .map(value => value.toBoolean)
        
      val statuses = request.getQueryString("statuses")
        
      val reservationsOnly = request.getQueryString("reservationsOnly")
        .map(value => value.toBoolean)
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        
      val returnFullResponse = request.getQueryString("returnFullResponse")
        .map(value => value.toBoolean)
        
      val recurringStartedSince = request.getQueryString("recurringStartedSince")
        .map(value => value.toLong)
        
      val recurringStartedBefore = request.getQueryString("recurringStartedBefore")
        .map(value => value.toLong)
        
      val recurringExpirationSince = request.getQueryString("recurringExpirationSince")
        .map(value => value.toLong)
        
      val recurringExpirationBefore = request.getQueryString("recurringExpirationBefore")
        .map(value => value.toLong)
        
      api.searchOfferTransactions(version, deviceId, accountId, keyword, retailerId, retailerIds, retailerLocationId, retailerLocationIds, excludeRetailerLocationIds, offerId, offerIds, offerLocationId, offerLocationIds, offerType, offerTypes, specialOfferType, specialOfferTypes, categoryIds, filterIds, offerAudienceIds, sortField, descending, start, limit, latitude, longitude, redeemableStartDate, redeemableEndDate, filterByParentOffer, startedSince, startedBefore, endedSince, endedBefore, redeemed, statuses, reservationsOnly, activeOnly, returnFullResponse, recurringStartedSince, recurringStartedBefore, recurringExpirationSince, recurringExpirationBefore)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/wallet/update?deviceId=[value]&accountId=[value]&transactionId=[value]&offerLocationId=[value]&currencyType=[value]&usePoints=[value]&appKey=[value]&status=[value]&latitude=[value]&longitude=[value]&metaData=[value]&returnFullResponse=[value]&exceptionMembershipOfferIds=[value]
    */
  def updateOfferTransaction(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OfferTransactionResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val transactionId = request.getQueryString("transactionId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("transactionId", "query string")
        }
        
      val offerLocationId = request.getQueryString("offerLocationId")
        .map(value => value.toLong)
        
      val currencyType = request.getQueryString("currencyType")
        
      val usePoints = request.getQueryString("usePoints")
        .map(value => value.toBoolean)
        
      val appKey = request.getQueryString("appKey")
        
      val status = request.getQueryString("status")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("status", "query string")
        }
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val metaData = request.getQueryString("metaData")
        
      val returnFullResponse = request.getQueryString("returnFullResponse")
        .map(value => value.toBoolean)
        
      val exceptionMembershipOfferIds = request.getQueryString("exceptionMembershipOfferIds")
        
      api.updateOfferTransaction(version, transactionId, status, deviceId, accountId, offerLocationId, currencyType, usePoints, appKey, latitude, longitude, metaData, returnFullResponse, exceptionMembershipOfferIds)
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
