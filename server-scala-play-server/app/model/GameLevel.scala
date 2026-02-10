package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for GameLevel.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class GameLevel(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  newOwnerId: Option[Long],
  gameDifficulty: Option[GameLevel.GameDifficulty.Value],
  name: Option[String],
  image: Option[Asset],
  icon: Option[Asset],
  description: Option[String],
  startDate: Option[OffsetDateTime],
  endDate: Option[OffsetDateTime],
  randomizeGameObjects: Option[Boolean],
  owner: Option[Account],
  version: Option[AppVersion],
  notes: Option[List[Note]],
  noteCount: Option[Long],
  likes: Option[List[YayOrNay]],
  likeCount: Option[Long],
  dislikeCount: Option[Long],
  playCount: Option[Long],
  downloadCount: Option[Long],
  gameObjectCount: Option[Int],
  publicPermissions: Option[Permissions],
  visibility: Option[GameLevel.Visibility.Value],
  userPermissions: Option[List[UserPermissions]],
  flags: Option[List[Flag]],
  flagCount: Option[Long],
  flagThreshold: Option[FlagThreshold],
  application: Option[Application],
  assignMission: Option[Boolean],
  authorOverride: Option[String],
  splashTitle: Option[String],
  splashMessage: Option[String],
  winnerMessage: Option[String],
  tutorial: Option[Tutorial],
  approvalStatus: Option[GameLevel.ApprovalStatus.Value],
  nextLevel: Option[GameLevel],
  offer: Option[Offer],
  balance: Option[Double],
  levelNumber: Option[Int],
  points: Option[Long],
  ticketType: Option[String],
  ticketCount: Option[Long],
  allocateTickets: Option[Boolean],
  applicationTitle: Option[String],
  ownerUsername: Option[String],
  likableNotificationModels: Option[List[Map[String, JsObject]]],
  notableNotificationModels: Option[List[Map[String, JsObject]]],
  published: Option[Boolean],
  contentName: Option[String],
  defaultThreshold: Option[Long],
  contentAsset: Option[Asset],
  contentType: Option[String]
)

object GameLevel {
  implicit lazy val gameLevelJsonFormat: Format[GameLevel] = Json.format[GameLevel]

  // noinspection TypeAnnotation
  object GameDifficulty extends Enumeration {
    val VERYEASY = Value("VERY_EASY")
    val EASY = Value("EASY")
    val MEDIUM = Value("MEDIUM")
    val HARD = Value("HARD")
    val VERYHARD = Value("VERY_HARD")

    type GameDifficulty = Value
    implicit lazy val GameDifficultyJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Visibility extends Enumeration {
    val PUBLIC = Value("PUBLIC")
    val PRIVATE = Value("PRIVATE")
    val FRIENDS = Value("FRIENDS")

    type Visibility = Value
    implicit lazy val VisibilityJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object ApprovalStatus extends Enumeration {
    val PENDING = Value("PENDING")
    val REJECTED = Value("REJECTED")
    val APPROVED = Value("APPROVED")
    val FEATURED = Value("FEATURED")

    type ApprovalStatus = Value
    implicit lazy val ApprovalStatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

