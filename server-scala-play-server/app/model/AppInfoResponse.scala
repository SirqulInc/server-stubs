package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AppInfoResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class AppInfoResponse(
  points: Option[Long],
  ticketsAvailable: Option[Long],
  ticketsEarned: Option[Long],
  ticketsPurchased: Option[Long],
  ticketsUsed: Option[Long],
  rank: Option[String],
  maxPoints: Option[Long],
  maxTickets: Option[Long],
  pointToTicketModifier: Option[Float],
  scoringType: Option[AppInfoResponse.ScoringType.Value],
  purchaseItemListResponse: Option[PurchaseItemListResponse],
  termsAcceptedDate: Option[Long],
  requiresTermsAcceptance: Option[Boolean],
  completedAchievements: Option[List[AchievementProgressResponse]],
  wipAchievements: Option[List[AchievementProgressResponse]],
  appBlob: Option[String],
  enablePush: Option[Boolean],
  enableSMS: Option[Boolean],
  enableEmail: Option[Boolean],
  ticketCounts: Option[List[TicketCountResponse]]
)

object AppInfoResponse {
  implicit lazy val appInfoResponseJsonFormat: Format[AppInfoResponse] = Json.format[AppInfoResponse]

  // noinspection TypeAnnotation
  object ScoringType extends Enumeration {
    val GAMELEVEL = Value("GAME_LEVEL")
    val GAMEOBJECT = Value("GAME_OBJECT")

    type ScoringType = Value
    implicit lazy val ScoringTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

