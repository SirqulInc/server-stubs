package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.BigDecimal
import model.RegionResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class RegionApiController @Inject()(cc: ControllerComponents, api: RegionApi) extends AbstractController(cc) {
  /**
    * POST /api/:version/region/create?accountId=[value]&regionClass=[value]&shortName=[value]&fullName=[value]&parentIds=[value]&childrenIds=[value]&postalCodeIds=[value]&locations=[value]&retailerLocationId=[value]&visibility=[value]&categoryIds=[value]&filterIds=[value]&start=[value]&end=[value]&polygon=[value]&metaData=[value]&latitude=[value]&longitude=[value]&versionCode=[value]&root=[value]&active=[value]
    */
  def createRegion(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): RegionResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val regionClass = request.getQueryString("regionClass")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("regionClass", "query string")
        }
        
      val shortName = request.getQueryString("shortName")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("shortName", "query string")
        }
        
      val fullName = request.getQueryString("fullName")
        
      val parentIds = request.getQueryString("parentIds")
        
      val childrenIds = request.getQueryString("childrenIds")
        
      val postalCodeIds = request.getQueryString("postalCodeIds")
        
      val locations = request.getQueryString("locations")
        
      val retailerLocationId = request.getQueryString("retailerLocationId")
        .map(value => value.toLong)
        
      val visibility = request.getQueryString("visibility")
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val filterIds = request.getQueryString("filterIds")
        
      val start = request.getQueryString("start")
        .map(value => value.toLong)
        
      val end = request.getQueryString("end")
        .map(value => value.toLong)
        
      val polygon = request.getQueryString("polygon")
        
      val metaData = request.getQueryString("metaData")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val versionCode = request.getQueryString("versionCode")
        .map(value => value.toInt)
        
      val root = request.getQueryString("root")
        .map(value => value.toBoolean)
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      api.createRegion(version, accountId, regionClass, shortName, fullName, parentIds, childrenIds, postalCodeIds, locations, retailerLocationId, visibility, categoryIds, filterIds, start, end, polygon, metaData, latitude, longitude, versionCode, root, active)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/region/delete?accountId=[value]&regionId=[value]
    */
  def deleteRegion(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): RegionResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val regionId = request.getQueryString("regionId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("regionId", "query string")
        }
        
      api.deleteRegion(version, accountId, regionId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/region/get?accountId=[value]&regionId=[value]
    */
  def getRegion(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): RegionResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val regionId = request.getQueryString("regionId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("regionId", "query string")
        }
        
      api.getRegion(version, regionId, accountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/:version/region/search?accountId=[value]&query=[value]&keyword=[value]&latitude=[value]&longitude=[value]&range=[value]&regionClass=[value]&visibility=[value]&searchMode=[value]&sortField=[value]&descending=[value]&includeParent=[value]&includeChildren=[value]&includePostalCodes=[value]&categoryIds=[value]&filterIds=[value]&versionCode=[value]&activeOnly=[value]&showDeleted=[value]&lastUpdatedSince=[value]&start=[value]&limit=[value]
    */
  def searchRegions(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): List[RegionResponse] = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val query = request.getQueryString("query")
        
      val keyword = request.getQueryString("keyword")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val range = request.getQueryString("range")
        .map(value => value.toDouble)
        
      val regionClass = request.getQueryString("regionClass")
        
      val visibility = request.getQueryString("visibility")
        
      val searchMode = request.getQueryString("searchMode")
        
      val sortField = request.getQueryString("sortField")
        
      val descending = request.getQueryString("descending")
        .map(value => value.toBoolean)
        
      val includeParent = request.getQueryString("includeParent")
        .map(value => value.toBoolean)
        
      val includeChildren = request.getQueryString("includeChildren")
        .map(value => value.toBoolean)
        
      val includePostalCodes = request.getQueryString("includePostalCodes")
        .map(value => value.toBoolean)
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val filterIds = request.getQueryString("filterIds")
        
      val versionCode = request.getQueryString("versionCode")
        .map(value => value.toInt)
        
      val activeOnly = request.getQueryString("activeOnly")
        .map(value => value.toBoolean)
        
      val showDeleted = request.getQueryString("showDeleted")
        .map(value => value.toBoolean)
        
      val lastUpdatedSince = request.getQueryString("lastUpdatedSince")
        .map(value => value.toLong)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.searchRegions(version, accountId, query, keyword, latitude, longitude, range, regionClass, visibility, searchMode, sortField, descending, includeParent, includeChildren, includePostalCodes, categoryIds, filterIds, versionCode, activeOnly, showDeleted, lastUpdatedSince, start, limit)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/:version/region/update?accountId=[value]&regionId=[value]&regionClass=[value]&shortName=[value]&fullName=[value]&parentIds=[value]&childrenIds=[value]&postalCodeIds=[value]&locations=[value]&retailerLocationId=[value]&visibility=[value]&categoryIds=[value]&filterIds=[value]&start=[value]&end=[value]&polygon=[value]&metaData=[value]&latitude=[value]&longitude=[value]&versionCode=[value]&root=[value]&active=[value]&clearLists=[value]
    */
  def updateRegion(version: BigDecimal): Action[AnyContent] = Action { request =>
    def executeApi(): RegionResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("accountId", "query string")
        }
        
      val regionId = request.getQueryString("regionId")
        .map(value => value.toLong)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("regionId", "query string")
        }
        
      val regionClass = request.getQueryString("regionClass")
        
      val shortName = request.getQueryString("shortName")
        
      val fullName = request.getQueryString("fullName")
        
      val parentIds = request.getQueryString("parentIds")
        
      val childrenIds = request.getQueryString("childrenIds")
        
      val postalCodeIds = request.getQueryString("postalCodeIds")
        
      val locations = request.getQueryString("locations")
        
      val retailerLocationId = request.getQueryString("retailerLocationId")
        .map(value => value.toLong)
        
      val visibility = request.getQueryString("visibility")
        
      val categoryIds = request.getQueryString("categoryIds")
        
      val filterIds = request.getQueryString("filterIds")
        
      val start = request.getQueryString("start")
        .map(value => value.toLong)
        
      val end = request.getQueryString("end")
        .map(value => value.toLong)
        
      val polygon = request.getQueryString("polygon")
        
      val metaData = request.getQueryString("metaData")
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val versionCode = request.getQueryString("versionCode")
        .map(value => value.toInt)
        
      val root = request.getQueryString("root")
        .map(value => value.toBoolean)
        
      val active = request.getQueryString("active")
        .map(value => value.toBoolean)
        
      val clearLists = request.getQueryString("clearLists")
        .map(value => value.toBoolean)
        
      api.updateRegion(version, accountId, regionId, regionClass, shortName, fullName, parentIds, childrenIds, postalCodeIds, locations, retailerLocationId, visibility, categoryIds, filterIds, start, end, polygon, metaData, latitude, longitude, versionCode, root, active, clearLists)
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
