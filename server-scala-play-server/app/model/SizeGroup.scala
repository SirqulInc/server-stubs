package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SizeGroup.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class SizeGroup(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  groupingId: Option[Long],
  name: Option[String],
  description: Option[String]
)

object SizeGroup {
  implicit lazy val sizeGroupJsonFormat: Format[SizeGroup] = Json.format[SizeGroup]
}

