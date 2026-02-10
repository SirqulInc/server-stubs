package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ParticipantResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ParticipantResponse(
  id: Option[Long],
  account: Option[AccountMiniResponse],
  availableStart: Option[Long],
  availableEnd: Option[Long],
  color1: Option[String],
  color2: Option[String],
  `type`: Option[String]
)

object ParticipantResponse {
  implicit lazy val participantResponseJsonFormat: Format[ParticipantResponse] = Json.format[ParticipantResponse]
}

