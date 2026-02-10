package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Leaderboard.
  * @param rankMode One of GLOBAL, FRIENDS, LOCAL, SEARCH, CUSTOM
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Leaderboard(
  id: Option[Long],
  rankType: Option[String],
  rankMode: Option[String],
  sortType: Option[String],
  limitation: Option[Int],
  title: Option[String],
  description: Option[String],
  iconAsset: Option[AssetResponse],
  bannerAsset: Option[AssetResponse],
  application: Option[ApplicationMiniResponse],
  metaData: Option[String],
  active: Option[Boolean]
)

object Leaderboard {
  implicit lazy val leaderboardJsonFormat: Format[Leaderboard] = Json.format[Leaderboard]
}

