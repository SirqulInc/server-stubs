package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConnectionGroupResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-09T20:57:39.376804970Z[Etc/UTC]", comments = "Generator version: 7.20.0-SNAPSHOT")
case class ConnectionGroupResponse(
  valid: Option[Boolean],
  message: Option[String],
  version: Option[Double],
  serializeNulls: Option[Boolean],
  startTimeLog: Option[Long],
  errorCode: Option[String],
  request: Option[List[NameStringValueResponse]],
  connectionGroupId: Option[Long],
  name: Option[String],
  groupType: Option[ConnectionGroupResponse.GroupType.Value],
  thumbnailURL: Option[String],
  subGroups: Option[List[ConnectionGroupResponse]],
  description: Option[String],
  active: Option[Boolean],
  connectionCount: Option[Int],
  connections: Option[List[ConnectionResponse]],
  groupPermissions: Option[GroupPermissions],
  ownerId: Option[Long],
  returning: Option[String]
)

object ConnectionGroupResponse {
  implicit lazy val connectionGroupResponseJsonFormat: Format[ConnectionGroupResponse] = Json.format[ConnectionGroupResponse]

  // noinspection TypeAnnotation
  object GroupType extends Enumeration {
    val PRIVATE = Value("PRIVATE")
    val FRIENDS = Value("FRIENDS")
    val TRUSTED = Value("TRUSTED")
    val BLOCKED = Value("BLOCKED")
    val FOLLOWERS = Value("FOLLOWERS")
    val FOLLOWING = Value("FOLLOWING")
    val PENDING = Value("PENDING")
    val REQUEST = Value("REQUEST")

    type GroupType = Value
    implicit lazy val GroupTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

