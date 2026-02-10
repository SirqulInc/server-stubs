package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TerritoryResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class TerritoryResponse(
  id: Option[Long],
  name: Option[String]
)

object TerritoryResponse {
  implicit lazy val territoryResponseJsonFormat: Format[TerritoryResponse] = Json.format[TerritoryResponse]
}

