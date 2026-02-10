package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.ListCountResponse
import model.OfferListResponse
import model.OfferResponse
import model.OfferShortResponse
import model.OfferTransactionResponse
import model.RetailerOfferResponse
import model.SirqulResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class OfferApiController @Inject()(cc: ControllerComponents, api: OfferApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/retailer/offer/location/batchUpdate?deviceId=[value]&accountId=[value]&data=[value]
    */
  def batchUpdateOfferLocations(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val data = request.getQueryString("data")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("data", "query string")
        }
        
      api.batchUpdateOfferLocations(version, data, deviceId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/retailer/offer/create?deviceId=[value]&accountId=[value]&tags=[value]&parentOfferId=[value]&includeOfferLocations=[value]&retailerLocationIds=[value]&offerLocations=[value]&title=[value]&subTitle=[value]&details=[value]&subDetails=[value]&finePrint=[value]&barcodeType=[value]&barcodeEntry=[value]&externalRedeemOptions=[value]&externalUrl=[value]&externalId=[value]&ticketsRewardType=[value]&ticketsReward=[value]&activated=[value]&expires=[value]&noExpiration=[value]&availableLimit=[value]&availableLimitPerUser=[value]&addedLimit=[value]&viewLimit=[value]&maxPrints=[value]&ticketPriceType=[value]&ticketPrice=[value]&fullPrice=[value]&discountPrice=[value]&showRemaining=[value]&showRedeemed=[value]&replaced=[value]&featured=[value]&offerType=[value]&specialOfferType=[value]&offerVisibility=[value]&categoryIds=[value]&filterIds=[value]&active=[value]&barcodeAssetId=[value]&imageAssetId=[value]&imageAssetId1=[value]&imageAssetId2=[value]&imageAssetId3=[value]&imageAssetId4=[value]&imageAssetId5=[value]&publisher=[value]&redeemableStart=[value]&redeemableEnd=[value]&brand=[value]&productType=[value]&conditionType=[value]&isbn=[value]&asin=[value]&catalogNumbers=[value]&department=[value]&features=[value]&minimumPrice=[value]&width=[value]&height=[value]&depth=[value]&weight=[value]&unit=[value]&studio=[value]&parentalRating=[value]&publishDate=[value]&availabilityDate=[value]&sizeId=[value]&listingId=[value]&mediaType=[value]&duration=[value]&author=[value]&releaseDate=[value]&collectionIds=[value]&rebootTimeHour=[value]&rebootTimeMinute=[value]&idleTimeoutInSecond=[value]&serialNumber=[value]&udid=[value]&deviceType=[value]&devicePower=[value]&deviceInterference=[value]&availability=[value]&availabilitySummary=[value]
    */
  def createOffer(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): RetailerOfferResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val tags = request.getQueryString("tags")
        
      val parentOfferId = request.getQueryString("parentOfferId")
        .map(value => value.toLong)
        
      val includeOfferLocations = request.getQueryString("includeOfferLocations")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("includeOfferLocations", "query string")
        }
        
      val retailerLocationIds = request.getQueryString("retailerLocationIds")
        
      val offerLocations = request.getQueryString("offerLocations")
        
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
        
      val externalId = request.getQueryString("externalId")
        
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
        
      val offerType = request.getQueryString("offerType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("offerType", "query string")
        }
        
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
        
      val brand = request.getQueryString("brand")
        
      val productType = request.getQueryString("productType")
        
      val conditionType = request.getQueryString("conditionType")
        
      val isbn = request.getQueryString("isbn")
        
      val asin = request.getQueryString("asin")
        
      val catalogNumbers = request.getQueryString("catalogNumbers")
        
      val department = request.getQueryString("department")
        
      val features = request.getQueryString("features")
        
      val minimumPrice = request.getQueryString("minimumPrice")
        .map(value => value.toDouble)
        
      val width = request.getQueryString("width")
        .map(value => value.toDouble)
        
      val height = request.getQueryString("height")
        .map(value => value.toDouble)
        
      val depth = request.getQueryString("depth")
        .map(value => value.toDouble)
        
      val weight = request.getQueryString("weight")
        .map(value => value.toDouble)
        
      val unit = request.getQueryString("unit")
        
      val studio = request.getQueryString("studio")
        
      val parentalRating = request.getQueryString("parentalRating")
        
      val publishDate = request.getQueryString("publishDate")
        .map(value => value.toLong)
        
      val availabilityDate = request.getQueryString("availabilityDate")
        .map(value => value.toLong)
        
      val sizeId = request.getQueryString("sizeId")
        .map(value => value.toLong)
        
      val listingId = request.getQueryString("listingId")
        .map(value => value.toLong)
        
      val mediaType = request.getQueryString("mediaType")
        
      val duration = request.getQueryString("duration")
        .map(value => value.toInt)
        
      val author = request.getQueryString("author")
        
      val releaseDate = request.getQueryString("releaseDate")
        .map(value => value.toLong)
        
      val collectionIds = request.getQueryString("collectionIds")
        
      val rebootTimeHour = request.getQueryString("rebootTimeHour")
        .map(value => value.toInt)
        
      val rebootTimeMinute = request.getQueryString("rebootTimeMinute")
        .map(value => value.toInt)
        
      val idleTimeoutInSecond = request.getQueryString("idleTimeoutInSecond")
        .map(value => value.toInt)
        
      val serialNumber = request.getQueryString("serialNumber")
        
      val udid = request.getQueryString("udid")
        
      val deviceType = request.getQueryString("deviceType")
        
      val devicePower = request.getQueryString("devicePower")
        .map(value => value.toDouble)
        
      val deviceInterference = request.getQueryString("deviceInterference")
        .map(value => value.toDouble)
        
      val availability = request.getQueryString("availability")
        
      val availabilitySummary = request.getQueryString("availabilitySummary")
        
      api.createOffer(version, includeOfferLocations, title, barcodeType, noExpiration, availableLimit, availableLimitPerUser, addedLimit, viewLimit, maxPrints, ticketPrice, fullPrice, discountPrice, offerType, specialOfferType, offerVisibility, active, deviceId, accountId, tags, parentOfferId, retailerLocationIds, offerLocations, subTitle, details, subDetails, finePrint, barcodeEntry, externalRedeemOptions, externalUrl, externalId, ticketsRewardType, ticketsReward, activated, expires, ticketPriceType, showRemaining, showRedeemed, replaced, featured, categoryIds, filterIds, barcodeAssetId, imageAssetId, imageAssetId1, imageAssetId2, imageAssetId3, imageAssetId4, imageAssetId5, publisher, redeemableStart, redeemableEnd, brand, productType, conditionType, isbn, asin, catalogNumbers, department, features, minimumPrice, width, height, depth, weight, unit, studio, parentalRating, publishDate, availabilityDate, sizeId, listingId, mediaType, duration, author, releaseDate, collectionIds, rebootTimeHour, rebootTimeMinute, idleTimeoutInSecond, serialNumber, udid, deviceType, devicePower, deviceInterference, availability, availabilitySummary)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/retailer/offer/delete?deviceId=[value]&accountId=[value]&offerId=[value]
    */
  def deleteOffer(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val offerId = request.getQueryString("offerId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("offerId", "query string")
        }
        
      api.deleteOffer(version, offerId, deviceId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/retailer/offer/location/delete?deviceId=[value]&accountId=[value]&offerLocationId=[value]
    */
  def deleteOfferLocation(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val offerLocationId = request.getQueryString("offerLocationId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("offerLocationId", "query string")
        }
        
      api.deleteOfferLocation(version, offerLocationId, deviceId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/retailer/offer/get?deviceId=[value]&accountId=[value]&offerId=[value]&includeOfferLocations=[value]
    */
  def getOffer(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): RetailerOfferResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val offerId = request.getQueryString("offerId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("offerId", "query string")
        }
        
      val includeOfferLocations = request.getQueryString("includeOfferLocations")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("includeOfferLocations", "query string")
        }
        
      api.getOffer(version, offerId, includeOfferLocations, deviceId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/offer/get?deviceId=[value]&accountId=[value]&offerId=[value]&offerLocationId=[value]&distance=[value]&latitude=[value]&longitude=[value]&includeOfferLocations=[value]&includeRetailerLocations=[value]&includeChildOffers=[value]
    */
  def getOfferDetails(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OfferResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val offerId = request.getQueryString("offerId")
        .map(value => value.toLong)
        
      val offerLocationId = request.getQueryString("offerLocationId")
        .map(value => value.toLong)
        
      val distance = request.getQueryString("distance")
        .map(value => value.toDouble)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val includeOfferLocations = request.getQueryString("includeOfferLocations")
        .map(value => value.toBoolean)
        
      val includeRetailerLocations = request.getQueryString("includeRetailerLocations")
        .map(value => value.toBoolean)
        
      val includeChildOffers = request.getQueryString("includeChildOffers")
        .map(value => value.toBoolean)
        
      api.getOfferDetails(version, deviceId, accountId, offerId, offerLocationId, distance, latitude, longitude, includeOfferLocations, includeRetailerLocations, includeChildOffers)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/offer/lists/count?latitude=[value]&longitude=[value]&searchRange=[value]&distanceUnit=[value]
    */
  def getOfferListCounts(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): ListCountResponse = {
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("latitude", "query string")
        }
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("longitude", "query string")
        }
        
      val searchRange = request.getQueryString("searchRange")
        .map(value => BigDecimal(value))
        
      val distanceUnit = request.getQueryString("distanceUnit")
        
      api.getOfferListCounts(version, latitude, longitude, searchRange, distanceUnit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/offer/location/get?offerLocationId=[value]&udid=[value]
    */
  def getOfferLocation(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OfferShortResponse = {
      val offerLocationId = request.getQueryString("offerLocationId")
        .map(value => value.toLong)
        
      val udid = request.getQueryString("udid")
        
      api.getOfferLocation(version, offerLocationId, udid)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/retailer/offer/location/search?deviceId=[value]&accountId=[value]&keyword=[value]&retailerId=[value]&retailerLocationId=[value]&offerType=[value]&specialOfferType=[value]&sortField=[value]&descending=[value]&start=[value]&limit=[value]&activeOnly=[value]&includeRetailerLocation=[value]&barcodeType=[value]&barcodeEntry=[value]&isbn=[value]&asin=[value]&deviceStatus=[value]&needsNotificationSent=[value]&lastNotificationSent=[value]
    */
  def getOfferLocationsForRetailers(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[OfferShortResponse] = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val keyword = request.getQueryString("keyword")
        
      val retailerId = request.getQueryString("retailerId")
        .map(value => value.toLong)
        
      val retailerLocationId = request.getQueryString("retailerLocationId")
        .map(value => value.toLong)
        
      val offerType = request.getQueryString("offerType")
        
      val specialOfferType = request.getQueryString("specialOfferType")
        
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
        
      val includeRetailerLocation = request.getQueryString("includeRetailerLocation")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("includeRetailerLocation", "query string")
        }
        
      val barcodeType = request.getQueryString("barcodeType")
        
      val barcodeEntry = request.getQueryString("barcodeEntry")
        
      val isbn = request.getQueryString("isbn")
        
      val asin = request.getQueryString("asin")
        
      val deviceStatus = request.getQueryString("deviceStatus")
        
      val needsNotificationSent = request.getQueryString("needsNotificationSent")
        .map(value => value.toBoolean)
        
      val lastNotificationSent = request.getQueryString("lastNotificationSent")
        .map(value => value.toLong)
        
      api.getOfferLocationsForRetailers(version, sortField, descending, start, limit, activeOnly, includeRetailerLocation, deviceId, accountId, keyword, retailerId, retailerLocationId, offerType, specialOfferType, barcodeType, barcodeEntry, isbn, asin, deviceStatus, needsNotificationSent, lastNotificationSent)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/retailer/offer/search?deviceId=[value]&accountId=[value]&categoryIds=[value]&filterIds=[value]&q=[value]&keyword=[value]&retailerId=[value]&retailerLocationId=[value]&couponType=[value]&offerType=[value]&offerTypes=[value]&specialOfferType=[value]&offerVisibility=[value]&sortField=[value]&descending=[value]&i=[value]&start=[value]&l=[value]&limit=[value]&availableOnly=[value]&activeOnly=[value]&includeCategories=[value]&includeFilters=[value]&includeOfferLocations=[value]&barcodeType=[value]&barcodeEntry=[value]&isbn=[value]&asin=[value]&deviceStatus=[value]&needsNotificationSent=[value]&lastNotificationSent=[value]
    */
  def getOffersForRetailers(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[OfferResponse] = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val filterIds = request.getQueryString("filterIds")
        
      val q = request.getQueryString("q")
        
      val keyword = request.getQueryString("keyword")
        
      val retailerId = request.getQueryString("retailerId")
        .map(value => value.toLong)
        
      val retailerLocationId = request.getQueryString("retailerLocationId")
        .map(value => value.toLong)
        
      val couponType = request.getQueryString("couponType")
        
      val offerType = request.getQueryString("offerType")
        
      val offerTypes = request.getQueryString("offerTypes")
        
      val specialOfferType = request.getQueryString("specialOfferType")
        
      val offerVisibility = request.getQueryString("offerVisibility")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("offerVisibility", "query string")
        }
        
      val sortField = request.getQueryString("sortField")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("sortField", "query string")
        }
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("descending", "query string")
        }
        
      val i = request.getQueryString("_i")
        .map(value => value.toInt)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("start", "query string")
        }
        
      val l = request.getQueryString("_l")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("limit", "query string")
        }
        
      val availableOnly = request.getQueryString("availableOnly")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("availableOnly", "query string")
        }
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("activeOnly", "query string")
        }
        
      val includeCategories = request.getQueryString("includeCategories")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("includeCategories", "query string")
        }
        
      val includeFilters = request.getQueryString("includeFilters")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("includeFilters", "query string")
        }
        
      val includeOfferLocations = request.getQueryString("includeOfferLocations")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("includeOfferLocations", "query string")
        }
        
      val barcodeType = request.getQueryString("barcodeType")
        
      val barcodeEntry = request.getQueryString("barcodeEntry")
        
      val isbn = request.getQueryString("isbn")
        
      val asin = request.getQueryString("asin")
        
      val deviceStatus = request.getQueryString("deviceStatus")
        
      val needsNotificationSent = request.getQueryString("needsNotificationSent")
        .map(value => value.toBoolean)
        
      val lastNotificationSent = request.getQueryString("lastNotificationSent")
        .map(value => value.toLong)
        
      api.getOffersForRetailers(version, offerVisibility, sortField, descending, start, limit, availableOnly, activeOnly, includeCategories, includeFilters, includeOfferLocations, deviceId, accountId, categoryIds, filterIds, q, keyword, retailerId, retailerLocationId, couponType, offerType, offerTypes, specialOfferType, i, l, barcodeType, barcodeEntry, isbn, asin, deviceStatus, needsNotificationSent, lastNotificationSent)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/retailer/offer/transaction/update?deviceId=[value]&accountId=[value]&offerTransactionId=[value]&offerLocationId=[value]&status=[value]
    */
  def redeemOfferTransaction(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val offerTransactionId = request.getQueryString("offerTransactionId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("offerTransactionId", "query string")
        }
        
      val offerLocationId = request.getQueryString("offerLocationId")
        .map(value => value.toLong)
        
      val status = request.getQueryString("status")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("status", "query string")
        }
        
      api.redeemOfferTransaction(version, offerTransactionId, status, deviceId, accountId, offerLocationId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/retailer/offer/transaction/search?deviceId=[value]&accountId=[value]&q=[value]&keyword=[value]&retailerId=[value]&retailerLocationId=[value]&offerId=[value]&offerLocationId=[value]&redeemed=[value]&reservationsOnly=[value]&couponType=[value]&offerType=[value]&specialOfferType=[value]&customerAccountIds=[value]&categoryIds=[value]&redeemableStartDate=[value]&redeemableEndDate=[value]&sortField=[value]&descending=[value]&i=[value]&start=[value]&l=[value]&limit=[value]&activeOnly=[value]
    */
  def searchOfferTransactionsForRetailers(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[OfferTransactionResponse] = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val q = request.getQueryString("q")
        
      val keyword = request.getQueryString("keyword")
        
      val retailerId = request.getQueryString("retailerId")
        .map(value => value.toLong)
        
      val retailerLocationId = request.getQueryString("retailerLocationId")
        .map(value => value.toLong)
        
      val offerId = request.getQueryString("offerId")
        .map(value => value.toLong)
        
      val offerLocationId = request.getQueryString("offerLocationId")
        .map(value => value.toLong)
        
      val redeemed = request.getQueryString("redeemed")
        .map(value => value.toBoolean)
        
      val reservationsOnly = request.getQueryString("reservationsOnly")
        .map(value => value.toBoolean)
        
      val couponType = request.getQueryString("couponType")
        
      val offerType = request.getQueryString("offerType")
        
      val specialOfferType = request.getQueryString("specialOfferType")
        
      val customerAccountIds = request.getQueryString("customerAccountIds")
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val redeemableStartDate = request.getQueryString("redeemableStartDate")
        .map(value => value.toLong)
        
      val redeemableEndDate = request.getQueryString("redeemableEndDate")
        .map(value => value.toLong)
        
      val sortField = request.getQueryString("sortField")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("sortField", "query string")
        }
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("descending", "query string")
        }
        
      val i = request.getQueryString("_i")
        .map(value => value.toInt)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("start", "query string")
        }
        
      val l = request.getQueryString("_l")
        .map(value => value.toInt)
        
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
        
      api.searchOfferTransactionsForRetailers(version, sortField, descending, start, limit, activeOnly, deviceId, accountId, q, keyword, retailerId, retailerLocationId, offerId, offerLocationId, redeemed, reservationsOnly, couponType, offerType, specialOfferType, customerAccountIds, categoryIds, redeemableStartDate, redeemableEndDate, i, l)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/offer/lists?appKey=[value]&deviceId=[value]&accountId=[value]&latitude=[value]&longitude=[value]&searchRange=[value]&tags=[value]&supportedPostalCodes=[value]&keyword=[value]&categories=[value]&filters=[value]&offerTypes=[value]&`type`=[value]&sortField=[value]&recommendOfferIds=[value]&recommendationType=[value]&locationId=[value]&retailerLocationIds=[value]&offerId=[value]&includeMission=[value]&includeCategories=[value]&includeFilters=[value]&includeExpired=[value]&includeFavorite=[value]&start=[value]&limit=[value]&maxRecommendations=[value]&distanceUnit=[value]&closestOfferOnly=[value]&searchExpression=[value]&groupBy=[value]
    */
  def searchOffersForConsumer(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OfferListResponse = {
      val appKey = request.getQueryString("appKey")
        
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("latitude", "query string")
        }
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("longitude", "query string")
        }
        
      val searchRange = request.getQueryString("searchRange")
        .map(value => value.toDouble)
        
      val tags = request.getQueryString("tags")
        
      val supportedPostalCodes = request.getQueryString("supportedPostalCodes")
        
      val keyword = request.getQueryString("keyword")
        
      val categories = request.getQueryString("categories")
        
      val filters = request.getQueryString("filters")
        
      val offerTypes = request.getQueryString("offerTypes")
        
      val `type` = request.getQueryString("type")
        
      val sortField = request.getQueryString("sortField")
        
      val recommendOfferIds = request.getQueryString("recommendOfferIds")
        
      val recommendationType = request.getQueryString("recommendationType")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("recommendationType", "query string")
        }
        
      val locationId = request.getQueryString("locationId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("locationId", "query string")
        }
        
      val retailerLocationIds = request.getQueryString("retailerLocationIds")
        
      val offerId = request.getQueryString("offerId")
        .map(value => value.toLong)
        
      val includeMission = request.getQueryString("includeMission")
        .map(value => value.toBoolean)
        
      val includeCategories = request.getQueryString("includeCategories")
        .map(value => value.toBoolean)
        
      val includeFilters = request.getQueryString("includeFilters")
        .map(value => value.toBoolean)
        
      val includeExpired = request.getQueryString("includeExpired")
        .map(value => value.toBoolean)
        
      val includeFavorite = request.getQueryString("includeFavorite")
        .map(value => value.toBoolean)
        
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
        
      val maxRecommendations = request.getQueryString("maxRecommendations")
        .map(value => value.toInt)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("maxRecommendations", "query string")
        }
        
      val distanceUnit = request.getQueryString("distanceUnit")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("distanceUnit", "query string")
        }
        
      val closestOfferOnly = request.getQueryString("closestOfferOnly")
        .map(value => value.toBoolean)
        
      val searchExpression = request.getQueryString("searchExpression")
        
      val groupBy = request.getQueryString("groupBy")
        
      api.searchOffersForConsumer(version, latitude, longitude, recommendationType, locationId, start, limit, maxRecommendations, distanceUnit, appKey, deviceId, accountId, searchRange, tags, supportedPostalCodes, keyword, categories, filters, offerTypes, `type`, sortField, recommendOfferIds, retailerLocationIds, offerId, includeMission, includeCategories, includeFilters, includeExpired, includeFavorite, closestOfferOnly, searchExpression, groupBy)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/offer/top?start=[value]&limit=[value]
    */
  def topOfferTransactions(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): OfferListResponse = {
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.topOfferTransactions(version, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/retailer/offer/update?deviceId=[value]&accountId=[value]&offerId=[value]&parentOfferId=[value]&includeOfferLocations=[value]&retailerLocationIds=[value]&offerLocations=[value]&tags=[value]&title=[value]&subTitle=[value]&details=[value]&subDetails=[value]&finePrint=[value]&barcodeType=[value]&barcodeEntry=[value]&externalRedeemOptions=[value]&externalUrl=[value]&externalId=[value]&ticketsRewardType=[value]&ticketsReward=[value]&activated=[value]&expires=[value]&noExpiration=[value]&availableLimit=[value]&availableLimitPerUser=[value]&addedLimit=[value]&viewLimit=[value]&maxPrints=[value]&ticketPriceType=[value]&ticketPrice=[value]&fullPrice=[value]&discountPrice=[value]&showRemaining=[value]&showRedeemed=[value]&replaced=[value]&featured=[value]&offerType=[value]&specialOfferType=[value]&offerVisibility=[value]&categoryIds=[value]&filterIds=[value]&active=[value]&barcodeAssetId=[value]&imageAssetId=[value]&imageAssetId1=[value]&imageAssetId2=[value]&imageAssetId3=[value]&imageAssetId4=[value]&imageAssetId5=[value]&publisher=[value]&redeemableStart=[value]&redeemableEnd=[value]&brand=[value]&productType=[value]&conditionType=[value]&isbn=[value]&asin=[value]&catalogNumbers=[value]&department=[value]&features=[value]&minimumPrice=[value]&width=[value]&height=[value]&depth=[value]&weight=[value]&unit=[value]&studio=[value]&parentalRating=[value]&publishDate=[value]&availabilityDate=[value]&sizeId=[value]&listingId=[value]&mediaType=[value]&duration=[value]&author=[value]&releaseDate=[value]&collectionIds=[value]&rebootTimeHour=[value]&rebootTimeMinute=[value]&idleTimeoutInSecond=[value]&serialNumber=[value]&udid=[value]&deviceType=[value]&devicePower=[value]&deviceInterference=[value]&availability=[value]&availabilitySummary=[value]
    */
  def updateOffer(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): RetailerOfferResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val offerId = request.getQueryString("offerId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("offerId", "query string")
        }
        
      val parentOfferId = request.getQueryString("parentOfferId")
        .map(value => value.toLong)
        
      val includeOfferLocations = request.getQueryString("includeOfferLocations")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("includeOfferLocations", "query string")
        }
        
      val retailerLocationIds = request.getQueryString("retailerLocationIds")
        
      val offerLocations = request.getQueryString("offerLocations")
        
      val tags = request.getQueryString("tags")
        
      val title = request.getQueryString("title")
        
      val subTitle = request.getQueryString("subTitle")
        
      val details = request.getQueryString("details")
        
      val subDetails = request.getQueryString("subDetails")
        
      val finePrint = request.getQueryString("finePrint")
        
      val barcodeType = request.getQueryString("barcodeType")
        
      val barcodeEntry = request.getQueryString("barcodeEntry")
        
      val externalRedeemOptions = request.getQueryString("externalRedeemOptions")
        
      val externalUrl = request.getQueryString("externalUrl")
        
      val externalId = request.getQueryString("externalId")
        
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
        
      val offerType = request.getQueryString("offerType")
        
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
        
      val brand = request.getQueryString("brand")
        
      val productType = request.getQueryString("productType")
        
      val conditionType = request.getQueryString("conditionType")
        
      val isbn = request.getQueryString("isbn")
        
      val asin = request.getQueryString("asin")
        
      val catalogNumbers = request.getQueryString("catalogNumbers")
        
      val department = request.getQueryString("department")
        
      val features = request.getQueryString("features")
        
      val minimumPrice = request.getQueryString("minimumPrice")
        .map(value => value.toDouble)
        
      val width = request.getQueryString("width")
        .map(value => value.toDouble)
        
      val height = request.getQueryString("height")
        .map(value => value.toDouble)
        
      val depth = request.getQueryString("depth")
        .map(value => value.toDouble)
        
      val weight = request.getQueryString("weight")
        .map(value => value.toDouble)
        
      val unit = request.getQueryString("unit")
        
      val studio = request.getQueryString("studio")
        
      val parentalRating = request.getQueryString("parentalRating")
        
      val publishDate = request.getQueryString("publishDate")
        .map(value => value.toLong)
        
      val availabilityDate = request.getQueryString("availabilityDate")
        .map(value => value.toLong)
        
      val sizeId = request.getQueryString("sizeId")
        .map(value => value.toLong)
        
      val listingId = request.getQueryString("listingId")
        .map(value => value.toLong)
        
      val mediaType = request.getQueryString("mediaType")
        
      val duration = request.getQueryString("duration")
        .map(value => value.toInt)
        
      val author = request.getQueryString("author")
        
      val releaseDate = request.getQueryString("releaseDate")
        .map(value => value.toLong)
        
      val collectionIds = request.getQueryString("collectionIds")
        
      val rebootTimeHour = request.getQueryString("rebootTimeHour")
        .map(value => value.toInt)
        
      val rebootTimeMinute = request.getQueryString("rebootTimeMinute")
        .map(value => value.toInt)
        
      val idleTimeoutInSecond = request.getQueryString("idleTimeoutInSecond")
        .map(value => value.toInt)
        
      val serialNumber = request.getQueryString("serialNumber")
        
      val udid = request.getQueryString("udid")
        
      val deviceType = request.getQueryString("deviceType")
        
      val devicePower = request.getQueryString("devicePower")
        .map(value => value.toDouble)
        
      val deviceInterference = request.getQueryString("deviceInterference")
        .map(value => value.toDouble)
        
      val availability = request.getQueryString("availability")
        
      val availabilitySummary = request.getQueryString("availabilitySummary")
        
      api.updateOffer(version, offerId, includeOfferLocations, deviceId, accountId, parentOfferId, retailerLocationIds, offerLocations, tags, title, subTitle, details, subDetails, finePrint, barcodeType, barcodeEntry, externalRedeemOptions, externalUrl, externalId, ticketsRewardType, ticketsReward, activated, expires, noExpiration, availableLimit, availableLimitPerUser, addedLimit, viewLimit, maxPrints, ticketPriceType, ticketPrice, fullPrice, discountPrice, showRemaining, showRedeemed, replaced, featured, offerType, specialOfferType, offerVisibility, categoryIds, filterIds, active, barcodeAssetId, imageAssetId, imageAssetId1, imageAssetId2, imageAssetId3, imageAssetId4, imageAssetId5, publisher, redeemableStart, redeemableEnd, brand, productType, conditionType, isbn, asin, catalogNumbers, department, features, minimumPrice, width, height, depth, weight, unit, studio, parentalRating, publishDate, availabilityDate, sizeId, listingId, mediaType, duration, author, releaseDate, collectionIds, rebootTimeHour, rebootTimeMinute, idleTimeoutInSecond, serialNumber, udid, deviceType, devicePower, deviceInterference, availability, availabilitySummary)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/retailer/offer/status?deviceId=[value]&accountId=[value]&offerIds=[value]&active=[value]
    */
  def updateOfferStatus(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val offerIds = request.getQueryString("offerIds")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("offerIds", "query string")
        }
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("active", "query string")
        }
        
      api.updateOfferStatus(version, offerIds, active, deviceId, accountId)
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
