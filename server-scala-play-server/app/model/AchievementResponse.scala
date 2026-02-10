package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AchievementResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class AchievementResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  achievementId: Option[Long],
  title: Option[String],
  description: Option[String],
  analyticsTag: Option[String],
  rankType: Option[String],
  rankIncrement: Option[Int],
  validate: Option[Boolean],
  appName: Option[String],
  active: Option[Boolean],
  updated: Option[Long],
  created: Option[Long],
  tierCount: Option[Int],
  minIncrement: Option[Int],
  maxIncrement: Option[Int],
  tiers: Option[List[AchievementTierResponse]],
  returning: Option[String]
)

object AchievementResponse {
  implicit lazy val achievementResponseJsonFormat: Format[AchievementResponse] = Json.format[AchievementResponse]
}

