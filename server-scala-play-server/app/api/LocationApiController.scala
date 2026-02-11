package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.CoordsResponse
import model.GeoPointResponse
import model.LocationSearchResponse
import model.SirqulResponse
import play.api.libs.Files.TemporaryFile
import model.TrilatCacheRequest

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class LocationApiController @Inject()(cc: ControllerComponents, api: LocationApi) extends AbstractController(cc) {
  /**
    * POST /api/3.18/location/trilaterate/cache?udid=[value]&sourceTime=[value]&minimumSampleSize=[value]&data=[value]&dataFile=[value]
    */
  def cacheTrilaterationData(): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val udid = request.getQueryString("udid")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("udid", "query string")
        }
        
      val sourceTime = request.getQueryString("sourceTime")
        .map(value => value.toLong)
        
      val minimumSampleSize = request.getQueryString("minimumSampleSize")
        .map(value => value.toInt)
        
      val data = request.getQueryString("data")
        
      val dataFile = request.getQueryString("dataFile")
        
      api.cacheTrilaterationData(udid, sourceTime, minimumSampleSize, data, dataFile)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /api/3.18/location/trilaterate/cache/submit
    */
  def cacheTrilaterationDataGzip(): Action[AnyContent] = Action { request =>
    def executeApi(): SirqulResponse = {
      val body = request.body.asJson.map(_.as[TrilatCacheRequest])
      api.cacheTrilaterationDataGzip(body)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/location/ip?ip=[value]
    */
  def getLocationByIp(): Action[AnyContent] = Action { request =>
    def executeApi(): CoordsResponse = {
      val ip = request.getQueryString("ip")
        
      api.getLocationByIp(ip)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/account/location/trilaterate?accountId=[value]&latitude=[value]&longitude=[value]&data=[value]&responseFilters=[value]
    */
  def getLocationByTrilateration(): Action[AnyContent] = Action { request =>
    def executeApi(): GeoPointResponse = {
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val data = request.getQueryString("data")
        
      val responseFilters = request.getQueryString("responseFilters")
        
      api.getLocationByTrilateration(accountId, latitude, longitude, data, responseFilters)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/3.18/location/search?deviceId=[value]&accountId=[value]&currentlatitude=[value]&currentlongitude=[value]&currentLatitude=[value]&currentLongitude=[value]&query=[value]&zipcode=[value]&zipCode=[value]&selectedMaplatitude=[value]&selectedMaplongitude=[value]&selectedMapLatitude=[value]&selectedMapLongitude=[value]&searchRange=[value]&useGeocode=[value]&i=[value]&start=[value]&l=[value]&limit=[value]
    */
  def getLocations(): Action[AnyContent] = Action { request =>
    def executeApi(): LocationSearchResponse = {
      val deviceId = request.getQueryString("deviceId")
        
      val accountId = request.getQueryString("accountId")
        .map(value => value.toLong)
        
      val currentlatitude = request.getQueryString("currentlatitude")
        .map(value => value.toDouble)
        
      val currentlongitude = request.getQueryString("currentlongitude")
        .map(value => value.toDouble)
        
      val currentLatitude = request.getQueryString("currentLatitude")
        .map(value => value.toDouble)
        
      val currentLongitude = request.getQueryString("currentLongitude")
        .map(value => value.toDouble)
        
      val query = request.getQueryString("query")
        
      val zipcode = request.getQueryString("zipcode")
        
      val zipCode = request.getQueryString("zipCode")
        
      val selectedMaplatitude = request.getQueryString("selectedMaplatitude")
        .map(value => value.toDouble)
        
      val selectedMaplongitude = request.getQueryString("selectedMaplongitude")
        .map(value => value.toDouble)
        
      val selectedMapLatitude = request.getQueryString("selectedMapLatitude")
        .map(value => value.toDouble)
        
      val selectedMapLongitude = request.getQueryString("selectedMapLongitude")
        .map(value => value.toDouble)
        
      val searchRange = request.getQueryString("searchRange")
        .map(value => value.toDouble)
        
      val useGeocode = request.getQueryString("useGeocode")
        .map(value => value.toBoolean)
        
      val i = request.getQueryString("_i")
        .map(value => value.toInt)
        
      val start = request.getQueryString("start")
        .map(value => value.toInt)
        
      val l = request.getQueryString("_l")
        .map(value => value.toInt)
        
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      api.getLocations(deviceId, accountId, currentlatitude, currentlongitude, currentLatitude, currentLongitude, query, zipcode, zipCode, selectedMaplatitude, selectedMaplongitude, selectedMapLatitude, selectedMapLongitude, searchRange, useGeocode, i, start, l, limit)
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
