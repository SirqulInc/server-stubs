package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Invoice.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Invoice(
  location: Option[String],
  tax: Option[Int],
  total: Option[Int],
  lineItems: Option[List[LineItem]]
)

object Invoice {
  implicit lazy val invoiceJsonFormat: Format[Invoice] = Json.format[Invoice]
}

