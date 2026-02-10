package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for FilterResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class FilterResponse(
  filterId: Option[Long],
  name: Option[String],
  display: Option[String],
  subFilterCount: Option[Int],
  parentId: Option[Long],
  description: Option[String],
  active: Option[Boolean],
  externalId: Option[String],
  externalType: Option[String]
)

object FilterResponse {
  implicit lazy val filterResponseJsonFormat: Format[FilterResponse] = Json.format[FilterResponse]
}

