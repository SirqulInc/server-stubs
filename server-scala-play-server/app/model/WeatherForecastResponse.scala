package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for WeatherForecastResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class WeatherForecastResponse(
  id: Option[Long],
  forecastDate: Option[Long],
  precipMM: Option[Double],
  tempMaxC: Option[Int],
  tempMaxF: Option[Int],
  tempMinC: Option[Int],
  tempMinF: Option[Int],
  weatherCode: Option[Int],
  weatherDesc: Option[String],
  weatherIconUrl: Option[String],
  winddir16Point: Option[String],
  winddirDegree: Option[Int],
  winddirection: Option[String],
  windspeedKmph: Option[Int],
  windspeedMiles: Option[Int]
)

object WeatherForecastResponse {
  implicit lazy val weatherForecastResponseJsonFormat: Format[WeatherForecastResponse] = Json.format[WeatherForecastResponse]
}

