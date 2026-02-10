package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Node.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class Node(
  x: Option[Int],
  y: Option[Int],
  z: Option[Int]
)

object Node {
  implicit lazy val nodeJsonFormat: Format[Node] = Json.format[Node]
}

