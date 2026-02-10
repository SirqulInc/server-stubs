package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AssignmentResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class AssignmentResponse(
  assignmentId: Option[Long],
  name: Option[String],
  description: Option[String],
  active: Option[Boolean],
  created: Option[Long],
  updated: Option[Long],
  assignee: Option[AccountShortResponse],
  creator: Option[AccountShortResponse],
  lastReportedBy: Option[AccountShortResponse],
  location: Option[RetailerLocationShortResponse],
  currentStatus: Option[AssignmentStatusResponse],
  currentStatusType: Option[AssignmentResponse.CurrentStatusType.Value]
)

object AssignmentResponse {
  implicit lazy val assignmentResponseJsonFormat: Format[AssignmentResponse] = Json.format[AssignmentResponse]

  // noinspection TypeAnnotation
  object CurrentStatusType extends Enumeration {
    val NEW = Value("NEW")
    val INPROGRESS = Value("IN_PROGRESS")
    val SUBSCRIBED = Value("SUBSCRIBED")
    val ARCHIVED = Value("ARCHIVED")

    type CurrentStatusType = Value
    implicit lazy val CurrentStatusTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

