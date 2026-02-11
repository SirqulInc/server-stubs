package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RetailerCountResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class RetailerCountResponse(
  locations: Option[Int],
  transactions: Option[Int],
  offers: Option[Int]
)

object RetailerCountResponse {
  implicit lazy val retailerCountResponseJsonFormat: Format[RetailerCountResponse] = Json.format[RetailerCountResponse]
}

