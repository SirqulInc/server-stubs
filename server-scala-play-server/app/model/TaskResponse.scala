package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TaskResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class TaskResponse(
  scheduledNotificationId: Option[Long],
  active: Option[Boolean],
  status: Option[TaskResponse.Status.Value],
  `type`: Option[TaskResponse.Type.Value],
  name: Option[String],
  message: Option[String],
  groupingId: Option[String],
  scheduledDate: Option[Long],
  startDate: Option[Long],
  endDate: Option[Long],
  owner: Option[AccountShortResponse],
  billableEntity: Option[BillableEntityShortResponse],
  contentId: Option[Long],
  contentName: Option[String],
  contentType: Option[String],
  parentId: Option[Long],
  parentType: Option[String],
  application: Option[ApplicationMiniResponse],
  targetId: Option[Long],
  targetName: Option[String],
  targetType: Option[String],
  targetParams: Option[String],
  deliverEstimate: Option[Long],
  deliverCount: Option[Long],
  deliverTotal: Option[Long],
  deliverFailed: Option[Long],
  processingTime: Option[Long],
  sendingTime: Option[Long],
  updated: Option[Long],
  created: Option[Long],
  cronExpression: Option[String],
  endpointURL: Option[String],
  payload: Option[String],
  conditionalInput: Option[String],
  connectionAccountIds: Option[List[Long]],
  templateType: Option[TaskResponse.TemplateType.Value],
  groupedTypes: Option[TaskResponse.GroupedTypes.Value],
  taskId: Option[Long]
)

object TaskResponse {
  implicit lazy val taskResponseJsonFormat: Format[TaskResponse] = Json.format[TaskResponse]

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
  object GroupedTypes extends Enumeration {
    val HTTP = Value("HTTP")
    val SAVE = Value("SAVE")
    val EMAIL = Value("EMAIL")
    val SMS = Value("SMS")
    val APNS = Value("APNS")
    val GCM = Value("GCM")
    val PUSH = Value("PUSH")
    val MOBILENOTIFICATION = Value("MOBILE_NOTIFICATION")

    type GroupedTypes = Value
    implicit lazy val GroupedTypesJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

