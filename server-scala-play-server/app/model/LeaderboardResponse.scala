package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LeaderboardResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class LeaderboardResponse(
  leaderboardId: Option[Long],
  rankType: Option[String],
  rankMode: Option[String],
  sortType: Option[String],
  limitation: Option[Int],
  title: Option[String],
  description: Option[String],
  metaData: Option[String],
  iconAsset: Option[AssetResponse],
  bannerAsset: Option[AssetResponse],
  active: Option[Boolean],
  application: Option[ApplicationMiniResponse]
)

object LeaderboardResponse {
  implicit lazy val leaderboardResponseJsonFormat: Format[LeaderboardResponse] = Json.format[LeaderboardResponse]
}

