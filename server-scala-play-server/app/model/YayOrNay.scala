package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for YayOrNay.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class YayOrNay(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  owner: Option[Account],
  yayOrNay: Option[Boolean],
  likableObjectType: Option[String],
  likableObjectId: Option[Long]
)

object YayOrNay {
  implicit lazy val yayOrNayJsonFormat: Format[YayOrNay] = Json.format[YayOrNay]
}

