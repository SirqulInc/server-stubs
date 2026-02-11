package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.WeatherResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
@Singleton
class WeatherApiController @Inject()(cc: ControllerComponents, api: WeatherApi) extends AbstractController(cc) {
  /**
    * GET /api/3.18/weather/search?regionId=[value]&latitude=[value]&longitude=[value]&timezoneOffset=[value]
    */
  def searchWeather(): Action[AnyContent] = Action { request =>
    def executeApi(): WeatherResponse = {
      val regionId = request.getQueryString("regionId")
        .map(value => value.toLong)
        
      val latitude = request.getQueryString("latitude")
        .map(value => value.toDouble)
        
      val longitude = request.getQueryString("longitude")
        .map(value => value.toDouble)
        
      val timezoneOffset = request.getQueryString("timezoneOffset")
        .map(value => value.toLong)
        
      api.searchWeather(regionId, latitude, longitude, timezoneOffset)
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
