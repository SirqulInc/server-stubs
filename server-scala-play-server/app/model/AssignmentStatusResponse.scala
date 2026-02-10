package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AssignmentStatusResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class AssignmentStatusResponse(
  assignmentStatusId: Option[Long],
  active: Option[Boolean],
  toDo: Option[AssignmentStatusResponse.ToDo.Value],
  connection: Option[AssignmentStatusResponse.Connection.Value],
  method: Option[AssignmentStatusResponse.Method.Value],
  status: Option[AssignmentStatusResponse.Status.Value],
  closure: Option[AssignmentStatusResponse.Closure.Value],
  message: Option[String],
  followUp: Option[Long],
  created: Option[Long],
  updated: Option[Long],
  notification: Option[ScheduledNotificationShortResponse]
)

object AssignmentStatusResponse {
  implicit lazy val assignmentStatusResponseJsonFormat: Format[AssignmentStatusResponse] = Json.format[AssignmentStatusResponse]

  // noinspection TypeAnnotation
  object ToDo extends Enumeration {
    val SITEVISIT = Value("SITE_VISIT")
    val PHONE = Value("PHONE")
    val RECONTACT = Value("RECONTACT")
    val RENEWAL = Value("RENEWAL")
    val CREDIT = Value("CREDIT")

    type ToDo = Value
    implicit lazy val ToDoJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Connection extends Enumeration {
    val INITIAL = Value("INITIAL")
    val FOLLOWUP = Value("FOLLOW_UP")
    val DECLINED = Value("DECLINED")

    type Connection = Value
    implicit lazy val ConnectionJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Method extends Enumeration {
    val PHONE = Value("PHONE")
    val SITEVISIT = Value("SITE_VISIT")
    val EMAIL = Value("EMAIL")

    type Method = Value
    implicit lazy val MethodJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Status extends Enumeration {
    val ARCHIVED = Value("ARCHIVED")
    val SUBSCRIBED = Value("SUBSCRIBED")
    val UNSUBSCRIBED = Value("UNSUBSCRIBED")
    val CONTACTED = Value("CONTACTED")
    val DECLINED = Value("DECLINED")
    val NOTCONTACTED = Value("NOT_CONTACTED")

    type Status = Value
    implicit lazy val StatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Closure extends Enumeration {
    val PHONE = Value("PHONE")
    val SITEVISIT = Value("SITE_VISIT")
    val PHONESITE = Value("PHONE_SITE")
    val WEB = Value("WEB")

    type Closure = Value
    implicit lazy val ClosureJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

