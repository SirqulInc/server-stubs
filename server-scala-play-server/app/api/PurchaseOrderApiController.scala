package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.OrderResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class PurchaseOrderApiController @Inject()(cc: ControllerComponents, api: PurchaseOrderApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/order/create?deviceId=[value]&accountId=[value]&appKey=[value]&description=[value]&currencyType=[value]&cart=[value]&paymentMethodId=[value]&externalOrderId=[value]&externalPaymentId=[value]&remoteRefType=[value]&externalDate=[value]&promoCode=[value]
    */
  def createOrder(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OrderResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val description = request.getQueryString("description")
        
      val currencyType = request.getQueryString("currencyType")
        
      val cart = request.getQueryString("cart")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("cart", "query string")
        }
        
      val paymentMethodId = request.getQueryString("paymentMethodId")
        .map(value => value.toLong)
        
      val externalOrderId = request.getQueryString("externalOrderId")
        
      val externalPaymentId = request.getQueryString("externalPaymentId")
        
      val remoteRefType = request.getQueryString("remoteRefType")
        
      val externalDate = request.getQueryString("externalDate")
        .map(value => value.toLong)
        
      val promoCode = request.getQueryString("promoCode")
        
      api.createOrder(version, appKey, cart, deviceId, accountId, description, currencyType, paymentMethodId, externalOrderId, externalPaymentId, remoteRefType, externalDate, promoCode)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/order/delete?deviceId=[value]&accountId=[value]&orderId=[value]
    */
  def deleteOrder(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val orderId = request.getQueryString("orderId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("orderId", "query string")
        }
        
      api.deleteOrder(version, orderId, deviceId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/order/get?deviceId=[value]&accountId=[value]&orderId=[value]&externalOrderId=[value]
    */
  def getOrder(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OrderResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val orderId = request.getQueryString("orderId")
        .map(value => value.toLong)
        
      val externalOrderId = request.getQueryString("externalOrderId")
        
      api.getOrder(version, deviceId, accountId, orderId, externalOrderId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/order/preview?deviceId=[value]&accountId=[value]&appKey=[value]&description=[value]&currencyType=[value]&cart=[value]&paymentMethodId=[value]&externalOrderId=[value]&externalPaymentId=[value]&remoteRefType=[value]&externalDate=[value]&promoCode=[value]
    */
  def previewOrder(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OrderResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val description = request.getQueryString("description")
        
      val currencyType = request.getQueryString("currencyType")
        
      val cart = request.getQueryString("cart")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("cart", "query string")
        }
        
      val paymentMethodId = request.getQueryString("paymentMethodId")
        .map(value => value.toLong)
        
      val externalOrderId = request.getQueryString("externalOrderId")
        
      val externalPaymentId = request.getQueryString("externalPaymentId")
        
      val remoteRefType = request.getQueryString("remoteRefType")
        
      val externalDate = request.getQueryString("externalDate")
        .map(value => value.toLong)
        
      val promoCode = request.getQueryString("promoCode")
        
      api.previewOrder(version, appKey, cart, deviceId, accountId, description, currencyType, paymentMethodId, externalOrderId, externalPaymentId, remoteRefType, externalDate, promoCode)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/order/search?deviceId=[value]&accountId=[value]&appKey=[value]&start=[value]&limit=[value]&descending=[value]&activeOnly=[value]&ignoreCustomerFilter=[value]&orderItemTypes=[value]&orderItemIds=[value]&orderCustomTypes=[value]&orderCustomIds=[value]&sortField=[value]&offerTypes=[value]&specialOfferTypes=[value]&categoryIds=[value]&filterIds=[value]&offerAudienceIds=[value]&transactionAudienceIds=[value]&offerIds=[value]&offerLocationIds=[value]&retailerIds=[value]&retailerLocationIds=[value]&statuses=[value]&keyword=[value]&redeemableStartDate=[value]&redeemableEndDate=[value]&startedSince=[value]&startedBefore=[value]&endedSince=[value]&endedBefore=[value]
    */
  def searchOrders(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[OrderResponse] = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        
      val ignoreCustomerFilter = request.getQueryString("ignoreCustomerFilter")
        .map(value => value.toBoolean)
        
      val orderItemTypes = request.getQueryString("orderItemTypes")
        
      val orderItemIds = request.getQueryString("orderItemIds")
        
      val orderCustomTypes = request.getQueryString("orderCustomTypes")
        
      val orderCustomIds = request.getQueryString("orderCustomIds")
        
      val sortField = request.getQueryString("sortField")
        
      val offerTypes = request.getQueryString("offerTypes")
        
      val specialOfferTypes = request.getQueryString("specialOfferTypes")
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val filterIds = request.getQueryString("filterIds")
        
      val offerAudienceIds = request.getQueryString("offerAudienceIds")
        
      val transactionAudienceIds = request.getQueryString("transactionAudienceIds")
        
      val offerIds = request.getQueryString("offerIds")
        
      val offerLocationIds = request.getQueryString("offerLocationIds")
        
      val retailerIds = request.getQueryString("retailerIds")
        
      val retailerLocationIds = request.getQueryString("retailerLocationIds")
        
      val statuses = request.getQueryString("statuses")
        
      val keyword = request.getQueryString("keyword")
        
      val redeemableStartDate = request.getQueryString("redeemableStartDate")
        .map(value => value.toLong)
        
      val redeemableEndDate = request.getQueryString("redeemableEndDate")
        .map(value => value.toLong)
        
      val startedSince = request.getQueryString("startedSince")
        .map(value => value.toLong)
        
      val startedBefore = request.getQueryString("startedBefore")
        .map(value => value.toLong)
        
      val endedSince = request.getQueryString("endedSince")
        .map(value => value.toLong)
        
      val endedBefore = request.getQueryString("endedBefore")
        .map(value => value.toLong)
        
      api.searchOrders(version, appKey, deviceId, accountId, start, limit, descending, activeOnly, ignoreCustomerFilter, orderItemTypes, orderItemIds, orderCustomTypes, orderCustomIds, sortField, offerTypes, specialOfferTypes, categoryIds, filterIds, offerAudienceIds, transactionAudienceIds, offerIds, offerLocationIds, retailerIds, retailerLocationIds, statuses, keyword, redeemableStartDate, redeemableEndDate, startedSince, startedBefore, endedSince, endedBefore)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/order/update?deviceId=[value]&accountId=[value]&orderId=[value]&paymentTransactionId=[value]&appKey=[value]&description=[value]&currencyType=[value]&cart=[value]&paymentMethodId=[value]&externalPaymentId=[value]&externalDate=[value]
    */
  def updateOrder(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OrderResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val orderId = request.getQueryString("orderId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("orderId", "query string")
        }
        
      val paymentTransactionId = request.getQueryString("paymentTransactionId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val description = request.getQueryString("description")
        
      val currencyType = request.getQueryString("currencyType")
        
      val cart = request.getQueryString("cart")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("cart", "query string")
        }
        
      val paymentMethodId = request.getQueryString("paymentMethodId")
        .map(value => value.toLong)
        
      val externalPaymentId = request.getQueryString("externalPaymentId")
        
      val externalDate = request.getQueryString("externalDate")
        .map(value => value.toLong)
        
      api.updateOrder(version, orderId, appKey, cart, deviceId, accountId, paymentTransactionId, description, currencyType, paymentMethodId, externalPaymentId, externalDate)
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
