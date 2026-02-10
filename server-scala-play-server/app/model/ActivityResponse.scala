package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ActivityResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ActivityResponse(
  activityId: Option[Long],
  created: Option[Long],
  appKey: Option[String],
  targetId: Option[Long],
  targetType: Option[String],
  targetLegacyId: Option[String],
  targetDescription: Option[String],
  targetActive: Option[Boolean],
  action: Option[String],
  slaveEntityId: Option[Long]
)

object ActivityResponse {
  implicit lazy val activityResponseJsonFormat: Format[ActivityResponse] = Json.format[ActivityResponse]
}

