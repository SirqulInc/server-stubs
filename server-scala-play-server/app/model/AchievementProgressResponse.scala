package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AchievementProgressResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class AchievementProgressResponse(
  achievementId: Option[Long],
  achievementTierId: Option[Long],
  title: Option[String],
  description: Option[String],
  icon: Option[AssetShortResponse],
  completed: Option[Boolean],
  progressCount: Option[Long],
  goalCount: Option[Long],
  dateUpdated: Option[Long]
)

object AchievementProgressResponse {
  implicit lazy val achievementProgressResponseJsonFormat: Format[AchievementProgressResponse] = Json.format[AchievementProgressResponse]
}

