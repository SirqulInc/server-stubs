package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for WordzWordResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class WordzWordResponse(
  id: Option[Long],
  word: Option[String],
  definition: Option[String],
  scores: Option[ScoreListResponse],
  icon: Option[AssetShortResponse],
  image: Option[AssetShortResponse],
  authorOverride: Option[String],
  updatedDate: Option[Long],
  startDate: Option[Long],
  endDate: Option[Long],
  createdDate: Option[Long],
  active: Option[Boolean],
  allocateTickets: Option[Boolean],
  ticketType: Option[String],
  ticketCount: Option[Long],
  points: Option[Long]
)

object WordzWordResponse {
  implicit lazy val wordzWordResponseJsonFormat: Format[WordzWordResponse] = Json.format[WordzWordResponse]
}

