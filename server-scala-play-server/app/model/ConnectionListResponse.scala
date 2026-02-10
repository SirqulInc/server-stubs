package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConnectionListResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ConnectionListResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  connections: Option[List[ConnectionResponse]],
  friendCount: Option[Int],
  followingCount: Option[Int],
  itemCount: Option[Int],
  hasMoreResults: Option[Boolean],
  returning: Option[String]
)

object ConnectionListResponse {
  implicit lazy val connectionListResponseJsonFormat: Format[ConnectionListResponse] = Json.format[ConnectionListResponse]
}

