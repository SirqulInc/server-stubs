package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ScoreResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ScoreResponse(
  action: Option[ScoreResponse.Action.Value],
  scoreId: Option[Long],
  status: Option[ScoreResponse.Status.Value],
  points: Option[Int],
  timeTaken: Option[Int],
  ticketsEarned: Option[Long],
  gameType: Option[String],
  accountId: Option[Long],
  accountDisplay: Option[String]
)

object ScoreResponse {
  implicit lazy val scoreResponseJsonFormat: Format[ScoreResponse] = Json.format[ScoreResponse]

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
  object Status extends Enumeration {
    val COMPLETED = Value("COMPLETED")
    val OWNERCREDIT = Value("OWNER_CREDIT")
    val SUMMATION = Value("SUMMATION")
    val TOURNAMENT = Value("TOURNAMENT")

    type Status = Value
    implicit lazy val StatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

