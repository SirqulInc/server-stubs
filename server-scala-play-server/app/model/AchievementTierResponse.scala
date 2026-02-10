package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AchievementTierResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class AchievementTierResponse(
  achievementTierId: Option[Long],
  title: Option[String],
  description: Option[String],
  goalCount: Option[Long],
  icon: Option[AssetShortResponse],
  missionId: Option[Long],
  gameId: Option[Long],
  packId: Option[Long],
  gameLevelId: Option[Long],
  gameObjectId: Option[Long]
)

object AchievementTierResponse {
  implicit lazy val achievementTierResponseJsonFormat: Format[AchievementTierResponse] = Json.format[AchievementTierResponse]
}

