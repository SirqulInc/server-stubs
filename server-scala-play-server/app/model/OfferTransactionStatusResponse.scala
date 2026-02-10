package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OfferTransactionStatusResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class OfferTransactionStatusResponse(
  id: Option[Long],
  active: Option[Boolean],
  name: Option[String],
  description: Option[String],
  code: Option[Int],
  role: Option[String],
  applications: Option[List[ApplicationShortResponse]]
)

object OfferTransactionStatusResponse {
  implicit lazy val offerTransactionStatusResponseJsonFormat: Format[OfferTransactionStatusResponse] = Json.format[OfferTransactionStatusResponse]
}

