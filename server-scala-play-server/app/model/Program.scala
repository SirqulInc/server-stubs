package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Program.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Program(
  id: Option[Long],
  active: Option[Boolean],
  valid: Option[Boolean],
  name: Option[String],
  description: Option[String],
  costPerRide: Option[Int]
)

object Program {
  implicit lazy val programJsonFormat: Format[Program] = Json.format[Program]
}

