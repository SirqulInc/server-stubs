package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProfileResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ProfileResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  loginAccountId: Option[Long],
  validated: Option[Boolean],
  appInfo: Option[AppInfoResponse],
  canViewAppInfo: Option[Boolean],
  canViewFriendInfo: Option[Boolean],
  canViewProfileInfo: Option[Boolean],
  flagCount: Option[Long],
  friendInfo: Option[ConnectionInfoResponse],
  isBlocked: Option[Boolean],
  isProfileOwner: Option[Boolean],
  metFlagThreshold: Option[Boolean],
  profileInfo: Option[ProfileInfoResponse],
  trusted: Option[Boolean],
  following: Option[Boolean],
  friendRequested: Option[Boolean],
  friendRequestPending: Option[Boolean],
  blocked: Option[Boolean],
  flagged: Option[Boolean],
  profileOwner: Option[Boolean],
  friend: Option[Boolean],
  returning: Option[String]
)

object ProfileResponse {
  implicit lazy val profileResponseJsonFormat: Format[ProfileResponse] = Json.format[ProfileResponse]
}

