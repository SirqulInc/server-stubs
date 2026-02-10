package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Assignment.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Assignment(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  name: Option[String],
  description: Option[String],
  assignee: Option[Account],
  retailerLocation: Option[RetailerLocation],
  creator: Option[Account],
  lastUpdatedBy: Option[Account],
  currentStatus: Option[AssignmentStatus],
  currentStatusType: Option[Assignment.CurrentStatusType.Value],
  assets: Option[List[Asset]],
  notes: Option[List[Note]],
  publicPermissions: Option[Permissions],
  userPermissions: Option[List[UserPermissions]],
  visibility: Option[Assignment.Visibility.Value],
  statuses: Option[List[AssignmentStatus]],
  application: Option[Application],
  approvalStatus: Option[Assignment.ApprovalStatus.Value],
  contentName: Option[String],
  contentAsset: Option[Asset],
  owner: Option[Account],
  noteCount: Option[Long]
)

object Assignment {
  implicit lazy val assignmentJsonFormat: Format[Assignment] = Json.format[Assignment]

  // noinspection TypeAnnotation
  object CurrentStatusType extends Enumeration {
    val NEW = Value("NEW")
    val INPROGRESS = Value("IN_PROGRESS")
    val SUBSCRIBED = Value("SUBSCRIBED")
    val ARCHIVED = Value("ARCHIVED")

    type CurrentStatusType = Value
    implicit lazy val CurrentStatusTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Visibility extends Enumeration {
    val PUBLIC = Value("PUBLIC")
    val PRIVATE = Value("PRIVATE")
    val FRIENDS = Value("FRIENDS")

    type Visibility = Value
    implicit lazy val VisibilityJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object ApprovalStatus extends Enumeration {
    val PENDING = Value("PENDING")
    val REJECTED = Value("REJECTED")
    val APPROVED = Value("APPROVED")
    val FEATURED = Value("FEATURED")

    type ApprovalStatus = Value
    implicit lazy val ApprovalStatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

