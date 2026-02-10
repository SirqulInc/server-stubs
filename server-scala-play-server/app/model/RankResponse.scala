package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RankResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class RankResponse(
  owner: Option[AccountShortResponse],
  rank: Option[String],
  scoreValue: Option[Long],
  timeValue: Option[Long],
  countValue: Option[Long],
  updated: Option[Long]
)

object RankResponse {
  implicit lazy val rankResponseJsonFormat: Format[RankResponse] = Json.format[RankResponse]
}

