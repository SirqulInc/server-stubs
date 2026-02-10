package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GameLevelResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class GameLevelResponse(
  action: Option[GameLevelResponse.Action.Value],
  gameLevelId: Option[Long],
  gameType: Option[String],
  active: Option[Boolean],
  name: Option[String],
  description: Option[String],
  difficulty: Option[String],
  appVersion: Option[String],
  likesCount: Option[Long],
  dislikesCount: Option[Long],
  commentsCount: Option[Long],
  downloadCount: Option[Long],
  comments: Option[List[NoteResponse]],
  locked: Option[Boolean],
  completed: Option[Boolean],
  ticketsEarned: Option[Long],
  gameObjects: Option[GameObjectListResponse],
  hasLiked: Option[Boolean],
  image: Option[AssetShortResponse],
  gameData: Option[String],
  gameDataSuffix: Option[String],
  scores: Option[ScoreListResponse],
  owner: Option[AccountShortResponse],
  userPermissionsList: Option[UserPermissionsListResponse],
  results: Option[List[NameStringValueResponse]],
  randomizeGameObjects: Option[Boolean],
  tickets: Option[TicketListResponse],
  assignMission: Option[Boolean],
  icon: Option[AssetShortResponse],
  authorOverride: Option[String],
  updatedDate: Option[Long],
  startDate: Option[Long],
  endDate: Option[Long],
  splashTitle: Option[String],
  splashMessage: Option[String],
  hasFlagged: Option[Boolean],
  allocateTickets: Option[Boolean],
  ticketType: Option[String],
  ticketCount: Option[Long],
  points: Option[Long],
  winnerMessage: Option[String],
  tutorial: Option[TutorialResponse],
  appKey: Option[String],
  appName: Option[String],
  scoringType: Option[GameLevelResponse.ScoringType.Value],
  tutorialTitle: Option[String],
  tutorialMessage: Option[String],
  tutorialAlignment: Option[String],
  tutorialImage: Option[AssetShortResponse],
  nextLevelId: Option[Long],
  offer: Option[OfferShortResponse]
)

object GameLevelResponse {
  implicit lazy val gameLevelResponseJsonFormat: Format[GameLevelResponse] = Json.format[GameLevelResponse]

  // noinspection TypeAnnotation
  object Action extends Enumeration {
    val DATA = Value("DATA")
    val SAVE = Value("SAVE")
    val DELETE = Value("DELETE")
    val GET = Value("GET")

    type Action = Value
    implicit lazy val ActionJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object ScoringType extends Enumeration {
    val GAMELEVEL = Value("GAME_LEVEL")
    val GAMEOBJECT = Value("GAME_OBJECT")

    type ScoringType = Value
    implicit lazy val ScoringTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

