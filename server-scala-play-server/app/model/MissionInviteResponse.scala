package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MissionInviteResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class MissionInviteResponse(
  id: Option[Long],
  status: Option[MissionInviteResponse.Status.Value],
  title: Option[String],
  description: Option[String],
  owner: Option[AccountShortResponse],
  permissionableId: Option[Long],
  permissionableType: Option[String],
  ranked: Option[Boolean],
  rewarded: Option[Boolean],
  startDate: Option[Long],
  endDate: Option[Long],
  updated: Option[Long],
  buyBackAvailable: Option[Boolean],
  inviteStatus: Option[MissionInviteResponse.InviteStatus.Value]
)

object MissionInviteResponse {
  implicit lazy val missionInviteResponseJsonFormat: Format[MissionInviteResponse] = Json.format[MissionInviteResponse]

  // noinspection TypeAnnotation
  object Status extends Enumeration {
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

    type Status = Value
    implicit lazy val StatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
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

