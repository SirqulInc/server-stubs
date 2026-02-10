package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConnectionInfoResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ConnectionInfoResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  groups: Option[List[ConnectionGroupResponse]],
  followerCount: Option[Int],
  followingCount: Option[Int],
  friendCount: Option[Int],
  privateGroupCount: Option[Int],
  returning: Option[String]
)

object ConnectionInfoResponse {
  implicit lazy val connectionInfoResponseJsonFormat: Format[ConnectionInfoResponse] = Json.format[ConnectionInfoResponse]
}

