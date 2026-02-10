package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ChartData.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ChartData(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  identifier: Option[String],
  idAttribute: Option[String],
  label: Option[String],
  maxValue: Option[Long],
  totalCount: Option[Long],
  items: Option[List[JsObject]],
  aggregatedItems: Option[List[JsObject]],
  caption: Option[String],
  showAnchor: Option[String],
  anchorAlpha: Option[String],
  getxAxisName: Option[String],
  getyAxisMinValue: Option[String],
  getyAxisName: Option[String],
  decimalPrecision: Option[String],
  formatNumberScale: Option[String],
  numberPrefix: Option[String],
  showNames: Option[String],
  showValues: Option[String],
  showAlternateHGridColor: Option[String],
  alternateHGridColor: Option[String],
  divLineColor: Option[String],
  divLineAlpha: Option[String],
  alternateHGridAlpha: Option[String],
  rotateNames: Option[String],
  returning: Option[String]
)

object ChartData {
  implicit lazy val chartDataJsonFormat: Format[ChartData] = Json.format[ChartData]
}

