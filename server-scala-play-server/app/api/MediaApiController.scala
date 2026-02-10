package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.MediaOfferResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class MediaApiController @Inject()(cc: ControllerComponents, api: MediaApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/media/create?accountId=[value]&retailerLocationIds=[value]&title=[value]&subTitle=[value]&details=[value]&subDetails=[value]&finePrint=[value]&barcodeType=[value]&barcodeEntry=[value]&externalRedeemOptions=[value]&externalUrl=[value]&ticketsRewardType=[value]&ticketsReward=[value]&activated=[value]&expires=[value]&noExpiration=[value]&availableLimit=[value]&availableLimitPerUser=[value]&addedLimit=[value]&viewLimit=[value]&maxPrints=[value]&ticketPriceType=[value]&ticketPrice=[value]&fullPrice=[value]&discountPrice=[value]&showRemaining=[value]&showRedeemed=[value]&replaced=[value]&featured=[value]&specialOfferType=[value]&offerVisibility=[value]&categoryIds=[value]&filterIds=[value]&active=[value]&barcodeAssetId=[value]&imageAssetId=[value]&imageAssetId1=[value]&imageAssetId2=[value]&imageAssetId3=[value]&imageAssetId4=[value]&imageAssetId5=[value]&publisher=[value]&redeemableStart=[value]&redeemableEnd=[value]&conditionType=[value]&isbn=[value]&asin=[value]&catalogNumbers=[value]&parentalRating=[value]&availabilityDate=[value]&mediaType=[value]&duration=[value]&author=[value]&releaseDate=[value]&collectionIds=[value]&availability=[value]&availabilitySummary=[value]
    */
  def createMedia(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): MediaOfferResponse = {
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
        
      val subDetails = request.getQueryString("subDetails")
        
      val finePrint = request.getQueryString("finePrint")
        
      val barcodeType = request.getQueryString("barcodeType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("barcodeType", "query string")
        }
        
      val barcodeEntry = request.getQueryString("barcodeEntry")
        
      val externalRedeemOptions = request.getQueryString("externalRedeemOptions")
        
      val externalUrl = request.getQueryString("externalUrl")
        
      val ticketsRewardType = request.getQueryString("ticketsRewardType")
        
      val ticketsReward = request.getQueryString("ticketsReward")
        .map(value => value.toLong)
        
      val activated = request.getQueryString("activated")
        .map(value => value.toLong)
        
      val expires = request.getQueryString("expires")
        .map(value => value.toLong)
        
      val noExpiration = request.getQueryString("noExpiration")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("noExpiration", "query string")
        }
        
      val availableLimit = request.getQueryString("availableLimit")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("availableLimit", "query string")
        }
        
      val availableLimitPerUser = request.getQueryString("availableLimitPerUser")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("availableLimitPerUser", "query string")
        }
        
      val addedLimit = request.getQueryString("addedLimit")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("addedLimit", "query string")
        }
        
      val viewLimit = request.getQueryString("viewLimit")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("viewLimit", "query string")
        }
        
      val maxPrints = request.getQueryString("maxPrints")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("maxPrints", "query string")
        }
        
      val ticketPriceType = request.getQueryString("ticketPriceType")
        
      val ticketPrice = request.getQueryString("ticketPrice")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("ticketPrice", "query string")
        }
        
      val fullPrice = request.getQueryString("fullPrice")
        .map(value => value.toDouble)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("fullPrice", "query string")
        }
        
      val discountPrice = request.getQueryString("discountPrice")
        .map(value => value.toDouble)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("discountPrice", "query string")
        }
        
      val showRemaining = request.getQueryString("showRemaining")
        .map(value => value.toBoolean)
        
      val showRedeemed = request.getQueryString("showRedeemed")
        .map(value => value.toBoolean)
        
      val replaced = request.getQueryString("replaced")
        .map(value => value.toBoolean)
        
      val featured = request.getQueryString("featured")
        .map(value => value.toBoolean)
        
      val specialOfferType = request.getQueryString("specialOfferType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("specialOfferType", "query string")
        }
        
      val offerVisibility = request.getQueryString("offerVisibility")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("offerVisibility", "query string")
        }
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val filterIds = request.getQueryString("filterIds")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("active", "query string")
        }
        
      val barcodeAssetId = request.getQueryString("barcodeAssetId")
        .map(value => value.toLong)
        
      val imageAssetId = request.getQueryString("imageAssetId")
        .map(value => value.toLong)
        
      val imageAssetId1 = request.getQueryString("imageAssetId1")
        .map(value => value.toLong)
        
      val imageAssetId2 = request.getQueryString("imageAssetId2")
        .map(value => value.toLong)
        
      val imageAssetId3 = request.getQueryString("imageAssetId3")
        .map(value => value.toLong)
        
      val imageAssetId4 = request.getQueryString("imageAssetId4")
        .map(value => value.toLong)
        
      val imageAssetId5 = request.getQueryString("imageAssetId5")
        .map(value => value.toLong)
        
      val publisher = request.getQueryString("publisher")
        
      val redeemableStart = request.getQueryString("redeemableStart")
        .map(value => value.toLong)
        
      val redeemableEnd = request.getQueryString("redeemableEnd")
        .map(value => value.toLong)
        
      val conditionType = request.getQueryString("conditionType")
        
      val isbn = request.getQueryString("isbn")
        
      val asin = request.getQueryString("asin")
        
      val catalogNumbers = request.getQueryString("catalogNumbers")
        
      val parentalRating = request.getQueryString("parentalRating")
        
      val availabilityDate = request.getQueryString("availabilityDate")
        .map(value => value.toLong)
        
      val mediaType = request.getQueryString("mediaType")
        
      val duration = request.getQueryString("duration")
        .map(value => value.toInt)
        
      val author = request.getQueryString("author")
        
      val releaseDate = request.getQueryString("releaseDate")
        .map(value => value.toLong)
        
      val collectionIds = request.getQueryString("collectionIds")
        
      val availability = request.getQueryString("availability")
        
      val availabilitySummary = request.getQueryString("availabilitySummary")
        
      api.createMedia(version, accountId, title, barcodeType, noExpiration, availableLimit, availableLimitPerUser, addedLimit, viewLimit, maxPrints, ticketPrice, fullPrice, discountPrice, specialOfferType, offerVisibility, active, retailerLocationIds, subTitle, details, subDetails, finePrint, barcodeEntry, externalRedeemOptions, externalUrl, ticketsRewardType, ticketsReward, activated, expires, ticketPriceType, showRemaining, showRedeemed, replaced, featured, categoryIds, filterIds, barcodeAssetId, imageAssetId, imageAssetId1, imageAssetId2, imageAssetId3, imageAssetId4, imageAssetId5, publisher, redeemableStart, redeemableEnd, conditionType, isbn, asin, catalogNumbers, parentalRating, availabilityDate, mediaType, duration, author, releaseDate, collectionIds, availability, availabilitySummary)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/media/delete?accountId=[value]&mediaId=[value]
    */
  def deleteMedia(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val mediaId = request.getQueryString("mediaId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("mediaId", "query string")
        }
        
      api.deleteMedia(version, accountId, mediaId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/media/get?accountId=[value]&mediaId=[value]
    */
  def getMedia(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): MediaOfferResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val mediaId = request.getQueryString("mediaId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("mediaId", "query string")
        }
        
      api.getMedia(version, accountId, mediaId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/media/search?accountId=[value]&keyword=[value]&activeOnly=[value]&categoryIds=[value]&filterIds=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]
    */
  def searchMedia(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[MediaOfferResponse] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val keyword = request.getQueryString("keyword")
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("activeOnly", "query string")
        }
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val filterIds = request.getQueryString("filterIds")
        
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
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.searchMedia(version, accountId, activeOnly, sortField, descending, keyword, categoryIds, filterIds, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/media/update?accountId=[value]&mediaId=[value]&retailerLocationIds=[value]&offerLocations=[value]&title=[value]&subTitle=[value]&details=[value]&subDetails=[value]&finePrint=[value]&barcodeType=[value]&barcodeEntry=[value]&externalRedeemOptions=[value]&externalUrl=[value]&ticketsRewardType=[value]&ticketsReward=[value]&activated=[value]&expires=[value]&noExpiration=[value]&availableLimit=[value]&availableLimitPerUser=[value]&addedLimit=[value]&viewLimit=[value]&maxPrints=[value]&ticketPriceType=[value]&ticketPrice=[value]&fullPrice=[value]&discountPrice=[value]&showRemaining=[value]&showRedeemed=[value]&replaced=[value]&featured=[value]&specialOfferType=[value]&offerVisibility=[value]&categoryIds=[value]&filterIds=[value]&active=[value]&barcodeAssetId=[value]&imageAssetId=[value]&imageAssetId1=[value]&imageAssetId2=[value]&imageAssetId3=[value]&imageAssetId4=[value]&imageAssetId5=[value]&publisher=[value]&redeemableStart=[value]&redeemableEnd=[value]&conditionType=[value]&isbn=[value]&asin=[value]&catalogNumbers=[value]&availabilityDate=[value]&parentalRating=[value]&mediaType=[value]&duration=[value]&author=[value]&releaseDate=[value]&collectionIds=[value]&availability=[value]&availabilitySummary=[value]
    */
  def updateMedia(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): MediaOfferResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val mediaId = request.getQueryString("mediaId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("mediaId", "query string")
        }
        
      val retailerLocationIds = request.getQueryString("retailerLocationIds")
        
      val offerLocations = request.getQueryString("offerLocations")
        
      val title = request.getQueryString("title")
        
      val subTitle = request.getQueryString("subTitle")
        
      val details = request.getQueryString("details")
        
      val subDetails = request.getQueryString("subDetails")
        
      val finePrint = request.getQueryString("finePrint")
        
      val barcodeType = request.getQueryString("barcodeType")
        
      val barcodeEntry = request.getQueryString("barcodeEntry")
        
      val externalRedeemOptions = request.getQueryString("externalRedeemOptions")
        
      val externalUrl = request.getQueryString("externalUrl")
        
      val ticketsRewardType = request.getQueryString("ticketsRewardType")
        
      val ticketsReward = request.getQueryString("ticketsReward")
        .map(value => value.toLong)
        
      val activated = request.getQueryString("activated")
        .map(value => value.toLong)
        
      val expires = request.getQueryString("expires")
        .map(value => value.toLong)
        
      val noExpiration = request.getQueryString("noExpiration")
        .map(value => value.toBoolean)
        
      val availableLimit = request.getQueryString("availableLimit")
        .map(value => value.toInt)
        
      val availableLimitPerUser = request.getQueryString("availableLimitPerUser")
        .map(value => value.toInt)
        
      val addedLimit = request.getQueryString("addedLimit")
        .map(value => value.toInt)
        
      val viewLimit = request.getQueryString("viewLimit")
        .map(value => value.toInt)
        
      val maxPrints = request.getQueryString("maxPrints")
        .map(value => value.toInt)
        
      val ticketPriceType = request.getQueryString("ticketPriceType")
        
      val ticketPrice = request.getQueryString("ticketPrice")
        .map(value => value.toLong)
        
      val fullPrice = request.getQueryString("fullPrice")
        .map(value => value.toDouble)
        
      val discountPrice = request.getQueryString("discountPrice")
        .map(value => value.toDouble)
        
      val showRemaining = request.getQueryString("showRemaining")
        .map(value => value.toBoolean)
        
      val showRedeemed = request.getQueryString("showRedeemed")
        .map(value => value.toBoolean)
        
      val replaced = request.getQueryString("replaced")
        .map(value => value.toBoolean)
        
      val featured = request.getQueryString("featured")
        .map(value => value.toBoolean)
        
      val specialOfferType = request.getQueryString("specialOfferType")
        
      val offerVisibility = request.getQueryString("offerVisibility")
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val filterIds = request.getQueryString("filterIds")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val barcodeAssetId = request.getQueryString("barcodeAssetId")
        .map(value => value.toLong)
        
      val imageAssetId = request.getQueryString("imageAssetId")
        .map(value => value.toLong)
        
      val imageAssetId1 = request.getQueryString("imageAssetId1")
        .map(value => value.toLong)
        
      val imageAssetId2 = request.getQueryString("imageAssetId2")
        .map(value => value.toLong)
        
      val imageAssetId3 = request.getQueryString("imageAssetId3")
        .map(value => value.toLong)
        
      val imageAssetId4 = request.getQueryString("imageAssetId4")
        .map(value => value.toLong)
        
      val imageAssetId5 = request.getQueryString("imageAssetId5")
        .map(value => value.toLong)
        
      val publisher = request.getQueryString("publisher")
        
      val redeemableStart = request.getQueryString("redeemableStart")
        .map(value => value.toLong)
        
      val redeemableEnd = request.getQueryString("redeemableEnd")
        .map(value => value.toLong)
        
      val conditionType = request.getQueryString("conditionType")
        
      val isbn = request.getQueryString("isbn")
        
      val asin = request.getQueryString("asin")
        
      val catalogNumbers = request.getQueryString("catalogNumbers")
        
      val availabilityDate = request.getQueryString("availabilityDate")
        .map(value => value.toLong)
        
      val parentalRating = request.getQueryString("parentalRating")
        
      val mediaType = request.getQueryString("mediaType")
        
      val duration = request.getQueryString("duration")
        .map(value => value.toInt)
        
      val author = request.getQueryString("author")
        
      val releaseDate = request.getQueryString("releaseDate")
        .map(value => value.toLong)
        
      val collectionIds = request.getQueryString("collectionIds")
        
      val availability = request.getQueryString("availability")
        
      val availabilitySummary = request.getQueryString("availabilitySummary")
        
      api.updateMedia(version, accountId, mediaId, retailerLocationIds, offerLocations, title, subTitle, details, subDetails, finePrint, barcodeType, barcodeEntry, externalRedeemOptions, externalUrl, ticketsRewardType, ticketsReward, activated, expires, noExpiration, availableLimit, availableLimitPerUser, addedLimit, viewLimit, maxPrints, ticketPriceType, ticketPrice, fullPrice, discountPrice, showRemaining, showRedeemed, replaced, featured, specialOfferType, offerVisibility, categoryIds, filterIds, active, barcodeAssetId, imageAssetId, imageAssetId1, imageAssetId2, imageAssetId3, imageAssetId4, imageAssetId5, publisher, redeemableStart, redeemableEnd, conditionType, isbn, asin, catalogNumbers, availabilityDate, parentalRating, mediaType, duration, author, releaseDate, collectionIds, availability, availabilitySummary)
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
