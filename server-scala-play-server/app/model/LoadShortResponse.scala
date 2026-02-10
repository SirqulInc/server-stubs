package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LoadShortResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class LoadShortResponse(
  id: Option[String],
  name: Option[String],
  size: Option[Long],
  loadingTime: Option[Long],
  separatePayloads: Option[Boolean],
  pickup: Option[StopResponse],
  dropoff: Option[StopResponse]
)

object LoadShortResponse {
  implicit lazy val loadShortResponseJsonFormat: Format[LoadShortResponse] = Json.format[LoadShortResponse]
}

