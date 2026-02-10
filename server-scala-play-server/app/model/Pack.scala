package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for Pack.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Pack(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  newOwnerId: Option[Long],
  owner: Option[Account],
  application: Option[Application],
  sequenceType: Option[Pack.SequenceType.Value],
  title: Option[String],
  description: Option[String],
  startDate: Option[OffsetDateTime],
  endDate: Option[OffsetDateTime],
  packType: Option[Pack.PackType.Value],
  image: Option[Asset],
  background: Option[Asset],
  imageURL: Option[String],
  gameLevels: Option[List[GameLevel]],
  hasMoreItems: Option[Boolean],
  totalCount: Option[Long],
  downloaded: Option[Boolean],
  authorOverride: Option[String],
  packOrder: Option[Long],
  inGame: Option[Boolean],
  highest: Option[Boolean],
  notificationCount: Option[Int],
  points: Option[Long],
  ticketType: Option[String],
  ticketCount: Option[Long],
  priceType: Option[String],
  price: Option[Int],
  allocateTickets: Option[Boolean],
  applicationTitle: Option[String],
  levelNumberMap: Option[Map[String, GameLevel]],
)

object Pack {
  implicit lazy val packJsonFormat: Format[Pack] = Json.format[Pack]

  // noinspection TypeAnnotation
  object SequenceType extends Enumeration {
    val FIRSTAVAILABLE = Value("FIRST_AVAILABLE")
    val ALLAVAILABLE = Value("ALL_AVAILABLE")

    type SequenceType = Value
    implicit lazy val SequenceTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
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

