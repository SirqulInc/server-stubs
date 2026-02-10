package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ScheduledNotificationShortResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ScheduledNotificationShortResponse(
  scheduledNotificationId: Option[Long],
  active: Option[Boolean],
  status: Option[ScheduledNotificationShortResponse.Status.Value],
  `type`: Option[ScheduledNotificationShortResponse.Type.Value],
  name: Option[String],
  message: Option[String],
  groupingId: Option[String],
  scheduledDate: Option[Long],
  startDate: Option[Long],
  endDate: Option[Long]
)

object ScheduledNotificationShortResponse {
  implicit lazy val scheduledNotificationShortResponseJsonFormat: Format[ScheduledNotificationShortResponse] = Json.format[ScheduledNotificationShortResponse]

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
}

