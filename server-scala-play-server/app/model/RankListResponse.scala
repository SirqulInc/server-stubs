package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RankListResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class RankListResponse(
  items: Option[List[RankResponse]],
  userRank: Option[RankResponse],
  hasMoreResults: Option[Boolean],
  count: Option[Int],
  rankType: Option[String],
  app: Option[String],
  sortField: Option[String],
  leaderboardMode: Option[RankListResponse.LeaderboardMode.Value],
  start: Option[Long],
  limit: Option[Long]
)

object RankListResponse {
  implicit lazy val rankListResponseJsonFormat: Format[RankListResponse] = Json.format[RankListResponse]

  // noinspection TypeAnnotation
  object LeaderboardMode extends Enumeration {
    val GLOBAL = Value("GLOBAL")
    val FRIENDS = Value("FRIENDS")
    val LOCAL = Value("LOCAL")
    val SEARCH = Value("SEARCH")
    val CUSTOM = Value("CUSTOM")

    type LeaderboardMode = Value
    implicit lazy val LeaderboardModeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

