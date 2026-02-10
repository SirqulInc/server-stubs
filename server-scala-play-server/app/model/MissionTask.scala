package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MissionTask.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class MissionTask(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  name: Option[String],
  description: Option[String],
  format: Option[String],
  suffix: Option[String],
  taskType: Option[MissionTask.TaskType.Value]
)

object MissionTask {
  implicit lazy val missionTaskJsonFormat: Format[MissionTask] = Json.format[MissionTask]

  // noinspection TypeAnnotation
  object TaskType extends Enumeration {
    val PHOTO = Value("PHOTO")
    val VOTE = Value("VOTE")
    val ASK = Value("ASK")
    val ANSWER = Value("ANSWER")
    val GROUP = Value("GROUP")
    val INVITE = Value("INVITE")
    val OFFER = Value("OFFER")
    val AD = Value("AD")
    val CUSTOM = Value("CUSTOM")
    val GAME = Value("GAME")

    type TaskType = Value
    implicit lazy val TaskTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

