package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TicketResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class TicketResponse(
  action: Option[TicketResponse.Action.Value],
  id: Option[Long],
  accountId: Option[Long],
  objectId: Option[Long],
  `type`: Option[TicketResponse.Type.Value],
  actionType: Option[TicketResponse.ActionType.Value],
  used: Option[Long],
  count: Option[Long],
  purchaseItem: Option[PurchaseItemShortResponse],
  customMessage: Option[String],
  sender: Option[AccountShortResponse],
  receiver: Option[List[AccountShortResponse]],
  customAsset: Option[AssetShortResponse],
  receiptToken: Option[String],
  ticketType: Option[String],
  application: Option[ApplicationShortResponse]
)

object TicketResponse {
  implicit lazy val ticketResponseJsonFormat: Format[TicketResponse] = Json.format[TicketResponse]

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
  object Type extends Enumeration {
    val GAMEOBJECT = Value("GAME_OBJECT")
    val GAMELEVEL = Value("GAME_LEVEL")
    val PACK = Value("PACK")
    val GAME = Value("GAME")
    val MISSION = Value("MISSION")
    val PROFILE = Value("PROFILE")
    val APPLICATION = Value("APPLICATION")
    val TICKETS = Value("TICKETS")
    val ASSET = Value("ASSET")
    val CUSTOM = Value("CUSTOM")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object ActionType extends Enumeration {
    val COMPLETED = Value("COMPLETED")
    val REDEEMED = Value("REDEEMED")
    val USERSPLAYED = Value("USERS_PLAYED")
    val TOURNAMENTOWNER = Value("TOURNAMENT_OWNER")
    val PURCHASED = Value("PURCHASED")
    val SUMATION = Value("SUMATION")
    val GIFTED = Value("GIFTED")
    val REFUNDED = Value("REFUNDED")

    type ActionType = Value
    implicit lazy val ActionTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

