package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for NotificationTemplateResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class NotificationTemplateResponse(
  notificationTemplateId: Option[Long],
  event: Option[String],
  conduit: Option[NotificationTemplateResponse.Conduit.Value],
  title: Option[String],
  body: Option[String],
  publicBody: Option[String],
  application: Option[ApplicationMiniResponse],
  updated: Option[Long],
  created: Option[Long],
  tags: Option[String]
)

object NotificationTemplateResponse {
  implicit lazy val notificationTemplateResponseJsonFormat: Format[NotificationTemplateResponse] = Json.format[NotificationTemplateResponse]

  // noinspection TypeAnnotation
  object Conduit extends Enumeration {
    val HTTP = Value("HTTP")
    val SAVE = Value("SAVE")
    val EMAIL = Value("EMAIL")
    val SMS = Value("SMS")
    val APNS = Value("APNS")
    val GCM = Value("GCM")
    val PUSH = Value("PUSH")
    val MOBILENOTIFICATION = Value("MOBILE_NOTIFICATION")

    type Conduit = Value
    implicit lazy val ConduitJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

