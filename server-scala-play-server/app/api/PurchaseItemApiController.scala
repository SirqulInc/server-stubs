package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.PurchaseItemFullResponse
import model.PurchaseItemResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class PurchaseItemApiController @Inject()(cc: ControllerComponents, api: PurchaseItemApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/purchase/create?deviceId=[value]&accountId=[value]&appKey=[value]&name=[value]&description=[value]&tickets=[value]&price=[value]&purchaseType=[value]&purchaseCode=[value]&secretKey=[value]&purchaseLimit=[value]&serviceAction=[value]&coverAssetId=[value]&promoAssetId=[value]&giftable=[value]&assetable=[value]&allocateTickets=[value]&ticketType=[value]&points=[value]&offerLocationId=[value]
    */
  def createPurchaseItem(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): PurchaseItemFullResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("appKey", "query string")
        }
        
      val name = request.getQueryString("name")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("name", "query string")
        }
        
      val description = request.getQueryString("description")
        
      val tickets = request.getQueryString("tickets")
        .map(value => value.toInt)
        
      val price = request.getQueryString("price")
        .map(value => value.toFloat)
        
      val purchaseType = request.getQueryString("purchaseType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("purchaseType", "query string")
        }
        
      val purchaseCode = request.getQueryString("purchaseCode")
        
      val secretKey = request.getQueryString("secretKey")
        
      val purchaseLimit = request.getQueryString("purchaseLimit")
        .map(value => value.toInt)
        
      val serviceAction = request.getQueryString("serviceAction")
        
      val coverAssetId = request.getQueryString("coverAssetId")
        .map(value => value.toLong)
        
      val promoAssetId = request.getQueryString("promoAssetId")
        .map(value => value.toLong)
        
      val giftable = request.getQueryString("giftable")
        .map(value => value.toBoolean)
        
      val assetable = request.getQueryString("assetable")
        .map(value => value.toBoolean)
        
      val allocateTickets = request.getQueryString("allocateTickets")
        .map(value => value.toBoolean)
        
      val ticketType = request.getQueryString("ticketType")
        
      val points = request.getQueryString("points")
        .map(value => value.toLong)
        
      val offerLocationId = request.getQueryString("offerLocationId")
        .map(value => value.toLong)
        
      api.createPurchaseItem(version, appKey, name, purchaseType, deviceId, accountId, description, tickets, price, purchaseCode, secretKey, purchaseLimit, serviceAction, coverAssetId, promoAssetId, giftable, assetable, allocateTickets, ticketType, points, offerLocationId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/purchase/delete?deviceId=[value]&accountId=[value]&purchaseItemId=[value]
    */
  def deletePurchaseItem(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val purchaseItemId = request.getQueryString("purchaseItemId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("purchaseItemId", "query string")
        }
        
      api.deletePurchaseItem(version, purchaseItemId, deviceId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/purchase/get?deviceId=[value]&accountId=[value]&purchaseItemId=[value]
    */
  def getPurchaseItem(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): PurchaseItemFullResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val purchaseItemId = request.getQueryString("purchaseItemId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("purchaseItemId", "query string")
        }
        
      api.getPurchaseItem(version, purchaseItemId, deviceId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/purchase/search?deviceId=[value]&accountId=[value]&appKey=[value]&filterByBillable=[value]&purchaseType=[value]&serviceAction=[value]&keyword=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&activeOnly=[value]
    */
  def searchPurchaseItems(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[PurchaseItemResponse] = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val appKey = request.getQueryString("appKey")
        
      val filterByBillable = request.getQueryString("filterByBillable")
        .map(value => value.toBoolean)
        
      val purchaseType = request.getQueryString("purchaseType")
        
      val serviceAction = request.getQueryString("serviceAction")
        
      val keyword = request.getQueryString("keyword")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        
      api.searchPurchaseItems(version, deviceId, accountId, appKey, filterByBillable, purchaseType, serviceAction, keyword, sortField, descending, start, limit, activeOnly)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/purchase/update?deviceId=[value]&accountId=[value]&purchaseItemId=[value]&name=[value]&description=[value]&tickets=[value]&price=[value]&purchaseType=[value]&purchaseCode=[value]&secretKey=[value]&purchaseLimit=[value]&serviceAction=[value]&coverAssetId=[value]&promoAssetId=[value]&giftable=[value]&assetable=[value]&active=[value]&allocateTickets=[value]&ticketType=[value]&points=[value]&offerLocationId=[value]
    */
  def updatePurchaseItem(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): PurchaseItemFullResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val purchaseItemId = request.getQueryString("purchaseItemId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("purchaseItemId", "query string")
        }
        
      val name = request.getQueryString("name")
        
      val description = request.getQueryString("description")
        
      val tickets = request.getQueryString("tickets")
        .map(value => value.toInt)
        
      val price = request.getQueryString("price")
        .map(value => value.toFloat)
        
      val purchaseType = request.getQueryString("purchaseType")
        
      val purchaseCode = request.getQueryString("purchaseCode")
        
      val secretKey = request.getQueryString("secretKey")
        
      val purchaseLimit = request.getQueryString("purchaseLimit")
        .map(value => value.toInt)
        
      val serviceAction = request.getQueryString("serviceAction")
        
      val coverAssetId = request.getQueryString("coverAssetId")
        .map(value => value.toLong)
        
      val promoAssetId = request.getQueryString("promoAssetId")
        .map(value => value.toLong)
        
      val giftable = request.getQueryString("giftable")
        .map(value => value.toBoolean)
        
      val assetable = request.getQueryString("assetable")
        .map(value => value.toBoolean)
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val allocateTickets = request.getQueryString("allocateTickets")
        .map(value => value.toBoolean)
        
      val ticketType = request.getQueryString("ticketType")
        
      val points = request.getQueryString("points")
        .map(value => value.toLong)
        
      val offerLocationId = request.getQueryString("offerLocationId")
        .map(value => value.toLong)
        
      api.updatePurchaseItem(version, purchaseItemId, deviceId, accountId, name, description, tickets, price, purchaseType, purchaseCode, secretKey, purchaseLimit, serviceAction, coverAssetId, promoAssetId, giftable, assetable, active, allocateTickets, ticketType, points, offerLocationId)
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
