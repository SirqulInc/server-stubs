package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GameObjectResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class GameObjectResponse(
  action: Option[GameObjectResponse.Action.Value],
  gameObjectId: Option[Long],
  gameType: Option[String],
  ticketsEarned: Option[Long],
  scores: Option[ScoreListResponse],
  tickets: Option[TicketListResponse],
  items: Option[List[NameStringValueResponse]],
  allocateTickets: Option[Boolean]
)

object GameObjectResponse {
  implicit lazy val gameObjectResponseJsonFormat: Format[GameObjectResponse] = Json.format[GameObjectResponse]

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

