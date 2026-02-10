package api

import play.api.libs.json._
import model.BigDecimal
import model.WeatherResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
trait WeatherApi {
  /**
    * Search Weather
    * Search the weather forcast for the next 5 days
    * @param regionId Region Id
    * @param latitude Latitude
    * @param longitude Longitude
    * @param timezoneOffset Timezone Offset
    */
  def searchWeather(version: BigDecimal, regionId: Option[Long], latitude: Option[Double], longitude: Option[Double], timezoneOffset: Option[Long]): WeatherResponse
}
