package api

import model.BigDecimal
import model.WeatherResponse

/**
  * Provides a default implementation for [[WeatherApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class WeatherApiImpl extends WeatherApi {
  /**
    * @inheritdoc
    */
  override def searchWeather(version: BigDecimal, regionId: Option[Long], latitude: Option[Double], longitude: Option[Double], timezoneOffset: Option[Long]): WeatherResponse = {
    // TODO: Implement better logic

    WeatherResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
