package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Flag.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Flag(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  owner: Option[Account],
  flagableObjectType: Option[String],
  flagableObjectId: Option[Long],
  flagDescription: Option[String],
  app: Option[String]
)

object Flag {
  implicit lazy val flagJsonFormat: Format[Flag] = Json.format[Flag]
}

