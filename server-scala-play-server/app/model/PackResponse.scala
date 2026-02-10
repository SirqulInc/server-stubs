package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PackResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class PackResponse(
  action: Option[PackResponse.Action.Value],
  highestAppVersion: Option[String],
  gameType: Option[String],
  packId: Option[Long],
  name: Option[String],
  description: Option[String],
  active: Option[Boolean],
  downloaded: Option[Boolean],
  completed: Option[Boolean],
  icon: Option[AssetShortResponse],
  background: Option[AssetShortResponse],
  ticketsEarned: Option[Long],
  levels: Option[GameLevelListResponse],
  sequenceType: Option[String],
  scores: Option[ScoreListResponse],
  owner: Option[AccountShortResponse],
  costToRedeem: Option[Long],
  price: Option[Long],
  priceType: Option[String],
  userPermissionsList: Option[UserPermissionsListResponse],
  results: Option[List[NameStringValueResponse]],
  tickets: Option[TicketListResponse],
  authorOverride: Option[String],
  updatedDate: Option[Long],
  startDate: Option[Long],
  endDate: Option[Long],
  packType: Option[PackResponse.PackType.Value],
  packOrder: Option[Long],
  appKey: Option[String],
  application: Option[ApplicationShortResponse],
  inGame: Option[Boolean],
  highest: Option[Boolean],
  allocateTickets: Option[Boolean],
  ticketType: Option[String],
  ticketCount: Option[Long],
  points: Option[Long]
)

object PackResponse {
  implicit lazy val packResponseJsonFormat: Format[PackResponse] = Json.format[PackResponse]

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
  object PackType extends Enumeration {
    val TUTORIAL = Value("TUTORIAL")
    val BUILTIN = Value("BUILTIN")
    val DOWNLOAD = Value("DOWNLOAD")
    val THRESHOLD = Value("THRESHOLD")
    val THEME = Value("THEME")
    val TOURNAMENT = Value("TOURNAMENT")

    type PackType = Value
    implicit lazy val PackTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

