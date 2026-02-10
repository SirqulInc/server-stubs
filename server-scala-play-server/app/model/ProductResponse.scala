package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProductResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ProductResponse(
  brand: Option[String],
  productType: Option[String],
  condition: Option[String],
  isbn: Option[String],
  asin: Option[String],
  catalogNumbers: Option[List[String]],
  department: Option[String],
  features: Option[List[String]],
  minimumPrice: Option[Double],
  width: Option[Double],
  height: Option[Double],
  depth: Option[Double],
  weight: Option[Double],
  unit: Option[String],
  studio: Option[String],
  parentalRating: Option[String],
  publishDate: Option[Long],
  availabilityDate: Option[Long],
  size: Option[SizeGroupResponse]
)

object ProductResponse {
  implicit lazy val productResponseJsonFormat: Format[ProductResponse] = Json.format[ProductResponse]
}

