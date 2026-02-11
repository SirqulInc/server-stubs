package api

import play.api.libs.json._
import model.WeatherResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait WeatherApi {
  /**
    * Search Weather
    * Search the weather forcast for the next 5 days
    * @param regionId Region Id
    * @param latitude Latitude
    * @param longitude Longitude
    * @param timezoneOffset Timezone Offset
    */
  def searchWeather(regionId: Option[Long], latitude: Option[Double], longitude: Option[Double], timezoneOffset: Option[Long]): WeatherResponse
}
