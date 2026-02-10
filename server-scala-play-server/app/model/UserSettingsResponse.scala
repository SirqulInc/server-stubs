package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UserSettingsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class UserSettingsResponse(
  showAsZipcode: Option[Boolean],
  showExactLocation: Option[Boolean],
  showOthersExactLocation: Option[Boolean],
  suggestionCount: Option[Int],
  suggestionTimeFrame: Option[Int],
  suggestionMethod: Option[String],
  notifications: Option[NotificationSettingsResponse],
  publicShowFriendInfo: Option[Boolean],
  publicShowGameInfo: Option[Boolean],
  publicShowProfileInfo: Option[Boolean],
  favoriteVisibility: Option[UserSettingsResponse.FavoriteVisibility.Value]
)

object UserSettingsResponse {
  implicit lazy val userSettingsResponseJsonFormat: Format[UserSettingsResponse] = Json.format[UserSettingsResponse]

  // noinspection TypeAnnotation
  object FavoriteVisibility extends Enumeration {
    val PUBLIC = Value("PUBLIC")
    val PRIVATE = Value("PRIVATE")
    val FRIENDS = Value("FRIENDS")

    type FavoriteVisibility = Value
    implicit lazy val FavoriteVisibilityJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

