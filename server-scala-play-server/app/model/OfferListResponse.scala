package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OfferListResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class OfferListResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  items: Option[List[OfferResponse]],
  hasMoreResults: Option[Boolean],
  count: Option[Int],
  start: Option[Int],
  limit: Option[Int],
  countTotal: Option[Long],
  returning: Option[String]
)

object OfferListResponse {
  implicit lazy val offerListResponseJsonFormat: Format[OfferListResponse] = Json.format[OfferListResponse]
}

