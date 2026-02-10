package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Filter(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  application: Option[Application],
  name: Option[String],
  description: Option[String],
  parent: Option[Filter],
  children: Option[List[Filter]],
  display: Option[String],
  externalId: Option[String],
  externalType: Option[String],
  tree: Option[String]
)

object Filter {
  implicit lazy val filterJsonFormat: Format[Filter] = Json.format[Filter]
}

