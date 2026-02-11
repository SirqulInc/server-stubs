package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Verb.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-11T19:31:43.310890579Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Verb(
  tag: Option[String],
  body: Option[String],
  attributes: Option[Map[String, String]],
  children: Option[List[Verb]]
)

object Verb {
  implicit lazy val verbJsonFormat: Format[Verb] = Json.format[Verb]
}

