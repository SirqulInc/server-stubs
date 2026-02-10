package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AccountLoginResponse
import model.BigDecimal
import model.RetailerFullResponse
import model.RetailerResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class RetailerApiController @Inject()(cc: ControllerComponents, api: RetailerApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/retailer/create?deviceId=[value]&accountId=[value]&name=[value]&streetAddress=[value]&streetAddress2=[value]&city=[value]&state=[value]&postalCode=[value]&country=[value]&businessPhone=[value]&businessPhoneExt=[value]&website=[value]&email=[value]&facebookUrl=[value]&twitterUrl=[value]&logo=[value]&logoAssetId=[value]&picture1=[value]&picture1AssetId=[value]&picture2=[value]&picture2AssetId=[value]&categoryIds=[value]&categoryIdsToAdd=[value]&categoryIdsToRemove=[value]&filterIds=[value]&latitude=[value]&longitude=[value]&metaData=[value]&searchTags=[value]&retailerType=[value]&visibility=[value]&createDefaultLocation=[value]&responseFormat=[value]
    */
  def createRetailer(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): RetailerFullResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
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
        
      val facebookUrl = request.getQueryString("facebookUrl")
        
      val twitterUrl = request.getQueryString("twitterUrl")
        
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
        
      val categoryIdsToAdd = request.getQueryString("categoryIdsToAdd")
        
      val categoryIdsToRemove = request.getQueryString("categoryIdsToRemove")
        
      val filterIds = request.getQueryString("filterIds")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val metaData = request.getQueryString("metaData")
        
      val searchTags = request.getQueryString("searchTags")
        
      val retailerType = request.getQueryString("retailerType")
        
      val visibility = request.getQueryString("visibility")
        
      val createDefaultLocation = request.getQueryString("createDefaultLocation")
        .map(value => value.toBoolean)
        
      val responseFormat = request.getQueryString("responseFormat")
        
      api.createRetailer(version, name, deviceId, accountId, streetAddress, streetAddress2, city, state, postalCode, country, businessPhone, businessPhoneExt, website, email, facebookUrl, twitterUrl, logo, logoAssetId, picture1, picture1AssetId, picture2, picture2AssetId, categoryIds, categoryIdsToAdd, categoryIdsToRemove, filterIds, latitude, longitude, metaData, searchTags, retailerType, visibility, createDefaultLocation, responseFormat)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/retailer/delete?deviceId=[value]&accountId=[value]&retailerId=[value]
    */
  def deleteRetailer(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val retailerId = request.getQueryString("retailerId")
        .map(value => value.toLong)
        
      api.deleteRetailer(version, deviceId, accountId, retailerId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/retailer/get?deviceId=[value]&accountId=[value]&retailerId=[value]&includeCounts=[value]
    */
  def getRetailer(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): RetailerFullResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val retailerId = request.getQueryString("retailerId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("retailerId", "query string")
        }
        
      val includeCounts = request.getQueryString("includeCounts")
        .map(value => value.toBoolean)
        
      api.getRetailer(version, retailerId, deviceId, accountId, includeCounts)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/retailer/search?deviceId=[value]&accountId=[value]&q=[value]&keyword=[value]&categoryIds=[value]&filterIds=[value]&visibility=[value]&sortField=[value]&descending=[value]&i=[value]&start=[value]&l=[value]&limit=[value]&activeOnly=[value]
    */
  def getRetailers(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[RetailerResponse] = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val q = request.getQueryString("q")
        
      val keyword = request.getQueryString("keyword")
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val filterIds = request.getQueryString("filterIds")
        
      val visibility = request.getQueryString("visibility")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("visibility", "query string")
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
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("activeOnly", "query string")
        }
        
      api.getRetailers(version, visibility, sortField, descending, start, limit, activeOnly, deviceId, accountId, q, keyword, categoryIds, filterIds, i, l)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/retailer/login?username=[value]&password=[value]&deviceId=[value]&latitude=[value]&longitude=[value]&appKey=[value]
    */
  def retailerLoginCheck(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): AccountLoginResponse = {
      val username = request.getQueryString("username")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("username", "query string")
        }
        
      val password = request.getQueryString("password")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("password", "query string")
        }
        
      val deviceId = request.getQueryString("deviceId")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val appKey = request.getQueryString("appKey")
        
      api.retailerLoginCheck(version, username, password, deviceId, latitude, longitude, appKey)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/retailer/update?deviceId=[value]&accountId=[value]&retailerId=[value]&name=[value]&streetAddress=[value]&streetAddress2=[value]&city=[value]&state=[value]&postalCode=[value]&country=[value]&businessPhone=[value]&businessPhoneExt=[value]&website=[value]&email=[value]&facebookUrl=[value]&twitterUrl=[value]&logo=[value]&logoAssetId=[value]&picture1=[value]&picture1AssetId=[value]&picture2=[value]&picture2AssetId=[value]&categoryIds=[value]&filterIds=[value]&latitude=[value]&longitude=[value]&metaData=[value]&searchTags=[value]&retailerType=[value]&visibility=[value]&active=[value]&responseFormat=[value]
    */
  def updateRetailer(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): RetailerFullResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val retailerId = request.getQueryString("retailerId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("retailerId", "query string")
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
        
      val facebookUrl = request.getQueryString("facebookUrl")
        
      val twitterUrl = request.getQueryString("twitterUrl")
        
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
        
      val metaData = request.getQueryString("metaData")
        
      val searchTags = request.getQueryString("searchTags")
        
      val retailerType = request.getQueryString("retailerType")
        
      val visibility = request.getQueryString("visibility")
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val responseFormat = request.getQueryString("responseFormat")
        
      api.updateRetailer(version, retailerId, deviceId, accountId, name, streetAddress, streetAddress2, city, state, postalCode, country, businessPhone, businessPhoneExt, website, email, facebookUrl, twitterUrl, logo, logoAssetId, picture1, picture1AssetId, picture2, picture2AssetId, categoryIds, filterIds, latitude, longitude, metaData, searchTags, retailerType, visibility, active, responseFormat)
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
