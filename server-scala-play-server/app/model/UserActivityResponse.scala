package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for UserActivityResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class UserActivityResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  created: Option[OffsetDateTime],
  latitude: Option[Double],
  longitude: Option[Double],
  tag: Option[String],
  customId: Option[Long],
  customType: Option[String],
  userId: Option[Long],
  username: Option[String],
  appTitle: Option[String],
  appId: Option[Long],
  appUrl: Option[String],
  appDescription: Option[String],
  imageURL: Option[String],
  profileImage: Option[String],
  fields: Option[String],
  id: Option[Long],
  customText: Option[String],
  customValue: Option[Double],
  customMessage: Option[String],
  returning: Option[String]
)

object UserActivityResponse {
  implicit lazy val userActivityResponseJsonFormat: Format[UserActivityResponse] = Json.format[UserActivityResponse]
}

