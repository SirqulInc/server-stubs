package model

import play.api.libs.json._
import java.time.OffsetDateTime
import scala.collection.immutable.Set

/**
  * Represents the Swagger definition for ScheduledNotification.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ScheduledNotification(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  owner: Option[Account],
  billableEntity: Option[BillableEntity],
  `type`: Option[ScheduledNotification.Type.Value],
  status: Option[ScheduledNotification.Status.Value],
  templateType: Option[ScheduledNotification.TemplateType.Value],
  name: Option[String],
  errorMessage: Option[String],
  message: Option[String],
  payload: Option[String],
  contentName: Option[String],
  contentId: Option[Long],
  contentType: Option[String],
  parentId: Option[Long],
  parentType: Option[String],
  application: Option[Application],
  connectionGroups: Option[List[ConnectionGroup]],
  accountIds: Option[Set[Long]],
  audiences: Option[List[Audience]],
  report: Option[ReportDefinition],
  reportParams: Option[String],
  endpointURL: Option[String],
  lastActionDate: Option[OffsetDateTime],
  scheduledDate: Option[OffsetDateTime],
  startDate: Option[OffsetDateTime],
  endDate: Option[OffsetDateTime],
  cronExpression: Option[String],
  deliverEstimate: Option[Long],
  deliverCount: Option[Long],
  deliverFailed: Option[Long],
  deliverTotal: Option[Long],
  deliverStart: Option[Long],
  deliverLimit: Option[Long],
  processingTime: Option[Long],
  sendingTime: Option[Long],
  groupingId: Option[String],
  conditionalInput: Option[String],
  conditionalCode: Option[String],
  publicPermissions: Option[Permissions],
  userPermissions: Option[List[UserPermissions]],
  visibility: Option[ScheduledNotification.Visibility.Value],
  approvalStatus: Option[ScheduledNotification.ApprovalStatus.Value],
  contentAsset: Option[Asset]
)

object ScheduledNotification {
  implicit lazy val scheduledNotificationJsonFormat: Format[ScheduledNotification] = Json.format[ScheduledNotification]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val HTTP = Value("HTTP")
    val SAVE = Value("SAVE")
    val EMAIL = Value("EMAIL")
    val SMS = Value("SMS")
    val APNS = Value("APNS")
    val GCM = Value("GCM")
    val PUSH = Value("PUSH")
    val MOBILENOTIFICATION = Value("MOBILE_NOTIFICATION")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Status extends Enumeration {
    val NEW = Value("NEW")
    val ERROR = Value("ERROR")
    val COMPLETE = Value("COMPLETE")
    val PROCESSING = Value("PROCESSING")
    val TEMPLATE = Value("TEMPLATE")

    type Status = Value
    implicit lazy val StatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object TemplateType extends Enumeration {
    val REPORTING = Value("REPORTING")
    val ACHIEVEMENTOWNER = Value("ACHIEVEMENT_OWNER")
    val ACHIEVEMENTTRIGGER = Value("ACHIEVEMENT_TRIGGER")
    val GEOFENCEOWNER = Value("GEOFENCE_OWNER")
    val GEOFENCETARGET = Value("GEOFENCE_TARGET")
    val GEOFENCETRIGGER = Value("GEOFENCE_TRIGGER")
    val GEOFENCEHTTPCALL = Value("GEOFENCE_HTTP_CALL")

    type TemplateType = Value
    implicit lazy val TemplateTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
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

