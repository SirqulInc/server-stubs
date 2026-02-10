package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ContactResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ContactResponse(
  firstName: Option[String],
  middleName: Option[String],
  lastName: Option[String],
  prefix: Option[String],
  suffix: Option[String],
  title: Option[String],
  contactInfo: Option[ContactInfoResponse]
)

object ContactResponse {
  implicit lazy val contactResponseJsonFormat: Format[ContactResponse] = Json.format[ContactResponse]
}

