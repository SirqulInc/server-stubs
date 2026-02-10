package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ScoreListResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ScoreListResponse(
  start: Option[Int],
  limit: Option[Int],
  countTotal: Option[Long],
  items: Option[List[ScoreResponse]],
  count: Option[Int],
  hasMoreResults: Option[Boolean]
)

object ScoreListResponse {
  implicit lazy val scoreListResponseJsonFormat: Format[ScoreListResponse] = Json.format[ScoreListResponse]
}

