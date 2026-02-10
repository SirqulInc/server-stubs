package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for Game.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Game(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  owner: Option[Account],
  application: Option[Application],
  title: Option[String],
  description: Option[String],
  startDate: Option[OffsetDateTime],
  endDate: Option[OffsetDateTime],
  packs: Option[List[Pack]],
  sequenceType: Option[Game.SequenceType.Value],
  authorOverride: Option[String],
  icon: Option[Asset],
  image: Option[Asset],
  points: Option[Long],
  ticketType: Option[String],
  ticketCount: Option[Long],
  allocateTickets: Option[Boolean],
  allGameLevels: Option[List[GameLevel]],
  contentName: Option[String],
  contentType: Option[String]
)

object Game {
  implicit lazy val gameJsonFormat: Format[Game] = Json.format[Game]

  // noinspection TypeAnnotation
  object SequenceType extends Enumeration {
    val FIRSTAVAILABLE = Value("FIRST_AVAILABLE")
    val ALLAVAILABLE = Value("ALL_AVAILABLE")

    type SequenceType = Value
    implicit lazy val SequenceTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

