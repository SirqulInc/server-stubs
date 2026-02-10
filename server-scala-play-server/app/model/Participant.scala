package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for Participant.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Participant(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  account: Option[Account],
  availableStart: Option[OffsetDateTime],
  availableEnd: Option[OffsetDateTime],
  color1: Option[String],
  color2: Option[String],
  `type`: Option[Participant.Type.Value]
)

object Participant {
  implicit lazy val participantJsonFormat: Format[Participant] = Json.format[Participant]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val TEAM = Value("TEAM")
    val LEAGUE = Value("LEAGUE")
    val SPORT = Value("SPORT")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

