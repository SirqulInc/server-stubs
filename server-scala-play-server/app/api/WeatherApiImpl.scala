package api

import model.WeatherResponse

/**
  * Provides a default implementation for [[WeatherApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
class WeatherApiImpl extends WeatherApi {
  /**
    * @inheritdoc
    */
  override def searchWeather(regionId: Option[Long], latitude: Option[Double], longitude: Option[Double], timezoneOffset: Option[Long]): WeatherResponse = {
    // TODO: Implement better logic

    WeatherResponse(None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  }
}
