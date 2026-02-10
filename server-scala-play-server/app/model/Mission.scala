package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for Mission.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Mission(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  owner: Option[Account],
  missionType: Option[Mission.MissionType.Value],
  title: Option[String],
  description: Option[String],
  costToPlay: Option[Int],
  costToPlayType: Option[String],
  games: Option[List[Game]],
  audiences: Option[List[Audience]],
  startDate: Option[OffsetDateTime],
  endDate: Option[OffsetDateTime],
  sequenceType: Option[Mission.SequenceType.Value],
  authorOverride: Option[String],
  icon: Option[Asset],
  image: Option[Asset],
  offers: Option[List[Offer]],
  visibility: Option[Mission.Visibility.Value],
  task: Option[MissionTask],
  points: Option[Long],
  ticketType: Option[String],
  ticketCount: Option[Long],
  allocateTickets: Option[Boolean],
  billableEntity: Option[BillableEntity],
  balance: Option[Double],
  startingLimit: Option[Int],
  availableLimit: Option[Int],
  inviteCount: Option[Int],
  acceptedCount: Option[Int],
  inviteStatus: Option[Mission.InviteStatus.Value],
  childCount: Option[Long],
  secondsBetweenLevels: Option[Int],
  secondsBetweenPacks: Option[Int],
  maximumLevelLength: Option[Int],
  enableBuyBack: Option[Boolean],
  activePack: Option[Pack],
  minimumToPlay: Option[Int],
  fixedReward: Option[Boolean],
  refunded: Option[Boolean],
  notificationsCreated: Option[Boolean],
  rewarded: Option[Boolean],
  externalId: Option[Long],
  advancedReporting: Option[Boolean],
  splitReward: Option[Mission.SplitReward.Value],
  joinCode: Option[String],
  firstPack: Option[Pack],
  allGameLevels: Option[List[GameLevel]],
  allPacks: Option[List[Pack]]
)

object Mission {
  implicit lazy val missionJsonFormat: Format[Mission] = Json.format[Mission]

  // noinspection TypeAnnotation
  object MissionType extends Enumeration {
    val PUBLIC = Value("PUBLIC")
    val SHARED = Value("SHARED")
    val TOURNAMENT = Value("TOURNAMENT")
    val POOLPLAY = Value("POOLPLAY")

    type MissionType = Value
    implicit lazy val MissionTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object SequenceType extends Enumeration {
    val FIRSTAVAILABLE = Value("FIRST_AVAILABLE")
    val ALLAVAILABLE = Value("ALL_AVAILABLE")

    type SequenceType = Value
    implicit lazy val SequenceTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Visibility extends Enumeration {
    val PUBLIC = Value("PUBLIC")
    val LISTABLE = Value("LISTABLE")
    val REWARDABLE = Value("REWARDABLE")
    val TRIGGERABLE = Value("TRIGGERABLE")
    val PRIVATE = Value("PRIVATE")

    type Visibility = Value
    implicit lazy val VisibilityJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
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

  // noinspection TypeAnnotation
  object SplitReward extends Enumeration {
    val EVEN = Value("EVEN")
    val ALL = Value("ALL")
    val FIRST = Value("FIRST")
    val RANDOM = Value("RANDOM")

    type SplitReward = Value
    implicit lazy val SplitRewardJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

