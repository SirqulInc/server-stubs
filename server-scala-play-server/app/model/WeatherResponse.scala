package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for WeatherResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class WeatherResponse(
  id: Option[Long],
  cloudcover: Option[Int],
  humidity: Option[Int],
  observationTime: Option[Long],
  precipMM: Option[Double],
  pressure: Option[Int],
  tempC: Option[Int],
  tempF: Option[Int],
  visibility: Option[Int],
  weatherCode: Option[Int],
  weatherDesc: Option[String],
  weatherIconUrl: Option[String],
  winddir16Point: Option[String],
  winddirDegree: Option[Int],
  windspeedKmph: Option[Int],
  windspeedMiles: Option[Int],
  forecasts: Option[List[WeatherForecastResponse]]
)

object WeatherResponse {
  implicit lazy val weatherResponseJsonFormat: Format[WeatherResponse] = Json.format[WeatherResponse]
}

