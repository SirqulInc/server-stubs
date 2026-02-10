package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MissionResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class MissionResponse(
  action: Option[MissionResponse.Action.Value],
  highestAppVersion: Option[String],
  missionId: Option[Long],
  ticketsEarned: Option[Long],
  costToPlay: Option[Int],
  costToPlayType: Option[String],
  owner: Option[AccountShortResponse],
  title: Option[String],
  description: Option[String],
  authorOverride: Option[String],
  icon: Option[AssetShortResponse],
  image: Option[AssetShortResponse],
  sequenceType: Option[String],
  updatedDate: Option[Long],
  startDate: Option[Long],
  endDate: Option[Long],
  missionType: Option[String],
  active: Option[Boolean],
  balance: Option[Double],
  availableLimit: Option[Int],
  inviteCount: Option[Int],
  acceptedCount: Option[Int],
  childCount: Option[Long],
  enableBuyBack: Option[Boolean],
  minimumToPlay: Option[Int],
  rewarded: Option[Boolean],
  refunded: Option[Boolean],
  joinCode: Option[String],
  rewards: Option[List[RewardResponse]],
  games: Option[GameListResponse],
  scores: Option[ScoreListResponse],
  userPermissionsList: Option[UserPermissionsListResponse],
  results: Option[List[NameStringValueResponse]],
  inviteStatus: Option[MissionResponse.InviteStatus.Value],
  audiences: Option[List[AudienceResponse]],
  missionInviteId: Option[Long],
  missionInvite: Option[MissionInviteResponse],
  invitee: Option[AccountShortResponse],
  formatType: Option[String],
  creatives: Option[List[CreativeResponse]],
  fixedReward: Option[Boolean],
  allocateTickets: Option[Boolean],
  ticketType: Option[String],
  ticketCount: Option[Long],
  points: Option[Long],
  splitReward: Option[String],
  secondsBetweenLevels: Option[Int],
  secondsBetweenPacks: Option[Int],
  advancedReporting: Option[Boolean]
)

object MissionResponse {
  implicit lazy val missionResponseJsonFormat: Format[MissionResponse] = Json.format[MissionResponse]

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
  object InviteStatus extends Enumeration {
    val AVAILABLE = Value("AVAILABLE")
    val PENDING = Value("PENDING")
    val UPDATED = Value("UPDATED")
    val ACCEPTED = Value("ACCEPTED")
    val ACTIVE = Value("ACTIVE")
    val BUYBACK = Value("BUY_BACK")
    val FAILED = Value("FAILED")
    val QUIT = Value("QUIT")
    val COMPLETED = Value("COMPLETED")
    val PENDINGREVIEW = Value("PENDING_REVIEW")
    val REJECTED = Value("REJECTED")

    type InviteStatus = Value
    implicit lazy val InviteStatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

