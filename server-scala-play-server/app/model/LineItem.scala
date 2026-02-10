package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LineItem.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class LineItem(
  description: Option[String],
  item: Option[String],
  pricePerItem: Option[Int],
  total: Option[Int],
  tax: Option[Int],
  quantity: Option[Int]
)

object LineItem {
  implicit lazy val lineItemJsonFormat: Format[LineItem] = Json.format[LineItem]
}

