package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for NodeRequest.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class NodeRequest(
  x: Option[Int],
  y: Option[Int],
  z: Option[Int],
  latitude: Option[Double],
  longitude: Option[Double],
  altitude: Option[Double],
  date: Option[Long],
  isWaypoint: Option[Boolean],
  accountId: Option[Long],
  node: Option[Node]
)

object NodeRequest {
  implicit lazy val nodeRequestJsonFormat: Format[NodeRequest] = Json.format[NodeRequest]
}

