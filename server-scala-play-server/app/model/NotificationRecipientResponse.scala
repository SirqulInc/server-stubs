package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for NotificationRecipientResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class NotificationRecipientResponse(
  accountId: Option[Long],
  locationDisplay: Option[String],
  display: Option[String],
  username: Option[String],
  accountType: Option[String],
  profileImage: Option[String],
  gender: Option[NotificationRecipientResponse.Gender.Value],
  contactEmail: Option[String],
  applicationId: Option[Long],
  appName: Option[String],
  hasApns: Option[Boolean],
  hasGcm: Option[Boolean],
  hasEmail: Option[Boolean],
  hasSms: Option[Boolean]
)

object NotificationRecipientResponse {
  implicit lazy val notificationRecipientResponseJsonFormat: Format[NotificationRecipientResponse] = Json.format[NotificationRecipientResponse]

  // noinspection TypeAnnotation
  object Gender extends Enumeration {
    val MALE = Value("MALE")
    val FEMALE = Value("FEMALE")
    val ANY = Value("ANY")

    type Gender = Value
    implicit lazy val GenderJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

