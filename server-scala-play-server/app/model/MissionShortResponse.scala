package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MissionShortResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class MissionShortResponse(
  action: Option[MissionShortResponse.Action.Value],
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
  joinCode: Option[String]
)

object MissionShortResponse {
  implicit lazy val missionShortResponseJsonFormat: Format[MissionShortResponse] = Json.format[MissionShortResponse]

  // noinspection TypeAnnotation
  object Action extends Enumeration {
    val DATA = Value("DATA")
    val SAVE = Value("SAVE")
    val DELETE = Value("DELETE")
    val GET = Value("GET")

    type Action = Value
    implicit lazy val ActionJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

