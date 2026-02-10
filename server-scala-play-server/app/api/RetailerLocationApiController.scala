package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.RetailerLocationResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class RetailerLocationApiController @Inject()(cc: ControllerComponents, api: RetailerLocationApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/location/create?deviceId=[value]&accountId=[value]&appKey=[value]&name=[value]&streetAddress=[value]&streetAddress2=[value]&city=[value]&state=[value]&postalCode=[value]&country=[value]&businessPhone=[value]&businessPhoneExt=[value]&website=[value]&email=[value]&detailsHeader=[value]&detailsBody=[value]&hours=[value]&tags=[value]&logoAssetId=[value]&picture1AssetId=[value]&picture2AssetId=[value]&categoryIds=[value]&filterIds=[value]&metaData=[value]&publicLocation=[value]&active=[value]&locationType=[value]&latitude=[value]&longitude=[value]
    */
  def createRetailerLocationConsumer(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): RetailerLocationResponse = {
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
        
      val streetAddress = request.getQueryString("streetAddress")
        
      val streetAddress2 = request.getQueryString("streetAddress2")
        
      val city = request.getQueryString("city")
        
      val state = request.getQueryString("state")
        
      val postalCode = request.getQueryString("postalCode")
        
      val country = request.getQueryString("country")
        
      val businessPhone = request.getQueryString("businessPhone")
        
      val businessPhoneExt = request.getQueryString("businessPhoneExt")
        
      val website = request.getQueryString("website")
        
      val email = request.getQueryString("email")
        
      val detailsHeader = request.getQueryString("detailsHeader")
        
      val detailsBody = request.getQueryString("detailsBody")
        
      val hours = request.getQueryString("hours")
        
      val tags = request.getQueryString("tags")
        
      val logoAssetId = request.getQueryString("logoAssetId")
        .map(value => value.toLong)
        
      val picture1AssetId = request.getQueryString("picture1AssetId")
        .map(value => value.toLong)
        
      val picture2AssetId = request.getQueryString("picture2AssetId")
        .map(value => value.toLong)
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val filterIds = request.getQueryString("filterIds")
        
      val metaData = request.getQueryString("metaData")
        
      val publicLocation = request.getQueryString("publicLocation")
        .map(value => value.toBoolean)
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val locationType = request.getQueryString("locationType")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      api.createRetailerLocationConsumer(version, appKey, name, deviceId, accountId, streetAddress, streetAddress2, city, state, postalCode, country, businessPhone, businessPhoneExt, website, email, detailsHeader, detailsBody, hours, tags, logoAssetId, picture1AssetId, picture2AssetId, categoryIds, filterIds, metaData, publicLocation, active, locationType, latitude, longitude)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/retailer/location/create?deviceId=[value]&accountId=[value]&retailerId=[value]&name=[value]&streetAddress=[value]&streetAddress2=[value]&city=[value]&state=[value]&postalCode=[value]&country=[value]&businessPhone=[value]&businessPhoneExt=[value]&website=[value]&email=[value]&internalId=[value]&detailsHeader=[value]&detailsBody=[value]&hours=[value]&logo=[value]&logoAssetId=[value]&picture1=[value]&picture1AssetId=[value]&picture2=[value]&picture2AssetId=[value]&categoryIds=[value]&filterIds=[value]&latitude=[value]&longitude=[value]&building=[value]&googlePlaceId=[value]&yelpId=[value]&active=[value]&publicLocation=[value]&locationType=[value]&audienceIds=[value]&audienceIdsToAdd=[value]&audienceIdsToRemove=[value]&responseFormat=[value]&responseIncludes=[value]
    */
  def createRetailerLocations(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): RetailerLocationResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val retailerId = request.getQueryString("retailerId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("retailerId", "query string")
        }
        
      val name = request.getQueryString("name")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("name", "query string")
        }
        
      val streetAddress = request.getQueryString("streetAddress")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("streetAddress", "query string")
        }
        
      val streetAddress2 = request.getQueryString("streetAddress2")
        
      val city = request.getQueryString("city")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("city", "query string")
        }
        
      val state = request.getQueryString("state")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("state", "query string")
        }
        
      val postalCode = request.getQueryString("postalCode")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("postalCode", "query string")
        }
        
      val country = request.getQueryString("country")
        
      val businessPhone = request.getQueryString("businessPhone")
        
      val businessPhoneExt = request.getQueryString("businessPhoneExt")
        
      val website = request.getQueryString("website")
        
      val email = request.getQueryString("email")
        
      val internalId = request.getQueryString("internalId")
        
      val detailsHeader = request.getQueryString("detailsHeader")
        
      val detailsBody = request.getQueryString("detailsBody")
        
      val hours = request.getQueryString("hours")
        
      val logo = request.getQueryString("logo")
        
      val logoAssetId = request.getQueryString("logoAssetId")
        .map(value => value.toLong)
        
      val picture1 = request.getQueryString("picture1")
        
      val picture1AssetId = request.getQueryString("picture1AssetId")
        .map(value => value.toLong)
        
      val picture2 = request.getQueryString("picture2")
        
      val picture2AssetId = request.getQueryString("picture2AssetId")
        .map(value => value.toLong)
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val filterIds = request.getQueryString("filterIds")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val building = request.getQueryString("building")
        
      val googlePlaceId = request.getQueryString("googlePlaceId")
        
      val yelpId = request.getQueryString("yelpId")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val publicLocation = request.getQueryString("publicLocation")
        .map(value => value.toBoolean)
        
      val locationType = request.getQueryString("locationType")
        
      val audienceIds = request.getQueryString("audienceIds")
        
      val audienceIdsToAdd = request.getQueryString("audienceIdsToAdd")
        
      val audienceIdsToRemove = request.getQueryString("audienceIdsToRemove")
        
      val responseFormat = request.getQueryString("responseFormat")
        
      val responseIncludes = request.getQueryString("responseIncludes")
        
      api.createRetailerLocations(version, retailerId, name, streetAddress, city, state, postalCode, deviceId, accountId, streetAddress2, country, businessPhone, businessPhoneExt, website, email, internalId, detailsHeader, detailsBody, hours, logo, logoAssetId, picture1, picture1AssetId, picture2, picture2AssetId, categoryIds, filterIds, latitude, longitude, building, googlePlaceId, yelpId, active, publicLocation, locationType, audienceIds, audienceIdsToAdd, audienceIdsToRemove, responseFormat, responseIncludes)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/retailer/location/delete?deviceId=[value]&accountId=[value]&retailerLocationId=[value]
    */
  def deleteRetailerLocation(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val retailerLocationId = request.getQueryString("retailerLocationId")
        .map(value => value.toLong)
        
      api.deleteRetailerLocation(version, deviceId, accountId, retailerLocationId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/retailer/location/get?deviceId=[value]&accountId=[value]&retailerLocationId=[value]&retailerLocationToken=[value]
    */
  def getRetailerLocation(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): RetailerLocationResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val retailerLocationId = request.getQueryString("retailerLocationId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("retailerLocationId", "query string")
        }
        
      val retailerLocationToken = request.getQueryString("retailerLocationToken")
        
      api.getRetailerLocation(version, retailerLocationId, deviceId, accountId, retailerLocationToken)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/location/get?deviceId=[value]&accountId=[value]&retailerLocationId=[value]
    */
  def getRetailerLocationConsumer(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): RetailerLocationResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val retailerLocationId = request.getQueryString("retailerLocationId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("retailerLocationId", "query string")
        }
        
      api.getRetailerLocationConsumer(version, retailerLocationId, deviceId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/retailer/location/idistancesearch?latitude=[value]&longitude=[value]&accountId=[value]&address=[value]&searchRange=[value]&start=[value]&limit=[value]&hasOffers=[value]&categories=[value]&filters=[value]&audiences=[value]&retailerIds=[value]&retailerLocationIds=[value]&tags=[value]&locationType=[value]&sortField=[value]&descending=[value]&q=[value]&keyword=[value]&keywordOperator=[value]&searchExpression=[value]&distanceUnit=[value]&returnFavorited=[value]&returnRetailer=[value]&returnAssets=[value]&returnOffers=[value]&returnCategories=[value]&returnFilters=[value]&returnAudiences=[value]&returnQrCode=[value]&returnExternalCategoryData=[value]&includeFavorite=[value]&includeLiked=[value]&includeRating=[value]
    */
  def indexedRetailerLocationDistanceSearch(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[RetailerLocationResponse] = {
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
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val address = request.getQueryString("address")
        
      val searchRange = request.getQueryString("searchRange")
        .map(value => value.toDouble)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("searchRange", "query string")
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
        
      val hasOffers = request.getQueryString("hasOffers")
        .map(value => value.toBoolean)
        
      val categories = request.getQueryString("categories")
        
      val filters = request.getQueryString("filters")
        
      val audiences = request.getQueryString("audiences")
        
      val retailerIds = request.getQueryString("retailerIds")
        
      val retailerLocationIds = request.getQueryString("retailerLocationIds")
        
      val tags = request.getQueryString("tags")
        
      val locationType = request.getQueryString("locationType")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val q = request.getQueryString("q")
        
      val keyword = request.getQueryString("keyword")
        
      val keywordOperator = request.getQueryString("keywordOperator")
        
      val searchExpression = request.getQueryString("searchExpression")
        
      val distanceUnit = request.getQueryString("distanceUnit")
        
      val returnFavorited = request.getQueryString("returnFavorited")
        .map(value => value.toBoolean)
        
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
        
      val returnAudiences = request.getQueryString("returnAudiences")
        .map(value => value.toBoolean)
        
      val returnQrCode = request.getQueryString("returnQrCode")
        .map(value => value.toBoolean)
        
      val returnExternalCategoryData = request.getQueryString("returnExternalCategoryData")
        .map(value => value.toBoolean)
        
      val includeFavorite = request.getQueryString("includeFavorite")
        .map(value => value.toBoolean)
        
      val includeLiked = request.getQueryString("includeLiked")
        .map(value => value.toBoolean)
        
      val includeRating = request.getQueryString("includeRating")
        .map(value => value.toBoolean)
        
      api.indexedRetailerLocationDistanceSearch(version, latitude, longitude, searchRange, start, limit, accountId, address, hasOffers, categories, filters, audiences, retailerIds, retailerLocationIds, tags, locationType, sortField, descending, q, keyword, keywordOperator, searchExpression, distanceUnit, returnFavorited, returnRetailer, returnAssets, returnOffers, returnCategories, returnFilters, returnAudiences, returnQrCode, returnExternalCategoryData, includeFavorite, includeLiked, includeRating)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/retailer/location/isearch?accountId=[value]&start=[value]&limit=[value]&hasOffers=[value]&categories=[value]&filters=[value]&audiences=[value]&retailerIds=[value]&retailerLocationIds=[value]&tags=[value]&locationType=[value]&sortField=[value]&descending=[value]&q=[value]&keyword=[value]&keywordOperator=[value]&searchExpression=[value]&returnRetailer=[value]&returnAssets=[value]&returnOffers=[value]&returnCategories=[value]&returnFilters=[value]&returnAudiences=[value]&returnQrCode=[value]&returnExternalCategoryData=[value]&includeFavorite=[value]&includeLiked=[value]&includeRating=[value]
    */
  def indexedRetailerLocationSearch(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[RetailerLocationResponse] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val hasOffers = request.getQueryString("hasOffers")
        .map(value => value.toBoolean)
        
      val categories = request.getQueryString("categories")
        
      val filters = request.getQueryString("filters")
        
      val audiences = request.getQueryString("audiences")
        
      val retailerIds = request.getQueryString("retailerIds")
        
      val retailerLocationIds = request.getQueryString("retailerLocationIds")
        
      val tags = request.getQueryString("tags")
        
      val locationType = request.getQueryString("locationType")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val q = request.getQueryString("q")
        
      val keyword = request.getQueryString("keyword")
        
      val keywordOperator = request.getQueryString("keywordOperator")
        
      val searchExpression = request.getQueryString("searchExpression")
        
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
        
      val returnAudiences = request.getQueryString("returnAudiences")
        .map(value => value.toBoolean)
        
      val returnQrCode = request.getQueryString("returnQrCode")
        .map(value => value.toBoolean)
        
      val returnExternalCategoryData = request.getQueryString("returnExternalCategoryData")
        .map(value => value.toBoolean)
        
      val includeFavorite = request.getQueryString("includeFavorite")
        .map(value => value.toBoolean)
        
      val includeLiked = request.getQueryString("includeLiked")
        .map(value => value.toBoolean)
        
      val includeRating = request.getQueryString("includeRating")
        .map(value => value.toBoolean)
        
      api.indexedRetailerLocationSearch(version, accountId, start, limit, hasOffers, categories, filters, audiences, retailerIds, retailerLocationIds, tags, locationType, sortField, descending, q, keyword, keywordOperator, searchExpression, returnRetailer, returnAssets, returnOffers, returnCategories, returnFilters, returnAudiences, returnQrCode, returnExternalCategoryData, includeFavorite, includeLiked, includeRating)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/retailer/location/search?deviceId=[value]&accountId=[value]&q=[value]&keyword=[value]&retailerIds=[value]&retailerLocationIds=[value]&locationType=[value]&sortField=[value]&descending=[value]&i=[value]&start=[value]&l=[value]&limit=[value]&showPublicLocations=[value]&activeOnly=[value]&returnRetailer=[value]&returnAssets=[value]&returnOffers=[value]&returnCategories=[value]&returnFilters=[value]&returnAudiences=[value]&returnQrCode=[value]&includeFavorite=[value]&includeLiked=[value]&includeRating=[value]
    */
  def searchRetailerLocations(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[RetailerLocationResponse] = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val q = request.getQueryString("q")
        
      val keyword = request.getQueryString("keyword")
        
      val retailerIds = request.getQueryString("retailerIds")
        
      val retailerLocationIds = request.getQueryString("retailerLocationIds")
        
      val locationType = request.getQueryString("locationType")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val i = request.getQueryString("_i")
        .map(value => value.toInt)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val l = request.getQueryString("_l")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val showPublicLocations = request.getQueryString("showPublicLocations")
        .map(value => value.toBoolean)
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        
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
        
      val returnAudiences = request.getQueryString("returnAudiences")
        .map(value => value.toBoolean)
        
      val returnQrCode = request.getQueryString("returnQrCode")
        .map(value => value.toBoolean)
        
      val includeFavorite = request.getQueryString("includeFavorite")
        .map(value => value.toBoolean)
        
      val includeLiked = request.getQueryString("includeLiked")
        .map(value => value.toBoolean)
        
      val includeRating = request.getQueryString("includeRating")
        .map(value => value.toBoolean)
        
      api.searchRetailerLocations(version, deviceId, accountId, q, keyword, retailerIds, retailerLocationIds, locationType, sortField, descending, i, start, l, limit, showPublicLocations, activeOnly, returnRetailer, returnAssets, returnOffers, returnCategories, returnFilters, returnAudiences, returnQrCode, includeFavorite, includeLiked, includeRating)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/retailer/location/update?deviceId=[value]&accountId=[value]&retailerLocationId=[value]&name=[value]&streetAddress=[value]&streetAddress2=[value]&city=[value]&state=[value]&postalCode=[value]&country=[value]&businessPhone=[value]&businessPhoneExt=[value]&website=[value]&email=[value]&internalId=[value]&detailsHeader=[value]&detailsBody=[value]&hours=[value]&logo=[value]&logoAssetId=[value]&picture1=[value]&picture1AssetId=[value]&picture2=[value]&picture2AssetId=[value]&categoryIds=[value]&filterIds=[value]&latitude=[value]&longitude=[value]&building=[value]&googlePlaceId=[value]&yelpId=[value]&metaData=[value]&paymentProvider=[value]&active=[value]&publicLocation=[value]&locationType=[value]&audienceIds=[value]&audienceIdsToAdd=[value]&audienceIdsToRemove=[value]&responseFormat=[value]&tags=[value]
    */
  def updateRetailerLocations(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): RetailerLocationResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val retailerLocationId = request.getQueryString("retailerLocationId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("retailerLocationId", "query string")
        }
        
      val name = request.getQueryString("name")
        
      val streetAddress = request.getQueryString("streetAddress")
        
      val streetAddress2 = request.getQueryString("streetAddress2")
        
      val city = request.getQueryString("city")
        
      val state = request.getQueryString("state")
        
      val postalCode = request.getQueryString("postalCode")
        
      val country = request.getQueryString("country")
        
      val businessPhone = request.getQueryString("businessPhone")
        
      val businessPhoneExt = request.getQueryString("businessPhoneExt")
        
      val website = request.getQueryString("website")
        
      val email = request.getQueryString("email")
        
      val internalId = request.getQueryString("internalId")
        
      val detailsHeader = request.getQueryString("detailsHeader")
        
      val detailsBody = request.getQueryString("detailsBody")
        
      val hours = request.getQueryString("hours")
        
      val logo = request.getQueryString("logo")
        
      val logoAssetId = request.getQueryString("logoAssetId")
        .map(value => value.toLong)
        
      val picture1 = request.getQueryString("picture1")
        
      val picture1AssetId = request.getQueryString("picture1AssetId")
        .map(value => value.toLong)
        
      val picture2 = request.getQueryString("picture2")
        
      val picture2AssetId = request.getQueryString("picture2AssetId")
        .map(value => value.toLong)
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val filterIds = request.getQueryString("filterIds")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val building = request.getQueryString("building")
        
      val googlePlaceId = request.getQueryString("googlePlaceId")
        
      val yelpId = request.getQueryString("yelpId")
        
      val metaData = request.getQueryString("metaData")
        
      val paymentProvider = request.getQueryString("paymentProvider")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val publicLocation = request.getQueryString("publicLocation")
        .map(value => value.toBoolean)
        
      val locationType = request.getQueryString("locationType")
        
      val audienceIds = request.getQueryString("audienceIds")
        
      val audienceIdsToAdd = request.getQueryString("audienceIdsToAdd")
        
      val audienceIdsToRemove = request.getQueryString("audienceIdsToRemove")
        
      val responseFormat = request.getQueryString("responseFormat")
        
      val tags = request.getQueryString("tags")
        
      api.updateRetailerLocations(version, retailerLocationId, deviceId, accountId, name, streetAddress, streetAddress2, city, state, postalCode, country, businessPhone, businessPhoneExt, website, email, internalId, detailsHeader, detailsBody, hours, logo, logoAssetId, picture1, picture1AssetId, picture2, picture2AssetId, categoryIds, filterIds, latitude, longitude, building, googlePlaceId, yelpId, metaData, paymentProvider, active, publicLocation, locationType, audienceIds, audienceIdsToAdd, audienceIdsToRemove, responseFormat, tags)
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
